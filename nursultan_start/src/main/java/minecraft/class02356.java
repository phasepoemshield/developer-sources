/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08501
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class02324;
import minecraft.class02353;
import minecraft.class08501;
import org.jspecify.annotations.Nullable;

class class02356<S, T>
implements class08501<S, T>,
Supplier<String> {
    private final class02353<T> y;
    @Nullable class02324<S, T> N;

    @Override
    public String get() {
        return "Unbound rule " + String.valueOf(this.y);
    }

    public class02356(class02353<T> class023532) {
        this.y = class023532;
    }

    public class02324<S, T> y() {
        return Objects.requireNonNull(this.N, this);
    }

    public class02353<T> N() {
        return this.y;
    }
}

