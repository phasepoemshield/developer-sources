/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03530
 *  minecraft.class07078
 *  net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration
 */
package net.fabricmc.fabric.api.tag.convention.v2;

import minecraft.class03530;
import minecraft.class07078;
import net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration;

public final class ConventionalEntityTypeTags {
    public static final class03530<class07078<?>> BOSSES = ConventionalEntityTypeTags.register("bosses");
    public static final class03530<class07078<?>> MINECARTS = ConventionalEntityTypeTags.register("minecarts");
    public static final class03530<class07078<?>> BOATS = ConventionalEntityTypeTags.register("boats");
    public static final class03530<class07078<?>> CAPTURING_NOT_SUPPORTED = ConventionalEntityTypeTags.register("capturing_not_supported");
    public static final class03530<class07078<?>> TELEPORTING_NOT_SUPPORTED = ConventionalEntityTypeTags.register("teleporting_not_supported");

    private ConventionalEntityTypeTags() {
    }

    private static class03530<class07078<?>> register(String string) {
        return TagRegistration.ENTITY_TYPE_TAG.registerC(string);
    }
}

