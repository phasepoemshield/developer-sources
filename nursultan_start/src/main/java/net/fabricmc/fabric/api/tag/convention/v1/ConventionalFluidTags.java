/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03530
 *  minecraft.class04651
 *  net.fabricmc.fabric.impl.tag.convention.TagRegistration
 */
package net.fabricmc.fabric.api.tag.convention.v1;

import minecraft.class03530;
import minecraft.class04651;
import net.fabricmc.fabric.impl.tag.convention.TagRegistration;

@Deprecated
public final class ConventionalFluidTags {
    public static final class03530<class04651> LAVA = ConventionalFluidTags.register("lava");
    public static final class03530<class04651> WATER = ConventionalFluidTags.register("water");
    public static final class03530<class04651> MILK = ConventionalFluidTags.register("milk");
    public static final class03530<class04651> HONEY = ConventionalFluidTags.register("honey");

    private ConventionalFluidTags() {
    }

    private static class03530<class04651> register(String string) {
        return TagRegistration.FLUID_TAG_REGISTRATION.registerC(string);
    }
}

