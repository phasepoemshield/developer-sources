/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.structure.EnumOption
 *  net.caffeinemc.mods.sodium.client.config.structure.Option
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.apache.commons.lang3.Validate
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.EnumOption;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.Control;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.gui.options.control.CyclingControl$CyclingControlElement;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.apache.commons.lang3.Validate;

public class CyclingControl<T extends Enum<T>>
implements Control {
    private final EnumOption<T> option;

    public CyclingControl(EnumOption<T> enumOption, Class<T> clazz) {
        Object[] objectArray = (Enum[])clazz.getEnumConstants();
        Validate.notEmpty((Object[])objectArray, (String)"The enum universe must contain at least one item", (Object[])new Object[0]);
        this.option = enumOption;
    }

    @Override
    public Option getOption() {
        return this.option;
    }

    @Override
    public ControlElement createElement(class05096 class050962, AbstractOptionList abstractOptionList, Dim2i dim2i, ColorTheme colorTheme) {
        return new CyclingControl$CyclingControlElement<T>(abstractOptionList, this.option, dim2i, colorTheme);
    }

    @Override
    public int getMaxWidth() {
        return 70;
    }
}

