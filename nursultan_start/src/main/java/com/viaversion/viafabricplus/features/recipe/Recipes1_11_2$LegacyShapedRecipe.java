/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class06581
 */
package com.viaversion.viafabricplus.features.recipe;

import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2;
import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2$LegacyRecipe;
import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2$RecipeItemStack;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import minecraft.class01894;
import minecraft.class06581;

final class Recipes1_11_2$LegacyShapedRecipe
extends Record
implements Recipes1_11_2$LegacyRecipe {
    final String group;
    final Recipes1_11_2$RecipeItemStack result;
    final List<String> pattern;
    final Map<Character, List<class06581>> legend;

    private Recipes1_11_2$LegacyShapedRecipe(String string, Recipes1_11_2$RecipeItemStack recipeItemStack, List<String> list, Map<Character, List<class06581>> map) {
        this.group = string;
        this.result = recipeItemStack;
        this.pattern = list;
        this.legend = map;
    }

    public String group() {
        return this.group;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Recipes1_11_2$LegacyShapedRecipe.class, "group;result;pattern;legend", "group", "result", "pattern", "legend"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Recipes1_11_2$LegacyShapedRecipe.class, "group;result;pattern;legend", "group", "result", "pattern", "legend"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Recipes1_11_2$LegacyShapedRecipe.class, "group;result;pattern;legend", "group", "result", "pattern", "legend"}, this);
    }

    public List<String> pattern() {
        return this.pattern;
    }

    public Recipes1_11_2$RecipeItemStack result() {
        return this.result;
    }

    public static Recipes1_11_2$LegacyShapedRecipe fromJson(JsonObject jsonObject) {
        String string = jsonObject.has("group") ? jsonObject.get("group").getAsString() : "";
        Recipes1_11_2$RecipeItemStack recipes1_11_2$RecipeItemStack = Recipes1_11_2$RecipeItemStack.fromJson(jsonObject.getAsJsonObject("result"));
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Object object : jsonObject.getAsJsonArray("pattern")) {
            arrayList.add(object.getAsString());
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : jsonObject.getAsJsonObject("legend").entrySet()) {
            char c = ((String)entry.getKey()).charAt(0);
            ArrayList<class06581> arrayList2 = new ArrayList<class06581>();
            for (JsonElement jsonElement : ((JsonElement)entry.getValue()).getAsJsonArray()) {
                arrayList2.add(Recipes1_11_2.getItemById(class01894.N((String)jsonElement.getAsString())));
            }
            hashMap.put(Character.valueOf(c), arrayList2);
        }
        return new Recipes1_11_2$LegacyShapedRecipe(string, recipes1_11_2$RecipeItemStack, arrayList, hashMap);
    }

    public Map<Character, List<class06581>> legend() {
        return this.legend;
    }
}

