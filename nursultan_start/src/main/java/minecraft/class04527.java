/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02253
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.ToDoubleFunction;
import minecraft.class02253;
import minecraft.class04522;
import minecraft.class04530;
import org.jspecify.annotations.Nullable;

public class class04527<T> {
    private final String N;
    private final class02253 y;
    private final DoubleSupplier L;
    private final T u;
    private @Nullable Runnable i;
    private @Nullable class04522 R;

    public class04527(String string, class02253 class022532, ToDoubleFunction<T> toDoubleFunction, T t) {
        this.N = string;
        this.y = class022532;
        this.L = () -> toDoubleFunction.applyAsDouble(t);
        this.u = t;
    }

    public class04530 N() {
        return new class04530(this.N, this.y, this.L, this.i, this.R);
    }

    public class04527<T> N(class04522 class045222) {
        this.R = class045222;
        return this;
    }

    public class04527<T> N(Consumer<T> consumer) {
        this.i = () -> consumer.accept(this.u);
        return this;
    }
}

