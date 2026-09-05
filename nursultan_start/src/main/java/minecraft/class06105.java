/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00675
 *  minecraft.class00703
 *  minecraft.class01176
 *  minecraft.class02245
 *  minecraft.class02840
 *  minecraft.class04832
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class08475
 *  minecraft.class08827
 *  minecraft.class08943
 */
package minecraft;

import minecraft.class00675;
import minecraft.class00703;
import minecraft.class01176;
import minecraft.class02245;
import minecraft.class02840;
import minecraft.class04832;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class08475;
import minecraft.class08827;
import minecraft.class08943;

public abstract class class06105<T extends class00675, S extends class08475>
extends class02840<T, S, class01176<S>> {
    public class06105(class04832 class048322, class01176<S> class011762, float f) {
        super(class048322, class011762, f);
        this.N((class06249)new class02245((class06252)this, class048322.R(), class048322.U()));
    }

    public void method_62354(T t, S s, float f) {
        super.method_62354(t, s, f);
        class08827.N(t, s, (class08943)this.L, (float)f);
        ((class08475)s).y = t.method_5765();
        ((class08475)s).p = t.method_6068();
        ((class08475)s).F = t.M();
        ((class08475)s).A = ((class08475)s).F == class00703.field_7210 ? class06593.y((class06584)t.method_6030(), t) : 0;
        ((class08475)s).f = t.method_75120(f);
        ((class08475)s).C = t.method_6055(f);
        ((class08475)s).a = t.Nl();
    }
}

