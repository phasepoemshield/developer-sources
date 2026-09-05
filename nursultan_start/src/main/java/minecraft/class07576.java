/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00610
 *  minecraft.class00619
 *  minecraft.class07592
 *  minecraft.class07601
 *  minecraft.class07606
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import java.util.function.LongSupplier;
import minecraft.class00610;
import minecraft.class00619;
import minecraft.class07592;
import minecraft.class07601;
import minecraft.class07606;
import org.jspecify.annotations.Nullable;

public class class07576<Value, Argument>
implements class07601<Value> {
    private final class00619<Value, Argument> N;
    private final class07592<Argument> y;
    private final LongSupplier L;
    private int u;
    private @Nullable Argument i;

    public class07576(Optional<Integer> optional, class00619<Value, Argument> class006192, class07606<Argument> class076062, class00610<Argument> class006102, LongSupplier longSupplier) {
        this.N = class006192;
        this.L = longSupplier;
        this.y = class076062.N(optional, class006102);
    }

    public Value applyTimeBased(Value Value, int n) {
        if (this.i == null || n != this.u) {
            this.u = n;
            this.i = this.y.N(this.L.getAsLong());
        }
        return (Value)this.N.apply(Value, this.i);
    }
}

