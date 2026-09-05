/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class01140
 *  minecraft.class01180
 *  minecraft.class02153
 *  minecraft.class02562
 *  minecraft.class04256
 *  minecraft.class04832
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06570
 *  minecraft.class07070
 *  minecraft.class07528
 *  minecraft.class08118
 *  minecraft.class08443
 */
package minecraft;

import minecraft.class01134;
import minecraft.class01140;
import minecraft.class01180;
import minecraft.class02153;
import minecraft.class02562;
import minecraft.class04256;
import minecraft.class04832;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06570;
import minecraft.class07070;
import minecraft.class07528;
import minecraft.class08118;
import minecraft.class08443;

public abstract class class02802<T extends class07528, S extends class08443>
extends class04256<T, S, class02153<S>> {
    public class02802(class04832 class048322, class01134 class011342, class08118<class01134> class081182) {
        this(class048322, class081182, new class02153(class048322.N(class011342)));
    }

    public class02802(class04832 class048322, class08118<class01134> class081182, class02153<S> class021532) {
        super(class048322, class021532, 0.5f);
        this.N((class06249)new class02562((class06252)this, class08118.N(class081182, (class01140)class048322.R(), class02153::new), class048322.B()));
    }

    protected boolean L(S s) {
        return ((class08443)s).a;
    }

    public void method_62354(T t, S s, float f) {
        super.method_62354(t, s, f);
        ((class08443)s).y = t.Nl();
        ((class08443)s).a = t.n();
        ((class08443)s).p = t.method_6047().N(class06570.sx);
    }

    protected class01180 N(T t, class07070 class070702) {
        if (t.method_6068() == class070702 && t.Nl() && t.method_6047().N(class06570.sx)) {
            return class01180.field_3403;
        }
        return super.N(t, class070702);
    }
}

