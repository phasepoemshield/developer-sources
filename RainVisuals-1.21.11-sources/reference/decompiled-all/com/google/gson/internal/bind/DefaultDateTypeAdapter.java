package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

// $VF: Compiled from DefaultDateTypeAdapter.java
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {
   private final List<DateFormat> dateFormats = new ArrayList<>();
   private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
   private final DefaultDateTypeAdapter.DateType<T> dateType;

   public void write(JsonWriter out, Date value) throws IOException {
      if (value == null) {
         out.nullValue();
      } else {
         DateFormat dateFormat = this.dateFormats.get(0);
         String dateFormatAsString;
         synchronized (this.dateFormats) {
            dateFormatAsString = dateFormat.format(value);
         }

         out.value(dateFormatAsString);
      }
   }

   private DefaultDateTypeAdapter(DefaultDateTypeAdapter.DateType<T> timeStyle, int dateType, int dateStyle) {
      this.dateType = Objects.requireNonNull(dateType);
      this.dateFormats.add(DateFormat.getDateTimeInstance(dateStyle, timeStyle, Locale.US));
      if (!Locale.getDefault().equals(Locale.US)) {
         this.dateFormats.add(DateFormat.getDateTimeInstance(dateStyle, timeStyle));
      }

      if (JavaVersion.isJava9OrLater()) {
         this.dateFormats.add(PreJava9DateFormatProvider.getUSDateTimeFormat(dateStyle, timeStyle));
      }
   }

   private DefaultDateTypeAdapter(DefaultDateTypeAdapter.DateType<T> datePattern, String dateType) {
      this.dateType = Objects.requireNonNull(dateType);
      this.dateFormats.add(new SimpleDateFormat(datePattern, Locale.US));
      if (!Locale.getDefault().equals(Locale.US)) {
         this.dateFormats.add(new SimpleDateFormat(datePattern));
      }
   }

   public T read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
         in.nextNull();
         return null;
      } else {
         Date date = this.deserializeToDate(in);
         return this.dateType.deserialize(date);
      }
   }

   @Override
   public String toString() {
      DateFormat defaultFormat = this.dateFormats.get(0);
      return defaultFormat instanceof SimpleDateFormat
         ? "DefaultDateTypeAdapter(" + ((SimpleDateFormat)defaultFormat).toPattern() + ')'
         : "DefaultDateTypeAdapter(" + defaultFormat.getClass().getSimpleName() + ')';
   }

   private DefaultDateTypeAdapter(DefaultDateTypeAdapter.DateType<T> dateType, int style) {
      this.dateType = Objects.requireNonNull(dateType);
      this.dateFormats.add(DateFormat.getDateInstance(style, Locale.US));
      if (!Locale.getDefault().equals(Locale.US)) {
         this.dateFormats.add(DateFormat.getDateInstance(style));
      }

      if (JavaVersion.isJava9OrLater()) {
         this.dateFormats.add(PreJava9DateFormatProvider.getUSDateFormat(style));
      }
   }

   private Date deserializeToDate(JsonReader in) throws IOException {
      String s = in.nextString();
      synchronized (this.dateFormats) {
         for (DateFormat dateFormat : this.dateFormats) {
            Date var10000;
            try {
               var10000 = dateFormat.parse(s);
            } catch (ParseException var9) {
               continue;
            }

            return var10000;
         }
      }

      try {
         return ISO8601Utils.parse(s, new ParsePosition(0));
      } catch (ParseException var8) {
         throw new JsonSyntaxException("Failed parsing '" + s + "' as Date; at path " + in.getPreviousPath(), var8);
      }
   }

   // $VF: Compiled from DefaultDateTypeAdapter.java
   public abstract static class DateType<T extends Date> {
      private final Class<T> dateClass;
      public static final DefaultDateTypeAdapter.DateType<Date> DATE = new DefaultDateTypeAdapter.DateType<Date>(Date.class)      // $VF: Compiled from DefaultDateTypeAdapter.java
 {
         @Override
         protected Date deserialize(Date date) {
            return date;
         }
      };

      public final TypeAdapterFactory createAdapterFactory(String datePattern) {
         return this.createFactory(new DefaultDateTypeAdapter<>(this, datePattern));
      }

      public final TypeAdapterFactory createAdapterFactory(int dateStyle, int timeStyle) {
         return this.createFactory(new DefaultDateTypeAdapter<>(this, dateStyle, timeStyle));
      }

      public final TypeAdapterFactory createAdapterFactory(int style) {
         return this.createFactory(new DefaultDateTypeAdapter<>(this, style));
      }

      protected abstract T deserialize(Date var1);

      public final TypeAdapterFactory createDefaultsAdapterFactory() {
         return this.createFactory(new DefaultDateTypeAdapter<>(this, 2, 2));
      }

      private TypeAdapterFactory createFactory(DefaultDateTypeAdapter<T> adapter) {
         return TypeAdapters.newFactory(this.dateClass, adapter);
      }

      protected DateType(Class<T> dateClass) {
         this.dateClass = dateClass;
      }
   }
}
