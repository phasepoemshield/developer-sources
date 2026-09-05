/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.schematic.mask;

import baritone.api.schematic.mask.AbstractMask;
import baritone.api.schematic.mask.StaticMask;

final class PreComputedMask
extends AbstractMask
implements StaticMask {
    private final boolean[][][] mask = new boolean[this.heightY()][this.lengthZ()][this.widthX()];

    public PreComputedMask(StaticMask staticMask) {
        super(staticMask.widthX(), staticMask.heightY(), staticMask.lengthZ());
        for (int i = 0; i < this.heightY(); ++i) {
            for (int j = 0; j < this.lengthZ(); ++j) {
                for (int k = 0; k < this.widthX(); ++k) {
                    this.mask[i][j][k] = staticMask.partOfMask(k, i, j);
                }
            }
        }
    }

    @Override
    public boolean partOfMask(int n, int n2, int n3) {
        return this.mask[n2][n3][n];
    }
}

