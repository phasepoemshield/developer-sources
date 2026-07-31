package ru.metaculture.protection;

import java.util.Objects;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

public final class O0000O0O0O00 implements AutoCloseable {
   private static final int O00000000 = 262144;
   private static final BufferAllocator O000000000 = new BufferAllocator(262144);
   private static final Immediate O0000000000 = VertexConsumerProvider.immediate(O000000000);
   private final Camera O00000000000;
   private final MatrixStack O000000000000;
   private final Matrix4f O0000000000000;
   private final Matrix4f O000000000000O;
   private final Matrix4f O00000000000O;
   private final BufferAllocator O00000000000O0;
   private final Immediate O00000000000OO;
   private final float O0000000000O;
   private boolean O0000000000O0;

   private O0000O0O0O00(
      Camera camera,
      MatrixStack matrixStack,
      Matrix4f matrix4f,
      Matrix4f matrix4f2,
      Matrix4f matrix4f3,
      BufferAllocator bufferAllocator,
      Immediate immediate,
      float f
   ) {
      this.O00000000000 = camera;
      this.O000000000000 = matrixStack;
      this.O0000000000000 = matrix4f;
      this.O000000000000O = matrix4f2;
      this.O00000000000O = matrix4f3;
      this.O00000000000O0 = bufferAllocator;
      this.O00000000000OO = immediate;
      this.O0000000000O = f;
   }

   public static O0000O0O0O00 O00000000(
      MinecraftClient minecraftClient, RenderTickCounter renderTickCounter, Camera camera, Matrix4f matrix4f, Matrix4f matrix4f2
   ) {
      Objects.requireNonNull(minecraftClient, "client");
      Objects.requireNonNull(renderTickCounter, "tickCounter");
      Objects.requireNonNull(camera, "camera");
      Objects.requireNonNull(matrix4f, "positionMatrix");
      Objects.requireNonNull(matrix4f2, "projectionMatrix");
      MatrixStack var5 = new MatrixStack();
      Matrix4f var6 = new Matrix4f(matrix4f);
      Matrix4f var7 = new Matrix4f(var6);
      var5.multiplyPositionMatrix(new Matrix4f(var6));
      O000000000.clear();
      BufferAllocator var8 = O000000000;
      Immediate var9 = O0000000000;
      float var10 = renderTickCounter.getTickProgress(false);
      return new O0000O0O0O00(camera, var5, var6, var7, new Matrix4f(matrix4f2), var8, var9, var10);
   }

   public Camera O00000000() {
      return this.O00000000000;
   }

   public MatrixStack O000000000() {
      return this.O000000000000;
   }

   public Matrix4f O0000000000() {
      return new Matrix4f(this.O0000000000000);
   }

   public Matrix4f O00000000000() {
      return new Matrix4f(this.O000000000000O);
   }

   public Matrix4f O000000000000() {
      return new Matrix4f(this.O00000000000O);
   }

   public float O0000000000000() {
      return this.O0000000000O;
   }

   public Immediate O000000000000O() {
      if (this.O0000000000O0) {
         throw new IllegalStateException("Cannot access buffers after the world renderer has been closed.");
      } else {
         return this.O00000000000OO;
      }
   }

   public VertexConsumer O00000000(RenderLayer renderLayer) {
      Objects.requireNonNull(renderLayer, "layer");
      if (this.O0000000000O0) {
         throw new IllegalStateException("Cannot request buffers after the world renderer has been closed.");
      } else {
         return this.O00000000000OO.getBuffer(renderLayer);
      }
   }

   public void O00000000(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, Vec3d vec3d4, int i, boolean bl) {
      Objects.requireNonNull(vec3d, "v0");
      Objects.requireNonNull(vec3d2, "v1");
      Objects.requireNonNull(vec3d3, "v2");
      Objects.requireNonNull(vec3d4, "v3");
      RenderLayer var7 = bl ? O0000O0O0O.O00000000() : O0000O0O0O.O000000000();
      O0000O0O00OOOO var8 = new O0000O0O00OOOO(this, this.O000000000000.peek(), this.O00000000(var7));
      var8.O00000000(vec3d, vec3d2, vec3d3, vec3d4, i);
   }

   public void O00000000(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, Vec3d vec3d4, int i, int j, int k, int l) {
      this.O00000000(vec3d, vec3d2, vec3d3, vec3d4, i, j, k, l, true);
   }

   public void O00000000(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, Vec3d vec3d4, int i, int j, int k, int l, boolean bl) {
      Objects.requireNonNull(vec3d, "v0");
      Objects.requireNonNull(vec3d2, "v1");
      Objects.requireNonNull(vec3d3, "v2");
      Objects.requireNonNull(vec3d4, "v3");
      RenderLayer var10 = bl ? O0000O0O0O.O00000000000() : O0000O0O0O.O000000000000();
      O0000O0O00OOOO var11 = new O0000O0O00OOOO(this, this.O000000000000.peek(), this.O00000000(var10));
      var11.O00000000(vec3d, vec3d2, vec3d3, vec3d4, i, j, k, l);
   }

   public void O00000000(Vec3d vec3d, Vec3d vec3d2, int i, boolean bl) {
      Objects.requireNonNull(vec3d, "min");
      Objects.requireNonNull(vec3d2, "max");
      RenderLayer var5 = bl ? O0000O0O0O.O00000000() : O0000O0O0O.O0000000000();
      O0000O0O00OOOO var6 = new O0000O0O00OOOO(this, this.O000000000000.peek(), this.O00000000(var5));
      var6.O00000000(vec3d, vec3d2, i);
   }

   public void O00000000(Vec3d vec3d, Vec3d vec3d2, double d, int i, boolean bl) {
      Objects.requireNonNull(vec3d, "start");
      Objects.requireNonNull(vec3d2, "end");
      if (!Double.isFinite(d)) {
         throw new IllegalArgumentException("Line width must be finite.");
      } else if (d < 0.0) {
         throw new IllegalArgumentException("Line width cannot be negative.");
      } else {
         RenderLayer var7 = bl ? O0000O0O0O.O00000000(d) : O0000O0O0O.O000000000(d);
         O0000O0O00OOOO var8 = new O0000O0O00OOOO(this, this.O000000000000.peek(), this.O00000000(var7));
         var8.O000000000(vec3d, vec3d2, i);
      }
   }

   public void O00000000(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, Vec3d vec3d4, float f, float g, float h, float i, float j, float k, float l, float m, int n) {
      Objects.requireNonNull(vec3d, "v0");
      Objects.requireNonNull(vec3d2, "v1");
      Objects.requireNonNull(vec3d3, "v2");
      Objects.requireNonNull(vec3d4, "v3");
      RenderLayer var14 = O0000O0O0O.O0000000000000();
      O0000O0O00OOOO var15 = new O0000O0O00OOOO(this, this.O000000000000.peek(), this.O00000000(var14));
      var15.O00000000(vec3d, vec3d2, vec3d3, vec3d4, f, g, h, i, j, k, l, m, n);
   }

   public void O00000000000O() {
      if (!this.O0000000000O0) {
         this.O00000000000OO.draw();
      }
   }

   @Override
   public void close() {
      if (!this.O0000000000O0) {
         this.O0000000000O0 = true;
         this.O00000000000OO.draw();
         this.O00000000000O0.clear();
      }
   }
}
