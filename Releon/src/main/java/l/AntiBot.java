package l;

import antidaunleak.api.annotation.Native;
import com.mojang.authlib.GameProfile;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRemoveS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Entry;
import net.minecraft.util.Hand;

public class AntiBot extends Helper242 {
   private final Set<UUID> suspectSet = new HashSet<>();
   static Set<UUID> botSet = new HashSet<>();
   private final Setting5 mode = new Setting5("Режим", "Выберите режим обнаружения ботов").method2381("ReallyWorld").method2383("ReallyWorld");

   public static AntiBot method4604() {
      return Helper222.method1979(AntiBot.class);
   }

   public AntiBot() {
      super("AntiBot", "Anti Bot", Helper269.COMBAT);
      this.setup(new Helper264[]{this.mode});
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      switch (var1.method3895()) {
         case PlayerListS2CPacket var4:
            this.method4605(var4);
            break;
         case PlayerRemoveS2CPacket var5:
            this.method4606(var5);
            break;
         default:
      }
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void onTick(Event8 var1) {
      if (!this.suspectSet.isEmpty()) {
         mc.world.getPlayers().stream().filter(var1x -> this.suspectSet.contains(var1x.getUuid())).forEach(this::method4608);
      }

      if (this.mode.method2385("Matrix")) {
         this.method4609();
      } else if (this.mode.method2385("ReallyWorld")) {
         this.method4610();
      }
   }

   private void method4605(PlayerListS2CPacket var1) {
      var1.getPlayerAdditionEntries().forEach(var1x -> {
         GameProfile var2 = var1x.profile();
         if (var2 != null && !this.method4607(var1x, var2)) {
            if (this.method4612(var2)) {
               botSet.add(var2.getId());
            } else {
               this.suspectSet.add(var2.getId());
            }
         }
      });
   }

   private void method4606(PlayerRemoveS2CPacket var1) {
      var1.profileIds().forEach(var1x -> {
         this.suspectSet.remove(var1x);
         botSet.remove(var1x);
      });
   }

   private boolean method4607(Entry var1, GameProfile var2) {
      return var1.latency() < 2 || var2.getProperties() != null && !var2.getProperties().isEmpty();
   }

   private void method4608(PlayerEntity var1) {
      Iterable var2 = null;
      if (!this.method4613(var1)) {
         var2 = var1.getArmorItems();
      }

      if (this.method4613(var1) || this.method4614(var1, var2)) {
         botSet.add(var1.getUuid());
      }

      this.suspectSet.remove(var1.getUuid());
   }

   private void method4609() {
      for (Iterator var1 = this.suspectSet.iterator(); var1.hasNext(); var1.remove()) {
         UUID var2 = (UUID)var1.next();
         PlayerEntity var3 = mc.world.getPlayerByUuid(var2);
         if (var3 != null) {
            String var4 = var3.getName().getString();
            boolean var5 = var4.startsWith("CIT-") && !var4.contains("NPC") && !var4.contains("[ZNPC]");
            int var6 = 0;

            for (ItemStack var8 : var3.getArmorItems()) {
               if (!var8.isEmpty()) {
                  var6++;
               }
            }

            boolean var9 = var6 == 4;
            boolean var10 = !var3.getUuid().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var4).getBytes()));
            if (var9 || var5 || var10) {
               botSet.add(var2);
            }
         }
      }

      if (mc.player.age % 100 == 0) {
         botSet.removeIf(var0 -> mc.world.getPlayerByUuid(var0) == null);
      }
   }

   private void method4610() {
      for (PlayerEntity var2 : mc.world.getPlayers()) {
         if (!var2.getUuid().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var2.getName().getString()).getBytes()))
            && !botSet.contains(var2.getUuid())
            && !var2.getName().getString().contains("NPC")
            && !var2.getName().getString().startsWith("[ZNPC]")) {
            botSet.add(var2.getUuid());
         }
      }
   }

   private void method4611() {
      for (PlayerEntity var2 : mc.world.getPlayers()) {
         if (var2 != mc.player) {
            List<net.minecraft.item.ItemStack> var3 = StreamSupport.stream(var2.getArmorItems().spliterator(), false).toList();
            boolean var4 = true;

            for (ItemStack var6 : var3) {
               if (var6.isEmpty() || !var6.isEnchantable() || var6.getDamage() > 0) {
                  var4 = false;
                  break;
               }
            }

            boolean var8 = false;

            for (ItemStack var7 : var3) {
               if (var7.getItem() == Items.LEATHER_BOOTS
                  || var7.getItem() == Items.LEATHER_LEGGINGS
                  || var7.getItem() == Items.LEATHER_CHESTPLATE
                  || var7.getItem() == Items.LEATHER_HELMET
                  || var7.getItem() == Items.IRON_BOOTS
                  || var7.getItem() == Items.IRON_LEGGINGS
                  || var7.getItem() == Items.IRON_CHESTPLATE
                  || var7.getItem() == Items.IRON_HELMET) {
                  var8 = true;
                  break;
               }
            }

            if (var4
               && var8
               && var2.getStackInHand(Hand.OFF_HAND).getItem() == Items.AIR
               && var2.getStackInHand(Hand.MAIN_HAND).getItem() != Items.AIR
               && var2.getHungerManager().getFoodLevel() == 20
               && !var2.getName().getString().contains("NPC")
               && !var2.getName().getString().startsWith("[ZNPC]")) {
               botSet.add(var2.getUuid());
            } else {
               botSet.remove(var2.getUuid());
            }
         }
      }
   }

   public boolean method4612(GameProfile var1) {
      return Objects.requireNonNull(mc.getNetworkHandler())
            .getPlayerList()
            .stream()
            .filter(var1x -> var1x.getProfile().getName().equals(var1.getName()) && !var1x.getProfile().getId().equals(var1.getId()))
            .count()
         == 1L;
   }

   public boolean method4613(PlayerEntity var1) {
      return IntStream.rangeClosed(0, 3)
         .mapToObj(var1.getInventory()::getArmorStack)
         .allMatch(var0 -> var0.getItem() instanceof ArmorItem && !var0.hasEnchantments());
   }

   public boolean method4614(PlayerEntity var1, Iterable<ItemStack> var2) {
      if (var2 == null) {
         return true;
      } else {
         List<net.minecraft.item.ItemStack> var3 = StreamSupport.stream(var1.getArmorItems().spliterator(), false).toList();
         List var4 = StreamSupport.stream(var2.spliterator(), false).toList();
         return !IntStream.range(0, Math.min(var3.size(), var4.size())).allMatch(var2x -> ((ItemStack)var3.get(var2x)).equals(var4.get(var2x)))
            || var3.size() != var4.size();
      }
   }

   public boolean method4615(PlayerEntity var1) {
      String var2 = var1.getName().getString();
      boolean var3 = var2.startsWith("CIT-") && !var2.contains("NPC") && !var2.startsWith("[ZNPC]");
      boolean var4 = botSet.contains(var1.getUuid());
      this.method4617(var1);
      return var3 || var4;
   }

   public boolean method4616(UUID var1) {
      return botSet.contains(var1);
   }

   public boolean method4617(Entity var1) {
      return !var1.getUuid().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var1.getName().getString()).getBytes()))
         && var1.isInvisible()
         && !var1.getName().getString().contains("NPC")
         && !var1.getName().getString().startsWith("[ZNPC]");
   }

   public void method4618() {
      this.suspectSet.clear();
      botSet.clear();
   }

   @Override
   public void deactivate() {
      this.method4618();
      super.deactivate();
   }
}
