@echo off
setlocal enabledelayedexpansion

set JAR_NAME=out.jar
set LIBS_DIR=libraries

set CLASSPATH=%JAR_NAME%

for %%i in (%LIBS_DIR%\*.jar) do (
    set CLASSPATH=!CLASSPATH!;%%i
)

"jaba/bin/java.exe" -noverify -cp "%CLASSPATH%" start/Start

pause