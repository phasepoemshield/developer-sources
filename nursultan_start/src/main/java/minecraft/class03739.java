/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02434
 *  minecraft.class02789
 *  minecraft.class04507
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class06959
 *  minecraft.class08007
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02434;
import minecraft.class02789;
import minecraft.class04507;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class06959;
import minecraft.class08007;
import org.joml.Quaternionfc;

public abstract class class03739<T extends class08007, S extends class02789>
extends class04507<T, S> {
    private final class02434 N;

    public class03739(class04832 class048322) {
        super(class048322);
        this.N = new class02434(class048322.N(class04802.z));
    }

    public void method_62354(T t, S s, float f) {
        super.method_62354(t, s, f);
        ((class02789)s).y = t.method_61414(f);
        ((class02789)s).L = t.method_61415(f);
        ((class02789)s).u = (float)((class08007)t).L - f;
    }

    protected abstract class01894 N(S var1);

    public void method_3936(S s, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.N((Quaternionfc)class02058.u.N(((class02789)s).L - 90.0f));
        class014212.N((Quaternionfc)class02058.R.N(((class02789)s).y));
        class012372.N((class06271)this.N, s, class014212, class06851.R((class01894)this.N(s)), ((class02789)s).G, class01384.u, ((class02789)s).l, null);
        class014212.y();
        super.method_3936(s, class014212, class012372, class069592);
    }
}

