package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.DeathProtectionComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "FakePlayer",
   O0000000000 = Category.Player,
   O000000000 = "Создаёт локального WildBot для тренировки атак и тотемов"
)
public final class FakePlayer extends Module {
   private static final UUID O000000000O = UUID.nameUUIDFromBytes("WildClient:WildBot".getBytes(StandardCharsets.UTF_8));
   private static final int O000000000O0 = -1337;
   private static final int O000000000O00 = 20;
   private static final float O000000000O000 = 0.1F;
   private static final float O000000000O00O = 0.5F;
   private static final float O000000000O0O = 1.5F;
   private final ModeSetting O000000000O0O0 = new ModeSetting(
      "Броня", "Копировать", "Копировать", "Без брони", "Кожаная", "Кольчужная", "Золотая", "Железная", "Алмазная", "Незеритовая"
   );
   private final BooleanSetting O000000000O0OO = new BooleanSetting("Снятие тотемов", true);
   private final ModeSetting O000000000OO = new ModeSetting("Поведение", "Манекен", "Манекен", "Подвижный");
   private final NumberSetting O000000000OO0 = new NumberSetting("Активность", 1.0F, 0.3F, 1.5F, 0.05F, false)
      .O00000000(() -> !this.O000000000OO.O000000000("Подвижный"));
   private final BooleanSetting O000000000OO00 = new BooleanSetting("Прыжки", true).O00000000(() -> !this.O000000000OO.O000000000("Подвижный"));
   private final BooleanSetting O000000000OO0O = new BooleanSetting("Замахи", true).O00000000(() -> !this.O000000000OO.O000000000("Подвижный"));
   private FakePlayer.W126 O000000000OOO;
   private ClientWorld O000000000OOO0;
   private int O000000000OOOO;
   private String O00000000O;
   private double O00000000O0;
   private double O00000000O00;
   private double O00000000O000;
   private int O00000000O0000 = 1;
   private int O00000000O000O;
   private double O00000000O00O = 3.0;
   private int O00000000O00O0;
   private int O00000000O00OO;
   private int O00000000O0O;
   private int O00000000O0O0;

   public FakePlayer() {
      this.O00000000(new Setting[]{this.O000000000OO, this.O000000000OO0, this.O000000000OO00, this.O000000000OO0O, this.O000000000O0O0, this.O000000000O0OO});
   }

   @Override
   public void O00000000() {
      this.O0000000000O00();
      super.O00000000();
   }

