package ru.metaculture.protection;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Hand;

public class O0000000OO00O extends Event {
   private final MatrixStack O00000000;
   private final Hand O000000000;
   private final float O0000000000;
   private final float O00000000000;

   public O0000000OO00O(MatrixStack matrixStack, Hand hand, float f, float g) {
      this.O00000000 = matrixStack;
      this.O000000000 = hand;
      this.O0000000000 = f;
      this.O00000000000 = g;
   }

   public MatrixStack O0000000000() {
      return this.O00000000;
   }

   public Hand O00000000000() {
      return this.O000000000;
   }

   public boolean O000000000000() {
      return this.O000000000 == Hand.MAIN_HAND;
   }

   public float O0000000000000() {
      return this.O0000000000;
   }

   public float O000000000000O() {
      return this.O00000000000;
   }
}
