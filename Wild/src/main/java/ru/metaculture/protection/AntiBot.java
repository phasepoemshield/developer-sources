package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRemoveS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Action;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Entry;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AntiBot",
   O0000000000 = Category.Combat,
   O000000000 = "Убирает бота позади вас",
   O00000000000 = {O0000000OO0OOO.MATRIX, O0000000OO0OOO.GRIM}
)
public class AntiBot extends Module {
   public final ModeSetting O000000000O = new ModeSetting("Режим: ", "ALL", "ReallyWorld", "Matrix", "ALL");
   public static final Set<UUID> O000000000O0 = ConcurrentHashMap.newKeySet();
   private static final Set<UUID> O000000000O000 = ConcurrentHashMap.newKeySet();
   private final Set<UUID> O000000000O00O = ConcurrentHashMap.newKeySet();
   private final Map<UUID, List<ItemStack>> O000000000O0O = new ConcurrentHashMap<>();
   public static boolean O000000000O00 = false;

   public AntiBot() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @Override
   public void O00000000() {
      super.O00000000();
      O000000000O00 = true;
   }

   @Override
   public void O000000000() {
      O000000000O00 = false;
      O000000000O0.clear();
      O000000000O000.clear();
      this.O000000000O00O.clear();
      this.O000000000O0O.clear();
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.world != null && O0000000000.player != null) {
         this.O0000000000O0O();
         String var2 = this.O000000000O.O0000000000();
         if (!var2.equals("ReallyWorld") && !this.O000000000O00O.isEmpty()) {
            O0000000000.world
               .getPlayers()
               .stream()
               .filter(abstractClientPlayerEntity -> this.O000000000O00O.contains(abstractClientPlayerEntity.getUuid()))
               .forEach(this::O0000000000);
         }

         if (var2.equals("Matrix") || var2.equals("ALL")) {
            this.O0000000000O0();
         }

         if (var2.equals("ReallyWorld") || var2.equals("ALL")) {
            this.O0000000000O00();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O00000000000() instanceof PlayerListS2CPacket var2) {
         this.O00000000(var2);
      } else if (o0000000O000OO.O00000000000() instanceof PlayerRemoveS2CPacket var3) {
         this.O00000000(var3);
      }
   }

   private void O00000000(PlayerListS2CPacket playerListS2CPacket) {
      if (playerListS2CPacket.getActions().contains(Action.ADD_PLAYER)) {
         playerListS2CPacket.getEntries().forEach(entry -> {
            GameProfile var2 = entry.profile();
            if (var2 != null) {
               if (this.O00000000(entry, var2)) {
                  this.O00000000(var2.getId());
               } else {
                  UUID var3 = var2.getId();
                  if (this.O00000000(var2)) {
                     O000000000O0.add(var3);
                  } else {
                     this.O000000000O00O.add(var3);
                  }
               }
            }
         });
      }
   }

   private void O00000000(PlayerRemoveS2CPacket playerRemoveS2CPacket) {
      for (UUID var3 : playerRemoveS2CPacket.profileIds()) {
         this.O000000000O00O.remove(var3);
         O000000000O0.remove(var3);
         O000000000O000.remove(var3);
         this.O000000000O0O.remove(var3);
      }
   }

   private boolean O00000000(Entry entry, GameProfile gameProfile) {
      return O0000000000.player == null ? false : gameProfile.getId().equals(O0000000000.player.getUuid()) || entry.latency() > 0;
   }

   private boolean O00000000(GameProfile gameProfile) {
      return O0000000000.world == null
         ? false
         : O0000000000.world
            .getPlayers()
            .stream()
            .anyMatch(
               abstractClientPlayerEntity -> abstractClientPlayerEntity.getGameProfile().getName().equals(gameProfile.getName())
                  && !abstractClientPlayerEntity.getUuid().equals(gameProfile.getId())
            );
   }

   private List<ItemStack> O000000000(PlayerEntity playerEntity) {
      ArrayList var2 = new ArrayList(4);
      var2.add(playerEntity.getEquippedStack(EquipmentSlot.HEAD));
      var2.add(playerEntity.getEquippedStack(EquipmentSlot.CHEST));
      var2.add(playerEntity.getEquippedStack(EquipmentSlot.LEGS));
      var2.add(playerEntity.getEquippedStack(EquipmentSlot.FEET));
      return var2;
   }

   private void O0000000000(PlayerEntity playerEntity) {
      if (O00000000000(playerEntity)) {
         this.O000000000O00O.remove(playerEntity.getUuid());
         this.O000000000O0O.remove(playerEntity.getUuid());
      } else {
         List var2 = this.O000000000(playerEntity);
         List var3 = this.O000000000O0O.get(playerEntity.getUuid());
         if (!this.O00000000((List<ItemStack>)var2) && !this.O00000000(var2, var3)) {
            this.O000000000O0O.put(playerEntity.getUuid(), var2);
         } else {
            O000000000O0.add(playerEntity.getUuid());
            this.O000000000O00O.remove(playerEntity.getUuid());
         }
      }
   }

