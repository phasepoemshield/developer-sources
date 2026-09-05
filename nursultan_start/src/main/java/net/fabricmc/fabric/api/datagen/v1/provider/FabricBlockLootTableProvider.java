/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02015
 *  minecraft.class03794
 *  minecraft.class04206
 *  minecraft.class04476
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06925
 *  minecraft.class06929
 *  net.fabricmc.fabric.impl.datagen.loot.FabricLootTableProviderImpl
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02015;
import minecraft.class03794;
import minecraft.class04206;
import minecraft.class04476;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06925;
import minecraft.class06929;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.fabricmc.fabric.impl.datagen.loot.FabricLootTableProviderImpl;

public abstract class FabricBlockLootTableProvider
extends class02015
implements FabricLootTableProvider {
    private final FabricDataOutput output;
    private final Set<class01894> excludedFromStrictValidation = new HashSet<class01894>();
    private final CompletableFuture<class01929> registryLookupFuture;

    protected FabricBlockLootTableProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        super(Collections.emptySet(), class03794.i.N(), completableFuture.join());
        this.output = fabricDataOutput;
        this.registryLookupFuture = completableFuture;
    }

    public String method_10321() {
        return "Block Loot Tables";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return FabricLootTableProviderImpl.run((class04476)class044762, (FabricLootTableProvider)this, (class06929)class06925.j, (FabricDataOutput)this.output, this.registryLookupFuture);
    }

    public abstract void method_10379();

    public void method_10399(BiConsumer<class05946<class05074>, class05062> biConsumer) {
        this.method_10379();
        for (Map.Entry object : this.field_40610.entrySet()) {
            class05946 class059462 = (class05946)object.getKey();
            biConsumer.accept((class05946<class05074>)class059462, (class05062)object.getValue());
        }
        if (this.output.isStrictValidationEnabled()) {
            HashSet hashSet = Sets.newHashSet();
            for (class05946 class059462 : class04206.i.M()) {
                Optional optional;
                if (!class059462.y().equals(this.output.getModId()) || !(optional = ((class00891)class04206.i.N((class01894)class059462)).d()).isPresent() || !((class05946)optional.get()).N().y().equals(this.output.getModId()) || this.field_40610.containsKey(optional.get())) continue;
                hashSet.add(class059462);
            }
            hashSet.removeAll(this.excludedFromStrictValidation);
            if (!hashSet.isEmpty()) {
                throw new IllegalStateException("Missing loot table(s) for %s".formatted(new Object[]{hashSet}));
            }
        }
    }

    public void excludeFromStrictValidation(class00891 class008912) {
        this.excludedFromStrictValidation.add(class04206.i.y((Object)class008912));
    }
}

