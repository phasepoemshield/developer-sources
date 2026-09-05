/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class06687
 */
package minecraft;

import java.util.UUID;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class06687;
import minecraft.class07238;
import minecraft.class07239;
import minecraft.class07240;
import minecraft.class07244;
import minecraft.class07246;
import minecraft.class07251;
import minecraft.class07262;
import minecraft.class07270;
import minecraft.class07272;
import minecraft.class07280;

public class class07254
implements class00381<class07280> {
    public static final class02362<class04247, class07254> N = class00381.N(class07254::N, class07254::new);
    private static final int i = 1;
    private static final int R = 2;
    private static final int M = 4;
    public final UUID y;
    public final class07238 L;
    static final class07238 u = new class07246();

    public static class07254 L(class06687 class066872) {
        return new class07254(class066872.N(), new class07270(class066872.y()));
    }

    private class07254(UUID uUID, class07238 class072382) {
        this.y = uUID;
        this.L = class072382;
    }

    private class07254(class04247 class042472) {
        this.y = class042472.m();
        class07239 class072392 = (class07239)class042472.y(class07239.class);
        this.L = (class07238)class072392.field_29113.decode((Object)class042472);
    }

    public static class07254 i(class06687 class066872) {
        return new class07254(class066872.N(), new class07240(class066872.R(), class066872.M(), class066872.B()));
    }

    public static class07254 u(class06687 class066872) {
        return new class07254(class066872.N(), new class07251(class066872.u(), class066872.i()));
    }

    public static class07254 y(class06687 class066872) {
        return new class07254(class066872.N(), new class07272(class066872.L()));
    }

    static int N(boolean bl, boolean bl2, boolean bl3) {
        int n = 0;
        if (bl) {
            n |= 1;
        }
        if (bl2) {
            n |= 2;
        }
        if (bl3) {
            n |= 4;
        }
        return n;
    }

    public void N(class07262 class072622) {
        this.L.N(this.y, class072622);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public static class07254 N(class06687 class066872) {
        return new class07254(class066872.N(), new class07244(class066872));
    }

    public static class07254 N(UUID uUID) {
        return new class07254(uUID, u);
    }

    private void N(class04247 class042472) {
        class042472.N(this.y);
        class042472.N((Enum)this.L.N());
        this.L.N(class042472);
    }

    public class02897<class07254> method_65080() {
        return class04248.U;
    }
}

