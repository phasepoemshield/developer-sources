/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06862
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07760
 *  minecraft.class08064
 *  minecraft.class08080
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06862;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07760;
import minecraft.class08064;
import minecraft.class08080;
import minecraft.class08092;

public class class06900
extends class07760 {
    public static final MapCodec<class06900> y = class06900.y(class06900::new);
    public static final class08064<class08080> L = class06665.NE;
    public static final class06667 u = class06665.k;

    public class08092<class08080> L() {
        return L;
    }

    public class06900(class01362 class013622) {
        super(true, class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(L, (Comparable)class08080.field_12665)).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)N, (Comparable)Boolean.valueOf(false)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        class08080 class080802 = (class08080)class005002.L(L);
        class08080 class080803 = this.N(class080802, class069932);
        return (class00500)class005002.y(L, (Comparable)class080803);
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        class08080 class080802 = (class08080)class005002.L(L);
        class08080 class080803 = this.N(class080802, class071112);
        return (class00500)class005002.y(L, (Comparable)class080803);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, u, N});
    }

    public MapCodec<class06900> N() {
        return y;
    }

    protected boolean N(class07299 class072992, class07209 class072092, class00500 class005002, boolean bl, int n) {
        if (n >= 8) {
            return false;
        }
        int n2 = class072092.method_10263();
        int n3 = class072092.method_10264();
        int n4 = class072092.method_10260();
        boolean bl2 = true;
        class08080 class080802 = (class08080)class005002.L(L);
        switch (class06862.N[class080802.ordinal()]) {
            case 1: {
                if (bl) {
                    ++n4;
                    break;
                }
                --n4;
                break;
            }
            case 2: {
                if (bl) {
                    --n2;
                    break;
                }
                ++n2;
                break;
            }
            case 3: {
                if (bl) {
                    --n2;
                } else {
                    ++n2;
                    ++n3;
                    bl2 = false;
                }
                class080802 = class08080.field_12674;
                break;
            }
            case 4: {
                if (bl) {
                    --n2;
                    ++n3;
                    bl2 = false;
                } else {
                    ++n2;
                }
                class080802 = class08080.field_12674;
                break;
            }
            case 5: {
                if (bl) {
                    ++n4;
                } else {
                    --n4;
                    ++n3;
                    bl2 = false;
                }
                class080802 = class08080.field_12665;
                break;
            }
            case 6: {
                if (bl) {
                    ++n4;
                    ++n3;
                    bl2 = false;
                } else {
                    --n4;
                }
                class080802 = class08080.field_12665;
            }
        }
        if (this.N(class072992, new class07209(n2, n3, n4), bl, n, class080802)) {
            return true;
        }
        return bl2 && this.N(class072992, new class07209(n2, n3 - 1, n4), bl, n, class080802);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912) {
        boolean bl;
        boolean bl2 = (Boolean)class005002.L((class08092)u);
        boolean bl3 = bl = class072992.W(class072092) || this.N(class072992, class072092, class005002, true, 0) || this.N(class072992, class072092, class005002, false, 0);
        if (bl != bl2) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(bl)), 3);
            class072992.method_8408(class072092.method_10074(), (class00891)this);
            if (((class08080)class005002.L(L)).y()) {
                class072992.method_8408(class072092.method_10084(), (class00891)this);
            }
        }
    }

    protected boolean N(class07299 class072992, class07209 class072092, boolean bl, int n, class08080 class080802) {
        class00500 class005002 = class072992.method_8320(class072092);
        if (!class005002.N((class00891)this)) {
            return false;
        }
        class08080 class080803 = (class08080)class005002.L(L);
        if (class080802 == class08080.field_12674 && (class080803 == class08080.field_12665 || class080803 == class08080.field_12670 || class080803 == class08080.field_12668)) {
            return false;
        }
        if (class080802 == class08080.field_12665 && (class080803 == class08080.field_12674 || class080803 == class08080.field_12667 || class080803 == class08080.field_12666)) {
            return false;
        }
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            if (class072992.W(class072092)) {
                return true;
            }
            return this.N(class072992, class072092, class005002, bl, n + 1);
        }
        return false;
    }
}

