package l;

import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Helper80 {
   private MatrixStack matrix;
   private float x;
   private float y;
   private float width;
   private float height;
   private float softness;
   private float thickness;
   private float start;
   private float end;
   private float quality;
   private Vector4f round;
   private int outlineColor;
   private Vector4i color;

   Helper80(
      MatrixStack var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      Vector4f var11,
      int var12,
      Vector4i var13
   ) {
      this.matrix = var1;
      this.x = var2;
      this.y = var3;
      this.width = var4;
      this.height = var5;
      this.softness = var6;
      this.thickness = var7;
      this.round = var11 != null ? var11 : new Vector4f(0.0F);
      this.outlineColor = var12;
      this.color = var13 != null ? var13 : new Vector4i(-1);
      this.start = var8;
      this.end = var9;
      this.quality = var10;
   }

   public static Helper79 method841(MatrixStack var0, double var1, double var3, double var5, double var7) {
      return method844().method829(var0).method830((float)var1).method831((float)var3).method832((float)var5).method833((float)var7);
   }

   static float method842() {
      return 20.0F;
   }

   static int method843() {
      return -1;
   }

   public static Helper79 method844() {
      return new Helper79();
   }

   public Helper79 method845() {
      return new Helper79()
         .method829(this.matrix)
         .method830(this.x)
         .method831(this.y)
         .method832(this.width)
         .method833(this.height)
         .method834(this.softness)
         .method835(this.thickness)
         .method836(this.start)
         .method837(this.end)
         .method838(this.quality)
         .method827(this.round)
         .method839(this.outlineColor)
         .method824(this.color);
   }

   public MatrixStack method846() {
      return this.matrix;
   }

   public float method847() {
      return this.x;
   }

   public float method848() {
      return this.y;
   }

   public float method849() {
      return this.width;
   }

   public float method850() {
      return this.height;
   }

   public float method851() {
      return this.softness;
   }

   public float method852() {
      return this.thickness;
   }

   public float method853() {
      return this.start;
   }

   public float method854() {
      return this.end;
   }

   public float method855() {
      return this.quality;
   }

   public Vector4f method856() {
      return this.round;
   }

   public int method857() {
      return this.outlineColor;
   }

   public Vector4i method858() {
      return this.color;
   }

   public void method859(MatrixStack var1) {
      this.matrix = var1;
   }

   public void method860(float var1) {
      this.x = var1;
   }

   public void method861(float var1) {
      this.y = var1;
   }

   public void method862(float var1) {
      this.width = var1;
   }

   public void method863(float var1) {
      this.height = var1;
   }

   public void method864(float var1) {
      this.softness = var1;
   }

   public void method865(float var1) {
      this.thickness = var1;
   }

   public void method866(float var1) {
      this.start = var1;
   }

   public void method867(float var1) {
      this.end = var1;
   }

   public void method868(float var1) {
      this.quality = var1;
   }

   public void method869(Vector4f var1) {
      this.round = var1;
   }

   public void method870(int var1) {
      this.outlineColor = var1;
   }

   public void method871(Vector4i var1) {
      this.color = var1;
   }
}
