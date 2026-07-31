# Rain Visuals — разбор JAR → source

**Мод:** `rain-visuals` 1.0.0  
**Автор:** ra1nderyy  
**MC:** Fabric 1.21.8 + Kotlin  
**Обфускатор:** qProtect 2.0.0  

## Короткий ответ: можно ли вынести ClickGUI?

**Частично — да. «Просто скопировать один файл» — нет.**

| Что | Статус |
|-----|--------|
| Имена классов ClickGUI | ✅ Сохранены (`MenuScreen`, `ModuleComponent`, …) |
| Структура UI | ✅ Читается |
| Исходники после CFR | ⚠️ Есть, но «грязные» (шифрование строк, opaque predicates) |
| Чистый Kotlin как у автора | ❌ Нет (только Java-декомпил + мусор qProtect) |
| Отдельный модуль без зависимостей | ❌ Нет — GUI вшит в весь клиент |

## Где ClickGUI

Пакет: `kotakbaz.rain.ui.menu`

```
MenuScreen              — главный экран (singleton INSTANCE)
├── SelectCategoryComponent / CategoryComponent
├── ModuleComponent     — строка модуля + bind-меню
├── ContentArea
├── ConfigsCategoryComponent / ConfigContentArea / ConfigEntryComponent
├── EventsCategoryComponent
├── FriendsCategoryComponent
├── PointsCategoryComponent
├── layout/MenuLayout, CategorySlot
├── render/MenuBackgroundRenderer, MenuTopBarRenderer, MenuScrollBarRenderer
├── settings/ModuleSettingFactory + impl/*
│     Boolean / Slider / Mode / Color / Bind / Text SettingComponent
├── misc/TransitionManager, TextScroller
└── MenuStyle
```

API UI: `ui/api/UIComponent`, `PipelinedRender`, `PipelineManager`, `RenderIn`.

Открывается как custom screen через `Rain.setCustomScreen(...)` (не vanilla `Screen` напрямую во всех местах).

## Что нужно, чтобы ClickGUI «завелся» в другом моде

Минимальный стек зависимостей:

1. **Module framework** — `Module`, `ModuleManager`, `Category`, settings  
2. **Render engine** — `client/util/render/**`, `client/render/**`, шрифты, pipelines  
3. **Animations** — `client/util/animations`  
4. **Events / listeners** — для input и overlay  
5. **Assets** — `assets/rain/fonts`, `images`, `shaders`, `sounds`  
6. **Mixins** — `MixinKeyboard`, `MixinMouse`, `MixinMinecraftClient`, …  
7. **Config / Friends / Waypoints** — вкладки Configs/Friends/Points  

Без этого `MenuScreen` не собрать: он импортирует модули, шрифты, анимации, sound, config.

## Модули (восстановленные имена)

### HUD
- ArmorHudModule, BindsModule, CooldownsHudModule, CoordinatesHudModule  
- EffectsModule, InventoryHudModule, MediaPlayerInfoModule  
- TargetHudModule *(имя не обфусцировано)*  
- WatermarkModule + container/HudModule  

### Player
- AutoEat, AutoInvest, AutoReissue, AutoRespawn, AutoSprint  
- ChangeHand, CommandFix, Cooldowns, CrosshairHp  
- ElytraSwap, FakePlayer, FastExp, FriendsColor, FuntimeHelper  
- HitSounds, ItemScroller, ItemSwap, LockSlot, NameProtect  
- PasHider, PingInChat, PlayerPing, PvpSafe, SearchHelper  
- ShiftTap, SoundsController, TapeMouse, TotemTracker  

### Render
- BetterHud, Blink, ClientColor, Fullbright  
- HitBubbles, HitColor, HitParticles, HitWaves  
- ItemHighliter, ItemPhysic, JumpCircle  
- ModuleAspectRatio, ModuleColorSaturation, ModuleCustomFog  
- ModuleCustomHitBox, ModuleTimeChanger  
- NameTags, NoFluid, Perspective, Predicts, RenderTweaks  
- ScoreBoard, Souls, SwingAnimation, TargetEsp, ThirdName  
- Traces, Trails, ViewModel, WayPoint, WorldParticles, Zoom  

Полная таблица: `readable/NAME_MAP.md`

## Структура вывода

```
decompiled/
  src/                 — сырой CFR-декомпил (431 .java)
  readable/
    clickgui/ui/       — UI + ClickGUI (имена как в моде)
    framework/         — Module, ModuleManager, settings/
    module/modules/    — модули, переименованные в *Module.java
    NAME_MAP.md
  README.md            — этот файл
rain-classes.jar       — case-correct classes (для повторного декомпила)
```

## Ограничения qProtect (важно)

В декомпиле видны:

- `Cipher` / `PBEKeySpec` / Base64 — **строки зашифрованы**  
- массивы `a[]`, `C[]`, `b[]` — runtime-lookup строк и анти-анализ  
- раздутые файлы (`MenuScreen` ~786 KB, `ModuleComponent` ~679 KB)  
- Intermediary MC names: `class_310` = MinecraftClient и т.д.  

То есть:

1. **Логику** можно читать и переписывать.  
2. **Готовый drop-in** в свой мод — почти нет, нужен рефакторинг.  
3. «Вырезать ClickGUI как модуль» = по сути **порт UI + render stack + module API**.

## Рекомендуемый путь, если цель — свой ClickGUI

1. Взять **архитектуру** из `MenuScreen` / `ModuleComponent` / `ModuleSettingFactory`.  
2. Переписать на свой render (или портировать `client/util/render` отдельно).  
3. Модули — **не копировать слепо**: каждый зависит от Rain events/mixins.  
4. Для чистого порта смотреть signature/metadata (`isEnabled`, `boolean()`, `slider()`…) — API модуля понятен.

## Технические детали

- Язык исходников: **Kotlin** (Metadata, SMAP `*.kt`)  
- Entry: `kotakbaz.rain.Rain` → load modules, config AutoLoad, discord RPC, draggables  
- Guard package: anti-tamper / version check (`guard.requireValid("1.21.8")`)  
- macOS: при распаковке JAR `A.class`/`a.class` коллизили → `*-1.class`;  
  `rain-classes.jar` собран заново по internal names.
