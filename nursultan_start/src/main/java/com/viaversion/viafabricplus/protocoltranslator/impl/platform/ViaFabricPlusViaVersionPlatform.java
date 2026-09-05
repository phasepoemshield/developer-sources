/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.configuration.AbstractViaConfig
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.platform.UserConnectionViaVersionPlatform
 *  com.viaversion.viaversion.util.GsonUtil
 *  minecraft.class03448
 *  minecraft.class06202
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.ModMetadata
 *  net.fabricmc.loader.api.metadata.Person
 *  org.slf4j.LoggerFactory
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.platform;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.viaversion.ViaFabricPlusConfig;
import com.viaversion.viafabricplus.protocoltranslator.protocol.ViaFabricPlusProtocol;
import com.viaversion.viafabricplus.protocoltranslator.util.JLoggerToSLF4J;
import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.configuration.AbstractViaConfig;
import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.platform.UserConnectionViaVersionPlatform;
import com.viaversion.viaversion.util.GsonUtil;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.logging.Logger;
import minecraft.class03448;
import minecraft.class06202;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.fabricmc.loader.api.metadata.Person;
import org.slf4j.LoggerFactory;

public final class ViaFabricPlusViaVersionPlatform
extends UserConnectionViaVersionPlatform {
    public Logger createLogger(String string) {
        return new JLoggerToSLF4J(LoggerFactory.getLogger((String)string));
    }

    public ViaFabricPlusViaVersionPlatform(File file) {
        super(file);
    }

    public String getPlatformName() {
        return "ViaFabricPlus";
    }

    protected AbstractViaConfig createConfig() {
        return new ViaFabricPlusConfig(new File(this.getDataFolder(), "viaversion.yml"), this.getLogger());
    }

    public void sendCustomPayload(UserConnection userConnection, String string, byte[] byArray) {
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ViaFabricPlusProtocol.INSTANCE.getCustomPayloadPacketType(), (UserConnection)userConnection);
        packetWrapper.write(Types.STRING, (Object)string);
        packetWrapper.write(Types.REMAINING_BYTES, (Object)byArray);
        packetWrapper.scheduleSendToServer(ViaFabricPlusProtocol.class);
    }

    public String getPlatformVersion() {
        return ViaFabricPlusImpl.INSTANCE.getVersion();
    }

    public JsonObject getDump() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("impl_version", ViaFabricPlusImpl.INSTANCE.getImplVersion());
        jsonObject.addProperty("native_version", ProtocolTranslator.NATIVE_VERSION.toString());
        jsonObject.addProperty("target_version", ProtocolTranslator.getTargetVersion().toString());
        jsonObject.addProperty("in_world", Boolean.valueOf((class03448)class06202.Nq().T_3 != null));
        Collection collection = FabricLoader.getInstance().getAllMods();
        JsonArray jsonArray = new JsonArray(collection.size());
        for (ModContainer modContainer : collection) {
            ModMetadata modMetadata = modContainer.getMetadata();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("id", modMetadata.getId());
            jsonObject2.addProperty("name", modMetadata.getName());
            jsonObject2.addProperty("version", modMetadata.getVersion().getFriendlyString());
            JsonArray jsonArray2 = new JsonArray(modMetadata.getAuthors().size());
            for (Person person : modMetadata.getAuthors()) {
                JsonObject jsonObject3 = new JsonObject();
                Map map = person.getContact().asMap();
                if (!map.isEmpty()) {
                    JsonObject jsonObject4 = new JsonObject();
                    map.forEach((arg_0, arg_1) -> ((JsonObject)jsonObject4).addProperty(arg_0, arg_1));
                    jsonObject3.add("contact", (JsonElement)jsonObject4);
                }
                jsonObject3.addProperty("name", person.getName());
                jsonArray2.add((JsonElement)jsonObject3);
            }
            jsonObject2.add("authors", (JsonElement)jsonArray2);
            jsonArray.add((JsonElement)jsonObject2);
        }
        jsonObject.add("mods", (JsonElement)jsonArray);
        com.google.gson.JsonObject jsonObject5 = new com.google.gson.JsonObject();
        SaveManager.INSTANCE.getSettingsSave().writeSettings(jsonObject5);
        jsonObject.add("settings", (JsonElement)GsonUtil.getGson().fromJson(jsonObject5.toString(), JsonObject.class));
        return jsonObject;
    }

    public void sendCustomPayloadToClient(UserConnection userConnection, String string, byte[] byArray) {
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ViaFabricPlusProtocol.INSTANCE.getClientboundCustomPayloadPacketType(), (UserConnection)userConnection);
        packetWrapper.write(Types.STRING, (Object)string);
        packetWrapper.write(Types.REMAINING_BYTES, (Object)byArray);
        packetWrapper.scheduleSend(ViaFabricPlusProtocol.class);
    }
}

