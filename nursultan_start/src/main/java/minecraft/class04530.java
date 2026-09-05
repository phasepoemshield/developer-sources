/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  it.unimi.dsi.fastutil.ints.Int2DoubleMap
 *  it.unimi.dsi.fastutil.ints.Int2DoubleOpenHashMap
 *  minecraft.class02253
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import it.unimi.dsi.fastutil.ints.Int2DoubleMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleOpenHashMap;
import java.util.Locale;
import java.util.function.DoubleSupplier;
import java.util.function.ToDoubleFunction;
import minecraft.class02253;
import minecraft.class04522;
import minecraft.class04527;
import minecraft.class04542;
import org.jspecify.annotations.Nullable;

public class class04530 {
    private final String y;
    private final class02253 L;
    private final DoubleSupplier u;
    private final ByteBuf i;
    private final ByteBuf R;
    private volatile boolean M;
    private final @Nullable Runnable B;
    final @Nullable class04522 N;
    private double Z;

    DoubleSupplier L() {
        return this.u;
    }

    public boolean M() {
        return this.N != null && this.N.method_34792(this.Z);
    }

    protected class04530(String string, class02253 class022532, DoubleSupplier doubleSupplier, @Nullable Runnable runnable, @Nullable class04522 class045222) {
        this.y = string;
        this.L = class022532;
        this.B = runnable;
        this.u = doubleSupplier;
        this.N = class045222;
        this.R = ByteBufAllocator.DEFAULT.buffer();
        this.i = ByteBufAllocator.DEFAULT.buffer();
        this.M = true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class04530 class045302 = (class04530)object;
        return this.y.equals(class045302.y) && this.L.equals((Object)class045302.L);
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    private void B() {
        if (!this.M) {
            throw new IllegalStateException(String.format(Locale.ROOT, "Sampler for metric %s not started!", this.y));
        }
    }

    public class02253 i() {
        return this.L;
    }

    public String u() {
        return this.y;
    }

    public void y() {
        this.B();
        this.R.release();
        this.i.release();
        this.M = false;
    }

    public void N(int n) {
        this.B();
        this.Z = this.u.getAsDouble();
        this.R.writeDouble(this.Z);
        this.i.writeInt(n);
    }

    public static class04530 N(String string, class02253 class022532, DoubleSupplier doubleSupplier) {
        return new class04530(string, class022532, doubleSupplier, null, null);
    }

    public static <T> class04530 N(String string, class02253 class022532, T t, ToDoubleFunction<T> toDoubleFunction) {
        return class04530.N(string, class022532, toDoubleFunction, t).N();
    }

    public static <T> class04527<T> N(String string, class02253 class022532, ToDoubleFunction<T> toDoubleFunction, T t) {
        if (toDoubleFunction == null) {
            throw new IllegalStateException();
        }
        return new class04527<T>(string, class022532, toDoubleFunction, t);
    }

    public void N() {
        if (!this.M) {
            throw new IllegalStateException("Not running");
        }
        if (this.B != null) {
            this.B.run();
        }
    }

    public class04542 R() {
        Int2DoubleOpenHashMap int2DoubleOpenHashMap = new Int2DoubleOpenHashMap();
        int n = Integer.MIN_VALUE;
        int n2 = Integer.MIN_VALUE;
        while (this.R.isReadable(8)) {
            int n3 = this.i.readInt();
            if (n == Integer.MIN_VALUE) {
                n = n3;
            }
            int2DoubleOpenHashMap.put(n3, this.R.readDouble());
            n2 = n3;
        }
        return new class04542(n, n2, (Int2DoubleMap)int2DoubleOpenHashMap);
    }
}

