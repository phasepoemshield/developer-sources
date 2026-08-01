package zenith.zov.base.font;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.text.Text;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.VertexFormat.LootPool96;
import net.minecraft.client.font.TextRenderer.ServerList5;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import zenith.ZenithInternal027;
import zenith.ListHolder_4;
import zenith.ByteBufferHolder;

public final class MsdfRenderer {
   public static final ShaderProgramKey MSDF_FONT_SHADER_KEY = new ShaderProgramKey(
      ResourceProvider.getShaderIdentifier("msdf_font/data"), VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY
   );
   private static final int VANILLA_TEXT_LIGHT = 15728880;
   public static final boolean USE_VANILLA_FALLBACK_FOR_TEXT = true;

   private static boolean offerText(Matrix4f matrix4f, Consumer<Matrix4f> consumer) {
      return ListHolder_4.StringHolder_8(matrix4f, MatrixStack -> consumer.accept(MatrixStack.peek().getPositionMatrix()));
   }

   public static void renderText(MsdfFont msdffont, String s, float f, int i, Matrix4f matrix4f, float f1, float f2, float f3) {
      renderText(msdffont, s, f, i, matrix4f, f1, f2, f3, false, 0.0F, 1.0F, 0.0F);
   }

   public static void renderText(
      MsdfFont msdffont, String s, float f, int i, Matrix4f matrix4f, float f1, float f2, float f3, boolean flag, float f4, float f5, float f6
   ) {
      if (!offerText(matrix4f, matrix4f1 -> renderText(msdffont, s, f, i, matrix4f1, f1, f2, f3, flag, f4, f5, f6))) {
         float f7 = 0.0F;
         float f8 = 0.45F;
         float f9 = 0.0F;
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableCull();
         RenderSystem.setShaderTexture(0, msdffont.getTextureId());
         ShaderProgram ShaderProgram = RenderSystem.setShader(MSDF_FONT_SHADER_KEY);
         ShaderProgram.getUniform("Range").set(msdffont.getAtlas().range());
         ShaderProgram.getUniform("Thickness").set(f7);
         ShaderProgram.getUniform("Smoothness").set(f8);
         ShaderProgram.getUniform("EnableFadeout").set(flag ? 1 : 0);
         ShaderProgram.getUniform("FadeoutStart").set(f4);
         ShaderProgram.getUniform("FadeoutEnd").set(f5);
         if (flag && f6 > 0.0F) {
            Vector4f vector4f = new Vector4f(f1, 0.0F, 0.0F, 1.0F);
            Vector4f vector4f1 = new Vector4f(f1 + f6, 0.0F, 0.0F, 1.0F);
            matrix4f.transform(vector4f);
            matrix4f.transform(vector4f1);
            float f10 = vector4f.x;
            float f11 = vector4f1.x - vector4f.x;
            ShaderProgram.getUniform("MaxWidth").set(f11);
            ShaderProgram.getUniform("TextPosX").set(f10);
         }

         float f12 = f2 + textLineOffset(msdffont, f);
         BufferBuilder BufferBuilder = Tessellator.getInstance().begin(LootPool96.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         msdffont.applyGlyphs(matrix4f, BufferBuilder, s, f, f7 * 0.5F * f, f9, f1, f12, f3, i);
         BuiltBuffer BuiltBuffer = BufferBuilder.endNullable();
         if (BuiltBuffer != null) {
            BufferRenderer.drawWithGlobalProgram(BuiltBuffer);
         }

         RenderSystem.setShaderTexture(0, 0);
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
      }
   }

   public static void renderText(MsdfFont msdffont, String s, float f, int i, Matrix4f matrix4f, float f1, float f2, float f3, boolean flag, float f4, float f5) {
      float f6 = msdffont.getWidth(s, f) * 2.0F;
      renderText(msdffont, s, f, i, matrix4f, f1, f2, f3, flag, f4, f5, f6);
   }

   public static void renderText(MsdfFont msdffont, Text Text, float f, Matrix4f matrix4f, float f1, float f2, float f3) {
      if (!offerText(matrix4f, matrix4f1 -> renderText(msdffont, Text, f, matrix4f1, f1, f2, f3))) {
         renderTextWithVanillaFallback(msdffont, Text, f, matrix4f, f1, f2, f3);
      }
   }

   public static void renderText(
      MsdfFont msdffont, Text Text, float f, Matrix4f matrix4f, float f1, float f2, float f3, boolean flag, float f4, float f5, float f6
   ) {
      if (!offerText(matrix4f, matrix4f1 -> renderText(msdffont, Text, f, matrix4f1, f1, f2, f3, flag, f4, f5, f6))) {
         renderTextWithVanillaFallback(msdffont, Text, f, matrix4f, f1, f2, f3);
      }
   }

   public static void renderText(
      MsdfFont msdffont, Text Text, float f, Matrix4f matrix4f, float f1, float f2, float f3, boolean flag, float f4, float f5, float f6, int i
   ) {
      if (!offerText(matrix4f, matrix4f1 -> renderText(msdffont, Text, f, matrix4f1, f1, f2, f3, flag, f4, f5, f6, i))) {
         renderTextWithVanillaFallback(msdffont, Text, f, matrix4f, f1, f2, f3, i);
      }
   }

   public static void renderTextWithVanillaFallback(MsdfFont msdffont, Text Text, float f, Matrix4f matrix4f, float f1, float f2, float f3) {
      renderTextWithVanillaFallback(msdffont, Text, f, matrix4f, f1, f2, f3, ByteBufferHolder.ll1lIllll111I1lIIl1lIl.lllIlll1Ill111l111Il11II11lII());
   }

   public static void renderTextWithVanillaFallback(MsdfFont msdffont, Text Text, float f, Matrix4f matrix4f, float f1, float f2, float f3, int i) {
      if (!offerText(matrix4f, matrix4f1 -> renderTextWithVanillaFallback(msdffont, Text, f, matrix4f1, f1, f2, f3, i))) {
         MinecraftClient MinecraftClient = MinecraftClient.getInstance();
         renderTextWithVanillaFallback(msdffont, Text, f, MinecraftClient.textRenderer, MinecraftClient.getBufferBuilders().getEntityVertexConsumers(), matrix4f, f1, f2, f3, i);
      }
   }

   public static void renderTextWithVanillaFallback(
      MsdfFont msdffont, Text Text, float f, TextRenderer TextRenderer, VertexConsumerProvider VertexConsumerProvider, Matrix4f matrix4f, float f1, float f2, float f3, int i
   ) {
      List list = FormattedTextProcessor.processText(Text, i);
      float f4 = f1;

      for (FormattedTextProcessor$TextSegment formattedtextprocessor$textsegment : list) {
         f4 = renderTextSegmentWithFallback(
            msdffont,
            TextRenderer,
            VertexConsumerProvider,
            normalizeTextForMsdf(formattedtextprocessor$textsegment.text()),
            f,
            formattedtextprocessor$textsegment.color(),
            matrix4f,
            f4,
            f2,
            f3
         );
      }
   }

   public static void renderText(
      MsdfFont msdffont, Text Text, float f, Matrix4f matrix4f, float f1, float f2, float f3, boolean flag, float f4, float f5
   ) {
      if (!offerText(matrix4f, matrix4f1 -> renderText(msdffont, Text, f, matrix4f1, f1, f2, f3, flag, f4, f5))) {
         renderTextWithVanillaFallback(msdffont, Text, f, matrix4f, f1, f2, f3);
      }
   }

   public static void renderText(MsdfFont msdffont, String s, float f, ZenithInternal027 i1li1li11i11l1111, Matrix4f matrix4f, float f1, float f2, float f3) {
      renderText(msdffont, s, f, i1li1li11i11l1111, matrix4f, f1, f2, f3, false, 0.0F, 1.0F, 0.0F);
   }

   public static void renderText(
      MsdfFont msdffont,
      String s,
      float f,
      ZenithInternal027 i1li1li11i11l1111,
      Matrix4f matrix4f,
      float f1,
      float f2,
      float f3,
      boolean flag,
      float f4,
      float f5,
      float f6
   ) {
      if (!offerText(matrix4f, matrix4f1 -> renderText(msdffont, s, f, i1li1li11i11l1111, matrix4f1, f1, f2, f3, flag, f4, f5, f6))) {
         s = s.replace("і", "i").replace("І", "I");
         float f7 = 0.05F;
         float f8 = 0.5F;
         float f9 = 0.0F;
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableCull();
         RenderSystem.setShaderTexture(0, msdffont.getTextureId());
         ShaderProgram ShaderProgram = RenderSystem.setShader(MSDF_FONT_SHADER_KEY);
         ShaderProgram.getUniform("Range").set(msdffont.getAtlas().range());
         ShaderProgram.getUniform("Thickness").set(f7);
         ShaderProgram.getUniform("Smoothness").set(f8);
         ShaderProgram.getUniform("EnableFadeout").set(flag ? 1 : 0);
         ShaderProgram.getUniform("FadeoutStart").set(f4);
         ShaderProgram.getUniform("FadeoutEnd").set(f5);
         float f10 = f1;
         float f11 = f6;
         if (flag && f6 > 0.0F) {
            Vector4f vector4f = new Vector4f(f1, 0.0F, 0.0F, 1.0F);
            Vector4f vector4f1 = new Vector4f(f1 + f6, 0.0F, 0.0F, 1.0F);
            matrix4f.transform(vector4f);
            matrix4f.transform(vector4f1);
            f10 = vector4f.x;
            f11 = vector4f1.x - vector4f.x;
         }

         ShaderProgram.getUniform("MaxWidth").set(f11);
         ShaderProgram.getUniform("TextPosX").set(f10);
         float f12 = f2 + textLineOffset(msdffont, f);
         BufferBuilder BufferBuilder = Tessellator.getInstance().begin(LootPool96.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         msdffont.applyGlyphs(matrix4f, BufferBuilder, s, f, f7 * 0.5F * f, f9, f1, f12, f3, i1li1li11i11l1111);
         BuiltBuffer BuiltBuffer = BufferBuilder.endNullable();
         if (BuiltBuffer != null) {
            BufferRenderer.drawWithGlobalProgram(BuiltBuffer);
         }

         RenderSystem.setShaderTexture(0, 0);
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
      }
   }

   public static float textLineOffset(MsdfFont msdffont, float f) {
      float f1 = msdffont.getMetrics().ascender();
      return (f1 > 0.0F ? f1 : 0.7F) * f;
   }

   private static float renderTextSegmentWithFallback(
      MsdfFont msdffont, TextRenderer TextRenderer, VertexConsumerProvider VertexConsumerProvider, String s, float f, int i, Matrix4f matrix4f, float f1, float f2, float f3
   ) {
      StringBuilder stringbuilder = new StringBuilder();
      boolean flag = false;
      boolean flag1 = false;
      int j = 0;

      while (j < s.length()) {
         int k = s.codePointAt(j);
         int l = j + Character.charCount(k);
         if (k == 167) {
            j = skipFormattingCode(s, l);
         } else {
            boolean flag2 = canRenderWithMsdf(msdffont, k);
            if (flag && flag1 != flag2) {
               f1 = renderTextRun(msdffont, TextRenderer, VertexConsumerProvider, stringbuilder.toString(), flag1, f, i, matrix4f, f1, f2, f3);
               stringbuilder.setLength(0);
            }

            stringbuilder.append(s, j, l);
            flag = true;
            flag1 = flag2;
            j = l;
         }
      }

      if (flag) {
         f1 = renderTextRun(msdffont, TextRenderer, VertexConsumerProvider, stringbuilder.toString(), flag1, f, i, matrix4f, f1, f2, f3);
      }

      return f1;
   }

   private static float renderTextRun(
      MsdfFont msdffont, TextRenderer TextRenderer, VertexConsumerProvider VertexConsumerProvider, String s, boolean flag, float f, int i, Matrix4f matrix4f, float f1, float f2, float f3
   ) {
      if (s.isEmpty()) {
         return f1;
      } else if (flag) {
         renderText(msdffont, s, f, i, matrix4f, f1, f2, f3);
         return f1 + msdffont.getWidth(s, f);
      } else {
         renderVanillaText(msdffont, TextRenderer, VertexConsumerProvider, s, f, i, matrix4f, f1, f2, f3);
         return f1 + (float)TextRenderer.getWidth(s) * vanillaTextScale(TextRenderer, f);
      }
   }

   private static void renderVanillaText(
      MsdfFont msdffont, TextRenderer TextRenderer, VertexConsumerProvider VertexConsumerProvider, String s, float f, int i, Matrix4f matrix4f, float f1, float f2, float f3
   ) {
      float f4 = vanillaTextScale(TextRenderer, f);
      float f5 = f2 + (-textLineOffset(msdffont, f) + 9.0F) * 0.5F;
      Matrix4f matrix4f1 = new Matrix4f(matrix4f).translate(f1, f5, f3).scale(f4, f4, 1.0F);
      TextRenderer.draw(s, 0.0F, 0.0F, i, false, matrix4f1, VertexConsumerProvider, ServerList5.NORMAL, 0, 15728880);
   }

   private static float vanillaTextScale(TextRenderer TextRenderer, float f) {
      return f / Math.max(1.0F, 9.0F);
   }

   private static boolean canRenderWithMsdf(MsdfFont msdffont, int i) {
      return i <= 65535 && msdffont.hasGlyph(i);
   }

   private static int skipFormattingCode(String s, int i) {
      return i >= s.length() ? i : i + Character.charCount(s.codePointAt(i));
   }

   private static String normalizeTextForMsdf(String s) {
      return s.replace("ᴀ", "A")
         .replace("ʙ", "B")
         .replace("ᴄ", "C")
         .replace("ᴅ", "D")
         .replace("ᴇ", "E")
         .replace("ꜰ", "F")
         .replace("ɢ", "G")
         .replace("ʜ", "H")
         .replace("ɪ", "I")
         .replace("ᴊ", "J")
         .replace("ᴋ", "K")
         .replace("ʟ", "L")
         .replace("ᴍ", "M")
         .replace("ɴ", "N")
         .replace("ᴏ", "O")
         .replace("ᴘ", "P")
         .replace("ʀ", "R")
         .replace("ꜱ", "S")
         .replace("ᴛ", "T")
         .replace("ᴜ", "U")
         .replace("ᴠ", "V")
         .replace("ᴡ", "W")
         .replace("ʏ", "Y")
         .replace("ᴢ", "Z")
         .replace("ǫ", "Q")
         .replace("ʠ", "Q");
   }

   public static void renderText(
      MsdfFont msdffont,
      String s,
      float f,
      ZenithInternal027 i1li1li11i11l1111,
      Matrix4f matrix4f,
      float f1,
      float f2,
      float f3,
      boolean flag,
      float f4,
      float f5
   ) {
      float f6 = msdffont.getWidth(s, f) * 2.0F;
      renderText(msdffont, s, f, i1li1li11i11l1111, matrix4f, f1, f2, f3, flag, f4, f5, f6);
   }

   private MsdfRenderer() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
