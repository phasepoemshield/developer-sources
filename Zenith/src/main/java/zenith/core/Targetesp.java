package zenith;

import zenith.hud.*;

import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType4;
import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType5;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Random;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexFormat.LootPool96;
import org.joml.Matrix4f;

@ModuleInfo(
   name = "TargetESP",
   category = Category.RENDER,
   description = "module.targetESP.description"
)
public class Targetesp extends Module {
   public static final Targetesp l1l111l111llllll1ll1l1111ll1 = new Targetesp();
   private static final Identifier I1IlI1ll1I = Identifier.of("zenith", "visuals/targetesp/targetesp.png");
   private static final Identifier IIIlIIIlIl11 = Identifier.of("zenith", "visuals/targetesp/targetesp-1.png");
   private static final Identifier l1l1ll1IlIIll1I1 = Identifier.of("zenith", "visuals/targetesp/targetesp-2.png");
   private static final int l1IIl1I1IIII1I1lllII1 = 3;
   private static final float IIlI1IlI1Il1lI1IIl1IlII1lII11 = (float) (Math.PI / 180.0);
   private static final int ll1ll1ll1l1II = 16;
   private static final int l1IIIl111IlIlI1II1II = 28;
   private static final int l1l1IlII1Il1l1Il11lIllIlII11I = 36;
   private static final int I1II1lll1I11l11l1Ill1llI11lI = 24;
   private static final float[] IIlIlllII1II1lllII111l1lIll = new float[]{
      0.0F,
      0.19509032F,
      0.38268343F,
      0.55557024F,
      0.70710677F,
      0.8314696F,
      0.9238795F,
      0.98078525F,
      1.0F,
      0.98078525F,
      0.9238795F,
      0.8314696F,
      0.70710677F,
      0.55557024F,
      0.38268343F,
      0.19509032F,
      1.2246469E-16F
   };
   private static final float[] II1l11I11l11lII1lI1I11IIIII = new float[]{
      -1.0F,
      -0.98078525F,
      -0.9238795F,
      -0.8314696F,
      -0.70710677F,
      -0.55557024F,
      -0.38268343F,
      -0.19499628F,
      0.0F,
      0.19499628F,
      0.38268343F,
      0.55557024F,
      0.707039F,
      0.8314696F,
      0.9238795F,
      0.9807666F,
      1.0F
   };
   private static final float[] ll111l11IIlI1l11lI1lIl11III111 = new float[]{
      1.0F,
      0.9749401F,
      0.9009748F,
      0.7818742F,
      0.6235112F,
      0.4339578F,
      0.22256099F,
      1.2246469E-16F,
      -0.22246753F,
      -0.4338714F,
      -0.6234363F,
      -0.7818144F,
      -0.9009332F,
      -0.9749188F,
      -1.0F,
      -0.9749401F,
      -0.9009748F,
      -0.7818742F,
      -0.6235112F,
      -0.4339578F,
      -0.22256099F,
      0.0F,
      0.22246753F,
      0.4338714F,
      0.6234363F,
      0.7818144F,
      0.9009332F,
      0.9749188F,
      1.0F
   };
   private static final float[] llI111I1lI1llllIIIllll1Il1 = new float[]{
      0.0F,
      0.22246753F,
      0.4338714F,
      0.6234363F,
      0.7818144F,
      0.9009332F,
      0.9749188F,
      1.0F,
      0.9749401F,
      0.9009748F,
      0.7818742F,
      0.6235112F,
      0.4339578F,
      0.22256099F,
      1.2246469E-16F,
      -0.22246753F,
      -0.4338714F,
      -0.6234363F,
      -0.7818144F,
      -0.9009332F,
      -0.9749188F,
      -1.0F,
      -0.9749401F,
      -0.9009748F,
      -0.7818742F,
      -0.6235112F,
      -0.4339578F,
      -0.22256099F,
      0.0F
   };
   private static final float[] lI11l11Il1Il1II = new float[]{
      1.0F,
      0.9848152F,
      0.93972176F,
      0.86604136F,
      0.76609236F,
      0.6428039F,
      0.5000554F,
      0.34203017F,
      0.17370063F,
      1.2246469E-16F,
      -0.17360622F,
      -0.34194008F,
      -0.4999723F,
      -0.6427305F,
      -0.7660307F,
      -0.86599344F,
      -0.939689F,
      -0.9847985F,
      -1.0F,
      -0.9848152F,
      -0.93972176F,
      -0.86604136F,
      -0.76609236F,
      -0.6428039F,
      -0.5000554F,
      -0.34203017F,
      -0.17370063F,
      0.0F,
      0.17360622F,
      0.34194008F,
      0.4999723F,
      0.6427305F,
      0.7660307F,
      0.86599344F,
      0.939689F,
      0.9847985F,
      1.0F
   };
   private static final float[] l11IllIlIllI = new float[]{
      0.0F,
      0.17360622F,
      0.34194008F,
      0.4999723F,
      0.6427305F,
      0.7660307F,
      0.86599344F,
      0.939689F,
      0.9847985F,
      1.0F,
      0.9848152F,
      0.93972176F,
      0.86604136F,
      0.76609236F,
      0.6428039F,
      0.5000554F,
      0.34203017F,
      0.17370063F,
      1.2246469E-16F,
      -0.17360622F,
      -0.34194008F,
      -0.4999723F,
      -0.6427305F,
      -0.7660307F,
      -0.86599344F,
      -0.939689F,
      -0.9847985F,
      -1.0F,
      -0.9848152F,
      -0.93972176F,
      -0.86604136F,
      -0.76609236F,
      -0.6428039F,
      -0.5000554F,
      -0.34203017F,
      -0.17370063F,
      0.0F
   };
   private static final float[] llI1IIll1llll1IlIlIll11llI1l = new float[]{
      1.0F,
      0.9659424F,
      0.86604136F,
      0.70710677F,
      0.5000554F,
      0.25884992F,
      1.2246469E-16F,
      -0.2587573F,
      -0.4999723F,
      -0.70710677F,
      -0.86599344F,
      -0.9659175F,
      -1.0F,
      -0.9659424F,
      -0.86604136F,
      -0.70710677F,
      -0.5000554F,
      -0.25884992F,
      0.0F,
      0.2587573F,
      0.4999723F,
      0.70710677F,
      0.86599344F,
      0.9659175F
   };
   private static final float[] I1Il1I1II1l1llllIlIl11I1l1111 = new float[]{
      0.0F,
      0.2587573F,
      0.4999723F,
      0.70710677F,
      0.86599344F,
      0.9659175F,
      1.0F,
      0.9659424F,
      0.86604136F,
      0.70710677F,
      0.5000554F,
      0.25884992F,
      1.2246469E-16F,
      -0.2587573F,
      -0.4999723F,
      -0.70710677F,
      -0.86599344F,
      -0.9659175F,
      -1.0F,
      -0.9659424F,
      -0.86604136F,
      -0.70710677F,
      -0.5000554F,
      -0.25884992F
   };
   private final ModeSetting I11I1lIIIllI1l1lIIlIII1lllIII = new ModeSetting("module.targetESP.texture", "module.targetESP.texture.desc");
   private final ModeOption llll1I1l1llllII1llIll = new ModeOption(
         this.I11I1lIIIllI1l1lIIlIII1lllIII, "module.targetESP.texture.vortex"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final ModeOption Il1I1llIlI1Il1111 = new ModeOption(
      this.I11I1lIIIllI1l1lIIlIII1lllIII, "module.targetESP.texture.garland"
   );
   private final ModeOption lI1I11lll1l1lII11lIl1 = new ModeOption(
      this.I11I1lIIIllI1l1lIIlIII1lllIII, "module.targetESP.texture.brackets"
   );
   private final NumberSetting lllI1lI1Ill1II1IIIll1III1l1l = new NumberSetting(
      "module.targetESP.size", 1.2F, 0.3F, 3.0F, 0.05F, "module.targetESP.size.desc", "x"
   );
   private final NumberSetting lll1I1lllIIlI111 = new NumberSetting(
      "module.targetESP.speed", 1.0F, 0.0F, 4.0F, 0.05F, "module.targetESP.speed.desc", "x"
   );
   private final BooleanSetting Illl1Illlll11III1IlI1lI1 = new BooleanSetting(
      "module.targetESP.red", "module.targetESP.red.description", true
   );
   private final GetStartTimeHandler Ill11IlI1l1lll1l1IIIII1IIIII = new GetStartTimeHandler(250L, IReturn.ListHolder_8);
   private final Random Il11lI1IIIIlIl1II = new Random();
   private final float[] ll11llII111IllI11ll11l11I1lll = new float[3];
   private final float[] I111II1ll1llIlI = new float[3];
   private final float[] IlI1I1lllIIlI11I1I = new float[3];
   private final float[] IllI1Ill11lIIlIlI1IIl11 = new float[3];
   private final float[] I11IIIl1IllIlII1 = new float[3];
   private final float[] lI1Il11llIII111 = new float[3];
   private final float[] lI1I1l1111ll1IIlIllllllll1I1 = new float[3];
   private final float[] lII111IIlIlIlll1l11I1 = new float[3];
   private final float[] I1II1ll1lIl1IlIl1IlIllll = new float[3];
   private final float[] llIII11l1I11Ill1111I11l11 = new float[3];
   private final float[] Il1I1Ill1I1IlII1III1l1I1 = new float[3];
   private final Matrix4f IIII1II1IllI1II11111Ill11llIl = new Matrix4f();
   private final long II1l11111IlI1I1lIIl11III = System.currentTimeMillis();
   private LivingEntity llIl11llIII1IIlI1;

   private Targetesp() {
      this.Il1I1lllIl1();
   }

   @EventTarget
   public void byteHolder(EventImpl_34 ll1li1l111llllli1) {
      LivingEntity LivingEntity = Aura.ll1II1l1lII11IlII1.lI1IIllII11I();
      if (LivingEntity != null && (!LivingEntity.isAlive() || LivingEntity.isRemoved())) {
         LivingEntity = null;
      }

      this.StringHolder_8(LivingEntity);
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.world != null
         && this.llIl11llIII1IIlI1 != null
         && !(this.Ill11IlI1l1lll1l1IIIII1IIIII.CloudFriendInfo() <= 0.01F)) {
         this.EventTarget(ll1li1l111llllli1.Norender());
      }
   }

