package moscow.rockstar.module.misc;

import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.util.inventory.EnchantmentUtility;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.math.BlockPos;
@ModuleInfo(name = "Fast Item Use", category = ModuleCategory.OTHER, desc = "Ускоренное использование предметов (лук, трезубец, арбалет)")
public class FastItemUse extends BaseModule {
   private final BooleanSetting bow = new BooleanSetting(this, "Лук", "Ускоряет натягивание лука").enable();
   private final BooleanSetting trident = new BooleanSetting(
         this, "Трезубец", "Ускоряет метание трезубца"
      )
      .enable();
   private final BooleanSetting crossbow = new BooleanSetting(
          this, "Арбалет", "Ускоряет зарядку арбалета"
       )
       .enable();
   private final EventListener<ClientPlayerTickEvent> onClientPlayerTickEvent = event -> {
      if (this.trident.isEnabled() && this.canReleaseTrident()) {
         this.releaseItem();
      }

      if (this.bow.isEnabled() && this.canReleaseBow()) {
         this.releaseItem();
      }

      if (this.crossbow.isEnabled() && this.canReleaseCrossbow()) {
         this.releaseItem();
      }
   };

   private void releaseItem() {
      if (mc.player != null) {
         mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, mc.player.getHorizontalFacing()));
         mc.player.stopUsingItem();
      }
   }

   private boolean canReleaseTrident() {
      if (mc.player == null) {
         return false;
      } else {
         ItemStack heldStack = mc.player.getMainHandStack();
         return heldStack.getItem() == Items.TRIDENT
            && EnchantmentUtility.getEnchantmentLevel(heldStack, Enchantments.RIPTIDE) > 0
            && mc.player.isUsingItem()
            && mc.player.getItemUseTime() >= 10.0
            && mc.player.getAttackCooldownProgress(0.5F) > 0.92F;
      }
   }

   private boolean canReleaseBow() {
      return mc.player == null ? false : mc.player.getMainHandStack().getItem() == Items.BOW && mc.player.isUsingItem() && mc.player.getItemUseTime() >= 10.0;
   }

   private boolean canReleaseCrossbow() {
      return mc.player == null
         ? false
         : mc.player.getMainHandStack().getItem() == Items.CROSSBOW && mc.player.isUsingItem() && mc.player.getItemUseTime() >= 10;
   }
}
