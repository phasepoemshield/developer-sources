/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 *  minecraft.class07109
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00874;
import minecraft.class00881;
import minecraft.class00883;
import minecraft.class06889;
import minecraft.class07109;
import minecraft.class07701;

public final class class00872
extends Record
implements class00874 {
    private final double left;
    private final double up;
    private final double forwards;
    public static final char N = '^';

    @Override
    public boolean L() {
        return true;
    }

    public class00872(double d, double d2, double d3) {
        this.left = d;
        this.up = d2;
        this.forwards = d3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00872.class, "left;up;forwards", "left", "up", "forwards"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00872.class, "left;up;forwards", "left", "up", "forwards"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00872.class, "left;up;forwards", "left", "up", "forwards"}, this);
    }

    public double i() {
        return this.up;
    }

    public double u() {
        return this.left;
    }

    @Override
    public class07109 y(class07701 class077012) {
        return class07109.N;
    }

    @Override
    public boolean y() {
        return true;
    }

    @Override
    public class06889 N(class07701 class077012) {
        class06889 class068892 = class077012.m().N(class077012);
        return class06889.N((class07109)class077012.E(), (class06889)new class06889(this.left, this.up, this.forwards)).y(class068892.M, class068892.B, class068892.Z);
    }

    @Override
    public boolean N() {
        return true;
    }

    public static class00872 N(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        double d = class00872.N(stringReader, n);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(n);
            throw class00881.N.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        double d2 = class00872.N(stringReader, n);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(n);
            throw class00881.N.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        double d3 = class00872.N(stringReader, n);
        return new class00872(d, d2, d3);
    }

    private static double N(StringReader stringReader, int n) throws CommandSyntaxException {
        if (!stringReader.canRead()) {
            throw class00883.N.createWithContext((ImmutableStringReader)stringReader);
        }
        if (stringReader.peek() != '^') {
            stringReader.setCursor(n);
            throw class00881.y.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        return stringReader.canRead() && stringReader.peek() != ' ' ? stringReader.readDouble() : 0.0;
    }

    public double R() {
        return this.forwards;
    }
}

