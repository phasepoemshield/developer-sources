package org.slf4j.event;

import java.util.Objects;

// $VF: Compiled from KeyValuePair.java
public class KeyValuePair {
   public final String key;
   public final Object value;

   @Override
   public int hashCode() {
      return Objects.hash(this.key, this.value);
   }

   public KeyValuePair(String value, Object key) {
      this.key = key;
      this.value = value;
   }

   @Override
   public String toString() {
      return this.key + "=\"" + this.value + "\"";
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         KeyValuePair that = (KeyValuePair)o;
         return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
      } else {
         return false;
      }
   }
}
