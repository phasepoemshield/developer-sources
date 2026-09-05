/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class03556
 *  minecraft.class05369
 *  minecraft.class05372
 *  minecraft.class05377
 *  minecraft.class07209
 *  minecraft.class08057
 */
package net.caffeinemc.mods.lithium.common.world.interests;

import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import minecraft.class03556;
import minecraft.class05369;
import minecraft.class05372;
import minecraft.class05377;
import minecraft.class07209;
import minecraft.class08057;

public interface PointOfInterestStorageExtended {
    public Collection<Pair<class03556<class05369>, class07209>> lithium$getNClosestFirstWithType(Predicate<class03556<class05369>> var1, Predicate<class07209> var2, class07209 var3, int var4, class05372 var5, long var6);

    public Optional<class05377> lithium$findNearestForPortalLogic(class07209 var1, int var2, class03556<class05369> var3, class05372 var4, Predicate<class05377> var5, class08057 var6);

    public Optional<class07209> lithium$takeAt(Predicate<class03556<class05369>> var1, BiPredicate<class03556<class05369>, class07209> var2, class07209 var3);
}

