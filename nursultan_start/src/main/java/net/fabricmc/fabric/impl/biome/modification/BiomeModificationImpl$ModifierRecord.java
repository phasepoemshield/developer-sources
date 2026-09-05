/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext
 *  net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext
 *  net.fabricmc.fabric.api.biome.v1.ModificationPhase
 */
package net.fabricmc.fabric.impl.biome.modification;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class01894;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl;

class BiomeModificationImpl$ModifierRecord {
    final ModificationPhase phase;
    final class01894 id;
    final Predicate<BiomeSelectionContext> selector;
    private final BiConsumer<BiomeSelectionContext, BiomeModificationContext> contextSensitiveModifier;
    private final Consumer<BiomeModificationContext> modifier;
    int order;

    BiomeModificationImpl$ModifierRecord(ModificationPhase modificationPhase, class01894 class018942, Predicate<BiomeSelectionContext> predicate, Consumer<BiomeModificationContext> consumer) {
        this.phase = modificationPhase;
        this.id = class018942;
        this.selector = predicate;
        this.modifier = consumer;
        this.contextSensitiveModifier = null;
    }

    BiomeModificationImpl$ModifierRecord(ModificationPhase modificationPhase, class01894 class018942, Predicate<BiomeSelectionContext> predicate, BiConsumer<BiomeSelectionContext, BiomeModificationContext> biConsumer) {
        this.phase = modificationPhase;
        this.id = class018942;
        this.selector = predicate;
        this.contextSensitiveModifier = biConsumer;
        this.modifier = null;
    }

    public String toString() {
        if (this.modifier != null) {
            return this.modifier.toString();
        }
        return this.contextSensitiveModifier.toString();
    }

    public void apply(BiomeSelectionContext biomeSelectionContext, BiomeModificationContextImpl biomeModificationContextImpl) {
        if (this.contextSensitiveModifier != null) {
            this.contextSensitiveModifier.accept(biomeSelectionContext, biomeModificationContextImpl);
        } else {
            this.modifier.accept(biomeModificationContextImpl);
        }
    }

    public void setOrder(int n) {
        this.order = n;
    }
}

