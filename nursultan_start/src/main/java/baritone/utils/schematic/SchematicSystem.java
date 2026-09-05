/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.command.registry.Registry
 *  baritone.api.schematic.ISchematicSystem
 *  baritone.api.schematic.format.ISchematicFormat
 */
package baritone.utils.schematic;

import baritone.api.command.registry.Registry;
import baritone.api.schematic.ISchematicSystem;
import baritone.api.schematic.format.ISchematicFormat;
import baritone.utils.schematic.format.DefaultSchematicFormats;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public enum SchematicSystem implements ISchematicSystem
{
    INSTANCE;

    private final Registry<ISchematicFormat> registry = new Registry();

    private SchematicSystem() {
        Arrays.stream(DefaultSchematicFormats.values()).forEach(arg_0 -> this.registry.register(arg_0));
    }

    public Registry<ISchematicFormat> getRegistry() {
        return this.registry;
    }

    public Optional<ISchematicFormat> getByFile(File file) {
        return this.registry.stream().filter(iSchematicFormat -> iSchematicFormat.isFileType(file)).findFirst();
    }

    public List<String> getFileExtensions() {
        return this.registry.stream().map(ISchematicFormat::getFileExtensions).flatMap(Collection::stream).toList();
    }
}

