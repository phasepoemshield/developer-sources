/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.builder.ReflectionToStringBuilder
 */
package me.shedaniel.math;

import me.shedaniel.math.Dimension;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FloatingDimension
implements Cloneable {
    public double width;
    public double height;

    public Dimension getSize() {
        return new Dimension(this.width, this.height);
    }

    public FloatingDimension() {
        this(0.0, 0.0);
    }

    public FloatingDimension(double d, double d2) {
        this.width = d;
        this.height = d2;
    }

    public FloatingDimension(FloatingDimension floatingDimension) {
        this(floatingDimension.width, floatingDimension.height);
    }

    public FloatingDimension(Dimension dimension) {
        this(dimension.width, dimension.height);
    }

    public boolean equals(Object object) {
        if (object instanceof FloatingDimension) {
            object = (FloatingDimension)object;
            return this.width == ((FloatingDimension)object).width && this.height == ((FloatingDimension)object).height;
        }
        return false;
    }

    public String toString() {
        return ReflectionToStringBuilder.reflectionToString((Object)this);
    }

    public int hashCode() {
        int n = 31 + Double.hashCode(this.width);
        n = n * 31 + Double.hashCode(this.height);
        return n;
    }

    public FloatingDimension clone() {
        return this.getFloatingSize();
    }

    public void setSize(FloatingDimension floatingDimension) {
        this.setSize(floatingDimension.width, floatingDimension.height);
    }

    public void setSize(double d, double d2) {
        this.width = d;
        this.height = d2;
    }

    public void setSize(Dimension dimension) {
        this.setSize(dimension.width, dimension.height);
    }

    public double getWidth() {
        return this.width;
    }

    public FloatingDimension getFloatingSize() {
        return new FloatingDimension(this.width, this.height);
    }

    public double getHeight() {
        return this.height;
    }
}

