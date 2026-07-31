package ru.destra.render;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.Window;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import ru.destra.font.FontRenderer;
import ru.destra.font.MsdfTextRender;
import ru.destra.font.TextRenderOptions;
import ru.destra.gui.ScissorStack;
import ru.destra.hud.HudBlurRenderer;
import ru.destra.util.ColorUtil;

public final class RenderBatcher {
   private static final int MAX_BATCH = 30;
   private static final int RECT_UNIFORM_STRIDE = 30;
   private static final int RECT_VERTEX_STRIDE = 12;
   private static final float RECT_PADDING = 1.5F;
   private static final float PAD = 0.5F;

   private static final String UNIFORM_RECT_DATA_CHECK = "shapeData";
   private static final String UNIFORM_RECT_DATA = "shapeData";
   private static final String UNIFORM_FONT_METRICS = "Range";
   private static final String UNIFORM_THICKNESS = "Thickness";
   private static final String UNIFORM_SMOOTHNESS = "Smoothness";
   private static final String UNIFORM_OUTLINE_ENABLED = "Outline";
   private static final String UNIFORM_FADEOUT_ENABLED = "EnableFadeout";
   private static final String UNIFORM_FADE_IN_START = "FadeInStart";
   private static final String UNIFORM_FADE_IN_END = "FadeInEnd";
   private static final String UNIFORM_FADEOUT_START = "FadeoutStart";
   private static final String UNIFORM_FADEOUT_END = "FadeoutEnd";
   private static final String UNIFORM_MAX_WIDTH = "MaxWidth";
   private static final String UNIFORM_FADE_ANCHOR_X = "TextPosX";
   private static final String UNIFORM_OUTLINE_THICKNESS = "OutlineThickness";
   private static final String UNIFORM_OUTLINE_COLOR = "OutlineColor";

   private static ShaderProgramKey msdfFontShader;
   private static ShaderProgramKey roundedBatchShader;
   private static ShaderProgramKey roundedOutlineShader;
   private static Matrix4f identityMatrix;
   private static float[] rectUniformData;
   private static float[] rectVertexData;
   private static ThreadLocal<Vector3f> tempVec3ThreadLocal;
   private static List<RectangleDrawCall> rectDrawCalls;
   private static List<BorderDrawCall> borderDrawCalls;
   private static List<TextDrawCall> textDrawCalls;
   private static boolean batchingActive;
   private static boolean flushing;

   static {
      init();
   }

   private RenderBatcher() {
   }

   public static void beginBatch() {
      batchingActive = true;
      flushing = false;
      rectDrawCalls.clear();
      borderDrawCalls.clear();
      textDrawCalls.clear();
      ItemStackRenderer.beginFrame();
   }

   public static void endBatch() {
      if (!batchingActive) {
         ItemStackRenderer.flushAll();
         return;
      }

      flush(false);
   }

   public static boolean isReady() {
      return batchingActive && !flushing;
   }

   public static void endBatchKeepActive() {
      if (!batchingActive) {
         ItemStackRenderer.flushAll();
      } else if (!flushing) {
         flush(true);
      }
   }

   public static void init() {
      msdfFontShader = new ShaderProgramKey(
         ResourceLoader.getCoreIdentifier("msdf_font"),
         VertexFormats.POSITION_TEXTURE_COLOR,
         Defines.EMPTY
      );
      roundedBatchShader = new ShaderProgramKey(
         ResourceLoader.getCoreIdentifier("rounded_batch"),
         VertexFormats.POSITION,
         Defines.EMPTY
      );
      roundedOutlineShader = new ShaderProgramKey(
         ResourceLoader.getCoreIdentifier("rounded_outline_batch"),
         VertexFormats.POSITION_TEXTURE_COLOR,
         Defines.EMPTY
      );
      identityMatrix = new Matrix4f();
      rectUniformData = new float[MAX_BATCH * RECT_UNIFORM_STRIDE];
      rectVertexData = new float[MAX_BATCH * RECT_VERTEX_STRIDE];
      tempVec3ThreadLocal = ThreadLocal.withInitial(Vector3f::new);
      rectDrawCalls = new ArrayList<>();
      borderDrawCalls = new ArrayList<>();
      textDrawCalls = new ArrayList<>();
      batchingActive = false;
      flushing = false;
   }

