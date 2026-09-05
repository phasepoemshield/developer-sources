/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 */
package dev.isxander.yacl3.config.v2.api.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.ListGroup;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import java.util.List;

public interface ListGroup$ControllerFactory<T> {
    public ControllerBuilder<T> createController(ListGroup var1, ConfigField<List<T>> var2, OptionAccess var3, Option<T> var4);
}

