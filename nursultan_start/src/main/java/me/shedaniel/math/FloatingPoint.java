/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.builder.ReflectionToStringBuilder
 */
package me.shedaniel.math;

import me.shedaniel.math.Point;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FloatingPoint
implements Cloneable {
    public double x;
    public double y;

    public FloatingPoint(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public FloatingPoint(FloatingPoint floatingPoint) {
        this(floatingPoint.x, floatingPoint.y);
    }

    public FloatingPoint(Point point) {
        this(point.x, point.y);
    }

    public FloatingPoint() {
        this(0.0, 0.0);
    }

    public boolean equals(Object object) {
        if (object instanceof FloatingPoint) {
            object = (FloatingPoint)object;
            return this.x == ((FloatingPoint)object).x && this.y == ((FloatingPoint)object).y;
        }
        return super.equals(object);
    }

    public String toString() {
        return ReflectionToStringBuilder.reflectionToString((Object)this);
    }

    public int hashCode() {
        int n = 31 + Double.hashCode(this.x);
        n = n * 31 + Double.hashCode(this.y);
        return n;
    }

    public FloatingPoint clone() {
        return this.getFloatingLocation();
    }

    public Point getLocation() {
        return new Point(this.x, this.y);
    }

    public void move(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    public void setLocation(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public void translate(double d, double d2) {
        this.x += d;
        this.y += d2;
    }

    public FloatingPoint getFloatingLocation() {
        return new FloatingPoint(this.x, this.y);
    }
}

