/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class00780
 *  minecraft.class00801
 *  minecraft.class00869
 *  minecraft.class01231
 *  minecraft.class01296
 *  minecraft.class01315
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class03042
 *  minecraft.class03063
 *  minecraft.class03448
 *  minecraft.class04688
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05630
 *  minecraft.class05847
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06966
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07134
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07311
 *  minecraft.class07830
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions;
import java.util.List;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class00780;
import minecraft.class00801;
import minecraft.class00869;
import minecraft.class01231;
import minecraft.class01296;
import minecraft.class01315;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01894;
import minecraft.class02455;
import minecraft.class02566;
import minecraft.class03042;
import minecraft.class03063;
import minecraft.class03448;
import minecraft.class04688;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class05847;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06966;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07134;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07311;
import minecraft.class07830;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02425 {
    private static final float N = 0.225f;
    private static final int y = 10;
    private static final class01894 L = class01894.y((String)"textures/environment/rain.png");
    private static final class01894 u = class01894.y((String)"textures/environment/snow.png");
    private static final int i = 32;
    private static final int R = 16;
    private int M;
    private final float[] B = new float[1024];
    private final float[] Z = new float[1024];

    public class02425() {
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                float f = j - 16;
                float f2 = i - 16;
                float f3 = class04995.M((float)f, (float)f2);
                this.B[i * 32 + j] = -f2 / f3;
                this.Z[i * 32 + j] = f / f3;
            }
        }
    }

    private void y(class03448 class034482, class05363 class053632, int n, class01315 class013152, int n2) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class034482, class053632, n, class013152, n2, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        float f = class034482.method_8430(1.0f);
        if (f <= 0.0f) {
            return;
        }
        class06069 class060692 = class06069.y((long)((long)n * 312987231L));
        class07209 class072092 = class07209.method_49638((class00737)class053632.y());
        class07209 class072093 = null;
        int n3 = 2 * n2 + 1;
        int n4 = n3 * n3;
        int n5 = (int)(0.225f * (float)n4 * f * f) / (class013152 == class01315.field_18198 ? 2 : 1);
        for (int i = 0; i < n5; ++i) {
            int n6;
            int n7 = class060692.y(n3) - n2;
            class07209 class072094 = class034482.N(class07830.field_13197, class072092.method_10069(n7, 0, n6 = class060692.y(n3) - n2));
            if (class072094.method_10264() <= class034482.method_31607() || class072094.method_10264() > class072092.method_10264() + 10 || class072094.method_10264() < class072092.method_10264() - 10 || this.N((class07299)class034482, class072094) != class00801.field_9382) continue;
            class072093 = class072094.method_10074();
            if (class013152 == class01315.field_18199) break;
            double d = class060692.U();
            double d2 = class060692.U();
            class00500 class005002 = class034482.method_8320(class072093);
            class04688 class046882 = class034482.method_8316(class072093);
            double d3 = class005002.M((class07290)class034482, class072093).method_1102(class07185.field_11052, d, d2);
            double d4 = class046882.N((class07290)class034482, class072093);
            double d5 = Math.max(d3, d4);
            class07134 class071342 = class046882.N(class01231.y) || class005002.N(class00869.EI) || class05847.U((class00500)class005002) ? class07107.NZ : class07107.NB;
            class034482.method_8406((class07126)class071342, (double)class072093.method_10263() + d, (double)class072093.method_10264() + d5, (double)class072093.method_10260() + d2, 0.0, 0.0, 0.0);
        }
        if (class072093 != null && class060692.y(3) < this.M++) {
            this.M = 0;
            if (class072093.method_10264() > class072092.method_10264() + 1 && class034482.N(class07830.field_13197, class072092).method_10264() > class04995.y((float)class072092.method_10264())) {
                class034482.method_45446(class072093, class04909.Id, class04911.field_15252, 0.1f, 0.5f, false);
            } else {
                class034482.method_45446(class072093, class04909.Il, class04911.field_15252, 0.2f, 1.0f, false);
            }
        }
    }

    private void y(class01407 class014072, class06889 class068892, class06966 class069662) {
        class07311 class073112;
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        List var6 = class069662.N;
        if (!this.N(var6)) {
            class073112 = class06851.R((class01894)L, (boolean)class06202.C());
            this.N(class014072.method_73477(class073112), class069662.N, class068892, 1.0f, class069662.u, class069662.L);
        }
        if (!this.N(var6 = class069662.y)) {
            class073112 = class06851.R((class01894)u, (boolean)class06202.C());
            this.N(class014072.method_73477(class073112), class069662.y, class068892, 0.8f, class069662.u, class069662.L);
        }
    }

    private class02455 y(class06069 class060692, int n, int n2, int n3, int n4, int n5, int n6, float f) {
        float f2 = (float)n + f;
        float f3 = (float)(class060692.U() + (double)(f2 * 0.01f * (float)class060692.E()));
        float f4 = (float)(class060692.U() + (double)(f2 * (float)class060692.E() * 0.001f));
        float f5 = -((float)(n & 0x1FF) + f) / 512.0f;
        int n7 = class03042.N((int)((class03042.N((int)n6) * 3 + 15) / 4), (int)((class03042.y((int)n6) * 3 + 15) / 4));
        return new class02455(n2, n5, n3, n4, f3, f5 + f4, n7);
    }

    public void N(class01407 class014072, class06889 class068892, class06966 class069662) {
        this.N(class014072, class068892, class069662, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_4597, net.minecraft.class_243, net.minecraft.class_12077]");
            Object[] objectArray2 = objectArray;
            this.y((class01407)objectArray[0], (class06889)objectArray2[1], (class06966)objectArray2[2]);
            return null;
        });
    }

    private void N(class07299 class072992, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        if (CPEAdditions.isSnowing()) {
            callbackInfoReturnable.setReturnValue((Object)class00801.field_9383);
        }
    }

    private boolean N(List list) {
        if (CPEAdditions.isSnowing()) {
            return false;
        }
        return list.isEmpty();
    }

    private void N(CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().detailSettings.rainSnow) {
            callbackInfo.cancel();
        }
    }

    public void N(class07299 class072992, int n, float f, class06889 class068892, class06966 class069662) {
        class069662.L = class072992.method_8430(f);
        if (class069662.L <= 0.0f) {
            return;
        }
        class069662.u = (Integer)((class05630)class06202.Nq().i_7).W().method_41753();
        int n2 = class04995.N((double)class068892.M);
        int n3 = class04995.N((double)class068892.B);
        int n4 = class04995.N((double)class068892.Z);
        class07218 class072182 = new class07218();
        class06069 class060692 = class06069.u();
        for (int i = n4 - class069662.u; i <= n4 + class069662.u; ++i) {
            for (int j = n2 - class069662.u; j <= n2 + class069662.u; ++j) {
                class00801 class008012;
                int n5 = class072992.method_8624(class07830.field_13197, j, i);
                int n6 = Math.max(n3 - class069662.u, n5);
                int n7 = Math.max(n3 + class069662.u, n5);
                if (n7 - n6 == 0 || (class008012 = this.N(class072992, (class07209)class072182.N(j, n3, i))) == class00801.field_9384) continue;
                int n8 = j * j * 3121 + j * 45238971 ^ i * i * 418711 + i * 13761;
                class060692.N((long)n8);
                int n9 = Math.max(n3, n5);
                int n10 = class03063.N((class07295)class072992, (class07209)class072182.N(j, n9, i));
                if (class008012 == class00801.field_9382) {
                    class069662.N.add(this.N(class060692, n, j, n6, n7, i, n10, f));
                    continue;
                }
                if (class008012 != class00801.field_9383) continue;
                class069662.y.add(this.y(class060692, n, j, n6, n7, i, n10, f));
            }
        }
    }

    private void N(class01407 class014072, class06889 class068892, class06966 class069662, Operation operation) {
        if (Iris.getPipelineManager().getPipeline().map(WorldRenderingPipeline::shouldRenderWeather).orElse(true).booleanValue()) {
            operation.call(new Object[]{class014072, class068892, class069662});
        }
    }

    private void N(class01391 class013912, List<class02455> list, class06889 class068892, float f, int n, float f2) {
        float f3 = n * n;
        for (class02455 class024552 : list) {
            float f4 = (float)((double)class024552.N() + 0.5 - class068892.M);
            float f5 = (float)((double)class024552.y() + 0.5 - class068892.Z);
            int n2 = class02566.y((float)(class04995.B((float)Math.min((float)class04995.i((double)f4, (double)f5) / f3, 1.0f), (float)f, (float)0.5f) * f2));
            int n3 = (class024552.y() - class04995.N((double)class068892.Z) + 16) * 32 + class024552.N() - class04995.N((double)class068892.M) + 16;
            float f6 = this.B[n3] / 2.0f;
            float f7 = this.Z[n3] / 2.0f;
            float f8 = f4 - f6;
            float f9 = f4 + f6;
            float f10 = (float)((double)class024552.u() - class068892.B);
            float f11 = (float)((double)class024552.L() - class068892.B);
            float f12 = f5 - f7;
            float f13 = f5 + f7;
            float f14 = class024552.i() + 0.0f;
            float f15 = class024552.i() + 1.0f;
            float f16 = (float)class024552.L() * 0.25f + class024552.R();
            float f17 = (float)class024552.u() * 0.25f + class024552.R();
            class013912.method_22912(f8, f10, f12).method_22913(f14, f16).method_39415(n2).method_60803(class024552.M());
            class013912.method_22912(f9, f10, f13).method_22913(f15, f16).method_39415(n2).method_60803(class024552.M());
            class013912.method_22912(f9, f11, f13).method_22913(f15, f17).method_39415(n2).method_60803(class024552.M());
            class013912.method_22912(f8, f11, f12).method_22913(f14, f17).method_39415(n2).method_60803(class024552.M());
        }
    }

    public void N(class03448 class034482, class05363 class053632, int n, class01315 class013152, int n2) {
        this.N(class034482, class053632, n, class013152, n2, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)5, (String)"[net.minecraft.class_638, net.minecraft.class_4184, int, net.minecraft.class_4066, int]");
            Object[] objectArray2 = objectArray;
            this.y((class03448)objectArray[0], (class05363)objectArray2[1], (Integer)objectArray2[2], (class01315)objectArray2[3], (Integer)objectArray2[4]);
            return null;
        });
    }

    private class00801 N(class07299 class072992, class07209 class072092) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class072992, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00801)callbackInfoReturnable.getReturnValue();
        }
        if (!class072992.method_8398().L(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()))) {
            return class00801.field_9384;
        }
        return ((class00780)class072992.i(class072092).N()).N(class072092, class072992.method_8615());
    }

    private class02455 N(class06069 class060692, int n, int n2, int n3, int n4, int n5, int n6, float f) {
        int n7 = n & 0x1FFFF;
        int n8 = n2 * n2 * 3121 + n2 * 45238971 + n5 * n5 * 418711 + n5 * 13761 & 0xFF;
        float f2 = 3.0f + class060692.z();
        float f3 = -((float)(n7 + n8) + f) / 32.0f * f2 % 32.0f;
        return new class02455(n2, n5, n3, n4, 0.0f, f3, n6);
    }

    private void N(class03448 class034482, class05363 class053632, int n, class01315 class013152, int n2, Operation operation) {
        if (!Iris.getPipelineManager().getPipeline().map(WorldRenderingPipeline::shouldRenderWeatherParticles).orElse(true).booleanValue()) {
            operation.call(new Object[]{class034482, class053632, n, class01315.field_18199, n2});
        } else {
            operation.call(new Object[]{class034482, class053632, n, class013152, n2});
        }
    }

    public void N(class03448 class034482, class05363 class053632, int n, class01315 class013152, int n2, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().particleSettings.particles || !SodiumExtraClientMod.options().particleSettings.rainSplash) {
            callbackInfo.cancel();
        }
    }
}

