package ru.destra.module;

import com.google.common.eventbus.Subscribe;
import com.mojang.authlib.GameProfile;
import java.util.Objects;
import java.util.UUID;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.AttributeModifiersComponent.Entry;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import ru.destra.core.DestraClient;
import ru.destra.core.Module;
import ru.destra.core.ModuleCategory;
import ru.destra.event.LivingEntityEvent;
import ru.destra.event.MotionTickEvent;
import ru.destra.event.PacketDirection;
import ru.destra.event.PacketEvent;
import ru.destra.event.PlayerCheckEvent;
import ru.destra.misc.FakePlayerEntity;
import ru.destra.setting.BooleanSetting;
import sg.mx.PlayerInteractEntityC2SPacketAccessor;

public class FakePlayerModule extends Module {
   BooleanSetting autoTotemSetting;
   private static final int ENTITY_ID_BASE = 0;
   private int fakeEntityId;
   public FakePlayerEntity fakePlayer;
   public Vec3d spawnPos;
   public boolean positionDirty;
   public float spawnYaw;
   public float spawnPitch;
   private int attackCooldownTicks;
   private int healTickCounter;
   private boolean prevAttackKeyPressed;
   private float currentHealth;
   private UUID ownerUuid;
   private Object spawnWorldKey;
   private static final String MODULE_NAME = "FakePlayer";
   private static final String MODULE_DESCRIPTION = "Добавляет в мир фейкового игрока";
   private static final String AUTO_TOTEM_LABEL = "Авто-тотем";
   private static final int DEFAULT_ENTITY_ID_SENTINEL = 52148852;
   private static final float INITIAL_HEALTH = 20.0F;
   private static final float MAX_HEALTH_REGEN_THRESHOLD = 20.0F;
   private static final float MAX_HEALTH_CAP = 20.0F;
   private static final float HEALTH_RESET_ON_ENABLE = 20.0F;
   private static final String FAKE_UUID_SEED_STRING = "52148852";
   private static final String FAKE_PLAYER_USERNAME = "FakePlayer";
   private static final float SPAWN_HEALTH = 20.0F;
   private static final float SPAWN_ENTITY_HEALTH = 20.0F;
   private static final double MAX_HEALTH_ATTRIBUTE_VALUE = 20.0;
   private static final int ENTITY_ID_MIN = -1000000;
   private static final double ENTITY_ID_RANGE = 1000000.0;
   private static final float CRIT_DAMAGE_MULTIPLIER = 1.5F;
   private static final double CRIT_PARTICLE_X_HALF = 0.5;
   private static final double CRIT_PARTICLE_X_SPREAD = 0.8;
   private static final double CRIT_PARTICLE_Y_SPREAD = 0.8;
   private static final double CRIT_PARTICLE_Z_HALF = 0.5;
   private static final double CRIT_PARTICLE_Z_SPREAD = 0.8;
   private static final double CRIT_PARTICLE_HEIGHT_FRACTION = 0.5;
   private static final double CRIT_PARTICLE_VX_SCALE = 0.5;
   private static final double CRIT_PARTICLE_VY_SCALE = 0.5;
   private static final double CRIT_PARTICLE_VY_BASE = 0.1;
   private static final double CRIT_PARTICLE_VZ_SCALE = 0.5;
   private static final float CRIT_SOUND_PITCH = 1.2F;
   private static final float STRENGTH_DAMAGE_BONUS_PER_LEVEL = 3.0F;
   private static final float WEAKNESS_DAMAGE_PENALTY_PER_LEVEL = 4.0F;
   private static final float MIN_ATTACK_DAMAGE = 0.5F;
   private static final float NETHERITE_SWORD_DAMAGE = 8.0F;
   private static final float DIAMOND_SWORD_DAMAGE = 7.0F;
   private static final float IRON_SWORD_DAMAGE = 6.0F;
   private static final float STONE_SWORD_DAMAGE = 5.0F;
   private static final float WOOD_GOLD_SWORD_DAMAGE = 4.0F;
   private static final float NETHERITE_AXE_DAMAGE = 10.0F;
   private static final float DIAMOND_AXE_DAMAGE = 9.0F;
   private static final float IRON_AXE_DAMAGE = 8.0F;
   private static final float STONE_AXE_DAMAGE = 7.0F;
   private static final float WOOD_GOLD_AXE_DAMAGE = 6.0F;
   private static final float TRIDENT_DAMAGE = 9.0F;
   private static final float NETHERITE_PICKAXE_DAMAGE = 6.0F;
   private static final float DIAMOND_PICKAXE_DAMAGE = 5.0F;
   private static final float IRON_PICKAXE_DAMAGE = 4.0F;
   private static final float STONE_PICKAXE_DAMAGE = 3.0F;
   private static final double TWO_PI_A = Math.PI;
   private static final double TWO_PI_FACTOR_A = 2.0;
   private static final double TWO_PI_B = Math.PI;
   private static final double TWO_PI_FACTOR_B = 2.0;
   private static final double TOTEM_PARTICLE_SPEED_MIN = 0.3;
   private static final double TOTEM_PARTICLE_SPEED_RANGE = 0.5;
   private static final double TOTEM_PARTICLE_VY_BASE = 0.2;
   private static final double TOTEM_PARTICLE_X_HALF = 0.5;
   private static final double TOTEM_PARTICLE_X_SPREAD = 0.8;
   private static final double TOTEM_PARTICLE_HEIGHT_FRACTION = 0.5;
   private static final double TOTEM_PARTICLE_Y_HALF = 0.5;
   private static final double TOTEM_PARTICLE_Y_SPREAD = 0.5;
   private static final double TOTEM_PARTICLE_Z_HALF = 0.5;
   private static final double TOTEM_PARTICLE_Z_SPREAD = 0.8;
   private static final double DEATH_PARTICLE_X_HALF = 0.5;
   private static final double DEATH_PARTICLE_X_SPREAD = 0.8;
   private static final double DEATH_PARTICLE_Y_SPREAD = 1.8;
   private static final double DEATH_PARTICLE_Z_HALF = 0.5;
   private static final double DEATH_PARTICLE_Z_SPREAD = 0.8;
   private static final double DEATH_PARTICLE_VX_HALF = 0.5;
   private static final double DEATH_PARTICLE_VX_SCALE = 0.3;
   private static final double DEATH_PARTICLE_VY_SCALE = 0.2;
   private static final double DEATH_PARTICLE_VZ_HALF = 0.5;
   private static final double DEATH_PARTICLE_VZ_SCALE = 0.3;
   private static final float HEALTH_RESET_VALUE = 20.0F;
   private static final int ENTITY_ID_SENTINEL_RESET = 52148852;

