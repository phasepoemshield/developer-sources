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
import java.util.List;
import minecraft.class01894;
import minecraft.class06581;

final class Recipes1_11_2$LegacyShapelessRecipe
extends Record
implements Recipes1_11_2$LegacyRecipe {
    final String group;
    final Recipes1_11_2$RecipeItemStack result;
    final List<List<class06581>> ingredients;

    private Recipes1_11_2$LegacyShapelessRecipe(String string, Recipes1_11_2$RecipeItemStack recipes1_11_2$RecipeItemStack, List<List<class06581>> list) {
        this.group = string;
        this.result = recipes1_11_2$RecipeItemStack;
        this.ingredients = list;
    }

    public String group() {
        return this.group;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Recipes1_11_2$LegacyShapelessRecipe.class, "group;result;ingredients", "group", "result", "ingredients"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Recipes1_11_2$LegacyShapelessRecipe.class, "group;result;ingredients", "group", "result", "ingredients"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Recipes1_11_2$LegacyShapelessRecipe.class, "group;result;ingredients", "group", "result", "ingredients"}, this);
    }

    public Recipes1_11_2$RecipeItemStack result() {
        return this.result;
    }

    public static Recipes1_11_2$LegacyShapelessRecipe fromJson(JsonObject jsonObject) {
        String string = jsonObject.has("group") ? jsonObject.get("group").getAsString() : "";
        Recipes1_11_2$RecipeItemStack recipes1_11_2$RecipeItemStack = Recipes1_11_2$RecipeItemStack.fromJson(jsonObject.getAsJsonObject("result"));
        ArrayList<List<class06581>> arrayList = new ArrayList<List<class06581>>();
        for (JsonElement jsonElement : jsonObject.getAsJsonArray("ingredients")) {
            ArrayList<class06581> arrayList2 = new ArrayList<class06581>();
            for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
                arrayList2.add(Recipes1_11_2.getItemById(class01894.N((String)jsonElement2.getAsString())));
            }
            arrayList.add(arrayList2);
        }
        return new Recipes1_11_2$LegacyShapelessRecipe(string, recipes1_11_2$RecipeItemStack, arrayList);
    }

    public List<List<class06581>> ingredients() {
        return this.ingredients;
    }
}

