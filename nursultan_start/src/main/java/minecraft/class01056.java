/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09338
 *  Nursultan.class09434
 *  Nursultan.class10956
 *  Nursultan.class10979
 *  Nursultan.class10994
 *  Nursultan.class10995
 *  Nursultan.class11938
 *  com.armorhud.armor.ArmorAccessor
 *  com.armorhud.armorHud
 *  com.armorhud.config.config
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Ordering
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalBooleanRefImpl
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class00518
 *  minecraft.class00869
 *  minecraft.class01231
 *  minecraft.class01307
 *  minecraft.class01590
 *  minecraft.class01683
 *  minecraft.class01759
 *  minecraft.class01762
 *  minecraft.class01772
 *  minecraft.class01890
 *  minecraft.class01894
 *  minecraft.class01962
 *  minecraft.class02233
 *  minecraft.class02484
 *  minecraft.class02566
 *  minecraft.class03042
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class04682
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05006
 *  minecraft.class05018
 *  minecraft.class05087
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05298
 *  minecraft.class05455
 *  minecraft.class05630
 *  minecraft.class05731
 *  minecraft.class05808
 *  minecraft.class05850
 *  minecraft.class05936
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06134
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06220
 *  minecraft.class06237
 *  minecraft.class06451
 *  minecraft.class06455
 *  minecraft.class06463
 *  minecraft.class06541
 *  minecraft.class06543
 *  minecraft.class06584
 *  minecraft.class06639
 *  minecraft.class06683
 *  minecraft.class07043
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07070
 *  minecraft.class07084
 *  minecraft.class07085
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07282
 *  minecraft.class07299
 *  minecraft.class07376
 *  minecraft.class07431
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08057
 *  minecraft.class08337
 *  minecraft.class08388
 *  minecraft.class08394
 *  minecraft.class08643
 *  minecraft.class08657
 *  minecraft.class08662
 *  minecraft.class08685
 *  minecraft.class08700
 *  minecraft.class08725
 *  minecraft.class08844
 *  minecraft.class08923
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements
 *  net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl
 *  net.fabricmc.fabric.mixin.client.rendering.GuiAccessor
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.GLDebug
 *  net.irisshaders.iris.gui.screen.HudHideable
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  org.apache.commons.lang3.tuple.Pair
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 *  org.spongepowered.asm.synthetic.args.ArgsN3
 *  page.langeweile.ok_zoomer.config.ConfigEnums$SpyglassModes
 *  page.langeweile.ok_zoomer.config.OkZoomerConfigManager
 *  page.langeweile.ok_zoomer.utils.ZoomUtils
 *  page.langeweile.ok_zoomer.zoom.Zoom
 *  page.langeweile.ok_zoomer.zoom.overlays.ZoomOverlay
 *  squeek.appleskin.client.HUDOverlayHandler
 */
package minecraft;

import Nursultan.class09338;
import Nursultan.class09434;
import Nursultan.class10956;
import Nursultan.class10979;
import Nursultan.class10994;
import Nursultan.class10995;
import Nursultan.class11938;
import com.armorhud.armor.ArmorAccessor;
import com.armorhud.armorHud;
import com.armorhud.config.config;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Ordering;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalBooleanRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00392;
import minecraft.class00502;
import minecraft.class00518;
import minecraft.class00869;
import minecraft.class01048;
import minecraft.class01054;
import minecraft.class01064;
import minecraft.class01069;
import minecraft.class01231;
import minecraft.class01307;
import minecraft.class01590;
import minecraft.class01683;
import minecraft.class01759;
import minecraft.class01762;
import minecraft.class01772;
import minecraft.class01890;
import minecraft.class01894;
import minecraft.class01962;
import minecraft.class02233;
import minecraft.class02484;
import minecraft.class02566;
import minecraft.class03042;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class04682;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05006;
import minecraft.class05018;
import minecraft.class05087;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05298;
import minecraft.class05455;
import minecraft.class05630;
import minecraft.class05731;
import minecraft.class05808;
import minecraft.class05850;
import minecraft.class05936;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06134;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class06237;
import minecraft.class06451;
import minecraft.class06455;
import minecraft.class06463;
import minecraft.class06541;
import minecraft.class06543;
import minecraft.class06584;
import minecraft.class06639;
import minecraft.class06683;
import minecraft.class07043;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07070;
import minecraft.class07084;
import minecraft.class07085;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07282;
import minecraft.class07299;
import minecraft.class07376;
import minecraft.class07431;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08057;
import minecraft.class08337;
import minecraft.class08388;
import minecraft.class08394;
import minecraft.class08643;
import minecraft.class08657;
import minecraft.class08662;
import minecraft.class08685;
import minecraft.class08700;
import minecraft.class08725;
import minecraft.class08844;
import minecraft.class08923;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl;
import net.fabricmc.fabric.mixin.client.rendering.GuiAccessor;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gui.screen.HudHideable;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import org.apache.commons.lang3.tuple.Pair;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.synthetic.args.ArgsN3;
import page.langeweile.ok_zoomer.config.ConfigEnums;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;
import page.langeweile.ok_zoomer.zoom.overlays.ZoomOverlay;
import squeek.appleskin.client.HUDOverlayHandler;

