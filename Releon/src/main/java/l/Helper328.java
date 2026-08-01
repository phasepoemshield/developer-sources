package l;

import java.util.List;
import java.util.stream.StreamSupport;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class Helper328 {
   private final List<String> targetSettings;

   public boolean method3251(LivingEntity var1) {
      if (this.method3252(var1)) {
         return false;
      } else if (this.method3253(var1)) {
         return false;
      } else {
         return this.method3254(var1) ? false : this.method3256(var1);
      }
   }

   private boolean method3252(LivingEntity var1) {
      return var1 == Helper160.mc.player;
   }

   private boolean method3253(LivingEntity var1) {
      return !var1.isAlive() || var1.getHealth() <= 0.0F;
   }

   private boolean method3254(LivingEntity var1) {
      return var1 instanceof PlayerEntity var2 && AntiBot.method4604().method4615(var2);
   }

   private boolean method3255(LivingEntity var1) {
      return var1 instanceof PlayerEntity var2 ? StreamSupport.stream(var2.getArmorItems().spliterator(), false).allMatch(ItemStack::isEmpty) : false;
   }

   private boolean method3256(LivingEntity var1) {
      return switch (var1) {
         case PlayerEntity var4 -> Helper309.method3075(var4)
            ? this.targetSettings.contains("Friends")
            : (this.method3255(var4) ? this.targetSettings.contains("Naked Players") : this.targetSettings.contains("Players"));
         case AnimalEntity var5 -> this.targetSettings.contains("Animals");
         case MobEntity var6 -> this.targetSettings.contains("Mobs");
         case ArmorStandEntity var7 -> this.targetSettings.contains("Armor Stand");
         default -> false;
      };
   }

   public Helper328(List<String> var1) {
      this.targetSettings = var1;
   }
}
