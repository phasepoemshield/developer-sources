/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  minecraft.class01325
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06202
 *  minecraft.class07078
 */
package com.viaversion.viafabricplus.features.entity;

import com.viaversion.viafabricplus.base.Events;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import minecraft.class01325;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06202;
import minecraft.class07078;

public final class EntityDimensionDiff {
    private static final Map<class07078<?>, Map<ProtocolVersion, class01325>> ENTITY_DIMENSIONS = new HashMap();

    public static void init() {
        JsonObject jsonObject = ViaFabricPlusMappingDataLoader.INSTANCE.loadData("entity-dimensions.json");
        for (String string : jsonObject.keySet()) {
            class07078 class070782 = class04206.M.y(class01894.N((String)string)).orElse(null);
            if (class070782 == null) {
                throw new IllegalStateException("Unknown entity: " + string);
            }
            JsonObject jsonObject2 = jsonObject.getAsJsonObject(string);
            HashMap<ProtocolVersion, class01325> hashMap = new HashMap<ProtocolVersion, class01325>();
            for (String string2 : jsonObject2.keySet()) {
                ProtocolVersion protocolVersion3 = ProtocolVersion.getClosest((String)string2);
                if (protocolVersion3 == null) {
                    throw new IllegalStateException("Unknown protocol version: " + string2);
                }
                JsonObject jsonObject3 = jsonObject2.getAsJsonObject(string2);
                float f = jsonObject3.get("width").getAsFloat();
                float f2 = jsonObject3.get("height").getAsFloat();
                float f3 = jsonObject3.get("eyeHeight").getAsFloat();
                boolean bl = jsonObject3.get("fixed").getAsBoolean();
                class01325 class013252 = new class01325(f, f2, f3, class070782.Lu.u(), bl);
                hashMap.put(protocolVersion3, class013252);
            }
            ENTITY_DIMENSIONS.put(class070782, hashMap);
        }
        Events.CHANGE_PROTOCOL_VERSION.register((protocolVersion, protocolVersion2) -> class06202.Nq().execute(() -> ENTITY_DIMENSIONS.forEach((class070782, map) -> {
            for (Map.Entry entry : map.entrySet()) {
                ProtocolVersion protocolVersion3 = (ProtocolVersion)entry.getKey();
                class01325 class013252 = (class01325)entry.getValue();
                if (protocolVersion.newerThan(protocolVersion3) && protocolVersion2.olderThanOrEqualTo(protocolVersion3)) {
                    class070782.Lu = class013252;
                    break;
                }
                if (!protocolVersion2.newerThanOrEqualTo(protocolVersion3) || !protocolVersion.olderThanOrEqualTo(protocolVersion3)) continue;
                class070782.Lu = class013252;
            }
        })));
    }
}