@Environment(value=EnvType.CLIENT)
public class class01056
implements GuiAccessor {
    private static final class01894 R = class01894.y((String)"hud/crosshair");
    private static final class01894 M = class01894.y((String)"hud/crosshair_attack_indicator_full");
    private static final class01894 B = class01894.y((String)"hud/crosshair_attack_indicator_background");
    private static final class01894 Z = class01894.y((String)"hud/crosshair_attack_indicator_progress");
    private static final class01894 z = class01894.y((String)"hud/effect_background_ambient");
    private static final class01894 U = class01894.y((String)"hud/effect_background");
    private static final class01894 E = class01894.y((String)"hud/hotbar");
    private static final class01894 W = class01894.y((String)"hud/hotbar_selection");
    private static final class01894 m = class01894.y((String)"hud/hotbar_offhand_left");
    private static final class01894 P = class01894.y((String)"hud/hotbar_offhand_right");
    private static final class01894 s = class01894.y((String)"hud/hotbar_attack_indicator_background");
    private static final class01894 T = class01894.y((String)"hud/hotbar_attack_indicator_progress");
    private static final class01894 b = class01894.y((String)"hud/armor_empty");
    private static final class01894 j = class01894.y((String)"hud/armor_half");
    private static final class01894 v = class01894.y((String)"hud/armor_full");
    private static final class01894 n = class01894.y((String)"hud/food_empty_hunger");
    private static final class01894 t = class01894.y((String)"hud/food_half_hunger");
    private static final class01894 G = class01894.y((String)"hud/food_full_hunger");
    private static final class01894 l = class01894.y((String)"hud/food_empty");
    private static final class01894 d = class01894.y((String)"hud/food_half");
    private static final class01894 w = class01894.y((String)"hud/food_full");
    private static final class01894 k = class01894.y((String)"hud/air");
    private static final class01894 Y = class01894.y((String)"hud/air_bursting");
    private static final class01894 Q = class01894.y((String)"hud/air_empty");
    private static final class01894 O = class01894.y((String)"hud/heart/vehicle_container");
    private static final class01894 g = class01894.y((String)"hud/heart/vehicle_full");
    private static final class01894 I = class01894.y((String)"hud/heart/vehicle_half");
    private static final class01894 J = class01894.y((String)"textures/misc/vignette.png");
    public static final class01894 N = class01894.y((String)"textures/misc/nausea.png");
    private static final class01894 o = class01894.y((String)"textures/misc/spyglass_scope.png");
    private static final class01894 q = class01894.y((String)"textures/misc/powder_snow_outline.png");
    private static final Comparator<class01772> K = Comparator.comparing(class01772::u).reversed().thenComparing(class01772::L, String.CASE_INSENSITIVE_ORDER);
    private static final class00392 V = class00392.L((String)"demo.demoExpired");
    private static final class00392 e = class00392.L((String)"menu.savingLevel");
    private static final float H = 5.0f;
    private static final int c = 100;
    private static final int X = 10;
    private static final int a = 10;
    private static final String p = ": ";
    private static final float F = 0.2f;
    private static final int A = 9;
    private static final int f = 8;
    private static final int C = 10;
    private static final int S = 9;
    private static final int x = 8;
    private static final int D = 2;
    private static final int h = 1;
    private static final float r = 0.5f;
    private static final float NN = 0.1f;
    private static final float Ny = 1.0f;
    private static final float NL = 0.1f;
    private static final int Nu = 3;
    private static final int Ni = 5;
    private static final float NR = 0.2f;
    private static final int NM = 5;
    private static final int NB = 5;
    private final class06069 NZ = class06069.u();
    private final class06202 Nz;
    private final class06451 NU;
    private int NE;
    private @Nullable class00392 NW;
    private int Nm;
    private boolean NP;
    private boolean Ns;
    public float y = 1.0f;
    private int NT;
    private class06584 Nb = class06584.E;
    private final class06463 Nj;
    private final class05808 Nv;
    private final class04682 Nn;
    private final class05006 Nt;
    private final class06455 NG;
    private int Nl;
    private @Nullable class00392 Nd;
    private @Nullable class00392 Nw;
    private int Nk;
    private int NY;
    private int NQ;
    private int NO;
    private int Ng;
    private long NI;
    private long NJ;
    private int No;
    private @Nullable Runnable Nq;
    private float NK;
    private float NV;
    private Pair<class01069, class08657> Ne = Pair.of((Object)((Object)class01069.field_59819), (Object)class08657.u);
    private final Map<class01069, Supplier<class08657>> NH;
    private float Nc;
    private float NX = 0.0f;
    private float Na = 0.0f;
    int L;
    boolean u;
    static final /* synthetic */ boolean i;
    private static final int Np = 8;

    private void L(class01054 class010542) {
        class08036 class080362 = this.m();
        if (class080362 == null) {
            return;
        }
        int n = class04995.u((float)class080362.method_6032());
        boolean bl = this.NJ > (long)this.NE && (this.NJ - (long)this.NE) / 3L % 2L == 1L;
        long l = class07536.L();
        if (n < this.NO && class080362.field_6008 > 0) {
            this.NI = l;
            this.NJ = this.NE + 20;
        } else if (n > this.NO && class080362.field_6008 > 0) {
            this.NI = l;
            this.NJ = this.NE + 10;
        }
        if (l - this.NI > 1000L) {
            this.Ng = n;
            this.NI = l;
        }
        this.NO = n;
        int n2 = this.Ng;
        this.NZ.N((long)(this.NE * 312871));
        int n3 = class010542.N() / 2 - 91;
        int n4 = class010542.N() / 2 + 91;
        int n5 = this.L(class010542.y()) - 39;
        float f = Math.max((float)class080362.method_45325(class05298.n), (float)Math.max(n2, n));
        int n6 = class04995.u((float)class080362.method_6067());
        int n7 = class04995.u((float)((f + (float)n6) / 2.0f / 10.0f));
        int n8 = Math.max(10 - (n7 - 2), 3);
        int n9 = n5 - 10;
        int n10 = -1;
        if (class080362.method_6059(class07047.z)) {
            n10 = this.NE % class04995.u((float)(f + 5.0f));
        }
        class08700.N().N("armor");
        int n11 = n3;
        int n12 = n8;
        int n13 = n7;
        int n14 = n5;
        Object object = class080362;
        Object object2 = class010542;
        this.N((class01054)object2, (class08036)object, n14, n13, n12, n11, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)6, (String)"[net.minecraft.class_332, net.minecraft.class_1657, int, int, int, int]");
            Object[] objectArray2 = objectArray;
            class01056.N((class01054)objectArray[0], (class08036)objectArray2[1], (Integer)objectArray2[2], (Integer)objectArray2[3], (Integer)objectArray2[4], (Integer)objectArray2[5]);
            return null;
        });
        class08700.N().y("health");
        boolean bl2 = bl;
        int n15 = n6;
        int n16 = n2;
        int n17 = n;
        float f2 = f;
        int n18 = n10;
        n11 = n8;
        n12 = n5;
        n13 = n3;
        class08036 class080363 = class080362;
        object = class010542;
        object2 = this;
        this.N((class01056)object2, (class01054)object, class080363, n13, n12, n11, n18, f2, n17, n16, n15, bl2, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)12, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_1657, int, int, int, int, float, int, int, int, boolean]");
            Object[] objectArray2 = objectArray;
            ((class01056)objectArray[0]).N((class01054)objectArray2[1], (class08036)objectArray2[2], (Integer)objectArray2[3], (Integer)objectArray2[4], (Integer)objectArray2[5], (Integer)objectArray2[6], ((Float)objectArray2[7]).floatValue(), (Integer)objectArray2[8], (Integer)objectArray2[9], (Integer)objectArray2[10], (Boolean)objectArray2[11]);
            return null;
        });
        class07438 class074382 = this.P();
        int n19 = this.N(class074382);
        if (n19 == 0) {
            class08700.N().y("food");
            n12 = n4;
            n13 = n5;
            class080363 = class080362;
            object = class010542;
            object2 = this;
            this.N((class01056)object2, (class01054)object, class080363, n13, n12, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)5, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_1657, int, int]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).N((class01054)objectArray2[1], (class08036)objectArray2[2], (int)((Integer)objectArray2[3]), (Integer)objectArray2[4]);
                return null;
            });
            n9 -= 10;
        }
        class08700.N().y("air");
        n11 = n4;
        n12 = n9;
        n13 = n19;
        class080363 = class080362;
        object = class010542;
        object2 = this;
        this.N((class01056)object2, (class01054)object, class080363, n13, n12, n11, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)6, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_1657, int, int, int]");
            Object[] objectArray2 = objectArray;
            ((class01056)objectArray[0]).N((class01054)objectArray2[1], (class08036)objectArray2[2], (int)((Integer)objectArray2[3]), (int)((Integer)objectArray2[4]), (Integer)objectArray2[5]);
            return null;
        });
        class08700.N().L();
    }

    private void L(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.HOTBAR).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    private boolean L(boolean bl) {
        block3: {
            switch (class09434.N[((ConfigEnums.SpyglassModes)OkZoomerConfigManager.CONFIG.controls.spyglassMode.value()).ordinal()]) {
                case 1: 
                case 2: {
                    break;
                }
                default: {
                    break block3;
                }
            }
            return false;
        }
        return bl;
    }

    private void L(class01054 class010542, class02233 class022332, Operation operation) {
        boolean bl = (Boolean)OkZoomerConfigManager.CONFIG.appearance.persistentInterface.value();
        boolean bl2 = (Boolean)OkZoomerConfigManager.CONFIG.appearance.hideCrosshair.value();
        if (bl || bl2 || !Zoom.isTransitionActive()) {
            operation.call(new Object[]{class010542, class022332});
        } else {
            class010542.i().popMatrix();
            operation.call(new Object[]{class010542, class022332});
            class010542.i().pushMatrix();
            class010542.i().translate(-((float)class010542.N() / this.NX), -((float)class010542.y() / this.NX));
            class010542.i().scale(this.Na, this.Na);
        }
    }

    private void L(class01054 class010542, float f) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class010542, f, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        int n = class010542.N();
        int n2 = class010542.y();
        class010542.i().pushMatrix();
        float f2 = class04995.B((float)f, (float)2.0f, (float)1.0f);
        class010542.i().translate((float)n / 2.0f, (float)n2 / 2.0f);
        class010542.i().scale(f2, f2);
        class010542.i().translate((float)(-n) / 2.0f, (float)(-n2) / 2.0f);
        float f3 = 0.2f * f;
        float f4 = 0.4f * f;
        float f5 = 0.2f * f;
        class010542.N(class08394.NC, N, 0, 0, 0.0f, 0.0f, n, n2, n, n2, class02566.N((float)1.0f, (float)f3, (float)f4, (float)f5));
        class010542.i().popMatrix();
    }

    public boolean L() {
        return this.Ns && this.Nm > 0;
    }

    public void L(class00392 class003922) {
        this.Nd = class003922;
        this.Nl = this.Nk + this.NY + this.NQ;
    }

    private int L(int n) {
        if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
            return n + 7;
        }
        return n;
    }

    private void L(class01054 class010542, class02233 class022332) {
        this.NG.N(class010542);
    }

    private void L(class01054 class010542, class02233 class022332, CallbackInfo callbackInfo) {
        class10995 class109952 = class10995.L();
        class11938.L().L((Object)class109952);
        if (class109952.y()) {
            callbackInfo.cancel();
        }
    }

    private void M(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.DEMO_TIMER).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    public class01590 M() {
        return (class01590)this.Nz.i_3;
    }

    private void M(class01054 class010542, class02233 class022332) {
        if (this.Nd == null || this.Nl <= 0) {
            return;
        }
        class01590 class015902 = this.M();
        class08700.N().N("titleAndSubtitle");
        float f = (float)this.Nl - class022332.N(false);
        int n = 255;
        if (this.Nl > this.NQ + this.NY) {
            float f2 = (float)(this.Nk + this.NY + this.NQ) - f;
            n = (int)(f2 * 255.0f / (float)this.Nk);
        }
        if (this.Nl <= this.NQ) {
            n = (int)(f * 255.0f / (float)this.NQ);
        }
        if ((n = class04995.N((int)n, (int)0, (int)255)) > 0) {
            class010542.L();
            class010542.i().pushMatrix();
            class010542.i().translate((float)(class010542.N() / 2), (float)(class010542.y() / 2));
            class010542.i().pushMatrix();
            class010542.i().scale(4.0f, 4.0f);
            int n2 = class015902.N((class05936)this.Nd);
            int n3 = class02566.Z((int)n);
            class010542.N(class015902, this.Nd, -n2 / 2, -10, n2, n3);
            class010542.i().popMatrix();
            if (this.Nw != null) {
                class010542.i().pushMatrix();
                class010542.i().scale(2.0f, 2.0f);
                int n4 = class015902.N((class05936)this.Nw);
                class010542.N(class015902, this.Nw, -n4 / 2, 5, n4, n3);
                class010542.i().popMatrix();
            }
            class010542.i().popMatrix();
        }
        class08700.N().L();
    }

    private void M(class01054 class010542) {
        int n = class010542.y();
        if (!i && (class04453)this.Nz.T_4 == null) {
            throw new AssertionError();
        }
        this.L = n - (config.DOUBLE_HOTBAR ? 76 : 55);
        if (config.ABOVE_HEALTH_BAR && ((class04453)this.Nz.T_4).method_6063() + ((class04453)this.Nz.T_4).method_52541() < 180.0f) {
            int n2;
            int n3 = 10 * n2 - ((n2 = (int)Math.ceil((((class04453)this.Nz.T_4).method_6063() + ((class04453)this.Nz.T_4).method_52541()) / 20.0f)) > 2 ? (n2 - 2) * (n2 - 1) : 0);
            this.L -= n3;
            if (((class04453)this.Nz.T_4).method_68878()) {
                this.L += 16 + n3;
            } else if (config.DISABLE_ARMOR_BAR) {
                this.L += 10;
            }
        } else {
            if (((class04453)this.Nz.T_4).method_5669() < ((class04453)this.Nz.T_4).method_5748() || ((class04453)this.Nz.T_4).method_5869() && !((class04453)this.Nz.T_4).method_68878()) {
                this.L -= 10;
            }
            this.L += ((class04453)this.Nz.T_4).method_68878() ? 16 : 0;
            if (((class04453)this.Nz.T_4).method_5765() && this.P() != null) {
                this.t();
            }
        }
    }

    private @Nullable class07438 P() {
        class08036 class080362 = this.m();
        if (class080362 != null) {
            class07049 class070492 = class080362.method_5854();
            if (class070492 == null) {
                return null;
            }
            if (class070492 instanceof class07438) {
                return (class07438)class070492;
            }
        }
        return null;
    }

    private void P(class01054 class010542, class02233 class022332) {
        if (!this.Nz.E()) {
            return;
        }
        class08700.N().N("demo");
        class010542.L();
        Object object = ((class03448)this.Nz.T_3).N() >= 120500L ? V : class00392.N((String)"demo.remainingTime", (Object[])new Object[]{class05018.N((int)((int)(120500L - ((class03448)this.Nz.T_3).N())), (float)((class03448)this.Nz.T_3).method_54719().R())});
        int n = this.M().N((class05936)object);
        int n2 = class010542.N() - n - 10;
        int n3 = 5;
        class010542.N(this.M(), (class00392)object, n2, 5, n, -1);
        class08700.N().L();
    }

    private void T() {
        class08337 class083372 = this.Nz.Na();
        boolean bl = class083372 != null && class083372.yk();
        this.NV = this.NK;
        this.NK = class04995.B((float)0.2f, (float)this.NK, (float)(bl ? 1.0f : 0.0f));
    }

    private void T(class01054 class010542, class02233 class022332) {
        this.N(class010542, class022332, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_332, net.minecraft.class_9779]");
            this.s((class01054)objectArray[0], (class02233)objectArray[1]);
            return null;
        });
    }

    public class01056(class06202 class062022) {
        this.Nz = class062022;
        this.Nj = new class06463(class062022);
        this.Nn = new class04682(class062022);
        this.NU = new class06451(class062022);
        this.Nt = new class05006(class062022, this);
        this.NG = new class06455(class062022);
        this.Nv = new class05808(class062022);
        this.NH = ImmutableMap.of((Object)((Object)class01069.field_59819), () -> class08657.u, (Object)((Object)class01069.field_59820), () -> new class08643(class062022), (Object)((Object)class01069.field_59821), () -> new class08685(class062022), (Object)((Object)class01069.field_59822), () -> new class08662(class062022));
        this.N();
    }

    private void B(class01054 class010542, class02233 class022332) {
        if (!this.NU.i()) {
            class08844 class088442 = this.Nz.Nt();
            int n = class04995.N((double)((class06220)this.Nz.L_2).y(class088442));
            int n2 = class04995.N((double)((class06220)this.Nz.L_2).L(class088442));
            class010542.L();
            this.NU.N(class010542, this.M(), this.NE, n, n2, false, false);
        }
    }

    public class04682 B() {
        return this.Nn;
    }

    private void B(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.SCOREBOARD).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    public class05006 Z() {
        return this.Nt;
    }

    private void Z(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.OVERLAY_MESSAGE).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    private void Z(class01054 class010542, class02233 class022332) {
        class01890 class018902;
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.y(class010542, class022332, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class06683 class066832 = ((class03448)this.Nz.T_3).method_8428();
        class00518 class005182 = null;
        class00502 class005022 = class066832.i(((class04453)this.Nz.T_4).method_5820());
        if (class005022 != null && (class018902 = class01890.N((class06541)class005022.P())) != null) {
            class005182 = class066832.N(class018902);
        }
        class00518 class005183 = class018902 = class005182 != null ? class005182 : class066832.N(class01890.field_45157);
        if (class018902 != null) {
            class010542.L();
            this.N(class010542, (class00518)class018902);
        }
    }

    private void i(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.BOSS_BAR).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    public class06451 i() {
        return this.NU;
    }

    private void i(class01054 class010542, class02233 class022332) {
        if (((class04453)this.Nz.T_4).method_7297() <= 0) {
            return;
        }
        class08700.N().N("sleep");
        class010542.L();
        float f = ((class04453)this.Nz.T_4).method_7297();
        float f2 = f / 100.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f - (f - 100.0f) / 10.0f;
        }
        int n = (int)(220.0f * f2) << 24 | 0x101020;
        class010542.N(0, 0, class010542.N(), class010542.y(), n);
        class08700.N().L();
    }

    private void i(class01054 class010542, class02233 class022332, CallbackInfo callbackInfo) {
        SodiumExtraClientMod.onHudRender((class01054)class010542, (class02233)class022332);
    }

    private boolean b() {
        return (Integer)((class04453)this.Nz.T_4).L_5 + 100 > ((class04453)this.Nz.T_4).field_6012;
    }

    private void b(class01054 class010542, class02233 class022332) {
        class05455 class054552 = ((class05630)this.Nz.i_7).NS();
        if (!this.N(class054552, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_5498]");
            return ((class05455)objectArray[0]).N();
        })) {
            return;
        }
        if (((class03443)this.Nz.T_2).U() == class07282.field_9219 && !this.N((class07089)this.Nz.M_3)) {
            return;
        }
        if (!((class05731)this.Nz.L_0).y(class06134.d)) {
            class010542.L();
            int n = 15;
            class010542.N(class08394.Nx, R, (class010542.N() - 15) / 2, (class010542.y() - 15) / 2, 15, 15);
            if (((class05630)this.Nz.i_7).X().method_41753() == class01307.field_18152) {
                float f = ((class04453)this.Nz.T_4).method_7261(0.0f);
                boolean bl = false;
                if ((class07049)this.Nz.M_2 != null && (class07049)this.Nz.M_2 instanceof class07438 && f >= 1.0f) {
                    bl = ((class04453)this.Nz.T_4).method_7279() > 5.0f;
                    bl &= ((class07049)this.Nz.M_2).method_5805();
                    class06543 class065432 = (class06543)((class04453)this.Nz.T_4).method_76694().method_58694(class02484.I);
                    bl &= class065432 == null || class065432.N((class07438)((class04453)this.Nz.T_4), ((class07089)this.Nz.M_3).y());
                }
                int n2 = class010542.y() / 2 - 7 + 16;
                int n3 = class010542.N() / 2 - 8;
                if (bl) {
                    class010542.N(class08394.Nx, M, n3, n2, 16, 16);
                } else if (f < 1.0f) {
                    int n4 = (int)(f * 17.0f);
                    class010542.N(class08394.Nx, B, n3, n2, 16, 4);
                    class010542.N(class08394.Nx, Z, 16, 4, 0, 0, n3, n2, n4, 4);
                }
            }
        }
    }

    private void s(class01054 class010542, class02233 class022332) {
        class01056 class010562;
        class01054 class010543;
        class02233 class022333;
        if ((class05096)this.Nz.v_3 instanceof class05850) {
            return;
        }
        if (!((class05630)this.Nz.i_7).NG) {
            class022333 = class022332;
            class010543 = class010542;
            class010562 = this;
            this.N(class010562, class010543, class022333, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).u((class01054)objectArray2[1], (class02233)objectArray2[2]);
                return null;
            });
            class022333 = class022332;
            class010543 = class010542;
            class010562 = this;
            this.y(class010562, class010543, class022333, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).U((class01054)objectArray2[1], (class02233)objectArray2[2]);
                return null;
            });
            class010542.L();
            this.W(class010542, class022332);
            class022333 = class022332;
            class010543 = class010542;
            class010562 = this;
            this.u(class010562, class010543, class022333, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).E((class01054)objectArray2[1], (class02233)objectArray2[2]);
                return null;
            });
            class022333 = class022332;
            class010543 = class010542;
            class010562 = this;
            this.i(class010562, class010543, class022333, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).L((class01054)objectArray2[1], (class02233)objectArray2[2]);
                return null;
            });
        }
        class022333 = class022332;
        class010543 = class010542;
        class010562 = this;
        this.R(class010562, class010543, class022333, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
            Object[] objectArray2 = objectArray;
            ((class01056)objectArray[0]).i((class01054)objectArray2[1], (class02233)objectArray2[2]);
            return null;
        });
        if (!((class05630)this.Nz.i_7).NG) {
            class022333 = class022332;
            class010543 = class010542;
            class010562 = this;
            this.M(class010562, class010543, class022333, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).P((class01054)objectArray2[1], (class02233)objectArray2[2]);
                return null;
            });
            class022333 = class022332;
            class010543 = class010542;
            class010562 = this;
            this.B(class010562, class010543, class022333, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).Z((class01054)objectArray2[1], (class02233)objectArray2[2]);
                return null;
            });
            class022333 = class022332;
            class010543 = class010542;
            class010562 = this;
            this.Z(class010562, class010543, class022333, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).R((class01054)objectArray2[1], (class02233)objectArray2[2]);
                return null;
            });
            class022333 = class022332;
            class010543 = class010542;
            class010562 = this;
            this.z(class010562, class010543, class022333, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).M((class01054)objectArray2[1], (class02233)objectArray2[2]);
                return null;
            });
            class022333 = class022332;
            class010543 = class010542;
            class010562 = this;
            this.U(class010562, class010543, class022333, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).B((class01054)objectArray2[1], (class02233)objectArray2[2]);
                return null;
            });
            class022333 = class022332;
            class010543 = class010542;
            class010562 = this;
            this.E(class010562, class010543, class022333, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).z((class01054)objectArray2[1], (class02233)objectArray2[2]);
                return null;
            });
            this.N(class010542, (class05096)this.Nz.v_3 == null || ((class05096)this.Nz.v_3).method_73150());
        } else if ((class05096)this.Nz.v_3 != null && ((class05096)this.Nz.v_3).method_73150()) {
            this.N(class010542, true);
        }
        this.N(class010542, class022332, (CallbackInfo)null);
        this.i(class010542, class022332, null);
    }

    private void s() {
        if (this.Nm > 0) {
            --this.Nm;
        }
        if (this.Nl > 0) {
            --this.Nl;
            if (this.Nl <= 0) {
                this.Nd = null;
                this.Nw = null;
            }
        }
        ++this.NE;
        class07049 class070492 = this.Nz.F();
        if (class070492 != null) {
            this.N(class070492);
        }
        if ((class04453)this.Nz.T_4 != null) {
            class06584 class065842 = ((class04453)this.Nz.T_4).method_31548().y();
            if (class065842.R()) {
                this.NT = 0;
            } else if (this.Nb.R() || !class065842.N(this.Nb.B()) || !class065842.d().equals((Object)this.Nb.d())) {
                this.NT = (int)(40.0 * (Double)((class05630)this.Nz.i_7).K().method_41753());
            } else if (this.NT > 0) {
                --this.NT;
            }
            this.Nb = class065842;
        }
        this.NU.N();
    }

    private void m(class01054 class010542, class02233 class022332) {
        float f;
        int n;
        int n2;
        int n3;
        class08036 class080362 = this.m();
        if (class080362 == null) {
            return;
        }
        class06584 class065842 = class080362.method_6079();
        class07070 class070702 = class080362.method_6068().N();
        int n4 = class010542.N() / 2;
        int n5 = 182;
        int n6 = 91;
        class010542.N(class08394.Na, E, n4 - 91, class010542.y() - 22, 182, 22);
        class010542.N(class08394.Na, W, n4 - 91 - 1 + class080362.method_31548().N() * 20, class010542.y() - 22 - 1, 24, 23);
        if (!class065842.R()) {
            if (class070702 == class07070.field_6182) {
                class010542.N(class08394.Na, m, n4 - 91 - 29, class010542.y() - 23, 29, 24);
            } else {
                class010542.N(class08394.Na, P, n4 + 91, class010542.y() - 23, 29, 24);
            }
        }
        int n7 = 1;
        for (n3 = 0; n3 < 9; ++n3) {
            n2 = n4 - 90 + n3 * 20 + 2;
            n = class010542.y() - 16 - 3;
            this.N(class010542, n2, n, class022332, class080362, class080362.method_31548().method_5438(n3), n7++);
        }
        if (!class065842.R()) {
            n3 = class010542.y() - 16 - 3;
            if (class070702 == class07070.field_6182) {
                this.N(class010542, n4 - 91 - 26, n3, class022332, class080362, class065842, n7++);
            } else {
                this.N(class010542, n4 + 91 + 10, n3, class022332, class080362, class065842, n7++);
            }
        }
        if (((class05630)this.Nz.i_7).X().method_41753() == class01307.field_18153 && (f = ((class04453)this.Nz.T_4).method_7261(0.0f)) < 1.0f) {
            n2 = class010542.y() - 20;
            n = n4 + 91 + 6;
            if (class070702 == class07070.field_6183) {
                n = n4 - 91 - 22;
            }
            int n8 = (int)(f * 19.0f);
            class010542.N(class08394.Na, s, n, n2, 18, 18);
            class010542.N(class08394.Na, T, 18, 18, 0, 18 - n8, n, n2 + 18 - n8, 18, n8);
        }
        this.u(class010542, class022332, (CallbackInfo)null);
    }

    private @Nullable class08036 m() {
        class07049 class070492 = this.Nz.F();
        return class070492 instanceof class08036 ? (class08036)class070492 : null;
    }

    private void t() {
        if (!i && (class04453)this.Nz.T_4 == null) {
            throw new AssertionError();
        }
        if (this.P().method_5805()) {
            if (this.P().method_6063() > 21.0f) {
                this.L = config.BETTER_MOUNT_HUD && !((class04453)this.Nz.T_4).method_68878() ? (this.L -= 20) : (this.L -= ((class04453)this.Nz.T_4).method_68878() ? 26 : 10);
            } else if (config.BETTER_MOUNT_HUD && !((class04453)this.Nz.T_4).method_68878()) {
                this.L -= 10;
            } else if (((class04453)this.Nz.T_4).method_68878()) {
                this.L -= 16;
            }
        }
    }

    private class01069 v() {
        boolean bl = ((class01683)((class04453)this.Nz.T_4).y_0).O().N();
        boolean bl2 = ((class04453)this.Nz.T_4).G() != null;
        boolean bl3 = ((class03443)this.Nz.T_2).R();
        if (bl) {
            if (bl2 && this.j()) {
                return class01069.field_59822;
            }
            if (bl3 && this.b()) {
                return class01069.field_59820;
            }
            return class01069.field_59821;
        }
        if (bl2) {
            return class01069.field_59822;
        }
        if (bl3) {
            return class01069.field_59820;
        }
        return class01069.field_59819;
    }

    private boolean j() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return ((class04453)this.Nz.T_4).P() > 0.0f || (Integer)class01962.N((Object)((class04453)this.Nz.T_4).G(), class07431::n, (Object)0) > 0;
    }

    private void j(class01054 class010542, class02233 class022332) {
        this.L(class010542, class022332, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_332, net.minecraft.class_9779]");
            this.b((class01054)objectArray[0], (class02233)objectArray[1]);
            return null;
        });
    }

    private void U(class01054 class010542, class02233 class022332) {
        this.u(class010542, class022332, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_332, net.minecraft.class_9779]");
            this.j((class01054)objectArray[0], (class02233)objectArray[1]);
            return null;
        });
    }

    private void U(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.CHAT).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    public class06455 U() {
        return this.NG;
    }

    private void z(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.TITLE_AND_SUBTITLE).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    public void z() {
        this.Nt.N();
        this.NG.N();
        this.Nz.m().y();
        this.Nj.W();
        this.NU.N(true);
        this.u();
        this.N();
    }

    private void z(class01054 class010542, class02233 class022332) {
        class06683 class066832 = ((class03448)this.Nz.T_3).method_8428();
        class00518 class005182 = class066832.N(class01890.field_45156);
        if (((class05630)this.Nz.i_7).q.R() && (!this.Nz.q() || ((class01683)((class04453)this.Nz.T_4).y_0).B().size() > 1 || class005182 != null)) {
            this.Nt.N(true);
            class010542.L();
            this.Nt.N(class010542, class010542.N(), class066832, class005182);
        } else {
            this.Nt.N(false);
        }
    }

    private void u(class01054 class010542) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class07438 class074382 = this.P();
        if (class074382 == null) {
            return;
        }
        int n = this.N(class074382);
        if (n == 0) {
            return;
        }
        int n2 = (int)Math.ceil(class074382.method_6032());
        class08700.N().y("mountHealth");
        int n3 = class010542.y() - 39;
        int n4 = class010542.N() / 2 + 91;
        int n5 = n3;
        int n6 = 0;
        while (n > 0) {
            int n7 = Math.min(n, 10);
            n -= n7;
            for (int i = 0; i < n7; ++i) {
                int n8 = n4 - i * 8 - 9;
                class010542.N(class08394.Na, O, n8, n5, 9, 9);
                if (i * 2 + 1 + n6 < n2) {
                    class010542.N(class08394.Na, g, n8, n5, 9, 9);
                }
                if (i * 2 + 1 + n6 != n2) continue;
                class010542.N(class08394.Na, I, n8, n5, 9, 9);
            }
            n5 -= 10;
            n6 += 20;
        }
    }

    private int u(int n) {
        if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
            class06202 class062022 = class06202.Nq();
            int n2 = class062022.Nt().P() - n;
            Objects.requireNonNull((class01590)class062022.i_3);
            return n2 - 9;
        }
        return n;
    }

    private void u(class01054 class010542, class02233 class022332, CallbackInfo callbackInfo) {
        if (!config.ARMOR_HUD) {
            return;
        }
        if (!i && (class04453)this.Nz.T_4 == null) {
            throw new AssertionError();
        }
        if (!this.u) {
            armorHud.getArmorAccessor().initialize((class04453)this.Nz.T_4);
            this.u = true;
        }
        this.R(class010542);
        this.M(class010542);
    }

    private void u(class01054 class010542, class02233 class022332, Operation operation) {
        if (((Boolean)OkZoomerConfigManager.CONFIG.appearance.hideCrosshair.value()).booleanValue()) {
            ZoomUtils.setFadeModifier((Float)Float.valueOf(1.0f - Zoom.getTransitionMode().getFade(class06202.Nq().NK().N(true))));
            operation.call(new Object[]{class010542, class022332});
            ZoomUtils.setFadeModifier(null);
        } else {
            operation.call(new Object[]{class010542, class022332});
        }
    }

    private void u(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.STATUS_EFFECTS).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    private void u(class01054 class010542, class02233 class022332) {
        float f;
        LocalBooleanRefImpl localBooleanRefImpl = new LocalBooleanRefImpl();
        localBooleanRefImpl.init(false);
        if (((Boolean)((class05630)this.Nz.i_7).P().method_41753()).booleanValue()) {
            this.N(class010542, this.Nz.F());
        }
        class04453 class044532 = (class04453)this.Nz.T_4;
        this.N(class010542, class022332, null, (LocalBooleanRef)localBooleanRefImpl);
        float f2 = class022332.N();
        this.Nc = class04995.B((float)(0.5f * f2), (float)this.Nc, (float)1.125f);
        if (this.N(((class05630)this.Nz.i_7).NS().N(), (LocalBooleanRef)localBooleanRefImpl)) {
            if (this.L(class044532.method_31550())) {
                this.N(class010542, this.Nc);
            } else {
                this.Nc = 0.5f;
                for (class07085 class070852 : class07085.values()) {
                    class06584 class065842 = class044532.method_6118(class070852);
                    class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
                    if (class087252 == null || class087252.y() != class070852 || !class087252.i().isPresent()) continue;
                    this.N(class010542, ((class01894)class087252.i().get()).N(string -> "textures/" + string + ".png"), 1.0f);
                }
            }
        }
        if (class044532.method_32312() > 0) {
            this.N(class010542, q, class044532.method_32313());
        }
        float f3 = class022332.N(false);
        float f4 = class04995.B((float)f3, (float)((Float)class044532.i_0).floatValue(), (float)((Float)class044532.B_3).floatValue());
        float f5 = class044532.method_66279(class07047.Z, f3);
        if (f4 > 0.0f) {
            this.y(class010542, f4);
        } else if (f5 > 0.0f && (f = ((Double)((class05630)this.Nz.i_7).NY().method_41753()).floatValue()) < 1.0f) {
            float f6 = f5 * (1.0f - f);
            this.L(class010542, f6);
        }
    }

    public void u() {
        this.Nd = null;
        this.Nw = null;
        this.Nl = 0;
    }

    private void y(class04682 class046822, class01054 class010542, Operation operation, LocalRef localRef) {
        this.y(class046822, class010542, operation, (class02233)localRef.get());
    }

    private void y(class01056 class010562, class01054 class010542, Operation operation, LocalRef localRef) {
        this.y(class010562, class010542, operation, (class02233)localRef.get());
    }

    public void y(boolean bl) {
        this.Ns = bl;
    }

    private void y(class01054 class010542) {
        class08700.N().N("selectedItemName");
        if (this.NT > 0 && !this.Nb.R()) {
            int n;
            class05216 class052162 = class00392.i().y(this.Nb.d()).N(this.Nb.O().N());
            if (this.Nb.L(class02484.B)) {
                class052162.N(class06541.field_1056);
            }
            int n2 = this.M().N((class05936)class052162);
            int n3 = (class010542.N() - n2) / 2;
            int n4 = class010542.y() - 59;
            n4 = this.N(n4, class010542);
            if (!((class03443)this.Nz.T_2).y()) {
                n4 += 14;
            }
            if ((n = (int)((float)this.NT * 256.0f / 10.0f)) > 255) {
                n = 255;
            }
            if (n > 0) {
                class010542.N(this.M(), (class00392)class052162, n3, n4, n2, class02566.Z((int)n));
            }
        }
        class08700.N().L();
    }

    public void y(class01054 class010542, class02233 class022332) {
        int n;
        if (((Boolean)((class05630)this.Nz.i_7).NG().method_41753()).booleanValue() && (this.NK > 0.0f || this.NV > 0.0f) && (n = class04995.y((float)(255.0f * class04995.N((float)class04995.B((float)class022332.y(), (float)this.NV, (float)this.NK), (float)0.0f, (float)1.0f)))) > 0) {
            class01590 class015902 = this.M();
            int n2 = class015902.N((class05936)e);
            int n3 = class02566.R((int)n, (int)-1);
            int n4 = class010542.N() - n2 - 5;
            int n5 = class010542.y();
            Objects.requireNonNull(class015902);
            int n6 = n5 - 9 - 5;
            class010542.L();
            class010542.N(class015902, e, n4, n6, n2, n3);
        }
    }

    public void y(class01054 class010542, float f, CallbackInfo callbackInfo) {
        class10956 class109562 = class10956.L();
        class11938.L().L((Object)class109562);
        if (class109562.y()) {
            callbackInfo.cancel();
        }
    }

    private void y(class01054 class010542, float f) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.y(class010542, f, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (f < 1.0f) {
            f *= f;
            f *= f;
            f = f * 0.8f + 0.2f;
        }
        int n = class02566.y((float)f);
        class08388 class083882 = this.Nz.yU().N().N(class00869.iq.W());
        class010542.N(class08394.Na, class083882, 0, 0, class010542.N(), class010542.y(), n);
    }

    private void y(class01054 class010542, class02233 class022332, Operation operation) {
        if (((Boolean)OkZoomerConfigManager.CONFIG.appearance.persistentInterface.value()).booleanValue() || !Zoom.getTransitionMode().getActive()) {
            operation.call(new Object[]{class010542, class022332});
        } else {
            float f = Zoom.getTransitionMode().applyZoom(1.0f, class022332.N(true));
            this.NX = 2.0f / (1.0f / f - 1.0f);
            this.Na = 1.0f / f;
            class010542.i().pushMatrix();
            class010542.i().translate(-((float)class010542.N() / this.NX), -((float)class010542.y() / this.NX));
            class010542.i().scale(this.Na, this.Na);
            operation.call(new Object[]{class010542, class022332});
            class010542.i().popMatrix();
        }
    }

    public void y(class01054 class010542, class02233 class022332, CallbackInfo callbackInfo) {
        class10979 class109792 = class10979.L();
        class11938.L().L((Object)class109792);
        if (class109792.y()) {
            callbackInfo.cancel();
        }
    }

    private void y(class01054 class010542, class07049 class070492, CallbackInfo callbackInfo) {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline != null && !worldRenderingPipeline.shouldRenderVignette()) {
            callbackInfo.cancel();
        }
    }

    public void y() {
        if (this.Nq != null) {
            this.Nq.run();
            this.Nq = null;
        }
    }

    public void y(class00392 class003922) {
        this.Nw = class003922;
    }

    private void y(class04682 class046822, class01054 class010543, Operation operation, class02233 class022333) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.SPECTATOR_TOOLTIP).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class046822, class010542}));
    }

    private void y(class01056 class010562, class01054 class010543, Operation operation, class02233 class022333) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.HELD_ITEM_TOOLTIP).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542}));
    }

    private static int y(int n, int n2, int n3) {
        return class04995.u((float)((float)((n + n3) * 10) / (float)n2));
    }

    private void y(class01054 class010542, class08036 class080362, int n, int n2, CallbackInfo callbackInfo) {
        if (HUDOverlayHandler.INSTANCE != null) {
            HUDOverlayHandler.INSTANCE.onRenderFood(class010542, class080362, n, n2);
        }
    }

    private void y(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.CROSSHAIR).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    private void E(class01054 class010542, class02233 class022332) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.L(class010542, class022332, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        Collection var3 = ((class04453)this.Nz.T_4).method_6026();
        if (var3.isEmpty() || (class05096)this.Nz.v_3 != null && ((class05096)this.Nz.v_3).method_64507()) {
            return;
        }
        int n = 0;
        int n2 = 0;
        for (class07055 class070552 : Ordering.natural().reverse().sortedCopy((Iterable)var3)) {
            class03556 var8 = class070552.L();
            if (!class070552.B()) continue;
            int n3 = class010542.N();
            int n4 = 1;
            if (this.Nz.E()) {
                n4 += 15;
            }
            if (((class07084)var8.N()).z()) {
                n3 -= 25 * ++n;
            } else {
                n3 -= 25 * ++n2;
                n4 += 26;
            }
            float f = 1.0f;
            if (class070552.R()) {
                class010542.N(class08394.Na, z, n3, n4, 24, 24);
            } else {
                class010542.N(class08394.Na, U, n3, n4, 24, 24);
                if (class070552.N(200)) {
                    int n5 = class070552.u();
                    int n6 = 10 - n5 / 20;
                    f = class04995.N((float)((float)n5 / 10.0f / 5.0f * 0.5f), (float)0.0f, (float)0.5f) + class04995.P((double)((float)n5 * (float)Math.PI / 5.0f)) * class04995.N((float)((float)n6 / 10.0f * 0.25f), (float)0.0f, (float)0.25f);
                    f = class04995.N((float)f, (float)0.0f, (float)1.0f);
                }
            }
            class010542.N(class08394.Na, class01056.N((class03556<class07084>)var8), n3 + 3, n4 + 3, 18, 18, class02566.y((float)f));
        }
    }

    private void E(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.PLAYER_LIST).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    public class06463 E() {
        return this.Nj;
    }

    private void N(int n, class08036 class080362, int n2, CallbackInfo callbackInfo) {
        if (((Boolean)VisualSettings.INSTANCE.removeBubblePopSound.getValue()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    private void N(class07049 class070492) {
        class07209 class072092 = class07209.method_49637((double)class070492.method_23317(), (double)class070492.method_23320(), (double)class070492.method_23321());
        float f = class03042.N((class07376)class070492.method_73183().method_8597(), (int)class070492.method_73183().U(class072092));
        float f2 = class04995.N((float)(1.0f - f), (float)0.0f, (float)1.0f);
        this.y += (f2 - this.y) * 0.01f;
    }

    private static int N(int n, boolean bl) {
        return n == 0 || !bl ? 0 : 1;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private boolean N(class05455 class054552, Operation operation) {
        if (VisualSettings.INSTANCE.alwaysRenderCrosshair.isEnabled()) {
            return true;
        }
        return (Boolean)operation.call(new Object[]{class054552});
    }

    private boolean N(class01054 class010542, RenderPipeline renderPipeline, class01894 class018942, int n, int n2, int n3, int n4) {
        return (Boolean)VisualSettings.INSTANCE.hideEmptyBubbleIcons.getValue() == false;
    }

    private void N(class01054 class010542, class08036 class080362, int n, int n2, int n3) {
        int n4 = class080362.method_5748();
        int n5 = Math.clamp((long)class080362.method_5669(), (int)0, (int)n4);
        boolean bl = class080362.method_5777(class01231.N);
        if (bl || n5 < n4) {
            boolean bl2;
            n2 = this.N(n, n2);
            int n6 = class01056.y(n5, n4, -2);
            int n7 = class01056.y(n5, n4, 0);
            int n8 = 10 - class01056.y(n5, n4, class01056.N(n5, bl));
            boolean bl3 = bl2 = n6 != n7;
            if (!bl) {
                this.No = 0;
            }
            for (int i = 1; i <= 10; ++i) {
                int n9;
                int n10 = n3 - (i - 1) * 8 - 9;
                if (i <= n6) {
                    n9 = 9;
                    int n11 = 9;
                    int n12 = n2;
                    int n13 = n10;
                    class010542.N(class08394.Na, k, this.u(n13), n12, n11, n9);
                    continue;
                }
                if (bl2 && i == n7 && bl) {
                    n9 = 9;
                    int n14 = 9;
                    int n15 = n2;
                    int n16 = n10;
                    class010542.N(class08394.Na, Y, this.u(n16), n15, n14, n9);
                    this.N(i, class080362, n8);
                    continue;
                }
                if (i <= 10 - n8) continue;
                int n17 = n8 == 10 && this.NE % 2 == 0 ? this.NZ.y(2) : 0;
                n9 = 9;
                int n18 = 9;
                int n19 = n2 + n17;
                int n20 = n10;
                int n21 = n9;
                int n22 = n18;
                int n23 = n19;
                class01054 class010543 = class010542;
                RenderPipeline renderPipeline = class08394.Na;
                class01894 class018942 = Q;
                n9 = this.u(n20);
                if (!this.N(class010543, renderPipeline, class018942, n9, n23, n22, n21)) continue;
                class010543.N(renderPipeline, class018942, n9, n23, n22, n21);
            }
        }
    }

    private void N(class01054 class010542, boolean bl) {
        if (bl) {
            this.Nq = () -> this.Nv.N(class010542);
        } else {
            this.Nq = null;
            this.Nv.N(class010542);
        }
    }

    public void N(class01054 class010542) {
        this.Nj.N(class010542);
    }

    private void N(class01054 class010542, float f, float f2, class08036 class080362, class06584 class065842) {
        if (class065842.R()) {
            return;
        }
        class010542.i().pushMatrix();
        class010542.i().translate(f, f2);
        class010542.N((class07438)class080362, class065842, 0, 0, 1);
        class010542.N((class01590)this.Nz.i_3, class065842, 0, 0);
        class010542.i().popMatrix();
    }

    private void N(int n, class08036 class080362, int n2) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(n, class080362, n2, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (this.No != n) {
            float f = 0.5f + 0.1f * (float)Math.max(0, n2 - 3 + 1);
            float f2 = 1.0f + 0.1f * (float)Math.max(0, n2 - 5 + 1);
            class080362.method_5783(class04909.uP, f, f2);
            this.No = n;
        }
    }

    private static void N(class01054 class010542, class08036 class080362, int n, int n2, int n3, int n4, CallbackInfo callbackInfo) {
        if (config.DISABLE_ARMOR_BAR) {
            callbackInfo.cancel();
        }
    }

    public int N(int n, class01054 class010542) {
        return class010542.y() - 62;
    }

    private static void N(class01054 class010542, class08036 class080362, int n, int n2, int n3, int n4) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        class01056.N(class010542, class080362, n, n2, n3, n4, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        int n5 = class080362.method_6096();
        if (n5 <= 0) {
            return;
        }
        int n6 = n - (n2 - 1) * n3 - 10;
        for (int i = 0; i < 10; ++i) {
            int n7 = n4 + i * 8;
            if (i * 2 + 1 < n5) {
                ArgsN3 argsN3 = ArgsN3.of((RenderPipeline)class08394.Na, (class01894)v, (int)n7, (int)n6, (int)9, (int)9);
                class01056.N((Args)argsN3);
                class010542.N(argsN3.$0(), argsN3.$1(), argsN3.$2(), argsN3.$3(), argsN3.$4(), argsN3.$5());
            }
            if (i * 2 + 1 == n5) {
                ArgsN3 argsN3 = ArgsN3.of((RenderPipeline)class08394.Na, (class01894)j, (int)n7, (int)n6, (int)9, (int)9);
                class01056.N((Args)argsN3);
                class010542.N(argsN3.$0(), argsN3.$1(), argsN3.$2(), argsN3.$3(), argsN3.$4(), argsN3.$5());
            }
            if (i * 2 + 1 <= n5) continue;
            ArgsN3 argsN3 = ArgsN3.of((RenderPipeline)class08394.Na, (class01894)b, (int)n7, (int)n6, (int)9, (int)9);
            class01056.N((Args)argsN3);
            class010542.N(argsN3.$0(), argsN3.$1(), argsN3.$2(), argsN3.$3(), argsN3.$4(), argsN3.$5());
        }
    }

    private void N(class01054 class010542, class01590 class015902, int n, Operation operation, LocalRef localRef) {
        this.N(class010542, class015902, n, operation, (class02233)localRef.get());
    }

    private void N(class01056 class010562, class01054 class010542, Operation operation, LocalRef localRef) {
        this.N(class010562, class010542, operation, (class02233)localRef.get());
    }

    private void N(class01054 class010542, class01064 class010642, int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        class010542.N(class08394.Na, class010642.N(bl, bl3, bl2), n, n2, 9, 9);
    }

    private void N(class01054 class010542, class01894 class018942, float f) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class010542, class018942, f, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        int n = class02566.y((float)f);
        class010542.N(class08394.Na, class018942, 0, 0, 0.0f, 0.0f, class010542.N(), class010542.y(), class010542.N(), class010542.y(), n);
    }

    public void N(class01054 class010542, class02233 class022332) {
        this.y(class010542, class022332, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_332, net.minecraft.class_9779]");
            this.T((class01054)objectArray[0], (class02233)objectArray[1]);
            return null;
        });
    }

    private void N(class01054 class010542, class08036 class080362, int n, int n2, int n3, int n4, float f, int n5, int n6, int n7, boolean bl) {
        class01064 class010642 = class01064.N(class080362);
        class05087 class050872 = class080362.method_73183().method_8401();
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class010642);
        this.N(class010542, class080362, n, n2, n3, n4, f, n5, n6, n7, bl, null, (LocalRef)localRefImpl);
        class010642 = (class01064)((Object)localRefImpl.dispose());
        boolean bl2 = class050872.U();
        int n8 = class04995.L((double)((double)f / 2.0));
        int n9 = class04995.L((double)((double)n7 / 2.0));
        int n10 = n8 * 2;
        for (int i = n8 + n9 - 1; i >= 0; --i) {
            int n11;
            int n12 = i / 10;
            int n13 = i % 10;
            int n14 = n + n13 * 8;
            int n15 = n2 - n12 * n3;
            if (n5 + n7 <= 4) {
                n15 += this.NZ.y(2);
            }
            if (i < n8 && i == n4) {
                n15 -= 2;
            }
            this.N(class010542, class01064.field_33944, n14, n15, bl2, bl, false);
            int n16 = i * 2;
            if (i >= n8 && (n11 = n16 - n10) < n7) {
                boolean bl3 = n11 + 1 == n7;
                this.N(class010542, class010642 == class01064.field_33947 ? class010642 : class01064.field_33948, n14, n15, bl2, false, bl3);
            }
            if (bl && n16 < n6) {
                n11 = n16 + 1 == n6 ? 1 : 0;
                this.N(class010542, class010642, n14, n15, bl2, true, n11 != 0);
            }
            if (n16 >= n5) continue;
            n11 = n16 + 1 == n5 ? 1 : 0;
            this.N(class010542, class010642, n14, n15, bl2, false, n11 != 0);
        }
        this.N(class010542, class080362, n, n2, n3, n4, f, n5, n6, n7, bl, null);
    }

    private static void N(Args args) {
        if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
            int n = 80;
            args.set(2, (Object)((Integer)args.get(2) + 80 + 21));
            args.set(3, (Object)((Integer)args.get(3) + 10));
        }
    }

    private void N(class01054 class010542, float f) {
        float f2;
        float f3 = f2 = (float)Math.min(class010542.N(), class010542.y());
        float f4 = Math.min((float)class010542.N() / f2, (float)class010542.y() / f3) * f;
        int n = class04995.y((float)(f2 * f4));
        int n2 = class04995.y((float)(f3 * f4));
        int n3 = (class010542.N() - n) / 2;
        int n4 = (class010542.y() - n2) / 2;
        int n5 = n3 + n;
        int n6 = n4 + n2;
        class010542.N(class08394.Na, o, n3, n4, 0.0f, 0.0f, n, n2, n, n2);
        class010542.N(class08394.NH, 0, n6, class010542.N(), class010542.y(), -16777216);
        class010542.N(class08394.NH, 0, 0, class010542.N(), n4, -16777216);
        class010542.N(class08394.NH, 0, n4, n3, n6, -16777216);
        class010542.N(class08394.NH, n5, n4, class010542.N(), n6, -16777216);
    }

    private void N(class07438 class074382, CallbackInfoReturnable callbackInfoReturnable) {
        if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
            callbackInfoReturnable.setReturnValue((Object)1);
        }
    }

    private void N(CallbackInfo callbackInfo) {
        if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
            callbackInfo.cancel();
        }
    }

    public void N() {
        this.Nk = 10;
        this.NY = 70;
        this.NQ = 20;
    }

    private void N(class04682 class046822, class01054 class010542, Operation operation, LocalRef localRef) {
        this.N(class046822, class010542, operation, (class02233)localRef.get());
    }

    private int N(int n, int n2) {
        int n3 = this.N(n) - 1;
        return n2 -= n3 * 10;
    }

    private void N(class01054 class010542, class08036 class080362, int n, int n2) {
        this.N(class010542, class080362, n, n2, null);
        int n3 = class080362.method_7344().N();
        for (int i = 0; i < 10; ++i) {
            class01894 class018942;
            class01894 class018943;
            class01894 class018944;
            int n4 = n;
            if (class080362.method_6059(class07047.T)) {
                class018944 = class01056.n;
                class018943 = t;
                class018942 = G;
            } else {
                class018944 = l;
                class018943 = d;
                class018942 = w;
            }
            if (class080362.method_7344().u() <= 0.0f && this.NE % (n3 * 3 + 1) == 0) {
                n4 += this.NZ.y(3) - 1;
            }
            int n5 = n2 - i * 8 - 9;
            class010542.N(class08394.Na, class018944, n5, n4, 9, 9);
            if (i * 2 + 1 < n3) {
                class010542.N(class08394.Na, class018942, n5, n4, 9, 9);
            }
            if (i * 2 + 1 != n3) continue;
            class010542.N(class08394.Na, class018943, n5, n4, 9, 9);
        }
        this.y(class010542, class080362, n, n2, null);
    }

    private void N(class08657 class086572, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.INFO_BAR).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class086572, class010542, class022332}));
    }

    private void N(class01056 class010562, class01054 class010543, Operation operation, class02233 class022333) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.MOUNT_HEALTH).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542}));
    }

    private void N(class01056 class010562, class01054 class010543, class08036 class080362, int n, int n2, int n3, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.AIR_BAR).render(class010543, this.Nz.NK(), (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class080362, n, n2, n3}));
    }

    private void N(class01056 class010562, class01054 class010543, class08036 class080362, int n, int n2, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.FOOD_BAR).render(class010543, this.Nz.NK(), (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class080362, n, n2}));
    }

    private void N(class01056 class010562, class01054 class010543, class08036 class080362, int n, int n2, int n3, int n4, float f, int n5, int n6, int n7, boolean bl, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.HEALTH_BAR).render(class010543, this.Nz.NK(), (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class080362, n, n2, n3, n4, Float.valueOf(f), n5, n6, n7, bl}));
    }

    private void N(class01054 class010543, class08036 class080362, int n, int n2, int n3, int n4, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.ARMOR_BAR).render(class010543, this.Nz.NK(), (class010542, class022332) -> operation.call(new Object[]{class010542, class080362, n, n2, n3, n4}));
    }

    public void N(class00392 class003922) {
        class05216 class052162 = class00392.N((String)"record.nowPlaying", (Object[])new Object[]{class003922});
        this.N((class00392)class052162, true);
        this.Nz.NT().u((class00392)class052162);
    }

    private boolean N(@Nullable class07089 class070892) {
        if (class070892 == null) {
            return false;
        }
        if (class070892.N() == class07113.field_1331) {
            return ((class06145)class070892).L() instanceof class06237;
        }
        if (class070892.N() == class07113.field_1332) {
            class03448 class034482 = (class03448)this.Nz.T_3;
            class07209 class072092 = ((class06183)class070892).u();
            return class034482.method_8320(class072092).N((class07299)class034482, class072092) != null;
        }
        return false;
    }

    public void N(class00392 class003922, boolean bl) {
        this.y(false);
        this.NW = class003922;
        this.Nm = 60;
        this.NP = bl;
    }

    private void N(class01054 class010542, class00518 class005182) {
        int n;
        class06683 class066832 = class005182.y();
        class01762 class017622 = class005182.N((class01762)class01759.L);
        class01048[] class01048Array = (class01048[])class066832.N(class005182).stream().filter(class017722 -> !class017722.N()).sorted(K).limit(15L).map(class017722 -> {
            class00502 class005022 = class066832.i(class017722.L());
            class00392 class003922 = class017722.y();
            class05216 class052162 = class00502.N((class06639)class005022, (class00392)class003922);
            class05216 class052163 = class017722.N(class017622);
            int n = this.M().N((class05936)class052163);
            return new class01048((class00392)class052162, (class00392)class052163, n);
        }).toArray(class01048[]::new);
        class00392 class003922 = class005182.i();
        int n2 = n = this.M().N((class05936)class003922);
        int n3 = this.M().y(p);
        for (class01048 class010482 : class01048Array) {
            n2 = Math.max(n2, this.M().N((class05936)class010482.N()) + (class010482.L() > 0 ? n3 + class010482.L() : 0));
        }
        int n4 = n2;
        int n5 = class01048Array.length;
        Objects.requireNonNull(this.M());
        int n6 = n5 * 9;
        int n7 = class010542.y() / 2 + n6 / 3;
        int n8 = 3;
        int n9 = class010542.N() - n4 - 3;
        int n10 = class010542.N() - 3 + 2;
        int n11 = ((class05630)this.Nz.i_7).y(0.3f);
        int n12 = ((class05630)this.Nz.i_7).y(0.4f);
        Objects.requireNonNull(this.M());
        int n13 = n7 - n5 * 9;
        Objects.requireNonNull(this.M());
        class010542.N(n9 - 2, n13 - 9 - 1, n10, n13 - 1, n12);
        class010542.N(n9 - 2, n13 - 1, n10, n7, n11);
        class01590 class015902 = this.M();
        int n14 = n9 + n4 / 2 - n / 2;
        Objects.requireNonNull(this.M());
        class010542.N(class015902, class003922, n14, n13 - 9, -1, false);
        for (int i = 0; i < n5; ++i) {
            class01048 class010483 = class01048Array[i];
            Objects.requireNonNull(this.M());
            int n15 = n7 - (n5 - i) * 9;
            class010542.N(this.M(), class010483.N(), n9, n15, -1, false);
            class010542.N(this.M(), class010483.y(), n10 - class010483.L(), n15, -1, false);
        }
    }

    private void N(class01054 class010543, class01590 class015902, int n, Operation operation, class02233 class022333) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.EXPERIENCE_LEVEL).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010542, class015902, n}));
    }

    public void N(int n, int n2, int n3) {
        if (n >= 0) {
            this.Nk = n;
        }
        if (n2 >= 0) {
            this.NY = n2;
        }
        if (n3 >= 0) {
            this.NQ = n3;
        }
        if (this.Nl > 0) {
            this.Nl = this.Nk + this.NY + this.NQ;
        }
    }

    public static class01894 N(class03556<class07084> class035562) {
        return class035562.i().map(class05946::N).map(class018942 -> class018942.R("mob_effect/")).orElseGet(class08923::L);
    }

    private void N(class04682 class046822, class01054 class010543, Operation operation, class02233 class022333) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.SPECTATOR_MENU).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class046822, class010542}));
    }

    private void N(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.MISC_OVERLAYS).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    public void N(class01054 class010542, class02233 class022332, CallbackInfo callbackInfo) {
        ((HudRenderCallback)HudRenderCallback.EVENT.invoker()).onHudRender(class010542, class022332);
    }

    private void N(class01054 class010542, class08036 class080362, int n, int n2, int n3, int n4, float f, int n5, int n6, int n7, boolean bl, CallbackInfo callbackInfo) {
        if (HUDOverlayHandler.INSTANCE != null) {
            HUDOverlayHandler.INSTANCE.onRenderHealth(class010542, class080362, n, n2, n3, n4, f, n5, n6, n7, bl);
        }
    }

    private void N(class01054 class010542, class08036 class080362, int n, int n2, CallbackInfo callbackInfo) {
        if (HUDOverlayHandler.INSTANCE != null) {
            HUDOverlayHandler.INSTANCE.onPreRenderFood(class010542, class080362, n, n2);
        }
    }

    public void N(class01054 class010542, float f, CallbackInfo callbackInfo) {
        class10956 class109562 = class10956.L();
        class11938.L().L((Object)class109562);
        if (class109562.y()) {
            callbackInfo.cancel();
        }
    }

    private void N(class01054 class010542, class08036 class080362, int n, int n2, int n3, int n4, float f, int n5, int n6, int n7, boolean bl, CallbackInfo callbackInfo, LocalRef localRef) {
        class10994 class109942 = class10994.N((class01064)((class01064)((Object)localRef.get())));
        class11938.L().L((Object)class109942);
        localRef.set((Object)class109942.N());
    }

    public void N(class01054 class010542, class01894 class018942, float f, CallbackInfo callbackInfo) {
        if (class018942 == q) {
            class09338 class093382 = class09338.L();
            class11938.L().L((Object)class093382);
            if (class093382.y()) {
                callbackInfo.cancel();
            }
        }
    }

    public void N(class01054 class010542, class07049 class070492, CallbackInfo callbackInfo) {
        class09338 class093382 = class09338.L();
        class11938.L().L((Object)class093382);
        if (class093382.y()) {
            callbackInfo.cancel();
        }
    }

    private int N(int n) {
        return (int)Math.ceil((double)n / 10.0);
    }

    public void N(class01054 class010542, class02233 class022332, Operation operation) {
        if ((class05096)this.Nz.v_3 instanceof HudHideable) {
            return;
        }
        GLDebug.pushGroup((int)1000, (String)"GUI");
        operation.call(new Object[]{class010542, class022332});
        GLDebug.popGroup();
    }

    private int N(@Nullable class07438 class074382) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class074382, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        if (class074382 == null || !class074382.method_5709()) {
            return 0;
        }
        int n = (int)(class074382.method_6063() + 0.5f) / 2;
        if (n > 30) {
            n = 30;
        }
        return n;
    }

    public void N(boolean bl) {
        this.T();
        if (!bl) {
            this.s();
        }
    }

    private void N(class01054 class010542, class02233 class022332, CallbackInfo callbackInfo, LocalBooleanRef localBooleanRef) {
        localBooleanRef.set(false);
        if (Zoom.getZoomOverlay() != null) {
            ZoomOverlay zoomOverlay = Zoom.getZoomOverlay();
            zoomOverlay.tickBeforeRender(class022332);
            if (zoomOverlay.getActive()) {
                localBooleanRef.set(zoomOverlay.cancelOverlayRendering());
                zoomOverlay.renderOverlay(class010542, class022332, Zoom.getTransitionMode());
            }
        }
    }

    private boolean N(boolean bl, LocalBooleanRef localBooleanRef) {
        return bl && !localBooleanRef.get();
    }

    private void N(class01054 class010542, @Nullable class07049 class070492) {
        int n;
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.y(class010542, class070492, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.N(class010542, class070492, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        class08057 class080572 = ((class03448)this.Nz.T_3).method_8621();
        float f = 0.0f;
        if (class070492 != null) {
            float f2 = (float)class080572.N(class070492);
            double d = Math.min(class080572.s() * (double)class080572.T(), Math.abs(class080572.U() - class080572.Z()));
            double d2 = Math.max((double)class080572.b(), d);
            if ((double)f2 < d2) {
                f = 1.0f - (float)((double)f2 / d2);
            }
        }
        if (f > 0.0f) {
            f = class04995.N((float)f, (float)0.0f, (float)1.0f);
            n = class02566.N((float)1.0f, (float)0.0f, (float)f, (float)f);
        } else {
            float f3 = this.y;
            f3 = class04995.N((float)f3, (float)0.0f, (float)1.0f);
            n = class02566.N((float)1.0f, (float)f3, (float)f3, (float)f3);
        }
        class010542.N(class08394.NS, J, 0, 0, 0.0f, 0.0f, class010542.N(), class010542.y(), class010542.N(), class010542.y(), n);
    }

    private void N(class01054 class010542, int n, int n2, class02233 class022332, class08036 class080362, class06584 class065842, int n3) {
        if (class065842.R()) {
            return;
        }
        float f = (float)class065842.H() - class022332.N(false);
        if (f > 0.0f) {
            float f2 = 1.0f + f / 5.0f;
            class010542.i().pushMatrix();
            class010542.i().translate((float)(n + 8), (float)(n2 + 12));
            class010542.i().scale(1.0f / f2, (f2 + 1.0f) / 2.0f);
            class010542.i().translate((float)(-(n + 8)), (float)(-(n2 + 12)));
        }
        class010542.N((class07438)class080362, class065842, n, n2, n3);
        if (f > 0.0f) {
            class010542.i().popMatrix();
        }
        class010542.N((class01590)this.Nz.i_3, class065842, n, n2);
    }

    private void W(class01054 class010542, class02233 class022332) {
        class02233 class022333;
        Object object;
        class01054 class010543;
        if (((class03443)this.Nz.T_2).U() == class07282.field_9219) {
            class010543 = class010542;
            object = this.Nn;
            Operation operation = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_365, net.minecraft.class_332]");
                ((class04682)objectArray[0]).N((class01054)objectArray[1]);
                return null;
            };
            LocalRefImpl localRefImpl = new LocalRefImpl();
            localRefImpl.init((Object)class022332);
            this.N((class04682)object, class010543, operation, (LocalRef)localRefImpl);
            class022332 = (class02233)localRefImpl.dispose();
        } else {
            class022333 = class022332;
            class010543 = class010542;
            object = this;
            this.L((class01056)object, class010543, class022333, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
                Object[] objectArray2 = objectArray;
                ((class01056)objectArray[0]).m((class01054)objectArray2[1], (class02233)objectArray2[2]);
                return null;
            });
        }
        if (((class03443)this.Nz.T_2).y()) {
            this.L(class010542);
        }
        class010543 = class010542;
        object = this;
        Operation operation = objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_329, net.minecraft.class_332]");
            ((class01056)objectArray[0]).u((class01054)objectArray[1]);
            return null;
        };
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class022332);
        this.N((class01056)object, class010543, operation, (LocalRef)localRefImpl);
        class022332 = (class02233)localRefImpl.dispose();
        class01069 class010692 = this.v();
        if (class010692 != this.Ne.getKey()) {
            this.Ne = Pair.of((Object)((Object)class010692), (Object)this.NH.get((Object)class010692).get());
        }
        class022333 = class022332;
        class010543 = class010542;
        object = (class08657)this.Ne.getValue();
        this.N((class08657)object, class010543, class022333, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_11223, net.minecraft.class_332, net.minecraft.class_9779]");
            Object[] objectArray2 = objectArray;
            ((class08657)objectArray[0]).N((class01054)objectArray2[1], (class02233)objectArray2[2]);
            return null;
        });
        if (((class03443)this.Nz.T_2).R() && ((class04453)this.Nz.T_4).fields_37fa3311b0e9d3e9b883d09222919bf5a_0 > 0) {
            int n = ((class04453)this.Nz.T_4).fields_37fa3311b0e9d3e9b883d09222919bf5a_0;
            class010543 = (class01590)this.Nz.i_3;
            object = class010542;
            Operation operation2 = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_332, net.minecraft.class_327, int]");
                Object[] objectArray2 = objectArray;
                class08657.N((class01054)((class01054)objectArray[0]), (class01590)((class01590)objectArray2[1]), (int)((Integer)objectArray2[2]));
                return null;
            };
            LocalRefImpl localRefImpl2 = new LocalRefImpl();
            localRefImpl2.init((Object)class022332);
            this.N((class01054)object, (class01590)class010543, n, operation2, (LocalRef)localRefImpl2);
            class022332 = (class02233)localRefImpl2.dispose();
        }
        ((class08657)this.Ne.getValue()).y(class010542, class022332);
        if (((class03443)this.Nz.T_2).U() != class07282.field_9219) {
            class010543 = class010542;
            object = this;
            Operation operation3 = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_329, net.minecraft.class_332]");
                ((class01056)objectArray[0]).y((class01054)objectArray[1]);
                return null;
            };
            LocalRefImpl localRefImpl3 = new LocalRefImpl();
            localRefImpl3.init((Object)class022332);
            this.y((class01056)object, class010543, operation3, (LocalRef)localRefImpl3);
            class022332 = (class02233)localRefImpl3.dispose();
        } else if (((class04453)this.Nz.T_4).method_7325()) {
            class010543 = class010542;
            object = this.Nn;
            Operation operation4 = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_365, net.minecraft.class_332]");
                ((class04682)objectArray[0]).y((class01054)objectArray[1]);
                return null;
            };
            LocalRefImpl localRefImpl4 = new LocalRefImpl();
            localRefImpl4.init((Object)class022332);
            this.y((class04682)object, class010543, operation4, (LocalRef)localRefImpl4);
            class022332 = (class02233)localRefImpl4.dispose();
        }
    }

    public void W() {
        this.Nj.N();
    }

    private void R(class01054 class010542, class02233 class022332) {
        class01590 class015902 = this.M();
        if (this.NW == null || this.Nm <= 0) {
            return;
        }
        class08700.N().N("overlayMessage");
        float f = (float)this.Nm - class022332.N(false);
        int n = (int)(f * 255.0f / 20.0f);
        if (n > 255) {
            n = 255;
        }
        if (n > 0) {
            class010542.L();
            class010542.i().pushMatrix();
            class010542.i().translate((float)(class010542.N() / 2), (float)(class010542.y() - 68));
            int n2 = this.NP ? class04995.N((float)(f / 50.0f), (float)0.7f, (float)0.6f, (int)n) : class02566.Z((int)n);
            int n3 = class015902.N((class05936)this.NW);
            class010542.N(class015902, this.NW, -n3 / 2, -4, n3, n2);
            class010542.i().popMatrix();
        }
        class08700.N().L();
    }

    private void R(class01054 class010542) {
        int n;
        int n2 = class010542.N();
        if (!i && (class04453)this.Nz.T_4 == null) {
            throw new AssertionError();
        }
        boolean bl = config.RTL;
        ArmorAccessor armorAccessor = armorHud.getArmorAccessor();
        int n3 = 14;
        int n4 = 15;
        float f = (float)n2 / 2.0f + (float)(config.ABOVE_HEALTH_BAR && ((class04453)this.Nz.T_4).method_6063() + ((class04453)this.Nz.T_4).method_52541() < 180.0f ? -10 : 91);
        class07085[] class07085Array = class07085.values();
        int n5 = 0;
        if (config.TRIM_EMPTY_SLOTS) {
            for (int i = 2; i < 6; ++i) {
                if (!((class04453)this.Nz.T_4).method_6118(class07085Array[i]).R()) continue;
                ++n5;
            }
        }
        float f2 = f + 14.0f - (float)(7 * n5) + 2.0f;
        int n6 = n = bl ? class07085Array.length - 1 : 0;
        while (bl ? n >= 0 : n < class07085Array.length) {
            class07085 class070852 = class07085Array[n];
            if (!config.TRIM_EMPTY_SLOTS || class070852.N() != class07043.field_6178 || !((class04453)this.Nz.T_4).method_6118(class070852).R()) {
                f2 -= 15.0f;
                if (class070852.i()) {
                    this.N(class010542, f2, (float)this.L, (class08036)((class04453)this.Nz.T_4), armorAccessor.getArmorPiece((class04453)this.Nz.T_4, class070852));
                }
            }
            n += bl ? -1 : 1;
        }
    }

    private void R(class01056 class010562, class01054 class010543, class02233 class022333, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.SLEEP).render(class010543, class022333, (class010542, class022332) -> operation.call(new Object[]{class010562, class010542, class022332}));
    }

    public int R() {
        return this.NE;
    }

    public /* synthetic */ int fabric$getRenderHealthValue() {
        return this.Ng;
    }

    public /* synthetic */ class08036 fabric$callGetCameraPlayer() {
        return this.m();
    }

    public /* synthetic */ int fabric$callGetHeartCount(class07438 class074382) {
        return this.N(class074382);
    }

    public /* synthetic */ int fabric$callGetHeartRows(int n) {
        return this.N(n);
    }

    public /* synthetic */ class07438 fabric$callGetRiddenEntity() {
        return this.P();
    }
}

