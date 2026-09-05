package ru.metaculture.protection;

import java.util.ArrayDeque;

public final class vNVunvUNNnUN {
   private static final int UuUVuuUu = 50;
   private final ArrayDeque<String> C00OOC00oO = new ArrayDeque<>();
   private final ArrayDeque<String> uUnuvNvvNU = new ArrayDeque<>();

   public void UuUVuuUu(String var1) {
      if (var1 != null && !var1.equals(this.C00OOC00oO.peekLast())) {
         this.C00OOC00oO.addLast(var1);

         while (this.C00OOC00oO.size() > 50) {
            this.C00OOC00oO.pollFirst();
         }

         this.uUnuvNvvNU.clear();
      }
   }

   public String C00OOC00oO(String var1) {
      if (var1 == null) {
         return null;
      } else {
         while (!this.C00OOC00oO.isEmpty() && var1.equals(this.C00OOC00oO.peekLast())) {
            this.C00OOC00oO.pollLast();
         }

         if (this.C00OOC00oO.isEmpty()) {
            return null;
         } else {
            this.uUnuvNvvNU.addLast(var1);
            return this.C00OOC00oO.pollLast();
         }
      }
   }

   public String uUnuvNvvNU(String var1) {
      if (var1 == null) {
         return null;
      } else {
         while (!this.uUnuvNvvNU.isEmpty() && var1.equals(this.uUnuvNvvNU.peekLast())) {
            this.uUnuvNvvNU.pollLast();
         }

         if (this.uUnuvNvvNU.isEmpty()) {
            return null;
         } else {
            this.C00OOC00oO.addLast(var1);
            return this.uUnuvNvvNU.pollLast();
         }
      }
   }

   public boolean UuUVuuUu() {
      return !this.C00OOC00oO.isEmpty();
   }

   public boolean C00OOC00oO() {
      return !this.uUnuvNvvNU.isEmpty();
   }

   public void uUnuvNvvNU() {
      this.C00OOC00oO.clear();
      this.uUnuvNvvNU.clear();
   }
}
