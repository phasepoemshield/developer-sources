package zenith;

import net.minecraft.util.Identifier;
import net.minecraft.client.render.Camera;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.render.FrameGraphBuilder;
import net.minecraft.client.render.DefaultFramebufferSet;
import net.minecraft.client.gl.PostEffectProcessor.SnowGolemPumpkinFeatureRenderer1;
import zenith.zov.utility.mixin.accessors.PostEffectProcessorAccessor;

public final class longHolder_8 {
   private static final Identifier[] IIIIIlIIIIl = new Identifier[]{
      Identifier.of("zenith", "shader_fog_gradient"),
      Identifier.of("zenith", "shader_fog_galaxy"),
      Identifier.of("zenith", "shader_fog_aqua"),
      Identifier.of("zenith", "shader_fog_purple"),
      Identifier.of("zenith", "shader_fog_overcast")
   };
   private static long l1I11I1Il1l1IlIll11 = -1L;
   private static float II11lIIIIlIIIlI = 0.0F;

   private longHolder_8() {
   }

   public static boolean StringHolder_8(FrameGraphBuilder FrameGraphBuilder, int i, int j, SnowGolemPumpkinFeatureRenderer1 SnowGolemPumpkinFeatureRenderer1, Camera Camera) {
      Shaderfog l111lliil1ilill1l1i11li = Shaderfog.II11l1IIIll1lIIllI111l1II;
      if (l111lliil1ilill1l1i11li.l1I1lIIIl1l1IlIIII11()) {
         net.minecraft.client.gl.PostEffectProcessor PostEffectProcessor = net.minecraft.client.MinecraftClient.getInstance()
            .getShaderLoader()
            .loadPostEffect(ArrayListHolder(l111lliil1ilill1l1i11li.ll1IlI1()), DefaultFramebufferSet.MAIN_ONLY);
         if (PostEffectProcessor == null) {
            return false;
         } else {
            StringHolder_8(PostEffectProcessor, i, j, Camera, ReadingThread(l111lliil1ilill1l1i11li.l11I1Il11I11l1I1()));
            PostEffectProcessor.render(FrameGraphBuilder, i, j, SnowGolemPumpkinFeatureRenderer1);
            return true;
         }
      } else {
         l1I11I1Il1l1IlIll11 = -1L;
         return false;
      }
   }

   private static Identifier ArrayListHolder(int i) {
      int j = Math.clamp((long)i, 0, IIIIIlIIIIl.length - 1);
      return IIIIIlIIIIl[j];
   }

   private static void StringHolder_8(net.minecraft.client.gl.PostEffectProcessor PostEffectProcessor, int i, int j, Camera Camera, float f) {
      Shaderfog l111lliil1ilill1l1i11li = Shaderfog.II11l1IIIll1lIIllI111l1II;
      float f1 = (float)i / Math.max((float)j, 1.0F);
      float f2 = ((Integer)net.minecraft.client.MinecraftClient.getInstance().options.getFov().getValue()).floatValue();
      float f3 = (float)Math.tan(Math.toRadians((double)f2) * 0.5);
      float f4 = (float)Math.toRadians((double)Camera.getPitch());
      float f5 = (float)(Math.PI - Math.toRadians((double)Camera.getYaw()));

      for (net.minecraft.client.gl.PostEffectPass PostEffectPass : ((PostEffectProcessorAccessor)PostEffectProcessor).getPasses()) {
         ShaderProgram ShaderProgram = PostEffectPass.getProgram();
         StringHolder_8(ShaderProgram, "FirstColor", l111lliil1ilill1l1i11li.I1l11IIl11IllIl11I11II11l1II1l());
         StringHolder_8(ShaderProgram, "SecondColor", l111lliil1ilill1l1i11li.Il1I1IIIllIll1());
         StringHolder_8(ShaderProgram, "PurpleColor", l111lliil1ilill1l1i11li.IlllllIIl1lIIl1lI());
         EventBus(ShaderProgram, "Intensity", l111lliil1ilill1l1i11li.l1111111llII1lI());
         EventBus(ShaderProgram, "time", f);
         StringHolder_8(ShaderProgram, i, j);
         StringHolder_8(ShaderProgram, "CameraPosition", Camera.getPos());
         StringHolder_8(ShaderProgram, f4, f5, f3, f1);
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
         II11lIIIIlIIIlI = (II11lIIIIlIIIlI + f1 * Math.max(0.0F, f)) % 10000.0F;
         return II11lIIIIlIIIlI;
      }
   }

   private static void EventBus(ShaderProgram ShaderProgram, String s, float f) {
      net.minecraft.client.gl.GlUniform GlUniform = ShaderProgram.getUniform(s);
      if (GlUniform != null) {
         GlUniform.set(f);
      }
   }

   private static void StringHolder_8(ShaderProgram ShaderProgram, int i, int j) {
      net.minecraft.client.gl.GlUniform GlUniform = ShaderProgram.getUniform("resolution");
      if (GlUniform != null) {
         GlUniform.set((float)i, (float)j);
      }
   }

   private static void StringHolder_8(ShaderProgram ShaderProgram, String s, net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.client.gl.GlUniform GlUniform = ShaderProgram.getUniform(s);
      if (GlUniform != null) {
         GlUniform.set((float)Vec3d.x, (float)Vec3d.y, (float)Vec3d.z);
      }
   }

   private static void StringHolder_8(ShaderProgram ShaderProgram, float f, float f1, float f2, float f3) {
      EventBus(ShaderProgram, "SkyPitch", f);
      EventBus(ShaderProgram, "SkyYaw", f1);
      EventBus(ShaderProgram, "TanHalfFov", f2);
      EventBus(ShaderProgram, "Aspect", f3);
   }

   private static void StringHolder_8(ShaderProgram ShaderProgram, String s, int i) {
      net.minecraft.client.gl.GlUniform GlUniform = ShaderProgram.getUniform(s);
      if (GlUniform != null) {
         GlUniform.set((float)(i >> 16 & 0xFF) / 255.0F, (float)(i >> 8 & 0xFF) / 255.0F, (float)(i & 0xFF) / 255.0F, (float)(i >> 24 & 0xFF) / 255.0F);
      }
   }
}
