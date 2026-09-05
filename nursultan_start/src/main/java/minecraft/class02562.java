/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01188
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02484
 *  minecraft.class05946
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class08118
 *  minecraft.class08467
 *  minecraft.class08719
 *  minecraft.class08720
 *  minecraft.class08725
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer
 *  net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import minecraft.class01188;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02484;
import minecraft.class05946;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class08118;
import minecraft.class08467;
import minecraft.class08719;
import minecraft.class08720;
import minecraft.class08725;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class02562<S extends class08467, M extends class01188<S>, A extends class01188<S>>
extends class06249<S, M> {
    private final class08118<A> N;
    private final class08118<A> y;
    private final class08720 L;
    private class08467 u;

    public class02562(class06252<S, M> class062522, class08118<A> class081182, class08720 class087202) {
        this(class062522, class081182, class081182, class087202);
    }

    public class02562(class06252<S, M> class062522, class08118<A> class081182, class08118<A> class081183, class08720 class087202) {
        super(class062522);
        this.N = class081182;
        this.y = class081183;
        this.L = class087202;
    }

    private boolean N(class07085 class070852) {
        return class070852 == class07085.field_6172;
    }

    private A N(S s, class07085 class070852) {
        return (A)((class01188)(((class08467)s).NB ? this.y : this.N).N(class070852));
    }

    private void N(class01421 class014212, class01237 class012372, int n, class08467 class084672, float f, float f2, CallbackInfo callbackInfo) {
        this.u = class084672;
    }

    private void N(class01421 class014212, class01237 class012372, class06584 class065842, class07085 class070852, int n, class08467 class084672, CallbackInfo callbackInfo) {
        ArmorRenderer armorRenderer = ArmorRendererRegistryImpl.get((class06581)class065842.B());
        if (armorRenderer != null) {
            armorRenderer.render(class014212, class012372, class065842, this.u, class070852, n, (class01188)this.u());
            callbackInfo.cancel();
        }
    }

    public static boolean N(class06584 class065842, class07085 class070852) {
        class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
        return class087252 != null && class02562.N(class087252, class070852);
    }

    private static boolean N(class08725 class087252, class07085 class070852) {
        return class087252.u().isPresent() && class087252.y() == class070852;
    }

    public void N(class01421 class014212, class01237 class012372, int n, S s, float f, float f2) {
        this.N(class014212, class012372, n, (class08467)s, f, f2, null);
        this.N(class014212, class012372, ((class08467)s).H, class07085.field_6174, n, s);
        this.N(class014212, class012372, ((class08467)s).c, class07085.field_6172, n, s);
        this.N(class014212, class012372, ((class08467)s).X, class07085.field_6166, n, s);
        this.N(class014212, class012372, ((class08467)s).e, class07085.field_6169, n, s);
    }

    private void N(class01421 class014212, class01237 class012372, class06584 class065842, class07085 class070852, int n, S s) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class014212, class012372, class065842, class070852, n, (class08467)s, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
        if (class087252 == null || !class02562.N(class087252, class070852)) {
            return;
        }
        A a = this.N(s, class070852);
        class08719 class087192 = this.N(class070852) ? class08719.field_54126 : class08719.field_54125;
        this.L.N(class087192, (class05946)class087252.u().orElseThrow(), a, s, class065842, class014212, class012372, n, ((class08467)s).l);
    }
}

