package l;

import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Helper79 {
   private MatrixStack matrix;
   private float x;
   private float y;
   private float width;
   private float height;
   private float softness;
   private float thickness;
   private float start;
   private float end;
   private boolean quality$set;
   private float quality$value;
   private Vector4f round;
   private boolean outlineColor$set;
   private int outlineColor$value;
   private Vector4i color;
   private float quality;
   private int outlineColor;

   public Helper79 method823(int var1) {
      this.color = new Vector4i(var1);
      return this;
   }

   public Helper79 method824(Vector4i var1) {
      this.color = var1;
      return this;
   }

   public Helper79 method825(int... var1) {
      this.color = new Vector4i(var1);
      return this;
   }

   public Helper79 method826(float var1) {
      this.round = new Vector4f(var1);
      return this;
   }

   public Helper79 method827(Vector4f var1) {
      this.round = new Vector4f(var1);
      return this;
   }

   public Helper79 method828(float... var1) {
      this.round = new Vector4f(var1);
      return this;
   }

   Helper79() {
   }

   public Helper79 method829(MatrixStack var1) {
      this.matrix = var1;
      return this;
   }

   public Helper79 method830(float var1) {
      this.x = var1;
      return this;
   }

   public Helper79 method831(float var1) {
      this.y = var1;
      return this;
   }

   public Helper79 method832(float var1) {
      this.width = var1;
      return this;
   }

   public Helper79 method833(float var1) {
      this.height = var1;
      return this;
   }

   public Helper79 method834(float var1) {
      this.softness = var1;
      return this;
   }

   public Helper79 method835(float var1) {
      this.thickness = var1;
      return this;
   }

   public Helper79 method836(float var1) {
      this.start = var1;
      return this;
   }

   public Helper79 method837(float var1) {
      this.end = var1;
      return this;
   }

   public Helper79 method838(float var1) {
      this.quality$value = var1;
      this.quality$set = true;
      return this;
   }

   public Helper79 method839(int var1) {
      this.outlineColor$value = var1;
      this.outlineColor$set = true;
      return this;
   }

   public Helper80 method840() {
      float var1 = this.quality$value;
      if (!this.quality$set) {
         var1 = Helper80.method842();
      }

      int var2 = this.outlineColor$value;
      if (!this.outlineColor$set) {
         var2 = Helper80.method843();
      }

      return new Helper80(
         this.matrix, this.x, this.y, this.width, this.height, this.softness, this.thickness, this.start, this.end, var1, this.round, var2, this.color
      );
   }

   @Override
   public String toString() {
      return "ShapeProperties.ShapePropertiesBuilder(matrix="
         + this.matrix
         + ", x="
         + this.x
         + ", y="
         + this.y
         + ", width="
         + this.width
         + ", height="
         + this.height
         + ", softness="
         + this.softness
         + ", thickness="
         + this.thickness
         + ", start="
         + this.start
         + ", end="
         + this.end
         + ", quality$value="
         + this.quality$value
         + ", round="
         + this.round
         + ", outlineColor$value="
         + this.outlineColor$value
         + ", color="
         + this.color
         + ")";
   }
}
