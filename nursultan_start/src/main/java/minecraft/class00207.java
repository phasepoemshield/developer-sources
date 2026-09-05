/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class04206
 *  minecraft.class05946
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06584
 *  minecraft.class08476
 *  minecraft.class08719
 *  minecraft.class08720
 *  minecraft.class08725
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.function.Function;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class04206;
import minecraft.class05946;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06584;
import minecraft.class08476;
import minecraft.class08719;
import minecraft.class08720;
import minecraft.class08725;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00207<S extends class08476, RM extends class06078<? super S>, EM extends class06078<? super S>>
extends class06249<S, RM> {
    private final class08720 N;
    private final class08719 y;
    private final Function<S, class06584> L;
    private final EM u;
    private final @Nullable EM i;
    private final int R;

    public class00207(class06252<S, RM> class062522, class08720 class087202, class08719 class087192, Function<S, class06584> function, EM EM, @Nullable EM EM2, int n) {
        super(class062522);
        this.N = class087202;
        this.y = class087192;
        this.L = function;
        this.u = EM;
        this.i = EM2;
        this.R = n;
    }

    public class00207(class06252<S, RM> class062522, class08720 class087202, class08719 class087192, Function<S, class06584> function, EM EM, @Nullable EM EM2) {
        this(class062522, class087202, class087192, function, EM, EM2, 0);
    }

    private void N(class01421 class014212, class01237 class012372, int n, class08476 class084762, float f, float f2, CallbackInfo callbackInfo, class06584 class065842) {
        if (WorldRenderingSettings.INSTANCE.getItemIds() == null) {
            return;
        }
        class01894 class018942 = class04206.B.y((Object)class065842.B());
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt((Object)new NamespacedId(class018942.y(), class018942.N())));
    }

    private void N(CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
    }

    public void N(class01421 class014212, class01237 class012372, int n, S s, float f, float f2) {
        class06584 class065842 = this.L.apply(s);
        class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
        if (class087252 == null || class087252.u().isEmpty() || ((class08476)s).NB && this.i == null) {
            return;
        }
        EM EM = ((class08476)s).NB ? this.i : this.u;
        class05946 class059462 = (class05946)class087252.u().get();
        int n2 = ((class08476)s).l;
        this.N(class014212, class012372, n, (class08476)s, f, f2, null, class065842);
        this.N.N(this.y, class059462, EM, s, class065842, class014212, class012372, n, null, n2, this.R);
        this.N(null);
    }
}

