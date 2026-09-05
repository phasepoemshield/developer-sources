/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package baritone.api.schematic;

import baritone.api.schematic.ISchematic;
import baritone.api.schematic.MaskSchematic;
import minecraft.class00500;

public class WallsSchematic
extends MaskSchematic {
    public WallsSchematic(ISchematic iSchematic) {
        super(iSchematic);
    }

    @Override
    protected boolean partOfMask(int n, int n2, int n3, class00500 class005002) {
        return n == 0 || n3 == 0 || n == this.widthX() - 1 || n3 == this.lengthZ() - 1;
    }
}

