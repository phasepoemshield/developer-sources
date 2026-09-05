/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package net.caffeinemc.mods.sodium.api.config.structure;

import minecraft.class00392;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionGroupBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.PageBuilder;

public interface OptionPageBuilder
extends PageBuilder {
    public OptionPageBuilder setName(class00392 var1);

    public OptionPageBuilder addOption(OptionBuilder var1);

    public OptionPageBuilder addOptionGroup(OptionGroupBuilder var1);
}

