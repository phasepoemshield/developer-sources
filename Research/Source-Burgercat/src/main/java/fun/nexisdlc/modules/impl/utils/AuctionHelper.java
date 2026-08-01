package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.events.impl.render.HandledScreenEvent;
import fun.nexisdlc.client.utils.PriceParser;
import fun.nexisdlc.client.utils.client.other.Script;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.easy.RenderUtil;
import fun.nexisdlc.client.utils.render.gif.GifTexture;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ColorSetting;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFW;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@FunctionAdd(name = "AuctionHelper", alias = "Auction Helper", description = "Помощник по покупкам на аукционе", category = Category.Utilities)
public class AuctionHelper extends fun.nexisdlc.modules.api.Function {

    static final long PULSE_MS = 900L;
    static final float PULSE_MIN_ALPHA = 0.35f;
    static final float PULSE_MAX_ALPHA = 1.0f;

    static final long RECALC_MIN_MS = 90L;
    static final long RECALC_IDLE_MS = 650L;

    static final int IGNORE_CONTROL_ROW_Y = 104;

    static final int PANEL_W = 260;
    static final int PANEL_PAD = 8;
    static final int PANEL_MAX = 8;
    static final int HEADER_H = 26;
    static final int ENTRY_H = 28;

    static final long BUY_KEEP_MS = 900_000L;
    static final int BUY_MAX = 80;

    static final long SNAP_KEEP_MS = 12_000L;
    static final int SNAP_MAX = 64;

    static final long ICON_RESOLVE_KEEP_MS = 9_000L;
    static final int ICON_PENDING_MAX = 96;

    static final int TEXT_DIM = 0xB0FFFFFF;
    static final int TEXT_DIM2 = 0x90FFFFFF;

    static final int PRICE_NUM = 0xFFFFFFFF;
    static final int PRICE_DOLLAR = 0xFF4BFF4B;

    static final Pattern NUM_PATTERN = Pattern.compile("(\\d{1,3}(?:[\\s,._]\\d{3})+|\\d+)");
    static final Pattern COUNT_X = Pattern.compile("(?i)\\bx\\s*(\\d{1,4})\\b");
    static final Pattern COUNT_PCS = Pattern.compile("(?i)\\b(\\d{1,4})\\s*(шт|штук|pcs)\\b");
    static final Pattern SELF_BUY_PATTERN = Pattern.compile("(?iu)вы\\s+успешно\\s+(?:купили|приобрели)\\s+(.+?)\\s+за\\s*\\$?\\s*([0-9][0-9\\s,._]*)");

    static final DateTimeFormatter TIME_FMT = DateTimeFormatter.ofPattern("HH:mm:ss");

    static final Identifier UTYA_GIF = Identifier.of("mre", "textures/utya.gif");

    @NonFinal static boolean mouseWheelInit = false;
    @NonFinal static Field fMouseWheel;
    @NonFinal static Method mMouseWheelGetter;

    @NonFinal static boolean tooltipInit = false;
    @NonFinal static Method mGetTooltip;
    @NonFinal static TooltipArg[] tooltipArgs;

    @NonFinal static Method mDrawItem;

    @NonFinal static boolean texInit = false;
    @NonFinal static Method mDrawTex;
    @NonFinal static int texMode = 0;
    @NonFinal static Method mGuiLayerFactory;
    @NonFinal static Object texFirstArg;
    @NonFinal static Function<Identifier, Object> guiLayerFn;

    PriceParser priceParser = new PriceParser();
    Script script = new Script();

    @NonFinal Slot cheapestSlot;
    @NonFinal Slot costEffectiveSlot;

    @NonFinal int lastSyncId = -1;
    @NonFinal long lastRecalcMs = 0L;
    @NonFinal boolean dirty = false;

    @NonFinal boolean recalcQueued = false;

    ArrayDeque<BuyEntry> buys = new ArrayDeque<>();
    ArrayDeque<SnapMeta> snaps = new ArrayDeque<>();
    ArrayDeque<PendingIcon> pendingIcons = new ArrayDeque<>();

    @NonFinal SnapMeta lastHover;
    @NonFinal SnapMeta lastClick;

    @NonFinal boolean lmbPrev = false;
    @NonFinal int mouseX = 0;
    @NonFinal int mouseY = 0;

    @NonFinal float buyScrollPx = 0f;
    @NonFinal boolean buyDrag = false;
    @NonFinal int buyDragStartY = 0;
    @NonFinal float buyDragStartScroll = 0f;

    @NonFinal long lastIconScanMs = 0L;

    int[] RED_GREEN_COLORS = {0xFF4BFF4B, 0xFFFF4B4B};

    ColorSetting cheapestItemColorSetting = new ColorSetting("Самый дешевый предмет", 0xFF4BFF4B);

    ColorSetting costEffectiveItemColorSetting = new ColorSetting("Экономичный предмет", 0xFFFF4B4B);

    private Identifier getGlobalsAvatarFrame() {
        Identifier gif = Identifier.of("nexis", "gif/avatar.gif");
        GifTexture avatarGif = GifTexture.getCached(gif);
        if (avatarGif == null || avatarGif.getCurrentFrame() == null) {
            GifTexture.queueLoad(gif);
            return null;
        }
        return avatarGif.getCurrentFrame();
    }

    public AuctionHelper() {
        addSettings(cheapestItemColorSetting, costEffectiveItemColorSetting);
    }

