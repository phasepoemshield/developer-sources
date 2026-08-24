package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

// $VF: Compiled from ToNumberPolicy.java
public enum ToNumberPolicy implements ToNumberStrategy {
   BIG_DECIMAL   // $VF: Compiled from ToNumberPolicy.java
 {
      public BigDecimal readNumber(JsonReader in) throws IOException {
         String value = in.nextString();

         try {
            return new BigDecimal(value);
         } catch (NumberFormatException var4) {
            throw new JsonParseException("Cannot parse " + value + "; at path " + in.getPreviousPath(), var4);
         }
      }
   },
   LONG_OR_DOUBLE   // $VF: Compiled from ToNumberPolicy.java
 {
      @Override
      public Number readNumber(JsonReader in) throws IOException, JsonParseException {
         String value = in.nextString();

         try {
            return Long.parseLong(value);
         } catch (NumberFormatException var6) {
            try {
               Double doubleE = Double.valueOf(value);
               if ((doubleE.isInfinite() || doubleE.isNaN()) && !in.isLenient()) {
                  throw new MalformedJsonException("JSON forbids NaN and infinities: " + doubleE + "; at path " + in.getPreviousPath());
               } else {
                  return doubleE;
               }
            } catch (NumberFormatException var5) {
               throw new JsonParseException("Cannot parse " + value + "; at path " + in.getPreviousPath(), var5);
            }
         }
      }
   },
   DOUBLE   // $VF: Compiled from ToNumberPolicy.java
 {
      public Double readNumber(JsonReader in) throws IOException {
         return in.nextDouble();
      }
   },
   LAZILY_PARSED_NUMBER   // $VF: Compiled from ToNumberPolicy.java
 {
      @Override
      public Number readNumber(JsonReader in) throws IOException {
         return new LazilyParsedNumber(in.nextString());
      }
   };

   ToNumberPolicy() {
   }
}
