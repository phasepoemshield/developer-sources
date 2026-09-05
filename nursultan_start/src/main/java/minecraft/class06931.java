/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01235
 *  minecraft.class01361
 *  minecraft.class06570
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class01235;
import minecraft.class01361;
import minecraft.class06570;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08036;

public class class06931<T extends class07049>
extends class06581 {
    private final class07078<T> N;
    private final int y;

    public class06931(class07078<T> class070782, int n, class06573 class065732) {
        super(class065732);
        this.N = class070782;
        this.y = n;
    }

    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class072992.method_8608()) {
            return class07082.i;
        }
        class07049 class070492 = class080362.method_49694();
        if (class080362.method_5765() && class070492 instanceof class01361) {
            class01361 class013612 = (class01361)class070492;
            if (class070492.method_5864() == this.N && class013612.W()) {
                class07085 class070852 = class070502.N();
                class06584 class065843 = class065842.N(this.y, (class07310)class06570.jr, (class07438)class080362, class070852);
                return class07082.y.N(class065843);
            }
        }
        class080362.method_7259(class01235.L.y((Object)this));
        return class07082.i;
    }
}

