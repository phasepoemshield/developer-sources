/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class07989
 */
package minecraft;

import minecraft.class07079;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class07637;
import minecraft.class07989;

class class07647
extends class07989 {
    private final class07637 N;

    public class07647(class07637 class076372, Class<?> ... classArray) {
        super((class07475)class076372, (Class[])classArray);
        this.N = class076372;
    }

    public boolean y() {
        if (this.N.L || this.N.u) {
            this.N.y((class07438)null);
            return false;
        }
        return super.y();
    }

    protected void N(class07079 class070792, class07438 class074382) {
        if (class070792 instanceof class07637 && class070792.Nl()) {
            class070792.y(class074382);
        }
    }
}

