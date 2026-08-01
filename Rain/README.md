# Rain Visuals SRC

Структура как у **Wonderful SRC**: Fabric Loom project + decompiled sources.

```
Rain SRC/
  build.gradle
  gradle.properties
  settings.gradle
  rain.jar.src/          — dump декомпила (как wonderful.jar.src)
  rain-yarn.jar          — classes: rename + yarn remap
  tools/name-map.txt     — obfuscated → original
  src/main/
    java/kotakbaz/rain/  — исходники для IntelliJ
    resources/           — assets, fabric.mod.json, mixins
```

## Что сделано

1. Сборка `rain-classes.jar` с case-correct именами (macOS FS)
2. **qProtect rename** ~152 классов → оригинальные имена (`Module`, `MenuScreen`, `TargetEspModule`…)
3. **Yarn remap** 1.21.8 (`class_310` → `MinecraftClient`)
4. **CFR** decompile → `src/main/java`
5. Resources + Loom skeleton

## ClickGUI

`kotakbaz.rain.ui.menu.*`

| Класс | Роль |
|-------|------|
| `MenuScreen` | главный GUI |
| `ModuleComponent` | модуль + bind |
| `CategoryComponent` / `SelectCategoryComponent` | категории |
| `settings/impl/*` | Boolean/Slider/Mode/Color/Bind/Text |
| `render/*` | background, topbar, scrollbar |

## Модули

- `module/modules/hud/*`
- `module/modules/player/*`
- `module/modules/render/*`

Карта имён: `tools/name-map.txt`

## Важно

- Мод обфусцирован **qProtect 2.0.0** — в коде остаются `Cipher`, массивы `a[]`/`C[]`, string encryption.
- Часть классов **не переименована** (однобуквенные без metadata).
- **Чистая компиляция не гарантируется** — проект для чтения/порта, как decompiled Wonderful.
- Оригинал на **Kotlin**; декомпил в **Java**.
- MC **1.21.8**, Fabric, yarn `1.21.8+build.1`.

## IntelliJ

1. Open `Rain SRC` as Gradle project
2. Дождаться index / genSources Loom
3. Sources: `src/main/java/kotakbaz/rain`

## Отличия от Wonderful SRC

| | Wonderful | Rain |
|---|-----------|------|
| Package | `fun.wonderful` | `kotakbaz.rain` |
| MC | 1.21.4 | 1.21.8 |
| Lang | Java | Kotlin → Java decompile |
| Obfuscation | weak | qProtect (heavy) |
| ClickGUI path | `client/ui/clickgui` | `ui/menu` |
