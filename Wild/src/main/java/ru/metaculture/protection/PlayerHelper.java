package ru.metaculture.protection;

import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket.Status;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "PlayerHelper",
   O0000000000 = Category.Player,
   O000000000 = "Полезные твики для игрока"
)
public class PlayerHelper extends Module {
   private static final String O00000000O00O = "PlayerHelper_AutoArmor";
   public final ModeSetting O000000000O = new ModeSetting("Режим ресурс паков", "Load", "Load", "Skip", "Vanilla");
   public final BooleanSetting O000000000O0 = new BooleanSetting("Авто респавн", true);
   public final BooleanSetting O000000000O00 = new BooleanSetting("Скип ресурс паков", true);
   public final BooleanSetting O000000000O000 = new BooleanSetting("Писать координаты смерти", false);
   public final BooleanSetting O000000000O00O = new BooleanSetting("Автоматически кушать", false);
   public final NumberSetting O000000000O0O = new NumberSetting("Порог голода", 10.0F, 1.0F, 20.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O00O.O0000000000());
   public final BooleanSetting O000000000O0O0 = new BooleanSetting("Отправлять координаты", false);
   public final ModeSetting O000000000O0OO = new ModeSetting("Кому отправлять: ", "СОО.Клановцам", "Друзьям", "Общий чат", "СОО.Клановцам")
      .O00000000(() -> !this.O000000000O0O0.O0000000000());
   public final KeybindSetting O000000000OO = new KeybindSetting("Бинд на отправку", -1).O00000000(() -> !this.O000000000O0O0.O0000000000());
   public final BooleanSetting O000000000OO0 = new BooleanSetting("Не ломать предмет", false);
   public final BooleanSetting O000000000OO00 = new BooleanSetting("Автоматически чинить", false);
   public final NumberSetting O000000000OO0O = new NumberSetting("Порог прочности", 100.0F, 1.0F, 500.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000OO00.O0000000000());
   public final BooleanSetting O000000000OOO = new BooleanSetting("AutoArmor", false);
   public final NumberSetting O000000000OOO0 = new NumberSetting("Скорость надевания", 150.0F, 50.0F, 1000.0F, 50.0F, false)
      .O00000000(() -> !this.O000000000OOO.O0000000000());
   public final KeybindSetting O000000000OOOO = new KeybindSetting("Бинд зума", -1, true);
   public final BooleanSetting O00000000O = new BooleanSetting("При заходе на новую анархию писать /event delay", true);
   public final BooleanSetting O00000000O0 = new BooleanSetting("Перезаход при афк", true);
   private int O00000000O00O0 = -1;
   public static boolean O00000000O00 = false;
   public static boolean O00000000O000 = false;
   private int O00000000O00OO = -1;
   private float O00000000O0O = 0.0F;
   public static boolean O00000000O0000 = false;
   public static float O00000000O000O = 0.25F;
   private final O0000O00O0000 O00000000O0O0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0O00 = new O0000O00O0000();
   private PlayerHelper.W129 O00000000O0O0O = null;
   private int O00000000O0OO = 0;
   private int O00000000O0OO0 = 0;
   private String O00000000O0OOO = "N/A";
   private String O00000000OO = "N/A";
   private String O00000000OO0 = "N/A";
   private boolean O00000000OO00 = false;

   public PlayerHelper() {
      this.O00000000(
         new Setting[]{
            this.O000000000O0,
            this.O000000000O,
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO,
            this.O000000000OO0,
            this.O000000000OO00,
            this.O000000000OO0O,
            this.O000000000OOO,
            this.O000000000OOO0,
            this.O000000000OOOO,
            this.O00000000O,
            this.O00000000O0
         }
      );
   }

   @Override
   public void O00000000(JsonObject jsonObject) {
      super.O00000000(jsonObject);
      if (jsonObject != null) {
         JsonObject var2 = null;

         try {
            var2 = jsonObject.getAsJsonObject("Settings");
         } catch (Throwable var5) {
         }

         if (var2 != null && !var2.has(this.O000000000O.O00000000) && var2.has(this.O000000000O00.O00000000)) {
            try {
               boolean var3 = var2.get(this.O000000000O00.O00000000).getAsBoolean();
               this.O000000000O.O000000000000 = var3 ? "Skip" : "Load";
               this.O000000000O.O00000000000O = this.O000000000O.O00000000000.indexOf(this.O000000000O.O000000000000);
            } catch (Throwable var4) {
            }
         }
      }
   }

