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

public final class class00816
extends Record
implements class00850<Double> {
    private final class00819<Double> bounds;
    private final class00819<Double> boundsSqr;
    public static final class00816 L = new class00816(class00819.i());
    public static final Codec<class00816> u = class00819.N(Codec.DOUBLE).validate(class00819::y).xmap(class00816::new, class00816::N);
    public static final class02362<ByteBuf, class00816> i = class00819.N(class02389.W).N_10(class00816::new, class00816::N);

    public static class00816 L(double d) {
        return new class00816(class00819.L(d));
    }

    private class00816(class00819<Double> class008192) {
        this(class008192, class008192.N_18(class04995::E));
    }

    public class00816(class00819<Double> class008192, class00819<Double> class008193) {
        this.bounds = class008192;
        this.boundsSqr = class008193;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00816.class, "bounds;boundsSqr", "bounds", "boundsSqr"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00816.class, "bounds;boundsSqr", "bounds", "boundsSqr"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00816.class, "bounds;boundsSqr", "bounds", "boundsSqr"}, this);
    }

    public class00819<Double> i() {
        return this.boundsSqr;
    }

    public boolean i(double d) {
        if (this.boundsSqr.R().isPresent() && this.boundsSqr.R().get() > d) {
            return false;
        }
        return this.boundsSqr.M().isEmpty() || !(this.boundsSqr.M().get() < d);
    }

    public boolean u(double d) {
        if (this.bounds.R().isPresent() && this.bounds.R().get() > d) {
            return false;
        }
        return this.bounds.M().isEmpty() || !(this.bounds.M().get() < d);
    }

    public static class00816 y(double d) {
        return new class00816(class00819.y(d));
    }

    public static class00816 N(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        class00819<Double> class008192 = class00819.N(stringReader, Double::parseDouble, () -> ((BuiltInExceptionProvider)CommandSyntaxException.BUILT_IN_EXCEPTIONS).readerInvalidDouble());
        if (class008192.L()) {
            stringReader.setCursor(n);
            throw y.createWithContext((ImmutableStringReader)stringReader);
        }
        return new class00816(class008192);
    }

    public static class00816 N(double d, double d2) {
        return new class00816(class00819.N(d, d2));
    }

    @Override
    public class00819<Double> N() {
        return this.bounds;
    }

    public static class00816 N(double d) {
        return new class00816(class00819.N(d));
    }
}

