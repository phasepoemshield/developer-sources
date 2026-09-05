/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05096
 */
package net.caffeinemc.mods.sodium.api.config.structure;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.api.config.structure.PageBuilder;

public interface ExternalPageBuilder
extends PageBuilder {
    public ExternalPageBuilder setName(class00392 var1);

    public ExternalPageBuilder setScreenConsumer(Consumer<class05096> var1);
}

