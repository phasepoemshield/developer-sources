/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01101
 *  minecraft.class01102
 *  minecraft.class01296
 *  minecraft.class07062
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class01101;
import minecraft.class01102;
import minecraft.class01113;
import minecraft.class01115;
import minecraft.class01135;
import minecraft.class01296;
import minecraft.class07062;
import minecraft.class07209;

class class01122<T>
implements class01113 {
    private final T L;
    private long u;
    private class01101<T> i;
    final /* synthetic */ class01115 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class01122(class01115 class011152, class01135 class011352, long l, class01101 class011012) {
        this.y = class011152;
        this.L = class011352;
        this.u = l;
        this.i = class011012;
    }

    @Override
    public void N() {
        long l = class01296.L((class07209)this.L.method_24515());
        if (l != this.u) {
            class01102 class011022 = this.i.L();
            if (!this.i.y(this.L)) {
                class01115.N.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.L, class01296.N((long)this.u), l});
            }
            this.y.N(this.u, this.i);
            class01101 class011012 = this.y.u.L(l);
            class011012.N(this.L);
            this.i = class011012;
            this.u = l;
            this.y.y.N(this.L);
            if (!this.L.method_31747()) {
                boolean bl = class011022.N();
                boolean bl2 = class011012.L().N();
                if (bl && !bl2) {
                    this.y.y.u(this.L);
                } else if (!bl && bl2) {
                    this.y.y.i(this.L);
                }
            }
        }
    }

    @Override
    public void N(class07062 class070622) {
        if (!this.i.y(this.L)) {
            class01115.N.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.L, class01296.N((long)this.u), class070622});
        }
        if (this.i.L().N() || this.L.method_31747()) {
            this.y.y.u(this.L);
        }
        this.y.y.y(this.L);
        this.y.y.R(this.L);
        this.y.L.y(this.L);
        this.L.method_31744(N);
        this.y.N(this.u, this.i);
    }
}

