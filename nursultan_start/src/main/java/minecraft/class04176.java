/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00417
 *  minecraft.class00458
 *  minecraft.class00489
 *  minecraft.class00541
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class00914
 *  minecraft.class00929
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class01062
 *  minecraft.class01635
 *  minecraft.class01644
 *  minecraft.class01659
 *  minecraft.class01667
 *  minecraft.class02003
 *  minecraft.class02037
 *  minecraft.class02243
 *  minecraft.class02275
 *  minecraft.class02290
 *  minecraft.class02570
 *  minecraft.class02581
 *  minecraft.class02794
 *  minecraft.class02796
 *  minecraft.class03077
 *  minecraft.class03713
 *  minecraft.class03737
 *  minecraft.class03794
 *  minecraft.class04247
 *  minecraft.class04266
 *  minecraft.class07367
 *  minecraft.class08758
 *  minecraft.class08774
 *  net.fabricmc.fabric.api.networking.v1.FabricServerConfigurationNetworkHandler
 *  net.fabricmc.fabric.impl.networking.FabricRegistryByteBuf
 *  net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions
 *  net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon
 *  net.fabricmc.fabric.impl.resource.pack.FabricOriginalKnownPacksGetter
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00417;
import minecraft.class00458;
import minecraft.class00489;
import minecraft.class00541;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class00914;
import minecraft.class00929;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class01062;
import minecraft.class01635;
import minecraft.class01644;
import minecraft.class01659;
import minecraft.class01667;
import minecraft.class02003;
import minecraft.class02037;
import minecraft.class02243;
import minecraft.class02275;
import minecraft.class02290;
import minecraft.class02570;
import minecraft.class02581;
import minecraft.class02794;
import minecraft.class02796;
import minecraft.class03077;
import minecraft.class03713;
import minecraft.class03737;
import minecraft.class03794;
import minecraft.class04156;
import minecraft.class04159;
import minecraft.class04171;
import minecraft.class04174;
import minecraft.class04188;
import minecraft.class04247;
import minecraft.class04266;
import minecraft.class07367;
import minecraft.class08758;
import minecraft.class08774;
import net.fabricmc.fabric.api.networking.v1.FabricServerConfigurationNetworkHandler;
import net.fabricmc.fabric.impl.networking.FabricRegistryByteBuf;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon;
import net.fabricmc.fabric.impl.resource.pack.FabricOriginalKnownPacksGetter;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04176
extends class04156
implements class01667,
class03077,
FabricServerConfigurationNetworkHandler,
NetworkHandlerExtensions {
    private static final Logger N = LogUtils.getLogger();
    private static final class00392 y = class00392.L((String)"multiplayer.disconnect.invalid_player_data");
    private static final class00392 L = class00392.L((String)"multiplayer.disconnect.configuration_error");
    private final GameProfile u;
    private final Queue<class04188> i = new ConcurrentLinkedQueue<class04188>();
    private @Nullable class04188 M;
    private class03737 B;
    private @Nullable class02290 Z;
    private @Nullable class08758 z;
    private ServerConfigurationNetworkAddon U;
    private boolean E;
    private boolean W;

    public void L() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.y(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.method_14364((class00381<?>)new class00489((class01659)new class01644(this.field_45012.Ng())));
        class02243 class022432 = this.field_45012.NU();
        if (!class022432.N()) {
            this.method_14364((class00381<?>)new class02581(class022432.y()));
        }
        class02003 var2 = this.field_45012.yG();
        List list = this.field_45012.yw().y().flatMap(class016222 -> class016222.method_56926().u().stream()).toList();
        this.method_14364((class00381<?>)new class02037(class03794.i.y(this.field_45012.yn().K())));
        class02003 var6 = var2;
        List list2 = list;
        this.Z = new class02290(this.N(list2), var6);
        this.i.add((class04188)this.Z);
        this.R();
        this.u();
    }

    private void M() {
        if (this.M != null) {
            throw new IllegalStateException("Task " + this.M.method_52375().N() + " has not finished yet");
        }
        if (!this.method_48106()) {
            return;
        }
        class04188 class041882 = this.i.poll();
        if (class041882 != null) {
            this.M = class041882;
            try {
                class041882.method_52376(this::method_14364);
            }
            catch (Exception exception) {
                N.error("Failed to start configuration task {}", (Object)class041882.method_52375(), (Object)exception);
                this.method_52396(L);
            }
        }
    }

    public class04176(class02796 class027962, class00642 class006422, class03713 class037132) {
        super(class027962, class006422, class037132);
        this.u = class037132.N();
        this.B = class037132.L();
        this.N((CallbackInfo)null);
    }

    private boolean B() {
        if (!this.W) {
            throw new IllegalStateException("Early task execution has finished");
        }
        if (this.M != null) {
            throw new IllegalStateException("Task " + this.M.method_52375().N() + " has not finished yet");
        }
        if (!this.method_48106()) {
            return false;
        }
        class04188 class041882 = this.i.poll();
        if (class041882 != null) {
            this.M = class041882;
            class041882.method_52376(this::method_14364);
            return true;
        }
        return false;
    }

    public ServerConfigurationNetworkAddon getAddon() {
        return this.U;
    }

    public void u() {
        this.z = new class08758(this.field_45012, new class08774(this.u));
        this.i.add((class04188)this.z);
        this.i.add(new class04171());
        this.M();
    }

    private void y(CallbackInfo callbackInfo) {
        if (this.U.startConfiguration()) {
            if (this.M != null) {
                throw new IllegalStateException("A task is already running: " + this.M.method_52375().N());
            }
            callbackInfo.cancel();
            return;
        }
        if (!this.E) {
            this.U.preConfiguration();
            this.E = true;
            this.W = true;
        }
        if (this.W) {
            if (this.B()) {
                callbackInfo.cancel();
                return;
            }
            this.W = false;
        }
        if (this.M != null || !this.i.isEmpty()) {
            throw new IllegalStateException("All early tasks should have been completed, current: " + String.valueOf(this.M) + ", queued: " + this.i.size());
        }
        this.U.configuration();
    }

    private Function N(class01042 class010422, Operation operation) {
        return ((Function)operation.call(new Object[]{class010422})).andThen(class042472 -> {
            ((FabricRegistryByteBuf)class042472).fabric_setSendableConfigurationChannels(Set.copyOf(this.U.getSendableChannels()));
            return class042472;
        });
    }

    private void N(CallbackInfo callbackInfo) {
        this.U = new ServerConfigurationNetworkAddon(this, this.field_45012);
        this.U.lateInit();
    }

    public List N(List list) {
        return ((FabricOriginalKnownPacksGetter)this.field_45012).fabric$getOriginalKnownPacks().stream().filter(list::contains).toList();
    }

    public void N(class02275 class022752) {
        class00417.N((class00381)class022752, (class00638)this, (class00458)this.field_45012.yK());
        if (this.Z == null) {
            throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
        }
        this.Z.N(class022752.N(), this::method_14364);
        this.N(class02290.N);
    }

    public void N(class00929 class009292) {
        this.N(class00914.N);
    }

    public void N(class01635 class016352) {
        class00417.N((class00381)class016352, (class00638)this, (class00458)this.field_45012.yK());
        this.N(class04171.N);
        class01022 class010222 = this.field_45012.yt();
        this.field_45013.method_56329(class04266.L.N(this.N((class01042)class010222, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_5455]");
            return class04247.N((class01042)((class01042)objectArray[0]));
        })));
        try {
            class01062 class010622 = this.field_45012.Nm();
            if (class010622.y(this.u.id()) != null) {
                this.method_52396(class01062.R);
                return;
            }
            class00392 class003922 = class010622.N(this.field_45013.method_10755(), new class08774(this.u));
            if (class003922 != null) {
                this.method_52396(class003922);
                return;
            }
            Objects.requireNonNull(this.z).N(this.field_45013, this.method_53825(this.B));
        }
        catch (Exception exception) {
            N.error("Couldn't place player in world", (Throwable)exception);
            this.method_52396(y);
        }
    }

    private void N(class04159 class041592) {
        class04159 class041593;
        class04159 class041594 = class041593 = this.M != null ? this.M.method_52375() : null;
        if (!class041592.equals((Object)class041593)) {
            throw new IllegalStateException("Unexpected request for task finish, current task: " + String.valueOf((Object)class041593) + ", requested: " + String.valueOf((Object)class041592));
        }
        this.M = null;
        this.M();
    }

    public boolean method_48106() {
        return this.field_45013.method_10758();
    }

    private void R() {
        Map var1 = this.field_45012.NW();
        if (!var1.isEmpty()) {
            this.i.add((class04188)new class00914(() -> {
                String string = (String)var1.get(this.B.y().toLowerCase(Locale.ROOT));
                if (string == null) {
                    string = (String)var1.get("en_us");
                }
                if (string == null) {
                    string = (String)var1.values().iterator().next();
                }
                return string;
            }));
        }
        this.field_45012.NB().ifPresent(class027942 -> this.i.add(new class04174((class02794)class027942)));
    }

    public void addTask(class04188 class041882) {
        this.i.add(class041882);
    }

    public void completeTask(class04159 class041592) {
        class04159 class041593;
        if (!this.W) {
            this.N(class041592);
            return;
        }
        class04159 class041594 = class041593 = this.M != null ? this.M.method_52375() : null;
        if (!class041592.equals((Object)class041593)) {
            throw new IllegalStateException("Unexpected request for task finish, current task: " + String.valueOf((Object)class041593) + ", requested: " + String.valueOf((Object)class041592));
        }
        this.M = null;
        this.L();
    }

    @Override
    protected GameProfile method_52403() {
        return this.u;
    }

    @Override
    public void method_10839(class02570 class025702) {
        N.info("{} ({}) lost connection: {}", new Object[]{this.u.name(), this.u.id(), class025702.N().getString()});
        if (this.z != null) {
            this.z.L();
            this.z = null;
        }
        super.method_10839(class025702);
    }

    public void method_18784() {
        this.method_52400();
        class04188 class041882 = this.M;
        if (class041882 != null) {
            try {
                if (class041882.N()) {
                    this.N(class041882.method_52375());
                }
            }
            catch (Exception exception) {
                N.error("Failed to tick configuration task {}", (Object)class041882.method_52375(), (Object)exception);
                this.method_52396(L);
            }
        }
        if (this.z != null) {
            this.z.y();
        }
    }

    @Override
    public void method_52395(class07367 class073672) {
        super.method_52395(class073672);
        if (class073672.y().N()) {
            this.N(class04174.N);
        }
    }

    public void method_12069(class00541 class005412) {
        this.B = class005412.N();
    }
}

