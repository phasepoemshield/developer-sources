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
import minecraft.class00050;
import org.slf4j.Logger;

public class class00045
extends TypeAdapter<class00050> {
    private static final Logger N = LogUtils.getLogger();

    public void write(JsonWriter jsonWriter, class00050 class000502) throws IOException {
        jsonWriter.value((long)class000502.field_60230);
    }

    public class00050 read(JsonReader jsonReader) throws IOException {
        int n = jsonReader.nextInt();
        for (class00050 class000502 : class00050.values()) {
            if (class000502.field_60230 != n) continue;
            return class000502;
        }
        N.warn("Unsupported RegionSelectionPreference {}", (Object)n);
        return class00050.field_60229;
    }
}

