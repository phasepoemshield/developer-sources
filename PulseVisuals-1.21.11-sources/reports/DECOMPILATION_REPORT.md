# Decompilation and recovery report

## Result

- Original class entries: **547**.
- Recovered Java source files: **460**. Inner/anonymous classes are nested in their parent `.java` files, so the Java-file count is lower than the class-entry count.
- Java lines: **62,324**.
- Recovered non-font resource files: **143**.
- Vineflower class-level failures: **0**.
- Remaining intermediary identifiers (`class_####`, `method_####`, `field_####`): **0**.
- Configured mixins/accessors: **66**; missing source files: **0**.
- Bytecode remap: `classes=547 resources=155 failed=0`.

## Pipeline

1. Read the Fabric metadata and extracted the complete JAR structure.
2. Remapped bytecode from `intermediary` to Yarn `named` with the exact Minecraft 1.21.11 mappings.
3. Decompiled the remapped bytecode with Vineflower.
4. Remapped source-level annotation strings and refmap references.
5. Rebuilt a standard `src/main/java` / `src/main/resources` project layout.
6. Ran static quality checks and a `javac` pass. The compiler pass found dependency-resolution errors because Minecraft/Fabric artifacts are not installed in this execution environment, but **no syntax-shaped Java errors** were detected in its reported output.

## Important limitations

- Decompiled source is semantically equivalent reconstruction, not the author's exact original formatting, comments, local variable names, or pre-build source layout.
- Some short private method/local variable names may be original minification and cannot be recovered from bytecode.
- The original JAR contains two classes under `net.minecraft.*`; they are retained because they were physically bundled in the supplied artifact. Review these carefully before publishing or running alongside other mods.
- Font binaries from the supplied archive are deliberately not redistributed in this package. Restore them from your authorized local copy of the original JAR using the paths in `EXCLUDED_FONT_RESOURCES.txt`.
- A fully resolved Gradle build was not run in this environment because Gradle/Minecraft dependencies were unavailable locally. The project is configured with Minecraft 1.21.11, Yarn 1.21.11+build.6, Loader 0.19.2, Fabric API 0.141.4+1.21.11, Loom 1.16.2, and Java 21.

## Mapping statistics

- Named classes available: **9,720**.
- Named members available: **79,393**.
- Text files processed: **515**.
- Text files changed by source cleanup: **72**.
