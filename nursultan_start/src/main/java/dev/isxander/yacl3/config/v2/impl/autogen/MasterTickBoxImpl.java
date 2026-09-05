/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  dev.isxander.yacl3.api.controller.TickBoxControllerBuilder
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.api.controller.TickBoxControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.MasterTickBox;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.SimpleOptionFactory;

public class MasterTickBoxImpl
extends SimpleOptionFactory<MasterTickBox, Boolean> {
    @Override
    protected void listener(MasterTickBox masterTickBox, ConfigField<Boolean> configField, OptionAccess optionAccess, Option<Boolean> option2, Boolean bl) {
        for (String string : masterTickBox.value()) {
            optionAccess.scheduleOptionOperation(string, option -> option.setAvailable(masterTickBox.invert() != bl.booleanValue()));
        }
    }

    @Override
    protected ControllerBuilder<Boolean> createController(MasterTickBox masterTickBox, ConfigField<Boolean> configField, OptionAccess optionAccess, Option<Boolean> option) {
        return TickBoxControllerBuilder.create(option);
    }
}

