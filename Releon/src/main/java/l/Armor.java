package l;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Armor extends Helper119 {
   private final List<ItemStack> armorStacks = new ArrayList<>();
   private static final int SLOT_SIZE = 22;
   private static final int SPACING = 0;
   private static final Identifier HOTBAR_TEXTURE = Identifier.of("minecraft", "hud/hotbar");

   public Armor() {
      super("Armor", 0, 0, 78, 20, false);
   }

   @Override
   public boolean method307() {
      return mc.player != null || Helper38.method548(mc.currentScreen);
   }

   @Override
   public void method308() {
      this.armorStacks.clear();
      if (mc.player != null) {
         this.armorStacks.add(mc.player.getEquippedStack(EquipmentSlot.HEAD));
         this.armorStacks.add(mc.player.getEquippedStack(EquipmentSlot.CHEST));
         this.armorStacks.add(mc.player.getEquippedStack(EquipmentSlot.LEGS));
         this.armorStacks.add(mc.player.getEquippedStack(EquipmentSlot.FEET));
      }
   }

   @Override
   public void method310(DrawContext var1) {
      if (mc.player != null) {
         byte var2 = 88;
         byte var3 = 22;
         this.method975(var2);
         this.method976(var3);
         this.method973(window.getScaledWidth() / 2 + 91 + 8);
         this.method974(window.getScaledHeight() - 22);
         float var4 = this.method981();
         float var5 = this.method982();

         for (int var6 = 0; var6 < 4; var6++) {
            float var7 = var4 + var6 * 22;
            var1.drawGuiTexture(RenderLayer::getGuiTextured, HOTBAR_TEXTURE, 182, 22, 0, 0, (int)var7, (int)var5, 22, 22);
            ItemStack var9 = var6 < this.armorStacks.size() ? this.armorStacks.get(var6) : ItemStack.EMPTY;
            if (!var9.isEmpty()) {
               var1.drawItem(var9, (int)var7 + 3, (int)var5 + 3);
               var1.drawStackOverlay(mc.textRenderer, var9, (int)var7 + 3, (int)var5 + 3);
            }
         }
      }
   }
}
