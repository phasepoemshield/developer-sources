/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui;

import me.flashyreese.mods.reeses_sodium_options.client.gui.Point2iAccess;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public interface Dim2iAccess {
    public void setX(int var1);

    public void setY(int var1);

    public void setWidth(int var1);

    public void setPoint2i(Point2iAccess var1);

    public boolean canFitDimension(Dim2i var1);

    public boolean overlapWith(Dim2i var1);

    public void setHeight(int var1);
}

