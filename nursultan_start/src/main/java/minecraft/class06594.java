/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00676
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06501
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07856
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00676;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07856;

public class class06594
extends class06581 {
    public class06594(class06573 class065732) {
        super(class065732);
    }

    @Override
    public class07082 N(class06501 class065012) {
        double d;
        double d2;
        class07209 class072092;
        class07299 class072992 = class065012.method_8045();
        class00500 class005002 = class072992.method_8320(class072092 = class065012.method_8037());
        if (!class005002.N(class00869.LV) && !class005002.N(class00869.q)) {
            return class07082.u;
        }
        class07209 class072093 = class072092.method_10084();
        if (!class072992.R(class072093)) {
            return class07082.u;
        }
        double d3 = class072093.method_10263();
        if (!class072992.N_70(null, new class00734(d3, d2 = (double)class072093.method_10264(), d = (double)class072093.method_10260(), d3 + 1.0, d2 + 2.0, d + 1.0)).isEmpty()) {
            return class07082.u;
        }
        if (class072992 instanceof class04782) {
            class00676 class006762 = new class00676(class072992, d3 + 0.5, d2, d + 0.5);
            class006762.N(false);
            class072992.method_8649((class07049)class006762);
            class072992.N((class07049)class065012.method_8036(), (class03556)class01194.v, class072093);
            class07856 class078562 = ((class04782)class072992).method_29198();
            if (class078562 != null) {
                class078562.M();
            }
        }
        class065012.method_8041().B(1);
        return class07082.N;
    }
}

