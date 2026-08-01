package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.PotionEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.text.Text;
import net.minecraft.util.math.Box;

public class UseTracker extends Helper242 {
   private static final String TRACK_TOTEM = "Снос тотема";
   private static final String TRACK_POTIONS = "Полученные зелья";
   private static final String TRACK_CONSUME = "Съеденный предмет";
   private final Setting8 notifyMode = new Setting8("Трекать", "Какие уведомления показывать")
      .method2585("Снос тотема", "Полученные зелья", "Съеденный предмет")
      .method2586("Снос тотема", "Полученные зелья", "Съеденный предмет");
   private final Setting2 potionRadius = new Setting2("Радиус зелий", "Дистанция поиска летящих зелий")
      .method2086(100.0F)
      .method2078(10.0F, 100.0F)
      .method2081(() -> this.method4529());
   private final Map<Integer, Helper435> trackedPotions = new HashMap<>();
   private final Map<UUID, ItemStack> activeUseItem = new HashMap<>();
   private final Map<UUID, Integer> useStartTick = new HashMap<>();

   public UseTracker() {
      super("UseTracker", Helper269.MISC);
      this.setup(new Helper264[]{this.notifyMode, this.potionRadius});
   }

   @Override
   public void deactivate() {
      this.trackedPotions.clear();
      this.activeUseItem.clear();
      this.useStartTick.clear();
   }

   private boolean method4528() {
      return this.notifyMode.method2588("Снос тотема");
   }

   private boolean method4529() {
      return this.notifyMode.method2588("Полученные зелья");
   }

   private boolean method4530() {
      return this.notifyMode.method2588("Съеденный предмет");
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         if (this.method4530()) {
            this.method4531();
         } else {
            this.activeUseItem.clear();
            this.useStartTick.clear();
         }

         if (this.method4529()) {
            this.method4532();
         } else {
            this.trackedPotions.clear();
         }
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (!var1.method3894() && mc.player != null && mc.world != null) {
         if (this.method4528() && var1.method3895() instanceof EntityStatusS2CPacket var2 && var2.getStatus() == 35) {
            if (var2.getEntity(mc.world) instanceof PlayerEntity var12) {
               if (!var12.getUuid().equals(mc.player.getUuid())) {
                  ItemStack var13 = this.method4534(var12);
                  String var14 = var13.isEmpty() ? "Тотем бессмертия" : this.method4535(var13.getName().getString());
                  boolean var15 = var12.getOffHandStack().hasEnchantments() || var12.getMainHandStack().hasEnchantments();
                  Helper238.method2186(
                     "§f" + var12.getName().getString() + " §7потерял §f" + var14 + " §8(" + (var15 ? "§aзачарованный" : "§cнезачарованный") + "§8)"
                  );
               }
            }
         } else {
            if (this.method4529() && var1.method3895() instanceof EntityStatusEffectS2CPacket var8) {
               if (!(mc.world.getEntityById(var8.getEntityId()) instanceof PlayerEntity var4)) {
                  return;
               }

               if (var4.getUuid().equals(mc.player.getUuid())) {
                  return;
               }

               StatusEffectInstance var5 = new StatusEffectInstance(
                  var8.getEffectId(), var8.getDuration(), var8.getAmplifier(), var8.isAmbient(), var8.shouldShowParticles(), var8.shouldShowIcon()
               );
               String var6 = this.method4535(Text.translatable(var8.getEffectId().value().getTranslationKey()).getString());
               int var7 = Math.max(0, var8.getAmplifier()) + 1;
               Helper238.method2186("§f" + var4.getName().getString() + " §7получил §f" + var6 + " " + var7 + " §7на §f" + this.method4536(var5));
            }
         }
      }
   }

   private void method4531() {
      for (PlayerEntity var2 : mc.world.getPlayers()) {
         if (var2 != null && !var2.getUuid().equals(mc.player.getUuid())) {
            UUID var3 = var2.getUuid();
            if (var2.isUsingItem()) {
               this.activeUseItem.computeIfAbsent(var3, var3x -> {
                  this.useStartTick.put(var3, var2.age);
                  return var2.getActiveItem().copy();
               });
            } else {
               ItemStack var4 = this.activeUseItem.remove(var3);
               Integer var5 = this.useStartTick.remove(var3);
               if (var4 != null && !var4.isEmpty() && var5 != null && var2.age - var5 >= 31) {
                  UseAction var6 = var4.getUseAction();

                  String var7 = switch (var6) {
                     case DRINK -> "выпил";
                     case EAT -> "съел";
                     default -> null;
                  };
                  if (var7 != null) {
                     String var8 = this.method4535(var4.getName().getString());
                     Helper238.method2186("§f" + var2.getName().getString() + " §7" + var7 + " §f" + var8);
                  }
               }
            }
         }
      }
   }

   private void method4532() {
      HashSet var1 = new HashSet();
      float var2 = this.potionRadius.method2082();

      for (Entity var4 : mc.world.getEntities()) {
         if (var4 instanceof PotionEntity var5 && !(mc.player.distanceTo(var5) > var2)) {
            int var6 = var5.getId();
            var1.add(var6);
            Helper435 var7 = this.trackedPotions.get(var6);
            if (var7 == null) {
               this.trackedPotions.put(var6, new Helper435(var5.getStack().copy(), var5.getX(), var5.getY(), var5.getZ()));
            } else {
               var7.lastX = var5.getX();
               var7.lastY = var5.getY();
               var7.lastZ = var5.getZ();
            }
         }
      }

      HashSet<Integer> var8 = new HashSet<>(this.trackedPotions.keySet());
      var8.removeAll(var1);

      for (int var10 : var8) {
         Helper435 var11 = this.trackedPotions.remove(var10);
         if (var11 != null) {
            this.method4533(var11);
         }
      }
   }

   private void method4533(Helper435 var1) {
      Box var2 = new Box(var1.lastX - 4.0, var1.lastY - 2.0, var1.lastZ - 4.0, var1.lastX + 4.0, var1.lastY + 2.0, var1.lastZ + 4.0);

      for (LivingEntity var4 : mc.world.getEntitiesByClass(LivingEntity.class, var2, var0 -> true)) {
         if (var4 instanceof PlayerEntity var5 && !var5.getUuid().equals(mc.player.getUuid())) {
            double var6 = var5.getX() - var1.lastX;
            double var8 = var5.getZ() - var1.lastZ;
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            if (!(var10 > 4.0)) {
               double var12 = Math.max(0.0, 1.0 - var10 / 4.0) * 100.0;
               String var14 = this.method4535(var1.stack.getName().getString());
               Helper238.method2186("§f" + var5.getName().getString() + " §7получил §f" + var14 + " §8(§7" + String.format("%.0f%%", var12) + "§8)");
            }
         }
      }
   }

   private ItemStack method4534(PlayerEntity var1) {
      if (var1.getOffHandStack().isOf(Items.TOTEM_OF_UNDYING)) {
         return var1.getOffHandStack();
      } else {
         return var1.getMainHandStack().isOf(Items.TOTEM_OF_UNDYING) ? var1.getMainHandStack() : var1.getOffHandStack();
      }
   }

   private String method4535(String var1) {
      return var1.replaceAll("§.", "");
   }

   private String method4536(StatusEffectInstance var1) {
      if (var1.isInfinite()) {
         return "∞";
      } else {
         int var2 = var1.getDuration() / 20;
         int var3 = var2 / 60;
         var2 %= 60;
         return var3 > 0 ? var3 + " мин " + var2 + " сек" : var2 + " сек";
      }
   }
}
