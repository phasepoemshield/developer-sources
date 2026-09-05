/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10717
 *  Nursultan.class12020
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  minecraft.class00392
 */
package Nursultan;

import Nursultan.class10717;
import Nursultan.class12020;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import minecraft.class00392;

public class class10761
implements ArgumentType<String> {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public boolean y_init;

    public int L() {
        return (Integer)this.y_2;
    }

    private class10761(class10717 class107172, int n, int n2) {
        this.R();
        this.y_0 = class107172;
        this.y_1 = n;
        this.y_2 = n2;
    }

    static {
        class10761.Z();
        N_0 = new DynamicCommandExceptionType(object -> class00392.y((String)class12020.N((String)"argument.out-of-bounds").formatted(new Object[]{object})));
    }

    public String toString() {
        return ((class10717)this.y_0).name() + " minLimit: " + (Integer)this.y_1 + " maxLimit: " + (Integer)this.y_2;
    }

    private static void Z() {
        N_0 = null;
    }

    public class10717 y() {
        return (class10717)this.y_0;
    }

    public static class10761 y(int n, int n2) {
        return new class10761(class10717.GREEDY_PHRASE, n, n2);
    }

    public static class10761 N(int n, int n2) {
        return new class10761(class10717.SINGLE_WORD, n, n2);
    }

    public static class10761 N(int n) {
        return class10761.y(0, n);
    }

    public int N() {
        return (Integer)this.y_1;
    }

    public String parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readString();
        if (string.length() > (Integer)this.y_2 || string.length() < (Integer)this.y_1) {
            throw ((DynamicCommandExceptionType)N_0).create((Object)string);
        }
        stringReader = new StringReader(string);
        if ((class10717)this.y_0 == class10717.GREEDY_PHRASE) {
            String string2 = stringReader.getRemaining();
            stringReader.setCursor(stringReader.getTotalLength());
            return string2;
        }
        return (class10717)this.y_0 == class10717.SINGLE_WORD ? stringReader.readUnquotedString() : stringReader.readString();
    }

    private void R() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_1 = 0;
            this.y_2 = 0;
        }
    }
}

