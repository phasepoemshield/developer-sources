/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00392
 *  minecraft.class02169
 *  minecraft.class07001
 *  minecraft.class08876
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import minecraft.class00392;
import minecraft.class02169;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class08876;

public class class07755<T> {
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.nbt.trailing"));
    public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.nbt.expected.compound"));
    public static final char L = ',';
    public static final char u = ':';
    private static final class07755<class07709> M = class07755.N(class07713.N);
    public static final Codec<class07001> i = Codec.STRING.comapFlatMap(string -> {
        try {
            class07709 class077092 = M.y((String)string);
            if (class077092 instanceof class07001) {
                return DataResult.success((Object)((class07001)class077092), (Lifecycle)Lifecycle.stable());
            }
            return DataResult.error(() -> "Expected compound tag, got " + String.valueOf(class077092));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return DataResult.error(() -> ((CommandSyntaxException)commandSyntaxException).getMessage());
        }
    }, class07001::toString);
    public static final Codec<class07001> R = Codec.withAlternative(i, (Codec)class07001.N);
    private final DynamicOps<T> B;
    private final class02169<T> Z;

    public static class07001 L(StringReader stringReader) throws CommandSyntaxException {
        class07709 class077092 = M.y(stringReader);
        return class07755.N(stringReader, class077092);
    }

    private class07755(DynamicOps<T> dynamicOps, class02169<T> class021692) {
        this.B = dynamicOps;
        this.Z = class021692;
    }

    public T y(String string) throws CommandSyntaxException {
        return this.N(new StringReader(string));
    }

    public T y(StringReader stringReader) throws CommandSyntaxException {
        return (T)this.Z.N(stringReader);
    }

    public DynamicOps<T> N() {
        return this.B;
    }

    public T N(StringReader stringReader) throws CommandSyntaxException {
        Object object = this.Z.N(stringReader);
        stringReader.skipWhitespace();
        if (stringReader.canRead()) {
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        return (T)object;
    }

    public static <T> class07755<T> N(DynamicOps<T> dynamicOps) {
        return new class07755<T>(dynamicOps, class08876.N(dynamicOps));
    }

    private static class07001 N(StringReader stringReader, class07709 class077092) throws CommandSyntaxException {
        if (class077092 instanceof class07001) {
            return (class07001)class077092;
        }
        throw y.createWithContext((ImmutableStringReader)stringReader);
    }

    public static class07001 N(String string) throws CommandSyntaxException {
        StringReader stringReader = new StringReader(string);
        return class07755.N(stringReader, M.N(stringReader));
    }
}

