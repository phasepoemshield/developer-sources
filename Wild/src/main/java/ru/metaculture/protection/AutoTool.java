package ru.metaculture.protection;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoTool",
   O0000000000 = Category.Player,
   O000000000 = "Автоматически берет нужный вам инструмент"
)
public class AutoTool extends Module {
   private static final String O000000000O0 = "AutoTool";
   private static final long O000000000O00 = 50L;
   private static final String O000000000O000 = "Только хотбар";
   private static final String O000000000O00O = "Инвентарь";
   private static final String O000000000O0O = "Гибрид";
   public static ModeSetting O000000000O = new ModeSetting("Режим", "Гибрид", "Только хотбар", "Инвентарь", "Гибрид");
   private AutoTool.W125 O000000000O0O0 = AutoTool.W125.IDLE;
   private long O000000000O0OO;
   private int O000000000OO = -1;
   private int O000000000OO0 = -1;
   private boolean O000000000OO00;

   public AutoTool() {
      this.O00000000(new Setting[]{O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         switch (this.O000000000O0O0) {
            case IDLE:
               this.O0000000000O0();
               break;
            case PREPARE_SWAP:
               this.O0000000000O00();
               break;
            case MINING:
               this.O0000000000O0O();
               break;
            case PREPARE_RESTORE:
               this.O0000000000OO();
         }
      } else {
         this.O0000000000(false);
      }
   }

   @Override
   public void O000000000() {
      this.O0000000000(true);
      super.O000000000();
   }

   private void O0000000000O0() {
      BlockState var1 = this.O000000000O0();
      if (var1 != null && O0000000000.options.attackKey.isPressed()) {
         int var2 = this.O00000000(var1);
         int var3 = O0000000000.player.getInventory().getSelectedSlot();
         if (var2 != -1 && var2 != var3) {
            this.O000000000OO = var2;
            this.O000000000OO0 = var3;
            this.O000000000OO00 = var2 >= 9;
            if (this.O000000000OO00) {
               this.O00000000(AutoTool.W125.PREPARE_SWAP);
            } else {
               O0000000000.player.getInventory().setSelectedSlot(var2);
               this.O000000000O0O0 = AutoTool.W125.MINING;
            }
         }
      }
   }

   private void O0000000000O00() {
      if (!O0000000000.options.attackKey.isPressed() || this.O000000000O0() == null) {
         this.O0000000000(false);
      } else if (this.O0000000000OO0()) {
         this.O0000000000OOO();
         O0000O00O00O.O00000000().O000000000("AutoTool");
         this.O000000000O0O0 = AutoTool.W125.MINING;
      }
   }

   private void O0000000000O0O() {
      if (!O0000000000.options.attackKey.isPressed() || this.O000000000O0() == null) {
         if (this.O000000000OO00) {
            this.O00000000(AutoTool.W125.PREPARE_RESTORE);
         } else {
            this.O000000000O();
            this.O0000000000(false);
         }
      }
   }

   private void O0000000000OO() {
      if (this.O0000000000OO0()) {
         this.O0000000000OOO();
         this.O0000000000(false);
      }
   }

   private void O00000000(AutoTool.W125 o00000000) {
      O0000O00O00O.O00000000().O00000000("AutoTool");
      O0000000000.options.sprintKey.setPressed(false);
      O0000000000.player.setSprinting(false);
      this.O000000000O0OO = System.currentTimeMillis();
      this.O000000000O0O0 = o00000000;
   }

   private boolean O0000000000OO0() {
      O0000O00O00O.O00000000().O00000000("AutoTool");
      return System.currentTimeMillis() - this.O000000000O0OO >= 50L;
   }

   private void O0000000000OOO() {
      if (this.O000000000OO >= 9 && this.O000000000OO0 >= 0) {
         O0000000000.interactionManager
            .clickSlot(O0000000000.player.playerScreenHandler.syncId, this.O000000000OO, this.O000000000OO0, SlotActionType.SWAP, O0000000000.player);
      }
   }

   private void O000000000O() {
      if (this.O000000000OO0 >= 0 && this.O000000000OO0 <= 8) {
         O0000000000.player.getInventory().setSelectedSlot(this.O000000000OO0);
      }
   }

   private BlockState O000000000O0() {
      return O0000000000.crosshairTarget instanceof BlockHitResult var1 && var1.getType() == Type.BLOCK
         ? O0000000000.world.getBlockState(var1.getBlockPos())
         : null;
   }

   private int O00000000(BlockState blockState) {
      int var2 = O000000000O.O000000000("Инвентарь") ? 9 : 0;
      int var3 = O000000000O.O000000000("Только хотбар") ? 9 : 36;
      int var4 = O0000000000.player.getInventory().getSelectedSlot();
      ItemStack var5 = O0000000000.player.getInventory().getStack(var4);
      boolean var6 = this.O00000000(var5);
      int var7 = var6 ? var4 : -1;
      float var8 = var6 ? var5.getMiningSpeedMultiplier(blockState) : 1.0F;
      boolean var9 = !blockState.isToolRequired() || var6 && var5.isSuitableFor(blockState);

      for (int var10 = var2; var10 < var3; var10++) {
         ItemStack var11 = O0000000000.player.getInventory().getStack(var10);
         if (this.O00000000(var11)) {
            float var12 = var11.getMiningSpeedMultiplier(blockState);
            boolean var13 = !blockState.isToolRequired() || var11.isSuitableFor(blockState);
            if (var13 && !var9 || var13 == var9 && var12 > var8) {
               var7 = var10;
               var8 = var12;
               var9 = var13;
            }
         }
      }

      return var7;
   }

   private boolean O00000000(ItemStack itemStack) {
      return !itemStack.isEmpty() && (!itemStack.isDamageable() || itemStack.getMaxDamage() - itemStack.getDamage() > 1);
   }

   private void O0000000000(boolean bl) {
      if (bl
         && O0000000000.player != null
         && O0000000000.interactionManager != null
         && (this.O000000000O0O0 == AutoTool.W125.MINING || this.O000000000O0O0 == AutoTool.W125.PREPARE_RESTORE)) {
         if (this.O000000000OO00) {
            this.O0000000000OOO();
         } else {
            this.O000000000O();
         }
      }

      O0000O00O00O.O00000000().O000000000("AutoTool");
      O0000O00O00O.O00000000().O00000000.remove("AutoTool");
      this.O000000000O0O0 = AutoTool.W125.IDLE;
      this.O000000000O0OO = 0L;
      this.O000000000OO = -1;
      this.O000000000OO0 = -1;
      this.O000000000OO00 = false;
   }

   static enum W125 {
      IDLE,
      PREPARE_SWAP,
      MINING,
      PREPARE_RESTORE;
   }
}