   public FakePlayerModule() {
      super(MODULE_NAME, ModuleCategory.Utility, MODULE_DESCRIPTION);
      this.autoTotemSetting = new BooleanSetting(AUTO_TOTEM_LABEL, this, true);
      this.fakeEntityId = DEFAULT_ENTITY_ID_SENTINEL;
      this.spawnPos = null;
      this.positionDirty = false;
      this.attackCooldownTicks = 0;
      this.healTickCounter = 0;
      this.prevAttackKeyPressed = false;
      this.currentHealth = INITIAL_HEALTH;
   }

   private float getItemAttackDamage(Item var1) {
      AttributeModifiersComponent var2 = (AttributeModifiersComponent)var1.getComponents().get(DataComponentTypes.ATTRIBUTE_MODIFIERS);
      if (var2 != null) {
         for (Entry var4 : var2.modifiers()) {
            if (var4.attribute() == EntityAttributes.ATTACK_DAMAGE) {
               return (float)var4.modifier().value();
            }
         }
      }

      return this.getItemBaseDamage(var1);
   }

   @Override
   public void clear() {}

   @Override
   public net.minecraft.text.Text getName() {
      return net.minecraft.text.Text.of(MODULE_NAME);
   }

   @Override public int size() { return 0; }
   @Override public boolean isEmpty() { return true; }
   @Override public ItemStack getStack(int slot) { return ItemStack.EMPTY; }
   @Override public ItemStack removeStack(int slot, int amount) { return ItemStack.EMPTY; }
   @Override public ItemStack removeStack(int slot) { return ItemStack.EMPTY; }
   @Override public void setStack(int slot, ItemStack stack) {}
   @Override public void markDirty() {}
   @Override public boolean canPlayerUse(net.minecraft.entity.player.PlayerEntity player) { return true; }

