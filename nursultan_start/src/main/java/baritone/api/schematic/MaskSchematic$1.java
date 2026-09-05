/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package baritone.api.schematic;

import baritone.api.schematic.ISchematic;
import baritone.api.schematic.MaskSchematic;
import baritone.api.schematic.mask.Mask;
import minecraft.class00500;

class MaskSchematic$1
extends MaskSchematic {
    final /* synthetic */ Mask val$function;

    MaskSchematic$1(ISchematic iSchematic, Mask mask) {
        this.val$function = mask;
        super(iSchematic);
    }

    @Override
    protected boolean partOfMask(int n, int n2, int n3, class00500 class005002) {
        return this.val$function.partOfMask(n, n2, n3, class005002);
    }
}

