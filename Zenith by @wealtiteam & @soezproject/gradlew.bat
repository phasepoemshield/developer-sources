@echo off
rem Fixed wrapper launcher: the original gradlew.bat breaks when the project
rem path contains ampersand or at-sign (cmd splits the unquoted %~dp0 expansion).
rem Here every expansion stays inside double quotes and we call the wrapper
rem jar directly, so special characters in the folder name are safe.
setlocal

set "APP_HOME=%~dp0"
set "WRAPPER_JAR=%APP_HOME%gradle\wrapper\gradle-wrapper.jar"

if not exist "%WRAPPER_JAR%" (
    echo ERROR: could not find wrapper jar
    exit /b 1
)

set "JAVA_EXE=java.exe"
if defined JAVA_HOME if exist "%JAVA_HOME%\bin\java.exe" set "JAVA_EXE=%JAVA_HOME%\bin\java.exe"

"%JAVA_EXE%" -classpath "%WRAPPER_JAR%" org.gradle.wrapper.GradleWrapperMain %*
endlocal
exit /b %ERRORLEVEL%
