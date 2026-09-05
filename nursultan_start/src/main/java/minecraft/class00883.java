/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class00881;

public final class class00883
extends Record {
    private final boolean relative;
    private final double value;
    private static final char i = '~';
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.pos.missing.double"));
    public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.pos.missing.int"));

    public double L() {
        return this.value;
    }

    public class00883(boolean bl, double d) {
        this.relative = bl;
        this.value = d;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00883.class, "relative;value", "relative", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00883.class, "relative;value", "relative", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00883.class, "relative;value", "relative", "value"}, this);
    }

    public static boolean y(StringReader stringReader) {
        boolean bl;
        if (stringReader.peek() == '~') {
            bl = true;
            stringReader.skip();
        } else {
            bl = false;
        }
        return bl;
    }

    public boolean y() {
        return this.relative;
    }

    public static class00883 N(StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '^') {
            throw class00881.y.createWithContext((ImmutableStringReader)stringReader);
        }
        if (!stringReader.canRead()) {
            throw y.createWithContext((ImmutableStringReader)stringReader);
        }
        boolean bl = class00883.y(stringReader);
        double d = stringReader.canRead() && stringReader.peek() != ' ' ? (bl ? stringReader.readDouble() : (double)stringReader.readInt()) : 0.0;
        return new class00883(bl, d);
    }

    public double N(double d) {
        if (this.relative) {
            return this.value + d;
        }
        return this.value;
    }

    public static class00883 N(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '^') {
            throw class00881.y.createWithContext((ImmutableStringReader)stringReader);
        }
        if (!stringReader.canRead()) {
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        boolean bl2 = class00883.y(stringReader);
        int n = stringReader.getCursor();
        double d = stringReader.canRead() && stringReader.peek() != ' ' ? stringReader.readDouble() : 0.0;
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        if (bl2 && string.isEmpty()) {
            return new class00883(true, 0.0);
        }
        if (!string.contains(".") && !bl2 && bl) {
            d += 0.5;
        }
        return new class00883(bl2, d);
    }

    public boolean N() {
        return this.relative;
    }
}

