/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03530
 *  minecraft.class07304
 *  net.fabricmc.fabric.impl.tag.convention.TagRegistration
 */
package net.fabricmc.fabric.api.tag.convention.v1;

import minecraft.class03530;
import minecraft.class07304;
import net.fabricmc.fabric.impl.tag.convention.TagRegistration;

@Deprecated
public final class ConventionalEnchantmentTags {
    public static final class03530<class07304> INCREASES_BLOCK_DROPS = ConventionalEnchantmentTags.register("fortune");
    public static final class03530<class07304> INCREASES_ENTITY_DROPS = ConventionalEnchantmentTags.register("looting");
    public static final class03530<class07304> WEAPON_DAMAGE_ENHANCEMENT = ConventionalEnchantmentTags.register("weapon_damage_enhancement");
    public static final class03530<class07304> ENTITY_MOVEMENT_ENHANCEMENT = ConventionalEnchantmentTags.register("entity_movement_enhancement");
    public static final class03530<class07304> ENTITY_DEFENSE_ENHANCEMENT = ConventionalEnchantmentTags.register("entity_defense_enhancement");

    private ConventionalEnchantmentTags() {
    }

    private static class03530<class07304> register(String string) {
        return TagRegistration.ENCHANTMENT_TAG_REGISTRATION.registerC(string);
    }
}

