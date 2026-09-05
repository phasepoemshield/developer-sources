/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01217
 *  minecraft.class04882
 *  minecraft.class06171
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class00703;
import minecraft.class01217;
import minecraft.class04882;
import minecraft.class06171;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07438;

public abstract class class00675
extends class04882 {
    public class00703 M() {
        return class00703.field_7207;
    }

    protected boolean method_61416(class07049 class070492) {
        if (super.method_61416(class070492)) {
            return true;
        }
        if (class070492.method_5864().N(class01217.k)) {
            return this.method_5781() == null && class070492.method_5781() == null;
        }
        return false;
    }

    public class00675(class07078<? extends class00675> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public void l_() {
        super.l_();
    }

    public boolean method_18395(class07438 class074382) {
        if (class074382 instanceof class06171 && class074382.method_6109()) {
            return false;
        }
        return super.method_18395(class074382);
    }
}

