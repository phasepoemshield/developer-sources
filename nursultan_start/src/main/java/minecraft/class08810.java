/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03662
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class08943
 */
package minecraft;

import minecraft.class03662;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class08800;
import minecraft.class08898;
import minecraft.class08943;

public class class08810
extends class08800 {
    public final class08898 y = new class08898();
    public int L;
    public int u;

    public static int N(int n) {
        if (n <= 1) {
            return 1;
        }
        if (n <= 16) {
            return 2;
        }
        if (n <= 32) {
            return 3;
        }
        if (n <= 48) {
            return 4;
        }
        return 5;
    }

    public static int N(class06584 class065842) {
        return class065842.R() ? 187 : class06581.N((class06581)class065842.B()) + class065842.P();
    }

    public void N(class07049 class070492, class06584 class065842, class08943 class089432) {
        class089432.N(this.y, class065842, class03662.field_4318, class070492);
        this.L = class08810.N(class065842.c());
        this.u = class08810.N(class065842);
    }
}

