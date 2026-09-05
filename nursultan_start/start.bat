@echo off
setlocal
cd /d "%~dp0"
chcp 65001 >nul 2>&1

set "USERNAME_MC=%~1"
if "%USERNAME_MC%"=="" set "USERNAME_MC=soezproject"

if not exist jre\bin\java.exe (
  echo Java not found
  pause
  exit /b 1
)

if not exist game mkdir game
if not exist logs mkdir logs

jre\bin\java.exe @jvmargs.txt Main --username "%USERNAME_MC%" --version 1.21.11 --gameDir game --assetsDir assets --assetIndex 29 --uuid 00000000000030008000000000000000 --accessToken 0 --clientId 0 --xuid 0 --userType legacy --versionType release --width 1280 --height 720 --login "t.me/soezproject" --uid 1 --subscribeTimeLeft 999999999 --role premium --hash 0 --apiToken 0 --boughtProducts premium --avatar none
