# Pulse Visuals 1.21.11 — recovered sources

This directory contains the complete Java source reconstruction and recoverable resources from the supplied Fabric JAR.

## Open/build

Requirements:

- JDK 21
- Gradle compatible with Loom 1.16.2 (the original artifact records Gradle 9.5.1)
- Internet access to Fabric's Maven repository for Minecraft/Yarn/Loader/Fabric API

Run:

```bash
gradle build
```

The original archive shipped several dependencies as nested JARs. They are preserved under `src/main/resources/META-INF/jars` and added to the compile classpath in `build.gradle`.

## Read first

- `reports/DECOMPILATION_REPORT.md` — recovery status and limitations.
- `reports/MODULES.md` — every annotated module by category.
- `reports/MIXINS.md` — every configured mixin/accessor and source presence.
- `reports/quality_report.json` — machine-readable checks.
- `reports/EXCLUDED_FONT_RESOURCES.txt` — font files that must be restored locally from the authorized original JAR.

The sources contain authentication, networking, configuration, rendering, HUD, utility and visual modules. Do not publish credentials or proprietary endpoints from the code without the creator's approval.
