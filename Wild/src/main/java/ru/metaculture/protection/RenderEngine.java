package ru.metaculture.protection;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.texture.GlTexture;
import org.lwjgl.opengl.ARBDrawInstanced;
import org.lwjgl.opengl.ARBInstancedArrays;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GL33;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageCallback;
import org.lwjgl.opengl.KHRDebug;

public final class RenderEngine {
   private static final int O00000000 = 4096;
   private static final int O000000000 = 16;
   private static final int O0000000000 = 144;
   private static final int O00000000000 = 0;
   private static final int O000000000000 = 1;
   private static final int O0000000000000 = 2;
   private static final int O000000000000O = 3;
   private static final int O00000000000O = 16;
   private static final int O00000000000O0 = 32;
   private static final int O00000000000OO = 64;
   private static final int O0000000000O = 67108864;
   private static final float[] O0000000000O0 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   private final boolean O0000000000O00;
   private final boolean O0000000000O0O;
   private final boolean O0000000000OO;
   private final boolean O0000000000OO0;
   private final O0000O00OO0 O0000000000OOO;
   private final int O000000000O;
   private final int O000000000O0;
   private final int O000000000O00;
   private final ByteBuffer O000000000O000;
   private int O000000000O00O = 0;
   private O0000O00O0OOO0.W373 O000000000O0O;
   private int O000000000O0O0;
   private int O000000000O0OO;
   private int O000000000OO = -1;
   private int O000000000OO0 = -1;
   private boolean O000000000OO00 = false;
   private int O000000000OO0O = 0;
   private int O000000000OOO = 0;
   private int O000000000OOO0 = Integer.MAX_VALUE;
   private int O000000000OOOO = Integer.MAX_VALUE;
   private float O00000000O = 0.0F;
   private float O00000000O0 = 0.0F;
   private float O00000000O00 = 0.0F;
   private float O00000000O000 = 0.0F;
   private final Int2IntOpenHashMap O00000000O0000 = new Int2IntOpenHashMap(16);
   private final int[] O00000000O000O = new int[16];
   private final int[] O00000000O00O = new int[16];
   private int O00000000O00O0 = 0;
   private int O00000000O00OO = -1;
   private boolean O00000000O0O = false;
   private int O00000000O0O0 = 0;
   private int O00000000O0O00 = 0;
   private int O00000000O0O0O = 0;
   private int O00000000O0OO = 0;
   private int O00000000O0OO0 = 0;
   private int O00000000O0OOO = 0;
   private int O00000000OO = 0;
   private int O00000000OO0 = 0;
   private float O00000000OO00 = 0.5F;
   private float O00000000OO000 = 0.5F;
   private int O00000000OO00O = 0;
   private int O00000000OO0O = 0;
   private int O00000000OO0O0 = 0;
   private int O00000000OO0OO = 0;
   private final O0000O0O000O0 O00000000OOO = new O0000O0O000O0();
   private int O00000000OOO0 = 0;
   private int O00000000OOO00 = 0;
   private int O00000000OOO0O = 0;
   private O0000O00OO0 O00000000OOOO;
   private int O00000000OOOO0 = -1;
   private final RenderEngine.W372 O00000000OOOOO = new RenderEngine.W372();
   private int O0000000O = 0;
   private int O0000000O0 = 0;
   private O0000O00OO0 O0000000O00;
   private int O0000000O000 = -1;
   private int O0000000O0000 = -1;
   private int O0000000O00000 = -1;
   private int O0000000O0000O = -1;
   private int O0000000O000O = -1;
   private int O0000000O000O0 = -1;
   private int O0000000O000OO = -1;
   private int O0000000O00O = -1;
   private int O0000000O00O0 = -1;
   private int O0000000O00O00 = -1;
   private int O0000000O00O0O = -1;
   private int O0000000O00OO = -1;
   private int O0000000O00OO0 = -1;
   private int O0000000O00OOO = -1;
   private final List<RenderEngine.W372> O0000000O0O = new ArrayList<>();
   private int O0000000O0O0 = 0;
   private int O0000000O0O00 = 0;
   private int O0000000O0O000 = 0;
   private O0000O00OO0 O0000000O0O00O;
   private int O0000000O0O0O = -1;
   private int O0000000O0O0O0 = -1;
   private int O0000000O0O0OO = -1;
   private int O0000000O0OO = -1;
   private int O0000000O0OO0 = -1;
   private int O0000000O0OO00 = -1;
   private int O0000000O0OO0O = -1;
   private int O0000000O0OOO = -1;
   private int O0000000O0OOO0 = -1;
   private int O0000000O0OOOO = -1;
   private int O0000000OO = -1;
   private int O0000000OO0 = -1;
   private int O0000000OO00 = -1;
   private O0000O00OO0 O0000000OO000;
   private int O0000000OO0000 = -1;
   private int O0000000OO000O = -1;
   private int O0000000OO00O = -1;
   private int O0000000OO00O0 = -1;
   private int O0000000OO00OO = -1;
   private int O0000000OO0O = -1;
   private int O0000000OO0O0 = -1;
   private int O0000000OO0O00 = -1;
   private int O0000000OO0O0O = -1;
   private int O0000000OO0OO = -1;
   private int O0000000OO0OO0 = -1;
   private int O0000000OO0OOO = -1;
   private int O0000000OOO = -1;
   private int O0000000OOO0 = -1;
   private int O0000000OOO00 = -1;
   private int O0000000OOO000 = -1;
   private int O0000000OOO00O = -1;
   private O0000O00OO0 O0000000OOO0O;
   private int O0000000OOO0O0 = -1;
   private int O0000000OOO0OO = -1;
   private int O0000000OOOO = -1;
   private int O0000000OOOO0 = -1;
   private int O0000000OOOO00 = -1;
   private int O0000000OOOO0O = -1;
   private int O0000000OOOOO = -1;
   private int O0000000OOOOO0 = -1;
   private int O0000000OOOOOO = -1;
   private int O000000O0 = -1;
   private int O000000O00 = -1;
   private int O000000O000 = -1;
   private GLDebugMessageCallback O000000O0000;
   private final O0000O0O000O00 O000000O00000 = new O0000O0O000O00(32856, 5121);
   private final O0000O0O000O00 O000000O000000 = new O0000O0O000O00(32856, 5121);
   private int O000000O00000O = 0;
   private int O000000O0000O = 0;
   private int O000000O0000O0 = 0;
   private float O000000O0000OO = 1.0F;
   private float O000000O000O = 1.0F;
   private int O000000O000O0 = 0;
   private int O000000O000O00 = 0;
   private int O000000O000O0O = 0;
   private int O000000O000OO = 0;
   private int O000000O000OO0 = 0;
   private boolean O000000O000OOO = false;
   private boolean O000000O00O = false;
   private static final ConcurrentHashMap<Integer, Long> O000000O00O0 = new ConcurrentHashMap<>();
   private static final AtomicLong O000000O00O00 = new AtomicLong();
   private static final AtomicInteger O000000O00O000 = new AtomicInteger();
   private static final long O000000O00O00O = 5000L;
   private static final long O000000O00O0O = 1000L;
   private static final int O000000O00O0O0 = 8;

   private static int O00000000(int i) {
      int var1 = i >> 16 & 0xFF;
      int var2 = i >> 8 & 0xFF;
      int var3 = i & 0xFF;
      int var4 = i >>> 24 & 0xFF;
      return var4 << 24 | var3 << 16 | var2 << 8 | var1;
   }

   private void O0000000000000() {
      this.O000000000(1);
   }

   private void O000000000(int i) {
      if (i > 0) {
         if (i > 4096) {
            throw new IllegalArgumentException("additionalInstances must be between 1 and 4096");
         } else {
            if (this.O000000000O00O + i > 4096) {
               this.O000000000();
               this.O000000000O00O = 0;
               this.O000000000O000.clear();
               this.O000000000000O();
            }
         }
      }
   }

   private void O000000000000O() {
      this.O00000000O0000.clear();
      this.O00000000O00O0 = 0;
   }

   public RenderEngine() {
      this.O00000000O0000.defaultReturnValue(-1);
      GLCapabilities var1 = GL.getCapabilities();
      this.O0000000000O00 = var1.OpenGL43;
      this.O0000000000O0O = var1.OpenGL43 || var1.GL_KHR_debug;
      boolean var2 = var1.glVertexAttribDivisor != 0L;
      boolean var3 = var1.glVertexAttribDivisorARB != 0L;
      boolean var4 = var1.glDrawArraysInstanced != 0L;
      boolean var5 = var1.glDrawArraysInstancedARB != 0L;
      boolean var6 = var2 || var3;
      boolean var7 = var4 || var5;
      this.O0000000000OO = !var2 && var3;
      this.O0000000000OO0 = !var4 && var5;
      if (this.O0000000000O00 || var6 && var7) {
         String var8 = this.O0000000000O00 ? "assets/wild/shaders/shape.vert" : "assets/wild/shaders/shape_compat.vert";
         String var9 = O0000O00OO.O00000000(var8);
         String var10 = O0000O00OO.O00000000("assets/wild/shaders/shape.frag");
         this.O0000000000OOO = new O0000O00OO0(var9, var10);
         this.O000000000O = GL30.glGenVertexArrays();
         int var11 = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.O000000000O);
         GL15.glBindBuffer(34962, var11);
         float[] var12 = new float[]{0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F};
         GL15.glBufferData(34962, var12, 35044);
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, 0, 0L);
         int var13 = 0;
         if (!this.O0000000000O00) {
            var13 = GL15.glGenBuffers();
            GL15.glBindBuffer(34962, var13);
            GL15.glBufferData(34962, 589824L, 35040);
            short var14 = 144;
            long var15 = 0L;
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 4, 5126, false, var14, var15);
            this.O0000000000000(1, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(2);
            GL20.glVertexAttribPointer(2, 4, 5126, false, var14, var15);
            this.O0000000000000(2, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(3);
            GL30.glVertexAttribIPointer(3, 4, 5124, var14, var15);
            this.O0000000000000(3, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(4);
            GL20.glVertexAttribPointer(4, 4, 5126, false, var14, var15);
            this.O0000000000000(4, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(5);
            GL20.glVertexAttribPointer(5, 4, 5126, false, var14, var15);
            this.O0000000000000(5, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(6);
            GL30.glVertexAttribIPointer(6, 4, 5125, var14, var15);
            this.O0000000000000(6, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(7);
            GL20.glVertexAttribPointer(7, 4, 5126, false, var14, var15);
            this.O0000000000000(7, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(8);
            GL20.glVertexAttribPointer(8, 4, 5126, false, var14, var15);
            this.O0000000000000(8, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(9);
            GL30.glVertexAttribIPointer(9, 1, 5124, var14, var15);
            this.O0000000000000(9, 1);
            var15 += 4L;
            GL20.glEnableVertexAttribArray(10);
            GL30.glVertexAttribIPointer(10, 1, 5124, var14, var15);
            this.O0000000000000(10, 1);
            GL15.glBindBuffer(34962, 0);
         }

         GL15.glBindBuffer(34962, 0);
         GL30.glBindVertexArray(0);
         this.O000000000O00 = var13;
         this.O000000000O000 = ByteBuffer.allocateDirect(589824).order(ByteOrder.nativeOrder());
         if (this.O0000000000O00) {
            this.O000000000O0 = GL15.glGenBuffers();
            GL15.glBindBuffer(37074, this.O000000000O0);
            GL15.glBufferData(37074, 589824L, 35040);
            GL15.glBindBuffer(37074, 0);
         } else {
            this.O000000000O0 = 0;
         }

         if (this.O0000000000O0O) {
            this.O00000000(var1);
         }
      } else {
         throw new IllegalStateException("OpenGL instanced rendering is required when shader storage buffers are unavailable");
      }
   }

   private void O00000000000O() {
      if (this.O00000000OOO00 == 0) {
         this.O00000000OOO00 = GL30.glGenVertexArrays();
         this.O00000000OOO0O = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.O00000000OOO00);
         GL15.glBindBuffer(34962, this.O00000000OOO0O);
         float[] var1 = new float[]{
            -1.0F,
            -1.0F,
            0.0F,
            0.0F,
            1.0F,
            -1.0F,
            1.0F,
            0.0F,
            1.0F,
            1.0F,
            1.0F,
            1.0F,
            -1.0F,
            -1.0F,
            0.0F,
            0.0F,
            1.0F,
            1.0F,
            1.0F,
            1.0F,
            -1.0F,
            1.0F,
            0.0F,
            1.0F
         };
         GL15.glBufferData(34962, var1, 35044);
         byte var2 = 16;
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, var2, 0L);
         GL20.glEnableVertexAttribArray(1);
         GL20.glVertexAttribPointer(1, 2, 5126, false, var2, 8L);
         GL15.glBindBuffer(34962, 0);
         GL30.glBindVertexArray(0);
      }
   }

   private O0000O00OO0 O00000000000O0() {
      if (this.O00000000OOOO != null) {
         return this.O00000000OOOO;
      } else {
         String var1 = O0000O00OO.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert");
         String var2 = "#version 330 core\nlayout(location = 0) out vec4 fragColor;\nin vec2 vUv;\nuniform sampler2D uSource;\nvoid main() {\n    fragColor = texture(uSource, vUv);\n}";
         this.O00000000OOOO = new O0000O00OO0(var1, var2);
         this.O00000000OOOO0 = this.O00000000OOOO.O00000000("uSource");
         return this.O00000000OOOO;
      }
   }

   private void O00000000000OO() {
      if (this.O0000000O == 0) {
         this.O0000000O = GL30.glGenVertexArrays();
         this.O0000000O0 = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.O0000000O);
         GL15.glBindBuffer(34962, this.O0000000O0);
         GL15.glBufferData(34962, 96L, 35040);
         byte var1 = 16;
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, var1, 0L);
         GL20.glEnableVertexAttribArray(1);
         GL20.glVertexAttribPointer(1, 2, 5126, false, var1, 8L);
         GL15.glBindBuffer(34962, 0);
         GL30.glBindVertexArray(0);
      }

      if (this.O0000000O00 == null) {
         this.O0000000O00 = O0000O00OO0.O00000000("assets/wild/shaders/postfx/scroll_layer.vert", "assets/wild/shaders/postfx/scroll_layer.frag");
         this.O0000000O000 = this.O0000000O00.O00000000("uSource");
         this.O0000000O0000 = this.O0000000O00.O00000000("uViewport");
         this.O0000000O00000 = this.O0000000O00.O00000000("uSize");
         this.O0000000O0000O = this.O0000000O00.O00000000("uTextureSize");
         this.O0000000O000O = this.O0000000O00.O00000000("uRadii");
         this.O0000000O000O0 = this.O0000000O00.O00000000("uClipRect");
         this.O0000000O000OO = this.O0000000O00.O00000000("uClipRadii");
         this.O0000000O00O = this.O0000000O00.O00000000("uFadePx");
         this.O0000000O00O0 = this.O0000000O00.O00000000("uEdgeBlurPx");
         this.O0000000O00O00 = this.O0000000O00.O00000000("uMotionBlurPx");
         this.O0000000O00O0O = this.O0000000O00.O00000000("uMotionStrength");
         this.O0000000O00OO = this.O0000000O00.O00000000("uFocusStrength");
         this.O0000000O00OO0 = this.O0000000O00.O00000000("uDirection");
         this.O0000000O00OOO = this.O0000000O00.O00000000("uAlpha");
      }
   }

   private void O0000000000O() {
      if (this.O0000000O0O00 == 0) {
         this.O0000000O0O00 = GL30.glGenVertexArrays();
         this.O0000000O0O000 = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.O0000000O0O00);
         GL15.glBindBuffer(34962, this.O0000000O0O000);
         GL15.glBufferData(34962, 96L, 35040);
         byte var1 = 16;
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, var1, 0L);
         GL20.glEnableVertexAttribArray(1);
         GL20.glVertexAttribPointer(1, 2, 5126, false, var1, 8L);
         GL15.glBindBuffer(34962, 0);
         GL30.glBindVertexArray(0);
      }

