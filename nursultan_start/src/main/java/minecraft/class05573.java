/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  minecraft.class07068
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07623
 *  minecraft.class07886
 */
package minecraft;

import minecraft.class06889;
import minecraft.class07068;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07623;
import minecraft.class07886;

public class class05573
extends class07623 {
    protected class06889 L() {
        return new class06889(this.y.method_23317(), this.y.method_23323(0.5), this.y.method_23321());
    }

    public class05573(class07079 class070792, class07299 class072992) {
        super(class070792, class072992);
    }

    public boolean u() {
        return true;
    }

    protected boolean y() {
        return true;
    }

    public boolean N(class07209 class072092) {
        return !this.L.method_8320(class072092.method_10074()).P();
    }

    public void N(boolean bl) {
    }

    protected double N(class06889 class068892) {
        return class068892.B;
    }

    protected boolean N(class06889 class068892, class06889 class068893) {
        if (this.y.method_52535()) {
            return class05573.N((class07079)this.y, (class06889)class068892, (class06889)class068893, (boolean)false);
        }
        return false;
    }

    protected class07068 N(int n) {
        this.s = new class07886(false);
        return new class07068(this.s, n);
    }
}

