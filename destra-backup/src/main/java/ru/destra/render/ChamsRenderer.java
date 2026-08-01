package ru.destra.render;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Consumer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.GlUsage;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.gl.VertexBuffer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec2f;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import ru.destra.core.DestraClient;
import ru.destra.gui.Theme2DManager;
import ru.destra.module.ChamsModule;
import ru.destra.util.NamedColor;
import ru.destra.util.WorldToScreenUtil;

public final class ChamsRenderer {
   private static ShaderProgram bloomChamsSP;
   private static ShaderProgram gaussianBlurSP;
   private static ShaderProgram nebulaSP;
   private static ShaderProgram cosmosSP;
   private static ShaderProgram gyroidSP;
   private static ShaderProgram fresnelSP;
   private static ShaderProgram cloudsSP;
   private static SimpleFramebuffer sourceCaptureFbo;
   private static SimpleFramebuffer blurHorizFbo;
   private static SimpleFramebuffer blurVertFbo;
   private static SimpleFramebuffer depthCopyFbo;
   private static SimpleFramebuffer entityScissorFbo;
   private static SimpleFramebuffer blurOutputFbo;
   private static Framebuffer mainFbo;
   private static VertexBuffer fullscreenQuadVbo;
   private static BufferAllocator bufferAllocator;
   private static Immediate immediateProvider;
   private static boolean isEntityPassActive = false;
   private static boolean isSceneCaptured = false;
   private static boolean isEntityPassEnded = false;
   private static boolean isChamsDrawn = false;
   private static boolean isShadersInitialized = false;
   private static boolean isBufferFlushPending = false;
   private static boolean isScissorPassActive = false;
   private static boolean isDepthCopyDone = false;
   private static boolean isBlurOutputInitialized = false;
   private static boolean isPendingReinit = false;
   private static boolean isDisabled = false;
   private static int skipFramesRemaining = 0;
   private static int lastFboId = 1;
   private static int lastColorAttachment = 1;
   private static int lastDepthAttachment = 2;
   private static volatile long lastInitAttemptTime = 0L;
   private static volatile long lastErrorLogTime = 0L;
   private static final long INIT_TIME_BASE = 0L;
   private static final int RESET_FBO_SENTINEL = Integer.MIN_VALUE;
   private static final int RESET_COLOR_SENTINEL = Integer.MIN_VALUE;
   private static final int RESET_DEPTH_SENTINEL = Integer.MIN_VALUE;
   private static final double BOUNDING_BOX_EXPAND = 0.35;
   private static final float SENTINEL_FLOAT_MAX_X = Float.MAX_VALUE;
   private static final float SENTINEL_FLOAT_MAX_Y = Float.MAX_VALUE;
   private static final float TIME_DIVISOR_MS = 1000.0F;
   private static final int TEX_UNIT_0_COMPOSITE = 33984;
   private static final int TEX_UNIT_1_COMPOSITE = 33985;
   private static final int TEX_UNIT_BASE_COMPOSITE = 33984;
   private static final String UNIFORM_TEXTURE0 = "texture0";
   private static final String UNIFORM_IMAGE = "image";
   private static final String UNIFORM_USE_IMAGE = "useImage";
   private static final String UNIFORM_TIME = "time";
   private static final float MIN_THICKNESS = 0.01F;
   private static final String UNIFORM_THICKNESS = "thickness";
   private static final String UNIFORM_QUALITY = "quality";
   private static final String UNIFORM_RESOLUTION = "resolution";
   private static final float COLOR_NORM_R = 255.0F;
   private static final float COLOR_NORM_G = 255.0F;
   private static final float COLOR_NORM_B = 255.0F;
   private static final float COLOR_NORM_A = 255.0F;
   private static final String UNIFORM_OUTLINE_COLOR = "outlineColor";
   private static final int д9 = 33984;
   private static final int ды = 33985;
   private static final int до = 33984;
   private static final int д0 = 33985;
   private static final int дс = 33986;
   private static final int дх = 33987;
   private static final int д衣 = 33988;
   private static final int дМ = 33984;
   private static final float дэ = 255.0F;
   private static final float дЩ = 255.0F;
   private static final float д_ = 255.0F;
    private static final String UNIFORM_DEPTH_COPY_TEX = "ColorTexture";
    private static final String UNIFORM_MAIN_COLOR_TEX = "MaskTexture";
    private static final String UNIFORM_DEPTH_TEX = "SceneDepthTexture";
    private static final String UNIFORM_SCENE_DEPTH_TEX = "BodyDepthTexture";
    private static final String UNIFORM_BLUR_TEX = "ArmorMaskTexture";
    private static final String UNIFORM_ANIM_TIME = "time";
    private static final long ANIM_PERIOD_MS = 1000000L;
    private static final float ANIM_TIME_SCALE = 1000.0F;
    private static final float MIN_ANIM_SPEED = 0.01F;
    private static final String UNIFORM_CHAMS_COLOR = "baseColor";
    private static final String UNIFORM_CHAMS_STYLE_PARAM = "effectAlpha";
   private static final int дЪ = 33984;
   private static final int дЦ = 33985;
   private static final int дЬ = 33986;
   private static final int дЙ = 33987;
   private static final int дн = 33988;
   private static final int д西 = 33984;
   private static final int дР = 33985;
   private static final int дъ = 33986;
   private static final int дм = 33987;
   private static final int дЛ = 33988;
   private static final float BLUR_SIGMA_MIN = 1.8F;
   private static final float BLUR_SIGMA_MAX = 7.0F;
   private static final float BLUR_SIGMA_BASE = 1.55F;
   private static final float BLUR_SIGMA_THICKNESS_COEFF = 0.09F;
   private static final float BLUR_SIGMA_QUALITY_COEFF = 0.11F;
   private static final float BLUR_SUPPORT_SCALE = 2.5F;
   private static final String UNIFORM_TEX0 = "Tex0";
   private static final String UNIFORM_ALPHA = "Alpha";
   private static final String UNIFORM_GAUSSIAN = "Gaussian";
   private static final String UNIFORM_SUPPORT = "Support";
   private static final String UNIFORM_LINEAR_SAMPLING = "LinearSampling";
   private static final String UNIFORM_DIRECTION = "Direction";
   private static final String Зш = "TexelSize";
   private static final int Зщ = 33984;
   private static final String Зй = "Direction";
   private static final String ЗБ = "TexelSize";
   private static final int Зе = 33984;
   private static final int Зи = 33984;
   private static final long SHADER_REINIT_INTERVAL_MS = 5000L;
   private static final String SHADER_VERT_BLOOM = "effects";
   private static final String SHADER_FRAG_BLOOM = "bloomchams";
   private static final String SHADER_VERT_BLUR = "blurs";
   private static final String SHADER_FRAG_BLUR = "gaussian";
   private static final String SHADER_VERT_NEBULA = "effects";
   private static final String SHADER_FRAG_NEBULA = "chams_nebula";
   private static final String SHADER_VERT_COSMOS = "effects";
   private static final String SHADER_FRAG_COSMOS = "chams_cosmos";
   private static final String SHADER_VERT_GYROID = "effects";
   private static final String SHADER_FRAG_GYROID = "chams_gyroid";
   private static final String SHADER_VERT_FRESNEL = "effects";
   private static final String SHADER_FRAG_FRESNEL = "chams_fenel";
   private static final String SHADER_VERT_CLOUDS = "effects";
   private static final String SHADER_FRAG_CLOUDS = "chams_clouds";
   private static final int BUFFER_ALLOCATOR_SIZE = 1048576;
   private static final long ERROR_LOG_INTERVAL_MS = 10000L;
   public static final String MSG_SHADER_INIT_FAILED = "Chams shader init failed: \u0001";
   private static final int UNSET_FBO_SENTINEL = Integer.MIN_VALUE;
   private static final float QUAD_X0 = -1.0F;
   private static final float QUAD_Y0 = -1.0F;
   private static final float QUAD_Y1_NEG = -1.0F;
   private static final float QUAD_X1_NEG = -1.0F;
   private static final int GL_READ_FRAMEBUFFER = 36008;
   private static final int GL_DRAW_FRAMEBUFFER = 36009;
   private static final int GL_READ_FRAMEBUFFER_DEPTH = 36008;
   private static final int GL_DRAW_FRAMEBUFFER_DEPTH = 36009;
   private static final String STYLE_NAME_COSMOS = "Космос";
   private static final String STYLE_NAME_GYROID = "Гироид";
   private static final String STYLE_NAME_FRESNEL = "Фенель";
   private static final String STYLE_NAME_CLOUDS = "Облака";
   private static final int GL_CLAMP_TO_EDGE_S = 33071;
   private static final int GL_CLAMP_TO_EDGE_T = 33071;
   private static final float GAUSSIAN_SIGMA_FACTOR = -0.5F;
   private static final float GAUSSIAN_SQRT_2PI = 2.50662F;
   private static final int UNSET_INT_SENTINEL_FBO = Integer.MIN_VALUE;
   private static final int UNSET_INT_SENTINEL_COLOR = Integer.MIN_VALUE;
   private static final int UNSET_INT_SENTINEL_DEPTH = Integer.MIN_VALUE;

