/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 */
package dev.isxander.yacl3.gui.controllers.string;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.string.StringControllerElement;
import minecraft.class00392;

public interface IStringController<T>
extends Controller<T> {
    public String getString();

    default public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new StringControllerElement(this, yACLScreen, dimension, true);
    }

    default public class00392 formatValue() {
        return class00392.y((String)this.getString());
    }

    default public boolean isInputValid(String string) {
        return true;
    }

    public void setFromString(String var1);
}

