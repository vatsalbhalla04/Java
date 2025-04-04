@echo off
cd /d "%~dp0"
setlocal enabledelayedexpansion

REM Step 1: Store all matching files
set i=1
for %%F in (oops*.java) do (
    set "old[!i!]=%%F"
    set /a i+=1
)
set /a totalFiles=i-1

REM Step 2: Rename to temp to avoid clashes
for /L %%i in (1,1,%totalFiles%) do (
    call set "orig=!old[%%i]!"
    ren "!orig!" "temp%%i.tmp"
)

REM Step 3: Rename to oopsXX.java and add comment
for /L %%i in (1,1,%totalFiles%) do (
    set /a padded=100 + %%i
    set "finalName=oops!padded:~1!.java"
    call ren "temp%%i.tmp" "!finalName!"

    REM Prepend comment to the top
    (
        echo // File: !finalName!
        type "!finalName!"
    ) > "tempfile.tmp"
    move /Y "tempfile.tmp" "!finalName!" >nul
)

echo ✅ Oops files renamed and commented!
pause
