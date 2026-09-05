/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00183
 *  minecraft.class00500
 *  minecraft.class00951
 *  minecraft.class01089
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01587
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class02416
 *  minecraft.class02730
 *  minecraft.class03579
 *  minecraft.class03760
 *  minecraft.class03770
 *  minecraft.class04688
 *  minecraft.class04866
 *  minecraft.class05474
 *  minecraft.class05885
 *  minecraft.class06069
 *  minecraft.class06141
 *  minecraft.class06176
 *  minecraft.class06898
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07878
 *  minecraft.class08097
 *  minecraft.class08117
 *  minecraft.class08212
 *  minecraft.class08290
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08718
 *  minecraft.class08743
 *  minecraft.class08877
 *  minecraft.class08887
 *  minecraft.class09033
 *  net.caffeinemc.mods.sodium.mixin.frapi.BlockRenderDispatcherAccessor
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.render.FabricBlockModelRenderer
 *  net.fabricmc.fabric.api.renderer.v1.render.FabricBlockRenderManager
 *  net.fabricmc.fabric.api.renderer.v1.render.RenderLayerHelper
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import minecraft.class00183;
import minecraft.class00500;
import minecraft.class00951;
import minecraft.class01089;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01587;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class02020;
import minecraft.class02416;
import minecraft.class02730;
import minecraft.class03579;
import minecraft.class03760;
import minecraft.class03770;
import minecraft.class04688;
import minecraft.class04866;
import minecraft.class05474;
import minecraft.class05885;
import minecraft.class06069;
import minecraft.class06141;
import minecraft.class06176;
import minecraft.class06898;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07878;
import minecraft.class08097;
import minecraft.class08117;
import minecraft.class08212;
import minecraft.class08290;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08718;
import minecraft.class08743;
import minecraft.class08877;
import minecraft.class08887;
import minecraft.class09033;
import net.caffeinemc.mods.sodium.mixin.frapi.BlockRenderDispatcherAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.FabricBlockModelRenderer;
import net.fabricmc.fabric.api.renderer.v1.render.FabricBlockRenderManager;
import net.fabricmc.fabric.api.renderer.v1.render.RenderLayerHelper;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class01999
implements class06141,
BlockRenderDispatcherAccessor,
FabricBlockRenderManager,
FabricResourceReloader {
    private final class03770 N;
    private final class08097 y;
    private final class02020 L;
    private @Nullable class03760 u;
    private final class06069 i = class06069.u();
    private final List<class08877> R = new ArrayList<class08877>();
    private final class01587 M;
    private class01894 B;

    public class01999(class03770 class037702, class08097 class080972, class01587 class015872) {
        this.N = class037702;
        this.y = class080972;
        this.M = class015872;
        this.L = new class02020(this.M);
    }

    public class02020 y() {
        return this.L;
    }

    private void N(class00500 class005002, class07209 class072092, class07295 class072952, class01421 class014212, class01391 class013912, CallbackInfo callbackInfo, class08887 class088872) {
        this.L.render(class072952, class088872, class005002, class072092, class014212, class087432 -> class013912, true, class005002.y(class072092), class01384.u);
        callbackInfo.cancel();
    }

    private void N(class01423 class014232, class01391 class013912, class08887 class088872, float f, float f2, float f3, int n, int n2, class00500 class005002, class01421 class014212, class01407 class014072, int n3, int n4) {
        FabricBlockModelRenderer.render((class01423)class014232, class087432 -> class014072.method_73477(RenderLayerHelper.getEntityBlockLayer((class08743)class087432)), (class08887)class088872, (float)f, (float)f2, (float)f3, (int)n, (int)n2, (class07295)class02730.field_52611, (class07209)class07209.field_10980, (class00500)class005002);
    }

    private void N(class01423 class014232, class01407 class014072, class08887 class088872, float f, float f2, float f3, int n, int n2, class07295 class072952, class07209 class072092, class00500 class005002) {
        FabricBlockModelRenderer.render((class01423)class014232, class087432 -> class014072.method_73477(RenderLayerHelper.getEntityBlockLayer((class08743)class087432)), (class08887)class088872, (float)f, (float)f2, (float)f3, (int)n, (int)n2, (class07295)class072952, (class07209)class072092, (class00500)class005002);
    }

    public void N(class07209 class072092, class07295 class072952, class01391 class013912, class00500 class005002, class04688 class046882) {
        try {
            Objects.requireNonNull(this.u).N(class072952, class072092, class013912, class005002, class046882);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Tesselating liquid in world");
            class07074.N((class07074)class070802.N("Block being tesselated"), (class05474)class072952, (class07209)class072092, (class00500)class005002);
            throw new class07878(class070802);
        }
    }

    public void N(class00500 class005002, class07209 class072092, class07295 class072952, class01421 class014212, class01391 class013912, boolean bl, List<class08877> list) {
        try {
            this.L.N(class072952, list, class005002, class072092, class014212, class013912, bl, class01384.u);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Tesselating block in world");
            class07074.N((class07074)class070802.N("Block being tesselated"), (class05474)class072952, (class07209)class072092, (class00500)class005002);
            throw new class07878(class070802);
        }
    }

    public void N(class00500 class005002, class07209 class072092, class07295 class072952, class01421 class014212, class01391 class013912) {
        if (class005002.b() != class06898.field_11458) {
            return;
        }
        class08887 class088872 = this.N.y(class005002);
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class005002, class072092, class072952, class014212, class013912, callbackInfo, class088872);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.i.N(class005002.y(class072092));
        this.R.clear();
        class088872.method_68513(this.i, this.R);
        this.L.N(class072952, this.R, class005002, class072092, class014212, class013912, true, class01384.u);
    }

    public class03770 N() {
        return this.N;
    }

    public void N(class00500 class005002, class01421 class014212, class01407 class014072, int n, int n2) {
        if (class005002.b() == class06898.field_11455) {
            return;
        }
        class08887 class088872 = this.N(class005002);
        int n3 = this.M.N(class005002, null, null, 0);
        float f = (float)(n3 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n3 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n3 & 0xFF) / 255.0f;
        int n4 = n2;
        int n5 = n;
        float f4 = f3;
        float f5 = f2;
        float f6 = f;
        class08887 class088873 = class088872;
        class01391 class013912 = class014072.method_73477(class05885.L((class00500)class005002));
        class01423 class014232 = class014212.L();
        this.N(class014232, class013912, class088873, f6, f5, f4, n5, n4, class005002, class014212, class014072, n, n2);
    }

    public class08887 N(class00500 class005002) {
        return this.N.y(class005002);
    }

    public void method_14491(class01089 class010892) {
        this.u = new class03760(this.y);
    }

    public class01894 fabric$getId() {
        if (this.B == null) {
            class01999 var1 = this;
            this.B = var1 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (var1 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (var1 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (var1 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (var1 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (var1 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (var1 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (var1 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (var1 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (var1 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (var1 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (var1 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (var1 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (var1 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (var1 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (var1 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (var1 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (var1 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + var1.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.B;
    }
}

