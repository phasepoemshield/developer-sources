/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui;

import minecraft.class01894;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public interface OptionExtended {
    public class01894 getId();

    public void setDim2i(Dim2i var1);

    public Dim2i getDim2i();

    public boolean getSelected();

    public Dim2i getParentDimension();

    public boolean isHighlight();

    public void setParentDimension(Dim2i var1);

    public void setHighlight(boolean var1);

    public void setSelected(boolean var1);
}

