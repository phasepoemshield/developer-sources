/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class07209
 */
package net.caffeinemc.mods.lithium.common.world.interests;

import java.util.BitSet;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class03556;
import minecraft.class07209;
import net.caffeinemc.mods.lithium.common.util.functions.FunLongAnd5;

public interface RegionBasedStorageSectionExtended<R> {
    public BitSet lithium$getNonEmptyPOISections(int var1, int var2);

    public int lithium$getChunkYMaxInclusive();

    public <S, T, U> U lithium$getFirstInRangeInChunkColumn(int var1, int var2, long var3, class07209 var5, long var6, FunLongAnd5<R, class07209, Predicate<class03556<S>>, Predicate<class07209>, T, U> var8, Predicate<class03556<S>> var9, Predicate<class07209> var10, T var11);

    public Iterable<R> lithium$getInChunkColumn(int var1, int var2);

    public int lithium$getChunkYMin();

    public Optional<R> lithium$getElementAt(long var1);
}

