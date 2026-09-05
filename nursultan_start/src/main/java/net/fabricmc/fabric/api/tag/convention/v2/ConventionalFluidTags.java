/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03530
 *  minecraft.class04651
 *  net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration
 */
package net.fabricmc.fabric.api.tag.convention.v2;

import minecraft.class03530;
import minecraft.class04651;
import net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration;

public final class ConventionalFluidTags {
    public static final class03530<class04651> LAVA = ConventionalFluidTags.register("lava");
    public static final class03530<class04651> WATER = ConventionalFluidTags.register("water");
    public static final class03530<class04651> MILK = ConventionalFluidTags.register("milk");
    public static final class03530<class04651> HONEY = ConventionalFluidTags.register("honey");
    public static final class03530<class04651> GASEOUS = ConventionalFluidTags.register("gaseous");
    public static final class03530<class04651> EXPERIENCE = ConventionalFluidTags.register("experience");
    public static final class03530<class04651> POTION = ConventionalFluidTags.register("potion");
    public static final class03530<class04651> SUSPICIOUS_STEW = ConventionalFluidTags.register("suspicious_stew");
    public static final class03530<class04651> MUSHROOM_STEW = ConventionalFluidTags.register("mushroom_stew");
    public static final class03530<class04651> RABBIT_STEW = ConventionalFluidTags.register("rabbit_stew");
    public static final class03530<class04651> BEETROOT_SOUP = ConventionalFluidTags.register("beetroot_soup");
    public static final class03530<class04651> HIDDEN_FROM_RECIPE_VIEWERS = ConventionalFluidTags.register("hidden_from_recipe_viewers");

    private ConventionalFluidTags() {
    }

    private static class03530<class04651> register(String string) {
        return TagRegistration.FLUID_TAG.registerC(string);
    }
}

