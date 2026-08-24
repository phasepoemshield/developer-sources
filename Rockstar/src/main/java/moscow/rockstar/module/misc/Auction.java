package moscow.rockstar.module.misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moscow.rockstar.Rockstar;
import moscow.rockstar.framework.base.CustomDrawContext;
import moscow.rockstar.framework.base.UIContext;
import moscow.rockstar.framework.objects.BorderRadius;
import moscow.rockstar.framework.objects.MouseButton;
import moscow.rockstar.framework.objects.gradient.impl.VerticalGradient;
import moscow.rockstar.mixin.accessors.HandledScreenAccessor;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.render.HudRenderEvent;
import moscow.rockstar.systems.event.impl.render.ScreenRenderEvent;
import moscow.rockstar.systems.event.impl.window.ContainerClickEvent;
import moscow.rockstar.systems.event.impl.window.ContainerReleaseEvent;
import moscow.rockstar.systems.event.impl.window.KeyPressEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.Setting;
import moscow.rockstar.config.settings.BindSetting;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.SelectSetting;
import moscow.rockstar.config.settings.StringSetting;
import moscow.rockstar.systems.notifications.NotificationType;
import moscow.rockstar.ui.components.popup.Popup;
import moscow.rockstar.ui.menu.dropdown.components.settings.impl.SelectSettingComponent;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.gui.GuiUtility;
import moscow.rockstar.util.inventory.EnchantmentUtility;
import moscow.rockstar.util.time.Timer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.PotionItem;
import net.minecraft.item.Item.TooltipContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
@ModuleInfo(name = "Auction", category = ModuleCategory.OTHER, desc = "Автоматизация аукциона (продажа/покупка предметов)")
public class Auction extends BaseModule {
   private static final Pattern PAGE_PATTERN = Pattern.compile("\\b(\\d+)\\s*/\\s*(\\d+)\\b");
   private final List<Auction.AuctionItem> pageItems = new ArrayList<>();
   private double averageEffectivePrice = 0.0;
   private double minEffectivePrice = Double.MAX_VALUE;
   private String title = "";
   private final BooleanSetting autoSell = new BooleanSetting(this, "Автопродажа");
   private final StringSetting autoSellPages = new StringSetting(this, "Страницы для автопродажи", this.autoSell::isEnabled).text("1");
   private final BindSetting autoSellBind = new BindSetting(this, "Клавиша автопродажи", this.autoSell::isEnabled);
   private final Timer autoSellTimer = new Timer();
   private final Timer autoSellTimeout = new Timer();
   private final List<Auction.PriceSample> autoSellSamples = new ArrayList<>();
   private Auction.AutoSellState autoSellState = Auction.AutoSellState.IDLE;
   private Item autoSellItem;
   private ItemStack autoSellStack = ItemStack.EMPTY;
   private String autoSellSearchName = "";
   private int autoSellPagesTarget = 1;
   private int autoSellCurrentPage = 0;
   private int autoSellExpectedPage = -1;
   private final SelectSetting armor = new SelectSetting(
      this,
      "Фильтры брони",
      () -> this.title.toLowerCase().contains("кирка") || this.title.toLowerCase().contains("силы") || this.title.toLowerCase().contains("скорости")
   );
   private final SelectSetting.Value noSpike = new SelectSetting.Value(this.armor, "Без шипов").select();
   private final SelectSetting.Value noProt5 = new SelectSetting.Value(this.armor, "Без защиты 5").select();
   private final SelectSetting.Value noDurability = new SelectSetting.Value(this.armor, "Без прочности");
   private final SelectSetting.Value noRepair = new SelectSetting.Value(this.armor, "Без починки");
   private final SelectSetting pickaxe = new SelectSetting(
      this,
      "Фильтры кирок",
      () -> this.title.toLowerCase().contains("шлем")
         || this.title.toLowerCase().contains("нагрудник")
         || this.title.toLowerCase().contains("поножи")
         || this.title.toLowerCase().contains("ботинки")
         || this.title.toLowerCase().contains("броня")
         || this.title.toLowerCase().contains("силы")
         || this.title.toLowerCase().contains("скорости")
   );
   private final SelectSetting.Value noSilkTouch = new SelectSetting.Value(this.pickaxe, "Без шелкового касания");
   private final SelectSetting potions = new SelectSetting(
      this,
      "Фильтры зелий",
      () -> this.title.toLowerCase().contains("шлем")
         || this.title.toLowerCase().contains("нагрудник")
         || this.title.toLowerCase().contains("поножи")
         || this.title.toLowerCase().contains("ботинки")
         || this.title.toLowerCase().contains("броня")
         || this.title.toLowerCase().contains("кирка")
   );
   private final SelectSetting.Value noLevel3 = new SelectSetting.Value(this.potions, "Без уровня 3");
   private final SelectSetting.Value noCombined = new SelectSetting.Value(this.potions, "Без комбинированных");
   private final Popup popup = new Popup(0.0F, 0.0F);
   private final EventListener<HudRenderEvent> onHud = event -> {
      if (mc.currentScreen == null) {
         this.title = "";
         this.popup.setShowing(false);
         if (this.popup.getAnimation().getValue() > 0.0F) {
            this.drawPopup(event.getContext());
         }
      }
   };
   private final EventListener<ScreenRenderEvent> onScreen = event -> {
      if (!this.pageItems.isEmpty() && mc.currentScreen instanceof HandledScreen screen) {
         if (this.isAuction(screen.getTitle().getString())) {
            this.popup.setShowing(true);
            HandledScreenAccessor accessor = (HandledScreenAccessor)screen;

            try {
               for (Auction.AuctionItem item : this.pageItems) {
                  if (!(item.effectivePrice > this.averageEffectivePrice)) {
                     Slot slotToHighlight = screen.getScreenHandler().getSlot(item.slotId);
                     if (slotToHighlight != null) {
                        int x = accessor.getX() + slotToHighlight.x;
                        int y = accessor.getY() + slotToHighlight.y;
                        ColorRGBA color = this.calculateHighlightColor(item.effectivePrice);
                        event.getContext()
                           .drawRoundedRect(
                              (float)x,
                              (float)y,
                              16.0F,
                              16.0F,
                              BorderRadius.all(1.0F),
                              new VerticalGradient(color.withAlpha(0.0F), color.withAlpha(0.8F * color.getAlpha()))
                           );
                     }
                  }
               }
            } catch (Exception var10) {
               this.reset();
            }

            this.drawPopup(event.getContext());
         }
      }
   };
   private final EventListener<ContainerClickEvent> onClick = event -> this.popup
      .onMouseClicked(event.getX(), event.getY(), MouseButton.fromButtonIndex(event.getButton()));
   private final EventListener<ContainerReleaseEvent> onRelease = event -> this.popup
      .onMouseReleased(event.getX(), event.getY(), MouseButton.fromButtonIndex(event.getButton()));
   private final EventListener<KeyPressEvent> onKeyPress = event -> {
      if (event.getAction() == 1 && this.autoSellBind.isKey(event.getKey())) {
         this.startAutoSell();
      }
   };

