/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00683
 *  minecraft.class01328
 *  minecraft.class06163
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07953
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00683;
import minecraft.class01328;
import minecraft.class06163;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07953;

public class class06140
extends class07953 {
    private final class00683 N;
    private class07438 y;
    private int L;

    public void L() {
        this.i.y(this.y);
        class07049 class070492 = this.N.yW();
        if (class070492 instanceof class06163) {
            this.L = ((class06163)class070492).method_6117();
        }
        super.L();
    }

    public class06140(class00683 class006832) {
        super((class07079)class006832, false);
        this.N = class006832;
        this.N_71(EnumSet.of(class07430.field_18408));
    }

    public boolean N() {
        if (!this.N.g_()) {
            return false;
        }
        class07049 class070492 = this.N.yW();
        if (!(class070492 instanceof class06163)) {
            return false;
        }
        class06163 class061632 = (class06163)class070492;
        this.y = class061632.method_6065();
        return class061632.method_6117() != this.L && this.N(this.y, class01328.N);
    }
}

