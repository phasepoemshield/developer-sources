package l;

import java.util.UUID;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class TotemTracker extends Helper242 {
   private static final UUID SYSTEM_UUID = new UUID(0L, 0L);

   public TotemTracker() {
      super("TotemTracker", Helper269.PLAYER);
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (var1.method3895() instanceof EntityStatusS2CPacket var2) {
         if (var2.getStatus() == 35) {
            MinecraftClient var8 = MinecraftClient.getInstance();
            if (var8.world != null && var8.player != null && var8.inGameHud != null) {
               if (var2.getEntity(var8.world) instanceof PlayerEntity var5) {
                  if (var5 != var8.player) {
                     boolean var6 = this.method2605(var5);
                     MutableText var7 = Text.literal("")
                        .append(Text.literal("Игрок ").formatted(Formatting.GRAY))
                        .append(Text.literal(var5.getName().getString()).formatted(Formatting.WHITE))
                        .append(Text.literal(" использовал тотем | Зачарован: ").formatted(Formatting.GRAY))
                        .append(Text.literal(var6 ? "Да" : "Нет").formatted(var6 ? Formatting.GREEN : Formatting.RED));
                     Notifications.method1666().method1669(var7, 5000L);
                  }
               }
            }
         }
      }
   }

   private boolean method2605(PlayerEntity var1) {
      ItemStack var2 = var1.getMainHandStack();
      ItemStack var3 = var1.getOffHandStack();
      if (var2.getItem() == Items.TOTEM_OF_UNDYING) {
         return var2.hasEnchantments();
      } else {
         return var3.getItem() == Items.TOTEM_OF_UNDYING ? var3.hasEnchantments() : false;
      }
   }
}
