/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.LabelOption
 *  dev.isxander.yacl3.api.Option
 *  minecraft.class00392
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.LabelOption;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.Label;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.OptionFactory;
import minecraft.class00392;

public class LabelImpl
implements OptionFactory<Label, class00392> {
    @Override
    public Option<class00392> createOption(Label label, ConfigField<class00392> configField, OptionAccess optionAccess) {
        return LabelOption.create((class00392)((class00392)configField.access().get()));
    }
}

