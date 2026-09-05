/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06750
 *  minecraft.class06756
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class00607;
import minecraft.class06750;
import minecraft.class06756;
import org.jspecify.annotations.Nullable;

public class class00592<Value> {
    private final class06750<Value> N;
    private @Nullable Value y;
    private class06756<Value> L = class06756.N();
    private boolean u = false;
    private boolean i = true;
    private boolean R = false;

    public class00592<Value> L() {
        this.R = true;
        return this;
    }

    public class00592(class06750<Value> class067502) {
        this.N = class067502;
    }

    public class00607<Value> u() {
        return new class00607<Value>(this.N, Objects.requireNonNull(this.y, "Missing default value"), this.L, this.u, this.i, this.R);
    }

    public class00592<Value> y() {
        this.i = false;
        return this;
    }

    public class00592<Value> N() {
        this.u = true;
        return this;
    }

    public class00592<Value> N(Value Value) {
        this.y = Value;
        return this;
    }

    public class00592<Value> N(class06756<Value> class067562) {
        this.L = class067562;
        return this;
    }
}

