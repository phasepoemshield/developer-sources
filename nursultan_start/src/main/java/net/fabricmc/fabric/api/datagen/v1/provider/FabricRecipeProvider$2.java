/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01997
 *  minecraft.class03519
 *  minecraft.class03711
 *  minecraft.class03719
 *  minecraft.class04227
 *  minecraft.class04476
 *  minecraft.class05544
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class07135
 *  minecraft.class07151
 *  minecraft.class07165
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.impl.datagen.FabricDataGenHelper
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01997;
import minecraft.class03519;
import minecraft.class03711;
import minecraft.class03719;
import minecraft.class04227;
import minecraft.class04476;
import minecraft.class05544;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class07135;
import minecraft.class07151;
import minecraft.class07165;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import org.jspecify.annotations.Nullable;

class FabricRecipeProvider$2
implements class03719 {
    final /* synthetic */ Set val$generatedRecipes;
    final /* synthetic */ class01929 val$wrapperLookup;
    final /* synthetic */ List val$list;
    final /* synthetic */ class04476 val$writer;
    final /* synthetic */ FabricRecipeProvider this$0;

    FabricRecipeProvider$2() {
        this.this$0 = var1_1;
        this.val$generatedRecipes = var2_2;
        this.val$wrapperLookup = var3_3;
        this.val$list = var4_4;
        this.val$writer = var5_5;
    }

    public void method_62738() {
    }

    public class01894 getRecipeIdentifier(class01894 class018942) {
        return this.this$0.getRecipeIdentifier(class018942);
    }

    public class07165 method_53818() {
        return class07165.y().N(class05544.N);
    }

    public void method_53819(class05946<class06521<?>> class059462, class06521<?> class065212, @Nullable class03711 class037112) {
        class01894 class018942 = class059462.N();
        if (!this.val$generatedRecipes.add(class018942)) {
            throw new IllegalStateException("Duplicate recipe " + String.valueOf(class018942));
        }
        class03519 class035192 = this.val$wrapperLookup.N((DynamicOps)JsonOps.INSTANCE);
        JsonObject jsonObject = ((JsonElement)class06521.R.encodeStart((DynamicOps)class035192, class065212).getOrThrow(IllegalStateException::new)).getAsJsonObject();
        ResourceCondition[] resourceConditionArray = FabricDataGenHelper.consumeConditions(class065212);
        FabricDataGenHelper.addConditions((JsonObject)jsonObject, (ResourceCondition[])resourceConditionArray);
        class01997 class019972 = this.this$0.output.method_60917(class04227.yV);
        class01997 class019973 = this.this$0.output.method_60917(class04227.yK);
        this.val$list.add(class07135.N((class04476)this.val$writer, (JsonElement)jsonObject, (Path)class019972.N(class018942)));
        if (class037112 != null) {
            JsonObject jsonObject2 = ((JsonElement)class07151.N.encodeStart((DynamicOps)class035192, (Object)class037112.y()).getOrThrow(IllegalStateException::new)).getAsJsonObject();
            FabricDataGenHelper.addConditions((JsonObject)jsonObject2, (ResourceCondition[])resourceConditionArray);
            this.val$list.add(class07135.N((class04476)this.val$writer, (JsonElement)jsonObject2, (Path)class019973.N(class037112.N())));
        }
    }
}

