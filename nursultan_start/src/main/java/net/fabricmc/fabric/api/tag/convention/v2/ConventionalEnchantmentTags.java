/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03530
 *  minecraft.class07304
 *  net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration
 */
package net.fabricmc.fabric.api.tag.convention.v2;

import minecraft.class03530;
import minecraft.class07304;
import net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration;

public final class ConventionalEnchantmentTags {
    public static final class03530<class07304> INCREASE_BLOCK_DROPS = ConventionalEnchantmentTags.register("increase_block_drops");
    public static final class03530<class07304> INCREASE_ENTITY_DROPS = ConventionalEnchantmentTags.register("increase_entity_drops");
    public static final class03530<class07304> WEAPON_DAMAGE_ENHANCEMENTS = ConventionalEnchantmentTags.register("weapon_damage_enhancements");
    public static final class03530<class07304> ENTITY_SPEED_ENHANCEMENTS = ConventionalEnchantmentTags.register("entity_speed_enhancements");
    public static final class03530<class07304> ENTITY_AUXILIARY_MOVEMENT_ENHANCEMENTS = ConventionalEnchantmentTags.register("entity_auxiliary_movement_enhancements");
    public static final class03530<class07304> ENTITY_DEFENSE_ENHANCEMENTS = ConventionalEnchantmentTags.register("entity_defense_enhancements");

    private ConventionalEnchantmentTags() {
    }

    private static class03530<class07304> register(String string) {
        return TagRegistration.ENCHANTMENT_TAG.registerC(string);
    }
}

