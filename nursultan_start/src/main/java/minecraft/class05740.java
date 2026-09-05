/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viafabricplus.injection.access.base.IConnection
 *  com.viaversion.viafabricplus.injection.access.base.IServerData
 *  com.viaversion.viafabricplus.injection.access.base.bedrock.IEventLoopGroupHolder
 *  com.viaversion.viafabricplus.injection.access.networking.legacy_chat_signature.IProfilePublicKey_Data
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy.ViaFabricPlusClassicMPPassProvider
 *  com.viaversion.viafabricplus.protocoltranslator.util.ProtocolVersionDetector
 *  com.viaversion.viafabricplus.save.SaveManager
 *  com.viaversion.viafabricplus.settings.impl.AuthenticationSettings
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.ProfileKey
 *  com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_0
 *  com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_1
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  de.florianreuth.classic4j.model.classicube.account.CCAccount
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  java.lang.MatchException
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00423
 *  minecraft.class00606
 *  minecraft.class00642
 *  minecraft.class01673
 *  minecraft.class03420
 *  minecraft.class03437
 *  minecraft.class03459
 *  minecraft.class03464
 *  minecraft.class03826
 *  minecraft.class04254
 *  minecraft.class04279
 *  minecraft.class04450
 *  minecraft.class04454
 *  minecraft.class04568
 *  minecraft.class04575
 *  minecraft.class04579
 *  minecraft.class04771
 *  minecraft.class05096
 *  minecraft.class05364
 *  minecraft.class05384
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07816
 *  net.raphimc.minecraftauth.bedrock.BedrockAuthManager
 *  net.raphimc.minecraftauth.bedrock.model.MinecraftMultiplayerToken
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  net.raphimc.viabedrock.protocol.storage.AuthData
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IEventLoopGroupHolder;
import com.viaversion.viafabricplus.injection.access.networking.legacy_chat_signature.IProfilePublicKey_Data;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy.ViaFabricPlusClassicMPPassProvider;
import com.viaversion.viafabricplus.protocoltranslator.util.ProtocolVersionDetector;
import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.settings.impl.AuthenticationSettings;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.ProfileKey;
import com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_0;
import com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_1;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianreuth.classic4j.model.classicube.account.CCAccount;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00423;
import minecraft.class00606;
import minecraft.class00642;
import minecraft.class01673;
import minecraft.class03420;
import minecraft.class03437;
import minecraft.class03459;
import minecraft.class03464;
import minecraft.class03826;
import minecraft.class04254;
import minecraft.class04279;
import minecraft.class04450;
import minecraft.class04454;
import minecraft.class04568;
import minecraft.class04575;
import minecraft.class04579;
import minecraft.class04771;
import minecraft.class05096;
import minecraft.class05364;
import minecraft.class05384;
import minecraft.class05630;
import minecraft.class05763;
import minecraft.class06202;
import minecraft.class07816;
import net.raphimc.minecraftauth.bedrock.BedrockAuthManager;
import net.raphimc.minecraftauth.bedrock.model.MinecraftMultiplayerToken;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.viabedrock.protocol.storage.AuthData;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

