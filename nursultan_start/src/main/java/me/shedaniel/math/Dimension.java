/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.builder.ReflectionToStringBuilder
 */
package me.shedaniel.math;

import me.shedaniel.math.FloatingDimension;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Dimension
implements Cloneable {
    public int width;
    public int height;

    public Dimension getSize() {
        return new Dimension(this.width, this.height);
    }

    public Dimension(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public Dimension(double d, double d2) {
        this.width = (int)Math.ceil(d);
        this.height = (int)Math.ceil(d2);
    }

    public Dimension() {
        this(0, 0);
    }

    public Dimension(FloatingDimension floatingDimension) {
        this(floatingDimension.width, floatingDimension.height);
    }

    public Dimension(Dimension dimension) {
        this(dimension.width, dimension.height);
    }

    public boolean equals(Object object) {
        if (object instanceof Dimension) {
            object = (Dimension)object;
            return this.width == ((Dimension)object).width && this.height == ((Dimension)object).height;
        }
        return false;
    }

    public String toString() {
        return ReflectionToStringBuilder.reflectionToString((Object)this);
    }

    public int hashCode() {
        int n = 31 + this.width;
        n = n * 31 + this.height;
        return n;
    }

    public Dimension clone() {
        return this.getSize();
    }

    public void setSize(FloatingDimension floatingDimension) {
        this.setSize(floatingDimension.width, floatingDimension.height);
    }

    public void setSize(double d, double d2) {
        this.width = (int)Math.ceil(d);
        this.height = (int)Math.ceil(d2);
    }

    public void setSize(Dimension dimension) {
        this.setSize(dimension.width, dimension.height);
    }

    public void setSize(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public int getWidth() {
        return this.width;
    }

    public FloatingDimension getFloatingSize() {
        return new FloatingDimension(this.width, this.height);
    }

    public int getHeight() {
        return this.height;
    }
}

