/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class00243
 *  minecraft.class00322
 *  minecraft.class01327
 *  minecraft.class01495
 *  minecraft.class01532
 *  minecraft.class01698
 *  minecraft.class01710
 *  minecraft.class01718
 *  minecraft.class01732
 *  minecraft.class01749
 *  minecraft.class01764
 *  minecraft.class01771
 *  minecraft.class01783
 *  minecraft.class01791
 *  minecraft.class01792
 *  minecraft.class01793
 *  minecraft.class01914
 *  minecraft.class01925
 *  minecraft.class01954
 *  minecraft.class01971
 *  minecraft.class01983
 *  minecraft.class02000
 *  minecraft.class02156
 *  minecraft.class02175
 *  minecraft.class02180
 *  minecraft.class02186
 *  minecraft.class02189
 *  minecraft.class02279
 *  minecraft.class02288
 *  minecraft.class02294
 *  minecraft.class02295
 *  minecraft.class02307
 *  minecraft.class02322
 *  minecraft.class02323
 *  minecraft.class02337
 *  minecraft.class02354
 *  minecraft.class02475
 *  minecraft.class02492
 *  minecraft.class02498
 *  minecraft.class02534
 *  minecraft.class02618
 *  minecraft.class02619
 *  minecraft.class02622
 *  minecraft.class02624
 *  minecraft.class02628
 *  minecraft.class02629
 *  minecraft.class02630
 *  minecraft.class02631
 *  minecraft.class02634
 *  minecraft.class02639
 *  minecraft.class02642
 *  minecraft.class02644
 *  minecraft.class02647
 *  minecraft.class02650
 *  minecraft.class02652
 *  minecraft.class02653
 *  minecraft.class02654
 *  minecraft.class02660
 *  minecraft.class02662
 *  minecraft.class02663
 *  minecraft.class02693
 *  minecraft.class02707
 *  minecraft.class02714
 *  minecraft.class02776
 *  minecraft.class02782
 *  minecraft.class02786
 *  minecraft.class02792
 *  minecraft.class02814
 *  minecraft.class02823
 *  minecraft.class02838
 *  minecraft.class02856
 *  minecraft.class02878
 *  minecraft.class02881
 *  minecraft.class02889
 *  minecraft.class02893
 *  minecraft.class02905
 *  minecraft.class02914
 *  minecraft.class02942
 *  minecraft.class02949
 *  minecraft.class03100
 *  minecraft.class03118
 *  minecraft.class03122
 *  minecraft.class03127
 *  minecraft.class03134
 *  minecraft.class03595
 *  minecraft.class03637
 *  minecraft.class03715
 *  minecraft.class03720
 *  minecraft.class03721
 *  minecraft.class03738
 *  minecraft.class03742
 *  minecraft.class03746
 *  minecraft.class03817
 *  minecraft.class03833
 *  minecraft.class03838
 *  minecraft.class03840
 *  minecraft.class03842
 *  minecraft.class04013
 *  minecraft.class04206
 *  minecraft.class04208
 *  minecraft.class04253
 *  minecraft.class04267
 *  minecraft.class04277
 *  minecraft.class04287
 *  minecraft.class04292
 *  minecraft.class04388
 *  minecraft.class04486
 *  minecraft.class04507
 *  minecraft.class04511
 *  minecraft.class04647
 *  minecraft.class04832
 *  minecraft.class05307
 *  minecraft.class05309
 *  minecraft.class05504
 *  minecraft.class05546
 *  minecraft.class05570
 *  minecraft.class06158
 *  minecraft.class06232
 *  minecraft.class06600
 *  minecraft.class06746
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07568
 *  minecraft.class07572
 *  minecraft.class07578
 *  minecraft.class08111
 *  minecraft.class08287
 *  minecraft.class08645
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback
 *  net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback$RegistrationHelper
 *  net.fabricmc.fabric.impl.client.rendering.EntityRendererRegistryImpl
 *  net.fabricmc.fabric.impl.client.rendering.RegistrationHelperImpl
 *  net.fabricmc.fabric.mixin.client.rendering.LivingEntityRendererAccessor
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import minecraft.class00243;
import minecraft.class00322;
import minecraft.class01327;
import minecraft.class01495;
import minecraft.class01532;
import minecraft.class01698;
import minecraft.class01710;
import minecraft.class01718;
import minecraft.class01732;
import minecraft.class01749;
import minecraft.class01764;
import minecraft.class01771;
import minecraft.class01783;
import minecraft.class01791;
import minecraft.class01792;
import minecraft.class01793;
import minecraft.class01914;
import minecraft.class01925;
import minecraft.class01954;
import minecraft.class01971;
import minecraft.class01983;
import minecraft.class02000;
import minecraft.class02156;
import minecraft.class02175;
import minecraft.class02180;
import minecraft.class02186;
import minecraft.class02189;
import minecraft.class02279;
import minecraft.class02288;
import minecraft.class02294;
import minecraft.class02295;
import minecraft.class02307;
import minecraft.class02322;
import minecraft.class02323;
import minecraft.class02337;
import minecraft.class02354;
import minecraft.class02475;
import minecraft.class02492;
import minecraft.class02498;
import minecraft.class02534;
import minecraft.class02618;
import minecraft.class02619;
import minecraft.class02622;
import minecraft.class02624;
import minecraft.class02628;
import minecraft.class02629;
import minecraft.class02630;
import minecraft.class02631;
import minecraft.class02634;
import minecraft.class02639;
import minecraft.class02642;
import minecraft.class02644;
import minecraft.class02647;
import minecraft.class02650;
import minecraft.class02652;
import minecraft.class02653;
import minecraft.class02654;
import minecraft.class02660;
import minecraft.class02662;
import minecraft.class02663;
import minecraft.class02693;
import minecraft.class02707;
import minecraft.class02714;
import minecraft.class02776;
import minecraft.class02782;
import minecraft.class02786;
import minecraft.class02792;
import minecraft.class02814;
import minecraft.class02823;
import minecraft.class02838;
import minecraft.class02856;
import minecraft.class02878;
import minecraft.class02881;
import minecraft.class02889;
import minecraft.class02893;
import minecraft.class02905;
import minecraft.class02914;
import minecraft.class02942;
import minecraft.class02949;
import minecraft.class03100;
import minecraft.class03118;
import minecraft.class03122;
import minecraft.class03127;
import minecraft.class03134;
import minecraft.class03595;
import minecraft.class03637;
import minecraft.class03715;
import minecraft.class03720;
import minecraft.class03721;
import minecraft.class03738;
import minecraft.class03742;
import minecraft.class03746;
import minecraft.class03817;
import minecraft.class03833;
import minecraft.class03838;
import minecraft.class03840;
import minecraft.class03842;
import minecraft.class04013;
import minecraft.class04206;
import minecraft.class04208;
import minecraft.class04253;
import minecraft.class04267;
import minecraft.class04277;
import minecraft.class04287;
import minecraft.class04292;
import minecraft.class04388;
import minecraft.class04486;
import minecraft.class04507;
import minecraft.class04511;
import minecraft.class04647;
import minecraft.class04802;
import minecraft.class04804;
import minecraft.class04832;
import minecraft.class05307;
import minecraft.class05309;
import minecraft.class05504;
import minecraft.class05546;
import minecraft.class05570;
import minecraft.class06158;
import minecraft.class06232;
import minecraft.class06600;
import minecraft.class06746;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07568;
import minecraft.class07572;
import minecraft.class07578;
import minecraft.class08111;
import minecraft.class08287;
import minecraft.class08645;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.fabricmc.fabric.impl.client.rendering.EntityRendererRegistryImpl;
import net.fabricmc.fabric.impl.client.rendering.RegistrationHelperImpl;
import net.fabricmc.fabric.mixin.client.rendering.LivingEntityRendererAccessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class04808 {
    private static Logger N = LoggerFactory.getLogger((String)"minecraft.class04808");
    private static final Map<class07078<?>, class04804<?>> y = new Object2ObjectOpenHashMap();

    static {
        class04808.N(class07078.L, class048322 -> new class03746(class048322, class04802.N));
        class04808.N(class07078.u, class048322 -> new class03746(class048322, class04802.y));
        class04808.N(class07078.i, class03637::new);
        class04808.N(class07078.R, class01698::new);
        class04808.N(class07078.M, class04292::new);
        class04808.N(class07078.B, class03720::new);
        class04808.N(class07078.Z, class02654::new);
        class04808.N(class07078.z, class05570::new);
        class04808.N(class07078.U, class048322 -> new class00243(class048322, class04802.W));
        class04808.N(class07078.E, class048322 -> new class00243(class048322, class04802.m));
        class04808.N(class07078.W, class03721::new);
        class04808.N(class07078.m, class05504::new);
        class04808.N(class07078.P, class048322 -> new class03746(class048322, class04802.w));
        class04808.N(class07078.s, class048322 -> new class03746(class048322, class04802.k));
        class04808.N(class07078.T, class03742::new);
        class04808.N(class07078.b, class01983::new);
        class04808.N(class07078.j, class02823::new);
        class04808.N(class07078.v, class01793::new);
        class04808.N(class07078.n, class01771::new);
        class04808.N(class07078.t, class02000::new);
        class04808.N(class07078.G, class07578::new);
        class04808.N(class07078.l, class02838::new);
        class04808.N(class07078.d, class03715::new);
        class04808.N(class07078.w, class048322 -> new class03746(class048322, class04802.S));
        class04808.N(class07078.k, class048322 -> new class03746(class048322, class04802.x));
        class04808.N(class07078.Y, class048322 -> new class02776(class048322, class04802.h));
        class04808.N(class07078.Q, class03738::new);
        class04808.N(class07078.O, class01749::new);
        class04808.N(class07078.I, class048322 -> new class02776(class048322, class04802.NZ));
        class04808.N(class07078.g, class08111::new);
        class04808.N(class07078.J, class01732::new);
        class04808.N(class07078.o, class00322::new);
        class04808.N(class07078.q, class01718::new);
        class04808.N(class07078.K, class048322 -> new class03746(class048322, class04802.Nk));
        class04808.N(class07078.V, class048322 -> new class03746(class048322, class04802.NY));
        class04808.N(class07078.e, class01710::new);
        class04808.N(class07078.H, class048322 -> new class02786(class048322, class02782.field_56095));
        class04808.N(class07078.c, class03134::new);
        class04808.N(class07078.X, class03122::new);
        class04808.N(class07078.a, class02662::new);
        class04808.N(class07078.p, class03118::new);
        class04808.N(class07078.F, class03100::new);
        class04808.N(class07078.A, class04486::new);
        class04808.N(class07078.f, class04511::new);
        class04808.N(class07078.C, class02662::new);
        class04808.N(class07078.S, class03127::new);
        class04808.N(class07078.x, class01783::new);
        class04808.N(class07078.D, class01792::new);
        class04808.N(class07078.h, class02662::new);
        class04808.N(class07078.r, class01764::new);
        class04808.N(class07078.NN, class048322 -> new class02662(class048322, 1.0f, true));
        class04808.N(class07078.Ny, class01791::new);
        class04808.N(class07078.NL, class048322 -> new class02662(class048322, 3.0f, true));
        class04808.N(class07078.Nu, class03833::new);
        class04808.N(class07078.LL, class03817::new);
        class04808.N(class07078.Ni, class01327::new);
        class04808.N(class07078.NR, class01925::new);
        class04808.N(class07078.NM, class048322 -> new class02776(class048322, class04802.yR));
        class04808.N(class07078.NB, class03838::new);
        class04808.N(class07078.NZ, class08645::new);
        class04808.N(class07078.Nz, class048322 -> new class03842(class048322, 6.0f));
        class04808.N(class07078.NU, class02878::new);
        class04808.N(class07078.NE, class048322 -> new class05546(class048322, new class04388(class048322.N(class04802.yz)), new class04388(class048322.N(class04802.yU))));
        class04808.N(class07078.NW, class02156::new);
        class04808.N(class07078.Nm, class03840::new);
        class04808.N(class07078.NP, class01495::new);
        class04808.N(class07078.Ns, class048322 -> new class02776(class048322, class04802.yG));
        class04808.N(class07078.NT, class04287::new);
        class04808.N(class07078.Nb, class04267::new);
        class04808.N(class07078.Nj, class02889::new);
        class04808.N(class07078.Nv, class01698::new);
        class04808.N(class07078.Nn, class04277::new);
        class04808.N(class07078.Nt, class02893::new);
        class04808.N(class07078.NG, class01971::new);
        class04808.N(class07078.Nl, class02878::new);
        class04808.N(class07078.Nd, class048322 -> new class03746(class048322, class04802.yK));
        class04808.N(class07078.Nw, class048322 -> new class03746(class048322, class04802.yV));
        class04808.N(class07078.Nk, class02279::new);
        class04808.N(class07078.NY, class02307::new);
        class04808.N(class07078.yi, class02662::new);
        class04808.N(class07078.NQ, class048322 -> new class02295(class048322, class04802.yH, class04802.yc));
        class04808.N(class07078.NO, class02288::new);
        class04808.N(class07078.Ng, class02881::new);
        class04808.N(class07078.NI, class048322 -> new class03746(class048322, class04802.yA));
        class04808.N(class07078.NJ, class048322 -> new class03746(class048322, class04802.yf));
        class04808.N(class07078.Nq, class01698::new);
        class04808.N(class07078.NK, class048322 -> new class02776(class048322, class04802.yC));
        class04808.N(class07078.NV, class02856::new);
        class04808.N(class07078.Ne, class048322 -> new class02786(class048322, class02782.field_56096));
        class04808.N(class07078.NH, class06746::new);
        class04808.N(class07078.Nc, class048322 -> new class03746(class048322, class04802.LR));
        class04808.N(class07078.NX, class048322 -> new class03746(class048322, class04802.LM));
        class04808.N(class07078.Na, class04647::new);
        class04808.N(class07078.Np, class02630::new);
        class04808.N(class07078.NF, class02814::new);
        class04808.N(class07078.NA, class048322 -> new class03746(class048322, class04802.Lz));
        class04808.N(class07078.Nf, class048322 -> new class03746(class048322, class04802.LU));
        class04808.N(class07078.NC, class02707::new);
        class04808.N(class07078.NS, class07568::new);
        class04808.N(class07078.Nx, class02714::new);
        class04808.N(class07078.ND, class02492::new);
        class04808.N(class07078.Nh, class02693::new);
        class04808.N(class07078.Nr, class048322 -> new class01532(class048322, class04802.Lv, class04802.Ln, class04802.Lw, class04802.Lt));
        class04808.N(class07078.yN, class048322 -> new class01532(class048322, class04802.LG, class04802.LG, class04802.Ll, class04802.Ll));
        class04808.N(class07078.yy, class02475::new);
        class04808.N(class07078.yL, class02323::new);
        class04808.N(class07078.yR, class02498::new);
        class04808.N(class07078.yM, class02354::new);
        class04808.N(class07078.yB, class04253::new);
        class04808.N(class07078.yZ, class02322::new);
        class04808.N(class07078.yz, class02186::new);
        class04808.N(class07078.yU, class02189::new);
        class04808.N(class07078.yE, class02337::new);
        class04808.N(class07078.yW, class02175::new);
        class04808.N(class07078.ym, class02628::new);
        class04808.N(class07078.yP, class048322 -> new class02631(class048322, class02629.field_56104));
        class04808.N(class07078.ys, class02180::new);
        class04808.N(class07078.yT, class048322 -> new class02662(class048322, 0.75f, true));
        class04808.N(class07078.yb, class03595::new);
        class04808.N(class07078.yj, class02662::new);
        class04808.N(class07078.yv, class02653::new);
        class04808.N(class07078.yn, class048322 -> new class02776(class048322, class04802.un));
        class04808.N(class07078.yt, class02619::new);
        class04808.N(class07078.yG, class02634::new);
        class04808.N(class07078.yu, class02662::new);
        class04808.N(class07078.yl, class048322 -> new class03746(class048322, class04802.uG));
        class04808.N(class07078.yd, class048322 -> new class03746(class048322, class04802.ul));
        class04808.N(class07078.yw, class048322 -> new class02650(class048322, new class04388(class048322.N(class04802.ud)), new class04388(class048322.N(class04802.uw))));
        class04808.N(class07078.yk, class02642::new);
        class04808.N(class07078.yY, class05309::new);
        class04808.N(class07078.yQ, class01914::new);
        class04808.N(class07078.yO, class01954::new);
        class04808.N(class07078.yg, class02622::new);
        class04808.N(class07078.yI, class02652::new);
        class04808.N(class07078.yJ, class048322 -> new class02295(class048322, class04802.uK, class04802.uV));
        class04808.N(class07078.yo, class02660::new);
        class04808.N(class07078.yq, class02663::new);
        class04808.N(class07078.yK, class02644::new);
        class04808.N(class07078.yV, class02639::new);
        class04808.N(class07078.ye, class02624::new);
        class04808.N(class07078.yH, class02647::new);
        class04808.N(class07078.yc, class06158::new);
        class04808.N(class07078.yX, class04013::new);
        class04808.N(class07078.ya, class01771::new);
        class04808.N(class07078.yp, class02914::new);
        class04808.N(class07078.yF, class02618::new);
        class04808.N(class07078.yA, class02949::new);
        class04808.N(class07078.yf, class02905::new);
        class04808.N(class07078.yC, class02942::new);
        class04808.N(class07078.yS, class05307::new);
        class04808.N(class07078.yx, class06232::new);
        class04808.N(class07078.yD, class048322 -> new class02631(class048322, class02629.field_56105));
        class04808.N(class07078.yh, class07572::new);
        class04808.N(class07078.yr, class02534::new);
        class04808.N(class07078.LN, class048322 -> new class02792(class048322, class04802.ie, class04802.iH, class04802.iX, class04802.ic));
    }

    public static <T extends class06600> Map<class04208, class08287<T>> y(class04832 class048322) {
        try {
            boolean bl = false;
            class04832 class048323 = class048322;
            class08287 class082872 = class04808.N(class048323, bl, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_5617$class_5618, boolean]");
                return new class08287((class04832)objectArray[0], ((Boolean)objectArray[1]).booleanValue());
            });
            bl = true;
            class048323 = class048322;
            return Map.of(class04208.field_41123, class082872, class04208.field_41122, class04808.N(class048323, bl, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_5617$class_5618, boolean]");
                return new class08287((class04832)objectArray[0], ((Boolean)objectArray[1]).booleanValue());
            }));
        }
        catch (Exception exception) {
            throw new IllegalArgumentException("Failed to create avatar models", exception);
        }
    }

    public static Map<class07078<?>, class04507<?, ?>> N(class04832 class048322) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        y.forEach((class070782, class048042) -> {
            try {
                builder.put(class070782, (Object)class04808.N(class048042, class048322, builder, class048322, class070782));
            }
            catch (Exception exception) {
                throw new IllegalArgumentException("Failed to create model for " + String.valueOf(class04206.M.y(class070782)), exception);
            }
        });
        return builder.build();
    }

    private static class08287 N(class04832 class048322, boolean bl, Operation operation) {
        class08287 class082872 = (class08287)operation.call(new Object[]{class048322, bl});
        LivingEntityRendererAccessor livingEntityRendererAccessor = (LivingEntityRendererAccessor)class082872;
        ((LivingEntityFeatureRendererRegistrationCallback)LivingEntityFeatureRendererRegistrationCallback.EVENT.invoker()).registerRenderers(class07078.Ly, (class02294)class082872, (LivingEntityFeatureRendererRegistrationCallback.RegistrationHelper)new RegistrationHelperImpl(arg_0 -> ((LivingEntityRendererAccessor)livingEntityRendererAccessor).callAddFeature(arg_0)), class048322);
        return class082872;
    }

    public static <T extends class07049> void N(class07078<? extends T> class070782, class04804<T> class048042) {
        y.put(class070782, class048042);
    }

    private static void N(CallbackInfo callbackInfo) {
        EntityRendererRegistryImpl.setup((class070782, class048042) -> y.put((class07078<?>)class070782, (class04804<?>)class048042));
    }

    private static class04507 N(class04804 class048042, class04832 class048322, ImmutableMap.Builder builder, class04832 class048323, class07078 class070782) {
        class04507 class045072 = class048042.create(class048322);
        if (class045072 instanceof class02294) {
            LivingEntityRendererAccessor livingEntityRendererAccessor = (LivingEntityRendererAccessor)class045072;
            ((LivingEntityFeatureRendererRegistrationCallback)LivingEntityFeatureRendererRegistrationCallback.EVENT.invoker()).registerRenderers(class070782, (class02294)class045072, (LivingEntityFeatureRendererRegistrationCallback.RegistrationHelper)new RegistrationHelperImpl(arg_0 -> ((LivingEntityRendererAccessor)livingEntityRendererAccessor).callAddFeature(arg_0)), class048322);
        }
        return class045072;
    }

    public static boolean N() {
        boolean bl = true;
        for (class07078 class070782 : class04206.M) {
            if (class070782 == class07078.Ly || class070782 == class07078.No || y.containsKey(class070782)) continue;
            N.warn("No renderer registered for {}", (Object)class04206.M.y((Object)class070782));
            bl = false;
        }
        return !bl;
    }
}

