// Module: ShaderHand
// Category: render
// Original class: Shaderhand
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

import zenith.hud.*;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.util.Arm;
import net.minecraft.client.gl.SimpleFramebuffer;

@ModuleInfo(
   name = "ShaderHand",
   category = Category.RENDER,
   description = ""
)
public final class Shaderhand extends Module {
   public static final Shaderhand l1Il1l1lllllll1I1III1Il1I1 = new Shaderhand();
   private static final float l1lII111lIIIl1IIlllI = 0.72F;
   private static final float II11l11l1IllIlllI = 0.72F;
   private static final float lII1IIl1I1Ill1l1l11llI11 = 0.28F;
   private static final float III1lIl1lllI1lI1lllIl1I1I1Il = 0.22F;
   private final ModeSetting III111I11l1l1lI1I1 = new ModeSetting(
      "module.shaderHand.shaderMode", "module.shaderHand.shaderMode.desc", Shaderhand$II1Il11l111II11IIl.lIIII1l11III11ll()
   );
   private final BooleanSetting l1IIII1l1ll11l11l1I1l1l1llll1l = new BooleanSetting(
      "module.shaderHand.animation", "module.shaderHand.animation.desc", true
   );
   private final NumberSetting lI1IIIl1IlII111ll1IlI1111I11 = new NumberSetting(
      "module.shaderHand.timeSpeed", 1.0F, 0.0F, 5.0F, 0.05F, "module.shaderHand.timeSpeed.desc", "x", this.l1IIII1l1ll11l11l1I1l1l1llll1l::Spider, null
   );
   private final NumberSetting lIllI1IIIllIl1 = new NumberSetting(
      "module.shaderHand.effectAlpha", 100.0F, 0.0F, 100.0F, 1.0F, "module.shaderHand.effectAlpha.desc", "%", null, null
   );
   private final NumberSetting lI1I11IIII1l1IlI1Il1l11I = new NumberSetting(
      "module.shaderHand.patternSpeed", 1.0F, 0.0F, 5.0F, 0.05F, "module.shaderHand.patternSpeed.desc", "x", this::ll11lIl1l1IlI11llI1I1I1llI1I1, null
   );
   private final NumberSetting IIlIllII11IlIl1l1Il = new NumberSetting(
      "module.shaderHand.shift", 1.6F, 0.0F, 24.0F, 0.1F, "module.shaderHand.shift.desc", "", this::ll11lIl1l1IlI11llI1I1I1llI1I1, null
   );
   private long l1I11I1Il1l1IlIll11 = -1L;
   private float II11lIIIIlIIIlI;
   private float I1Il1lll1II = 0.72F;
   private float Il1IIIlI1llI1l1lII111IIl11l1I = 0.22F;

   private Shaderhand() {
   }

   public void EventTarget(Runnable runnable) {
      this.StringHolder_8(runnable, 0.0F);
   }

   public void StringHolder_8(Runnable runnable, float f) {
      if (MinecraftClientHolder_3.isInitialized()) {
         try {
            this.ZenithInternal095(runnable);
         } catch (Exception exception) {
            exception.printStackTrace();
         }
      }
   }

