/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class01062
 *  minecraft.class01222
 *  minecraft.class01487
 *  minecraft.class02570
 *  minecraft.class02796
 *  minecraft.class02868
 *  minecraft.class03041
 *  minecraft.class03077
 *  minecraft.class03713
 *  minecraft.class04156
 *  minecraft.class04176
 *  minecraft.class04187
 *  minecraft.class04191
 *  minecraft.class04269
 *  minecraft.class05018
 *  minecraft.class05449
 *  minecraft.class06069
 *  minecraft.class06975
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07812
 *  minecraft.class07814
 *  minecraft.class07816
 *  minecraft.class07820
 *  minecraft.class07827
 *  minecraft.class07838
 *  minecraft.class07845
 *  minecraft.class07847
 *  minecraft.class07853
 *  minecraft.class07980
 *  minecraft.class08774
 *  net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions
 *  net.fabricmc.fabric.impl.networking.PacketCallbackListener
 *  net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryResponse
 *  net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon
 *  net.fabricmc.fabric.mixin.networking.accessor.ServerLoginPacketListenerImplAccessor
 *  org.apache.commons.lang3.Validate
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.primitives.Ints;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class01062;
import minecraft.class01222;
import minecraft.class01487;
import minecraft.class01616;
import minecraft.class01625;
import minecraft.class02570;
import minecraft.class02796;
import minecraft.class02868;
import minecraft.class03041;
import minecraft.class03077;
import minecraft.class03713;
import minecraft.class04156;
import minecraft.class04176;
import minecraft.class04187;
import minecraft.class04191;
import minecraft.class04269;
import minecraft.class05018;
import minecraft.class05449;
import minecraft.class06069;
import minecraft.class06975;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07812;
import minecraft.class07814;
import minecraft.class07816;
import minecraft.class07820;
import minecraft.class07827;
import minecraft.class07838;
import minecraft.class07845;
import minecraft.class07847;
import minecraft.class07853;
import minecraft.class07980;
import minecraft.class08774;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.PacketCallbackListener;
import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryResponse;
import net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon;
import net.fabricmc.fabric.mixin.networking.accessor.ServerLoginPacketListenerImplAccessor;
import org.apache.commons.lang3.Validate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01610
implements class03077,
class07845,
NetworkHandlerExtensions,
PacketCallbackListener,
ServerLoginPacketListenerImplAccessor {
    private static final AtomicInteger M = new AtomicInteger(0);
    static final Logger N = LogUtils.getLogger();
    private static final int B = 600;
    private final byte[] Z;
    final class02796 y;
    public final class00642 L;
    final class06975 u;
    private volatile class01616 z = class01616.field_14170;
    private int U;
    @Nullable String i;
    private @Nullable GameProfile E;
    private final String W;
    private final boolean m;
    private ServerLoginNetworkAddon P;

    public String L() {
        String string = this.L.method_52909(this.y.NN());
        if (this.i != null) {
            return this.i + " (" + string + ")";
        }
        return string;
    }

    private void L(GameProfile gameProfile) {
        class01062 class010622 = this.y.Nm();
        class00392 class003922 = class010622.N(this.L.method_10755(), new class08774(gameProfile));
        if (class003922 != null) {
            this.N(class003922);
        } else {
            class02796 class027962 = this.y;
            if (this.N(class027962) >= 0 && !this.L.method_10756()) {
                this.L.method_10752((class00381)new class07838(this.y.h()), class03041.N(() -> this.L.method_10760(this.y.h(), true)));
            }
            if (class010622.N(gameProfile.id())) {
                this.z = class01616.field_45031;
            } else {
                this.u(gameProfile);
            }
        }
    }

    public /* synthetic */ class00642 getConnection() {
        return this.L;
    }

    public class01610(class02796 class027962, class00642 class006422, boolean bl) {
        this.W = "";
        this.y = class027962;
        this.L = class006422;
        this.u = this.y.Nl();
        this.Z = Ints.toByteArray((int)class06069.u().M());
        this.m = bl;
        this.N((CallbackInfo)null);
    }

    public ServerLoginNetworkAddon getAddon() {
        return this.P;
    }

    private void u(GameProfile gameProfile) {
        this.z = class01616.field_45032;
        this.L.method_10743((class00381)new class07853(gameProfile));
    }

    private boolean y(GameProfile gameProfile) {
        return this.y.Nm().y(gameProfile.id()) != null;
    }

    public void N(class07816 class078162) {
        Validate.validState((this.z == class01616.field_14170 ? 1 : 0) != 0, (String)"Unexpected hello packet", (Object[])new Object[0]);
        Validate.validState((boolean)class05018.R((String)class078162.N()), (String)"Invalid characters in username", (Object[])new Object[0]);
        this.i = class078162.N();
        GameProfile gameProfile = this.y.NJ();
        if (gameProfile != null && this.i.equalsIgnoreCase(gameProfile.name())) {
            this.N(gameProfile);
            return;
        }
        if (this.y.NH() && !this.L.method_10756()) {
            this.z = class01616.field_14175;
            this.L.method_10743((class00381)new class07820("", this.y.NI().getPublic().getEncoded(), this.Z, true));
        } else {
            this.N(class01487.y((String)this.i));
        }
    }

    public void N(class07080 class070802, class07074 class070742) {
        class070742.N("Login phase", () -> this.z.toString());
    }

    private void N(CallbackInfo callbackInfo) {
        this.P = new ServerLoginNetworkAddon(this);
        this.P.lateInit();
    }

    private void N(class01610 class016102, GameProfile gameProfile) {
        if (this.P.queryTick()) {
            this.L(gameProfile);
        }
    }

    private void N(class07847 class078472, CallbackInfo callbackInfo) {
        if (this.P.handle(class078472)) {
            callbackInfo.cancel();
        } else {
            class04191 class041912 = class078472.y();
            if (class041912 instanceof PacketByteBufLoginQueryResponse) {
                PacketByteBufLoginQueryResponse packetByteBufLoginQueryResponse = (PacketByteBufLoginQueryResponse)class041912;
                packetByteBufLoginQueryResponse.data().skipBytes(packetByteBufLoginQueryResponse.data().readableBytes());
            }
        }
    }

    private int N(class02796 class027962) {
        return -1;
    }

    public void N(class07827 class078272) {
        String string;
        Object object;
        Validate.validState((this.z == class01616.field_14175 ? 1 : 0) != 0, (String)"Unexpected key packet", (Object[])new Object[0]);
        try {
            object = this.y.NI().getPrivate();
            if (!class078272.N(this.Z, (PrivateKey)object)) {
                throw new IllegalStateException("Protocol error");
            }
            SecretKey secretKey = class078272.N((PrivateKey)object);
            Cipher cipher = class01222.N((int)2, (Key)secretKey);
            Cipher cipher2 = class01222.N((int)1, (Key)secretKey);
            string = new BigInteger(class01222.N((String)"", (PublicKey)this.y.NI().getPublic(), (SecretKey)secretKey)).toString(16);
            this.z = class01616.field_14169;
            this.L.method_10746(cipher, cipher2);
        }
        catch (class05449 class054492) {
            throw new IllegalStateException("Protocol error", class054492);
        }
        object = new class01625(this, "User Authenticator #" + M.incrementAndGet(), string);
        ((Thread)object).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07980(N));
        ((Thread)object).start();
    }

    public void N(class07847 class078472) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class078472, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.N(class04156.field_48273);
    }

    public void N(class04187 class041872) {
        Validate.validState((this.z == class01616.field_45032 ? 1 : 0) != 0, (String)"Unexpected login acknowledgement packet", (Object[])new Object[0]);
        this.L.method_56329(class02868.u);
        class03713 class037132 = class03713.N((GameProfile)Objects.requireNonNull(this.E), (boolean)this.m);
        class04176 class041762 = new class04176(this.y, this.L, class037132);
        this.L.method_56330(class02868.y, (class00638)class041762);
        class041762.L();
        this.z = class01616.field_14172;
    }

    public void N(class00392 class003922) {
        try {
            N.info("Disconnecting {}: {}", (Object)this.L(), (Object)class003922.getString());
            this.L.method_10743((class00381)new class07814(class003922));
            this.L.method_10747(class003922);
        }
        catch (Exception exception) {
            N.error("Error whilst disconnecting player", (Throwable)exception);
        }
    }

    void N(GameProfile gameProfile) {
        this.E = gameProfile;
        this.z = class01616.field_45030;
    }

    public boolean method_48106() {
        return this.L.method_10758();
    }

    public void sent(class00381 class003812) {
        if (class003812 instanceof class07812) {
            this.P.registerOutgoingPacket((class07812)class003812);
        }
    }

    public /* synthetic */ class02796 getServer() {
        return this.y;
    }

    public void method_10839(class02570 class025702) {
        N.info("{} lost connection: {}", (Object)this.L(), (Object)class025702.N().getString());
    }

    public void method_18784() {
        if (this.z == class01616.field_45030) {
            GameProfile gameProfile = Objects.requireNonNull(this.E);
            class01610 class016102 = this;
            this.N(class016102, gameProfile);
        }
        if (this.z == class01616.field_45031 && !this.y(Objects.requireNonNull(this.E))) {
            this.u(this.E);
        }
        if (this.U++ == 600) {
            this.N((class00392)class00392.L((String)"multiplayer.disconnect.slow_login"));
        }
    }

    public void method_55851(class04269 class042692) {
        this.N(class04156.field_48273);
    }
}

