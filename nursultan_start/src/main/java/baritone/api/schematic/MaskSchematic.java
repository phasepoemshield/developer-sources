/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package baritone.api.schematic;

import baritone.api.schematic.AbstractSchematic;
import baritone.api.schematic.ISchematic;
import baritone.api.schematic.MaskSchematic$1;
import baritone.api.schematic.mask.Mask;
import java.util.List;
import minecraft.class00500;

public abstract class MaskSchematic
extends AbstractSchematic {
    private final ISchematic schematic;

    public static MaskSchematic create(ISchematic iSchematic, Mask mask) {
        return new MaskSchematic$1(iSchematic, mask);
    }

    public MaskSchematic(ISchematic iSchematic) {
        super(iSchematic.widthX(), iSchematic.heightY(), iSchematic.lengthZ());
        this.schematic = iSchematic;
    }

    protected abstract boolean partOfMask(int var1, int var2, int var3, class00500 var4);

    @Override
    public class00500 desiredState(int n, int n2, int n3, class00500 class005002, List<class00500> list) {
        return this.schematic.desiredState(n, n2, n3, class005002, list);
    }

    @Override
    public boolean inSchematic(int n, int n2, int n3, class00500 class005002) {
        return this.schematic.inSchematic(n, n2, n3, class005002) && this.partOfMask(n, n2, n3, class005002);
    }
}

