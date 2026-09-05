/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class01894
 *  minecraft.class02415
 *  minecraft.class02441
 *  minecraft.class04792
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class05402
 *  minecraft.class06078
 *  minecraft.class06230
 *  minecraft.class06240
 *  minecraft.class06584
 *  minecraft.class06733
 *  minecraft.class06851
 *  minecraft.class07050
 *  minecraft.class07070
 *  minecraft.class07311
 *  minecraft.class08118
 *  minecraft.class08173
 *  minecraft.class08467
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import java.util.Set;
import java.util.function.Function;
import minecraft.class01180;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class01894;
import minecraft.class02415;
import minecraft.class02441;
import minecraft.class04792;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class05402;
import minecraft.class06078;
import minecraft.class06230;
import minecraft.class06240;
import minecraft.class06584;
import minecraft.class06733;
import minecraft.class06851;
import minecraft.class07050;
import minecraft.class07070;
import minecraft.class07311;
import minecraft.class08118;
import minecraft.class08173;
import minecraft.class08467;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01188<T extends class08467>
extends class06078<T>
implements class06230,
class06240<T> {
    public static final class02415 N = new class02441(true, 16.0f, 0.0f, 2.0f, 2.0f, 24.0f, Set.of("head"));
    public static final float y = 0.25f;
    public static final float L = 0.5f;
    public static final float u = -0.1f;
    private static final float m = 0.005f;
    private static final float P = 0.2617994f;
    private static final float s = 1.9198622f;
    private static final float T = 0.2617994f;
    private static final float b = -1.3962634f;
    private static final float j = 0.43633232f;
    private static final float v = 0.5235988f;
    public static final float i = 1.4835298f;
    public static final float R = 0.5235988f;
    public final class01686 M;
    public final class01686 B;
    public final class01686 Z;
    public final class01686 z;
    public final class01686 U;
    public final class01686 E;
    public final class01686 W;

    private void L(T t) {
        switch (((class08467)t).No.ordinal()) {
            case 0: {
                this.z.R = 0.0f;
                break;
            }
            case 2: {
                this.N(this.z, true);
                break;
            }
            case 1: {
                this.z.i = this.z.i * 0.5f - 0.31415927f;
                this.z.R = 0.0f;
                break;
            }
            case 4: {
                this.z.i = this.z.i * 0.5f - (float)Math.PI;
                this.z.R = 0.0f;
                break;
            }
            case 10: {
                class06733.N((class01686)this.z, (class01686)this.M, (boolean)true, (class06584)t.y(class07070.field_6183), t);
                break;
            }
            case 3: {
                this.z.R = -0.1f + this.M.R;
                this.U.R = 0.1f + this.M.R + 0.4f;
                this.z.i = -1.5707964f + this.M.i;
                this.U.i = -1.5707964f + this.M.i;
                break;
            }
            case 5: {
                class05402.N((class01686)this.z, (class01686)this.U, (float)((class08467)t).i, (float)((class08467)t).R, (boolean)true);
                break;
            }
            case 6: {
                class05402.N((class01686)this.z, (class01686)this.U, (class01686)this.M, (boolean)true);
                break;
            }
            case 9: {
                this.z.i = this.z.i * 0.5f - 0.62831855f;
                this.z.R = 0.0f;
                break;
            }
            case 7: {
                this.z.i = class04995.N((float)(this.M.i - 1.9198622f - (((class08467)t).Z ? 0.2617994f : 0.0f)), (float)-2.4f, (float)3.3f);
                this.z.R = this.M.R - 0.2617994f;
                break;
            }
            case 8: {
                this.z.i = class04995.N((float)this.M.i, (float)-1.2f, (float)1.2f) - 1.4835298f;
                this.z.R = this.M.R - 0.5235988f;
            }
        }
    }

    public class01188(class01686 class016862) {
        this(class016862, class06851::M);
    }

    public class01188(class01686 class016862, Function<class01894, class07311> function) {
        super(class016862, function);
        this.M = class016862.y("head");
        this.B = this.M.y("hat");
        this.Z = class016862.y("body");
        this.z = class016862.y("right_arm");
        this.U = class016862.y("left_arm");
        this.E = class016862.y("right_leg");
        this.W = class016862.y("left_leg");
    }

    private void u(T t) {
        switch (((class08467)t).NV.ordinal()) {
            case 0: {
                this.U.R = 0.0f;
                break;
            }
            case 2: {
                this.N(this.U, false);
                break;
            }
            case 1: {
                this.U.i = this.U.i * 0.5f - 0.31415927f;
                this.U.R = 0.0f;
                break;
            }
            case 4: {
                this.U.i = this.U.i * 0.5f - (float)Math.PI;
                this.U.R = 0.0f;
                break;
            }
            case 10: {
                class06733.N((class01686)this.U, (class01686)this.M, (boolean)false, (class06584)t.y(class07070.field_6182), t);
                break;
            }
            case 3: {
                this.z.R = -0.1f + this.M.R - 0.4f;
                this.U.R = 0.1f + this.M.R;
                this.z.i = -1.5707964f + this.M.i;
                this.U.i = -1.5707964f + this.M.i;
                break;
            }
            case 5: {
                class05402.N((class01686)this.z, (class01686)this.U, (float)((class08467)t).i, (float)((class08467)t).R, (boolean)false);
                break;
            }
            case 6: {
                class05402.N((class01686)this.z, (class01686)this.U, (class01686)this.M, (boolean)false);
                break;
            }
            case 9: {
                this.U.i = this.U.i * 0.5f - 0.62831855f;
                this.U.R = 0.0f;
                break;
            }
            case 7: {
                this.U.i = class04995.N((float)(this.M.i - 1.9198622f - (((class08467)t).Z ? 0.2617994f : 0.0f)), (float)-2.4f, (float)3.3f);
                this.U.R = this.M.R + 0.2617994f;
                break;
            }
            case 8: {
                this.U.i = class04995.N((float)this.M.i, (float)-1.2f, (float)1.2f) - 1.4835298f;
                this.U.R = this.M.R + 0.5235988f;
            }
        }
    }

    protected void y(T t) {
        float f = ((class08467)t).NX;
        if (f <= 0.0f) {
            return;
        }
        this.Z.R = class04995.m((double)(class04995.N((float)f) * ((float)Math.PI * 2))) * 0.2f;
        if (((class08467)t).M == class07070.field_6182) {
            this.Z.R *= -1.0f;
        }
        float f2 = ((class08467)t).Nu;
        this.z.u = class04995.m((double)this.Z.R) * 5.0f * f2;
        this.z.y = -class04995.P((double)this.Z.R) * 5.0f * f2;
        this.U.u = -class04995.m((double)this.Z.R) * 5.0f * f2;
        this.U.y = class04995.P((double)this.Z.R) * 5.0f * f2;
        this.z.R += this.Z.R;
        this.U.R += this.Z.R;
        this.U.i += this.Z.R;
        switch (((class08467)t).Nc) {
            case field_63399: {
                float f3 = class04995.m((double)(class08173.G((float)f) * (float)Math.PI));
                float f4 = class04995.m((double)(f * (float)Math.PI)) * -(this.M.i - 0.7f) * 0.75f;
                class01686 class016862 = this.N(((class08467)t).M);
                class016862.i -= f3 * 1.2f + f4;
                class016862.R += this.Z.R * 2.0f;
                class016862.M += class04995.m((double)(f * (float)Math.PI)) * -0.4f;
                break;
            }
            case field_63398: {
                break;
            }
            case field_63400: {
                class06733.N((class01188)this, t);
            }
        }
    }

    public static class08118<class04792> y(class04834 class048342, class04834 class048343) {
        return class01188.N(class01188::N, class048342, class048343);
    }

    public void N(class08467 class084672, class07070 class070702, class01421 class014212) {
        this.field_54014.N(class014212);
        this.N(class070702).N(class014212);
    }

    public class01686 N(class07070 class070702) {
        if (class070702 == class07070.field_6182) {
            return this.U;
        }
        return this.z;
    }

    public static class04792 N(class04834 class048342, float f) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, class048342), class04838.N((float)0.0f, (float)(0.0f + f), (float)0.0f)).N("hat", class04822.L().N(32, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, class048342.N(0.5f)), class04838.N);
        class048392.N("body", class04822.L().N(16, 16).N(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, class048342), class04838.N((float)0.0f, (float)(0.0f + f), (float)0.0f));
        class048392.N("right_arm", class04822.L().N(40, 16).N(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342), class04838.N((float)-5.0f, (float)(2.0f + f), (float)0.0f));
        class048392.N("left_arm", class04822.L().N(40, 16).N().N(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342), class04838.N((float)5.0f, (float)(2.0f + f), (float)0.0f));
        class048392.N("right_leg", class04822.L().N(0, 16).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342), class04838.N((float)-1.9f, (float)(12.0f + f), (float)0.0f));
        class048392.N("left_leg", class04822.L().N(0, 16).N().N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342), class04838.N((float)1.9f, (float)(12.0f + f), (float)0.0f));
        return class047922;
    }

    private void N(class08467 class084672, CallbackInfo callbackInfo) {
        if (VisualSettings.INSTANCE.oldWalkingAnimation.isEnabled()) {
            float f = class084672.NN;
            float f2 = class084672.Ny;
            this.z.i = class04995.P((double)(f * 0.6662f + (float)Math.PI)) * 2.0f * f2;
            this.z.M = (class04995.P((double)(f * 0.2312f)) + 1.0f) * 1.0f * f2;
            this.U.i = class04995.P((double)(f * 0.6662f)) * 2.0f * f2;
            this.U.M = (class04995.P((double)(f * 0.2812f)) - 1.0f) * 1.0f * f2;
        }
    }

    private float N(float f, float f2, float f3) {
        if (VisualSettings.INSTANCE.lockBlockingArmRotation.isEnabled()) {
            return 0.0f;
        }
        return class04995.N((float)f, (float)f2, (float)f3);
    }

    private void N(class01686 class016862, boolean bl) {
        float f = 0.43633232f;
        float f2 = -1.3962634f;
        float f3 = this.M.i;
        class016862.i = class016862.i * 0.5f - 0.9424779f + this.N(f3, f2, f);
        f = 0.5235988f;
        f2 = -0.5235988f;
        f3 = this.M.R;
        class016862.R = (bl ? -30.0f : 30.0f) * ((float)Math.PI / 180) + this.N(f3, f2, f);
    }

    protected static class08118<class04792> N(Function<class04834, class04792> function, class04834 class048342, class04834 class048343) {
        class04792 class047922 = function.apply(class048343);
        class047922.N().N(Set.of("head"));
        class04792 class047923 = function.apply(class048343);
        class047923.N().y(Set.of("body", "left_arm", "right_arm"));
        class04792 class047924 = function.apply(class048342);
        class047924.N().y(Set.of("left_leg", "right_leg", "body"));
        class04792 class047925 = function.apply(class048343);
        class047925.N().y(Set.of("left_leg", "right_leg"));
        return new class08118((Object)class047922, (Object)class047923, (Object)class047924, (Object)class047925);
    }

    private static class04792 N(class04834 class048342) {
        class04792 class047922 = class01188.N(class048342, 0.0f);
        class04839 class048392 = class047922.N();
        class048392.N("right_leg", class04822.L().N(0, 16).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342.N(-0.1f)), class04838.N((float)-1.9f, (float)12.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(0, 16).N().N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342.N(-0.1f)), class04838.N((float)1.9f, (float)12.0f, (float)0.0f));
        return class047922;
    }

    public void method_2819(T t) {
        boolean bl;
        super.method_2819(t);
        class01180 class011802 = ((class08467)t).NV;
        class01180 class011803 = ((class08467)t).No;
        float f = ((class08467)t).L;
        boolean bl2 = ((class08467)t).g;
        this.M.i = ((class08467)t).h * ((float)Math.PI / 180);
        this.M.R = ((class08467)t).D * ((float)Math.PI / 180);
        if (bl2) {
            this.M.i = -0.7853982f;
        } else if (f > 0.0f) {
            this.M.i = class04995.z((float)f, (float)this.M.i, (float)-0.7853982f);
        }
        float f2 = ((class08467)t).NN;
        float f3 = ((class08467)t).Ny;
        this.z.i = class04995.P((double)(f2 * 0.6662f + (float)Math.PI)) * 2.0f * f3 * 0.5f / ((class08467)t).u;
        this.U.i = class04995.P((double)(f2 * 0.6662f)) * 2.0f * f3 * 0.5f / ((class08467)t).u;
        this.E.i = class04995.P((double)(f2 * 0.6662f)) * 1.4f * f3 / ((class08467)t).u;
        this.W.i = class04995.P((double)(f2 * 0.6662f + (float)Math.PI)) * 1.4f * f3 / ((class08467)t).u;
        this.E.R = 0.005f;
        this.W.R = -0.005f;
        this.E.M = 0.005f;
        this.W.M = -0.005f;
        this.N((class08467)t, null);
        if (((class08467)t).J) {
            this.z.i += -0.62831855f;
            this.U.i += -0.62831855f;
            this.E.i = -1.4137167f;
            this.E.R = 0.31415927f;
            this.E.M = 0.07853982f;
            this.W.i = -1.4137167f;
            this.W.R = -0.31415927f;
            this.W.M = -0.07853982f;
        }
        boolean bl3 = bl = ((class08467)t).NJ == class07070.field_6183;
        if (((class08467)t).o) {
            boolean bl4 = var9_9 = ((class08467)t).B == class07050.field_5808;
            if (var9_9 == bl) {
                this.L(t);
                if (!((class08467)t).No.y()) {
                    this.u(t);
                }
            } else {
                this.u(t);
                if (!((class08467)t).NV.y()) {
                    this.L(t);
                }
            }
        } else {
            boolean bl5 = var9_9 = bl ? class011802.N() : class011803.N();
            if (bl != var9_9) {
                this.u(t);
                if (!((class08467)t).NV.y()) {
                    this.L(t);
                }
            } else {
                this.L(t);
                if (!((class08467)t).No.y()) {
                    this.u(t);
                }
            }
        }
        this.y(t);
        if (((class08467)t).Z) {
            this.Z.i = 0.5f;
            this.z.i += 0.4f;
            this.U.i += 0.4f;
            this.E.u += 4.0f;
            this.W.u += 4.0f;
            this.M.L += 4.2f;
            this.Z.L += 3.2f;
            this.U.L += 3.2f;
            this.z.L += 3.2f;
        }
        if (class011803 != class01180.field_27434) {
            class05402.N((class01686)this.z, (float)((class08467)t).P, (float)1.0f);
        }
        if (class011802 != class01180.field_27434) {
            class05402.N((class01686)this.U, (float)((class08467)t).P, (float)-1.0f);
        }
        if (f > 0.0f) {
            float f4;
            float f5;
            float f6 = f2 % 26.0f;
            class07070 class070702 = ((class08467)t).M;
            float f7 = ((class08467)t).No == class01180.field_63543 || class070702 == class07070.field_6183 && ((class08467)t).NX > 0.0f ? 0.0f : f;
            float f8 = f5 = ((class08467)t).NV == class01180.field_63543 || class070702 == class07070.field_6182 && ((class08467)t).NX > 0.0f ? 0.0f : f;
            if (!((class08467)t).o) {
                if (f6 < 14.0f) {
                    this.U.i = class04995.z((float)f5, (float)this.U.i, (float)0.0f);
                    this.z.i = class04995.B((float)f7, (float)this.z.i, (float)0.0f);
                    this.U.R = class04995.z((float)f5, (float)this.U.R, (float)((float)Math.PI));
                    this.z.R = class04995.B((float)f7, (float)this.z.R, (float)((float)Math.PI));
                    this.U.M = class04995.z((float)f5, (float)this.U.M, (float)((float)Math.PI + 1.8707964f * this.N(f6) / this.N(14.0f)));
                    this.z.M = class04995.B((float)f7, (float)this.z.M, (float)((float)Math.PI - 1.8707964f * this.N(f6) / this.N(14.0f)));
                } else if (f6 >= 14.0f && f6 < 22.0f) {
                    f4 = (f6 - 14.0f) / 8.0f;
                    this.U.i = class04995.z((float)f5, (float)this.U.i, (float)(1.5707964f * f4));
                    this.z.i = class04995.B((float)f7, (float)this.z.i, (float)(1.5707964f * f4));
                    this.U.R = class04995.z((float)f5, (float)this.U.R, (float)((float)Math.PI));
                    this.z.R = class04995.B((float)f7, (float)this.z.R, (float)((float)Math.PI));
                    this.U.M = class04995.z((float)f5, (float)this.U.M, (float)(5.012389f - 1.8707964f * f4));
                    this.z.M = class04995.B((float)f7, (float)this.z.M, (float)(1.2707963f + 1.8707964f * f4));
                } else if (f6 >= 22.0f && f6 < 26.0f) {
                    f4 = (f6 - 22.0f) / 4.0f;
                    this.U.i = class04995.z((float)f5, (float)this.U.i, (float)(1.5707964f - 1.5707964f * f4));
                    this.z.i = class04995.B((float)f7, (float)this.z.i, (float)(1.5707964f - 1.5707964f * f4));
                    this.U.R = class04995.z((float)f5, (float)this.U.R, (float)((float)Math.PI));
                    this.z.R = class04995.B((float)f7, (float)this.z.R, (float)((float)Math.PI));
                    this.U.M = class04995.z((float)f5, (float)this.U.M, (float)((float)Math.PI));
                    this.z.M = class04995.B((float)f7, (float)this.z.M, (float)((float)Math.PI));
                }
            }
            f4 = 0.3f;
            float f9 = 0.33333334f;
            this.W.i = class04995.B((float)f, (float)this.W.i, (float)(0.3f * class04995.P((double)(f2 * 0.33333334f + (float)Math.PI))));
            this.E.i = class04995.B((float)f, (float)this.E.i, (float)(0.3f * class04995.P((double)(f2 * 0.33333334f))));
        }
    }

    public void N(boolean bl) {
        this.M.U = bl;
        this.B.U = bl;
        this.Z.U = bl;
        this.z.U = bl;
        this.U.U = bl;
        this.E.U = bl;
        this.W.U = bl;
    }

    private float N(float f) {
        return -65.0f * f + f * f;
    }

    public class01686 R() {
        return this.M;
    }
}

