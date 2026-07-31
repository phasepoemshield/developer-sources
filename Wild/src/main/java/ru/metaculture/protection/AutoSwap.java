package ru.metaculture.protection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.Arrays;
import java.util.Locale;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.util.Window;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.AttributeModifiersComponent.Entry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.Item.TooltipContext;
import net.minecraft.item.tooltip.TooltipType.Default;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.Registries;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoSwap",
   O000000000 = "Автоматически свапает предметы через бинд",
   O0000000000 = Category.Combat,
   O00000000000 = {O0000000OO0OOO.GRIM}
)
public class AutoSwap extends Module {
   private static final String O000000000O0OO = "Обычный";
   private static final String O000000000OO = "Трио свап";
   private static final String O000000000OO0 = "Без фильтра";
   private static final String O000000000OO00 = "FT/RW";
   private static final int O000000000OO0O = 3;
   private static boolean O000000000OOO;
   public static ModeSetting O000000000O = new ModeSetting("Выбор работы свапов:", "Трио свап", "Обычный", "Трио свап");
   public static ModeSetting O000000000O0 = new ModeSetting("Фильтр свапов", "Без фильтра", "Без фильтра", "FT/RW");
   public static ModeSetting O000000000O00 = new ModeSetting("Первый предмет", "Шар", "Золотое яблоко", "Щит", "Шар", "Тотем")
      .O00000000(() -> !O000000000O.O000000000("Обычный"));
   public static ModeSetting O000000000O000 = new ModeSetting("Второй предмет", "Тотем 2", "Золотое яблоко 2", "Щит 2", "Шар 2", "Тотем 2")
      .O00000000(() -> !O000000000O.O000000000("Обычный"));
   public static KeybindSetting O000000000O00O = new KeybindSetting("Кнопка", -1);
   public static BooleanSetting O000000000O0O = new BooleanSetting("Только зачарованых тотемов", false).O00000000(() -> !O000000000O.O000000000("Обычный"));
   private boolean O000000000OOO0;
   private final O0000O00O000 O000000000OOOO = new O0000O00O000();
   private final ItemStack[] O00000000O = new ItemStack[]{ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY};
   private final String[] O00000000O0 = new String[]{"", "", ""};
   private int O00000000O00 = 0;
   private int O00000000O000 = 0;
   private int O00000000O0000 = -1;
   private String O00000000O000O = "";
   private boolean O00000000O00O;
   private boolean O00000000O00O0;
   private int O00000000O00OO = -1;
   private int O00000000O0O = -1;
   private float O00000000O0O0;
   private float O00000000O0O00;
   private float O00000000O0O0O;
   private float O00000000O0OO;
   private long O00000000O0OO0;
   private long O00000000O0OOO;
   private long O00000000OO;
   private float[] O00000000OO0 = new float[3];
   public static boolean O000000000O0O0 = false;

