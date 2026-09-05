/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.LiteralMessage
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package net.raphimc.viabedrock.api.brigadier;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.LiteralMessage;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class BlockStatesArgumentType
implements ArgumentType<Object> {
    private static final SimpleCommandExceptionType INVALID_BLOCK_STATES_EXCEPTION = new SimpleCommandExceptionType((Message)new LiteralMessage("Invalid block states"));

    public Object parse(StringReader reader) throws CommandSyntaxException {
        if (!reader.canRead()) {
            throw INVALID_BLOCK_STATES_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        if (reader.peek() != '[') {
            throw INVALID_BLOCK_STATES_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        reader.skip();
        while (reader.canRead() && reader.peek() != ']') {
            reader.skipWhitespace();
            reader.readQuotedString();
            reader.skipWhitespace();
            if (reader.peek() != '=') {
                throw INVALID_BLOCK_STATES_EXCEPTION.createWithContext((ImmutableStringReader)reader);
            }
            reader.skip();
            reader.skipWhitespace();
            if (reader.peek() == '\"') {
                reader.readQuotedString();
            } else {
                try {
                    reader.readInt();
                }
                catch (Throwable t) {
                    reader.readBoolean();
                }
            }
            reader.skipWhitespace();
            if (reader.peek() != ',') continue;
            reader.skip();
        }
        if (!reader.canRead()) {
            throw INVALID_BLOCK_STATES_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        if (reader.peek() != ']') {
            throw INVALID_BLOCK_STATES_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        reader.skip();
        return null;
    }

    public static BlockStatesArgumentType blockStates() {
        return new BlockStatesArgumentType();
    }
}