      if (this.O0000000O0O00O == null) {
         this.O0000000O0O00O = O0000O00OO0.O00000000("assets/wild/shaders/card_transition.vert", "assets/wild/shaders/card_transition.frag");
         this.O0000000O0O0O = this.O0000000O0O00O.O00000000("u_texture");
         this.O0000000O0O0O0 = this.O0000000O0O00O.O00000000("u_viewport");
         this.O0000000O0O0OO = this.O0000000O0O00O.O00000000("u_resolution");
         this.O0000000O0OO = this.O0000000O0O00O.O00000000("u_time");
         this.O0000000O0OO0 = this.O0000000O0O00O.O00000000("u_progress");
         this.O0000000O0OO00 = this.O0000000O0O00O.O00000000("u_color");
         this.O0000000O0OO0O = this.O0000000O0O00O.O00000000("u_borderColor");
         this.O0000000O0OOO = this.O0000000O0O00O.O00000000("u_emissiveColor");
         this.O0000000O0OOO0 = this.O0000000O0O00O.O00000000("u_emissiveColor2");
         this.O0000000O0OOOO = this.O0000000O0O00O.O00000000("u_radius");
         this.O0000000OO = this.O0000000O0O00O.O00000000("u_alpha");
         this.O0000000OO0 = this.O0000000O0O00O.O00000000("u_clipRect");
         this.O0000000OO00 = this.O0000000O0O00O.O00000000("u_clipRadii");
      }
   }

   private void O0000000000O0() {
      this.O0000000000O();
      if (this.O0000000OO000 == null) {
         this.O0000000OO000 = O0000O00OO0.O00000000("assets/wild/shaders/card_transition.vert", "assets/wild/shaders/entity/nametag_plasma.frag");
         this.O0000000OO0000 = this.O0000000OO000.O00000000("u_texture");
         this.O0000000OO000O = this.O0000000OO000.O00000000("u_viewport");
         this.O0000000OO00O = this.O0000000OO000.O00000000("u_resolution");
         this.O0000000OO00O0 = this.O0000000OO000.O00000000("u_time");
         this.O0000000OO00OO = this.O0000000OO000.O00000000("u_progress");
         this.O0000000OO0O = this.O0000000OO000.O00000000("u_contentReveal");
         this.O0000000OO0O0 = this.O0000000OO000.O00000000("u_focus");
         this.O0000000OO0O00 = this.O0000000OO000.O00000000("u_threat");
         this.O0000000OO0O0O = this.O0000000OO000.O00000000("u_exposure");
         this.O0000000OO0OO = this.O0000000OO000.O00000000("u_color");
         this.O0000000OO0OO0 = this.O0000000OO000.O00000000("u_borderColor");
         this.O0000000OO0OOO = this.O0000000OO000.O00000000("u_emissiveColor");
         this.O0000000OOO = this.O0000000OO000.O00000000("u_emissiveColor2");
         this.O0000000OOO0 = this.O0000000OO000.O00000000("u_radius");
         this.O0000000OOO00 = this.O0000000OO000.O00000000("u_alpha");
         this.O0000000OOO000 = this.O0000000OO000.O00000000("u_clipRect");
         this.O0000000OOO00O = this.O0000000OO000.O00000000("u_clipRadii");
      }
   }

   private void O0000000000O00() {
      this.O0000000000O();
      if (this.O0000000OOO0O == null) {
         this.O0000000OOO0O = O0000O00OO0.O00000000("assets/wild/shaders/card_transition.vert", "assets/wild/shaders/fbo_mask.frag");
         this.O0000000OOO0O0 = this.O0000000OOO0O.O00000000("u_texture");
         this.O0000000OOO0OO = this.O0000000OOO0O.O00000000("u_viewport");
         this.O0000000OOOO = this.O0000000OOO0O.O00000000("u_resolution");
         this.O0000000OOOO0 = this.O0000000OOO0O.O00000000("u_time");
         this.O0000000OOOO00 = this.O0000000OOO0O.O00000000("u_progress");
         this.O0000000OOOO0O = this.O0000000OOO0O.O00000000("u_color");
         this.O0000000OOOOO = this.O0000000OOO0O.O00000000("u_borderColor");
         this.O0000000OOOOO0 = this.O0000000OOO0O.O00000000("u_emissiveColor");
         this.O0000000OOOOOO = this.O0000000OOO0O.O00000000("u_radius");
         this.O000000O0 = this.O0000000OOO0O.O00000000("u_alpha");
         this.O000000O00 = this.O0000000OOO0O.O00000000("u_clipRect");
         this.O000000O000 = this.O0000000OOO0O.O00000000("u_clipRadii");
      }
   }

   public RenderEngine.W371 O00000000(int i, int j) {
      return this.O00000000(this.O00000000OOOOO, i, j, false);
   }

   public RenderEngine.W371 O000000000(int i, int j) {
      if (i > 0 && j > 0 && this.O000000000O0O0 > 0 && this.O000000000O0OO > 0) {
         int var3 = this.O0000000O0O0;
         RenderEngine.W372 var4 = this.O0000000000(var3);
         this.O0000000O0O0++;

         try {
            RenderEngine.W371 var5 = this.O00000000(var4, i, j, true);
            if (var5 == null) {
               this.O0000000O0O0 = var3;
            }

            return var5;
         } catch (Error | RuntimeException var6) {
            this.O0000000O0O0 = var3;
            throw var6;
         }
      } else {
         return null;
      }
   }

   private RenderEngine.W372 O0000000000(int i) {
      while (this.O0000000O0O.size() <= i) {
         this.O0000000O0O.add(new RenderEngine.W372());
      }

      return this.O0000000O0O.get(i);
   }

   private RenderEngine.W371 O00000000(RenderEngine.W372 o0000000000, int i, int j, boolean bl) {
      this.O000000000();
      if (i > 0 && j > 0 && this.O000000000O0O0 > 0 && this.O000000000O0OO > 0) {
         int var5 = i;
         int var6 = j;
         O0000O00O0OOO0.W373 var7 = O0000O00O0OOO0.O00000000();

         try {
            this.O00000000(o0000000000, var5, var6);
            RenderEngine.W371 var8 = new RenderEngine.W371(
               o0000000000.O000000000,
               var5,
               var6,
               var7,
               this.O000000000O0O0,
               this.O000000000O0OO,
               this.O000000000OO00,
               this.O000000000OO0O,
               this.O000000000OOO,
               this.O000000000OOO0,
               this.O000000000OOOO,
               this.O00000000O,
               this.O00000000O0,
               this.O00000000O00,
               this.O00000000O000,
               this.O000000O000OOO,
               bl
            );
            GL30.glBindFramebuffer(36160, o0000000000.O00000000);
            GL11.glDrawBuffer(36064);
            GL11.glViewport(0, 0, var5, var6);
            GL11.glDisable(3089);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(36281);
            GL11.glColorMask(true, true, true, true);
            GL11.glDepthMask(false);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16384);
            this.O000000000O0O0 = var5;
            this.O000000000O0OO = var6;
            this.O000000000OO00 = false;
            this.O000000000OO0O = 0;
            this.O000000000OOO = 0;
            this.O000000000OOO0 = var5;
            this.O000000000OOOO = var6;
            this.O00000000O = 0.0F;
            this.O00000000O0 = 0.0F;
            this.O00000000O00 = 0.0F;
            this.O00000000O000 = 0.0F;
            this.O000000O000OOO = false;
            this.O0000000000OOO.O00000000();
            GL30.glBindVertexArray(this.O000000000O);
            if (this.O00000000O00OO == -1) {
               this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
            }

            GL20.glUniform2f(this.O00000000O00OO, var5, var6);
            this.O0000000000O0O();
            this.O000000000000O();
            return var8;
         } catch (Error | RuntimeException var9) {
            O0000O00O0OOO0.O00000000(var7);
            this.O0000000000OOO.O00000000();
            GL30.glBindVertexArray(this.O000000000O);
            if (this.O00000000O00OO == -1) {
               this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
            }

            GL20.glUniform2f(this.O00000000O00OO, this.O000000000O0O0, this.O000000000O0OO);
            this.O0000000000O0O();
            throw var9;
         }
      } else {
         return null;
      }
   }

   public void O00000000(RenderEngine.W371 o000000000) {
      this.O000000000();
      if (o000000000 != null) {
         this.O000000000O0O0 = o000000000.previousViewportWidth();
         this.O000000000O0OO = o000000000.previousViewportHeight();
         this.O000000000OO00 = o000000000.previousClipEnabled();
         this.O000000000OO0O = o000000000.previousClipX();
         this.O000000000OOO = o000000000.previousClipY();
         this.O000000000OOO0 = o000000000.previousClipW();
         this.O000000000OOOO = o000000000.previousClipH();
         this.O00000000O = o000000000.previousClipRoundTL();
         this.O00000000O0 = o000000000.previousClipRoundTR();
         this.O00000000O00 = o000000000.previousClipRoundBR();
         this.O00000000O000 = o000000000.previousClipRoundBL();
         this.O000000O000OOO = o000000000.previousAdditiveBlend();
         O0000O00O0OOO0.O00000000(o000000000.snapshot());
         this.O0000000000OOO.O00000000();
         GL30.glBindVertexArray(this.O000000000O);
         if (this.O00000000O00OO == -1) {
            this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
         }

         GL20.glUniform2f(this.O00000000O00OO, this.O000000000O0O0, this.O000000000O0OO);
         this.O0000000000O0O();
         this.O000000000000O();
         if (o000000000.cardTransition()) {
            this.O0000000O0O0 = Math.max(0, this.O0000000O0O0 - 1);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(
      int i,
      int j,
      int k,
      float f,
      float g,
      float h,
      float l,
      float m,
      float n,
      float o,
      float p,
      float q,
      float r,
      float s,
      float t,
      float u,
      float v,
      float w,
      float[] fs,
      int x,
      int y,
      int z,
      int aa,
      float ab,
      float ac,
      float ad,
      float ae
   ) {
      if (i > 0 && j > 0 && k > 0 && !(h <= 0.0F) && !(l <= 0.0F)) {
         this.O000000000();
         float[] var28 = fs != null && fs.length >= 6 ? fs : O0000000000O0;
         float var31 = f + h;
         float var32 = g + l;
         float var33 = O00000000(var28, f, g);
         float var34 = O000000000(var28, f, g);
         float var35 = O00000000(var28, var31, g);
         float var36 = O000000000(var28, var31, g);
         float var37 = O00000000(var28, var31, var32);
         float var38 = O000000000(var28, var31, var32);
         float var39 = O00000000(var28, f, var32);
         float var40 = O000000000(var28, f, var32);
         float[] var41 = new float[]{
            var33,
            var34,
            0.0F,
            1.0F,
            var35,
            var36,
            1.0F,
            1.0F,
            var37,
            var38,
            1.0F,
            0.0F,
            var33,
            var34,
            0.0F,
            1.0F,
            var37,
            var38,
            1.0F,
            0.0F,
            var39,
            var40,
            0.0F,
            0.0F
         };
         O0000O00O0OOO0.W373 var42 = O0000O00O0OOO0.O00000000();
         boolean var45 = false /* VF: Semaphore variable */;

         try {
            var45 = true;
            this.O00000000000OO();
            GL11.glDisable(3089);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(36281);
            GL11.glEnable(3042);
            if (this.O000000O000OOO) {
               GL14.glBlendFuncSeparate(1, 1, 1, 771);
            } else {
               GL14.glBlendFuncSeparate(1, 771, 1, 771);
            }

            this.O0000000O00.O00000000();
            if (this.O0000000O000 >= 0) {
               GL20.glUniform1i(this.O0000000O000, 0);
            }

            if (this.O0000000O0000 >= 0) {
               GL20.glUniform2f(this.O0000000O0000, this.O000000000O0O0, this.O000000000O0OO);
            }

            if (this.O0000000O00000 >= 0) {
               GL20.glUniform2f(this.O0000000O00000, h, l);
            }

            if (this.O0000000O0000O >= 0) {
               GL20.glUniform2f(this.O0000000O0000O, j, k);
            }

            if (this.O0000000O000O >= 0) {
               GL20.glUniform4f(this.O0000000O000O, m, n, o, p);
            }

            if (this.O0000000O000O0 >= 0) {
               GL20.glUniform4f(this.O0000000O000O0, x, y, z, aa);
            }

            if (this.O0000000O000OO >= 0) {
               GL20.glUniform4f(this.O0000000O000OO, ab, ac, ad, ae);
            }

            if (this.O0000000O00O >= 0) {
               GL20.glUniform1f(this.O0000000O00O, Math.max(0.0F, q));
            }

            if (this.O0000000O00O0 >= 0) {
               GL20.glUniform1f(this.O0000000O00O0, Math.max(0.0F, r));
            }

            if (this.O0000000O00O00 >= 0) {
               GL20.glUniform1f(this.O0000000O00O00, Math.max(0.0F, s));
            }

            if (this.O0000000O00O0O >= 0) {
               GL20.glUniform1f(this.O0000000O00O0O, Math.max(0.0F, Math.min(1.0F, t)));
            }

            if (this.O0000000O00OO >= 0) {
               GL20.glUniform1f(this.O0000000O00OO, Math.max(0.0F, Math.min(1.0F, u)));
            }

            if (this.O0000000O00OO0 >= 0) {
               GL20.glUniform1f(this.O0000000O00OO0, v < 0.0F ? -1.0F : 1.0F);
            }

            if (this.O0000000O00OOO >= 0) {
               GL20.glUniform1f(this.O0000000O00OOO, Math.max(0.0F, Math.min(1.0F, w)));
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, i);
            GL30.glBindVertexArray(this.O0000000O);
            GL15.glBindBuffer(34962, this.O0000000O0);
            GL15.glBufferData(34962, var41, 35040);
            O0000O00OO0O.O00000000().O00000000(2);
            GL11.glDrawArrays(4, 0, 6);
            var45 = false;
         } finally {
            if (var45) {
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var42);
               this.O0000000000OOO.O00000000();
               GL30.glBindVertexArray(this.O000000000O);
               if (this.O00000000O00OO == -1) {
                  this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
               }

               GL20.glUniform2f(this.O00000000O00OO, this.O000000000O0O0, this.O000000000O0OO);
               this.O0000000000O0O();
            }
         }

         GL30.glBindVertexArray(0);
         GL15.glBindBuffer(34962, 0);
         GL20.glUseProgram(0);
         O0000O00O0OOO0.O00000000(var42);
         this.O0000000000OOO.O00000000();
         GL30.glBindVertexArray(this.O000000000O);
         if (this.O00000000O00OO == -1) {
            this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
         }

         GL20.glUniform2f(this.O00000000O00OO, this.O000000000O0O0, this.O000000000O0OO);
         this.O0000000000O0O();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(
      int i,
      int j,
      int k,
      float f,
      float g,
      float h,
      float l,
      float m,
      int n,
      int o,
      int p,
      int q,
      float r,
      float s,
      float t,
      float[] fs,
      int u,
      int v,
      int w,
      int x,
      float y,
      float z,
      float aa,
      float ab
   ) {
      if (i > 0 && j > 0 && k > 0 && !(h <= 0.0F) && !(l <= 0.0F)) {
         this.O000000000();
         float[] var25 = fs != null && fs.length >= 6 ? fs : O0000000000O0;
         float var28 = f + h;
         float var29 = g + l;
         float var30 = O00000000(var25, f, g);
         float var31 = O000000000(var25, f, g);
         float var32 = O00000000(var25, var28, g);
         float var33 = O000000000(var25, var28, g);
         float var34 = O00000000(var25, var28, var29);
         float var35 = O000000000(var25, var28, var29);
         float var36 = O00000000(var25, f, var29);
         float var37 = O000000000(var25, f, var29);
         float[] var38 = new float[]{
            var30,
            var31,
            0.0F,
            1.0F,
            var32,
            var33,
            1.0F,
            1.0F,
            var34,
            var35,
            1.0F,
            0.0F,
            var30,
            var31,
            0.0F,
            1.0F,
            var34,
            var35,
            1.0F,
            0.0F,
            var36,
            var37,
            0.0F,
            0.0F
         };
         O0000O00O0OOO0.W373 var39 = O0000O00O0OOO0.O00000000();
         boolean var42 = false /* VF: Semaphore variable */;

         try {
            var42 = true;
            this.O0000000000O();
            GL11.glDisable(3089);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(36281);
            GL11.glEnable(3042);
            if (this.O000000O000OOO) {
               GL14.glBlendFuncSeparate(1, 1, 1, 771);
            } else {
               GL14.glBlendFuncSeparate(1, 771, 1, 771);
            }

            this.O0000000O0O00O.O00000000();
            if (this.O0000000O0O0O >= 0) {
               GL20.glUniform1i(this.O0000000O0O0O, 0);
            }

            if (this.O0000000O0O0O0 >= 0) {
               GL20.glUniform2f(this.O0000000O0O0O0, this.O000000000O0O0, this.O000000000O0OO);
            }

            if (this.O0000000O0O0OO >= 0) {
               GL20.glUniform2f(this.O0000000O0O0OO, h, l);
            }

            if (this.O0000000O0OO >= 0) {
               GL20.glUniform1f(this.O0000000O0OO, s);
            }

            if (this.O0000000O0OO0 >= 0) {
               GL20.glUniform1f(this.O0000000O0OO0, Math.max(0.0F, Math.min(1.0F, r)));
            }

            if (this.O0000000O0OO00 >= 0) {
               O000000000000O(this.O0000000O0OO00, n);
            }

            if (this.O0000000O0OO0O >= 0) {
               O000000000000O(this.O0000000O0OO0O, o);
            }

            if (this.O0000000O0OOO >= 0) {
               O000000000000O(this.O0000000O0OOO, p);
            }

            if (this.O0000000O0OOO0 >= 0) {
               O000000000000O(this.O0000000O0OOO0, q);
            }

            if (this.O0000000O0OOOO >= 0) {
               GL20.glUniform1f(this.O0000000O0OOOO, Math.max(0.0F, m));
            }

            if (this.O0000000OO >= 0) {
               GL20.glUniform1f(this.O0000000OO, Math.max(0.0F, Math.min(1.0F, t)));
            }

            if (this.O0000000OO0 >= 0) {
               GL20.glUniform4f(this.O0000000OO0, u, v, w, x);
            }

            if (this.O0000000OO00 >= 0) {
               GL20.glUniform4f(this.O0000000OO00, y, z, aa, ab);
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, i);
            GL30.glBindVertexArray(this.O0000000O0O00);
            GL15.glBindBuffer(34962, this.O0000000O0O000);
            GL15.glBufferData(34962, var38, 35040);
            O0000O00OO0O.O00000000().O00000000(2);
            GL11.glDrawArrays(4, 0, 6);
            var42 = false;
         } finally {
            if (var42) {
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var39);
               this.O0000000000OOO.O00000000();
               GL30.glBindVertexArray(this.O000000000O);
               if (this.O00000000O00OO == -1) {
                  this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
               }

               GL20.glUniform2f(this.O00000000O00OO, this.O000000000O0O0, this.O000000000O0OO);
               this.O0000000000O0O();
            }
         }

         GL30.glBindVertexArray(0);
         GL15.glBindBuffer(34962, 0);
         GL20.glUseProgram(0);
         O0000O00O0OOO0.O00000000(var39);
         this.O0000000000OOO.O00000000();
         GL30.glBindVertexArray(this.O000000000O);
         if (this.O00000000O00OO == -1) {
            this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
         }

         GL20.glUniform2f(this.O00000000O00OO, this.O000000000O0O0, this.O000000000O0OO);
         this.O0000000000O0O();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(
      int i,
      int j,
      int k,
      float f,
      float g,
      float h,
      float l,
      float m,
      int n,
      int o,
      int p,
      int q,
      float r,
      float s,
      float t,
      float u,
      float v,
      float w,
      float x,
      float[] fs,
      int y,
      int z,
      int aa,
      int ab,
      float ac,
      float ad,
      float ae,
      float af
   ) {
      if (i > 0 && j > 0 && k > 0 && !(h <= 0.0F) && !(l <= 0.0F)) {
         this.O000000000();
         float[] var29 = fs != null && fs.length >= 6 ? fs : O0000000000O0;
         float var32 = f + h;
         float var33 = g + l;
         float var34 = O00000000(var29, f, g);
         float var35 = O000000000(var29, f, g);
         float var36 = O00000000(var29, var32, g);
         float var37 = O000000000(var29, var32, g);
         float var38 = O00000000(var29, var32, var33);
         float var39 = O000000000(var29, var32, var33);
         float var40 = O00000000(var29, f, var33);
         float var41 = O000000000(var29, f, var33);
         float[] var42 = new float[]{
            var34,
            var35,
            0.0F,
            1.0F,
            var36,
            var37,
            1.0F,
            1.0F,
            var38,
            var39,
            1.0F,
            0.0F,
            var34,
            var35,
            0.0F,
            1.0F,
            var38,
            var39,
            1.0F,
            0.0F,
            var40,
            var41,
            0.0F,
            0.0F
         };
         O0000O00O0OOO0.W373 var43 = O0000O00O0OOO0.O00000000();
         boolean var46 = false /* VF: Semaphore variable */;

         try {
            var46 = true;
            this.O0000000000O0();
            GL11.glDisable(3089);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(36281);
            GL11.glEnable(3042);
            if (this.O000000O000OOO) {
               GL14.glBlendFuncSeparate(1, 1, 1, 771);
            } else {
               GL14.glBlendFuncSeparate(1, 771, 1, 771);
            }

            this.O0000000OO000.O00000000();
            if (this.O0000000OO0000 >= 0) {
               GL20.glUniform1i(this.O0000000OO0000, 0);
            }

            if (this.O0000000OO000O >= 0) {
               GL20.glUniform2f(this.O0000000OO000O, this.O000000000O0O0, this.O000000000O0OO);
            }

            if (this.O0000000OO00O >= 0) {
               GL20.glUniform2f(this.O0000000OO00O, h, l);
            }

            if (this.O0000000OO00O0 >= 0) {
               GL20.glUniform1f(this.O0000000OO00O0, t);
            }

            if (this.O0000000OO00OO >= 0) {
               GL20.glUniform1f(this.O0000000OO00OO, Math.max(0.0F, Math.min(1.0F, r)));
            }

            if (this.O0000000OO0O >= 0) {
               GL20.glUniform1f(this.O0000000OO0O, Math.max(0.0F, Math.min(1.0F, s)));
            }

            if (this.O0000000OO0O0 >= 0) {
               GL20.glUniform1f(this.O0000000OO0O0, Math.max(0.0F, Math.min(1.0F, u)));
            }

            if (this.O0000000OO0O00 >= 0) {
               GL20.glUniform1f(this.O0000000OO0O00, Math.max(0.0F, Math.min(1.0F, v)));
            }

            if (this.O0000000OO0O0O >= 0) {
               GL20.glUniform1f(this.O0000000OO0O0O, Math.max(0.0F, Math.min(1.0F, w)));
            }

            if (this.O0000000OO0OO >= 0) {
               O000000000000O(this.O0000000OO0OO, n);
            }

            if (this.O0000000OO0OO0 >= 0) {
               O000000000000O(this.O0000000OO0OO0, o);
            }

            if (this.O0000000OO0OOO >= 0) {
               O000000000000O(this.O0000000OO0OOO, p);
            }

            if (this.O0000000OOO >= 0) {
               O000000000000O(this.O0000000OOO, q);
            }

            if (this.O0000000OOO0 >= 0) {
               GL20.glUniform1f(this.O0000000OOO0, Math.max(0.0F, m));
            }

            if (this.O0000000OOO00 >= 0) {
               GL20.glUniform1f(this.O0000000OOO00, Math.max(0.0F, Math.min(1.0F, x)));
            }

            if (this.O0000000OOO000 >= 0) {
               GL20.glUniform4f(this.O0000000OOO000, y, z, aa, ab);
            }

            if (this.O0000000OOO00O >= 0) {
               GL20.glUniform4f(this.O0000000OOO00O, ac, ad, ae, af);
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, i);
            GL30.glBindVertexArray(this.O0000000O0O00);
            GL15.glBindBuffer(34962, this.O0000000O0O000);
            GL15.glBufferData(34962, var42, 35040);
            O0000O00OO0O.O00000000().O00000000(2);
            GL11.glDrawArrays(4, 0, 6);
            var46 = false;
         } finally {
            if (var46) {
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var43);
               this.O0000000000OOO.O00000000();
               GL30.glBindVertexArray(this.O000000000O);
               if (this.O00000000O00OO == -1) {
                  this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
               }

               GL20.glUniform2f(this.O00000000O00OO, this.O000000000O0O0, this.O000000000O0OO);
               this.O0000000000O0O();
            }
         }

         GL30.glBindVertexArray(0);
         GL15.glBindBuffer(34962, 0);
         GL20.glUseProgram(0);
         O0000O00O0OOO0.O00000000(var43);
         this.O0000000000OOO.O00000000();
         GL30.glBindVertexArray(this.O000000000O);
         if (this.O00000000O00OO == -1) {
            this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
         }

         GL20.glUniform2f(this.O00000000O00OO, this.O000000000O0O0, this.O000000000O0OO);
         this.O0000000000O0O();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(
      int i,
      int j,
      int k,
      float f,
      float g,
      float h,
      float l,
      float m,
      int n,
      int o,
      int p,
      float q,
      float r,
      float s,
      float[] fs,
      int t,
      int u,
      int v,
      int w,
      float x,
      float y,
      float z,
      float aa
   ) {
      if (i > 0 && j > 0 && k > 0 && !(h <= 0.0F) && !(l <= 0.0F)) {
         this.O000000000();
         float[] var24 = fs != null && fs.length >= 6 ? fs : O0000000000O0;
         float var27 = f + h;
         float var28 = g + l;
         float var29 = O00000000(var24, f, g);
         float var30 = O000000000(var24, f, g);
         float var31 = O00000000(var24, var27, g);
         float var32 = O000000000(var24, var27, g);
         float var33 = O00000000(var24, var27, var28);
         float var34 = O000000000(var24, var27, var28);
         float var35 = O00000000(var24, f, var28);
         float var36 = O000000000(var24, f, var28);
         float[] var37 = new float[]{
            var29,
            var30,
            0.0F,
            1.0F,
            var31,
            var32,
            1.0F,
            1.0F,
            var33,
            var34,
            1.0F,
            0.0F,
            var29,
            var30,
            0.0F,
            1.0F,
            var33,
            var34,
            1.0F,
            0.0F,
            var35,
            var36,
            0.0F,
            0.0F
         };
         O0000O00O0OOO0.W373 var38 = O0000O00O0OOO0.O00000000();
         boolean var41 = false /* VF: Semaphore variable */;

         try {
            var41 = true;
            this.O0000000000O00();
            GL11.glDisable(3089);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(36281);
            GL11.glEnable(3042);
            if (this.O000000O000OOO) {
               GL14.glBlendFuncSeparate(1, 1, 1, 771);
            } else {
               GL14.glBlendFuncSeparate(1, 771, 1, 771);
            }

            this.O0000000OOO0O.O00000000();
            if (this.O0000000OOO0O0 >= 0) {
               GL20.glUniform1i(this.O0000000OOO0O0, 0);
            }

            if (this.O0000000OOO0OO >= 0) {
               GL20.glUniform2f(this.O0000000OOO0OO, this.O000000000O0O0, this.O000000000O0OO);
            }

            if (this.O0000000OOOO >= 0) {
               GL20.glUniform2f(this.O0000000OOOO, h, l);
            }

            if (this.O0000000OOOO0 >= 0) {
               GL20.glUniform1f(this.O0000000OOOO0, r);
            }

            if (this.O0000000OOOO00 >= 0) {
               GL20.glUniform1f(this.O0000000OOOO00, Math.max(0.0F, Math.min(1.0F, q)));
            }

            if (this.O0000000OOOO0O >= 0) {
               O000000000000O(this.O0000000OOOO0O, n);
            }

            if (this.O0000000OOOOO >= 0) {
               O000000000000O(this.O0000000OOOOO, o);
            }

            if (this.O0000000OOOOO0 >= 0) {
               O000000000000O(this.O0000000OOOOO0, p);
            }

            if (this.O0000000OOOOOO >= 0) {
               GL20.glUniform1f(this.O0000000OOOOOO, Math.max(0.0F, m));
            }

            if (this.O000000O0 >= 0) {
               GL20.glUniform1f(this.O000000O0, Math.max(0.0F, Math.min(1.0F, s)));
            }

            if (this.O000000O00 >= 0) {
               GL20.glUniform4f(this.O000000O00, t, u, v, w);
            }

            if (this.O000000O000 >= 0) {
               GL20.glUniform4f(this.O000000O000, x, y, z, aa);
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, i);
            GL30.glBindVertexArray(this.O0000000O0O00);
            GL15.glBindBuffer(34962, this.O0000000O0O000);
            GL15.glBufferData(34962, var37, 35040);
            O0000O00OO0O.O00000000().O00000000(2);
            GL11.glDrawArrays(4, 0, 6);
            var41 = false;
         } finally {
            if (var41) {
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var38);
               this.O0000000000OOO.O00000000();
               GL30.glBindVertexArray(this.O000000000O);
               if (this.O00000000O00OO == -1) {
                  this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
               }

               GL20.glUniform2f(this.O00000000O00OO, this.O000000000O0O0, this.O000000000O0OO);
               this.O0000000000O0O();
            }
         }

         GL30.glBindVertexArray(0);
         GL15.glBindBuffer(34962, 0);
         GL20.glUseProgram(0);
         O0000O00O0OOO0.O00000000(var38);
         this.O0000000000OOO.O00000000();
         GL30.glBindVertexArray(this.O000000000O);
         if (this.O00000000O00OO == -1) {
            this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
         }

         GL20.glUniform2f(this.O00000000O00OO, this.O000000000O0O0, this.O000000000O0OO);
         this.O0000000000O0O();
      }
   }

   public void O0000000000(int i, int j) {
      if (i > 0 && j > 0) {
         this.O000000000O0O = O0000O00O0OOO0.O00000000();
         this.O000000000O0O0 = i;
         this.O000000000O0OO = j;
         this.O000000000O00O = 0;
         this.O000000000O000.clear();
         this.O000000000000O();
         this.O0000000000OOO.O00000000();
         if (this.O00000000O00OO == -1) {
            this.O00000000O00OO = this.O0000000000OOO.O00000000("uViewport");
         }

         GL30.glBindVertexArray(this.O000000000O);
         GL20.glUniform2f(this.O00000000O00OO, i, j);
         this.O000000O000O0 = 0;
         this.O000000O000OO = 0;
         this.O000000O000OO0 = 0;
         this.O000000O000O00 = 0;
         this.O000000O000O0O = 0;
         this.O000000O000OOO = false;
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         GL11.glDisable(3089);
         this.O0000000000O0O();
         GL11.glViewport(0, 0, i, j);
         GL11.glColorMask(true, true, true, true);
         if (!this.O00000000O0O) {
            for (int var3 = 0; var3 < 16; var3++) {
               int var4 = this.O0000000000OOO.O00000000("uTextures[" + var3 + "]");
               if (var4 != -1) {
                  GL20.glUniform1i(var4, var3);
               }
            }

            this.O00000000O0O = true;
         }
      } else {
         this.O000000000O0O0 = 0;
         this.O000000000O0OO = 0;
         this.O000000000O00O = 0;
         this.O000000000O000.clear();
         this.O000000000000O();
         this.O0000000000OOO();
      }
   }

   public void O00000000() {
      this.O000000000();
      GL30.glBindVertexArray(0);
      GL20.glUseProgram(0);
      if (this.O000000000O0O != null) {
         GL20.glUseProgram(this.O000000000O0O.O000000000O000);
         GL30.glBindVertexArray(this.O000000000O0O.O000000000O00O);
         GL15.glBindBuffer(34962, this.O000000000O0O.O000000000O0O);
         GL15.glBindBuffer(34963, this.O000000000O0O.O000000000O0O0);
         GL13.glActiveTexture(this.O000000000O0O.O000000000O0OO);
         GL11.glBindTexture(3553, this.O000000000O0O.O000000000OO);
         GL11.glPixelStorei(3317, this.O000000000O0O.O000000000OO00);
         O00000000(3089, this.O000000000O0O.O0000000000000);
         O00000000(2929, this.O000000000O0O.O00000000000O);
         O00000000(2884, this.O000000000O0O.O00000000000O0);
         O00000000(3042, this.O000000000O0O.O00000000000OO);
         O00000000(36281, this.O000000000O0O.O0000000000O);
         GL14.glBlendFuncSeparate(
            this.O000000000O0O.O0000000000O0, this.O000000000O0O.O0000000000O00, this.O000000000O0O.O0000000000O0O, this.O000000000O0O.O0000000000OO
         );
         GL11.glColorMask(this.O000000000O0O.O0000000000OO0, this.O000000000O0O.O0000000000OOO, this.O000000000O0O.O000000000O, this.O000000000O0O.O000000000O0);
         GL11.glDepthMask(this.O000000000O0O.O000000000O00);
         GL11.glViewport(
            this.O000000000O0O.O000000000000[0], this.O000000000O0O.O000000000000[1], this.O000000000O0O.O000000000000[2], this.O000000000O0O.O000000000000[3]
         );
         GL11.glScissor(
            this.O000000000O0O.O000000000000O[0],
            this.O000000000O0O.O000000000000O[1],
            this.O000000000O0O.O000000000000O[2],
            this.O000000000O0O.O000000000000O[3]
         );
      }

      this.O000000000O0O = null;
      this.O000000000O00O = 0;
      this.O000000000O000.clear();
   }

   private void O0000000000000(int i, int j) {
      if (this.O0000000000OO) {
         ARBInstancedArrays.glVertexAttribDivisorARB(i, j);
      } else {
         GL33.glVertexAttribDivisor(i, j);
      }
   }

   private static void O00000000(int i, boolean bl) {
      if (bl) {
         GL11.glEnable(i);
      } else {
         GL11.glDisable(i);
      }
   }

   private static void O000000000000O(int i, int j) {
      float var2 = (j >>> 24 & 0xFF) / 255.0F;
      float var3 = (j >>> 16 & 0xFF) / 255.0F;
      float var4 = (j >>> 8 & 0xFF) / 255.0F;
      float var5 = (j & 0xFF) / 255.0F;
      GL20.glUniform4f(i, var3, var4, var5, var2);
   }

   public void O000000000() {
      if (this.O000000000O00O > 0) {
         if (this.O000000000O0O0 > 0 && this.O000000000O0OO > 0) {
            this.O000000000O000.limit(this.O000000000O00O * 144);
            this.O000000000O000.position(0);
            int var1 = GL11.glGetInteger(34229);
            int var2 = GL11.glGetInteger(35725);
            GL30.glBindVertexArray(this.O000000000O);
            this.O0000000000OOO.O00000000();
            GL20.glUniform2f(this.O00000000O00OO, this.O000000000O0O0, this.O000000000O0OO);
            GL11.glViewport(0, 0, this.O000000000O0O0, this.O000000000O0OO);
            this.O0000000000O0O();
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glColorMask(true, true, true, true);
            if (this.O0000000000O00) {
               GL15.glBindBuffer(37074, this.O000000000O0);
               GL15.glBufferSubData(37074, 0L, this.O000000000O000);
               GL43.glBindBufferBase(37074, 0, this.O000000000O0);
            } else {
               GL15.glBindBuffer(34962, this.O000000000O00);
               GL15.glBufferSubData(34962, 0L, this.O000000000O000);
               GL15.glBindBuffer(34962, 0);
            }

            int var3 = GL11.glGetInteger(34016);
            int var4 = this.O00000000O00O0;

            for (int var5 = 0; var5 < var4; var5++) {
               GL13.glActiveTexture(33984 + var5);
               this.O00000000O00O[var5] = GL11.glGetInteger(32873);
               int var6 = this.O00000000O000O[var5];
               GL11.glBindTexture(3553, var6);
            }

            int var7 = Math.max(0, this.O000000000O00O) * 2;
            if (var7 > 0) {
               O0000O00OO0O.O00000000().O00000000(var7);
            }

            if (this.O0000000000O00) {
               GL11.glDrawArrays(4, 0, this.O000000000O00O * 6);
            } else if (this.O0000000000OO0) {
               ARBDrawInstanced.glDrawArraysInstancedARB(4, 0, 6, this.O000000000O00O);
            } else {
               GL31.glDrawArraysInstanced(4, 0, 6, this.O000000000O00O);
            }

            for (int var8 = 0; var8 < var4; var8++) {
               GL13.glActiveTexture(33984 + var8);
               GL11.glBindTexture(3553, this.O00000000O00O[var8]);
            }

            GL13.glActiveTexture(var3);
            GL30.glBindVertexArray(var1);
            GL20.glUseProgram(var2);
            this.O000000000O00O = 0;
            this.O000000000O000.clear();
            this.O000000000000O();
         } else {
            this.O000000000O00O = 0;
            this.O000000000O000.clear();
            this.O000000000000O();
         }
      }
   }

   public void O00000000(boolean bl) {
      this.O000000O000OOO = bl;
   }

   public void O0000000000() {
      this.O0000000000O0O();
   }

   private void O0000000000O0O() {
      GL11.glEnable(3042);
      if (this.O000000O000OOO) {
         GL14.glBlendFuncSeparate(1, 1, 1, 771);
      } else {
         GL14.glBlendFuncSeparate(1, 771, 1, 771);
      }
   }

   public void O000000000(boolean bl) {
      this.O000000000OO00 = bl;
      if (!bl) {
         this.O00000000O = 0.0F;
         this.O00000000O0 = 0.0F;
         this.O00000000O00 = 0.0F;
         this.O00000000O000 = 0.0F;
      }
   }

   public void O00000000(int i, int j, int k, int l, float f, float g, float h, float m) {
      this.O000000000OO0O = i;
      this.O000000000OOO = j;
      this.O000000000OOO0 = k;
      this.O000000000OOOO = l;
      this.O00000000O = f;
      this.O00000000O0 = g;
      this.O00000000O00 = h;
      this.O00000000O000 = m;
   }

   public void O00000000(float[] fs) {
   }

   public void O00000000(float f, float g) {
      if (!Float.isFinite(f) || !Float.isFinite(g)) {
         throw new IllegalArgumentException("Blur capture scale must be finite");
      } else if (!(f <= 0.0F) && !(g <= 0.0F)) {
         this.O00000000OO00 = f;
         this.O00000000OO000 = g;
      } else {
         throw new IllegalArgumentException("Blur capture scale must be positive");
      }
   }

   private void O00000000(
      int i,
      float f,
      float g,
      float h,
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
      float[] fs,
      float t,
      float u,
      float v,
      float w,
      int x,
      float y,
      float z,
      int aa
   ) {
      if (this.O000000000O00O >= 4096) {
         throw new IllegalStateException("Instance capacity exceeded without prior ensureInstanceCapacity call");
      } else {
         int var24 = this.O000000000O00O * 144;
         this.O000000000O000.position(var24);
         O00000000(this.O000000000O000, fs, f, g, h, j);
         int var25 = this.O000000000OO00 ? this.O000000000OO0O : 0;
         int var26 = this.O000000000OO00 ? this.O000000000OOO : 0;
         int var27 = this.O000000000OO00 ? this.O000000000OOO0 : this.O000000000O0O0;
         int var28 = this.O000000000OO00 ? this.O000000000OOOO : this.O000000000O0OO;
         float var29 = this.O000000000OO00 ? this.O00000000O : 0.0F;
         float var30 = this.O000000000OO00 ? this.O00000000O0 : 0.0F;
         float var31 = this.O000000000OO00 ? this.O00000000O00 : 0.0F;
         float var32 = this.O000000000OO00 ? this.O00000000O000 : 0.0F;
         this.O000000000O000.putInt(var25);
         this.O000000000O000.putInt(var26);
         this.O000000000O000.putInt(var27);
         this.O000000000O000.putInt(var28);
         this.O000000000O000.putFloat(var29);
         this.O000000000O000.putFloat(var30);
         this.O000000000O000.putFloat(var31);
         this.O000000000O000.putFloat(var32);
         this.O000000000O000.putFloat(f);
         this.O000000000O000.putFloat(g);
         this.O000000000O000.putFloat(h);
         this.O000000000O000.putFloat(j);
         this.O000000000O000.putInt(O00000000(k));
         this.O000000000O000.putInt(O00000000(l));
         this.O000000000O000.putInt(O00000000(m));
         this.O000000000O000.putInt(O00000000(n));
         float var33 = O00000000(o);
         float var34 = O00000000(p);
         float var35 = O00000000(q);
         float var36 = O00000000(r);
         this.O000000000O000.putFloat(var33);
         this.O000000000O000.putFloat(var34);
         this.O000000000O000.putFloat(var35);
         this.O000000000O000.putFloat(var36);
         this.O000000000O000.putFloat(t);
         this.O000000000O000.putFloat(u);
         this.O000000000O000.putFloat(v);
         this.O000000000O000.putFloat(w);
         int var37 = i;
         if (i == 1 || i == 2) {
            int var38 = Math.max(0, Math.min(255, Math.round(s)));
            var37 = i | var38 << 2;
         }

         if (i == 2) {
            float var44 = y % 360.0F;
            if (var44 < 0.0F) {
               var44 += 360.0F;
            }

            int var39 = Math.max(0, Math.min(255, Math.round(var44 / 360.0F * 255.0F)));
            float var40 = Math.max(0.0F, Math.min(1.0F, z));
            int var41 = Math.max(0, Math.min(255, Math.round(var40 * 255.0F)));
            var37 |= var39 << 10;
            var37 |= var41 << 18;
         }

         if (i == 3 && s > 0.0F) {
            var37 |= 4;
         }

         var37 |= aa;
         this.O000000000O000.putInt(var37);
         this.O000000000O000.putInt(x);
         this.O000000000O000.putInt(0);
         this.O000000000O000.putInt(0);
         this.O000000000O00O++;
      }
   }

   private static void O00000000(ByteBuffer byteBuffer, float[] fs, float f, float g, float h, float i) {
      float[] var6 = fs != null && fs.length >= 6 ? fs : O0000000000O0;
      float var9 = f + h;
      float var10 = g + i;
      O00000000(byteBuffer, var6, f, g);
      O00000000(byteBuffer, var6, var9, g);
      O00000000(byteBuffer, var6, var9, var10);
      O00000000(byteBuffer, var6, f, var10);
   }

   private static void O00000000(ByteBuffer byteBuffer, float[] fs, float f, float g) {
      float var4 = fs[0] * f + fs[1] * g + fs[2];
      float var5 = fs[3] * f + fs[4] * g + fs[5];
      byteBuffer.putFloat(var4);
      byteBuffer.putFloat(var5);
   }

   private static float O00000000(float[] fs, float f, float g) {
      return fs[0] * f + fs[1] * g + fs[2];
   }

   private static float O000000000(float[] fs, float f, float g) {
      return fs[3] * f + fs[4] * g + fs[5];
   }

   private static float O00000000(float f) {
      if (!Float.isFinite(f)) {
         return 0.0F;
      } else {
         return f <= 0.0F ? 0.0F : f;
      }
   }

   private void O00000000(
      int i, float f, float g, float h, float j, int k, float l, float m, float[] fs, float n, float o, float p, float q, int r, float s, float t
   ) {
      this.O00000000(i, f, g, h, j, k, k, k, k, l, l, l, l, m, fs, n, o, p, q, r, s, t, 0);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, int n, float[] fs) {
      this.O0000000000000();
      this.O00000000(0, f, g, h, i, n, n, n, n, j, k, l, m, 0.0F, fs, 0.0F, 0.0F, 1.0F, 1.0F, -1, 0.0F, 1.0F, 0);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, int n, float o, float[] fs) {
      this.O0000000000000();
      this.O00000000(1, f, g, h, i, n, n, n, n, j, k, l, m, o, fs, 0.0F, 0.0F, 1.0F, 1.0F, -1, 0.0F, 1.0F, 0);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, int n, int o, int p, int q, float[] fs) {
      this.O0000000000000();
      this.O00000000(0, f, g, h, i, n, o, p, q, j, k, l, m, 0.0F, fs, 0.0F, 0.0F, 1.0F, 1.0F, -1, 0.0F, 1.0F, 0);
   }

   public void O00000000(float f, float g, float h, float i, float j, int k, float[] fs) {
      this.O00000000(f, g, h, i, j, 0.0F, k, fs);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, int l, float[] fs) {
      float var9 = h * 2.0F;
      this.O0000000000000();
      this.O00000000(2, f - h, g - h, var9, var9, l, 0.0F, k, fs, 0.0F, 0.0F, 1.0F, 1.0F, -1, i, j);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, float n, float o, int p, float[] fs) {
      if (!(h <= 0.0F) && !(i <= 0.0F)) {
         float var13 = n > 0.0F ? n : 0.0F;
         float var14 = o > 0.0F ? o : 0.0F;
         float var15 = var14 + var13 * 3.0F;
         float var16 = f - var15;
         float var17 = g - var15;
         float var18 = h + var15 * 2.0F;
         float var19 = i + var15 * 2.0F;
         if (!(var18 <= 0.0F) && !(var19 <= 0.0F)) {
            this.O0000000000000();
            this.O00000000(0, var16, var17, var18, var19, p, p, p, p, j, k, l, m, 0.0F, fs, h, i, Math.max(var13, 0.001F), var14, 0, 0.0F, 1.0F, 67108864);
         }
      }
   }

   public void O00000000(int i, float f, float g, float h, float j, float k, float l, float m, float n, int o, float[] fs) {
      this.O0000000000000();
      int var12 = this.O00000000000(i);
      this.O00000000(3, f, g, h, j, o, 0.0F, 0.0F, fs, k, l, m, n, var12, 0.0F, 1.0F);
   }

   public void O00000000(int i, float f, float g, float h, float j, float k, float l, float m, float n, float o, int p, float[] fs) {
      this.O0000000000000();
      int var13 = this.O00000000000(i);
      this.O00000000(3, f, g, h, j, p, o, 0.0F, fs, k, l, m, n, var13, 0.0F, 1.0F);
   }

   public void O000000000(int i, float f, float g, float h, float j, float k, float l, float m, float n, int o, float[] fs) {
      this.O00000000(i, f, g, h, j, k, l, m, n, o, fs, false);
   }

   public void O00000000(int i, float f, float g, float h, float j, float k, float l, float m, float n, int o, float[] fs, boolean bl) {
      this.O0000000000000();
      int var13 = this.O00000000000(i);
      int var14 = bl ? 64 : 0;
      this.O00000000(3, f, g, h, j, o, o, o, o, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, fs, k, l, m, n, var13, 0.0F, 1.0F, var14);
   }

   public void O000000000(int i, float f, float g, float h, float j, float k, float l, float m, float n, float o, int p, float[] fs) {
      this.O00000000(i, f, g, h, j, k, l, m, n, o, p, fs, false);
   }

   public void O00000000(int i, float f, float g, float h, float j, float k, float l, float m, float n, float o, int p, float[] fs, boolean bl) {
      this.O0000000000000();
      int var14 = this.O00000000000(i);
      int var15 = bl ? 64 : 0;
      this.O00000000(3, f, g, h, j, p, p, p, p, o, o, o, o, 1.0F, fs, k, l, m, n, var14, 0.0F, 1.0F, var15);
   }

   public void O0000000000(int i, float f, float g, float h, float j, float k, float l, float m, float n, float o, int p, float[] fs) {
      this.O0000000000000();
      this.O000000000(i, f, g, h, j, k, l, m, n, o, p, fs, false);
   }

   public void O000000000(int i, float f, float g, float h, float j, float k, float l, float m, float n, float o, int p, float[] fs, boolean bl) {
      this.O00000000(i, f, g, h, j, k, l, m, n, o, o, o, o, p, fs, bl);
   }

   public void O00000000(
      int i, float f, float g, float h, float j, float k, float l, float m, float n, float o, float p, float q, float r, int s, float[] fs, boolean bl
   ) {
      this.O0000000000000();
      int var17 = this.O00000000000(i);
      byte var18 = 8;
      if (bl) {
         var18 |= 32;
      }

      this.O00000000(3, f, g, h, j, s, s, s, s, o, p, q, r, 1.0F, fs, k, l, m, n, var17, 0.0F, 1.0F, var18);
   }

   public void O0000000000(int i, float f, float g, float h, float j, float k, float l, float m, float n, int o, float[] fs) {
      this.O0000000000000();
      int var12 = this.O00000000000(i);
      byte var13 = 8;
      this.O00000000(3, f, g, h, j, o, o, o, o, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, fs, k, l, m, n, var12, 0.0F, 1.0F, var13);
   }

   public void O00000000000(int i, float f, float g, float h, float j, float k, float l, float m, float n, float o, int p, float[] fs) {
      if (i > 0) {
         this.O0000000000000();
         int var13 = this.O00000000000(i);
         float var14 = f > 0.0F ? f : 0.001F;
         this.O00000000(3, g, h, j, k, p, p, p, p, var14, var14, var14, var14, 0.0F, fs, l, m, n, o, var13, 0.0F, 1.0F, 16);
      }
   }

   private int O00000000000(int i) {
      int var2 = this.O00000000O0000.get(i);
      if (var2 >= 0) {
         return var2;
      } else {
         if (this.O00000000O00O0 >= 16) {
            this.O000000000();
            this.O000000000000O();
         }

         int var3 = this.O00000000O00O0++;
         this.O00000000O000O[var3] = i;
         this.O00000000O0000.put(i, var3);
         return var3;
      }
   }

   public void O00000000(ByteBuffer byteBuffer, int i) {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int O00000000(int i, int j, ByteBuffer byteBuffer) {
      if (i <= 0 || j <= 0) {
         throw new IllegalArgumentException("Invalid MSDF texture dimensions: " + i + "x" + j);
      } else if (byteBuffer == null) {
         throw new IllegalArgumentException("data");
      } else {
         int var4 = GL11.glGetInteger(34016);
         int var5 = GL11.glGetInteger(32873);
         int var6 = GL11.glGetInteger(3317);
         int var7 = GL11.glGetInteger(3314);
         int var8 = GL11.glGenTextures();
         boolean var12 = false /* VF: Semaphore variable */;

         int var9;
         try {
            var12 = true;
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, var8);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL12.glTexParameteri(3553, 33084, 0);
            GL12.glTexParameteri(3553, 33085, 0);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            GL11.glPixelStorei(3317, 1);
            GL12.glPixelStorei(3314, 0);
            byteBuffer.rewind();
            GL11.glTexImage2D(3553, 0, 32856, i, j, 0, 6408, 5121, byteBuffer);
            var9 = var8;
            var12 = false;
         } finally {
            if (var12) {
               GL12.glPixelStorei(3314, var7);
               GL11.glPixelStorei(3317, var6);
               GL11.glBindTexture(3553, var5);
               GL13.glActiveTexture(var4);
            }
         }

         GL12.glPixelStorei(3314, var7);
         GL11.glPixelStorei(3317, var6);
         GL11.glBindTexture(3553, var5);
         GL13.glActiveTexture(var4);
         return var9;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int O00000000000(int i, int j) {
      int var3 = GL11.glGetInteger(34016);
      int var4 = GL11.glGetInteger(32873);
      int var5 = GL11.glGetInteger(3317);
      int var6 = GL11.glGetInteger(3314);
      int var7 = GL11.glGenTextures();
      boolean var11 = false /* VF: Semaphore variable */;

      int var8;
      try {
         var11 = true;
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, var7);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL12.glTexParameteri(3553, 33084, 0);
         GL12.glTexParameteri(3553, 33085, 0);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         GL11.glTexParameteri(3553, 36418, 6403);
         GL11.glTexParameteri(3553, 36419, 6403);
         GL11.glTexParameteri(3553, 36420, 6403);
         GL11.glTexParameteri(3553, 36421, 6403);
         GL11.glPixelStorei(3317, 1);
         GL12.glPixelStorei(3314, 0);
         O0000O00O0OOOO.O00000000(33321, i, j, 6403, 5121);
         var8 = var7;
         var11 = false;
      } finally {
         if (var11) {
            GL12.glPixelStorei(3314, var6);
            GL11.glPixelStorei(3317, var5);
            GL11.glBindTexture(3553, var4);
            GL13.glActiveTexture(var3);
         }
      }

      GL12.glPixelStorei(3314, var6);
      GL11.glPixelStorei(3317, var5);
      GL11.glBindTexture(3553, var4);
      GL13.glActiveTexture(var3);
      return var8;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(int i, int j, int k, int l, int m, ByteBuffer byteBuffer) {
      int var7 = GL11.glGetInteger(34016);
      int var8 = GL11.glGetInteger(32873);
      int var9 = GL11.glGetInteger(3317);
      int var10 = GL11.glGetInteger(3314);
      boolean var13 = false /* VF: Semaphore variable */;

      try {
         var13 = true;
         byteBuffer.order(ByteOrder.nativeOrder());
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, i);
         GL11.glPixelStorei(3317, 1);
         GL12.glPixelStorei(3314, 0);
         GL11.glTexSubImage2D(3553, 0, j, k, l, m, 6403, 5121, byteBuffer);
         var13 = false;
      } finally {
         if (var13) {
            GL12.glPixelStorei(3314, var10);
            GL11.glPixelStorei(3317, var9);
            GL11.glBindTexture(3553, var8);
            GL13.glActiveTexture(var7);
         }
      }

      GL12.glPixelStorei(3314, var10);
      GL11.glPixelStorei(3317, var9);
      GL11.glBindTexture(3553, var8);
      GL13.glActiveTexture(var7);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(int i, int j, int k, int l, int m, ByteBuffer byteBuffer, int n) {
      int var8 = GL11.glGetInteger(34016);
      int var9 = GL11.glGetInteger(32873);
      int var10 = GL11.glGetInteger(3317);
      int var11 = GL11.glGetInteger(3314);
      boolean var14 = false /* VF: Semaphore variable */;

      try {
         var14 = true;
         byteBuffer.order(ByteOrder.nativeOrder());
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, i);
         GL11.glPixelStorei(3317, 1);
         GL12.glPixelStorei(3314, n);
         GL11.glTexSubImage2D(3553, 0, j, k, l, m, 6403, 5121, byteBuffer);
         var14 = false;
      } finally {
         if (var14) {
            GL12.glPixelStorei(3314, var11);
            GL11.glPixelStorei(3317, var10);
            GL11.glBindTexture(3553, var9);
            GL13.glActiveTexture(var8);
         }
      }

      GL12.glPixelStorei(3314, var11);
      GL11.glPixelStorei(3317, var10);
      GL11.glBindTexture(3553, var9);
      GL13.glActiveTexture(var8);
   }

   private void O00000000(int i, int j, boolean bl) {
      if (i > 0 && j > 0) {
         int var4 = bl ? this.O00000000O0O0 : this.O00000000OO00O;
         int var5 = bl ? this.O00000000O0OO : this.O00000000OO0OO;
         int var6 = bl ? this.O00000000O0O00 : this.O00000000OO0O;
         int var7 = bl ? this.O00000000O0O0O : this.O00000000OO0O0;
         if (var4 == 0 || i != var6 || j != var7) {
            if (var4 != 0) {
               GL11.glDeleteTextures(var4);
               boolean var9 = false;
            }

            if (var5 != 0) {
               GL30.glDeleteFramebuffers(var5);
               boolean var11 = false;
            }

            var4 = GL11.glGenTextures();
            GL11.glBindTexture(3553, var4);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            O0000O00O0OOOO.O00000000(32856, i, j, 6408, 5121);
            GL11.glBindTexture(3553, 0);
            var5 = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer(36160, var5);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, var4, 0);
            GL11.glDrawBuffer(36064);
            int var8 = GL30.glCheckFramebufferStatus(36160);
            GL30.glBindFramebuffer(36160, 0);
            if (var8 != 36053) {
               GL30.glDeleteFramebuffers(var5);
               GL11.glDeleteTextures(var4);
               throw new IllegalStateException("Capture FBO incomplete: status=" + var8);
            } else {
               if (bl) {
                  this.O00000000O0O0 = var4;
                  this.O00000000O0OO = var5;
                  this.O00000000O0O00 = i;
                  this.O00000000O0O0O = j;
               } else {
                  this.O00000000OO00O = var4;
                  this.O00000000OO0OO = var5;
                  this.O00000000OO0O = i;
                  this.O00000000OO0O0 = j;
               }
            }
         }
      } else {
         if (bl) {
            this.O0000000000(true);
         } else {
            this.O0000000000(false);
         }
      }
   }

   private void O00000000(RenderEngine.W372 o0000000000, int i, int j) {
      if (o0000000000 != null) {
         if (i <= 0 || j <= 0) {
            this.O00000000(o0000000000);
         } else if (o0000000000.O000000000 == 0 || o0000000000.O00000000 == 0 || o0000000000.O0000000000 != i || o0000000000.O00000000000 != j) {
            this.O00000000(o0000000000);
            o0000000000.O0000000000 = i;
            o0000000000.O00000000000 = j;
            o0000000000.O000000000 = GL11.glGenTextures();
            GL11.glBindTexture(3553, o0000000000.O000000000);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            O0000O00O0OOOO.O00000000(32856, i, j, 6408, 5121);
            GL11.glBindTexture(3553, 0);
            o0000000000.O00000000 = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer(36160, o0000000000.O00000000);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, o0000000000.O000000000, 0);
            GL11.glDrawBuffer(36064);
            GL11.glReadBuffer(36064);
            int var4 = GL30.glCheckFramebufferStatus(36160);
            GL30.glBindFramebuffer(36160, 0);
            if (var4 != 36053) {
               this.O00000000(o0000000000);
               throw new IllegalStateException("Layer framebuffer incomplete: status=" + var4);
            }
         }
      }
   }

   private void O00000000(RenderEngine.W372 o0000000000) {
      if (o0000000000 != null) {
         if (o0000000000.O00000000 != 0) {
            GL30.glDeleteFramebuffers(o0000000000.O00000000);
            o0000000000.O00000000 = 0;
         }

         if (o0000000000.O000000000 != 0) {
            GL11.glDeleteTextures(o0000000000.O000000000);
            o0000000000.O000000000 = 0;
         }

         o0000000000.O0000000000 = 0;
         o0000000000.O00000000000 = 0;
      }
   }

   private void O0000000000OO() {
      for (RenderEngine.W372 var2 : this.O0000000O0O) {
         this.O00000000(var2);
      }

      this.O0000000O0O.clear();
      this.O0000000O0O0 = 0;
   }

   private void O00000000000O(int i, int j) {
      this.O00000000(i, j, this.O00000000OO00, this.O00000000OO000);
   }

   private void O00000000(int i, int j, float f, float g) {
      if (i <= 0 || j <= 0) {
         this.O000000000O();
      } else if (!Float.isFinite(f) || !Float.isFinite(g)) {
         throw new IllegalArgumentException("Blur capture scale must be finite");
      } else if (!(f <= 0.0F) && !(g <= 0.0F)) {
         int var5 = Math.max(1, i);
         int var6 = Math.max(1, j);
         int var7 = Math.max(1, Math.round(var5 * f));
         int var8 = Math.max(1, Math.round(var6 * g));
         if (this.O00000000O0OO0 == 0 || var7 != this.O00000000O0OOO || var8 != this.O00000000OO) {
            if (this.O00000000O0OO0 != 0) {
               GL11.glDeleteTextures(this.O00000000O0OO0);
               this.O00000000O0OO0 = 0;
            }

            if (this.O00000000OO0 != 0) {
               GL30.glDeleteFramebuffers(this.O00000000OO0);
               this.O00000000OO0 = 0;
            }

            this.O00000000O0OO0 = GL11.glGenTextures();
            GL11.glBindTexture(3553, this.O00000000O0OO0);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            O0000O00O0OOOO.O00000000(32856, var7, var8, 6408, 5121);
            GL11.glBindTexture(3553, 0);
            this.O00000000OO0 = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer(36160, this.O00000000OO0);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, this.O00000000O0OO0, 0);
            GL11.glDrawBuffer(36064);
            int var9 = GL30.glCheckFramebufferStatus(36160);
            GL30.glBindFramebuffer(36160, 0);
            if (var9 != 36053) {
               GL30.glDeleteFramebuffers(this.O00000000OO0);
               GL11.glDeleteTextures(this.O00000000O0OO0);
               this.O00000000OO0 = 0;
               this.O00000000O0OO0 = 0;
               throw new IllegalStateException("Downscaled capture FBO incomplete: status=" + var9);
            } else {
               this.O00000000O0OOO = var7;
               this.O00000000OO = var8;
            }
         }
      } else {
         throw new IllegalArgumentException("Blur capture scale must be positive");
      }
   }

   public int O00000000(int i, int j, int k, int l) {
      return this.O00000000(i, j, k, l, true);
   }

   public int O00000000(int i, int j, int k, int l, boolean bl) {
      if (k > 0 && l > 0 && this.O000000000O0O0 > 0 && this.O000000000O0OO > 0) {
         this.O00000000(k, l, bl);
         int var6 = bl ? this.O00000000O0OO : this.O00000000OO0OO;
         int var7 = bl ? this.O00000000O0O0 : this.O00000000OO00O;
         if (var6 != 0 && var7 != 0) {
            int var8 = GL11.glGetInteger(36006);
            int var9 = Math.max(0, Math.min(i, this.O000000000O0O0));
            int var10 = Math.max(0, Math.min(this.O000000000O0OO, this.O000000000O0OO - j - l));
            int var11 = Math.min(k, this.O000000000O0O0 - var9);
            int var12 = Math.min(l, this.O000000000O0OO - var10);
            if (var11 > 0 && var12 > 0) {
               O0000O00O0OOO0.W373 var13 = O0000O00O0OOO0.O00000000();

               try {
                  boolean var14 = GL11.glIsEnabled(3089);
                  boolean var15 = GL11.glIsEnabled(36281);
                  if (var14) {
                     GL11.glDisable(3089);
                  }

                  if (var15) {
                     GL11.glDisable(36281);
                  }

                  GL30.glBindFramebuffer(36008, var8);
                  GL11.glReadBuffer(var8 == 0 ? 1029 : '賠');
                  GL30.glBindFramebuffer(36009, var6);
                  GL11.glDrawBuffer(36064);
                  GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
                  GL11.glClear(16384);
                  GL30.glBlitFramebuffer(var9, var10, var9 + var11, var10 + var12, 0, 0, k, l, 16384, 9729);
                  if (var14) {
                     GL11.glEnable(3089);
                  }

                  if (var15) {
                     GL11.glEnable(36281);
                  }
               } finally {
                  O0000O00O0OOO0.O00000000(var13);
               }

               return var7;
            } else {
               return 0;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public void O00000000(int i, int j, float f) {
      if (i > 0 && j > 0) {
         float var4 = 1.0F;
         float var5 = 1.0F;
         float var6 = this.O00000000OO00;
         float var7 = this.O00000000OO000;
         float var8 = this.O000000O00000.O000000000();
         if (f > var8) {
            float var9 = this.O000000O00000.O00000000();
            float var10 = Math.max(f, var9);
            float var11 = var8 / var10;
            var11 = Math.max(var11, 0.2F);
            var4 = Math.min(var4, var11);
            var5 = Math.min(var5, var11);
         }

         var4 = Math.max(var4, var6);
         var5 = Math.max(var5, var7);
         this.O00000000(i, j, var4, var5);
         if (this.O00000000O0OO0 != 0 && this.O00000000OO0 != 0) {
            float var25 = (float)this.O00000000O0OOO / Math.max(1, i);
            float var26 = (float)this.O00000000OO / Math.max(1, j);
            O0000O00O0OOO0.W373 var28 = O0000O00O0OOO0.O00000000();

            try {
               boolean var12 = GL11.glIsEnabled(3089);
               boolean var13 = GL11.glIsEnabled(36281);
               if (var12) {
                  GL11.glDisable(3089);
               }

               if (var13) {
                  GL11.glDisable(36281);
               }

               boolean var14 = false;
               MinecraftClient var15 = MinecraftClient.getInstance();
               if (var15 != null && var15.getWindow() != null && !var15.getWindow().hasZeroWidthOrHeight()) {
                  Framebuffer var16 = var15.getFramebuffer();
                  if (var16 != null && var16.getColorAttachment() instanceof GlTexture var18) {
                     int var19 = var18.getGlId();
                     if (var19 > 0) {
                        if (this.O00000000OOO0 == 0) {
                           this.O00000000OOO0 = GL30.glGenFramebuffers();
                        }

                        GL30.glBindFramebuffer(36008, this.O00000000OOO0);
                        GL30.glFramebufferTexture2D(36008, 36064, 3553, var19, 0);
                        GL11.glReadBuffer(36064);
                        var14 = GL30.glCheckFramebufferStatus(36008) == 36053;
                     }
                  }
               }

               if (!var14) {
                  this.O000000O00000O = 0;
                  this.O000000O0000O = 0;
                  this.O000000O0000O0 = 0;
                  this.O000000O0000OO = 1.0F;
                  this.O000000O000O = 1.0F;
                  return;
               }

               GL30.glBindFramebuffer(36009, this.O00000000OO0);
               GL11.glDrawBuffer(36064);
               GL30.glBlitFramebuffer(0, 0, i, j, 0, 0, this.O00000000O0OOO, this.O00000000OO, 16384, 9729);
               if (var12) {
                  GL11.glEnable(3089);
               }

               if (var13) {
                  GL11.glEnable(36281);
               }
            } finally {
               O0000O00O0OOO0.O00000000(var28);
            }

            float var29 = (float)Math.sqrt(Math.max(0.0F, var25) * Math.max(0.0F, var26));
            float var30 = Math.max(0.0F, f) * var29;
            int var31 = this.O000000O00000.O00000000(this.O00000000O0OO0, this.O00000000O0OOO, this.O00000000OO, var30);
            if (var31 == 0) {
               this.O000000O00000O = 0;
               this.O000000O0000O = 0;
               this.O000000O0000O0 = 0;
               this.O000000O0000OO = 1.0F;
               this.O000000O000O = 1.0F;
            } else {
               this.O000000O00000O = var31;
               this.O000000O0000O = this.O00000000O0OOO;
               this.O000000O0000O0 = this.O00000000OO;
               this.O000000O0000OO = var25;
               this.O000000O000O = var26;
            }
         } else {
            this.O000000O00000O = 0;
            this.O000000O0000O = 0;
            this.O000000O0000O0 = 0;
            this.O000000O0000OO = 1.0F;
            this.O000000O000O = 1.0F;
         }
      } else {
         this.O000000O00000O = 0;
         this.O000000O0000O = 0;
         this.O000000O0000O0 = 0;
         this.O000000O0000OO = 1.0F;
         this.O000000O000O = 1.0F;
      }
   }

   public boolean O00000000(int i, int j, int k, int l, float f) {
      if (k > 0 && l > 0) {
         int var6 = this.O00000000(i, j, k, l, false);
         if (var6 <= 0) {
            this.O000000O000O0 = 0;
            this.O000000O000OO = 0;
            this.O000000O000OO0 = 0;
            this.O000000O000O00 = 0;
            this.O000000O000O0O = 0;
            return false;
         } else {
            int var7 = this.O000000O000000.O00000000(var6, k, l, f);
            this.O000000O000O0 = var7;
            this.O000000O000OO = k;
            this.O000000O000OO0 = l;
            this.O000000O000O00 = i;
            this.O000000O000O0O = j;
            return var7 != 0;
         }
      } else {
         this.O000000O000O0 = 0;
         this.O000000O000OO = 0;
         this.O000000O000OO0 = 0;
         this.O000000O000O00 = 0;
         this.O000000O000O0O = 0;
         return false;
      }
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float[] fs) {
      this.O00000000(f, g, h, i, j, j, j, j, k, fs);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, float n, float[] fs) {
      if (this.O000000O00000O != 0) {
         this.O0000000000000();
         int var11 = (int)(Math.max(0.0F, Math.min(1.0F, n)) * 255.0F) << 24 | 16777215;
         float var12 = this.O000000O0000O > 0 ? this.O000000O0000OO / this.O000000O0000O : 0.0F;
         float var13 = this.O000000O0000O0 > 0 ? -this.O000000O000O / this.O000000O0000O0 : 0.0F;
         float var14 = 0.0F;
         float var15 = this.O000000O0000O0 > 0 ? 1.0F : 0.0F;
         this.O00000000(this.O000000O00000O, f, g, h, i, var12, var13, var14, var15, j, k, l, m, var11, fs, true);
      }
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float[] fs, int l, int m, int n, int o) {
      if (this.O000000O000O0 != 0) {
         if (n > 0 && o > 0) {
            if (this.O000000O000OO == n && this.O000000O000OO0 == o && this.O000000O000O00 == l && this.O000000O000O0O == m) {
               this.O0000000000000();
               int var12 = (int)(Math.max(0.0F, Math.min(1.0F, k)) * 255.0F) << 24 | 16777215;
               float var13 = 0.0F;
               float var14 = 1.0F;
               float var15 = 1.0F;
               float var16 = 0.0F;
               this.O000000000(this.O000000O000O0, f, g, h, i, var13, var14, var15, var16, j, var12, fs, false);
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public RenderEngine.W370 O00000000000() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1 != null && var1.getWindow() != null && !var1.getWindow().hasZeroWidthOrHeight()) {
         Framebuffer var2 = var1.getFramebuffer();
         if (var2 == null) {
            return new RenderEngine.W370(0, 0, 0, 0);
         } else if (!(var2.getColorAttachment() instanceof GlTexture var4)) {
            return new RenderEngine.W370(0, 0, 0, 0);
         } else {
            int var5 = var4.getGlId();
            if (var5 <= 0) {
               return new RenderEngine.W370(0, 0, 0, 0);
            } else {
               int var6 = 0;
               if (var2.getDepthAttachment() instanceof GlTexture var8) {
                  var6 = var8.getGlId();
               }

               int var17 = var1.getWindow().getFramebufferWidth();
               int var9 = var1.getWindow().getFramebufferHeight();
               if (var17 > 0 && var9 > 0 && var2.textureWidth > 0 && var2.textureHeight > 0) {
                  this.O00000000OOO.O00000000(var17, var9);
                  if (this.O00000000OOO.O00000000 != 0 && this.O00000000OOO.O000000000 != 0 && this.O00000000OOO.O0000000000 != 0) {
                     O0000O00O0OOO0.W373 var10 = O0000O00O0OOO0.O00000000();
                     boolean var15 = false /* VF: Semaphore variable */;

                     RenderEngine.W370 var18;
                     label110: {
                        try {
                           var15 = true;
                           GL11.glDisable(3089);
                           GL11.glDisable(2884);
                           GL11.glDisable(3042);
                           GL11.glDisable(2929);
                           GL11.glDisable(36281);
                           if (this.O00000000OOO0 == 0) {
                              this.O00000000OOO0 = GL30.glGenFramebuffers();
                           }

                           GL30.glBindFramebuffer(36008, this.O00000000OOO0);
                           GL30.glFramebufferTexture2D(36008, 36064, 3553, var5, 0);
                           if (var6 > 0) {
                              GL30.glFramebufferTexture2D(36008, 36096, 3553, var6, 0);
                           } else {
                              GL30.glFramebufferTexture2D(36008, 36096, 3553, 0, 0);
                           }

                           int var11 = GL30.glCheckFramebufferStatus(36008);
                           if (var11 != 36053) {
                              var18 = new RenderEngine.W370(0, 0, 0, 0);
                              var15 = false;
                              break label110;
                           }

                           GL30.glBindFramebuffer(36009, this.O00000000OOO.O00000000);
                           GL11.glReadBuffer(36064);
                           GL11.glDrawBuffer(36064);
                           short var12 = 16384;
                           if (var6 > 0) {
                              var12 |= 256;
                           }

                           GL30.glBlitFramebuffer(0, 0, var17, var9, 0, 0, var17, var9, var12, 9728);
                           var15 = false;
                        } finally {
                           if (var15) {
                              O0000O00O0OOO0.O00000000(var10);
                           }
                        }

                        O0000O00O0OOO0.O00000000(var10);
                        return new RenderEngine.W370(this.O00000000OOO.O000000000, this.O00000000OOO.O0000000000, var17, var9);
                     }

                     O0000O00O0OOO0.O00000000(var10);
                     return var18;
                  } else {
                     return new RenderEngine.W370(0, 0, 0, 0);
                  }
               } else {
                  return new RenderEngine.W370(0, 0, 0, 0);
               }
            }
         }
      } else {
         return new RenderEngine.W370(0, 0, 0, 0);
      }
   }

   public void O00000000(int i, int j, int k) {
      if (i > 0 && j > 0 && k > 0) {
         this.O00000000000O();
         O0000O00OO0 var4 = this.O00000000000O0();
         O0000O00O0OOO0.W373 var5 = O0000O00O0OOO0.O00000000();

         try {
            GL30.glBindFramebuffer(36160, 0);
            GL11.glViewport(0, 0, j, k);
            GL11.glDisable(3089);
            GL11.glDisable(2884);
            GL11.glDisable(2929);
            GL11.glDisable(3042);
            GL11.glDisable(36281);
            var4.O00000000();
            if (this.O00000000OOOO0 >= 0) {
               GL20.glUniform1i(this.O00000000OOOO0, 0);
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, i);
            GL30.glBindVertexArray(this.O00000000OOO00);
            O0000O00OO0O.O00000000().O00000000(2);
            GL11.glDrawArrays(4, 0, 6);
            GL30.glBindVertexArray(0);
         } finally {
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            GL20.glUseProgram(0);
            O0000O00O0OOO0.O00000000(var5);
         }
      }
   }

   public void O00000000(int i, int j, int k, O0000O00OO0 o0000O00OO0, Runnable runnable, boolean bl) {
      if (i > 0 && j > 0 && k > 0 && o0000O00OO0 != null) {
         this.O00000000000O();
         O0000O00O0OOO0.W373 var7 = O0000O00O0OOO0.O00000000();

         try {
            int var8 = GL11.glGetInteger(36006);
            GL30.glBindFramebuffer(36009, var8);
            GL11.glViewport(0, 0, j, k);
            GL11.glDisable(3089);
            GL11.glDisable(2884);
            GL11.glDisable(2929);
            if (bl) {
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
            } else {
               GL11.glDisable(3042);
            }

            GL11.glDisable(36281);
            o0000O00OO0.O00000000();
            if (runnable != null) {
               runnable.run();
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, i);
            GL30.glBindVertexArray(this.O00000000OOO00);
            O0000O00OO0O.O00000000().O00000000(2);
            GL11.glDrawArrays(4, 0, 6);
            GL30.glBindVertexArray(0);
         } finally {
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            GL20.glUseProgram(0);
            O0000O00O0OOO0.O00000000(var7);
         }
      }
   }

   public void O000000000000(int i, int j) {
      if (!this.O000000O00O) {
         if (i > 0 && j > 0) {
            if (i != this.O000000000OO || j != this.O000000000OO0) {
               this.O000000000OO = i;
               this.O000000000OO0 = j;
               this.O0000000000OO0();
            }
         } else {
            this.O000000000O0O0 = 0;
            this.O000000000O0OO = 0;
            this.O000000000OO = -1;
            this.O000000000OO0 = -1;
            this.O0000000000OO0();
         }
      }
   }

   private void O0000000000OO0() {
      this.O0000000000OOO();
      this.O0000000000(true);
      this.O0000000000(false);
      this.O000000000O();
      this.O00000000(this.O00000000OOOOO);
      this.O0000000000OO();
      this.O00000000OOO.O00000000();
      this.O000000O00000.O00000000000();
      this.O000000O000000.O00000000000();
      if (this.O00000000OOO0 != 0) {
         GL30.glDeleteFramebuffers(this.O00000000OOO0);
         this.O00000000OOO0 = 0;
      }
   }

   private void O0000000000OOO() {
      this.O000000O00000O = 0;
      this.O000000O0000O = 0;
      this.O000000O0000O0 = 0;
      this.O000000O0000OO = 1.0F;
      this.O000000O000O = 1.0F;
      this.O000000O000O0 = 0;
      this.O000000O000O00 = 0;
      this.O000000O000O0O = 0;
      this.O000000O000OO = 0;
      this.O000000O000OO0 = 0;
   }

   private void O0000000000(boolean bl) {
      if (bl) {
         if (this.O00000000O0OO != 0) {
            GL30.glDeleteFramebuffers(this.O00000000O0OO);
            this.O00000000O0OO = 0;
         }

         if (this.O00000000O0O0 != 0) {
            GL11.glDeleteTextures(this.O00000000O0O0);
            this.O00000000O0O0 = 0;
         }

         this.O00000000O0O00 = 0;
         this.O00000000O0O0O = 0;
      } else {
         if (this.O00000000OO0OO != 0) {
            GL30.glDeleteFramebuffers(this.O00000000OO0OO);
            this.O00000000OO0OO = 0;
         }

         if (this.O00000000OO00O != 0) {
            GL11.glDeleteTextures(this.O00000000OO00O);
            this.O00000000OO00O = 0;
         }

         this.O00000000OO0O = 0;
         this.O00000000OO0O0 = 0;
      }
   }

   private void O000000000O() {
      if (this.O00000000OO0 != 0) {
         GL30.glDeleteFramebuffers(this.O00000000OO0);
         this.O00000000OO0 = 0;
      }

      if (this.O00000000O0OO0 != 0) {
         GL11.glDeleteTextures(this.O00000000O0OO0);
         this.O00000000O0OO0 = 0;
      }

      this.O00000000O0OOO = 0;
      this.O00000000OO = 0;
   }

   public void O000000000000() {
      if (!this.O000000O00O) {
         this.O000000O00O = true;
         this.O000000O00000.O0000000000();
         this.O000000O000000.O0000000000();
         this.O00000000OOO.O00000000();
         if (this.O00000000OOO0 != 0) {
            GL30.glDeleteFramebuffers(this.O00000000OOO0);
            this.O00000000OOO0 = 0;
         }

         if (this.O00000000OOO00 != 0) {
            GL30.glDeleteVertexArrays(this.O00000000OOO00);
            this.O00000000OOO00 = 0;
         }

         if (this.O00000000OOO0O != 0) {
            GL15.glDeleteBuffers(this.O00000000OOO0O);
            this.O00000000OOO0O = 0;
         }

         if (this.O0000000O != 0) {
            GL30.glDeleteVertexArrays(this.O0000000O);
            this.O0000000O = 0;
         }

         if (this.O0000000O0 != 0) {
            GL15.glDeleteBuffers(this.O0000000O0);
            this.O0000000O0 = 0;
         }

         if (this.O0000000O0O00 != 0) {
            GL30.glDeleteVertexArrays(this.O0000000O0O00);
            this.O0000000O0O00 = 0;
         }

         if (this.O0000000O0O000 != 0) {
            GL15.glDeleteBuffers(this.O0000000O0O000);
            this.O0000000O0O000 = 0;
         }

         this.O00000000(this.O00000000OOOOO);
         this.O0000000000OO();
         if (this.O00000000O0OO != 0) {
            GL30.glDeleteFramebuffers(this.O00000000O0OO);
            this.O00000000O0OO = 0;
         }

         if (this.O00000000O0O0 != 0) {
            GL11.glDeleteTextures(this.O00000000O0O0);
            this.O00000000O0O0 = 0;
         }

         this.O00000000O0O00 = 0;
         this.O00000000O0O0O = 0;
         if (this.O00000000OO0 != 0) {
            GL30.glDeleteFramebuffers(this.O00000000OO0);
            this.O00000000OO0 = 0;
         }

         if (this.O00000000O0OO0 != 0) {
            GL11.glDeleteTextures(this.O00000000O0OO0);
            this.O00000000O0OO0 = 0;
         }

         this.O00000000O0OOO = 0;
         this.O00000000OO = 0;
         if (this.O00000000OO0OO != 0) {
            GL30.glDeleteFramebuffers(this.O00000000OO0OO);
            this.O00000000OO0OO = 0;
         }

         if (this.O00000000OO00O != 0) {
            GL11.glDeleteTextures(this.O00000000OO00O);
            this.O00000000OO00O = 0;
         }

         this.O00000000OO0O = 0;
         this.O00000000OO0O0 = 0;
         this.O000000O00000O = 0;
         this.O000000O0000O = 0;
         this.O000000O0000O0 = 0;
         this.O000000O0000OO = 1.0F;
         this.O000000O000O = 1.0F;
         this.O000000O000O0 = 0;
         this.O000000O000OO = 0;
         this.O000000O000OO0 = 0;
         this.O000000O000O00 = 0;
         this.O000000O000O0O = 0;
         this.O000000000000O();
         GL30.glBindVertexArray(0);
         GL20.glUseProgram(0);
         if (this.O000000000O != 0) {
            GL30.glDeleteVertexArrays(this.O000000000O);
         }

         if (this.O000000000O0 != 0) {
            GL15.glDeleteBuffers(this.O000000000O0);
         }

         if (this.O000000000O00 != 0) {
            GL15.glDeleteBuffers(this.O000000000O00);
         }

         this.O0000000000OOO.O000000000();
         if (this.O00000000OOOO != null) {
            this.O00000000OOOO.O000000000();
            this.O00000000OOOO = null;
         }

         if (this.O0000000O00 != null) {
            this.O0000000O00.O000000000();
            this.O0000000O00 = null;
         }

         if (this.O0000000O0O00O != null) {
            this.O0000000O0O00O.O000000000();
            this.O0000000O0O00O = null;
         }

         if (this.O0000000OO000 != null) {
            this.O0000000OO000.O000000000();
            this.O0000000OO000 = null;
         }

         if (this.O0000000OOO0O != null) {
            this.O0000000OOO0O.O000000000();
            this.O0000000OOO0O = null;
         }

         if (this.O000000O0000 != null) {
            this.O000000O0000.free();
            this.O000000O0000 = null;
         }
      }
   }

   private void O00000000(GLCapabilities gLCapabilities) {
      if (this.O000000O0000 == null) {
         this.O000000O0000 = GLDebugMessageCallback.create((i, j, k, l, m, n, o) -> {
            if (l != 33387 && l != 37192) {
               long var9 = System.currentTimeMillis();
               Long var11 = O000000O00O0.get(k);
               if (var11 == null || var9 - var11 >= 5000L) {
                  O000000O00O0.put(k, var9);
                  long var12 = O000000O00O00.get();
                  if (var9 - var12 > 1000L) {
                     O000000O00O00.set(var9);
                     O000000O00O000.set(0);
                  }

                  if (O000000O00O000.incrementAndGet() <= 8) {
                     String var14 = GLDebugMessageCallback.getMessage(m, n);
                     System.err.println("[OpenGL] " + var14 + " (severity=" + O000000000000(l) + ")");
                  }
               }
            }
         });
         if (gLCapabilities.OpenGL43) {
            GL11.glEnable(37600);
            GL43.glDebugMessageCallback(this.O000000O0000, 0L);
            GL43.glDebugMessageControl(4352, 4352, 33387, (int[])null, false);
            GL43.glDebugMessageControl(4352, 4352, 37192, (int[])null, false);
         } else {
            GL11.glEnable(37600);
            KHRDebug.glDebugMessageCallback(this.O000000O0000, 0L);
            KHRDebug.glDebugMessageControl(4352, 4352, 33387, (int[])null, false);
            KHRDebug.glDebugMessageControl(4352, 4352, 37192, (int[])null, false);
         }
      }
   }

   private static String O000000000000(int i) {
      return switch (i) {
         case 33387 -> "NOTIFICATION";
         case 37190 -> "HIGH";
         case 37191 -> "MEDIUM";
         case 37192 -> "LOW";
         default -> Integer.toString(i);
      };
   }

   public record W370(int colorTexture, int depthTexture, int width, int height) {
   }

   public record W371(
      int texture,
      int width,
      int height,
      O0000O00O0OOO0.W373 snapshot,
      int previousViewportWidth,
      int previousViewportHeight,
      boolean previousClipEnabled,
      int previousClipX,
      int previousClipY,
      int previousClipW,
      int previousClipH,
      float previousClipRoundTL,
      float previousClipRoundTR,
      float previousClipRoundBR,
      float previousClipRoundBL,
      boolean previousAdditiveBlend,
      boolean cardTransition
   ) {
   }

   static final class W372 {
      int O00000000;
      int O000000000;
      int O0000000000;
      int O00000000000;
   }
}
