/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07311
 */
package net.irisshaders.iris.layer;

import java.util.function.Function;
import minecraft.class07311;

public interface WrappingMultiBufferSource {
    public void assertWrapStackEmpty();

    public void pushWrappingFunction(Function<class07311, class07311> var1);

    public void popWrappingFunction();
}

