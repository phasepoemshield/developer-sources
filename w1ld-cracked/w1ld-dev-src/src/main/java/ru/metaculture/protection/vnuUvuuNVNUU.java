package ru.metaculture.protection;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import net.minecraft.class_10868;
import net.minecraft.class_276;
import net.minecraft.class_310;
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

public final class vnuUvuuNVNUU {
   private static final int UuUVuuUu = 4096;
   private static final int C00OOC00oO = 16;
   private static final int uUnuvNvvNU = 144;
   private static final int vVvUvVVuuNvV = 0;
   private static final int uNNnnnuuuN = 1;
   private static final int nuUnNvnuUu = 2;
   private static final int VVuuUN = 3;
   private static final int vNUvnnVnUvu = 16;
   private static final int uVUuuVnNVU = 32;
   private static final int vuuuNvNuv = 64;
   private static final int nvUVNnuu = 128;
   private static final int UuuNnUvUuv = 67108864;
   private static final int nUUVuvU = 134217728;
   private static final int UnUNVVVNuv = 268435456;
   private static final int vNVuvnUUnuUn = 29;
   private static final int UvnvNVnnnnNU = 7;
   private static final float[] uVUVnuvnuVuv = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   private final boolean NVNnnvnuunNv;
   private final boolean uVunuUNVVUUV;
   private final boolean UNnVVNvvnVvU;
   private final boolean uNnUnnuNUnNu;
   private final vVvUNNUVVnNn NnUuNNU;
   private final int nNvNUVU;
   private final int UnUNuUU;
   private final int uUVuVvuNUvnu;
   private final ByteBuffer UvUvUNuvNU;
   private int c0oOOCcCoC0 = 0;
   private VvuuVNVUn.NVnVnNnN VVnVNnunVvu;
   private int unNNVVNnvvV;
   private int NuunnvnN;
   private int NVUunUNUN = -1;
   private int UUVNuUNUvUnV = -1;
   private boolean vuvnUnVnUNnV = false;
   private int nnuUVNUuvvVU = 0;
   private int nVVUuvuNnUN = 0;
   private int nNnVnUNVV = Integer.MAX_VALUE;
   private int nuunNvv = Integer.MAX_VALUE;
   private float uUVVvVVNvvn = 0.0F;
   private float vvUVNVvvNUv = 0.0F;
   private float UuNnnVnuNNV = 0.0F;
   private float uUVvnUuNvvN = 0.0F;
   private final Int2IntOpenHashMap UUuUnNVNuuv = new Int2IntOpenHashMap(16);
   private final int[] NVuNUuVnVUN = new int[16];
   private final int[] NVuunNnvvvVu = new int[16];
   private int vNnNuuvVn = 0;
   private int VUuuVUnun = -1;
   private boolean vVVuuVVv = false;
   private int VuunNUUUvu = 0;
   private int NNUUNUuVNNVn = 0;
   private int VvVvnNUnvuvV = 0;
   private int ccOO0COcoco0 = 0;
   private int NUVvUUVuVNVv = 0;
   private int nNuVunNUVu = 0;
   private int UNvvunVVn = 0;
   private int UnvuVuVnNuvu = 0;
   private float UvNNVUVNVuvV = 0.5F;
   private float NnunUUnU = 0.5F;
   private int nvuVvuNnNUnv = 0;
   private int NnVnNVN = 0;
   private int vnvvNvUnVv = 0;
   private int OCOocoOoOO = 0;
   private final UNVUNunnvnNU o0Ooc0COOoc = new UNVUNunnvnNU();
   private int nvvnUnUn = 0;
   private int UnUUVuVunvVu = 0;
   private int nnvuvUNuUnN = 0;
   private vVvUNNUVVnNn UVnuVUUVnnU;
   private int VunnVNvNV = -1;
   private final vnuUvuuNVNUU.VvunVVUvUNnv NvUVUvVVnUu = new vnuUvuuNVNUU.VvunVVUvUNnv();
   private int unnUnUNVnN = 0;
   private int NnuUnUNnu = 0;
   private vVvUNNUVVnNn UnnnvvU;
   private int VUUnuVvVu = -1;
   private int VvVuvUvvNNVv = -1;
   private int UnnNNvuvvUU = -1;
   private int VNNnnVUuvv = -1;
   private int vUvUvUNNuNvn = -1;
   private int uuVuUuuVVNvN = -1;
   private int VvuUUUNNNv = -1;
   private int uuuVnuvnnNnU = -1;
   private int nNunUnVN = -1;
   private int VnVuuvVvnNv = -1;
   private int vuvvuVuVv = -1;
   private int uunNUuunVU = -1;
   private int NvnuuuvnVV = -1;
   private int NnUVNnuvUv = -1;
   private final float[] UuuuNNunN = new float[24];
   private final List<vnuUvuuNVNUU.VvunVVUvUNnv> NNVNuUvVn = new ArrayList<>();
   private int vuNnuUnu = 0;
   private int uuvvuNvuUNVV = 0;
   private int uVvunVUNuUvu = 0;
   private vVvUNNUVVnNn NVNnnvVnvV;
   private int vUNuuvvnVnv = -1;
   private int unnnNUNnVu = -1;
   private int NvnnUUuVvNU = -1;
   private int vVvuUVnV = -1;
   private int nvuUVvuuN = -1;
   private int CC0COO = -1;
   private int uNnNUNvuVnu = -1;
   private int VnnnvUunNvuu = -1;
   private int VuuUVVu = -1;
   private int nUNnuUNnV = -1;
   private int VuNVnvNNuNnn = -1;
   private int uvVuuuvvVU = -1;
   private int NNnvvunuVNUn = -1;
   private int nVuuUnnUUVU = -1;
   private final float[] nUununvNvvn = new float[24];
   private vVvUNNUVVnNn NuvunVvnnN;
   private int vuvnnvuNVvu = -1;
   private int NVvnvnn = -1;
   private int vUvVUNnN = -1;
   private int NUuVnnuUnvu = -1;
   private int vnuNNVvVVuN = -1;
   private int Oco0Oococc = -1;
   private int uNUnUuUnvnnU = -1;
   private int OoccOc0CO = -1;
   private int UvuVvvVuUuuu = -1;
   private int NUUVUvvuNNVU = -1;
   private int VUNvNUuNVnn = -1;
   private int UNNunNuUNVuU = -1;
   private int NuUuUvUUvU = -1;
   private int VUVvNvvVUN = -1;
   private int UvvNuvUNNNUv = -1;
   private int NunUUVVVuu = -1;
   private int uNUnuUUvvuU = -1;
   private int vvVVVvVNVVVN = -1;
   private vVvUNNUVVnNn uUuuVvVunVVu;
   private int NuUvUNN = -1;
   private int vunuUUVVUv = -1;
   private int uuuNUnuvvNNv = -1;
   private int unUVnu = -1;
   private int NvNUuuuvUvu = -1;
   private int nNVVUnuVVVuV = -1;
   private int vnVuunuNN = -1;
   private int UvUNuNvvNVNv = -1;
   private int vNnNNNuVVnUv = -1;
   private int UVUnUvUNU = -1;
   private int UvUnnnn = -1;
   private int occOCoc0OcO = -1;
   private int VnvunuuvUNu = -1;
   private final VvuuVNVUn.NVnVnNnN nuVuunUn = new VvuuVNVUn.NVnVnNnN();
   private GLDebugMessageCallback NvNvVNUv;
   private final NvNNUUUNVNnU vNUUvuuVU = new NvNNUUUNVNnU(32856, 5121);
   private final NvNNUUUNVNnU unNuVNVUnV = new NvNNUUUNVNnU(32856, 5121);
   private int UvNNNUvNnUUV = 0;
   private int vVuNvnVUvvv = 0;
   private int OCCc0co0OOC = 0;
   private float unUvvVVVVUu = 1.0F;
   private float nnUunUnNUN = 1.0F;
   private int UNuUVVuUuU = 0;
   private int NunnVUUuvUV = 0;
   private int nVUNnUuU = 0;
   private int VNvuVnvnun = 0;
   private int unVVnuunNU = 0;
   private boolean vVnuVVvVNuNu = false;
   private boolean uNVvVvUuuuU = false;
   private static final ConcurrentHashMap<Integer, Long> nvnUvvnUUN = new ConcurrentHashMap<>();
   private static final AtomicLong uuuvuUUNVVUN = new AtomicLong();
   private static final AtomicInteger VnUvVu = new AtomicInteger();
   private static final long NvUVuUNUUNvv = 5000L;
   private static final long NnvVNVnn = 1000L;
   private static final int O0ooccOc0 = 8;

   private static int UuUVuuUu(int var0) {
      int var1 = var0 >> 16 & 0xFF;
      int var2 = var0 >> 8 & 0xFF;
      int var3 = var0 & 0xFF;
      int var4 = var0 >>> 24 & 0xFF;
      return var4 << 24 | var3 << 16 | var2 << 8 | var1;
   }

   private void nuUnNvnuUu() {
      this.C00OOC00oO(1);
   }

   private void C00OOC00oO(int var1) {
      if (var1 > 0) {
         if (var1 > 4096) {
            throw new IllegalArgumentException("additionalInstances must be between 1 and 4096");
         } else {
            if (this.c0oOOCcCoC0 + var1 > 4096) {
               this.C00OOC00oO();
               this.c0oOOCcCoC0 = 0;
               this.UvUvUNuvNU.clear();
               this.VVuuUN();
            }
         }
      }
   }

   private void VVuuUN() {
      this.UUuUnNVNuuv.clear();
      this.vNnNuuvVn = 0;
   }