   public AutoSwap() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0, O000000000O00, O000000000O000, O000000000O00O, O000000000O0O});
   }

   public static boolean O0000000000O0() {
      return O000000000OOO;
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      if (O0000000000.player == null || O0000000000.world == null) {
         this.O000000000OO();
      } else if (this.O00000000O00O) {
         if (!O000000000O.O000000000("Трио свап") || O000000000O00O.O0000000000() == -1) {
            this.O0000000000(false);
         } else if (!this.O0000000000000(O000000000O00O.O0000000000())) {
            this.O0000000000(true);
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player == null || O0000000000.world == null) {
         this.O000000000OO();
      } else if (this.O00000000O00 > 0) {
         this.O0000000000OO();
         if (this.O00000000O000 > 0) {
            this.O00000000O000--;
         } else {
            this.O0000000000O00();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      if (this.O00000000O00O && O000000000O.O000000000("Трио свап") && O0000000000.player != null && O0000000000.world != null) {
         RenderManager var2 = o0000000O00O.O00000000000();
         DrawContext var3 = o0000000O00O.O00000000000O();
         if (var2 != null && var3 != null) {
            var2.O00000000(7.0F);
            this.O000000000O00O();
            int var4 = o0000000O00O.O0000000000000();
            int var5 = o0000000O00O.O000000000000O();
            if (this.O00000000O00O0) {
               this.O000000000O00();
               this.O000000000(var2, var3, var4, var5);
            } else {
               this.O00000000O00OO = this.O000000000(this.O00000000O0O0, this.O00000000O0O00, var4, var5);
               this.O000000000O00();
               this.O00000000(var2, var3, var4, var5);
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (o0000000O0O0.O00000000000() == O000000000O00O.O0000000000() && O000000000O00O.O0000000000() != -1) {
         if (!O000000000O.O000000000("Трио свап")) {
            if (O0000000000.currentScreen == null && o0000000O0O0.O0000000000000() == 1 && this.O000000000OOOO.O00000000000(300L) && this.O00000000O00 == 0) {
               this.O000000000OOOO.O00000000();
               this.O0000000000O0O();
            }
         } else {
            if (o0000000O0O0.O0000000000000() == 1 && this.O00000000O00 == 0 && !this.O00000000O00O && this.O000000000OOOO.O00000000000(120L)) {
               this.O0000000000OOO();
               this.O000000000OOOO.O00000000();
               o0000000O0O0.O000000000();
            } else if (o0000000O0O0.O0000000000000() == 0 && this.O00000000O00O) {
               this.O0000000000(true);
               o0000000O0O0.O000000000();
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O00 o0000000O0O00) {
      int var2 = -100 - o0000000O0O00.O00000000000();
      if (O000000000O.O000000000("Трио свап") && O000000000O00O.O0000000000() == var2 && this.O00000000O00 == 0) {
         if (o0000000O0O00.O00000000000O0() && !this.O00000000O00O && this.O000000000OOOO.O00000000000(120L)) {
            this.O00000000((float)o0000000O0O00.O000000000000O(), (float)o0000000O0O00.O00000000000O());
            this.O0000000000OOO();
            this.O000000000OOOO.O00000000();
            o0000000O0O00.O000000000();
            return;
         }

         if (o0000000O0O00.O00000000000OO() && this.O00000000O00O) {
            this.O00000000((float)o0000000O0O00.O000000000000O(), (float)o0000000O0O00.O00000000000O());
            this.O0000000000(true);
            o0000000O0O00.O000000000();
            return;
         }
      }

      if (this.O00000000O00O) {
         this.O00000000((float)o0000000O0O00.O000000000000O(), (float)o0000000O0O00.O00000000000O());
         if (o0000000O0O00.O00000000000O0()) {
            this.O0000000000(o0000000O0O00.O00000000000());
         }

         o0000000O0O00.O000000000();
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O00O o0000000O0O00O) {
      if (this.O00000000O00O) {
         o0000000O0O00O.O000000000();
      }
   }

   @EventHandler
   public void O00000000(O0000000O00OOO o0000000O00OOO) {
      if (this.O00000000O00O) {
         o0000000O00OOO.O000000000();
      }
   }

   private void O0000000000O00() {
      switch (this.O00000000O00) {
         case 1:
            this.O0000000000OO();
            this.O00000000O00 = 2;
            this.O00000000O000 = 1;
            break;
         case 2:
            if (this.O00000000O0000 < 0 || this.O00000000O0000 >= 36) {
               this.O00000000O00 = 3;
               this.O00000000O000 = 1;
               return;
            }

            int var1 = O0000000000.player.currentScreenHandler.syncId;
            ItemStack var2 = O0000000000.player.getInventory().getStack(this.O00000000O0000);
            String var3 = this.O0000000000(var2, this.O00000000O000O);
            if (!var2.isEmpty() && !O0000000000.player.isSprinting()) {
               O0000000000.interactionManager
                  .clickSlot(var1, this.O00000000O0000 < 9 ? this.O00000000O0000 + 36 : this.O00000000O0000, 40, SlotActionType.SWAP, O0000000000.player);
               this.O000000000(var2, var3);
            }

            O0000000000.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(var1));
            this.O00000000O00 = 3;
            this.O00000000O000 = 1;
            break;
         case 3:
            O0000O00O00O.O00000000().O000000000("AutoSwap");
            this.O00000000O00 = 0;
            this.O00000000O0000 = -1;
            O000000000O0O0 = false;
      }
   }

   private void O0000000000O0O() {
      boolean var1 = false;
      if (this.O000000000OOO0) {
         String var2 = O000000000O000.O0000000000();
         switch (var2) {
            case "Шар 2":
               var1 = this.O00000000(Items.PLAYER_HEAD, "Шар", false);
               break;
            case "Золотое яблоко 2":
               var1 = this.O00000000(Items.GOLDEN_APPLE, "Золотое яблоко", false);
               break;
            case "Тотем 2":
               var1 = this.O00000000(Items.TOTEM_OF_UNDYING, "Тотем", O000000000O0O.O0000000000());
               break;
            case "Щит 2":
               var1 = this.O00000000(Items.SHIELD, "Щит", false);
         }

         if (var1 || !this.O00000000(O000000000O000.O0000000000())) {
            this.O000000000OOO0 = false;
         }
      } else {
         String var4 = O000000000O00.O0000000000();
         switch (var4) {
            case "Шар":
               var1 = this.O00000000(Items.PLAYER_HEAD, "Шар", false);
               break;
            case "Тотем":
               var1 = this.O00000000(Items.TOTEM_OF_UNDYING, "Тотем", O000000000O0O.O0000000000());
               break;
            case "Золотое яблоко":
               var1 = this.O00000000(Items.GOLDEN_APPLE, "Золотое яблоко", false);
               break;
            case "Щит":
               var1 = this.O00000000(Items.SHIELD, "Щит", false);
         }

         if (var1 || !this.O00000000(O000000000O00.O0000000000())) {
            this.O000000000OOO0 = true;
         }
      }
   }

   private boolean O00000000(String string) {
      if (O000000000O0.O000000000("FT/RW")) {
         if ("Шар".equals(string)) {
            return true;
         }

         if ("Шар 2".equals(string)) {
            return true;
         }
      }

      return false;
   }

   private boolean O00000000(Item item, String string, boolean bl) {
      int var4 = item == Items.PLAYER_HEAD && O000000000O0.O000000000("FT/RW") ? this.O0000000000OO0() : this.O00000000(item, bl);
      if (var4 == -1) {
         return false;
      } else {
         this.O00000000(var4, string);
         return true;
      }
   }

   private boolean O00000000(int i) {
      if (i >= 0 && i < 3) {
         ItemStack var2 = this.O00000000O[i];
         String var3 = this.O000000000000(i);
         if ((!var2.isEmpty() || !var3.isEmpty()) && !this.O000000000(i)) {
            int var4 = this.O00000000(var2, var3);
            if (var4 == -1) {
               return false;
            } else {
               this.O00000000(var4, this.O0000000000(O0000000000.player.getInventory().getStack(var4), var2.getName().getString()));
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void O00000000(int i, String string) {
      this.O00000000O0000 = i;
      this.O00000000O000O = string;
      this.O00000000O00 = 1;
      O000000000O0O0 = true;
      this.O0000000000O00();
   }

   private void O0000000000OO() {
      Sprint.O000000000O000 = 2;
      O0000O00O00O.O00000000().O00000000("AutoSwap");
      O0000000000.options.sprintKey.setPressed(false);
      O0000000000.player.setSprinting(false);
   }

   private int O00000000(Item item, boolean bl) {
      if (O0000000000.player == null) {
         return -1;
      } else {
         for (int var3 = 0; var3 < 36; var3++) {
            ItemStack var4 = O0000000000.player.getInventory().getStack(var3);
            if (var4.isOf(item) && (!bl || var4.hasEnchantments() || var4.hasGlint())) {
               return var3;
            }
         }

         return -1;
      }
   }

   private int O0000000000OO0() {
      if (O0000000000.player == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 36; var1++) {
            ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
            if (this.O000000000000(var2)) {
               return var1;
            }
         }

         return -1;
      }
   }

   private int O00000000(ItemStack itemStack, String string) {
      if (O0000000000.player == null) {
         return -1;
      } else {
         for (int var3 = 0; var3 < 36; var3++) {
            ItemStack var4 = O0000000000.player.getInventory().getStack(var3);
            if (this.O00000000(var4, itemStack, string)) {
               return var3;
            }
         }

         return -1;
      }
   }

   private boolean O000000000(int i) {
      if (O0000000000.player != null && i >= 0 && i < 3 && (!this.O00000000O[i].isEmpty() || !this.O000000000000(i).isEmpty())) {
         ItemStack var2 = O0000000000.player.getOffHandStack();
         return var2 != null && !var2.isEmpty() ? this.O00000000(var2, this.O00000000O[i], this.O000000000000(i)) : false;
      } else {
         return false;
      }
   }

   private void O0000000000OOO() {
      this.O00000000O00O = true;
      this.O00000000O00OO = -1;
      this.O000000000O0();
      O000000000O0O0 = true;
      this.O00000000O0OO0 = this.O00000000O0OOO = this.O00000000OO = System.nanoTime();
      Arrays.fill(this.O00000000OO0, 0.0F);
      this.O000000000O0O();
      this.O00000000O0O0O = this.O00000000O0O0;
      this.O00000000O0OO = this.O00000000O0O00;
      if (O0000000000.mouse != null) {
         O0000000000.mouse.unlockCursor();
      }

      this.O000000000O0O0();
   }

   private void O0000000000(boolean bl) {
      if (this.O00000000O00O) {
         this.O000000000O00O();
         boolean var2 = this.O00000000O00O0;
         int var3 = var2
            ? -1
            : this.O000000000(
               this.O00000000O0O0, this.O00000000O0O00, O0000000000.getWindow().getFramebufferWidth(), O0000000000.getWindow().getFramebufferHeight()
            );
         this.O00000000O00O = false;
         this.O00000000O00OO = -1;
         this.O000000000O0();
         O000000000OOO = false;
         boolean var4 = bl && var3 != -1 && this.O00000000(var3);
         if (!var4 && this.O00000000O00 == 0) {
            O000000000O0O0 = false;
         }

         if (O0000000000.currentScreen == null && O0000000000.mouse != null) {
            O0000000000.mouse.lockCursor();
         }
      }
   }

   private void O0000000000(int i) {
      if (O0000000000.player != null && O0000000000.getWindow() != null) {
         if (this.O00000000O00O0) {
            if (i == 0) {
               this.O000000000O();
            }

            if (i == 1) {
               this.O000000000O0();
            }
         } else {
            int var2 = this.O000000000(
               this.O00000000O0O0, this.O00000000O0O00, O0000000000.getWindow().getFramebufferWidth(), O0000000000.getWindow().getFramebufferHeight()
            );
            if (var2 != -1) {
               if (i == 0) {
                  this.O00000000O00O0 = true;
                  this.O00000000O0O = var2;
                  this.O00000000O0OOO = System.nanoTime();
                  O000000000OOO = true;
               } else if (i == 1) {
                  this.O00000000O[var2] = ItemStack.EMPTY;
                  this.O00000000O0[var2] = "";
                  this.O000000000O0OO();
               }
            }
         }
      }
   }

   private void O000000000O() {
      int var1 = this.O00000000000(
         this.O00000000O0O0, this.O00000000O0O00, O0000000000.getWindow().getFramebufferWidth(), O0000000000.getWindow().getFramebufferHeight()
      );
      if (var1 >= 0 && this.O00000000O0O >= 0 && this.O00000000O0O < 3) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
         if (!var2.isEmpty()) {
            ItemStack var3 = var2.copy();
            var3.setCount(1);
            this.O00000000O[this.O00000000O0O] = var3;
            this.O00000000O0[this.O00000000O0O] = this.O0000000000(var3);
            this.O000000000O0();
            this.O000000000O0OO();
         }
      } else {
         this.O000000000O0();
      }
   }

   private void O000000000O0() {
      this.O00000000O00O0 = false;
      this.O00000000O0O = -1;
      O000000000OOO = false;
   }

   private void O000000000O00() {
      long var1 = System.nanoTime();
      float var3 = this.O00000000OO == 0L ? 0.016F : this.O00000000((float)(var1 - this.O00000000OO) / 1.0E9F, 0.001F, 0.05F);
      this.O00000000OO = var1;

      for (int var4 = 0; var4 < 3; var4++) {
         this.O00000000OO0[var4] = this.O00000000(this.O00000000OO0[var4], var4 == this.O00000000O00OO ? 1.0F : 0.0F, var3, 20.0F);
      }
   }

   private float O00000000000(int i) {
      float var2 = (float)(System.nanoTime() - this.O00000000O0OO0) / 1000000.0F - i * 24.0F;
      return this.O00000000(this.O00000000(var2 / 135.0F, 0.0F, 1.0F));
   }

   private float O000000000O000() {
      return this.O00000000(this.O00000000((float)(System.nanoTime() - this.O00000000O0OOO) / 1.2E8F, 0.0F, 1.0F));
   }

   private float O00000000(int i, int j) {
      float var3 = (float)(System.nanoTime() - this.O00000000O0OOO) / 1000000.0F - (i * 9 + j) * 3.2F;
      return this.O00000000(this.O00000000(var3 / 120.0F, 0.0F, 1.0F));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext, int i, int j) {
      for (int var5 = 0; var5 < 3; var5++) {
         AutoSwap.W29 var6 = this.O00000000(var5, i, j);
         boolean var7 = var5 == this.O00000000O00OO;
         boolean var8 = this.O000000000(var5);
         float var9 = this.O00000000000(var5);
         float var10 = this.O00000000OO0[var5];
         float var11 = var6.size * (0.86F + var9 * 0.14F + var10 * 0.035F);
         float var12 = this.O000000000(i / 2.0F, var6.centerX(), var9);
         float var13 = this.O000000000(j / 2.0F, var6.centerY(), var9);
         float var14 = var12 - var11 / 2.0F;
         float var15 = var13 - var11 / 2.0F;
         float var16 = Math.max(8.0F, var11 * 0.16F);
         int var17 = var8
            ? O0000O000OO000.O0000000000(90, 20, 26, var7 ? 180 : 135)
            : (var7 ? O0000O000OO000.O0000000000(70, 66, 28, 168) : O0000O000OO000.O0000000000(24, 26, 32, 132));
         int var18 = var8
            ? O0000O000OO000.O0000000000(44, 14, 18, var7 ? 170 : 120)
            : (var7 ? O0000O000OO000.O0000000000(34, 34, 22, 156) : O0000O000OO000.O0000000000(12, 14, 18, 118));
         int var19 = var8
            ? O0000O000OO000.O0000000000(255, 65, 75, var7 ? 230 : 190)
            : (var7 ? O0000O000OO000.O0000000000(255, 245, 110, 215) : O0000O000OO000.O0000000000(255, 255, 255, 115));
         o0000O00OO0O0.O000000000000(var9);
         o0000O00OO0O0.O00000000(
            var14,
            var15,
            var11,
            var11,
            var16,
            var7 ? 10.0F : 6.0F,
            1.5F,
            var8 ? O0000O000OO000.O0000000000(255, 55, 65, var7 ? 70 : 45) : O0000O000OO000.O0000000000(0, 0, 0, var7 ? 90 : 60)
         );
         this.O00000000(o0000O00OO0O0, var14, var15, var11, var11, var16, var17, var18, var19, var7 ? 23.0F : 60.0F, var8 ? 2.4F : (var7 ? 2.0F : 1.25F));
         if (this.O00000000O[var5].isEmpty()) {
            this.O00000000(o0000O00OO0O0, var12, var13, var11 * 0.28F, O0000O000OO000.O0000000000(255, 255, 255, var7 ? 230 : 160));
         }

         o0000O00OO0O0.O00000000000OO();
      }

      o0000O00OO0O0.O0000000000();

      for (int var24 = 0; var24 < 3; var24++) {
         ItemStack var25 = this.O00000000O[var24];
         if (!var25.isEmpty()) {
            AutoSwap.W29 var26 = this.O00000000(var24, i, j);
            float var27 = this.O00000000000(var24);
            if (!(var27 <= 0.08F)) {
               float var28 = this.O00000000OO0[var24];
               float var29 = this.O000000000(i / 2.0F, var26.centerX(), var27);
               float var30 = this.O000000000(j / 2.0F, var26.centerY(), var27);
               float var31 = (var24 == this.O00000000O00OO ? 2.85F : 2.55F) * (0.84F + var27 * 0.16F + var28 * 0.035F);
               float var32 = 16.0F * var31;
               float var33 = var26.size * (0.86F + var27 * 0.14F + var28 * 0.035F);
               float var34 = var29 - var33 * 0.5F;
               float var35 = var30 - var33 * 0.5F;
               float var36 = Math.max(8.0F, var33 * 0.16F);
               o0000O00OO0O0.O00000000(var34, var35, var33, var33, var36, var36, var36, var36);
               boolean var22 = false /* VF: Semaphore variable */;

               try {
                  var22 = true;
                  ItemRenderUtil.O00000000(
                     o0000O00OO0O0,
                     var25,
                     ItemRenderUtil.O00000000(var29 - var32 * 0.5F),
                     ItemRenderUtil.O00000000(var30 - var32 * 0.5F),
                     ItemRenderUtil.O0000000000(var31),
                     var24,
                     true,
                     var24
                  );
                  var22 = false;
               } finally {
                  if (var22) {
                     o0000O00OO0O0.O0000000000();
                     o0000O00OO0O0.O0000000000000();
                  }
               }

               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O000000000(RenderManager o0000O00OO0O0, DrawContext drawContext, int i, int j) {
      AutoSwap.W28 var5 = this.O000000000(i, j);
      float var6 = 10.0F;
      float var7 = var5.startX - var6;
      float var8 = var5.startY - var6;
      float var9 = var5.width + var6 * 2.0F;
      float var10 = var5.height + var6 * 2.0F;
      int var11 = O0000O000OO000.O0000000000(15, 15, 18, 150);
      int var12 = O0000O000OO000.O0000000000(255, 255, 255, 80);
      float var13 = this.O000000000O000();
      o0000O00OO0O0.O000000000000(var13);
      this.O00000000(o0000O00OO0O0, var7, var8, var9, var10, 10.0F, var11, O0000O000OO000.O0000000000(8, 8, 10, 130), var12, 23.0F, 1.25F);
      int var14 = this.O00000000000(this.O00000000O0O0, this.O00000000O0O00, i, j);

      for (int var15 = 0; var15 < 4; var15++) {
         for (int var16 = 0; var16 < 9; var16++) {
            int var17 = this.O0000000000(var15, var16);
            float var18 = var5.startX + var16 * (var5.slotSize + var5.gap);
            float var19 = var5.startY + var15 * (var5.slotSize + var5.gap);
            ItemStack var20 = O0000000000.player.getInventory().getStack(var17);
            boolean var21 = var17 == var14;
            boolean var22 = this.O00000000(var20);
            int var23 = var21 ? O0000O000OO000.O0000000000(255, 255, 255, 75) : O0000O000OO000.O0000000000(0, 0, 0, 75);
            int var24 = var22
               ? O0000O000OO000.O0000000000(255, 55, 65, 225)
               : (var21 ? O0000O000OO000.O0000000000(255, 245, 120, 210) : O0000O000OO000.O0000000000(255, 255, 255, 45));
            if (var21) {
               this.O00000000(
                  o0000O00OO0O0,
                  var18,
                  var19,
                  var5.slotSize,
                  var5.slotSize,
                  5.0F,
                  var23,
                  O0000O000OO000.O0000000000(0, 0, 0, 62),
                  var24,
                  23.0F,
                  var22 ? 2.0F : 1.0F
               );
            } else {
               o0000O00OO0O0.O00000000(var18, var19, var5.slotSize, var5.slotSize, 5.0F, var23);
               o0000O00OO0O0.O00000000(var18, var19, var5.slotSize, var5.slotSize, 5.0F, var24, var22 ? 2.0F : 1.0F);
            }
         }
      }

      o0000O00OO0O0.O00000000000OO();
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(var7, var8, var9, var10, 10.0F, 10.0F, 10.0F, 10.0F);
      boolean var27 = false /* VF: Semaphore variable */;

      try {
         var27 = true;

         for (int var29 = 0; var29 < 4; var29++) {
            for (int var30 = 0; var30 < 9; var30++) {
               int var31 = this.O0000000000(var29, var30);
               ItemStack var32 = O0000000000.player.getInventory().getStack(var31);
               if (!var32.isEmpty()) {
                  float var33 = this.O00000000(var29, var30);
                  if (!(var33 <= 0.05F)) {
                     float var34 = var5.slotSize / 22.0F * (0.76F + var33 * 0.24F);
                     float var35 = 16.0F * var34;
                     float var36 = var5.startX + var30 * (var5.slotSize + var5.gap) + (var5.slotSize - var35) / 2.0F;
                     float var37 = var5.startY + var29 * (var5.slotSize + var5.gap) + (var5.slotSize - var35) / 2.0F;
                     ItemRenderUtil.O00000000(
                        o0000O00OO0O0,
                        var32,
                        ItemRenderUtil.O00000000(var36),
                        ItemRenderUtil.O00000000(var37),
                        ItemRenderUtil.O0000000000(var34),
                        var31,
                        true,
                        var31
                     );
                  }
               }
            }
         }

         var27 = false;
      } finally {
         if (var27) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }

      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O0000000000000();
   }

   private int O00000000(float f, float g, int i, int j) {
      for (int var5 = 0; var5 < 3; var5++) {
         AutoSwap.W29 var6 = this.O00000000(var5, i, j);
         if (O0000O00000OO.O00000000(f, g, var6.x, var6.y, var6.size, var6.size)) {
            return var5;
         }
      }

      return -1;
   }

   private int O000000000(float f, float g, int i, int j) {
      int var5 = this.O00000000(f, g, i, j);
      return var5 != -1 ? var5 : this.O0000000000(f, g, i, j);
   }

   private int O0000000000(float f, float g, int i, int j) {
      float var5 = f - this.O00000000O0O0O;
      float var6 = g - this.O00000000O0OO;
      float var7 = this.O00000000(Math.min(i, j) * 0.035F, 18.0F, 38.0F);
      float var8 = var5 * var5 + var6 * var6;
      if (var8 < var7 * var7) {
         return -1;
      } else {
         float var9 = 1.0F / (float)Math.sqrt(var8);
         float var10 = var5 * var9;
         float var11 = var6 * var9;
         if (var11 > 0.82F && Math.abs(var10) < 0.38F) {
            return -1;
         } else {
            float var12 = -var11;
            float var13 = var10 * 0.848F + var11 * 0.53F;
            float var14 = -var10 * 0.848F + var11 * 0.53F;
            float var15 = Math.max(var12, Math.max(var13, var14));
            if (var15 < 0.45F) {
               return -1;
            } else if (var15 == var12) {
               return 0;
            } else {
               return var15 == var13 ? 1 : 2;
            }
         }
      }
   }

   private int O00000000000(float f, float g, int i, int j) {
      AutoSwap.W28 var5 = this.O000000000(i, j);

      for (int var6 = 0; var6 < 4; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            float var8 = var5.startX + var7 * (var5.slotSize + var5.gap);
            float var9 = var5.startY + var6 * (var5.slotSize + var5.gap);
            if (f >= var8 && f <= var8 + var5.slotSize && g >= var9 && g <= var9 + var5.slotSize) {
               return this.O0000000000(var6, var7);
            }
         }
      }

      return -1;
   }

   private AutoSwap.W28 O000000000(int i, int j) {
      float var3 = this.O00000000(Math.min(i, j) * 0.042F, 30.0F, 42.0F);
      float var4 = Math.max(4.0F, var3 * 0.14F);
      float var5 = var3 * 9.0F + var4 * 8.0F;
      float var6 = var3 * 4.0F + var4 * 3.0F;
      float var7 = (i - var5) / 2.0F;
      float var8 = (j - var6) / 2.0F;
      return new AutoSwap.W28(var7, var8, var3, var4, var5, var6);
   }

   private int O0000000000(int i, int j) {
      return i == 3 ? j : 9 + i * 9 + j;
   }

   private AutoSwap.W29 O00000000(int i, int j, int k) {
      float var4 = this.O00000000000(j, k);
      float var5 = j / 2.0F;
      float var6 = k / 2.0F;
      float var7 = var4 * 1.35F;
      float var8 = var4 * 1.25F;
      float var9 = var4 * 0.85F;
      float var10 = var5 - var4 / 2.0F;
      float var11 = var6 - var8 - var4 / 2.0F;
      if (i == 1) {
         var10 = var5 + var7 - var4 / 2.0F;
         var11 = var6 + var9 - var4 / 2.0F;
      } else if (i == 2) {
         var10 = var5 - var7 - var4 / 2.0F;
         var11 = var6 + var9 - var4 / 2.0F;
      }

      return new AutoSwap.W29(var10, var11, var4, Math.max(8.0F, var4 * 0.16F));
   }

   private float O00000000000(int i, int j) {
      return this.O00000000(Math.min(i, j) * 0.155F, 76.0F, 118.0F);
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, int k, int l, int m, float n, float o) {
      O0000O00000OO.O00000000(o0000O00OO0O0, f, g, h, i, j, () -> {
         o0000O00OO0O0.O00000000(f, g, h, i, j, n);
         o0000O00OO0O0.O000000000(f, g, h, i, 0.0F, k, l);
      });
      o0000O00OO0O0.O00000000(f, g, h, i, j, m, o);
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, int i) {
      float var6 = Math.max(2.0F, h * 0.16F);
      o0000O00OO0O0.O00000000(f - var6 / 2.0F, g - h / 2.0F, var6, h, var6 / 2.0F, i);
      o0000O00OO0O0.O00000000(f - h / 2.0F, g - var6 / 2.0F, h, var6, var6 / 2.0F, i);
   }

   private boolean O00000000(ItemStack itemStack) {
      if (O0000000000.player != null && itemStack != null && !itemStack.isEmpty()) {
         ItemStack var2 = O0000000000.player.getOffHandStack();
         return var2 != null && !var2.isEmpty() && this.O00000000(var2, itemStack, this.O000000000(itemStack));
      } else {
         return false;
      }
   }

   private boolean O00000000(ItemStack itemStack, ItemStack itemStack2) {
      return this.O00000000(itemStack, itemStack2, this.O000000000(itemStack2));
   }

   private boolean O00000000(ItemStack itemStack, ItemStack itemStack2, String string) {
      if (itemStack == null || itemStack.isEmpty()) {
         return false;
      } else if (itemStack2 != null && !itemStack2.isEmpty()) {
         String var5 = this.O000000000(string);
         if (!var5.isEmpty()) {
            return "ft:sphere:any".equals(var5) ? this.O000000000000(itemStack) : var5.equals(this.O000000000(itemStack));
         } else if (!O000000000O0.O000000000("FT/RW") || !itemStack2.isOf(Items.PLAYER_HEAD) && !this.O000000000000(itemStack2)) {
            return !itemStack.isOf(itemStack2.getItem())
               ? false
               : itemStack2.getComponentChanges().isEmpty() || ItemStack.areItemsAndComponentsEqual(itemStack, itemStack2);
         } else {
            return this.O000000000000(itemStack);
         }
      } else {
         String var4 = this.O000000000(string);
         return "ft:sphere:any".equals(var4) ? this.O000000000000(itemStack) : !var4.isEmpty() && var4.equals(this.O000000000(itemStack));
      }
   }

   private String O000000000000(int i) {
      if (i >= 0 && i < 3) {
         String var2 = this.O000000000(this.O00000000O0[i]);
         return !var2.isEmpty() ? var2 : this.O000000000(this.O00000000O[i]);
      } else {
         return "";
      }
   }

   private String O000000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty()) {
         String var2 = this.O00000000000(itemStack);
         if (!var2.isEmpty()) {
            return var2;
         } else {
            if (itemStack.contains(DataComponentTypes.CUSTOM_NAME)) {
               String var3 = this.O0000000000(itemStack.getName().getString());
               if (!var3.isEmpty()) {
                  return "name:" + Registries.ITEM.getId(itemStack.getItem()) + ":" + var3;
               }
            }

            return "item:" + Registries.ITEM.getId(itemStack.getItem());
         }
      } else {
         return "";
      }
   }

   private String O0000000000(ItemStack itemStack) {
      return this.O000000000(itemStack);
   }

   private String O00000000(String string, ItemStack itemStack) {
      String var3 = this.O000000000(string);
      if ("ft:sphere:any".equals(var3) && itemStack != null && !itemStack.isEmpty()) {
         String var4 = this.O000000000(itemStack);
         if (var4.startsWith("ft:sphere:") && !"ft:sphere:any".equals(var4)) {
            return var4;
         }
      }

      return var3;
   }

   private String O00000000000(ItemStack itemStack) {
      if (O000000OOOO00.O00000000(itemStack)) {
         return "ft:sphere:haos";
      } else if (O000000OOOO00.O000000000(itemStack)) {
         return "ft:sphere:titan";
      } else if (O000000OOOO00.O0000000000(itemStack)) {
         return "ft:sphere:ares";
      } else if (O000000OOOO00.O00000000000(itemStack)) {
         return "ft:sphere:besti";
      } else if (O000000OOOO00.O000000000000(itemStack)) {
         return "ft:sphere:gidra";
      } else if (O000000OOOO00.O0000000000000(itemStack)) {
         return "ft:sphere:ikara";
      } else if (O000000OOOO00.O000000000000O(itemStack)) {
         return "ft:sphere:erida";
      } else if (O000000OOOO00.O00000000000O(itemStack)) {
         return "ft:sphere:satira";
      } else if (O000000OOOO00.O00000000000O0(itemStack)) {
         return "ft:sphere:moroz";
      } else if (O000000OOOO00.O00000000000OO(itemStack)) {
         return "ft:talisman:demon";
      } else if (O000000OOOO00.O0000000000O(itemStack)) {
         return "ft:talisman:karatel";
      } else if (O000000OOOO00.O0000000000O0(itemStack)) {
         return "ft:talisman:mrak";
      } else if (O000000OOOO00.O0000000000O00(itemStack)) {
         return "ft:talisman:yaristi";
      } else if (O000000OOOO00.O0000000000O0O(itemStack)) {
         return "ft:talisman:tiran";
      } else if (O000000OOOO00.O0000000000OO(itemStack)) {
         return "ft:talisman:krushitel";
      } else if (O000000OOOO00.O0000000000OO0(itemStack)) {
         return "ft:talisman:razdor";
      } else if (O000000OOOO00.O0000000000OOO(itemStack)) {
         return "ft:talisman:sara";
      } else if (O000000OOOO00.O000000000O0(itemStack)) {
         return "ft:potion:assassin";
      } else if (O000000OOOO00.O000000000O00(itemStack)) {
         return "ft:potion:gnev";
      } else if (O000000OOOO00.O000000000O000(itemStack)) {
         return "ft:potion:hlopushka";
      } else if (O000000OOOO00.O000000000O00O(itemStack)) {
         return "ft:potion:holy_water";
      } else if (O000000OOOO00.O000000000O0O(itemStack)) {
         return "ft:potion:paladin";
      } else if (O000000OOOO00.O000000000O0O0(itemStack)) {
         return "ft:potion:radiation";
      } else if (O000000OOOO00.O000000000O0OO(itemStack)) {
         return "ft:potion:snotvornoye";
      } else if (O000000OOOO00.O000000000OO(itemStack)) {
         return "ft:item:light_dust";
      } else if (O000000OOOO00.O000000000OO0(itemStack)) {
         return "ft:item:disorientation";
      } else if (O000000OOOO00.O000000000OO00(itemStack)) {
         return "ft:item:trapka";
      } else if (O000000OOOO00.O000000000OO0O(itemStack)) {
         return "ft:item:lockpick_spheres";
      } else if (O000000OOOO00.O000000000OOO(itemStack)) {
         return "ft:item:plast";
      } else if (O000000OOOO00.O00000000O0O0O(itemStack)) {
         return "ft:item:dragon_skin";
      } else if (O000000OOOO00.O00000000O0OO(itemStack)) {
         return "ft:item:fire_whirlwind";
      } else if (O000000OOOO00.O00000000O0OO0(itemStack)) {
         return "ft:item:freezing_snowball";
      } else if (O000000OOOO00.O00000000O0OOO(itemStack)) {
         return "ft:item:gods_aura";
      } else {
         return O000000OOOO00.O00000000OO(itemStack) ? "ft:item:silver" : "";
      }
   }

   private String O000000000(String string) {
      return string == null ? "" : string.trim().toLowerCase(Locale.ROOT);
   }

   private String O0000000000(String string) {
      return string == null
         ? ""
         : string.replaceAll("§.", "").replaceAll("В§.", "").replaceAll("&.", "").replace(' ', ' ').replaceAll("\\s+", " ").trim().toLowerCase(Locale.ROOT);
   }

   private boolean O000000000000(ItemStack itemStack) {
      return itemStack != null
         && itemStack.isOf(Items.PLAYER_HEAD)
         && (this.O00000000000O(itemStack) || this.O0000000000000(itemStack) || this.O000000000000O(itemStack));
   }

   private boolean O0000000000000(ItemStack itemStack) {
      AttributeModifiersComponent var2 = (AttributeModifiersComponent)itemStack.get(DataComponentTypes.ATTRIBUTE_MODIFIERS);
      if (var2 == null) {
         return false;
      } else {
         for (Entry var4 : var2.modifiers()) {
            if (var4.slot().matches(EquipmentSlot.OFFHAND)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean O000000000000O(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty()) {
         LoreComponent var2 = (LoreComponent)itemStack.get(DataComponentTypes.LORE);
         if (var2 == null) {
            return false;
         } else {
            String var3 = this.O00000000000(I18n.translate("item.modifiers.offhand", new Object[0]));
            StringBuilder var4 = new StringBuilder();

            for (Text var6 : var2.lines()) {
               String var7 = this.O00000000000(var6.getString());
               var4.append(' ').append(var7);
               if (var7.contains("when in off hand")
                  || !var3.isEmpty() && var7.contains(var3)
                  || var7.contains("когда во второстепенной")
                  || var7.contains("коли в другій руці")
                  || var7.contains("при ношении в левой")
                  || var7.contains("в лівій руці")) {
                  return true;
               }
            }

            String var8 = var4.toString();
            return var8.contains("when in off hand")
               || !var3.isEmpty() && var8.contains(var3)
               || var8.contains("когда во второстепенной")
               || var8.contains("коли в другій руці")
               || var8.contains("при ношении в левой")
               || var8.contains("в лівій руці");
         }
      } else {
         return false;
      }
   }

   private boolean O00000000000O(ItemStack itemStack) {
      if (O0000000000.player != null && O0000000000.world != null) {
         try {
            for (Text var3 : itemStack.getTooltip(TooltipContext.create(O0000000000.world), O0000000000.player, Default.BASIC)) {
               if (this.O000000000000(this.O00000000000(var3.getString()))) {
                  return true;
               }
            }

            return false;
         } catch (Throwable var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   private String O00000000000(String string) {
      return string == null ? "" : string.replaceAll("§[0-9a-fk-orA-FK-OR]", "").replace(' ', ' ').replaceAll("\\s+", " ").trim().toLowerCase(Locale.ROOT);
   }

   private boolean O000000000000(String string) {
      String var2 = this.O00000000000(I18n.translate("item.modifiers.offhand", new Object[0]));
      return string.contains("when in off hand")
         || !var2.isEmpty() && string.contains(var2)
         || string.contains("когда во второстепенной")
         || string.contains("коли в другій руці")
         || string.contains("при ношении в левой")
         || string.contains("в лівій руці");
   }

   private void O000000000O00O() {
      if (O0000000000.getWindow() != null) {
         double[] var1 = new double[1];
         double[] var2 = new double[1];
         GLFW.glfwGetCursorPos(O0000000000.getWindow().getHandle(), var1, var2);
         this.O00000000((float)var1[0], (float)var2[0]);
      }
   }

   private void O000000000O0O() {
      Window var1 = O0000000000.getWindow();
      if (var1 != null && !var1.hasZeroWidthOrHeight() && var1.getFramebufferWidth() > 0 && var1.getFramebufferHeight() > 0) {
         this.O00000000O0O0 = var1.getFramebufferWidth() * 0.5F;
         this.O00000000O0O00 = var1.getFramebufferHeight() * 0.5F;
      }
   }

   private void O000000000O0O0() {
      Window var1 = O0000000000.getWindow();
      if (var1 != null && !var1.hasZeroWidthOrHeight() && var1.getWidth() > 0 && var1.getHeight() > 0) {
         GLFW.glfwSetCursorPos(var1.getHandle(), var1.getWidth() * 0.5, var1.getHeight() * 0.5);
      }
   }

   private void O00000000(float f, float g) {
      if (Float.isFinite(f) && Float.isFinite(g)) {
         Window var3 = O0000000000.getWindow();
         if (var3 != null
            && !var3.hasZeroWidthOrHeight()
            && var3.getFramebufferWidth() > 0
            && var3.getFramebufferHeight() > 0
            && var3.getWidth() > 0
            && var3.getHeight() > 0) {
            this.O00000000O0O0 = this.O00000000(
               (float)((double)(f * var3.getFramebufferWidth()) / var3.getWidth()), 0.0F, Math.max(0.0F, var3.getFramebufferWidth() - 1.0F)
            );
            this.O00000000O0O00 = this.O00000000(
               (float)((double)(g * var3.getFramebufferHeight()) / var3.getHeight()), 0.0F, Math.max(0.0F, var3.getFramebufferHeight() - 1.0F)
            );
            return;
         }

         this.O00000000O0O0 = f;
         this.O00000000O0O00 = g;
      }
   }

   private boolean O0000000000000(int i) {
      if (O0000000000.getWindow() == null) {
         return false;
      } else {
         long var2 = O0000000000.getWindow().getHandle();
         if (i >= 0) {
            return InputUtil.isKeyPressed(var2, i);
         } else if (i > -100) {
            return false;
         } else {
            int var4 = -i - 100;
            return var4 >= 0 && var4 <= 7 && GLFW.glfwGetMouseButton(var2, var4) == 1;
         }
      }
   }

   private void O000000000(ItemStack itemStack, String string) {
      NotificationsHud.O00000000(itemStack, string, 2200L);
   }

   private void O000000000O0OO() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }
   }

   private String O0000000000(ItemStack itemStack, String string) {
      if (itemStack == null || itemStack.isEmpty()) {
         return string;
      } else if (O000000OOOO00.O00000000(itemStack)) {
         return "Сфера Хаоса";
      } else if (O000000OOOO00.O000000000(itemStack)) {
         return "Сфера Титана";
      } else if (O000000OOOO00.O0000000000(itemStack)) {
         return "Сфера Ареса";
      } else if (O000000OOOO00.O00000000000(itemStack)) {
         return "Сфера Бестии";
      } else if (O000000OOOO00.O000000000000(itemStack)) {
         return "Сфера Гидры";
      } else if (O000000OOOO00.O0000000000000(itemStack)) {
         return "Сфера Икара";
      } else if (O000000OOOO00.O000000000000O(itemStack)) {
         return "Сфера Эрида";
      } else if (O000000OOOO00.O00000000000O(itemStack)) {
         return "Сфера Сатира";
      } else if (O000000OOOO00.O00000000000O0(itemStack)) {
         return "Сфера Мороз";
      } else if (O000000OOOO00.O00000000000OO(itemStack)) {
         return "Талисман Демона";
      } else if (O000000OOOO00.O0000000000O(itemStack)) {
         return "Талисман Карателя";
      } else if (O000000OOOO00.O0000000000O0(itemStack)) {
         return "Талисман Мрака";
      } else if (O000000OOOO00.O0000000000O00(itemStack)) {
         return "Талисман Ярости";
      } else if (O000000OOOO00.O0000000000O0O(itemStack)) {
         return "Талисман Тирана";
      } else if (O000000OOOO00.O0000000000OO(itemStack)) {
         return "Талисман Крушителя";
      } else if (O000000OOOO00.O0000000000OO0(itemStack)) {
         return "Талисман Раздора";
      } else {
         return itemStack.contains(DataComponentTypes.CUSTOM_NAME) ? itemStack.getName().getString() : string;
      }
   }

   private void O000000000OO() {
      boolean var1 = this.O00000000O00O;
      if (this.O00000000O00 > 0) {
         O0000O00O00O.O00000000().O000000000("AutoSwap");
      }

      this.O00000000O00O = false;
      this.O00000000O00OO = -1;
      this.O000000000O0();
      O000000000OOO = false;
      this.O00000000O00 = 0;
      this.O00000000O000 = 0;
      this.O00000000O0000 = -1;
      O000000000O0O0 = false;
      if (var1 && O0000000000.currentScreen == null && O0000000000.mouse != null) {
         O0000000000.mouse.lockCursor();
      }
   }

   @Override
   public JsonObject b_() {
      JsonObject var1 = super.b_();
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (int var4 = 0; var4 < 3; var4++) {
         JsonObject var5 = new JsonObject();
         ItemStack var6 = this.O00000000O[var4];
         if (var6 != null && !var6.isEmpty()) {
            var5.addProperty("item", Registries.ITEM.getId(var6.getItem()).toString());
            String var7 = this.O000000000000(var4);
            if (!var7.isEmpty()) {
               var5.addProperty("key", var7);
            }

            ItemStack var8 = var6.copy();
            var8.setCount(1);
            ItemStack.CODEC.encodeStart(this.O000000000OO0(), var8).result().ifPresent(jsonElement -> var5.add("stack", jsonElement));
         }

         var3.add(var5);
      }

      var2.add("Slots", var3);
      var1.add("AutoSwapTrio", var2);
      return var1;
   }

   @Override
   public void O00000000(JsonObject jsonObject) {
      super.O00000000(jsonObject);
      if (jsonObject != null && jsonObject.has("AutoSwapTrio") && jsonObject.get("AutoSwapTrio").isJsonObject()) {
         JsonObject var2 = jsonObject.getAsJsonObject("AutoSwapTrio");
         if (var2.has("Slots") && var2.get("Slots").isJsonArray()) {
            ItemStack[] var3 = new ItemStack[]{ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY};
            String[] var4 = new String[]{"", "", ""};
            JsonArray var5 = var2.getAsJsonArray("Slots");

            for (int var6 = 0; var6 < Math.min(3, var5.size()); var6++) {
               JsonElement var7 = var5.get(var6);
               if (var7 != null && var7.isJsonObject()) {
                  JsonObject var8 = var7.getAsJsonObject();
                  if (var8.has("key")) {
                     var4[var6] = this.O000000000(var8.get("key").getAsString());
                  }

                  if (var8.has("stack")) {
                     ItemStack var9 = ItemStack.CODEC.parse(this.O000000000OO0(), var8.get("stack")).result().orElse(ItemStack.EMPTY);
                     if (!var9.isEmpty()) {
                        var9.setCount(1);
                        var3[var6] = var9;
                        var4[var6] = this.O00000000(var4[var6], var9);
                        if (var4[var6].isEmpty()) {
                           var4[var6] = this.O0000000000(var9);
                        }
                        continue;
                     }
                  }

                  if (var8.has("item")) {
                     Identifier var12 = Identifier.tryParse(var8.get("item").getAsString());
                     if (var12 != null) {
                        Item var10 = (Item)Registries.ITEM.get(var12);
                        if (var10 != Items.AIR) {
                           var3[var6] = new ItemStack(var10);
                           if (var4[var6].isEmpty()) {
                              var4[var6] = var10 == Items.PLAYER_HEAD && O000000000O0.O000000000("FT/RW") ? "ft:sphere:any" : this.O0000000000(var3[var6]);
                           }
                        }
                     }
                  }
               }
            }

            for (int var11 = 0; var11 < 3; var11++) {
               this.O00000000O[var11] = var3[var11];
               this.O00000000O0[var11] = var4[var11];
            }
         }
      }
   }

   private DynamicOps<JsonElement> O000000000OO0() {
      if (O0000000000.world != null) {
         return O0000000000.world.getRegistryManager().getOps(JsonOps.INSTANCE);
      } else {
         return O0000000000.getNetworkHandler() != null
            ? O0000000000.getNetworkHandler().getRegistryManager().getOps(JsonOps.INSTANCE)
            : BuiltinRegistries.createWrapperLookup().getOps(JsonOps.INSTANCE);
      }
   }

   @Override
   public void O000000000() {
      this.O000000000OO();
      super.O000000000();
   }

   private float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private float O00000000(float f, float g, float h, float i) {
      return f + (g - f) * (1.0F - (float)Math.exp(-i * h));
   }

   private float O00000000(float f) {
      float var2 = 1.0F - this.O00000000(f, 0.0F, 1.0F);
      return 1.0F - var2 * var2 * var2;
   }

   private float O000000000(float f, float g, float h) {
      return f + (g - f) * h;
   }

   record W28(float startX, float startY, float slotSize, float gap, float width, float height) {
   }

   record W29(float x, float y, float size, float radius) {

      float centerX() {
         return this.x + this.size / 2.0F;
      }

      float centerY() {
         return this.y + this.size / 2.0F;
      }
   }
}
