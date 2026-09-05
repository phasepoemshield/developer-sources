/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11792
 *  baritone.utils.accessor.IEntityRenderManager
 *  com.google.common.collect.ImmutableMap
 *  com.viaversion.viafabricplus.features.entity.r1_8_boat.BoatRenderer1_8
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.objects.Object2ObjectFunction
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00183
 *  minecraft.class00951
 *  minecraft.class01083
 *  minecraft.class01089
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01383
 *  minecraft.class01421
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02416
 *  minecraft.class03049
 *  minecraft.class03579
 *  minecraft.class04206
 *  minecraft.class04208
 *  minecraft.class04477
 *  minecraft.class04507
 *  minecraft.class04808
 *  minecraft.class04832
 *  minecraft.class04866
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05630
 *  minecraft.class06141
 *  minecraft.class06176
 *  minecraft.class06202
 *  minecraft.class06600
 *  minecraft.class06603
 *  minecraft.class06618
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07074
 *  minecraft.class07078
 *  minecraft.class07080
 *  minecraft.class07878
 *  minecraft.class07949
 *  minecraft.class08036
 *  minecraft.class08117
 *  minecraft.class08212
 *  minecraft.class08283
 *  minecraft.class08287
 *  minecraft.class08290
 *  minecraft.class08396
 *  minecraft.class08468
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08718
 *  minecraft.class08790
 *  minecraft.class08800
 *  minecraft.class08943
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class11792;
import baritone.utils.accessor.IEntityRenderManager;
import com.google.common.collect.ImmutableMap;
import com.viaversion.viafabricplus.features.entity.r1_8_boat.BoatRenderer1_8;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2ObjectFunction;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.lang.invoke.LambdaMetafactory;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class00183;
import minecraft.class00951;
import minecraft.class01083;
import minecraft.class01089;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01383;
import minecraft.class01421;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02416;
import minecraft.class03049;
import minecraft.class03579;
import minecraft.class04206;
import minecraft.class04208;
import minecraft.class04477;
import minecraft.class04507;
import minecraft.class04808;
import minecraft.class04832;
import minecraft.class04866;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class06141;
import minecraft.class06176;
import minecraft.class06202;
import minecraft.class06600;
import minecraft.class06603;
import minecraft.class06618;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07074;
import minecraft.class07078;
import minecraft.class07080;
import minecraft.class07878;
import minecraft.class07949;
import minecraft.class08036;
import minecraft.class08117;
import minecraft.class08212;
import minecraft.class08283;
import minecraft.class08287;
import minecraft.class08290;
import minecraft.class08396;
import minecraft.class08468;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08718;
import minecraft.class08790;
import minecraft.class08800;
import minecraft.class08943;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class01781
implements class06141,
class11792,
IEntityRenderManager,
FabricResourceReloader {
    private Map<class07078<?>, class04507<?, ?>> i = ImmutableMap.of();
    private Map<class04208, class08287<class04477>> R = Map.of();
    private Map<class04208, class08287<class06603>> M = Map.of();
    public final class08627 N;
    public @Nullable class05363 y;
    public class07049 L;
    private final class08943 B;
    private final class01083 Z;
    private final class01999 z;
    private final class03049 U;
    private final class08117 E;
    private final class01590 W;
    public final class05630 u;
    private final Supplier<class01140> m;
    private final class08718 P;
    private final class07949 s;
    private class01894 T;
    private static final String b = "renderShadow(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;Lnet/minecraft/world/entity/Entity;FFLnet/minecraft/world/level/LevelReader;F)V";
    private static final String j = "Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;renderBlockShadow(Lcom/mojang/blaze3d/vertex/PoseStack$Pose;Lcom/mojang/blaze3d/vertex/VertexConsumer;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;DDDFF)V";
    private static final NamespacedId v;
    private static final NamespacedId n;
    private static int t;
    private static final NamespacedId G;
    private static final NamespacedId l;
    private static final Object2ObjectMap d;
    private BoatRenderer1_8 w;

    private static boolean L() {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        return worldRenderingPipeline != null && worldRenderingPipeline.shouldDisableVanillaEntityShadows();
    }

    public class01781(class06202 class062022, class08627 class086272, class08943 class089432, class01083 class010832, class01999 class019992, class08117 class081172, class01590 class015902, class05630 class056302, Supplier<class01140> supplier, class08718 class087182, class07949 class079492) {
        this.N = class086272;
        this.B = class089432;
        this.Z = class010832;
        this.E = class081172;
        this.s = class079492;
        this.U = new class03049(class062022, this, class089432);
        this.z = class019992;
        this.W = class015902;
        this.u = class056302;
        this.m = supplier;
        this.P = class087182;
    }

    public <E extends class07049> class08800 y(E e, float f) {
        class04507<E, ?> class045072 = this.N(e);
        try {
            return class045072.method_62425(e, f);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Extracting render state for an entity in world");
            class07074 class070742 = class070802.N("Entity being extracted");
            e.method_5819(class070742);
            this.N(class045072, class070802).N("Delta", (Object)Float.valueOf(f));
            throw new class07878(class070802);
        }
    }

    private void y(class08800 class088002, class06959 class069592, double d, double d2, double d3, class01421 class014212, class01237 class012372, CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentEntity(0);
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
    }

    public double y(class07049 class070492) {
        return this.y.y().M(class070492.method_73189());
    }

    public class03049 y() {
        return this.U;
    }

    private void y(class01089 class010892, CallbackInfo callbackInfo, class04832 class048322) {
        this.w = new BoatRenderer1_8(class048322);
    }

    private static /* synthetic */ NamespacedId y(class08800 class088002, Object object) {
        class01894 class018942 = class04206.M.y((Object)class088002.U);
        return new NamespacedId(class018942.y(), class018942.N());
    }

    private void N(class08800 class088002, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && class088002 instanceof class08790) {
            callbackInfoReturnable.setReturnValue((Object)this.w);
        }
    }

    public <E extends class07049> int N(E e, float f) {
        return this.N(e).method_24088(e, f);
    }

    private void N(class01089 class010892, CallbackInfo callbackInfo, class04832 class048322) {
        ArmorRendererRegistryImpl.createArmorRenderers((class04832)class048322);
    }

    private static /* synthetic */ NamespacedId N(class08800 class088002, Object object) {
        class01894 class018942 = class04206.M.y((Object)class088002.U);
        return new NamespacedId(class018942.y(), class018942.N());
    }

    /*
     * Unable to fully structure code
     */
    private void N(class08800 var1_1, class06959 var2_2, double var3_3, double var5_4, double var7_5, class01421 var9_6, class01237 var10_7, CallbackInfo var11_8) {
        block4: {
            block3: {
                var12 = WorldRenderingSettings.INSTANCE.getEntityIds();
                if (var12 == null || !ImmediateState.isRenderingLevel) {
                    return;
                }
                if (!(var1_1 instanceof class08283) || !((class08283)var1_1).y || !WorldRenderingSettings.INSTANCE.hasVillagerConversionId()) break block3;
                var13_10 = var12.applyAsInt((Object)class01781.l);
                break block4;
            }
            if (!(var1_1 instanceof class08468)) ** GOTO lbl-1000
            var15_11 = (class08468)var1_1;
            var17_12 = class06202.Nq().F();
            if (var17_12 instanceof class04477 && ((class04477)var17_12).method_5628() == var15_11.NO) {
                var13_10 = var12.containsKey((Object)class01781.G) ? var12.getInt((Object)class01781.G) : var12.applyAsInt((Object)((NamespacedId)class01781.d.computeIfAbsent((Object)var1_1.U, (Object2ObjectFunction)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, y(minecraft.class08800 java.lang.Object ), (Ljava/lang/Object;)Lnet/irisshaders/iris/shaderpack/materialmap/NamespacedId;)((class08800)var1_1))));
            } else lbl-1000:
            // 2 sources

            {
                var13_10 = var12.applyAsInt((Object)((NamespacedId)class01781.d.computeIfAbsent((Object)var1_1.U, (Object2ObjectFunction)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, N(minecraft.class08800 java.lang.Object ), (Ljava/lang/Object;)Lnet/irisshaders/iris/shaderpack/materialmap/NamespacedId;)((class08800)var1_1))));
            }
        }
        CapturedRenderingState.INSTANCE.setCurrentEntity(var13_10);
    }

    public void N(class07049 class070492, class06959 class069592, double d, double d2, double d3, float f, class01421 class014212, class01237 class012372) {
        double d4 = class04995.u((double)f, (double)class070492.field_6014, (double)class070492.method_23317()) - d;
        double d5 = class04995.u((double)f, (double)class070492.field_6036, (double)class070492.method_23318()) - d2;
        double d6 = class04995.u((double)f, (double)class070492.field_5969, (double)class070492.method_23321()) - d3;
        class04507<class07049, ?> class045072 = this.N(class070492);
        class08800 class088002 = class045072.method_62425(class070492, f);
        class06889 class068892 = class088002.k;
        int n = class088002.l;
        class088002.k = null;
        class088002.l = 0;
        class06889 class068893 = class045072.method_23169(class088002);
        double d7 = d4 + class068893.N();
        double d8 = d5 + class068893.y();
        double d9 = d6 + class068893.L();
        class014212.N();
        class014212.N(d7, d8, d9);
        class045072.method_3936(class088002, class014212, class012372, class069592);
        if (!(class070492 instanceof class08036)) {
            class014212.N(-class068893.N(), -class068893.y(), -class068893.L());
        }
        class014212.y();
        class088002.k = class068892;
        class088002.l = n;
    }

    private static boolean N(class01237 class012372, class01421 class014212, float f, List list) {
        return !class01781.L();
    }

    private <S extends class08800> class07074 N(class04507<?, S> class045072, class07080 class070802) {
        class07074 class070742 = class070802.N("Renderer details");
        class070742.N("Assigned renderer", class045072);
        return class070742;
    }

    public <S extends class08800> void N(S s, class06959 class069592, double d, double d2, double d3, class01421 class014212, class01237 class012372) {
        class04507<S, ?> class045072 = this.N((class07049)s);
        try {
            List var22;
            float f;
            class01421 class014213;
            class01237 class012373;
            class06889 class068892 = class045072.method_23169(s);
            double d4 = d + class068892.N();
            double d5 = d2 + class068892.y();
            double d6 = d3 + class068892.L();
            class014212.N();
            this.N(s, class069592, d, d2, d3, class014212, class012372, null);
            class014212.N(d4, d5, d6);
            class045072.method_3936(s, class014212, class012372, class069592);
            if (s.t) {
                class012372.N(class014212, s, class04995.N((Vector3f)class04995.B, (Quaternionf)class069592.i, (Quaternionf)new Quaternionf()));
            }
            if (s instanceof class08468) {
                class014212.N(-class068892.N(), -class068892.y(), -class068892.L());
            }
            if (!s.O.isEmpty() && class01781.N(class012373 = class012372, class014213 = class014212, f = s.Q, var22 = s.O)) {
                class012373.N(class014213, f, var22);
            }
            if (!(s instanceof class08468)) {
                class014212.N(-class068892.N(), -class068892.y(), -class068892.L());
            }
            this.y(s, class069592, d, d2, d3, class014212, class012372, null);
            class014212.y();
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Rendering entity in world");
            class07074 class070742 = class070802.N("EntityRenderState being rendered");
            s.N(class070742);
            this.N(class045072, class070802);
            throw new class07878(class070802);
        }
    }

    private <T extends class06600> class08287<T> N(Map<class04208, class08287<T>> map, T t) {
        class04208 class042082 = ((class06618)t).Z().u();
        class08287<T> class082872 = map.get(class042082);
        if (class082872 != null) {
            return class082872;
        }
        return map.get(class04208.field_41123);
    }

    public void N(class05363 class053632, class07049 class070492) {
        this.y = class053632;
        this.L = class070492;
    }

    public <S extends class08800> class04507<?, ? super S> N(S s) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(s, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class04507)callbackInfoReturnable.getReturnValue();
        }
        if (s instanceof class08468) {
            class04208 class042082 = ((class08468)s).N.u();
            class04507 var4 = (class04507)this.R.get(class042082);
            if (var4 != null) {
                return var4;
            }
            return (class04507)this.R.get(class04208.field_41123);
        }
        return this.i.get(s.U);
    }

    public <T extends class07049> class04507<? super T, ?> N(T t) {
        T t2 = t;
        Objects.requireNonNull(t2);
        T t3 = t2;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class04477.class, class06603.class}, t3, (int)n)) {
            case 0 -> {
                class04477 var4_4 = (class04477)t3;
                yield this.N(this.R, var4_4);
            }
            case 1 -> {
                class06603 var5_5 = (class06603)t3;
                yield this.N(this.M, var5_5);
            }
            default -> this.i.get(t.method_5864());
        };
    }

    public <E extends class07049> boolean N(E e, class01383 class013832, double d, double d2, double d3) {
        return this.N(e).method_3933(e, class013832, d, d2, d3);
    }

    public class08287<class04477> N(class04477 class044772) {
        return this.N(this.R, class044772);
    }

    public void N() {
        this.y = null;
    }

    public void method_14491(class01089 class010892) {
        class04832 class048322 = new class04832(this, this.B, this.Z, this.z, class010892, this.m.get(), this.P, this.E, this.W, this.s);
        this.i = class04808.N((class04832)class048322);
        this.R = class04808.y((class04832)class048322);
        this.M = class04808.y((class04832)class048322);
        this.N(class010892, null, class048322);
        this.y(class010892, null, class048322);
    }

    public double renderPosY() {
        return this.y.y().B;
    }

    public double renderPosX() {
        return this.y.y().M;
    }

    public double renderPosZ() {
        return this.y.y().Z;
    }

    public class01894 fabric$getId() {
        if (this.T == null) {
            class01781 var1 = this;
            this.T = var1 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (var1 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (var1 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (var1 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (var1 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (var1 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (var1 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (var1 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (var1 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (var1 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (var1 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (var1 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (var1 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (var1 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (var1 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (var1 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (var1 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (var1 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + var1.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.T;
    }
}

