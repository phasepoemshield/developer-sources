/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import minecraft.class00082;
import org.slf4j.Logger;

public class class00054
extends TypeAdapter<class00082> {
    private static final Logger N = LogUtils.getLogger();

    public void write(JsonWriter jsonWriter, class00082 class000822) throws IOException {
        jsonWriter.value(class000822.field_60200);
    }

    public class00082 read(JsonReader jsonReader) throws IOException {
        String string = jsonReader.nextString();
        class00082 class000822 = class00082.N(string);
        if (class000822 == null) {
            N.warn("Unsupported RealmsRegion {}", (Object)string);
            return class00082.field_60199;
        }
        return class000822;
    }
}

