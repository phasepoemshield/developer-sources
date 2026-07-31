package ru.metaculture.protection;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Hand;

public class O0000000OO00OO extends Event {
   private final MatrixStack O00000000;
   private final Hand O000000000;

   public O0000000OO00OO(MatrixStack matrixStack, Hand hand) {
      this.O00000000 = matrixStack;
      this.O000000000 = hand;
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
}
