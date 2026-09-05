/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02689
 *  minecraft.class04719
 *  minecraft.class06202
 *  minecraft.class08314
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import minecraft.class02689;
import minecraft.class04719;
import minecraft.class05001;
import minecraft.class06202;
import minecraft.class08314;
import org.slf4j.Logger;

public final class class04966
extends Record {
    private final Map<Long, List<class02689>> servers;
    private static final Logger y = LogUtils.getLogger();

    public class04966(Map<Long, List<class02689>> map) {
        this.servers = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04966.class, "servers", "servers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04966.class, "servers", "servers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04966.class, "servers", "servers"}, this);
    }

    private static List<class02689> N(JsonArray jsonArray) {
        ArrayList<class02689> arrayList = new ArrayList<class02689>(jsonArray.size());
        for (JsonElement jsonElement : jsonArray) {
            UUID uUID;
            if (!jsonElement.isJsonObject() || (uUID = class04719.N((String)"playerId", (JsonObject)jsonElement.getAsJsonObject(), null)) == null || class06202.Nq().y(uUID)) continue;
            arrayList.add(class02689.N((UUID)uUID));
        }
        return arrayList;
    }

    public Map<Long, List<class02689>> N() {
        return this.servers;
    }

    public List<class02689> N(long l) {
        List<class02689> var3 = this.servers.get(l);
        if (var3 != null) {
            return var3;
        }
        return List.of();
    }

    public static class04966 N(String string) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        try {
            JsonObject jsonObject = class05001.N(string);
            if (class05001.u(jsonObject, "lists")) {
                Iterator var4 = jsonObject.getAsJsonArray("lists").iterator();
                while (var4.hasNext()) {
                    ArrayList arrayList;
                    JsonObject jsonObject2 = ((JsonElement)var4.next()).getAsJsonObject();
                    String string2 = class04719.N((String)"playerList", (JsonObject)jsonObject2, null);
                    if (string2 != null) {
                        JsonElement jsonElement = class08314.N((String)string2);
                        if (jsonElement.isJsonArray()) {
                            List<class02689> var6 = class04966.N(jsonElement.getAsJsonArray());
                        } else {
                            arrayList = Lists.newArrayList();
                        }
                    } else {
                        arrayList = Lists.newArrayList();
                    }
                    builder.put((Object)class04719.N((String)"serverId", (JsonObject)jsonObject2, (long)-1L), (Object)arrayList);
                }
            }
        }
        catch (Exception exception) {
            y.error("Could not parse RealmsServerPlayerLists", (Throwable)exception);
        }
        return new class04966((Map<Long, List<class02689>>)builder.build());
    }
}

