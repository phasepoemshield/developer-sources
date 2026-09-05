/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.IStaticSchematic
 *  minecraft.class07726
 *  minecraft.class07742
 */
package baritone.utils.schematic.format;

import baritone.api.schematic.IStaticSchematic;
import baritone.utils.schematic.format.DefaultSchematicFormats;
import baritone.utils.schematic.format.defaults.MCEditSchematic;
import java.io.IOException;
import java.io.InputStream;
import minecraft.class07726;
import minecraft.class07742;

final class DefaultSchematicFormats$1
extends DefaultSchematicFormats {
    DefaultSchematicFormats$1(String string2) {
    }

    public IStaticSchematic parse(InputStream inputStream) throws IOException {
        return new MCEditSchematic(class07742.N_82((InputStream)inputStream, (class07726)class07726.L()));
    }
}

