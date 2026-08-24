/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.LoreComponent
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.text.Text
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.ui.inventory.HwAnarchyHelperController;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062e\u0626;
import oxxxde.\u0636\u0643;
import oxxxde.\u0636\u0647;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001WB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u0003J'\u0010\u0013\u001a\u0004\u0018\u00010\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u0018J#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010\u00062\u0006\u0010$\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\b+\u0010,J#\u0010-\u001a\u00020\u001e2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\b-\u0010.J'\u00102\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b8\u0010(R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010=\u001a\u00020<8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020<8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010A\u001a\u00020<8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010B\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bB\u0010:R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bC\u0010:R\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bI\u0010>R\u0016\u0010J\u001a\u00020<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bJ\u0010>R\u0016\u0010K\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bM\u0010:R$\u0010P\u001a\u0012\u0012\u0004\u0012\u00020\u001e0Nj\b\u0012\u0004\u0012\u00020\u001e`O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bT\u0010>R\u0016\u0010U\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bU\u0010LR\u0016\u0010V\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bV\u0010L\u00a8\u0006X"}, d2={"Loxxxde/\u0634\u0652;", "", "<init>", "()V", "", "initialize", "", "anarchy", "request", "(I)V", "", "shouldBlockInventoryClick", "()Z", "cancel", "tick", "", "Loxxxde/\u0637\u062f;", "entries", "target", "findTargetSlot", "(Ljava/util/List;I)Ljava/lang/Integer;", "Lnet/minecraft/class_465;", "screen", "findNavigationSlot", "(Lnet/minecraft/class_465;Ljava/util/List;)Ljava/lang/Integer;", "findLightModeSlot", "(Ljava/util/List;)Ljava/lang/Integer;", "findLightModeSlotByMenuLayout", "categoryEntries", "(Ljava/util/List;)Ljava/util/List;", "", "detectCurrentCategory", "(Ljava/util/List;)Ljava/lang/String;", "entry", "isLightServer", "(Lkotakbaz/rain/ui/inventory/HwAnarchyHelperController$MenuEntry;)Z", "value", "serverNumber", "(Ljava/lang/String;)Ljava/lang/Integer;", "categoryKey", "(Ljava/lang/String;)Ljava/lang/String;", "Lnet/minecraft/class_1707;", "menu", "menuEntries", "(Lnet/minecraft/class_1707;)Ljava/util/List;", "menuFingerprint", "(Lnet/minecraft/class_465;Lnet/minecraft/class_1707;)Ljava/lang/String;", "Lnet/minecraft/class_1657;", "player", "slot", "click", "(Lnet/minecraft/class_1707;Lnet/minecraft/class_1657;I)V", "message", "fail", "(Ljava/lang/String;)V", "showStatus", "normalize", "MIN_ANARCHY", "I", "MAX_ANARCHY", "", "MENU_OPEN_DELAY_MS", "J", "ACTION_DELAY_MS", "MENU_CHANGE_TIMEOUT_MS", "TOTAL_TIMEOUT_MS", "MAX_NAVIGATION_CLICKS", "LIGHT_MODE_SLOT", "Lkotlin/text/Regex;", "serverNumberPattern", "Lkotlin/text/Regex;", "targetAnarchy", "Ljava/lang/Integer;", "startedAt", "nextActionAt", "menuCommandSent", "Z", "navigationClicks", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "visitedCategories", "Ljava/util/LinkedHashSet;", "awaitingMenuFingerprint", "Ljava/lang/String;", "awaitingMenuSince", "clicking", "initialized", "MenuEntry", "rain-visuals"})
public final class \u0634\u0652 {
    private static long startedAt;
    private static final long MENU_OPEN_DELAY_MS = 150L;
    @NotNull
    private static final LinkedHashSet<String> visitedCategories;
    private static boolean menuCommandSent;
    @NotNull
    public static final \u0634\u0652 INSTANCE;
    private static boolean clicking;
    private static boolean initialized;
    private static long awaitingMenuSince;
    private static final int MAX_ANARCHY = 74;
    private static final int MIN_ANARCHY = 1;
    private static long nextActionAt;
    @Nullable
    private static Integer targetAnarchy;
    private static final long ACTION_DELAY_MS = 450L;
    @Nullable
    private static String awaitingMenuFingerprint;
    @NotNull
    private static final Regex serverNumberPattern;
    private static final long TOTAL_TIMEOUT_MS = 20000L;
    private static int navigationClicks;
    private static final int MAX_NAVIGATION_CLICKS = 5;
    private static final int LIGHT_MODE_SLOT = 10;
    private static final long MENU_CHANGE_TIMEOUT_MS = 3500L;

    private final String normalize(String value) {
        CharSequence charSequence = value;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string = charSequence.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        charSequence = string;
        Regex regex = new Regex("\\s+");
        String string2 = " ";
        return ((Object)StringsKt.trim((CharSequence)regex.replace(charSequence, string2))).toString();
    }

    /*
     * WARNING - void declaration
     */
    private final Integer findTargetSlot(List<HwAnarchyHelperController.MenuEntry> entries, int target) {
        Object v2;
        block1: {
            Iterable $this$firstOrNull$iv = entries;
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                void var7_6;
                HwAnarchyHelperController.MenuEntry entry = (HwAnarchyHelperController.MenuEntry)element$iv;
                boolean bl = false;
                Integer n = INSTANCE.serverNumber(entry.getName());
                int n2 = target;
                boolean bl2 = n != null && n == n2 && INSTANCE.isLightServer(entry);
                if (!bl2) continue;
                v2 = var7_6;
                break block1;
            }
            v2 = null;
        }
        HwAnarchyHelperController.MenuEntry menuEntry = v2;
        return menuEntry != null ? Integer.valueOf(menuEntry.getSlot()) : null;
    }

    static {
        INSTANCE = new \u0634\u0652();
        serverNumberPattern = new Regex("#\\s*(\\d{1,3})(?!\\d)");
        visitedCategories = new LinkedHashSet();
    }

    /*
     * WARNING - void declaration
     */
    private final void tick() {
        void var2_2;
        HandledScreen screen;
        Integer n = targetAnarchy;
        if (n == null) {
            return;
        }
        int target = n;
        long now = System.currentTimeMillis();
        if (!\u0636\u0647.INSTANCE.isHolyWorld()) {
            this.cancel();
            return;
        }
        if (now - startedAt >= 20000L) {
            this.fail("HwAnarchyHelper: \u0430\u043d\u0430\u0440\u0445\u0438\u044f " + target + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u0430 \u0432 \u043c\u0435\u043d\u044e HolyWorld");
            return;
        }
        if (now < nextActionAt) {
            return;
        }
        Screen screen2 = \u0636\u0643.getMc().currentScreen;
        HandledScreen handledScreen = screen = screen2 instanceof HandledScreen ? (HandledScreen)screen2 : null;
        ScreenHandler screenHandler = handledScreen != null ? handledScreen.getScreenHandler() : null;
        GenericContainerScreenHandler menu = screenHandler instanceof GenericContainerScreenHandler ? (GenericContainerScreenHandler)screenHandler : null;
        ClientPlayerEntity player = \u0636\u0643.getMc().player;
        if (screen == null || menu == null || player == null || \u0636\u0643.getMc().interactionManager == null) {
            if (!menuCommandSent) {
                menuCommandSent = true;
                nextActionAt = now + 450L;
                ClientPlayNetworkHandler clientPlayNetworkHandler = \u0636\u0643.getMc().getNetworkHandler();
                if (clientPlayNetworkHandler != null) {
                    clientPlayNetworkHandler.sendChatCommand("menu");
                }
                return;
            }
            if (awaitingMenuFingerprint != null && now - awaitingMenuSince >= 3500L) {
                this.fail("HwAnarchyHelper: \u043c\u0435\u043d\u044e HolyWorld \u043d\u0435 \u043e\u0442\u043a\u0440\u044b\u043b\u043e\u0441\u044c");
            }
            return;
        }
        if (player.currentScreenHandler != menu || !menu.getCursorStack().isEmpty()) {
            return;
        }
        String fingerprint = this.menuFingerprint(screen, menu);
        String awaited = awaitingMenuFingerprint;
        if (awaited != null) {
            if (Intrinsics.areEqual(fingerprint, awaited)) {
                if (now - awaitingMenuSince >= 3500L) {
                    this.fail("HwAnarchyHelper: \u043c\u0435\u043d\u044e HolyWorld \u043d\u0435 \u0438\u0437\u043c\u0435\u043d\u0438\u043b\u043e\u0441\u044c \u043f\u043e\u0441\u043b\u0435 \u043a\u043b\u0438\u043a\u0430");
                }
                return;
            }
            awaitingMenuFingerprint = null;
            awaitingMenuSince = 0L;
        }
        List<HwAnarchyHelperController.MenuEntry> entries = this.menuEntries(menu);
        String string = this.detectCurrentCategory(entries);
        if (string != null) {
            String string2 = string;
            LinkedHashSet<String> linkedHashSet = visitedCategories;
            String p0 = string2;
            boolean bl = false;
            linkedHashSet.add(p0);
        }
        Integer n2 = this.findTargetSlot(entries, target);
        if (n2 != null) {
            int slot = ((Number)n2).intValue();
            boolean bl = false;
            INSTANCE.click(menu, (PlayerEntity)player, slot);
            INSTANCE.showStatus("HwAnarchyHelper: \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0430\u044e \u043a \u0430\u043d\u0430\u0440\u0445\u0438\u0438 " + target);
            INSTANCE.cancel();
            return;
        }
        if (navigationClicks >= 5) {
            this.fail("HwAnarchyHelper: \u0430\u043d\u0430\u0440\u0445\u0438\u044f " + target + " \u043e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u0435\u0442 \u0432 \u043a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u044f\u0445 \u041b\u0430\u0439\u0442 \u0430\u043d\u0430\u0440\u0445\u0438\u0438");
            return;
        }
        Integer n3 = this.findNavigationSlot(screen, entries);
        if (n3 == null) {
            \u0634\u0652 $this$tick_u24lambda_u241 = this;
            boolean bl = false;
            $this$tick_u24lambda_u241.fail("HwAnarchyHelper: \u043d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \u0430\u043d\u0430\u0440\u0445\u0438\u044e " + target + " \u0432 \u043c\u0435\u043d\u044e");
            return;
        }
        int navigationSlot = n3;
        this.click(menu, (PlayerEntity)player, navigationSlot);
        int n4 = navigationClicks;
        navigationClicks = n4 + 1;
        awaitingMenuFingerprint = fingerprint;
        awaitingMenuSince = var2_2;
        nextActionAt = var2_2 + 450L;
    }

    private final String categoryKey(String value) {
        if (!StringsKt.contains$default((CharSequence)value, "\u043b\u0430\u0439\u0442", false, 2, null)) {
            return null;
        }
        return StringsKt.contains$default((CharSequence)value, "\u0441\u043e\u043b\u043e", false, 2, null) ? "solo" : (StringsKt.contains$default((CharSequence)value, "\u0434\u0443\u043e", false, 2, null) ? "duo" : (StringsKt.contains$default((CharSequence)value, "\u0442\u0440\u0438\u043e", false, 2, null) ? "trio" : (StringsKt.contains$default((CharSequence)value, "\u043a\u043b\u0430\u043d", false, 2, null) ? "clan" : null)));
    }

    /*
     * WARNING - void declaration
     */
    private final List<HwAnarchyHelperController.MenuEntry> menuEntries(GenericContainerScreenHandler menu) {
        void var5_5;
        void $this$mapNotNullTo$iv$iv;
        Iterable $this$mapNotNull$iv = RangesKt.until(0, menu.getRows() * 9);
        boolean $i$f$mapNotNull = false;
        Iterable iterable = $this$mapNotNull$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$mapNotNullTo = false;
        void $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv$iv$iv.iterator();
        while (iterator2.hasNext()) {
            void var18_18;
            HwAnarchyHelperController.MenuEntry menuEntry;
            ItemStack stack;
            int element$iv$iv$iv;
            int element$iv$iv = element$iv$iv$iv = ((IntIterator)iterator2).nextInt();
            boolean bl = false;
            int slot = element$iv$iv;
            boolean bl2 = false;
            Intrinsics.checkNotNullExpressionValue(menu.getSlot(slot).getStack(), "getItem(...)");
            if (stack.isEmpty()) {
                menuEntry = null;
            } else {
                String string = stack.getName().getString();
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String name = INSTANCE.normalize(string);
                LoreComponent loreComponent = (LoreComponent)stack.get(DataComponentTypes.LORE);
                List<Object> list = loreComponent != null ? loreComponent.lines() : null;
                List list2 = list;
                if (list == null) {
                    list2 = CollectionsKt.emptyList();
                }
                String lore = CollectionsKt.joinToString$default(list2, " ", null, null, 0, null, \u0634\u0652::menuEntries$lambda$0$0, 30, null);
                menuEntry = new HwAnarchyHelperController.MenuEntry(slot, name, ((Object)StringsKt.trim((CharSequence)(name + " " + lore))).toString());
            }
            if (menuEntry == null) continue;
            HwAnarchyHelperController.MenuEntry it$iv$iv = menuEntry;
            boolean bl3 = false;
            destination$iv$iv.add(var18_18);
        }
        return (List)var5_5;
    }

    /*
     * WARNING - void declaration
     */
    public final void request(int anarchy) {
        void var1_1;
        if (!(1 <= anarchy ? anarchy < 75 : false)) {
            this.showStatus("HwAnarchyHelper: \u0434\u043e\u0441\u0442\u0443\u043f\u043d\u044b \u0430\u043d\u0430\u0440\u0445\u0438\u0438 1\u201374");
            return;
        }
        if (\u0636\u0647.INSTANCE.isSingleplayer()) {
            this.showStatus("HwAnarchyHelper: \u043a\u043e\u043c\u0430\u043d\u0434\u0430 /an" + anarchy + " \u0440\u0430\u0441\u043f\u043e\u0437\u043d\u0430\u043d\u0430 (\u0442\u0435\u0441\u0442 \u0432 \u043e\u0434\u0438\u043d\u043e\u0447\u043d\u043e\u043c \u043c\u0438\u0440\u0435)");
            return;
        }
        if (!\u0636\u0647.INSTANCE.isHolyWorld()) {
            return;
        }
        targetAnarchy = anarchy;
        startedAt = System.currentTimeMillis();
        nextActionAt = startedAt + 150L;
        menuCommandSent = false;
        navigationClicks = 0;
        visitedCategories.clear();
        awaitingMenuFingerprint = null;
        awaitingMenuSince = 0L;
        this.showStatus("HwAnarchyHelper: \u0438\u0449\u0443 \u0430\u043d\u0430\u0440\u0445\u0438\u044e " + (int)var1_1 + "...");
    }

    private static final void initialize$lambda$1(ClientPlayNetworkHandler clientPlayNetworkHandler, PacketSender packetSender, MinecraftClient minecraftClient) {
        Intrinsics.checkNotNullParameter(clientPlayNetworkHandler, "<unused var>");
        Intrinsics.checkNotNullParameter(packetSender, "<unused var>");
        Intrinsics.checkNotNullParameter(minecraftClient, "<unused var>");
        INSTANCE.cancel();
    }

    public final boolean shouldBlockInventoryClick() {
        return targetAnarchy != null && !clicking;
    }

    private final void showStatus(String message) {
        \u0636\u0643.getMc().inGameHud.setOverlayMessage((Text)Text.literal((String)message), false);
    }

    private final Integer findNavigationSlot(HandledScreen<?> screen, List<HwAnarchyHelperController.MenuEntry> entries) {
        Integer n;
        Object v1;
        Object object;
        block6: {
            object = this.findLightModeSlot(entries);
            if (object != null) {
                int it = ((Number)object).intValue();
                boolean bl = false;
                return it;
            }
            object = this.findLightModeSlotByMenuLayout(screen, entries);
            if (object != null) {
                int it = ((Number)object).intValue();
                boolean bl = false;
                return it;
            }
            Iterable $this$firstOrNull$iv = this.categoryEntries(entries);
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                HwAnarchyHelperController.MenuEntry entry = (HwAnarchyHelperController.MenuEntry)element$iv;
                boolean bl = false;
                boolean bl2 = !CollectionsKt.contains((Iterable)visitedCategories, INSTANCE.categoryKey(entry.getName()));
                if (!bl2) continue;
                v1 = element$iv;
                break block6;
            }
            v1 = null;
        }
        object = v1;
        if (object != null) {
            Object object2;
            Object entry = object2 = object;
            boolean bl = false;
            String string = INSTANCE.categoryKey(((HwAnarchyHelperController.MenuEntry)entry).getName());
            if (string != null) {
                String string2 = string;
                LinkedHashSet<String> linkedHashSet = visitedCategories;
                String string3 = string2;
                boolean bl3 = false;
                linkedHashSet.add(string3);
            }
            n = ((HwAnarchyHelperController.MenuEntry)object2).getSlot();
        } else {
            n = null;
        }
        return n;
    }

    public static final /* synthetic */ boolean access$isLightServer(\u0634\u0652 $this, HwAnarchyHelperController.MenuEntry entry) {
        return $this.isLightServer(entry);
    }

    /*
     * Unable to fully structure code
     */
    private final List<HwAnarchyHelperController.MenuEntry> categoryEntries(List<HwAnarchyHelperController.MenuEntry> entries) {
        $this$filter$iv = entries;
        $i$f$filter = false;
        var4_4 = $this$filter$iv;
        destination$iv$iv = new ArrayList<E>();
        $i$f$filterTo = false;
        for (T element$iv$iv : $this$filterTo$iv$iv) {
            entry = (HwAnarchyHelperController.MenuEntry)element$iv$iv;
            $i$a$-filter-HwAnarchyHelperController$categoryEntries$1 = false;
            if (\u0634\u0652.INSTANCE.serverNumber(entry.getName()) != null || \u0634\u0652.INSTANCE.categoryKey(entry.getName()) == null) ** GOTO lbl-1000
            if (StringsKt.contains$default((CharSequence)entry.getName(), "\u0430\u043d\u0430\u0440\u0445", false, 2, null)) {
                v0 = true;
            } else lbl-1000:
            // 2 sources

            {
                v0 = false;
            }
            if (!v0) continue;
            destination$iv$iv.add(var8_8);
        }
        return (List)var5_5;
    }

    private static final String detectCurrentCategory$lambda$0(HwAnarchyHelperController.MenuEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return INSTANCE.categoryKey(entry.getName());
    }

    private static final CharSequence menuEntries$lambda$0$0(Text it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string = it.getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return INSTANCE.normalize(string);
    }

    /*
     * Unable to fully structure code
     */
    private final Integer findLightModeSlot(List<HwAnarchyHelperController.MenuEntry> entries) {
        block3: {
            $this$firstOrNull$iv = entries;
            $i$f$firstOrNull = false;
            for (T element$iv : $this$firstOrNull$iv) {
                entry = (HwAnarchyHelperController.MenuEntry)element$iv;
                $i$a$-firstOrNull-HwAnarchyHelperController$findLightModeSlot$1 = false;
                if (\u0634\u0652.INSTANCE.serverNumber(entry.getName()) != null || \u0634\u0652.INSTANCE.categoryKey(entry.getName()) != null) ** GOTO lbl-1000
                if (!StringsKt.contains$default((CharSequence)entry.getText(), "\u043b\u0430\u0439\u0442", false, 2, null)) ** GOTO lbl-1000
                if (StringsKt.contains$default((CharSequence)entry.getText(), "\u0430\u043d\u0430\u0440\u0445", false, 2, null)) {
                    v0 = true;
                } else lbl-1000:
                // 3 sources

                {
                    v0 = false;
                }
                if (!v0) continue;
                v1 = var6_5;
                break block3;
            }
            v1 = null;
        }
        var2_8 = v1;
        return var2_8 != null ? Integer.valueOf(var2_8.getSlot()) : null;
    }

    private final String detectCurrentCategory(List<HwAnarchyHelperController.MenuEntry> entries) {
        return SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence((Iterable)entries), new \u062e\u0626(this)), \u0634\u0652::detectCurrentCategory$lambda$0));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void click(GenericContainerScreenHandler menu, PlayerEntity player, int slot) {
        clicking = true;
        try {
            ClientPlayerInteractionManager clientPlayerInteractionManager = \u0636\u0643.getMc().interactionManager;
            if (clientPlayerInteractionManager != null) {
                clientPlayerInteractionManager.clickSlot(menu.syncId, slot, 0, SlotActionType.PICKUP, player);
            }
            menu.sendContentUpdates();
        }
        finally {
            clicking = false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Integer serverNumber(String value) {
        MatchResult matchResult = Regex.find$default(serverNumberPattern, value, 0, 2, null);
        Object object = matchResult;
        if (matchResult == null) return null;
        List<String> list = object.getGroupValues();
        object = list;
        if (list == null) return null;
        String string = (String)object.get(1);
        object = string;
        if (string == null) return null;
        Integer n = StringsKt.toIntOrNull((String)object);
        return n;
    }

    private \u0634\u0652() {
    }

    private static final void initialize$lambda$0(MinecraftClient it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.tick();
    }

    /*
     * WARNING - void declaration
     */
    private final Integer findLightModeSlotByMenuLayout(HandledScreen<?> screen, List<HwAnarchyHelperController.MenuEntry> entries) {
        Object v2;
        block2: {
            String string = screen.getTitle().getString();
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String title = this.normalize(string);
            if (!StringsKt.contains$default((CharSequence)title, "\u0432\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0440\u0435\u0436\u0438\u043c", false, 2, null)) {
                return null;
            }
            Iterable $this$firstOrNull$iv = entries;
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                void var7_7;
                HwAnarchyHelperController.MenuEntry entry = (HwAnarchyHelperController.MenuEntry)element$iv;
                boolean bl = false;
                boolean bl2 = entry.getSlot() == 10;
                if (!bl2) continue;
                v2 = var7_7;
                break block2;
            }
            v2 = null;
        }
        HwAnarchyHelperController.MenuEntry menuEntry = v2;
        return menuEntry != null ? Integer.valueOf(menuEntry.getSlot()) : null;
    }

    private final String menuFingerprint(HandledScreen<?> screen, GenericContainerScreenHandler menu) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder $this$menuFingerprint_u24lambda_u240 = stringBuilder;
        boolean bl = false;
        String string = screen.getTitle().getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        $this$menuFingerprint_u24lambda_u240.append(INSTANCE.normalize(string));
        $this$menuFingerprint_u24lambda_u240.append('|');
        $this$menuFingerprint_u24lambda_u240.append(menu.syncId);
        Iterable $this$forEach$iv = INSTANCE.menuEntries(menu);
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            HwAnarchyHelperController.MenuEntry entry = (HwAnarchyHelperController.MenuEntry)element$iv;
            boolean bl2 = false;
            $this$menuFingerprint_u24lambda_u240.append('|');
            $this$menuFingerprint_u24lambda_u240.append(entry.getSlot());
            $this$menuFingerprint_u24lambda_u240.append(':');
            $this$menuFingerprint_u24lambda_u240.append(entry.getText());
        }
        return stringBuilder.toString();
    }

    public final void cancel() {
        targetAnarchy = null;
        startedAt = 0L;
        nextActionAt = 0L;
        menuCommandSent = false;
        navigationClicks = 0;
        visitedCategories.clear();
        awaitingMenuFingerprint = null;
        awaitingMenuSince = 0L;
        clicking = false;
    }

    public final void initialize() {
        if (initialized) {
            return;
        }
        initialized = true;
        ClientTickEvents.END_CLIENT_TICK.register(\u0634\u0652::initialize$lambda$0);
        ClientPlayConnectionEvents.JOIN.register(\u0634\u0652::initialize$lambda$1);
        ClientPlayConnectionEvents.DISCONNECT.register(\u0634\u0652::initialize$lambda$2);
    }

    private static final void initialize$lambda$2(ClientPlayNetworkHandler clientPlayNetworkHandler, MinecraftClient minecraftClient) {
        Intrinsics.checkNotNullParameter(clientPlayNetworkHandler, "<unused var>");
        Intrinsics.checkNotNullParameter(minecraftClient, "<unused var>");
        INSTANCE.cancel();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isLightServer(HwAnarchyHelperController.MenuEntry entry) {
        if (this.serverNumber(entry.getName()) == null) return false;
        if (!StringsKt.contains$default((CharSequence)entry.getName(), "\u043b\u0430\u0439\u0442", false, 2, null)) return false;
        if (this.categoryKey(entry.getName()) == null) return false;
        return true;
    }

    private final void fail(String message) {
        this.showStatus(message);
        this.cancel();
    }
}