   public static boolean \u0436(RoundedOutline border, Matrix4f matrix, float x, float y, float z) {
      if (!batchingActive || flushing || border == null || matrix == null || ScissorStack.isScissorActive()) {
         return false;
      }

      if (border.size() == null || border.radius() == null || border.color() == null) {
         return false;
      }

      if (border.size().width() <= 0.0F || border.size().height() <= 0.0F || border.thickness() <= 0.0F) {
         return false;
      }

      borderDrawCalls.add(new BorderDrawCall(new Matrix4f(matrix), x, y, z, border));
      return true;
   }

   public static boolean \u0436(MsdfTextRender text, Matrix4f matrix, float x, float y, float z) {
      if (!batchingActive || flushing || text == null || matrix == null || ScissorStack.isScissorActive()) {
         return false;
      }

      if (text.text() == null || text.text().isEmpty() || text.font() == null || !\u0436(text.font(), text.text())) {
         return false;
      }

      textDrawCalls.add(new TextDrawCall(new Matrix4f(matrix), x, y, z, text));
      return true;
   }

   public static boolean \u0436(RoundedRectangle rectangle, Matrix4f matrix, float x, float y, float z) {
      if (!batchingActive || flushing || rectangle == null || matrix == null || ScissorStack.isScissorActive()) {
         return false;
      }

      if (rectangle.size() == null || rectangle.radius() == null || rectangle.color() == null) {
         return false;
      }

      if (rectangle.size().width() <= 0.0F || rectangle.size().height() <= 0.0F) {
         return false;
      }

      rectDrawCalls.add(new RectangleDrawCall(new Matrix4f(matrix), x, y, z, rectangle));
      return true;
   }

   private static boolean \u0436(FontRenderer font, String text) {
      for (int i = 0; i < text.length(); i++) {
         if (font.hasGlyph(text.charAt(i))) {
            return true;
         }
      }

      return false;
   }

   private static void \u0436(int rectIndex, int vertexIndex, Matrix4f matrix, float x, float y, float z) {
      Vector3f transformed = matrix.transformPosition(x, y, z, tempVec3ThreadLocal.get());
      int base = rectIndex * RECT_VERTEX_STRIDE + vertexIndex * 3;
      rectVertexData[base] = transformed.x;
      rectVertexData[base + 1] = transformed.y;
      rectVertexData[base + 2] = transformed.z;
   }

   private static void \u0436(float[] data, int offset, int color) {
      data[offset] = (float)(color >> 16 & 255) / 255.0F;
      data[offset + 1] = (float)(color >> 8 & 255) / 255.0F;
      data[offset + 2] = (float)(color & 255) / 255.0F;
      data[offset + 3] = (float)(color >>> 24 & 255) / 255.0F;
   }

   private static void flush(boolean keepActive) {
      flushing = true;

      try {
         HudBlurRenderer.flushBatchedBlurRects();
         flushRectangles();
         flushOutlines();
         ItemStackRenderer.flushAll();
         flushText();
      } finally {
         rectDrawCalls.clear();
         borderDrawCalls.clear();
         textDrawCalls.clear();
         batchingActive = keepActive;
         if (!keepActive) {
            ItemStackRenderer.endFrame();
         }

         flushing = false;
      }
   }

   private static void flushRectangles() {
      if (rectDrawCalls.isEmpty()) {
         return;
      }

      int offset = 0;
      while (offset < rectDrawCalls.size()) {
         int count = fillRectBatchData(offset);
         if (count <= 0) {
            return;
         }

         drawRectangleBatch(count);
         offset += count;
      }
   }

   private static void drawRectangleBatch(int count) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();

