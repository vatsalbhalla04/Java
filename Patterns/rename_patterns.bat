@echo off
cd /d "%~dp0"
setlocal enabledelayedexpansion

REM Step 1: Store all matching files
set i=1
for %%F in (p*.java) do (
    set "old[!i!]=%%F"
    set /a i+=1
)
set /a totalFiles=i-1

REM Step 2: Rename to temp to avoid conflicts
for /L %%i in (1,1,%totalFiles%) do (
    call set "orig=!old[%%i]!"
    ren "!orig!" "temp%%i.tmp"
)

REM Step 3: Rename to pXX.java and add comment
for /L %%i in (1,1,%totalFiles%) do (
    set /a padded=100 + %%i
    set "finalName=p!padded:~1!.java"
    call ren "temp%%i.tmp" "!finalName!"

    REM Prepend comment to the top
    (
        echo // File: !finalName!
        type "!finalName!"
    ) > "tempfile.tmp"
    move /Y "tempfile.tmp" "!finalName!" >nul
)

echo ✅ Patterns files renamed and commented!
pause