class class05740
extends Thread {
    final /* synthetic */ class03420 N;
    final /* synthetic */ class06202 y;
    final /* synthetic */ class04568 L;
    final /* synthetic */ class04254 u;
    final /* synthetic */ class05763 i;
    private boolean R;

    class05740(class05763 class057632, String string, class03420 class034202, class06202 class062022, class04568 class045682, class04254 class042542) {
        this.i = class057632;
        this.N = class034202;
        this.y = class062022;
        this.L = class045682;
        this.u = class042542;
        super(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        InetSocketAddress inetSocketAddress = null;
        try {
            InetSocketAddress inetSocketAddress2;
            class00642 class006422;
            if (this.i.R) {
                return;
            }
            Optional<InetSocketAddress> optional = class03459.N.N(this.N).map(class03437::u);
            if (this.i.R) {
                return;
            }
            if (optional.isEmpty()) {
                this.y.execute(() -> this.y.N((class05096)new class05364(this.i.M, this.i.B, class05763.L)));
                return;
            }
            Optional<InetSocketAddress> optional2 = optional;
            inetSocketAddress = (InetSocketAddress)this.N(optional2, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[java.util.Optional]");
                return ((Optional)objectArray[0]).get();
            });
            class05763 class057632 = this.i;
            synchronized (class057632) {
                if (this.i.R) {
                    return;
                }
                class006422 = new class00642(class00423.field_11942);
                class006422.method_53505(this.y.ND().U());
                boolean bl = ((class05630)this.y.i_7).NC();
                class00642 class006423 = class006422;
                class00606 class006062 = this.N(bl);
                inetSocketAddress2 = inetSocketAddress;
                this.i.i = this.N(inetSocketAddress2, class006062, class006423, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[java.net.InetSocketAddress, net.minecraft.class_12239, net.minecraft.class_2535]");
                    Object[] objectArray2 = objectArray;
                    return class00642.method_52271((InetSocketAddress)((InetSocketAddress)objectArray[0]), (class00606)((class00606)objectArray2[1]), (class00642)((class00642)objectArray2[2]));
                });
            }
            this.i.i.syncUninterruptibly();
            this.N(null, class006422);
            this.y(null, class006422);
            class057632 = this.i;
            synchronized (class057632) {
                if (this.i.R) {
                    class006422.method_10747(class05763.y);
                    return;
                }
                this.i.u = class006422;
                this.y.yL().N(class006422, class05740.N(this.L.y()));
            }
            inetSocketAddress2 = inetSocketAddress;
            String string = this.N(inetSocketAddress2);
            inetSocketAddress2 = inetSocketAddress;
            this.i.u.method_56326(string, this.y(inetSocketAddress2), class04279.y, class04279.u, (class01673)new class03464(this.i.u, this.y, this.L, this.i.M, false, null, this.i::N, new class05384(), this.u), this.u != null);
            inetSocketAddress2 = this.y.Ny();
            this.i.u.method_10743((class00381)new class07816(this.N((class04771)inetSocketAddress2), this.y.Ny().y()));
        }
        catch (Exception exception) {
            String string;
            Exception exception2;
            Object object;
            if (this.i.R) {
                return;
            }
            Throwable throwable = exception.getCause();
            if (throwable instanceof Exception) {
                object = (Exception)throwable;
                exception2 = object;
            } else {
                exception2 = exception;
            }
            class05763.N.error("Couldn't connect to server", (Throwable)exception);
            if (inetSocketAddress == null) {
                var7_7 = exception2;
                string = this.N((Exception)var7_7, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[java.lang.Exception]");
                    return ((Exception)objectArray[0]).getMessage();
                });
            } else {
                var7_7 = exception2;
                String string2 = this.N((Exception)var7_7, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[java.lang.Exception]");
                    return ((Exception)objectArray[0]).getMessage();
                });
                var7_7 = inetSocketAddress;
                String string3 = this.N((InetSocketAddress)var7_7);
                var7_7 = inetSocketAddress;
                string = string2.replaceAll(string3 + ":" + this.y((InetSocketAddress)var7_7), "").replaceAll(inetSocketAddress.toString(), "");
            }
            object = string;
            this.y.execute(() -> this.N(this.y, (String)object));
        }
    }

    private int y(InetSocketAddress inetSocketAddress) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17)) {
            return this.N.y();
        }
        return inetSocketAddress.getPort();
    }

    private void y(CallbackInfo callbackInfo, class00642 class006422) {
        UserConnection userConnection = ((IConnection)class006422).viaFabricPlus$getUserConnection();
        if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_19, ProtocolVersion.v1_19_1)) {
            class04450 class044502 = ((Optional)class06202.Nq().c().N().join()).orElse(null);
            if (class044502 != null) {
                byte[] byArray;
                class04454 class044542 = class044502.L().y();
                PrivateKey privateKey = class044502.y();
                long l = class044542.y().toEpochMilli();
                byte[] byArray2 = class044542.L().getEncoded();
                UUID uUID = this.y.Ny().y();
                userConnection.put((StorableObject)new ChatSession1_19_1(uUID, privateKey, new ProfileKey(l, byArray2, class044542.u())));
                if (ProtocolTranslator.getTargetVersion() == ProtocolVersion.v1_19 && (byArray = ((IProfilePublicKey_Data)class044542).viafabricplus$getLegacyPublicKeySignature()) != null) {
                    userConnection.put((StorableObject)new ChatSession1_19_0(uUID, privateKey, new ProfileKey(l, byArray2, byArray)));
                }
            } else {
                ViaFabricPlusImpl.INSTANCE.getLogger().error("Could not get public key signature. Joining servers with enforce-secure-profiles enabled will not work!");
            }
        }
    }

    private String N(InetSocketAddress inetSocketAddress) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17)) {
            return this.N.N();
        }
        return inetSocketAddress.getHostName();
    }

    private static class03826 N(class04575 class045752) {
        return switch (class045752) {
            default -> throw new MatchException(null, null);
            case class04575.field_3768 -> class03826.field_47648;
            case class04575.field_3764 -> class03826.field_47649;
            case class04575.field_3767 -> class03826.field_47647;
        };
    }

    private String N(class04771 class047712) {
        CCAccount cCAccount;
        if (this.R && (cCAccount = SaveManager.INSTANCE.getAccountsSave().getClassicubeAccount()) != null) {
            return cCAccount.username();
        }
        return class047712.L();
    }

    private String N(Exception exception, Operation operation) {
        return exception.getMessage() == null ? "" : (String)operation.call(new Object[]{exception});
    }

    private class00606 N(boolean bl) {
        class00606 class006062 = class00606.N((boolean)bl);
        ((IEventLoopGroupHolder)class006062).viaFabricPlus$setConnecting(true);
        return class006062;
    }

    private Object N(Optional optional, Operation operation) throws Exception {
        InetSocketAddress inetSocketAddress = (InetSocketAddress)operation.call(new Object[]{optional});
        IServerData iServerData = (IServerData)this.L;
        ProtocolVersion protocolVersion = ProtocolTranslator.getTargetVersion();
        if (iServerData.viaFabricPlus$forcedVersion() != null && !iServerData.viaFabricPlus$passedDirectConnectScreen()) {
            protocolVersion = iServerData.viaFabricPlus$forcedVersion();
            iServerData.viaFabricPlus$passDirectConnectScreen(false);
        }
        if (protocolVersion == ProtocolTranslator.AUTO_DETECT_PROTOCOL) {
            boolean bl;
            boolean bl2 = bl = this.L.B() == class04579.field_47884 || this.L.B() == class04579.field_47883;
            if (bl) {
                protocolVersion = ProtocolVersion.getProtocol((int)this.L.M);
            }
            if (!bl || !protocolVersion.isKnown()) {
                this.i.N((class00392)class00392.L((String)"base.viafabricplus.detecting_server_version"));
                try {
                    protocolVersion = ProtocolVersionDetector.get((class03420)this.N, (InetSocketAddress)inetSocketAddress, (ProtocolVersion)ProtocolTranslator.NATIVE_VERSION);
                }
                catch (ConnectException connectException) {
                    // empty catch block
                }
            }
        }
        ProtocolTranslator.setTargetVersion((ProtocolVersion)protocolVersion, (boolean)true);
        this.R = (Boolean)AuthenticationSettings.INSTANCE.setSessionNameToClassiCubeNameInServerList.getValue() != false && ViaFabricPlusClassicMPPassProvider.classicubeMPPass != null;
        return inetSocketAddress;
    }

    private ChannelFuture N(InetSocketAddress inetSocketAddress, class00606 class006062, class00642 class006422, Operation operation) {
        ChannelFuture channelFuture = (ChannelFuture)operation.call(new Object[]{inetSocketAddress, class006062, class006422});
        ProtocolTranslator.injectPreviousVersionReset((Channel)channelFuture.channel());
        return channelFuture;
    }

    private /* synthetic */ void N(class06202 class062022, String string) {
        class062022.N((class05096)new class05364(this.i.M, this.i.B, (class00392)class00392.N((String)"disconnect.genericReason", (Object[])new Object[]{string})));
    }

    private void N(CallbackInfo callbackInfo, class00642 class006422) throws IOException {
        UserConnection userConnection = ((IConnection)class006422).viaFabricPlus$getUserConnection();
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            BedrockAuthManager bedrockAuthManager = SaveManager.INSTANCE.getAccountsSave().getBedrockAccount();
            if (bedrockAuthManager != null) {
                MinecraftMultiplayerToken minecraftMultiplayerToken = (MinecraftMultiplayerToken)bedrockAuthManager.getMinecraftMultiplayerToken().refresh();
                KeyPair keyPair = bedrockAuthManager.getSessionKeyPair();
                UUID uUID = bedrockAuthManager.getDeviceId();
                userConnection.put((StorableObject)new AuthData(minecraftMultiplayerToken.getToken(), keyPair, uUID));
            } else {
                ViaFabricPlusImpl.INSTANCE.getLogger().warn("Could not get Bedrock account. Joining online mode servers will not work!");
            }
        }
    }
}