   public Auction() {
      for (Setting setting : this.getSettings()) {
         if (setting instanceof SelectSetting selectSetting) {
            this.popup.add(new SelectSettingComponent(selectSetting, this.popup));
         }
      }
   }

   @Override
   public void tick() {
      if (this.autoSellState != Auction.AutoSellState.IDLE) {
         this.processAutoSell();
      }

      if (mc.currentScreen instanceof HandledScreen<?> screen) {
         String var3 = screen.getTitle().getString();
         this.title = var3;
         if (!this.isAuction(var3)) {
            this.reset();
         } else {
            this.scanAndAnalyzePage(screen);
            super.tick();
         }
      } else {
         this.reset();
      }
   }

   private void drawPopup(CustomDrawContext orig) {
      UIContext context = UIContext.of(
         orig,
         mc.currentScreen == null ? -1 : (int)GuiUtility.getMouse().getX(),
         mc.currentScreen == null ? -1 : (int)GuiUtility.getMouse().getY(),
         MinecraftClient.getInstance().getRenderTickCounter().getTickDelta(false)
      );
      this.popup.setWidth(120.0F);
      this.popup.pos(10.0F, sr.getScaledHeight() / 2.0F - this.popup.getHeight() / 2.0F);
      this.popup.render(context);
   }

