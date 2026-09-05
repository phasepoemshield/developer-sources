# Phobia Client - Developer Sources

Полностью разобранный проект (Developer Sources) Fabric-мода **Phobia Client** для **Minecraft 1.21.11**.

---

## 📁 Структура проекта (Project Layout)

```
phobia/
├── build.gradle                 # Gradle скрипт сборки Fabric Loom
├── settings.gradle              # Настройки проекта Gradle
├── gradle.properties            # Версии зависимостей (MC, Yarn, Fabric Loader, Fabric API)
├── gradlew / gradlew.bat        # Gradle Wrapper скрипты
├── gradle/wrapper/              # Gradle Wrapper бинарники и конфигурация
├── src/
│   └── main/
│       ├── java/                # Декомпилированный исходный код Java (694+ классов)
│       │   ├── com/adl/nativeprotect/          # Защита и загрузчик нативных библиотек
│       │   ├── dev/redstones/mediaplayerinfo/  # Интеграция мультимедиа (Win / Linux DBus)
│       │   └── ruhack/phobia/                  # Основной функционал клиента Phobia
│       │       ├── a/                          # 78 Mixin-хуков в движок Minecraft
│       │       └── ...                         # Модули (Combat, Movement, Render, Player, Misc, GUI)
│       └── resources/           # Ресурсы, ассеты, шейдеры и нативные библиотеки
│           ├── assets/
│           │   ├── minecraft/   # Кастомные 3D-модели предметов, пост-эффекты контуров
│           │   └── phobia/      # Шейдеры (GLSL/MSDF), шрифты, звуки, текстуры, UI
│           ├── fabric.mod.json  # Манифест Fabric-мода
│           ├── phobia.mixins.json # Конфигурация Mixin хуков
│           ├── phobia.accesswidener # Access Widener для Minecraft Intermediary
│           ├── mediaplayerinfo/ # Нативные библиотеки MediaPlayer (Windows DLL)
│           ├── native/          # Нативная защита nativo4ka.dll
│           ├── natives/         # Нативный аим-мост aimbridge.dll
│           ├── win32-x86-64/    # discord-rpc.dll для Discord Rich Presence
│           ├── phobia/aim/ml/   # ML-модели и датасеты Holy8k для AimAssist
│           └── META-INF/jars/   # Вложенные библиотеки (JiJ / Jar-in-Jar):
│               ├── HMI-5.1-phobia.jar (Hold My Items)
│               ├── baritone-standalone-fabric-1.21.11.jar (Baritone Pathfinding)
│               ├── figura-0.1.5+1.21.11-fabric-mc.jar (Figura Avatars)
│               ├── kotlin-stdlib-2.0.0.jar
│               ├── kotlinx-serialization-core-jvm-1.7.3.jar
│               ├── nether-pathfinder-1.4.1.jar
│               ├── netty-codec-socks-4.1.82.Final.jar
│               └── netty-handler-proxy-4.1.82.Final.jar
├── hmi_sources/                 # Исходный код вложенного мода Hold My Items (HMI)
└── README.md
```

---

## 🧩 Ключевые компоненты архитектуры

### 1. Точка входа (`ClientModInitializer`)
* **Класс:** `ruhack.phobia.d`
* **Назначение:** Инициализация клиента Fabric (`onInitializeClient`), вызов защиты `Phobia.open()`, создание `e` (Core Manager), запуск `oz` (Discord RPC Manager) и регистрация слушателей ресурсов (`ResourceManagerHelper`).

### 2. Ядро клиента (Core Manager)
* **Класс:** `ruhack.phobia.e`
* **Компоненты ядра:**
  * `commandManager` (`ruhack.phobia.g`) — обработка клиентских команд и синтаксиса
  * `moduleRepository` (`ruhack.phobia.dr`) — реестр всех чит-модулей клиента
  * `eventManager` (`ruhack.phobia.ax`) — шина событий (Event Bus) для перехвата тиков, рендера, пакетов
  * `attackPerpetrator` (`ruhack.phobia.hv`) — система таргетинга и ротаций (KillAura / TargetStrafe)
  * `moduleSwitcher` (`ruhack.phobia.dt`) — система биндов и переключения состояний модулей

### 3. Mixins (`ruhack.phobia.a.*`)
В проекте реализовано **78 миксинов**, перехватывающих:
* Рендеринг (`GameRenderer`, `WorldRenderer`, `EntityRenderDispatcher`, `HeldItemRenderer`, `InGameHud`)
* Сетевые пакеты (`ClientConnection`, `ClientPlayNetworkHandler`)
* Физику и перемещение игрока (`ClientPlayerEntity`, `PlayerInventory`, `KeyboardInput`)
* Блоки и взаимодействие (`ClientPlayerInteractionManager`, `MinecraftClient`)
* Графический интерфейс и экраны меню (`TitleScreen`, `GenericContainerScreen`, `ChatScreen`)

### 4. Шейдерная система (`assets/phobia/shaders/`)
* **3D Shaders:** Chams (`chams_fragment.fsh`), Glow (`glow3d_fragment.fsh`), Billboard, Sky Aurora/Galaxy/Blackhole, Water Caustic, ShaderHands.
* **UI & 2D Shaders:** MSDF Glow text rendering, Liquid Glass, Rectangle/Blur passes, Arc/Ring shaders, Tooltip bubbles, Hue/Saturation filters.
* **Post-processing:** ShaderESP Blur, ShaderESP Edge detection, ShaderHands trail blend & composite.

### 5. Нейросетевой AimAssist (`phobia/aim/ml/`)
* `holy8k.model.json` & `holy8k.dataset.json` — обученная модель машинного обучения для предсказания траекторий и сглаживания движений мыши.
* `natives/aimbridge.dll` — нативный мост для прямого ввода через Win32 API.

---

## 🛠️ Сборка и запуск в среде разработки

### Требования
* **JDK 21** или новее (рекомендуется Eclipse Temurin 21 или Zulu 21)
* **Gradle 8.12+**

### Открытие в IDE
1. **IntelliJ IDEA**: Откройте папку проекта (`File -> Open...` -> выберите папку `phobia`). IDEA автоматически распознает проект как Gradle-проект.
2. **VS Code**: Откройте папку с установленными расширениями *Extension Pack for Java* и *Gradle for Java*.

### Сборка через терминал
```bash
./gradlew build
```
Готовый артефакт мода будет сохранен в `build/libs/phobia-1.0.0.jar`.
