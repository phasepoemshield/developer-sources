// Module: JumpCircle
// Category: render
// Original class: Jumpcircle
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType4;
import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType5;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexFormat.LootPool96;
import org.joml.Matrix4f;

@ModuleInfo(
   name = "JumpCircle",
   category = Category.RENDER,
   description = "module.jumpCircle.desc"
)
public class Jumpcircle extends Module {
   private static final String[][] IlIII1I1IIl1I1lIlII1I = new String[][]{
      {"module.jumpCircle.texture.storm", "shtorm1", "shtorm2", "glow"},
      {"module.jumpCircle.texture.pool", "glow", "omut2", "omut3"},
      {"module.jumpCircle.texture.rings", "colso1", "omut2", "colso3"},
      {"module.jumpCircle.texture.explosion", "boom1", "boom2", "glow"}
   };
   private static final Identifier[][] lIIlI11ll = new Identifier[][]{
      {
            Identifier.of("zenith", "visuals/jumpcircle/shtorm1.png"),
            Identifier.of("zenith", "visuals/jumpcircle/shtorm2.png"),
            Identifier.of("zenith", "visuals/jumpcircle/glow.png")
      },
      {
            Identifier.of("zenith", "visuals/jumpcircle/glow.png"),
            Identifier.of("zenith", "visuals/jumpcircle/omut2.png"),
            Identifier.of("zenith", "visuals/jumpcircle/omut3.png")
      },
      {
            Identifier.of("zenith", "visuals/jumpcircle/colso1.png"),
            Identifier.of("zenith", "visuals/jumpcircle/omut2.png"),
            Identifier.of("zenith", "visuals/jumpcircle/colso3.png")
      },
      {
            Identifier.of("zenith", "visuals/jumpcircle/boom1.png"),
            Identifier.of("zenith", "visuals/jumpcircle/boom2.png"),
            Identifier.of("zenith", "visuals/jumpcircle/glow.png")
      }
   };
   private static final float[][] III1I1Il1I11I1l1IllII = new float[][]{{1.0F, 1.0F, 1.0F}, {1.0F, 1.0F, 1.0F}, {1.0F, 1.0F, 1.0F}, {1.0F, 1.0F, 1.0F}};
   public static final Jumpcircle lIl1l1lll1Il111l11lIIllll111 = new Jumpcircle();
   private final ModeSetting IIIIlIIIll111lll = new ModeSetting("module.jumpCircle.texture", "module.jumpCircle.texture.desc", III1II1Il1());
   private final NumberSetting llIllIl11llll11l11I11l = new NumberSetting(
      "module.jumpCircle.size", 1.4F, 0.5F, 3.0F, 0.1F, "module.jumpCircle.size.desc", "x"
   );
   private final NumberSetting lll1lIllIlllI1l11IIlIIll = new NumberSetting(
      "module.jumpCircle.speed", 4.8F, 0.0F, 8.0F, 0.1F, "module.jumpCircle.speed.desc", "x"
   );
   private final NumberSetting lllllllII1lI11I11Ill1I11 = new NumberSetting(
      "module.jumpCircle.lifetime", 650.0F, 250.0F, 1500.0F, 50.0F, "module.jumpCircle.lifetime.desc", "ms"
   );
   private final List<Jumpcircle$II1Il11l111II11IIl> IIIIIIlIII1 = new ArrayList<>();
   private boolean lIIlllI1lIIl1ll1l111II1Il;
   private net.minecraft.util.math.Vec3d Il1I11lIll1l1I11l1Ill1llI1I1I1;

   private Jumpcircle() {
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
      this.IIIIIIlIII1.clear();
      this.lIIlllI1lIIl1ll1l111II1Il = l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.isOnGround();
      this.Il1I11lIll1l1I11l1Ill1llI1I1I1 = l11I1I1ll1Illll1I1l1111l1II.player == null ? null : l11I1I1ll1Illll1I1l1111l1II.player.getPos();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
      this.IIIIIIlIII1.clear();
      this.Il1I11lIll1l1I11l1Ill1llI1I1I1 = null;
   }

