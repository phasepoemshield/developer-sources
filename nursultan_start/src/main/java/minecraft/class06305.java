/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10574
 *  Nursultan.class11300
 *  Nursultan.class11898
 *  Nursultan.class11927
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01323
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class06164
 *  minecraft.class06202
 *  minecraft.class07536
 *  minecraft.class08361
 *  minecraft.class08394
 *  minecraft.class08627
 *  minecraft.class08844
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10574;
import Nursultan.class11300;
import Nursultan.class11898;
import Nursultan.class11927;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01323;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class06164;
import minecraft.class06202;
import minecraft.class07536;
import minecraft.class08361;
import minecraft.class08394;
import minecraft.class08627;
import minecraft.class08844;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06305
extends class01323 {
    public static final class01894 N = class01894.y((String)"textures/gui/title/mojangstudios.png");
    private static final int u = class02566.y((int)255, (int)239, (int)50, (int)61);
    private static final int i = class02566.y((int)255, (int)0, (int)0, (int)0);
    private static IntSupplier R = () -> (Boolean)((class05630)class06202.Nq().i_7).N().method_41753() != false ? i : u;
    private static final int M = 240;
    private static final float B = 60.0f;
    private static final int Z = 60;
    private static final int z = 120;
    private static final float U = 0.0625f;
    private static final float E = 0.95f;
    public static final long y = 1000L;
    public static final long L = 500L;
    private final class06202 W;
    private final class06164 m;
    private final Consumer<Optional<Throwable>> P;
    private final boolean s;
    private float T;
    private long b = -1L;
    private long j = -1L;

    private boolean L() {
        return !this.s || this.j > -1L && class07536.L() - this.j >= 1000L;
    }

    public class06305(class06202 class062022, class06164 class061642, Consumer<Optional<Throwable>> consumer, boolean bl) {
        this.W = class062022;
        this.m = class061642;
        this.P = consumer;
        this.s = bl;
    }

    private static /* synthetic */ int u() {
        return (Boolean)((class05630)class06202.Nq().i_7).N().method_41753() != false ? i : u;
    }

    private float y(float f) {
        return 400.0f;
    }

    public void y() {
        if (this.b == -1L && this.m.L() && this.L()) {
            try {
                this.m.u();
                this.P.accept(Optional.empty());
            }
            catch (Throwable throwable) {
                this.P.accept(Optional.of(throwable));
            }
            this.b = class07536.L();
            if ((class05096)this.W.v_3 != null) {
                class08844 class088442 = this.W.Nt();
                ((class05096)this.W.v_3).method_25423(class088442.P(), class088442.s());
            }
        }
    }

    private float N(float f) {
        return 400.0f;
    }

    private static int N(int n, int n2) {
        return n & 0xFFFFFF | n2 << 24;
    }

    public static void N(class08627 class086272) {
        class086272.N(N, (class08361)new class10574());
    }

    private static void N(CallbackInfo callbackInfo) {
        R = () -> 1316892;
    }

    private void N(class01054 class010542, int n, int n2, int n3, int n4, float f) {
        int n5 = class04995.u((float)((float)(n3 - n - 2) * this.T));
        int n6 = class02566.y((int)Math.round(f * 255.0f), (int)255, (int)255, (int)255);
        n6 = this.N(n6, class010542, n, n2, n3, n4, f);
        class010542.N(n + 2, n2 + 2, n + n5, n4 - 2, n6);
        n6 = this.N(n6);
        class010542.N(n + 1, n2, n3 - 1, n2 + 1, n6);
        class010542.N(n + 1, n4, n3 - 1, n4 - 1, n6);
        class010542.N(n, n2, n + 1, n4, n6);
        class010542.N(n3, n2, n3 - 1, n4, n6);
    }

    public boolean N() {
        return true;
    }

    private int N(int n, class01054 class010542, int n2, int n3, int n4, int n5, float f) {
        int n6 = n & 0xFF000000;
        class010542.N(n2 + 1, n3 + 1, n4 - 1, n5 - 1, 0x14181C | n6);
        return 0x89ABFF | n6;
    }

    private int N(int n) {
        return 0x303336 | n & 0xFF000000;
    }

    private void N(class01054 class010542, RenderPipeline renderPipeline2, class01894 class018942, int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, Operation operation) {
        int n10 = class02566.y((int)n9);
        class11927 class119272 = (renderPipeline, f3, f4, f5) -> {
            if (f3 > 0.0f || f4 > 0.0f || f5 > 0.0f) {
                operation.call(new Object[]{class010542, renderPipeline, class018942, n, n2, Float.valueOf(f), Float.valueOf(f2), n3, n4, n5, n6, n7, n8, class02566.y((int)n10, (int)class02566.u((float)Math.max(f3, 0.0f)), (int)class02566.u((float)Math.max(f4, 0.0f)), (int)class02566.u((float)Math.max(f5, 0.0f)))});
            }
        };
        float f6 = 255.0f;
        float f7 = (float)class11300.u((int)1316892) / f6;
        float f8 = (float)class11300.N((int)1316892) / f6;
        float f9 = (float)class11300.i((int)1316892) / f6;
        float f10 = (float)class11300.u((int)0xFFFFFF) / f6;
        float f11 = (float)class11300.N((int)0xFFFFFF) / f6;
        float f12 = (float)class11300.i((int)0xFFFFFF) / f6;
        class119272.call((RenderPipeline)class11898.N_0, f7 - f10, f8 - f11, f9 - f12);
        class119272.call(renderPipeline2, f10 - f7, f11 - f8, f12 - f9);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        int n3;
        float f2;
        int n4;
        float f3;
        int n5 = class010542.N();
        int n6 = class010542.y();
        long l = class07536.L();
        if (this.s && this.j == -1L) {
            this.j = l;
        }
        float f4 = this.b > -1L ? (float)(l - this.b) / this.y(1000.0f) : -1.0f;
        float f5 = f3 = this.j > -1L ? (float)(l - this.j) / this.N(500.0f) : -1.0f;
        if (f4 >= 1.0f) {
            if ((class05096)this.W.v_3 != null) {
                ((class05096)this.W.v_3).method_47413(class010542, 0, 0, f);
            } else {
                ((class01056)this.W.i_6).y();
            }
            n4 = class04995.u((float)((1.0f - class04995.N((float)(f4 - 1.0f), (float)0.0f, (float)1.0f)) * 255.0f));
            class010542.L();
            class010542.N(0, 0, n5, n6, class06305.N(R.getAsInt(), n4));
            f2 = 1.0f - class04995.N((float)(f4 - 1.0f), (float)0.0f, (float)1.0f);
        } else if (this.s) {
            if ((class05096)this.W.v_3 != null && f3 < 1.0f) {
                ((class05096)this.W.v_3).method_47413(class010542, n, n2, f);
            } else {
                ((class01056)this.W.i_6).y();
            }
            n4 = class04995.L((double)(class04995.N((double)f3, (double)0.15, (double)1.0) * 255.0));
            class010542.L();
            class010542.N(0, 0, n5, n6, class06305.N(R.getAsInt(), n4));
            f2 = class04995.N((float)f3, (float)0.0f, (float)1.0f);
        } else {
            n4 = R.getAsInt();
            RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.W.e().L(), n4);
            f2 = 1.0f;
        }
        n4 = (int)((double)class010542.N() * 0.5);
        int n7 = (int)((double)class010542.y() * 0.5);
        double d = Math.min((double)class010542.N() * 0.75, (double)class010542.y()) * 0.25;
        int n8 = (int)(d * 0.5);
        int n9 = (int)(d * 4.0 * 0.5);
        int n10 = n3 = class02566.y((float)f2);
        int n11 = 120;
        int n12 = 120;
        int n13 = 60;
        int n14 = 120;
        int n15 = (int)d;
        int n16 = n9;
        float f6 = 0.0f;
        float f7 = -0.0625f;
        int n17 = n7 - n8;
        int n18 = n4 - n9;
        class01894 class018942 = N;
        RenderPipeline renderPipeline = class08394.ND;
        class01054 class010543 = class010542;
        this.N(class010543, renderPipeline, class018942, n18, n17, f7, f6, n16, n15, n14, n13, n12, n11, n10, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)14, (String)"[net.minecraft.class_332, com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.class_2960, int, int, float, float, int, int, int, int, int, int, int]");
            Object[] objectArray2 = objectArray;
            ((class01054)objectArray[0]).N((RenderPipeline)objectArray2[1], (class01894)objectArray2[2], ((Integer)objectArray2[3]).intValue(), ((Integer)objectArray2[4]).intValue(), ((Float)objectArray2[5]).floatValue(), ((Float)objectArray2[6]).floatValue(), ((Integer)objectArray2[7]).intValue(), ((Integer)objectArray2[8]).intValue(), ((Integer)objectArray2[9]).intValue(), ((Integer)objectArray2[10]).intValue(), ((Integer)objectArray2[11]).intValue(), ((Integer)objectArray2[12]).intValue(), ((Integer)objectArray2[13]).intValue());
            return null;
        });
        n10 = n3;
        n11 = 120;
        n12 = 120;
        n13 = 60;
        n14 = 120;
        n15 = (int)d;
        n16 = n9;
        f6 = 60.0f;
        f7 = 0.0625f;
        n17 = n7 - n8;
        n18 = n4;
        class018942 = N;
        renderPipeline = class08394.ND;
        class010543 = class010542;
        this.N(class010543, renderPipeline, class018942, n18, n17, f7, f6, n16, n15, n14, n13, n12, n11, n10, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)14, (String)"[net.minecraft.class_332, com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.class_2960, int, int, float, float, int, int, int, int, int, int, int]");
            Object[] objectArray2 = objectArray;
            ((class01054)objectArray[0]).N((RenderPipeline)objectArray2[1], (class01894)objectArray2[2], ((Integer)objectArray2[3]).intValue(), ((Integer)objectArray2[4]).intValue(), ((Float)objectArray2[5]).floatValue(), ((Float)objectArray2[6]).floatValue(), ((Integer)objectArray2[7]).intValue(), ((Integer)objectArray2[8]).intValue(), ((Integer)objectArray2[9]).intValue(), ((Integer)objectArray2[10]).intValue(), ((Integer)objectArray2[11]).intValue(), ((Integer)objectArray2[12]).intValue(), ((Integer)objectArray2[13]).intValue());
            return null;
        });
        int n19 = (int)((double)class010542.y() * 0.8325);
        float f8 = this.m.y();
        this.T = class04995.N((float)(this.T * 0.95f + f8 * 0.050000012f), (float)0.0f, (float)1.0f);
        if (f4 < 1.0f) {
            this.N(class010542, n5 / 2 - n9, n19 - 5, n5 / 2 + n9, n19 + 5, 1.0f - class04995.N((float)f4, (float)0.0f, (float)1.0f));
        }
        if (f4 >= 2.0f) {
            this.W.N(null);
        }
    }
}

