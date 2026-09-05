/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00207
 *  minecraft.class00236
 *  minecraft.class01660
 *  minecraft.class01894
 *  minecraft.class02436
 *  minecraft.class02782
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07877
 *  minecraft.class08490
 *  minecraft.class08784
 */
package minecraft;

import minecraft.class00207;
import minecraft.class00236;
import minecraft.class01660;
import minecraft.class01894;
import minecraft.class02436;
import minecraft.class02782;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07877;
import minecraft.class08490;
import minecraft.class08784;

public class class02786<T extends class07877>
extends class01660<T, class08784, class02436> {
    private final class01894 N;

    public class02786(class04832 class048322, class02782 class027822) {
        super(class048322, (class06078)new class02436(class048322.N(class027822.field_56098)), (class06078)new class02436(class048322.N(class027822.field_56099)));
        this.N = class027822.field_56097;
        this.N((class06249)new class00207((class06252)this, class048322.B(), class027822.field_56100, class087842 -> class087842.y, (class06078)new class00236(class048322.N(class027822.field_56101)), (class06078)new class00236(class048322.N(class027822.field_56102))));
    }

    public class08784 method_55269() {
        return new class08784();
    }

    public class01894 N(class08784 class087842) {
        return this.N;
    }

    public void method_62354(T t, class08784 class087842, float f) {
        super.method_62354(t, (class08490)class087842, f);
        class087842.N = t.v();
    }
}