   @Override
   public void enable(boolean var1) {
      MinecraftClient client = MinecraftClient.getInstance();
      if (client.player != null && client.world != null) {
         this.spawnPos = client.player.getPos();
         this.spawnYaw = client.player.getYaw();
         this.spawnPitch = client.player.getPitch();
         this.spawnFakePlayer();
      }

      super.enable(var1);
      this.attackCooldownTicks = 0;
      this.healTickCounter = 0;
      this.currentHealth = HEALTH_RESET_ON_ENABLE;
      this.prevAttackKeyPressed = false;
   }

   private void applyDamage(float var1) {
      MinecraftClient client = MinecraftClient.getInstance();
      if (this.fakePlayer != null && client.world != null) {
         ItemStack var2 = this.fakePlayer.getOffHandStack();
         if (var2.getItem() == Items.TOTEM_OF_UNDYING && this.currentHealth - var1 <= 0.0F) {
            this.triggerTotemPop();
         } else {
            client.world.playSound(
               client.player,
               this.fakePlayer.getX(),
               this.fakePlayer.getY(),
               this.fakePlayer.getZ(),
               SoundEvents.ENTITY_PLAYER_HURT,
               SoundCategory.PLAYERS,
               1.0F,
               1.0F
            );
            this.currentHealth = Math.max(0.0F, this.currentHealth - var1);
            this.fakePlayer.setHealth(this.currentHealth);
         }
      }
   }

   @Subscribe
   public void onPacketEvent(PacketEvent var1) {
      if (var1.getDirection() == PacketDirection.Send && this.fakePlayer != null && this.fakePlayer.isAlive()) {
         Packet<?> var3 = var1.getPacket();
         if (var3 instanceof PlayerInteractEntityC2SPacket var2) {
            int var4 = ((PlayerInteractEntityC2SPacketAccessor)var2).getEntityId();
            if (var4 == this.fakeEntityId) {
               var1.enable();
            }
         }
      }
   }

   private boolean isFallingForCrit() {
      MinecraftClient client = MinecraftClient.getInstance();
      return client.player != null
         && client.player.fallDistance > 0.0F
         && !client.player.isOnGround()
         && !client.player.isClimbing()
         && !client.player.isTouchingWater()
         && !client.player.hasStatusEffect(StatusEffects.BLINDNESS)
         && client.player.getVelocity().y < 0.0
         && !client.player.hasVehicle();
   }

   private boolean isFakePlayerInvalid() {
      MinecraftClient client = MinecraftClient.getInstance();
      if (this.fakePlayer == null) {
         return false;
      } else {
         return client.player != null && client.world != null
            ? this.fakePlayer.getWorld() != client.world
               || this.ownerUuid != null && !this.ownerUuid.equals(client.player.getUuid())
               || this.spawnWorldKey != null && !Objects.equals(this.spawnWorldKey, client.world.getRegistryKey())
            : true;
      }
   }

   @Subscribe
   public void onMotionTick(MotionTickEvent var1) {
      MinecraftClient client = MinecraftClient.getInstance();
      if (this.isFakePlayerInvalid()) {
         this.handleInvalidState();
      } else {
         if (this.fakePlayer != null && client.player != null && this.fakePlayer.isAlive()) {
            if (this.attackCooldownTicks > 0) {
               this.attackCooldownTicks--;
            }

            this.healTickCounter++;
            if (this.healTickCounter >= 20 && this.currentHealth < MAX_HEALTH_REGEN_THRESHOLD && this.currentHealth > 0.0F) {
               this.healTickCounter = 0;
               this.currentHealth = Math.min(this.currentHealth + 1.0F, MAX_HEALTH_CAP);
               this.fakePlayer.setHealth(this.currentHealth);
            }

            if (this.fakePlayer.getHealth() != this.currentHealth) {
               this.fakePlayer.setHealth(this.currentHealth);
            }

            if (this.fakePlayer.getOffHandStack().getItem() != Items.TOTEM_OF_UNDYING && this.autoTotemSetting.isEnabled()) {
               this.fakePlayer.setStackInHand(Hand.OFF_HAND, new ItemStack(Items.TOTEM_OF_UNDYING));
            }

            if (!this.autoTotemSetting.isEnabled() && this.fakePlayer.getOffHandStack().getItem() == Items.TOTEM_OF_UNDYING) {
               this.fakePlayer.setStackInHand(Hand.OFF_HAND, ItemStack.EMPTY);
            }

            boolean var2 = client.options.attackKey.isPressed();
            if (client.crosshairTarget instanceof EntityHitResult hitResult
               && hitResult.getEntity() == this.fakePlayer
               && this.attackCooldownTicks == 0
               && this.currentHealth > 0.0
               && var2
               && !this.prevAttackKeyPressed) {
               this.performAttack();
            }

            this.prevAttackKeyPressed = var2;
            if (this.currentHealth <= 0.0F) {
               this.onFakePlayerDeath();
            }
         }
      }
   }

