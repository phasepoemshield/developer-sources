/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.item.ItemStack
 */
package kotakbaz.rain.module.modules.player;

import java.util.List;
import java.util.Locale;
import kotakbaz.rain.event.events.ChatMessageEvent;
import kotakbaz.rain.event.events.KeyEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u064f;
import oxxxde.\u0635\u0635;
import oxxxde.\u0636\u0643;
import oxxxde.\u0636\u0647;
import oxxxde.\u0636\u064e;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010$\u00a8\u0006%"}, d2={"Loxxxde/\u0627\u0641;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u062f\u0634;", "event", "onChat", "(Lkotakbaz/rain/event/events/ChatMessageEvent;)V", "Loxxxde/\u062a\u0632;", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "", "searchHeldItem", "()Z", "", "message", "isBareAhSearch", "(Ljava/lang/String;)Z", "Lnet/minecraft/class_1799;", "mainHand", "offHand", "getHeldItem", "(Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Lnet/minecraft/class_1799;", "MODE_FROM_HAND", "Ljava/lang/String;", "MODE_BY_KEY", "Loxxxde/\u0638\u064a;", "searchMode", "Loxxxde/\u0638\u064a;", "Loxxxde/\u0630\u064f;", "searchKey", "Loxxxde/\u0630\u064f;", "keyPressed", "Z", "rain-visuals"})
public final class ChangeHandModule
extends Module {
    @NotNull
    private static final String MODE_BY_KEY = "\u041f\u043e \u043a\u043d\u043e\u043f\u043a\u0435";
    @NotNull
    private static final ModeSetting searchMode;
    @NotNull
    private static final BindSetting searchKey;
    private static boolean keyPressed;
    @NotNull
    public static final ChangeHandModule INSTANCE;
    @NotNull
    private static final String MODE_FROM_HAND = "\u0421 \u0440\u0443\u043a\u0438";

    private final ItemStack getHeldItem(ItemStack mainHand, ItemStack offHand) {
        if (!mainHand.isEmpty()) {
            return mainHand;
        }
        if (!offHand.isEmpty()) {
            return offHand;
        }
        return null;
    }

    private ChangeHandModule() {
        super("SearchHelper", \u0638\u0646.getPLAYER(), "\u041f\u043e\u0438\u0441\u043a \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u0432 \u0440\u0443\u043a\u0435 /ah search");
    }

    static {
        INSTANCE = new ChangeHandModule();
        String[] stringArray = new String[2];
        stringArray[0] = MODE_FROM_HAND;
        stringArray[1] = MODE_BY_KEY;
        searchMode = Module.mode$default(INSTANCE, "\u0420\u0435\u0436\u0438\u043c", CollectionsKt.listOf(stringArray), 0, null, 12, null);
        searchKey = Module.bind$default(INSTANCE, "\u041a\u043d\u043e\u043f\u043a\u0430", 0, null, 6, null).setVisible(ChangeHandModule::searchKey$lambda$0);
        \u0627\u064f.moduleOnFuntime$default(\u0627\u064f.INSTANCE, INSTANCE, null, 2, null);
    }

    private static final boolean searchKey$lambda$0() {
        return Intrinsics.areEqual(searchMode.getValue(), MODE_BY_KEY);
    }

    @Override
    public void onEnable() {
        keyPressed = false;
    }

    @Override
    public void onDisable() {
        keyPressed = false;
    }

    @Commando
    public final void onChat(@NotNull ChatMessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!event.getSend()) {
            return;
        }
        if (!Intrinsics.areEqual(searchMode.getValue(), MODE_FROM_HAND)) {
            return;
        }
        if (!\u0636\u0647.INSTANCE.isFunTime()) {
            return;
        }
        if (!this.isBareAhSearch(event.getText())) {
            return;
        }
        if (this.searchHeldItem()) {
            event.setCancel(true);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isBareAhSearch(String message) {
        String trimmed = ((Object)StringsKt.trim((CharSequence)message)).toString();
        if (((CharSequence)trimmed).length() == 0) {
            return false;
        }
        boolean bl = false;
        if (bl) {
            return false;
        }
        String string = trimmed;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string2 = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        String lower = string2;
        if (!StringsKt.startsWith$default(lower, "/ah", false, 2, null)) {
            return false;
        }
        CharSequence charSequence = trimmed;
        Regex regex = new Regex("\\s+");
        int n = 0;
        List<String> parts = regex.split(charSequence, n);
        if (parts.size() != 2) return false;
        if (!StringsKt.equals(parts.get(0), "/ah", true)) return false;
        if (!StringsKt.equals(parts.get(1), "search", true)) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final boolean searchHeldItem() {
        void var3_3;
        ItemStack heldItem;
        block7: {
            block6: {
                ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
                if (clientPlayerEntity == null) {
                    return false;
                }
                ClientPlayerEntity player = clientPlayerEntity;
                ItemStack itemStack = player.getMainHandStack();
                Intrinsics.checkNotNullExpressionValue(itemStack, "getMainHandItem(...)");
                ItemStack itemStack2 = player.getOffHandStack();
                Intrinsics.checkNotNullExpressionValue(itemStack2, "getOffhandItem(...)");
                heldItem = this.getHeldItem(itemStack, itemStack2);
                if (heldItem == null) break block6;
                if (!heldItem.isEmpty()) break block7;
            }
            RainMainMenuScreen$Link.INSTANCE.showMessage(this, "\u0414\u0435\u0440\u0436\u0438\u0442\u0435 \u0432 \u0440\u0443\u043a\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442, \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u0445\u043e\u0442\u0438\u0442\u0435 \u043d\u0430\u0439\u0442\u0438 \u043d\u0430 \u0430\u0443\u043a\u0446\u0438\u043e\u043d\u0435.");
            return true;
        }
        String itemName = \u0636\u064e.sanitizeName(\u0637\u062b.getName(heldItem));
        boolean bl = ((CharSequence)itemName).length() == 0;
        if (bl) {
            RainMainMenuScreen$Link.INSTANCE.showMessage(this, "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0438\u0442\u044c \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u0434\u043b\u044f \u043f\u043e\u0438\u0441\u043a\u0430");
            return true;
        }
        ClientPlayNetworkHandler clientPlayNetworkHandler = \u0636\u0643.getMc().getNetworkHandler();
        if (clientPlayNetworkHandler == null) {
            return false;
        }
        ClientPlayNetworkHandler networkHandler = clientPlayNetworkHandler;
        networkHandler.sendChatCommand("ah search " + (String)var3_3);
        return true;
    }

    @Commando
    public final void onKey(@NotNull KeyEvent event) {
        block10: {
            block9: {
                Intrinsics.checkNotNullParameter(event, "event");
                Integer n = event.get(KeyEvent.Companion.getBUTTON());
                if (n == null) {
                    return;
                }
                int button = n;
                if (Intrinsics.areEqual(event.get(KeyEvent.Companion.getMOUSE()), true)) {
                    return;
                }
                if (((Number)searchKey.getValue()).intValue() == -1) break block9;
                if (button == ((Number)searchKey.getValue()).intValue()) break block10;
            }
            return;
        }
        if (Intrinsics.areEqual(event.get(KeyEvent.Companion.getRELEASE()), true)) {
            keyPressed = false;
            return;
        }
        if (!Intrinsics.areEqual(searchMode.getValue(), MODE_BY_KEY) || keyPressed) {
            return;
        }
        keyPressed = true;
        if (!\u0636\u0647.INSTANCE.isFunTime()) {
            return;
        }
        if (\u0636\u0643.getMc().currentScreen != null || \u0635\u0635.INSTANCE.getCustomScreen() != null) {
            return;
        }
        this.searchHeldItem();
    }
}

