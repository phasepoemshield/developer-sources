/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoTotem
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  minecraft.class00734
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class07049
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.AutoTotem;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11697;
import Nursultan.class11791;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class07049;
import minecraft.class08036;

public class class11678
extends class11697 {
    public Object N_0;

    public class11678(String string, boolean bl) {
        super(string, bl);
        this.i();
    }

    private void i() {
    }

    private boolean N(class08036 class080362) {
        return class080362 != (class04453)((class06202)this.y_0).T_4 && class080362.method_5805() && !class11791.u().test((class07049)class080362) && class080362.method_6047().N(class06570.Gm) && !class080362.method_24828() && (class080362.method_18798().B < 0.0 || class080362.method_23318() <= class080362.field_5971);
    }

    @Override
    public void N(AutoTotem autoTotem) {
        this.i();
        this.N_0 = (class11504)class11524.N((class11512)autoTotem, (String)"smash-height", (float)3.0f, (float)1.0f, (float)10.0f, (float)1.0f).N(class115362 -> this.U());
    }

    @Override
    public boolean N() {
        this.i();
        class00734 class007342 = ((class04453)((class06202)this.y_0).T_4).method_5829();
        class00734 class007343 = new class00734(class007342.N, class007342.i + (double)((Float)((class11504)this.N_0).i()).floatValue(), class007342.L, class007342.u, class007342.i + 8.0, class007342.R).L(2.0, 0.0, 2.0);
        return !((class03448)((class06202)this.y_0).T_3).N(class08036.class, class007343, this::N).isEmpty();
    }
}

