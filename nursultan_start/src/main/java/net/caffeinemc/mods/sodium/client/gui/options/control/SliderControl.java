/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.structure.IntegerOption
 *  net.caffeinemc.mods.sodium.client.config.structure.StatefulOption
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.IntegerOption;
import net.caffeinemc.mods.sodium.client.config.structure.StatefulOption;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.Control;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.gui.options.control.SliderControl$SliderControlElement;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class SliderControl
implements Control {
    private final IntegerOption option;

    public SliderControl(IntegerOption integerOption) {
        this.option = integerOption;
    }

    public StatefulOption<Integer> getOption() {
        return this.option;
    }

    @Override
    public ControlElement createElement(class05096 class050962, AbstractOptionList abstractOptionList, Dim2i dim2i, ColorTheme colorTheme) {
        return new SliderControl$SliderControlElement(abstractOptionList, this.option, dim2i, colorTheme);
    }

    @Override
    public int getMaxWidth() {
        throw new UnsupportedOperationException("Not implemented");
    }
}