   private ChamsRenderer() {
   }

   public static void endScissorPass() {
      try {
         endScissorPassInternal();
      } catch (Exception var1) {
      }
   }

   public static void endEntityPass() {
      try {
         endEntityPassInternal();
      } catch (Exception var1) {
      }
   }

   private static void initShaders() {
      long var0 = System.currentTimeMillis();
      if (!isShadersInitialized || !areShadersReady()) {
         if (!isShadersInitialized || var0 - lastInitAttemptTime >= SHADER_REINIT_INTERVAL_MS) {
            isShadersInitialized = true;
            lastInitAttemptTime = var0;

            try {
               bloomChamsSP = new ShaderProgram(SHADER_VERT_BLOOM, SHADER_FRAG_BLOOM);
               gaussianBlurSP = new ShaderProgram(SHADER_VERT_BLUR, SHADER_FRAG_BLUR);
               nebulaSP = new ShaderProgram(SHADER_VERT_NEBULA, SHADER_FRAG_NEBULA);
               cosmosSP = new ShaderProgram(SHADER_VERT_COSMOS, SHADER_FRAG_COSMOS);
               gyroidSP = new ShaderProgram(SHADER_VERT_GYROID, SHADER_FRAG_GYROID);
               fresnelSP = new ShaderProgram(SHADER_VERT_FRESNEL, SHADER_FRAG_FRESNEL);
               cloudsSP = new ShaderProgram(SHADER_VERT_CLOUDS, SHADER_FRAG_CLOUDS);
               buildFullscreenQuad();
               bufferAllocator = new BufferAllocator(BUFFER_ALLOCATOR_SIZE);
               immediateProvider = VertexConsumerProvider.immediate(bufferAllocator);
            } catch (Exception var3) {
               cleanup();
                if (var0 - lastErrorLogTime > ERROR_LOG_INTERVAL_MS) {
                   lastErrorLogTime = var0;
                   // System.err.println("Chams shader init failed: " + var3.getMessage());
                }
            }
         }
      }
   }