   private void ZenithInternal095(Runnable runnable) {
      net.minecraft.client.gl.Framebuffer Framebuffer = l11I1I1ll1Illll1I1l1111l1II.getFramebuffer();
      SimpleFramebuffer SimpleFramebuffer = MinecraftClientHolder_3.I1IllIIl1l111Ill1ll1l1IIl11();
      Shaderhand$II1Il11l111II11IIl i11l11llllli11i111il1$ii1il11l111ii11iil = this.l11111IllI11llI1I1l();
      StringHolder_28 ll1111il1l1l1lii111 = MinecraftClientHolder_3.Information(i11l11llllli11i111il1$ii1il11l111ii11iil.Illl1l1l11lllIll111Il);
      if (Framebuffer != null && ll1111il1l1l1lii111 != null && SimpleFramebuffer != null) {
         SimpleFramebuffer.beginWrite(true);
         RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 0.0F);
         RenderSystem.clear(16640);
         runnable.run();
         SimpleFramebuffer.copyDepthFrom(Framebuffer);
         SimpleFramebuffer.setTexFilter(9728);
         Framebuffer.beginWrite(true);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableDepthTest();
         RenderSystem.activeTexture(33984);
         RenderSystem.bindTexture(SimpleFramebuffer.getColorAttachment());
         RenderSystem.activeTexture(33985);
         RenderSystem.bindTexture(SimpleFramebuffer.getDepthAttachment());

         try {
            ll1111il1l1l1lii111.bind();
            this.StringHolder_8(ll1111il1l1l1lii111, SimpleFramebuffer, i11l11llllli11i111il1$ii1il11l111ii11iil);
            MinecraftClientHolder_3.I11IIll1l1I1I1Il1I1();
            ll1111il1l1l1lii111.ll1l1IIlIl1Il1();
         } finally {
            ll1111il1l1l1lii111.ll1l1IIlIl1Il1();
            RenderSystem.activeTexture(33984);
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableBlend();
            RenderSystem.enableDepthTest();
            if (l11I1I1ll1Illll1I1l1111l1II.getFramebuffer() != null) {
               l11I1I1ll1Illll1I1l1111l1II.getFramebuffer().beginWrite(true);
            }
         }
      }
   }

   private void StringHolder_8(
      StringHolder_28 ll1111il1l1l1lii111, SimpleFramebuffer SimpleFramebuffer, Shaderhand$II1Il11l111II11IIl i11l11llllli11i111il1$ii1il11l111ii11iil
   ) {
      int i = Math.max(1, SimpleFramebuffer.textureWidth);
      int j = Math.max(1, SimpleFramebuffer.textureHeight);
      float f = i11l11llllli11i111il1$ii1il11l111ii11iil.II111l11IlIlII111Il ? this.lI1I11IIII1l1IlI1Il1l11I.lll1lI1llll1IIllIIIII1lll() : 1.0F;
      ll1111il1l1l1lii111.ZenithInternal028("ColorTexture", 0);
      ll1111il1l1l1lii111.ZenithInternal028("DepthTexture", 1);
      ll1111il1l1l1lii111.StringHolder_8("resolution", (float)i, (float)j);
      ll1111il1l1l1lii111.StringHolder_8("time", this.l1lII1I11() * i11l11llllli11i111il1$ii1il11l111ii11iil.Il11l1l11I1l11IIIlIlIl111);
      this.I1I1l1llIl1lI();
      ll1111il1l1l1lii111.StringHolder_8("handMotion", this.I1Il1lll1II, this.Il1IIIlI1llI1l1lII111IIl11l1I);
      ll1111il1l1l1lii111.StringHolder_8("effectAlpha", Math.max(0.0F, Math.min(100.0F, this.lIllI1IIIllIl1.lll1lI1llll1IIllIIIII1lll())) / 100.0F);
      if (i11l11llllli11i111il1$ii1il11l111ii11iil.II111l11IlIlII111Il) {
         ll1111il1l1l1lii111.StringHolder_8("speed", f, f);
      }

      if (i11l11llllli11i111il1$ii1il11l111ii11iil.II111l11IlIlII111Il) {
         ll1111il1l1l1lii111.StringHolder_8("shift", this.IIlIllII11IlIl1l1Il.lll1lI1llll1IIllIIIII1lll());
      }
   }

   private float l1lII1I11() {
      long i = System.nanoTime();
      if (this.l1I11I1Il1l1IlIll11 < 0L) {
         this.l1I11I1Il1l1IlIll11 = i;
         return this.II11lIIIIlIIIlI;
      } else {
         float f = Math.min((float)(i - this.l1I11I1Il1l1IlIll11) / 1.0E9F, 0.1F);
         this.l1I11I1Il1l1IlIll11 = i;
         if (this.l1IIII1l1ll11l11l1I1l1l1llll1l.Spider()) {
            this.II11lIIIIlIIIlI = (this.II11lIIIIlIIIlI + f * Math.max(0.0F, this.lI1IIIl1IlII111ll1IlI1111I11.lll1lI1llll1IIllIIIII1lll())) % 100000.0F;
         }

         return this.II11lIIIIlIIIlI;
      }
   }

   private void I1I1l1llIl1lI() {
      this.I1Il1lll1II = l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.getMainArm() == Arm.LEFT
         ? 0.28F
         : 0.72F;
      this.Il1IIIlI1llI1l1lII111IIl11l1I = 0.22F;
   }

   private int StringHolder_8(SimpleFramebuffer SimpleFramebuffer) {
      int i = Math.max(1, SimpleFramebuffer.textureHeight);
      return Math.min(i, Math.max(1, (int)((float)i * 0.72F)));
   }

   private Shaderhand$II1Il11l111II11IIl l11111IllI11llI1I1l() {
      return this.III111I11l1l1lI1I1 == null
         ? Shaderhand$II1Il11l111II11IIl.IlIl1IlIIIl1lII1lIII11l
         : Shaderhand$II1Il11l111II11IIl.GetDisplayNameHandler_2(this.III111I11l1l1lI1I1.getIndex());
   }

   private boolean ll11lIl1l1IlI11llI1I1I1llI1I1() {
      return this.l11111IllI11llI1I1l().II111l11IlIlII111Il;
   }
}
