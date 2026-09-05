/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.structure.BooleanOption
 *  net.caffeinemc.mods.sodium.client.config.structure.StatefulOption
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.BooleanOption;
import net.caffeinemc.mods.sodium.client.config.structure.StatefulOption;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.Control;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.gui.options.control.TickBoxControl$TickBoxControlElement;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class TickBoxControl
implements Control {
    private final BooleanOption option;

    public TickBoxControl(BooleanOption booleanOption) {
        this.option = booleanOption;
    }

    public StatefulOption<Boolean> getOption() {
        return this.option;
    }

    @Override
    public ControlElement createElement(class05096 class050962, AbstractOptionList abstractOptionList, Dim2i dim2i, ColorTheme colorTheme) {
        return new TickBoxControl$TickBoxControlElement(abstractOptionList, this.option, dim2i, colorTheme);
    }

    @Override
    public int getMaxWidth() {
        return 30;
    }
}

