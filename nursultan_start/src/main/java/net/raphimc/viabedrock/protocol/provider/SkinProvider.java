/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  net.raphimc.viabedrock.api.modinterface.BedrockSkinUtilityInterface
 *  net.raphimc.viabedrock.api.modinterface.ViaBedrockUtilityInterface
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.MemoryTier
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.BuildPlatform
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GraphicsMode
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InputMode
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.UIProfile
 *  net.raphimc.viabedrock.protocol.storage.AuthData
 *  net.raphimc.viabedrock.protocol.storage.ChannelStorage
 *  net.raphimc.viabedrock.protocol.storage.HandshakeStorage
 *  net.raphimc.viabedrock.protocol.types.primitive.ImageType
 */
package net.raphimc.viabedrock.protocol.provider;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.raphimc.viabedrock.api.modinterface.BedrockSkinUtilityInterface;
import net.raphimc.viabedrock.api.modinterface.ViaBedrockUtilityInterface;
import net.raphimc.viabedrock.api.resourcepack.content.Content;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.data.DataValues;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.MemoryTier;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.BuildPlatform;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GraphicsMode;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InputMode;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.UIProfile;
import net.raphimc.viabedrock.protocol.model.SkinData;
import net.raphimc.viabedrock.protocol.storage.AuthData;
import net.raphimc.viabedrock.protocol.storage.ChannelStorage;
import net.raphimc.viabedrock.protocol.storage.HandshakeStorage;
import net.raphimc.viabedrock.protocol.types.primitive.ImageType;

public class SkinProvider
implements Provider {
    public Map<String, Object> getClientPlayerSkin(UserConnection user) {
        AuthData authData = (AuthData)user.get(AuthData.class);
        HashMap<String, Object> claims = new HashMap<String, Object>();
        Content skinPackContent = BedrockProtocol.MAPPINGS.getBedrockSkinPacks().get((Object)DataValues.VANILLA_SKIN_PACK_KEY).content();
        BufferedImage skin = skinPackContent.getImage("steve.png").getImage();
        JsonObject skinGeometry = skinPackContent.getSortedJson("geometry.json");
        claims.put("SkinId", UUID.randomUUID().toString());
        claims.put("SkinData", Base64.getEncoder().encodeToString(ImageType.getImageData((BufferedImage)skin)));
        claims.put("SkinImageWidth", skin.getWidth());
        claims.put("SkinImageHeight", skin.getHeight());
        claims.put("SkinGeometryData", Base64.getEncoder().encodeToString(skinGeometry.toString().getBytes(StandardCharsets.UTF_8)));
        claims.put("SkinGeometryDataEngineVersion", Base64.getEncoder().encodeToString("0.0.0".getBytes(StandardCharsets.UTF_8)));
        claims.put("SkinResourcePatch", Base64.getEncoder().encodeToString("{\"geometry\":{\"default\":\"geometry.humanoid.custom\"}}".getBytes(StandardCharsets.UTF_8)));
        claims.put("SkinAnimationData", "");
        claims.put("SkinColor", "#0");
        claims.put("PremiumSkin", false);
        claims.put("PersonaSkin", false);
        claims.put("TrustedSkin", false);
        claims.put("OverrideSkin", false);
        claims.put("ArmSize", "wide");
        claims.put("AnimatedImageData", new ArrayList());
        claims.put("PersonaPieces", new ArrayList());
        claims.put("PieceTintColors", new ArrayList());
        claims.put("CapeId", "");
        claims.put("CapeData", "");
        claims.put("CapeImageWidth", 0);
        claims.put("CapeImageHeight", 0);
        claims.put("CapeOnClassicSkin", false);
        HandshakeStorage handshakeStorage = (HandshakeStorage)user.get(HandshakeStorage.class);
        claims.put("ServerAddress", handshakeStorage.hostname() + ":" + handshakeStorage.port());
        claims.put("ThirdPartyName", user.getProtocolInfo().getUsername());
        claims.put("PartyId", "");
        claims.put("GameVersion", "1.26.10");
        claims.put("LanguageCode", "en_US");
        claims.put("GraphicsMode", GraphicsMode.Fancy.getValue());
        claims.put("GuiScale", -1);
        claims.put("UIProfile", UIProfile.Classic.getValue());
        claims.put("ClientRandomId", authData.getClientRandomId());
        claims.put("SelfSignedId", authData.getSelfSignedId());
        claims.put("IsEditorMode", false);
        claims.put("DeviceId", authData.getDeviceId().toString().replace("-", ""));
        claims.put("DeviceModel", "MS-7E51 Micro-Star International Co., Ltd. (Unknown)");
        claims.put("DeviceOS", BuildPlatform.Win32.getValue());
        claims.put("CurrentInputMode", InputMode.Mouse.getValue());
        claims.put("DefaultInputMode", InputMode.Mouse.getValue());
        claims.put("MemoryTier", MemoryTier.SuperHigh.ordinal());
        claims.put("MaxViewDistance", 96);
        claims.put("CompatibleWithClientSideChunkGen", false);
        claims.put("PlatformType", 0);
        claims.put("PlatformOfflineId", "");
        claims.put("PlatformOnlineId", "");
        return claims;
    }

    public void setSkin(UserConnection user, UUID playerUuid, SkinData skin) {
        ChannelStorage channelStorage = (ChannelStorage)user.get(ChannelStorage.class);
        if (channelStorage.hasChannel("viabedrockutility:data")) {
            ViaBedrockUtilityInterface.sendSkin((UserConnection)user, (UUID)playerUuid, (SkinData)skin);
        } else if (channelStorage.hasChannel("bedrockskin:data")) {
            BedrockSkinUtilityInterface.sendSkin((UserConnection)user, (UUID)playerUuid, (SkinData)skin);
        }
    }
}

