package l;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class Helper132 implements Delayed {
   private final Helper131 key;
   private final int color;
   private final long expirationTime;

   Helper132(Helper131 var1, int var2, long var3) {
      this.key = var1;
      this.color = var2;
      this.expirationTime = System.currentTimeMillis() + var3;
   }

   @Override
   public long getDelay(TimeUnit var1) {
      long var2 = this.expirationTime - System.currentTimeMillis();
      return var1.convert(var2, TimeUnit.MILLISECONDS);
   }

   public int compareTo(Delayed var1) {
      return var1 instanceof Helper132 ? Long.compare(this.expirationTime, ((Helper132)var1).expirationTime) : 0;
   }

   public boolean method1080() {
      return System.currentTimeMillis() > this.expirationTime;
   }

   public Helper131 method1081() {
      return this.key;
   }

   public int method1082() {
      return this.color;
   }

   public long method1083() {
      return this.expirationTime;
   }
}
