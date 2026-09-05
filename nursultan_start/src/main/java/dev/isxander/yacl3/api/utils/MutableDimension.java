/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.api.utils;

import dev.isxander.yacl3.api.utils.Dimension;

public interface MutableDimension<T extends Number>
extends Dimension<T> {
    public MutableDimension<T> expand(T var1, T var2);

    public MutableDimension<T> move(T var1, T var2);

    public MutableDimension<T> setX(T var1);

    public MutableDimension<T> setY(T var1);

    public MutableDimension<T> setWidth(T var1);

    public MutableDimension<T> setHeight(T var1);
}

