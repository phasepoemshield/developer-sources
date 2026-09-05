/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gui.widgets.ScrollbarWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractParentWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.ScrollbarWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public abstract class AbstractScrollable
extends AbstractParentWidget {
    public ScrollbarWidget scrollbar;

    public AbstractScrollable(Dim2i dim2i) {
        super(dim2i);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        this.scrollbar.scroll((int)(-d4 * 10.0));
        return true;
    }

    public int getScrollAmount() {
        return this.scrollbar.getScrollAmount();
    }
}

