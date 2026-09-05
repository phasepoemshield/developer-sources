/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.Gson
 *  com.viaversion.viaversion.libs.gson.JsonSyntaxException
 *  com.viaversion.viaversion.libs.gson.TypeAdapter
 *  com.viaversion.viaversion.libs.gson.TypeAdapterFactory
 *  com.viaversion.viaversion.libs.gson.stream.JsonReader
 *  com.viaversion.viaversion.libs.gson.stream.JsonToken
 *  com.viaversion.viaversion.libs.gson.stream.JsonWriter
 */
package com.viaversion.viaversion.libs.gson.internal.sql;

import com.viaversion.viaversion.libs.gson.Gson;
import com.viaversion.viaversion.libs.gson.JsonSyntaxException;
import com.viaversion.viaversion.libs.gson.TypeAdapter;
import com.viaversion.viaversion.libs.gson.TypeAdapterFactory;
import com.viaversion.viaversion.libs.gson.reflect.TypeToken;
import com.viaversion.viaversion.libs.gson.stream.JsonReader;
import com.viaversion.viaversion.libs.gson.stream.JsonToken;
import com.viaversion.viaversion.libs.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

final class SqlDateTypeAdapter
extends TypeAdapter<java.sql.Date> {
    static final TypeAdapterFactory FACTORY = new TypeAdapterFactory(){

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            return typeToken.getRawType() == java.sql.Date.class ? new SqlDateTypeAdapter() : null;
        }
    };
    private final DateFormat format = new SimpleDateFormat("MMM d, yyyy");

    private SqlDateTypeAdapter() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public java.sql.Date read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        String s = in.nextString();
        SqlDateTypeAdapter sqlDateTypeAdapter = this;
        synchronized (sqlDateTypeAdapter) {
            TimeZone originalTimeZone = this.format.getTimeZone();
            try {
                Date utilDate = this.format.parse(s);
                java.sql.Date date = new java.sql.Date(utilDate.getTime());
                return date;
            }
            catch (ParseException e) {
                throw new JsonSyntaxException("Failed parsing '" + s + "' as SQL Date; at path " + in.getPreviousPath(), (Throwable)e);
            }
            finally {
                this.format.setTimeZone(originalTimeZone);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(JsonWriter out, java.sql.Date value) throws IOException {
        String dateString;
        if (value == null) {
            out.nullValue();
            return;
        }
        SqlDateTypeAdapter sqlDateTypeAdapter = this;
        synchronized (sqlDateTypeAdapter) {
            dateString = this.format.format(value);
        }
        out.value(dateString);
    }
}

