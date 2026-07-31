package zenith;

import net.minecraft.util.Identifier;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.render.FrameGraphBuilder;
import net.minecraft.client.render.DefaultFramebufferSet;
import net.minecraft.client.gl.PostEffectProcessor.SnowGolemPumpkinFeatureRenderer1;
import zenith.zov.utility.mixin.accessors.PostEffectProcessorAccessor;

public final class IdentifierHolder {
   private static final Identifier llllIl111l11llllll1Il11II = Identifier.of("zenith", "shader_esp");
   private static long l1I11I1Il1l1IlIll11 = -1L;
   private static float II11lIIIIlIIIlI;

   private IdentifierHolder() {
   }

   public static boolean StringHolder_8(FrameGraphBuilder FrameGraphBuilder, int i, int j, SnowGolemPumpkinFeatureRenderer1 SnowGolemPumpkinFeatureRenderer1) {
      Shaderesp ll1i1illiii111l1llliill = Shaderesp.IIlIII1I1Il1I111IlIl1lII;
      if (ll1i1illiii111l1llliill != null && ll1i1illiii111l1llliill.Spider()) {
         net.minecraft.client.gl.PostEffectProcessor PostEffectProcessor = net.minecraft.client.MinecraftClient.getInstance()
            .getShaderLoader()
            .loadPostEffect(llllIl111l11llllll1Il11II, DefaultFramebufferSet.MAIN_AND_ENTITY_OUTLINE);
         if (PostEffectProcessor == null) {
            return false;
         } else {
            StringHolder_8(PostEffectProcessor, ReadingThread(ll1i1illiii111l1llliill.l11I1Il11I11l1I1()));
            PostEffectProcessor.render(FrameGraphBuilder, i, j, SnowGolemPumpkinFeatureRenderer1);
            return true;
         }
      } else {
         l1I11I1Il1l1IlIll11 = -1L;
         return false;
      }
   }

   private static void StringHolder_8(net.minecraft.client.gl.PostEffectProcessor PostEffectProcessor, float f) {
      Shaderesp ll1i1illiii111l1llliill = Shaderesp.IIlIII1I1Il1I111IlIl1lII;
      if (PostEffectProcessor != null && ll1i1illiii111l1llliill != null && ll1i1illiii111l1llliill.Spider()) {
         for (net.minecraft.client.gl.PostEffectPass PostEffectPass : ((PostEffectProcessorAccessor)PostEffectProcessor).getPasses()) {
            ShaderProgram ShaderProgram = PostEffectPass.getProgram();
            StringHolder_8(ShaderProgram, "OutlineColor", ll1i1illiii111l1llliill.l11llI111I1Il());
            StringHolder_8(ShaderProgram, "FirstFillColor", ll1i1illiii111l1llliill.llllll1I1II1ll11I11l1l());
            StringHolder_8(ShaderProgram, "SecondFillColor", ll1i1illiii111l1llliill.l11lIll1IlIII1II1I1I11lIII());
            StringHolder_8(ShaderProgram, "Time", f);
         }
      }
   }

   private static float ReadingThread(float f) {
      long i = System.nanoTime();
      if (l1I11I1Il1l1IlIll11 < 0L) {
         l1I11I1Il1l1IlIll11 = i;
         return II11lIIIIlIIIlI;
      } else {
         float f1 = Math.min((float)(i - l1I11I1Il1l1IlIll11) / 1.0E9F, 0.1F);
         l1I11I1Il1l1IlIll11 = i;
         II11lIIIIlIIIlI = (II11lIIIIlIIIlI + f1 * Math.max(0.0F, f)) % 100000.0F;
         return II11lIIIIlIIIlI;
      }
   }

   private static void StringHolder_8(ShaderProgram ShaderProgram, String s, float f) {
      net.minecraft.client.gl.GlUniform GlUniform = ShaderProgram.getUniform(s);
      if (GlUniform != null) {
         GlUniform.set(f);
      }
   }

   private static void StringHolder_8(ShaderProgram ShaderProgram, String s, int i) {
      net.minecraft.client.gl.GlUniform GlUniform = ShaderProgram.getUniform(s);
      if (GlUniform != null) {
         GlUniform.set((float)(i >> 16 & 0xFF) / 255.0F, (float)(i >> 8 & 0xFF) / 255.0F, (float)(i & 0xFF) / 255.0F, (float)(i >> 24 & 0xFF) / 255.0F);
      }
   }
}
