/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05074
 *  minecraft.class05672
 *  minecraft.class05946
 *  minecraft.class07310
 *  net.fabricmc.fabric.impl.content.registry.VillagerInteractionRegistriesImpl
 *  net.fabricmc.fabric.mixin.content.registry.GiveGiftToHeroAccessor
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.api.registry;

import java.util.Objects;
import minecraft.class05074;
import minecraft.class05672;
import minecraft.class05946;
import minecraft.class07310;
import net.fabricmc.fabric.impl.content.registry.VillagerInteractionRegistriesImpl;
import net.fabricmc.fabric.mixin.content.registry.GiveGiftToHeroAccessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class VillagerInteractionRegistries {
    private static final Logger LOGGER = LoggerFactory.getLogger(VillagerInteractionRegistries.class);

    private VillagerInteractionRegistries() {
    }

    @Deprecated
    public static void registerCollectable(class07310 class073102) {
        Objects.requireNonNull(class073102.B(), "Item cannot be null!");
        VillagerInteractionRegistriesImpl.getCollectableRegistry().add(class073102.B());
    }

    public static void registerCompostable(class07310 class073102) {
        Objects.requireNonNull(class073102.B(), "Item cannot be null!");
        VillagerInteractionRegistriesImpl.getCompostableRegistry().add(class073102.B());
    }

    public static void registerGiftLootTable(class05946<class05672> class059462, class05946<class05074> class059463) {
        Objects.requireNonNull(class059462, "Profession cannot be null!");
        Objects.requireNonNull(class059463, "Loot table identifier cannot be null!");
        class05946<class05074> class059464 = GiveGiftToHeroAccessor.fabric_getGifts().put(class059462, class059463);
        if (class059464 != null) {
            LOGGER.info("Overriding previous gift loot table of {} profession, was: {}, now: {}", new Object[]{class059462.N(), class059464, class059463});
        }
    }

    public static void registerFood(class07310 class073102, int n) {
        Objects.requireNonNull(class073102.B(), "Item cannot be null!");
        Integer n2 = VillagerInteractionRegistriesImpl.getFoodRegistry().put(class073102.B(), n);
        if (n2 != null) {
            LOGGER.info("Overriding previous food value of {}, was: {}, now: {}", new Object[]{class073102.B().toString(), n2, n});
        }
    }
}

