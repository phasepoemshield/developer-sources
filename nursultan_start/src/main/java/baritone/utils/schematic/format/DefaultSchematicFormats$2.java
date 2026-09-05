/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.IStaticSchematic
 *  minecraft.class07001
 *  minecraft.class07726
 *  minecraft.class07742
 */
package baritone.utils.schematic.format;

import baritone.api.schematic.IStaticSchematic;
import baritone.utils.schematic.format.DefaultSchematicFormats;
import baritone.utils.schematic.format.defaults.SpongeSchematic;
import java.io.IOException;
import java.io.InputStream;
import minecraft.class07001;
import minecraft.class07726;
import minecraft.class07742;

final class DefaultSchematicFormats$2
extends DefaultSchematicFormats {
    DefaultSchematicFormats$2(String string2) {
    }

    public IStaticSchematic parse(InputStream inputStream) throws IOException {
        class07001 class070012 = class07742.N_82((InputStream)inputStream, (class07726)class07726.L());
        int n = class070012.i("Version").orElse(-1);
        switch (n) {
            case 1: 
            case 2: {
                return new SpongeSchematic(class070012);
            }
        }
        throw new UnsupportedOperationException("Unsupported Version of a Sponge Schematic");
    }
}

