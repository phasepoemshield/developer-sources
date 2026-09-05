/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00500
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class04792
 *  minecraft.class04802
 *  minecraft.class04806
 *  minecraft.class04811
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class05904
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class06244
 *  minecraft.class06260
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class08097
 *  minecraft.class08385
 *  org.joml.Quaternionfc
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02004;
import minecraft.class02019;
import minecraft.class02058;
import minecraft.class04792;
import minecraft.class04802;
import minecraft.class04806;
import minecraft.class04811;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class05904;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class06244;
import minecraft.class06260;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class08097;
import minecraft.class08385;
import org.joml.Quaternionfc;

public class class02030
extends class08385 {
    private static final String y = "plank";
    private static final String L = "vChains";
    private static final String u = "normalChains";
    private static final String i = "chainL1";
    private static final String R = "chainL2";
    private static final String M = "chainR1";
    private static final String B = "chainR2";
    private static final String Z = "board";
    public static final float N = 1.0f;
    private static final float z = 0.9f;
    private static final class06889 U = new class06889(0.0, (double)-0.32f, (double)0.073f);
    private final Map<class02004, class06260> E;

    protected class06889 L() {
        return U;
    }

    public class02030(class04811 class048112) {
        super(class048112);
        Stream stream = class05904.N().flatMap(class059042 -> Arrays.stream(class02019.values()).map(class020192 -> new class02004((class05904)class059042, (class02019)((Object)((Object)class020192)))));
        this.E = (Map)stream.collect(ImmutableMap.toImmutableMap(class020042 -> class020042, class020042 -> class02030.N(class048112.R(), class020042.N(), class020042.y())));
    }

    protected float y() {
        return 0.9f;
    }

    public static class04806 N(class02019 class020192) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N(Z, class04822.L().N(0, 12).N(-7.0f, 0.0f, -1.0f, 14.0f, 10.0f, 2.0f), class04838.N);
        if (class020192 == class02019.field_55158) {
            class048392.N(y, class04822.L().N(0, 0).N(-8.0f, -6.0f, -2.0f, 16.0f, 2.0f, 4.0f), class04838.N);
        }
        if (class020192 == class02019.field_55158 || class020192 == class02019.field_55159) {
            class04839 class048393 = class048392.N(u, class04822.L(), class04838.N);
            class048393.N(i, class04822.L().N(0, 6).N(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), class04838.N((float)-5.0f, (float)-6.0f, (float)0.0f, (float)0.0f, (float)-0.7853982f, (float)0.0f));
            class048393.N(R, class04822.L().N(6, 6).N(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), class04838.N((float)-5.0f, (float)-6.0f, (float)0.0f, (float)0.0f, (float)0.7853982f, (float)0.0f));
            class048393.N(M, class04822.L().N(0, 6).N(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), class04838.N((float)5.0f, (float)-6.0f, (float)0.0f, (float)0.0f, (float)-0.7853982f, (float)0.0f));
            class048393.N(B, class04822.L().N(6, 6).N(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), class04838.N((float)5.0f, (float)-6.0f, (float)0.0f, (float)0.0f, (float)0.7853982f, (float)0.0f));
        }
        if (class020192 == class02019.field_55160) {
            class048392.N(L, class04822.L().N(14, 6).N(-6.0f, -6.0f, 0.0f, 12.0f, 6.0f, 0.0f), class04838.N);
        }
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }

    protected float N() {
        return 1.0f;
    }

    public static void N(class01421 class014212, float f) {
        class014212.N(0.5, 0.9375, 0.5);
        class014212.N((Quaternionfc)class02058.u.N(f));
        class014212.N(0.0f, -0.3125f, 0.0f);
    }

    protected void N(class01421 class014212, float f, class00500 class005002) {
        class02030.N(class014212, f);
    }

    protected class06260 N(class00500 class005002, class05904 class059042) {
        class02019 class020192 = class02019.N(class005002);
        return this.E.get((Object)new class02004(class059042, class020192));
    }

    protected class05913 N(class05904 class059042) {
        return class05911.y((class05904)class059042);
    }

    public static class06260 N(class01140 class011402, class05904 class059042, class02019 class020192) {
        return new class06260(class011402.N(class04802.N((class05904)class059042, (class02019)class020192)), class06851::M);
    }

    public static void N(class08097 class080972, class01421 class014212, class01237 class012372, int n, int n2, class06260 class062602, class05913 class059132) {
        class014212.N();
        class02030.N(class014212, 0.0f);
        class014212.y(1.0f, -1.0f, -1.0f);
        class012372.N((class06271)class062602, (Object)class06244.field_17274, class014212, class059132.N(arg_0 -> ((class06260)class062602).method_23500(arg_0)), n, n2, -1, class080972.N(class059132), class01384.u, null);
        class014212.y();
    }
}

