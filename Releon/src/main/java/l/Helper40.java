package l;

import net.minecraft.client.texture.AbstractTexture;

public final class Helper40 extends Helper108<Helper53> {
   private Helper115 size;
   private Helper127 radius;
   private Helper172 color;
   private float smoothness;
   private float u;
   private float v;
   private float texWidth;
   private float texHeight;
   private int textureId;

   public Helper40() {
   }

   public Helper40 method559(Helper115 var1) {
      this.size = var1;
      return this;
   }

   public Helper40 method560(Helper127 var1) {
      this.radius = var1;
      return this;
   }

   public Helper40 method561(Helper172 var1) {
      this.color = var1;
      return this;
   }

   public Helper40 method562(float var1) {
      this.smoothness = var1;
      return this;
   }

   public Helper40 method563(float var1, float var2, float var3, float var4, AbstractTexture var5) {
      return this.method564(var1, var2, var3, var4, var5.getGlId());
   }

   public Helper40 method564(float var1, float var2, float var3, float var4, int var5) {
      this.u = var1;
      this.v = var2;
      this.texWidth = var3;
      this.texHeight = var4;
      this.textureId = var5;
      return this;
   }

   protected Helper53 method567() {
      return new Helper53(this.size, this.radius, this.color, this.smoothness, this.u, this.v, this.texWidth, this.texHeight, this.textureId);
   }

   @Override
   protected void method566() {
      this.size = Helper115.NONE;
      this.radius = Helper127.NO_ROUND;
      this.color = Helper172.WHITE;
      this.smoothness = 1.0F;
      this.u = 0.0F;
      this.v = 0.0F;
      this.texWidth = 0.0F;
      this.texHeight = 0.0F;
      this.textureId = 0;
   }
}