    @EventHandler
    @SuppressWarnings("unused")
    public void onPacket(EventPacket e) {
        Object p = e.getPacket();

        if (p instanceof ScreenHandlerSlotUpdateS2CPacket) {
            if (!(mc.currentScreen instanceof GenericContainerScreen screen)) return;
            if (!isAuctionScreen(screen)) return;

            dirty = true;
            if (!recalcQueued) {
                recalcQueued = true;
                script.cleanup().addTickStep(0, () -> {
                    recalcQueued = false;
                    if (mc.currentScreen instanceof GenericContainerScreen s && isAuctionScreen(s)) recalc(s);
                });
            }
            return;
        }

        if (p instanceof GameMessageS2CPacket gm) {
            String msg = gm.content() == null ? "" : gm.content().getString();
            if (msg.isEmpty()) return;

            PurchaseEvent pe = parseSelfBuySuccess(msg);
            if (pe == null) return;

            long now = System.currentTimeMillis();
            pushChatPurchase(pe, now);
        }
    }

    @EventHandler
    @SuppressWarnings("unused")
    public void onTick(TickEvent e) {
        script.update();


        long now = System.currentTimeMillis();
        pruneBuys(now);
        pruneSnaps(now);
        prunePendingIcons(now);
        resolvePendingIcons(now);

        if (!(mc.currentScreen instanceof GenericContainerScreen screen)) {
            resetCalcState();
            lmbPrev = false;
            buyDrag = false;
            return;
        }
        if (!isAuctionScreen(screen)) {
            resetCalcState();
            lmbPrev = false;
            buyDrag = false;
            return;
        }

        if (!dirty && now - lastRecalcMs >= RECALC_IDLE_MS) recalc(screen);
    }

    @EventHandler
    @SuppressWarnings("unused")
    public void onHandledScreen(HandledScreenEvent e) {
        DrawContext ctx = e.getDrawContext();

        if (!(mc.currentScreen instanceof GenericContainerScreen screen) || !isAuctionScreen(screen)) {
            resetCalcState();
            lmbPrev = false;
            buyDrag = false;
            return;
        }

        long now = System.currentTimeMillis();

        updateMouse();
        boolean lmb = GLFW.glfwGetMouseButton(mc.getWindow().getHandle(), GLFW.GLFW_MOUSE_BUTTON_1) == GLFW.GLFW_PRESS;
        boolean clickEdge = lmb && !lmbPrev;
        boolean releaseEdge = !lmb && lmbPrev;

        ensureCalculated(screen, now);

        int guiLeft = (screen.width - e.getBackgroundWidth()) / 2;
        int guiTop = (screen.height - e.getBackgroundHeight()) / 2;

        updateHoverMeta(screen, guiLeft, guiTop, now);

        int cheapColor = pulsing(cheapestItemColorSetting.get());
        int effColor = pulsing(costEffectiveItemColorSetting.get());

        if (cheapestSlot != null) highlightSlotAbs(ctx, guiLeft, guiTop, cheapestSlot, cheapColor, 0);
        if (costEffectiveSlot != null) highlightSlotAbs(ctx, guiLeft, guiTop, costEffectiveSlot, effColor, 0);


        if (clickEdge) {
            Slot s = findAuctionSlotUnderMouse(screen, guiLeft, guiTop, mouseX, mouseY);
            if (s != null) {
                ItemStack st = s.getStack();
                if (!st.isEmpty()) lastClick = makeSnapFromStack(st, now);
            }
        }

        lmbPrev = lmb;
    }

    private void ensureCalculated(GenericContainerScreen screen, long now) {
        int syncId = screen.getScreenHandler().syncId;
        if (syncId != lastSyncId) {
            lastSyncId = syncId;
            dirty = true;
            recalcQueued = false;
            cheapestSlot = null;
            costEffectiveSlot = null;
            buyScrollPx = 0f;
            buyDrag = false;
            lastHover = null;
            lastClick = null;
            snaps.clear();
        }

        if (dirty && now - lastRecalcMs >= RECALC_MIN_MS) recalc(screen);
    }

    private void recalc(GenericContainerScreen screen) {
        if (mc.player == null) {
            resetCalcState();
            return;
        }

        long now = System.currentTimeMillis();
        List<Slot> slots = screen.getScreenHandler().slots;

        int n = slots.size();
        int[] prices = new int[n];
        int[] counts = new int[n];

        Slot bestCheap = null;
        int bestCheapPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            Slot slot = slots.get(i);
            ItemStack stack = slot.getStack();
            if (stack.isEmpty()) {
                prices[i] = -1;
                counts[i] = 0;
                continue;
            }

            if (slot.inventory == mc.player.getInventory()) {
                prices[i] = -1;
                counts[i] = 0;
                continue;
            }
            if (slot.y >= IGNORE_CONTROL_ROW_Y) {
                prices[i] = -1;
                counts[i] = 0;
                continue;
            }

            int price = getTotalPrice(stack);
            if (price >= 0) pushSnap(makeSnapFromStack(stack, now));
            prices[i] = price;

            int count = Math.max(1, stack.getCount());
            counts[i] = count;

            if (price < 0) continue;

            if (price < bestCheapPrice) {
                bestCheapPrice = price;
                bestCheap = slot;
            }
        }

        Slot bestEff = null;
        double bestEffPpi = Double.POSITIVE_INFINITY;
        int bestEffTotal = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int price = prices[i];
            if (price < 0) continue;

            Slot slot = slots.get(i);
            if (slot == bestCheap) continue;

            int count = Math.max(1, counts[i]);
            double ppi = (double) price / (double) count;

