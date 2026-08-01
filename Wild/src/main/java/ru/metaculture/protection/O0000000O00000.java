package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;

public final class O0000000O00000 {
   private static volatile boolean O00000000 = false;

   private O0000000O00000() {
   }

   public static void O00000000() {
      if (!O00000000) {
         O00000000 = true;
         EventManager.O00000000(
            new Object() {
               @EventHandler
               public void O00000000(O0000000OO00O0 o0000000OO00O0) {
                  MinecraftClient var2 = o0000000OO00O0.O0000000000();
                  if (var2 != null) {
                     if (var2.currentScreen instanceof ClickGuiScreen) {
                        if (O0000000O00000.O00000000(var2)) {
                           double[] var3 = new double[1];
                           double[] var4 = new double[1];
                           if (var2.getWindow() != null) {
                              GLFW.glfwGetCursorPos(var2.getWindow().getHandle(), var3, var4);
                              if (var2.mouse != null) {
                                 var2.mouse.unlockCursor();
                              }
                           }

                           BlurRenderer var5 = BlurRenderer.O00000000();
                           boolean var6 = var5.O00000000(var2.currentScreen)
                              && var5.O00000000(var2.getWindow().getFramebufferWidth(), var2.getWindow().getFramebufferHeight());

                           try {
                              O00000OO00OO00.O00000000(
                                 o0000000OO00O0.O00000000000(), null, (int)var3[0], (int)var4[0], var2.getRenderTickCounter().getDynamicDeltaTicks()
                              );
                              o0000000OO00O0.O00000000000().O0000000000();
                           } finally {
                              if (var6) {
                                 var5.O0000000000();
                              }
                           }
                        }
                     }
                  }
               }

               @EventHandler
               public void O00000000(O0000000O00O o0000000O00O) {
                  MinecraftClient var2 = o0000000O00O.O0000000000();
                  if (var2 != null) {
                     if (var2.currentScreen instanceof ModernClickGuiScreen var3) {
                        var3.O00000000(
                           o0000000O00O.O00000000000(),
                           o0000000O00O.O00000000000O(),
                           o0000000O00O.O0000000000000(),
                           o0000000O00O.O000000000000O(),
                           var2.getRenderTickCounter().getDynamicDeltaTicks()
                        );
                     }
                  }
               }
            }
         );
      }
   }

   static boolean O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         Window var1 = minecraftClient.getWindow();
         return !var1.hasZeroWidthOrHeight() && var1.getFramebufferWidth() > 0 && var1.getFramebufferHeight() > 0;
      } else {
         return false;
      }
   }
}
