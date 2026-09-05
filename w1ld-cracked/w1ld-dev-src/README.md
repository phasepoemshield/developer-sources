# W1LD Client 1.21.8 — Full Decompiled Developer Source

> **Source:** `w1ld-cracked` (≈1408 `.class`, 12 MB protection)
> **Decompiler:** Vineflower 1.11.1
> **Status:** Полностью разобран на сурсы, модули переименованы по `@ModuleRegister`

## Структура как в developer source
```
w1ld-dev-src/
├── fabric.mod.json          # entrypoint ru.metaculture.protection.NVnVnNnN
├── wild_mixins.json         # 75 client mixins + 6 common mixins
├── Wild-refmap.json         # refmap
├── assets/                  # шейдеры, шрифты, текстуры, звуки
│   ├── wild/shaders/        # 80+ шейдеров (blur, clickgui, foundry, glowesp...)
│   ├── wild/fonts/          # Inter, icons, waypoints
│   ├── wild/textures/       # textures/world, mainmenu, png
│   ├── wild/sound/wav/      # Function_ON/OFF, mine, event...
│   └── minecraft/shaders/   # lightmap, stardust
├── META-INF/jars/           # 10 вложенных библиотек
├── org/wild/                # чистый код (не обфусцирован)
│   ├── mixin/               # 75 миксинов
│   ├── module/api/          # Module, ModuleRegister
│   └── rpc/                 # Discord IPC
├── ru/metaculture/
│   ├── profile/             # Profile, Role (OWNER/ADMIN/MODERATOR...)
│   ├── sdk/                 # Obfuscate аннотации (Metaculture SDK)
│   └── protection/          # 760 java сурсов (≈137 модулей + утилиты)
└── dev/redstones/mediaplayerinfo/  # Media player bridge
```

## Главная точка входа
`ru.metaculture.protection.NVnVnNnN : ClientModInitializer`

```java
public static NVnVnNnN UuUVuuUu; // singleton
public static File uVUVnuvnuVuv = new File("C:/WildClient");
public final String vNUvnnVnUvu = "wild";
```
см. `ru/metaculture/protection/NVnVnNnN.java:30-120`

## Модули (137, переименованы)
Все классы с `@ModuleRegister(UuUVuuUu="Имя", uUnuvNvvNU=oOOOo0.Категория)` автоматически переименованы.
Маппинг: `_MAPPING_MODULES.txt`

| Категория | Количество | Примеры |
|-----------|------------|---------|
| Combat | 18 | AttackAura, TriggerBot, AutoMace, Criticals, AutoCristal |
| Movement | 16 | ElytraMotion, Speed, Scaffold, NoFall, Velocity |
| Visuals | 27 | ESP, Chams, ChinaHat, JumpCircle, BlockESP, GlowESP |
| Player | 18 | FreeCamera, AutoTool, ChestStealer, AntiAFK |
| Misc | 58 | BaseFinder, AutoMine, ChorusFarm, WardenFarm |

Полный список: смотри раздел ниже.

## Obfuscation
- Все `ru.metaculture.protection.*` обфусцированы через `ru.metaculture.sdk.Obfuscate`
  - `preset`, `const_flow`, `control_flow`, `string_encrypt`, `number_encrypt`, `invoke_dynamic`, `dead_code`, `junk_code`
- Имена полей/методов: `UuUVuuUu`, `C00OOC00oO`, `uUnuvNvvNU`, `vVvUvVVuuNvV` ...
- Реальные имена модулей вытащены из аннотации `ModuleRegister` (затронут только enum `oOOOo0`).
- Остальные утилиты остались с обфусцированными именами — см. оригиналы в `_MAPPING_MODULES.txt`

## Mixins (wild_mixins.json:110)
- **Render:** WorldRendererMixin, GameRendererMixin, LightmapTextureManagerMixin, FogRendererMixin, BlockRenderManagerMixin...
- **Player:** ClientPlayerEntityMixin, LivingEntityMixin, PlayerEntityMixin, MixinEntity...
- **HUD:** InGameHudMixin, ChatHudMixin, BossBarHudMixin...
- **Network:** ClientConnectionMixin, ClientPlayNetworkHandlerMixin, ClientCommonNetworkHandlerMixin...
- **Screen:** HandledScreenMixin, InventoryScreenMixin, ClickableWidgetMixin, ScreenMixin...

