/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongArraySet
 *  minecraft.class07321
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongArraySet;
import minecraft.class05492;
import minecraft.class05494;
import minecraft.class05513;
import minecraft.class05520;
import minecraft.class05531;
import minecraft.class05532;
import minecraft.class07321;

class class05508
implements class05532 {
    final /* synthetic */ class05494 N;
    final /* synthetic */ class05531 y;
    final /* synthetic */ int L;
    final /* synthetic */ class05520 u;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class05508(class05520 class055202, class05494 class054942, class05531 class055312, int n) {
        this.u = class055202;
        this.N = class054942;
        this.y = class055312;
        this.L = n;
    }

    @Override
    public void y(class05513 class055132, class05520 class055202) {
        if (this.u.u) {
            this.u.u();
            new LongArraySet(this.u.y.method_17984()).forEach(l -> this.u.y.method_17988(class07321.N((long)l), class07321.y((long)l), false));
            class05492.N.N();
            class055132.R().v();
        } else {
            this.y(class055132);
        }
    }

    private void y(class05513 class055132) {
        class055132.R().v();
        if (this.N.Z()) {
            this.u.L.forEach(class042512 -> class042512.y(this.y));
            new LongArraySet(this.u.y.method_17984()).forEach(l -> this.u.y.method_17988(class07321.N((long)l), class07321.y((long)l), false));
            this.u.N(this.L + 1);
        }
    }

    @Override
    public void N(class05513 class055132, class05513 class055133, class05520 class055202) {
    }

    @Override
    public void N(class05513 class055132) {
    }

    @Override
    public void N(class05513 class055132, class05520 class055202) {
        this.y(class055132);
    }
}

