// Module: Menu
// Category: render
// Original class: Menu
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

import net.minecraft.client.gui.screen.Screen;

@ModuleInfo(
   name = "Menu",
   category = Category.RENDER,
   description = "Меню чита"
)
public final class Menu extends Module {
   public static final Menu lllIl11II111Illll1IlIll = new Menu();
   private Screen ll1llIlIII1I1I;

   private Menu() {
      this.setKeyCode(344);
   }

   @Override
   public void onEnable() {
      if (l11I1I1ll1Illll1I1l1111l1II.mouse == null) {
         this.StringHolder_11(false);
      } else {
         this.ll1llIlIII1I1I = l11I1I1ll1Illll1I1l1111l1II.currentScreen;
         if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != ZenithClient.getInstance().ZenithInternal141()) {
            l11I1I1ll1Illll1I1l1111l1II.setScreen(ZenithClient.getInstance().ZenithInternal141());
            ZenithClient.getInstance()
               .MinecraftClientHolder_5()
               .StringHolder_8(ZenithClient.getInstance().MinecraftClientHolder_5().IIl1I1lIIl1IIIIIII);
            super.l11l1lII();
         }
      }
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      if (l11I1I1ll1Illll1I1l1111l1II.currentScreen == ZenithClient.getInstance().ZenithInternal141()) {
         this.StringHolder_11(true);
      } else {
         super.l1l1lI111l1II1Illl111l1l1ll1l();
      }
   }

   @Override
   public void booleanHolder_2(int i) {
      if (i != -1) {
         super.setKeyCode(i);
      }
   }

   @EventTarget(
      ZenithInternal095 = 3
   )
   public void ZenithInternal095(EventImpl_37 llllii1liii1i1ll1liiil) {
      floatHolder_4 iiii1ilili1l1l1lilli1liliii = llllii1liii1i1ll1liiil.Predictions();
      if (this.ll1llIlIII1I1I != null) {
         this.ll1llIlIII1I1I.render(iiii1ilili1l1l1lilli1liliii, 0, 0, l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter().getTickDelta(false));
      }

      ZenithClient.getInstance()
         .ZenithInternal141()
         .renderTop(iiii1ilili1l1l1lilli1liliii, iiii1ilili1l1l1lilli1liliii.l111IIlIl1l1(), iiii1ilili1l1l1lilli1liliii.Ill1lI1III1());
      if (ZenithClient.getInstance().ZenithInternal141().isFinish()) {
         this.lI1Il11I1l1III11IIlI1lI1II11I();
      }
   }
}