   private void EventTarget(MatrixStack MatrixStack) {
      Camera Camera = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera;
      net.minecraft.util.math.Vec3d Vec3dx = doubleHolder_3.ZenithInternal021(this.llIl11llIII1IIlI1);
      net.minecraft.util.math.Box Box = this.llIl11llIII1IIlI1.getBoundingBox().offset(Vec3dx.subtract(this.llIl11llIII1IIlI1.getPos()));
      net.minecraft.util.math.Vec3d Vec3dx = Box.getCenter();
      net.minecraft.util.math.Vec3d Vec3dxx = Camera.getPos();
      double d0 = Vec3dx.x - Vec3dxx.x;
      double d1 = Box.minY - Vec3dxx.y;
      double d2 = Vec3dx.z - Vec3dxx.z;
      float f = (float)Box.getLengthY();
      float f1 = this.lll1I1lllIIlI111.lll1lI1llll1IIllIIIII1lll();
      float f2 = (float)Math.max(Box.getLengthX(), Box.getLengthZ()) * 5.0F * this.lllI1lI1Ill1II1IIIll1III1l1l.lll1lI1llll1IIllIIIII1lll();
      float f3 = f2 * 0.5F;
      float f4 = (float)(System.currentTimeMillis() - this.II1l11111IlI1I1lIIl11III) / 1000.0F;
      float f5 = this.Illl1Illlll11III1IlI1lI1.Spider() ? MathHelper.clamp((float)this.llIl11llIII1IIlI1.hurtTime / 10.0F, 0.0F, 1.0F) : 0.0F;
      int i = PatternHolder.EventBus(
         ZenithClient.getInstance()
            .floatHolder_3()
            .getClientColor(90)
            .StringHolder_8(ByteBufferHolder.lIlll1llI1l11I1ll11llIll111I, f5)
            .lllIlll1Ill111l111Il11II11lII(),
         this.Ill11IlI1l1lll1l1IIIII1IIIII.CloudFriendInfo()
      );
      float f6 = f * 0.62F - 0.006F;
      float f7 = Camera.getYaw() * (float) (Math.PI / 180.0);
      float f8 = Camera.getPitch() * (float) (Math.PI / 180.0);
      boolean flag = l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.canSee(this.llIl11llIII1IIlI1);

      for (int j = 0; j < 3; j++) {
         float f9 = (MathHelper.sin(f4 * f1 * 3.4F + (float)j * (float) (Math.PI * 2.0 / 3.0)) + 1.0F) * 0.5F;
         this.I11IIIl1IllIlII1[j] = MathHelper.lerp(f9, 0.35F, 1.0F);
         this.lI1Il11llIII111[j] = -f4 * 140.0F * f1 * this.IllI1Ill11lIIlIlI1IIl11[j] + this.ll11llII111IllI11ll11l11I1lll[j];
         this.lI1I1l1111ll1IIlIllllllll1I1[j] = MathHelper.sin(f4 * this.IlI1I1lllIIlI11I1I[j] + this.I111II1ll1llIlI[j]) * 30.0F;
         float f10 = (90.0F + this.lI1Il11llIII111[j]) * (float) (Math.PI / 180.0);
         float f11 = this.lI1I1l1111ll1IIlIllllllll1I1[j] * (float) (Math.PI / 180.0);
         this.lII111IIlIlIlll1l11I1[j] = MathHelper.cos(f10);
         this.I1II1ll1lIl1IlIl1IlIllll[j] = MathHelper.sin(f10);
         this.llIII11l1I11Ill1111I11l11[j] = MathHelper.cos(f11);
         this.Il1I1Ill1I1IlII1III1l1I1[j] = MathHelper.sin(f11);
      }

      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      if (this.Il1I1llIlI1Il1111.isSelected()) {
         this.StringHolder_8(matrix4f, d0, d1, d2, f2, f4, i, f6, f7, f8, flag);
      } else {
         RenderSystem.enableBlend();
         this.ZenithInternal072(flag);
         RenderSystem.depthMask(false);
         RenderSystem.disableCull();
         Identifier Identifier = this.I1IlIllllI1Il1II1I1ll();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         RenderSystem.setShaderTexture(0, Identifier);
         RenderSystem.blendFuncSeparate(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE_MINUS_SRC_ALPHA, AdvancementTabType5.ZERO, AdvancementTabType4.ONE);
         net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);

         for (int k = 0; k < 3; k++) {
            this.StringHolder_8(
               matrix4f,
               BufferBuilder,
               d0,
               d1,
               d2,
               f3,
               f6 + 0.006F * (float)k,
               this.lI1Il11llIII111[k],
               this.lI1I1l1111ll1IIlIllllllll1I1[k],
               PatternHolder.EventBus(i, this.I11IIIl1IllIlII1[k])
            );
         }

         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         RenderSystem.blendFuncSeparate(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE, AdvancementTabType5.ZERO, AdvancementTabType4.ONE);
         BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);

