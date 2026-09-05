/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.structure.Option
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public interface Control {
    public Option getOption();

    public ControlElement createElement(class05096 var1, AbstractOptionList var2, Dim2i var3, ColorTheme var4);

    public int getMaxWidth();
}

