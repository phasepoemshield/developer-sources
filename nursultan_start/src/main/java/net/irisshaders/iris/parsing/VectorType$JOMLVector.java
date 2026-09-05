/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.parsing;

import java.util.function.Supplier;
import net.irisshaders.iris.parsing.VectorType;

public class VectorType$JOMLVector<T>
extends VectorType {
    private final String name;
    private final Supplier<T> supplier;

    public T create() {
        return this.supplier.get();
    }

    public VectorType$JOMLVector(String string, Supplier<T> supplier) {
        this.name = string;
        this.supplier = supplier;
    }

    public String toString() {
        return this.name;
    }
}