## Сборка (Gradle stub)
Проект собирается как fabric mod на 1.21.8, Java 21, mappings Yarn.
Для сборки нужен `fabric-loader >=0.18.4` и зависимости из `META-INF/jars`.


## Подробная структура protection (760 файлов)

### Модули — полный список по файлам
см. `MODULES.md` — auto-generated из `@ModuleRegister`.

### Утилиты / Core (623 файла, остались обфусцированы)
- `NVnVnNnN.java` — entrypoint, инициализация клиента, загрузка конфигов, ResourceManager
- `C0CCOcCOO0.java`, `CO0oc0oC.java`, `NnnNUnuVNn.java` — менеджеры ротации / movement
- `uVvnVvvUVUv.java`, `VVNUvNvu.java`, `UvNvVnU.java`, `NnunnNUUUNVn.java` — контейнеры модулей/настроек
- `oOOOo0.java` — категории (Combat/Movement/Visuals/Player/Misc) : `org/wild/module/api/ModuleRegister:4`
- `UnUNnUvunn.java`, `vunVnNUv.java`, `NnnVVUvUNNV.java` — искажение миров/рендера
- `C0cc0cCOo0O.java`, `CCO0oCC0Oo.java` — UI рендер (neumorphism, blur, mica)
- `C0CoOc0Oo.java`, `COcOCcooccco.java` — шифрование строк/чисел
- Остальное — `NN*`, `NU*`, `NV*`, `Nn*`, `V*`, `U*`, `CO*`, `CC*` — хелперы, сеттинги, event bus, config

### Profile / SDK
- `ru/metaculture/profile/Profile.java:1` — статика username/uid/role/hwid/subscriptionEndDate
- `ru/metaculture/profile/Role.java:1` — enum DEFAULT/USER/MEDIA/SUPPORT/MODERATOR/ADMIN/OWNER
- `ru/metaculture/sdk/Obfuscate.java:1` — аннотация обфускации (Metaculture SDK)
- `ru/metaculture/sdk/NotCompile.java` — маркер не компилировать

### Шейдеры (assets/wild/shaders)
```
blur/  clickgui/  colorplus/  core/  dawnfog/  entity/  foundry/
glowesp/  hud/  mainmenu/ (13 тем)  postfx/  world/
```
- `core/block_esp`, `chinahat`, `jump_circle`, `prismatic_chams`, `trails_glass`
- `glowesp/dominant_color`, `gradient`, `mask`, `shadow`
- `mainmenu/menu_*.frag` — frutiger_aero, glacier_veil, menu_aurora, nebula...
- `hud/wild_logo`, `gravity_grid`, `lux_fracture_edge`
- `foundry/grid`, `node_surface`, `wire` — ноды

### Текстуры/звуки
- `wild/textures/world/*.png` — jump, star, firefly, dollar...
- `wild/sound/wav/*.wav` — Function_ON/OFF, mine, event

## Как открыть как developer source
1. Открой `w1ld-dev-src` как Gradle проект (IntelliJ IDEA 2024+)
2. JDK 21 (Zulu 25), Fabric Loader 0.18.4, Yarn 1.21.8
3. `gradle genSources` -> `runClient`
4. Для поиска модуля: `Ctrl+N` -> имя из `MODULES.md` (например `AttackAura`)
5. Для оригинала обфусц. имени смотри `_MAPPING_MODULES.txt`

## Примечание по деобфускации
Тулза Metaculture компилирует с `--Obfuscate` (string/number/control flow). 
Vineflower восстановил control flow, но имена остались `UuUVuuUu`/`C00OOC00oO`.
Только `ModuleRegister` дает честные имена — остальные требуют TinyRemapper/Yarn + ручной рефактор.
Если нужно — могу прогнать через `tiny-remapper` + сделать рефактор всех `ru.protection.*` в читаемые `wild/feature/*`.

