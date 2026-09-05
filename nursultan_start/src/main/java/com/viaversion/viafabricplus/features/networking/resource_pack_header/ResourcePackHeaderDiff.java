/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  minecraft.class04551
 *  minecraft.class07529
 */
package com.viaversion.viafabricplus.features.networking.resource_pack_header;

import com.viaversion.viafabricplus.features.networking.resource_pack_header.ResourcePackHeaderDiff$1;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import minecraft.class04551;
import minecraft.class07529;

public final class ResourcePackHeaderDiff {
    private static final Map<ProtocolVersion, class04551> GAME_VERSION_DIFF = new HashMap<ProtocolVersion, class04551>();

    public static class04551 get(ProtocolVersion protocolVersion) {
        if (!GAME_VERSION_DIFF.containsKey(protocolVersion)) {
            return class07529.y();
        }
        return GAME_VERSION_DIFF.get(protocolVersion);
    }

    private static void fill(String string, JsonObject jsonObject) {
        ProtocolVersion protocolVersion = ProtocolVersion.getProtocol((int)jsonObject.get("version").getAsInt());
        if (!protocolVersion.isKnown()) {
            throw new IllegalStateException("Unknown protocol version: " + protocolVersion.getOriginalVersion());
        }
        JsonElement jsonElement = jsonObject.get("pack_format");
        if (jsonElement.isJsonObject()) {
            int n = jsonElement.getAsJsonObject().get("major").getAsInt();
            int n2 = jsonElement.getAsJsonObject().get("minor").getAsInt();
            ResourcePackHeaderDiff.registerVersion(protocolVersion, n, n2, string, string);
        } else {
            ResourcePackHeaderDiff.registerVersion(protocolVersion, jsonElement.getAsInt(), -1, string, string);
        }
    }

    public static void init() {
        JsonObject jsonObject = ViaFabricPlusMappingDataLoader.INSTANCE.loadData("resource-pack-headers.json");
        for (String string : jsonObject.keySet()) {
            ResourcePackHeaderDiff.fill(string, jsonObject.getAsJsonObject(string));
        }
    }

    private static void registerVersion(ProtocolVersion protocolVersion, int n, int n2, String string, String string2) {
        GAME_VERSION_DIFF.put(protocolVersion, new ResourcePackHeaderDiff$1(string2, string, protocolVersion, n, n2));
    }
}

