/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  minecraft.class01894
 *  minecraft.class05001
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import minecraft.class01894;
import minecraft.class05001;

public class class01314 {
    private final List<class01894> N;

    private class01314(List<class01894> list) {
        this.N = list;
    }

    public static class01314 N(JsonObject jsonObject) {
        JsonArray jsonArray = class05001.N((JsonObject)jsonObject, (String)"textures", null);
        if (jsonArray == null) {
            return new class01314(List.of());
        }
        List list = (List)Streams.stream((Iterable)jsonArray).map(jsonElement -> class05001.N((JsonElement)jsonElement, (String)"texture")).map(class01894::N).collect(ImmutableList.toImmutableList());
        return new class01314(list);
    }

    public List<class01894> N() {
        return this.N;
    }
}

