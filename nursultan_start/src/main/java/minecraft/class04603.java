/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class07989
 */
package minecraft;

import minecraft.class04626;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class07989;

class class04603
extends class07989 {
    final /* synthetic */ class04626 N;

    class04603(class04626 class046262, class04626 class046263) {
        this.N = class046262;
        super((class07475)class046263, new Class[0]);
    }

    public boolean y() {
        return this.N.P_() && super.y();
    }

    protected void N(class07079 class070792, class07438 class074382) {
        if (class070792 instanceof class04626 && this.i.method_6057((class07049)class074382)) {
            class070792.y(class074382);
        }
    }
}