         for (int l = 0; l < 3; l++) {
            this.StringHolder_8(
               matrix4f,
               BufferBuilder,
               d0,
               d1,
               d2,
               f3,
               f6 + 0.006F * (float)l,
               this.lI1Il11llIII111[l],
               this.lI1I1l1111ll1IIlIllllllll1I1[l],
               PatternHolder.EventBus(i, this.I11IIIl1IllIlII1[l] * 0.85F)
            );
         }

         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         RenderSystem.depthMask(true);
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   private void StringHolder_8(
      Matrix4f matrix4f, net.minecraft.client.render.BufferBuilder BufferBuilder, double d0, double d1, double d2, float f, float f1, float f2, float f3, int i
   ) {
      this.IIII1II1IllI1II11111Ill11llIl
         .set(matrix4f)
         .translate((float)d0, (float)(d1 + (double)f1), (float)d2)
         .rotateY((90.0F + f2) * (float) (Math.PI / 180.0))
         .rotateX(f3 * (float) (Math.PI / 180.0));
      BufferBuilder.vertex(this.IIII1II1IllI1II11111Ill11llIl, -f, 0.0F, -f).texture(0.0F, 0.0F).color(i);
      BufferBuilder.vertex(this.IIII1II1IllI1II11111Ill11llIl, -f, 0.0F, f).texture(0.0F, 1.0F).color(i);
      BufferBuilder.vertex(this.IIII1II1IllI1II11111Ill11llIl, f, 0.0F, f).texture(1.0F, 1.0F).color(i);
      BufferBuilder.vertex(this.IIII1II1IllI1II11111Ill11llIl, f, 0.0F, -f).texture(1.0F, 0.0F).color(i);
   }

