/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class02179
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import minecraft.class02179;

public interface class08524<T extends Exception> {
    public T create(String var1, int var2);

    public static class08524<CommandSyntaxException> N(DynamicCommandExceptionType dynamicCommandExceptionType, String string) {
        return (string2, n) -> dynamicCommandExceptionType.createWithContext((ImmutableStringReader)class02179.N((String)string2, (int)n), (Object)string);
    }

    public static class08524<CommandSyntaxException> N(SimpleCommandExceptionType simpleCommandExceptionType) {
        return (string, n) -> simpleCommandExceptionType.createWithContext((ImmutableStringReader)class02179.N((String)string, (int)n));
    }
}

