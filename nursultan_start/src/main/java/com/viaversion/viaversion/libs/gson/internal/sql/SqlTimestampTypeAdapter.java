/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.Gson
 *  com.viaversion.viaversion.libs.gson.TypeAdapter
 *  com.viaversion.viaversion.libs.gson.TypeAdapterFactory
 *  com.viaversion.viaversion.libs.gson.stream.JsonReader
 *  com.viaversion.viaversion.libs.gson.stream.JsonWriter
 */
package com.viaversion.viaversion.libs.gson.internal.sql;

import com.viaversion.viaversion.libs.gson.Gson;
import com.viaversion.viaversion.libs.gson.TypeAdapter;
import com.viaversion.viaversion.libs.gson.TypeAdapterFactory;
import com.viaversion.viaversion.libs.gson.reflect.TypeToken;
import com.viaversion.viaversion.libs.gson.stream.JsonReader;
import com.viaversion.viaversion.libs.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

class SqlTimestampTypeAdapter
extends TypeAdapter<Timestamp> {
    static final TypeAdapterFactory FACTORY = new TypeAdapterFactory(){

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                TypeAdapter dateTypeAdapter = gson.getAdapter(Date.class);
                return new SqlTimestampTypeAdapter(dateTypeAdapter);
            }
            return null;
        }
    };
    private final TypeAdapter<Date> dateTypeAdapter;

    private SqlTimestampTypeAdapter(TypeAdapter<Date> dateTypeAdapter) {
        this.dateTypeAdapter = dateTypeAdapter;
    }

    public Timestamp read(JsonReader in) throws IOException {
        Date date = (Date)this.dateTypeAdapter.read(in);
        return date != null ? new Timestamp(date.getTime()) : null;
    }

    public void write(JsonWriter out, Timestamp value) throws IOException {
        this.dateTypeAdapter.write(out, (Object)value);
    }
}

