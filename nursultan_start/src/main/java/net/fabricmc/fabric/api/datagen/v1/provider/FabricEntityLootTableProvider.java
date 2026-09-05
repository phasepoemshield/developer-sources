/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01995
 *  minecraft.class03794
 *  minecraft.class04206
 *  minecraft.class04476
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06925
 *  minecraft.class06929
 *  minecraft.class07078
 *  net.fabricmc.fabric.impl.datagen.loot.FabricLootTableProviderImpl
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01995;
import minecraft.class03794;
import minecraft.class04206;
import minecraft.class04476;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06925;
import minecraft.class06929;
import minecraft.class07078;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.fabricmc.fabric.impl.datagen.loot.FabricLootTableProviderImpl;

public abstract class FabricEntityLootTableProvider
extends class01995
implements FabricLootTableProvider {
    private final FabricDataOutput output;
    private final Set<class01894> excludedFromStrictValidation = new HashSet<class01894>();
    private final CompletableFuture<class01929> registryLookupFuture;

    protected FabricEntityLootTableProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        super(class03794.i.N(), completableFuture.join());
        this.output = fabricDataOutput;
        this.registryLookupFuture = completableFuture;
    }

    public String method_10321() {
        return "Entity Loot Tables";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return FabricLootTableProviderImpl.run((class04476)class044762, (FabricLootTableProvider)this, (class06929)class06925.B, (FabricDataOutput)this.output, this.registryLookupFuture);
    }

    public abstract void method_10400();

    public void method_10399(BiConsumer<class05946<class05074>, class05062> biConsumer) {
        this.method_10400();
        for (Object object : this.field_40615.values()) {
            for (Map.Entry class070782 : object.entrySet()) {
                biConsumer.accept((class05946<class05074>)((class05946)class070782.getKey()), (class05062)class070782.getValue());
            }
        }
        if (this.output.isStrictValidationEnabled()) {
            HashSet hashSet = Sets.newHashSet();
            for (class01894 class018942 : class04206.M.M()) {
                if (!class018942.y().equals(this.output.getModId())) continue;
                class07078 class070782 = (class07078)class04206.M.N(class018942);
                class070782.Z().ifPresent(class059462 -> {
                    if (!class059462.N().y().equals(this.output.getModId())) {
                        return;
                    }
                    Map map = (Map)this.field_40615.get(class070782);
                    if (map == null || !map.containsKey(class059462)) {
                        hashSet.add(class018942);
                    }
                });
            }
            hashSet.removeAll(this.excludedFromStrictValidation);
            if (!hashSet.isEmpty()) {
                throw new IllegalStateException("Missing loot table(s) for %s".formatted(new Object[]{hashSet}));
            }
        }
    }

    public void excludeFromStrictValidation(class07078<?> class070782) {
        this.excludedFromStrictValidation.add(class04206.M.y(class070782));
    }
}

