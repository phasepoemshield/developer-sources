package ru.metaculture.protection;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.mob.AmbientEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "TriggerBot",
   O000000000 = "Бьет энтити при наведении на него",
   O0000000000 = Category.Combat,
   O00000000000 = {O0000000OO0OOO.RISKY, O0000000OO0OOO.GRIM}
)
public class TriggerBot extends Module {
   public static NumberSetting O000000000O = new NumberSetting("Дистанция", 4.5F, 3.0F, 8.0F, 0.1F, false);
   public static GroupSetting O000000000O0 = new GroupSetting(
      "Цели",
      new BooleanSetting("Игроки", true),
      new BooleanSetting("Голые", true),
      new BooleanSetting("Невидимки", true),
      new BooleanSetting("Голые невидимки", false),
      new BooleanSetting("Друзья", false),
      new BooleanSetting("NPC", true),
      new BooleanSetting("Мобы", false),
      new BooleanSetting("Животные", false),
      new BooleanSetting("Жители", false)
   );
   public static GroupSetting O000000000O00 = new GroupSetting(
      "Проверки до удара",
      new BooleanSetting("Бить через блоки", false),
      new BooleanSetting("Бить только оружием", false),
      new BooleanSetting("Не бить если кушаешь", true),
      new BooleanSetting("Не бить в контейнерах ", false),
      new BooleanSetting("Ломать щит", false),
      new BooleanSetting("Отжим щита", false)
   );
   public static GroupSetting O000000000O000 = new GroupSetting(
      "Дополнительные настройки",
      new BooleanSetting("Расширенная настройки для атаки", false),
      new BooleanSetting("Умные криты", false),
      new BooleanSetting("Увеличенная дистанция удара", false),
      new BooleanSetting("Приоритет ближайшей цели", true)
   );
   public static NumberSetting O000000000O00O = new NumberSetting("Радиус атаки для мобов", 4.5F, 3.0F, 8.0F, 0.1F, false)
      .O00000000(() -> !O000000000O000.O000000000("Расширенная настройки для атаки"));
   public static NumberSetting O000000000O0O = new NumberSetting("Радиус атаки для игроков", 4.5F, 3.0F, 8.0F, 0.1F, false)
      .O00000000(() -> !O000000000O000.O000000000("Расширенная настройки для атаки"));
   public static LivingEntity O000000000O0O0;
   private static long O000000000O0OO = 0L;
   private static boolean O000000000OO = false;
   private static float O000000000OO0 = 0.0F;

