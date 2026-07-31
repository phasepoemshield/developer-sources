package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class ClickGuiScreen extends Screen {
   public O00000OO0O O00000000;
   public MinecraftClient O000000000 = MinecraftClient.getInstance();
   private static volatile boolean O0000000000 = false;

   public ClickGuiScreen() {
      super(Text.literal("Gui"));
   }

   public static void O00000000() {
      if (!O0000000000) {
         O0000000000 = true;
         EventManager.O00000000(new Object() {
            @EventHandler
            public void O00000000(O0000000OO00O0 o0000000OO00O0) {
               MinecraftClient var2 = o0000000OO00O0.O0000000000();
               if (var2 != null && var2.currentScreen instanceof ClickGuiScreen) {
                  double[] var3 = new double[1];
                  double[] var4 = new double[1];
                  if (var2.getWindow() != null) {
                     GLFW.glfwGetCursorPos(var2.getWindow().getHandle(), var3, var4);
                     if (var2.mouse != null) {
                        var2.mouse.unlockCursor();
                     }
                  }

                  int var5 = (int)var3[0];
                  int var6 = (int)var4[0];
                  Object var7 = null;
                  O00000OO00OO00.O00000000(o0000000OO00O0.O00000000000(), (DrawContext)var7, var5, var6, var2.getRenderTickCounter().getDynamicDeltaTicks());
               }
            }
         });
      }
   }

   public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
   }

   public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
   }

   public void renderInGameBackground(DrawContext context) {
   }

   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      RenderManager var6 = WildClient.O00000000();
      return var6 != null && O00000OO00000.O00000000(var6, mouseX, mouseY, button) ? true : true;
   }

   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      O00000OO00O00.O000000000();
      return true;
   }

   public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      return O00000OO00O0.O00000000(mouseX, mouseY, button, deltaX, deltaY) ? true : true;
   }

   public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      if (Math.abs(verticalAmount) > 1.0E-4) {
         int var9 = verticalAmount > 0.0 ? -200 : -201;
         if (O00000OO000O0O.O000000000O000 != null) {
            O00000OO000O0O.O000000000O000.O00000000000 = var9;
            O00000OO000O0O.O000000000O000.O000000000000O = false;
            O00000OO000O0O.O000000000O000 = null;
            if (WildClient.O00000000.O0000000000O00 != null) {
               WildClient.O00000000.O0000000000O00.O0000000000();
            }

            return true;
         }

         if (O00000OO000O0O.O000000000O0O0 != null) {
            O00000OO000O0O.O000000000O0O0.O000000000000 = var9;
            O00000OO000O0O.O000000000O0O0.O0000000000O = false;
            O00000OO000O0O.O0000000000(O00000OO000O0O.O000000000O0O0).O00000000(1.0, 0.2F, O0000O0O00.O000000000O00);
            O00000OO000O0O.O000000000O0O0 = null;
            if (WildClient.O00000000.O0000000000O00 != null) {
               WildClient.O00000000.O0000000000O00.O0000000000();
            }

            return true;
         }
      }

      return O00000OO00000.O00000000(mouseX, mouseY, verticalAmount) ? true : true;
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      return O00000OO00O.O00000000(keyCode, scanCode, modifiers) ? true : super.keyPressed(keyCode, scanCode, modifiers);
   }

   public boolean charTyped(char chr, int modifiers) {
      return O00000OO000OO.O00000000(chr, modifiers) ? true : super.charTyped(chr, modifiers);
   }

   public boolean shouldCloseOnEsc() {
      return O00000OO00O00O.O000000000();
   }

   public void close() {
      O0000O00O00O.O00000000().O000000000("Search");
      O00000OO000O0O.O000000000OO0O = false;
      O00000OO000O0O.O000000000OO00 = "";
      WildClient.O00000000.O0000000000O.O00000000(O00000OO000O0O.O00000000O0OO);
      super.close();
   }

   public void tick() {
      super.tick();
      if (O00000OO000O0O.O00000000O00 && O00000OO000O0O.O00000000000OO.O0000000000()) {
         this.close();
         O00000OO000O0O.O00000000O00 = false;
      }
   }

   public boolean shouldPause() {
      return false;
   }

   public void init() {
      super.init();
      this.O00000000 = new O00000OO0O();
      O00000OO000OOO.O000000000();
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1 != null && var1.mouse != null) {
         var1.mouse.unlockCursor();
      }

      O00000OO000O0O.O00000000O0O = Category.values();
      O00000OO000O0O.O00000000O0O0O = Theme.values();
      O00000OO000O0O.O00000000O000O = 366.475F;
      O00000OO000O0O.O00000000O00O = 238.805F;
      O00000OO000O0O.O00000000O000 = 480.0F - O00000OO000O0O.O00000000O000O / 2.0F;
      O00000OO000O0O.O00000000O0000 = 260.0F - O00000OO000O0O.O00000000O00O / 2.0F;
      O00000OO000O0O.O000000000.O0000000000();
      if (WildClient.O00000000.O0000000000O == null) {
         WildClient.O00000000.O0000000000O = new ThemeManager();
         WildClient.O00000000.O0000000000O.O00000000();
      }

      O00000OO000O0O.O00000000O0O0 = WildClient.O00000000.O0000000000O.O000000000();
      O00000OO000O0O.O00000000O0O00 = WildClient.O00000000.O0000000000O.O000000000();
      O00000OO000O0O.O00000000O0OO = WildClient.O00000000.O0000000000O.O0000000000();
      if (WildClient.O00000000.O000000000 == null) {
         WildClient.O00000000.O000000000 = new ModuleManager();
      }

      O00000OO000O0O.O00000000O0OO0 = WildClient.O00000000.O000000000.O00000000(O00000OO000O0O.O00000000O0OO);
   }
}