      BufferBuilder buffer = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION);
      for (int i = 0; i < count; i++) {
         int base = i * RECT_VERTEX_STRIDE;
         buffer.vertex(identityMatrix, rectVertexData[base], rectVertexData[base + 1], rectVertexData[base + 2]);
         buffer.vertex(identityMatrix, rectVertexData[base + 3], rectVertexData[base + 4], rectVertexData[base + 5]);
         buffer.vertex(identityMatrix, rectVertexData[base + 6], rectVertexData[base + 7], rectVertexData[base + 8]);
         buffer.vertex(identityMatrix, rectVertexData[base + 9], rectVertexData[base + 10], rectVertexData[base + 11]);
      }

      ShaderProgram shader = RenderSystem.setShader(roundedBatchShader);
      if (shader != null && shader.getUniform(UNIFORM_RECT_DATA_CHECK) != null) {
         GlUniform uniform = shader.getUniform(UNIFORM_RECT_DATA);
         if (uniform != null) {
            uniform.set(rectUniformData);
         }
      }

      BuiltBuffer built = buffer.endNullable();
      if (built != null) {
         BufferRenderer.drawWithGlobalProgram(built);
      }

      RenderSystem.enableCull();
      RenderSystem.disableBlend();
   }

   private static int fillRectBatchData(int offset) {
      MinecraftClient client = MinecraftClient.getInstance();
      Window window = client != null ? client.getWindow() : null;
      if (window == null) {
         return 0;
      }

      float scale = (float)ScaledResolution.getScaleFactor();
      int framebufferHeight = window.getFramebufferHeight();
      int count = Math.min(MAX_BATCH, rectDrawCalls.size() - offset);
      Arrays.fill(rectUniformData, 0.0F);
      Arrays.fill(rectVertexData, 0.0F);

      for (int i = 0; i < count; i++) {
         RectangleDrawCall call = rectDrawCalls.get(offset + i);
         RoundedRectangle rectangle = call.rectangle();
         Matrix4f matrix = call.matrix();
         float x = call.x();
         float y = call.y();
         float z = call.z();
         float width = rectangle.size().width();
         float height = rectangle.size().height();

         Vector3f transformed = matrix.transformPosition(x, y, z, tempVec3ThreadLocal.get());
         Vector3f matrixScale = matrix.getScale(new Vector3f());
         float scaledWidth = Math.abs(matrixScale.x) * scale;
         float scaledHeight = Math.abs(matrixScale.y) * scale;
         float framebufferWidth = width * scaledWidth;
         float framebufferRectHeight = height * scaledHeight;
         float framebufferX = transformed.x * scale;
         float framebufferY = transformed.y * scale;

         int base = i * RECT_UNIFORM_STRIDE;
         rectUniformData[base] = framebufferX;
         rectUniformData[base + 1] = framebufferHeight - framebufferRectHeight - framebufferY;
         rectUniformData[base + 2] = framebufferWidth;
         rectUniformData[base + 3] = framebufferRectHeight;
         rectUniformData[base + 4] = rectangle.radius().radius1() * scaledHeight;
         rectUniformData[base + 5] = rectangle.radius().radius2() * scaledHeight;
         rectUniformData[base + 6] = rectangle.radius().radius3() * scaledHeight;
         rectUniformData[base + 7] = rectangle.radius().radius4() * scaledHeight;
         rectUniformData[base + 8] = 0.0F;
         \u0436(rectUniformData, base + 9, rectangle.color().color1());
         \u0436(rectUniformData, base + 13, rectangle.color().color2());
         \u0436(rectUniformData, base + 17, rectangle.color().color3());
         \u0436(rectUniformData, base + 21, rectangle.color().color4());
         \u0436(rectUniformData, base + 25, 0);
         rectUniformData[base + 29] = 0.0F;

         \u0436(i, 0, matrix, x - RECT_PADDING * PAD, y - RECT_PADDING * PAD, z);
         \u0436(i, 1, matrix, x - RECT_PADDING * PAD, y + height + RECT_PADDING * PAD, z);
         \u0436(i, 2, matrix, x + width + RECT_PADDING * PAD, y + height + RECT_PADDING * PAD, z);
         \u0436(i, 3, matrix, x + width + RECT_PADDING * PAD, y - RECT_PADDING * PAD, z);
      }

      return count;
   }

   private static void flushOutlines() {
      if (borderDrawCalls.isEmpty()) {
         return;
      }

      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.setShader(roundedOutlineShader);

      BufferBuilder buffer = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      for (BorderDrawCall call : borderDrawCalls) {
         RoundedOutline border = call.border();
         float width = border.size().width();
         float height = border.size().height();
         float radius = border.radius().radius1();
         float thickness = border.thickness();
         float x = call.x();
         float y = call.y();
         float z = call.z();
         Matrix4f matrix = call.matrix();

         buffer.vertex(matrix, x, y, z).texture(radius, thickness).color(border.color().color1());
         buffer.vertex(matrix, x, y + height, z).texture(radius, thickness).color(border.color().color4());
         buffer.vertex(matrix, x + width, y + height, z).texture(radius, thickness).color(border.color().color3());
         buffer.vertex(matrix, x + width, y, z).texture(radius, thickness).color(border.color().color2());
      }

      BuiltBuffer built = buffer.endNullable();
      if (built != null) {
         BufferRenderer.drawWithGlobalProgram(built);
      }

      RenderSystem.enableCull();
      RenderSystem.disableBlend();
   }

   private static void flushText() {
      if (textDrawCalls.isEmpty()) {
         return;
      }

      LinkedHashMap<TextRenderOptions, List<TextDrawCall>> groupedCalls = new LinkedHashMap<>();
      for (TextDrawCall call : textDrawCalls) {
         groupedCalls.computeIfAbsent(TextRenderOptions.from(call.text()), ignored -> new ArrayList<>()).add(call);
      }

      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();

      for (Entry<TextRenderOptions, List<TextDrawCall>> entry : groupedCalls.entrySet()) {
         TextRenderOptions options = entry.getKey();
         RenderSystem.setShaderTexture(0, options.font().getTextureId());

         ShaderProgram shader = RenderSystem.setShader(msdfFontShader);
         if (shader == null) {
            continue;
         }

         setUniform(shader, UNIFORM_FONT_METRICS, options.font().getAtlas().getDistanceRange());
         setUniform(shader, UNIFORM_THICKNESS, Math.max(options.thickness(), 0.0F));
         setUniform(shader, UNIFORM_SMOOTHNESS, options.smoothness());
         setUniform(shader, UNIFORM_OUTLINE_ENABLED, options.outlineEnabled() ? 1 : 0);
         setUniform(shader, UNIFORM_FADEOUT_ENABLED, options.enableFadeout() ? 1 : 0);
         setUniform(shader, UNIFORM_FADE_IN_START, options.fadeInStart());
         setUniform(shader, UNIFORM_FADE_IN_END, options.fadeInEnd());
         setUniform(shader, UNIFORM_FADEOUT_START, options.fadeoutStart());
         setUniform(shader, UNIFORM_FADEOUT_END, options.fadeoutEnd());
         setUniform(shader, UNIFORM_MAX_WIDTH, options.maxWidth());
         setUniform(shader, UNIFORM_FADE_ANCHOR_X, options.fadeAnchorX());

         if (options.outlineEnabled()) {
            setUniform(shader, UNIFORM_OUTLINE_THICKNESS, options.outlineThickness());
            float[] outlineColor = ColorUtil.toFloatComponents(options.outlineColor());
            setUniform(shader, UNIFORM_OUTLINE_COLOR, outlineColor);
         }

         BufferBuilder buffer = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         for (TextDrawCall call : entry.getValue()) {
            MsdfTextRender text = call.text();
            text.font().drawText(
               call.matrix(),
               buffer,
               text.text(),
               text.size(),
               text.thickness() + text.outlineThickness(),
               text.spacing(),
               call.x(),
               call.y() + text.font().getMetrics().getBaseline() * text.size(),
               call.z(),
               text.color()
            );
         }

         BuiltBuffer built = buffer.endNullable();
         if (built != null) {
            BufferRenderer.drawWithGlobalProgram(built);
         }
      }

      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
   }

   private static void setUniform(ShaderProgram shader, String name, float value) {
      GlUniform uniform = shader.getUniform(name);
      if (uniform != null) {
         uniform.set(value);
      }
   }

   private static void setUniform(ShaderProgram shader, String name, int value) {
      GlUniform uniform = shader.getUniform(name);
      if (uniform != null) {
         uniform.set(value);
      }
   }

   private static void setUniform(ShaderProgram shader, String name, float[] value) {
      GlUniform uniform = shader.getUniform(name);
      if (uniform != null && value.length >= 4) {
         uniform.set(value[0], value[1], value[2], value[3]);
      }
   }
}
