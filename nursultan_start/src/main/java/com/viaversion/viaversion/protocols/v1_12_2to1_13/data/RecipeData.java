/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.libs.gson.reflect.TypeToken
 *  com.viaversion.viaversion.util.GsonUtil
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.data;

import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.libs.gson.reflect.TypeToken;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.MappingData1_13;
import com.viaversion.viaversion.util.GsonUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;

public final class RecipeData {
    public static Map<String, Recipe> recipes;

    public static void init() {
        InputStream stream = MappingData1_13.class.getClassLoader().getResourceAsStream("assets/viaversion/data/itemrecipes1_12_2to1_13.json");
        try (InputStreamReader reader = new InputStreamReader(stream);){
            recipes = (Map)GsonUtil.getGson().fromJson((Reader)reader, new TypeToken<Map<String, Recipe>>(){}.getType());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public record Recipe(String type, String group, int width, int height, float experience, int cookingTime, DataItem[] ingredient, DataItem[][] ingredients, DataItem result) {
    }
}

