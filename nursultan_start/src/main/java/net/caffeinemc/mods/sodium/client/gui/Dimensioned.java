/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui;

import net.caffeinemc.mods.sodium.client.util.Dim2i;

public interface Dimensioned {
    public Dim2i getDimensions();

    default public int getY() {
        return this.getDimensions().y();
    }

    default public int getX() {
        return this.getDimensions().x();
    }

    default public int getWidth() {
        return this.getDimensions().width();
    }

    default public int getLimitX() {
        return this.getX() + this.getWidth();
    }

    default public int getCenterY() {
        return this.getY() + this.getHeight() / 2;
    }

    default public int getLimitY() {
        return this.getY() + this.getHeight();
    }

    default public int getCenterX() {
        return this.getX() + this.getWidth() / 2;
    }

    default public int getHeight() {
        return this.getDimensions().height();
    }
}

