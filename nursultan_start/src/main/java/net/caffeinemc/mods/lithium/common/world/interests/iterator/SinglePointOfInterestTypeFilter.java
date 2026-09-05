/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class05369
 */
package net.caffeinemc.mods.lithium.common.world.interests.iterator;

import java.util.function.Predicate;
import minecraft.class03556;
import minecraft.class05369;

public record SinglePointOfInterestTypeFilter(class03556<class05369> type) implements Predicate<class03556<class05369>>
{
    @Override
    public boolean test(class03556<class05369> class035562) {
        return this.type == class035562;
    }

    public class03556<class05369> getType() {
        return this.type;
    }
}

