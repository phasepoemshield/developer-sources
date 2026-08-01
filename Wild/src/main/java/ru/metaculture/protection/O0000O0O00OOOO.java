package ru.metaculture.protection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class O0000O0O00OOOO {
   private static final float O00000000 = 1.0E-6F;
   private final Camera O000000000;
   private final Matrix4f O0000000000;
   private final Matrix3f O00000000000;
   private final VertexConsumer O000000000000;
   private final Vec3d O0000000000000;

   public O0000O0O00OOOO(O0000O0O0O00 o0000O0O0O00, Entry entry, VertexConsumer vertexConsumer) {
      this(Objects.requireNonNull(o0000O0O0O00, "renderer").O00000000(), entry, vertexConsumer);
   }

   public O0000O0O00OOOO(Camera camera, Entry entry, VertexConsumer vertexConsumer) {
      this.O000000000 = Objects.requireNonNull(camera, "camera");
      Objects.requireNonNull(entry, "entry");
      this.O000000000000 = Objects.requireNonNull(vertexConsumer, "consumer");
      this.O0000000000000 = this.O000000000.getPos();
      this.O0000000000 = new Matrix4f(entry.getPositionMatrix());
      this.O00000000000 = new Matrix3f(entry.getNormalMatrix());
   }

   public void O00000000(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, Vec3d vec3d4, int i) {
      this.O00000000(vec3d, vec3d2, vec3d3, vec3d4, i, i, i, i);
   }

   public void O00000000(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, Vec3d vec3d4, int i, int j, int k, int l) {
      Objects.requireNonNull(vec3d, "v0");
      Objects.requireNonNull(vec3d2, "v1");
      Objects.requireNonNull(vec3d3, "v2");
      Objects.requireNonNull(vec3d4, "v3");
      this.O00000000(vec3d, i);
      this.O00000000(vec3d2, j);
      this.O00000000(vec3d3, k);
      this.O00000000(vec3d4, l);
   }

   public void O00000000(Vec3d vec3d, Vec3d vec3d2, int i) {
      Objects.requireNonNull(vec3d, "min");
      Objects.requireNonNull(vec3d2, "max");
      if (!(vec3d.x > vec3d2.x) && !(vec3d.y > vec3d2.y) && !(vec3d.z > vec3d2.z)) {
         Vec3d var4 = new Vec3d(vec3d.x, vec3d.y, vec3d.z);
         Vec3d var5 = new Vec3d(vec3d.x, vec3d.y, vec3d2.z);
         Vec3d var6 = new Vec3d(vec3d.x, vec3d2.y, vec3d.z);
         Vec3d var7 = new Vec3d(vec3d.x, vec3d2.y, vec3d2.z);
         Vec3d var8 = new Vec3d(vec3d2.x, vec3d.y, vec3d.z);
         Vec3d var9 = new Vec3d(vec3d2.x, vec3d.y, vec3d2.z);
         Vec3d var10 = new Vec3d(vec3d2.x, vec3d2.y, vec3d.z);
         Vec3d var11 = new Vec3d(vec3d2.x, vec3d2.y, vec3d2.z);
         this.O00000000(var4, var8, var10, var6, i);
         this.O00000000(var5, var7, var11, var9, i);
         this.O00000000(var4, var5, var9, var8, i);
         this.O00000000(var6, var10, var11, var7, i);
         this.O00000000(var4, var6, var7, var5, i);
         this.O00000000(var8, var9, var11, var10, i);
      } else {
         throw new IllegalArgumentException("Minimum corner must be less than or equal to maximum corner.");
      }
   }

   public void O000000000(Vec3d vec3d, Vec3d vec3d2, int i) {
      this.O00000000(vec3d, vec3d2, i, i);
   }

   public void O00000000(Vec3d vec3d, Vec3d vec3d2, int i, int j) {
      Objects.requireNonNull(vec3d, "start");
      Objects.requireNonNull(vec3d2, "end");
      Vector3f var5 = this.O00000000(vec3d, vec3d2);
      this.O00000000(vec3d, i, var5);
      this.O00000000(vec3d2, j, var5);
   }

   public void O00000000(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, Vec3d vec3d4, float f, float g, float h, float i, float j, float k, float l, float m, int n) {
      this.O00000000(vec3d, vec3d2, vec3d3, vec3d4, f, g, h, i, j, k, l, m, n, n, n, n);
   }

   public void O00000000(
      Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, Vec3d vec3d4, float f, float g, float h, float i, float j, float k, float l, float m, int n, int o, int p, int q
   ) {
      Objects.requireNonNull(vec3d, "v0");
      Objects.requireNonNull(vec3d2, "v1");
      Objects.requireNonNull(vec3d3, "v2");
      Objects.requireNonNull(vec3d4, "v3");
      this.O00000000(vec3d, f, g, n);
      this.O00000000(vec3d2, h, i, o);
      this.O00000000(vec3d3, j, k, p);
      this.O00000000(vec3d4, l, m, q);
   }

   private void O00000000(Vec3d vec3d, int i) {
      Vec3d var3 = this.O00000000(vec3d);
      VertexConsumer var4 = this.O000000000000.vertex(this.O0000000000, (float)var3.x, (float)var3.y, (float)var3.z);
      var4.color(O0000O0O00OO00.O000000000(i), O0000O0O00OO00.O0000000000(i), O0000O0O00OO00.O00000000000(i), O0000O0O00OO00.O00000000(i));
      this.O00000000(var4);
   }

   private void O00000000(Vec3d vec3d, float f, float g, int i) {
      Vec3d var5 = this.O00000000(vec3d);
      VertexConsumer var6 = this.O000000000000.vertex(this.O0000000000, (float)var5.x, (float)var5.y, (float)var5.z);
      var6.texture(f, g);
      var6.color(O0000O0O00OO00.O000000000(i), O0000O0O00OO00.O0000000000(i), O0000O0O00OO00.O00000000000(i), O0000O0O00OO00.O00000000(i));
      this.O00000000(var6);
   }

   private void O00000000(Vec3d vec3d, int i, Vector3f vector3f) {
      Vec3d var4 = this.O00000000(vec3d);
      VertexConsumer var5 = this.O000000000000.vertex(this.O0000000000, (float)var4.x, (float)var4.y, (float)var4.z);
      var5.color(O0000O0O00OO00.O000000000(i), O0000O0O00OO00.O0000000000(i), O0000O0O00OO00.O00000000000(i), O0000O0O00OO00.O00000000(i));
      var5.normal(vector3f.x, vector3f.y, vector3f.z);
      this.O00000000(var5);
   }

   private void O00000000(VertexConsumer vertexConsumer) {
      Objects.requireNonNull(vertexConsumer, "vertex");

      try {
         Method var2 = vertexConsumer.getClass().getMethod("next");
         var2.invoke(vertexConsumer);
      } catch (NoSuchMethodException var5) {
      } catch (IllegalAccessException var6) {
         throw new IllegalStateException("Unable to access vertex finalization method", var6);
      } catch (InvocationTargetException var7) {
         Throwable var3 = var7.getCause();
         if (var3 instanceof RuntimeException var8) {
            throw var8;
         }

         if (var3 instanceof Error var4) {
            throw var4;
         }

         throw new IllegalStateException("Vertex finalization failed", var3);
      }
   }

   private Vec3d O00000000(Vec3d vec3d) {
      return vec3d.subtract(this.O0000000000000);
   }

   private Vector3f O00000000(Vec3d vec3d, Vec3d vec3d2) {
      Vec3d var3 = vec3d2.subtract(vec3d);
      Vector3f var4 = new Vector3f((float)var3.x, (float)var3.y, (float)var3.z);
      if (var4.lengthSquared() <= 1.0E-6F) {
         var4.set(0.0F, 1.0F, 0.0F);
      }

      var4.normalize();
      this.O00000000000.transform(var4);
      if (var4.lengthSquared() <= 1.0E-6F) {
         var4.set(0.0F, 1.0F, 0.0F);
      }

      var4.normalize();
      return var4;
   }
}