   public vnuUvuuNVNUU() {
      this.UUuUnNVNuuv.defaultReturnValue(-1);
      GLCapabilities var1 = GL.getCapabilities();
      this.NVNnnvnuunNv = var1.OpenGL43;
      this.uVunuUNVVUUV = var1.OpenGL43 || var1.GL_KHR_debug;
      boolean var2 = var1.glVertexAttribDivisor != 0L;
      boolean var3 = var1.glVertexAttribDivisorARB != 0L;
      boolean var4 = var1.glDrawArraysInstanced != 0L;
      boolean var5 = var1.glDrawArraysInstancedARB != 0L;
      boolean var6 = var2 || var3;
      boolean var7 = var4 || var5;
      this.UNnVVNvvnVvU = !var2 && var3;
      this.uNnUnnuNUnNu = !var4 && var5;
      if (this.NVNnnvnuunNv || var6 && var7) {
         String var8 = this.NVNnnvnuunNv ? "assets/wild/shaders/shape.vert" : "assets/wild/shaders/shape_compat.vert";
         String var9 = UvnUNnnVnu.UuUVuuUu(var8);
         String var10 = UvnUNnnVnu.UuUVuuUu("assets/wild/shaders/shape.frag");
         this.NnUuNNU = new vVvUNNUVVnNn(var9, var10);
         this.nNvNUVU = GL30.glGenVertexArrays();
         int var11 = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.nNvNUVU);
         GL15.glBindBuffer(34962, var11);
         float[] var12 = new float[]{-0.02F, -0.02F, 2.04F, -0.02F, -0.02F, 2.04F};
         GL15.glBufferData(34962, var12, 35044);
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, 0, 0L);
         int var13 = 0;
         if (!this.NVNnnvnuunNv) {
            var13 = GL15.glGenBuffers();
            GL15.glBindBuffer(34962, var13);
            GL15.glBufferData(34962, 589824L, 35040);
            short var14 = 144;
            long var15 = 0L;
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 4, 5126, false, var14, var15);
            this.nuUnNvnuUu(1, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(2);
            GL20.glVertexAttribPointer(2, 4, 5126, false, var14, var15);
            this.nuUnNvnuUu(2, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(3);
            GL30.glVertexAttribIPointer(3, 4, 5124, var14, var15);
            this.nuUnNvnuUu(3, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(4);
            GL20.glVertexAttribPointer(4, 4, 5126, false, var14, var15);
            this.nuUnNvnuUu(4, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(5);
            GL20.glVertexAttribPointer(5, 4, 5126, false, var14, var15);
            this.nuUnNvnuUu(5, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(6);
            GL30.glVertexAttribIPointer(6, 4, 5125, var14, var15);
            this.nuUnNvnuUu(6, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(7);
            GL20.glVertexAttribPointer(7, 4, 5126, false, var14, var15);
            this.nuUnNvnuUu(7, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(8);
            GL20.glVertexAttribPointer(8, 4, 5126, false, var14, var15);
            this.nuUnNvnuUu(8, 1);
            var15 += 16L;
            GL20.glEnableVertexAttribArray(9);
            GL30.glVertexAttribIPointer(9, 1, 5124, var14, var15);
            this.nuUnNvnuUu(9, 1);
            var15 += 4L;
            GL20.glEnableVertexAttribArray(10);
            GL30.glVertexAttribIPointer(10, 1, 5124, var14, var15);
            this.nuUnNvnuUu(10, 1);
            GL15.glBindBuffer(34962, 0);
         }

         GL15.glBindBuffer(34962, 0);
         GL30.glBindVertexArray(0);
         this.uUVuVvuNUvnu = var13;
         this.UvUvUNuvNU = ByteBuffer.allocateDirect(589824).order(ByteOrder.nativeOrder());
         if (this.NVNnnvnuunNv) {
            this.UnUNuUU = GL15.glGenBuffers();
            GL15.glBindBuffer(37074, this.UnUNuUU);
            GL15.glBufferData(37074, 589824L, 35040);
            GL15.glBindBuffer(37074, 0);
         } else {
            this.UnUNuUU = 0;
         }

         if (this.uVunuUNVVUUV) {
            this.UuUVuuUu(var1);
         }
      } else {
         throw new IllegalStateException("OpenGL instanced rendering is required when shader storage buffers are unavailable");
      }
   }

   private void vNUvnnVnUvu() {
      if (this.UnUUVuVunvVu == 0) {
         this.UnUUVuVunvVu = GL30.glGenVertexArrays();
         this.nnvuvUNuUnN = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.UnUUVuVunvVu);
         GL15.glBindBuffer(34962, this.nnvuvUNuUnN);
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

   private vVvUNNUVVnNn uVUuuVnNVU() {
      if (this.UVnuVUUVnnU != null) {
         return this.UVnuVUUVnnU;
      } else {
         String var1 = UvnUNnnVnu.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert");
         String var2 = "#version 330 core\nlayout(location = 0) out vec4 fragColor;\nin vec2 vUv;\nuniform sampler2D uSource;\nvoid main() {\n    fragColor = texture(uSource, vUv);\n}";
         this.UVnuVUUVnnU = new vVvUNNUVVnNn(var1, var2);
         this.VunnVNvNV = this.UVnuVUUVnnU.UuUVuuUu("uSource");
         return this.UVnuVUUVnnU;
      }
   }

   private void vuuuNvNuv() {
      if (this.unnUnUNVnN == 0) {
         this.unnUnUNVnN = GL30.glGenVertexArrays();
         this.NnuUnUNnu = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.unnUnUNVnN);
         GL15.glBindBuffer(34962, this.NnuUnUNnu);
         GL15.glBufferData(34962, 96L, 35040);
         byte var1 = 16;
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, var1, 0L);
         GL20.glEnableVertexAttribArray(1);
         GL20.glVertexAttribPointer(1, 2, 5126, false, var1, 8L);
         GL15.glBindBuffer(34962, 0);
         GL30.glBindVertexArray(0);
      }

      if (this.UnnnvvU == null) {
         this.UnnnvvU = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/postfx/scroll_layer.vert", "assets/wild/shaders/postfx/scroll_layer.frag");
         this.VUUnuVvVu = this.UnnnvvU.UuUVuuUu("uSource");
         this.VvVuvUvvNNVv = this.UnnnvvU.UuUVuuUu("uViewport");
         this.UnnNNvuvvUU = this.UnnnvvU.UuUVuuUu("uSize");
         this.VNNnnVUuvv = this.UnnnvvU.UuUVuuUu("uTextureSize");
         this.vUvUvUNNuNvn = this.UnnnvvU.UuUVuuUu("uRadii");
         this.uuVuUuuVVNvN = this.UnnnvvU.UuUVuuUu("uClipRect");
         this.VvuUUUNNNv = this.UnnnvvU.UuUVuuUu("uClipRadii");
         this.uuuVnuvnnNnU = this.UnnnvvU.UuUVuuUu("uFadePx");
         this.nNunUnVN = this.UnnnvvU.UuUVuuUu("uEdgeBlurPx");
         this.VnVuuvVvnNv = this.UnnnvvU.UuUVuuUu("uMotionBlurPx");
         this.vuvvuVuVv = this.UnnnvvU.UuUVuuUu("uMotionStrength");
         this.uunNUuunVU = this.UnnnvvU.UuUVuuUu("uFocusStrength");
         this.NvnuuuvnVV = this.UnnnvvU.UuUVuuUu("uDirection");
         this.NnUVNnuvUv = this.UnnnvvU.UuUVuuUu("uAlpha");
      }
   }

   private void nvUVNnuu() {
      if (this.uuvvuNvuUNVV == 0) {
         this.uuvvuNvuUNVV = GL30.glGenVertexArrays();
         this.uVvunVUNuUvu = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.uuvvuNvuUNVV);
         GL15.glBindBuffer(34962, this.uVvunVUNuUvu);
         GL15.glBufferData(34962, 96L, 35040);
         byte var1 = 16;
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, var1, 0L);
         GL20.glEnableVertexAttribArray(1);
         GL20.glVertexAttribPointer(1, 2, 5126, false, var1, 8L);
         GL15.glBindBuffer(34962, 0);
         GL30.glBindVertexArray(0);
      }

      if (this.NVNnnvVnvV == null) {
         this.NVNnnvVnvV = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/card_transition.vert", "assets/wild/shaders/card_transition.frag");
         this.vUNuuvvnVnv = this.NVNnnvVnvV.UuUVuuUu("u_texture");
         this.unnnNUNnVu = this.NVNnnvVnvV.UuUVuuUu("u_viewport");
         this.NvnnUUuVvNU = this.NVNnnvVnvV.UuUVuuUu("u_resolution");
         this.vVvuUVnV = this.NVNnnvVnvV.UuUVuuUu("u_time");
         this.nvuUVvuuN = this.NVNnnvVnvV.UuUVuuUu("u_progress");
         this.CC0COO = this.NVNnnvVnvV.UuUVuuUu("u_color");
         this.uNnNUNvuVnu = this.NVNnnvVnvV.UuUVuuUu("u_borderColor");
         this.VnnnvUunNvuu = this.NVNnnvVnvV.UuUVuuUu("u_emissiveColor");
         this.VuuUVVu = this.NVNnnvVnvV.UuUVuuUu("u_emissiveColor2");
         this.nUNnuUNnV = this.NVNnnvVnvV.UuUVuuUu("u_radius");
         this.VuNVnvNNuNnn = this.NVNnnvVnvV.UuUVuuUu("u_alpha");
         this.uvVuuuvvVU = this.NVNnnvVnvV.UuUVuuUu("u_clipRect");
         this.NNnvvunuVNUn = this.NVNnnvVnvV.UuUVuuUu("u_clipRadii");
         this.nVuuUnnUUVU = this.NVNnnvVnvV.UuUVuuUu("u_textureScale");
      }
   }

   private void UuuNnUvUuv() {
      this.nvUVNnuu();
      if (this.NuvunVvnnN == null) {
         this.NuvunVvnnN = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/card_transition.vert", "assets/wild/shaders/entity/nametag_plasma.frag");
         this.vuvnnvuNVvu = this.NuvunVvnnN.UuUVuuUu("u_texture");
         this.NVvnvnn = this.NuvunVvnnN.UuUVuuUu("u_viewport");
         this.vUvVUNnN = this.NuvunVvnnN.UuUVuuUu("u_resolution");
         this.NUuVnnuUnvu = this.NuvunVvnnN.UuUVuuUu("u_time");
         this.vnuNNVvVVuN = this.NuvunVvnnN.UuUVuuUu("u_progress");
         this.Oco0Oococc = this.NuvunVvnnN.UuUVuuUu("u_contentReveal");
         this.uNUnUuUnvnnU = this.NuvunVvnnN.UuUVuuUu("u_focus");
         this.OoccOc0CO = this.NuvunVvnnN.UuUVuuUu("u_threat");
         this.UvuVvvVuUuuu = this.NuvunVvnnN.UuUVuuUu("u_exposure");
         this.NUUVUvvuNNVU = this.NuvunVvnnN.UuUVuuUu("u_color");
         this.VUNvNUuNVnn = this.NuvunVvnnN.UuUVuuUu("u_borderColor");
         this.UNNunNuUNVuU = this.NuvunVvnnN.UuUVuuUu("u_emissiveColor");
         this.NuUuUvUUvU = this.NuvunVvnnN.UuUVuuUu("u_emissiveColor2");
         this.VUVvNvvVUN = this.NuvunVvnnN.UuUVuuUu("u_radius");
         this.UvvNuvUNNNUv = this.NuvunVvnnN.UuUVuuUu("u_alpha");
         this.NunUUVVVuu = this.NuvunVvnnN.UuUVuuUu("u_clipRect");
         this.uNUnuUUvvuU = this.NuvunVvnnN.UuUVuuUu("u_clipRadii");
         this.vvVVVvVNVVVN = this.NuvunVvnnN.UuUVuuUu("u_textureScale");
      }
   }

   private void nUUVuvU() {
      this.nvUVNnuu();
      if (this.uUuuVvVunVVu == null) {
         this.uUuuVvVunVVu = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/card_transition.vert", "assets/wild/shaders/fbo_mask.frag");
         this.NuUvUNN = this.uUuuVvVunVVu.UuUVuuUu("u_texture");
         this.vunuUUVVUv = this.uUuuVvVunVVu.UuUVuuUu("u_viewport");
         this.uuuNUnuvvNNv = this.uUuuVvVunVVu.UuUVuuUu("u_resolution");
         this.unUVnu = this.uUuuVvVunVVu.UuUVuuUu("u_time");
         this.NvNUuuuvUvu = this.uUuuVvVunVVu.UuUVuuUu("u_progress");
         this.nNVVUnuVVVuV = this.uUuuVvVunVVu.UuUVuuUu("u_color");
         this.vnVuunuNN = this.uUuuVvVunVVu.UuUVuuUu("u_borderColor");
         this.UvUNuNvvNVNv = this.uUuuVvVunVVu.UuUVuuUu("u_emissiveColor");
         this.vNnNNNuVVnUv = this.uUuuVvVunVVu.UuUVuuUu("u_radius");
         this.UVUnUvUNU = this.uUuuVvVunVVu.UuUVuuUu("u_alpha");
         this.UvUnnnn = this.uUuuVvVunVVu.UuUVuuUu("u_clipRect");
         this.occOCoc0OcO = this.uUuuVvVunVVu.UuUVuuUu("u_clipRadii");
         this.VnvunuuvUNu = this.uUuuVvVunVVu.UuUVuuUu("u_textureScale");
      }
   }

   public vnuUvuuNVNUU.nvnNNunvv UuUVuuUu(int var1, int var2) {
      return this.UuUVuuUu(this.NvUVUvVVnUu, var1, var2, false);
   }

   public vnuUvuuNVNUU.nvnNNunvv C00OOC00oO(int var1, int var2) {
      if (var1 > 0 && var2 > 0 && this.unNNVVNnvvV > 0 && this.NuunnvnN > 0) {
         int var3 = this.vuNnuUnu;
         vnuUvuuNVNUU.VvunVVUvUNnv var4 = this.uUnuvNvvNU(var3);
         this.vuNnuUnu++;

         try {
            vnuUvuuNVNUU.nvnNNunvv var5 = this.UuUVuuUu(var4, var1, var2, true);
            if (var5 == null) {
               this.vuNnuUnu = var3;
            }

            return var5;
         } catch (Error | RuntimeException var6) {
            this.vuNnuUnu = var3;
            throw var6;
         }
      } else {
         return null;
      }
   }

   private vnuUvuuNVNUU.VvunVVUvUNnv uUnuvNvvNU(int var1) {
      while (this.NNVNuUvVn.size() <= var1) {
         this.NNVNuUvVn.add(new vnuUvuuNVNUU.VvunVVUvUNnv());
      }

      return this.NNVNuUvVn.get(var1);
   }

   private vnuUvuuNVNUU.nvnNNunvv UuUVuuUu(vnuUvuuNVNUU.VvunVVUvUNnv var1, int var2, int var3, boolean var4) {
      this.C00OOC00oO();
      if (var2 > 0 && var3 > 0 && this.unNNVVNnvvV > 0 && this.NuunnvnN > 0) {
         int var5 = var2;
         int var6 = var3;
         int var7 = this.unNNVVNnvvV;
         int var8 = this.NuunnvnN;
         boolean var9 = this.vuvnUnVnUNnV;
         int var10 = this.nnuUVNUuvvVU;
         int var11 = this.nVVUuvuNnUN;
         int var12 = this.nNnVnUNVV;
         int var13 = this.nuunNvv;
         float var14 = this.uUVVvVVNvvn;
         float var15 = this.vvUVNVvvNUv;
         float var16 = this.UuNnnVnuNNV;
         float var17 = this.uUVvnUuNvvN;
         boolean var18 = this.vVnuVVvVNuNu;
         VvuuVNVUn.NVnVnNnN var19 = VvuuVNVUn.C00OOC00oO(var1.uNNnnnuuuN);

         try {
            this.C00OOC00oO(var1, var5, var6, var4);
            vnuUvuuNVNUU.nvnNNunvv var20 = var1.nuUnNvnuUu
               .UuUVuuUu(
                  var1.C00OOC00oO,
                  var5,
                  var6,
                  var1.uUnuvNvvNU,
                  var1.vVvUvVVuuNvV,
                  var19,
                  var7,
                  var8,
                  var9,
                  var10,
                  var11,
                  var12,
                  var13,
                  var14,
                  var15,
                  var16,
                  var17,
                  var18,
                  var4
               );
            GL30.glBindFramebuffer(36160, var1.UuUVuuUu);
            GL11.glDrawBuffer(36064);
            GL11.glViewport(0, 0, var5, var6);
            GL11.glEnable(3089);
            GL11.glScissor(0, 0, var5, var6);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(36281);
            GL11.glColorMask(true, true, true, true);
            GL11.glDepthMask(false);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16384);
            GL11.glDisable(3089);
            this.unNNVVNnvvV = var5;
            this.NuunnvnN = var6;
            this.vuvnUnVnUNnV = false;
            this.nnuUVNUuvvVU = 0;
            this.nVVUuvuNnUN = 0;
            this.nNnVnUNVV = var5;
            this.nuunNvv = var6;
            this.uUVVvVVNvvn = 0.0F;
            this.vvUVNVvvNUv = 0.0F;
            this.UuNnnVnuNNV = 0.0F;
            this.uUVvnUuNvvN = 0.0F;
            this.vVnuVVvVNuNu = false;
            this.NnUuNNU.UuUVuuUu();
            GL30.glBindVertexArray(this.nNvNUVU);
            if (this.VUuuVUnun == -1) {
               this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
            }

            GL20.glUniform2f(this.VUuuVUnun, var5, var6);
            this.UnUNVVVNuv();
            this.VVuuUN();
            return var20;
         } catch (Error | RuntimeException var21) {
            this.unNNVVNnvvV = var7;
            this.NuunnvnN = var8;
            this.vuvnUnVnUNnV = var9;
            this.nnuUVNUuvvVU = var10;
            this.nVVUuvuNnUN = var11;
            this.nNnVnUNVV = var12;
            this.nuunNvv = var13;
            this.uUVVvVVNvvn = var14;
            this.vvUVNVvvNUv = var15;
            this.UuNnnVnuNNV = var16;
            this.uUVvnUuNvvN = var17;
            this.vVnuVVvVNuNu = var18;
            VvuuVNVUn.uUnuvNvvNU(var19);
            this.NnUuNNU.UuUVuuUu();
            GL30.glBindVertexArray(this.nNvNUVU);
            if (this.VUuuVUnun == -1) {
               this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
            }

            GL20.glUniform2f(this.VUuuVUnun, this.unNNVVNnvvV, this.NuunnvnN);
            this.UnUNVVVNuv();
            throw var21;
         }
      } else {
         return null;
      }
   }

