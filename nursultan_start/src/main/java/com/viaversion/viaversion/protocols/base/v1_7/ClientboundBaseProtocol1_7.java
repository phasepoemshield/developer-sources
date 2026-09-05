/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.VersionProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonParseException
 *  com.viaversion.viaversion.util.GsonUtil
 */
package com.viaversion.viaversion.protocols.base.v1_7;

import com.google.common.base.Joiner;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonParseException;
import com.viaversion.viaversion.protocol.ProtocolManagerImpl;
import com.viaversion.viaversion.protocol.ServerProtocolVersionSingleton;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ClientboundStatusPackets;
import com.viaversion.viaversion.protocols.base.packet.BaseClientboundPacket;
import com.viaversion.viaversion.protocols.base.packet.BasePacketTypesProvider;
import com.viaversion.viaversion.protocols.base.packet.BaseServerboundPacket;
import com.viaversion.viaversion.util.GsonUtil;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;

public class ClientboundBaseProtocol1_7
extends AbstractProtocol<BaseClientboundPacket, BaseClientboundPacket, BaseServerboundPacket, BaseServerboundPacket> {
    public ClientboundBaseProtocol1_7() {
        super(BaseClientboundPacket.class, BaseClientboundPacket.class, BaseServerboundPacket.class, BaseServerboundPacket.class);
    }

    protected PacketTypesProvider<BaseClientboundPacket, BaseClientboundPacket, BaseServerboundPacket, BaseServerboundPacket> createPacketTypesProvider() {
        return BasePacketTypesProvider.INSTANCE;
    }

    public static void onLoginSuccess(UserConnection connection) {
        ProtocolInfo info = connection.getProtocolInfo();
        if (info.protocolVersion().olderThan(ProtocolVersion.v1_20_2)) {
            info.setState(State.PLAY);
        }
        Via.getManager().getConnectionManager().onLoginSuccess(connection);
        if (!info.getPipeline().hasNonBaseProtocols()) {
            connection.setActive(false);
        }
        if (Via.getManager().isDebug()) {
            Via.getPlatform().getLogger().log(Level.INFO, "{0} logged in with protocol {1}, Route: {2}", new Object[]{info.getUsername(), info.protocolVersion().getName(), Joiner.on((String)", ").join((Object)info.getPipeline().pipes(), (Object)", ", new Object[0])});
        }
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundStatusPackets.STATUS_RESPONSE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    ProtocolInfo info = wrapper.user().getProtocolInfo();
                    String originalStatus = (String)wrapper.get(Types.STRING, 0);
                    try {
                        ProtocolVersion closestServerProtocol;
                        VersionProvider versionProvider;
                        JsonObject version;
                        JsonElement json = (JsonElement)GsonUtil.getGson().fromJson(originalStatus, JsonElement.class);
                        int protocol = 0;
                        if (json.isJsonObject()) {
                            if (json.getAsJsonObject().has("version")) {
                                version = json.getAsJsonObject().get("version").getAsJsonObject();
                                if (version.has("protocol")) {
                                    protocol = Long.valueOf(version.get("protocol").getAsLong()).intValue();
                                }
                            } else {
                                version = new JsonObject();
                                json.getAsJsonObject().add("version", (JsonElement)version);
                            }
                        } else {
                            json = new JsonObject();
                            version = new JsonObject();
                            json.getAsJsonObject().add("version", (JsonElement)version);
                        }
                        ProtocolVersion protocolVersion = ProtocolVersion.getProtocol((int)protocol);
                        if (Via.getConfig().isSendSupportedVersions()) {
                            version.add("supportedVersions", GsonUtil.getGson().toJsonTree((Object)Via.getAPI().getSupportedVersions()));
                        }
                        if (!Via.getAPI().getServerVersion().isKnown()) {
                            ProtocolManagerImpl protocolManager = (ProtocolManagerImpl)Via.getManager().getProtocolManager();
                            protocolManager.setServerProtocol(new ServerProtocolVersionSingleton(protocolVersion));
                        }
                        if ((versionProvider = (VersionProvider)Via.getManager().getProviders().get(VersionProvider.class)) == null) {
                            wrapper.user().setActive(false);
                            return;
                        }
                        try {
                            closestServerProtocol = versionProvider.getClosestServerProtocol(wrapper.user());
                        }
                        catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        List protocols = Via.getManager().getProtocolManager().getProtocolPath(info.protocolVersion(), closestServerProtocol);
                        if (protocols != null) {
                            if (protocolVersion.equalTo(closestServerProtocol) || protocolVersion.getVersion() == 0) {
                                version.addProperty("protocol", (Number)info.protocolVersion().getOriginalVersion());
                            }
                        } else {
                            wrapper.user().setActive(false);
                        }
                        if (Via.getConfig().blockedProtocolVersions().contains(info.protocolVersion())) {
                            version.addProperty("protocol", (Number)-1);
                        }
                        wrapper.set(Types.STRING, 0, (Object)GsonUtil.getGson().toJson(json));
                    }
                    catch (JsonParseException e) {
                        Via.getPlatform().getLogger().log(Level.SEVERE, "Error handling StatusResponse", e);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundLoginPackets.LOGIN_COMPRESSION, wrapper -> {
            int threshold = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.user().getProtocolInfo().setCompressionEnabled(threshold >= 0);
        });
        this.registerClientbound(ClientboundLoginPackets.LOGIN_FINISHED, wrapper -> {
            ProtocolInfo info = wrapper.user().getProtocolInfo();
            UUID uuid = this.passthroughUUID(wrapper);
            info.setUuid(uuid);
            String username = (String)wrapper.passthrough(Types.STRING);
            info.setUsername(username);
            ClientboundBaseProtocol1_7.onLoginSuccess(wrapper.user());
        });
    }

    public boolean isBaseProtocol() {
        return true;
    }

    public UUID passthroughUUID(PacketWrapper wrapper) {
        String uuidString = (String)wrapper.passthrough(Types.STRING);
        if (uuidString.length() == 32) {
            uuidString = ClientboundBaseProtocol1_7.addDashes(uuidString);
        }
        return UUID.fromString(uuidString);
    }

    public static String addDashes(String trimmedUUID) {
        StringBuilder idBuff = new StringBuilder(trimmedUUID);
        idBuff.insert(20, '-');
        idBuff.insert(16, '-');
        idBuff.insert(12, '-');
        idBuff.insert(8, '-');
        return idBuff.toString();
    }
}

