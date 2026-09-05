/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02086
 *  minecraft.class02091
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05216
 *  minecraft.class06541
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02086;
import minecraft.class02091;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class04710;
import minecraft.class04718;
import minecraft.class05216;
import minecraft.class06541;

class class04726
extends class04718 {
    private String y = "";
    private final class02091 L;
    final /* synthetic */ class04710 N;

    public class04726(class04710 class047102) {
        this.N = class047102;
        class05216 class052162 = class00392.N((String)"mco.configure.world.invited.number", (Object[])new Object[]{""}).N(class06541.field_1073);
        this.L = class02091.N((class00392)class052162, (class01590)class047102.R).N(false).N(class02086.field_62118).N();
    }

    int N(int n) {
        return n + this.L.u() * 2;
    }

    public List<? extends class04654> method_25396() {
        return List.of(this.L);
    }

    public List<? extends class03434> method_37025() {
        return List.of(this.L);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        String string;
        String string2 = string = this.N.M.Z != null ? Integer.toString(this.N.M.Z.size()) : "0";
        if (!string.equals(this.y)) {
            this.y = string;
            class05216 class052162 = class00392.N((String)"mco.configure.world.invited.number", (Object[])new Object[]{string}).N(class06541.field_1073);
            this.L.method_25355((class00392)class052162);
        }
        this.L.y(this.N.B.method_25342() + this.N.B.method_25322() / 2 - this.L.method_25368() / 2, this.method_46427() + this.method_25364() / 2 - this.L.method_25364() / 2);
        this.L.method_25394(class010542, n, n2, f);
    }
}

