/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.Gson
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal.sql;

import fun.crashsystem.jdrpc.libs.com.google.gson.Gson;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory;
import fun.crashsystem.jdrpc.libs.com.google.gson.reflect.TypeToken;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonWriter;
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

