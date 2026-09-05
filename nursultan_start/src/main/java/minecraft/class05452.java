/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class02441
 *  minecraft.class04792
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08490
 */
package minecraft;

import java.util.Set;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class02441;
import minecraft.class04792;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08490;

public abstract class class05452<T extends class08490>
extends class06078<T> {
    private static final float i = 2.1816616f;
    private static final float R = 1.0471976f;
    private static final float M = 0.7853982f;
    private static final float B = 0.5235988f;
    private static final float Z = 0.2617994f;
    protected static final String N = "head_parts";
    public static final class02415 y = new class02441(true, 16.2f, 1.36f, 2.7272f, 2.0f, 20.0f, Set.of("head_parts"));
    protected final class01686 L;
    protected final class01686 u;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;
    private final class01686 W;
    private final class01686 m;

    public static class04792 L(class04834 class048342) {
        class04792 class047922 = class05452.N(class048342);
        class04839 class048392 = class047922.N();
        class04834 class048343 = class048342.N(0.0f, 5.5f, 0.0f);
        class048392.N("left_hind_leg", class04822.L().N(48, 21).N().N(-3.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, class048343), class04838.N((float)4.0f, (float)14.0f, (float)7.0f));
        class048392.N("right_hind_leg", class04822.L().N(48, 21).N(-1.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, class048343), class04838.N((float)-4.0f, (float)14.0f, (float)7.0f));
        class048392.N("left_front_leg", class04822.L().N(48, 21).N().N(-3.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, class048343), class04838.N((float)4.0f, (float)14.0f, (float)-10.0f));
        class048392.N("right_front_leg", class04822.L().N(48, 21).N(-1.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, class048343), class04838.N((float)-4.0f, (float)14.0f, (float)-10.0f));
        return class047922;
    }

    public class05452(class01686 class016862) {
        super(class016862);
        this.L = class016862.y("body");
        this.u = class016862.y(N);
        this.z = class016862.y("right_hind_leg");
        this.U = class016862.y("left_hind_leg");
        this.E = class016862.y("right_front_leg");
        this.W = class016862.y("left_front_leg");
        this.m = this.L.y("tail");
    }

    public static class04792 y(class04834 class048342) {
        return y.apply(class05452.L(class048342));
    }

    public static class04792 N(class04834 class048342) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 32).N(-5.0f, -8.0f, -17.0f, 10.0f, 10.0f, 22.0f, new class04834(0.05f)), class04838.N((float)0.0f, (float)11.0f, (float)5.0f));
        class04839 class048394 = class048392.N(N, class04822.L().N(0, 35).N(-2.05f, -6.0f, -2.0f, 4.0f, 12.0f, 7.0f), class04838.N((float)0.0f, (float)4.0f, (float)-12.0f, (float)0.5235988f, (float)0.0f, (float)0.0f));
        class04839 class048395 = class048394.N("head", class04822.L().N(0, 13).N(-3.0f, -11.0f, -2.0f, 6.0f, 5.0f, 7.0f, class048342), class04838.N);
        class048394.N("mane", class04822.L().N(56, 36).N(-1.0f, -11.0f, 5.01f, 2.0f, 16.0f, 2.0f, class048342), class04838.N);
        class048394.N("upper_mouth", class04822.L().N(0, 25).N(-2.0f, -11.0f, -7.0f, 4.0f, 5.0f, 5.0f, class048342), class04838.N);
        class048392.N("left_hind_leg", class04822.L().N(48, 21).N().N(-3.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, class048342), class04838.N((float)4.0f, (float)14.0f, (float)7.0f));
        class048392.N("right_hind_leg", class04822.L().N(48, 21).N(-1.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, class048342), class04838.N((float)-4.0f, (float)14.0f, (float)7.0f));
        class048392.N("left_front_leg", class04822.L().N(48, 21).N().N(-3.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, class048342), class04838.N((float)4.0f, (float)14.0f, (float)-10.0f));
        class048392.N("right_front_leg", class04822.L().N(48, 21).N(-1.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, class048342), class04838.N((float)-4.0f, (float)14.0f, (float)-10.0f));
        class048393.N("tail", class04822.L().N(42, 36).N(-1.5f, 0.0f, 0.0f, 3.0f, 14.0f, 4.0f, class048342), class04838.N((float)0.0f, (float)-5.0f, (float)2.0f, (float)0.5235988f, (float)0.0f, (float)0.0f));
        class048395.N("left_ear", class04822.L().N(19, 16).N(0.55f, -13.0f, 4.0f, 2.0f, 3.0f, 1.0f, new class04834(-0.001f)), class04838.N);
        class048395.N("right_ear", class04822.L().N(19, 16).N(-2.55f, -13.0f, 4.0f, 2.0f, 3.0f, 1.0f, new class04834(-0.001f)), class04838.N);
        return class047922;
    }

    public void method_2819(T t) {
        super.method_2819(t);
        float f = class04995.N((float)((class08490)t).D, (float)-20.0f, (float)20.0f);
        float f2 = ((class08490)t).h * ((float)Math.PI / 180);
        float f3 = ((class08490)t).Ny;
        float f4 = ((class08490)t).NN;
        if (f3 > 0.2f) {
            f2 += class04995.P((double)(f4 * 0.8f)) * 0.15f * f3;
        }
        float f5 = ((class08490)t).R;
        float f6 = ((class08490)t).M;
        float f7 = 1.0f - f6;
        float f8 = ((class08490)t).B;
        boolean bl = ((class08490)t).i;
        this.u.i = 0.5235988f + f2;
        this.u.R = f * ((float)Math.PI / 180);
        float f9 = class04995.P((double)((((class08490)t).NZ ? 0.2f : 1.0f) * f4 * 0.6662f + (float)Math.PI));
        float f10 = f9 * 0.8f * f3;
        float f11 = (1.0f - Math.max(f6, f5)) * (0.5235988f + f2 + f8 * class04995.m((double)((class08490)t).P) * 0.05f);
        this.u.i = f6 * (0.2617994f + f2) + f5 * (2.1816616f + class04995.m((double)((class08490)t).P) * 0.05f) + f11;
        this.u.R = f6 * f * ((float)Math.PI / 180) + (1.0f - Math.max(f6, f5)) * this.u.R;
        float f12 = ((class08490)t).Nu;
        this.u.L += class04995.B((float)f5, (float)class04995.B((float)f6, (float)0.0f, (float)(-8.0f * f12)), (float)(7.0f * f12));
        this.u.u = class04995.B((float)f6, (float)this.u.u, (float)(-4.0f * f12));
        this.L.i = f6 * -0.7853982f + f7 * this.L.i;
        float f13 = 0.2617994f * f6;
        float f14 = class04995.P((double)(((class08490)t).P * 0.6f + (float)Math.PI));
        this.W.L -= 12.0f * f12 * f6;
        this.W.u += 4.0f * f12 * f6;
        this.E.L = this.W.L;
        this.E.u = this.W.u;
        float f15 = (-1.0471976f + f14) * f6 + f10 * f7;
        float f16 = (-1.0471976f - f14) * f6 - f10 * f7;
        this.U.i = f13 - f9 * 0.5f * f3 * f7;
        this.z.i = f13 + f9 * 0.5f * f3 * f7;
        this.W.i = f15;
        this.E.i = f16;
        this.m.i = 0.5235988f + f3 * 0.75f;
        this.m.L += f3 * f12;
        this.m.u += f3 * 2.0f * f12;
        this.m.R = bl ? class04995.P((double)(((class08490)t).P * 0.7f)) : 0.0f;
    }
}

