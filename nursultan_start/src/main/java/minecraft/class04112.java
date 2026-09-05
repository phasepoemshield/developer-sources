/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02042
 *  minecraft.class03527
 *  minecraft.class03529
 *  minecraft.class05946
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class02042;
import minecraft.class03527;
import minecraft.class03529;
import minecraft.class05946;
import org.jspecify.annotations.Nullable;

class class04112<T>
extends class03529<T> {
    @Nullable Supplier<T> N;

    protected class04112(class02042<T> class020422, @Nullable class05946<T> class059462) {
        super(class03527.field_36454, class020422, class059462, null);
    }

    public void y(T t) {
        super.y(t);
        this.N = null;
    }

    public T N() {
        if (this.N != null) {
            this.y(this.N.get());
        }
        return (T)super.N();
    }
}

