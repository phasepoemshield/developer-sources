/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07473
 */
package minecraft;

import minecraft.class07144;
import minecraft.class07473;

class class07159
extends class07473 {
    private int y;
    final /* synthetic */ class07144 N;

    public void L() {
        this.y = this.N(20 * (1 + class07144.y(this.N).y(3)));
        this.N.N(30);
    }

    class07159(class07144 class071442) {
        this.N = class071442;
    }

    public void i() {
        --this.y;
    }

    public void u() {
        if (this.N.T() == null) {
            this.N.N(0);
        }
    }

    public boolean y() {
        return this.N.T() == null && this.y > 0;
    }

    public boolean N() {
        return this.N.T() == null && class07144.N(this.N).y(class07159.y((int)40)) == 0 && this.N.N(this.N.method_24515(), this.N.E());
    }
}

