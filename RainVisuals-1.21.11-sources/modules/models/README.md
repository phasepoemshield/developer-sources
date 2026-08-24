# Rain Models / Figura — восстановленный модуль

Это полный доступный срез модуля `Models` из Rain Visuals 1.21.11: экран и
карточки моделей, поиск, удалённый каталог, безопасная установка архивов,
применение/снятие Figura-аватара, live-превью, GPU-снимки превью, дисковый кеш и
все найденные Figura-миксины.

## Состав

- `src/recovered-kotlin/` — основной читаемый декомпилированный вид.
- `src/recovered-java/` — альтернативный CFR-вид для сравнения сложных мест.
- `src/runtime-fix/rainpatch/ModelsNetworkBridge.java` — восстановленная
  реализация вырезанного сетевого слоя.
- `reference/models-runtime-bytecode.jar` — точный исполняемый байткод модуля,
  его миксинов, сетевого патча и вложенного Figura 1.0.3.
- `reports/CLASS_MAP.tsv` — назначение всех выделенных классов.
- `reports/BYTECODE_ENTRIES.txt` и `reports/SOURCE_FILES.txt` — полные составы.
- `reports/SHA256SUMS.txt` — контрольные суммы результата.

## Что восстановлено функционально

В исходном `rain.jar` девять методов каталога были заменены на
`UnsupportedOperationException("Rain network disabled")`, а стартовая
`FiguraAvatarInstaller.initializeRemoteCatalog()` — на пустой метод. Runtime-патч
возвращает весь этот путь:

1. фоновое получение и обновление manifest;
2. загрузку закешированного manifest при старте;
3. загрузку preview и avatar archive;
4. оригинальную HMAC-подпись запросов Rain Social API и проверку подписи ответа;
5. ограничения размеров manifest/preview/archive;
6. проверку HTTPS origin, допустимого пути, точного размера и SHA-256;
7. атомарную запись кеша и интервалы retry/refresh;
8. запуск каталога во время обычной инициализации Rain.

После сетевого слоя используется исходный Rain-байткод: parser проверяет schema,
id, пути и лимиты; installer защищается от Zip Slip, лимитирует число файлов и
распакованный размер; Figura runtime загружает, показывает preview и применяет
выбранный аватар.

## Граница восстановления

Сами архивы моделей и их готовые изображения не лежали внутри `rain.jar` — они
были серверным содержимым `social.rainvisuals.pro`. Их нельзя достать из
байткода. При недоступности сервера модуль использует уже проверенный локальный
кеш `Rain/cache/figura/manifest.json`; без сервера и без кеша каталог корректно
останется пустым, но не должен падать.

Декомпилированные `.kt/.java` — материал для ручного развития, а не заведомо
компилируемый оригинальный проект: obfuscation уничтожила часть имён и сигнатур.
Авторитетный исполняемый вариант находится в `reference/models-runtime-bytecode.jar`
и в родительском `libs/rain-visuals-yarn-runtime-dev.jar`.

## Пересборка среза

Из корня проекта:

```bash
python3 tools/extract_models_module.py
JAVA_HOME=/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home gradle build --no-daemon
```

Срез не является отдельным standalone-модом: UI и рендер зависят от общих
классов Rain, Minecraft/Fabric и Figura. Он предназначен для точного изучения и
пошагового переноса модуля в обычный source set.
