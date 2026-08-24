package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

// $VF: Compiled from LazilyParsedNumber.java
public final class LazilyParsedNumber extends Number {
   private final String value;

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      if (!(obj instanceof LazilyParsedNumber)) {
         return false;
      }

      LazilyParsedNumber other = (LazilyParsedNumber)obj;
      return this.value == other.value || this.value.equals(other.value);
   }

   public LazilyParsedNumber(String value) {
      this.value = value;
   }

   @Override
   public String toString() {
      return this.value;
   }

   @Override
   public int intValue() {
      try {
         return Integer.parseInt(this.value);
      } catch (NumberFormatException e) {
         try {
            return (int)Long.parseLong(this.value);
         } catch (NumberFormatException nfe) {
            return new BigDecimal(this.value).intValue();
         }
      }
   }

   @Override
   public long longValue() {
      try {
         return Long.parseLong(this.value);
      } catch (NumberFormatException e) {
         return new BigDecimal(this.value).longValue();
      }
   }

   @Override
   public double doubleValue() {
      return Double.parseDouble(this.value);
   }

   private void readObject(ObjectInputStream in) throws IOException {
      throw new InvalidObjectException("Deserialization is unsupported");
   }

   @Override
   public float floatValue() {
      return Float.parseFloat(this.value);
   }

   private Object writeReplace() throws ObjectStreamException {
      return new BigDecimal(this.value);
   }

   @Override
   public int hashCode() {
      return this.value.hashCode();
   }
}
