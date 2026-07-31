# Zenith Client — Готовый проект для IntelliJ IDEA

## 🚀 Как открыть и запустить в IntelliJ IDEA:

1. Откройте **IntelliJ IDEA**.
2. Нажмите **Open** (Открыть) и выберите папку: `C:\Users\withyou\Desktop\ZenithSource`
3. IntelliJ IDEA автоматически подтянет проект Gradle и настроит под него Java 21.
4. В правом верхнем углу (панель запуска) будет доступна готовая конфигурация:
   - ▶️ **Minecraft Client** — запуск игры с клиентом напрямую из IDEA!
   - ▶️ **Build JAR** — сборка .jar мода в папку `build/libs/`.

## 📁 Структура исходного кода:

```
ZenithSource/
├── src/main/java/zenith/
│   ├── hud/          ← Все 19 элементов HUD (Watermark, TargetHud, Keybinds...)
│   ├── modules/
│   │   ├── combat/   ← 17 модулей (Aura, Reach, AutoTotem...)
│   │   ├── movement/ ← 22 модуля (Speed, NoSlow, ElytraFly...)
│   │   ├── render/   ← 28 модулей (EntityESP, ShaderESP...)
│   │   ├── misc/     ← 32 модуля (AutoTool, ChestStealer...)
│   │   └── pve/      ← 10 модулей (AutoMine, Farms...)
│   ├── zov/          ← Экран GUI, команды, миксины, шрифты MSDF
│   └── core/         ← Ядро фреймворка
├── src/main/resources/
│   ├── assets/zenith/
│   │   └── cosmetics/ ← 59 встроенных косметик!
│   └── fabric.mod.json
├── .idea/             ← Готовые Run Configurations для IntelliJ IDEA
├── gradlew.bat        ← Gradle Wrapper
├── build.gradle
├── settings.gradle
└── ZenithClient-1.0.0.jar ← Готовый скомпилированный мод (51.65 МБ)
```
