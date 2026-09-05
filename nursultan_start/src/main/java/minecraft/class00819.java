/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09405
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 */
package minecraft;

import Nursultan.class09405;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00850;
import minecraft.class02362;

public final class class00819<T extends Number>
extends Record {
    final Optional<T> min;
    final Optional<T> max;

    public boolean L() {
        return this.min.isPresent() && this.max.isPresent() && ((Comparable)((Object)((Number)this.min.get()))).compareTo((Number)this.max.get()) > 0;
    }

    public static <T extends Number> class00819<T> L(T t) {
        return new class00819(Optional.empty(), Optional.of(t));
    }

    public Optional<T> M() {
        return this.max;
    }

    public class00819(Optional<T> optional, Optional<T> optional2) {
        this.min = optional;
        this.max = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00819.class, "min;max", "min", "max"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00819.class, "min;max", "min", "max"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00819.class, "min;max", "min", "max"}, this);
    }

    public static <T extends Number> class00819<T> i() {
        return new class00819(Optional.empty(), Optional.empty());
    }

    public Optional<T> u() {
        Optional<T> optional;
        Optional<T> optional2 = this.R();
        return optional2.equals(optional = this.M()) ? optional2 : Optional.empty();
    }

    private static <T extends Number> Optional<T> y(StringReader stringReader, Function<String, T> function, Supplier<DynamicCommandExceptionType> supplier) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        while (stringReader.canRead() && class00819.N(stringReader)) {
            stringReader.skip();
        }
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        if (string.isEmpty()) {
            return Optional.empty();
        }
        try {
            return Optional.of((Number)function.apply(string));
        }
        catch (NumberFormatException numberFormatException) {
            throw supplier.get().createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
    }

    public static <T extends Number> class00819<T> y(T t) {
        return new class00819<T>(Optional.of(t), Optional.empty());
    }

    public DataResult<class00819<T>> y() {
        if (this.L()) {
            return DataResult.error(() -> "Swapped bounds in range: " + String.valueOf(this.R()) + " is higher than " + String.valueOf(this.M()));
        }
        return DataResult.success((Object)((Object)this));
    }

    public boolean N() {
        return this.R().isEmpty() && this.M().isEmpty();
    }

    public static <T extends Number> class00819<T> N(T t, T t2) {
        return new class00819<T>(Optional.of(t), Optional.of(t2));
    }

    public static <T extends Number> class00819<T> N(StringReader stringReader, Function<String, T> function, Supplier<DynamicCommandExceptionType> supplier) throws CommandSyntaxException {
        if (!stringReader.canRead()) {
            throw class00850.N.createWithContext((ImmutableStringReader)stringReader);
        }
        int n = stringReader.getCursor();
        try {
            Optional<T> optional;
            Optional<T> optional2 = class00819.y(stringReader, function, supplier);
            if (stringReader.canRead(2) && stringReader.peek() == '.' && stringReader.peek(1) == '.') {
                stringReader.skip();
                stringReader.skip();
                optional = class00819.y(stringReader, function, supplier);
            } else {
                optional = optional2;
            }
            if (optional2.isEmpty() && optional.isEmpty()) {
                throw class00850.N.createWithContext((ImmutableStringReader)stringReader);
            }
            return new class00819<T>(optional2, optional);
        }
        catch (CommandSyntaxException commandSyntaxException) {
            stringReader.setCursor(n);
            throw new CommandSyntaxException(commandSyntaxException.getType(), commandSyntaxException.getRawMessage(), commandSyntaxException.getInput(), n);
        }
    }

    private static boolean N(StringReader stringReader) {
        char c = stringReader.peek();
        if (c >= '0' && c <= '9' || c == '-') {
            return true;
        }
        if (c == '.') {
            return !stringReader.canRead(2) || stringReader.peek(1) != '.';
        }
        return false;
    }

    public static <T extends Number> class00819<T> N(T t) {
        Optional<T> optional = Optional.of(t);
        return new class00819<T>(optional, optional);
    }

    static <T extends Number> Codec<class00819<T>> N(Codec<T> codec) {
        return Codec.either((Codec)RecordCodecBuilder.create(instance -> instance.group((App)codec.optionalFieldOf("min").forGetter(class00819::R), (App)codec.optionalFieldOf("max").forGetter(class00819::M)).apply((Applicative)instance, class00819::new)), codec).xmap(either -> (class00819)((Object)((Object)either.map(class008192 -> class008192, object -> class00819.N((Number)object)))), class008192 -> {
            Optional optional = class008192.u();
            return optional.isPresent() ? Either.right((Object)((Number)optional.get())) : Either.left((Object)class008192);
        });
    }

    public <U extends Number> class00819<U> N_18(Function<T, U> function) {
        return new class00819<U>(this.min.map(function), this.max.map(function));
    }

    static <B extends ByteBuf, T extends Number> class02362<B, class00819<T>> N(class02362<B, T> class023622) {
        return new class09405(class023622);
    }

    public Optional<T> R() {
        return this.min;
    }
}

