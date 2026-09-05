/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.exceptions.ForcedUsernameChangeException
 *  com.mojang.authlib.exceptions.InsufficientPrivilegesException
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.exceptions.UserBannedException
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.injection.access.base.IConnection
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00541
 *  minecraft.class00559
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class01222
 *  minecraft.class01644
 *  minecraft.class01659
 *  minecraft.class01874
 *  minecraft.class01892
 *  minecraft.class01894
 *  minecraft.class02243
 *  minecraft.class02570
 *  minecraft.class02798
 *  minecraft.class02868
 *  minecraft.class03041
 *  minecraft.class03785
 *  minecraft.class03794
 *  minecraft.class04155
 *  minecraft.class04187
 *  minecraft.class04254
 *  minecraft.class04269
 *  minecraft.class04278
 *  minecraft.class04568
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05364
 *  minecraft.class05384
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07536
 *  minecraft.class07812
 *  minecraft.class07814
 *  minecraft.class07820
 *  minecraft.class07827
 *  minecraft.class07838
 *  minecraft.class07844
 *  minecraft.class07847
 *  minecraft.class07853
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions
 *  net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon
 *  net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryRequestPayload
 *  net.fabricmc.fabric.mixin.networking.client.accessor.ClientHandshakePacketListenerImplAccessor
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ProtocolMetadataStorage
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.ForcedUsernameChangeException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserBannedException;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.math.BigInteger;
import java.security.Key;
import java.security.PublicKey;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00541;
import minecraft.class00559;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class01222;
import minecraft.class01644;
import minecraft.class01659;
import minecraft.class01874;
import minecraft.class01892;
import minecraft.class01894;
import minecraft.class02243;
import minecraft.class02570;
import minecraft.class02798;
import minecraft.class02868;
import minecraft.class03041;
import minecraft.class03429;
import minecraft.class03458;
import minecraft.class03785;
import minecraft.class03794;
import minecraft.class04155;
import minecraft.class04187;
import minecraft.class04254;
import minecraft.class04269;
import minecraft.class04278;
import minecraft.class04568;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05364;
import minecraft.class05384;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07536;
import minecraft.class07812;
import minecraft.class07814;
import minecraft.class07820;
import minecraft.class07827;
import minecraft.class07838;
import minecraft.class07844;
import minecraft.class07847;
import minecraft.class07853;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon;
import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryRequestPayload;
import net.fabricmc.fabric.mixin.networking.client.accessor.ClientHandshakePacketListenerImplAccessor;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ProtocolMetadataStorage;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class03464
implements class07844,
NetworkHandlerExtensions,
ClientHandshakePacketListenerImplAccessor {
    private static final Logger N = LogUtils.getLogger();
    private final class06202 y;
    private final @Nullable class04568 L;
    private final @Nullable class05096 u;
    private final Consumer<class00392> i;
    private final class00642 R;
    private final boolean M;
    private final @Nullable Duration B;
    private @Nullable String Z;
    private final class05384 z;
    private final Map<class01894, byte[]> U;
    private final boolean E;
    private final Map<UUID, class03458> W;
    private final boolean m;
    private final AtomicReference<class03429> P = new AtomicReference<class03429>(class03429.field_46193);
    private ClientLoginNetworkAddon s;

    public ClientLoginNetworkAddon getAddon() {
        return this.s;
    }

    public /* synthetic */ class00642 getConnection() {
        return this.R;
    }

    public class03464(class00642 class006422, class06202 class062022, @Nullable class04568 class045682, @Nullable class05096 class050962, boolean bl, @Nullable Duration duration, Consumer<class00392> consumer, class05384 class053842, @Nullable class04254 class042542) {
        this.R = class006422;
        this.y = class062022;
        this.L = class045682;
        this.u = class050962;
        this.i = consumer;
        this.M = bl;
        this.B = duration;
        this.z = class053842;
        this.U = class042542 != null ? new HashMap(class042542.N()) : new HashMap();
        this.W = class042542 != null ? class042542.y() : Map.of();
        this.m = class042542 != null ? class042542.L() : false;
        this.E = class042542 != null;
        this.N((CallbackInfo)null);
    }

    private @Nullable class00392 y(String string) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(string, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00392)callbackInfoReturnable.getReturnValue();
        }
        try {
            this.y.n().L().joinServer(this.y.Ny().y(), this.y.Ny().u(), string);
        }
        catch (AuthenticationUnavailableException authenticationUnavailableException) {
            return class00392.N((String)"disconnect.loginFailedInfo", (Object[])new Object[]{class00392.L((String)"disconnect.loginFailedInfo.serversUnavailable")});
        }
        catch (InvalidCredentialsException invalidCredentialsException) {
            return class00392.N((String)"disconnect.loginFailedInfo", (Object[])new Object[]{class00392.L((String)"disconnect.loginFailedInfo.invalidSession")});
        }
        catch (InsufficientPrivilegesException insufficientPrivilegesException) {
            return class00392.N((String)"disconnect.loginFailedInfo", (Object[])new Object[]{class00392.L((String)"disconnect.loginFailedInfo.insufficientPrivileges")});
        }
        catch (ForcedUsernameChangeException | UserBannedException throwable) {
            return class00392.N((String)"disconnect.loginFailedInfo", (Object[])new Object[]{class00392.L((String)"disconnect.loginFailedInfo.userBanned")});
        }
        catch (AuthenticationException authenticationException) {
            return class00392.N((String)"disconnect.loginFailedInfo", (Object[])new Object[]{authenticationException.getMessage()});
        }
        return null;
    }

    private void N(class00642 class006422, int n, boolean bl) {
        class006422.method_10760(n, ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17));
    }

    private void N(class07827 class078272, Cipher cipher, Cipher cipher2) {
        this.N(class03429.field_46195);
        this.R.method_10752((class00381)class078272, class03041.N(() -> this.R.method_10746(cipher, cipher2)));
    }

    public void N(class07853 class078532) {
        this.N(class03429.field_46196);
        GameProfile gameProfile = class078532.N();
        this.R.method_56330(class02868.u, (class00638)new class01874(this.y, this.R, new class01892(this.z, gameProfile, this.y.NI().N(this.M, this.B, this.Z), class03785.N().N(), class03794.B, null, this.L, this.u, this.U, null, Map.of(), class02243.N, this.W, false)));
        this.R.method_10743((class00381)class04187.N);
        this.R.method_56329(class02868.y);
        this.R.method_10743((class00381)new class00559((class01659)new class01644(class02798.N())));
        this.R.method_10743((class00381)new class00541(((class05630)this.y.i_7).NF()));
    }

    private void N(String string, CallbackInfoReturnable callbackInfoReturnable) {
        IConnection iConnection = (IConnection)this.R;
        if (iConnection.viaFabricPlus$getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_6_4) && !((ProtocolMetadataStorage)iConnection.viaFabricPlus$getUserConnection().get(ProtocolMetadataStorage.class)).authenticate) {
            callbackInfoReturnable.setReturnValue(null);
        }
    }

    private void N(class03429 class034292) {
        class03429 class034294 = this.P.updateAndGet(class034293 -> {
            if (!class034292.field_46198.contains(class034293)) {
                throw new IllegalStateException("Tried to switch to " + String.valueOf((Object)class034292) + " from " + String.valueOf(class034293) + ", but expected one of " + String.valueOf(class034292.field_46198));
            }
            return class034292;
        });
        this.i.accept(class034294.field_46197);
    }

    private void N(class07812 class078122, CallbackInfo callbackInfo) {
        class04155 class041552 = class078122.y();
        if (class041552 instanceof PacketByteBufLoginQueryRequestPayload) {
            PacketByteBufLoginQueryRequestPayload packetByteBufLoginQueryRequestPayload = (PacketByteBufLoginQueryRequestPayload)class041552;
            if (this.s.handlePacket(class078122)) {
                callbackInfo.cancel();
            } else {
                packetByteBufLoginQueryRequestPayload.data().skipBytes(packetByteBufLoginQueryRequestPayload.data().readableBytes());
            }
        }
    }

    private void N(CallbackInfo callbackInfo) {
        this.s = new ClientLoginNetworkAddon(this, this.y);
        this.s.lateInit();
    }

    public void N(@Nullable String string) {
        this.Z = string;
    }

    public void N(class07812 class078122) {
        this.i.accept((class00392)class00392.L((String)"connect.negotiating"));
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class078122, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.R.method_10743((class00381)new class07847(class078122.N(), null));
    }

    public void N(class07814 class078142) {
        this.R.method_10747(class078142.N());
    }

    public void N(class07838 class078382) {
        if (!this.R.method_10756()) {
            boolean bl = false;
            int n = class078382.N();
            class00642 class006422 = this.R;
            this.N(class006422, n, bl);
        }
    }

    public void N(class07820 class078202) {
        class07827 class078272;
        Cipher cipher;
        Cipher cipher2;
        String string;
        this.N(class03429.field_46194);
        try {
            SecretKey secretKey = class01222.N();
            PublicKey publicKey = class078202.y();
            string = new BigInteger(class01222.N((String)class078202.N(), (PublicKey)publicKey, (SecretKey)secretKey)).toString(16);
            cipher2 = class01222.N((int)2, (Key)secretKey);
            cipher = class01222.N((int)1, (Key)secretKey);
            byte[] byArray = class078202.L();
            class078272 = new class07827(secretKey, publicKey, byArray);
        }
        catch (Exception exception) {
            throw new IllegalStateException("Protocol error", exception);
        }
        if (class078202.u()) {
            class07536.Z().execute(() -> {
                class00392 class003922 = this.y(string);
                if (class003922 != null) {
                    if (this.L != null && this.L.u()) {
                        N.warn(class003922.getString());
                    } else {
                        this.R.method_10747(class003922);
                        return;
                    }
                }
                this.N(class078272, cipher2, cipher);
            });
        } else {
            this.N(class078272, cipher2, cipher);
        }
    }

    public void N(class07080 class070802, class07074 class070742) {
        class070742.N("Server type", () -> this.L != null ? this.L.R().toString() : "<unknown>");
        class070742.N("Login phase", () -> this.P.get().toString());
        class070742.N("Is Local", () -> String.valueOf(this.R.method_10756()));
    }

    public void N(class04278 class042782) {
        this.R.method_10743((class00381)new class04269(class042782.N(), this.U.get(class042782.N())));
    }

    public boolean method_48106() {
        return this.R.method_10758();
    }

    public void method_10839(class02570 class025702) {
        class00392 class003922;
        class00392 class003923 = class003922 = this.E ? class05220.j : class05220.v;
        if (this.L != null && this.L.i()) {
            this.y.N((class05096)new class05364(this.u, class003922, class025702.N(), class05220.U));
        } else {
            this.y.N((class05096)new class05364(this.u, class003922, class025702));
        }
    }
}

