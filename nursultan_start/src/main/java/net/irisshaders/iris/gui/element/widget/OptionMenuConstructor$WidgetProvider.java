/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement
 */
package net.irisshaders.iris.gui.element.widget;

import net.irisshaders.iris.gui.element.widget.AbstractElementWidget;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement;

public interface OptionMenuConstructor$WidgetProvider<T extends OptionMenuElement> {
    public AbstractElementWidget<T> create(T var1);
}

