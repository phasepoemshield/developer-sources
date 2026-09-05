/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07438
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class04135;
import minecraft.class04137;
import minecraft.class07438;

final class class04110<E extends class07438, A>
extends class04137<E, A> {
    class04110(A a) {
        this(a, () -> "C[" + String.valueOf(a) + "]");
    }

    class04110(A a, Supplier<String> supplier) {
        super(new class04135(a, supplier));
    }
}

