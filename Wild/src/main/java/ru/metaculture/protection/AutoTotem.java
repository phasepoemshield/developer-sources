package ru.metaculture.protection;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.vehicle.TntMinecartEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PlayerHeadItem;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.math.Box;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoTotem",
   O000000000 = "Автоматически берет тотем в левую руку",
   O0000000000 = Category.Combat,
   O00000000000 = {O0000000OO0OOO.GRIM}
)
public class AutoTotem extends Module {
   private static final String O000000000O0 = "Сохрянять талисманы";
   private static final String O000000000O00 = "Не свапать если в КД";
   private final GroupSetting O000000000O000 = new GroupSetting(
      "Настройки",
      new BooleanSetting("Здоровье с элитрами", true),
      new BooleanSetting("Динамит", true),
      new BooleanSetting("Падение", false),
      new BooleanSetting("Эндер-кристалл", false),
      new BooleanSetting("Не свапать если в КД", false),
      new BooleanSetting("Сохрянять талисманы", true)
   );
   private final NumberSetting O000000000O00O = new NumberSetting("Здоровье", 4.0F, 1.0F, 20.0F, 0.5F, false);
   private final NumberSetting O000000000O0O = new NumberSetting("Здоровье на элитре", 9.0F, 0.0F, 20.0F, 0.5F, false)
      .O00000000(() -> !this.O000000000O000.O000000000("Здоровье с элитрами"));
   private final NumberSetting O000000000O0O0 = new NumberSetting("Дистанция до кристалла", 4.0F, 1.0F, 10.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O000.O000000000("Эндер-кристалл"));
   private final NumberSetting O000000000O0OO = new NumberSetting("Дистанция до динамита", 30.0F, 3.0F, 50.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O000.O000000000("Динамит"));
   private final BooleanSetting O000000000OO = new BooleanSetting("Не свапать если шар", false);
   private int O000000000OO0 = -1;
   private boolean O000000000OO00 = false;
   private AutoTotem.W30 O000000000OO0O = AutoTotem.W30.IDLE;
   private final O0000O00O0000 O000000000OOO = new O0000O00O0000();
   private int O000000000OOO0 = -1;
   private boolean O000000000OOOO = false;
   public static boolean O000000000O = false;

