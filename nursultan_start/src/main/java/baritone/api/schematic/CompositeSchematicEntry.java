/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.schematic;

import baritone.api.schematic.ISchematic;

public class CompositeSchematicEntry {
    public final ISchematic schematic;
    public final int x;
    public final int y;
    public final int z;

    public CompositeSchematicEntry(ISchematic iSchematic, int n, int n2, int n3) {
        this.schematic = iSchematic;
        this.x = n;
        this.y = n2;
        this.z = n3;
    }
}

