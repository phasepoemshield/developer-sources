package moscow.rockstar.render.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import moscow.rockstar.Rockstar;
import moscow.rockstar.framework.base.UIContext;
import moscow.rockstar.framework.msdf.Font;
import moscow.rockstar.framework.msdf.Fonts;
import moscow.rockstar.framework.objects.BorderRadius;
import moscow.rockstar.module.misc.Assist;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.render.HudElement;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.colors.Colors;
import moscow.rockstar.util.game.TextUtility;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ItemBinds extends HudElement {
   private final SliderSetting perRow = new SliderSetting(this, "hud.item_binds.per_row").min(1.0F).max(5.0F).step(1.0F).currentValue(4.0F);

   public ItemBinds() {
      super("hud.item_binds", "icons/hud/keybinds.png");
   }

   @Override
   public void update(UIContext context) {
      List<BoundItem> items = this.collectItems();
      if (items.isEmpty()) {
         this.width = 22.0F;
         this.height = 23.0F;
         super.update(context);
         return;
      }

      int columns = Math.min((int) this.perRow.getCurrentValue(), items.size());
      int rows = (items.size() + columns - 1) / columns;
      this.width = columns * 26.0F - 5.0F;
      this.height = rows * 32.0F - 4.0F;
      super.update(context);
   }

   @Override
   protected void renderComponent(UIContext context) {
      List<BoundItem> items = this.collectItems();
      if (items.isEmpty()) {
         return;
      }

      Font font = Fonts.MEDIUM.getFont(6.0F);
      int columns = Math.min((int) this.perRow.getCurrentValue(), items.size());
      float tickDelta = mc.getRenderTickCounter().getTickDelta(true);

      for (int i = 0; i < items.size(); i++) {
         int col = i % columns;
         int row = i / columns;
         float cellX = this.x + col * 26.0F;
         float cellY = this.y + row * 32.0F;
         BoundItem bound = items.get(i);
         ItemStack stack = bound.item().getDefaultStack();

         context.drawClientRect(cellX, cellY, 22.0F, 23.0F, this.animation.getValue(), this.dragAnim.getValue(), 4.0F);
         context.drawBatchItem(stack, (int) (cellX + 3.0F), (int) (cellY + 3.0F));

         if (mc.player != null && mc.player.getItemCooldownManager().isCoolingDown(stack)) {
            float progress = Math.clamp(mc.player.getItemCooldownManager().getCooldownProgress(stack, tickDelta), 0.0F, 1.0F);
            float overlayHeight = 16.0F * progress;
            float overlayY = cellY + 3.0F + 16.0F * (1.0F - progress);
            context.drawRoundedRect(cellX + 3.0F, overlayY, 16.0F, overlayHeight, BorderRadius.all(3.0F), ColorRGBA.BLACK.withAlpha(122.0F * this.animation.getValue()));
         }

         String label = bound.remainingSeconds() > 0.0F
            ? String.format("%.1f", bound.remainingSeconds())
            : this.keyLabel(bound.key());
         if (label == null || label.isEmpty()) {
            continue;
         }
         if (label.length() > 3 && bound.remainingSeconds() <= 0.0F) {
            label = label.substring(0, 3);
         }

         float textWidth = font.width(label);
         float textX = cellX + (22.0F - textWidth) / 2.0F;
         float textY = cellY + 18.0F;
         context.drawRoundedRect(textX - 2.0F, textY - 1.0F, textWidth + 3.0F, 8.0F, BorderRadius.all(1.0F), Colors.getAccent());
         context.drawText(font, label, textX - 1.0F, textY + 1.0F, Colors.getTextColor());
      }
   }

   private List<BoundItem> collectItems() {
      List<BoundItem> result = new ArrayList<>();
      Set<Item> seen = new HashSet<>();
      boolean chatOpen = mc.currentScreen instanceof ChatScreen;
      Assist assist = Rockstar.getInstance().getModuleManager().getModule(Assist.class);

      if (assist != null) {
         for (Assist.BoundItemEntry entry : assist.getBoundItems()) {
            if (entry.key() == -1 || entry.item() == Items.AIR || seen.contains(entry.item())) {
               continue;
            }
            seen.add(entry.item());
            result.add(new BoundItem(entry.item(), entry.key(), this.cooldownSeconds(entry.item())));
         }
      }

      if (mc.player != null) {
         for (int i = 0; i < mc.player.getInventory().size(); i++) {
            this.addCooldownItem(result, seen, mc.player.getInventory().getStack(i));
         }
         this.addCooldownItem(result, seen, mc.player.getOffHandStack());
      }

      if (result.isEmpty() && chatOpen) {
         result.add(new BoundItem(Items.NETHERITE_SCRAP, -1, 0.0F));
         result.add(new BoundItem(Items.ENDER_EYE, -1, 0.0F));
         result.add(new BoundItem(Items.SUGAR, -1, 0.0F));
      }

      return result;
   }

   private void addCooldownItem(List<BoundItem> result, Set<Item> seen, ItemStack stack) {
      if (stack == null || stack.isEmpty() || mc.player == null) {
         return;
      }
      if (!mc.player.getItemCooldownManager().isCoolingDown(stack) || seen.contains(stack.getItem())) {
         return;
      }
      float seconds = this.cooldownSeconds(stack.getItem());
      if (seconds <= 0.0F) {
         return;
      }
      seen.add(stack.getItem());
      result.add(new BoundItem(stack.getItem(), -1, seconds));
   }

   private float cooldownSeconds(Item item) {
      if (mc.player == null) {
         return 0.0F;
      }
      ItemStack stack = item.getDefaultStack();
      if (!mc.player.getItemCooldownManager().isCoolingDown(stack)) {
         return 0.0F;
      }
      float progress = Math.clamp(mc.player.getItemCooldownManager().getCooldownProgress(stack, mc.getRenderTickCounter().getTickDelta(true)), 0.0F, 1.0F);
      // Progress goes 1 -> 0; without entry accessors approximate remaining from progress.
      return Math.max(0.05F, progress * 5.0F);
   }

   private String keyLabel(int key) {
      if (key == -1) {
         return "";
      }
      if (key >= 0 && key <= 7) {
         return "M" + (key + 1);
      }
      String name = TextUtility.getKeyName(key);
      return name == null ? "" : name;
   }

   private record BoundItem(Item item, int key, float remainingSeconds) {
   }
}