   public TriggerBot() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0, O000000000O00, O000000000O000, O000000000O00O, O000000000O0O});
   }

   public static LivingEntity O0000000000O0() {
      return O000000000O0O0;
   }

   @Override
   public void O000000000() {
      O000000000O0O0 = null;
      O000000000OO = false;
      O000000000OO0 = 0.0F;
      O000000000O0OO = 0L;
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         this.O0000000000O00();
         if (!AttackAura.O0000000000O0O()) {
            LivingEntity var2 = this.O0000000000O0O();
            if (var2 != null) {
               if (!this.O0000000000OO()) {
                  float var3 = O00000000(var2);
                  float[] var4 = new float[]{var3, 0.0F, var3};
                  O000000O00OOOO.O00000000(var2, true, true, false);
                  boolean var5 = O000000000O000.O000000000("Умные криты");
                  if (O000000O00OOOO.O00000000(var2, false, true, var5, 0L, var4)) {
                     Runnable[] var6 = O000000O00OOOO.O00000000(var2, O000000000O00.O000000000("Ломать щит"));
                     Runnable[] var7 = O000000O00OOOO.O00000000(true);
                     Runnable[] var8 = O000000O00OOOO.O000000000(false);
                     Runnable var9 = () -> {
                        var8[0].run();
                        var7[0].run();
                        var6[0].run();
                     };
                     Runnable var10 = () -> {
                        var6[1].run();
                        var7[1].run();
                        var8[1].run();
                     };
                     if (O000000000O00.O000000000("Отжим щита")
                        && O0000000000.player.getActiveItem().getItem().equals(Items.SHIELD)
                        && O0000000000.player.isUsingItem()) {
                        O0000000000.interactionManager.stopUsingItem(O0000000000.player);
                     }

                     if (O000000O00OOOO.O00000000(var2, var9, var10, Hand.MAIN_HAND, true)) {
                        O000000000O0O0 = var2;
                     }
                  }
               }
            }
         }
      } else {
         O000000000O0O0 = null;
      }
   }

   private void O0000000000O00() {
      if (O000000000O0O0 != null) {
         if (!O000000000O0O0.isAlive()
            || O000000000O0O0.isRemoved()
            || O0000000000.player == null
            || O0000000000.player.distanceTo(O000000000O0O0) > O00000000(O000000000O0O0) + 2.0F) {
            O000000000O0O0 = null;
         }
      }
   }

   private LivingEntity O0000000000O0O() {
      LivingEntity var1 = null;
      double var2 = Double.MAX_VALUE;
      float var4 = O0000000000.player.getYaw();
      float var5 = O0000000000.player.getPitch();
      boolean var6 = O000000000O000.O000000000("Приоритет ближайшей цели");
      boolean var7 = O000000000O00.O000000000("Бить через блоки");
      Vec3d var8 = O0000000000.player.getEyePos();
      Vec3d var9 = O0000000000.player.getRotationVec(1.0F).normalize();

      for (Entity var11 : O0000000000.world.getEntities()) {
         if (var11 instanceof LivingEntity var12 && this.O000000000(var12) && O000000O0O00.O0000000000(var4, var5, O00000000(var12), var12, var7)) {
            double var13;
            if (var6) {
               var13 = O0000000000.player.squaredDistanceTo(var12);
            } else {
               Vec3d var15 = var12.getPos().add(0.0, var12.getHeight() * 0.5, 0.0);
               Vec3d var16 = var15.subtract(var8).normalize();
               var13 = Math.acos(MathHelper.clamp(var9.dotProduct(var16), -1.0, 1.0));
            }

            if (var13 < var2) {
               var2 = var13;
               var1 = var12;
            }
         }
      }

      return var1;
   }

   public static float O00000000(LivingEntity livingEntity) {
      if (livingEntity == null) {
         return O000000000O.O0000000000();
      } else {
         float var1 = O000000000O.O0000000000();
         if (O000000000O000.O000000000("Расширенная настройки для атаки")) {
            var1 = livingEntity instanceof PlayerEntity ? O000000000O0O.O0000000000() : O000000000O00O.O0000000000();
         }

         if (O000000000O000.O000000000("Увеличенная дистанция удара")) {
            float var2 = livingEntity.getHealth() + livingEntity.getAbsorptionAmount();
            if (var2 >= 10.0F && var2 <= 12.0F) {
               long var3 = System.currentTimeMillis();
               if (var3 >= O000000000O0OO) {
                  if (ThreadLocalRandom.current().nextInt(100) < 25) {
                     O000000000OO = true;
                     O000000000OO0 = 0.1F + ThreadLocalRandom.current().nextFloat() * 0.05F;
                     O000000000O0OO = var3 + ThreadLocalRandom.current().nextLong(400L, 700L);
                  } else {
                     O000000000OO = false;
                     O000000000OO0 = 0.0F;
                     O000000000O0OO = var3 + ThreadLocalRandom.current().nextLong(1500L, 2500L);
                  }
               }

               if (O000000000OO) {
                  return var1 + O000000000OO0;
               }
            } else {
               O000000000OO = false;
               O000000000OO0 = 0.0F;
            }
         }

         return var1;
      }
   }

   private boolean O0000000000OO() {
      return O0000000000.player.isUsingItem()
            && O000000000O00.O000000000("Не бить если кушаешь")
            && !(O0000000000.player.getActiveItem().getItem() instanceof ShieldItem)
         || O0000000000.currentScreen != null && O000000000O00.O000000000("Не бить в контейнерах ")
         || !O0000000000.player.getMainHandStack().isIn(ItemTags.SWORDS)
            && !O0000000000.player.getMainHandStack().isIn(ItemTags.AXES)
            && O000000000O00.O000000000("Бить только оружием");
   }

   private boolean O000000000(LivingEntity livingEntity) {
      if (livingEntity instanceof ClientPlayerEntity || livingEntity == O0000000000.player) {
         return false;
      } else if (livingEntity.isAlive() && !livingEntity.isInvulnerable() && !(livingEntity instanceof ArmorStandEntity)) {
         if (O0000000000.player.distanceTo(livingEntity) > O00000000(livingEntity)) {
            return false;
         } else if (!O000000000O00.O000000000("Бить через блоки") && !O0000000000.player.canSee(livingEntity)) {
            return false;
         } else if (!O000000000O0.O000000000("NPC") && this.O0000000000(livingEntity)) {
            return false;
         } else if (livingEntity instanceof PlayerEntity var6) {
            if (!var6.isCreative() && !var6.isSpectator()) {
               boolean var7 = FriendCommand.O00000000(var6.getName().getString());
               if (var7 && !O000000000O0.O000000000("Друзья")) {
                  return false;
               } else if (!var7 && !O000000000O0.O000000000("Игроки")) {
                  return false;
               } else if (AntiBot.O00000000(var6)) {
                  return false;
               } else {
                  boolean var8 = !this.O00000000(var6);
                  boolean var5 = var6.isInvisible();
                  if (var5) {
                     return var8 ? O000000000O0.O000000000("Голые невидимки") : O000000000O0.O000000000("Невидимки");
                  } else {
                     return !var8 || O000000000O0.O000000000("Голые");
                  }
               }
            } else {
               return false;
            }
         } else {
            boolean var2 = livingEntity instanceof Monster || livingEntity instanceof SlimeEntity;
            boolean var3 = livingEntity instanceof VillagerEntity || livingEntity instanceof MerchantEntity;
            boolean var4 = livingEntity instanceof AnimalEntity
               || livingEntity instanceof VillagerEntity
               || livingEntity instanceof WaterCreatureEntity
               || livingEntity instanceof AmbientEntity;
            if (var2 && O000000000O0.O000000000("Мобы")) {
               return true;
            } else {
               return var3 && O000000000O0.O000000000("Жители") ? true : var4 && O000000000O0.O000000000("Животные");
            }
         }
      } else {
         return false;
      }
   }

   private boolean O00000000(PlayerEntity playerEntity) {
      return !playerEntity.getEquippedStack(EquipmentSlot.HEAD).isEmpty()
         || !playerEntity.getEquippedStack(EquipmentSlot.CHEST).isEmpty()
         || !playerEntity.getEquippedStack(EquipmentSlot.LEGS).isEmpty()
         || !playerEntity.getEquippedStack(EquipmentSlot.FEET).isEmpty();
   }

   private boolean O0000000000(LivingEntity livingEntity) {
      String var2 = this.O000000000(livingEntity.getName().getString());
      String var3 = this.O000000000(livingEntity.getDisplayName().getString());
      String var4 = livingEntity.getCustomName() == null ? "" : this.O000000000(livingEntity.getCustomName().getString());
      String var5 = "";
      String var6 = "";
      if (livingEntity.getScoreboardTeam() != null) {
         var5 = this.O000000000(livingEntity.getScoreboardTeam().getPrefix().getString());
         var6 = this.O000000000(livingEntity.getScoreboardTeam().getSuffix().getString());
      }

      if (this.O00000000(var2) || this.O00000000(var3) || this.O00000000(var4) || this.O00000000(var5) || this.O00000000(var6)) {
         return true;
      } else if (!(livingEntity instanceof PlayerEntity var7)) {
         return false;
      } else {
         boolean var8 = O0000000000.getNetworkHandler() != null && O0000000000.getNetworkHandler().getPlayerListEntry(var7.getUuid()) == null;
         boolean var9 = var2.matches("\\d{1,8}") || var2.startsWith("cit-");
         if (!var8) {
            if (var9) {
               if (!var3.equals(var2) || !var5.isEmpty()) {
                  return true;
               }

               if (!var6.isEmpty()) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      }
   }

   private boolean O00000000(String string) {
      return string.contains("npc") || string.contains("znpc") || string.contains("нпс") || string.contains("наставник");
   }

   private String O000000000(String string) {
      return string == null ? "" : string.replaceAll("(?i)§.", "").replaceAll("(?i)&.", "").replaceAll("\\p{Cntrl}", "").trim().toLowerCase(Locale.ROOT);
   }
}
