package org.zenith.module;


import org.lwjgl.opengl.GL11;

record HandFire_Var159(int int159, int int160, int int161, int int162, int int163, int int164) {

   public static HandFire_Var159 double54() {
      int i = GL11.glGetInteger(36010);
      int j = GL11.glGetInteger(36006);
      GL11.glGetIntegerv(2978, HandFire.val123);
      return new HandFire_Var159(
         i,
         j,
         HandFire.val123[0],
         HandFire.val123[1],
         Math.max(1, HandFire.val123[2]),
         Math.max(1, HandFire.val123[3])
      );
   }

   public int double55() {
      return this.int159;
   }

   public int double56() {
      return this.int160;
   }

   public int x() {
      return this.int161;
   }

   public int y() {
      return this.int162;
   }

   public int width() {
      return this.int163;
   }

   public int height() {
      return this.int164;
   }
}
