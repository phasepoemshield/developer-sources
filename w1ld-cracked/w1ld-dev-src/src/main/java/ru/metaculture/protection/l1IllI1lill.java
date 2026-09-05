package ru.metaculture.protection;

@FunctionalInterface
public interface l1IllI1lill {
   float ease(float var1);

   static l1IllI1lill UuUVuuUu() {
      return var0 -> var0;
   }

   default l1IllI1lill UuUVuuUu(l1IllI1lill var1) {
      return var1 == null ? this : var2 -> var1.ease(this.ease(var2));
   }
}
