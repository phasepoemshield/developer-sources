/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01180
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class02562
 *  minecraft.class03089
 *  minecraft.class04256
 *  minecraft.class04832
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07070
 *  minecraft.class08004
 *  minecraft.class08118
 *  minecraft.class08155
 *  minecraft.class08186
 *  minecraft.class08278
 */
package minecraft;

import minecraft.class01180;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class02562;
import minecraft.class03089;
import minecraft.class04256;
import minecraft.class04832;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07070;
import minecraft.class08004;
import minecraft.class08118;
import minecraft.class08155;
import minecraft.class08186;
import minecraft.class08278;

public abstract class class02941<T extends class08004, S extends class08278, M extends class03089<S>>
extends class04256<T, S, M> {
    private static final class01894 N = class01894.y((String)"textures/entity/zombie/zombie.png");

    public class02941(class04832 class048322, M m, M m2, class08118<M> class081182, class08118<M> class081183) {
        super(class048322, m, m2, 0.5f);
        this.N((class06249)new class02562((class06252)this, class081182, class081183, class048322.B()));
    }

    protected boolean L(S s) {
        return super.L(s) || ((class08278)s).y;
    }

    public class01894 N(S s) {
        return N;
    }

    public class01180 N(T t, class07070 class070702) {
        class08186 class081862 = (class08186)t.method_61420(class070702.N()).method_58694(class02484.a);
        if (class081862 != null && class081862.N() == class08155.field_63400) {
            return class01180.field_63543;
        }
        return super.N(t, class070702);
    }

    public void method_62354(T t, S s, float f) {
        super.method_62354(t, s, f);
        ((class08278)s).N = t.Nl();
        ((class08278)s).y = t.d();
    }
}

