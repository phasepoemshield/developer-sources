/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  dev.isxander.yacl3.api.utils.MutableDimension
 */
package dev.isxander.yacl3.impl.utils;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.api.utils.MutableDimension;

public class DimensionIntegerImpl
implements MutableDimension<Integer> {
    private int x;
    private int y;
    private int width;
    private int height;

    public Integer width() {
        return this.width;
    }

    public DimensionIntegerImpl(int n, int n2, int n3, int n4) {
        this.x = n;
        this.y = n2;
        this.width = n3;
        this.height = n4;
    }

    public MutableDimension<Integer> clone() {
        return new DimensionIntegerImpl(this.x, this.y, this.width, this.height);
    }

    public MutableDimension<Integer> expand(Integer n, Integer n2) {
        this.width += n.intValue();
        this.height += n2.intValue();
        return this;
    }

    public Integer x() {
        return this.x;
    }

    public Integer y() {
        return this.y;
    }

    public MutableDimension<Integer> move(Integer n, Integer n2) {
        this.x += n.intValue();
        this.y += n2.intValue();
        return this;
    }

    public MutableDimension<Integer> setX(Integer n) {
        this.x = n;
        return this;
    }

    public MutableDimension<Integer> setY(Integer n) {
        this.y = n;
        return this;
    }

    public Dimension<Integer> moved(Integer n, Integer n2) {
        return this.clone().move((Number)n, (Number)n2);
    }

    public Integer centerY() {
        return this.y + this.height / 2;
    }

    public Integer centerX() {
        return this.x + this.width / 2;
    }

    public Dimension<Integer> expanded(Integer n, Integer n2) {
        return this.clone().expand((Number)n, (Number)n2);
    }

    public Integer height() {
        return this.height;
    }

    public MutableDimension<Integer> setWidth(Integer n) {
        this.width = n;
        return this;
    }

    public Dimension<Integer> withWidth(Integer n) {
        return this.clone().setWidth((Number)n);
    }

    public Dimension<Integer> withHeight(Integer n) {
        return this.clone().setHeight((Number)n);
    }

    public Integer xLimit() {
        return this.x + this.width;
    }

    public Dimension<Integer> withX(Integer n) {
        return this.clone().setX((Number)n);
    }

    public Dimension<Integer> withY(Integer n) {
        return this.clone().setY((Number)n);
    }

    public Integer yLimit() {
        return this.y + this.height;
    }

    public MutableDimension<Integer> setHeight(Integer n) {
        this.height = n;
        return this;
    }

    public boolean isPointInside(Integer n, Integer n2) {
        return n >= (Integer)this.x() && n <= (Integer)this.xLimit() && n2 >= this.y() && n2 <= (Integer)this.yLimit();
    }
}

