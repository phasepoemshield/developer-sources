package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

// $VF: Compiled from SqlTimestampTypeAdapter.java
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {
   private final TypeAdapter<Date> dateTypeAdapter;
   static final TypeAdapterFactory FACTORY = new TypeAdapterFactory()   // $VF: Compiled from SqlTimestampTypeAdapter.java
 {
      @Override
      public <T> TypeAdapter<T> create(Gson typeToken, TypeToken<T> gson) {
         if (typeToken.getRawType() == Timestamp.class) {
            TypeAdapter<Date> dateTypeAdapter = gson.getAdapter(Date.class);
            return new SqlTimestampTypeAdapter(dateTypeAdapter);
         } else {
            return null;
         }
      }
   };

   public Timestamp read(JsonReader in) throws IOException {
      Date date = this.dateTypeAdapter.read(in);
      return date != null ? new Timestamp(date.getTime()) : null;
   }

   private SqlTimestampTypeAdapter(TypeAdapter<Date> dateTypeAdapter) {
      this.dateTypeAdapter = dateTypeAdapter;
   }

   public void write(JsonWriter out, Timestamp value) throws IOException {
      this.dateTypeAdapter.write(out, value);
   }
}
