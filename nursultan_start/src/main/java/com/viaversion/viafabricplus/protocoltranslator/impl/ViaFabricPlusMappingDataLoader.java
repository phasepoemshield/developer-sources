/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.MappingDataLoader
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  minecraft.class00891
 *  minecraft.class04206
 */
package com.viaversion.viafabricplus.protocoltranslator.impl;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader$Material;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import minecraft.class00891;
import minecraft.class04206;

public final class ViaFabricPlusMappingDataLoader
extends MappingDataLoader {
    public static final Map<String, ViaFabricPlusMappingDataLoader$Material> MATERIALS = new HashMap<String, ViaFabricPlusMappingDataLoader$Material>();
    public static final Map<String, Map<ProtocolVersion, String>> BLOCK_MATERIALS = new HashMap<String, Map<ProtocolVersion, String>>();
    public static final ViaFabricPlusMappingDataLoader INSTANCE = new ViaFabricPlusMappingDataLoader();

    private ViaFabricPlusMappingDataLoader() {
        super(ViaFabricPlusMappingDataLoader.class, "assets/viafabricplus/data/");
        Object object;
        JsonObject jsonObject = this.loadData("materials-1.19.4.json");
        for (Map.Entry entry : jsonObject.getAsJsonObject("materials").entrySet()) {
            object = ((JsonElement)entry.getValue()).getAsJsonObject();
            MATERIALS.put((String)entry.getKey(), new ViaFabricPlusMappingDataLoader$Material(object.get("blocksMovement").getAsBoolean(), object.get("burnable").getAsBoolean(), object.get("liquid").getAsBoolean(), object.get("blocksLight").getAsBoolean(), object.get("replaceable").getAsBoolean(), object.get("solid").getAsBoolean()));
        }
        for (Map.Entry entry : jsonObject.getAsJsonObject("blocks").entrySet()) {
            object = new HashMap();
            for (Map.Entry entry2 : ((JsonElement)entry.getValue()).getAsJsonObject().entrySet()) {
                ProtocolVersion protocolVersion = ProtocolVersion.getClosest((String)((String)entry2.getKey()));
                if (protocolVersion == null) {
                    throw new IllegalStateException("Unknown protocol version: " + (String)entry2.getKey());
                }
                object.put(protocolVersion, ((JsonElement)entry2.getValue()).getAsString());
            }
            BLOCK_MATERIALS.put((String)entry.getKey(), (Map<ProtocolVersion, String>)object);
        }
    }

    public static String getBlockMaterial(class00891 class008912) {
        return ViaFabricPlusMappingDataLoader.getBlockMaterial(class008912, ProtocolTranslator.getTargetVersion());
    }

    public static String getBlockMaterial(class00891 class008912, ProtocolVersion protocolVersion) {
        Map<ProtocolVersion, String> map;
        if (protocolVersion.newerThan(ProtocolVersion.v1_19_4)) {
            protocolVersion = ProtocolVersion.v1_19_4;
        }
        if ((map = BLOCK_MATERIALS.get(class04206.i.y((Object)class008912).toString())) == null) {
            return null;
        }
        for (Map.Entry<ProtocolVersion, String> entry : map.entrySet()) {
            if (!protocolVersion.olderThanOrEqualTo(entry.getKey())) continue;
            return entry.getValue();
        }
        return null;
    }
}

