package fun.wonderful.client.modules.impl.misc;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.math.TimerUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.OpenScreenSetting;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.util.Formatting;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.DataComponentTypes;

public class AutoBuy
extends Module {
    public static AutoBuy INSTANCE = new AutoBuy();
    private static final long ACTION_DELAY_MS = 650L;
    private static final int MAX_SCAN_PAGES = 50;
    private static final Pattern MONEY_PATTERN = Pattern.compile("(\\d[\\d\\s.,]*)(\\s*)(kk|кк|k|к|m|м|b|б)?", 2);
    public final BindSetting openKey = new BindSetting("Bind gui", -1);
    private final OpenScreenSetting openMenu = new OpenScreenSetting("Open menu", () -> mc.setScreen((Screen)new fun.wonderful.client.ui.autobuy.AutoBuy()));
    private final List<TargetItem> targets = new ArrayList<TargetItem>();
    private final Map<String, AuctionItem> scannedItems = new LinkedHashMap<String, AuctionItem>();
    private final TimerUtils timer = new TimerUtils();
    private Map<String, String> ruRuTranslations;
    private WorkMode mode = WorkMode.IDLE;
    private int scanPages;
    private int buyIndex;

    public AutoBuy() {
        super("AutoBuy", Module.ModuleCategory.MISC);
        this.addSettings(this.openMenu, this.openKey);
    }

    @Override
    public void onDisable() {
        this.stopWork();
        super.onDisable();
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (AutoBuy.mc.player == null || AutoBuy.mc.world == null || mc.getNetworkHandler() == null || AutoBuy.mc.interactionManager == null) {
            return;
        }
        if (this.mode == WorkMode.SCAN) {
            this.tickScan();
        } else if (this.mode == WorkMode.BUY) {
            this.tickBuy();
        }
    }

    public List<TargetItem> getTargets() {
        return this.targets;
    }

    public List<AuctionItem> getScannedItems() {
        return new ArrayList<AuctionItem>(this.scannedItems.values());
    }

    public boolean isWorking() {
        return this.mode != WorkMode.IDLE;
    }

    public String getStatus() {
        return switch (this.mode.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> "Idle";
            case 1 -> "Scanning /ah";
            case 2 -> "Buying";
        };
    }

    public void startScan() {
        if (mc.getNetworkHandler() == null) {
            return;
        }
        this.ensureEnabled();
        this.scannedItems.clear();
        this.scanPages = 0;
        this.mode = WorkMode.SCAN;
        this.timer.setMillis(0L);
        mc.getNetworkHandler().sendChatCommand("ah");
    }

    public void startBuy() {
        if (this.targets.isEmpty() || mc.getNetworkHandler() == null) {
            return;
        }
        this.ensureEnabled();
        this.buyIndex = 0;
        this.mode = WorkMode.BUY;
        this.timer.setMillis(0L);
        this.searchCurrentTarget();
    }

    public void stopWork() {
        this.mode = WorkMode.IDLE;
        this.scanPages = 0;
        this.buyIndex = 0;
        this.timer.reset();
    }

    public void addTarget(AuctionItem item, int count) {
        if (item == null || count <= 0) {
            return;
        }
        for (TargetItem target : this.targets) {
            if (!target.matches(item.name())) continue;
            target.setCount(count);
            return;
        }
        this.targets.add(new TargetItem(item.name(), item.searchQuery(), count, item.icon().copy()));
    }

    public void removeTarget(TargetItem target) {
        this.targets.remove(target);
    }

    private void tickScan() {
        if (!this.timer.finished(650L)) {
            return;
        }
        Screen class_4372 = AutoBuy.mc.currentScreen;
        if (!(class_4372 instanceof GenericContainerScreen)) {
            if (this.scanPages == 0) {
                mc.getNetworkHandler().sendChatCommand("ah");
                this.timer.reset();
            }
            return;
        }
        GenericContainerScreen screen = (GenericContainerScreen)class_4372;
        this.collectItems(screen.getScreenHandler(), true);
        ++this.scanPages;
        int nextSlot = this.findNextPageSlot(screen.getScreenHandler());
        if (nextSlot >= 0 && this.scanPages < 50) {
            this.click(screen.getScreenHandler(), nextSlot);
            this.timer.reset();
            return;
        }
        this.stopWork();
        mc.setScreen((Screen)new fun.wonderful.client.ui.autobuy.AutoBuy(true));
    }

    private void tickBuy() {
        if (this.buyIndex >= this.targets.size()) {
            this.stopWork();
            return;
        }
        if (!this.timer.finished(650L)) {
            return;
        }
        Screen class_4372 = AutoBuy.mc.currentScreen;
        if (!(class_4372 instanceof GenericContainerScreen)) {
            this.searchCurrentTarget();
            this.timer.reset();
            return;
        }
        GenericContainerScreen screen = (GenericContainerScreen)class_4372;
        TargetItem target = this.targets.get(this.buyIndex);
        List<AuctionLot> lots = this.collectLots(screen.getScreenHandler(), target);
        AuctionLot best = lots.stream().filter(lot -> lot.count() >= target.count()).min(Comparator.comparingLong(AuctionLot::price)).orElseGet(() -> lots.stream().min(Comparator.comparingLong(AuctionLot::price)).orElse(null));
        if (best != null) {
            this.click(screen.getScreenHandler(), best.slot());
            ++this.buyIndex;
            this.timer.reset();
            return;
        }
        int nextSlot = this.findNextPageSlot(screen.getScreenHandler());
        if (nextSlot >= 0) {
            this.click(screen.getScreenHandler(), nextSlot);
            this.timer.reset();
            return;
        }
        ++this.buyIndex;
        this.searchCurrentTarget();
        this.timer.reset();
    }

    private void searchCurrentTarget() {
        if (this.buyIndex >= this.targets.size() || mc.getNetworkHandler() == null) {
            this.stopWork();
            return;
        }
        mc.getNetworkHandler().sendChatCommand("ah search " + this.targets.get(this.buyIndex).searchQuery());
    }

    private void collectItems(ScreenHandler handler, boolean includeUnknownPrice) {
        for (int i2 = 0; i2 < this.auctionSlotCount(handler); ++i2) {
            long price;
            String name;
            Slot slot = (Slot)handler.slots.get(i2);
            ItemStack stack = slot.getStack();
            if (stack.isEmpty() || this.isNavigationStack(stack) || this.isAuctionControlStack(stack) || (name = this.clean(stack.getName().getString())).isBlank() || (price = this.parsePrice(stack)) < 0L && !includeUnknownPrice) continue;
            this.scannedItems.putIfAbsent(this.normalize(name), new AuctionItem(name, this.searchQueryFor(stack, name), stack.copy(), Math.max(price, 0L)));
        }
    }

    private List<AuctionLot> collectLots(ScreenHandler handler, TargetItem target) {
        ArrayList<AuctionLot> lots = new ArrayList<AuctionLot>();
        for (int i2 = 0; i2 < this.auctionSlotCount(handler); ++i2) {
            long price;
            String name;
            Slot slot = (Slot)handler.slots.get(i2);
            ItemStack stack = slot.getStack();
            if (stack.isEmpty() || this.isNavigationStack(stack) || this.isAuctionControlStack(stack) || !target.matches(name = this.clean(stack.getName().getString())) || (price = this.parsePrice(stack)) < 0L) continue;
            lots.add(new AuctionLot(i2, name, stack.getCount(), price));
        }
        return lots;
    }

    private int findNextPageSlot(ScreenHandler handler) {
        for (int i2 = 0; i2 < handler.slots.size(); ++i2) {
            ItemStack stack = ((Slot)handler.slots.get(i2)).getStack();
            if (stack.isEmpty()) continue;
            String text = (stack.getName().getString() + " " + String.join((CharSequence)" ", this.tooltipLines(stack))).toLowerCase(Locale.ROOT);
            if (!stack.isOf(Items.ARROW) && !stack.isOf(Items.SPECTRAL_ARROW) || !text.contains("next") && !text.contains("след") && !text.contains("вперед") && !text.contains("дальше")) continue;
            return i2;
        }
        return -1;
    }

    private int auctionSlotCount(ScreenHandler handler) {
        return Math.max(0, handler.slots.size() - 36);
    }

    private void click(ScreenHandler handler, int slot) {
        AutoBuy.mc.interactionManager.clickSlot(handler.syncId, slot, 0, SlotActionType.PICKUP, (PlayerEntity)AutoBuy.mc.player);
    }

    private boolean isNavigationStack(ItemStack stack) {
        return stack.isOf(Items.ARROW) || stack.isOf(Items.SPECTRAL_ARROW) || stack.isOf(Items.BARRIER) || stack.isOf(Items.OAK_BUTTON) || stack.isOf(Items.GRAY_STAINED_GLASS_PANE) || stack.isOf(Items.BLACK_STAINED_GLASS_PANE);
    }

    private boolean isAuctionControlStack(ItemStack stack) {
        String name = this.normalize(stack.getName().getString());
        return this.containsAny(name, "sort", "sorting", "refresh", "category", "categories", "back", "filter", "сорт", "обнов", "категор", "выбрать", "назад", "фильтр");
    }

    private boolean containsAny(String text, String ... needles) {
        for (String needle : needles) {
            if (!text.contains(needle)) continue;
            return true;
        }
        return false;
    }

    private void ensureEnabled() {
        if (!this.isEnable()) {
            this.setEnabled(true);
        }
    }

    private long parsePrice(ItemStack stack) {
        long best = -1L;
        for (String line : this.tooltipLines(stack)) {
            long parsed;
            String lower = line.toLowerCase(Locale.ROOT);
            if (!lower.contains("цен") && !lower.contains("стоим") && !lower.contains("price") && !lower.contains("$") && !lower.contains("монет") || (parsed = this.parseMoney(line)) < 0L || best >= 0L && parsed >= best) continue;
            best = parsed;
        }
        return best;
    }

    private long parseMoney(String text) {
        String normalized = text.replace(' ', ' ').replace("$", " ");
        Matcher matcher = MONEY_PATTERN.matcher(normalized);
        long best = -1L;
        while (matcher.find()) {
            String number = matcher.group(1);
            if (number == null) continue;
            String suffix = matcher.group(3) == null ? "" : matcher.group(3).toLowerCase(Locale.ROOT);
            Object compact = number.replace(" ", "").replace(",", ".");
            int lastDot = ((String)compact).lastIndexOf(46);
            if (lastDot >= 0) {
                compact = ((String)compact).substring(0, lastDot).replace(".", "") + ((String)compact).substring(lastDot);
            }
            try {
                double value = Double.parseDouble((String)compact);
                if (suffix.equals("k") || suffix.equals("к")) {
                    value *= 1000.0;
                }
                if (suffix.equals("kk") || suffix.equals("кк") || suffix.equals("m") || suffix.equals("м")) {
                    value *= 1000000.0;
                }
                if (suffix.equals("b") || suffix.equals("б")) {
                    value *= 1.0E9;
                }
                long money = (long)value;
                if (best >= 0L && money >= best) continue;
                best = money;
            }
            catch (NumberFormatException numberFormatException) {}
        }
        return best;
    }

    private List<String> tooltipLines(ItemStack stack) {
        LoreComponent lore;
        ArrayList<String> lines = new ArrayList<String>();
        try {
            for (Text text : stack.getTooltip(Item.TooltipContext.DEFAULT, (PlayerEntity)AutoBuy.mc.player, (TooltipType)TooltipType.BASIC)) {
                lines.add(this.clean(text.getString()));
            }
        }
        catch (Exception exception) {
            
        }
        if ((lore = (LoreComponent)stack.get(DataComponentTypes.LORE)) != null) {
            for (Text text : lore.lines()) {
                lines.add(this.clean(text.getString()));
            }
        }
        return lines;
    }

    private String clean(String text) {
        String stripped = Formatting.strip((String)text);
        return stripped == null ? text : stripped.trim();
    }

    private String normalize(String text) {
        return this.clean(text).toLowerCase(Locale.ROOT);
    }

    private String searchQueryFor(ItemStack stack, String displayName) {
        String customName = this.clean(displayName);
        if (stack.contains(DataComponentTypes.CUSTOM_NAME)) {
            return customName;
        }
        String translationKey = stack.getItem().getTranslationKey();
        String currentDefaultName = this.clean(Text.translatable((String)translationKey).getString());
        if (!customName.isBlank() && !this.looksLikeDefaultName(customName, currentDefaultName, translationKey)) {
            return customName;
        }
        String translated = this.ruRuTranslations().get(translationKey);
        if (translated != null && !translated.isBlank()) {
            return translated;
        }
        return customName.isBlank() ? this.fallbackName(translationKey) : customName;
    }

    private boolean looksLikeDefaultName(String text, String currentDefaultName, String translationKey) {
        String value = text.trim();
        String normalized = value.toLowerCase(Locale.ROOT);
        String fallback = this.fallbackName(translationKey);
        return value.equals(currentDefaultName) || value.equals(translationKey) || normalized.equals(fallback) || normalized.equals(fallback.replace('_', ' ')) || normalized.equals("minecraft:" + fallback);
    }

    private String fallbackName(String translationKey) {
        int index = translationKey.lastIndexOf(46);
        return index >= 0 ? translationKey.substring(index + 1) : translationKey;
    }

    private Map<String, String> ruRuTranslations() {
        if (this.ruRuTranslations != null) {
            return this.ruRuTranslations;
        }
        HashMap<String, String> translations = new HashMap<String, String>();
        try (InputStreamReader reader = new InputStreamReader(mc.getResourceManager().open(Identifier.of((String)"minecraft", (String)"lang/ru_ru.json")), StandardCharsets.UTF_8);){
            JsonObject object = JsonParser.parseReader((Reader)reader).getAsJsonObject();
            for (Map.Entry entry : object.entrySet()) {
                if (!((JsonElement)entry.getValue()).isJsonPrimitive()) continue;
                translations.put((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
            }
        }
        catch (Exception exception) {
            
        }
        this.ruRuTranslations = translations;
        return this.ruRuTranslations;
    }

    private static enum WorkMode {
        IDLE,
        SCAN,
        BUY;

    }

    public static class TargetItem {
        private final String name;
        private final String searchQuery;
        private final ItemStack icon;
        private int count;

        public TargetItem(String name, String searchQuery, int count, ItemStack icon) {
            this.name = name;
            this.searchQuery = searchQuery;
            this.count = count;
            this.icon = icon;
        }

        public boolean matches(String otherName) {
            return TargetItem.cleanStatic(otherName).equalsIgnoreCase(TargetItem.cleanStatic(this.name));
        }

        public String name() {
            return this.name;
        }

        public String searchQuery() {
            return this.searchQuery;
        }

        public ItemStack icon() {
            return this.icon;
        }

        public int count() {
            return this.count;
        }

        public void setCount(int count) {
            this.count = Math.max(1, count);
        }

        private static String cleanStatic(String text) {
            String stripped = Formatting.strip((String)text);
            return stripped == null ? text.trim() : stripped.trim();
        }
    }

    public record AuctionItem(String name, String searchQuery, ItemStack icon, long price) {
    }

    private record AuctionLot(int slot, String name, int count, long price) {
    }
}