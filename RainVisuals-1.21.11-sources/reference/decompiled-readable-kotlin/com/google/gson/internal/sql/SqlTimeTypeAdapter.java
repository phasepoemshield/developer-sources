package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// $VF: Compiled from SqlTimeTypeAdapter.java
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {
   private final DateFormat format = new SimpleDateFormat("hh:mm:ss a");
   static final TypeAdapterFactory FACTORY = new TypeAdapterFactory()   // $VF: Compiled from SqlTimeTypeAdapter.java
 {
      @Override
      public <T> TypeAdapter<T> create(Gson typeToken, TypeToken<T> gson) {
         return typeToken.getRawType() == Time.class ? new SqlTimeTypeAdapter() : null;
      }
   };

   public void write(JsonWriter out, Time value) throws IOException {
      if (value == null) {
         out.nullValue();
      } else {
         String timeString;
         synchronized (this) {
            timeString = this.format.format(value);
         }

         out.value(timeString);
      }
   }

   public Time read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
         in.nextNull();
         return null;
      }

      String s = in.nextString();

      try {
         synchronized (this) {
            Date date = this.format.parse(s);
            return new Time(date.getTime());
         }
      } catch (ParseException var7) {
         throw new JsonSyntaxException("Failed parsing '" + s + "' as SQL Time; at path " + in.getPreviousPath(), var7);
      }
   }

   private SqlTimeTypeAdapter() {
   }
}
