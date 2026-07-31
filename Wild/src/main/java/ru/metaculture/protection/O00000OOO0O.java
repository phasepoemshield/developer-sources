package ru.metaculture.protection;

import java.util.ArrayDeque;

public final class O00000OOO0O {
   private static final int O00000000 = 50;
   private final ArrayDeque<String> O000000000 = new ArrayDeque<>();
   private final ArrayDeque<String> O0000000000 = new ArrayDeque<>();

   public void O00000000(String string) {
      if (string != null && !string.equals(this.O000000000.peekLast())) {
         this.O000000000.addLast(string);

         while (this.O000000000.size() > 50) {
            this.O000000000.pollFirst();
         }

         this.O0000000000.clear();
      }
   }

   public String O000000000(String string) {
      if (string == null) {
         return null;
      } else {
         while (!this.O000000000.isEmpty() && string.equals(this.O000000000.peekLast())) {
            this.O000000000.pollLast();
         }

         if (this.O000000000.isEmpty()) {
            return null;
         } else {
            this.O0000000000.addLast(string);
            return this.O000000000.pollLast();
         }
      }
   }

   public String O0000000000(String string) {
      if (string == null) {
         return null;
      } else {
         while (!this.O0000000000.isEmpty() && string.equals(this.O0000000000.peekLast())) {
            this.O0000000000.pollLast();
         }

         if (this.O0000000000.isEmpty()) {
            return null;
         } else {
            this.O000000000.addLast(string);
            return this.O0000000000.pollLast();
         }
      }
   }

   public boolean O00000000() {
      return !this.O000000000.isEmpty();
   }

   public boolean O000000000() {
      return !this.O0000000000.isEmpty();
   }

   public void O0000000000() {
      this.O000000000.clear();
      this.O0000000000.clear();
   }
}
