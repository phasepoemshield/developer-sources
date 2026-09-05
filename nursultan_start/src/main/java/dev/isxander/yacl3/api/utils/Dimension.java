/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.utils.DimensionIntegerImpl
 */
package dev.isxander.yacl3.api.utils;

import dev.isxander.yacl3.api.utils.MutableDimension;
import dev.isxander.yacl3.impl.utils.DimensionIntegerImpl;

public interface Dimension<T extends Number> {
    public T width();

    public MutableDimension<T> clone();

    public T x();

    public T y();

    public Dimension<T> moved(T var1, T var2);

    public T centerY();

    public T centerX();

    public Dimension<T> expanded(T var1, T var2);

    public T height();

    public Dimension<T> withWidth(T var1);

    public Dimension<T> withHeight(T var1);

    public T xLimit();

    public Dimension<T> withX(T var1);

    public Dimension<T> withY(T var1);

    public T yLimit();

    public static MutableDimension<Integer> ofInt(int n, int n2, int n3, int n4) {
        return new DimensionIntegerImpl(n, n2, n3, n4);
    }

    public boolean isPointInside(T var1, T var2);
}

