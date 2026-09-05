/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.metadata.MetadataType$Builder
 */
package page.langeweile.ok_zoomer.config.metadata;

import org.quiltmc.config.api.metadata.MetadataType;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset$Range;

public final class RangeSubset$Builder
implements MetadataType.Builder<RangeSubset$Range> {
    private RangeSubset$Range range = new RangeSubset$Range(0, 100);

    public void set(int n, int n2) {
        this.range = new RangeSubset$Range(n, n2);
    }

    public RangeSubset$Range build() {
        return this.range;
    }
}

