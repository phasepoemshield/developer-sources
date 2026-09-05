/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01217
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00389;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01217;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07473;

public class class03559
extends class07473 {
    private final class07079 N;
    private final class07299 y;

    public class03559(class07079 class070792, class07299 class072992) {
        this.N = class070792;
        this.y = class072992;
        this.N_71(EnumSet.of(class07430.field_18407));
    }

    public boolean B() {
        return true;
    }

    public void i() {
        this.N.A().y();
    }

    public boolean N() {
        if (!(this.N.field_28628 || this.N.field_27857) || !this.N.method_5864().N(class01217.Z)) {
            return false;
        }
        class07209 class072092 = this.N.method_24515().method_10084();
        class00500 class005002 = this.y.method_8320(class072092);
        return class005002.N(class00869.ba) || class005002.M((class07290)this.y, class072092) == class00389.N();
    }
}