   public static void flushBuffer() {
      if (isBufferFlushPending && immediateProvider != null && blurOutputFbo != null) {
         isBufferFlushPending = false;

         try {
            blurOutputFbo.beginWrite(false);
            immediateProvider.draw();
         } catch (Exception var4) {
         } finally {
            if (mainFbo != null) {
               mainFbo.beginWrite(false);
            }
         }
      } else {
         isBufferFlushPending = false;
      }
   }

   private static ShaderProgram getShaderForStyle(String var0) {
      if (STYLE_NAME_COSMOS.equals(var0)) {
         return cosmosSP;
      } else if (STYLE_NAME_GYROID.equals(var0)) {
         return gyroidSP;
      } else if (STYLE_NAME_FRESNEL.equals(var0)) {
         return fresnelSP;
      } else {
         return STYLE_NAME_CLOUDS.equals(var0) ? cloudsSP : nebulaSP;
      }
   }

   private static void resizeFramebuffers(int var0, int var1) {
      sourceCaptureFbo = ensureFramebuffer(sourceCaptureFbo, var0, var1);
      blurHorizFbo = ensureFramebuffer(blurHorizFbo, var0, var1);
      blurVertFbo = ensureFramebuffer(blurVertFbo, var0, var1);
      depthCopyFbo = ensureFramebuffer(depthCopyFbo, var0, var1);
      entityScissorFbo = ensureFramebuffer(entityScissorFbo, var0, var1);
      blurOutputFbo = ensureFramebuffer(blurOutputFbo, var0, var1);
   }

   public static void renderEntityScissor(ChamsModule var0, Entity var1) {
      if (entityScissorFbo != null && mainFbo != null && var0.isShaderModeActive()) {
         int[] var2 = computeEntityScissorRect(var1);
         if (var2 != null) {
            boolean var3 = GL11.glIsEnabled(3089);
            int[] var4 = null;
            if (var3) {
               var4 = new int[4];
               GL11.glGetIntegerv(3088, var4);
            }

            RenderSystem.enableScissor(var2[0], var2[1], var2[2], var2[3]);

            try {
               drawChamsShader(var0, entityScissorFbo, true, false);
            } finally {
               if (var3 && var4 != null) {
                  RenderSystem.enableScissor(var4[0], var4[1], var4[2], var4[3]);
               } else {
                  RenderSystem.disableScissor();
               }
            }
         }
      }
   }

