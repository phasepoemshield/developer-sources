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
import minecraft.class00073;
import org.slf4j.Logger;

public class class00047
extends TypeAdapter<class00073> {
    private static final Logger N = LogUtils.getLogger();

    public void write(JsonWriter jsonWriter, class00073 class000732) throws IOException {
        jsonWriter.value((long)class000732.field_60238);
    }

    public class00073 read(JsonReader jsonReader) throws IOException {
        int n = jsonReader.nextInt();
        class00073 class000732 = class00073.N(n);
        if (class000732 == null) {
            N.warn("Unsupported ServiceQuality {}", (Object)n);
            return class00073.field_60237;
        }
        return class000732;
    }
}

