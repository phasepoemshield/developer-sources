/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00392
 *  minecraft.class00649
 *  minecraft.class01056
 *  minecraft.class01683
 *  minecraft.class03387
 *  minecraft.class03926
 *  minecraft.class04453
 *  minecraft.class04469
 *  minecraft.class05232
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class07536
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents
 *  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$AllowChat
 *  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$AllowGame
 *  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$Chat
 *  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$ChatCanceled
 *  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$Game
 *  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$GameCanceled
 *  net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$ModifyGame
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Queues;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import minecraft.class00392;
import minecraft.class00649;
import minecraft.class01056;
import minecraft.class01683;
import minecraft.class03047;
import minecraft.class03054;
import minecraft.class03055;
import minecraft.class03062;
import minecraft.class03086;
import minecraft.class03387;
import minecraft.class03926;
import minecraft.class04453;
import minecraft.class04469;
import minecraft.class05232;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07536;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class03040 {
    private static final class00392 N = class00392.L((String)"chat.validation_error").N(new class06541[]{class06541.field_1061, class06541.field_1056});
    private final class06202 y;
    private final Deque<class03062> L = Queues.newArrayDeque();
    private long u;
    private long i;

    public long L() {
        return this.L.size();
    }

    public class03040(class06202 class062022) {
        this.y = class062022;
    }

    private boolean i() {
        return this.u > 0L && class07536.L() < this.i + this.u;
    }

    public void u() {
        this.L.forEach(class03062::N);
        this.L.clear();
        this.i = 0L;
    }

    private void y(class00649 class006492, class03926 class039262, class00392 class003922, GameProfile gameProfile, boolean bl, Instant instant, CallbackInfoReturnable callbackInfoReturnable) {
        class00392 class003923 = class039262.P().y(class039262.L());
        if (class003923 != null) {
            this.N(class006492.N(class003923), class039262, gameProfile, class006492, instant, callbackInfoReturnable);
        }
    }

    public void y() {
        this.L.remove().N();
    }

    public void N(class00392 class003922, boolean bl) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class003922);
        this.N(class003922, bl, callbackInfo, (LocalRef)localRefImpl);
        class003922 = (class00392)localRefImpl.dispose();
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (((Boolean)((class05630)this.y.i_7).Nt().method_41753()).booleanValue() && this.y.N(this.N(class003922))) {
            return;
        }
        if (bl) {
            ((class01056)this.y.i_6).N(class003922, false);
            this.y.NT().L(class003922);
        } else {
            ((class01056)this.y.i_6).i().N(class003922);
            this.N(class003922, Instant.now());
            this.y.NT().y(class003922);
        }
    }

    private boolean N(UUID uUID) {
        if (this.y.q() && (class04453)this.y.T_4 != null) {
            return ((class04453)this.y.T_4).method_7334().id().equals(uUID);
        }
        return false;
    }

    private UUID N(class00392 class003922) {
        String string = StringUtils.substringBetween((String)class05232.N((class05936)class003922), (String)"<", (String)">");
        if (string == null) {
            return class07536.R;
        }
        return this.y.yv().N(string);
    }

    private void N(class00392 class003922, boolean bl, CallbackInfo callbackInfo, LocalRef localRef) {
        if (((ClientReceiveMessageEvents.AllowGame)ClientReceiveMessageEvents.ALLOW_GAME.invoker()).allowReceiveGameMessage((class00392)localRef.get(), bl)) {
            localRef.set((Object)((ClientReceiveMessageEvents.ModifyGame)ClientReceiveMessageEvents.MODIFY_GAME.invoker()).modifyReceivedGameMessage((class00392)localRef.get(), bl));
            ((ClientReceiveMessageEvents.Game)ClientReceiveMessageEvents.GAME.invoker()).onReceiveGameMessage((class00392)localRef.get(), bl);
        } else {
            ((ClientReceiveMessageEvents.GameCanceled)ClientReceiveMessageEvents.GAME_CANCELED.invoker()).onReceiveGameMessageCanceled((class00392)localRef.get(), bl);
            callbackInfo.cancel();
        }
    }

    private void N(class00392 class003922, @Nullable class03926 class039262, @Nullable GameProfile gameProfile, class00649 class006492, Instant instant, CallbackInfoReturnable callbackInfoReturnable) {
        if (((ClientReceiveMessageEvents.AllowChat)ClientReceiveMessageEvents.ALLOW_CHAT.invoker()).allowReceiveChatMessage(class003922, class039262, gameProfile, class006492, instant)) {
            ((ClientReceiveMessageEvents.Chat)ClientReceiveMessageEvents.CHAT.invoker()).onReceiveChatMessage(class003922, class039262, gameProfile, class006492, instant);
        } else {
            ((ClientReceiveMessageEvents.ChatCanceled)ClientReceiveMessageEvents.CHAT_CANCELED.invoker()).onReceiveChatMessageCanceled(class003922, class039262, gameProfile, class006492, instant);
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private void N(class00649 class006492, class00392 class003922, Instant instant, CallbackInfoReturnable callbackInfoReturnable) {
        this.N(class006492.N(class003922), null, null, class006492, instant, callbackInfoReturnable);
    }

    private void N(class00649 class006492, class03926 class039262, class00392 class003922, GameProfile gameProfile, boolean bl, Instant instant, CallbackInfoReturnable callbackInfoReturnable) {
        this.N(class003922, class039262, gameProfile, class006492, instant, callbackInfoReturnable);
    }

    public void N(UUID uUID, @Nullable class04469 class044692, class00649 class006492) {
        this.N(null, () -> {
            class01683 class016832 = this.y.NE();
            if (class016832 != null && class044692 != null) {
                class016832.N(class044692, false);
            }
            if (this.y.N(uUID)) {
                return false;
            }
            class00392 class003922 = class006492.N(N);
            ((class01056)this.y.i_6).i().N(class003922, null, class03054.u());
            this.y.NT().y(class006492.y(N));
            this.i = class07536.L();
            return true;
        });
    }

    public void N(class03926 class039262, GameProfile gameProfile, class00649 class006492) {
        boolean bl = (Boolean)((class05630)this.y.i_7).Nl().method_41753();
        class03926 class039263 = bl ? class039262.N() : class039262;
        class00392 class003922 = class006492.N(class039263.u());
        Instant instant = Instant.now();
        this.N(class039262.E(), () -> {
            boolean bl2 = this.N(class006492, class039262, class003922, gameProfile, bl, instant);
            class01683 class016832 = this.y.NE();
            if (class016832 != null && class039262.E() != null) {
                class016832.N(class039262.E(), bl2);
            }
            return bl2;
        });
    }

    private void N(@Nullable class04469 class044692, BooleanSupplier booleanSupplier) {
        if (this.i()) {
            this.L.add(new class03062(class044692, booleanSupplier));
        } else {
            booleanSupplier.getAsBoolean();
        }
    }

    public boolean N(class04469 class044692) {
        return this.L.removeIf(class030622 -> class044692.equals((Object)class030622.y()));
    }

    public void N(double d) {
        long l = (long)(d * 1000.0);
        if (l == 0L && this.u > 0L && !this.y.P()) {
            this.u();
        }
        this.u = l;
    }

    public void N() {
        if (this.y.P()) {
            if (this.u > 0L) {
                this.i += 50L;
            }
            return;
        }
        if (this.u == 0L) {
            if (!this.L.isEmpty()) {
                this.u();
            }
        } else if (class07536.L() >= this.i + this.u) {
            class03062 class030622;
            while ((class030622 = this.L.poll()) != null && !class030622.N()) {
            }
        }
    }

    private void N(class00392 class003922, Instant instant) {
        this.y.R().y().N((class03047)class03387.N((class00392)class003922, (Instant)instant));
    }

    private void N(class03926 class039262, GameProfile gameProfile, class03086 class030862) {
        this.y.R().y().N((class03047)class03387.N((GameProfile)gameProfile, (class03926)class039262, (class03086)class030862));
    }

    private class03086 N(class03926 class039262, class00392 class003922, Instant instant) {
        if (this.N(class039262.M())) {
            return class03086.field_39780;
        }
        return class03086.N(class039262, class003922, instant);
    }

    private void N(class00649 class006492, class00392 class003922) {
        this.y.NT().N(class006492.y(class003922));
    }

    private boolean N(class00649 class006492, class03926 class039262, class00392 class003922, GameProfile gameProfile, boolean bl, Instant instant) {
        class03086 class030862 = this.N(class039262, class003922, instant);
        if (bl && class030862.N()) {
            return false;
        }
        if (this.y.N(class039262.M()) || class039262.z()) {
            return false;
        }
        class03054 class030542 = class030862.N(class039262);
        class04469 class044692 = class039262.E();
        class03055 class030552 = class039262.P();
        if (class030552.N()) {
            class01056 class010562 = (class01056)this.y.i_6;
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
            this.N(class006492, class039262, class003922, gameProfile, bl, instant, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return callbackInfoReturnable.getReturnValueZ();
            }
            class010562.i().N(class003922, class044692, class030542);
            this.N(class006492, class039262.u());
        } else {
            class00392 class003923 = class030552.y(class039262.L());
            if (class003923 != null) {
                class01056 class010563 = (class01056)this.y.i_6;
                CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
                this.y(class006492, class039262, class003922, gameProfile, bl, instant, callbackInfoReturnable);
                if (callbackInfoReturnable.isCancelled()) {
                    return callbackInfoReturnable.getReturnValueZ();
                }
                class010563.i().N(class006492.N(class003923), class044692, class030542);
                this.N(class006492, class003923);
            }
        }
        this.N(class039262, gameProfile, class030862);
        this.i = class07536.L();
        return true;
    }

    public void N(class00392 class003922, class00649 class006492) {
        Instant instant = Instant.now();
        this.N(null, () -> {
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
            this.N(class006492, class003922, instant, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return callbackInfoReturnable.getReturnValueZ();
            }
            class00392 class003923 = class006492.N(class003922);
            ((class01056)this.y.i_6).i().N(class003923);
            this.N(class006492, class003922);
            this.N(class003923, instant);
            this.i = class07536.L();
            return true;
        });
    }
}