   public void UuUVuuUu(vnuUvuuNVNUU.nvnNNunvv var1) {
      this.C00OOC00oO();
      if (var1 != null) {
         this.unNNVVNnvvV = var1.VVuuUN();
         this.NuunnvnN = var1.vNUvnnVnUvu();
         this.vuvnUnVnUNnV = var1.uVUuuVnNVU();
         this.nnuUVNUuvvVU = var1.vuuuNvNuv();
         this.nVVUuvuNnUN = var1.nvUVNnuu();
         this.nNnVnUNVV = var1.UuuNnUvUuv();
         this.nuunNvv = var1.nUUVuvU();
         this.uUVVvVVNvvn = var1.UnUNVVVNuv();
         this.vvUVNVvvNUv = var1.vNVuvnUUnuUn();
         this.UuNnnVnuNNV = var1.UvnvNVnnnnNU();
         this.uUVvnUuNvvN = var1.uVUVnuvnuVuv();
         this.vVnuVVvVNuNu = var1.NVNnnvnuunNv();
         VvuuVNVUn.uUnuvNvvNU(var1.nuUnNvnuUu());
         this.NnUuNNU.UuUVuuUu();
         GL30.glBindVertexArray(this.nNvNUVU);
         if (this.VUuuVUnun == -1) {
            this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
         }

         GL20.glUniform2f(this.VUuuVUnun, this.unNNVVNnvvV, this.NuunnvnN);
         this.UnUNVVVNuv();
         this.VVuuUN();
         if (var1.uVunuUNVVUUV()) {
            this.vuNnuUnu = Math.max(0, this.vuNnuUnu - 1);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(
      int var1,
      int var2,
      int var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float[] var19,
      int var20,
      int var21,
      int var22,
      int var23,
      float var24,
      float var25,
      float var26,
      float var27
   ) {
      if (var1 > 0 && var2 > 0 && var3 > 0 && !(var6 <= 0.0F) && !(var7 <= 0.0F)) {
         this.C00OOC00oO();
         float[] var28 = var19 != null && var19.length >= 6 ? var19 : uVUVnuvnuVuv;
         float var31 = var4 + var6;
         float var32 = var5 + var7;
         float var33 = UuUVuuUu(var28, var4, var5);
         float var34 = C00OOC00oO(var28, var4, var5);
         float var35 = UuUVuuUu(var28, var31, var5);
         float var36 = C00OOC00oO(var28, var31, var5);
         float var37 = UuUVuuUu(var28, var31, var32);
         float var38 = C00OOC00oO(var28, var31, var32);
         float var39 = UuUVuuUu(var28, var4, var32);
         float var40 = C00OOC00oO(var28, var4, var32);
         UuUVuuUu(this.UuuuNNunN, var33, var34, var35, var36, var37, var38, var39, var40);
         VvuuVNVUn.NVnVnNnN var41 = VvuuVNVUn.C00OOC00oO(this.nuVuunUn);
         boolean var44 = false /* VF: Semaphore variable */;

         try {
            var44 = true;
            this.vuuuNvNuv();
            GL11.glDisable(3089);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(36281);
            GL11.glEnable(3042);
            if (this.vVnuVVvVNuNu) {
               GL14.glBlendFuncSeparate(1, 1, 1, 771);
            } else {
               GL14.glBlendFuncSeparate(1, 771, 1, 771);
            }

            this.UnnnvvU.UuUVuuUu();
            if (this.VUUnuVvVu >= 0) {
               GL20.glUniform1i(this.VUUnuVvVu, 0);
            }

            if (this.VvVuvUvvNNVv >= 0) {
               GL20.glUniform2f(this.VvVuvUvvNNVv, this.unNNVVNnvvV, this.NuunnvnN);
            }

            if (this.UnnNNvuvvUU >= 0) {
               GL20.glUniform2f(this.UnnNNvuvvUU, var6, var7);
            }

            if (this.VNNnnVUuvv >= 0) {
               GL20.glUniform2f(this.VNNnnVUuvv, var2, var3);
            }

            if (this.vUvUvUNNuNvn >= 0) {
               GL20.glUniform4f(this.vUvUvUNNuNvn, var8, var9, var10, var11);
            }

            if (this.uuVuUuuVVNvN >= 0) {
               GL20.glUniform4f(this.uuVuUuuVVNvN, var20, var21, var22, var23);
            }

            if (this.VvuUUUNNNv >= 0) {
               GL20.glUniform4f(this.VvuUUUNNNv, var24, var25, var26, var27);
            }

            if (this.uuuVnuvnnNnU >= 0) {
               GL20.glUniform1f(this.uuuVnuvnnNnU, Math.max(0.0F, var12));
            }

            if (this.nNunUnVN >= 0) {
               GL20.glUniform1f(this.nNunUnVN, Math.max(0.0F, var13));
            }

            if (this.VnVuuvVvnNv >= 0) {
               GL20.glUniform1f(this.VnVuuvVvnNv, Math.max(0.0F, var14));
            }

            if (this.vuvvuVuVv >= 0) {
               GL20.glUniform1f(this.vuvvuVuVv, Math.max(0.0F, Math.min(1.0F, var15)));
            }

            if (this.uunNUuunVU >= 0) {
               GL20.glUniform1f(this.uunNUuunVU, Math.max(0.0F, Math.min(1.0F, var16)));
            }

            if (this.NvnuuuvnVV >= 0) {
               GL20.glUniform1f(this.NvnuuuvnVV, var17 < 0.0F ? -1.0F : 1.0F);
            }

            if (this.NnUVNnuvUv >= 0) {
               GL20.glUniform1f(this.NnUVNnuvUv, Math.max(0.0F, Math.min(1.0F, var18)));
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, var1);
            GL30.glBindVertexArray(this.unnUnUNVnN);
            GL15.glBindBuffer(34962, this.NnuUnUNnu);
            GL15.glBufferSubData(34962, 0L, this.UuuuNNunN);
            VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
            GL11.glDrawArrays(4, 0, 6);
            var44 = false;
         } finally {
            if (var44) {
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var41);
               this.NnUuNNU.UuUVuuUu();
               GL30.glBindVertexArray(this.nNvNUVU);
               if (this.VUuuVUnun == -1) {
                  this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
               }

               GL20.glUniform2f(this.VUuuVUnun, this.unNNVVNnvvV, this.NuunnvnN);
               this.UnUNVVVNuv();
            }
         }

         GL30.glBindVertexArray(0);
         GL15.glBindBuffer(34962, 0);
         GL20.glUseProgram(0);
         VvuuVNVUn.uUnuvNvvNU(var41);
         this.NnUuNNU.UuUVuuUu();
         GL30.glBindVertexArray(this.nNvNUVU);
         if (this.VUuuVUnun == -1) {
            this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
         }

         GL20.glUniform2f(this.VUuuVUnun, this.unNNVVNnvvV, this.NuunnvnN);
         this.UnUNVVVNuv();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13,
      int var14,
      float var15,
      float var16,
      float var17,
      float[] var18,
      int var19,
      int var20,
      int var21,
      int var22,
      float var23,
      float var24,
      float var25,
      float var26
   ) {
      if (var1 > 0 && var2 > 0 && var3 > 0 && var4 > 0 && var5 > 0 && !(var8 <= 0.0F) && !(var9 <= 0.0F)) {
         this.C00OOC00oO();
         float[] var27 = var18 != null && var18.length >= 6 ? var18 : uVUVnuvnuVuv;
         float var30 = var6 + var8;
         float var31 = var7 + var9;
         float var32 = UuUVuuUu(var27, var6, var7);
         float var33 = C00OOC00oO(var27, var6, var7);
         float var34 = UuUVuuUu(var27, var30, var7);
         float var35 = C00OOC00oO(var27, var30, var7);
         float var36 = UuUVuuUu(var27, var30, var31);
         float var37 = C00OOC00oO(var27, var30, var31);
         float var38 = UuUVuuUu(var27, var6, var31);
         float var39 = C00OOC00oO(var27, var6, var31);
         UuUVuuUu(this.nUununvNvvn, var32, var33, var34, var35, var36, var37, var38, var39);
         VvuuVNVUn.NVnVnNnN var40 = VvuuVNVUn.C00OOC00oO(this.nuVuunUn);
         boolean var43 = false /* VF: Semaphore variable */;

         try {
            var43 = true;
            this.nvUVNnuu();
            GL11.glDisable(3089);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(36281);
            GL11.glEnable(3042);
            if (this.vVnuVVvVNuNu) {
               GL14.glBlendFuncSeparate(1, 1, 1, 771);
            } else {
               GL14.glBlendFuncSeparate(1, 771, 1, 771);
            }

            this.NVNnnvVnvV.UuUVuuUu();
            if (this.vUNuuvvnVnv >= 0) {
               GL20.glUniform1i(this.vUNuuvvnVnv, 0);
            }

            if (this.unnnNUNnVu >= 0) {
               GL20.glUniform2f(this.unnnNUNnVu, this.unNNVVNnvvV, this.NuunnvnN);
            }

            if (this.NvnnUUuVvNU >= 0) {
               GL20.glUniform2f(this.NvnnUUuVvNU, var8, var9);
            }

            if (this.vVvuUVnV >= 0) {
               GL20.glUniform1f(this.vVvuUVnV, var16);
            }

            if (this.nvuUVvuuN >= 0) {
               GL20.glUniform1f(this.nvuUVvuuN, Math.max(0.0F, Math.min(1.0F, var15)));
            }

            if (this.CC0COO >= 0) {
               VVuuUN(this.CC0COO, var11);
            }

            if (this.uNnNUNvuVnu >= 0) {
               VVuuUN(this.uNnNUNvuVnu, var12);
            }

            if (this.VnnnvUunNvuu >= 0) {
               VVuuUN(this.VnnnvUunNvuu, var13);
            }

            if (this.VuuUVVu >= 0) {
               VVuuUN(this.VuuUVVu, var14);
            }

            if (this.nUNnuUNnV >= 0) {
               GL20.glUniform1f(this.nUNnuUNnV, Math.max(0.0F, var10));
            }

            if (this.VuNVnvNNuNnn >= 0) {
               GL20.glUniform1f(this.VuNVnvNNuNnn, Math.max(0.0F, Math.min(1.0F, var17)));
            }

            if (this.uvVuuuvvVU >= 0) {
               GL20.glUniform4f(this.uvVuuuvvVU, var19, var20, var21, var22);
            }

            if (this.NNnvvunuVNUn >= 0) {
               GL20.glUniform4f(this.NNnvvunuVNUn, var23, var24, var25, var26);
            }

            if (this.nVuuUnnUUVU >= 0) {
               GL20.glUniform2f(this.nVuuUnnUUVU, (float)var4 / var2, (float)var5 / var3);
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, var1);
            GL30.glBindVertexArray(this.uuvvuNvuUNVV);
            GL15.glBindBuffer(34962, this.uVvunVUNuUvu);
            GL15.glBufferSubData(34962, 0L, this.nUununvNvvn);
            VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
            GL11.glDrawArrays(4, 0, 6);
            var43 = false;
         } finally {
            if (var43) {
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var40);
               this.NnUuNNU.UuUVuuUu();
               GL30.glBindVertexArray(this.nNvNUVU);
               if (this.VUuuVUnun == -1) {
                  this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
               }

               GL20.glUniform2f(this.VUuuVUnun, this.unNNVVNnvvV, this.NuunnvnN);
               this.UnUNVVVNuv();
            }
         }

         GL30.glBindVertexArray(0);
         GL15.glBindBuffer(34962, 0);
         GL20.glUseProgram(0);
         VvuuVNVUn.uUnuvNvvNU(var40);
         this.NnUuNNU.UuUVuuUu();
         GL30.glBindVertexArray(this.nNvNUVU);
         if (this.VUuuVUnun == -1) {
            this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
         }

         GL20.glUniform2f(this.VUuuVUnun, this.unNNVVNnvvV, this.NuunnvnN);
         this.UnUNVVVNuv();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13,
      int var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20,
      float var21,
      float[] var22,
      int var23,
      int var24,
      int var25,
      int var26,
      float var27,
      float var28,
      float var29,
      float var30
   ) {
      if (var1 > 0 && var2 > 0 && var3 > 0 && var4 > 0 && var5 > 0 && !(var8 <= 0.0F) && !(var9 <= 0.0F)) {
         this.C00OOC00oO();
         float[] var31 = var22 != null && var22.length >= 6 ? var22 : uVUVnuvnuVuv;
         float var34 = var6 + var8;
         float var35 = var7 + var9;
         float var36 = UuUVuuUu(var31, var6, var7);
         float var37 = C00OOC00oO(var31, var6, var7);
         float var38 = UuUVuuUu(var31, var34, var7);
         float var39 = C00OOC00oO(var31, var34, var7);
         float var40 = UuUVuuUu(var31, var34, var35);
         float var41 = C00OOC00oO(var31, var34, var35);
         float var42 = UuUVuuUu(var31, var6, var35);
         float var43 = C00OOC00oO(var31, var6, var35);
         UuUVuuUu(this.nUununvNvvn, var36, var37, var38, var39, var40, var41, var42, var43);
         VvuuVNVUn.NVnVnNnN var44 = VvuuVNVUn.C00OOC00oO(this.nuVuunUn);
         boolean var47 = false /* VF: Semaphore variable */;

         try {
            var47 = true;
            this.UuuNnUvUuv();
            GL11.glDisable(3089);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(36281);
            GL11.glEnable(3042);
            if (this.vVnuVVvVNuNu) {
               GL14.glBlendFuncSeparate(1, 1, 1, 771);
            } else {
               GL14.glBlendFuncSeparate(1, 771, 1, 771);
            }

            this.NuvunVvnnN.UuUVuuUu();
            if (this.vuvnnvuNVvu >= 0) {
               GL20.glUniform1i(this.vuvnnvuNVvu, 0);
            }

            if (this.NVvnvnn >= 0) {
               GL20.glUniform2f(this.NVvnvnn, this.unNNVVNnvvV, this.NuunnvnN);
            }

            if (this.vUvVUNnN >= 0) {
               GL20.glUniform2f(this.vUvVUNnN, var8, var9);
            }

            if (this.NUuVnnuUnvu >= 0) {
               GL20.glUniform1f(this.NUuVnnuUnvu, var17);
            }

            if (this.vnuNNVvVVuN >= 0) {
               GL20.glUniform1f(this.vnuNNVvVVuN, Math.max(0.0F, Math.min(1.0F, var15)));
            }

            if (this.Oco0Oococc >= 0) {
               GL20.glUniform1f(this.Oco0Oococc, Math.max(0.0F, Math.min(1.0F, var16)));
            }

            if (this.uNUnUuUnvnnU >= 0) {
               GL20.glUniform1f(this.uNUnUuUnvnnU, Math.max(0.0F, Math.min(1.0F, var18)));
            }

            if (this.OoccOc0CO >= 0) {
               GL20.glUniform1f(this.OoccOc0CO, Math.max(0.0F, Math.min(1.0F, var19)));
            }

            if (this.UvuVvvVuUuuu >= 0) {
               GL20.glUniform1f(this.UvuVvvVuUuuu, Math.max(0.0F, Math.min(1.0F, var20)));
            }

            if (this.NUUVUvvuNNVU >= 0) {
               VVuuUN(this.NUUVUvvuNNVU, var11);
            }

            if (this.VUNvNUuNVnn >= 0) {
               VVuuUN(this.VUNvNUuNVnn, var12);
            }

            if (this.UNNunNuUNVuU >= 0) {
               VVuuUN(this.UNNunNuUNVuU, var13);
            }

            if (this.NuUuUvUUvU >= 0) {
               VVuuUN(this.NuUuUvUUvU, var14);
            }

            if (this.VUVvNvvVUN >= 0) {
               GL20.glUniform1f(this.VUVvNvvVUN, Math.max(0.0F, var10));
            }

            if (this.UvvNuvUNNNUv >= 0) {
               GL20.glUniform1f(this.UvvNuvUNNNUv, Math.max(0.0F, Math.min(1.0F, var21)));
            }

            if (this.NunUUVVVuu >= 0) {
               GL20.glUniform4f(this.NunUUVVVuu, var23, var24, var25, var26);
            }

            if (this.uNUnuUUvvuU >= 0) {
               GL20.glUniform4f(this.uNUnuUUvvuU, var27, var28, var29, var30);
            }

            if (this.vvVVVvVNVVVN >= 0) {
               GL20.glUniform2f(this.vvVVVvVNVVVN, (float)var4 / var2, (float)var5 / var3);
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, var1);
            GL30.glBindVertexArray(this.uuvvuNvuUNVV);
            GL15.glBindBuffer(34962, this.uVvunVUNuUvu);
            GL15.glBufferSubData(34962, 0L, this.nUununvNvvn);
            VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
            GL11.glDrawArrays(4, 0, 6);
            var47 = false;
         } finally {
            if (var47) {
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var44);
               this.NnUuNNU.UuUVuuUu();
               GL30.glBindVertexArray(this.nNvNUVU);
               if (this.VUuuVUnun == -1) {
                  this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
               }

               GL20.glUniform2f(this.VUuuVUnun, this.unNNVVNnvvV, this.NuunnvnN);
               this.UnUNVVVNuv();
            }
         }

         GL30.glBindVertexArray(0);
         GL15.glBindBuffer(34962, 0);
         GL20.glUseProgram(0);
         VvuuVNVUn.uUnuvNvvNU(var44);
         this.NnUuNNU.UuUVuuUu();
         GL30.glBindVertexArray(this.nNvNUVU);
         if (this.VUuuVUnun == -1) {
            this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
         }

         GL20.glUniform2f(this.VUuuVUnun, this.unNNVVNnvvV, this.NuunnvnN);
         this.UnUNVVVNuv();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13,
      float var14,
      float var15,
      float var16,
      float[] var17,
      int var18,
      int var19,
      int var20,
      int var21,
      float var22,
      float var23,
      float var24,
      float var25
   ) {
      if (var1 > 0 && var2 > 0 && var3 > 0 && var4 > 0 && var5 > 0 && !(var8 <= 0.0F) && !(var9 <= 0.0F)) {
         this.C00OOC00oO();
         float[] var26 = var17 != null && var17.length >= 6 ? var17 : uVUVnuvnuVuv;
         float var29 = var6 + var8;
         float var30 = var7 + var9;
         float var31 = UuUVuuUu(var26, var6, var7);
         float var32 = C00OOC00oO(var26, var6, var7);
         float var33 = UuUVuuUu(var26, var29, var7);
         float var34 = C00OOC00oO(var26, var29, var7);
         float var35 = UuUVuuUu(var26, var29, var30);
         float var36 = C00OOC00oO(var26, var29, var30);
         float var37 = UuUVuuUu(var26, var6, var30);
         float var38 = C00OOC00oO(var26, var6, var30);
         UuUVuuUu(this.nUununvNvvn, var31, var32, var33, var34, var35, var36, var37, var38);
         VvuuVNVUn.NVnVnNnN var39 = VvuuVNVUn.C00OOC00oO(this.nuVuunUn);
         boolean var42 = false /* VF: Semaphore variable */;

         try {
            var42 = true;
            this.nUUVuvU();
            GL11.glDisable(3089);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(36281);
            GL11.glEnable(3042);
            if (this.vVnuVVvVNuNu) {
               GL14.glBlendFuncSeparate(1, 1, 1, 771);
            } else {
               GL14.glBlendFuncSeparate(1, 771, 1, 771);
            }

            this.uUuuVvVunVVu.UuUVuuUu();
            if (this.NuUvUNN >= 0) {
               GL20.glUniform1i(this.NuUvUNN, 0);
            }

            if (this.vunuUUVVUv >= 0) {
               GL20.glUniform2f(this.vunuUUVVUv, this.unNNVVNnvvV, this.NuunnvnN);
            }

            if (this.uuuNUnuvvNNv >= 0) {
               GL20.glUniform2f(this.uuuNUnuvvNNv, var8, var9);
            }

            if (this.unUVnu >= 0) {
               GL20.glUniform1f(this.unUVnu, var15);
            }

            if (this.NvNUuuuvUvu >= 0) {
               GL20.glUniform1f(this.NvNUuuuvUvu, Math.max(0.0F, Math.min(1.0F, var14)));
            }

            if (this.nNVVUnuVVVuV >= 0) {
               VVuuUN(this.nNVVUnuVVVuV, var11);
            }

            if (this.vnVuunuNN >= 0) {
               VVuuUN(this.vnVuunuNN, var12);
            }

            if (this.UvUNuNvvNVNv >= 0) {
               VVuuUN(this.UvUNuNvvNVNv, var13);
            }

            if (this.vNnNNNuVVnUv >= 0) {
               GL20.glUniform1f(this.vNnNNNuVVnUv, Math.max(0.0F, var10));
            }

            if (this.UVUnUvUNU >= 0) {
               GL20.glUniform1f(this.UVUnUvUNU, Math.max(0.0F, Math.min(1.0F, var16)));
            }

            if (this.UvUnnnn >= 0) {
               GL20.glUniform4f(this.UvUnnnn, var18, var19, var20, var21);
            }

            if (this.occOCoc0OcO >= 0) {
               GL20.glUniform4f(this.occOCoc0OcO, var22, var23, var24, var25);
            }

            if (this.VnvunuuvUNu >= 0) {
               GL20.glUniform2f(this.VnvunuuvUNu, (float)var4 / var2, (float)var5 / var3);
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, var1);
            GL30.glBindVertexArray(this.uuvvuNvuUNVV);
            GL15.glBindBuffer(34962, this.uVvunVUNuUvu);
            GL15.glBufferSubData(34962, 0L, this.nUununvNvvn);
            VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
            GL11.glDrawArrays(4, 0, 6);
            var42 = false;
         } finally {
            if (var42) {
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var39);
               this.NnUuNNU.UuUVuuUu();
               GL30.glBindVertexArray(this.nNvNUVU);
               if (this.VUuuVUnun == -1) {
                  this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
               }

               GL20.glUniform2f(this.VUuuVUnun, this.unNNVVNnvvV, this.NuunnvnN);
               this.UnUNVVVNuv();
            }
         }

         GL30.glBindVertexArray(0);
         GL15.glBindBuffer(34962, 0);
         GL20.glUseProgram(0);
         VvuuVNVUn.uUnuvNvvNU(var39);
         this.NnUuNNU.UuUVuuUu();
         GL30.glBindVertexArray(this.nNvNUVU);
         if (this.VUuuVUnun == -1) {
            this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
         }

         GL20.glUniform2f(this.VUuuVUnun, this.unNNVVNnvvV, this.NuunnvnN);
         this.UnUNVVVNuv();
      }
   }

   public void uUnuvNvvNU(int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         this.VVnVNnunVvu = VvuuVNVUn.UuUVuuUu();
         this.unNNVVNnvvV = var1;
         this.NuunnvnN = var2;
         this.c0oOOCcCoC0 = 0;
         this.UvUvUNuvNU.clear();
         this.VVuuUN();
         this.NnUuNNU.UuUVuuUu();
         if (this.VUuuVUnun == -1) {
            this.VUuuVUnun = this.NnUuNNU.UuUVuuUu("uViewport");
         }

         GL30.glBindVertexArray(this.nNvNUVU);
         GL20.glUniform2f(this.VUuuVUnun, var1, var2);
         this.UNuUVVuUuU = 0;
         this.VNvuVnvnun = 0;
         this.unVVnuunNU = 0;
         this.NunnVUUuvUV = 0;
         this.nVUNnUuU = 0;
         this.vVnuVVvVNuNu = false;
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         GL11.glDisable(3089);
         this.UnUNVVVNuv();
         GL11.glViewport(0, 0, var1, var2);
         GL11.glColorMask(true, true, true, true);
         if (!this.vVVuuVVv) {
            for (int var3 = 0; var3 < 16; var3++) {
               int var4 = this.NnUuNNU.UuUVuuUu("uTextures[" + var3 + "]");
               if (var4 != -1) {
                  GL20.glUniform1i(var4, var3);
               }
            }

            this.vVVuuVVv = true;
         }
      } else {
         this.unNNVVNnvvV = 0;
         this.NuunnvnN = 0;
         this.c0oOOCcCoC0 = 0;
         this.UvUvUNuvNU.clear();
         this.VVuuUN();
         this.NVNnnvnuunNv();
      }
   }

   public void UuUVuuUu() {
      this.C00OOC00oO();
      GL30.glBindVertexArray(0);
      GL20.glUseProgram(0);
      if (this.VVnVNnunVvu != null) {
         GL20.glUseProgram(this.VVnVNnunVvu.c0oOOCcCoC0);
         GL30.glBindVertexArray(this.VVnVNnunVvu.VVnVNnunVvu);
         GL15.glBindBuffer(34962, this.VVnVNnunVvu.unNNVVNnvvV);
         GL15.glBindBuffer(34963, this.VVnVNnunVvu.NuunnvnN);
         GL13.glActiveTexture(this.VVnVNnunVvu.NVUunUNUN);
         GL11.glBindTexture(3553, this.VVnVNnunVvu.UUVNuUNUvUnV);
         GL11.glPixelStorei(3317, this.VVnVNnunVvu.nnuUVNUuvvVU);
         UuUVuuUu(3089, this.VVnVNnunVvu.nuUnNvnuUu);
         UuUVuuUu(2929, this.VVnVNnunVvu.vNUvnnVnUvu);
         UuUVuuUu(2884, this.VVnVNnunVvu.uVUuuVnNVU);
         UuUVuuUu(3042, this.VVnVNnunVvu.vuuuNvNuv);
         UuUVuuUu(36281, this.VVnVNnunVvu.nvUVNnuu);
         GL14.glBlendFuncSeparate(this.VVnVNnunVvu.UuuNnUvUuv, this.VVnVNnunVvu.nUUVuvU, this.VVnVNnunVvu.UnUNVVVNuv, this.VVnVNnunVvu.vNVuvnUUnuUn);
         GL11.glColorMask(this.VVnVNnunVvu.UvnvNVnnnnNU, this.VVnVNnunVvu.uVUVnuvnuVuv, this.VVnVNnunVvu.NVNnnvnuunNv, this.VVnVNnunVvu.uVunuUNVVUUV);
         GL11.glDepthMask(this.VVnVNnunVvu.UNnVVNvvnVvU);
         GL11.glViewport(this.VVnVNnunVvu.uNNnnnuuuN[0], this.VVnVNnunVvu.uNNnnnuuuN[1], this.VVnVNnunVvu.uNNnnnuuuN[2], this.VVnVNnunVvu.uNNnnnuuuN[3]);
         GL11.glScissor(this.VVnVNnunVvu.VVuuUN[0], this.VVnVNnunVvu.VVuuUN[1], this.VVnVNnunVvu.VVuuUN[2], this.VVnVNnunVvu.VVuuUN[3]);
      }

      this.VVnVNnunVvu = null;
      this.c0oOOCcCoC0 = 0;
      this.UvUvUNuvNU.clear();
   }

   private void nuUnNvnuUu(int var1, int var2) {
      if (this.UNnVVNvvnVvU) {
         ARBInstancedArrays.glVertexAttribDivisorARB(var1, var2);
      } else {
         GL33.glVertexAttribDivisor(var1, var2);
      }
   }

   private static void UuUVuuUu(int var0, boolean var1) {
      if (var1) {
         GL11.glEnable(var0);
      } else {
         GL11.glDisable(var0);
      }
   }

   private static void VVuuUN(int var0, int var1) {
      float var2 = (var1 >>> 24 & 0xFF) / 255.0F;
      float var3 = (var1 >>> 16 & 0xFF) / 255.0F;
      float var4 = (var1 >>> 8 & 0xFF) / 255.0F;
      float var5 = (var1 & 0xFF) / 255.0F;
      GL20.glUniform4f(var0, var3, var4, var5, var2);
   }

   public void C00OOC00oO() {
      if (this.c0oOOCcCoC0 > 0) {
         if (this.unNNVVNnvvV > 0 && this.NuunnvnN > 0) {
            this.UvUvUNuvNU.limit(this.c0oOOCcCoC0 * 144);
            this.UvUvUNuvNU.position(0);
            int var1 = GL11.glGetInteger(34229);
            int var2 = GL11.glGetInteger(35725);
            GL30.glBindVertexArray(this.nNvNUVU);
            this.NnUuNNU.UuUVuuUu();
            GL20.glUniform2f(this.VUuuVUnun, this.unNNVVNnvvV, this.NuunnvnN);
            GL11.glViewport(0, 0, this.unNNVVNnvvV, this.NuunnvnN);
            this.UnUNVVVNuv();
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glColorMask(true, true, true, true);
            if (this.NVNnnvnuunNv) {
               GL15.glBindBuffer(37074, this.UnUNuUU);
               GL15.glBufferSubData(37074, 0L, this.UvUvUNuvNU);
               GL43.glBindBufferBase(37074, 0, this.UnUNuUU);
            } else {
               GL15.glBindBuffer(34962, this.uUVuVvuNUvnu);
               GL15.glBufferSubData(34962, 0L, this.UvUvUNuvNU);
               GL15.glBindBuffer(34962, 0);
            }

            int var3 = GL11.glGetInteger(34016);
            int var4 = this.vNnNuuvVn;

            for (int var5 = 0; var5 < var4; var5++) {
               GL13.glActiveTexture(33984 + var5);
               this.NVuunNnvvvVu[var5] = GL11.glGetInteger(32873);
               int var6 = this.NVuNUuVnVUN[var5];
               GL11.glBindTexture(3553, var6);
            }

            int var7 = Math.max(0, this.c0oOOCcCoC0);
            if (var7 > 0) {
               VUVuvNNVvN.UuUVuuUu().UuUVuuUu(var7);
            }

            if (this.NVNnnvnuunNv) {
               GL11.glDrawArrays(4, 0, this.c0oOOCcCoC0 * 3);
            } else if (this.uNnUnnuNUnNu) {
               ARBDrawInstanced.glDrawArraysInstancedARB(4, 0, 3, this.c0oOOCcCoC0);
            } else {
               GL31.glDrawArraysInstanced(4, 0, 3, this.c0oOOCcCoC0);
            }

            for (int var8 = 0; var8 < var4; var8++) {
               GL13.glActiveTexture(33984 + var8);
               GL11.glBindTexture(3553, this.NVuunNnvvvVu[var8]);
            }

            GL13.glActiveTexture(var3);
            GL30.glBindVertexArray(var1);
            GL20.glUseProgram(var2);
            this.c0oOOCcCoC0 = 0;
            this.UvUvUNuvNU.clear();
            this.VVuuUN();
         } else {
            this.c0oOOCcCoC0 = 0;
            this.UvUvUNuvNU.clear();
            this.VVuuUN();
         }
      }
   }

   public void UuUVuuUu(boolean var1) {
      this.vVnuVVvVNuNu = var1;
   }

   public void uUnuvNvvNU() {
      this.UnUNVVVNuv();
   }

   private void UnUNVVVNuv() {
      GL11.glEnable(3042);
      if (this.vVnuVVvVNuNu) {
         GL14.glBlendFuncSeparate(1, 1, 1, 771);
      } else {
         GL14.glBlendFuncSeparate(1, 771, 1, 771);
      }
   }

   public void C00OOC00oO(boolean var1) {
      this.vuvnUnVnUNnV = var1;
      if (!var1) {
         this.uUVVvVVNvvn = 0.0F;
         this.vvUVNVvvNUv = 0.0F;
         this.UuNnnVnuNNV = 0.0F;
         this.uUVvnUuNvvN = 0.0F;
      }
   }

   public void UuUVuuUu(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.nnuUVNUuvvVU = var1;
      this.nVVUuvuNnUN = var2;
      this.nNnVnUNVV = var3;
      this.nuunNvv = var4;
      this.uUVVvVVNvvn = var5;
      this.vvUVNVvvNUv = var6;
      this.UuNnnVnuNNV = var7;
      this.uUVvnUuNvvN = var8;
   }

   public void UuUVuuUu(float[] var1) {
   }

   public void UuUVuuUu(float var1, float var2) {
      if (!Float.isFinite(var1) || !Float.isFinite(var2)) {
         throw new IllegalArgumentException("Blur capture scale must be finite");
      } else if (!(var1 <= 0.0F) && !(var2 <= 0.0F)) {
         this.UvNNVUVNVuvV = var1;
         this.NnunUUnU = var2;
      } else {
         throw new IllegalArgumentException("Blur capture scale must be positive");
      }
   }

   private void UuUVuuUu(
      int var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float[] var15,
      float var16,
      float var17,
      float var18,
      float var19,
      int var20,
      float var21,
      float var22,
      int var23
   ) {
      if (this.c0oOOCcCoC0 >= 4096) {
         throw new IllegalStateException("Instance capacity exceeded without prior ensureInstanceCapacity call");
      } else {
         int var24 = this.c0oOOCcCoC0 * 144;
         this.UvUvUNuvNU.position(var24);
         UuUVuuUu(this.UvUvUNuvNU, var15, var2, var3, var4, var5);
         int var25 = this.vuvnUnVnUNnV ? this.nnuUVNUuvvVU : 0;
         int var26 = this.vuvnUnVnUNnV ? this.nVVUuvuNnUN : 0;
         int var27 = this.vuvnUnVnUNnV ? this.nNnVnUNVV : this.unNNVVNnvvV;
         int var28 = this.vuvnUnVnUNnV ? this.nuunNvv : this.NuunnvnN;
         float var29 = this.vuvnUnVnUNnV ? this.uUVVvVVNvvn : 0.0F;
         float var30 = this.vuvnUnVnUNnV ? this.vvUVNVvvNUv : 0.0F;
         float var31 = this.vuvnUnVnUNnV ? this.UuNnnVnuNNV : 0.0F;
         float var32 = this.vuvnUnVnUNnV ? this.uUVvnUuNvvN : 0.0F;
         this.UvUvUNuvNU.putInt(var25);
         this.UvUvUNuvNU.putInt(var26);
         this.UvUvUNuvNU.putInt(var27);
         this.UvUvUNuvNU.putInt(var28);
         this.UvUvUNuvNU.putFloat(var29);
         this.UvUvUNuvNU.putFloat(var30);
         this.UvUvUNuvNU.putFloat(var31);
         this.UvUvUNuvNU.putFloat(var32);
         this.UvUvUNuvNU.putFloat(var2);
         this.UvUvUNuvNU.putFloat(var3);
         this.UvUvUNuvNU.putFloat(var4);
         this.UvUvUNuvNU.putFloat(var5);
         this.UvUvUNuvNU.putInt(UuUVuuUu(var6));
         this.UvUvUNuvNU.putInt(UuUVuuUu(var7));
         this.UvUvUNuvNU.putInt(UuUVuuUu(var8));
         this.UvUvUNuvNU.putInt(UuUVuuUu(var9));
         float var33 = UuUVuuUu(var10);
         float var34 = UuUVuuUu(var11);
         float var35 = UuUVuuUu(var12);
         float var36 = UuUVuuUu(var13);
         this.UvUvUNuvNU.putFloat(var33);
         this.UvUvUNuvNU.putFloat(var34);
         this.UvUvUNuvNU.putFloat(var35);
         this.UvUvUNuvNU.putFloat(var36);
         this.UvUvUNuvNU.putFloat(var16);
         this.UvUvUNuvNU.putFloat(var17);
         this.UvUvUNuvNU.putFloat(var18);
         this.UvUvUNuvNU.putFloat(var19);
         int var37 = var1;
         if (var1 == 1 || var1 == 2) {
            int var38 = Math.max(0, Math.min(255, Math.round(var14)));
            var37 = var1 | var38 << 2;
         }

         if (var1 == 2) {
            float var44 = var21 % 360.0F;
            if (var44 < 0.0F) {
               var44 += 360.0F;
            }

            int var39 = Math.max(0, Math.min(255, Math.round(var44 / 360.0F * 255.0F)));
            float var40 = Math.max(0.0F, Math.min(1.0F, var22));
            int var41 = Math.max(0, Math.min(255, Math.round(var40 * 255.0F)));
            var37 |= var39 << 10;
            var37 |= var41 << 18;
         }

         if (var1 == 3 && var14 > 0.0F) {
            var37 |= 4;
         }

         var37 |= var23;
         this.UvUvUNuvNU.putInt(var37);
         this.UvUvUNuvNU.putInt(var20);
         this.UvUvUNuvNU.putInt(0);
         this.UvUvUNuvNU.putInt(0);
         this.c0oOOCcCoC0++;
      }
   }

   private static void UuUVuuUu(ByteBuffer var0, float[] var1, float var2, float var3, float var4, float var5) {
      float[] var6 = var1 != null && var1.length >= 6 ? var1 : uVUVnuvnuVuv;
      float var9 = var2 + var4;
      float var10 = var3 + var5;
      UuUVuuUu(var0, var6, var2, var3);
      UuUVuuUu(var0, var6, var9, var3);
      UuUVuuUu(var0, var6, var9, var10);
      UuUVuuUu(var0, var6, var2, var10);
   }

   private static void UuUVuuUu(ByteBuffer var0, float[] var1, float var2, float var3) {
      float var4 = var1[0] * var2 + var1[1] * var3 + var1[2];
      float var5 = var1[3] * var2 + var1[4] * var3 + var1[5];
      var0.putFloat(var4);
      var0.putFloat(var5);
   }

   private static void UuUVuuUu(float[] var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      var0[0] = var1;
      var0[1] = var2;
      var0[2] = 0.0F;
      var0[3] = 1.0F;
      var0[4] = var3;
      var0[5] = var4;
      var0[6] = 1.0F;
      var0[7] = 1.0F;
      var0[8] = var5;
      var0[9] = var6;
      var0[10] = 1.0F;
      var0[11] = 0.0F;
      var0[12] = var1;
      var0[13] = var2;
      var0[14] = 0.0F;
      var0[15] = 1.0F;
      var0[16] = var5;
      var0[17] = var6;
      var0[18] = 1.0F;
      var0[19] = 0.0F;
      var0[20] = var7;
      var0[21] = var8;
      var0[22] = 0.0F;
      var0[23] = 0.0F;
   }

   private static float UuUVuuUu(float[] var0, float var1, float var2) {
      return var0[0] * var1 + var0[1] * var2 + var0[2];
   }

   private static float C00OOC00oO(float[] var0, float var1, float var2) {
      return var0[3] * var1 + var0[4] * var2 + var0[5];
   }

   private static float UuUVuuUu(float var0) {
      if (!Float.isFinite(var0)) {
         return 0.0F;
      } else {
         return var0 <= 0.0F ? 0.0F : var0;
      }
   }

   private static float C00OOC00oO(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }

   private void UuUVuuUu(
      int var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      float var7,
      float var8,
      float[] var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      float var15,
      float var16
   ) {
      this.UuUVuuUu(
         var1, var2, var3, var4, var5, var6, var6, var6, var6, var7, var7, var7, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, 0
      );
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, float[] var10) {
      this.nuUnNvnuUu();
      this.UuUVuuUu(0, var1, var2, var3, var4, var9, var9, var9, var9, var5, var6, var7, var8, 0.0F, var10, 0.0F, 0.0F, 1.0F, 1.0F, -1, 0.0F, 1.0F, 0);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, float var10, float[] var11) {
      this.nuUnNvnuUu();
      this.UuUVuuUu(1, var1, var2, var3, var4, var9, var9, var9, var9, var5, var6, var7, var8, var10, var11, 0.0F, 0.0F, 1.0F, 1.0F, -1, 0.0F, 1.0F, 0);
   }

   public void UuUVuuUu(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, float[] var13
   ) {
      this.nuUnNvnuUu();
      this.UuUVuuUu(0, var1, var2, var3, var4, var9, var10, var11, var12, var5, var6, var7, var8, 0.0F, var13, 0.0F, 0.0F, 1.0F, 1.0F, -1, 0.0F, 1.0F, 0);
   }

   public void UuUVuuUu(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      float var12,
      float var13,
      boolean var14,
      int var15,
      float[] var16
   ) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var5, var5, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16);
   }

   public void UuUVuuUu(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      int var10,
      int var11,
      int var12,
      float var13,
      float var14,
      float var15,
      float var16,
      boolean var17,
      int var18,
      float[] var19
   ) {
      this.nuUnNvnuUu();
      int var20 = Math.max(0, Math.min(7, var18));
      int var21 = 134217728 | (var17 ? 268435456 : 0) | var20 << 29;
      this.UuUVuuUu(
         0, var1, var2, var3, var4, var9, var10, var12, var11, var5, var6, var7, var8, 0.0F, var19, var13, var14, var15, var16, -1, 0.0F, 1.0F, var21
      );
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, int var6, float[] var7) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, 0.0F, var6, var7);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, int var7, float[] var8) {
      float var9 = var3 * 2.0F;
      this.nuUnNvnuUu();
      this.UuUVuuUu(2, var1 - var3, var2 - var3, var9, var9, var7, 0.0F, var6, var8, 0.0F, 0.0F, 1.0F, 1.0F, -1, var4, var5);
   }

   public void UuUVuuUu(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, float[] var12
   ) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         float var13 = var9 > 0.0F ? var9 : 0.0F;
         float var14 = var10 > 0.0F ? var10 : 0.0F;
         float var15 = var14 + var13 * 3.0F;
         float var16 = var1 - var15;
         float var17 = var2 - var15;
         float var18 = var3 + var15 * 2.0F;
         float var19 = var4 + var15 * 2.0F;
         if (!(var18 <= 0.0F) && !(var19 <= 0.0F)) {
            this.nuUnNvnuUu();
            this.UuUVuuUu(
               0,
               var16,
               var17,
               var18,
               var19,
               var11,
               var11,
               var11,
               var11,
               var5,
               var6,
               var7,
               var8,
               0.0F,
               var12,
               var3,
               var4,
               Math.max(var13, 0.001F),
               var14,
               0,
               0.0F,
               1.0F,
               67108864
            );
         }
      }
   }

   public void UuUVuuUu(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float[] var11) {
      this.nuUnNvnuUu();
      int var12 = this.vVvUvVVuuNvV(var1);
      this.UuUVuuUu(3, var2, var3, var4, var5, var10, 0.0F, 0.0F, var11, var6, var7, var8, var9, var12, 0.0F, 1.0F);
   }

   public void UuUVuuUu(
      int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, float[] var12
   ) {
      this.nuUnNvnuUu();
      int var13 = this.vVvUvVVuuNvV(var1);
      this.UuUVuuUu(3, var2, var3, var4, var5, var11, var10, 0.0F, var12, var6, var7, var8, var9, var13, 0.0F, 1.0F);
   }

   public void C00OOC00oO(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float[] var11) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, false);
   }

   public void UuUVuuUu(
      int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float[] var11, boolean var12
   ) {
      this.nuUnNvnuUu();
      int var13 = this.vVvUvVVuuNvV(var1);
      int var14 = var12 ? 64 : 0;
      this.UuUVuuUu(
         3, var2, var3, var4, var5, var10, var10, var10, var10, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, var11, var6, var7, var8, var9, var13, 0.0F, 1.0F, var14
      );
   }

   public void C00OOC00oO(
      int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, float[] var12
   ) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, false);
   }

   public void UuUVuuUu(
      int var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      float[] var12,
      boolean var13
   ) {
      this.nuUnNvnuUu();
      int var14 = this.vVvUvVVuuNvV(var1);
      int var15 = var13 ? 64 : 0;
      this.UuUVuuUu(
         3, var2, var3, var4, var5, var11, var11, var11, var11, var10, var10, var10, var10, 1.0F, var12, var6, var7, var8, var9, var14, 0.0F, 1.0F, var15
      );
   }

   public void uUnuvNvvNU(
      int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, float[] var12
   ) {
      this.nuUnNvnuUu();
      this.C00OOC00oO(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, false);
   }

   public void C00OOC00oO(
      int var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      float[] var12,
      boolean var13
   ) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var10, var10, var10, var11, var12, var13);
   }

   public void UuUVuuUu(
      int var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      float[] var15,
      boolean var16
   ) {
      this.nuUnNvnuUu();
      int var17 = this.vVvUvVVuuNvV(var1);
      byte var18 = 8;
      if (var16) {
         var18 |= 32;
      }

      this.UuUVuuUu(
         3, var2, var3, var4, var5, var14, var14, var14, var14, var10, var11, var12, var13, 1.0F, var15, var6, var7, var8, var9, var17, 0.0F, 1.0F, var18
      );
   }

   public void uUnuvNvvNU(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float[] var11) {
      this.nuUnNvnuUu();
      int var12 = this.vVvUvVVuuNvV(var1);
      byte var13 = 8;
      this.UuUVuuUu(
         3, var2, var3, var4, var5, var10, var10, var10, var10, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, var11, var6, var7, var8, var9, var12, 0.0F, 1.0F, var13
      );
   }

   public void vVvUvVVuuNvV(
      int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, float[] var12
   ) {
      if (var1 > 0) {
         this.nuUnNvnuUu();
         int var13 = this.vVvUvVVuuNvV(var1);
         float var14 = var2 > 0.0F ? var2 : 0.001F;
         this.UuUVuuUu(
            3, var3, var4, var5, var6, var11, var11, var11, var11, var14, var14, var14, var14, 0.0F, var12, var7, var8, var9, var10, var13, 0.0F, 1.0F, 16
         );
      }
   }

   private int vVvUvVVuuNvV(int var1) {
      int var2 = this.UUuUnNVNuuv.get(var1);
      if (var2 >= 0) {
         return var2;
      } else {
         if (this.vNnNuuvVn >= 16) {
            this.C00OOC00oO();
            this.VVuuUN();
         }

         int var3 = this.vNnNuuvVn++;
         this.NVuNUuVnVUN[var3] = var1;
         this.UUuUnNVNuuv.put(var1, var3);
         return var3;
      }
   }

   public void UuUVuuUu(ByteBuffer var1, int var2) {
   }

   public int UuUVuuUu(int var1, int var2, ByteBuffer var3) {
      if (var1 <= 0 || var2 <= 0) {
         throw new IllegalArgumentException("Invalid MSDF texture dimensions: " + var1 + "x" + var2);
      } else if (var3 == null) {
         throw new IllegalArgumentException("data");
      } else {
         int var4 = GL11.glGetInteger(34016);
         int var5 = GL11.glGetInteger(32873);
         int var6 = GL11.glGetInteger(3317);
         int var7 = GL11.glGetInteger(3314);
         int var8 = GL11.glGenTextures();

         int var9;
         try {
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
            var3.rewind();
            GL11.glTexImage2D(3553, 0, 32856, var1, var2, 0, 6408, 5121, var3);
            var9 = var8;
         } finally {
            GL12.glPixelStorei(3314, var7);
            GL11.glPixelStorei(3317, var6);
            GL11.glBindTexture(3553, var5);
            GL13.glActiveTexture(var4);
         }

         return var9;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int vVvUvVVuuNvV(int var1, int var2) {
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
         o000OOoCO0OO.UuUVuuUu(33321, var1, var2, 6403, 5121);
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
   public void UuUVuuUu(int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      int var7 = GL11.glGetInteger(34016);
      int var8 = GL11.glGetInteger(32873);
      int var9 = GL11.glGetInteger(3317);
      int var10 = GL11.glGetInteger(3314);
      boolean var13 = false /* VF: Semaphore variable */;

      try {
         var13 = true;
         var6.order(ByteOrder.nativeOrder());
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, var1);
         GL11.glPixelStorei(3317, 1);
         GL12.glPixelStorei(3314, 0);
         GL11.glTexSubImage2D(3553, 0, var2, var3, var4, var5, 6403, 5121, var6);
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
   public void UuUVuuUu(int var1, int var2, int var3, int var4, int var5, ByteBuffer var6, int var7) {
      int var8 = GL11.glGetInteger(34016);
      int var9 = GL11.glGetInteger(32873);
      int var10 = GL11.glGetInteger(3317);
      int var11 = GL11.glGetInteger(3314);
      boolean var14 = false /* VF: Semaphore variable */;

      try {
         var14 = true;
         var6.order(ByteOrder.nativeOrder());
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, var1);
         GL11.glPixelStorei(3317, 1);
         GL12.glPixelStorei(3314, var7);
         GL11.glTexSubImage2D(3553, 0, var2, var3, var4, var5, 6403, 5121, var6);
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

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(int var1, int var2, boolean var3) {
      if (var1 > 0 && var2 > 0) {
         int var4 = var3 ? this.VuunNUUUvu : this.nvuVvuNnNUnv;
         int var5 = var3 ? this.ccOO0COcoco0 : this.OCOocoOoOO;
         int var6 = var3 ? this.NNUUNUuVNNVn : this.NnVnNVN;
         int var7 = var3 ? this.VvVvnNUnvuvV : this.vnvvNvUnVv;
         if (var4 == 0 || var5 == 0 || var1 != var6 || var2 != var7 || !GL11.glIsTexture(var4) || !GL30.glIsFramebuffer(var5)) {
            int var8 = 0;
            int var9 = 0;
            VvuuVNVUn.NVnVnNnN var10 = VvuuVNVUn.UuUVuuUu();
            boolean var15 = false /* VF: Semaphore variable */;

            try {
               var15 = true;
               var8 = GL11.glGenTextures();
               GL11.glBindTexture(3553, var8);
               GL11.glTexParameteri(3553, 10241, 9729);
               GL11.glTexParameteri(3553, 10240, 9729);
               GL11.glTexParameteri(3553, 10242, 33071);
               GL11.glTexParameteri(3553, 10243, 33071);
               o000OOoCO0OO.UuUVuuUu(32856, var1, var2, 6408, 5121);
               var9 = GL30.glGenFramebuffers();
               GL30.glBindFramebuffer(36160, var9);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, var8, 0);
               GL11.glDrawBuffer(36064);
               int var11 = GL30.glCheckFramebufferStatus(36160);
               if (var11 != 36053) {
                  throw new IllegalStateException("Capture FBO incomplete: status=" + var11);
               }

               var15 = false;
            } catch (Error | RuntimeException var16) {
               if (var9 != 0) {
                  GL30.glDeleteFramebuffers(var9);
               }

               if (var8 != 0) {
                  GL11.glDeleteTextures(var8);
               }

               throw var16;
            } finally {
               if (var15) {
                  VvuuVNVUn.uUnuvNvvNU(var10);
               }
            }

            VvuuVNVUn.uUnuvNvvNU(var10);
            if (var5 != 0) {
               GL30.glDeleteFramebuffers(var5);
            }

            if (var4 != 0) {
               GL11.glDeleteTextures(var4);
            }

            if (var3) {
               this.VuunNUUUvu = var8;
               this.ccOO0COcoco0 = var9;
               this.NNUUNUuVNNVn = var1;
               this.VvVvnNUnvuvV = var2;
            } else {
               this.nvuVvuNnNUnv = var8;
               this.OCOocoOoOO = var9;
               this.NnVnNVN = var1;
               this.vnvvNvUnVv = var2;
            }
         }
      } else {
         if (var3) {
            this.uUnuvNvvNU(true);
         } else {
            this.uUnuvNvvNU(false);
         }
      }
   }

   private void C00OOC00oO(vnuUvuuNVNUU.VvunVVUvUNnv var1, int var2, int var3, boolean var4) {
      if (var1 != null) {
         if (var2 > 0 && var3 > 0) {
            boolean var5 = var1.C00OOC00oO != 0 && var1.UuUVuuUu != 0;
            boolean var6 = var1.uUnuvNvvNU >= var2 && var1.vVvUvVVuuNvV >= var3;
            boolean var7 = var1.uUnuvNvvNU == var2 && var1.vVvUvVVuuNvV == var3;
            if (!var5 || (var4 ? !var6 : !var7)) {
               int var8 = var4 ? vUNUuVvunV.UuUVuuUu(var5 ? var1.uUnuvNvvNU : 0, var2) : var2;
               int var9 = var4 ? vUNUuVvunV.UuUVuuUu(var5 ? var1.vVvUvVVuuNvV : 0, var3) : var3;
               int var10 = 0;
               int var11 = 0;
               VvuuVNVUn.NVnVnNnN var12 = VvuuVNVUn.UuUVuuUu();

               try {
                  var10 = GL11.glGenTextures();
                  GL11.glBindTexture(3553, var10);
                  GL11.glTexParameteri(3553, 10241, 9729);
                  GL11.glTexParameteri(3553, 10240, 9729);
                  GL11.glTexParameteri(3553, 10242, 33071);
                  GL11.glTexParameteri(3553, 10243, 33071);
                  o000OOoCO0OO.UuUVuuUu(32856, var8, var9, 6408, 5121);
                  var11 = GL30.glGenFramebuffers();
                  GL30.glBindFramebuffer(36160, var11);
                  GL30.glFramebufferTexture2D(36160, 36064, 3553, var10, 0);
                  GL11.glDrawBuffer(36064);
                  GL11.glReadBuffer(36064);
                  int var13 = GL30.glCheckFramebufferStatus(36160);
                  if (var13 != 36053) {
                     throw new IllegalStateException("Layer framebuffer incomplete: status=" + var13);
                  }
               } catch (Error | RuntimeException var17) {
                  if (var11 != 0) {
                     GL30.glDeleteFramebuffers(var11);
                  }

                  if (var10 != 0) {
                     GL11.glDeleteTextures(var10);
                  }

                  throw var17;
               } finally {
                  VvuuVNVUn.uUnuvNvvNU(var12);
               }

               this.UuUVuuUu(var1);
               var1.C00OOC00oO = var10;
               var1.UuUVuuUu = var11;
               var1.uUnuvNvvNU = var8;
               var1.vVvUvVVuuNvV = var9;
            }
         } else {
            this.UuUVuuUu(var1);
         }
      }
   }

   private void UuUVuuUu(vnuUvuuNVNUU.VvunVVUvUNnv var1) {
      if (var1 != null) {
         if (var1.UuUVuuUu != 0) {
            GL30.glDeleteFramebuffers(var1.UuUVuuUu);
            var1.UuUVuuUu = 0;
         }

         if (var1.C00OOC00oO != 0) {
            GL11.glDeleteTextures(var1.C00OOC00oO);
            var1.C00OOC00oO = 0;
         }

         var1.uUnuvNvvNU = 0;
         var1.vVvUvVVuuNvV = 0;
      }
   }

   private void vNVuvnUUnuUn() {
      for (vnuUvuuNVNUU.VvunVVUvUNnv var2 : this.NNVNuUvVn) {
         this.UuUVuuUu(var2);
      }

      this.NNVNuUvVn.clear();
      this.vuNnuUnu = 0;
   }

   private void vNUvnnVnUvu(int var1, int var2) {
      this.UuUVuuUu(var1, var2, this.UvNNVUVNVuvV, this.NnunUUnU);
   }

   private void UuUVuuUu(int var1, int var2, float var3, float var4) {
      if (var1 <= 0 || var2 <= 0) {
         this.uVunuUNVVUUV();
      } else if (!Float.isFinite(var3) || !Float.isFinite(var4)) {
         throw new IllegalArgumentException("Blur capture scale must be finite");
      } else if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         int var5 = Math.max(1, var1);
         int var6 = Math.max(1, var2);
         int var7 = Math.max(1, Math.round(var5 * var3));
         int var8 = Math.max(1, Math.round(var6 * var4));
         if (this.NUVvUUVuVNVv == 0
            || this.UnvuVuVnNuvu == 0
            || var7 != this.nNuVunNUVu
            || var8 != this.UNvvunVVn
            || !GL11.glIsTexture(this.NUVvUUVuVNVv)
            || !GL30.glIsFramebuffer(this.UnvuVuVnNuvu)) {
            int var9 = 0;
            int var10 = 0;
            VvuuVNVUn.NVnVnNnN var11 = VvuuVNVUn.UuUVuuUu();

            try {
               var9 = GL11.glGenTextures();
               GL11.glBindTexture(3553, var9);
               GL11.glTexParameteri(3553, 10241, 9729);
               GL11.glTexParameteri(3553, 10240, 9729);
               GL11.glTexParameteri(3553, 10242, 33071);
               GL11.glTexParameteri(3553, 10243, 33071);
               o000OOoCO0OO.UuUVuuUu(32856, var7, var8, 6408, 5121);
               var10 = GL30.glGenFramebuffers();
               GL30.glBindFramebuffer(36160, var10);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, var9, 0);
               GL11.glDrawBuffer(36064);
               int var12 = GL30.glCheckFramebufferStatus(36160);
               if (var12 != 36053) {
                  throw new IllegalStateException("Downscaled capture FBO incomplete: status=" + var12);
               }
            } catch (Error | RuntimeException var16) {
               if (var10 != 0) {
                  GL30.glDeleteFramebuffers(var10);
               }

               if (var9 != 0) {
                  GL11.glDeleteTextures(var9);
               }

               throw var16;
            } finally {
               VvuuVNVUn.uUnuvNvvNU(var11);
            }

            if (this.UnvuVuVnNuvu != 0) {
               GL30.glDeleteFramebuffers(this.UnvuVuVnNuvu);
            }

            if (this.NUVvUUVuVNVv != 0) {
               GL11.glDeleteTextures(this.NUVvUUVuVNVv);
            }

            this.UnvuVuVnNuvu = var10;
            this.NUVvUUVuVNVv = var9;
            this.nNuVunNUVu = var7;
            this.UNvvunVVn = var8;
         }
      } else {
         throw new IllegalArgumentException("Blur capture scale must be positive");
      }
   }

   public int UuUVuuUu(int var1, int var2, int var3, int var4) {
      return this.UuUVuuUu(var1, var2, var3, var4, true);
   }

   public int UuUVuuUu(int var1, int var2, int var3, int var4, boolean var5) {
      if (var3 > 0 && var4 > 0 && this.unNNVVNnvvV > 0 && this.NuunnvnN > 0) {
         this.UuUVuuUu(var3, var4, var5);
         int var6 = var5 ? this.ccOO0COcoco0 : this.OCOocoOoOO;
         int var7 = var5 ? this.VuunNUUUvu : this.nvuVvuNnNUnv;
         if (var6 != 0 && var7 != 0) {
            int var8 = GL11.glGetInteger(36006);
            int var9 = Math.max(0, Math.min(var1, this.unNNVVNnvvV));
            int var10 = Math.max(0, Math.min(this.NuunnvnN, this.NuunnvnN - var2 - var4));
            int var11 = Math.min(var3, this.unNNVVNnvvV - var9);
            int var12 = Math.min(var4, this.NuunnvnN - var10);
            if (var11 > 0 && var12 > 0) {
               VvuuVNVUn.NVnVnNnN var13 = VvuuVNVUn.UuUVuuUu();

               byte var16;
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
                  UvnvNVnnnnNU();
                  GL30.glBlitFramebuffer(var9, var10, var9 + var11, var10 + var12, 0, 0, var3, var4, 16384, 9728);
                  if (GL11.glGetError() == 0) {
                     if (var14) {
                        GL11.glEnable(3089);
                     }

                     if (var15) {
                        GL11.glEnable(36281);
                     }

                     return var7;
                  }

                  var16 = 0;
               } finally {
                  VvuuVNVUn.uUnuvNvvNU(var13);
               }

               return var16;
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

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean UuUVuuUu(int var1, int var2, float var3) {
      if (var1 > 0 && var2 > 0) {
         float var4 = 1.0F;
         float var5 = 1.0F;
         float var6 = this.UvNNVUVNVuvV;
         float var7 = this.NnunUUnU;
         float var8 = this.vNUUvuuVU.C00OOC00oO();
         if (var3 > var8) {
            float var9 = this.vNUUvuuVU.UuUVuuUu();
            float var10 = Math.max(var3, var9);
            float var11 = var8 / var10;
            var11 = Math.max(var11, 0.2F);
            var4 = Math.min(var4, var11);
            var5 = Math.min(var5, var11);
         }

         var4 = Math.max(var4, var6);
         var5 = Math.max(var5, var7);
         this.UuUVuuUu(var1, var2, var4, var5);
         if (this.NUVvUUVuVNVv != 0 && this.UnvuVuVnNuvu != 0) {
            float var26 = (float)this.nNuVunNUVu / Math.max(1, var1);
            float var27 = (float)this.UNvvunVVn / Math.max(1, var2);
            VvuuVNVUn.NVnVnNnN var29 = VvuuVNVUn.UuUVuuUu();
            boolean var22 = false /* VF: Semaphore variable */;

            int var34;
            label145: {
               boolean var35;
               label157: {
                  try {
                     var22 = true;
                     boolean var12 = GL11.glIsEnabled(3089);
                     boolean var13 = GL11.glIsEnabled(36281);
                     if (var12) {
                        GL11.glDisable(3089);
                     }

                     if (var13) {
                        GL11.glDisable(36281);
                     }

                     boolean var14 = false;
                     class_310 var15 = class_310.method_1551();
                     if (var15 != null && var15.method_22683() != null && !var15.method_22683().method_65966()) {
                        class_276 var16 = var15.method_1522();
                        if (var16 != null && var16.method_30277() instanceof class_10868 var18) {
                           int var19 = var18.method_68427();
                           if (var19 > 0) {
                              if (this.nvvnUnUn == 0) {
                                 this.nvvnUnUn = GL30.glGenFramebuffers();
                              }

                              GL30.glBindFramebuffer(36008, this.nvvnUnUn);
                              GL30.glFramebufferTexture2D(36008, 36064, 3553, var19, 0);
                              GL11.glReadBuffer(36064);
                              var14 = GL30.glCheckFramebufferStatus(36008) == 36053;
                           }
                        }
                     }

                     if (!var14) {
                        this.UvNNNUvNnUUV = 0;
                        this.vVuNvnVUvvv = 0;
                        this.OCCc0co0OOC = 0;
                        this.unUvvVVVVUu = 1.0F;
                        this.nnUunUnNUN = 1.0F;
                        var34 = 0;
                        var22 = false;
                        break label145;
                     }

                     GL30.glBindFramebuffer(36009, this.UnvuVuVnNuvu);
                     GL11.glDrawBuffer(36064);
                     UvnvNVnnnnNU();
                     GL30.glBlitFramebuffer(0, 0, var1, var2, 0, 0, this.nNuVunNUVu, this.UNvvunVVn, 16384, 9729);
                     var34 = GL11.glGetError();
                     if (var34 != 0) {
                        UvnvNVnnnnNU();
                        GL30.glBlitFramebuffer(0, 0, var1, var2, 0, 0, this.nNuVunNUVu, this.UNvvunVVn, 16384, 9728);
                        var34 = GL11.glGetError();
                     }

                     if (var34 != 0) {
                        this.UvNNNUvNnUUV = 0;
                        this.vVuNvnVUvvv = 0;
                        this.OCCc0co0OOC = 0;
                        this.unUvvVVVVUu = 1.0F;
                        this.nnUunUnNUN = 1.0F;
                        var35 = false;
                        var22 = false;
                        break label157;
                     }

                     if (var12) {
                        GL11.glEnable(3089);
                     }

                     if (var13) {
                        GL11.glEnable(36281);
                        var22 = false;
                     } else {
                        var22 = false;
                     }
                  } finally {
                     if (var22) {
                        VvuuVNVUn.uUnuvNvvNU(var29);
                     }
                  }

                  VvuuVNVUn.uUnuvNvvNU(var29);
                  float var30 = (float)Math.sqrt(Math.max(0.0F, var26) * Math.max(0.0F, var27));
                  float var31 = Math.max(0.0F, var3) * var30;
                  int var32 = this.vNUUvuuVU.UuUVuuUu(this.NUVvUUVuVNVv, this.nNuVunNUVu, this.UNvvunVVn, var31);
                  if (var32 == 0) {
                     this.UvNNNUvNnUUV = 0;
                     this.vVuNvnVUvvv = 0;
                     this.OCCc0co0OOC = 0;
                     this.unUvvVVVVUu = 1.0F;
                     this.nnUunUnNUN = 1.0F;
                     return false;
                  }

                  this.UvNNNUvNnUUV = var32;
                  this.vVuNvnVUvvv = this.nNuVunNUVu;
                  this.OCCc0co0OOC = this.UNvvunVVn;
                  this.unUvvVVVVUu = var26;
                  this.nnUunUnNUN = var27;
                  return true;
               }

               VvuuVNVUn.uUnuvNvvNU(var29);
               return var35;
            }

            VvuuVNVUn.uUnuvNvvNU(var29);
            return (boolean)var34;
         } else {
            this.UvNNNUvNnUUV = 0;
            this.vVuNvnVUvvv = 0;
            this.OCCc0co0OOC = 0;
            this.unUvvVVVVUu = 1.0F;
            this.nnUunUnNUN = 1.0F;
            return false;
         }
      } else {
         this.UvNNNUvNnUUV = 0;
         this.vVuNvnVUvvv = 0;
         this.OCCc0co0OOC = 0;
         this.unUvvVVVVUu = 1.0F;
         this.nnUunUnNUN = 1.0F;
         return false;
      }
   }

   private static void UvnvNVnnnnNU() {
      while (GL11.glGetError() != 0) {
      }
   }

   public boolean UuUVuuUu(int var1, int var2, int var3, int var4, float var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.UuUVuuUu(var1, var2, var3, var4, false);
         if (var6 <= 0) {
            this.UNuUVVuUuU = 0;
            this.VNvuVnvnun = 0;
            this.unVVnuunNU = 0;
            this.NunnVUUuvUV = 0;
            this.nVUNnUuU = 0;
            return false;
         } else {
            int var7 = this.unNuVNVUnV.UuUVuuUu(var6, var3, var4, var5);
            this.UNuUVVuUuU = var7;
            this.VNvuVnvnun = var3;
            this.unVVnuunNU = var4;
            this.NunnVUUuvUV = var1;
            this.nVUNnUuU = var2;
            return var7 != 0;
         }
      } else {
         this.UNuUVVuUuU = 0;
         this.VNvuVnvnun = 0;
         this.unVVnuunNU = 0;
         this.NunnVUUuvUV = 0;
         this.nVUNnUuU = 0;
         return false;
      }
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float[] var7) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var5, var5, var5, var6, var7);
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float[] var10) {
      if (this.UvNNNUvNnUUV != 0) {
         this.nuUnNvnuUu();
         int var11 = (int)(Math.max(0.0F, Math.min(1.0F, var9)) * 255.0F) << 24 | 16777215;
         float var12 = this.vVuNvnVUvvv > 0 ? this.unUvvVVVVUu / this.vVuNvnVUvvv : 0.0F;
         float var13 = this.OCCc0co0OOC > 0 ? -this.nnUunUnNUN / this.OCCc0co0OOC : 0.0F;
         float var14 = 0.0F;
         float var15 = this.OCCc0co0OOC > 0 ? 1.0F : 0.0F;
         this.UuUVuuUu(this.UvNNNUvNnUUV, var1, var2, var3, var4, var12, var13, var14, var15, var5, var6, var7, var8, var11, var10, true);
      }
   }

   public boolean UuUVuuUu(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      float var10,
      int var11,
      float var12,
      float[] var13
   ) {
      if (this.UvNNNUvNnUUV == 0) {
         return false;
      } else {
         this.nuUnNvnuUu();
         int var14 = this.vVvUvVVuuNvV(this.UvNNNUvNnUUV);
         int var15 = Math.round(C00OOC00oO(var10) * 255.0F) << 24 | var9 & 16777215;
         int var16 = Math.round(C00OOC00oO(var12) * 255.0F) << 24 | var9 & 16777215;
         float var17 = this.vVuNvnVUvvv > 0 ? this.unUvvVVVVUu / this.vVuNvnVUvvv : 0.0F;
         float var18 = this.OCCc0co0OOC > 0 ? -this.nnUunUnNUN / this.OCCc0co0OOC : 0.0F;
         float var19 = this.OCCc0co0OOC > 0 ? 1.0F : 0.0F;
         short var20 = 168;
         this.UuUVuuUu(
            3, var1, var2, var3, var4, var9, var11, var16, var15, var5, var6, var7, var8, 1.0F, var13, var17, var18, 0.0F, var19, var14, 0.0F, 1.0F, var20
         );
         return true;
      }
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float[] var7, int var8, int var9, int var10, int var11) {
      if (this.UNuUVVuUuU != 0) {
         if (var10 > 0 && var11 > 0) {
            if (this.VNvuVnvnun == var10 && this.unVVnuunNU == var11 && this.NunnVUUuvUV == var8 && this.nVUNnUuU == var9) {
               this.nuUnNvnuUu();
               int var12 = (int)(Math.max(0.0F, Math.min(1.0F, var6)) * 255.0F) << 24 | 16777215;
               float var13 = 0.0F;
               float var14 = 1.0F;
               float var15 = 1.0F;
               float var16 = 0.0F;
               this.C00OOC00oO(this.UNuUVVuUuU, var1, var2, var3, var4, var13, var14, var15, var16, var5, var12, var7, false);
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public vnuUvuuNVNUU.NVnVnNnN vVvUvVVuuNvV() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.method_22683() != null && !var1.method_22683().method_65966()) {
         class_276 var2 = var1.method_1522();
         if (var2 == null) {
            return new vnuUvuuNVNUU.NVnVnNnN(0, 0, 0, 0);
         } else if (var2.method_30277() instanceof class_10868 var4) {
            int var5 = var4.method_68427();
            if (var5 <= 0) {
               return new vnuUvuuNVNUU.NVnVnNnN(0, 0, 0, 0);
            } else {
               int var6 = var1.method_22683().method_4489();
               int var7 = var1.method_22683().method_4506();
               if (var6 > 0 && var7 > 0 && var2.field_1482 > 0 && var2.field_1481 > 0) {
                  this.o0Ooc0COOoc.UuUVuuUu(var6, var7);
                  if (this.o0Ooc0COOoc.UuUVuuUu != 0 && this.o0Ooc0COOoc.C00OOC00oO != 0 && this.o0Ooc0COOoc.uUnuvNvvNU != 0) {
                     this.vNUvnnVnUvu();
                     vVvUNNUVVnNn var8 = this.uVUuuVnNVU();
                     VvuuVNVUn.NVnVnNnN var9 = VvuuVNVUn.UuUVuuUu();
                     boolean var13 = false /* VF: Semaphore variable */;

                     vnuUvuuNVNUU.NVnVnNnN var15;
                     label99: {
                        label98: {
                           try {
                              var13 = true;
                              GL30.glBindFramebuffer(36160, this.o0Ooc0COOoc.UuUVuuUu);
                              GL11.glDrawBuffer(36064);
                              if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                 var15 = new vnuUvuuNVNUU.NVnVnNnN(0, 0, 0, 0);
                                 var13 = false;
                                 break label99;
                              }

                              GL11.glViewport(0, 0, var6, var7);
                              GL11.glDisable(3089);
                              GL11.glDisable(2884);
                              GL11.glDisable(3042);
                              GL11.glDisable(2929);
                              GL11.glDisable(36281);
                              GL11.glColorMask(true, true, true, true);
                              GL11.glDepthMask(false);
                              UvnvNVnnnnNU();
                              var8.UuUVuuUu();
                              if (this.VunnVNvNV >= 0) {
                                 GL20.glUniform1i(this.VunnVNvNV, 0);
                              }

                              GL13.glActiveTexture(33984);
                              GL11.glBindTexture(3553, var5);
                              GL30.glBindVertexArray(this.UnUUVuVunvVu);
                              VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
                              GL11.glDrawArrays(4, 0, 6);
                              GL30.glBindVertexArray(0);
                              if (GL11.glGetError() != 0) {
                                 var15 = new vnuUvuuNVNUU.NVnVnNnN(0, 0, 0, 0);
                                 var13 = false;
                                 break label98;
                              }

                              var13 = false;
                           } finally {
                              if (var13) {
                                 GL13.glActiveTexture(33984);
                                 GL11.glBindTexture(3553, 0);
                                 GL20.glUseProgram(0);
                                 VvuuVNVUn.uUnuvNvvNU(var9);
                              }
                           }

                           GL13.glActiveTexture(33984);
                           GL11.glBindTexture(3553, 0);
                           GL20.glUseProgram(0);
                           VvuuVNVUn.uUnuvNvvNU(var9);
                           return new vnuUvuuNVNUU.NVnVnNnN(this.o0Ooc0COOoc.C00OOC00oO, 0, var6, var7);
                        }

                        GL13.glActiveTexture(33984);
                        GL11.glBindTexture(3553, 0);
                        GL20.glUseProgram(0);
                        VvuuVNVUn.uUnuvNvvNU(var9);
                        return var15;
                     }

                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, 0);
                     GL20.glUseProgram(0);
                     VvuuVNVUn.uUnuvNvvNU(var9);
                     return var15;
                  } else {
                     return new vnuUvuuNVNUU.NVnVnNnN(0, 0, 0, 0);
                  }
               } else {
                  return new vnuUvuuNVNUU.NVnVnNnN(0, 0, 0, 0);
               }
            }
         } else {
            return new vnuUvuuNVNUU.NVnVnNnN(0, 0, 0, 0);
         }
      } else {
         return new vnuUvuuNVNUU.NVnVnNnN(0, 0, 0, 0);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(int var1, int var2, int var3) {
      if (var1 > 0 && var2 > 0 && var3 > 0) {
         this.vNUvnnVnUvu();
         vVvUNNUVVnNn var4 = this.uVUuuVnNVU();
         VvuuVNVUn.NVnVnNnN var5 = VvuuVNVUn.UuUVuuUu();
         boolean var8 = false /* VF: Semaphore variable */;

         try {
            var8 = true;
            GL30.glBindFramebuffer(36160, 0);
            GL11.glViewport(0, 0, var2, var3);
            GL11.glDisable(3089);
            GL11.glDisable(2884);
            GL11.glDisable(2929);
            GL11.glDisable(3042);
            GL11.glDisable(36281);
            var4.UuUVuuUu();
            if (this.VunnVNvNV >= 0) {
               GL20.glUniform1i(this.VunnVNvNV, 0);
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, var1);
            GL30.glBindVertexArray(this.UnUUVuVunvVu);
            VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
            GL11.glDrawArrays(4, 0, 6);
            GL30.glBindVertexArray(0);
            var8 = false;
         } finally {
            if (var8) {
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var5);
            }
         }

         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, 0);
         GL20.glUseProgram(0);
         VvuuVNVUn.uUnuvNvvNU(var5);
      }
   }

   public void UuUVuuUu(int var1, int var2, int var3, vVvUNNUVVnNn var4, Runnable var5, boolean var6) {
      if (var1 > 0 && var2 > 0 && var3 > 0 && var4 != null) {
         this.vNUvnnVnUvu();
         VvuuVNVUn.NVnVnNnN var7 = VvuuVNVUn.UuUVuuUu();

         try {
            int var8 = GL11.glGetInteger(36006);
            GL30.glBindFramebuffer(36009, var8);
            GL11.glViewport(0, 0, var2, var3);
            GL11.glDisable(3089);
            GL11.glDisable(2884);
            GL11.glDisable(2929);
            if (var6) {
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
            } else {
               GL11.glDisable(3042);
            }

            GL11.glDisable(36281);
            var4.UuUVuuUu();
            if (var5 != null) {
               var5.run();
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, var1);
            GL30.glBindVertexArray(this.UnUUVuVunvVu);
            VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
            GL11.glDrawArrays(4, 0, 6);
            GL30.glBindVertexArray(0);
         } finally {
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            GL20.glUseProgram(0);
            VvuuVNVUn.uUnuvNvvNU(var7);
         }
      }
   }

   public void uNNnnnuuuN(int var1, int var2) {
      if (!this.uNVvVvUuuuU) {
         if (var1 > 0 && var2 > 0) {
            if (var1 != this.NVUunUNUN || var2 != this.UUVNuUNUvUnV) {
               this.NVUunUNUN = var1;
               this.UUVNuUNUvUnV = var2;
               this.uVUVnuvnuVuv();
            }
         } else {
            this.unNNVVNnvvV = 0;
            this.NuunnvnN = 0;
            this.NVUunUNUN = -1;
            this.UUVNuUNUvUnV = -1;
            this.uVUVnuvnuVuv();
         }
      }
   }

   private void uVUVnuvnuVuv() {
      this.NVNnnvnuunNv();
      this.uUnuvNvvNU(true);
      this.uUnuvNvvNU(false);
      this.uVunuUNVVUUV();
      this.UuUVuuUu(this.NvUVUvVVnUu);
      this.vNVuvnUUnuUn();
      this.o0Ooc0COOoc.UuUVuuUu();
      this.vNUUvuuVU.vVvUvVVuuNvV();
      this.unNuVNVUnV.vVvUvVVuuNvV();
      if (this.nvvnUnUn != 0) {
         GL30.glDeleteFramebuffers(this.nvvnUnUn);
         this.nvvnUnUn = 0;
      }
   }

   private void NVNnnvnuunNv() {
      this.UvNNNUvNnUUV = 0;
      this.vVuNvnVUvvv = 0;
      this.OCCc0co0OOC = 0;
      this.unUvvVVVVUu = 1.0F;
      this.nnUunUnNUN = 1.0F;
      this.UNuUVVuUuU = 0;
      this.NunnVUUuvUV = 0;
      this.nVUNnUuU = 0;
      this.VNvuVnvnun = 0;
      this.unVVnuunNU = 0;
   }

   private void uUnuvNvvNU(boolean var1) {
      if (var1) {
         if (this.ccOO0COcoco0 != 0) {
            GL30.glDeleteFramebuffers(this.ccOO0COcoco0);
            this.ccOO0COcoco0 = 0;
         }

         if (this.VuunNUUUvu != 0) {
            GL11.glDeleteTextures(this.VuunNUUUvu);
            this.VuunNUUUvu = 0;
         }

         this.NNUUNUuVNNVn = 0;
         this.VvVvnNUnvuvV = 0;
      } else {
         if (this.OCOocoOoOO != 0) {
            GL30.glDeleteFramebuffers(this.OCOocoOoOO);
            this.OCOocoOoOO = 0;
         }

         if (this.nvuVvuNnNUnv != 0) {
            GL11.glDeleteTextures(this.nvuVvuNnNUnv);
            this.nvuVvuNnNUnv = 0;
         }

         this.NnVnNVN = 0;
         this.vnvvNvUnVv = 0;
      }
   }

   private void uVunuUNVVUUV() {
      if (this.UnvuVuVnNuvu != 0) {
         GL30.glDeleteFramebuffers(this.UnvuVuVnNuvu);
         this.UnvuVuVnNuvu = 0;
      }

      if (this.NUVvUUVuVNVv != 0) {
         GL11.glDeleteTextures(this.NUVvUUVuVNVv);
         this.NUVvUUVuVNVv = 0;
      }

      this.nNuVunNUVu = 0;
      this.UNvvunVVn = 0;
   }

   public void uNNnnnuuuN() {
      if (!this.uNVvVvUuuuU) {
         this.uNVvVvUuuuU = true;
         this.vNUUvuuVU.uUnuvNvvNU();
         this.unNuVNVUnV.uUnuvNvvNU();
         this.o0Ooc0COOoc.UuUVuuUu();
         if (this.nvvnUnUn != 0) {
            GL30.glDeleteFramebuffers(this.nvvnUnUn);
            this.nvvnUnUn = 0;
         }

         if (this.UnUUVuVunvVu != 0) {
            GL30.glDeleteVertexArrays(this.UnUUVuVunvVu);
            this.UnUUVuVunvVu = 0;
         }

         if (this.nnvuvUNuUnN != 0) {
            GL15.glDeleteBuffers(this.nnvuvUNuUnN);
            this.nnvuvUNuUnN = 0;
         }

         if (this.unnUnUNVnN != 0) {
            GL30.glDeleteVertexArrays(this.unnUnUNVnN);
            this.unnUnUNVnN = 0;
         }

         if (this.NnuUnUNnu != 0) {
            GL15.glDeleteBuffers(this.NnuUnUNnu);
            this.NnuUnUNnu = 0;
         }

         if (this.uuvvuNvuUNVV != 0) {
            GL30.glDeleteVertexArrays(this.uuvvuNvuUNVV);
            this.uuvvuNvuUNVV = 0;
         }

         if (this.uVvunVUNuUvu != 0) {
            GL15.glDeleteBuffers(this.uVvunVUNuUvu);
            this.uVvunVUNuUvu = 0;
         }

         this.UuUVuuUu(this.NvUVUvVVnUu);
         this.vNVuvnUUnuUn();
         if (this.ccOO0COcoco0 != 0) {
            GL30.glDeleteFramebuffers(this.ccOO0COcoco0);
            this.ccOO0COcoco0 = 0;
         }

         if (this.VuunNUUUvu != 0) {
            GL11.glDeleteTextures(this.VuunNUUUvu);
            this.VuunNUUUvu = 0;
         }

         this.NNUUNUuVNNVn = 0;
         this.VvVvnNUnvuvV = 0;
         if (this.UnvuVuVnNuvu != 0) {
            GL30.glDeleteFramebuffers(this.UnvuVuVnNuvu);
            this.UnvuVuVnNuvu = 0;
         }

         if (this.NUVvUUVuVNVv != 0) {
            GL11.glDeleteTextures(this.NUVvUUVuVNVv);
            this.NUVvUUVuVNVv = 0;
         }

         this.nNuVunNUVu = 0;
         this.UNvvunVVn = 0;
         if (this.OCOocoOoOO != 0) {
            GL30.glDeleteFramebuffers(this.OCOocoOoOO);
            this.OCOocoOoOO = 0;
         }

         if (this.nvuVvuNnNUnv != 0) {
            GL11.glDeleteTextures(this.nvuVvuNnNUnv);
            this.nvuVvuNnNUnv = 0;
         }

         this.NnVnNVN = 0;
         this.vnvvNvUnVv = 0;
         this.UvNNNUvNnUUV = 0;
         this.vVuNvnVUvvv = 0;
         this.OCCc0co0OOC = 0;
         this.unUvvVVVVUu = 1.0F;
         this.nnUunUnNUN = 1.0F;
         this.UNuUVVuUuU = 0;
         this.VNvuVnvnun = 0;
         this.unVVnuunNU = 0;
         this.NunnVUUuvUV = 0;
         this.nVUNnUuU = 0;
         this.VVuuUN();
         GL30.glBindVertexArray(0);
         GL20.glUseProgram(0);
         if (this.nNvNUVU != 0) {
            GL30.glDeleteVertexArrays(this.nNvNUVU);
         }

         if (this.UnUNuUU != 0) {
            GL15.glDeleteBuffers(this.UnUNuUU);
         }

         if (this.uUVuVvuNUvnu != 0) {
            GL15.glDeleteBuffers(this.uUVuVvuNUvnu);
         }

         this.NnUuNNU.C00OOC00oO();
         if (this.UVnuVUUVnnU != null) {
            this.UVnuVUUVnnU.C00OOC00oO();
            this.UVnuVUUVnnU = null;
         }

         if (this.UnnnvvU != null) {
            this.UnnnvvU.C00OOC00oO();
            this.UnnnvvU = null;
         }

         if (this.NVNnnvVnvV != null) {
            this.NVNnnvVnvV.C00OOC00oO();
            this.NVNnnvVnvV = null;
         }

         if (this.NuvunVvnnN != null) {
            this.NuvunVvnnN.C00OOC00oO();
            this.NuvunVvnnN = null;
         }

         if (this.uUuuVvVunVVu != null) {
            this.uUuuVvVunVVu.C00OOC00oO();
            this.uUuuVvVunVVu = null;
         }

         if (this.NvNvVNUv != null) {
            this.NvNvVNUv.free();
            this.NvNvVNUv = null;
         }
      }
   }

   private void UuUVuuUu(GLCapabilities var1) {
      if (this.NvNvVNUv == null) {
         this.NvNvVNUv = GLDebugMessageCallback.create((var0, var1x, var2, var3, var4, var5, var7) -> {
            if (var3 != 33387 && var3 != 37192) {
               long var9 = System.currentTimeMillis();
               Long var11 = nvnUvvnUUN.get(var2);
               if (var11 == null || var9 - var11 >= 5000L) {
                  nvnUvvnUUN.put(var2, var9);
                  long var12 = uuuvuUUNVVUN.get();
                  if (var9 - var12 > 1000L) {
                     uuuvuUUNVVUN.set(var9);
                     VnUvVu.set(0);
                  }

                  if (VnUvVu.incrementAndGet() <= 8) {
                     String var14 = GLDebugMessageCallback.getMessage(var4, var5);
                     System.err.println("[OpenGL] " + var14 + " (severity=" + uNNnnnuuuN(var3) + ")");
                  }
               }
            }
         });
         if (var1.OpenGL43) {
            GL11.glEnable(37600);
            GL43.glDebugMessageCallback(this.NvNvVNUv, 0L);
            GL43.glDebugMessageControl(4352, 4352, 33387, (int[])null, false);
            GL43.glDebugMessageControl(4352, 4352, 37192, (int[])null, false);
         } else {
            GL11.glEnable(37600);
            KHRDebug.glDebugMessageCallback(this.NvNvVNUv, 0L);
            KHRDebug.glDebugMessageControl(4352, 4352, 33387, (int[])null, false);
            KHRDebug.glDebugMessageControl(4352, 4352, 37192, (int[])null, false);
         }
      }
   }

   private static String uNNnnnuuuN(int var0) {
      return switch (var0) {
         case 33387 -> "NOTIFICATION";
         case 37190 -> "HIGH";
         case 37191 -> "MEDIUM";
         case 37192 -> "LOW";
         default -> Integer.toString(var0);
      };
   }

   public record NVnVnNnN(int colorTexture, int depthTexture, int width, int height) {
   }

   static final class VvunVVUvUNnv {
      int UuUVuuUu;
      int C00OOC00oO;
      int uUnuvNvvNU;
      int vVvUvVVuuNvV;
      final VvuuVNVUn.NVnVnNnN uNNnnnuuuN = new VvuuVNVUn.NVnVnNnN();
      final vnuUvuuNVNUU.nvnNNunvv nuUnNvnuUu = new vnuUvuuNVNUU.nvnNNunvv();
   }

   public static final class nvnNNunvv {
      private int UuUVuuUu;
      private int C00OOC00oO;
      private int uUnuvNvvNU;
      private int vVvUvVVuuNvV;
      private int uNNnnnuuuN;
      private VvuuVNVUn.NVnVnNnN nuUnNvnuUu;
      private int VVuuUN;
      private int vNUvnnVnUvu;
      private boolean uVUuuVnNVU;
      private int vuuuNvNuv;
      private int nvUVNnuu;
      private int UuuNnUvUuv;
      private int nUUVuvU;
      private float UnUNVVVNuv;
      private float vNVuvnUUnuUn;
      private float UvnvNVnnnnNU;
      private float uVUVnuvnuVuv;
      private boolean NVNnnvnuunNv;
      private boolean uVunuUNVVUUV;

      vnuUvuuNVNUU.nvnNNunvv UuUVuuUu(
         int var1,
         int var2,
         int var3,
         int var4,
         int var5,
         VvuuVNVUn.NVnVnNnN var6,
         int var7,
         int var8,
         boolean var9,
         int var10,
         int var11,
         int var12,
         int var13,
         float var14,
         float var15,
         float var16,
         float var17,
         boolean var18,
         boolean var19
      ) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
         this.vNUvnnVnUvu = var8;
         this.uVUuuVnNVU = var9;
         this.vuuuNvNuv = var10;
         this.nvUVNnuu = var11;
         this.UuuNnUvUuv = var12;
         this.nUUVuvU = var13;
         this.UnUNVVVNuv = var14;
         this.vNVuvnUUnuUn = var15;
         this.UvnvNVnnnnNU = var16;
         this.uVUVnuvnuVuv = var17;
         this.NVNnnvnuunNv = var18;
         this.uVunuUNVVUUV = var19;
         return this;
      }

      public int UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public int C00OOC00oO() {
         return this.C00OOC00oO;
      }

      public int uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      public int vVvUvVVuuNvV() {
         return this.vVvUvVVuuNvV;
      }

      public int uNNnnnuuuN() {
         return this.uNNnnnuuuN;
      }

      public VvuuVNVUn.NVnVnNnN nuUnNvnuUu() {
         return this.nuUnNvnuUu;
      }

      public int VVuuUN() {
         return this.VVuuUN;
      }

      public int vNUvnnVnUvu() {
         return this.vNUvnnVnUvu;
      }

      public boolean uVUuuVnNVU() {
         return this.uVUuuVnNVU;
      }

      public int vuuuNvNuv() {
         return this.vuuuNvNuv;
      }

      public int nvUVNnuu() {
         return this.nvUVNnuu;
      }

      public int UuuNnUvUuv() {
         return this.UuuNnUvUuv;
      }

      public int nUUVuvU() {
         return this.nUUVuvU;
      }

      public float UnUNVVVNuv() {
         return this.UnUNVVVNuv;
      }

      public float vNVuvnUUnuUn() {
         return this.vNVuvnUUnuUn;
      }

      public float UvnvNVnnnnNU() {
         return this.UvnvNVnnnnNU;
      }

      public float uVUVnuvnuVuv() {
         return this.uVUVnuvnuVuv;
      }

      public boolean NVNnnvnuunNv() {
         return this.NVNnnvnuunNv;
      }

      public boolean uVunuUNVVUUV() {
         return this.uVunuUNVVUUV;
      }
   }
}
