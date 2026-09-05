/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  org.apache.commons.lang3.Validate
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import minecraft.class00392;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import org.apache.commons.lang3.Validate;

public abstract class PageBuilderImpl {
    class00392 name;

    public PageBuilderImpl setName(class00392 class003922) {
        this.name = class003922;
        return this;
    }

    abstract Page build();

    void prepareBuild() {
        Validate.notNull((Object)this.name, (String)"Name must not be null", (Object[])new Object[0]);
    }
}

