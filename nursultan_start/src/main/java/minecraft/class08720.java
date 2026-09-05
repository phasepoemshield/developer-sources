/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11647
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class02566
 *  minecraft.class02816
 *  minecraft.class03246
 *  minecraft.class03252
 *  minecraft.class03254
 *  minecraft.class04206
 *  minecraft.class05911
 *  minecraft.class05946
 *  minecraft.class06271
 *  minecraft.class06584
 *  minecraft.class06851
 *  minecraft.class07311
 *  minecraft.class07536
 *  minecraft.class08388
 *  minecraft.class08626
 *  net.irisshaders.iris.helpers.EntityState
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11647;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class02566;
import minecraft.class02816;
import minecraft.class03246;
import minecraft.class03252;
import minecraft.class03254;
import minecraft.class04206;
import minecraft.class05911;
import minecraft.class05946;
import minecraft.class06271;
import minecraft.class06584;
import minecraft.class06851;
import minecraft.class07311;
import minecraft.class07536;
import minecraft.class08388;
import minecraft.class08626;
import minecraft.class08689;
import minecraft.class08691;
import minecraft.class08706;
import minecraft.class08718;
import minecraft.class08719;
import minecraft.class08726;
import net.irisshaders.iris.helpers.EntityState;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08720 {
    private static final int N = 0;
    private final class08718 y;
    private final Function<class08726, class01894> L;
    private final Function<class08691, class08388> u;
    private static final String i = "Lnet/minecraft/client/renderer/entity/layers/EquipmentLayerRenderer;renderLayers(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lnet/minecraft/world/item/ItemStack;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;II)V";

    public class08720(class08718 class087182, class08626 class086262) {
        this.y = class087182;
        this.L = class07536.y_4(class087262 -> class087262.y().N(class087262.N()));
        this.u = class07536.y_4(class086912 -> class086262.N(class086912.N()));
    }

    private void y(CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
    }

    private void N(CallbackInfo callbackInfo, class06584 class065842) {
        if (WorldRenderingSettings.INSTANCE.getItemIds() == null) {
            return;
        }
        class01894 class018942 = (class01894)class065842.method_58694(class02484.E);
        if (class018942 == null) {
            class018942 = class04206.B.y((Object)class065842.B());
        }
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt((Object)new NamespacedId(class018942.y(), class018942.N())));
    }

    private void N(CallbackInfo callbackInfo, class03254 class032542) {
        if (WorldRenderingSettings.INSTANCE.getItemIds() == null) {
            return;
        }
        EntityState.interposeItemId((int)WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt((Object)new NamespacedId("minecraft", "trim_" + ((class03252)class032542.N().N()).N().N().N())));
    }

    private void N(CallbackInfo callbackInfo) {
        EntityState.restoreItemId();
    }

    public <S> void N(class08719 class087192, class05946<class11647> class059462, class06271<? super S> class062712, S s, class06584 class065842, class01421 class014212, class01237 class012372, int n, @Nullable class01894 class018942, int n2, int n3) {
        List<class08706> list = this.y.N(class059462).N(class087192);
        if (list.isEmpty()) {
            return;
        }
        int n4 = class02816.N((class06584)class065842, (int)0);
        boolean bl = class065842.Q();
        int n5 = n3;
        for (class08706 class087062 : list) {
            int n6 = class08720.N(class087062, n4);
            if (n6 == 0) continue;
            this.N(null, class065842);
            class01894 class018943 = class087062.L() && class018942 != null ? class018942 : this.L.apply(new class08726(class087192, class087062));
            class012372.N(n5++).N(class062712, s, class014212, class06851.N((class01894)class018943), n, class01384.u, n6, null, n2, null);
            if (bl) {
                class012372.N(n5++).N(class062712, s, class014212, class06851.R(), n, class01384.u, n6, null, n2, null);
            }
            bl = false;
        }
        class03254 class032542 = (class03254)class065842.method_58694(class02484.Nu);
        if (class032542 != null) {
            class08706 class087062;
            this.N(null, class032542);
            class087062 = this.u.apply(new class08691(class032542, class087192, class059462));
            class07311 class073112 = class05911.N((boolean)((class03246)class032542.y().N()).L());
            class012372.N(n5++).N(class062712, s, class014212, class073112, n, class01384.u, -1, (class08388)class087062, n2, null);
            this.N(null);
        }
        this.y(null);
    }

    private static int N(class08706 class087062, int n) {
        Optional<class08689> optional = class087062.y();
        if (optional.isPresent()) {
            int n2 = optional.get().N().map(class02566::M).orElse(0);
            return n != 0 ? n : n2;
        }
        return -1;
    }

    public <S> void N(class08719 class087192, class05946<class11647> class059462, class06271<? super S> class062712, S s, class06584 class065842, class01421 class014212, class01237 class012372, int n, int n2) {
        this.N(class087192, class059462, class062712, s, class065842, class014212, class012372, n, null, n2, 1);
    }
}