   private ColorRGBA calculateHighlightColor(double effectivePrice) {
      double range = this.averageEffectivePrice - this.minEffectivePrice;
      double factor = range > 0.0 ? (effectivePrice - this.minEffectivePrice) / range : 0.0;
      factor = Math.max(0.0, Math.min(1.0, factor));
      int red = (int)(60.0 + 195.0 * factor);
      return new ColorRGBA(factor < 0.001F ? red : 255.0F, 255.0F, 60.0F, (float)(250.0 * (1.0 - factor)));
   }

   private boolean isAuction(String title) {
      return title.toLowerCase().contains("аукцион") || title.toLowerCase().contains("поиск") || title.toLowerCase().contains("биржа");
   }

   @Override
   public void onDisable() {
      this.reset();
      this.resetAutoSell();
      super.onDisable();
   }

   private void startAutoSell() {
      if (!this.autoSell.isEnabled() || mc.player == null || mc.world == null) {
         return;
      }

      ItemStack handStack = mc.player.getMainHandStack();
      if (handStack.isEmpty()) {
         Rockstar.getInstance().getNotificationManager().addNotificationOther(NotificationType.ERROR, "Аукцион", "Возьмите предмет в руку");
         return;
      }

      this.autoSellItem = handStack.getItem();
      this.autoSellStack = handStack.copy();
      this.autoSellSearchName = handStack.getName().getString().trim();
      if (this.autoSellSearchName.isEmpty()) {
         Rockstar.getInstance().getNotificationManager().addNotificationOther(NotificationType.ERROR, "Аукцион", "Не удалось получить название предмета");
         return;
      }

      this.autoSellPagesTarget = this.parseAutoSellPages();
      this.autoSellCurrentPage = 0;
      this.autoSellExpectedPage = -1;
      this.autoSellSamples.clear();
      this.autoSellState = Auction.AutoSellState.SEARCH_SEND;
      this.autoSellTimer.reset();
      this.autoSellTimeout.reset();
   }

   private void processAutoSell() {
      if (mc.player == null || mc.world == null) {
         this.resetAutoSell();
         return;
      }

      switch (this.autoSellState) {
         case SEARCH_SEND -> this.sendAutoSellSearch();
         case PRICE_PARSE_WAIT -> this.parseAutoSellPrices();
         case PAGE_CHANGE_WAIT -> this.waitAutoSellPage();
         default -> this.resetAutoSell();
      }
   }

   private void sendAutoSellSearch() {
      if (!this.autoSellTimer.finished(100L)) {
         return;
      }

      this.closeOpenScreen();
      mc.player.networkHandler.sendChatCommand("ah search " + this.autoSellSearchName);
      this.autoSellState = Auction.AutoSellState.PRICE_PARSE_WAIT;
      this.autoSellTimer.reset();
      this.autoSellTimeout.reset();
   }

   private void parseAutoSellPrices() {
      ScreenHandler handler = this.getOpenContainer();
      if (handler == null) {
         if (this.autoSellTimeout.finished(5000L)) {
            Rockstar.getInstance().getNotificationManager().addNotificationOther(NotificationType.ERROR, "Аукцион", "Не удалось открыть аукцион");
            this.resetAutoSell();
         }
         return;
      }

      if (!this.autoSellTimer.finished(100L)) {
         return;
      }

      this.autoSellCurrentPage++;
      this.autoSellSamples.addAll(this.collectPriceSamples(handler));
      if (this.autoSellCurrentPage >= this.autoSellPagesTarget) {
         this.finishAutoSell();
         return;
      }

      Auction.PageInfo pageInfo = this.readPageInfo(handler);
      if (pageInfo != null && pageInfo.current >= pageInfo.total) {
         this.finishAutoSell();
         return;
      }

      int nextSlot = this.findNextPageSlot(handler);
      if (nextSlot == -1) {
         this.finishAutoSell();
         return;
      }

      this.autoSellExpectedPage = pageInfo == null ? -1 : pageInfo.current + 1;
      mc.interactionManager.clickSlot(handler.syncId, nextSlot, 0, SlotActionType.PICKUP, mc.player);
      this.autoSellState = Auction.AutoSellState.PAGE_CHANGE_WAIT;
      this.autoSellTimer.reset();
      this.autoSellTimeout.reset();
   }

