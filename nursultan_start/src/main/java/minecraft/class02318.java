/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class02325;
import minecraft.class02332;
import minecraft.class02341;

@FunctionalInterface
public interface class02318<S, T>
extends class02341<S, T> {
    public T run(class02332 var1);

    @Override
    default public T run(class02325<S> class023252) {
        return this.run(class023252.N());
    }
}

