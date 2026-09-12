package Nursultan;

import minecraft.class00494;

public record class09409(class00494 first, class00494 second) {
   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof class09409 var2 && this.first == var2.first && this.second == var2.second) {
         return true;
      }

      return false;
   }

   @Override
   public int hashCode() {
      return System.identityHashCode(this.first) * 31 + System.identityHashCode(this.second);
   }

   public class00494 y() {
      return this.second;
   }

   public class00494 N() {
      return this.first;
   }
}
