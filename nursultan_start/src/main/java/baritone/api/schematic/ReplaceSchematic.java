/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package baritone.api.schematic;

import baritone.api.schematic.ISchematic;
import baritone.api.schematic.MaskSchematic;
import baritone.api.utils.BlockOptionalMetaLookup;
import minecraft.class00500;

public class ReplaceSchematic
extends MaskSchematic {
    private final BlockOptionalMetaLookup filter;
    private final Boolean[][][] cache;

    public ReplaceSchematic(ISchematic iSchematic, BlockOptionalMetaLookup blockOptionalMetaLookup) {
        super(iSchematic);
        this.filter = blockOptionalMetaLookup;
        this.cache = new Boolean[this.widthX()][this.heightY()][this.lengthZ()];
    }

    @Override
    public void reset() {
        for (int i = 0; i < this.cache.length; ++i) {
            for (int j = 0; j < this.cache[0].length; ++j) {
                for (int k = 0; k < this.cache[0][0].length; ++k) {
                    this.cache[i][j][k] = null;
                }
            }
        }
    }

    @Override
    protected boolean partOfMask(int n, int n2, int n3, class00500 class005002) {
        if (this.cache[n][n2][n3] == null) {
            this.cache[n][n2][n3] = this.filter.has(class005002);
        }
        return this.cache[n][n2][n3];
    }
}

