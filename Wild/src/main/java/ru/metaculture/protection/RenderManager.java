package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Quaternionf;
import org.joml.Vector2d;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;
import org.wild.mixin.acceser.GameRendererAccessor;

public final class RenderManager {
   private static final float O00000000000 = 0.5F;
   private static final float O000000000000 = 0.05F;
   public static volatile BooleanSupplier O00000000 = () -> true;
   public static volatile BooleanSupplier O000000000 = () -> true;
   private final RenderEngine O0000000000000;
   private final ArrayDeque<RenderManager.W381> O000000000000O = new ArrayDeque<>();
   private final ArrayDeque<Float> O00000000000O = new ArrayDeque<>();
   private final ArrayDeque<Boolean> O00000000000O0 = new ArrayDeque<>();
   private final ArrayDeque<RenderManager.W383> O00000000000OO = new ArrayDeque<>();
   private final O0000O00OO0O0O O0000000000O = new O0000O00OO0O0O();
   private static Map<String, FontRenderer> O0000000000O0 = new HashMap<>();
   private final O0000O00OO0O00 O0000000000O00;
   private boolean O0000000000O0O = false;
   private int O0000000000OO = 0;
   private int O0000000000OO0 = 0;
   private boolean O0000000000OOO = false;
   private float O000000000O = 0.0F;
   private int O000000000O0 = 0;
   private int O000000000O00 = 0;
   private boolean O000000000O000 = false;
   private float O000000000O00O = 0.0F;
   private int O000000000O0O = 0;
   private int O000000000O0O0 = 0;
   private int O000000000O0OO = 0;
   private int O000000000OO = 0;
   private static final ThreadLocal<float[]> O000000000OO0 = ThreadLocal.withInitial(() -> new float[4]);
   private int O000000000OO00 = 0;
   private int O000000000OO0O = 0;
   public static MinecraftClient O0000000000 = MinecraftClient.getInstance();

   public RenderManager(RenderEngine o0000O00O0OOO) {
      if (o0000O00O0OOO == null) {
         throw new IllegalArgumentException("GlBackend cannot be null");
      } else {
         this.O0000000000000 = o0000O00O0OOO;
         this.O0000000000O00 = new O0000O00OO0O00(o0000O00O0OOO);
         this.O0000000000OO();
      }
   }

