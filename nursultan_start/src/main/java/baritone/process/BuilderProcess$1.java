/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.schematic.ISchematic
 *  baritone.api.schematic.MaskSchematic
 *  minecraft.class00500
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.schematic.ISchematic;
import baritone.api.schematic.MaskSchematic;
import baritone.process.BuilderProcess;
import java.util.Collections;
import java.util.List;
import minecraft.class00500;

class BuilderProcess$1
extends MaskSchematic {
    BuilderProcess$1(BuilderProcess builderProcess, ISchematic iSchematic) {
        super(iSchematic);
    }

    public boolean partOfMask(int n, int n2, int n3, class00500 class005002) {
        return !((List)Baritone.settings().buildSkipBlocks.value).contains(this.desiredState(n, n2, n3, class005002, Collections.emptyList()).i());
    }
}