   private void StringHolder_8(Matrix4f matrix4f, double d0, double d1, double d2, float f, float f1, int i, float f2, float f3, float f4, boolean flag) {
      RenderSystem.enableBlend();
      this.ZenithInternal072(flag);
      RenderSystem.depthMask(false);
      RenderSystem.disableCull();
      RenderSystem.blendFuncSeparate(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE, AdvancementTabType5.ZERO, AdvancementTabType4.ONE);
      float f5 = f * 0.34F;
      float f6 = MathHelper.clamp(f * 0.025F, 0.045F, 0.085F);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.TRIANGLES, net.minecraft.client.render.VertexFormats.POSITION_COLOR);

      for (int j = 0; j < 3; j++) {
         this.StringHolder_8(
            matrix4f,
            BufferBuilder,
            d0,
            d1,
            d2,
            f5,
            f6,
            f2 + 0.006F * (float)j,
            this.lII111IIlIlIlll1l11I1[j],
            this.I1II1ll1lIl1IlIl1IlIllll[j],
            this.llIII11l1I11Ill1111I11l11[j],
            this.Il1I1Ill1I1IlII1III1l1I1[j],
            PatternHolder.EventBus(i, this.I11IIIl1IllIlII1[j]),
            f1,
            j,
            f3,
            f4
         );
      }

      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      RenderSystem.depthMask(flag);
      RenderSystem.enableCull();
      BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);

      for (int k = 0; k < 3; k++) {
         this.StringHolder_8(
            matrix4f,
            BufferBuilder,
            d0,
            d1,
            d2,
            f5,
            f6,
            f2 + 0.006F * (float)k,
            this.lII111IIlIlIlll1l11I1[k],
            this.I1II1ll1lIl1IlIl1IlIllll[k],
            this.llIII11l1I11Ill1111I11l11[k],
            this.Il1I1Ill1I1IlII1III1l1I1[k],
            PatternHolder.EventBus(i, this.I11IIIl1IllIlII1[k]),
            f1,
            k
         );
      }

      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   }

   private void StringHolder_8(
      Matrix4f matrix4f,
      net.minecraft.client.render.BufferBuilder BufferBuilder,
      double d0,
      double d1,
      double d2,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      float f5,
      float f6,
      int i,
      float f7,
      int j
   ) {
      for (int k = 0; k < 24; k++) {
         float f8 = llI1IIll1llll1IlIlIll11llI1l[k] * f;
         float f9 = I1Il1I1II1l1llllIlIl11I1l1111[k] * f;
         float f10 = (MathHelper.sin(f7 * 4.0F + (float)k * 0.9F + (float)j) + 1.0F) * 0.5F;
         float f11 = f8 * f3 + f9 * f5 * f4;
         float f12 = -f9 * f6;
         float f13 = -f8 * f4 + f9 * f5 * f3;
         float f14 = f1 * (0.9F + f10 * 0.28F);
         int l = PatternHolder.EventBus(i, 0.78F + f10 * 0.22F);
         this.StringHolder_8(matrix4f, BufferBuilder, (float)(d0 + (double)f11), (float)(d1 + (double)f2 + (double)f12), (float)(d2 + (double)f13), f14, l);
      }
   }

   private void StringHolder_8(
      Matrix4f matrix4f,
      net.minecraft.client.render.BufferBuilder BufferBuilder,
      double d0,
      double d1,
      double d2,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      float f5,
      float f6,
      int i,
      float f7,
      int j,
      float f8,
      float f9
   ) {
      for (int k = 0; k < 24; k++) {
         float f10 = llI1IIll1llll1IlIlIll11llI1l[k] * f;
         float f11 = I1Il1I1II1l1llllIlIl11I1l1111[k] * f;
         float f12 = (MathHelper.sin(f7 * 4.0F + (float)k * 0.9F + (float)j) + 1.0F) * 0.5F;
         float f13 = f10 * f3 + f11 * f5 * f4;
         float f14 = -f11 * f6;
         float f15 = -f10 * f4 + f11 * f5 * f3;
         float f16 = f1 * (0.9F + f12 * 0.28F);
         float f17 = (float)(d0 + (double)f13);
         float f18 = (float)(d1 + (double)f2 + (double)f14);
         float f19 = (float)(d2 + (double)f15);
         this.StringHolder_8(
            matrix4f, BufferBuilder, f17, f18, f19, f16 * (3.6F + f12 * 0.7F), PatternHolder.EventBus(i, 0.105F + f12 * 0.035F), f8, f9
         );
         this.StringHolder_8(
            matrix4f, BufferBuilder, f17, f18, f19, f16 * (1.9F + f12 * 0.3F), PatternHolder.EventBus(i, 0.18F + f12 * 0.055F), f8, f9
         );
      }
   }

   private void StringHolder_8(Matrix4f matrix4f, net.minecraft.client.render.BufferBuilder BufferBuilder, float f, float f1, float f2, float f3, int i) {
      this.IIII1II1IllI1II11111Ill11llIl.set(matrix4f).translate(f, f1, f2);

      for (int j = 0; j < 16; j++) {
         float f4 = II1l11I11l11lII1lI1I11IIIII[j] * f3;
         float f5 = IIlIlllII1II1lllII111l1lIll[j] * f3;
         float f6 = II1l11I11l11lII1lI1I11IIIII[j + 1] * f3;
         float f7 = IIlIlllII1II1lllII111l1lIll[j + 1] * f3;

         for (int k = 0; k < 28; k++) {
            float f8 = ll111l11IIlI1l11lI1lIl11III111[k];
            float f9 = llI111I1lI1llllIIIllll1Il1[k];
            float f10 = ll111l11IIlI1l11lI1lIl11III111[k + 1];
            float f11 = llI111I1lI1llllIIIllll1Il1[k + 1];
            BufferBuilder.vertex(this.IIII1II1IllI1II11111Ill11llIl, f8 * f5, f4, f9 * f5).color(i);
            BufferBuilder.vertex(this.IIII1II1IllI1II11111Ill11llIl, f8 * f7, f6, f9 * f7).color(i);
            BufferBuilder.vertex(this.IIII1II1IllI1II11111Ill11llIl, f10 * f7, f6, f11 * f7).color(i);
            BufferBuilder.vertex(this.IIII1II1IllI1II11111Ill11llIl, f10 * f5, f4, f11 * f5).color(i);
         }
      }
   }

   private void StringHolder_8(Matrix4f matrix4f, net.minecraft.client.render.BufferBuilder BufferBuilder, float f, float f1, float f2, float f3, int i, float f4, float f5) {
      this.IIII1II1IllI1II11111Ill11llIl.set(matrix4f).translate(f, f1, f2).rotateY(-f4).rotateX(f5);
      int j = PatternHolder.EventBus(i, 0.0F);

      for (int k = 0; k < 36; k++) {
         float f6 = lI11l11Il1Il1II[k];
         float f7 = l11IllIlIllI[k];
         float f8 = lI11l11Il1Il1II[k + 1];
         float f9 = l11IllIlIllI[k + 1];
         BufferBuilder.vertex(this.IIII1II1IllI1II11111Ill11llIl, 0.0F, 0.0F, 0.0F).color(i);
         BufferBuilder.vertex(this.IIII1II1IllI1II11111Ill11llIl, f6 * f3, f7 * f3, 0.0F).color(j);
         BufferBuilder.vertex(this.IIII1II1IllI1II11111Ill11llIl, f8 * f3, f9 * f3, 0.0F).color(j);
      }
   }

   private Identifier I1IlIllllI1Il1II1I1ll() {
      if (this.Il1I1llIlI1Il1111.isSelected()) {
         return IIIlIIIlIl11;
      } else {
         return this.lI1I11lll1l1lII11lIl1.isSelected() ? l1l1ll1IlIIll1I1 : I1IlI1ll1I;
      }
   }

   private void ZenithInternal072(boolean flag) {
      if (flag) {
         RenderSystem.enableDepthTest();
      } else {
         RenderSystem.disableDepthTest();
      }
   }

   private void StringHolder_8(LivingEntity LivingEntity) {
      if (LivingEntity == null) {
         this.Ill11IlI1l1lll1l1IIIII1IIIII.StringHolder_8(0.0F);
         if (this.Ill11IlI1l1lll1l1IIIII1IIIII.CloudFriendInfo() <= 0.01F) {
            this.llIl11llIII1IIlI1 = null;
         }
      } else if (LivingEntity != this.llIl11llIII1IIlI1) {
         this.Ill11IlI1l1lll1l1IIIII1IIIII.StringHolder_8(0.0F);
         if (this.Ill11IlI1l1lll1l1IIIII1IIIII.CloudFriendInfo() <= 0.01F) {
            this.llIl11llIII1IIlI1 = LivingEntity;
            this.Il1I1lllIl1();
         }
      } else {
         this.Ill11IlI1l1lll1l1IIIII1IIIII.StringHolder_8(1.0F);
      }
   }

   private void Il1I1lllIl1() {
      for (int i = 0; i < 3; i++) {
         this.IllI1Ill11lIIlIlI1IIl11[i] = 0.75F + this.Il11lI1IIIIlIl1II.nextFloat() * 0.5F;
         this.IlI1I1lllIIlI11I1I[i] = 0.8F + this.Il11lI1IIIIlIl1II.nextFloat() * 0.8F;
         this.I111II1ll1llIlI[i] = this.Il11lI1IIIIlIl1II.nextFloat() * (float) (Math.PI * 2);
      }

      for (int i1 = 0; i1 < 64; i1++) {
         for (int j = 0; j < 3; j++) {
            this.ll11llII111IllI11ll11l11I1lll[j] = -30.0F + this.Il11lI1IIIIlIl1II.nextFloat() * 60.0F;
         }

         boolean flag = true;

         for (int k = 0; k < 3 && flag; k++) {
            for (int l = k + 1; l < 3 && flag; l++) {
               if (Math.abs(this.ll11llII111IllI11ll11l11I1lll[k] - this.ll11llII111IllI11ll11l11I1lll[l]) < 22.0F) {
                  flag = false;
               }
            }
         }

         if (flag) {
            return;
         }
      }

      this.ll11llII111IllI11ll11l11I1lll[0] = -30.0F + this.Il11lI1IIIIlIl1II.nextFloat() * 4.0F;
      this.ll11llII111IllI11ll11l11I1lll[1] = -2.0F + this.Il11lI1IIIIlIl1II.nextFloat() * 4.0F;
      this.ll11llII111IllI11ll11l11I1lll[2] = 30.0F - this.Il11lI1IIIIlIl1II.nextFloat() * 4.0F;
   }
}