   @Override
   public void O000000000() {
      this.O0000000000OOO();
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player == null || O0000000000.world == null) {
         this.O0000000000OOO();
      } else if (this.O000000000OOO != null && !this.O000000000OOO.isRemoved() && this.O000000000OOO0 == O0000000000.world) {
         if (!this.O000000000O0O0.O0000000000().equals(this.O00000000O)) {
            this.O0000000000(this.O000000000OOO);
         }

         this.O0000000000OO0();
         if (this.O000000000OOOO > 0) {
            this.O000000000OOOO--;
         } else if (this.O000000000OOO.getHealth() < this.O000000000OOO.getMaxHealth()) {
            this.O000000000OOO.heal(0.1F);
         }
      } else {
         this.O0000000000O00();
      }
   }

   void O00000000(FakePlayer.W126 o00000000) {
      if (o00000000 == this.O000000000OOO && O0000000000.player != null && O0000000000.world != null) {
         if (!this.O000000000OO.O000000000("Подвижный")) {
            this.O00000000O0 = 0.0;
            this.O00000000O000 = 0.0;
            o00000000.setSprinting(false);
            if (o00000000.isOnGround()) {
               this.O00000000O00 = 0.0;
               o00000000.setVelocity(Vec3d.ZERO);
            } else {
               this.O00000000O00 = (this.O00000000O00 - 0.08) * 0.98;
               o00000000.move(MovementType.SELF, new Vec3d(0.0, this.O00000000O00, 0.0));
               o00000000.setVelocity(0.0, o00000000.getY() - o00000000.lastY, 0.0);
            }
         } else {
            ThreadLocalRandom var2 = ThreadLocalRandom.current();
            double var3 = O0000000000.player.getX() - o00000000.getX();
            double var5 = O0000000000.player.getZ() - o00000000.getZ();
            double var7 = Math.hypot(var3, var5);
            if (!(o00000000.getY() < O0000000000.player.getY() - 24.0) && !(var7 > 16.0)) {
               float var36 = this.O000000000OO0.O0000000000();
               if (--this.O00000000O000O <= 0) {
                  this.O00000000O0000 = var2.nextBoolean() ? 1 : -1;
                  this.O00000000O000O = var2.nextInt(18, 60);
               }

               if (--this.O00000000O00O0 <= 0) {
                  this.O00000000O00O = var2.nextDouble(1.6, 4.4);
                  this.O00000000O00O0 = var2.nextInt(40, 110);
               }

               if (this.O00000000O0O0 > 0) {
                  this.O00000000O0O0--;
               } else if (var2.nextFloat() < 0.005F) {
                  this.O00000000O0O0 = var2.nextInt(6, 18);
               }

               double var10 = var7 < 1.0E-4 ? 0.0 : 1.0 / var7;
               double var12 = var3 * var10;
               double var14 = var5 * var10;
               double var16 = MathHelper.clamp((var7 - this.O00000000O00O) * 0.45, -1.0, 1.0);
               double var18 = var12 * var16 - var14 * this.O00000000O0000 * 0.9;
               double var20 = var14 * var16 + var12 * this.O00000000O0000 * 0.9;
               double var22 = Math.hypot(var18, var20);
               if (var22 > 1.0) {
                  var18 /= var22;
                  var20 /= var22;
               }

               double var24 = this.O00000000O0O0 > 0 ? 0.0 : 0.26 * var36;
               double var26 = o00000000.isOnGround() ? 0.3 : 0.1;
               this.O00000000O0 = this.O00000000O0 + (var18 * var24 - this.O00000000O0) * var26;
               this.O00000000O000 = this.O00000000O000 + (var20 * var24 - this.O00000000O000) * var26;
               if (this.O00000000O00OO > 0) {
                  this.O00000000O00OO--;
               }

               if (o00000000.isOnGround()) {
                  this.O00000000O00 = -0.0784;
                  if (this.O000000000OO00.O0000000000() && this.O00000000O00OO == 0 && (o00000000.horizontalCollision || var2.nextFloat() < 0.035F * var36)) {
                     this.O00000000O00 = 0.42;
                     this.O00000000O00OO = var2.nextInt(25, 70);
                  }
               } else {
                  this.O00000000O00 = (this.O00000000O00 - 0.08) * 0.98;
               }

               o00000000.setSprinting(Math.hypot(this.O00000000O0, this.O00000000O000) > 0.18);
               o00000000.move(MovementType.SELF, new Vec3d(this.O00000000O0, this.O00000000O00, this.O00000000O000));
               o00000000.setVelocity(o00000000.getX() - o00000000.lastX, o00000000.getY() - o00000000.lastY, o00000000.getZ() - o00000000.lastZ);
               float var28 = (float)Math.toDegrees(Math.atan2(-(O0000000000.player.getX() - o00000000.getX()), O0000000000.player.getZ() - o00000000.getZ()));
               double var29 = O0000000000.player.getX() - o00000000.getX();
               double var31 = O0000000000.player.getEyeY() - o00000000.getEyeY();
               double var33 = O0000000000.player.getZ() - o00000000.getZ();
               float var35 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var31, Math.hypot(var29, var33))), -60.0, 60.0);
               o00000000.headYaw = o00000000.headYaw + MathHelper.clamp(MathHelper.wrapDegrees(var28 - o00000000.headYaw), -30.0F, 30.0F);
               o00000000.setYaw(o00000000.headYaw);
               o00000000.setPitch(o00000000.getPitch() + MathHelper.clamp(var35 - o00000000.getPitch(), -15.0F, 15.0F));
               if (this.O00000000O0O > 0) {
                  this.O00000000O0O--;
               }

               if (this.O000000000OO0O.O0000000000() && this.O00000000O0O == 0 && var7 < 3.2 && var2.nextFloat() < 0.3F) {
                  o00000000.swingHand(Hand.MAIN_HAND);
                  this.O00000000O0O = var2.nextInt(11, 22);
               }
            } else {
               double var9 = var2.nextDouble(0.0, Math.PI * 2);
               o00000000.refreshPositionAndAngles(
                  O0000000000.player.getX() + Math.cos(var9) * 3.0,
                  O0000000000.player.getY(),
                  O0000000000.player.getZ() + Math.sin(var9) * 3.0,
                  o00000000.getYaw(),
                  0.0F
               );
               this.O00000000O0 = 0.0;
               this.O00000000O00 = 0.0;
               this.O00000000O000 = 0.0;
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000O o0000000O000O) {
      this.O0000000000OOO();
   }

   public static boolean O00000000(Entity entity) {
      FakePlayer var1 = O0000000000O0();
      return var1 != null && var1.O0000000000(entity);
   }

   public static boolean O000000000(Entity entity) {
      FakePlayer var1 = O0000000000O0();
      return var1 != null && entity == var1.O000000000OOO;
   }

   static FakePlayer O0000000000O0() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         FakePlayer var0 = WildClient.O00000000.O000000000.O00000000(FakePlayer.class);
         return var0 != null && var0.O0000000000000 ? var0 : null;
      } else {
         return null;
      }
   }

   private void O0000000000O00() {
      this.O0000000000OOO();
      if (O0000000000.player != null && O0000000000.world != null) {
         GameProfile var1 = new GameProfile(O000000000O, "WildBot");
         var1.getProperties().putAll(O0000000000.player.getGameProfile().getProperties());
         SkinTextures var2 = O0000000000.player.getSkinTextures();
         FakePlayer.W126 var3 = new FakePlayer.W126(O0000000000.world, var1, var2);
         var3.setId(this.O00000000(O0000000000.world));
         Vec3d var4 = O0000000000.player.getRotationVec(1.0F);
         Vec3d var5 = new Vec3d(var4.x, 0.0, var4.z);
         if (var5.lengthSquared() < 1.0E-6) {
            var5 = new Vec3d(0.0, 0.0, 1.0);
         } else {
            var5 = var5.normalize();
         }

         double var6 = O0000000000.player.getX() + var5.x * 2.5;
         double var8 = O0000000000.player.getY();
         double var10 = O0000000000.player.getZ() + var5.z * 2.5;
         float var12 = O0000000000.player.getYaw() + 180.0F;
         var3.refreshPositionAndAngles(var6, var8, var10, var12, 0.0F);
         var3.bodyYaw = var12;
         var3.headYaw = var12;
         var3.lastBodyYaw = var12;
         var3.lastHeadYaw = var12;
         var3.setOnGround(true);
         this.O000000000(var3);
         var3.setHealth(var3.getMaxHealth());
         O0000000000.world.addEntity(var3);
         this.O000000000OOO = var3;
         this.O000000000OOO0 = O0000000000.world;
         this.O000000000OOOO = 0;
         this.O00000000O0 = 0.0;
         this.O00000000O00 = 0.0;
         this.O00000000O000 = 0.0;
         this.O00000000O000O = 0;
         this.O00000000O00O0 = 0;
         this.O00000000O00OO = 0;
         this.O00000000O0O = 0;
         this.O00000000O0O0 = 0;
      }
   }

   private void O000000000(FakePlayer.W126 o00000000) {
      this.O0000000000(o00000000);
      o00000000.equipStack(EquipmentSlot.MAINHAND, O0000000000.player.getMainHandStack().copy());
      o00000000.setStackInHand(Hand.OFF_HAND, new ItemStack(Items.TOTEM_OF_UNDYING));
   }

   private void O0000000000(FakePlayer.W126 o00000000) {
      String var2 = this.O000000000O0O0.O0000000000();
      switch (var2) {
         case "Без брони":
            this.O00000000(o00000000, null, null, null, null);
            break;
         case "Кожаная":
            this.O00000000(o00000000, Items.LEATHER_HELMET, Items.LEATHER_CHESTPLATE, Items.LEATHER_LEGGINGS, Items.LEATHER_BOOTS);
            break;
         case "Кольчужная":
            this.O00000000(o00000000, Items.CHAINMAIL_HELMET, Items.CHAINMAIL_CHESTPLATE, Items.CHAINMAIL_LEGGINGS, Items.CHAINMAIL_BOOTS);
            break;
         case "Золотая":
            this.O00000000(o00000000, Items.GOLDEN_HELMET, Items.GOLDEN_CHESTPLATE, Items.GOLDEN_LEGGINGS, Items.GOLDEN_BOOTS);
            break;
         case "Железная":
            this.O00000000(o00000000, Items.IRON_HELMET, Items.IRON_CHESTPLATE, Items.IRON_LEGGINGS, Items.IRON_BOOTS);
            break;
         case "Алмазная":
            this.O00000000(o00000000, Items.DIAMOND_HELMET, Items.DIAMOND_CHESTPLATE, Items.DIAMOND_LEGGINGS, Items.DIAMOND_BOOTS);
            break;
         case "Незеритовая":
            this.O00000000(o00000000, Items.NETHERITE_HELMET, Items.NETHERITE_CHESTPLATE, Items.NETHERITE_LEGGINGS, Items.NETHERITE_BOOTS);
            break;
         default:
            o00000000.equipStack(EquipmentSlot.HEAD, O0000000000.player.getEquippedStack(EquipmentSlot.HEAD).copy());
            o00000000.equipStack(EquipmentSlot.CHEST, O0000000000.player.getEquippedStack(EquipmentSlot.CHEST).copy());
            o00000000.equipStack(EquipmentSlot.LEGS, O0000000000.player.getEquippedStack(EquipmentSlot.LEGS).copy());
            o00000000.equipStack(EquipmentSlot.FEET, O0000000000.player.getEquippedStack(EquipmentSlot.FEET).copy());
      }

      this.O00000000O = this.O000000000O0O0.O0000000000();
   }

   private void O00000000(FakePlayer.W126 o00000000, Item item, Item item2, Item item3, Item item4) {
      o00000000.equipStack(EquipmentSlot.HEAD, this.O00000000(item));
      o00000000.equipStack(EquipmentSlot.CHEST, this.O00000000(item2));
      o00000000.equipStack(EquipmentSlot.LEGS, this.O00000000(item3));
      o00000000.equipStack(EquipmentSlot.FEET, this.O00000000(item4));
   }

   private ItemStack O00000000(Item item) {
      return item == null ? ItemStack.EMPTY : new ItemStack(item);
   }

   private boolean O0000000000(Entity entity) {
      if (entity == this.O000000000OOO
         && this.O000000000OOO != null
         && !this.O000000000OOO.isRemoved()
         && O0000000000.player != null
         && O0000000000.world != null) {
         float var2 = O0000000000.player.getAttackCooldownProgress(0.5F);
         boolean var3 = var2 > 0.9F
            && O0000000000.player.fallDistance > 0.0
            && !O0000000000.player.isOnGround()
            && !O0000000000.player.isClimbing()
            && !O0000000000.player.isTouchingWater()
            && !O0000000000.player.hasStatusEffect(StatusEffects.BLINDNESS)
            && !O0000000000.player.hasVehicle()
            && !O0000000000.player.isSprinting();
         float var4 = 0.5F * (var3 ? 1.5F : 1.0F);
         this.O000000000OOOO = 20;
         O0000000000.player.resetLastAttackedTicks();
         this.O000000000OOO.animateDamage(O0000000000.player.getYaw());
         this.O00000000(var3, var2);
         this.O0000000000(var3);
         if (!this.O000000000O0OO.O0000000000()) {
            this.O000000000OOO.setHealth(this.O000000000OOO.getMaxHealth());
            this.O000000000OOO.setAbsorptionAmount(0.0F);
            this.O000000000OOOO = 0;
            return true;
         } else {
            float var5 = Math.max(0.0F, var4);
            float var6 = Math.min(this.O000000000OOO.getAbsorptionAmount(), var5);
            if (var6 > 0.0F) {
               this.O000000000OOO.setAbsorptionAmount(this.O000000000OOO.getAbsorptionAmount() - var6);
               var5 -= var6;
            }

            float var7 = this.O000000000OOO.getHealth() - var5;
            if (var7 <= 0.0F) {
               this.O0000000000O0O();
            } else {
               this.O000000000OOO.setHealth(var7);
               O0000000000.world
                  .playSoundClient(
                     this.O000000000OOO.getX(),
                     this.O000000000OOO.getY(),
                     this.O000000000OOO.getZ(),
                     SoundEvents.ENTITY_PLAYER_HURT,
                     SoundCategory.PLAYERS,
                     1.0F,
                     1.0F,
                     false
                  );
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private void O00000000(boolean bl, float f) {
      O0000000000.world
         .playSoundClient(
            O0000000000.player.getX(),
            O0000000000.player.getY(),
            O0000000000.player.getZ(),
            bl ? SoundEvents.ENTITY_PLAYER_ATTACK_CRIT : (f > 0.9F ? SoundEvents.ENTITY_PLAYER_ATTACK_STRONG : SoundEvents.ENTITY_PLAYER_ATTACK_WEAK),
            SoundCategory.PLAYERS,
            1.0F,
            1.0F,
            false
         );
   }

   private void O0000000000(boolean bl) {
      ThreadLocalRandom var2 = ThreadLocalRandom.current();
      int var3 = bl ? 18 : 7;

      for (int var4 = 0; var4 < var3; var4++) {
         double var5 = this.O000000000OOO.getX() + var2.nextDouble(-0.32, 0.32);
         double var7 = this.O000000000OOO.getBodyY(var2.nextDouble(0.25, 0.85));
         double var9 = this.O000000000OOO.getZ() + var2.nextDouble(-0.32, 0.32);
         double var11 = var2.nextDouble(-0.35, 0.35);
         double var13 = var2.nextDouble(0.05, 0.45);
         double var15 = var2.nextDouble(-0.35, 0.35);
         this.O00000000(ParticleTypes.CRIT, var5, var7, var9, var11, var13, var15);
      }

      for (int var17 = 0; var17 < 4; var17++) {
         this.O00000000(
            ParticleTypes.DAMAGE_INDICATOR,
            this.O000000000OOO.getX() + var2.nextDouble(-0.2, 0.2),
            this.O000000000OOO.getBodyY(var2.nextDouble(0.35, 0.75)),
            this.O000000000OOO.getZ() + var2.nextDouble(-0.2, 0.2),
            var2.nextDouble(-0.08, 0.08),
            var2.nextDouble(0.05, 0.18),
            var2.nextDouble(-0.08, 0.08)
         );
      }

      if (O0000000000.player.getMainHandStack().hasEnchantments()) {
         for (int var18 = 0; var18 < 12; var18++) {
            this.O00000000(
               ParticleTypes.ENCHANTED_HIT,
               this.O000000000OOO.getX() + var2.nextDouble(-0.35, 0.35),
               this.O000000000OOO.getBodyY(var2.nextDouble(0.2, 0.9)),
               this.O000000000OOO.getZ() + var2.nextDouble(-0.35, 0.35),
               var2.nextDouble(-0.45, 0.45),
               var2.nextDouble(0.05, 0.5),
               var2.nextDouble(-0.45, 0.45)
            );
         }
      }
   }

   private void O0000000000O0O() {
      ItemStack var1 = new ItemStack(Items.TOTEM_OF_UNDYING);
      this.O000000000OOO.setHealth(1.0F);
      this.O000000000OOO.deathTime = 0;
      DeathProtectionComponent var2 = (DeathProtectionComponent)var1.get(DataComponentTypes.DEATH_PROTECTION);
      if (var2 != null) {
         var2.applyDeathEffects(var1, this.O000000000OOO);
      }

      this.O000000000OOOO = 20;
      this.O0000000000OO0();
      this.O0000000000OO();
      O0000000000.world
         .playSoundClient(
            this.O000000000OOO.getX(),
            this.O000000000OOO.getY(),
            this.O000000000OOO.getZ(),
            SoundEvents.ITEM_TOTEM_USE,
            SoundCategory.PLAYERS,
            1.0F,
            1.0F,
            false
         );
   }

   private void O0000000000OO() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();

      for (int var2 = 0; var2 < 72; var2++) {
         double var3 = var1.nextDouble(0.0, Math.PI * 2);
         double var5 = var1.nextDouble(0.05, 0.48);
         double var7 = this.O000000000OOO.getX() + Math.cos(var3) * var5;
         double var9 = this.O000000000OOO.getBodyY(var1.nextDouble(0.05, 0.95));
         double var11 = this.O000000000OOO.getZ() + Math.sin(var3) * var5;
         double var13 = var1.nextDouble(0.12, 0.65);
         double var15 = Math.cos(var3) * var13 + var1.nextDouble(-0.12, 0.12);
         double var17 = var1.nextDouble(0.15, 0.85);
         double var19 = Math.sin(var3) * var13 + var1.nextDouble(-0.12, 0.12);
         this.O00000000(ParticleTypes.TOTEM_OF_UNDYING, var7, var9, var11, var15, var17, var19);
      }
   }

   private void O00000000(ParticleEffect particleEffect, double d, double e, double f, double g, double h, double i) {
      O0000000000.world.addParticleClient(particleEffect, true, true, d, e, f, g, h, i);
   }

   private void O0000000000OO0() {
      if (this.O000000000OOO != null) {
         if (!this.O000000000O0OO.O0000000000()) {
            if (!this.O000000000OOO.getOffHandStack().isEmpty()) {
               this.O000000000OOO.setStackInHand(Hand.OFF_HAND, ItemStack.EMPTY);
            }

            this.O000000000OOO.setHealth(this.O000000000OOO.getMaxHealth());
            this.O000000000OOO.setAbsorptionAmount(0.0F);
         } else {
            if (!this.O000000000OOO.getOffHandStack().isOf(Items.TOTEM_OF_UNDYING)) {
               this.O000000000OOO.setStackInHand(Hand.OFF_HAND, new ItemStack(Items.TOTEM_OF_UNDYING));
            }
         }
      }
   }

   private int O00000000(ClientWorld clientWorld) {
      int var2 = -1337;

      while (clientWorld.getEntityById(var2) != null) {
         var2--;
      }

      return var2;
   }

   private void O0000000000OOO() {
      if (this.O000000000OOO != null && this.O000000000OOO0 != null) {
         this.O000000000OOO0.removeEntity(this.O000000000OOO.getId(), RemovalReason.DISCARDED);
      }

      this.O000000000OOO = null;
      this.O000000000OOO0 = null;
      this.O000000000OOOO = 0;
      this.O00000000O = null;
   }

   static final class W126 extends OtherClientPlayerEntity {
      private final SkinTextures O00000000;

      W126(ClientWorld clientWorld, GameProfile gameProfile, SkinTextures skinTextures) {
         super(clientWorld, gameProfile);
         this.O00000000 = skinTextures;
      }

      public void tick() {
         FakePlayer var1 = FakePlayer.O0000000000O0();
         if (var1 != null) {
            var1.O00000000(this);
         }

         super.tick();
      }

      public SkinTextures getSkinTextures() {
         return this.O00000000 != null ? this.O00000000 : super.getSkinTextures();
      }
   }
}
