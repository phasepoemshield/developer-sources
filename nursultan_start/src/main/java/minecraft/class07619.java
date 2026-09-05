/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class04995;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07637;

class class07619
extends class07473 {
    private final class07637 N;

    public void L() {
        this.N.z(true);
    }

    public class07619(class07637 class076372) {
        this.N = class076372;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406, class07430.field_18407));
    }

    public boolean y() {
        return false;
    }

    public boolean N() {
        int n;
        if (!this.N.method_6109() && !this.N.o() || !this.N.method_24828()) {
            return false;
        }
        if (!this.N.No()) {
            return false;
        }
        float f = this.N.method_36454() * ((float)Math.PI / 180);
        float f2 = -class04995.m((double)f);
        float f3 = class04995.P((double)f);
        int n2 = (double)Math.abs(f2) > 0.5 ? class04995.U((double)f2) : 0;
        int n3 = n = (double)Math.abs(f3) > 0.5 ? class04995.U((double)f3) : 0;
        if (this.N.method_73183().method_8320(this.N.method_24515().method_10069(n2, -1, n)).P()) {
            return true;
        }
        if (this.N.o() && class07637.N(this.N).y(class07619.y((int)60)) == 1) {
            return true;
        }
        return class07637.y(this.N).y(class07619.y((int)500)) == 1;
    }

    public boolean O_() {
        return false;
    }
}