   private void waitAutoSellPage() {
      ScreenHandler handler = this.getOpenContainer();
      if (handler == null) {
         this.finishAutoSell();
         return;
      }

      Auction.PageInfo pageInfo = this.readPageInfo(handler);
      if (pageInfo != null && this.autoSellExpectedPage != -1 && pageInfo.current >= this.autoSellExpectedPage) {
         this.autoSellState = Auction.AutoSellState.PRICE_PARSE_WAIT;
         this.autoSellTimer.reset();
         return;
      }

      if (this.autoSellExpectedPage == -1 && this.autoSellTimer.finished(100L)) {
         this.autoSellState = Auction.AutoSellState.PRICE_PARSE_WAIT;
         this.autoSellTimer.reset();
         return;
      }

      if (this.autoSellTimeout.finished(5000L)) {
         this.finishAutoSell();
      }
   }

   private void finishAutoSell() {
      Auction.PriceStats stats = this.calculatePriceStats(this.autoSellSamples);
      if (stats.samples > 0) {
         long unitPrice = Math.round(stats.averageUnitPrice());
         int count = Math.max(1, this.autoSellStack.getCount());
         long totalPrice = unitPrice * count;
         this.closeOpenScreen();
         mc.player.networkHandler.sendChatCommand("ah sell " + totalPrice);
         Rockstar.getInstance()
            .getNotificationManager()
            .addNotificationOther(
               NotificationType.INFO,
               "Аукцион",
               "Выставил " + this.autoSellItem.getName().getString() + " x" + count + " за " + this.formatPrice(totalPrice)
            );
      } else {
         Rockstar.getInstance().getNotificationManager().addNotificationOther(NotificationType.ERROR, "Аукцион", "Цены для предмета не найдены");
         this.closeOpenScreen();
      }

      this.resetAutoSell();
   }

   private List<Auction.PriceSample> collectPriceSamples(ScreenHandler handler) {
      List<Auction.PriceSample> samples = new ArrayList<>();
      int containerSize = Math.max(0, handler.slots.size() - 36);

      for (int i = 0; i < containerSize; i++) {
         Slot slot = handler.getSlot(i);
         if (slot == null || !slot.hasStack()) {
            continue;
         }

         ItemStack stack = slot.getStack();
         if (stack.getItem() != this.autoSellItem) {
            continue;
         }

         int count = Math.max(1, stack.getCount());
         double unitPrice = this.parseUnitPrice(stack, count);
         if (unitPrice > 0.0) {
            samples.add(new Auction.PriceSample(Math.round(unitPrice * count), count, unitPrice));
         }
      }

      return samples;
   }

   private double parseUnitPrice(ItemStack stack, int count) {
      for (Text line : stack.getTooltip(TooltipContext.create(mc.world), mc.player, TooltipType.BASIC)) {
         String text = line.getString();
         if (!text.contains(".") || text.contains("%")) {
            continue;
         }

         long price = this.parseDigits(text);
         if (price > 0L) {
            return (double)price / count;
         }
      }

      return -1.0;
   }

   private Auction.PriceStats calculatePriceStats(List<Auction.PriceSample> samples) {
      if (samples.isEmpty()) {
         return new Auction.PriceStats(0, 0, 0L, 0);
      }

      List<Auction.PriceSample> sorted = samples.stream().sorted(Comparator.comparingDouble(sample -> sample.unitPrice)).toList();
      double minPrice = sorted.getFirst().unitPrice;
      double threshold = minPrice * 1.6;
      long totalPrice = 0L;
      int totalCount = 0;
      int usedSamples = 0;

      for (Auction.PriceSample sample : sorted) {
         if (sample.unitPrice > threshold && usedSamples > 0) {
            break;
         }

         totalPrice += sample.totalPrice;
         totalCount += sample.count;
         usedSamples++;
      }

      if (usedSamples == 1 && sorted.size() > 1) {
         Auction.PriceSample second = sorted.get(1);
         totalPrice += second.totalPrice;
         totalCount += second.count;
         usedSamples++;
      }

      return new Auction.PriceStats(usedSamples, totalCount, totalPrice, sorted.size() - usedSamples);
   }

