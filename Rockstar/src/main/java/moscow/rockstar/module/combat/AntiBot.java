package moscow.rockstar.module.combat;

import com.mojang.authlib.GameProfile;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.network.ReceivePacketEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.ModeSetting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Action;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Entry;

@ModuleInfo(name = "Anti Bot", category = ModuleCategory.COMBAT, desc = "Помечает ботов созданных анти читом")
public class AntiBot extends BaseModule {
   private final ModeSetting modeSetting = new ModeSetting(this, "Мод");
   private final ModeSetting.Value rw = new ModeSetting.Value(this.modeSetting, "RW");
   private final ModeSetting.Value defaults = new ModeSetting.Value(this.modeSetting, "Default");
   private final BooleanSetting removeFromWorld = new BooleanSetting(this, "modules.settings.anti_bot.remove_from_world");
   private final Set<UUID> bots = Collections.newSetFromMap(new ConcurrentHashMap<>());
   private final Set<UUID> warnPlayers = ConcurrentHashMap.newKeySet();
   private final Set<UUID> removedFromWorld = ConcurrentHashMap.newKeySet();
   private final EventListener<ReceivePacketEvent> onPacket = event -> {
      if (event.getPacket() instanceof PlayerListS2CPacket packet && this.rw.isSelected()) {
         if (packet.getActions().contains(Action.ADD_PLAYER)) {
            for (Entry entry : packet.getEntries()) {
               GameProfile profile = entry.profile();
               if (!this.warnPlayers.contains(profile.getId())
                  && !this.bots.contains(profile.getId())
                  && profile.getProperties().isEmpty()
                  && entry.latency() != 0) {
                  this.warnPlayers.add(profile.getId());
               }
            }
         }
      }
   };

   @Override
   public void onDisable() {
      this.bots.clear();
      this.removedFromWorld.clear();
      super.onDisable();
   }

   @Override
   public void tick() {
      if (mc.world != null && mc.player != null) {
         if (this.rw.isSelected()) {
            this.checkPlayersForFakes();
            this.checkWarnedPlayers();
            this.cleanupBots();
         } else {
            for (PlayerEntity player : mc.world.getPlayers()) {
               if (player.getHealth() <= 0.0F || player.noClip) {
                  this.bots.add(player.getUuid());
               }
            }
         }

         if (this.removeFromWorld.isEnabled()) {
            this.removeDetectedBots();
         }

         super.tick();
      }
   }

   private void removeDetectedBots() {
      for (UUID uuid : this.bots) {
         if (this.removedFromWorld.contains(uuid)) {
            continue;
         }
         PlayerEntity player = mc.world.getPlayerByUuid(uuid);
         if (player == null || player == mc.player) {
            continue;
         }
         mc.world.removeEntity(player.getId(), RemovalReason.DISCARDED);
         this.removedFromWorld.add(uuid);
      }
   }

   private void checkPlayersForFakes() {
      Entity currentTarget = Rockstar.getInstance().getTargetManager().getCurrentTarget();

      for (PlayerEntity player : mc.world.getPlayers()) {
         if (!this.isInvalidPlayer(player) && this.isSuspiciousTargetFake(player, currentTarget) && player.age < 30) {
            this.bots.add(player.getUuid());
         }
      }
   }

   private void checkWarnedPlayers() {
      for (UUID uuid : this.warnPlayers) {
         PlayerEntity player = mc.world.getPlayerByUuid(uuid);
         if (player != null && (this.hasFullArmor(player) || this.hasSuspiciousUUID(player))) {
            this.bots.add(player.getUuid());
         }
      }
   }

   private void cleanupBots() {
      if (mc.player.age % 100 == 0) {
         this.bots.removeIf(uuid -> mc.world.getPlayerByUuid(uuid) == null);
      }
   }

   private boolean isInvalidPlayer(PlayerEntity player) {
      return player == mc.player || this.bots.contains(player.getUuid());
   }

   private boolean isSuspiciousTargetFake(PlayerEntity player, Entity target) {
      if (!(target instanceof PlayerEntity realTarget)) {
         return false;
      } else {
         boolean sameIdentity = player.getGameProfile().getName().equals(realTarget.getGameProfile().getName()) || player.getId() == realTarget.getId();
         return sameIdentity && !player.getInventory().equals(realTarget.getInventory());
      }
   }

   private boolean hasFullArmor(PlayerEntity player) {
      int armorCount = 0;

      for (ItemStack stack : player.getArmorItems()) {
         if (!stack.isEmpty()) {
            armorCount++;
         }
      }

      return armorCount == 4;
   }

   private boolean hasSuspiciousUUID(PlayerEntity player) {
      try {
         UUID nameAsUUID = UUID.fromString(player.getGameProfile().getName());
         return !player.getUuid().equals(nameAsUUID);
      } catch (IllegalArgumentException var3) {
         return false;
      }
   }

   public boolean isRWBot(PlayerEntity player) {
      return this.bots.contains(player.getUuid());
   }
}
