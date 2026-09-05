/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10985
 *  Nursultan.class11806
 *  Nursultan.class11816
 *  Nursultan.class11938
 *  minecraft.class01140
 *  minecraft.class01188
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01631
 *  minecraft.class01894
 *  minecraft.class02423
 *  minecraft.class02484
 *  minecraft.class02721
 *  minecraft.class04802
 *  minecraft.class05946
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06584
 *  minecraft.class06851
 *  minecraft.class07049
 *  minecraft.class08468
 *  minecraft.class08718
 *  minecraft.class08719
 *  minecraft.class08725
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents
 *  net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents$AllowCapeRender
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10985;
import Nursultan.class11806;
import Nursultan.class11816;
import Nursultan.class11938;
import minecraft.class01140;
import minecraft.class01188;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01631;
import minecraft.class01894;
import minecraft.class02423;
import minecraft.class02484;
import minecraft.class02721;
import minecraft.class04802;
import minecraft.class05946;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06584;
import minecraft.class06851;
import minecraft.class07049;
import minecraft.class08468;
import minecraft.class08718;
import minecraft.class08719;
import minecraft.class08725;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class02549
extends class06249<class08468, class02721> {
    private final class01188<class08468> N;
    private final class08718 y;
    private static final NamespacedId L = new NamespacedId("minecraft", "player_cape");

    public class02549(class06252<class08468, class02721> class062522, class01140 class011402, class08718 class087182) {
        super(class062522);
        this.N = new class02423(class011402.N(class04802.LI));
        this.y = class087182;
    }

    private void y(class01421 class014212, class01237 class012372, int n, class08468 class084682, float f, float f2, CallbackInfo callbackInfo) {
        if (!(class084682 instanceof class11806)) {
            return;
        }
        class11806 class118062 = (class11806)class084682;
        class10985 class109852 = class10985.N((class07049)((class07049)((class11816)class118062.dataManager()).N().N()));
        class11938.L().L((Object)class109852);
        class01894 class018942 = class109852.N();
        if (class018942 == null) {
            return;
        }
        if (class084682.v) {
            callbackInfo.cancel();
            return;
        }
        if (this.N(class084682.H, class08719.field_54127)) {
            callbackInfo.cancel();
            return;
        }
        class014212.N();
        if (this.N(class084682.H, class08719.field_54125)) {
            class014212.N(0.0f, -0.053125f, 0.06875f);
        }
        class012372.N(this.N, (Object)class084682, class014212, class06851.u((class01894)class018942), n, class01384.u, class084682.l, null);
        class014212.y();
        callbackInfo.cancel();
    }

    private void N(class01421 class014212, class01237 class012372, int n, class08468 class084682, float f, float f2, CallbackInfo callbackInfo) {
        if (WorldRenderingSettings.INSTANCE.getItemIds() == null) {
            return;
        }
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt((Object)L));
    }

    private void N(CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08468 class084682, float f, float f2, CallbackInfo callbackInfo, class08468 class084683) {
        if (!((LivingEntityFeatureRenderEvents.AllowCapeRender)LivingEntityFeatureRenderEvents.ALLOW_CAPE_RENDER.invoker()).allowCapeRender(class084683)) {
            callbackInfo.cancel();
        }
    }

    private boolean N(class06584 class065842, class08719 class087192) {
        class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
        if (class087252 == null || class087252.u().isEmpty()) {
            return false;
        }
        return !this.y.N((class05946)class087252.u().get()).N(class087192).isEmpty();
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08468 class084682, float f, float f2) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class014212, class012372, n, class084682, f, f2, callbackInfo, class084682);
        if (callbackInfo.isCancelled()) {
            return;
        }
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.y(class014212, class012372, n, class084682, f, f2, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        if (class084682.v || !class084682.NG) {
            this.N(null);
            return;
        }
        class01631 class016312 = class084682.N;
        if (class016312.y() == null) {
            this.N(null);
            return;
        }
        if (this.N(class084682.H, class08719.field_54127)) {
            this.N(null);
            return;
        }
        this.N(class014212, class012372, n, class084682, f, f2, null);
        class014212.N();
        if (this.N(class084682.H, class08719.field_54125)) {
            class014212.N(0.0f, -0.053125f, 0.06875f);
        }
        class012372.N(this.N, (Object)class084682, class014212, class06851.u((class01894)class016312.y().y()), n, class01384.u, class084682.l, null);
        class014212.y();
        this.N(null);
    }
}

