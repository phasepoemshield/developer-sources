/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10985
 *  Nursultan.class11806
 *  Nursultan.class11816
 *  Nursultan.class11938
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01631
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class04206
 *  minecraft.class04802
 *  minecraft.class04805
 *  minecraft.class05946
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class08467
 *  minecraft.class08468
 *  minecraft.class08719
 *  minecraft.class08720
 *  minecraft.class08725
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10985;
import Nursultan.class11806;
import Nursultan.class11816;
import Nursultan.class11938;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01631;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class04206;
import minecraft.class04802;
import minecraft.class04805;
import minecraft.class05946;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class08467;
import minecraft.class08468;
import minecraft.class08719;
import minecraft.class08720;
import minecraft.class08725;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02242<S extends class08467, M extends class06078<S>>
extends class06249<S, M> {
    private final class04805 N;
    private final class04805 y;
    private final class08720 L;
    private static final NamespacedId u = new NamespacedId("minecraft", "elytra_with_cape");

    public class02242(class06252<S, M> class062522, class01140 class011402, class08720 class087202) {
        super(class062522);
        this.N = new class04805(class011402.N(class04802.NC));
        this.y = new class04805(class011402.N(class04802.NS));
        this.L = class087202;
    }

    private void N(class01421 class014212, class01237 class012372, int n, class08467 class084672, float f, float f2, CallbackInfo callbackInfo) {
        class08468 class084682;
        if (WorldRenderingSettings.INSTANCE.getItemIds() == null) {
            return;
        }
        if (class084672 instanceof class08468) {
            class084682 = (class08468)class084672;
            if (class084682.N.y() != null && class084682.NG) {
                CapturedRenderingState.INSTANCE.setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt((Object)u));
                return;
            }
        }
        class084682 = class04206.B.y((Object)class06570.sT);
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt((Object)new NamespacedId(class084682.y(), class084682.N())));
    }

    private static void N(class08467 class084672, CallbackInfoReturnable callbackInfoReturnable) {
        if (class084672 instanceof class11806) {
            class10985 class109852 = class10985.N((class07049)((class07049)((class11816)((class11806)class084672).dataManager()).N().N()));
            class11938.L().L((Object)class109852);
            class01894 class018942 = class109852.N();
            if (class018942 != null) {
                callbackInfoReturnable.setReturnValue((Object)class018942);
            }
        }
    }

    private void N(CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
    }

    public void N(class01421 class014212, class01237 class012372, int n, S s, float f, float f2) {
        class06584 class065842 = ((class08467)s).H;
        class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
        if (class087252 == null || class087252.u().isEmpty()) {
            this.N(null);
            return;
        }
        class01894 class018942 = class02242.N(s);
        class04805 class048052 = ((class08467)s).NB ? this.y : this.N;
        this.N(class014212, class012372, n, (class08467)s, f, f2, null);
        class014212.N();
        class014212.N(0.0f, 0.0f, 0.125f);
        this.L.N(class08719.field_54127, (class05946)class087252.u().get(), (class06271)class048052, s, class065842, class014212, class012372, n, class018942, ((class08467)s).l, 0);
        class014212.y();
        this.N(null);
    }

    private static @Nullable class01894 N(class08467 class084672) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class02242.N(class084672, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class01894)callbackInfoReturnable.getReturnValue();
        }
        if (class084672 instanceof class08468) {
            class08468 class084682 = (class08468)class084672;
            class01631 class016312 = class084682.N;
            if (class016312.L() != null) {
                return class016312.L().y();
            }
            if (class016312.y() != null && class084682.NG) {
                return class016312.y().y();
            }
        }
        return null;
    }
}

