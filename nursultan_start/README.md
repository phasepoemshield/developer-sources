# Nursultan Client (Minecraft 1.21.11) - Developer Sources

Полный декомпилированный проект с открытым исходным кодом (developer sources) чит-клиента **Nursultan** для Minecraft 1.21.11 на базе Fabric.

---

## 📁 Структура проекта

```text
nursultan_start/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Nursultan/                 # Исходный код самого клиента Nursultan (~3000 классов)
│   │   │   │   ├── class09676.java        # Главный ClientModInitializer клиента
│   │   │   │   ├── class09678.java        # Менеджер модулей / событий / интерфейса
│   │   │   │   └── ...                    # Combat, Render, Movement, Player, Exploit, UI модули
│   │   │   ├── Main.java                  # Главная точка входа загрузчика и эмулятора Fabric
│   │   │   ├── Nur*.java                  # Парсеры метаданных и CustomValue для Fabric
│   │   │   ├── baritone/                  # Встроенный бот Baritone
│   │   │   ├── squeek/                    # Мод AppleSkin
│   │   │   ├── de/maxhenkel/voicechat/    # Simple Voice Chat
│   │   │   ├── net/caffeinemc/            # Sodium & Lithium оптимизации
│   │   │   ├── com/viaversion/            # ViaVersion / ViaFabricPlus протоколы
│   │   │   └── minecraft/                 # Базовый код клиента Minecraft 1.21.11
│   │   └── resources/
│   │       ├── assets/nursultan-client/   # Все кастомные ассеты клиента:
│   │       │   ├── shaders/               # GLSL шейдеры (chams, arc, esp_mix, ui_uber, font, etc.)
│   │       │   ├── fonts/                 # TTF шрифты (Inter, Minecraft)
│   │       │   ├── icons/                 # Атласы и спрайты интерфейса
│   │       │   ├── locale/                # Файлы локализации (ru / en)
│   │       │   └── sounds/                # Звуки включения/отключения модулей
│   │       ├── nursultan-mods.json        # Метаданные подключённых модов
│   │       └── data/                      # Датапаки и данные Minecraft
├── libraries/                             # Java-библиотеки зависимостей (130+ JAR файлов)
├── natives_macos/                         # Нативные библиотеки для Apple Silicon (ARM64)
├── natives/                               # Исходные Windows-библиотеки (.dll)
├── game/                                  # Игровая папка Minecraft (.minecraft: configs, options)
├── build.gradle                           # Скрипт сборки Gradle (Java 21)
├── settings.gradle                        # Настройки Gradle
├── start.sh                               # Скрипт запуска для macOS
└── start.bat                              # Скрипт запуска для Windows
```

---

## 🚀 Запуск и разработка

### Требования
- **JDK 21** (рекомендуется OpenJDK 21: `brew install openjdk@21`)
- macOS (Apple Silicon M1/M2/M3/M4) или Windows x64

### Открытие в IntelliJ IDEA:
1. Запустите IntelliJ IDEA.
2. Выберите **File -> Open...** и укажите данную папку `nursultan_start`.
3. IDEA автоматически распознает `build.gradle` и настроит проект Gradle.
4. Убедитесь, что в **Project Structure -> SDK** выбрана **Java 21**.

### Запуск клиента:
- Через шелл-скрипт (самый быстрый запуск):
  ```bash
  ./start.sh [Никнейм]
  ```
- Через Gradle:
  ```bash
  ./gradlew runClient
  ```
  С указанием ника:
  ```bash
  ./gradlew runClient -PmcUsername="ВашНик"
  ```

---

## 🔍 Навигация по коду клиента

- **Точка входа чита**: [`Nursultan.class09676`](src/main/java/Nursultan/class09676.java) — регистрирует хуки событий мыши, экрана и жизненного цикла Fabric.
- **Главный класс управления**: [`Nursultan.class09678`](src/main/java/Nursultan/class09678.java) — диспетчер вызовов, отслеживание активных экранов и перехват ввода.
- **Локализация и текст**: Все языковые строки чита находятся в [`src/main/resources/assets/nursultan-client/locale/`](src/main/resources/assets/nursultan-client/locale/) (`ru` и `en`).
- **Шейдеры и визуализация**: GLSL шейдеры кастомного рендеринга находятся в [`src/main/resources/assets/nursultan-client/shaders/`](src/main/resources/assets/nursultan-client/shaders/).