            boolean better = ppi < bestEffPpi - 1.0E-9;
            boolean equal = Math.abs(ppi - bestEffPpi) <= 1.0E-9;
            if (better || (equal && price < bestEffTotal)) {
                bestEffPpi = ppi;
                bestEffTotal = price;
                bestEff = slot;
            }
        }

        cheapestSlot = bestCheap;
        costEffectiveSlot = bestEff;

        dirty = false;
        lastRecalcMs = now;
    }

    private void pushSnap(SnapMeta s) {
        if (s == null || s.icon == null || s.icon.isEmpty()) return;

        SnapMeta last = snaps.peekLast();
        if (last != null && last.nameKey.equals(s.nameKey) && s.timeMs - last.timeMs <= 350L) {
            snaps.pollLast();
        }

        snaps.addLast(s);
        while (snaps.size() > SNAP_MAX) snaps.pollFirst();
    }

    private void pruneSnaps(long now) {
        while (!snaps.isEmpty()) {
            SnapMeta f = snaps.peekFirst();
            if (f == null) break;
            if (now - f.timeMs > SNAP_KEEP_MS) snaps.pollFirst();
            else break;
        }
    }

    private void pushChatPurchase(PurchaseEvent pe, long now) {
        SnapMeta snap = matchSnap(pe.itemName, now);

        String key = snap != null ? snap.nameKey : ("chat|" + normalizeName(pe.itemName));
        String name = pe.itemName;
        int price = pe.price;
        int count = pe.count;

        ItemStack icon = null;

        if (snap != null) {
            if (name.isEmpty()) name = snap.displayName;
            if (price < 0) price = snap.price;
            if (count <= 0) count = snap.count;
            if (count <= 0) count = 1;

            icon = snap.icon.copy();
            int max = Math.max(1, icon.getMaxCount());
            icon.setCount(Math.min(Math.max(1, count), max));
        }

        if (count <= 0) count = 1;

        BuyEntry be = new BuyEntry(key, name, icon, count, price, now);
        pushBuy(be);

        if (be.icon == null || be.icon.isEmpty()) {
            String want = normalizeName(name.isEmpty() ? pe.itemName : name);
            if (!want.isEmpty()) pushPendingIcon(new PendingIcon(key, want, count, now));
        }
    }

    private void pushPendingIcon(PendingIcon p) {
        if (p == null) return;
        if (p.key.isEmpty() || p.wantNorm.isEmpty()) return;

        PendingIcon last = pendingIcons.peekLast();
        if (last != null && last.key.equals(p.key) && p.timeMs - last.timeMs <= 1600L) {
            last.wantNorm = p.wantNorm;
            last.count = Math.max(last.count, p.count);
            last.timeMs = p.timeMs;
            return;
        }

        pendingIcons.addLast(p);
        while (pendingIcons.size() > ICON_PENDING_MAX) pendingIcons.pollFirst();
    }

    private void prunePendingIcons(long now) {
        while (!pendingIcons.isEmpty()) {
            PendingIcon f = pendingIcons.peekFirst();
            if (f == null) break;
            if (now - f.timeMs > ICON_RESOLVE_KEEP_MS) pendingIcons.pollFirst();
            else break;
        }
    }

    private void resolvePendingIcons(long now) {
        if (mc.player == null) return;
        if (pendingIcons.isEmpty()) return;
        if (now - lastIconScanMs < 65L) return;
        lastIconScanMs = now;

        int budget = 6;

        Iterator<PendingIcon> it = pendingIcons.iterator();
        while (it.hasNext() && budget-- > 0) {
            PendingIcon p = it.next();
            if (p == null) {
                it.remove();
                continue;
            }
            if (now - p.timeMs > ICON_RESOLVE_KEEP_MS) {
                it.remove();
                continue;
            }

            BuyEntry be = findBuyByKey(p.key);
            if (be == null) {
                it.remove();
                continue;
            }
            if (be.icon != null && !be.icon.isEmpty()) {
                it.remove();
                continue;
            }

            ItemStack found = findInPlayerInvByName(p.wantNorm, Math.max(1, p.count));
            if (found == null || found.isEmpty()) continue;

            ItemStack icon = found.copy();
            int max = Math.max(1, icon.getMaxCount());
            int want = Math.max(1, be.count);
            icon.setCount(Math.min(want, max));
            be.icon = icon;

            it.remove();
        }
    }

    private BuyEntry findBuyByKey(String key) {
        if (key == null || key.isEmpty()) return null;
        if (buys.isEmpty()) return null;

        Iterator<BuyEntry> it = buys.descendingIterator();
        while (it.hasNext()) {
            BuyEntry b = it.next();
            if (b != null && key.equals(b.key)) return b;
        }
        return null;
    }

    private ItemStack findInPlayerInvByName(String wantNorm, int need) {
        if (mc.player == null) return null;
        if (wantNorm == null || wantNorm.isEmpty()) return null;

        ItemStack best = null;
        int bestScore = -1;
        int bestCount = 0;

        int size = mc.player.getInventory().size();
        for (int i = 0; i < size; i++) {
            ItemStack s = mc.player.getInventory().getStack(i);
            if (s == null || s.isEmpty()) continue;

            String nm = normalizeName(safeName(s));
            if (nm.isEmpty()) continue;
            if (!nameMatches(nm, wantNorm)) continue;

            int score = 0;
            if (nm.equals(wantNorm)) score += 8;
            else if (nm.contains(wantNorm) || wantNorm.contains(nm)) score += 6;
            else score += 4;

            int c = Math.max(1, s.getCount());
            if (c >= need) score += 2;
            score += Math.min(3, c);

            if (score > bestScore || (score == bestScore && c > bestCount)) {
                bestScore = score;
                bestCount = c;
                best = s;
            }
        }

        return best;
    }

    private SnapMeta matchSnap(String itemName, long now) {
        String want = normalizeName(itemName);
        if (!want.isEmpty()) {
            if (lastClick != null && now - lastClick.timeMs <= 12_000L) {
                if (nameMatches(lastClick.nameNorm, want)) return lastClick;
            }
            if (lastHover != null && now - lastHover.timeMs <= 8_000L) {
                if (nameMatches(lastHover.nameNorm, want)) return lastHover;
            }

            Iterator<SnapMeta> it = snaps.descendingIterator();
            while (it.hasNext()) {
                SnapMeta s = it.next();
                if (now - s.timeMs > SNAP_KEEP_MS) break;
                if (nameMatches(s.nameNorm, want)) return s;
            }
        }

        if (lastClick != null && now - lastClick.timeMs <= 12_000L) return lastClick;
        if (lastHover != null && now - lastHover.timeMs <= 8_000L) return lastHover;

        Iterator<SnapMeta> it = snaps.descendingIterator();
        while (it.hasNext()) {
            SnapMeta s = it.next();
            if (now - s.timeMs > SNAP_KEEP_MS) break;
            return s;
        }
        return null;
    }

    private boolean nameMatches(String a, String b) {
        if (a == null || b == null) return false;
        if (a.isEmpty() || b.isEmpty()) return false;
        return a.contains(b) || b.contains(a);
    }

    private PurchaseEvent parseSelfBuySuccess(String msg) {
        String clean = stripFormatting(msg).replace('\u00A0', ' ').trim();
        if (clean.isEmpty()) return null;

        String lower = clean.toLowerCase();
        if (!lower.contains("вы") || !(lower.contains("купили") || lower.contains("приобрели"))) return null;
        if (lower.contains("ошибка") || lower.contains("не удалось") || lower.contains("уже куп")) return null;

        Matcher m = SELF_BUY_PATTERN.matcher(clean);
        if (!m.find()) return null;

        String item = m.group(1) == null ? "" : m.group(1).trim();
        String priceRaw = m.group(2) == null ? "" : m.group(2);

        int price = parseNumberOnly(priceRaw);
        if (price < 0) price = parseNumberOnly(clean);

        int count = parseCount(clean);
        if (count <= 0) count = 1;

        item = trimTrailingPunct(item);

        if (item.isEmpty() && price < 0) return null;
        return new PurchaseEvent(item, price, count);
    }

    private int parseNumberOnly(String s) {
        if (s == null || s.isEmpty()) return -1;
        Matcher m = NUM_PATTERN.matcher(s);
        if (!m.find()) return -1;
        long v = parseDigitsToLong(m.group(1));
        if (v <= 0) return -1;
        if (v > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) v;
    }

    private int parseCount(String clean) {
        Matcher m1 = COUNT_X.matcher(clean);
        if (m1.find()) return safeInt(m1.group(1));

        Matcher m2 = COUNT_PCS.matcher(clean);
        if (m2.find()) return safeInt(m2.group(1));

        return -1;
    }

    private int safeInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Throwable t) {
            return -1;
        }
    }

    private String trimTrailingPunct(String s) {
        if (s == null) return "";
        String t = s.trim();
        while (!t.isEmpty()) {
            char c = t.charAt(t.length() - 1);
            if (c == '!' || c == '.' || c == ',' || c == ';' || c == ':' || c == ')' || c == ']' || c == '»')
                t = t.substring(0, t.length() - 1).trim();
            else break;
        }
        return t;
    }

    private String normalizeName(String s) {
        if (s == null) return "";
        String t = stripFormatting(s).toLowerCase().trim();
        if (t.isEmpty()) return "";
        StringBuilder out = new StringBuilder(t.length());
        boolean sp = false;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            boolean ws = c <= 32;
            if (ws) {
                if (!sp) out.append(' ');
                sp = true;
                continue;
            }
            sp = false;
            if (c == '!' || c == '.' || c == ',' || c == ';' || c == ':') continue;
            out.append(c);
        }
        return out.toString().trim();
    }

    private long parseDigitsToLong(String raw) {
        long v = 0L;
        for (int i = 0; i < raw.length(); i++) {
            char c = raw.charAt(i);
            if (c >= '0' && c <= '9') v = v * 10L + (long) (c - '0');
        }
        return v;
    }

    private void updateMouse() {
        double sx = mc.getWindow().getScaledWidth();
        double sy = mc.getWindow().getScaledHeight();
        double wx = mc.getWindow().getWidth();
        double wy = mc.getWindow().getHeight();
        mouseX = (int) (mc.mouse.getX() * sx / wx);
        mouseY = (int) (mc.mouse.getY() * sy / wy);
    }

    private void updateHoverMeta(GenericContainerScreen screen, int guiLeft, int guiTop, long now) {
        Slot s = findAuctionSlotUnderMouse(screen, guiLeft, guiTop, mouseX, mouseY);
        if (s == null) return;
        ItemStack st = s.getStack();
        if (st.isEmpty()) return;
        lastHover = makeSnapFromStack(st, now);
    }

    private Slot findAuctionSlotUnderMouse(GenericContainerScreen screen, int guiLeft, int guiTop, int mx, int my) {
        if (mc.player == null) return null;
        int lx = mx - guiLeft;
        int ly = my - guiTop;

        List<Slot> slots = screen.getScreenHandler().slots;
        for (Slot s : slots) {
            if (s.inventory == mc.player.getInventory()) continue;
            if (s.y >= IGNORE_CONTROL_ROW_Y) continue;
            int sx = s.x;
            int sy = s.y;
            if (lx >= sx && lx < sx + 16 && ly >= sy && ly < sy + 16) return s;
        }
        return null;
    }

    private SnapMeta makeSnapFromStack(ItemStack st, long now) {
        ItemStack icon = st.copy();
        int price = getTotalPrice(st);
        String name = safeName(st);
        String nameNorm = normalizeName(name);
        String nameKey = st.getItem().toString() + "|" + nameNorm;
        int count = Math.max(1, st.getCount());
        return new SnapMeta(nameKey, name, nameNorm, icon, count, price, now);
    }

    private String safeName(ItemStack s) {
        try {
            return s.getName().getString();
        } catch (Throwable t) {
            return "";
        }
    }

    private int getTotalPrice(ItemStack stack) {
        int p = -1;
        try {
            p = priceParser.getPrice(stack);
        } catch (Throwable ignored) {
        }
        if (p >= 0) return p;
        return extractTotalPriceFallback(stack);
    }

    private int extractTotalPriceFallback(ItemStack stack) {
        try {
            int count = Math.max(1, stack.getCount());
            List<String> lines = collectTooltipLines(stack);
            String blob = String.join(" ", lines);
            return findTotalPriceInText(blob, count);
        } catch (Throwable t) {
            return -1;
        }
    }

    private int findTotalPriceInText(String s, int count) {
        if (s == null || s.isEmpty()) return -1;

        String lower = s.toLowerCase();
        Matcher m = NUM_PATTERN.matcher(s);

        int bestScore = -1;
        long best = -1;

        while (m.find()) {
            int start = m.start(1);
            int end = m.end(1);

            long val = parseDigitsToLong(m.group(1));
            if (val <= 0) continue;

            long mul = readSuffixMultiplier(lower, end);
            if (mul != 1L) val *= mul;

            int cs = Math.max(0, start - 52);
            int ce = Math.min(lower.length(), end + 52);
            String ctx = lower.substring(cs, ce);

            if (!hasPriceKeyword(ctx)) continue;

            boolean per = ctx.contains("за шт") || ctx.contains("/шт") || ctx.contains("шт.") || ctx.contains(" per ")
                    || ctx.contains(" each ") || ctx.contains("за 1") || ctx.contains("за шту");

            boolean total = ctx.contains("всего") || ctx.contains("итого") || ctx.contains("total") || ctx.contains("сумм") || ctx.contains("общ");

            int score = 3;
            if (total) score += 3;
            if (per) score += 1;

            long totalVal = per ? val * (long) count : val;
            if (totalVal <= 0) continue;

            if (score > bestScore || (score == bestScore && totalVal > best)) {
                bestScore = score;
                best = totalVal;
            }
        }

        if (best <= 0) return -1;
        if (best > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) best;
    }

    private boolean hasPriceKeyword(String ctx) {
        return ctx.contains("цена") || ctx.contains("price") || ctx.contains("стоим")
                || ctx.contains("руб") || ctx.contains("монет") || ctx.contains("coins") || ctx.contains("коин")
                || ctx.contains("buy") || ctx.contains("куп") || ctx.contains("$") || ctx.contains("₽");
    }

    private long readSuffixMultiplier(String lower, int end) {
        if (end >= lower.length()) return 1L;
        char c0 = lower.charAt(end);
        char c1 = (end + 1 < lower.length()) ? lower.charAt(end + 1) : 0;
        if (c0 == 'k' || c0 == 'к') return (c1 == 'k' || c1 == 'к') ? 1_000_000L : 1_000L;
        if (c0 == 'm' || c0 == 'м') return 1_000_000L;
        return 1L;
    }

    private List<String> collectTooltipLines(ItemStack stack) {
        ArrayList<String> api = tryCollectTooltipApi(stack);
        if (api != null && !api.isEmpty()) {
            for (int i = 0; i < api.size(); i++) api.set(i, stripFormatting(api.get(i)));
            return api;
        }

        ArrayList<String> out = new ArrayList<>(8);
        out.add(safeName(stack));
        for (int i = 0; i < out.size(); i++) out.set(i, stripFormatting(out.get(i)));
        return out;
    }

    private ArrayList<String> tryCollectTooltipApi(ItemStack stack) {
        try {
            if (!tooltipInit) initTooltipApi(stack);
            if (mGetTooltip == null || tooltipArgs == null) return null;

            Object[] args = new Object[tooltipArgs.length];
            for (int i = 0; i < tooltipArgs.length; i++) args[i] = tooltipArgs[i].value(mc.player);

            Object res = mGetTooltip.invoke(stack, args);
            if (!(res instanceof List<?> list)) return null;

            ArrayList<String> out = new ArrayList<>(list.size());
            for (Object o : list) {
                if (o instanceof Text t) out.add(t.getString());
                else if (o != null) out.add(String.valueOf(o));
            }
            return out;
        } catch (Throwable ignored) {
            return null;
        }
    }

    private void initTooltipApi(ItemStack stack) {
        tooltipInit = true;
        if (stack == null) return;

        Method[] ms = stack.getClass().getMethods();
        for (Method m : ms) {
            if (!"getTooltip".equals(m.getName())) continue;
            if (!List.class.isAssignableFrom(m.getReturnType())) continue;

            Class<?>[] pts = m.getParameterTypes();
            TooltipArg[] plan = buildTooltipPlan(pts);
            if (plan == null) continue;

            try {
                Object[] args = new Object[plan.length];
                for (int i = 0; i < plan.length; i++) args[i] = plan[i].value(mc.player);
                Object res = m.invoke(stack, args);
                if (res instanceof List<?>) {
                    mGetTooltip = m;
                    tooltipArgs = plan;
                    return;
                }
            } catch (Throwable ignored) {
            }
        }

        mGetTooltip = null;
        tooltipArgs = null;
    }

    private TooltipArg[] buildTooltipPlan(Class<?>[] pts) {
        if (pts == null) return null;
        TooltipArg[] out = new TooltipArg[pts.length];

        for (int i = 0; i < pts.length; i++) {
            Class<?> pt = pts[i];
            if (pt == null) return null;

            if (mc.player != null && pt.isAssignableFrom(mc.player.getClass())) {
                out[i] = TooltipArg.player();
                continue;
            }

            if (pt == boolean.class || pt == Boolean.class) {
                out[i] = TooltipArg.boolFalse();
                continue;
            }

            if (pt == int.class || pt == Integer.class) {
                out[i] = TooltipArg.intZero();
                continue;
            }

            if (pt.isEnum()) {
                Object pick = pickEnum(pt, "NORMAL", "DEFAULT", "BASIC", "REGULAR");
                out[i] = TooltipArg.fixed(pick);
                continue;
            }

            Object st = pickStatic(pt, "DEFAULT", "NORMAL", "BASIC", "REGULAR", "STANDARD");
            if (st != null) {
                out[i] = TooltipArg.fixed(st);
                continue;
            }

            if (pt.isInterface()) {
                out[i] = TooltipArg.proxy(pt);
                continue;
            }

            out[i] = TooltipArg.fixed(null);
        }

        return out;
    }

    private Object pickStatic(Class<?> type, String... names) {
        try {
            for (String n : names) {
                try {
                    Field f = type.getField(n);
                    if (!type.isAssignableFrom(f.getType())) continue;
                    return f.get(null);
                } catch (Throwable ignored) {
                }
            }
        } catch (Throwable ignored) {
        }
        return null;
    }

    private Object pickEnum(Class<?> enumType, String... prefer) {
        try {
            Object[] cs = enumType.getEnumConstants();
            if (cs == null || cs.length == 0) return null;

            for (String p : prefer) {
                if (p == null) continue;
                for (Object c : cs) {
                    if (c != null && p.equalsIgnoreCase(String.valueOf(c))) return c;
                }
            }
            return cs[0];
        } catch (Throwable ignored) {
            return null;
        }
    }

    private void pushBuy(BuyEntry e) {
        BuyEntry last = buys.peekLast();
        if (last != null && last.key.equals(e.key) && e.timeMs - last.timeMs <= 1600L) {
            last.count += e.count;
            last.timeMs = e.timeMs;
            if (last.totalPrice < 0 && e.totalPrice >= 0) last.totalPrice = e.totalPrice;
            if ((last.icon == null || last.icon.isEmpty()) && e.icon != null && !e.icon.isEmpty()) last.icon = e.icon;
            if (last.name.isEmpty() && !e.name.isEmpty()) last.name = e.name;
            return;
        }

        buys.addLast(e);
        while (buys.size() > BUY_MAX) buys.pollFirst();
    }

    private void pruneBuys(long now) {
        while (!buys.isEmpty()) {
            BuyEntry f = buys.peekFirst();
            if (f == null) break;
            if (now - f.timeMs > BUY_KEEP_MS) buys.pollFirst();
            else break;
        }
    }

    private double readWheelDelta(boolean consume) {
        if (!consume) return 0.0;

        try {
            Object mouse = mc.mouse;
            if (!mouseWheelInit) initMouseWheelAccess(mouse);

            if (mMouseWheelGetter != null) {
                Object v = mMouseWheelGetter.invoke(mouse);
                if (v instanceof Number n) return n.doubleValue();
                return 0.0;
            }

            if (fMouseWheel != null) {
                Object v = fMouseWheel.get(mouse);
                double dv = v instanceof Number n ? n.doubleValue() : 0.0;
                if (dv != 0.0) {
                    Class<?> t = fMouseWheel.getType();
                    if (t == double.class) fMouseWheel.setDouble(mouse, 0.0);
                    else if (t == float.class) fMouseWheel.setFloat(mouse, 0f);
                    else if (t == int.class) fMouseWheel.setInt(mouse, 0);
                }
                return dv;
            }
        } catch (Throwable ignored) {
        }

        return 0.0;
    }

    private void initMouseWheelAccess(Object mouse) {
        mouseWheelInit = true;
        if (mouse == null) return;

        try {
            for (Method m : mouse.getClass().getMethods()) {
                if (m.getParameterCount() != 0) continue;
                Class<?> rt = m.getReturnType();
                if (!(rt == double.class || rt == float.class || rt == int.class)) continue;
                String n = m.getName().toLowerCase(Locale.ROOT);
                if (n.contains("wheel") || (n.contains("scroll") && (n.contains("y") || n.contains("delta")))) {
                    mMouseWheelGetter = m;
                    return;
                }
            }
        } catch (Throwable ignored) {
        }

        try {
            Class<?> c = mouse.getClass();
            while (c != null && c != Object.class) {
                for (Field f : c.getDeclaredFields()) {
                    Class<?> t = f.getType();
                    if (!(t == double.class || t == float.class || t == int.class)) continue;
                    String n = f.getName().toLowerCase(Locale.ROOT);
                    if (n.contains("eventdeltawheel") || n.contains("deltawheel") || n.contains("wheel") || (n.contains("scroll") && (n.contains("y") || n.contains("delta")))) {
                        f.setAccessible(true);
                        fMouseWheel = f;
                        return;
                    }
                }
                c = c.getSuperclass();
            }
        } catch (Throwable ignored) {
        }
    }

    private void drawItemAny(DrawContext ctx, ItemStack stack, int x, int y) {
        try {
            if (mDrawItem == null) {
                try {
                    mDrawItem = DrawContext.class.getMethod("drawItem", ItemStack.class, int.class, int.class);
                } catch (Throwable ignored) {
                    mDrawItem = null;
                }
            }
            if (mDrawItem != null) mDrawItem.invoke(ctx, stack, x, y);
        } catch (Throwable ignored) {
        }
    }

    private void drawTextAny(DrawContext ctx, TextRenderer tr, String text, int x, int y, int color) {
        try {
            ctx.drawTextWithShadow(tr, text, x, y, color);
        } catch (Throwable ignored) {
            try {
                Method m = ctx.getClass().getMethod("drawTextWithShadow", TextRenderer.class, String.class, int.class, int.class, int.class);
                m.invoke(ctx, tr, text, x, y, color);
            } catch (Throwable ignored2) {
            }
        }
    }

    private void drawTexAny(DrawContext ctx, Identifier tex, int x, int y, int w, int h, int texW, int texH) {
        if (tex == null) return;

        try {
            if (!texInit) initDrawTexture();
            if (mDrawTex == null) return;

            RenderUtil.enableBlend();

            if (texMode == 1) {
                mDrawTex.invoke(ctx, tex, x, y, 0, 0, w, h, texW, texH);
                return;
            }
            if (texMode == 2) {
                mDrawTex.invoke(ctx, tex, x, y, 0f, 0f, w, h, texW, texH);
                return;
            }
            if (texMode == 3) {
                mDrawTex.invoke(ctx, tex, x, y, w, h);
                return;
            }
            if (texMode == 4) {
                Object fn = texFirstArg != null ? texFirstArg : guiLayerFn;
                if (fn == null) return;
                mDrawTex.invoke(ctx, fn, tex, x, y, 0f, 0f, w, h, texW, texH);
                return;
            }
            if (texMode == 5) {
                Object layer = guiLayerFor(tex);
                if (layer == null) return;
                mDrawTex.invoke(ctx, layer, tex, x, y, 0f, 0f, w, h, texW, texH);
            }
        } catch (Throwable ignored) {
        }
    }

    private void initDrawTexture() {
        texInit = true;
        mDrawTex = null;
        texMode = 0;
        texFirstArg = null;
        guiLayerFn = null;
        mGuiLayerFactory = null;

        Method best = null;
        int bestMode = 0;

        try {
            Method[] ms = DrawContext.class.getMethods();
            for (Method m : ms) {
                if (!"drawTexture".equals(m.getName())) continue;

                Class<?>[] p = m.getParameterTypes();
                if (p == null) continue;

                if (p.length == 9 && p[0] == Identifier.class && p[1] == int.class && p[2] == int.class && p[3] == int.class && p[4] == int.class) {
                    best = m;
                    bestMode = 1;
                    break;
                }
                if (p.length == 9 && p[0] == Identifier.class && p[1] == int.class && p[2] == int.class && p[3] == float.class && p[4] == float.class) {
                    best = m;
                    bestMode = 2;
                    break;
                }
                if (p.length == 5 && p[0] == Identifier.class && p[1] == int.class && p[2] == int.class && p[3] == int.class && p[4] == int.class) {
                    if (best == null) {
                        best = m;
                        bestMode = 3;
                    }
                    continue;
                }

                if (p.length == 10 && p[1] == Identifier.class && p[2] == int.class && p[3] == int.class) {
                    if (Function.class.isAssignableFrom(p[0])) {
                        best = m;
                        bestMode = 4;
                        break;
                    }
                    if ("net.minecraft.client.render.RenderLayer".equals(p[0].getName())) {
                        best = m;
                        bestMode = 5;
                        break;
                    }
                }
            }
        } catch (Throwable ignored) {
        }

        if (best != null) {
            mDrawTex = best;
            texMode = bestMode;
        }

        if (texMode == 4) {
            try {
                if (guiLayerFn == null) guiLayerFn = AuctionHelper::guiLayerFor;
                texFirstArg = guiLayerFn;
            } catch (Throwable ignored) {
                texFirstArg = null;
            }
        }
    }

    private static Object guiLayerFor(Identifier tex) {
        try {
            if (mGuiLayerFactory == null) {
                Class<?> rl = Class.forName("net.minecraft.client.render.RenderLayer");
                Method[] ms = rl.getMethods();
                Method pick = null;
                for (Method m : ms) {
                    if (!Modifier.isStatic(m.getModifiers())) continue;
                    if (m.getParameterCount() != 1) continue;
                    if (m.getParameterTypes()[0] != Identifier.class) continue;
                    if (!rl.isAssignableFrom(m.getReturnType())) continue;
                    String n = m.getName().toLowerCase(Locale.ROOT);
                    if (n.contains("gui") && (n.contains("textured") || n.contains("texture"))) {
                        pick = m;
                        break;
                    }
                    if (pick == null && n.contains("gui")) pick = m;
                }
                mGuiLayerFactory = pick;
            }

            if (mGuiLayerFactory == null) return null;
            return mGuiLayerFactory.invoke(null, tex);
        } catch (Throwable ignored) {
            return null;
        }
    }

    private int pulsing(int color) {
        long now = System.currentTimeMillis();
        float t = (now % PULSE_MS) / (float) PULSE_MS;
        float wave = 0.5f - 0.5f * MathHelper.cos(t * 6.2831855f);
        float a = MathHelper.clamp(PULSE_MIN_ALPHA + (PULSE_MAX_ALPHA - PULSE_MIN_ALPHA) * wave, 0.0f, 1.0f);
        return ColorUtils.multAlpha(color, a);
    }

    private void highlightSlotAbs(DrawContext ctx, int guiLeft, int guiTop, Slot slot, int color, int pad) {
        int x = guiLeft + slot.x + pad;
        int y = guiTop + slot.y + pad;
        int w = 16 - pad - pad;
        int h = 16 - pad - pad;
        if (w <= 0 || h <= 0) return;
        ctx.fill(x, y, x + 16, y + 16, color);
    }

    private boolean isAuctionScreen(GenericContainerScreen screen) {
        String title = screen.getTitle() == null ? "" : screen.getTitle().getString();
        return title.contains("Аукцион") || title.contains("Аукционы") || title.contains("Поиск");
    }

    private void resetCalcState() {
        cheapestSlot = null;
        costEffectiveSlot = null;
        lastSyncId = -1;
        lastRecalcMs = 0L;
        dirty = false;
        recalcQueued = false;
        script.cleanup();
        buyScrollPx = 0f;
        buyDrag = false;
        lastHover = null;
        lastClick = null;
        snaps.clear();
    }

    private String formatTime(long ms) {
        LocalTime lt = Instant.ofEpochMilli(ms).atZone(ZoneId.systemDefault()).toLocalTime();
        return TIME_FMT.format(lt);
    }

    private boolean inside(int mx, int my, int x, int y, int w, int h) {
        return mx >= x && mx < x + w && my >= y && my < y + h;
    }

    private String stripFormatting(String s) {
        if (s == null || s.isEmpty()) return "";
        StringBuilder out = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '§') {
                i++;
                continue;
            }
            out.append(c);
        }
        return out.toString();
    }

    private String trimToWidth(TextRenderer tr, String s, int maxW) {
        if (s == null) return "";
        if (maxW <= 0) return "";
        if (tr.getWidth(s) <= maxW) return s;
        String dots = "...";
        int dw = tr.getWidth(dots);
        if (dw >= maxW) return dots;
        int len = s.length();
        while (len > 0) {
            String sub = s.substring(0, len);
            if (tr.getWidth(sub) + dw <= maxW) return sub + dots;
            len--;
        }
        return dots;
    }

    private String formatNumberWithDots(int number) {
        if (number > -1000 && number < 1000) return String.valueOf(number);

        long n = number;
        boolean neg = n < 0;
        if (neg) n = -n;

        String s = String.valueOf(n);
        int len = s.length();

        StringBuilder b = new StringBuilder(len + (len / 3));
        for (int i = 0; i < len; i++) {
            if (i > 0 && (len - i) % 3 == 0) b.append('.');
            b.append(s.charAt(i));
        }

        return neg ? "-" + b : b.toString();
    }

    static class BuyEntry {
        final String key;
        @NonFinal String name;
        @NonFinal ItemStack icon;
        @NonFinal int count;
        @NonFinal int totalPrice;
        @NonFinal long timeMs;

        BuyEntry(String key, String name, ItemStack icon, int count, int totalPrice, long timeMs) {
            this.key = key;
            this.name = name == null ? "" : name;
            this.icon = icon;
            this.count = count;
            this.totalPrice = totalPrice;
            this.timeMs = timeMs;
        }
    }

    static class PendingIcon {
        final String key;
        @NonFinal String wantNorm;
        @NonFinal int count;
        @NonFinal long timeMs;

        PendingIcon(String key, String wantNorm, int count, long timeMs) {
            this.key = key == null ? "" : key;
            this.wantNorm = wantNorm == null ? "" : wantNorm;
            this.count = count;
            this.timeMs = timeMs;
        }
    }

    static class SnapMeta {
        final String nameKey;
        final String displayName;
        final String nameNorm;
        final ItemStack icon;
        final int count;
        final int price;
        final long timeMs;

        SnapMeta(String nameKey, String displayName, String nameNorm, ItemStack icon, int count, int price, long timeMs) {
            this.nameKey = nameKey == null ? "" : nameKey;
            this.displayName = displayName == null ? "" : displayName;
            this.nameNorm = nameNorm == null ? "" : nameNorm;
            this.icon = icon;
            this.count = count;
            this.price = price;
            this.timeMs = timeMs;
        }
    }

    static class PurchaseEvent {
        final String itemName;
        final int price;
        final int count;

        PurchaseEvent(String itemName, int price, int count) {
            this.itemName = itemName == null ? "" : itemName;
            this.price = price;
            this.count = count;
        }
    }

    static class TooltipArg {
        final int kind;
        final Object fixed;
        final Class<?> iface;

        TooltipArg(int kind, Object fixed, Class<?> iface) {
            this.kind = kind;
            this.fixed = fixed;
            this.iface = iface;
        }

        static TooltipArg fixed(Object v) {
            return new TooltipArg(0, v, null);
        }

        static TooltipArg player() {
            return new TooltipArg(1, null, null);
        }

        static TooltipArg boolFalse() {
            return new TooltipArg(2, null, null);
        }

        static TooltipArg intZero() {
            return new TooltipArg(3, null, null);
        }

        static TooltipArg proxy(Class<?> iface) {
            return new TooltipArg(4, null, iface);
        }

        Object value(Object player) {
            if (kind == 1) return player;
            if (kind == 2) return false;
            if (kind == 3) return 0;
            if (kind == 4) return makeProxy(iface);
            return fixed;
        }

        Object makeProxy(Class<?> iface) {
            try {
                return Proxy.newProxyInstance(iface.getClassLoader(), new Class<?>[]{iface}, (p, m, a) -> {
                    Class<?> rt = m.getReturnType();
                    if (rt == boolean.class || rt == Boolean.class) return false;
                    if (rt == int.class || rt == Integer.class) return 0;
                    if (rt == float.class || rt == Float.class) return 0f;
                    if (rt == double.class || rt == Double.class) return 0.0;
                    return null;
                });
            } catch (Throwable ignored) {
                return null;
            }
        }
    }
}
