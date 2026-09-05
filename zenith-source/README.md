# Zenith — портированный Fabric-проект

Исходный код Zenith, приведённый в читаемый вид и портированный на Minecraft
1.21.11. Java-код находится в `src/main/java`, ресурсы — в
`src/main/resources`.

## Требования

- JDK 21
- Windows PowerShell или cmd

Gradle отдельно устанавливать не нужно: wrapper уже включён в проект.

## Сборка

```powershell
.\gradlew.bat build
```

Готовый мод появится в `build/libs/zenith-1.0-SNAPSHOT.jar`.

## Запуск клиента для разработки

```powershell
.\gradlew.bat runClient
```

Рабочая директория тестового клиента — `run`.

Проект компилируется, собирается и запускается через Fabric Loom.
