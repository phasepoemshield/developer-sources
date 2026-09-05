/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.Gson
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonSyntaxException
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal.sql;

import fun.crashsystem.jdrpc.libs.com.google.gson.Gson;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonSyntaxException;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory;
import fun.crashsystem.jdrpc.libs.com.google.gson.reflect.TypeToken;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonToken;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

final class SqlTimeTypeAdapter
extends TypeAdapter<Time> {
    static final TypeAdapterFactory FACTORY = new TypeAdapterFactory(){

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            return typeToken.getRawType() == Time.class ? new SqlTimeTypeAdapter() : null;
        }
    };
    private final DateFormat format = new SimpleDateFormat("hh:mm:ss a");

    private SqlTimeTypeAdapter() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Time read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        String s = in.nextString();
        SqlTimeTypeAdapter sqlTimeTypeAdapter = this;
        synchronized (sqlTimeTypeAdapter) {
            TimeZone originalTimeZone = this.format.getTimeZone();
            try {
                Date date = this.format.parse(s);
                Time time = new Time(date.getTime());
                return time;
            }
            catch (ParseException e) {
                throw new JsonSyntaxException("Failed parsing '" + s + "' as SQL Time; at path " + in.getPreviousPath(), (Throwable)e);
            }
            finally {
                this.format.setTimeZone(originalTimeZone);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(JsonWriter out, Time value) throws IOException {
        String timeString;
        if (value == null) {
            out.nullValue();
            return;
        }
        SqlTimeTypeAdapter sqlTimeTypeAdapter = this;
        synchronized (sqlTimeTypeAdapter) {
            timeString = this.format.format(value);
        }
        out.value(timeString);
    }
}

