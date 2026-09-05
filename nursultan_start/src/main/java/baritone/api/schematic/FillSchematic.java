/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package baritone.api.schematic;

import baritone.api.schematic.AbstractSchematic;
import baritone.api.utils.BlockOptionalMeta;
import java.util.List;
import minecraft.class00500;

public class FillSchematic
extends AbstractSchematic {
    private final BlockOptionalMeta bom;

    public FillSchematic(int n, int n2, int n3, BlockOptionalMeta blockOptionalMeta) {
        super(n, n2, n3);
        this.bom = blockOptionalMeta;
    }

    public FillSchematic(int n, int n2, int n3, class00500 class005002) {
        this(n, n2, n3, new BlockOptionalMeta(class005002.i()));
    }

    public BlockOptionalMeta getBom() {
        return this.bom;
    }

    @Override
    public class00500 desiredState(int n, int n2, int n3, class00500 class005002, List<class00500> list) {
        if (this.bom.matches(class005002)) {
            return class005002;
        }
        for (class00500 class005003 : list) {
            if (!this.bom.matches(class005003)) continue;
            return class005003;
        }
        return this.bom.getAnyBlockState();
    }
}

