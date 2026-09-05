/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.fabric.impl.biome.modification.BiomeModificationImpl
 */
package net.fabricmc.fabric.api.biome.v1;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class01894;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationImpl;

public class BiomeModification {
    private final class01894 id;

    BiomeModification(class01894 class018942) {
        this.id = class018942;
    }

    public BiomeModification add(ModificationPhase modificationPhase, Predicate<BiomeSelectionContext> predicate, Consumer<BiomeModificationContext> consumer) {
        BiomeModificationImpl.INSTANCE.addModifier(this.id, modificationPhase, predicate, consumer);
        return this;
    }

    public BiomeModification add(ModificationPhase modificationPhase, Predicate<BiomeSelectionContext> predicate, BiConsumer<BiomeSelectionContext, BiomeModificationContext> biConsumer) {
        BiomeModificationImpl.INSTANCE.addModifier(this.id, modificationPhase, predicate, biConsumer);
        return this;
    }
}

