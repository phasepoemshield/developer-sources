# Rain Visuals 1.21.11 — recovered sources

Максимально полный разбор `rain.jar` из локального профиля Modrinth. Первичное
восстановление выполнено статически; исправленный runtime затем отдельно запущен
на Minecraft 1.21.11 для проверки реальных UI-путей.

## Где что лежит

- `src/recovered-kotlin/` — основной читаемый дамп Vineflower с Kotlin plugin.
- `src/recovered-java/` — альтернативный Java-дамп CFR для сложных мест.
- `src/main/resources/` — все 200 ресурсов исходного JAR.
- `reference/original/rain.jar` — нетронутый исходный файл.
- `reference/rain-yarn-named.jar` — полный JAR после remap Minecraft-имён на Yarn.
- `reference/rain-yarn-readable.jar` — тот же JAR с дополнительно восстановленными именами Rain-классов.
- `libs/rain-visuals-yarn-runtime-dev.jar` — runtime-копия без переноса Rain-классов между пакетами; сохраняет package-private доступ.
- `libs/IAS-9.0.7+1.21.11-fabric.jar` — официальный In-Game Account Switcher, вложенный в итоговый JAR для кнопки «Аккаунты».
- `reference/decompiled-all/` — первый полный дамп всех встроенных библиотек.
- `reference/decompiled-readable-kotlin/` и `reference/decompiled-readable-java/` — полные повторные дампы.
- `modules/models/` — выделенный полный срез Models/Figura: исходники,
  миксины, точный runtime-байткод и восстановленный сетевой каталог.
- `reports/` — покрытие, соответствия имён, хеши и технические отчёты.
- `tools/` — воспроизводимый remap и восстановление имён.

## Важное ограничение

Это восстановленный исходник, а не оригинальный репозиторий автора. В JAR были
удалены исходные имена большинства собственных классов и `SourceFile` заменён на
`heavy`. Kotlin metadata и старый Rain 1.21.8 позволили безопасно вернуть часть
имён. Остальные классы оставлены под именами `oxxxde/...`: выдумывать имена без
доказательств было бы хуже для дальнейшей разработки.

Декомпилированный текст не включён в Gradle compiler source set: в нём встречаются
невалидные импорты, synthetic-конструкции и декомпиляторные заглушки. `gradle build`
проверяет воспроизводимую сборку из lossless Yarn-mapped bytecode. Читаемые
переименования используются только в исходниках: частичный перенос классов между
пакетами меняет package-private доступ и непригоден для runtime. Для реального
редактирования переносите нужный пакет из `src/recovered-kotlin` или
`src/recovered-java` в обычный source set и чините его по одному модулю.

## Сборка

Нужен JDK 21:

```bash
JAVA_HOME=/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home gradle build --no-daemon
```

Собранный JAR появляется в `build/libs/`. Для development-запуска используйте:

```bash
JAVA_HOME=/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home gradle runClient --no-daemon
```

`runClient` сначала собирает production/intermediary JAR, помещает только его в
`run/mods`, а затем запускает Fabric. Последний smoke test дошёл до отрисованного
мира. Проверены смена вариантов Custom Sky и открытие/применение аккаунта через
IAS. Models отдельно прошёл полный сетевой и render smoke: 16/16 архивов,
16/16 live-превью и несколько успешных применений; подробности находятся в
`reports/RUNTIME_SMOKE.md`.

## Runtime-исправления

- Устранён краш при выборе другого варианта Custom Sky: отсутствующие анимации
  режима теперь создаются лениво для обоих animation-map.
- Кнопка «Аккаунты» больше не зависит от отсутствующего внешнего класса: IAS
  `9.0.7+1.21.11-fabric` вложен в собранный Rain JAR как Fabric nested-mod.
- Из leak-entrypoint удалены посторонний автопереход на Telegram и рекламный
  вывод в консоль; инициализация теперь сразу передаётся настоящему Rain-клиенту.
- В Models возвращены все девять вырезанных методов удалённого Figura-каталога
  и его пустая стартовая инициализация. Загрузки ограничены по размеру,
  закреплены за HTTPS-origin Rain, подписываются штатным HMAC-протоколом Social
  API, проверяют подпись ответа и SHA-256 содержимого и атомарно кешируются.
