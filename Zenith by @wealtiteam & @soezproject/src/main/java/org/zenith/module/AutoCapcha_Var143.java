package org.zenith.module;

import java.awt.image.BufferedImage;

record AutoCapcha_Var143(BufferedImage bufferedImage, int int145, int int146, int int147, int int148) {

   public BufferedImage image() {
      return this.bufferedImage;
   }

   public int hash() {
      return this.int145;
   }

   public int cols() {
      return this.int146;
   }

   public int rows() {
      return this.int147;
   }

   public int tiles() {
      return this.int148;
   }
}
