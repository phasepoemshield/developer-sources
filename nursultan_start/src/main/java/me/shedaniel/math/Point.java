/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.builder.ReflectionToStringBuilder
 */
package me.shedaniel.math;

import me.shedaniel.math.FloatingPoint;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Point
implements Cloneable {
    public int x;
    public int y;

    public Point(int n, int n2) {
        this.x = n;
        this.y = n2;
    }

    public Point(double d, double d2) {
        this((int)d, (int)d2);
    }

    public Point(FloatingPoint floatingPoint) {
        this(floatingPoint.x, floatingPoint.y);
    }

    public Point(Point point) {
        this(point.x, point.y);
    }

    public Point() {
        this(0, 0);
    }

    public boolean equals(Object object) {
        if (object instanceof Point) {
            object = (Point)object;
            return this.x == ((Point)object).x && this.y == ((Point)object).y;
        }
        return super.equals(object);
    }

    public String toString() {
        return ReflectionToStringBuilder.reflectionToString((Object)this);
    }

    public int hashCode() {
        int n = 31 + this.x;
        n = n * 31 + this.y;
        return n;
    }

    public Point clone() {
        return this.getLocation();
    }

    public Point getLocation() {
        return new Point(this.x, this.y);
    }

    public void move(int n, int n2) {
        this.x = n;
        this.y = n2;
    }

    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    public void setLocation(double d, double d2) {
        this.x = (int)Math.floor(d + 0.5);
        this.y = (int)Math.floor(d2 + 0.5);
    }

    public void translate(int n, int n2) {
        this.x += n;
        this.y += n2;
    }

    public FloatingPoint getFloatingLocation() {
        return new FloatingPoint(this.x, this.y);
    }
}

