package l;

import antidaunleak.api.annotation.Native;
import java.util.ArrayList;
import java.util.Comparator;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.EquipmentSlot.Type;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class AutoArmor extends Helper242 {
   public AutoArmor() {
      super("AutoArmor", "Auto Armor", Helper269.PLAYER);
      this.setup(new Helper264[0]);
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void onTick(Event8 var1) {
      if (!Helper66.method719()) {
         if (Helper59.script.method1317()) {
            ArrayList<Runnable> var2 = new ArrayList<>();

            for (EquipmentSlot var6 : EquipmentSlot.values()) {
               ItemStack var7 = mc.player.getInventory().getArmorStack(var6.getEntitySlotId());
               if (var6.getType() == Type.HUMANOID_ARMOR && (!var6.equals(EquipmentSlot.CHEST) || !var7.getItem().equals(Items.ELYTRA))) {
                  int var8 = 8 - var6.getEntitySlotId();
                  Slot var9 = Helper66.method708(
                     var3 -> {
                        ItemStack var4 = var3.getStack();
                        return var3.id != var8
                           && !this.method4594(var4)
                           && !this.method4593(var4)
                           && var4.getItem() instanceof ArmorItem var5
                           && ((Helper150)var5).zov_pidarok$getType().getEquipmentSlot().equals(var6);
                     },
                     Comparator.comparingDouble(var1x -> this.method4592(var1x.getStack(), (Helper150)var1x.getStack().getItem()))
                  );
                  if (var9 != null && this.method4595(var9.getStack(), var7)) {
                     var2.add(() -> Helper66.method685(var9, var8));
                  } else if (this.method4594(var7)) {
                     Hud var10 = Hud.method1824();
                     if (var9 != null) {
                        var2.add(() -> Helper66.method685(var9, var8));
                        if (var10.state && var10.notificationSettings.method2588("Auto Armor")) {
                           Notifications.method1666()
                              .method1669(
                                 Text.literal("Заменил - " + Formatting.GREEN + this.method4596(var6) + Formatting.RESET + " на ").append(var7.getName()),
                                 3000L
                              );
                        }
                     } else if (Helper66.method706(Items.AIR, var0 -> var0.id >= 9) != null) {
                        var2.add(() -> Helper66.method703(var8, 0, SlotActionType.QUICK_MOVE, false));
                        if (var10.state && var10.notificationSettings.method2588("Auto Armor")) {
                           Notifications.method1666().method1669(Text.literal("Засейвил - ").append(var7.getName()), 3000L);
                        }
                     }
                  }
               }
            }

            if (!var2.isEmpty()) {
               Helper59.method657(() -> {
                  var2.forEach(Runnable::run);
                  Helper66.method700();
               });
            }
         }
      }
   }

   private float method4592(ItemStack var1, Helper150 var2) {
      Registry var3 = mc.world.getRegistryManager().getOrThrow(RegistryKeys.ENCHANTMENT);
      ArmorMaterial var4 = var2.zov_pidarok$getMaterial();
      float var5 = var4.defense().getOrDefault(var2.zov_pidarok$getType(), 0).intValue()
         + var4.toughness()
         + EnchantmentHelper.getLevel((RegistryEntry<Enchantment>)var3.getEntry(Enchantments.PROTECTION.getValue()).orElseThrow(), var1);
      float var6 = EnchantmentHelper.getLevel((RegistryEntry<Enchantment>)var3.getEntry(Enchantments.UNBREAKING.getValue()).orElseThrow(), var1);
      float var7 = EnchantmentHelper.getLevel((RegistryEntry<Enchantment>)var3.getEntry(Enchantments.MENDING.getValue()).orElseThrow(), var1);
      return var5 + var6 * 0.1F + var7 * 0.2F;
   }

   private boolean method4593(ItemStack var1) {
      RegistryEntry var2 = mc.world.getRegistryManager().getOrThrow(RegistryKeys.ENCHANTMENT).getEntry(Enchantments.BINDING_CURSE.getValue()).orElse(null);
      return var2 == null ? false : EnchantmentHelper.getLevel(var2, var1) > 0;
   }

   private boolean method4594(ItemStack var1) {
      return (double)var1.getDamage() / var1.getMaxDamage() > 0.98;
   }

   private boolean method4595(ItemStack var1, ItemStack var2) {
      if (var2.isEmpty()) {
         return true;
      } else {
         return var1.getItem() instanceof ArmorItem var3 && var2.getItem() instanceof ArmorItem var4
            ? this.method4592(var1, (Helper150)var3) > this.method4592(var2, (Helper150)var4)
            : false;
      }
   }

   private String method4596(EquipmentSlot var1) {
      return switch (var1) {
         case FEET -> "Ботинки";
         case LEGS -> "Поножи";
         case CHEST -> "Нагрудник";
         case HEAD -> "Шлем";
         default -> "67!";
      };
   }
}