   private Auction.PageInfo readPageInfo(ScreenHandler handler) {
      if (mc.currentScreen != null) {
         Auction.PageInfo fromTitle = this.readPageInfo(mc.currentScreen.getTitle().getString());
         if (fromTitle != null) {
            return fromTitle;
         }
      }

      int containerSize = Math.max(0, handler.slots.size() - 36);
      for (int i = 0; i < containerSize; i++) {
         Slot slot = handler.getSlot(i);
         if (slot == null || !slot.hasStack()) {
            continue;
         }

         for (Text line : slot.getStack().getTooltip(TooltipContext.create(mc.world), mc.player, TooltipType.BASIC)) {
            Auction.PageInfo pageInfo = this.readPageInfo(line.getString());
            if (pageInfo != null) {
               return pageInfo;
            }
         }
      }

      return null;
   }

   private Auction.PageInfo readPageInfo(String text) {
      Matcher matcher = PAGE_PATTERN.matcher(text);
      if (!matcher.find()) {
         return null;
      }

      try {
         return new Auction.PageInfo(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
      } catch (NumberFormatException ignored) {
         return null;
      }
   }

   private int findNextPageSlot(ScreenHandler handler) {
      int containerSize = Math.max(0, handler.slots.size() - 36);
      for (int i = 0; i < containerSize; i++) {
         Slot slot = handler.getSlot(i);
         if (slot == null || !slot.hasStack()) {
            continue;
         }

         StringBuilder text = new StringBuilder(slot.getStack().getName().getString().toLowerCase(Locale.ROOT));
         for (Text line : slot.getStack().getTooltip(TooltipContext.create(mc.world), mc.player, TooltipType.BASIC)) {
            text.append(' ').append(line.getString().toLowerCase(Locale.ROOT));
         }

         String combined = text.toString();
         if (combined.contains("след") || combined.contains("далее") || combined.contains("впер") || combined.contains("next")) {
            return i;
         }
      }

      return -1;
   }

   private int parseAutoSellPages() {
      try {
         String digits = this.autoSellPages.getText().replaceAll("[^\\d]", "");
         if (digits.isEmpty()) {
            return 1;
         }

         return Math.max(1, Integer.parseInt(digits));
      } catch (NumberFormatException ignored) {
         return 1;
      }
   }

   private ScreenHandler getOpenContainer() {
      if (!(mc.currentScreen instanceof HandledScreen) || mc.player == null) {
         return null;
      }

      ScreenHandler handler = mc.player.currentScreenHandler;
      return handler == mc.player.playerScreenHandler ? null : handler;
   }

   private void closeOpenScreen() {
      if (mc.player == null) {
         return;
      }

      if (mc.player.currentScreenHandler != null && mc.player.currentScreenHandler != mc.player.playerScreenHandler) {
         mc.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(mc.player.currentScreenHandler.syncId));
      }

      if (mc.currentScreen instanceof HandledScreen) {
         mc.player.closeHandledScreen();
      }
   }

   private long parseDigits(String text) {
      try {
         String digits = text.replaceAll("[^\\d]", "");
         if (!digits.isEmpty()) {
            return Long.parseLong(digits);
         }
      } catch (NumberFormatException ignored) {
      }

      return -1L;
   }

   private String formatPrice(long price) {
      return String.format(Locale.US, "%,d", price);
   }

   private void resetAutoSell() {
      this.autoSellState = Auction.AutoSellState.IDLE;
      this.autoSellItem = null;
      this.autoSellStack = ItemStack.EMPTY;
      this.autoSellSearchName = "";
      this.autoSellPagesTarget = 1;
      this.autoSellCurrentPage = 0;
      this.autoSellExpectedPage = -1;
      this.autoSellSamples.clear();
   }