   public AutoTotem() {
      this.O00000000(new Setting[]{this.O000000000O000, this.O000000000O00O, this.O000000000O0O, this.O000000000O0O0, this.O000000000O0OO, this.O000000000OO});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player == null || !O0000000000.player.isAlive() || O0000000000.world == null) {
         this.O0000000000OO0();
      } else if (this.O000000000OO0O != AutoTotem.W30.IDLE) {
         Sprint.O000000000O000 = 2;
         O0000000000.options.sprintKey.setPressed(false);
         O0000000000.player.setSprinting(false);
         this.O0000000000(false);
         this.O0000000000O00();
      } else {
         this.O0000000000O0O();
      }
   }

   private void O0000000000O00() {
      switch (this.O000000000OO0O) {
         case PREPARE:
            if (this.O000000000OOO.O00000000(20L)) {
               this.O000000000OOO.O00000000();
               this.O000000000OO0O = AutoTotem.W30.SWAP;
            }
            break;
         case SWAP:
            if (!O0000000000.player.isSprinting()) {
               O0000000000.interactionManager
                  .clickSlot(O0000000000.player.playerScreenHandler.syncId, this.O000000000OOO0, 40, SlotActionType.SWAP, O0000000000.player);
            }

            O0000000000.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(O0000000000.player.playerScreenHandler.syncId));
            if (this.O000000000OOO.O00000000(30L)) {
               this.O000000000OOO.O00000000();
               this.O000000000OO0O = this.O000000000OOOO ? AutoTotem.W30.RESTORE : AutoTotem.W30.COOLDOWN;
            }
            break;
         case RESTORE:
            if (this.O000000000OOO.O00000000(30L)) {
               this.O000000000OOO.O00000000();
               this.O0000000000OOO();
               this.O000000000OO0O = AutoTotem.W30.COOLDOWN;
            }
            break;
         case COOLDOWN:
            if (this.O000000000OOO.O00000000(40L)) {
               this.O0000000000(true);
               this.O000000000OO0O = AutoTotem.W30.IDLE;
               O000000000O = false;
            }
      }
   }

   private void O0000000000O0O() {
      boolean var1 = this.O000000000O00();
      ItemStack var2 = O0000000000.player.getOffHandStack();
      boolean var3 = this.O00000000(var2);
      boolean var4 = this.O000000000O000.O000000000("Не свапать если в КД");
      if (var4 && var3 && this.O0000000000(var2)) {
         if (this.O000000000OO0 != -1 && this.O000000000OO00) {
            this.O000000000OOO0 = this.O000000000OO0;
            this.O000000000OOOO = true;
            this.O0000000000OO();
         } else {
            this.O0000000000OOO();
         }
      } else {
         boolean var5 = var1 && this.O000000000O000.O000000000("Сохрянять талисманы") && this.O00000000000(var2);
         if (var1 && (!var3 || var5)) {
            int var6 = var5 ? this.O000000000O0() : this.O000000000O();
            if (var6 >= 0) {
               if (!this.O000000000OO00) {
                  this.O000000000OO0 = var6;
                  this.O000000000OO00 = true;
               }

               this.O000000000OOO0 = var6;
               this.O000000000OOOO = false;
               this.O0000000000OO();
            }
         } else if (!var1 && this.O000000000OO0 != -1 && this.O000000000OO00) {
            if (O0000000000.player.getOffHandStack().isOf(Items.TOTEM_OF_UNDYING)) {
               this.O000000000OOO0 = this.O000000000OO0;
               this.O000000000OOOO = true;
               this.O0000000000OO();
            } else {
               this.O0000000000OOO();
            }
         }
      }
   }

   private void O0000000000OO() {
      this.O000000000OOO.O00000000();
      this.O000000000OO0O = AutoTotem.W30.PREPARE;
      O000000000O = true;
   }

   private void O0000000000(boolean bl) {
      if (O0000000000.getWindow() != null) {
         KeyBinding[] var2 = new KeyBinding[]{
            O0000000000.options.forwardKey, O0000000000.options.backKey, O0000000000.options.leftKey, O0000000000.options.rightKey, O0000000000.options.jumpKey
         };
         long var3 = O0000000000.getWindow().getHandle();

         for (KeyBinding var8 : var2) {
            boolean var9 = bl && InputUtil.isKeyPressed(var3, var8.getDefaultKey().getCode());
            var8.setPressed(var9);
         }
      }
   }

   private void O0000000000OO0() {
      this.O0000000000(true);
      this.O000000000OO0O = AutoTotem.W30.IDLE;
      this.O000000000OOO.O00000000();
      this.O0000000000OOO();
      O000000000O = false;
   }

   private void O0000000000OOO() {
      this.O000000000OO0 = -1;
      this.O000000000OO00 = false;
      this.O000000000OOOO = false;
   }

   private int O000000000O() {
      int var1 = this.O000000000O0();
      if (var1 >= 0) {
         return var1;
      } else {
         for (int var2 = 0; var2 < 36; var2++) {
            ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
            if (this.O000000000(var3)) {
               return var2 < 9 ? var2 + 36 : var2;
            }
         }

         return -1;
      }
   }

   private int O000000000O0() {
      for (int var1 = 0; var1 < 36; var1++) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
         if (this.O000000000(var2) && !this.O00000000000(var2)) {
            return var1 < 9 ? var1 + 36 : var1;
         }
      }

      return -1;
   }

   public boolean O0000000000O0() {
      ItemStack var1 = O0000000000.player.getOffHandStack();
      return this.O00000000(var1);
   }

   private boolean O00000000(ItemStack itemStack) {
      return itemStack != null && itemStack.isOf(Items.TOTEM_OF_UNDYING);
   }

   private boolean O000000000(ItemStack itemStack) {
      return this.O00000000(itemStack) && (!this.O000000000O000.O000000000("Не свапать если в КД") || !this.O0000000000(itemStack));
   }

   private boolean O0000000000(ItemStack itemStack) {
      return O0000000000.player != null && itemStack != null && !itemStack.isEmpty() && O0000000000.player.getItemCooldownManager().isCoolingDown(itemStack);
   }

   private boolean O00000000000(ItemStack itemStack) {
      if (this.O00000000(itemStack)) {
         if (itemStack.hasEnchantments()) {
            return true;
         }

         if (itemStack.hasGlint()) {
            return true;
         }
      }

      return false;
   }

   private boolean O000000000O00() {
      return this.O000000000O000()
         || this.O000000000O0O()
         || this.O000000000O0O0()
         || this.O000000000O00O()
         || O0000000000.player.getHealth() + O0000000000.player.getAbsorptionAmount() <= this.O000000000O00O.O0000000000();
   }

   private boolean O000000000O000() {
      ItemStack var1 = O0000000000.player.getEquippedStack(EquipmentSlot.CHEST);
      return var1.getItem() == Items.ELYTRA
         && this.O000000000O000.O000000000("Здоровье с элитрами")
         && O0000000000.player.getHealth() + O0000000000.player.getAbsorptionAmount() <= this.O000000000O0O.O0000000000();
   }

   private boolean O000000000O00O() {
      return this.O000000000O000.O000000000("Падение") && O0000000000.player.fallDistance > 12.0;
   }

   private boolean O000000000O0O() {
      if (!this.O000000000O000.O000000000("Эндер-кристалл")) {
         return false;
      } else {
         double var1 = this.O000000000O0O0.O0000000000() * this.O000000000O0O0.O0000000000();
         Box var3 = O0000000000.player.getBoundingBox().expand(this.O000000000O0O0.O0000000000());
         boolean var4 = !O0000000000.world
            .getEntitiesByClass(EndCrystalEntity.class, var3, endCrystalEntity -> endCrystalEntity.squaredDistanceTo(O0000000000.player) <= var1)
            .isEmpty();
         return var4 && (!(O0000000000.player.getOffHandStack().getItem() instanceof PlayerHeadItem) || !this.O000000000OO.O0000000000());
      }
   }

   private boolean O000000000O0O0() {
      if (!this.O000000000O000.O000000000("Динамит")) {
         return false;
      } else {
         double var1 = this.O000000000O0OO.O0000000000() * this.O000000000O0OO.O0000000000();
         Box var3 = O0000000000.player.getBoundingBox().expand(this.O000000000O0OO.O0000000000());
         return !O0000000000.world
            .getEntitiesByClass(
               Entity.class,
               var3,
               entity -> (entity instanceof TntEntity || entity instanceof TntMinecartEntity) && entity.squaredDistanceTo(O0000000000.player) <= var1
            )
            .isEmpty();
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      this.O0000000000OO0();
   }

   static enum W30 {
      IDLE,
      PREPARE,
      SWAP,
      RESTORE,
      COOLDOWN;
   }
}
