/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02795
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07085
 *  minecraft.class07862
 *  minecraft.class08490
 */
package minecraft;

import minecraft.class02795;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class07085;
import minecraft.class07862;
import minecraft.class08490;

public abstract class class01660<T extends class07862, S extends class08490, M extends class06078<? super S>>
extends class02795<T, S, M> {
    public class01660(class04832 class048322, M m, M m2) {
        super(class048322, m, m2, 0.75f);
    }

    public void method_62354(T t, S s, float f) {
        super.method_62354(t, s, f);
        ((class08490)s).y = t.method_6118(class07085.field_55946).t();
        ((class08490)s).L = t.NZ().t();
        ((class08490)s).u = t.method_5782();
        ((class08490)s).R = t.u(f);
        ((class08490)s).M = t.i(f);
        ((class08490)s).B = t.R(f);
        ((class08490)s).i = ((class07862)t).i > 0;
    }
}

