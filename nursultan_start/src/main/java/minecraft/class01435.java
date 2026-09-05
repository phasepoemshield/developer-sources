/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class03428
 *  minecraft.class05220
 *  minecraft.class06308
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01450;
import minecraft.class01454;
import minecraft.class01894;
import minecraft.class03428;
import minecraft.class05220;
import minecraft.class06308;
import minecraft.class08394;

abstract class class01435
extends class06308
implements class01450 {
    private boolean N;

    protected class01435(int n, int n2) {
        super(n, n2, 22, 22, class05220.N);
    }

    protected class01435(int n, int n2, class00392 class003922) {
        super(n, n2, 22, 22, class003922);
    }

    public boolean y() {
        return this.N;
    }

    public void N(boolean bl) {
        this.N = bl;
    }

    protected abstract void N(class01054 var1);

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        class01894 class018942 = !this.field_22763 ? class01454.N : (this.N ? class01454.y : (this.method_25367() ? class01454.L : class01454.u));
        class010542.N(class08394.Na, class018942, this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
        this.N(class010542);
    }

    public void method_47399(class03428 class034282) {
        this.method_37021(class034282);
    }
}

