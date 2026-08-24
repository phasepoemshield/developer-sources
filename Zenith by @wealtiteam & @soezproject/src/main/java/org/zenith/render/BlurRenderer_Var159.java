package org.zenith.render;

import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.util.ArgbColor;

import org.joml.Matrix4f;

public record BlurRenderer_Var159(Matrix4f matrix4f, float float65, float float66, float float67, float float68, org.zenith.utility.render.display.base.CornerRadius val012, ArgbColor var1192) {

   public Matrix4f call439() {
      return this.matrix4f;
   }

   public float x() {
      return this.float65;
   }

   public float y() {
      return this.float66;
   }

   public float width() {
      return this.float67;
   }

   public float height() {
      return this.float68;
   }

   public org.zenith.utility.render.display.base.CornerRadius call476() {
      return this.val012;
   }

   public ArgbColor list56() {
      return this.var1192;
   }
}
