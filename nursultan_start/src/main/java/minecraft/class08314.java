/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.Reader;

public class class08314 {
    public static JsonElement N(Reader reader) throws JsonIOException, JsonSyntaxException {
        return JsonParser.parseReader((Reader)reader);
    }

    public static JsonElement N(String string) throws JsonSyntaxException {
        return JsonParser.parseString((String)string);
    }
}

