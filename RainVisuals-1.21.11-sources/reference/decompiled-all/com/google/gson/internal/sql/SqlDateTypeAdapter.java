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
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// $VF: Compiled from SqlDateTypeAdapter.java
final class SqlDateTypeAdapter extends TypeAdapter<Date> {
   private final DateFormat format = new SimpleDateFormat("MMM d, yyyy");
   static final TypeAdapterFactory FACTORY = new TypeAdapterFactory()   // $VF: Compiled from SqlDateTypeAdapter.java
 {
      @Override
      public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
         return typeToken.getRawType() == Date.class ? new SqlDateTypeAdapter() : null;
      }
   };

   public Date read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
         in.nextNull();
         return null;
      }

      String s = in.nextString();

      try {
         java.util.Date e;
         synchronized (this) {
            e = this.format.parse(s);
         }

         return new Date(e.getTime());
      } catch (ParseException var7) {
         throw new JsonSyntaxException("Failed parsing '" + s + "' as SQL Date; at path " + in.getPreviousPath(), var7);
      }
   }

   public void write(JsonWriter out, Date value) throws IOException {
      if (value == null) {
         out.nullValue();
      } else {
         String dateString;
         synchronized (this) {
            dateString = this.format.format(value);
         }

         out.value(dateString);
      }
   }

   private SqlDateTypeAdapter() {
   }
}
