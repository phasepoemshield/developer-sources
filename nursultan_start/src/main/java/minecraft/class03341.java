/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00500
 *  minecraft.class01134
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02058
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
 *  minecraft.class07751
 *  minecraft.class08097
 *  minecraft.class08385
 *  org.joml.Quaternionfc
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class00500;
import minecraft.class01134;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class03339;
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
import minecraft.class07751;
import minecraft.class08097;
import minecraft.class08385;
import org.joml.Quaternionfc;

public class class03341
extends class08385 {
    public static final float N = 0.6666667f;
    private static final class06889 y = new class06889(0.0, 0.3333333432674408, 0.046666666865348816);
    private final Map<class05904, class03339> L = (Map)class05904.N().collect(ImmutableMap.toImmutableMap(class059042 -> class059042, class059042 -> new class03339(class03341.N(class048112.R(), class059042, true), class03341.N(class048112.R(), class059042, false))));

    protected class06889 L() {
        return y;
    }

    public class03341(class04811 class048112) {
        super(class048112);
    }

    protected float y() {
        return 0.6666667f;
    }

    public static void N(class01421 class014212) {
        class03341.N(class014212, 0.0f);
        class014212.y(0.6666667f, -0.6666667f, -0.6666667f);
    }

    public static class06260 N(class01140 class011402, class05904 class059042, boolean bl) {
        class01134 class011342 = bl ? class04802.N((class05904)class059042) : class04802.y((class05904)class059042);
        return new class06260(class011402.N(class011342), class06851::M);
    }

    public static class04806 N(boolean bl) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("sign", class04822.L().N(0, 0).N(-12.0f, -14.0f, -1.0f, 24.0f, 12.0f, 2.0f), class04838.N);
        if (bl) {
            class048392.N("stick", class04822.L().N(0, 14).N(-1.0f, -2.0f, -1.0f, 2.0f, 14.0f, 2.0f), class04838.N);
        }
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }

    protected class05913 N(class05904 class059042) {
        return class05911.N((class05904)class059042);
    }

    protected float N() {
        return 0.6666667f;
    }

    private static void N(class01421 class014212, float f) {
        class014212.N(0.5f, 0.5f, 0.5f);
        class014212.N((Quaternionfc)class02058.u.N(f));
    }

    protected void N(class01421 class014212, float f, class00500 class005002) {
        class03341.N(class014212, f);
        if (!(class005002.i() instanceof class07751)) {
            class014212.N(0.0f, -0.3125f, -0.4375f);
        }
    }

    protected class06260 N(class00500 class005002, class05904 class059042) {
        class03339 class033392 = this.L.get(class059042);
        return class005002.i() instanceof class07751 ? class033392.N() : class033392.y();
    }

    public static void N(class08097 class080972, class01421 class014212, class01237 class012372, int n, int n2, class06260 class062602, class05913 class059132) {
        class014212.N();
        class03341.N(class014212);
        class012372.N((class06271)class062602, (Object)class06244.field_17274, class014212, class059132.N(arg_0 -> ((class06260)class062602).method_23500(arg_0)), n, n2, -1, class080972.N(class059132), 0, null);
        class014212.y();
    }
}

