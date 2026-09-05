/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  io.netty.channel.ChannelFutureListener
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00417
 *  minecraft.class00458
 *  minecraft.class00501
 *  minecraft.class00506
 *  minecraft.class00552
 *  minecraft.class00559
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class01652
 *  minecraft.class01659
 *  minecraft.class02570
 *  minecraft.class02796
 *  minecraft.class03041
 *  minecraft.class03096
 *  minecraft.class03451
 *  minecraft.class03713
 *  minecraft.class03737
 *  minecraft.class04269
 *  minecraft.class07080
 *  minecraft.class07367
 *  minecraft.class07369
 *  minecraft.class07536
 *  minecraft.class07878
 *  minecraft.class08700
 *  minecraft.class08774
 *  minecraft.class09036
 *  net.fabricmc.fabric.impl.networking.AbstractNetworkAddon
 *  net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions
 *  net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon
 *  net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor
 *  net.fabricmc.fabric.mixin.recipe.sync.ServerCommonPacketListenerImplAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFutureListener;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00417;
import minecraft.class00458;
import minecraft.class00501;
import minecraft.class00506;
import minecraft.class00552;
import minecraft.class00559;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class01652;
import minecraft.class01659;
import minecraft.class02570;
import minecraft.class02796;
import minecraft.class03041;
import minecraft.class03096;
import minecraft.class03451;
import minecraft.class03713;
import minecraft.class03737;
import minecraft.class04269;
import minecraft.class07080;
import minecraft.class07367;
import minecraft.class07369;
import minecraft.class07536;
import minecraft.class07878;
import minecraft.class08700;
import minecraft.class08774;
import minecraft.class09036;
import net.fabricmc.fabric.impl.networking.AbstractNetworkAddon;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon;
import net.fabricmc.fabric.mixin.recipe.sync.ServerCommonPacketListenerImplAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class04156
implements class01652,
NetworkHandlerExtensions,
net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor,
ServerCommonPacketListenerImplAccessor {
    private static final Logger field_45014 = LogUtils.getLogger();
    public static final int field_45011 = 15000;
    private static final int field_51342 = 15000;
    private static final class00392 field_45015 = class00392.L((String)"disconnect.timeout");
    static final class00392 field_48273 = class00392.L((String)"multiplayer.disconnect.unexpected_query_response");
    protected final class02796 field_45012;
    protected final class00642 field_45013;
    private final boolean field_48274;
    private long field_45016;
    private boolean field_45017;
    private long field_45018;
    private long field_51343;
    private boolean field_51344 = false;
    private int field_45019;
    private volatile boolean field_45715 = false;

    public GameProfile method_52404() {
        return this.method_52403();
    }

    public void method_52396(class00392 class003922) {
        this.method_60673(new class02570(class003922));
    }

    public /* synthetic */ class00642 getConnection() {
        return this.field_45013;
    }

    public void method_14364(class00381<?> class003812) {
        this.method_52391(class003812, null);
    }

    public class04156(class02796 class027962, class00642 class006422, class03713 class037132) {
        this.field_45012 = class027962;
        this.field_45013 = class006422;
        this.field_45016 = class07536.L();
        this.field_45019 = class037132.y();
        this.field_48274 = class037132.u();
    }

    public void method_52391(class00381<?> class003812, @Nullable ChannelFutureListener channelFutureListener) {
        if (class003812.R()) {
            this.method_59512();
        }
        boolean bl = !this.field_45715 || !this.field_45012.E_();
        try {
            this.field_45013.method_52906(class003812, channelFutureListener, bl);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Sending packet");
            class070802.N("Packet being sent").N("Packet class", () -> class003812.getClass().getCanonicalName());
            throw new class07878(class070802);
        }
    }

    private void m_handler$zji000$fabric_networking_api_v1$onPlayPong_20(class03451 class034512, CallbackInfo callbackInfo) {
        AbstractNetworkAddon var4 = this.getAddon();
        if (var4 instanceof ServerConfigurationNetworkAddon) {
            ((ServerConfigurationNetworkAddon)var4).onPong(class034512.N());
        }
    }

    public /* synthetic */ class02796 getServer() {
        return this.field_45012;
    }

    public void method_53047() {
        this.field_45715 = false;
        this.field_45013.method_52915();
    }

    public void method_53046() {
        this.field_45715 = true;
    }

    protected abstract GameProfile method_52403();

    public void method_10839(class02570 class025702) {
        if (this.method_52402()) {
            field_45014.info("Stopping singleplayer server as player logged out");
            this.field_45012.y(false);
        }
    }

    protected void method_52400() {
        class08700.N().N("keepAlive");
        long l = class07536.L();
        if (!this.method_52402() && l - this.field_45016 >= 15000L) {
            if (this.field_45017) {
                this.method_52396(field_45015);
            } else if (this.method_59511(l)) {
                this.field_45017 = true;
                this.field_45016 = l;
                this.field_45018 = l;
                this.method_14364((class00381<?>)new class00506(this.field_45018));
            }
        }
        class08700.N().L();
    }

    protected class03713 method_53825(class03737 class037372) {
        return new class03713(this.method_52403(), this.field_45019, class037372, this.field_48274);
    }

    public void method_52395(class07367 class073672) {
        class00417.N((class00381)class073672, (class00638)this, (class00458)this.field_45012.yK());
        if (class073672.y() == class07369.field_13018 && this.field_45012.Ne()) {
            field_45014.info("Disconnecting {} due to resource pack {} rejection", (Object)this.method_52403().name(), (Object)class073672.N());
            this.method_52396((class00392)class00392.L((String)"multiplayer.requiredTexturePrompt.disconnect"));
        }
    }

    protected boolean method_52402() {
        return this.field_45012.N(new class08774(this.method_52403()));
    }

    private void method_59512() {
        if (!this.field_51344) {
            this.field_51343 = class07536.L();
            this.field_51344 = true;
        }
    }

    public void method_55851(class04269 class042692) {
        this.method_52396(field_48273);
    }

    private boolean method_59511(long l) {
        if (this.field_51344) {
            if (l - this.field_51343 >= 15000L) {
                this.method_52396(field_45015);
            }
            return false;
        }
        return true;
    }

    public void method_71953(class09036 class090362) {
        class00417.N((class00381)class090362, (class00638)this, (class00458)this.field_45012.yK());
        this.field_45012.N(class090362.N(), class090362.y());
    }

    public void method_60673(class02570 class025702) {
        this.field_45013.method_10752((class00381)new class00501(class025702.N()), class03041.N(() -> this.field_45013.method_60924(class025702)));
        this.field_45013.method_10757();
        this.field_45012.i(() -> ((class00642)this.field_45013).method_10768());
    }

    public void method_52394(class03451 class034512) {
        this.m_handler$zji000$fabric_networking_api_v1$onPlayPong_20(class034512, null);
    }

    public void method_52393(class00552 class005522) {
        if (this.field_45017 && class005522.N() == this.field_45018) {
            int n = (int)(class07536.L() - this.field_45016);
            this.field_45019 = (this.field_45019 * 3 + n) / 4;
            this.field_45017 = false;
        } else if (!this.method_52402()) {
            this.method_52396(field_45015);
        }
    }

    public void method_52392(class00559 class005592) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.m_handler$zji000$fabric_networking_api_v1$handleCustomPayloadReceivedAsync_21(class005592, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
    }

    public void method_59807(class00381 class003812, Exception exception) throws class07878 {
        super.method_59807(class003812, exception);
        this.field_45012.N((Throwable)exception, class003812.method_65080());
    }

    public int method_52405() {
        return this.field_45019;
    }

    private void m_handler$zji000$fabric_networking_api_v1$handleCustomPayloadReceivedAsync_21(class00559 class005592, CallbackInfo callbackInfo) {
        class01659 class016592 = class005592.N();
        try {
            AbstractNetworkAddon var6 = this.getAddon();
            if (!(var6 instanceof ServerConfigurationNetworkAddon)) {
                throw new IllegalStateException("Unknown addon");
            }
            boolean bl = ((ServerConfigurationNetworkAddon)var6).handle(class016592);
            if (bl) {
                callbackInfo.cancel();
            }
        }
        catch (class03096 class030962) {
            this.field_45012.yK().N((class00638)this, (class00381)class005592);
            callbackInfo.cancel();
        }
    }
}

