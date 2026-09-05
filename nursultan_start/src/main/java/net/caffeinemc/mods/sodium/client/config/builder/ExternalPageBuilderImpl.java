/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05096
 *  org.apache.commons.lang3.Validate
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.api.config.structure.ExternalPageBuilder;
import net.caffeinemc.mods.sodium.client.config.builder.PageBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.ExternalPage;
import org.apache.commons.lang3.Validate;

public class ExternalPageBuilderImpl
extends PageBuilderImpl
implements ExternalPageBuilder {
    private Consumer<class05096> currentScreenConsumer;

    @Override
    public ExternalPageBuilderImpl setName(class00392 class003922) {
        super.setName(class003922);
        return this;
    }

    @Override
    ExternalPage build() {
        this.prepareBuild();
        return new ExternalPage(this.name, this.currentScreenConsumer);
    }

    @Override
    public ExternalPageBuilder setScreenConsumer(Consumer<class05096> consumer) {
        this.currentScreenConsumer = consumer;
        return this;
    }

    @Override
    void prepareBuild() {
        super.prepareBuild();
        Validate.notNull(this.currentScreenConsumer, (String)"Screen consumer must not be null", (Object[])new Object[0]);
    }
}

