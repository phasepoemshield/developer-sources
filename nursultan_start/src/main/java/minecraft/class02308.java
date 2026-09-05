/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01235
 *  minecraft.class02261
 *  minecraft.class02271
 *  minecraft.class02274
 *  minecraft.class02281
 *  minecraft.class02296
 *  minecraft.class02302
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06925
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08092
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01235;
import minecraft.class02261;
import minecraft.class02271;
import minecraft.class02274;
import minecraft.class02281;
import minecraft.class02296;
import minecraft.class02302;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06925;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08092;

public final class class02308 {
    private static final int N = 14;
    private static final int y = 20;
    private static final int L = 15;

    private static boolean N(class02281 class022812, class02302 class023022) {
        return !class022812.i().R() && class023022 != class02302.field_48899;
    }

    private static List<class06584> N(class04782 class047822, class02281 class022812, class07209 class072092, class08036 class080362, class06584 class065842) {
        class05074 class050742 = class047822.method_8503().yd().N((class05946<class05074>)class022812.y());
        class04162 class041622 = new class04160(class047822).N(class06551.B, (Object)class06889.y((class00753)class072092)).N(class080362.method_7292()).N(class06551.N, (Object)class080362).N(class06551.U, (Object)class065842).N(class06925.W);
        return class050742.N(class041622);
    }

    private static void N(class04782 class047822, class00500 class005002, class07209 class072092, class02281 class022812, class02296 class022962, class02274 class022742, List<class06584> list) {
        class022962.N(list);
        class022742.N(class022962.R());
        class022962.y(class047822.N() + 14L);
        class02308.N(class047822, class072092, class005002, (class00500)class005002.y(class02271.y, (Comparable)class02302.field_48901), class022812, class022742);
    }

    private static boolean N(class02281 class022812, class06584 class065842) {
        return class06584.L((class06584)class065842, (class06584)class022812.i()) && class065842.c() >= class022812.i().c();
    }

    private static boolean N(long l, class02302 class023022) {
        return l % 20L == 0L && class023022 == class02302.field_48900;
    }

    private static void N(class04782 class047822, class02296 class022962, class07209 class072092, class04891 class048912) {
        if (class047822.N() >= class022962.N() + 15L) {
            class047822.N(null, class072092, class048912, class04911.field_15245);
            class022962.N(class047822.N());
        }
    }

    public static void N(class04782 class047822, class07209 class072092, class00500 class005002, class02281 class022812, class02296 class022962, class02274 class022742) {
        class02302 class023022 = (class02302)class005002.L(class02271.y);
        if (class02308.N(class047822.N(), class023022)) {
            class02308.N(class047822, class023022, class022812, class022742, class072092);
        }
        class00500 class005003 = class005002;
        if (class047822.N() >= class022962.L() && class005002 != (class005003 = (class00500)class005003.y(class02271.y, (Comparable)class023022.N(class047822, class072092, class022812, class022962, class022742)))) {
            class02308.N(class047822, class072092, class005002, class005003, class022812, class022742);
        }
        if (class022962.L || class022742.L) {
            class02261.y((class07299)class047822, (class07209)class072092, (class00500)class005002);
            if (class022742.L) {
                class047822.method_8413(class072092, class005002, class005003, 2);
            }
            class022962.L = false;
            class022742.L = false;
        }
    }

    public static void N(class04782 class047822, class07209 class072092, class00500 class005002, class02281 class022812, class02296 class022962, class02274 class022742, class08036 class080362, class06584 class065842) {
        class02302 class023022 = (class02302)class005002.L(class02271.y);
        if (!class02308.N(class022812, class023022)) {
            return;
        }
        if (!class02308.N(class022812, class065842)) {
            class02308.N(class047822, class022962, class072092, class04909.gL);
            return;
        }
        if (class022962.N(class080362)) {
            class02308.N(class047822, class022962, class072092, class04909.Oh);
            return;
        }
        List<class06584> var9 = class02308.N(class047822, class022812, class072092, class080362, class065842);
        if (var9.isEmpty()) {
            return;
        }
        class080362.method_7259(class01235.L.y((Object)class065842.B()));
        class065842.N(class022812.i().c(), (class07438)class080362);
        class02308.N(class047822, class005002, class072092, class022812, class022962, class022742, var9);
        class022962.y(class080362);
        class022742.N(class047822, class072092, class022962, class022812, class022812.u());
    }

    static void N(class04782 class047822, class07209 class072092, class00500 class005002, class00500 class005003, class02281 class022812, class02274 class022742) {
        class02302 class023022 = (class02302)class005002.L(class02271.y);
        class02302 class023023 = (class02302)class005003.L(class02271.y);
        class047822.method_8652(class072092, class005003, 3);
        class023022.N(class047822, class072092, class023023, class022812, class022742, ((Boolean)class005003.L((class08092)class02271.u)).booleanValue());
    }

    static void N(class04782 class047822, class02302 class023022, class02281 class022812, class02274 class022742, class07209 class072092) {
        if (!class02308.N(class022812, class023022)) {
            class022742.N(class06584.E);
            return;
        }
        class06584 class065842 = class02308.N(class047822, class072092, (class05946<class05074>)class022812.R().orElse(class022812.y()));
        class022742.N(class065842);
    }

    private static class06584 N(class04782 class047822, class07209 class072092, class05946<class05074> class059462) {
        class04162 class041622;
        class05074 class050742 = class047822.method_8503().yd().N(class059462);
        ObjectArrayList var5 = class050742.N(class041622 = new class04160(class047822).N(class06551.B, (Object)class06889.y((class00753)class072092)).N(class06925.W), class047822.method_8409());
        if (var5.isEmpty()) {
            return class06584.E;
        }
        return (class06584)class07536.N_77((List)var5, (class06069)class047822.method_8409());
    }
}

