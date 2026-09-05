/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ButtonOption
 *  dev.isxander.yacl3.api.ButtonOption$Builder
 *  dev.isxander.yacl3.api.OptionDescription
 *  minecraft.class00392
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.ButtonOption;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.impl.ButtonOptionImpl;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class00392;
import org.apache.commons.lang3.Validate;

public final class ButtonOptionImpl$BuilderImpl
implements ButtonOption.Builder {
    private class00392 name;
    private class00392 text = null;
    private OptionDescription description = OptionDescription.EMPTY;
    private boolean available = true;
    private BiConsumer<YACLScreen, ButtonOption> action;

    public ButtonOption.Builder description(OptionDescription optionDescription) {
        Validate.notNull((Object)optionDescription, (String)"`description` cannot be null", (Object[])new Object[0]);
        this.description = optionDescription;
        return this;
    }

    public ButtonOption.Builder name(class00392 class003922) {
        Validate.notNull((Object)class003922, (String)"`name` cannot be null", (Object[])new Object[0]);
        this.name = class003922;
        return this;
    }

    public ButtonOption.Builder action(BiConsumer<YACLScreen, ButtonOption> biConsumer) {
        Validate.notNull(biConsumer, (String)"`action` cannot be null", (Object[])new Object[0]);
        this.action = biConsumer;
        return this;
    }

    @Deprecated
    public ButtonOption.Builder action(Consumer<YACLScreen> consumer) {
        Validate.notNull(consumer, (String)"`action` cannot be null", (Object[])new Object[0]);
        this.action = (yACLScreen, buttonOption) -> consumer.accept((YACLScreen)((Object)yACLScreen));
        return this;
    }

    public ButtonOption.Builder available(boolean bl) {
        this.available = bl;
        return this;
    }

    public ButtonOption build() {
        Validate.notNull((Object)this.name, (String)"`name` must not be null when building `ButtonOption`", (Object[])new Object[0]);
        Validate.notNull(this.action, (String)"`action` must not be null when building `ButtonOption`", (Object[])new Object[0]);
        return new ButtonOptionImpl(this.name, this.description, this.action, this.text, this.available);
    }

    public ButtonOption.Builder text(class00392 class003922) {
        Validate.notNull((Object)class003922, (String)"`text` cannot be null", (Object[])new Object[0]);
        this.text = class003922;
        return this;
    }
}