   @EventTarget
   public void ZenithInternal128(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         boolean flag = l11I1I1ll1Illll1I1l1111l1II.player.isOnGround();
         if (flag) {
            this.Il1I11lIll1l1I11l1Ill1llI1I1I1 = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
         }

         if (this.lIIlllI1lIIl1ll1l111II1Il && !flag && l11I1I1ll1Illll1I1l1111l1II.player.getVelocity().y > 0.05) {
            this.IIIIIIlIII1
               .add(
                  new Jumpcircle$II1Il11l111II11IIl(
                     this.Il1I11lIll1l1I11l1Ill1llI1I1I1 == null ? l11I1I1ll1Illll1I1l1111l1II.player.getPos() : this.Il1I11lIll1l1I11l1Ill1llI1I1I1,
                     System.currentTimeMillis()
                  )
               );
         }

         this.lIIlllI1lIIl1ll1l111II1Il = flag;
      }
   }

   @EventTarget
   public void byteHolder(EventImpl_34 ll1li1l111llllli1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null && !this.IIIIIIlIII1.isEmpty()) {
         long i = System.currentTimeMillis();
         Iterator iterator = this.IIIIIIlIII1.iterator();

         while (iterator.hasNext()) {
            Jumpcircle$II1Il11l111II11IIl l1iil1iii$ii1il11l111ii11iil = (Jumpcircle$II1Il11l111II11IIl)iterator.next();
            if ((float)(i - l1iil1iii$ii1il11l111ii11iil.l111I1llI11lIlI) > this.lllllllII1lI11I11Ill1I11.lll1lI1llll1IIllIIIII1lll()) {
               iterator.remove();
            }
         }

         if (!this.IIIIIIlIII1.isEmpty()) {
            this.StringHolder_8(ll1li1l111llllli1.Norender(), i);
         }
      }
   }

   private void StringHolder_8(MatrixStack MatrixStack, long i) {
      RenderSystem.enableBlend();
      RenderSystem.disableCull();
      RenderSystem.blendFuncSeparate(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE, AdvancementTabType5.ZERO, AdvancementTabType4.ONE);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(false);
      Identifier[] aIdentifier = this.I1IIIlI111IlI11Ill();
      float[] afloat = this.ll1I111lllIIlIl1I1l1Il1l1();

      for (int j = 0; j < aIdentifier.length; j++) {
         RenderSystem.setShaderTexture(0, aIdentifier[j]);
         net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);

         for (Jumpcircle$II1Il11l111II11IIl l1iil1iii$ii1il11l111ii11iil : this.IIIIIIlIII1) {
            this.StringHolder_8(MatrixStack, BufferBuilder, l1iil1iii$ii1il11l111ii11iil, i, afloat[j]);
         }

         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   }

   private void StringHolder_8(
      MatrixStack MatrixStack, net.minecraft.client.render.BufferBuilder BufferBuilder, Jumpcircle$II1Il11l111II11IIl l1iil1iii$ii1il11l111ii11iil, long i, float f
   ) {
      float f1 = MathHelper.clamp(
         (float)(i - l1iil1iii$ii1il11l111ii11iil.l111I1llI11lIlI) / (this.lllllllII1lI11I11Ill1I11.lll1lI1llll1IIllIIIII1lll() * f), 0.0F, 1.0F
      );
      float f2 = 1.0F - f1;
      float f3 = MathHelper.lerp(f1, 0.15F, this.llIllIl11llll11l11I11l.lll1lI1llll1IIllIIIII1lll());
      float f4 = (float)(i - l1iil1iii$ii1il11l111ii11iil.l111I1llI11lIlI)
         / 1000.0F
         * (float) (Math.PI * 2)
         * this.lll1lIllIlllI1l11IIlIIll.lll1lI1llll1IIllIIIII1lll();
      float f5 = MathHelper.cos(f4);
      float f6 = MathHelper.sin(f4);
      int j = PatternHolder.EventBus(
         II1l111II1Il11II111llllIl1.floatHolder_3().getClientColor(0).lllIlll1Ill111l111Il11II11lII(), f2 * f2 * 0.45F
      );
      int k = PatternHolder.EventBus(
         II1l111II1Il11II111llllIl1.floatHolder_3().getClientColor(180).lllIlll1Ill111l111Il11II11lII(), f2 * f2
      );
      Camera Camera = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera;
      net.minecraft.util.math.Vec3d Vec3d = l1iil1iii$ii1il11l111ii11iil.l1I11I11III.subtract(Camera.getPos());
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      float f7 = (float)Vec3d.x;
      float f8 = (float)Vec3d.y + 0.04F;
      float f9 = (float)Vec3d.z;
      this.StringHolder_8(matrix4f, BufferBuilder, f7, f8, f9, f3 * 1.22F, f5, f6, j);
      this.StringHolder_8(matrix4f, BufferBuilder, f7, f8 + 0.002F, f9, f3, f5, f6, k);
   }

   private void StringHolder_8(Matrix4f matrix4f, net.minecraft.client.render.BufferBuilder BufferBuilder, float f, float f1, float f2, float f3, float f4, float f5, int i) {
      this.StringHolder_8(matrix4f, BufferBuilder, f, f1, f2, -f3, -f3, f4, f5, 0.0F, 0.0F, i);
      this.StringHolder_8(matrix4f, BufferBuilder, f, f1, f2, -f3, f3, f4, f5, 0.0F, 1.0F, i);
      this.StringHolder_8(matrix4f, BufferBuilder, f, f1, f2, f3, f3, f4, f5, 1.0F, 1.0F, i);
      this.StringHolder_8(matrix4f, BufferBuilder, f, f1, f2, f3, -f3, f4, f5, 1.0F, 0.0F, i);
   }

   private void StringHolder_8(
      Matrix4f matrix4f, net.minecraft.client.render.BufferBuilder BufferBuilder, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i
   ) {
      BufferBuilder.vertex(matrix4f, f + f3 * f5 - f4 * f6, f1, f2 + f3 * f6 + f4 * f5).texture(f7, f8).color(i);
   }

   private Identifier[] I1IIIlI111IlI11Ill() {
      int i = this.IIIIlIIIll111lll.getIndex();
      return i >= 0 && i < lIIlI11ll.length ? lIIlI11ll[i] : lIIlI11ll[0];
   }

   private float[] ll1I111lllIIlIl1I1l1Il1l1() {
      int i = this.IIIIlIIIll111lll.getIndex();
      return i >= 0 && i < III1I1Il1I11I1l1IllII.length ? III1I1Il1I11I1l1IllII[i] : III1I1Il1I11I1l1IllII[0];
   }

   private static String[] III1II1Il1() {
      String[] astring = new String[IlIII1I1IIl1I1lIlII1I.length];

      for (int i = 0; i < IlIII1I1IIl1I1lIlII1I.length; i++) {
         astring[i] = IlIII1I1IIl1I1lIlII1I[i][0];
      }

      return astring;
   }

   private static Identifier[][] IlllIl1lIIlIII1IIIIl11I11I1() {
      Identifier[][] aIdentifier = new Identifier[IlIII1I1IIl1I1lIlII1I.length][];

      for (int i = 0; i < IlIII1I1IIl1I1lIlII1I.length; i++) {
         String[] astring = IlIII1I1IIl1I1lIlII1I[i];
         int j = astring.length == 1 ? 0 : 1;
         aIdentifier[i] = new Identifier[astring.length - j];

         for (int k = j; k < astring.length; k++) {
            aIdentifier[i][k - j] = ZenithClient.StringHolder_10("visuals/jumpcircle/" + astring[k] + ".png");
         }
      }

      return aIdentifier;
   }

   private static float[][] I1ll1lIIIlllI11l() {
      float[][] afloat = new float[IlIII1I1IIl1I1lIlII1I.length][];

      for (int i = 0; i < IlIII1I1IIl1I1lIlII1I.length; i++) {
         String[] astring = IlIII1I1IIl1I1lIlII1I[i];
         int j = astring.length == 1 ? 0 : 1;
         afloat[i] = new float[astring.length - j];

         for (int k = j; k < astring.length; k++) {
            afloat[i][k - j] = astring[k].equals("13280146664") ? 0.25F : 1.0F;
         }
      }

      return afloat;
   }
}
