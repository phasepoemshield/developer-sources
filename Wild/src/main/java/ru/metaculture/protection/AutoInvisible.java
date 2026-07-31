package ru.metaculture.protection;

import java.util.function.Predicate;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.SlotActionType;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoInvisible",
   O0000000000 = Category.Player,
   O000000000 = "Автоматически пьёт зелье невидимости и возвращает прошлый слот"
)
public class AutoInvisible extends Module {
   public final NumberSetting O000000000O = new NumberSetting("Порог до зелья (сек)", 5.0F, 1.0F, 60.0F, 1.0F, false);
   private static final long O000000000O0 = 1850L;
   private final O0000O00O0000 O000000000O00 = new O0000O00O0000();
   private boolean O000000000O000;
   private int O000000000O00O = -1;

   public AutoInvisible() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         if (O0000000000.currentScreen != null) {
            if (this.O000000000O000) {
               this.O0000000000O0();
            }
         } else if (this.O000000000O000) {
            if (O0000000000.player.isUsingItem() && !this.O000000000O00.O000000000000(1850L)) {
               O0000000000.options.useKey.setPressed(true);
            } else {
               this.O0000000000O0();
            }
         } else if (this.O0000000000O00()) {
            int var2 = this.O00000000(this::O00000000);
            if (var2 != -1) {
               int var3 = this.O00000000(var2);
               if (var3 != -1) {
                  this.O000000000O00O = O0000000000.player.getInventory().getSelectedSlot();
                  this.O000000000(var3);
                  O0000000000.options.useKey.setPressed(true);
                  this.O000000000O000 = true;
                  this.O000000000O00.O00000000();
               }
            }
         }
      }
   }

   private void O0000000000O0() {
      O0000000000.options.useKey.setPressed(false);
      if (this.O000000000O00O >= 0 && this.O000000000O00O < 9) {
         this.O000000000(this.O000000000O00O);
      }

      this.O000000000O000 = false;
      this.O000000000O00O = -1;
   }

   private boolean O0000000000O00() {
      StatusEffectInstance var1 = O0000000000.player.getStatusEffect(StatusEffects.INVISIBILITY);
      return var1 == null || var1.getDuration() <= (int)this.O000000000O.O0000000000() * 20;
   }

   private int O00000000(Predicate<ItemStack> predicate) {
      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
         if (!var3.isEmpty() && predicate.test(var3)) {
            return var2;
         }
      }

      return -1;
   }

   private int O00000000(int i) {
      if (i >= 0 && i < 9) {
         return i;
      } else {
         int var2 = O0000000000.player.getInventory().getSelectedSlot();

         for (int var3 = 0; var3 < 9; var3++) {
            if (O0000000000.player.getInventory().getStack(var3).isEmpty()) {
               var2 = var3;
               break;
            }
         }

         int var4 = i < 9 ? i + 36 : i;
         O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var4, var2, SlotActionType.SWAP, O0000000000.player);
         return var2;
      }
   }

   private boolean O00000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty() && itemStack.isOf(Items.POTION)) {
         PotionContentsComponent var2 = (PotionContentsComponent)itemStack.get(DataComponentTypes.POTION_CONTENTS);
         if (var2 == null) {
            return false;
         } else {
            for (StatusEffectInstance var4 : var2.getEffects()) {
               if (var4.getEffectType().equals(StatusEffects.INVISIBILITY)) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private void O000000000(int i) {
      O0000000000.player.getInventory().setSelectedSlot(i);
      if (O0000000000.interactionManager instanceof ClientPlayerInteractionManagerAccessor var2) {
         var2.invokeSyncSelectedSlot();
      }
   }

   @Override
   public void O000000000() {
      if (this.O000000000O000 || O0000000000.options != null && O0000000000.options.useKey.isPressed()) {
         O0000000000.options.useKey.setPressed(false);
         if (this.O000000000O00O >= 0 && this.O000000000O00O < 9 && O0000000000.player != null) {
            this.O000000000(this.O000000000O00O);
         }
      }

      this.O000000000O000 = false;
      this.O000000000O00O = -1;
      super.O000000000();
   }
}
