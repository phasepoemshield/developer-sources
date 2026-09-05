/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.BuiltInExceptionProvider
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04995
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00819;
import minecraft.class00850;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04995;

public final class class00836
extends Record
implements class00850<Integer> {
    private final class00819<Integer> bounds;
    private final class00819<Long> boundsSqr;
    public static final class00836 L = new class00836(class00819.i());
    public static final Codec<class00836> u = class00819.N(Codec.INT).validate(class00819::y).xmap(class00836::new, class00836::N);
    public static final class02362<ByteBuf, class00836> i = class00819.N(class02389.M).N_10(class00836::new, class00836::N);

    public static class00836 L(int n) {
        return new class00836(class00819.L(n));
    }

    private class00836(class00819<Integer> class008192) {
        this(class008192, class008192.N_18(n -> class04995.y((long)n.longValue())));
    }

    public class00836(class00819<Integer> class008192, class00819<Long> class008193) {
        this.bounds = class008192;
        this.boundsSqr = class008193;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00836.class, "bounds;boundsSqr", "bounds", "boundsSqr"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00836.class, "bounds;boundsSqr", "bounds", "boundsSqr"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00836.class, "bounds;boundsSqr", "bounds", "boundsSqr"}, this);
    }

    public class00819<Long> i() {
        return this.boundsSqr;
    }

    public boolean u(int n) {
        if (this.bounds.R().isPresent() && this.bounds.R().get() > n) {
            return false;
        }
        return this.bounds.M().isEmpty() || this.bounds.M().get() >= n;
    }

    public static class00836 y(int n) {
        return new class00836(class00819.y(n));
    }

    public static class00836 N(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        class00819<Integer> class008192 = class00819.N(stringReader, Integer::parseInt, () -> ((BuiltInExceptionProvider)CommandSyntaxException.BUILT_IN_EXCEPTIONS).readerInvalidInt());
        if (class008192.L()) {
            stringReader.setCursor(n);
            throw y.createWithContext((ImmutableStringReader)stringReader);
        }
        return new class00836(class008192);
    }

    public static class00836 N(int n, int n2) {
        return new class00836(class00819.N(n, n2));
    }

    @Override
    public class00819<Integer> N() {
        return this.bounds;
    }

    public boolean N(long l) {
        if (this.boundsSqr.R().isPresent() && this.boundsSqr.R().get() > l) {
            return false;
        }
        return this.boundsSqr.M().isEmpty() || this.boundsSqr.M().get() >= l;
    }

    public static class00836 N(int n) {
        return new class00836(class00819.N(n));
    }
}

