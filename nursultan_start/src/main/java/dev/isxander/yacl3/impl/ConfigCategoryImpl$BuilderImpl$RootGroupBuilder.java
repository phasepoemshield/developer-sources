/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.api.OptionGroup$Builder
 *  minecraft.class00392
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.impl.ConfigCategoryImpl$BuilderImpl;
import java.util.Collection;
import minecraft.class00392;

class ConfigCategoryImpl$BuilderImpl$RootGroupBuilder
implements OptionGroup.Builder {
    final /* synthetic */ ConfigCategoryImpl$BuilderImpl this$0;

    public OptionGroup.Builder description(OptionDescription optionDescription) {
        throw new UnsupportedOperationException("Cannot set name of root group!");
    }

    public OptionGroup.Builder options(Collection<? extends Option<?>> collection) {
        this.this$0.options(collection);
        return this;
    }

    ConfigCategoryImpl$BuilderImpl$RootGroupBuilder(ConfigCategoryImpl$BuilderImpl configCategoryImpl$BuilderImpl) {
        this.this$0 = configCategoryImpl$BuilderImpl;
    }

    public OptionGroup.Builder name(class00392 class003922) {
        throw new UnsupportedOperationException("Cannot set name of root group!");
    }

    public OptionGroup.Builder option(Option<?> option) {
        this.this$0.option(option);
        return this;
    }

    public OptionGroup build() {
        throw new UnsupportedOperationException("Cannot build root group!");
    }

    public OptionGroup.Builder collapsed(boolean bl) {
        throw new UnsupportedOperationException("Cannot set collapsible of root group!");
    }
}

