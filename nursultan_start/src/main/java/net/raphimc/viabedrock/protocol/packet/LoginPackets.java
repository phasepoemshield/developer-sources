/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundHandshakePackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  io.jsonwebtoken.Claims
 *  io.jsonwebtoken.Jws
 *  io.jsonwebtoken.JwtBuilder
 *  io.jsonwebtoken.JwtBuilder$BuilderHeader
 *  io.jsonwebtoken.JwtException
 *  io.jsonwebtoken.Jwts
 *  io.jsonwebtoken.Jwts$SIG
 *  io.jsonwebtoken.security.SecureDigestAlgorithm
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.util.CryptUtil
 *  net.raphimc.viabedrock.api.util.FNV1
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.api.util.ServerBlacklist
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.AuthenticationType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PacketCompressionAlgorithm
 *  net.raphimc.viabedrock.protocol.storage.AuthData
 *  net.raphimc.viabedrock.protocol.storage.HandshakeStorage
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundHandshakePackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.SecureDigestAlgorithm;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.util.CryptUtil;
import net.raphimc.viabedrock.api.util.FNV1;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.api.util.ServerBlacklist;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.AuthenticationType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PacketCompressionAlgorithm;
import net.raphimc.viabedrock.protocol.provider.NettyPipelineProvider;
import net.raphimc.viabedrock.protocol.provider.SkinProvider;
import net.raphimc.viabedrock.protocol.storage.AuthData;
import net.raphimc.viabedrock.protocol.storage.HandshakeStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class LoginPackets {
    private static final int CLOCK_SKEW = 60;

    public static void register(BedrockProtocol protocol) {
        protocol.registerClientbound(ClientboundBedrockPackets.NETWORK_SETTINGS, null, wrapper -> {
            boolean isSelfSigned;
            wrapper.cancel();
            HandshakeStorage handshakeStorage = (HandshakeStorage)wrapper.user().get(HandshakeStorage.class);
            AuthData authData = (AuthData)wrapper.user().get(AuthData.class);
            int threshold = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_SHORT_LE);
            PacketCompressionAlgorithm algorithm = PacketCompressionAlgorithm.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_SHORT_LE)), (PacketCompressionAlgorithm)PacketCompressionAlgorithm.None);
            ((NettyPipelineProvider)Via.getManager().getProviders().get(NettyPipelineProvider.class)).enableCompression(wrapper.user(), algorithm, threshold);
            try {
                Jwts.parser().clockSkewSeconds(60L).verifyWith(authData.getSessionKeyPair().getPublic()).build().parseSignedClaims((CharSequence)authData.getMultiplayerToken());
                isSelfSigned = true;
            }
            catch (JwtException e) {
                isSelfSigned = false;
            }
            JsonObject authInfoObj = new JsonObject();
            authInfoObj.addProperty("AuthenticationType", (Number)(!isSelfSigned ? AuthenticationType.Full : AuthenticationType.SelfSigned).ordinal());
            authInfoObj.addProperty("Certificate", "{\"chain\":[\"..\"]}\n");
            authInfoObj.addProperty("Token", authData.getMultiplayerToken());
            String authInfo = authInfoObj.toString();
            PacketWrapper login = PacketWrapper.create((PacketType)ServerboundBedrockPackets.LOGIN, (UserConnection)wrapper.user());
            login.write((Type)Types.INT, (Object)handshakeStorage.protocolVersion());
            login.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)(authInfo.length() + authData.getSkinJwt().length() + 8));
            login.write(BedrockTypes.ASCII_STRING, (Object)authInfo);
            login.write(BedrockTypes.ASCII_STRING, (Object)authData.getSkinJwt());
            login.sendToServer(BedrockProtocol.class);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SERVER_TO_CLIENT_HANDSHAKE, null, wrapper -> {
            wrapper.cancel();
            KeyPair sessionKeyPair = ((AuthData)wrapper.user().get(AuthData.class)).getSessionKeyPair();
            Jws jwt = Jwts.parser().clockSkewSeconds(60L).keyLocator(CryptUtil.X5U_KEY_LOCATOR).build().parseSignedClaims((CharSequence)wrapper.read(BedrockTypes.STRING));
            byte[] salt = Base64.getDecoder().decode((String)((Claims)jwt.getPayload()).get("salt", String.class));
            SecretKey secretKey = LoginPackets.ecdhKeyExchange(sessionKeyPair.getPrivate(), (Key)CryptUtil.X5U_KEY_LOCATOR.locate(jwt.getHeader()), salt);
            ((NettyPipelineProvider)Via.getManager().getProviders().get(NettyPipelineProvider.class)).enableEncryption(wrapper.user(), secretKey);
            PacketWrapper clientToServerHandshake = PacketWrapper.create((PacketType)ServerboundBedrockPackets.CLIENT_TO_SERVER_HANDSHAKE, (UserConnection)wrapper.user());
            clientToServerHandshake.sendToServer(BedrockProtocol.class);
        });
        protocol.registerServerboundTransition((ServerboundPacketType)ServerboundHandshakePackets.CLIENT_INTENTION, null, wrapper -> {
            wrapper.cancel();
            int protocolVersion = (Integer)wrapper.read((Type)Types.VAR_INT);
            String hostname = (String)wrapper.read(Types.STRING);
            int port = (Integer)wrapper.read((Type)Types.UNSIGNED_SHORT);
            wrapper.user().put((StorableObject)new HandshakeStorage(protocolVersion, hostname, port));
        });
        protocol.registerServerboundTransition((ServerboundPacketType)ServerboundLoginPackets.HELLO, ServerboundBedrockPackets.REQUEST_NETWORK_SETTINGS, wrapper -> {
            HandshakeStorage handshakeStorage = (HandshakeStorage)wrapper.user().get(HandshakeStorage.class);
            if (!ViaBedrock.getConfig().shouldDisableServerBlacklist() && ServerBlacklist.isBlacklisted((String)handshakeStorage.hostname())) {
                wrapper.cancel();
                try {
                    PacketWrapper loginDisconnect = PacketWrapper.create((PacketType)ClientboundLoginPackets.LOGIN_DISCONNECT, (UserConnection)wrapper.user());
                    PacketFactory.writeJavaDisconnect((PacketWrapper)loginDisconnect, (String)"\u00a7cThis server is blacklisted by ViaBedrock because the server is known to ban players joining with ViaBedrock (Due to the server's anti-cheat).\n\n\u00a77If you want to join the server anyway, set disable-server-blacklist to true in the ViaBedrock config file.");
                    loginDisconnect.send(BedrockProtocol.class);
                }
                catch (Throwable loginDisconnect) {
                    // empty catch block
                }
                if (wrapper.user().getChannel() != null) {
                    wrapper.user().getChannel().flush();
                    wrapper.user().getChannel().close();
                }
                return;
            }
            String javaUsername = (String)wrapper.read(Types.STRING);
            wrapper.read(Types.UUID);
            wrapper.write((Type)Types.INT, (Object)handshakeStorage.protocolVersion());
            if (!wrapper.user().has(AuthData.class)) {
                Instant now = Instant.now();
                KeyPair sessionKeyPair = CryptUtil.generateEcdsa384KeyPair();
                String encodedPublicKey = Base64.getEncoder().encodeToString(sessionKeyPair.getPublic().getEncoded());
                long rawXuid = FNV1.fnv1_64((byte[])javaUsername.getBytes(StandardCharsets.UTF_8));
                String xuid = String.valueOf(Math.abs(rawXuid));
                String multiplayerToken = ((JwtBuilder)((JwtBuilder.BuilderHeader)Jwts.builder().signWith((Key)sessionKeyPair.getPrivate(), (SecureDigestAlgorithm)Jwts.SIG.ES384).header().add((Object)"x5u", (Object)encodedPublicKey)).and()).claim("aud", (Object)"api://auth-minecraft-services/multiplayer").claim("cpk", (Object)encodedPublicKey).claim("leguuid", (Object)UUID.nameUUIDFromBytes(("pocket-auth-1-xuid:" + xuid).getBytes(StandardCharsets.UTF_8))).claim("mid", (Object)Long.toHexString(rawXuid).toUpperCase(Locale.ROOT)).claim("nid", (Object)"").claim("nname", (Object)"").claim("pid", (Object)"").claim("pname", (Object)"").claim("xid", (Object)xuid).claim("xname", (Object)javaUsername).issuedAt(Date.from(now)).expiration(Date.from(now.plus(365L, ChronoUnit.DAYS))).compact();
                wrapper.user().put((StorableObject)new AuthData(multiplayerToken, sessionKeyPair));
            }
            AuthData authData = (AuthData)wrapper.user().get(AuthData.class);
            ProtocolInfo protocolInfo = wrapper.user().getProtocolInfo();
            protocolInfo.setUsername(authData.getDisplayName());
            protocolInfo.setUuid(UUID.nameUUIDFromBytes(("pocket-auth-1-xuid:" + authData.getXuid()).getBytes(StandardCharsets.UTF_8)));
            if (authData.getDeviceId() == null) {
                authData.setDeviceId(UUID.randomUUID());
            }
            if (authData.getSelfSignedId() == null) {
                authData.setSelfSignedId(protocolInfo.getUuid());
            }
            if (authData.getClientRandomId() == null) {
                authData.setClientRandomId(Long.valueOf(FNV1.fnv1_64((byte[])authData.getSelfSignedId().toString().getBytes(StandardCharsets.UTF_8))));
            }
            if (authData.getSkinJwt() == null) {
                KeyPair sessionKeyPair = authData.getSessionKeyPair();
                authData.setSkinJwt(((JwtBuilder)((JwtBuilder.BuilderHeader)Jwts.builder().signWith((Key)sessionKeyPair.getPrivate(), (SecureDigestAlgorithm)Jwts.SIG.ES384).header().add((Object)"x5u", (Object)Base64.getEncoder().encodeToString(sessionKeyPair.getPublic().getEncoded()))).and()).claims(((SkinProvider)Via.getManager().getProviders().get(SkinProvider.class)).getClientPlayerSkin(wrapper.user())).compact());
            }
        });
        protocol.registerServerboundTransition((ServerboundPacketType)ServerboundLoginPackets.LOGIN_ACKNOWLEDGED, null, PacketWrapper::cancel);
    }

    private static SecretKey ecdhKeyExchange(PrivateKey localPrivateKey, Key remotePublicKey, byte[] salt) {
        try {
            KeyAgreement ecdh = KeyAgreement.getInstance("ECDH");
            ecdh.init(localPrivateKey);
            ecdh.doPhase(remotePublicKey, true);
            byte[] sharedSecret = ecdh.generateSecret();
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            sha256.update(salt);
            sha256.update(sharedSecret);
            return new SecretKeySpec(sha256.digest(), "AES");
        }
        catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed to perform ECDH key exchange", e);
        }
    }
}

