/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03530
 *  minecraft.class04748
 *  net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration
 */
package net.fabricmc.fabric.api.tag.convention.v2;

import minecraft.class03530;
import minecraft.class04748;
import net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration;

public final class ConventionalStructureTags {
    public static final class03530<class04748> HIDDEN_FROM_DISPLAYERS = ConventionalStructureTags.register("hidden_from_displayers");
    public static final class03530<class04748> HIDDEN_FROM_LOCATOR_SELECTION = ConventionalStructureTags.register("hidden_from_locator_selection");

    private ConventionalStructureTags() {
    }

    private static class03530<class04748> register(String string) {
        return TagRegistration.STRUCTURE_TAG.registerC(string);
    }
}

