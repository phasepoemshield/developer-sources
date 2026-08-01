package l;

import java.awt.Color;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Notifications extends Helper119 {
   private final List<Helper198> list = new ArrayList<>();
   private final List<Helper197> stacks = new ArrayList<>();
   private static final long PENDING_CHEST_LOOT_MS = 4000L;
   private static final int DEFAULT_ACCENT = -11024507;
   private boolean positionInitialized = false;

   public static Notifications method1666() {
      return Helper222.method1981(Notifications.class);
   }

   public Notifications() {
      super("Notifications", 0, 0, 100, 15, true);
   }

   @Override
   public void method308() {
      this.list.forEach(var0 -> {
         if (System.currentTimeMillis() > var0.removeTime || var0.text.getString().contains("Notification") && !Helper38.method548(mc.currentScreen)) {
            var0.anim.method4997(Helper450.BACKWARDS);
         }
      });
      this.list.removeIf(var0 -> var0.anim.method4995(Helper450.BACKWARDS));

      while (!this.stacks.isEmpty()) {
         this.method1667(Helper195.INVENTORY, "Raised: ");
         this.method1667(Helper195.SHULKER_INVENTORY, "Items picked up in shulker: ");
         this.method1667(Helper195.SHULKER, "Raised shulker: ");
      }
   }

   @Override
   public void method309(Helper386 var1) {
      if (!Helper38.method549()) {
         Packet packet = Objects.requireNonNull(var1.method3895());

         if (packet instanceof ItemPickupAnimationS2CPacket pickup) {
            if (Hud.method1824().notificationSettings.method2588("Item Pick Up")
               && pickup.getCollectorEntityId() == Objects.requireNonNull(mc.player).getId()
               && Objects.requireNonNull(mc.world).getEntityById(pickup.getEntityId()) instanceof ItemEntity itemEntity) {
               ItemStack stack = itemEntity.getStack();
               ContainerComponent container = stack.get(DataComponentTypes.CONTAINER);
               if (container == null) {
                  Text name = stack.getName();
                  if (name.getContent().toString().equals("empty")) {
                     MutableText text = Text.empty().append(name);
                     if (stack.getCount() > 1) {
                        text.append(Formatting.RESET + " [" + Formatting.RED + stack.getCount() + Formatting.GRAY + "x" + Formatting.RESET + "]");
                     }
                     this.stacks.add(new Helper197(Helper195.INVENTORY, text));
                  }
               } else {
                  container.stream().filter(item -> item.getName().getContent().toString().equals("empty")).forEach(item -> {
                     MutableText text = Text.empty().append(item.getName());
                     if (item.getCount() > 1) {
                        text.append(Formatting.RESET + " [" + Formatting.RED + item.getCount() + Formatting.GRAY + "x" + Formatting.RESET + "]");
                     }
                     this.stacks.add(new Helper197(Helper195.SHULKER, text));
                  });
               }
            }
         } else if (packet instanceof ScreenHandlerSlotUpdateS2CPacket slotUpdate) {
            if (!Hud.method1824().notificationSettings.method2588("Item Pick Up")) {
               return;
            }
            int slot = slotUpdate.getSlot();
            ContainerComponent updated = slotUpdate.getStack().get(DataComponentTypes.CONTAINER);
            if (updated != null && slot < Objects.requireNonNull(mc.player).currentScreenHandler.slots.size() && slotUpdate.getSyncId() == 0) {
               ContainerComponent existing = mc.player.currentScreenHandler.getSlot(slot).getStack().get(DataComponentTypes.CONTAINER);
               if (existing != null) {
                  updated.stream()
                     .filter(item -> existing.stream()
                        .noneMatch(other -> Objects.equals(other.getComponents(), item.getComponents()) && other.toString().equals(item.toString())))
                     .forEach(item -> {
                        MutableText text = Text.empty().append(item.getName());
                        this.stacks.add(new Helper197(Helper195.SHULKER_INVENTORY, text));
                     });
               }
            }
         }
      }
   }

   @Override
   public void method556(Event4 var1) {
      if (var1.method3646() instanceof ChatScreen) {
         this.method1668("Notification", 99999999L);
      }
   }

   @Override
   public void method310(DrawContext var1) {
      if (!this.positionInitialized) {
         int var2 = mc.getWindow().getScaledHeight();
         int var3 = mc.getWindow().getScaledWidth();
         this.method973(var3 / 2 - 55);
         this.method974(var2 / 2 + 100);
         this.positionInitialized = true;
      }

      MatrixStack var18 = var1.getMatrices();
      Helper175 var19 = Helper103.method927(12, Helper101.DEFAULT);
      int var4 = mc.getWindow().getScaledHeight();
      int var5 = mc.getWindow().getScaledWidth();
      int var6 = var4 / 2;
      int var7 = var5 / 2;
      Helper175 var8 = Helper103.method927(19, Helper101.ICONSTYPENEW);
      float var9 = 0.0F;
      float var10 = 5.0F;

      for (Helper198 var12 : this.list) {
         float var13 = var12.anim.method5000().floatValue();
         String var14 = var12.title != null ? var12.title.getString() + " " + var12.text.getString() : var12.text.getString();
         float var15 = var19.method1479(var14) + var10 * 2.0F + 10.0F;
         float var16 = this.method982() + var9;
         float var17 = this.method981() + (100.0F - var15) / 2.0F;
         Helper147.method1233(
            var13,
            () -> {
               int var9x = Hud.method1824().method1847();
               Helper12.method361(
                  var18,
                  var17,
                  var16,
                  var15 + 5.0F,
                  this.method984() + 1,
                  4.0F,
                  var9x,
                  Hud.method1824().method1836(),
                  Hud.method1824().method1827()
               );
               if (!Hud.method1824().method1838()) {
                  rectangle.method677(
                     Helper80.method841(var18, var17, var16, var15 + 5.0F, this.method984() + 1)
                        .method826(4.0F)
                        .method835(0.1F)
                        .method839(new Color(0, 0, 0, 255).getRGB())
                        .method825(
                           new Color(0, 0, 0, 255).getRGB(),
                           new Color(0, 0, 0, 255).getRGB(),
                           new Color(0, 0, 0, 255).getRGB(),
                           new Color(0, 0, 0, 255).getRGB()
                        )
                        .method840()
                  );
               }

               var8.method1474(var18, "x", var17 + 3.0F, var16 + 6.0F, Hud.method1824().method1828());
               float var10x = Math.round(var17 + 14.0F);
               rectangle.method677(Helper80.method841(var18, var10x, var16 + 3.5F, 0.5, 9.0).method823(Hud.method1824().method1828()).method840());
               if (var12.title != null && !var12.title.getString().isEmpty()) {
                  var19.method1471(var18, var12.title, (int)(var17 + var10 + 13.0F), var16 + 7.0F);
                  String var11 = var12.text.getString();
                  int var12x = var11.lastIndexOf(32);
                  if (var12x != -1) {
                     String var13x = var11.substring(0, var12x);
                     String var14x = var11.substring(var12x + 1);
                     float var15x = var17 + var10 + 14.0F + var19.method1478(var12.title) + 1.0F;
                     var19.method1474(var18, var13x, var15x, var16 + 7.0F, Helper133.method1160());
                     var19.method1474(var18, " " + var14x, var15x + var19.method1479(var13x) + 1.5F, var16 + 7.0F, Hud.method1824().method1828());
                  } else {
                     var19.method1471(var18, var12.text, (int)(var17 + var10 + 15.0F + var19.method1478(var12.title) + 1.0F), var16 + 7.0F);
                  }
               } else {
                  var19.method1471(var18, var12.text, (int)(var17 + var10 + 13.0F), var16 + 7.0F);
               }

               if (!var12.method1657()) {
                  long var18x = System.currentTimeMillis() - var12.startTime;
                  long var19x = var12.removeTime - var12.startTime;
                  float var17x = 1.0F - Math.min(1.0F, (float)var18x / (float)var19x);
                  float var16x = var15 * var17x;
                  if (var16x > 0.0F) {
                  }
               }
            }
         );
         var9 += (this.method984() + 3) * var13;
      }
   }

   private void method1667(Helper195 var1, String var2) {
      MutableText var3 = Text.empty();
      List var4 = this.stacks.stream().filter(var1x -> var1x.type.equals(var1)).toList();
      int var5 = 0;

      for (int var6 = var4.size(); var5 < var6; var5++) {
         Helper197 var7 = (Helper197)var4.get(var5);
         if (var7.type == var1) {
            var3.append(var7.text);
            this.stacks.remove(var7);
            if (var3.getString().length() > 150) {
               break;
            }

            if (var5 + 1 != var6) {
               var3.append(" , ");
            }
         }
      }

      if (!var3.equals(Text.empty())) {
         this.method1669(Text.empty().append(var2).append(var3), 8000L);
      }
   }

   public void method1668(String var1, long var2) {
      this.method1671(Text.empty().append(var1), var2, null);
   }

   public void method1669(Text var1, long var2) {
      this.method1671(var1, var2, null);
   }

   public void method1670(String var1, long var2, SoundEvent var4) {
      this.method1671(Text.empty().append(var1), var2, var4);
   }

   public void method1671(Text var1, long var2, SoundEvent var4) {
      this.list
         .add(
            new Helper198(
               Text.empty(),
               var1,
               new Animation1().method5003(400).method5004(1.0),
               System.currentTimeMillis(),
               System.currentTimeMillis() + var2,
               -11024507,
               -11024507,
               Helper196.INFO
            )
         );
      if (this.list.size() > 12) {
         this.list.removeFirst();
      }

      this.list.sort(Comparator.comparingDouble(var0 -> -var0.removeTime));
      if (var4 != null) {
         Helper56.method645(var4);
      }
   }

   public void method1672(String var1, boolean var2, long var3, SoundEvent var5) {
      int var6 = var2 ? -11024507 : -1607303;
      this.method1673(
         Text.literal("Module"),
         Text.literal(var1 + (var2 ? " Enabled" : " Disabled")),
         Hud.method1824().method1828(),
         Hud.method1824().method1828(),
         var3,
         var5,
         Helper196.INFO
      );
   }

   private void method1673(Text var1, Text var2, int var3, int var4, long var5, SoundEvent var7, Helper196 var8) {
      this.list
         .add(
            new Helper198(
               var1, var2, new Animation1().method5003(400).method5004(1.0), System.currentTimeMillis(), System.currentTimeMillis() + var5, var3, var4, var8
            )
         );
      if (this.list.size() > 12) {
         this.list.removeFirst();
      }

      this.list.sort(Comparator.comparingDouble(var0 -> -var0.removeTime));
      if (var7 != null) {
         Helper56.method645(var7);
      }
   }
}
