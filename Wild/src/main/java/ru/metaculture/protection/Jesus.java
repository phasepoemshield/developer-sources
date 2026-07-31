package ru.metaculture.protection;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Jesus",
   O0000000000 = Category.Movement,
   O000000000 = "Иисус нахуй"
)
public class Jesus extends Module {
   private final ModeSetting O000000000O = new ModeSetting("Режим", "Авто", "Авто", "Простой");
   private final NumberSetting O000000000O0 = new NumberSetting("Скорость", 0.2F, 0.2F, 1.05F, 0.01F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Простой"));
   private final KeybindSetting O000000000O00 = new KeybindSetting("Кнопка буста", -1);
   private long O000000000O000 = 0L;
   private boolean O000000000O00O = false;
   private boolean O000000000O0O = false;
   private final float O000000000O0O0 = 0.47F;
   private final float O000000000O0OO = 0.43F;

   public Jesus() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00});
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (O0000000000.currentScreen == null && o0000000O0O0.O0000000000000() == 1) {
         if (o0000000O0O0.O00000000000() == this.O000000000O00.O0000000000()) {
            this.O000000000O0O = true;
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (this.O000000000O0O) {
            this.O000000000O00O = true;
            this.O000000000O000 = System.currentTimeMillis() + 2000L;
            this.O000000000O0O = false;
         }

         if (this.O000000000O00O && System.currentTimeMillis() > this.O000000000O000) {
            this.O000000000O00O = false;
         }

         if (O0000000000.player.isTouchingWater() || O0000000000.player.isInLava()) {
            StatusEffectInstance var2 = O0000000000.player.getStatusEffect(StatusEffects.SPEED);
            StatusEffectInstance var3 = O0000000000.player.getStatusEffect(StatusEffects.SLOWNESS);
            ItemStack var4 = O0000000000.player.getOffHandStack();
            String var5 = var4.getName().getString();
            ItemStack var6 = O0000000000.player.getEquippedStack(EquipmentSlot.HEAD);
            ItemStack var7 = O0000000000.player.getEquippedStack(EquipmentSlot.CHEST);
            ItemStack var8 = O0000000000.player.getEquippedStack(EquipmentSlot.LEGS);
            ItemStack var9 = O0000000000.player.getEquippedStack(EquipmentSlot.FEET);
            String var10 = var6.getName().getString();
            String var11 = var7.getName().getString();
            String var12 = var8.getName().getString();
            String var13 = var9.getName().getString();
            float var14 = this.O00000000(var2, var3, var5);
            var14 = this.O00000000(var14, var6, var10, var7, var11, var8, var12, var9, var13);
            if (this.O000000000O00O) {
               var14 *= 1.89F;
            }

            O0000O00O000OO.O000000000(var14);
            boolean var15 = O0000000000.options.forwardKey.isPressed()
               || O0000000000.options.backKey.isPressed()
               || O0000000000.options.leftKey.isPressed()
               || O0000000000.options.rightKey.isPressed();
            if (!var15) {
               O0000000000.player.setVelocity(0.0, O0000000000.player.getVelocity().y, 0.0);
            }

            double var16 = O0000000000.options.jumpKey.isPressed() ? 0.019 : 0.003;
            O0000000000.player.setVelocity(O0000000000.player.getVelocity().x, var16, O0000000000.player.getVelocity().z);
         }
      }
   }

   private float O00000000(StatusEffectInstance statusEffectInstance, StatusEffectInstance statusEffectInstance2, String string) {
      float var4 = 0.0F;
      if (this.O000000000O.O000000000("Авто")) {
         if (statusEffectInstance != null) {
            if (statusEffectInstance.getAmplifier() == 2) {
               var4 = this.O00000000(string) ? 0.58515F : 0.53535F;
            } else if (statusEffectInstance.getAmplifier() == 1) {
               var4 = this.O00000000(string) ? 0.47F : 0.43F;
            }
         } else {
            var4 = this.O00000000(string) ? 0.3243F : 0.2967F;
         }
      } else if (this.O000000000O.O000000000("Простой")) {
         var4 = this.O000000000O0.O0000000000();
      }

      if (statusEffectInstance2 != null) {
         var4 *= 0.85F;
      }

      return var4;
   }

   private boolean O00000000(String string) {
      return string.contains("Шар Геракла 2")
         || string.contains("Шар CHAMPION")
         || string.contains("Шар Аида 2")
         || string.contains("Шар GOD")
         || string.contains("КУБИК-РУБИК");
   }

   private float O00000000(
      float f,
      ItemStack itemStack,
      String string,
      ItemStack itemStack2,
      String string2,
      ItemStack itemStack3,
      String string3,
      ItemStack itemStack4,
      String string4
   ) {
      if (itemStack4.getItem() == Items.GOLDEN_BOOTS && string4.contains("Тапочки админа SoveryBRIZ")) {
         f *= 1.01F;
      }

      if (itemStack3.getItem() == Items.GOLDEN_LEGGINGS && string3.contains("Штаны админа stqffy")) {
         f *= 1.02F;
      }

      if (itemStack.getItem() == Items.GOLDEN_HELMET && string.contains("Шляпа админа Vester")) {
         f *= 1.05F;
      }

      if (itemStack2.getItem() == Items.GOLDEN_CHESTPLATE && string2.contains("Грудак админа lxckscream")) {
         f *= 1.03F;
      }

      if (itemStack.getItem() == Items.PLAYER_HEAD && string.contains("Новогодний Подарок")) {
         f *= 0.75F;
      }

      return f;
   }
}
