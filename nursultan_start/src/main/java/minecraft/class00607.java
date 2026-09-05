/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class04206
 *  minecraft.class06750
 *  minecraft.class06756
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00592;
import minecraft.class00751;
import minecraft.class04206;
import minecraft.class06750;
import minecraft.class06756;
import minecraft.class07536;

public class class00607<Value> {
    private final class06750<Value> y;
    private final Value L;
    private final class06756<Value> u;
    public boolean N;
    private final boolean i;
    private final boolean R;

    public Codec<Value> L() {
        return this.y.N().validate(arg_0 -> this.u.N(arg_0));
    }

    class00607(class06750<Value> class067502, Value Value, class06756<Value> class067562, boolean bl, boolean bl2, boolean bl3) {
        this.y = class067502;
        this.L = Value;
        this.u = class067562;
        this.N = bl;
        this.i = bl2;
        this.R = bl3;
    }

    public String toString() {
        return class07536.N((class00751)class04206.Nc, (Object)this);
    }

    public boolean i() {
        return this.i;
    }

    public boolean u() {
        return this.N;
    }

    public Value y() {
        return this.L;
    }

    public Value N(Value Value) {
        return (Value)this.u.y(Value);
    }

    public class06750<Value> N() {
        return this.y;
    }

    public static <Value> class00592<Value> N(class06750<Value> class067502) {
        return new class00592<Value>(class067502);
    }

    public boolean R() {
        return this.R;
    }
}

