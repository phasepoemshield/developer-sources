package Nursultan;

import minecraft.class04995;

public class class11459 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;

   public void L() {
      long var1 = System.currentTimeMillis();
      float var3 = (float)(var1 - (Long)this.N_3) / 1000.0F;
      if (var3 > 0.0F) {
         long var4 = (long)class04995.N((Float)this.N_2 / var3, 0.0F, (Float)this.N_2);
         ((class11319)this.N_1).add(var4);
      }

      this.N_3 = var1;
      this.u();
   }

   public class11459() {
      this.z();
      this.N_0 = 20;
      this.N_1 = new class11319((Integer)this.N_0);
      this.N_2 = 20.0F;
      this.N_5 = (Float)this.N_2;
   }

   private void z() {
      this.N_0 = 0;
      this.N_2 = 0.0F;
      this.N_3 = 0L;
      this.N_4 = 0L;
      this.N_5 = 0.0F;
   }

   public void u() {
      long var1 = System.currentTimeMillis();
      if (var1 - (Long)this.N_4 >= 4000L) {
         double var3 = ((class11319)this.N_1)
            .stream()
            .filter(var0 -> var0 != null && var0 > 0L)
            .mapToLong(Long::longValue)
            .average()
            .orElse((double)((Float)this.N_2).floatValue());
         this.N_5 = class11908.N((float)var3, 0.1F);
         this.N_4 = var1;
      }
   }

   public float y() {
      return (Float)this.N_5;
   }

   public void N(float var1) {
      this.N_0 = (int)Math.ceil((double)var1);
      this.N_2 = var1;
      this.N_1 = new class11319((Integer)this.N_0);
   }

   public void N() {
      ((class11319)this.N_1).clear();

      for (int var1 = 0; var1 < (Integer)this.N_0; var1++) {
         ((class11319)this.N_1).add(0L);
      }

      long var10003 = System.currentTimeMillis();
      this.N_3 = var10003;
      this.N_4 = var10003;
      this.u();
   }
}
