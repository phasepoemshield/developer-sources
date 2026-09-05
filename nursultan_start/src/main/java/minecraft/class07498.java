/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00869
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01514
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08092
 *  minecraft.class08978
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00869;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01514;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07477;
import minecraft.class07482;
import minecraft.class07490;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08092;
import minecraft.class08978;

public class class07498
extends class07477 {
    @Override
    public class06584 method_31480() {
        return new class06584((class07310)class06570.sz);
    }

    @Override
    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        class07299 class072992;
        class07082 class070822 = this.L(class080362);
        if (class070822.N() && (class072992 = class080362.method_73183()) instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.method_32875((class03556)class01194.U, (class07049)class080362);
            class01514.N((class04782)class047822, (class08036)class080362, (boolean)true);
        }
        return class070822;
    }

    public class07498(class07078<? extends class07498> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    @Override
    public int B() {
        return 8;
    }

    protected class06581 z() {
        return class06570.sz;
    }

    @Override
    public class07482 N(int n, class08044 class080442) {
        return class07490.N(n, class080442, (class06695)this);
    }

    public void method_5432(class08978 class089782) {
        this.method_73183().method_32888((class03556)class01194.z, this.method_73189(), class01164.N((class07049)class089782.aB_()));
    }

    @Override
    public class00500 R() {
        return (class00500)class00869.LA.W().y((class08092)class00860.u, (Comparable)class07211.field_11043);
    }

    public int method_5439() {
        return 27;
    }
}

