/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.utils.Dimension
 *  dev.isxander.yacl3.gui.AbstractWidget
 *  dev.isxander.yacl3.gui.YACLScreen
 *  dev.isxander.yacl3.gui.controllers.ListEntryWidget
 *  minecraft.class00392
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ListEntryWidget;
import dev.isxander.yacl3.impl.ListOptionEntryImpl;
import minecraft.class00392;

public record ListOptionEntryImpl$EntryController<T>(Controller<T> controller, ListOptionEntryImpl<T> entry) implements Controller<T>
{
    public Option<T> option() {
        return this.controller.option();
    }

    public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new ListEntryWidget(yACLScreen, this.entry, this.controller.provideWidget(yACLScreen, dimension));
    }

    public class00392 formatValue() {
        return this.controller.formatValue();
    }
}