   private float getItemBaseDamage(Item var1) {
      if (var1 == Items.NETHERITE_SWORD) {
         return NETHERITE_SWORD_DAMAGE;
      } else if (var1 == Items.DIAMOND_SWORD) {
         return DIAMOND_SWORD_DAMAGE;
      } else if (var1 == Items.IRON_SWORD) {
         return IRON_SWORD_DAMAGE;
      } else if (var1 == Items.STONE_SWORD) {
         return STONE_SWORD_DAMAGE;
      } else if (var1 == Items.WOODEN_SWORD || var1 == Items.GOLDEN_SWORD) {
         return WOOD_GOLD_SWORD_DAMAGE;
      } else if (var1 == Items.NETHERITE_AXE) {
         return NETHERITE_AXE_DAMAGE;
      } else if (var1 == Items.DIAMOND_AXE) {
         return DIAMOND_AXE_DAMAGE;
      } else if (var1 == Items.IRON_AXE) {
         return IRON_AXE_DAMAGE;
      } else if (var1 == Items.STONE_AXE) {
         return STONE_AXE_DAMAGE;
      } else if (var1 == Items.WOODEN_AXE || var1 == Items.GOLDEN_AXE) {
         return WOOD_GOLD_AXE_DAMAGE;
      } else if (var1 == Items.TRIDENT) {
         return TRIDENT_DAMAGE;
      } else if (var1 == Items.NETHERITE_PICKAXE) {
         return NETHERITE_PICKAXE_DAMAGE;
      } else if (var1 == Items.DIAMOND_PICKAXE) {
         return DIAMOND_PICKAXE_DAMAGE;
      } else if (var1 == Items.IRON_PICKAXE) {
         return IRON_PICKAXE_DAMAGE;
      } else if (var1 == Items.STONE_PICKAXE) {
         return STONE_PICKAXE_DAMAGE;
      } else {
         return var1 != Items.WOODEN_PICKAXE && var1 != Items.GOLDEN_PICKAXE ? 1.0F : 2.0F;
      }
   }

