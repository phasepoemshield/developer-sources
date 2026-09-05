/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.widgets.OptionListWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.OptionListWidget$HeaderWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.Nullable;

class OptionListWidget$PageHeaderWidget
extends OptionListWidget$HeaderWidget {
    public OptionListWidget$PageHeaderWidget(AbstractOptionList abstractOptionList, Dim2i dim2i, Page page, ColorTheme colorTheme) {
        this(abstractOptionList, dim2i, "\u25c6 ", page.name().getString(), colorTheme, () -> OptionListWidget.resetAllOptions(page));
    }

    OptionListWidget$PageHeaderWidget(AbstractOptionList abstractOptionList, Dim2i dim2i, String string, String string2, ColorTheme colorTheme, @Nullable Runnable runnable) {
        super(abstractOptionList, dim2i, string + string2, colorTheme.theme, -1879048192, runnable);
    }
}

