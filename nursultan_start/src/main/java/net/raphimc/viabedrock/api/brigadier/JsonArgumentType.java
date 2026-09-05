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
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.stream.JsonReader
 *  com.viaversion.viaversion.util.GsonUtil
 */
package net.raphimc.viabedrock.api.brigadier;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.LiteralMessage;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.stream.JsonReader;
import com.viaversion.viaversion.util.GsonUtil;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Field;

public class JsonArgumentType
implements ArgumentType<Object> {
    private static final Field JSON_READER_POS;
    private static final Field JSON_READER_LINE_START;
    private static final SimpleCommandExceptionType INVALID_JSON_EXCEPTION;

    static {
        Field field;
        INVALID_JSON_EXCEPTION = new SimpleCommandExceptionType((Message)new LiteralMessage("Invalid json"));
        try {
            field = JsonReader.class.getDeclaredField("pos");
            field.setAccessible(true);
            JSON_READER_POS = field;
        }
        catch (NoSuchFieldException var1) {
            throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", var1);
        }
        try {
            field = JsonReader.class.getDeclaredField("lineStart");
            field.setAccessible(true);
            JSON_READER_LINE_START = field;
        }
        catch (NoSuchFieldException var1) {
            throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", var1);
        }
    }

    public Object parse(com.mojang.brigadier.StringReader reader) throws CommandSyntaxException {
        Object var3_4;
        JsonReader r = new JsonReader((Reader)new StringReader(reader.getRemaining()));
        try {
            GsonUtil.getGson().fromJson(r, JsonObject.class);
            reader.setCursor(reader.getCursor() + this.getPosition(r));
            var3_4 = null;
        }
        catch (Throwable throwable) {
            try {
                try {
                    r.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (Throwable t) {
                throw INVALID_JSON_EXCEPTION.createWithContext((ImmutableStringReader)reader);
            }
        }
        r.close();
        return var3_4;
    }

    public static JsonArgumentType json() {
        return new JsonArgumentType();
    }

    private int getPosition(JsonReader reader) {
        try {
            return JSON_READER_POS.getInt(reader) - JSON_READER_LINE_START.getInt(reader);
        }
        catch (IllegalAccessException var2) {
            throw new IllegalStateException("Couldn't read position of JsonReader", var2);
        }
    }
}

