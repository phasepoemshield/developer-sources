/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02294
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class00392;
import minecraft.class02294;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class08476;

public abstract class class02840<T extends class07079, S extends class08476, M extends class06078<? super S>>
extends class02294<T, S, M> {
    public class02840(class04832 class048322, M m, float f) {
        super(class048322, m, f);
    }

    protected float method_55831(S s) {
        return super.method_55831(s) * ((class08476)s).Nu;
    }

    protected static boolean N(class07049 class070492, String string) {
        class00392 class003922 = class070492.method_5797();
        return class003922 != null && string.equals(class003922.getString());
    }

    protected boolean method_3921(T t, double d) {
        return super.method_3921(t, d) && (t.method_5733() || t.method_16914() && t == this.field_4676.L);
    }
}

