/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class05369
 *  minecraft.class05372
 *  minecraft.class05377
 *  minecraft.class07209
 */
package net.caffeinemc.mods.lithium.common.world.interests;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class03556;
import minecraft.class05369;
import minecraft.class05372;
import minecraft.class05377;
import minecraft.class07209;

public interface PointOfInterestSetExtended {
    public Iterator<class05377> lithium$iterate(Predicate<class03556<class05369>> var1);

    public class05377 lithium$getFirstMatchingPoint(class07209 var1, long var2, Predicate<class03556<class05369>> var4, Predicate<class07209> var5, class05372 var6);

    public void lithium$collectMatchingPoints(Predicate<class03556<class05369>> var1, class05372 var2, Consumer<class05377> var3);

    default public class05377 lithium$getL2ClosestMatchingPoint(class07209 class072092, Predicate<class03556<class05369>> predicate, class05372 class053722) {
        return this.lithium$getL2ClosestMatchingPoint(class072092, predicate, class053722.N());
    }

    public class05377 lithium$getL2ClosestMatchingPoint(class07209 var1, Predicate<class03556<class05369>> var2, Predicate<? super class05377> var3);

    public class05377 lithium$getAt(class07209 var1);

    public void lithium$collectMatchingPointsL2Limited(class07209 var1, long var2, Predicate<class03556<class05369>> var4, Predicate<? super class05377> var5, Consumer<class05377> var6, int var7);

    default public void lithium$collectMatchingPointsL2Limited(class07209 class072092, long l, Predicate<class03556<class05369>> predicate, class05372 class053722, Consumer<class05377> consumer, int n) {
        this.lithium$collectMatchingPointsL2Limited(class072092, l, predicate, class053722.N(), consumer, n);
    }
}