   private void O0000000000O0() {
      if (O0000000000.world != null && O0000000000.player != null) {
         Iterator var1 = this.O000000000O00O.iterator();

         while (true) {
            while (true) {
               if (!var1.hasNext()) {
                  if (O0000000000.player.age % 100 == 0) {
                     O000000000O0.removeIf(uUID -> O0000000000.world.getPlayerByUuid(uUID) == null);
                  }

                  return;
               }

               UUID var2 = (UUID)var1.next();
               PlayerEntity var3 = O0000000000.world.getPlayerByUuid(var2);
               if (var3 == null) {
                  break;
               }

               if (!O00000000000(var3)) {
                  String var4 = var3.getName().getString();
                  boolean var5 = var4.startsWith("CIT-") && !var4.contains("NPC") && !var4.contains("[ZNPC]");
                  int var6 = 0;

                  for (ItemStack var8 : this.O000000000(var3)) {
                     if (var8 != null && !var8.isEmpty()) {
                        var6++;
                     }
                  }

                  boolean var9 = var6 == 4;
                  boolean var10 = !var3.getUuid().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var4).getBytes()));
                  if (var9 || var5 || var10) {
                     O000000000O0.add(var2);
                  }
                  break;
               }
            }

            var1.remove();
         }
      }
   }

   private void O0000000000O00() {
      if (O0000000000.world != null && O0000000000.player != null) {
         for (PlayerEntity var2 : O0000000000.world.getPlayers()) {
            if (var2 != O0000000000.player && !O00000000000(var2)) {
               String var3 = var2.getName().getString();
               boolean var4 = !var2.getUuid().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var3).getBytes()));
               boolean var5 = var3.contains("NPC") || var3.startsWith("[ZNPC]");
               if (var4 && !var5) {
                  O000000000O0.add(var2.getUuid());
               }
            }
         }
      }
   }

   private boolean O00000000(List<ItemStack> list) {
      for (ItemStack var3 : list) {
         if (var3 == null || var3.isEmpty() || var3.hasEnchantments()) {
            return false;
         }
      }

      return true;
   }

   private boolean O00000000(List<ItemStack> list, List<ItemStack> list2) {
      if (list2 == null) {
         return false;
      } else {
         for (int var3 = 0; var3 < 4; var3++) {
            ItemStack var4 = (ItemStack)list.get(var3);
            ItemStack var5 = (ItemStack)list2.get(var3);
            if (var4 != null && var5 != null) {
               if (var4.getItem() != var5.getItem()) {
                  return true;
               }
            } else if (var4 != var5) {
               return true;
            }
         }

         return false;
      }
   }

   private void O0000000000O0O() {
      if (O0000000000.getNetworkHandler() != null) {
         for (PlayerListEntry var2 : O0000000000.getNetworkHandler().getPlayerList()) {
            if (var2 != null && var2.getProfile() != null && this.O00000000(var2.getProfile().getId(), var2.getLatency())) {
               this.O00000000(var2.getProfile().getId());
            }
         }

         O000000000O000.removeIf(
            uUID -> O0000000000.getNetworkHandler().getPlayerListEntry(uUID) == null
               && (O0000000000.world == null || O0000000000.world.getPlayerByUuid(uUID) == null)
         );
      }
   }

   private boolean O00000000(UUID uUID, int i) {
      return O0000000000.player != null && uUID.equals(O0000000000.player.getUuid()) || i > 0;
   }

   private void O00000000(UUID uUID) {
      O000000000(uUID);
      this.O000000000O00O.remove(uUID);
      this.O000000000O0O.remove(uUID);
   }

   private static void O000000000(UUID uUID) {
      if (uUID != null) {
         O000000000O000.add(uUID);
         O000000000O0.remove(uUID);
      }
   }

   private static boolean O00000000000(PlayerEntity playerEntity) {
      if (playerEntity == null) {
         return false;
      } else {
         UUID var1 = playerEntity.getUuid();
         if (O000000000O000.contains(var1)) {
            return true;
         } else if (O0000000000.player != null && var1.equals(O0000000000.player.getUuid())) {
            O000000000(var1);
            return true;
         } else if (O0000000000.getNetworkHandler() == null) {
            return false;
         } else {
            PlayerListEntry var2 = O0000000000.getNetworkHandler().getPlayerListEntry(var1);
            if (var2 != null && var2.getLatency() > 0) {
               O000000000(var1);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public static boolean O00000000(PlayerEntity playerEntity) {
      if (!O000000000O00) {
         return false;
      } else if (O00000000000(playerEntity)) {
         return false;
      } else if (O000000000O0.contains(playerEntity.getUuid())) {
         return true;
      } else {
         String var1 = playerEntity.getName().getString();
         if (var1.startsWith("CIT-") && !var1.contains("NPC") && !var1.startsWith("[ZNPC]")) {
            return true;
         } else {
            return playerEntity.isInvisible() && !var1.contains("NPC") && !var1.startsWith("[ZNPC]")
               ? !playerEntity.getUuid().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var1).getBytes()))
               : false;
         }
      }
   }
}
