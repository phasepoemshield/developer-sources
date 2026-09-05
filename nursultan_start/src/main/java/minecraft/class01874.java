/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09535
 *  Nursultan.class09538
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00417
 *  minecraft.class00458
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class00927
 *  minecraft.class00929
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class01635
 *  minecraft.class01651
 *  minecraft.class01654
 *  minecraft.class01656
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01683
 *  minecraft.class02037
 *  minecraft.class02182
 *  minecraft.class02275
 *  minecraft.class02301
 *  minecraft.class02570
 *  minecraft.class02817
 *  minecraft.class02857
 *  minecraft.class02879
 *  minecraft.class03077
 *  minecraft.class03554
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class04206
 *  minecraft.class04247
 *  minecraft.class04266
 *  minecraft.class04275
 *  minecraft.class05096
 *  minecraft.class05384
 *  minecraft.class06202
 *  minecraft.class06467
 *  minecraft.class06514
 *  minecraft.class07933
 *  minecraft.class08076
 *  minecraft.class08781
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking
 *  net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents$TagsLoaded
 *  net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions
 *  net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon
 *  net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl
 *  net.fabricmc.fabric.impl.recipe.sync.RecipeSyncImpl
 *  net.fabricmc.fabric.impl.recipe.sync.SupportedRecipeSerializersPayloadC2S
 *  net.fabricmc.fabric.mixin.networking.client.accessor.ClientConfigurationPacketListenerImplAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09535;