   private void triggerTotemPop() {
      MinecraftClient client = MinecraftClient.getInstance();
      if (this.fakePlayer != null && client.world != null) {
         ItemStack var1 = this.fakePlayer.getOffHandStack();
         if (var1.getItem() == Items.TOTEM_OF_UNDYING) {
            var1.decrement(1);
         }

         this.currentHealth = 1.0F;
         this.fakePlayer.setHealth(1.0F);
         this.fakePlayer.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 900, 1));
         this.fakePlayer.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 100, 1));
         this.fakePlayer.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 800, 0));
         this.resetFakePlayerState();
         DestraClient.getInstance().getEventBus().post(new PlayerCheckEvent(this.fakePlayer));
         client.world.playSound(
            client.player, this.fakePlayer.getX(), this.fakePlayer.getY(), this.fakePlayer.getZ(), SoundEvents.ITEM_TOTEM_USE, SoundCategory.PLAYERS, 1.0F, 1.0F
         );

         for (int var2 = 0; var2 < 50; var2++) {
            double var3 = Math.random() * TWO_PI_A * TWO_PI_FACTOR_A;
            double var5 = Math.random() * TWO_PI_B * TWO_PI_FACTOR_B;
            double var7 = TOTEM_PARTICLE_SPEED_MIN + Math.random() * TOTEM_PARTICLE_SPEED_RANGE;
            double var9 = Math.sin(var3) * Math.cos(var5) * var7;
            double var11 = Math.sin(var5) * var7 + TOTEM_PARTICLE_VY_BASE;
            double var13 = Math.cos(var3) * Math.cos(var5) * var7;
            client.world.addParticle(
               ParticleTypes.TOTEM_OF_UNDYING,
               this.fakePlayer.getX() + (Math.random() - TOTEM_PARTICLE_X_HALF) * TOTEM_PARTICLE_X_SPREAD,
               this.fakePlayer.getY()
                  + this.fakePlayer.getHeight() * TOTEM_PARTICLE_HEIGHT_FRACTION
                  + (Math.random() - TOTEM_PARTICLE_Y_HALF) * TOTEM_PARTICLE_Y_SPREAD,
               this.fakePlayer.getZ() + (Math.random() - TOTEM_PARTICLE_Z_HALF) * TOTEM_PARTICLE_Z_SPREAD,
               var9,
               var11,
               var13
            );
         }
      }
   }

   private void performAttack() {
      MinecraftClient client = MinecraftClient.getInstance();
      if (client.player != null && client.world != null && this.fakePlayer != null && this.fakePlayer.isAlive()) {
         float var1 = this.calculateAttackDamage();
         boolean var2 = this.isFallingForCrit();
         if (var2) {
            var1 *= CRIT_DAMAGE_MULTIPLIER;

            for (int var3 = 0; var3 < 15; var3++) {
               double var4 = (Math.random() - CRIT_PARTICLE_X_HALF) * CRIT_PARTICLE_X_SPREAD;
               double var6 = Math.random() * CRIT_PARTICLE_Y_SPREAD;
               double var8 = (Math.random() - CRIT_PARTICLE_Z_HALF) * CRIT_PARTICLE_Z_SPREAD;
               client.world.addParticle(
                  ParticleTypes.CRIT,
                  this.fakePlayer.getX() + var4,
                  this.fakePlayer.getY() + this.fakePlayer.getHeight() * CRIT_PARTICLE_HEIGHT_FRACTION + var6,
                  this.fakePlayer.getZ() + var8,
                  var4 * CRIT_PARTICLE_VX_SCALE,
                  var6 * CRIT_PARTICLE_VY_SCALE + CRIT_PARTICLE_VY_BASE,
                  var8 * CRIT_PARTICLE_VZ_SCALE
               );
            }

            client.world.playSound(
               client.player,
               this.fakePlayer.getX(),
               this.fakePlayer.getY(),
               this.fakePlayer.getZ(),
               SoundEvents.ENTITY_PLAYER_ATTACK_CRIT,
               SoundCategory.PLAYERS,
               1.0F,
               CRIT_SOUND_PITCH
            );
         } else {
            client.world.playSound(
               client.player,
               this.fakePlayer.getX(),
               this.fakePlayer.getY(),
               this.fakePlayer.getZ(),
               SoundEvents.ENTITY_PLAYER_ATTACK_STRONG,
               SoundCategory.PLAYERS,
               1.0F,
               1.0F
            );
         }

         this.applyDamage(var1);
         this.attackCooldownTicks = 10;
         this.fakePlayer.hurtTime = 10;
         this.fakePlayer.timeUntilRegen = 10;
      }
   }

   public void removeFakePlayer() {
      MinecraftClient client = MinecraftClient.getInstance();
      if (this.fakePlayer != null) {
         World var2 = this.fakePlayer.getWorld();
         if (var2 instanceof ClientWorld var1) {
            var1.removeEntity(this.fakePlayer.getId(), RemovalReason.DISCARDED);
         } else if (client.world != null) {
            client.world.removeEntity(this.fakePlayer.getId(), RemovalReason.DISCARDED);
         }

         this.fakePlayer = null;
      }

      this.currentHealth = HEALTH_RESET_VALUE;
      this.attackCooldownTicks = 0;
      this.fakeEntityId = ENTITY_ID_SENTINEL_RESET;
      this.ownerUuid = null;
      this.spawnWorldKey = null;
   }

   private void handleInvalidState() {
      this.removeFakePlayer();
      this.disable(true);
      this.prevAttackKeyPressed = false;
      this.spawnPos = null;
      this.positionDirty = false;
   }

   private void onFakePlayerDeath() {
      MinecraftClient client = MinecraftClient.getInstance();
      if (this.fakePlayer != null && client.world != null) {
         DestraClient var1 = DestraClient.getInstance();
         if (var1 != null && var1.getEventBus() != null) {
            var1.getEventBus().post(new LivingEntityEvent(this.fakePlayer));
         }

         client.world.playSound(
            client.player,
            this.fakePlayer.getX(),
            this.fakePlayer.getY(),
            this.fakePlayer.getZ(),
            SoundEvents.ENTITY_PLAYER_DEATH,
            SoundCategory.PLAYERS,
            1.0F,
            1.0F
         );

         for (int var2 = 0; var2 < 30; var2++) {
            client.world.addParticle(
               ParticleTypes.POOF,
               this.fakePlayer.getX() + (Math.random() - DEATH_PARTICLE_X_HALF) * DEATH_PARTICLE_X_SPREAD,
               this.fakePlayer.getY() + Math.random() * DEATH_PARTICLE_Y_SPREAD,
               this.fakePlayer.getZ() + (Math.random() - DEATH_PARTICLE_Z_HALF) * DEATH_PARTICLE_Z_SPREAD,
               (Math.random() - DEATH_PARTICLE_VX_HALF) * DEATH_PARTICLE_VX_SCALE,
               Math.random() * DEATH_PARTICLE_VY_SCALE,
               (Math.random() - DEATH_PARTICLE_VZ_HALF) * DEATH_PARTICLE_VZ_SCALE
            );
         }

         this.removeFakePlayer();
         this.disable(true);
      }
   }

   public void spawnFakePlayer() {
      MinecraftClient client = MinecraftClient.getInstance();
      if (client.player == null || client.world == null) return;
      this.fakePlayer = new FakePlayerEntity(client.world, new GameProfile(UUID.nameUUIDFromBytes(FAKE_UUID_SEED_STRING.getBytes()), FAKE_PLAYER_USERNAME));
      this.fakePlayer.copyFrom(client.player);
      this.fakePlayer.resetTransientUseState();
      this.fakePlayer.headYaw = client.player.headYaw;
      this.fakePlayer.bodyYaw = client.player.bodyYaw;
      this.fakePlayer.setPitch(client.player.getPitch());
      this.fakePlayer.setYaw(client.player.getYaw());
      this.fakePlayer.currentScreenHandler = client.player.currentScreenHandler;
      this.currentHealth = SPAWN_HEALTH;
      this.fakePlayer.setHealth(SPAWN_ENTITY_HEALTH);
      if (this.fakePlayer.getAttributeInstance(EntityAttributes.MAX_HEALTH) != null) {
         this.fakePlayer.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(MAX_HEALTH_ATTRIBUTE_VALUE);
      }
      this.fakePlayer.setInvulnerable(false);
      this.fakePlayer.setStackInHand(Hand.OFF_HAND, new ItemStack(Items.TOTEM_OF_UNDYING));
      this.resetFakePlayerState();
      this.fakeEntityId = ENTITY_ID_MIN - (int)(Math.random() * ENTITY_ID_RANGE);
      this.fakePlayer.setId(this.fakeEntityId);
      this.ownerUuid = client.player.getUuid();
      this.spawnWorldKey = client.world.getRegistryKey();
      client.world.addEntity(this.fakePlayer);
   }

   private void resetFakePlayerState() {
      if (this.fakePlayer != null) {
         this.fakePlayer.resetTransientUseState();
         this.fakePlayer.deathTime = 0;
         this.fakePlayer.hurtTime = 0;
         this.fakePlayer.timeUntilRegen = 0;
         this.fakePlayer.fallDistance = 0.0F;
         this.fakePlayer.setPose(EntityPose.STANDING);
         this.fakePlayer.setInvisible(false);
         this.fakePlayer.setVelocity(Vec3d.ZERO);
      }
   }

   @Override
   public void disable(boolean var1) {
      this.removeFakePlayer();
      super.disable(var1);
      this.prevAttackKeyPressed = false;
      this.spawnPos = null;
      this.positionDirty = false;
   }

   private float calculateAttackDamage() {
      MinecraftClient client = MinecraftClient.getInstance();
      if (client.player == null) return MIN_ATTACK_DAMAGE;
      ItemStack var1 = client.player.getMainHandStack();
      float var2 = this.getItemAttackDamage(var1.getItem());
      if (client.player.hasStatusEffect(StatusEffects.STRENGTH)) {
         int var3 = client.player.getStatusEffect(StatusEffects.STRENGTH).getAmplifier() + 1;
         var2 += STRENGTH_DAMAGE_BONUS_PER_LEVEL * var3;
      }

      if (client.player.hasStatusEffect(StatusEffects.WEAKNESS)) {
         int var4 = client.player.getStatusEffect(StatusEffects.WEAKNESS).getAmplifier() + 1;
         var2 -= WEAKNESS_DAMAGE_PENALTY_PER_LEVEL * var4;
      }

      return Math.max(MIN_ATTACK_DAMAGE, var2);
   }
}
