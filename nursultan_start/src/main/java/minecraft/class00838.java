/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.BuiltInExceptionProvider
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

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

public final class class00838
extends Record
implements class00850<Float> {
    private final class00819<Float> bounds;
    public static final class00838 L = new class00838(class00819.i());
    public static final Codec<class00838> u = class00819.N(Codec.FLOAT).xmap(class00838::new, class00838::N);
    public static final class02362<ByteBuf, class00838> i = class00819.N(class02389.E).N_10(class00838::new, class00838::N);

    public class00838(class00819<Float> class008192) {
        this.bounds = class008192;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00838.class, "bounds", "bounds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00838.class, "bounds", "bounds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00838.class, "bounds", "bounds"}, this);
    }

    @Override
    public class00819<Float> N() {
        return this.bounds;
    }

    public static class00838 N(StringReader stringReader) throws CommandSyntaxException {
        class00819<Float> class008192 = class00819.N(stringReader, Float::parseFloat, () -> ((BuiltInExceptionProvider)CommandSyntaxException.BUILT_IN_EXCEPTIONS).readerInvalidFloat());
        return new class00838(class008192);
    }
}

