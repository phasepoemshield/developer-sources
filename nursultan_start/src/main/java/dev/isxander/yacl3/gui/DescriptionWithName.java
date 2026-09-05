/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.OptionDescription
 *  minecraft.class00392
 *  minecraft.class06541
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.api.OptionDescription;
import minecraft.class00392;
import minecraft.class06541;

public record DescriptionWithName(class00392 name, OptionDescription description) {
    public static DescriptionWithName of(class00392 class003922, OptionDescription optionDescription) {
        return new DescriptionWithName((class00392)class003922.L().N(class06541.field_1067), optionDescription);
    }
}