   private static int[] computeEntityScissorRect(Entity var0) {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var0 != null && var1 != null && var1.getWindow() != null) {
         Box var2 = var0.getBoundingBox().expand(BOUNDING_BOX_EXPAND);
         double var3 = Double.POSITIVE_INFINITY;
         double var5 = Double.POSITIVE_INFINITY;
         double var7 = Double.NEGATIVE_INFINITY;
         double var9 = Double.NEGATIVE_INFINITY;
         int var11 = 0;

         for (double var15 : new double[]{var2.minX, var2.maxX}) {
            for (double var20 : new double[]{var2.minY, var2.maxY}) {
               for (double var25 : new double[]{var2.minZ, var2.maxZ}) {
                  Vec2f var27 = WorldToScreenUtil.worldToScreen(var15, var20, var25);
                  if (var27.x != SENTINEL_FLOAT_MAX_X
                     && var27.y != SENTINEL_FLOAT_MAX_Y
                     && !Float.isNaN(var27.x)
                     && !Float.isNaN(var27.y)
                     && !Float.isInfinite(var27.x)
                     && !Float.isInfinite(var27.y)) {
                     var3 = Math.min(var3, var27.x);
                     var5 = Math.min(var5, var27.y);
                     var7 = Math.max(var7, var27.x);
                     var9 = Math.max(var9, var27.y);
                     var11++;
                  }
               }
            }
         }

         if (var11 == 0) {
            return null;
         }

         double var28 = var1.getWindow().getScaleFactor();
         int var29 = var1.getWindow().getFramebufferWidth();
         int var30 = var1.getWindow().getFramebufferHeight();
         byte var16 = 24;
         int var31 = Math.max(0, (int)Math.floor(var3 * var28) - var16);
         int var32 = Math.min(var29, (int)Math.ceil(var7 * var28) + var16);
         int var33 = Math.max(0, (int)Math.floor(var5 * var28) - var16);
         int var34 = Math.min(var30, (int)Math.ceil(var9 * var28) + var16);
         int var21 = Math.max(0, var32 - var31);
         int var35 = Math.max(0, var34 - var33);
         return var21 > 0 && var35 > 0 ? new int[]{var31, var30 - var34, var21, var35} : null;
      } else {
         return null;
      }
   }

   private static Framebuffer runGaussianBlurPass(float var0, float var1) {
      if (areShadersReady() && sourceCaptureFbo != null && blurHorizFbo != null && blurVertFbo != null && fullscreenQuadVbo != null && gaussianBlurSP != null) {
         float var2 = Math.max(
            BLUR_SIGMA_MIN, Math.min(BLUR_SIGMA_MAX, BLUR_SIGMA_BASE + var0 * (BLUR_SIGMA_THICKNESS_COEFF + var1 * BLUR_SIGMA_QUALITY_COEFF))
         );
         int var3 = Math.max(3, Math.min(18, (int)Math.ceil(var2 * BLUR_SUPPORT_SCALE)));
         clearFramebuffer(blurHorizFbo);
         clearFramebuffer(blurVertFbo);
         RenderSystem.disableDepthTest();
         RenderSystem.disableBlend();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         gaussianBlurSP.bind();
         gaussianBlurSP.к(UNIFORM_TEX0, 0);
         gaussianBlurSP.к(UNIFORM_ALPHA, true);
         gaussianBlurSP.к(UNIFORM_GAUSSIAN, computeGaussianCoefficients(var2));
         gaussianBlurSP.к(UNIFORM_SUPPORT, var3);
         gaussianBlurSP.к(UNIFORM_LINEAR_SAMPLING, true);
         blurHorizFbo.beginWrite(true);
         gaussianBlurSP.к(UNIFORM_DIRECTION, 1.0F, 0.0F);
         gaussianBlurSP.к(Зш, 1.0F / blurHorizFbo.textureWidth, 1.0F / blurHorizFbo.textureHeight);
         GlStateManager._activeTexture(Зщ);
         bindTextureLinear(sourceCaptureFbo.getColorAttachment());
         fullscreenQuadVbo.bind();
         fullscreenQuadVbo.draw();
         blurVertFbo.beginWrite(true);
         gaussianBlurSP.к(Зй, 0.0F, 1.0F);
         gaussianBlurSP.к(ЗБ, 1.0F / blurVertFbo.textureWidth, 1.0F / blurVertFbo.textureHeight);
         GlStateManager._activeTexture(Зе);
         bindTextureLinear(blurHorizFbo.getColorAttachment());
         fullscreenQuadVbo.draw();
         gaussianBlurSP.unbind();
         VertexBuffer.unbind();
         GlStateManager._activeTexture(Зи);
         GlStateManager._bindTexture(0);
         return blurVertFbo;
      } else {
         return null;
      }
   }

   private static Vector3f computeGaussianCoefficients(float var0) {
      float var1 = (float)Math.exp(GAUSSIAN_SIGMA_FACTOR / (var0 * var0));
      return new Vector3f((float)(1.0 / (GAUSSIAN_SQRT_2PI * var0)), var1, var1 * var1);
   }

   private static SimpleFramebuffer ensureFramebuffer(SimpleFramebuffer var0, int var1, int var2) {
      if (var0 != null && var0.textureWidth == var1 && var0.textureHeight == var2) {
         return var0;
      }

      deleteFramebuffer(var0);
      SimpleFramebuffer var3 = new SimpleFramebuffer(var1, var2, true);
      var3.setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      return var3;
   }

   private static void executeChamsPasses(ChamsModule var0) {
      Matrix4f var1 = new Matrix4f(RenderSystem.getProjectionMatrix());
      Matrix4f var2 = new Matrix4f(RenderSystem.getModelViewMatrix());

      try {
         if (isEntityPassActive) {
            endEntityPassInternal();
         }

         if (isReadyToRender() && sourceCaptureFbo != null && mainFbo != null && fullscreenQuadVbo != null) {
            mainFbo.beginWrite(false);
            if (var0.glowEnabledSetting.isEnabled()) {
               drawBloomComposite(
                  (float)System.currentTimeMillis() / TIME_DIVISOR_MS,
                   var0.getShaderSpeed(),
                  destraChamsGlowColor(var0),
                  var0.getComputedGlowStrength(),
                  var0.getGlowQuality(),
                  var0.alwaysRenderOutline()
               );
            }

            isChamsDrawn = true;
            isSceneCaptured = false;
            isEntityPassEnded = false;
            return;
         }
      } catch (Exception var7) {
         var7.printStackTrace();
         return;
      } finally {
         isEntityPassActive = false;
         RenderSystem.getProjectionMatrix().set(var1);
         RenderSystem.getModelViewMatrix().set(var2);
         RenderSystem.depthMask(true);
         RenderSystem.defaultBlendFunc();
      }
   }

   private static void drawBloomComposite(float var0, float var1, int var2, float var3, float var4, boolean var5) {
      if (sourceCaptureFbo != null && mainFbo != null && fullscreenQuadVbo != null && bloomChamsSP != null) {
         int var6 = GlStateManager._getActiveTexture();
         boolean var7 = GL11.glIsEnabled(2929);
          Framebuffer var8 = sourceCaptureFbo;
         boolean var9 = false;
         Framebuffer var10 = runGaussianBlurPass(var3, var4);
         if (var10 != null) {
            var8 = var10;
            var9 = true;
            mainFbo.beginWrite(false);
         }

         GlStateManager._bindTexture(0);
         if (var5) {
            RenderSystem.enableDepthTest();
            RenderSystem.depthFunc(515);
            RenderSystem.depthMask(false);
         } else {
            RenderSystem.disableDepthTest();
         }

         RenderSystem.enableBlend();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         fullscreenQuadVbo.bind();
         GlStateManager._activeTexture(TEX_UNIT_0_COMPOSITE);
         bindTextureLinear(var8.getColorAttachment());
         GlStateManager._activeTexture(TEX_UNIT_1_COMPOSITE);
         bindTextureLinear(sourceCaptureFbo.getColorAttachment());
         GlStateManager._activeTexture(TEX_UNIT_BASE_COMPOSITE);
         bloomChamsSP.bind();
         bloomChamsSP.к(UNIFORM_TEXTURE0, 0);
         bloomChamsSP.к(UNIFORM_IMAGE, 1);
         bloomChamsSP.к(UNIFORM_USE_IMAGE, var9 ? 1 : 0);
         bloomChamsSP.к(UNIFORM_TIME, var0 * Math.max(MIN_THICKNESS, var1));
         bloomChamsSP.к(UNIFORM_THICKNESS, var3);
         bloomChamsSP.к(UNIFORM_QUALITY, var4);
         bloomChamsSP.к(UNIFORM_RESOLUTION, new Vector2f(sourceCaptureFbo.textureWidth, sourceCaptureFbo.textureHeight));
         float var11 = (var2 >> 16 & 0xFF) / COLOR_NORM_R;
         float var12 = (var2 >> 8 & 0xFF) / COLOR_NORM_G;
         float var13 = (var2 & 0xFF) / COLOR_NORM_B;
         float var14 = (var2 >> 24 & 0xFF) / COLOR_NORM_A;
         bloomChamsSP.к(UNIFORM_OUTLINE_COLOR, new Vector4f(var11, var12, var13, var14));
         fullscreenQuadVbo.draw();
         bloomChamsSP.unbind();
         VertexBuffer.unbind();
         if (var7) {
            RenderSystem.enableDepthTest();
         } else {
            RenderSystem.disableDepthTest();
         }

         RenderSystem.depthMask(true);
         GlStateManager._activeTexture(д9);
         GlStateManager._bindTexture(0);
         GlStateManager._activeTexture(ды);
         GlStateManager._bindTexture(0);
         GlStateManager._activeTexture(var6);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         if (mainFbo != null) {
            mainFbo.beginWrite(false);
         }
      }
   }

   private static void blitColorOnly(Framebuffer var0, Framebuffer var1, int var2, int var3) {
      if (var0 != null && var1 != null) {
         try {
            var0.beginRead();
            var1.beginWrite(false);
            GlStateManager._glBindFramebuffer(GL_READ_FRAMEBUFFER, var0.fbo);
            GlStateManager._glBindFramebuffer(GL_DRAW_FRAMEBUFFER, var1.fbo);
            GL30.glBlitFramebuffer(0, 0, var2, var3, 0, 0, var2, var3, 256, 9728);
         } catch (Exception var5) {
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void drawChamsShader(ChamsModule var0, Framebuffer var1, boolean var2, boolean var3) {
      if (mainFbo != null && var1 != null && depthCopyFbo != null && fullscreenQuadVbo != null) {
         ShaderProgram var4 = getShaderForStyle(var0.getShaderStyleName());
         if (var4 != null) {
            if (var3) {
               blitDepth(mainFbo, depthCopyFbo, depthCopyFbo.textureWidth, depthCopyFbo.textureHeight);
               depthCopyFbo.copyDepthFrom(mainFbo);
               mainFbo.beginWrite(false);
            }

            int var5 = GlStateManager._getActiveTexture();
            boolean var6 = GL11.glIsEnabled(3042);
            boolean var7 = GL11.glIsEnabled(2929);
            boolean var8 = GL11.glIsEnabled(2884);
            boolean var9 = GL11.glGetBoolean(2930);
            boolean var10 = !var3;
            boolean var17 = false /* VF: Semaphore variable */;

            try {
               var17 = true;
               RenderSystem.disableDepthTest();
               RenderSystem.depthMask(false);
               if (var10) {
                  RenderSystem.disableBlend();
               } else {
                  RenderSystem.enableBlend();
                  RenderSystem.defaultBlendFunc();
               }

               RenderSystem.disableCull();
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               GlStateManager._activeTexture(до);
               bindTextureLinear(depthCopyFbo.getColorAttachment());
               GlStateManager._activeTexture(д0);
               bindTextureLinear(var1.getColorAttachment());
               GlStateManager._activeTexture(дс);
               bindTextureLinear(var2 ? depthCopyFbo.getDepthAttachment() : var1.getDepthAttachment());
               GlStateManager._activeTexture(дх);
               bindTextureLinear(var1.getDepthAttachment());
               GlStateManager._activeTexture(д衣);
               bindTextureLinear(blurOutputFbo.getColorAttachment());
             GlStateManager._activeTexture(дМ);
             int var11 = destraChamsBaseColor(var0);
             float var12 = (var11 >> 16 & 0xFF) / дэ;
               float var13 = (var11 >> 8 & 0xFF) / дЩ;
               float var14 = (var11 & 0xFF) / д_;
               var4.bind();
               var4.к(UNIFORM_DEPTH_COPY_TEX, 0);
               var4.к(UNIFORM_MAIN_COLOR_TEX, 1);
               var4.к(UNIFORM_DEPTH_TEX, 2);
               var4.к(UNIFORM_SCENE_DEPTH_TEX, 3);
               var4.к(UNIFORM_BLUR_TEX, 4);
               var4.к(
                  UNIFORM_ANIM_TIME, (float)(System.currentTimeMillis() % ANIM_PERIOD_MS) / ANIM_TIME_SCALE * Math.max(MIN_ANIM_SPEED, var0.getShaderSpeed())
               );
               var4.к(UNIFORM_CHAMS_COLOR, var12, var13, var14, 1.0F);
               var4.к(UNIFORM_CHAMS_STYLE_PARAM, var0.getFillOpacity());
               fullscreenQuadVbo.bind();
               fullscreenQuadVbo.draw();
               var4.unbind();
               VertexBuffer.unbind();
               var17 = false;
            } finally {
               if (var17) {
                  VertexBuffer.unbind();
                  GlStateManager._activeTexture(д西);
                  GlStateManager._bindTexture(0);
                  GlStateManager._activeTexture(дР);
                  GlStateManager._bindTexture(0);
                  GlStateManager._activeTexture(дъ);
                  GlStateManager._bindTexture(0);
                  GlStateManager._activeTexture(дм);
                  GlStateManager._bindTexture(0);
                  GlStateManager._activeTexture(дЛ);
                  GlStateManager._bindTexture(0);
                  GlStateManager._activeTexture(var5);
                  if (var6) {
                     RenderSystem.enableBlend();
                  } else {
                     RenderSystem.disableBlend();
                  }

                  if (var7) {
                     RenderSystem.enableDepthTest();
                  } else {
                     RenderSystem.disableDepthTest();
                  }

                  if (var8) {
                     RenderSystem.enableCull();
                  } else {
                     RenderSystem.disableCull();
                  }

                  RenderSystem.depthMask(var9);
                  RenderSystem.defaultBlendFunc();
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  mainFbo.beginWrite(false);
               }
            }

            VertexBuffer.unbind();
            GlStateManager._activeTexture(дЪ);
            GlStateManager._bindTexture(0);
            GlStateManager._activeTexture(дЦ);
            GlStateManager._bindTexture(0);
            GlStateManager._activeTexture(дЬ);
            GlStateManager._bindTexture(0);
            GlStateManager._activeTexture(дЙ);
            GlStateManager._bindTexture(0);
            GlStateManager._activeTexture(дн);
            GlStateManager._bindTexture(0);
            GlStateManager._activeTexture(var5);
            if (var6) {
               RenderSystem.enableBlend();
            } else {
               RenderSystem.disableBlend();
            }

            if (var7) {
               RenderSystem.enableDepthTest();
            } else {
               RenderSystem.disableDepthTest();
            }

            if (var8) {
               RenderSystem.enableCull();
            } else {
               RenderSystem.disableCull();
            }

            RenderSystem.depthMask(var9);
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            mainFbo.beginWrite(false);
         }
      }
   }

   private static void deleteFramebuffer(SimpleFramebuffer var0) {
      if (var0 != null) {
         var0.delete();
      }
   }

   public static VertexConsumer getVertexConsumer(RenderLayer var0) {
      return isBufferFlushPending && immediateProvider != null && var0 != null ? immediateProvider.getBuffer(var0) : null;
   }

   public static void markBufferReady() {
      if (isSceneCaptured && immediateProvider != null && blurOutputFbo != null) {
         isBufferFlushPending = true;
      }
   }

   private static boolean needsReinit() {
      if (!isShadersInitialized) {
         return false;
      } else {
         return isFramebufferValid(sourceCaptureFbo)
               && isFramebufferValid(blurHorizFbo)
               && isFramebufferValid(blurVertFbo)
               && isFramebufferValid(depthCopyFbo)
               && isFramebufferValid(entityScissorFbo)
               && isFramebufferValid(blurOutputFbo)
            ? !isShaderValid(bloomChamsSP)
               || !isShaderValid(gaussianBlurSP)
               || !isShaderValid(nebulaSP)
               || !isShaderValid(cosmosSP)
               || !isShaderValid(gyroidSP)
               || !isShaderValid(fresnelSP)
               || !isShaderValid(cloudsSP)
            : true;
      }
   }

   private static boolean isAnyPassActive() {
      return isEntityPassActive || isScissorPassActive || isBufferFlushPending;
   }

   public static boolean beginEntityPass() {
      if (isDisabled) {
         return false;
      }

      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0 != null && var0.getFramebuffer() != null && var0.getWindow() != null) {
         detectFramebufferChange(var0);
         initShaders();
         if (!areShadersReady()) {
            return false;
         }

         mainFbo = var0.getFramebuffer();
         int var1 = var0.getWindow().getFramebufferWidth();
         int var2 = var0.getWindow().getFramebufferHeight();
         resizeFramebuffers(var1, var2);
         if (!isSceneCaptured) {
            sourceCaptureFbo.clear();
            blitColorOnly(mainFbo, sourceCaptureFbo, var1, var2);
            blurOutputFbo.clear();
            blitColorOnly(mainFbo, blurOutputFbo, var1, var2);
            isSceneCaptured = true;
            isEntityPassEnded = false;
            isChamsDrawn = false;
         }

         FramebufferStack.push(sourceCaptureFbo);
         sourceCaptureFbo.beginWrite(false);
         isEntityPassActive = true;
         return true;
      } else {
         return false;
      }
   }

   public static void resetFramebufferState() {
      lastFboId = UNSET_INT_SENTINEL_FBO;
      lastColorAttachment = UNSET_INT_SENTINEL_COLOR;
      lastDepthAttachment = UNSET_INT_SENTINEL_DEPTH;
   }

   private static void blitDepth(Framebuffer var0, Framebuffer var1, int var2, int var3) {
      if (var0 != null && var1 != null) {
         try {
            var0.beginRead();
            var1.beginWrite(true);
            GlStateManager._glBindFramebuffer(GL_READ_FRAMEBUFFER_DEPTH, var0.fbo);
            GlStateManager._glBindFramebuffer(GL_DRAW_FRAMEBUFFER_DEPTH, var1.fbo);
            GL30.glBlitFramebuffer(0, 0, var2, var3, 0, 0, var2, var3, 16384, 9729);
         } catch (Exception var5) {
         }
      }
   }

   private static void clearFramebuffer(SimpleFramebuffer var0) {
      var0.clear();
      var0.beginWrite(true);
      RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 0.0F);
      RenderSystem.clear(16640);
   }

   private static boolean isFramebufferValid(SimpleFramebuffer var0) {
      if (var0 != null && GL30.glIsFramebuffer(var0.fbo)) {
         int var1 = var0.getColorAttachment();
         if (var1 > 0 && GL11.glIsTexture(var1)) {
            int var2 = var0.getDepthAttachment();
            return var2 <= 0 || GL11.glIsTexture(var2);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static void endEntityPassInternal() {
      if (isEntityPassActive) {
         try {
            FramebufferStack.pop();
         } catch (Exception var1) {
         }

         isEntityPassActive = false;
         isEntityPassEnded = true;
         if (mainFbo != null) {
            mainFbo.beginWrite(false);
         }
      }
   }

   public static void beginDepthCopyPass() {
      if (!isDisabled) {
         if (!isDepthCopyDone) {
            MinecraftClient var0 = MinecraftClient.getInstance();
            if (var0 != null && var0.getFramebuffer() != null && var0.getWindow() != null) {
               detectFramebufferChange(var0);
               initShaders();
               if (areShadersReady()) {
                  mainFbo = var0.getFramebuffer();
                  int var1 = var0.getWindow().getFramebufferWidth();
                  int var2 = var0.getWindow().getFramebufferHeight();
                  resizeFramebuffers(var1, var2);
                  if (!isBlurOutputInitialized) {
                     clearFramebuffer(blurOutputFbo);
                     isBlurOutputInitialized = true;
                  }

                  blitDepth(mainFbo, depthCopyFbo, var1, var2);
                  depthCopyFbo.copyDepthFrom(mainFbo);
                  mainFbo.beginWrite(false);
                  isDepthCopyDone = true;
               }
            }
         }
      }
   }

   public static void finishFrame() {
      if (isPendingReinit) {
         isPendingReinit = false;
         cleanup();
         skipFramesRemaining = Math.max(skipFramesRemaining, 1);
      }

      checkFramebufferChanged();
      isDisabled = skipFramesRemaining > 0;
      if (isDisabled) {
         skipFramesRemaining--;
      }

      if (isEntityPassActive) {
         endEntityPass();
      }

      if (isScissorPassActive) {
         endScissorPass();
      }

      if (immediateProvider != null) {
         try {
            immediateProvider.draw();
         } catch (Exception var1) {
         }
      }

      isBufferFlushPending = false;
      isDepthCopyDone = false;
      isBlurOutputInitialized = false;
      isSceneCaptured = false;
      isEntityPassEnded = false;
      isChamsDrawn = false;
   }

   public static void endScissorPassInternal() {
      if (isScissorPassActive) {
         try {
            FramebufferStack.pop();
         } catch (Exception var1) {
         }

         isScissorPassActive = false;
         if (mainFbo != null) {
            mainFbo.beginWrite(false);
         }
      }
   }

   private static void checkFramebufferChanged() {
      detectFramebufferChange(MinecraftClient.getInstance());
   }

   public static void renderChams() {
      if (!isDisabled) {
         checkFramebufferChanged();
         DestraClient var0 = DestraClient.getInstance();
         if (var0 != null && var0.getModuleManager() != null) {
            ChamsModule var1 = var0.getModuleManager().chams;
            if (var1 != null && var1.Д() && (var1.glowEnabledSetting.isEnabled() || var1.isShaderModeActive())) {
               initShaders();
               if (!areShadersReady()) {
                  finishFrame();
               } else {
                  if (isEntityPassActive) {
                     endEntityPassInternal();
                  }

                  if (isReadyToRender()) {
                     executeChamsPasses(var1);
                  }
               }
            } else {
               finishFrame();
            }
         } else {
            finishFrame();
         }
      }
   }

   private static boolean areShadersReady() {
      return bloomChamsSP != null && gaussianBlurSP != null && fullscreenQuadVbo != null;
   }

   public static boolean beginScissorPass() {
      if (isDisabled) {
         return false;
      }

      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0 != null && var0.getFramebuffer() != null && var0.getWindow() != null) {
         detectFramebufferChange(var0);
         initShaders();
         if (!areShadersReady()) {
            return false;
         }

         mainFbo = var0.getFramebuffer();
         int var1 = var0.getWindow().getFramebufferWidth();
         int var2 = var0.getWindow().getFramebufferHeight();
         resizeFramebuffers(var1, var2);
         clearFramebuffer(entityScissorFbo);
         blitColorOnly(mainFbo, entityScissorFbo, var1, var2);
         if (!isBlurOutputInitialized) {
            clearFramebuffer(blurOutputFbo);
            blitColorOnly(mainFbo, blurOutputFbo, var1, var2);
            isBlurOutputInitialized = true;
         }

         FramebufferStack.push(entityScissorFbo);
         entityScissorFbo.beginWrite(false);
         isScissorPassActive = true;
         return true;
      } else {
         return false;
      }
   }

   public static void cleanup() {
      endEntityPass();
      FramebufferStack.clear();
      deleteFramebuffer(sourceCaptureFbo);
      deleteFramebuffer(blurHorizFbo);
      deleteFramebuffer(blurVertFbo);
      deleteFramebuffer(depthCopyFbo);
      deleteFramebuffer(entityScissorFbo);
      deleteFramebuffer(blurOutputFbo);
      sourceCaptureFbo = null;
      blurHorizFbo = null;
      blurVertFbo = null;
      depthCopyFbo = null;
      entityScissorFbo = null;
      blurOutputFbo = null;
      if (fullscreenQuadVbo != null) {
         try {
            fullscreenQuadVbo.close();
         } catch (Exception var2) {
         }

         fullscreenQuadVbo = null;
      }

      if (bufferAllocator != null) {
         try {
            bufferAllocator.close();
         } catch (Exception var1) {
         }

         bufferAllocator = null;
         immediateProvider = null;
      }

      if (bloomChamsSP != null) {
         bloomChamsSP.delete();
         bloomChamsSP = null;
      }

      if (gaussianBlurSP != null) {
         gaussianBlurSP.delete();
         gaussianBlurSP = null;
      }

      deleteShader(nebulaSP);
      deleteShader(cosmosSP);
      deleteShader(gyroidSP);
      deleteShader(fresnelSP);
      deleteShader(cloudsSP);
      nebulaSP = null;
      cosmosSP = null;
      gyroidSP = null;
      fresnelSP = null;
      cloudsSP = null;
      isShadersInitialized = false;
      isEntityPassActive = false;
      isScissorPassActive = false;
      isDepthCopyDone = false;
      isBlurOutputInitialized = false;
      isPendingReinit = false;
      isDisabled = false;
      skipFramesRemaining = 0;
      isSceneCaptured = false;
      isEntityPassEnded = false;
      isChamsDrawn = false;
      mainFbo = null;
      isBufferFlushPending = false;
      lastFboId = RESET_FBO_SENTINEL;
      lastColorAttachment = RESET_COLOR_SENTINEL;
      lastDepthAttachment = RESET_DEPTH_SENTINEL;
   }

   public static void requestReinit() {
      isPendingReinit = true;
      skipFramesRemaining = Math.max(skipFramesRemaining, 1);
   }

   private static void bindTextureLinear(int var0) {
      GlStateManager._bindTexture(var0);
      GlStateManager._texParameter(3553, 10241, 9729);
      GlStateManager._texParameter(3553, 10240, 9729);
      GlStateManager._texParameter(3553, 10242, GL_CLAMP_TO_EDGE_S);
      GlStateManager._texParameter(3553, 10243, GL_CLAMP_TO_EDGE_T);
   }

   private static void detectFramebufferChange(MinecraftClient var0) {
      if (var0 != null && var0.getFramebuffer() != null) {
         Framebuffer var1 = var0.getFramebuffer();
         int var2 = var1.fbo;
         int var3 = var1.getColorAttachment();
         int var4 = var1.getDepthAttachment();
         boolean var5 = lastFboId != UNSET_FBO_SENTINEL;
         boolean var6 = var5 && (lastFboId != var2 || lastColorAttachment != var3 || lastDepthAttachment != var4);
         if ((var6 || needsReinit()) && !isAnyPassActive()) {
            cleanup();
            skipFramesRemaining = Math.max(skipFramesRemaining, 1);
         }

         lastFboId = var2;
         lastColorAttachment = var3;
         lastDepthAttachment = var4;
      }
   }

   private static void deleteShader(ShaderProgram var0) {
      if (var0 != null) {
         var0.delete();
      }
   }

   private static boolean isShaderValid(ShaderProgram var0) {
      return var0 != null && var0.isValid();
   }

   private static void buildFullscreenQuad() {
      fullscreenQuadVbo = new VertexBuffer(GlUsage.STATIC_WRITE);
      BufferBuilder var0 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE);
      var0.vertex(QUAD_X0, QUAD_Y0, 0.0F).texture(0.0F, 0.0F);
      var0.vertex(1.0F, QUAD_Y1_NEG, 0.0F).texture(1.0F, 0.0F);
      var0.vertex(1.0F, 1.0F, 0.0F).texture(1.0F, 1.0F);
      var0.vertex(QUAD_X1_NEG, 1.0F, 0.0F).texture(0.0F, 1.0F);
      fullscreenQuadVbo.bind();
      fullscreenQuadVbo.upload(var0.end());
      VertexBuffer.unbind();
   }

   public static boolean isReadyToRender() {
      return isSceneCaptured && isEntityPassEnded && !isChamsDrawn;
   }

   private static int destraUiThemeColor() {
      try {
         DestraClient dc = DestraClient.getInstance();
         if (dc != null && dc.theme2DManager != null) {
            Theme2DManager tm = dc.theme2DManager;
            NamedColor nc = tm.getCurrentColor();
            if (nc != null && nc.getColor() != null) {
               return nc.getColor().getRGB();
            }
         }
      } catch (Throwable ignored) {
      }
      return -1;
   }

   private static int destraChamsBaseColor(ChamsModule module) {
      int ui = destraUiThemeColor();
      if (ui != -1) {
         return ui;
      }
      return module.getColor();
   }

   private static int destraChamsGlowColor(ChamsModule module) {
      int glow = module.getColorWithGlowAlpha();
      int ui = destraUiThemeColor();
      if (ui == -1) {
         return glow;
      }
      int alpha = (glow >>> 24) & 0xFF;
      return (alpha << 24) | (ui & 0x00FFFFFF);
   }
}