   public void O00000000(int i, int j) {
      if (i > 0 && j > 0) {
         if (this.O0000000000O0O) {
            this.O00000000();
         }

         this.O0000000000O0O = true;
         this.O0000000000OO = i;
         this.O0000000000OO0 = j;
         this.O0000000000OOO = false;
         this.O000000000O000 = false;
         this.O000000000O = 0.0F;
         this.O000000000O00O = 0.0F;
         this.O000000000O0 = 0;
         this.O000000000O00 = 0;
         this.O000000000O0O = 0;
         this.O000000000O0O0 = 0;
         this.O000000000O0OO = 0;
         this.O000000000OO = 0;
         if (this.O0000000000000 != null) {
            O0000O00OO0O.O00000000().O00000000(i, j);
            this.O0000000000000.O0000000000(i, j);
            if (i != this.O000000000OO00 || j != this.O000000000OO0O) {
               this.O000000000OO00 = i;
               this.O000000000OO0O = j;
            }

            this.O0000000000000.O000000000(false);
         }

         if (!this.O000000000000O.isEmpty()) {
            this.O000000000000O.clear();
         }

         this.O00000000000OO.clear();
         this.O0000000000O.O00000000();
         this.O0000000000OO();
         this.O0000000000OO0();
      } else {
         throw new IllegalArgumentException("Width and height must be positive, got: " + i + "x" + j);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000() {
      boolean var5 = false /* VF: Semaphore variable */;

      label57: {
         try {
            var5 = true;
            if (this.O0000000000O00 != null) {
               this.O0000000000O00.O00000000();
            }

            if (this.O0000000000000 != null) {
               this.O0000000000000.O00000000();
            }

            O0000O00OO0O.O00000000().O000000000();
            var5 = false;
            break label57;
         } catch (Throwable var6) {
            var5 = false;
         } finally {
            if (var5) {
               this.O0000000000O0O = false;
               this.O0000000000OO = 0;
               this.O0000000000OO0 = 0;
               this.O0000000000OOO = false;
               this.O000000000O = 0.0F;
               this.O000000000O0 = 0;
               this.O000000000O00 = 0;
               this.O000000000O000 = false;
               this.O000000000O00O = 0.0F;
               this.O000000000O0O = 0;
               this.O000000000O0O0 = 0;
               this.O000000000O0OO = 0;
               this.O000000000OO = 0;
               this.O000000000000O.clear();
               this.O00000000000OO.clear();
               this.O0000000000O.O00000000();
               this.O0000000000OO();
               this.O0000000000OO0();
            }
         }

         this.O0000000000O0O = false;
         this.O0000000000OO = 0;
         this.O0000000000OO0 = 0;
         this.O0000000000OOO = false;
         this.O000000000O = 0.0F;
         this.O000000000O0 = 0;
         this.O000000000O00 = 0;
         this.O000000000O000 = false;
         this.O000000000O00O = 0.0F;
         this.O000000000O0O = 0;
         this.O000000000O0O0 = 0;
         this.O000000000O0OO = 0;
         this.O000000000OO = 0;
         this.O000000000000O.clear();
         this.O00000000000OO.clear();
         this.O0000000000O.O00000000();
         this.O0000000000OO();
         this.O0000000000OO0();
         return;
      }

      this.O0000000000O0O = false;
      this.O0000000000OO = 0;
      this.O0000000000OO0 = 0;
      this.O0000000000OOO = false;
      this.O000000000O = 0.0F;
      this.O000000000O0 = 0;
      this.O000000000O00 = 0;
      this.O000000000O000 = false;
      this.O000000000O00O = 0.0F;
      this.O000000000O0O = 0;
      this.O000000000O0O0 = 0;
      this.O000000000O0OO = 0;
      this.O000000000OO = 0;
      this.O000000000000O.clear();
      this.O00000000000OO.clear();
      this.O0000000000O.O00000000();
      this.O0000000000OO();
      this.O0000000000OO0();
   }

   private void O0000000000O0O() {
      if (!this.O0000000000O0O) {
         throw new IllegalStateException("begin() must be called before issuing draw commands");
      } else if (this.O0000000000000 == null) {
         throw new IllegalStateException("Renderer2D backend is null - initialization failed");
      } else if (this.O0000000000O00 == null) {
         throw new IllegalStateException("Renderer2D batcher is null - initialization failed");
      }
   }

   private float[] O0000000000(float f, float g, float h, float i, float j, float k) {
      float[] var7 = O000000000OO0.get();
      var7[0] = Math.max(0.0F, h);
      var7[1] = Math.max(0.0F, i);
      var7[2] = Math.max(0.0F, j);
      var7[3] = Math.max(0.0F, k);
      float var8 = Math.min(Math.abs(f), Math.abs(g)) * 0.5F;
      if (var8 <= 0.0F) {
         var7[0] = var7[1] = var7[2] = var7[3] = 0.0F;
         return var7;
      } else {
         var7[0] = Math.min(var7[0], var8);
         var7[1] = Math.min(var7[1], var8);
         var7[2] = Math.min(var7[2], var8);
         var7[3] = Math.min(var7[3], var8);
         return var7;
      }
   }

   public void O00000000(float f, float g, float h, float i, int j) {
      this.O0000000000O0O();
      this.O0000000000O00.O00000000(f, g, h, i, 0.0F, 0.0F, 0.0F, 0.0F, this.O00000000(j), this.O0000000000O.O000000000000());
   }

   public void O00000000(float f, float g, float h, float i, float j, int k) {
      this.O00000000(f, g, h, i, j, j, j, j, k);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, int n) {
      this.O0000000000O0O();
      float[] var10 = this.O0000000000(h, i, j, k, l, m);
      this.O0000000000O00.O00000000(f, g, h, i, var10[0], var10[1], var10[2], var10[3], this.O00000000(n), this.O0000000000O.O000000000000());
   }

   public void O00000000(int i, float f, float g, float h, float j) {
      this.O00000000(i, f, g, h, j, -1, true, false);
   }

   public void O00000000(int i, float f, float g, float h, float j, int k) {
      this.O00000000(i, f, g, h, j, k, true, false);
   }

   public void O00000000(int i, float f, float g, float h, float j, int k, boolean bl) {
      this.O00000000(i, f, g, h, j, k, bl, false);
   }

   public void O000000000(int i, float f, float g, float h, float j) {
      this.O00000000(i, f, g, h, j, -1, true, true);
   }

   public void O000000000(int i, float f, float g, float h, float j, int k, boolean bl) {
      this.O00000000(i, f, g, h, j, k, bl, true);
   }

   public void O00000000(int i, float f, float g, float h, float j, float k, float l, float m, float n) {
      this.O0000000000O0O();
      if (i > 0) {
         this.O0000000000();
         this.O0000000000000.O00000000(i, f, g, h, j, k, l, m, n, this.O00000000(-1), this.O0000000000O.O000000000000(), false);
      }
   }

   public void O00000000(int i, float f, float g, float h, float j, float k, float l, float m, float n, float o) {
      this.O0000000000O0O();
      if (i > 0) {
         this.O0000000000();
         this.O0000000000000.O00000000(i, f, g, h, j, k, l, m, n, o, this.O00000000(-1), this.O0000000000O.O000000000000(), false);
      }
   }

   private void O00000000(int i, float f, float g, float h, float j, int k, boolean bl, boolean bl2) {
      this.O0000000000O0O();
      if (i > 0) {
         this.O0000000000();
         float var9 = bl ? 1.0F : 0.0F;
         float var10 = bl ? 0.0F : 1.0F;
         this.O0000000000000.O00000000(i, f, g, h, j, 0.0F, var9, 1.0F, var10, this.O00000000(k), this.O0000000000O.O000000000000(), bl2);
      }
   }

   public RenderManager.W384 O00000000(float f, float g, float h, float i) {
      return this.O00000000(f, g, h, i, false);
   }

   public RenderManager.W384 O000000000(float f, float g, float h, float i) {
      return this.O00000000(f, g, h, i, true);
   }

   private RenderManager.W384 O00000000(float f, float g, float h, float i, boolean bl) {
      this.O0000000000O0O();
      if (this.O0000000000OO > 0 && this.O0000000000OO0 > 0 && !(h <= 0.0F) && !(i <= 0.0F)) {
         int var6 = (int)Math.ceil(h);
         int var7 = (int)Math.ceil(i);
         if (var6 > 0 && var7 > 0) {
            this.O0000000000();
            RenderEngine.W371 var8 = bl ? this.O0000000000000.O000000000(var6, var7) : this.O0000000000000.O00000000(var6, var7);
            if (var8 == null) {
               return null;
            } else {
               float[] var9 = this.O00000000000OO.isEmpty()
                  ? Arrays.copyOf(this.O0000000000O.O000000000000(), 9)
                  : Arrays.copyOf(this.O00000000000OO.peek().rootTransform(), 9);
               this.O00000000000OO.push(new RenderManager.W383(var9, f, g));
               RenderManager.W384 var10 = new RenderManager.W384(
                  var8,
                  this.O0000000000OO,
                  this.O0000000000OO0,
                  this.O0000000000OOO,
                  this.O000000000O,
                  this.O000000000O0,
                  this.O000000000O00,
                  this.O000000000O000,
                  this.O000000000O00O,
                  this.O000000000O0O,
                  this.O000000000O0O0,
                  this.O000000000O0OO,
                  this.O000000000OO,
                  this.O0000000000O.O0000000000(),
                  new ArrayDeque<>(this.O000000000000O),
                  new ArrayDeque<>(this.O00000000000O),
                  new ArrayDeque<>(this.O00000000000O0)
               );
               this.O0000000000OO = var6;
               this.O0000000000OO0 = var7;
               this.O0000000000OOO = false;
               this.O000000000O = 0.0F;
               this.O000000000O0 = 0;
               this.O000000000O00 = 0;
               this.O000000000O000 = false;
               this.O000000000O00O = 0.0F;
               this.O000000000O0O = 0;
               this.O000000000O0O0 = 0;
               this.O000000000O0OO = 0;
               this.O000000000OO = 0;
               this.O000000000000O.clear();
               this.O0000000000O.O00000000();
               this.O0000000000O.O00000000(-f, -g);
               this.O0000000000OO();
               this.O0000000000OO0();
               this.O0000000000000.O000000000(false);
               return var10;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void O00000000(RenderManager.W384 o000000000000) {
      this.O0000000000O0O();
      if (o000000000000 != null && o000000000000.O00000000 != null) {
         this.O0000000000();
         this.O0000000000000.O00000000(o000000000000.O00000000);
         this.O0000000000OO = o000000000000.O000000000;
         this.O0000000000OO0 = o000000000000.O0000000000;
         this.O0000000000OOO = o000000000000.O00000000000;
         this.O000000000O = o000000000000.O000000000000;
         this.O000000000O0 = o000000000000.O0000000000000;
         this.O000000000O00 = o000000000000.O000000000000O;
         this.O000000000O000 = o000000000000.O00000000000O;
         this.O000000000O00O = o000000000000.O00000000000O0;
         this.O000000000O0O = o000000000000.O00000000000OO;
         this.O000000000O0O0 = o000000000000.O0000000000O;
         this.O000000000O0OO = o000000000000.O0000000000O0;
         this.O000000000OO = o000000000000.O0000000000O00;
         this.O0000000000O.O00000000(o000000000000.O0000000000O0O);
         if (!this.O00000000000OO.isEmpty()) {
            this.O00000000000OO.pop();
         }

         this.O000000000000O.clear();
         this.O000000000000O.addAll(o000000000000.O0000000000OO);
         this.O00000000000O.clear();
         this.O00000000000O.addAll(o000000000000.O0000000000OO0);
         this.O00000000000O0.clear();
         this.O00000000000O0.addAll(o000000000000.O0000000000OOO);
         if (this.O00000000000O.isEmpty()) {
            this.O0000000000OO();
         }

         if (this.O00000000000O0.isEmpty()) {
            this.O00000000000O0.push(false);
         }

         this.O0000000000000.O00000000(this.O00000000000O0.peek());
         this.O0000000000000.O0000000000();
         if (this.O000000000000O.isEmpty()) {
            this.O0000000000000.O000000000(false);
         } else {
            this.O00000000(this.O000000000000O.peek());
         }
      }
   }

   public void O00000000(
      RenderManager.W384 o000000000000,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      float p,
      float q,
      float r,
      float s
   ) {
      this.O0000000000O0O();
      if (o000000000000 != null && o000000000000.O00000000 != null) {
         float var16 = this.O0000000000OOO();
         if (!(var16 <= 1.0E-4F)) {
            RenderManager.W381 var17 = this.O000000000000O.peek();
            int var18 = var17 == null ? 0 : var17.x();
            int var19 = var17 == null ? 0 : var17.y();
            int var20 = var17 == null ? this.O0000000000OO : var17.w();
            int var21 = var17 == null ? this.O0000000000OO0 : var17.h();
            float var22 = var17 == null ? 0.0F : var17.roundTopLeft();
            float var23 = var17 == null ? 0.0F : var17.roundTopRight();
            float var24 = var17 == null ? 0.0F : var17.roundBottomRight();
            float var25 = var17 == null ? 0.0F : var17.roundBottomLeft();
            this.O0000000000000
               .O00000000(
                  o000000000000.O00000000.texture(),
                  o000000000000.O00000000.width(),
                  o000000000000.O00000000.height(),
                  f,
                  g,
                  h,
                  i,
                  j,
                  k,
                  l,
                  m,
                  n,
                  o,
                  p,
                  q,
                  r,
                  s,
                  var16,
                  this.O0000000000O.O000000000000(),
                  var18,
                  var19,
                  var20,
                  var21,
                  var22,
                  var23,
                  var24,
                  var25
               );
         }
      }
   }

   public void O00000000(RenderManager.W384 o000000000000, float f, float g, float h, float i, float j, int k, int l, int m, int n, float o, float p) {
      this.O0000000000O0O();
      if (o000000000000 != null && o000000000000.O00000000 != null) {
         float var13 = this.O0000000000OOO();
         if (!(var13 <= 1.0E-4F)) {
            RenderManager.W381 var14 = this.O000000000000O.peek();
            int var15 = var14 == null ? 0 : var14.x();
            int var16 = var14 == null ? 0 : var14.y();
            int var17 = var14 == null ? this.O0000000000OO : var14.w();
            int var18 = var14 == null ? this.O0000000000OO0 : var14.h();
            float var19 = var14 == null ? 0.0F : var14.roundTopLeft();
            float var20 = var14 == null ? 0.0F : var14.roundTopRight();
            float var21 = var14 == null ? 0.0F : var14.roundBottomRight();
            float var22 = var14 == null ? 0.0F : var14.roundBottomLeft();
            this.O0000000000000
               .O00000000(
                  o000000000000.O00000000.texture(),
                  o000000000000.O00000000.width(),
                  o000000000000.O00000000.height(),
                  f,
                  g,
                  h,
                  i,
                  j,
                  k,
                  l,
                  m,
                  n,
                  o,
                  p,
                  var13,
                  this.O0000000000O.O000000000000(),
                  var15,
                  var16,
                  var17,
                  var18,
                  var19,
                  var20,
                  var21,
                  var22
               );
         }
      }
   }

   public void O00000000(
      RenderManager.W384 o000000000000,
      float f,
      float g,
      float h,
      float i,
      float j,
      int k,
      int l,
      int m,
      int n,
      float o,
      float p,
      float q,
      float r,
      float s,
      float t
   ) {
      this.O0000000000O0O();
      if (o000000000000 != null && o000000000000.O00000000 != null) {
         float var17 = this.O0000000000OOO();
         if (!(var17 <= 1.0E-4F)) {
            RenderManager.W381 var18 = this.O000000000000O.peek();
            int var19 = var18 == null ? 0 : var18.x();
            int var20 = var18 == null ? 0 : var18.y();
            int var21 = var18 == null ? this.O0000000000OO : var18.w();
            int var22 = var18 == null ? this.O0000000000OO0 : var18.h();
            float var23 = var18 == null ? 0.0F : var18.roundTopLeft();
            float var24 = var18 == null ? 0.0F : var18.roundTopRight();
            float var25 = var18 == null ? 0.0F : var18.roundBottomRight();
            float var26 = var18 == null ? 0.0F : var18.roundBottomLeft();
            this.O0000000000000
               .O00000000(
                  o000000000000.O00000000.texture(),
                  o000000000000.O00000000.width(),
                  o000000000000.O00000000.height(),
                  f,
                  g,
                  h,
                  i,
                  j,
                  k,
                  l,
                  m,
                  n,
                  o,
                  p,
                  q,
                  r,
                  s,
                  t,
                  var17,
                  this.O0000000000O.O000000000000(),
                  var19,
                  var20,
                  var21,
                  var22,
                  var23,
                  var24,
                  var25,
                  var26
               );
         }
      }
   }

   public void O00000000(RenderManager.W384 o000000000000, float f, float g, float h, float i, float j, int k, int l, int m, float n, float o) {
      this.O0000000000O0O();
      if (o000000000000 != null && o000000000000.O00000000 != null) {
         float var12 = this.O0000000000OOO();
         if (!(var12 <= 1.0E-4F)) {
            RenderManager.W381 var13 = this.O000000000000O.peek();
            int var14 = var13 == null ? 0 : var13.x();
            int var15 = var13 == null ? 0 : var13.y();
            int var16 = var13 == null ? this.O0000000000OO : var13.w();
            int var17 = var13 == null ? this.O0000000000OO0 : var13.h();
            float var18 = var13 == null ? 0.0F : var13.roundTopLeft();
            float var19 = var13 == null ? 0.0F : var13.roundTopRight();
            float var20 = var13 == null ? 0.0F : var13.roundBottomRight();
            float var21 = var13 == null ? 0.0F : var13.roundBottomLeft();
            this.O0000000000000
               .O00000000(
                  o000000000000.O00000000.texture(),
                  o000000000000.O00000000.width(),
                  o000000000000.O00000000.height(),
                  f,
                  g,
                  h,
                  i,
                  j,
                  k,
                  l,
                  m,
                  n,
                  o,
                  var12,
                  this.O0000000000O.O000000000000(),
                  var14,
                  var15,
                  var16,
                  var17,
                  var18,
                  var19,
                  var20,
                  var21
               );
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O000000000() {
      if (this.O0000000000O0O) {
         boolean var5 = false /* VF: Semaphore variable */;

         label65: {
            try {
               var5 = true;
               if (this.O0000000000O00 != null) {
                  this.O0000000000O00.O00000000();
               }

               if (this.O0000000000000 != null) {
                  this.O0000000000000.O00000000();
               }

               O0000O00OO0O.O00000000().O000000000();
               var5 = false;
               break label65;
            } catch (Exception var6) {
               System.err.println("Error in Renderer2D.end(): " + var6.getMessage());
               var6.printStackTrace();
               var5 = false;
            } finally {
               if (var5) {
                  this.O0000000000O0O = false;
                  this.O0000000000OO = 0;
                  this.O0000000000OO0 = 0;
                  this.O0000000000OOO = false;
                  this.O000000000O = 0.0F;
                  this.O000000000O0 = 0;
                  this.O000000000O00 = 0;
                  this.O000000000O000 = false;
                  this.O000000000O00O = 0.0F;
                  this.O000000000O0O = 0;
                  this.O000000000O0O0 = 0;
                  this.O000000000O0OO = 0;
                  this.O000000000OO = 0;
                  this.O000000000000O.clear();
                  this.O0000000000O.O00000000();
                  this.O0000000000OO();
                  this.O0000000000OO0();
               }
            }

            this.O0000000000O0O = false;
            this.O0000000000OO = 0;
            this.O0000000000OO0 = 0;
            this.O0000000000OOO = false;
            this.O000000000O = 0.0F;
            this.O000000000O0 = 0;
            this.O000000000O00 = 0;
            this.O000000000O000 = false;
            this.O000000000O00O = 0.0F;
            this.O000000000O0O = 0;
            this.O000000000O0O0 = 0;
            this.O000000000O0OO = 0;
            this.O000000000OO = 0;
            this.O000000000000O.clear();
            this.O0000000000O.O00000000();
            this.O0000000000OO();
            this.O0000000000OO0();
            return;
         }

         this.O0000000000O0O = false;
         this.O0000000000OO = 0;
         this.O0000000000OO0 = 0;
         this.O0000000000OOO = false;
         this.O000000000O = 0.0F;
         this.O000000000O0 = 0;
         this.O000000000O00 = 0;
         this.O000000000O000 = false;
         this.O000000000O00O = 0.0F;
         this.O000000000O0O = 0;
         this.O000000000O0O0 = 0;
         this.O000000000O0OO = 0;
         this.O000000000OO = 0;
         this.O000000000000O.clear();
         this.O0000000000O.O00000000();
         this.O0000000000OO();
         this.O0000000000OO0();
      }
   }

   public void O0000000000() {
      this.O0000000000O0O();
      this.O0000000000O00.O00000000();
   }

   public void O00000000000() {
      this.O0000000000O0O();
      this.O0000000000();
      this.O00000000000O0.push(true);
      this.O0000000000000.O00000000(true);
   }

   public void O000000000000() {
      this.O0000000000O0O();
      if (this.O00000000000O0.size() > 1) {
         this.O0000000000();
         this.O00000000000O0.pop();
         this.O0000000000000.O00000000(this.O00000000000O0.peek());
         this.O0000000000000.O0000000000();
      }
   }

   public void O00000000(int i, int j, int k, int l) {
      this.O00000000((float)i, (float)j, (float)k, (float)l, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m) {
      this.O0000000000O0O();
      RenderManager.W381 var9 = RenderManager.W381.fromRect(f, g, h, i, j, k, l, m, this.O0000000000O.O000000000000());
      RenderManager.W381 var10 = this.O000000000000O.isEmpty() ? var9 : RenderManager.W381.intersect(this.O000000000000O.peek(), var9);
      this.O000000000000O.push(var10);
      this.O00000000(var10);
   }

   public void O0000000000000() {
      this.O0000000000O0O();
      if (!this.O000000000000O.isEmpty()) {
         this.O000000000000O.pop();
         if (this.O000000000000O.isEmpty()) {
            this.O0000000000000.O000000000(false);
         } else {
            this.O00000000(this.O000000000000O.peek());
         }
      }
   }

   private void O00000000(RenderManager.W381 o000000000) {
      if (o000000000 == null) {
         this.O0000000000000.O000000000(false);
      } else {
         this.O0000000000000.O000000000(true);
         this.O0000000000000
            .O00000000(
               o000000000.x(),
               o000000000.y(),
               o000000000.w(),
               o000000000.h(),
               o000000000.roundTopLeft(),
               o000000000.roundTopRight(),
               o000000000.roundBottomRight(),
               o000000000.roundBottomLeft()
            );
      }
   }

   public void O00000000(float f, float g, float h, float i, int j, float k) {
      this.O0000000000O0O();
      f--;
      g--;
      h += 2.0F;
      i += 2.0F;
      this.O0000000000O00.O00000000(f, g, h, i, 0.0F, 0.0F, 0.0F, 0.0F, this.O00000000(j), Math.max(1.0F, k), this.O0000000000O.O000000000000());
   }

   public void O00000000(float f, float g, float h, float i, float j, int k, float l) {
      this.O00000000(f, g, h, i, j, j, j, j, k, l);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, int n, float o) {
      this.O0000000000O0O();
      float[] var11 = this.O0000000000(h, i, j, k, l, m);
      f--;
      g--;
      h += 2.0F;
      i += 2.0F;
      if (var11[0] > 0.0F) {
         var11[0]++;
      }

      if (var11[1] > 0.0F) {
         var11[1]++;
      }

      if (var11[2] > 0.0F) {
         var11[2]++;
      }

      if (var11[3] > 0.0F) {
         var11[3]++;
      }

      this.O0000000000O00
         .O00000000(f, g, h, i, var11[0], var11[1], var11[2], var11[3], this.O00000000(n), Math.max(1.0F, o), this.O0000000000O.O000000000000());
   }

   public void O00000000(float f, float g, float h, float i, int j, int k, int l, int m) {
      this.O0000000000O0O();
      this.O0000000000O00
         .O00000000(
            f, g, h, i, 0.0F, 0.0F, 0.0F, 0.0F, this.O00000000(j), this.O00000000(k), this.O00000000(l), this.O00000000(m), this.O0000000000O.O000000000000()
         );
   }

   public void O00000000(float f, float g, float h, float i, float j, int k, int l, int m, int n) {
      this.O00000000(f, g, h, i, j, j, j, j, k, l, m, n);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, int n, int o, int p, int q) {
      this.O0000000000O0O();
      float[] var13 = this.O0000000000(h, i, j, k, l, m);
      this.O0000000000O00
         .O00000000(
            f,
            g,
            h,
            i,
            var13[0],
            var13[1],
            var13[2],
            var13[3],
            this.O00000000(n),
            this.O00000000(o),
            this.O00000000(p),
            this.O00000000(q),
            this.O0000000000O.O000000000000()
         );
   }

   public void O00000000(float f, float g, float h, float i, int j, int k) {
      this.O00000000(f, g, h, i, j, k, k, j);
   }

   public void O00000000(float f, float g, float h, float i, float j, int k, int l) {
      this.O00000000(f, g, h, i, j, k, l, l, k);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, int n, int o) {
      this.O00000000(f, g, h, i, j, k, l, m, n, o, o, n);
   }

   public void O000000000(float f, float g, float h, float i, int j, int k) {
      this.O00000000(f, g, h, i, j, j, k, k);
   }

   public void O000000000(float f, float g, float h, float i, float j, int k, int l) {
      this.O00000000(f, g, h, i, j, k, k, l, l);
   }

   public void O000000000(float f, float g, float h, float i, float j, float k, float l, float m, int n, int o) {
      this.O00000000(f, g, h, i, j, k, l, m, n, n, o, o);
   }

   public void O000000000(float f, float g, float h, float i, float j, int k) {
      this.O0000000000O0O();
      this.O0000000000O00.O00000000(f, g, h, i, j, this.O00000000(k), this.O0000000000O.O000000000000());
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, int l) {
      this.O0000000000O0O();
      this.O0000000000O00.O00000000(f, g, h, i, j, k, this.O00000000(l), this.O0000000000O.O000000000000());
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, int m) {
      this.O00000000(f, g, h, i, j, j, j, j, k, l, m);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, float n, float o, int p) {
      this.O0000000000O0O();
      if (!(h <= 0.0F) && !(i <= 0.0F)) {
         boolean var12 = true;

         try {
            var12 = O000000000 == null || O000000000.getAsBoolean();
         } catch (Throwable var16) {
         }

         float var13 = Math.max(0.0F, n);
         if (!var12 && var13 > 6.0F) {
            var13 = Math.min(var13, 6.0F);
         }

         float var14 = Math.max(0.0F, o);
         if (!(var13 <= 0.0F) || !(var14 <= 0.0F)) {
            float[] var15 = O00000000000(j, k, l, m);
            O00000000(h, i, var15);
            this.O0000000000();
            this.O0000000000000
               .O00000000(f, g, h, i, var15[0], var15[1], var15[2], var15[3], var13, var14, this.O00000000(p), this.O0000000000O.O000000000000());
         }
      }
   }

   public void O00000000(float f, float g, float h, float i, float j) {
      this.O00000000(f, g, h, i, j, 1.0F);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k) {
      this.O00000000(f, g, h, i, j, j, j, j, k);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, float n) {
      this.O0000000000O0O();
      if (this.O0000000000OOO) {
         float var10 = O0000000000000(n) * this.O0000000000OOO();
         if (!(var10 <= 1.0E-4F)) {
            float[] var11 = O00000000000(j, k, l, m);
            O00000000(h, i, var11);
            this.O0000000000();
            this.O0000000000000.O00000000(f, g, h, i, var11[0], var11[1], var11[2], var11[3], var10, this.O0000000000O.O000000000000());
         }
      }
   }

   public void O000000000(float f, float g, float h, float i, float j) {
      this.O000000000(f, g, h, i, j, 1.0F);
   }

   public void O000000000(float f, float g, float h, float i, float j, float k) {
      this.O0000000000O0O();
      if (this.O000000000O000) {
         float var7 = O0000000000000(k) * this.O0000000000OOO();
         if (!(var7 <= 1.0E-4F)) {
            this.O0000000000();
            this.O0000000000000
               .O00000000(
                  f,
                  g,
                  h,
                  i,
                  Math.max(0.0F, j),
                  var7,
                  this.O0000000000O.O000000000000(),
                  this.O000000000O0O,
                  this.O000000000O0O0,
                  this.O000000000O0OO,
                  this.O000000000OO
               );
         }
      }
   }

   public void O00000000(float f) {
      this.O0000000000O0O();

      try {
         if (O00000000 != null && !O00000000.getAsBoolean()) {
            this.O0000000000OOO = false;
            this.O000000000O0 = 0;
            this.O000000000O00 = 0;
            return;
         }
      } catch (Throwable var6) {
      }

      int var2 = this.O0000000000OO;
      int var3 = this.O0000000000OO0;
      if (var2 > 0 && var3 > 0) {
         float var4 = Math.max(0.5F, f);
         boolean var5 = this.O0000000000OOO && this.O000000000O0 == var2 && this.O000000000O00 == var3 && Math.abs(this.O000000000O - var4) <= 0.05F;
         if (!var5) {
            this.O0000000000();
            this.O0000000000000.O00000000(var2, var3, var4);
            this.O0000000000OOO = true;
            this.O000000000O = var4;
            this.O000000000O0 = var2;
            this.O000000000O00 = var3;
         }
      } else {
         this.O0000000000OOO = false;
         this.O000000000O0 = 0;
         this.O000000000O00 = 0;
      }
   }

   public static void O00000000(boolean bl) {
      if (bl) {
         GlStateManager._enableBlend();
         GL11.glBlendFunc(770, 771);
         GlStateManager._disableCull();
         GlStateManager._blendFuncSeparate(770, 771, 1, 0);
         GlStateManager._colorMask(true, true, true, true);
      } else {
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._enableBlend();
      }
   }

   public static void O000000000(boolean bl) {
      if (bl) {
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._blendFuncSeparate(770, 771, 1, 0);
         GlStateManager._enableCull();
         GlStateManager._disableBlend();
      } else {
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._enableBlend();
      }
   }

   public void O0000000000(float f, float g, float h, float i, float j) {
      this.O0000000000O0O();
      if (this.O0000000000OO > 0 && this.O0000000000OO0 > 0 && !(h <= 0.0F) && !(i <= 0.0F)) {
         float[] var6 = this.O0000000000O.O000000000000();
         RenderManager.W380 var7 = O00000000(var6, f, g, h, i);
         int var8 = O00000000(var7.minX, this.O0000000000OO);
         int var9 = O00000000(var7.minY, this.O0000000000OO0);
         int var10 = O000000000(var7.maxX, this.O0000000000OO);
         int var11 = O000000000(var7.maxY, this.O0000000000OO0);
         int var12 = Math.max(0, var10 - var8);
         int var13 = Math.max(0, var11 - var9);
         if (var12 > 0 && var13 > 0) {
            float var14 = Math.max(0.5F, j);
            boolean var15 = this.O000000000O000
               && this.O000000000O0O == var8
               && this.O000000000O0O0 == var9
               && this.O000000000O0OO == var12
               && this.O000000000OO == var13
               && Math.abs(this.O000000000O00O - var14) <= 0.05F;
            if (!var15) {
               this.O0000000000();
               boolean var16 = this.O0000000000000.O00000000(var8, var9, var12, var13, var14);
               this.O000000000O000 = var16;
               if (var16) {
                  this.O000000000O00O = var14;
                  this.O000000000O0O = var8;
                  this.O000000000O0O0 = var9;
                  this.O000000000O0OO = var12;
                  this.O000000000OO = var13;
               } else {
                  this.O000000000O00O = 0.0F;
                  this.O000000000O0OO = 0;
                  this.O000000000OO = 0;
               }
            }
         } else {
            this.O000000000O000 = false;
            this.O000000000O0OO = 0;
            this.O000000000OO = 0;
         }
      } else {
         this.O000000000O000 = false;
         this.O000000000O0OO = 0;
         this.O000000000OO = 0;
      }
   }

   private static int O00000000(float f, int i) {
      int var2 = (int)Math.floor(f);
      if (var2 < 0) {
         return 0;
      } else {
         return var2 > i ? i : var2;
      }
   }

   private static int O000000000(float f, int i) {
      int var2 = (int)Math.ceil(f);
      if (var2 < 0) {
         return 0;
      } else {
         return var2 > i ? i : var2;
      }
   }

   private static RenderManager.W380 O00000000(float[] fs, float f, float g, float h, float i) {
      float var7 = f + h;
      float var8 = g + i;
      float var9 = O00000000(fs, f, g);
      float var10 = O000000000(fs, f, g);
      float var11 = O00000000(fs, var7, g);
      float var12 = O000000000(fs, var7, g);
      float var13 = O00000000(fs, var7, var8);
      float var14 = O000000000(fs, var7, var8);
      float var15 = O00000000(fs, f, var8);
      float var16 = O000000000(fs, f, var8);
      float var17 = Math.min(Math.min(var9, var11), Math.min(var13, var15));
      float var18 = Math.max(Math.max(var9, var11), Math.max(var13, var15));
      float var19 = Math.min(Math.min(var10, var12), Math.min(var14, var16));
      float var20 = Math.max(Math.max(var10, var12), Math.max(var14, var16));
      return new RenderManager.W380(var17, var19, var18, var20);
   }

   private static float O00000000(float[] fs, float f, float g) {
      return fs != null && fs.length >= 6 ? fs[0] * f + fs[1] * g + fs[2] : f;
   }

   private static float O000000000(float[] fs, float f, float g) {
      return fs != null && fs.length >= 6 ? fs[3] * f + fs[4] * g + fs[5] : g;
   }

   public void O00000000(float[] fs) {
      this.O0000000000O0O();
      this.O0000000000O.O00000000();
      this.O0000000000O.O000000000(fs);
   }

   public void O000000000(float[] fs) {
      this.O0000000000O0O();
      this.O0000000000O.O00000000(fs);
   }

   public void O000000000(float f) {
      this.O0000000000O0O();
      this.O0000000000O.O00000000(f);
   }

   public void O000000000000O() {
      this.O0000000000O0O();
      this.O0000000000O.O00000000000();
   }

   public void O00000000(float f, float g) {
      this.O0000000000O0O();
      this.O0000000000O.O00000000(f, g);
   }

   public void O00000000000O() {
      this.O0000000000O0O();
      this.O0000000000O.O00000000000();
   }

   public void O0000000000(float f) {
      this.O000000000(f, f);
   }

   public void O000000000(float f, float g) {
      this.O0000000000O0O();
      this.O0000000000O.O00000000(f, g, 0.0F, 0.0F);
   }

   public void O00000000000(float f) {
      this.O0000000000(f, f);
   }

   public void O0000000000(float f, float g) {
      this.O0000000000O0O();
      if (this.O0000000000OO > 0 && this.O0000000000OO0 > 0) {
         this.O0000000000O.O00000000(f, g, this.O0000000000OO * 0.5F, this.O0000000000OO0 * 0.5F);
      } else {
         throw new IllegalStateException("Cannot compute frame center before begin(width, height) is called with positive dimensions");
      }
   }

   public void O00000000(float f, float g, float h) {
      this.O0000000000(f, f, g, h);
   }

   public void O0000000000(float f, float g, float h, float i) {
      this.O0000000000O0O();
      this.O0000000000O.O00000000(f, g, h, i);
   }

   public void O00000000000O0() {
      this.O0000000000O0O();
      this.O0000000000O.O00000000000();
   }

   public void O000000000000(float f) {
      this.O0000000000O0O();
      float var2 = this.O0000000000OOO();
      float var3 = O0000000000000(f);
      this.O00000000000O.push(var2 * var3);
   }

   public void O00000000000OO() {
      this.O0000000000O0O();
      if (this.O00000000000O.size() > 1) {
         this.O00000000000O.pop();
      }
   }

   public void O00000000(String string, FontRenderer o0000O0O00OO) {
      if (o0000O0O00OO != null) {
         O0000000000O0.put(string, o0000O0O00OO);
      }
   }

   public void O00000000(FontObject o0000O0O00O00O, FontRenderer o0000O0O00OO) {
      if (o0000O0O00OO != null) {
         O0000000000O0.put(o0000O0O00O00O.O00000000, o0000O0O00OO);
      }
   }

   public O0000O00OO0O0O O0000000000O() {
      return this.O0000000000O;
   }

   public float[] O0000000000O0() {
      this.O0000000000O0O();
      if (this.O00000000000OO.isEmpty()) {
         return this.O0000000000O.O000000000000();
      } else {
         RenderManager.W383 var1 = this.O00000000000OO.peek();
         float[] var2 = this.O0000000000O.O000000000000();
         float[] var3 = new float[]{var2[0], var2[1], var2[2] + var1.originX(), var2[3], var2[4], var2[5] + var1.originY(), var2[6], var2[7], var2[8]};
         return O00000000(var1.rootTransform(), var3);
      }
   }

   public float O0000000000O00() {
      return this.O0000000000OOO();
   }

   public void O00000000(FontObject o0000O0O00O00O, float f, float g, float h, String string, int i) {
      this.O0000000000O0O();
      if (o0000O0O00O00O == null) {
         throw new IllegalArgumentException("FontObject must not be null");
      } else if (!(h <= 0.0F)) {
         FontRenderer var7 = O0000000000O0.get(o0000O0O00O00O.O00000000);
         if (var7 != null) {
            var7.O00000000(f, g, h / 2.0F, string, this.O00000000(i), this.O0000000000O.O000000000000());
         }
      }
   }

   public void O00000000(FontObject o0000O0O00O00O, float f, float g, float h, String string, int i, String string2) {
      this.O0000000000O0O();
      if (o0000O0O00O00O == null) {
         throw new IllegalArgumentException("FontObject must not be null");
      } else if (!(h <= 0.0F)) {
         FontRenderer var8 = O0000000000O0.get(o0000O0O00O00O.O00000000);
         if (var8 != null) {
            var8.O00000000(f, g, h / 2.0F, string, this.O00000000(i), string2, this.O0000000000O.O000000000000());
         }
      }
   }

   public void O00000000(FontObject o0000O0O00O00O, float f, float g, float h, String string, int i, int j, float k) {
      this.O00000000(o0000O0O00O00O, f, g, h, string, i, j, k, "l");
   }

   public void O00000000(FontObject o0000O0O00O00O, float f, float g, float h, String string, int i, int j, float k, String string2) {
      this.O0000000000O0O();
      if (o0000O0O00O00O == null) {
         throw new IllegalArgumentException("FontObject must not be null");
      } else if (!(h <= 0.0F)) {
         FontRenderer var10 = O0000000000O0.get(o0000O0O00O00O.O00000000);
         if (var10 != null) {
            var10.O00000000(f, g, h / 2.0F, string, this.O00000000(i), this.O00000000(j), k, string2, this.O0000000000O.O000000000000());
         }
      }
   }

   public static FontRenderer.W409 O00000000(FontObject o0000O0O00O00O, String string, float f) {
      if (o0000O0O00O00O == null) {
         throw new IllegalArgumentException("FontObject must not be null");
      } else if (f <= 0.0F) {
         return new FontRenderer.W409(0.0F, 0.0F);
      } else {
         FontRenderer var3 = O0000000000O0.get(o0000O0O00O00O.O00000000);
         if (var3 == null) {
            return new FontRenderer.W409(0.0F, 0.0F);
         } else {
            String var4 = string == null ? "" : string;
            return var3.O00000000(var4, f / 2.0F);
         }
      }
   }

   private void O0000000000OO() {
      this.O00000000000O.clear();
      this.O00000000000O.push(1.0F);
   }

   private void O0000000000OO0() {
      this.O00000000000O0.clear();
      this.O00000000000O0.push(false);
      if (this.O0000000000000 != null) {
         this.O0000000000000.O00000000(false);
      }
   }

   private float O0000000000OOO() {
      return this.O00000000000O.isEmpty() ? 1.0F : this.O00000000000O.peek();
   }

   private int O00000000(int i) {
      float var2 = this.O0000000000OOO();
      if (var2 >= 0.999F) {
         return i;
      } else {
         int var3 = i >>> 24 & 0xFF;
         int var4 = i >>> 16 & 0xFF;
         int var5 = i >>> 8 & 0xFF;
         int var6 = i & 0xFF;
         int var7 = O00000000(var3, var2);
         int var8 = O00000000(var4, var2);
         int var9 = O00000000(var5, var2);
         int var10 = O00000000(var6, var2);
         return var7 << 24 | var8 << 16 | var9 << 8 | var10;
      }
   }

   private static int O00000000(int i, float f) {
      float var2 = i * f;
      if (var2 <= 0.0F) {
         return 0;
      } else {
         return var2 >= 255.0F ? 255 : Math.round(var2);
      }
   }

   private static float O0000000000000(float f) {
      if (f < 0.0F) {
         return 0.0F;
      } else {
         return f > 1.0F ? 1.0F : f;
      }
   }

   static float[] O00000000000(float f, float g, float h, float i) {
      float[] var4 = O000000000OO0.get();
      var4[0] = f;
      var4[1] = g;
      var4[2] = h;
      var4[3] = i;
      return var4;
   }

   static void O00000000(float f, float g, float[] fs) {
      if (fs != null && fs.length >= 4) {
         float var3 = Math.abs(f);
         float var4 = Math.abs(g);

         for (int var5 = 0; var5 < 4; var5++) {
            float var6 = fs[var5];
            if (!Float.isFinite(var6)) {
               var6 = 0.0F;
            }

            fs[var5] = Math.max(0.0F, var6);
         }

         if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
            float var7 = Math.min(var3, var4) * 0.5F;

            for (int var8 = 0; var8 < 4; var8++) {
               fs[var8] = Math.min(fs[var8], var7);
            }
         } else {
            Arrays.fill(fs, 0.0F);
         }
      } else {
         throw new IllegalArgumentException("radii");
      }
   }

   private static boolean O00000000000(float f, float g) {
      return Math.abs(f - g) <= 1.0E-4F;
   }

   private static boolean O000000000000O(float f) {
      return Math.abs(f) <= 1.0E-4F;
   }

   static boolean O0000000000(float[] fs) {
      return fs != null && fs.length >= 9
         ? O00000000000(fs[0], 1.0F)
            && O000000000000O(fs[1])
            && O000000000000O(fs[2])
            && O000000000000O(fs[3])
            && O00000000000(fs[4], 1.0F)
            && O000000000000O(fs[5])
            && O000000000000O(fs[6])
            && O000000000000O(fs[7])
            && O00000000000(fs[8], 1.0F)
         : true;
   }

   static boolean O00000000000(float[] fs) {
      return fs != null && fs.length >= 9
         ? O000000000000O(fs[1]) && O000000000000O(fs[3]) && O000000000000O(fs[6]) && O000000000000O(fs[7]) && O00000000000(fs[8], 1.0F)
         : true;
   }

   static float O0000000000(float[] fs, float f, float g) {
      return fs != null && fs.length >= 9 ? fs[0] * f + fs[1] * g + fs[2] : f;
   }

   static float O00000000000(float[] fs, float f, float g) {
      return fs != null && fs.length >= 9 ? fs[3] * f + fs[4] * g + fs[5] : g;
   }

   static float O000000000000(float[] fs) {
      if (fs != null && fs.length >= 9) {
         float var1 = Math.abs(fs[0]);
         float var2 = Math.abs(fs[4]);
         float var3 = Math.min(var1, var2);
         return var3 <= 1.0E-4F ? 0.0F : var3;
      } else {
         return 1.0F;
      }
   }

   private static float[] O00000000(float[] fs, float[] gs) {
      return new float[]{
         fs[0] * gs[0] + fs[1] * gs[3] + fs[2] * gs[6],
         fs[0] * gs[1] + fs[1] * gs[4] + fs[2] * gs[7],
         fs[0] * gs[2] + fs[1] * gs[5] + fs[2] * gs[8],
         fs[3] * gs[0] + fs[4] * gs[3] + fs[5] * gs[6],
         fs[3] * gs[1] + fs[4] * gs[4] + fs[5] * gs[7],
         fs[3] * gs[2] + fs[4] * gs[5] + fs[5] * gs[8],
         fs[6] * gs[0] + fs[7] * gs[3] + fs[8] * gs[6],
         fs[6] * gs[1] + fs[7] * gs[4] + fs[8] * gs[7],
         fs[6] * gs[2] + fs[7] * gs[5] + fs[8] * gs[8]
      };
   }

   public static void O00000000(MatrixStack matrixStack, float f, float g, float h) {
      O00000000(matrixStack, (double)f, (double)g, (double)h);
   }

   public static void O00000000(MatrixStack matrixStack, double d, double e, double f) {
      Vec3d var7 = O0000000000.getEntityRenderDispatcher().camera.getPos();
      matrixStack.translate(d - var7.x, e - var7.y, f - var7.z);
   }

   public static Vector2d O00000000(double d, double e, double f) {
      Camera var6 = O0000000000.getEntityRenderDispatcher().camera;
      if (var6 == null) {
         return new Vector2d(0.0, 0.0);
      } else {
         Vec3d var7 = var6.getPos();
         Quaternionf var8 = new Quaternionf(var6.getRotation());
         var8.conjugate();
         Vector3f var9 = new Vector3f((float)(var7.x - d), (float)(var7.y - e), (float)(var7.z - f));
         var9.rotate(var8);
         float var10 = O0000000000.getRenderTickCounter().getDynamicDeltaTicks();
         if ((Boolean)O0000000000.options.getBobView().getValue() && O0000000000.getCameraEntity() instanceof PlayerEntity var12) {
            float var13 = var12.strideDistance;
            float var14 = var13 - var12.lastStrideDistance;
            float var15 = -(var13 + var14 * var10);
            float var16 = var6.getYaw();
            float var17 = Math.abs(MathHelper.cos(var15 * (float) Math.PI - 0.2F) * var16) * 5.0F;
            Quaternionf var18 = new Quaternionf().rotateAxis((float)Math.toRadians(var17), new Vector3f(1.0F, 0.0F, 0.0F));
            var18.conjugate();
            var9.rotate(var18);
            float var19 = MathHelper.sin(var15 * (float) Math.PI) * var16 * 3.0F;
            Quaternionf var20 = new Quaternionf().rotateAxis((float)Math.toRadians(var19), new Vector3f(0.0F, 0.0F, 1.0F));
            var20.conjugate();
            var9.rotate(var20);
            Vector3f var21 = new Vector3f(
               MathHelper.sin(var15 * (float) Math.PI) * var16 * 0.5F, -Math.abs(MathHelper.cos(var15 * (float) Math.PI) * var16), 0.0F
            );
            var21.y = -var21.y;
            var9.add(var21);
         }

         double var22 = ((GameRendererAccessor)O0000000000.gameRenderer).invokeGetFov(var6, var10, true);
         float var23 = O0000000000.getWindow().getScaledHeight() / 2.0F;
         float var24 = var23 / (var9.z() * (float)Math.tan(Math.toRadians(var22 / 2.0)));
         return var9.z() < 0.0F
            ? new Vector2d(-var9.x() * var24 + O0000000000.getWindow().getScaledWidth() / 2, O0000000000.getWindow().getScaledHeight() / 2 - var9.y() * var24)
            : null;
      }
   }

   record W380(float minX, float minY, float maxX, float maxY) {
   }

   record W381(int x, int y, int w, int h, float roundTopLeft, float roundTopRight, float roundBottomRight, float roundBottomLeft) {
      private static RenderManager.W381 fromRect(float f, float g, float h, float i, float j, float k, float l, float m) {
         return fromRect(f, g, h, i, j, k, l, m, null);
      }

      static RenderManager.W381 fromRect(float f, float g, float h, float i, float j, float k, float l, float m, float[] fs) {
         if (Float.isFinite(f) && Float.isFinite(g) && Float.isFinite(h) && Float.isFinite(i)) {
            boolean var9 = fs != null && fs.length >= 9 && !RenderManager.O0000000000(fs);
            float[] var10 = RenderManager.O00000000000(j, k, l, m);
            RenderManager.O00000000(Math.abs(h), Math.abs(i), var10);
            if (!var9) {
               float var27 = (float)Math.floor(Math.min(f, f + h));
               float var28 = (float)Math.floor(Math.min(g, g + i));
               float var29 = (float)Math.ceil(Math.max(f, f + h));
               float var30 = (float)Math.ceil(Math.max(g, g + i));
               int var31 = (int)var27;
               int var32 = (int)var28;
               int var34 = Math.max(0, (int)(var29 - var27));
               int var36 = Math.max(0, (int)(var30 - var28));
               return var34 > 0 && var36 > 0
                  ? new RenderManager.W381(var31, var32, var34, var36, var10[0], var10[1], var10[2], var10[3])
                  : new RenderManager.W381(var31, var32, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
               float var11 = f + h;
               float var12 = g + i;
               float var13 = Float.POSITIVE_INFINITY;
               float var14 = Float.POSITIVE_INFINITY;
               float var15 = Float.NEGATIVE_INFINITY;
               float var16 = Float.NEGATIVE_INFINITY;

               for (int var17 = 0; var17 < 4; var17++) {
                  float var35 = (var17 & 1) == 0 ? f : var11;
                  float var37 = var17 < 2 ? g : var12;
                  float var38 = RenderManager.O0000000000(fs, var35, var37);
                  float var39 = RenderManager.O00000000000(fs, var35, var37);
                  if (!Float.isFinite(var38) || !Float.isFinite(var39)) {
                     return new RenderManager.W381(0, 0, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
                  }

                  if (var38 < var13) {
                     var13 = var38;
                  }

                  if (var38 > var15) {
                     var15 = var38;
                  }

                  if (var39 < var14) {
                     var14 = var39;
                  }

                  if (var39 > var16) {
                     var16 = var39;
                  }
               }

               float var33 = (float)Math.floor(Math.min(var13, var15));
               float var18 = (float)Math.floor(Math.min(var14, var16));
               float var19 = (float)Math.ceil(Math.max(var13, var15));
               float var20 = (float)Math.ceil(Math.max(var14, var16));
               int var21 = (int)var33;
               int var22 = (int)var18;
               int var23 = Math.max(0, (int)(var19 - var33));
               int var24 = Math.max(0, (int)(var20 - var18));
               if (var23 > 0 && var24 > 0) {
                  if (RenderManager.O00000000000(fs)) {
                     float var25 = RenderManager.O000000000000(fs);
                     if (var25 > 0.0F) {
                        for (int var26 = 0; var26 < var10.length; var26++) {
                           var10[var26] *= var25;
                        }
                     } else {
                        Arrays.fill(var10, 0.0F);
                     }
                  } else {
                     Arrays.fill(var10, 0.0F);
                  }

                  RenderManager.O00000000(Math.abs(var19 - var33), Math.abs(var20 - var18), var10);
                  return new RenderManager.W381(var21, var22, var23, var24, var10[0], var10[1], var10[2], var10[3]);
               } else {
                  return new RenderManager.W381(var21, var22, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
               }
            }
         } else {
            return new RenderManager.W381(0, 0, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
         }
      }

      static RenderManager.W381 intersect(RenderManager.W381 o000000000, RenderManager.W381 o0000000002) {
         if (o000000000 == null) {
            return o0000000002;
         } else if (o0000000002 == null) {
            return o000000000;
         } else {
            int var2 = Math.max(o000000000.x, o0000000002.x);
            int var3 = Math.max(o000000000.y, o0000000002.y);
            int var4 = Math.min(o000000000.x + o000000000.w, o0000000002.x + o0000000002.w);
            int var5 = Math.min(o000000000.y + o000000000.h, o0000000002.y + o0000000002.h);
            int var6 = Math.max(0, var4 - var2);
            int var7 = Math.max(0, var5 - var3);
            if (var6 <= 0 || var7 <= 0) {
               return new RenderManager.W381(var2, var3, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
            } else if (matchesRect(var2, var3, var6, var7, o0000000002)) {
               return new RenderManager.W381(
                  var2, var3, var6, var7, o0000000002.roundTopLeft, o0000000002.roundTopRight, o0000000002.roundBottomRight, o0000000002.roundBottomLeft
               );
            } else {
               return matchesRect(var2, var3, var6, var7, o000000000)
                  ? new RenderManager.W381(
                     var2, var3, var6, var7, o000000000.roundTopLeft, o000000000.roundTopRight, o000000000.roundBottomRight, o000000000.roundBottomLeft
                  )
                  : new RenderManager.W381(var2, var3, var6, var7, 0.0F, 0.0F, 0.0F, 0.0F);
            }
         }
      }

      private static boolean matchesRect(int i, int j, int k, int l, RenderManager.W381 o000000000) {
         return o000000000 != null && o000000000.x == i && o000000000.y == j && o000000000.w == k && o000000000.h == l;
      }
   }

   public static class W382 {
      public static float O00000000(int i) {
         return (i >> 16 & 0xFF) / 255.0F;
      }

      public static float O000000000(int i) {
         return (i >> 8 & 0xFF) / 255.0F;
      }

      public static float O0000000000(int i) {
         return (i & 0xFF) / 255.0F;
      }

      public static float O00000000000(int i) {
         return (i >> 24 & 0xFF) / 255.0F;
      }

      public static Color O00000000(Color color, int i) {
         return new Color(color.getRed(), color.getGreen(), color.getBlue(), i);
      }

      public static Color O00000000(Color color, Color color2, double d) {
         float var4 = O0000O00OO0OO0.O00000000000OO((float)Math.sin((Math.PI * 6) * (d / 4.0 % 1.0)) / 2.0F + 0.5F, 0.0F, 1.0F);
         return new Color(O0000O000OO000.O0000000000(color.getRGB(), color2.getRGB(), var4), true);
      }

      public static Color O000000000(Color color, int i) {
         return new Color(color.getRed(), color.getGreen(), color.getBlue(), i);
      }

      public static int O00000000(int i, int j) {
         return i & 16777215 | j << 24;
      }

      public static int O00000000() {
         return O0000000000000(10, 255);
      }

      private static Theme O000000000() {
         if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null) {
            return WildClient.O00000000.O0000000000O.O000000000();
         } else {
            return O00000OO000O0O.O00000000O0O0 != null ? O00000OO000O0O.O00000000O0O0 : Theme.WILD;
         }
      }

      private static Theme O0000000000() {
         return O00000OO000O0O.O00000000O0O00 != null ? O00000OO000O0O.O00000000O0O00 : O000000000();
      }

      public static int[] O000000000(int i, int j) {
         Theme var2 = O000000000();
         Theme var3 = O0000000000();
         return new int[]{
            O000000000(
               O00000000(i, 0, O00000000(var2.O00000000().getRGB(), var3.O00000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0()))),
               (float)j
            ),
            O000000000(
               O00000000(i, 90, O00000000(var2.O00000000().getRGB(), var3.O00000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0()))),
               (float)j
            ),
            O000000000(
               O00000000(
                  i, 180, O00000000(var2.O00000000().getRGB(), var3.O00000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0()))
               ),
               (float)j
            ),
            O000000000(
               O00000000(
                  i, 270, O00000000(var2.O00000000().getRGB(), var3.O00000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0()))
               ),
               (float)j
            )
         };
      }

      public static int O0000000000(int i, int j) {
         Theme var2 = O000000000();
         Theme var3 = O0000000000();
         return O00000000(
            O00000000(var2.O000000000().getRGB(), var3.O000000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            O00000000(var2.O000000000().getRGB(), var3.O000000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            i,
            j
         );
      }

      public static int O00000000000(int i, int j) {
         Theme var2 = O000000000();
         Theme var3 = O0000000000();
         return O00000000(
            O00000000(var2.O0000000000().getRGB(), var3.O0000000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            O00000000(var2.O0000000000().getRGB(), var3.O0000000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            i,
            j
         );
      }

      public static int O000000000000(int i, int j) {
         Theme var2 = O000000000();
         Theme var3 = O0000000000();
         return O00000000(
            O00000000(var2.O00000000000().getRGB(), var3.O00000000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            O00000000(var2.O00000000000().getRGB(), var3.O00000000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            i,
            j
         );
      }

      public static int O0000000000000(int i, int j) {
         Theme var2 = O000000000();
         Theme var3 = O0000000000();
         return O00000000(
            O00000000(var2.O00000000().getRGB(), var3.O00000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            O00000000(var2.O00000000().getRGB(), var3.O00000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            i,
            j
         );
      }

      public static int O000000000000O(int i, int j) {
         Theme var2 = O000000000();
         Theme var3 = O0000000000();
         return O00000000(
            O00000000(var2.O000000000000().getRGB(), var3.O000000000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            O00000000(var2.O000000000000().getRGB(), var3.O000000000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            i,
            j
         );
      }

      public static int O00000000000O(int i, int j) {
         Theme var2 = O000000000();
         Theme var3 = O0000000000();
         return O00000000(
            O00000000(var2.O0000000000000().getRGB(), var3.O0000000000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            O00000000(var2.O0000000000000().getRGB(), var3.O0000000000000().getRGB(), (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())),
            i,
            j
         );
      }

      public Color O000000000(Color color, Color color2, double d) {
         d = 1.0 - d;
         return new Color(O0000O000OO000.O000000000(color.getRGB(), color2.getRGB(), d), true);
      }

      public static Color O00000000(int i, int j, Color color, Color color2, boolean bl) {
         int var5 = 0;
         if (i == 0) {
            var5 = j % 360;
         } else {
            var5 = (int)((System.currentTimeMillis() / i + j) % 360L);
         }

         var5 = (var5 >= 180 ? 360 - var5 : var5) * 2;
         return bl ? O00000000(color, color2, var5 / 360.0F) : O000000000(color, color2, var5 / 360.0F);
      }

      public static Color O00000000(Color color, Color color2, float f) {
         f = Math.min(1.0F, Math.max(0.0F, f));
         float[] var3 = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
         float[] var4 = Color.RGBtoHSB(color2.getRed(), color2.getGreen(), color2.getBlue(), null);
         Color var5 = Color.getHSBColor(O00000000(var3[0], var4[0], f), O00000000(var3[1], var4[1], f), O00000000(var3[2], var4[2], f));
         return new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), (int)O00000000((float)color.getAlpha(), (float)color2.getAlpha(), f));
      }

      public static Color O000000000(Color color, Color color2, float f) {
         return new Color(O0000O000OO000.O0000000000(color.getRGB(), color2.getRGB(), f), true);
      }

      private static float O00000000(float f, float g, float h) {
         float var3 = Math.max(0.0F, Math.min(1.0F, h));
         return f + (g - f) * var3;
      }

      public static int O00000000(int i, int j, int k, int l) {
         double var4 = (System.currentTimeMillis() / k + l) % 360L;
         double var7;
         float var6 = (float)((var7 = var4 % 360.0) / 360.0);
         return O0000O000OO000.O00000000000(i, j, var6);
      }

      public static int O00000000(int i, float f) {
         int var2 = i >> 16 & 0xFF;
         int var3 = i >> 8 & 0xFF;
         int var4 = i & 0xFF;
         int var5 = i >> 24 & 0xFF;
         float[] var6 = Color.RGBtoHSB(var2, var3, var4, null);
         float var7 = Math.max(0.0F, Math.min(1.0F, var6[2] * f));
         int var8 = Color.HSBtoRGB(var6[0], var6[1], var7);
         return var8 & 16777215 | var5 << 24;
      }

      public static int O00000000(int i, int j, double d) {
         return O0000O000OO000.O000000000(i, j, d);
      }

      public static int[] O000000000000(int i) {
         int[] var1 = new int[4];
         if (i == 0) {
            i = 1;
         }

         var1[0] = O00000000(i, 1, 1.0F, 1.0F, 1.0F);
         var1[1] = O00000000(i, 90, 1.0F, 1.0F, 1.0F);
         var1[2] = O00000000(i, 180, 1.0F, 1.0F, 1.0F);
         var1[3] = O00000000(i, 270, 1.0F, 1.0F, 1.0F);
         return var1;
      }

      public static int O00000000(int i, int j, float f, float g, float h) {
         int var5 = (int)((System.currentTimeMillis() / i + j) % 360L);
         float var6 = var5 / 360.0F;
         int var7 = Color.HSBtoRGB(var6, f, g);
         return O0000000000(O0000000000O00(var7), O0000000000O0O(var7), O0000000000OO(var7), Math.max(0, Math.min(255, (int)(h * 255.0F))));
      }

      public static int O00000000(int i, int j, int... is) {
         int var3 = (int)((System.currentTimeMillis() / i + j) % 360L);
         var3 = (var3 > 180 ? 360 - var3 : var3) + 180;
         int var4 = (int)(var3 / 360.0F * is.length);
         if (var4 == is.length) {
            var4--;
         }

         int var5 = is[var4];
         int var6 = is[var4 == is.length - 1 ? 0 : var4 + 1];
         return O000000000(var5, var6, var3 / 360.0F * is.length - var4);
      }

      public static int O000000000(int i, int j, double d) {
         return O0000O000OO000.O000000000(i, j, d);
      }

      public static float[] O0000000000000(int i) {
         return new float[]{O0000000000O00(i) / 255.0F, O0000000000O0O(i) / 255.0F, O0000000000OO(i) / 255.0F, O0000000000OO0(i) / 255.0F};
      }

      public static int O00000000000O0(int i, int j) {
         double var2 = (int)((System.currentTimeMillis() / i + j) % 360L);
         double var4;
         return Color.getHSBColor((var4 = var2 % 360.0) / 360.0 < 0.5 ? -((float)(var4 / 360.0)) : (float)(var4 / 360.0), 0.5F, 1.0F).hashCode();
      }

      public static int[] O000000000000O(int i) {
         int[] var1 = new int[4];
         if (i == 0) {
            int var2 = 1;
         }

         var1[0] = O00000000000O0(25, 1);
         var1[1] = O00000000000O0(25, 90);
         var1[2] = O00000000000O0(25, 180);
         var1[3] = O00000000000O0(25, 270);
         return var1;
      }

      public static int O000000000(int i, float f) {
         return O000000000(O00000000000O(i), O00000000000O0(i), O00000000000OO(i), (int)(O0000000000O(i) * f / 255.0F));
      }

      public static int O000000000(int i, int j, int k, int l) {
         return l << 24 | i << 16 | j << 8 | k;
      }

      public static int O00000000000O(int i) {
         return i >> 16 & 0xFF;
      }

      public static int O00000000000O0(int i) {
         return i >> 8 & 0xFF;
      }

      public static int O00000000000OO(int i) {
         return i & 0xFF;
      }

      public static int O0000000000O(int i) {
         return i >> 24 & 0xFF;
      }

      public static float[] O00000000(Color color) {
         return new float[]{color.getRed() / 255.0F, color.getGreen() / 255.0F, color.getBlue() / 255.0F, color.getAlpha() / 255.0F};
      }

      public static int O00000000000OO(int i, int j) {
         return O00000000(
            O00000000(
               O00000OO000O0O.O00000000O0O0.O00000000().getRGB(),
               O00000OO000O0O.O00000000O0O00.O00000000().getRGB(),
               (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())
            ),
            O00000000(
               O00000OO000O0O.O00000000O0O0.O00000000().getRGB(),
               O00000OO000O0O.O00000000O0O00.O00000000().getRGB(),
               (double)(1.0F - O00000OO000O0O.O000000000000.O00000000000O0())
            ),
            i,
            j
         );
      }

      public static int O0000000000(int i, float f) {
         int var2 = i >> 16 & 0xFF;
         int var3 = i >> 8 & 0xFF;
         int var4 = i & 0xFF;
         return O0000000000(var2, var3, var4, (int)f);
      }

      public static Color O0000000000O0(int i) {
         int var1 = i >> 16 & 0xFF;
         int var2 = i >> 8 & 0xFF;
         int var3 = i & 0xFF;
         int var4 = i >> 24 & 0xFF;
         return new Color(var1, var2, var3, var4);
      }

      public static int O0000000000O(int i, int j) {
         return O0000000000(O0000000000O00(i), O0000000000O0O(i), O0000000000OO(i), j);
      }

      public static int O00000000000(int i, float f) {
         return O00000000(O0000000000O00(i) * f, O0000000000O0O(i) * f, O0000000000OO(i) * f, (float)O0000000000OO0(i));
      }

      public static int O0000000000O00(int i) {
         return i >> 16 & 0xFF;
      }

      public static int O0000000000O0O(int i) {
         return i >> 8 & 0xFF;
      }

      public static int O0000000000OO(int i) {
         return i & 0xFF;
      }

      public static int O0000000000OO0(int i) {
         return i >> 24 & 0xFF;
      }

      public static int O00000000(float f, float g, float h, float i) {
         return O0000000000(
            Math.max(0, Math.min(255, Math.round(f))),
            Math.max(0, Math.min(255, Math.round(g))),
            Math.max(0, Math.min(255, Math.round(h))),
            Math.max(0, Math.min(255, Math.round(i)))
         );
      }

      public static int O00000000(int i, int j, int k) {
         return O0000000000(i, j, k, 255);
      }

      public static int O0000000000(int i, int j, int k, int l) {
         int var4 = 0;
         var4 |= l << 24;
         var4 |= i << 16;
         var4 |= j << 8;
         return var4 | k;
      }

      public static int O0000000000OOO(int i) {
         return i >> 16 & 0xFF;
      }

      public static int O000000000O(int i) {
         return i >> 8 & 0xFF;
      }

      public static int O000000000O0(int i) {
         return i & 0xFF;
      }

      public static int O000000000O00(int i) {
         return i >> 24 & 0xFF;
      }

      public static float[] O000000000O000(int i) {
         return new float[]{(i >> 16 & 0xFF) / 255.0F, (i >> 8 & 0xFF) / 255.0F, (i & 0xFF) / 255.0F, (i >> 24 & 0xFF) / 255.0F};
      }

      public static int O00000000000(int i, int j, int k, int l) {
         return l << 24 | i << 16 | j << 8 | k;
      }

      public static int O000000000(Color color) {
         int var1 = color.getAlpha();
         int var2 = color.getRed();
         int var3 = color.getGreen();
         int var4 = color.getBlue();
         return var1 << 24 | var2 << 16 | var3 << 8 | var4;
      }

      public static float[] O000000000O00O(int i) {
         return new float[]{(i >> 16 & 0xFF) / 255.0F, (i >> 8 & 0xFF) / 255.0F, (i & 0xFF) / 255.0F, (i >> 24 & 0xFF) / 255.0F};
      }
   }

   record W383(float[] rootTransform, float originX, float originY) {
   }

   public static final class W384 {
      final RenderEngine.W371 O00000000;
      final int O000000000;
      final int O0000000000;
      final boolean O00000000000;
      final float O000000000000;
      final int O0000000000000;
      final int O000000000000O;
      final boolean O00000000000O;
      final float O00000000000O0;
      final int O00000000000OO;
      final int O0000000000O;
      final int O0000000000O0;
      final int O0000000000O00;
      final ArrayDeque<float[]> O0000000000O0O;
      final ArrayDeque<RenderManager.W381> O0000000000OO;
      final ArrayDeque<Float> O0000000000OO0;
      final ArrayDeque<Boolean> O0000000000OOO;

      W384(
         RenderEngine.W371 o000000000,
         int i,
         int j,
         boolean bl,
         float f,
         int k,
         int l,
         boolean bl2,
         float g,
         int m,
         int n,
         int o,
         int p,
         ArrayDeque<float[]> arrayDeque,
         ArrayDeque<RenderManager.W381> arrayDeque2,
         ArrayDeque<Float> arrayDeque3,
         ArrayDeque<Boolean> arrayDeque4
      ) {
         this.O00000000 = o000000000;
         this.O000000000 = i;
         this.O0000000000 = j;
         this.O00000000000 = bl;
         this.O000000000000 = f;
         this.O0000000000000 = k;
         this.O000000000000O = l;
         this.O00000000000O = bl2;
         this.O00000000000O0 = g;
         this.O00000000000OO = m;
         this.O0000000000O = n;
         this.O0000000000O0 = o;
         this.O0000000000O00 = p;
         this.O0000000000O0O = arrayDeque;
         this.O0000000000OO = arrayDeque2;
         this.O0000000000OO0 = arrayDeque3;
         this.O0000000000OOO = arrayDeque4;
      }
   }
}
