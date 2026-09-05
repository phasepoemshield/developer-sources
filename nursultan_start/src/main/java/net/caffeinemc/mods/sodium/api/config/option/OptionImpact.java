/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06541
 */
package net.caffeinemc.mods.sodium.api.config.option;

import minecraft.class00392;
import minecraft.class06541;
import net.caffeinemc.mods.sodium.api.config.option.NameProvider;

public enum OptionImpact implements NameProvider
{
    LOW(class06541.field_1060, "sodium.option_impact.low"),
    MEDIUM(class06541.field_1054, "sodium.option_impact.medium"),
    HIGH(class06541.field_1065, "sodium.option_impact.high"),
    VARIES(class06541.field_1068, "sodium.option_impact.varies");

    private final class00392 text;

    private OptionImpact(class06541 class065412, String string2) {
        this.text = class00392.L((String)string2).N(class065412);
    }

    @Override
    public class00392 getName() {
        return this.text;
    }
}

