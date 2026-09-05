/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 *  com.google.gson.Strictness
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 *  com.google.gson.stream.MalformedJsonException
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class class08326 {
    public static JsonElement N(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setStrictness(Strictness.STRICT);
            JsonElement jsonElement = JsonParser.parseReader((JsonReader)jsonReader);
            if (!jsonElement.isJsonNull() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return jsonElement;
        }
        catch (MalformedJsonException | NumberFormatException throwable) {
            throw new JsonSyntaxException(throwable);
        }
        catch (IOException iOException) {
            throw new JsonIOException((Throwable)iOException);
        }
    }

    public static JsonElement N(String string) throws JsonSyntaxException {
        return class08326.N(new StringReader(string));
    }
}

