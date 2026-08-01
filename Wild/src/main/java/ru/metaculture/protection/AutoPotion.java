package ru.metaculture.protection;

import java.util.ArrayDeque;
import java.util.Queue;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoPotion",
   O0000000000 = Category.Player,
   O000000000 = "Автоматически кидает под вас взрывные зелья"
)
public class AutoPotion extends Module {
   public static AutoPotion O000000000O;
   public static boolean O000000000O0 = false;
   public final GroupSetting O000000000O00 = new GroupSetting(
      "Что бафать: ", new BooleanSetting("Сила", false), new BooleanSetting("Скорость", false), new BooleanSetting("Огнестойкость", false)
   );
   public final BooleanSetting O000000000O000 = new BooleanSetting("Кидать смотря вниз", false);
   private final BooleanSetting O000000000O00O = new BooleanSetting("Только в PVP", false);
   private final Queue<Integer> O000000000O0O = new ArrayDeque<>();
   private int O000000000O0O0 = -1;
   private boolean O000000000O0OO = false;
   private int O000000000OO = 0;

   public AutoPotion() {
      O000000000O = this;
      this.O00000000(new Setting[]{this.O000000000O00, this.O000000000O000, this.O000000000O00O});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         if (this.O000000000O0O.isEmpty()) {
            if (O000000000O0) {
               this.O0000000000O0O();
            }

            if (this.O000000000OO > 0) {
               this.O000000000OO--;
            } else if (!this.O000000000O00O.O0000000000() || this.O0000000000O00()) {
               if (!this.O000000000O000.O0000000000() || !(O0000000000.player.getPitch() < 80.0F)) {
                  this.O0000000000O0();
               }
            }
         } else {
            if (!O000000000O0) {
               O000000000O0 = true;
               if (!this.O000000000O000.O0000000000()) {
                  O000000O0O00O.O0000000000 = O0000000000.player.getYaw();
                  O000000O0O00O.O00000000000 = O0000000000.player.getPitch();
                  O000000O0O00O.O00000000 = true;
               }

               if (this.O000000000O0O0 == -1) {
                  this.O000000000O0O0 = O0000000000.player.getInventory().getSelectedSlot();
               }
            }

            O0000000000.options.sprintKey.setPressed(false);
            O0000000000.player.setSprinting(false);
            if (!this.O000000000O000.O0000000000()) {
               O0000000000.player.setPitch(90.0F);
            }

            int var2 = this.O000000000O0O.poll();
            if (var2 < 9) {
               O0000000000.player.getInventory().setSelectedSlot(var2);
               ((ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager).invokeSyncSelectedSlot();
            } else {
               this.O000000000O0OO = true;
               O0000000000.interactionManager
                  .clickSlot(O0000000000.player.playerScreenHandler.syncId, var2, this.O000000000O0O0, SlotActionType.SWAP, O0000000000.player);
            }

            O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            O0000000000.player.swingHand(Hand.MAIN_HAND);
            if (var2 < 9) {
               O0000000000.player.getInventory().setSelectedSlot(this.O000000000O0O0);
               ((ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager).invokeSyncSelectedSlot();
            } else {
               O0000000000.interactionManager
                  .clickSlot(O0000000000.player.playerScreenHandler.syncId, var2, this.O000000000O0O0, SlotActionType.SWAP, O0000000000.player);
            }

            if (this.O000000000O0O.isEmpty()) {
               if (this.O000000000O0OO) {
                  O0000000000.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(O0000000000.player.playerScreenHandler.syncId));
                  this.O000000000O0OO = false;
               }

               this.O000000000OO = 1;
               this.O0000000000O0O();
            }
         }
      }
   }

   private void O0000000000O0() {
      boolean var1 = this.O000000000O00.O000000000("Сила") && !O0000000000.player.hasStatusEffect(StatusEffects.STRENGTH);
      boolean var2 = this.O000000000O00.O000000000("Скорость") && !O0000000000.player.hasStatusEffect(StatusEffects.SPEED);
      boolean var3 = this.O000000000O00.O000000000("Огнестойкость") && !O0000000000.player.hasStatusEffect(StatusEffects.FIRE_RESISTANCE);
      if (var1 || var2 || var3) {
         for (int var4 = 0; var4 < 36; var4++) {
            ItemStack var5 = O0000000000.player.getInventory().getStack(var4);
            if (!var5.isEmpty() && var5.getItem() == Items.SPLASH_POTION) {
               PotionContentsComponent var6 = (PotionContentsComponent)var5.get(DataComponentTypes.POTION_CONTENTS);
               if (var6 != null) {
                  for (StatusEffectInstance var8 : var6.getEffects()) {
                     RegistryEntry var9 = var8.getEffectType();
                     if (var1 && var9.equals(StatusEffects.STRENGTH)) {
                        this.O000000000O0O.add(var4);
                        var1 = false;
                        break;
                     }

                     if (var2 && var9.equals(StatusEffects.SPEED)) {
                        this.O000000000O0O.add(var4);
                        var2 = false;
                        break;
                     }

                     if (var3 && var9.equals(StatusEffects.FIRE_RESISTANCE)) {
                        this.O000000000O0O.add(var4);
                        var3 = false;
                        break;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean O0000000000O00() {
      for (PlayerEntity var2 : O0000000000.world.getPlayers()) {
         if (var2 != O0000000000.player && O0000000000.player.squaredDistanceTo(var2) <= 225.0) {
            return true;
         }
      }

      return false;
   }

   private void O0000000000O0O() {
      O000000000O0 = false;
      this.O000000000O0O0 = -1;
      if (!this.O000000000O000.O0000000000()) {
         if (O0000000000.player != null) {
            O0000000000.player.setYaw(O000000O0O00O.O0000000000);
            O0000000000.player.setPitch(O000000O0O00O.O00000000000);
         }

         O000000O0O00O.O00000000 = false;
      }
   }

   @Override
   public void O000000000() {
      this.O000000000O0O.clear();
      this.O0000000000O0O();
      super.O000000000();
   }
}
