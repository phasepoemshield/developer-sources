package org.zenith.module;

import org.zenith.core.ProfileItemBuilder;
import org.zenith.core.ItemRegistry;
import org.zenith.core.CloudApiClient;
import org.zenith.event.Event12;
import org.zenith.event.EventInjectHandleInputEvents;
import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.event.RefreshCacheEvent;
import org.zenith.rotation.Rotation;
import org.zenith.rotation.RotationMLStrategy2;
import org.zenith.setting.Setting;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.util.ArgbColor;
import org.zenith.module.Category;
import org.zenith.util.CooldownTimer;
import org.zenith.util.ItemCountUtils;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.rotation.RotationManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.config.ProtocolMessage;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.StyledTextBuilder;

import org.zenith.event.EventTick;
import org.zenith.event.EventTriggerKeyEvent;
import org.zenith.event.GameMessageEvent;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.ColorSetting;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;
import org.zenith.setting.StringSetting2;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;

@ModuleInfo(
   name = "AH Helper",
   category = Category.PLAYER,
   description = "\u0420\u0457\u0420\u0455\u0420\u0458\u0420\u0455\u0421\u2030\u0420\u0405\u0420\u0451\u0420\u0454 \u0420\u0406 \u0420\u0457\u0420\u0455\u0420\u0451\u0421\u0403\u0420\u0454\u0420\u00b5 \u0420\u0491\u0420\u00b5\u0421\u20ac\u0420\u00b5\u0420\u0406\u0421\u2039\u0421\u2026 \u0420\u0457\u0421\u0402\u0420\u00b5\u0420\u0491\u0420\u0458\u0420\u00b5\u0421\u201a\u0420\u0455\u0420\u0406"
)
public final class AHHelper extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AHHelper aHHelper = new AHHelper();
   public final ColorSetting cheapSlotColor = new ColorSetting(
      "module.ahHelper.cheapSlotColor", "module.ahHelper.cheapSlotColor.desc", new ArgbColor(64, 255, 64, 140)
   );
   public final ColorSetting goodSlotColor = new ColorSetting(
      "module.ahHelper.goodSlotColor", "module.ahHelper.goodSlotColor.desc", new ArgbColor(255, 255, 64, 140)
   );
   public final ModeSetting3 serverMode = new ModeSetting3(
      "module.ahHelper.serverMode",
      "module.ahHelper.serverMode.desc",
      "module.ahHelper.serverAuto",
      "module.ahHelper.serverHolyWorld",
      "module.ahHelper.serverFunTime"
   );
   public final BooleanSetting autoConfirm = new BooleanSetting(
      "module.ahHelper.autoConfirm", "module.ahHelper.autoConfirm.desc", true, this::call003
   );
   public final BooleanSetting fixCount = new BooleanSetting(
      "module.ahHelper.fixCount", "module.ahHelper.fixCount.desc", true, this::call003
   );
   public final ModeSetting3 priceFind = new ModeSetting3(
      "module.ahHelper.priceFind",
      "module.ahHelper.priceFind.desc",
      this::call003,
      "module.ahHelper.priceFindAutoSell",
      "module.ahHelper.priceFindSearch"
   );
   public final NumberSetting discount = new NumberSetting(
      "module.ahHelper.discount", 0.95F, 0.1F, 1.0F, 0.01F, "module.ahHelper.discount.desc", "x", this::call003, null
   );
   public final StringSetting2 sellKeyHw = new StringSetting2(
      "module.ahHelper.sellKeyHw", "module.ahHelper.sellKeyHw.desc", -1, this::call003
   );
   public final CooldownTimer zClass067 = new CooldownTimer();
   public final CooldownTimer zClass0672 = new CooldownTimer();
   public AHHelper_Var159 aHHelperVar159 = AHHelper_Var159.val159;
   public ItemStack itemStack = ItemStack.EMPTY;
   public long longField = -1L;
   public int intField = 1;

   public AHHelper() {
   }

   @Override
   public void onEnable() {
      this.float43();
      super.onEnable();
   }

   @Override
   public void onDisable() {
      this.float43();
      super.onDisable();
   }

   @EventTarget
   public void on23(EventTriggerKeyEvent var1) {
      if (this.isEnabled() && this.call003() && this.sellKeyHw.getKeyCode() != -1) {
         if (var1.ItemRegistry(this.sellKeyHw.getKeyCode())) {
            this.float36();
         }
      }
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (this.isEnabled() && minecraftClient3.player != null && minecraftClient3.getNetworkHandler() != null) {
         switch (this.aHHelperVar159) {
            case val340:
               this.float38();
               break;
            case val341:
               this.float40();
         }
      }
   }

   @EventTarget
   public void UiAnimation(GameMessageEvent var1) {
      if ((
            this.autoConfirm.isVisible() && this.autoConfirm.isEnabled()
               || this.aHHelperVar159 == AHHelper_Var159.val342
         )
         && var1.InventorySetting().getString().startsWith("\u25b6 \u0412\u0432\u0435\u0434\u0438\u0442\u0435 /ah sell auto confirm,")) {
         minecraftClient3.getNetworkHandler().sendChatCommand("ah sell auto confirm");
         this.aHHelperVar159 = AHHelper_Var159.val159;
      }
   }

   public void on23(DrawContext var1, Slot var2) {
      this.on23(var1, 0, 0, var2, true);
   }

   public void UiAnimation(DrawContext var1, Slot var2) {
      this.on23(var1, 0, 0, var2, false);
   }

   public void on23(DrawContext var1, int var2, int var3, Slot var4, boolean var5) {
      int i = var5 ? this.cheapSlotColor.getIntColor() : this.goodSlotColor.getIntColor();
      int j = var2 + var4.x;
      int k = var3 + var4.y;
      var1.fill(j, k, j + 16, k + 16, i);
   }

   public void float36() {
      if (this.aHHelperVar159 == AHHelper_Var159.val159 && this.call003()) {
         ItemStack itemstack = minecraftClient3.player.getMainHandStack();
         if (itemstack != null && !itemstack.isEmpty()) {
            this.itemStack = itemstack.copy();
            this.longField = -1L;
            this.intField = 1;
            this.float37();
            this.zClass067.reset();
            this.zClass0672.reset();
         } else {
            StyledTextBuilder.RotationMLStrategy2(
               "\u0412\u043e\u0437\u044c\u043c\u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442 \u0432 \u0440\u0443\u043a\u0443"
            );
         }
      }
   }

   public void float37() {
      if (minecraftClient3.getNetworkHandler() != null && this.call003()) {
         if (this.priceFind.is(0)) {
            minecraftClient3.getNetworkHandler().sendCommand("ah sell auto");
            this.aHHelperVar159 = AHHelper_Var159.val342;
         } else {
            minecraftClient3.getNetworkHandler().sendCommand("ah search");
            this.aHHelperVar159 = AHHelper_Var159.val340;
         }
      }
   }

   public void float38() {
      if (this.zClass0672.EventModifyMouseRotationInput(250L)) {
         if (!this.float39()) {
            if (this.zClass067.EventModifyMouseRotationInput(5000L)) {
               this.RotationManager("\u0410\u0443\u043a\u0446\u0438\u043e\u043d \u043d\u0435 \u043e\u0442\u043a\u0440\u044b\u043b\u0441\u044f");
            }
         } else {
            Integer integer = this.float41();
            if (integer == null) {
               if (this.zClass067.EventModifyMouseRotationInput(5000L)) {
                  this.RotationManager(
                     "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \u0446\u0435\u043d\u0443 \u043d\u0430 \u0430\u0443\u043a\u0446\u0438\u043e\u043d\u0435"
                  );
               }
            } else {
               this.longField = Math.max(1L, (long)Math.round((float)integer.intValue() * this.discount.getCurrent()));
               this.closeScreen();
               StyledTextBuilder.RefreshCacheEvent("\u041d\u0430\u0439\u0434\u0435\u043d\u0430 \u0446\u0435\u043d\u0430: " + this.longField);
               this.aHHelperVar159 = AHHelper_Var159.val341;
               this.zClass067.reset();
               this.zClass0672.reset();
            }
         }
      }
   }

   public void RotationManager(String var1) {
      StyledTextBuilder.RotationMLStrategy2(var1);
      this.closeScreen();
      this.float43();
   }

   public void closeScreen() {
      if (minecraftClient3.player != null && minecraftClient3.currentScreen != null) {
         minecraftClient3.player.closeHandledScreen();
      }
   }

   public boolean float39() {
      return minecraftClient3.player != null
         && minecraftClient3.player.currentScreenHandler != null
         && ItemCountUtils.ProfileItemBuilder(minecraftClient3.player.currentScreenHandler);
   }

   public void float40() {
      if (this.longField > 0L && minecraftClient3.getNetworkHandler() != null) {
         ItemStack itemstack = minecraftClient3.player.getMainHandStack();
         if (itemstack.isEmpty() || !ItemStack.areItemsAndComponentsEqual(itemstack, this.itemStack)) {
            this.RotationManager(
               "\u0414\u0435\u0440\u0436\u0438 \u0442\u043e\u0442 \u0436\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442 \u0432 \u0440\u0443\u043a\u0435"
            );
         } else if (minecraftClient3.currentScreen == null || this.zClass067.EventModifyMouseRotationInput(1500L)) {
            if (this.zClass0672.EventModifyMouseRotationInput(250L)) {
               minecraftClient3.getNetworkHandler().sendCommand("ah sell " + this.longField);
               this.float43();
            }
         }
      } else {
         this.float43();
      }
   }

   public Integer float41() {
      if (!this.float39()) {
         return null;
      } else {
         var arraylist = new ArrayList();
         int i = Math.min(45, minecraftClient3.player.currentScreenHandler.slots.size());

         for (int j = 0; j < i; j++) {
            Slot slot = minecraftClient3.player.currentScreenHandler.getSlot(j);
            ItemStack itemstack = slot.getStack();
            if (!itemstack.isEmpty() && !ItemCountUtils.Event12(itemstack)) {
               long k = this.ProtocolMessage(itemstack);
               if (k != Long.MAX_VALUE) {
                  arraylist.add((int)Math.min(2147483647L, k));
               }
            }
         }

         if (arraylist.isEmpty()) {
            return null;
         } else {
            arraylist.sort(Comparator.naturalOrder());
            int l = Math.min(Math.max(0, this.intField - 1), arraylist.size() - 1);
            return (Integer)arraylist.get(l) * Math.max(1, this.itemStack.getCount());
         }
      }
   }

   public long ProtocolMessage(ItemStack var1) {
      int i = ItemCountUtils.EventInjectHandleInputEvents(var1);
      if (i == Integer.MAX_VALUE) {
         return Long.MAX_VALUE;
      } else {
         LoreComponent lorecomponent = var1.get(DataComponentTypes.LORE);
         return lorecomponent != null
               && lorecomponent.styledLines()
                  .stream()
                  .map(Text::getString)
                  .collect(Collectors.joining())
                  .contains("\u0442\u043e\u043b\u044c\u043a\u043e \u043f\u043e\u043b\u043d\u043e\u0441\u0442\u044c\u044e.")
            ? Long.MAX_VALUE
            : (long)(i / var1.getCount());
      }
   }

   public boolean call003() {
      return val003.CloudApiClient().call003();
   }

   public boolean float42() {
      return this.fixCount.isEnabled() && this.fixCount.isVisible();
   }

   public void float43() {
      this.aHHelperVar159 = AHHelper_Var159.val159;
      this.itemStack = ItemStack.EMPTY;
      this.longField = -1L;
      this.intField = 1;
      this.zClass067.reset();
      this.zClass0672.reset();
   }

   public ColorSetting float44() {
      return this.cheapSlotColor;
   }

   public ColorSetting float45() {
      return this.goodSlotColor;
   }

   public ModeSetting3 float46() {
      return this.serverMode;
   }

   public BooleanSetting float47() {
      return this.autoConfirm;
   }

   public BooleanSetting float48() {
      return this.fixCount;
   }

   public ModeSetting3 float49() {
      return this.priceFind;
   }

   public NumberSetting float50() {
      return this.discount;
   }

   public StringSetting2 float51() {
      return this.sellKeyHw;
   }

   public CooldownTimer float52() {
      return this.zClass067;
   }

   public CooldownTimer call144() {
      return this.zClass0672;
   }

   public AHHelper_Var159 call145() {
      return this.aHHelperVar159;
   }

   public ItemStack call146() {
      return this.itemStack;
   }

   public long call147() {
      return this.longField;
   }

   public int call112() {
      return this.intField;
   }
}