   public static boolean O0000000000O0() {
      return O00000000O00 || O00000000O000;
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O00000000O0OOO = "N/A";
      this.O00000000OO = "N/A";
      this.O00000000OO0 = "N/A";
      this.O00000000OO00 = false;
      this.O00000000O0O0.O00000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (!O0000O00O0000O.O00000000() && O0000000000.player != null && O0000000000.world != null) {
         this.O0000000000OO0();
         this.O0000000000O00();
         this.O0000000000O0O();
         if (!(O0000000000.player.getHealth() <= 0.0F) && !(O0000000000.currentScreen instanceof DeathScreen)) {
            if (this.O000000000O00O.O0000000000()) {
               this.O000000000OO0();
            }

            if (this.O000000000OO0.O0000000000()) {
               this.O0000000000OOO();
            }

            if (this.O000000000OO00.O0000000000() && !O00000000O00) {
               this.O000000000O();
            }

            if (this.O000000000OOO.O0000000000()) {
               this.O000000000O00O();
            }
         } else {
            if (this.O000000000O000.O0000000000() && O0000000000.player.deathTime < 2) {
               O0000000000.player
                  .sendMessage(
                     Text.of(
                        String.format(
                           "§cDeathCoords: §fX: %d Y: %d Z: %d", (int)O0000000000.player.getX(), (int)O0000000000.player.getY(), (int)O0000000000.player.getZ()
                        )
                     ),
                     false
                  );
            }

            if (this.O000000000O0.O0000000000()) {
               O0000000000.player.requestRespawn();
               O0000000000.setScreen(null);
            }

            this.O000000000OO00();
            this.O000000000O000();
            this.O000000000O0O0();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (O0000000000.currentScreen == null && O0000000000.player != null && o0000000O0O0.O0000000000000() == 1) {
         if (o0000000O0O0.O00000000000() == this.O000000000OO.O0000000000() && this.O000000000OO.O0000000000() != -1 && this.O000000000O0O0.O0000000000()) {
            this.O000000000OO();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.player != null) {
         if (this.O000000000O.O000000000("Skip") && o0000000O000OO.O00000000000() instanceof ResourcePackSendS2CPacket var2) {
            O0000000000.getNetworkHandler().sendPacket(new ResourcePackStatusC2SPacket(var2.id(), Status.ACCEPTED));
            O0000000000.getNetworkHandler().sendPacket(new ResourcePackStatusC2SPacket(var2.id(), Status.SUCCESSFULLY_LOADED));
            o0000000O000OO.O000000000();
         }

         if (this.O00000000O0.O0000000000() && o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var4) {
            String var7 = var4.content().getString();
            if (this.O00000000(var7)) {
               this.O0000000000OO();
            }
         }

         if (this.O000000000OO0.O0000000000()) {
            ItemStack var5 = O0000000000.player.getMainHandStack();
            if (this.O00000000(var5)
               && (
                  o0000000O000OO.O00000000000() instanceof PlayerActionC2SPacket
                     || o0000000O000OO.O00000000000() instanceof PlayerInteractBlockC2SPacket
                     || o0000000O000OO.O00000000000() instanceof PlayerInteractEntityC2SPacket
                     || o0000000O000OO.O00000000000() instanceof PlayerInteractItemC2SPacket
               )) {
               o0000000O000OO.O000000000();
            }
         }
      }
   }

   private void O0000000000O00() {
      O0000O000OOOO.O00000000.O00000000(200L);
      String var1 = this.O000000000(O0000O000OOOO.O00000000.O0000000000());
      if (this.O0000000000(var1)) {
         boolean var2 = !var1.equals(this.O00000000O0OOO);
         this.O00000000O0OOO = var1;
         if (this.O00000000O.O0000000000() && !var1.equals(this.O00000000OO) && O0000000000.player.networkHandler != null) {
            O0000000000.player.networkHandler.sendChatCommand("event delay");
            this.O00000000OO = var1;
         }
      }
   }

   private void O0000000000O0O() {
      if (this.O00000000OO00 && O0000000000.player != null && O0000000000.player.networkHandler != null && !O0000O000OOOO.O000000000()) {
         if (this.O00000000O0O0.O000000000000(1000L)) {
            O0000000000.player.networkHandler.sendChatCommand("an" + this.O00000000OO0);
            this.O00000000OO00 = false;
            this.O00000000O0O0.O00000000();
         }
      }
   }

   private void O0000000000OO() {
      if (!this.O00000000OO00 && O0000000000.player != null && O0000000000.player.networkHandler != null) {
         O0000O000OOOO.O00000000.O00000000();
         String var1 = this.O000000000(O0000O000OOOO.O00000000.O0000000000());
         this.O00000000OO0 = this.O0000000000(var1) ? var1 : this.O00000000O0OOO;
         if (this.O0000000000(this.O00000000OO0)) {
            if (O0000000000.currentScreen != null) {
               O0000000000.player.closeScreen();
            }

            O0000000000.player.networkHandler.sendChatCommand("hub");
            this.O00000000OO00 = true;
            this.O00000000O0O0.O00000000();
         }
      }
   }

   private boolean O00000000(String string) {
      if (string == null) {
         return false;
      } else {
         String var2 = string.replaceAll("§.", "").toLowerCase(Locale.ROOT);
         return var2.contains("недоступна в режиме afk") || var2.contains("недопустимо нажимать в режиме afk");
      }
   }

   private String O000000000(String string) {
      if (string == null) {
         return "N/A";
      } else {
         String var2 = string.replaceAll("\\D+", "");
         return var2.isEmpty() ? "N/A" : var2;
      }
   }

   private boolean O0000000000(String string) {
      return string != null && !"N/A".equals(string) && !string.isBlank();
   }

   private boolean O00000000(KeybindSetting o0000000OOO0O) {
      return o0000000OOO0O != null && o0000000OOO0O.O0000000000() != -1;
   }

   private void O0000000000OO0() {
      if (this.O000000000OOOO.O0000000000() != -1) {
         boolean var1 = KeybindSetting.O000000000(this.O000000000OOOO.O0000000000());
         if (O00000000O0000 && !var1) {
            O00000000O000O = 0.25F;
         }

         O00000000O0000 = var1;
      } else {
         O00000000O0000 = false;
         O00000000O000O = 0.25F;
      }
   }

   private void O0000000000OOO() {
      ItemStack var1 = O0000000000.player.getMainHandStack();
      if (this.O00000000(var1)) {
         O0000000000.options.attackKey.setPressed(false);
         O0000000000.options.useKey.setPressed(false);
      }
   }

   private boolean O00000000(ItemStack itemStack) {
      if (itemStack != null && itemStack.isDamageable()) {
         int var2 = itemStack.getMaxDamage();
         if (var2 <= 0) {
            return false;
         } else {
            int var3 = var2 - itemStack.getDamage();
            int var4 = var2 < 70 ? Math.max(1, (int)Math.ceil(var2 * 0.12)) : 70;
            return var3 <= var4;
         }
      } else {
         return false;
      }
   }

   private void O000000000O() {
      if (O0000000000.currentScreen != null) {
         if (O00000000O000) {
            this.O000000000O000();
         }
      } else {
         ItemStack var1 = O0000000000.player.getMainHandStack();
         ItemStack var2 = O0000000000.player.getOffHandStack();
         if (!O00000000O000) {
            if (O0000000000.player.isUsingItem()) {
               return;
            }

            if (var1.isDamageable() && var1.getMaxDamage() - var1.getDamage() <= this.O000000000OO0O.O0000000000()) {
               if (this.O000000000O00() == -1) {
                  return;
               }

               O00000000O000 = true;
               this.O00000000O00OO = O0000000000.player.getInventory().getSelectedSlot();
               this.O00000000O0O = O0000000000.player.getPitch();
               O0000000000.interactionManager
                  .clickSlot(O0000000000.player.playerScreenHandler.syncId, 45, this.O00000000O00OO, SlotActionType.SWAP, O0000000000.player);
               this.O000000000O0();
            }
         } else {
            O0000000000.player.setPitch(90.0F);
            if (var2.isEmpty() || var2.getDamage() == 0 || !var2.isDamageable()) {
               this.O000000000O000();
               return;
            }

            if (O0000000000.player.getMainHandStack().getItem() != Items.EXPERIENCE_BOTTLE && !this.O000000000O0()) {
               this.O000000000O000();
               return;
            }

            O0000000000.options.useKey.setPressed(true);
            O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
         }
      }
   }

   private boolean O000000000O0() {
      int var1 = this.O000000000O00();
      if (var1 == -1) {
         return false;
      } else {
         if (var1 >= 36 && var1 <= 44) {
            O0000000000.player.getInventory().setSelectedSlot(var1 - 36);
         } else {
            O0000000000.interactionManager
               .clickSlot(
                  O0000000000.player.playerScreenHandler.syncId,
                  var1,
                  O0000000000.player.getInventory().getSelectedSlot(),
                  SlotActionType.SWAP,
                  O0000000000.player
               );
         }

         return true;
      }
   }

   private int O000000000O00() {
      for (int var1 = 9; var1 <= 44; var1++) {
         if (((Slot)O0000000000.player.playerScreenHandler.slots.get(var1)).getStack().getItem() == Items.EXPERIENCE_BOTTLE) {
            return var1;
         }
      }

      return -1;
   }

   private void O000000000O000() {
      if (O00000000O000) {
         O00000000O000 = false;
         O0000000000.options.useKey.setPressed(false);
         O0000000000.player.setPitch(this.O00000000O0O);
         if (this.O00000000O00OO != -1) {
            O0000000000.interactionManager
               .clickSlot(O0000000000.player.playerScreenHandler.syncId, 45, this.O00000000O00OO, SlotActionType.SWAP, O0000000000.player);
            O0000000000.player.getInventory().setSelectedSlot(this.O00000000O00OO);
            this.O00000000O00OO = -1;
         }
      }
   }

   private void O000000000O00O() {
      if (this.O00000000O0OO > 0) {
         this.O000000000O0O();
      } else if (O0000000000.interactionManager != null && !O00000000O00 && !O00000000O000 && !O0000000000.player.isUsingItem()) {
         if (this.O00000000O0O00.O000000000000((long)this.O000000000OOO0.O0000000000())) {
            PlayerHelper.W129 var1 = this.O000000000O0OO();
            if (var1 != null) {
               this.O00000000O0O0O = var1;
               this.O00000000O0OO = 1;
               this.O00000000O0OO0 = 0;
               this.O000000000O0O();
            }
         }
      }
   }

   private void O000000000O0O() {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null && this.O00000000O0O0O != null) {
         switch (this.O00000000O0OO) {
            case 1:
               O0000O00O00O.O00000000().O00000000("PlayerHelper_AutoArmor");
               O0000000000.options.sprintKey.setPressed(false);
               O0000000000.player.setSprinting(false);
               this.O00000000O0OO = 2;
               this.O00000000O0OO0 = 1;
               break;
            case 2:
               if (this.O00000000O0OO0-- > 0) {
                  return;
               }

               O0000O00O000O0.O00000000(this.O00000000O0O0O.sourceSlot(), this.O00000000O0O0O.armorSlotId());
               O0000000000.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(O0000000000.player.playerScreenHandler.syncId));
               this.O00000000O0O00.O00000000();
               this.O00000000O0OO = 3;
               this.O00000000O0OO0 = 1;
               break;
            case 3:
               if (this.O00000000O0OO0-- > 0) {
                  return;
               }

               this.O000000000O0O0();
               break;
            default:
               this.O000000000O0O0();
         }
      } else {
         this.O000000000O0O0();
      }
   }

   private void O000000000O0O0() {
      if (this.O00000000O0OO > 0) {
         O0000O00O00O.O00000000().O000000000("PlayerHelper_AutoArmor");
      }

      this.O00000000O0O0O = null;
      this.O00000000O0OO = 0;
      this.O00000000O0OO0 = 0;
   }

   private PlayerHelper.W129 O000000000O0OO() {
      Object var1 = null;
      var1 = this.O00000000((PlayerHelper.W129)var1, this.O00000000(EquipmentSlot.HEAD, 5));
      var1 = this.O00000000((PlayerHelper.W129)var1, this.O00000000(EquipmentSlot.CHEST, 6));
      var1 = this.O00000000((PlayerHelper.W129)var1, this.O00000000(EquipmentSlot.LEGS, 7));
      return this.O00000000((PlayerHelper.W129)var1, this.O00000000(EquipmentSlot.FEET, 8));
   }

   private PlayerHelper.W129 O00000000(PlayerHelper.W129 o00000000, PlayerHelper.W129 o000000002) {
      if (o000000002 == null) {
         return o00000000;
      } else if (o00000000 == null) {
         return o000000002;
      } else {
         return o000000002.improvement() > o00000000.improvement() ? o000000002 : o00000000;
      }
   }

   private PlayerHelper.W129 O00000000(EquipmentSlot equipmentSlot, int i) {
      ItemStack var3 = O0000000000.player.getEquippedStack(equipmentSlot);
      int var4 = this.O00000000(var3, equipmentSlot);
      int var5 = -1;
      int var6 = var4;

      for (int var7 = 0; var7 < 36; var7++) {
         ItemStack var8 = O0000000000.player.getInventory().getStack(var7);
         int var9 = this.O00000000(var8, equipmentSlot);
         if (var9 > var6) {
            var6 = var9;
            var5 = var7 < 9 ? var7 + 36 : var7;
         }
      }

      return var5 == -1 ? null : new PlayerHelper.W129(var5, i, var6 - var4);
   }

   private int O00000000(ItemStack itemStack, EquipmentSlot equipmentSlot) {
      if (itemStack != null && !itemStack.isEmpty() && this.O00000000(itemStack.getItem()) == equipmentSlot) {
         int var3 = this.O000000000(itemStack.getItem()) * 10000;
         ItemEnchantmentsComponent var4 = (ItemEnchantmentsComponent)itemStack.get(DataComponentTypes.ENCHANTMENTS);
         if (var4 != null && !var4.isEmpty()) {
            for (Entry var6 : var4.getEnchantmentEntries()) {
               var3 += var6.getIntValue() * 100;
            }
         }

         if (itemStack.isDamageable()) {
            var3 += Math.max(0, itemStack.getMaxDamage() - itemStack.getDamage()) * 100 / Math.max(1, itemStack.getMaxDamage());
         }

         return var3;
      } else {
         return -1;
      }
   }

   private EquipmentSlot O00000000(Item item) {
      if (item == Items.NETHERITE_HELMET
         || item == Items.DIAMOND_HELMET
         || item == Items.IRON_HELMET
         || item == Items.CHAINMAIL_HELMET
         || item == Items.GOLDEN_HELMET
         || item == Items.LEATHER_HELMET
         || item == Items.TURTLE_HELMET) {
         return EquipmentSlot.HEAD;
      } else if (item == Items.NETHERITE_CHESTPLATE
         || item == Items.DIAMOND_CHESTPLATE
         || item == Items.IRON_CHESTPLATE
         || item == Items.CHAINMAIL_CHESTPLATE
         || item == Items.GOLDEN_CHESTPLATE
         || item == Items.LEATHER_CHESTPLATE) {
         return EquipmentSlot.CHEST;
      } else if (item == Items.NETHERITE_LEGGINGS
         || item == Items.DIAMOND_LEGGINGS
         || item == Items.IRON_LEGGINGS
         || item == Items.CHAINMAIL_LEGGINGS
         || item == Items.GOLDEN_LEGGINGS
         || item == Items.LEATHER_LEGGINGS) {
         return EquipmentSlot.LEGS;
      } else {
         return item != Items.NETHERITE_BOOTS
               && item != Items.DIAMOND_BOOTS
               && item != Items.IRON_BOOTS
               && item != Items.CHAINMAIL_BOOTS
               && item != Items.GOLDEN_BOOTS
               && item != Items.LEATHER_BOOTS
            ? null
            : EquipmentSlot.FEET;
      }
   }

   private int O000000000(Item item) {
      if (item == Items.NETHERITE_HELMET || item == Items.NETHERITE_CHESTPLATE || item == Items.NETHERITE_LEGGINGS || item == Items.NETHERITE_BOOTS) {
         return 6;
      } else if (item == Items.DIAMOND_HELMET || item == Items.DIAMOND_CHESTPLATE || item == Items.DIAMOND_LEGGINGS || item == Items.DIAMOND_BOOTS) {
         return 5;
      } else if (item == Items.IRON_HELMET || item == Items.IRON_CHESTPLATE || item == Items.IRON_LEGGINGS || item == Items.IRON_BOOTS) {
         return 4;
      } else if (item == Items.CHAINMAIL_HELMET || item == Items.CHAINMAIL_CHESTPLATE || item == Items.CHAINMAIL_LEGGINGS || item == Items.CHAINMAIL_BOOTS) {
         return 3;
      } else if (item == Items.GOLDEN_HELMET || item == Items.GOLDEN_CHESTPLATE || item == Items.GOLDEN_LEGGINGS || item == Items.GOLDEN_BOOTS) {
         return 2;
      } else if (item == Items.LEATHER_HELMET || item == Items.LEATHER_CHESTPLATE || item == Items.LEATHER_LEGGINGS || item == Items.LEATHER_BOOTS) {
         return 1;
      } else {
         return item == Items.TURTLE_HELMET ? 2 : 0;
      }
   }

   private void O000000000OO() {
      int var1 = (int)O0000000000.player.getX();
      int var2 = (int)O0000000000.player.getY();
      int var3 = (int)O0000000000.player.getZ();
      String var4 = String.format(" %d %d %d", var1, var2, var3);
      String var5 = this.O000000000O0OO.O0000000000();
      switch (var5) {
         case "Общий чат":
            O0000000000.getNetworkHandler().sendChatMessage("! Мои координаты:" + var4);
            break;
         case "Друзья":
            List var8 = FriendCommand.O00000000000();
            if (var8.isEmpty()) {
               O0000000000.player.sendMessage(Text.of("§cСписок друзей пуст!"), true);
               return;
            }

            for (String var10 : (List<String>)var8) {
               O0000000000.getNetworkHandler().sendChatMessage("/msg " + var10 + " Мои координаты:" + var4);
            }

            O0000000000.player.sendMessage(Text.of("§aКоординаты отправлены друзьям."), true);
            break;
         case "СОО.Клановцам":
            O0000000000.getNetworkHandler().sendChatMessage("/clan chat" + var4);
      }
   }

   private void O000000000OO0() {
      if (O0000000000.currentScreen != null) {
         if (O00000000O00) {
            this.O000000000OO00();
         }
      } else if (O0000000000.player.getHungerManager().getFoodLevel() >= this.O000000000O0O.O0000000000()) {
         if (O00000000O00) {
            this.O000000000OO00();
         }
      } else if (O00000000O00 || !O0000000000.player.isUsingItem()) {
         int var1 = this.O000000000OO0O();
         if (var1 != -1 && !O00000000O00) {
            this.O00000000O00O0 = O0000000000.player.getInventory().getSelectedSlot();
            O0000000000.player.getInventory().setSelectedSlot(var1);
            O0000000000.options.useKey.setPressed(true);
            if (O0000000000.interactionManager != null) {
               O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            }

            O00000000O00 = true;
         }
      }
   }

   private void O000000000OO00() {
      if (O00000000O00) {
         O0000000000.options.useKey.setPressed(false);
         if (this.O00000000O00O0 != -1 && O0000000000.player != null) {
            O0000000000.player.getInventory().setSelectedSlot(this.O00000000O00O0);
            this.O00000000O00O0 = -1;
         }

         O00000000O00 = false;
      }
   }

   private int O000000000OO0O() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).contains(DataComponentTypes.FOOD)) {
            return var1;
         }
      }

      return -1;
   }

   @Override
   public void O000000000() {
      this.O000000000OO00();
      this.O000000000O000();
      this.O000000000O0O0();
      O00000000O0000 = false;
      O00000000O000O = 0.25F;
      this.O00000000OO00 = false;
      super.O000000000();
   }

   record W129(int sourceSlot, int armorSlotId, int improvement) {
   }
}
