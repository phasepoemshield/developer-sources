/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.common.collect.Sets
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class03719
 *  minecraft.class04476
 *  minecraft.class06880
 *  minecraft.class06903
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class03719;
import minecraft.class04476;
import minecraft.class06880;
import minecraft.class06903;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider$1;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider$2;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;

public abstract class FabricRecipeProvider
extends class06880 {
    protected final FabricDataOutput output;
    private final CompletableFuture<class01929> registriesFuture;

    public FabricRecipeProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        super((class01996)fabricDataOutput, completableFuture);
        this.output = fabricDataOutput;
        this.registriesFuture = completableFuture;
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return this.registriesFuture.thenCompose(class019292 -> {
            HashSet hashSet = Sets.newHashSet();
            ArrayList arrayList = new ArrayList();
            class06903 class069032 = this.method_62766((class01929)class019292, new FabricRecipeProvider$2(this, (Set)hashSet, class019292, arrayList, class044762));
            class069032.N();
            return CompletableFuture.allOf((CompletableFuture[])arrayList.toArray(CompletableFuture[]::new));
        });
    }

    protected class01894 getRecipeIdentifier(class01894 class018942) {
        return class01894.N((String)this.output.getModId(), (String)class018942.N());
    }

    protected class03719 withConditions(class03719 class037192, ResourceCondition ... resourceConditionArray) {
        Preconditions.checkArgument((resourceConditionArray.length > 0 ? 1 : 0) != 0, (Object)"Must add at least one condition.");
        return new FabricRecipeProvider$1(this, resourceConditionArray, class037192);
    }

    public abstract class06903 method_62766(class01929 var1, class03719 var2);
}

