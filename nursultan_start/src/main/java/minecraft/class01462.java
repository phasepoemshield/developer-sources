/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04141
 *  minecraft.class05216
 *  minecraft.class06611
 *  minecraft.class07084
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01435;
import minecraft.class01454;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04141;
import minecraft.class05216;
import minecraft.class06611;
import minecraft.class07084;
import minecraft.class08394;

class class01462
extends class01435 {
    private final boolean L;
    protected final int N;
    private class03556<class07084> u;
    private class01894 i;
    final /* synthetic */ class01454 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class01462(class01454 class014542, int n, int n2, class03556 class035562, boolean bl, int n3) {
        this.y = class014542;
        super(n, n2);
        this.L = bl;
        this.N = n3;
        this.N((class03556<class07084>)class035562);
    }

    protected class05216 y(class03556<class07084> class035562) {
        return class00392.L((String)((class07084)class035562.N()).R());
    }

    protected void N(class03556<class07084> class035562) {
        this.u = class035562;
        this.i = class01056.N(class035562);
        this.method_47400(class04141.N((class00392)this.y(class035562), null));
    }

    @Override
    public void N(int n) {
        this.field_22763 = this.N < n;
        this.N(this.u.equals(this.L ? this.y.G : this.y.l));
    }

    @Override
    protected void N(class01054 class010542) {
        class010542.N(class08394.Na, this.i, this.method_46426() + 2, this.method_46427() + 2, 18, 18);
    }

    public void method_25306(class06611 class066112) {
        if (this.y()) {
            return;
        }
        if (this.L) {
            this.y.G = this.u;
        } else {
            this.y.l = this.u;
        }
        this.y.N();
    }

    protected class05216 method_25360() {
        return this.y(this.u);
    }
}

