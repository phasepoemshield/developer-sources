package zenith;

import zenith.hud.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen;
import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import net.minecraft.client.gui.screen.ingame.StructureBlockScreen;
import net.minecraft.client.gui.screen.ingame.SignEditScreen;
import zenith.zov.client.screens.menu.MenuScreen;

public final class ListHolder_8 implements ZenithInternal076 {
   public static final List<net.minecraft.client.option.KeyBinding> llIIll11l1l11IIIll = List.of(
      l11I1I1ll1Illll1I1l1111l1II.options.forwardKey,
      l11I1I1ll1Illll1I1l1111l1II.options.backKey,
      l11I1I1ll1Illll1I1l1111l1II.options.leftKey,
      l11I1I1ll1Illll1I1l1111l1II.options.rightKey,
      l11I1I1ll1Illll1I1l1111l1II.options.jumpKey
   );
   private static final Map<Class<?>, AtomicLongHolder$EventBus> ll11lIllIll1I = new HashMap<>();

   public static void StringHolder_8(Class<?> oclass, Runnable runnable) {
      StringHolder_8(oclass, runnable, 0);
   }

   public static void StringHolder_8(Class<?> oclass, Runnable runnable, int i) {
      AtomicLongHolder$EventBus illlli1liiiil1i1lll111$l1i1illlili = ZenithClient.getInstance()
         .ModuleHolder()
         .EventTarget(oclass)
         .StringHolder_8(
            PlayerInputHolder.class,
            ili11i1il11 -> {
               if (Inventorysetting.ll11II1111ll11I1llI.lII1llIIlII11Ill1I1IlIlIl()) {
                  ili11i1il11.Creeperfarm();
                  if (l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                     || l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                     || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                     || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                     || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                     || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                     return false;
                  }
               }

               runnable.run();
               ListHolder_5.IIl1IlI1l11Il();
               return true;
            },
            i
         );
      ZenithClient.getInstance().ModuleHolder().StringHolder_8(illlli1liiiil1i1lll111$l1i1illlili, i);
   }

   public static boolean ZenithInternal028(Class<?> oclass) {
      return ZenithClient.getInstance().ModuleHolder().Event(oclass);
   }

   public static boolean Event(Class<?> oclass) {
      return oclass == Autototem.class ? !Autototem.IlII1I1llIllIl1IIl.I1IIlI11I() : ZenithInternal028(oclass);
   }

   public static void ll11llIlIIlIIll111l111l() {
      l1III111I1II1I();
   }

   public static void l1Il1I1I1lIlI1I1I1l1l11() {
      Il111lI1lllIIIIll11Il1IIlI();
   }

   public static void l1III111I1II1I() {
      llIIll11l1l11IIIll.forEach(KeyBinding -> KeyBinding.setPressed(false));
   }

   public static void Il111lI1lllIIIIll11Il1IIlI() {
      llIIll11l1l11IIIll.forEach(
         KeyBinding -> KeyBinding.setPressed(
               InputUtil.isKeyPressed(l11I1I1ll1Illll1I1l1111l1II.getWindow().getHandle(), KeyBinding.getDefaultKey().getCode())
            )
      );
   }

   public static boolean IIlII1II1lI() {
      if (l11I1I1ll1Illll1I1l1111l1II.currentScreen == null) {
         return false;
      } else if (!ZenithClient.getInstance().ModuleHolder().floatHolder_8()) {
         return false;
      } else if (ZenithInternal066.EventBus(l11I1I1ll1Illll1I1l1111l1II.currentScreen)) {
         return false;
      } else if (l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof SignEditScreen) {
         return false;
      } else if (l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof AnvilScreen) {
         return false;
      } else if (l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof AbstractCommandBlockScreen) {
         return false;
      } else if (l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof StructureBlockScreen) {
         return false;
      } else {
         return l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof MenuScreen menuscreen
            ? !menuscreen.isSearch()
            : l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler;
      }
   }

   private ListHolder_8() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
