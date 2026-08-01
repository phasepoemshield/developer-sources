# Wild client — decompiled, remapped & runnable Fabric workspace (`wildsrc`)

A Fabric **Loom** workspace built from `client.jar` (the obfuscated "Wild" client, MC 1.21.8),
with Minecraft references remapped to **Yarn**, the client's classes de-obfuscated, and the code
fixed so it **compiles cleanly and launches via `./gradlew runClient`**.

## Status: ✅ compiles (0 errors) and ✅ runs
- `./gradlew compileJava` — **BUILD SUCCESSFUL**, 0 errors (777 source files).
- `./gradlew runClient` — launches the game, Fabric loads the `wild` mod, all mixins apply, **all 125
  modules register**, and it reaches the Wild custom **main menu** and runs with **no runtime errors**
  (log shows no exceptions; two benign warnings only — the `v1` version string and a Fabric mixin
  probing a Mojmap class name).

## Toolchain / versions
| Component | Version |
|---|---|
| Minecraft | 1.21.8 |
| Yarn mappings | 1.21.8+build.1 (v2) |
| Fabric Loader | 0.19.3 |
| Fabric API | 0.136.1+1.21.8 |
| Fabric Loom | 1.17.16 |
| Gradle | 9.5.1 (wrapper included) |
| Java | 21 (toolchain pinned) |

Open in IntelliJ IDEA (import `build.gradle`) or use the bundled `gradlew`. Run with `./gradlew runClient`.

## How it was produced
1. **Anti-decompile trap removed** — the jar poisoned its constant pool with junk entries that crash
   Fernflower/Vineflower. Every class was round-tripped through ASM to rebuild the pool from only
   referenced entries.
2. **Minecraft → Yarn remap** — tiny-remapper (with the mixin extension) converted the whole jar
   `intermediary → named (Yarn 1.21.8)`. `class_310` → `MinecraftClient`, etc.
3. **De-obfuscation** — 232 of the 666 `ru.metaculture.protection` classes renamed to meaningful names
   (entrypoint `WildClient`, all ~125 modules, settings, commands, GUI/HUD/render, networking). The
   410 named nested classes were also given collision-free names (the obfuscator deliberately makes
   nested-type names collide with field names to defeat decompilation).
4. **Re-decompiled** with Vineflower and **all ~832 compile errors fixed** — decompiler artifacts:
   raw-generic casts, ambiguous-overload disambiguation, a hand-rewritten Java-21 pattern-`switch`,
   mixin self-cast `(Object)` bounces, lambda-capture fixes, and restored interface-override names.
5. **Made runnable** (see next section).

## What was changed to make it run
These are the only *behavioural* changes; everything else is faithful to the original bytecode.

- **Native methods stubbed.** The client's core is implemented in a **native `protection.dll`** (JNI):
  110 `@Compile`-annotated `native` methods across 30 files (all chat-command execution, config
  persistence, and some farm-bot internals). That DLL is a proprietary anti-tamper binary injected by
  Wild's own launcher (a JVMTI agent, keyed to the *original* obfuscated class names) — it is **not
  present and cannot be re-bound in a dev run**. The `native` methods were replaced with safe Java
  stubs (no-ops / empty returns) so there are no `UnsatisfiedLinkError`s. **Consequence:** the modules
  and GUI work, but the natively-implemented *chat commands* (`.bind`, `.config`, the farm commands…)
  and *config save/load* are inert — that logic exists only in the DLL.
- **Module registration reimplemented in Java.** `ModuleManager` originally populated its list from a
  native method; it now instantiates all 125 `@ModuleRegister` modules directly (each module's no-arg
  constructor reads its own annotation metadata). This is why the modules are fully functional.
- **Anti-tamper guard disabled.** `AccessGuard`'s enforcement gate returns `false` so the integrity
  crash-thread / `LicenseFuse` time-bomb stay inert on a modified build.
- **`nether-pathfinder` added.** Baritone (bundled, used by the auto-farm modules) needs its nested
  JiJ `nether-pathfinder-1.4.1.jar` (elytra native); it's extracted to `libs/` and on the classpath.

## Layout
```
wildsrc/
  build.gradle, settings.gradle, gradle.properties, gradlew(.bat)
  libs/              bundled libs (baritone, nether-pathfinder, netty, javassist, …)
  src/main/java/     777 decompiled + remapped + fixed sources
  src/main/resources assets, shaders, fonts, mixin config, native DLLs, fabric.mod.json
  run/               runClient working dir (created on first launch)
  _notes/            build/run logs
```
The fully remapped + renamed jar is also at `../client-decompiled/_build/client-deobf2.jar`.

## Limitation (inherent, not fixable in source)
This is a commercially-protected client whose real functionality lives in a native anti-tamper DLL
loaded by a proprietary launcher and bound to the original protected bytecode. The workspace runs and
the module system is live, but the ~110 native-backed operations (chat commands, config I/O) are
stubbed because that binary is unavailable and cannot be legitimately rebound here.
