/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  minecraft.class04942
 *  minecraft.class04968
 *  minecraft.class04980
 */
package minecraft;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import minecraft.class04942;
import minecraft.class04968;
import minecraft.class04980;

class class00052
extends TypeAdapter<class04980> {
    private class00052() {
    }

    public void write(JsonWriter jsonWriter, class04980 class049802) throws IOException {
        jsonWriter.jsonValue(new class04968().N((class04942)class049802));
    }

    public class04980 read(JsonReader jsonReader) throws IOException {
        String string = jsonReader.nextString();
        return class04980.N((class04968)new class04968(), (String)string);
    }
}

