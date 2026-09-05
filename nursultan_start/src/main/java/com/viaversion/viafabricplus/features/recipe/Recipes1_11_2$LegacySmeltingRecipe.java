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

final class Recipes1_11_2$LegacySmeltingRecipe
extends Record
implements Recipes1_11_2$LegacyRecipe {
    private final String group;
    final Recipes1_11_2$RecipeItemStack result;
    final List<class06581> input;
    final float experience;

    private Recipes1_11_2$LegacySmeltingRecipe(String string, Recipes1_11_2$RecipeItemStack recipes1_11_2$RecipeItemStack, List<class06581> list, float f) {
        this.group = string;
        this.result = recipes1_11_2$RecipeItemStack;
        this.input = list;
        this.experience = f;
    }

    public String group() {
        return this.group;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Recipes1_11_2$LegacySmeltingRecipe.class, "group;result;input;experience", "group", "result", "input", "experience"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Recipes1_11_2$LegacySmeltingRecipe.class, "group;result;input;experience", "group", "result", "input", "experience"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Recipes1_11_2$LegacySmeltingRecipe.class, "group;result;input;experience", "group", "result", "input", "experience"}, this);
    }

    public Recipes1_11_2$RecipeItemStack result() {
        return this.result;
    }

    public List<class06581> input() {
        return this.input;
    }

    public static Recipes1_11_2$LegacySmeltingRecipe fromJson(JsonObject jsonObject) {
        String string = jsonObject.has("group") ? jsonObject.get("group").getAsString() : "";
        Recipes1_11_2$RecipeItemStack recipes1_11_2$RecipeItemStack = Recipes1_11_2$RecipeItemStack.fromJson(jsonObject.getAsJsonObject("result"));
        ArrayList<class06581> arrayList = new ArrayList<class06581>();
        for (JsonElement jsonElement : jsonObject.getAsJsonArray("input")) {
            arrayList.add(Recipes1_11_2.getItemById(class01894.N((String)jsonElement.getAsString())));
        }
        float f = jsonObject.get("experience").getAsFloat();
        return new Recipes1_11_2$LegacySmeltingRecipe(string, recipes1_11_2$RecipeItemStack, arrayList, f);
    }

    public float experience() {
        return this.experience;
    }
}