   private boolean shouldHideItem(ItemStack stack, List<Text> tooltip) {
      Item item = stack.getItem();
      if (item instanceof ArmorItem) {
         if (this.noSpike.isSelected() && EnchantmentUtility.hasEnchantments(stack, Enchantments.THORNS)) {
            return true;
         }

         if (this.noProt5.isSelected() && EnchantmentUtility.getEnchantmentLevel(stack, Enchantments.PROTECTION) < 5) {
            return true;
         }

         if (this.noDurability.isSelected() && stack.getMaxDamage() > 0 && stack.isDamaged()) {
            return true;
         }

         if (this.noRepair.isSelected() && !EnchantmentUtility.hasEnchantments(stack, Enchantments.MENDING)) {
            return true;
         }
      }

      if (item instanceof PickaxeItem && this.noSilkTouch.isSelected() && !EnchantmentUtility.hasEnchantments(stack, Enchantments.SILK_TOUCH)) {
         return true;
      } else {
         if (item instanceof PotionItem) {
            List<String> tooltipStrings = tooltip.stream().map(text -> text.getString().toLowerCase()).toList();
            if (this.noLevel3.isSelected() && !this.hasLevel3Potion(tooltipStrings)) {
               return true;
            }

            if (this.noCombined.isSelected() && !this.isCombinedPotion(tooltipStrings)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean hasLevel3Potion(List<String> tooltip) {
      for (String line : tooltip) {
         if ((line.contains("сила") || line.contains("скорость")) && (line.contains("iii") || line.contains("3") || line.contains("усиленн"))) {
            return true;
         }
      }

      return false;
   }

   private boolean isCombinedPotion(List<String> tooltip) {
      boolean hasStrength = tooltip.stream().anyMatch(line -> line.contains("сила"));
      boolean hasSpeed = tooltip.stream().anyMatch(line -> line.contains("скорость"));
      return hasStrength && hasSpeed;
   }

   private void scanAndAnalyzePage(HandledScreen<?> screen) {
      this.pageItems.clear();
      this.minEffectivePrice = Double.MAX_VALUE;
      double totalEffectivePrice = 0.0;
      int pricedItemCount = 0;
      int containerSize = screen.getScreenHandler().slots.size() - 36;

      for (int i = 0; i < containerSize; i++) {
         Slot slot = screen.getScreenHandler().getSlot(i);
         if (slot != null && slot.hasStack()) {
            ItemStack stack = slot.getStack();
            List<Text> tooltip = stack.getTooltip(
               TooltipContext.create(mc.world), mc.player, mc.options.advancedItemTooltips ? TooltipType.ADVANCED : TooltipType.BASIC
            );
            if (!this.shouldHideItem(stack, tooltip)) {
               long totalPrice = -1L;

               for (Text lineText : tooltip) {
                  String line = lineText.getString();
                  if (line.contains("Цена") || line.contains("Цeна") || line.contains("Ценa") || line.contains("Цeнa") || line.contains("Курс")) {
                     try {
                        String priceString = line.replaceAll("[^\\d]", "");
                        if (!priceString.isEmpty()) {
                           totalPrice = Long.parseLong(priceString);
                        }
                     } catch (NumberFormatException var21) {
                     }
                     break;
                  }
               }

               if (totalPrice != -1L) {
                  int count = stack.getCount();
                  int maxDurability = stack.getMaxDamage();
                  int currentDurability = maxDurability - stack.getDamage();
                  double pricePerUnit = (double)totalPrice / count;
                  double durabilityFactor = 1.0;
                  if (maxDurability > 0) {
                     durabilityFactor = (double)currentDurability / maxDurability;
                     durabilityFactor = Math.max(0.1, durabilityFactor);
                  }

                  double effectivePrice = pricePerUnit / durabilityFactor;
                  this.pageItems.add(new Auction.AuctionItem(slot.id, totalPrice, count, maxDurability, currentDurability, effectivePrice));
                  totalEffectivePrice += effectivePrice;
                  pricedItemCount++;
                  if (effectivePrice < this.minEffectivePrice) {
                     this.minEffectivePrice = effectivePrice;
                  }
               }
            }
         }
      }

      if (pricedItemCount > 0) {
         this.averageEffectivePrice = totalEffectivePrice / pricedItemCount;
      } else {
         this.reset();
      }
   }

   private void reset() {
      this.pageItems.clear();
      this.averageEffectivePrice = 0.0;
      this.minEffectivePrice = Double.MAX_VALUE;
   }

   private record AuctionItem(int slotId, long totalPrice, int count, int maxDurability, int currentDurability, double effectivePrice) {
   }

   private record PriceSample(long totalPrice, int count, double unitPrice) {
   }

   private record PriceStats(int samples, int units, long totalPrice, int skipped) {
      double averageUnitPrice() {
         return this.units > 0 ? (double)this.totalPrice / this.units : 0.0;
      }
   }

   private record PageInfo(int current, int total) {
   }

   private enum AutoSellState {
      IDLE,
      SEARCH_SEND,
      PRICE_PARSE_WAIT,
      PAGE_CHANGE_WAIT
   }
}
