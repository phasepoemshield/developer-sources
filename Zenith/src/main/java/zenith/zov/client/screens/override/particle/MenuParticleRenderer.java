package zenith.zov.client.screens.override.particle;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.util.Window;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.ByteBufferHolder;
import zenith.EventTarget;
import zenith.ZenithInternal076;
import zenith.EventBus;
import zenith.ZenithInternal089;
import zenith.EventImpl_26;

public class MenuParticleRenderer implements ZenithInternal076 {
   private final List<MenuParticleRenderer$MenuParticle> particles = new ArrayList<>();

   public MenuParticleRenderer() {
      for (int i = 0; i < 100; i++) {
         this.particles.add(new MenuParticleRenderer$MenuParticle(this, 1920.0F, 1080.0F, true));
      }

      EventBus.StringHolder_8(this);
   }

   @EventTarget
   public void resize(EventImpl_26 l1lli11iill1lll1iilillll) {
      this.init();
   }

   public void init() {
      this.particles.clear();

      for (int i = 0; i < 100; i++) {
         this.particles
            .add(
               new MenuParticleRenderer$MenuParticle(
                  this, (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth(), (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight(), true
               )
            );
      }
   }

   public static void renderBackgroundAndParticles(floatHolder_4 iiii1ilili1l1l1lilli1liliii) {
      Window Window = l11I1I1ll1Illll1I1l1111l1II.getWindow();
      float f = (float)Window.getScaledWidth();
      float f1 = (float)Window.getScaledHeight();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         ZenithClient.StringHolder_10("menu/background.png"),
         0.0F,
         0.0F,
         f,
         f1,
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl
            .StringHolder_27(
               l11I1I1ll1Illll1I1l1111l1II.world == null
                  ? 1.0F
                  : (float)(0.5 * (double)(l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof GameMenuScreen ? getScreenFadeProgress() : 1.0F))
            )
      );
      ZenithClient.getInstance()
         .ZenithInternal041()
         .renderParticles(iiii1ilili1l1l1lilli1liliii, getScreenFadeProgress());
   }

   public static float getScreenFadeProgress() {
      Screen Screen = l11I1I1ll1Illll1I1l1111l1II.currentScreen;
      if (Screen == null) {
         return 1.0F;
      } else {
         ZenithInternal089 l1iliii1i1l11l1l11 = (ZenithInternal089)Screen;
         long i = l1iliii1i1l11l1l11.zenithDLC$callGetStartTime();
         long j = System.currentTimeMillis();
         float f = (float)(j - i) / 200.0F;
         return Math.max(0.0F, Math.min(1.0F, f));
      }
   }

   public void renderParticles(floatHolder_4 iiii1ilili1l1l1lilli1liliii) {
      this.renderParticles(iiii1ilili1l1l1lilli1liliii, 1.0F);
   }

   public void renderParticles(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f) {
      Window Window = l11I1I1ll1Illll1I1l1111l1II.getWindow();
      float f1 = (float)Window.getScaledWidth();
      float f2 = (float)Window.getScaledHeight();

      for (MenuParticleRenderer$MenuParticle menuparticlerenderer$menuparticle : this.particles) {
         menuparticlerenderer$menuparticle.update(f1, f2, iiii1ilili1l1l1lilli1liliii.llII1I1I1lI1IllIllI());
         int i = (int)(menuparticlerenderer$menuparticle.alpha * 180.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            ZenithClient.StringHolder_10("textures/glow.png"),
            menuparticlerenderer$menuparticle.pathNodes,
            menuparticlerenderer$menuparticle.count,
            menuparticlerenderer$menuparticle.size,
            menuparticlerenderer$menuparticle.size,
            new ByteBufferHolder(255, 255, 255, (int)((float)i * f))
         );
      }
   }
}
