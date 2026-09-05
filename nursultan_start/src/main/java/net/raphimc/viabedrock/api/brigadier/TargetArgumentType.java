/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.LiteralMessage
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package net.raphimc.viabedrock.api.brigadier;

import com.mojang.brigadier.LiteralMessage;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class TargetArgumentType
implements ArgumentType<Object> {
    private static final SimpleCommandExceptionType INVALID_TARGET_EXCEPTION = new SimpleCommandExceptionType((Message)new LiteralMessage("Invalid target"));

    public static TargetArgumentType target() {
        return new TargetArgumentType();
    }

    public Object parse(StringReader reader) throws CommandSyntaxException {
        return null;
    }
}

