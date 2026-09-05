/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  minecraft.class01894
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 */
package com.viaversion.viafabricplus.features.recipe;

import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2;
import com.viaversion.viaversion.libs.gson.JsonObject;
import minecraft.class01894;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;

record Recipes1_11_2$RecipeItemStack(class06581 item, int count) {
    static Recipes1_11_2$RecipeItemStack fromJson(JsonObject jsonObject) {
        class01894 class018942 = class01894.N((String)jsonObject.get("id").getAsString());
        int n = jsonObject.has("count") ? jsonObject.get("count").getAsInt() : 1;
        return new Recipes1_11_2$RecipeItemStack(Recipes1_11_2.getItemById(class018942), n);
    }

    class06584 toItemStack() {
        return new class06584((class07310)this.item, this.count);
    }
}

