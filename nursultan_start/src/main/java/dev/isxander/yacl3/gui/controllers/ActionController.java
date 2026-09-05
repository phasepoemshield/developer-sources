/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ButtonOption
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 */
package dev.isxander.yacl3.gui.controllers;

import dev.isxander.yacl3.api.ButtonOption;
import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ActionController$ActionControllerElement;
import java.util.function.BiConsumer;
import minecraft.class00392;

public class ActionController
implements Controller<BiConsumer<YACLScreen, ButtonOption>> {
    public static final class00392 DEFAULT_TEXT = class00392.L((String)"yacl.control.action.execute");
    private final ButtonOption option;
    private final class00392 text;

    public ActionController(ButtonOption buttonOption) {
        this(buttonOption, DEFAULT_TEXT);
    }

    public ActionController(ButtonOption buttonOption, class00392 class003922) {
        this.option = buttonOption;
        this.text = class003922;
    }

    public ButtonOption option() {
        return this.option;
    }

    public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new ActionController$ActionControllerElement(this, yACLScreen, dimension);
    }

    public class00392 formatValue() {
        return this.text;
    }
}

