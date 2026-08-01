package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.lwjgl.glfw.GLFW;
import org.wild.mixin.acceser.HandledScreenAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ItemScroller",
   O000000000 = "Ускоряет перекладывание",
   O0000000000 = Category.Misc
)
public class ItemScroller extends Module {
   public final NumberSetting O000000000O = new NumberSetting("Задержка", 10.0F, 0.0F, 100.0F, 1.0F, false);
   private static ItemScroller O000000000O0;
   private final O0000O00O0000 O000000000O00 = new O0000O00O0000();

   public ItemScroller() {
      this.O00000000(new Setting[]{this.O000000000O});
      O000000000O0 = this;
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      if (O0000000000.player != null && O0000000000.currentScreen != null) {
         if (O0000000000.currentScreen instanceof HandledScreen var2) {
            if (O0000000000.getWindow() != null) {
               long var3 = O0000000000.getWindow().getHandle();
               boolean var5 = GLFW.glfwGetKey(var3, 340) == 1 || GLFW.glfwGetKey(var3, 344) == 1;
               boolean var6 = GLFW.glfwGetMouseButton(var3, 0) == 1;
               if (var5 && var6) {
                  long var7 = (long)this.O000000000O.O0000000000();
                  if (this.O000000000O00.O000000000000(var7)) {
                     double var9 = O0000000000.mouse.getX() * O0000000000.getWindow().getScaledWidth() / O0000000000.getWindow().getWidth();
                     double var11 = O0000000000.mouse.getY() * O0000000000.getWindow().getScaledHeight() / O0000000000.getWindow().getHeight();
                     Slot var13 = ((HandledScreenAccessor)var2).getSlotAtPosition(var9, var11);
                     if (var13 != null && var13.hasStack()) {
                        O0000000000.interactionManager.clickSlot(var2.getScreenHandler().syncId, var13.id, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
                        this.O000000000O00.O00000000();
                     }
                  }
               }
            }
         }
      }
   }

   @Generated
   public static ItemScroller O0000000000O0() {
      return O000000000O0;
   }
}
