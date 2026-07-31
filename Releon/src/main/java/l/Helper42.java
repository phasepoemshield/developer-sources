package l;

import java.awt.Color;

public final class Helper42 extends Helper108<Helper45> {
   private Helper110 font;
   private String text;
   private float size;
   private float thickness;
   private int color;
   private float smoothness;
   private float spacing;
   private int outlineColor;
   private float outlineThickness;

   public Helper42() {
   }

   public Helper42 method568(Helper110 var1) {
      this.font = var1;
      return this;
   }

   public Helper42 method569(String var1) {
      this.text = var1;
      return this;
   }

   public Helper42 method570(float var1) {
      this.size = var1;
      return this;
   }

   public Helper42 method571(float var1) {
      this.thickness = var1;
      return this;
   }

   public Helper42 method572(Color var1) {
      return this.method573(var1.getRGB());
   }

   public Helper42 method573(int var1) {
      this.color = var1;
      return this;
   }

   public Helper42 method574(float var1) {
      this.smoothness = var1;
      return this;
   }

   public Helper42 method575(float var1) {
      this.spacing = var1;
      return this;
   }

   public Helper42 method576(Color var1, float var2) {
      return this.method577(var1.getRGB(), var2);
   }

   public Helper42 method577(int var1, float var2) {
      this.outlineColor = var1;
      this.outlineThickness = var2;
      return this;
   }

   protected Helper45 method567() {
      return new Helper45(
         this.font, this.text, this.size, this.thickness, this.color, this.smoothness, this.spacing, this.outlineColor, this.outlineThickness
      );
   }

   @Override
   protected void method566() {
      this.font = null;
      this.text = "";
      this.size = 0.0F;
      this.thickness = 0.05F;
      this.color = -1;
      this.smoothness = 0.5F;
      this.spacing = 0.0F;
      this.outlineColor = 0;
      this.outlineThickness = 0.0F;
   }
}
