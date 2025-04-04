@echo off
cd /d "%~dp0"
setlocal enabledelayedexpansion

REM Step 1: Collect all matching files
set i=1
for %%F in (a*.java) do (
    set "old[!i!]=%%F"
    set /a i+=1
)

REM Step 2: Rename all to temp files to avoid conflicts
set i=1
for /L %%i in (1,1,!i!) do (
    set "tempfile[%%i]=tmp_%%i.tmp"
)

REM Step 3: Do the temp renaming
for /L %%i in (1,1,!i!) do (
    call set "file=!old[%%i]!"
    call set "temp=!tempfile[%%i]!"
    ren "!file!" "!temp!"
)

REM Step 4: Final renaming to a01.java ... a34.java
set j=1
for /L %%i in (1,1,!i!) do (
    call set "temp=!tempfile[%%i]!"
    set /a paddedNum=100 + !j!
    call ren "!temp!" "a!paddedNum:~1!.java"
    set /a j+=1
)

echo ✅ All files renamed with leading zeros!
pause
