/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class05216
 *  minecraft.class06541
 */
package dev.isxander.yacl3.gui.controllers;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ColorController$ColorControllerElement;
import dev.isxander.yacl3.gui.controllers.string.IStringController;
import java.awt.Color;
import minecraft.class00392;
import minecraft.class05216;
import minecraft.class06541;

public class ColorController
implements IStringController<Color> {
    private final Option<Color> option;
    private final boolean allowAlpha;

    @Override
    public String getString() {
        return this.formatValue().getString();
    }

    public ColorController(Option<Color> option) {
        this(option, false);
    }

    public ColorController(Option<Color> option, boolean bl) {
        this.option = option;
        this.allowAlpha = bl;
    }

    public Option<Color> option() {
        return this.option;
    }

    private String toHex(int n) {
        Object object = Integer.toString(n, 16).toUpperCase();
        if (((String)object).length() == 1) {
            object = "0" + (String)object;
        }
        return object;
    }

    public boolean allowAlpha() {
        return this.allowAlpha;
    }

    @Override
    public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new ColorController$ColorControllerElement(this, yACLScreen, dimension);
    }

    @Override
    public class00392 formatValue() {
        class05216 class052162 = class00392.y((String)"#");
        class052162.y((class00392)class00392.y((String)this.toHex(((Color)this.option().pendingValue()).getRed())).N(class06541.field_1061));
        class052162.y((class00392)class00392.y((String)this.toHex(((Color)this.option().pendingValue()).getGreen())).N(class06541.field_1060));
        class052162.y((class00392)class00392.y((String)this.toHex(((Color)this.option().pendingValue()).getBlue())).N(class06541.field_1078));
        if (this.allowAlpha()) {
            class052162.i(this.toHex(((Color)this.option().pendingValue()).getAlpha()));
        }
        return class052162;
    }

    @Override
    public void setFromString(String string) {
        if (string.startsWith("#")) {
            string = string.substring(1);
        }
        int n = Integer.parseInt(string.substring(0, 2), 16);
        int n2 = Integer.parseInt(string.substring(2, 4), 16);
        int n3 = Integer.parseInt(string.substring(4, 6), 16);
        if (this.allowAlpha()) {
            int n4 = Integer.parseInt(string.substring(6, 8), 16);
            this.option().requestSet((Object)new Color(n, n2, n3, n4));
        } else {
            this.option().requestSet((Object)new Color(n, n2, n3));
        }
    }
}

