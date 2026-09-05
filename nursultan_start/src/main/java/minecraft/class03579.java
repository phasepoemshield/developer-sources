/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  minecraft.class00183
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00951
 *  minecraft.class00985
 *  minecraft.class01089
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01590
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02416
 *  minecraft.class02862
 *  minecraft.class03358
 *  minecraft.class04811
 *  minecraft.class04826
 *  minecraft.class04866
 *  minecraft.class05363
 *  minecraft.class06141
 *  minecraft.class06176
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07878
 *  minecraft.class07949
 *  minecraft.class08097
 *  minecraft.class08117
 *  minecraft.class08141
 *  minecraft.class08212
 *  minecraft.class08290
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08718
 *  minecraft.class08943
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00183;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00951;
import minecraft.class00985;
import minecraft.class01089;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01590;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02416;
import minecraft.class02862;
import minecraft.class03358;
import minecraft.class04811;
import minecraft.class04826;
import minecraft.class04866;
import minecraft.class05363;
import minecraft.class06141;
import minecraft.class06176;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07878;
import minecraft.class07949;
import minecraft.class08097;
import minecraft.class08117;
import minecraft.class08141;
import minecraft.class08212;
import minecraft.class08290;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08718;
import minecraft.class08943;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class03579
implements class06141,
FabricResourceReloader {
    private Map<class00404<?>, class03358<?, ?>> N = ImmutableMap.of();
    private final class01590 y;
    private final Supplier<class01140> L;
    private class06889 u;
    private final class01999 i;
    private final class08943 R;
    private final class02862 M;
    private final class01781 B;
    private final class08097 Z;
    private final class07949 z;
    private class01894 U;
    private static final String E = "Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderDispatcher;tryRender(Lnet/minecraft/world/level/block/entity/BlockEntity;Ljava/lang/Runnable;)V";

    public class03579(class01590 class015902, Supplier<class01140> supplier, class01999 class019992, class08943 class089432, class02862 class028622, class01781 class017812, class08097 class080972, class07949 class079492) {
        this.M = class028622;
        this.R = class089432;
        this.B = class017812;
        this.y = class015902;
        this.L = supplier;
        this.i = class019992;
        this.Z = class080972;
        this.z = class079492;
    }

    private void y(class00985 class009852, class01421 class014212, class01237 class012372, class06959 class069592, CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
        ImmediateState.isRenderingBEs = false;
    }

    private void N(class00985 class009852, class01421 class014212, class01237 class012372, class06959 class069592, CallbackInfo callbackInfo) {
        Object2IntMap var6 = WorldRenderingSettings.INSTANCE.getBlockStateIds();
        ImmediateState.isRenderingBEs = true;
        if (var6 == null || !ImmediateState.isRenderingLevel) {
            return;
        }
        int n = var6.applyAsInt((Object)class009852.M);
        CapturedRenderingState.INSTANCE.setCurrentBlockEntity(n);
    }

    public <S extends class00985> void N(S s, class01421 class014212, class01237 class012372, class06959 class069592) {
        class03358 class033582 = this.N(s);
        this.N(s, class014212, class012372, class069592, null);
        class03358 class033583 = class033582;
        if (class033583 == null) {
            this.y(s, class014212, class012372, class069592, null);
            return;
        }
        try {
            class033583.N(s, class014212, class012372, class069592);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Rendering Block Entity");
            class07074 class070742 = class070802.N("Block Entity Details");
            s.N(class070742);
            throw new class07878(class070802);
        }
        this.y(s, class014212, class012372, class069592, null);
    }

    public <E extends class00394, S extends class00985> @Nullable class03358<E, S> N(E e) {
        return this.N.get(e.O());
    }

    public <E extends class00394, S extends class00985> @Nullable S N(E e, float f, @Nullable class08141 class081412) {
        class03358<E, E> class033582 = this.N((S)e);
        if (class033582 == null) {
            return null;
        }
        if (!e.l() || !e.O().method_20526(e.w())) {
            return null;
        }
        if (!class033582.N(e, this.u)) {
            return null;
        }
        class06889 class068892 = this.u;
        class00985 class009852 = class033582.i();
        class033582.N(e, class009852, f, class068892, class081412);
        return (S)class009852;
    }

    public void N(class05363 class053632) {
        this.u = class053632.y();
    }

    public <E extends class00394, S extends class00985> @Nullable class03358<E, S> N(S s) {
        return this.N.get(s.B);
    }

    public void method_14491(class01089 class010892) {
        class04811 class048112 = new class04811(this, this.i, this.R, this.M, this.B, this.L.get(), this.y, this.Z, this.z);
        this.N = class04826.N((class04811)class048112);
    }

    public class01894 fabric$getId() {
        if (this.U == null) {
            class03579 var1 = this;
            this.U = var1 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (var1 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (var1 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (var1 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (var1 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (var1 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (var1 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (var1 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (var1 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (var1 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (var1 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (var1 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (var1 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (var1 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (var1 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (var1 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (var1 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (var1 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + var1.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.U;
    }
}