import Nursultan.class09538;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00417;
import minecraft.class00458;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class00927;
import minecraft.class00929;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class01635;
import minecraft.class01651;
import minecraft.class01654;
import minecraft.class01656;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01683;
import minecraft.class01866;
import minecraft.class01892;
import minecraft.class01894;
import minecraft.class02037;
import minecraft.class02182;
import minecraft.class02275;
import minecraft.class02301;
import minecraft.class02570;
import minecraft.class02817;
import minecraft.class02857;
import minecraft.class02879;
import minecraft.class03077;
import minecraft.class03554;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class04206;
import minecraft.class04247;
import minecraft.class04266;
import minecraft.class04275;
import minecraft.class05096;
import minecraft.class05384;
import minecraft.class06202;
import minecraft.class06467;
import minecraft.class06514;
import minecraft.class07933;
import minecraft.class08076;
import minecraft.class08781;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import net.fabricmc.fabric.impl.recipe.sync.RecipeSyncImpl;
import net.fabricmc.fabric.impl.recipe.sync.SupportedRecipeSerializersPayloadC2S;
import net.fabricmc.fabric.mixin.networking.client.accessor.ClientConfigurationPacketListenerImplAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class01874
extends class01866
implements class01656,
class03077,
NetworkHandlerExtensions,
ClientConfigurationPacketListenerImplAccessor {
    public static final Logger N = LogUtils.getLogger();
    public static final class00392 y = class00392.L((String)"multiplayer.disconnect.code_of_conduct");
    private final class05384 P;
    private final GameProfile s;
    private class03767 T;
    private final class01022 b;
    private final class02879 j = new class02879();
    private @Nullable class02301 v;
    protected @Nullable class06467 m;
    private boolean n;
    private ClientConfigurationNetworkAddon t;

    private void L(class01651 class016512, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
            this.u.field_11651.config().setAutoRead(true);
        }
    }

    public ClientConfigurationNetworkAddon getAddon() {
        return this.t;
    }

    public class01874(class06202 class062022, class00642 class006422, class01892 class018922) {
        super(class062022, class006422, class018922);
        this.P = class018922.N();
        this.s = class018922.y();
        this.b = class018922.u();
        this.T = class018922.i();
        this.m = class018922.z();
        this.N((CallbackInfo)null);
    }

    @Override
    protected class08781 n() {
        return new class09538(this);
    }

    private void y(class01651 class016512, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
            this.u.field_11651.config().setAutoRead(false);
        }
    }

    private void y(class01659 class016592) {
        N.warn("Unknown custom packet payload: {}", (Object)class016592.method_56479().N());
    }

    private void N(class02817 class028172, CallbackInfo callbackInfo) {
        if (!ClientConfigurationNetworking.canSend((class01666)SupportedRecipeSerializersPayloadC2S.ID)) {
            return;
        }
        HashSet<class01894> hashSet = new HashSet<class01894>();
        for (class06514 var5 : RecipeSyncImpl.getSyncedSerializers()) {
            hashSet.add(class04206.j.y((Object)var5));
        }
        if (hashSet.isEmpty()) {
            return;
        }
        ClientConfigurationNetworking.send((class01659)new SupportedRecipeSerializersPayloadC2S(hashSet));
    }

    public void N(class01654 class016542) {
        class00417.N((class00381)class016542, (class00638)this, (class00458)this.L.B());
        this.j.N(class016542.N(), class016542.y());
    }

    private void N(CallbackInfo callbackInfo) {
        this.t = new ClientConfigurationNetworkAddon(this, this.L);
        ClientNetworkingImpl.setClientConfigurationAddon((ClientConfigurationNetworkAddon)this.t);
        this.t.lateInit();
    }

    public void N(class01651 class016512, CallbackInfo callbackInfo) {
        this.t.handleComplete();
    }

    private void N(class02857 class028572, CallbackInfoReturnable callbackInfoReturnable) {
        ((CommonLifecycleEvents.TagsLoaded)CommonLifecycleEvents.TAGS_LOADED.invoker()).onTagsLoaded((class01042)callbackInfoReturnable.getReturnValue(), true);
    }

    private <T> T N(Function<class02857, T> function) {
        if (this.v == null) {
            return function.apply(class02857.L);
        }
        try (class03554 class035542 = this.v.N();){
            T t = function.apply((class02857)class035542);
            return t;
        }
    }

    public void N(class02182 class021822) {
        this.m = null;
    }

    public void N(class02817 class028172) {
        class00417.N((class00381)class028172, (class00638)this, (class00458)this.L.B());
        if (this.v == null) {
            this.v = new class02301();
        }
        List var2 = this.v.N(class028172.N());
        this.N((class00381<?>)new class02275(var2));
        this.N(class028172, null);
    }

    public void N(class02037 class020372) {
        this.T = class03794.i.N((Iterable)class020372.N());
    }

    @Override
    protected void N(class01659 class016592) {
        this.y(class016592);
    }

    public void N(class08076 class080762) {
        class00417.N((class00381)class080762, (class00638)this, (class00458)this.L.B());
        this.j.N(class080762.N());
    }

    public void N(class00927 class009272) {
        class00417.N((class00381)class009272, (class00638)this, (class00458)this.L.B());
        if (this.n) {
            throw new IllegalStateException("Server sent duplicate Code of Conduct");
        }
        this.n = true;
        String string = class009272.N();
        if (this.i != null && this.i.N(string)) {
            this.N((class00381<?>)class00929.N);
        } else {
            class05096 class050962 = (class05096)this.L.v_3;
            this.L.N((class05096)new class07933(this.i, class050962, string, bl -> {
                if (bl) {
                    this.N((class00381<?>)class00929.N);
                    this.L.N(class050962);
                } else {
                    this.n().N(y);
                }
            }));
        }
    }

    public void N(class01651 class016512) {
        this.y(class016512, null);
        class00417.N((class00381)class016512, (class00638)this, (class00458)this.L.B());
        class01022 class010222 = this.N((class02857 class028572) -> {
            class01022 class010222 = this.j.N(class028572, this.b, this.u.method_10756());
            this.N((class02857)class028572, new CallbackInfoReturnable("", false, (Object)class010222));
            return class010222;
        });
        class04275 class042752 = class04266.L.N(class04247.N((class01042)class010222));
        this.N(class016512, null);
        this.u.method_56330(class042752, (class00638)new class01683(this.L, this.u, new class01892(this.P, this.s, this.M, class010222, this.T, this.R, this.i, this.B, this.z, this.m, this.U, this.o(), this.E, this.W)));
        this.u.method_10743((class00381)class01635.N);
        this.u.method_56329(class04266.y.N(class04247.N((class01042)class010222), (Object)new class09535(this)));
        this.L(class016512, null);
    }

    public boolean method_48106() {
        return this.u.method_10758();
    }

    @Override
    public void method_10839(class02570 class025702) {
        super.method_10839(class025702);
        this.L.l();
    }

    public void method_18784() {
        this.K();
    }

    public /* synthetic */ GameProfile getProfile() {
        return this.s;
    }
}

