/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.BowItem
 *  net.minecraft.item.CrossbowItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.TridentItem
 *  net.minecraft.registry.Registries
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.text.Text
 *  net.minecraft.text.TextContent
 *  net.minecraft.text.TranslatableTextContent
 */
package oxxxde;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotakbaz.rain.ui.inventory.ChestSorterController;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.registry.Registries;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0627\u0621;
import oxxxde.\u062a\u0644;
import oxxxde.\u0635\u0621;
import oxxxde.\u0635\u0648;
import oxxxde.\u0636\u0643;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001`B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0003J!\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u001f\u0010\u001eJ7\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0002\u00a2\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0002\u00a2\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020 2\u0006\u0010.\u001a\u00020)H\u0002\u00a2\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020 2\u0006\u0010.\u001a\u00020)H\u0002\u00a2\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020 2\u0006\u0010.\u001a\u00020)H\u0002\u00a2\u0006\u0004\b2\u00100J\u0017\u00105\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\b8\u00106J\u0017\u00109\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\b9\u00106J\u0017\u0010:\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\b:\u00106J\u0017\u0010;\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\b;\u00106J\u0017\u0010<\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\b<\u00106J\u0017\u0010=\u001a\u0002032\u0006\u0010.\u001a\u00020)H\u0002\u00a2\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u0002032\u0006\u0010.\u001a\u00020)H\u0002\u00a2\u0006\u0004\b?\u0010>J\u0017\u0010A\u001a\u00020\u00182\u0006\u0010@\u001a\u00020 H\u0002\u00a2\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bC\u0010\u0003R\u0014\u0010E\u001a\u00020D8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00180G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020D8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bL\u0010FR\u0016\u0010M\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bO\u0010NR\u0016\u0010P\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bP\u0010NR\u0011\u0010Q\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\bQ\u0010\u0010R\u0011\u0010R\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\bR\u0010\u0010R$\u0010U\u001a\u0012\u0012\u0004\u0012\u00020)0Sj\b\u0012\u0004\u0012\u00020)`T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u0002030W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u0002030W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bZ\u0010YR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u0002030W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b[\u0010YR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u0002030W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\\\u0010YR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u0002030W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b]\u0010YR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u0002030W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b^\u0010YR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u0002030W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b_\u0010Y\u00a8\u0006a"}, d2={"Loxxxde/\u062b\u062b;", "", "<init>", "()V", "", "initialize", "Lnet/minecraft/class_1707;", "menu", "toggle", "(Lnet/minecraft/class_1707;)V", "Lnet/minecraft/class_2561;", "title", "", "isChestScreen", "(Lnet/minecraft/class_2561;)Z", "shouldBlockInventoryClick", "()Z", "start", "requestStop", "tick", "Lnet/minecraft/class_1657;", "player", "isValid", "(Lnet/minecraft/class_1707;Lnet/minecraft/class_1657;)Z", "Loxxxde/\u0631\u064f;", "click", "performClick", "(Lnet/minecraft/class_1707;Lnet/minecraft/class_1657;Lkotakbaz/rain/ui/inventory/ChestSorterController$Click;)V", "", "nextMerge", "(Lnet/minecraft/class_1707;Lnet/minecraft/class_1657;)Ljava/util/List;", "nextSort", "", "target", "source", "swapClicks", "(Lnet/minecraft/class_1707;Lnet/minecraft/class_1657;II)Ljava/util/List;", "recoveryClick", "(Lnet/minecraft/class_1707;)Lkotakbaz/rain/ui/inventory/ChestSorterController$Click;", "containerSize", "(Lnet/minecraft/class_1707;)I", "Lnet/minecraft/class_1799;", "first", "second", "sameKind", "(Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z", "stack", "category", "(Lnet/minecraft/class_1799;)I", "subcategory", "materialRank", "", "path", "isCombatSupply", "(Ljava/lang/String;)Z", "isResource", "isRedstone", "isStorage", "isFunctional", "isNature", "isMobDrop", "registryName", "(Lnet/minecraft/class_1799;)Ljava/lang/String;", "registryPath", "slot", "pickup", "(I)Lkotakbaz/rain/ui/inventory/ChestSorterController$Click;", "stopImmediately", "", "CLICK_DELAY_MS", "J", "Ljava/util/ArrayDeque;", "pendingClicks", "Ljava/util/ArrayDeque;", "activeMenu", "Lnet/minecraft/class_1707;", "nextClickAt", "stopRequested", "Z", "clicking", "initialized", "isSorting", "isStopping", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "stackComparator", "Ljava/util/Comparator;", "", "COMBAT_SUPPLIES", "Ljava/util/Set;", "RESOURCES", "RESOURCE_BLOCKS", "REDSTONE_ITEMS", "FUNCTIONAL_ITEMS", "NATURE_ITEMS", "MOB_DROPS", "Click", "rain-visuals"})
public final class \u062b\u062b {
    @NotNull
    private static final Set<String> COMBAT_SUPPLIES;
    private static long nextClickAt;
    @NotNull
    private static final Set<String> MOB_DROPS;
    @NotNull
    private static final Set<String> RESOURCE_BLOCKS;
    private static boolean stopRequested;
    @NotNull
    private static final Set<String> FUNCTIONAL_ITEMS;
    @NotNull
    private static final ArrayDeque<ChestSorterController.Click> pendingClicks;
    @NotNull
    private static final Set<String> REDSTONE_ITEMS;
    @NotNull
    private static final Comparator<ItemStack> stackComparator;
    private static boolean initialized;
    @NotNull
    private static final Set<String> RESOURCES;
    @NotNull
    private static final Set<String> NATURE_ITEMS;
    private static final long CLICK_DELAY_MS = 90L;
    private static boolean clicking;
    @NotNull
    public static final \u062b\u062b INSTANCE;
    @Nullable
    private static GenericContainerScreenHandler activeMenu;

    private final ChestSorterController.Click pickup(int slot) {
        return new ChestSorterController.Click(slot, 0, SlotActionType.PICKUP);
    }

    public final boolean isSorting() {
        return activeMenu != null;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean sameKind(ItemStack first, ItemStack second) {
        if (!first.isEmpty()) {
            if (!second.isEmpty()) void var2_2;
            return ItemStack.areItemsAndComponentsEqual((ItemStack)first, (ItemStack)var2_2);
        }
        if (!first.isEmpty()) return false;
        if (!second.isEmpty()) return false;
        return true;
    }

    public final void toggle(@NotNull GenericContainerScreenHandler menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (activeMenu == menu) {
            this.requestStop();
        } else {
            this.start(menu);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isMobDrop(String path) {
        if (MOB_DROPS.contains(path)) return true;
        if (!StringsKt.endsWith$default(path, "_spawn_egg", false, 2, null)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private final ChestSorterController.Click recoveryClick(GenericContainerScreenHandler menu) {
        block9: {
            block8: {
                v0 = menu.getCursorStack();
                Intrinsics.checkNotNullExpressionValue(v0, "getCarried(...)");
                carried = v0;
                size = this.containerSize(menu);
                $this$firstOrNull$iv = RangesKt.until(0, size);
                $i$f$firstOrNull = false;
                for (T element$iv : $this$firstOrNull$iv) {
                    slot = ((Number)element$iv).intValue();
                    $i$a$-firstOrNull-ChestSorterController$recoveryClick$mergeTarget$1 = false;
                    Intrinsics.checkNotNullExpressionValue(menu.getSlot(slot), "getSlot(...)");
                    v1 = target.getStack();
                    Intrinsics.checkNotNullExpressionValue(v1, "getItem(...)");
                    if (!\u062b\u062b.INSTANCE.sameKind(v1, carried)) ** GOTO lbl-1000
                    if (target.getStack().getCount() >= target.getMaxItemCount(carried)) ** GOTO lbl-1000
                    if (target.canInsert(carried)) {
                        v2 = true;
                    } else lbl-1000:
                    // 3 sources

                    {
                        v2 = false;
                    }
                    if (!v2) continue;
                    v3 = var8_9;
                    break block8;
                }
                v3 = null;
            }
            v4 = mergeTarget = (Integer)v3;
            if (v4 != null) {
                return this.pickup(v4);
            }
            $this$firstOrNull$iv = RangesKt.until(0, size);
            $i$f$firstOrNull = false;
            for (T element$iv : $this$firstOrNull$iv) {
                slot = ((Number)element$iv).intValue();
                $i$a$-firstOrNull-ChestSorterController$recoveryClick$emptyTarget$1 = false;
                Intrinsics.checkNotNullExpressionValue(menu.getSlot(slot), "getSlot(...)");
                if (!target.getStack().isEmpty()) ** GOTO lbl-1000
                if (var12_16.canInsert(carried)) {
                    v5 = true;
                } else lbl-1000:
                // 2 sources

                {
                    v5 = false;
                }
                if (!v5) continue;
                v6 = var9_11;
                break block9;
            }
            v6 = null;
        }
        emptyTarget = v6;
        v7 = var5_4;
        if (v7 != null) {
            return this.pickup(v7.intValue());
        }
        return null;
    }

    public final boolean isStopping() {
        return this.isSorting() && stopRequested;
    }

    public static final /* synthetic */ int access$category(\u062b\u062b $this, ItemStack stack) {
        return $this.category(stack);
    }

    private static final Comparable stackComparator$lambda$0$1(ItemStack it) {
        Integer n = (Integer)it.get(DataComponentTypes.DAMAGE);
        return n != null ? (Comparable)n : (Comparable)Integer.valueOf(0);
    }

    private final String registryPath(ItemStack stack) {
        String string = Registries.ITEM.getId((Object)stack.getItem()).getPath();
        Intrinsics.checkNotNullExpressionValue(string, "getPath(...)");
        return string;
    }

    private final int containerSize(GenericContainerScreenHandler menu) {
        return menu.getRows() * 9;
    }

    public static final /* synthetic */ String access$registryName(\u062b\u062b $this, ItemStack stack) {
        return $this.registryName(stack);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isRedstone(String path) {
        if (REDSTONE_ITEMS.contains(path)) return true;
        if (StringsKt.contains$default((CharSequence)path, "piston", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)path, "observer", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)path, "sensor", false, 2, null)) return true;
        if (!StringsKt.endsWith$default(path, "_rail", false, 2, null)) return false;
        return true;
    }

    private final void requestStop() {
        stopRequested = true;
        if (pendingClicks.isEmpty()) {
            GenericContainerScreenHandler genericContainerScreenHandler = activeMenu;
            boolean bl = genericContainerScreenHandler != null && (genericContainerScreenHandler = genericContainerScreenHandler.getCursorStack()) != null ? genericContainerScreenHandler.isEmpty() : false;
            if (bl) {
                this.stopImmediately();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private final List<ChestSorterController.Click> nextMerge(GenericContainerScreenHandler menu, PlayerEntity player) {
        int size = this.containerSize(menu);
        int target = 0;
        while (target < size) {
            void var4_4;
            ItemStack targetStack;
            Slot targetSlot;
            Intrinsics.checkNotNullExpressionValue(menu.getSlot(target), "getSlot(...)");
            Intrinsics.checkNotNullExpressionValue(targetSlot.getStack(), "getItem(...)");
            if (!targetStack.isEmpty() && targetStack.getCount() < targetSlot.getMaxItemCount(targetStack)) {
                int source = target + 1;
                while (source < size) {
                    void var7_7;
                    ItemStack sourceStack;
                    Slot sourceSlot;
                    Intrinsics.checkNotNullExpressionValue(menu.getSlot(source), "getSlot(...)");
                    Intrinsics.checkNotNullExpressionValue(sourceSlot.getStack(), "getItem(...)");
                    if (!sourceStack.isEmpty() && this.sameKind(targetStack, sourceStack) && sourceSlot.canTakeItems(player) && targetSlot.canInsert(sourceStack)) {
                        void var11_12;
                        int targetLimit = targetSlot.getMaxItemCount(sourceStack);
                        ChestSorterController.Click[] clickArray = new ChestSorterController.Click[2];
                        clickArray[0] = this.pickup(source);
                        clickArray[1] = this.pickup(target);
                        ArrayList<ChestSorterController.Click> clicks = CollectionsKt.arrayListOf(clickArray);
                        if (targetStack.getCount() + sourceStack.getCount() > targetLimit) {
                            ((Collection)clicks).add(this.pickup(source));
                        }
                        return (List)var11_12;
                    }
                    ++var7_7;
                }
            }
            ++var4_4;
        }
        return null;
    }

    private static final int stackComparator$lambda$0(ItemStack first, ItemStack second) {
        int n;
        if (first.isEmpty() && second.isEmpty()) {
            n = 0;
        } else if (first.isEmpty()) {
            n = 1;
        } else if (second.isEmpty()) {
            n = -1;
        } else {
            Function1[] function1Array = new Function1[7];
            function1Array[0] = new \u0627\u0621(INSTANCE);
            function1Array[1] = new \u0635\u0648(INSTANCE);
            function1Array[2] = new \u062a\u0644(INSTANCE);
            function1Array[3] = \u062b\u062b::stackComparator$lambda$0$0;
            function1Array[4] = \u062b\u062b::stackComparator$lambda$0$1;
            function1Array[5] = new \u0635\u0621(INSTANCE);
            function1Array[6] = \u062b\u062b::stackComparator$lambda$0$2;
            n = ComparisonsKt.compareValuesBy(first, second, function1Array);
        }
        return n;
    }

    /*
     * Unable to fully structure code
     */
    private final List<ChestSorterController.Click> nextSort(GenericContainerScreenHandler menu, PlayerEntity player) {
        size = this.containerSize(menu);
        $this$map$iv = RangesKt.until(0, size);
        $i$f$map = false;
        var7_8 = $this$map$iv;
        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        $i$f$mapTo = false;
        var10_13 = $this$mapTo$iv$iv.iterator();
        while (var10_13.hasNext()) {
            it = item$iv$iv = ((IntIterator)var10_13).nextInt();
            var15_20 = destination$iv$iv;
            $i$a$-map-ChestSorterController$nextSort$desired$1 = false;
            var15_20.add(menu.getSlot(it).getStack().copy());
        }
        desired = CollectionsKt.sortedWith((List)var8_10, \u062b\u062b.stackComparator);
        target = 0;
        while (target < size) {
            block8: {
                block7: {
                    Intrinsics.checkNotNullExpressionValue(menu.getSlot(target).getStack(), "getItem(...)");
                    v0 = desired.get(target);
                    Intrinsics.checkNotNullExpressionValue(v0, "get(...)");
                    if (this.sameKind(current, v0)) break block8;
                    $this$firstOrNull$iv = RangesKt.until(target + 1, size);
                    $i$f$firstOrNull = false;
                    for (T element$iv : $this$firstOrNull$iv) {
                        slot = ((Number)element$iv).intValue();
                        $i$a$-firstOrNull-ChestSorterController$nextSort$source$1 = false;
                        v1 = menu.getSlot(slot).getStack();
                        Intrinsics.checkNotNullExpressionValue(v1, "getItem(...)");
                        v2 = desired.get(target);
                        Intrinsics.checkNotNullExpressionValue(v2, "get(...)");
                        if (!\u062b\u062b.INSTANCE.sameKind(v1, v2)) ** GOTO lbl-1000
                        v3 = menu.getSlot(slot).getStack();
                        Intrinsics.checkNotNullExpressionValue(v3, "getItem(...)");
                        v4 = desired.get(slot);
                        Intrinsics.checkNotNullExpressionValue(v4, "get(...)");
                        if (!\u062b\u062b.INSTANCE.sameKind(v3, v4)) {
                            v5 = true;
                        } else lbl-1000:
                        // 2 sources

                        {
                            v5 = false;
                        }
                        if (!v5) continue;
                        v6 = var12_18;
                        break block7;
                    }
                    v6 = null;
                }
                v7 = v6;
                if (v7 == null) {
                } else {
                    var7_9 = v7;
                    return this.swapClicks(menu, player, (int)var5_5, var7_9);
                }
            }
            ++var5_5;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final int category(ItemStack stack) {
        void var3_3;
        Item item = stack.getItem();
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        Item item2 = item;
        String path = this.registryPath(stack);
        if (stack.get(DataComponentTypes.WEAPON) != null) return 0;
        if (stack.get(DataComponentTypes.BLOCKS_ATTACKS) != null) return 0;
        if (stack.get(DataComponentTypes.PIERCING_WEAPON) != null) return 0;
        if (stack.get(DataComponentTypes.KINETIC_WEAPON) != null) return 0;
        if (item2 instanceof BowItem) return 0;
        if (item2 instanceof CrossbowItem) return 0;
        if (item2 instanceof TridentItem) {
            return 0;
        }
        if (stack.get(DataComponentTypes.EQUIPPABLE) != null) {
            return 1;
        }
        if (stack.get(DataComponentTypes.TOOL) != null) {
            return 2;
        }
        if (this.isCombatSupply(path)) {
            return 3;
        }
        if (stack.get(DataComponentTypes.POTION_CONTENTS) != null) {
            return 4;
        }
        if (stack.get(DataComponentTypes.FOOD) != null) return 5;
        if (stack.get(DataComponentTypes.CONSUMABLE) != null) {
            return 5;
        }
        if (this.isResource(path)) {
            return 6;
        }
        if (this.isRedstone(path)) {
            return 7;
        }
        if (stack.get(DataComponentTypes.CONTAINER) != null) return 8;
        if (stack.get(DataComponentTypes.BUNDLE_CONTENTS) != null) return 8;
        if (this.isStorage(path)) {
            return 8;
        }
        if (this.isFunctional(path)) {
            return 9;
        }
        if (this.isNature(path)) {
            return 10;
        }
        if (item2 instanceof BlockItem) {
            return 11;
        }
        if (!this.isMobDrop((String)var3_3)) return 13;
        return 12;
    }

    private static final void initialize$lambda$0(MinecraftClient it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.tick();
    }

    public static final /* synthetic */ int access$subcategory(\u062b\u062b $this, ItemStack stack) {
        return $this.subcategory(stack);
    }

    private final void tick() {
        GenericContainerScreenHandler genericContainerScreenHandler = activeMenu;
        if (genericContainerScreenHandler == null) {
            return;
        }
        GenericContainerScreenHandler menu = genericContainerScreenHandler;
        ClientPlayerEntity player = \u0636\u0643.getMc().player;
        if (!this.isValid(menu, (PlayerEntity)player)) {
            this.stopImmediately();
            return;
        }
        long now = System.currentTimeMillis();
        if (now < nextClickAt) {
            return;
        }
        if (pendingClicks.isEmpty()) {
            if (!menu.getCursorStack().isEmpty()) {
                ChestSorterController.Click recovery = this.recoveryClick(menu);
                if (recovery == null) {
                    this.stopImmediately();
                    return;
                }
                v1 = pendingClicks.add(recovery);
            } else {
                List<ChestSorterController.Click> operation;
                if (stopRequested) {
                    this.stopImmediately();
                    return;
                }
                ClientPlayerEntity clientPlayerEntity = player;
                Intrinsics.checkNotNull(clientPlayerEntity);
                List<ChestSorterController.Click> list = this.nextMerge(menu, (PlayerEntity)clientPlayerEntity);
                if (list == null) {
                    list = this.nextSort(menu, (PlayerEntity)player);
                }
                if ((operation = list) == null) {
                    this.stopImmediately();
                    return;
                }
                v1 = pendingClicks.addAll((Collection<ChestSorterController.Click>)operation);
            }
        }
        ClientPlayerEntity clientPlayerEntity = player;
        Intrinsics.checkNotNull(clientPlayerEntity);
        PlayerEntity playerEntity = (PlayerEntity)clientPlayerEntity;
        ChestSorterController.Click click = pendingClicks.removeFirst();
        Intrinsics.checkNotNullExpressionValue(click, "removeFirst(...)");
        this.performClick(menu, playerEntity, click);
        nextClickAt = now + 90L;
        if (pendingClicks.isEmpty() && stopRequested && menu.getCursorStack().isEmpty()) {
            this.stopImmediately();
        }
    }

    private static final void initialize$lambda$1(ClientPlayNetworkHandler clientPlayNetworkHandler, PacketSender packetSender, MinecraftClient minecraftClient) {
        Intrinsics.checkNotNullParameter(clientPlayNetworkHandler, "<unused var>");
        Intrinsics.checkNotNullParameter(packetSender, "<unused var>");
        Intrinsics.checkNotNullParameter(minecraftClient, "<unused var>");
        INSTANCE.stopImmediately();
    }

    private static final Comparable stackComparator$lambda$0$0(ItemStack it) {
        return it.hasGlint() ? (Comparable)Integer.valueOf(0) : (Comparable)Integer.valueOf(1);
    }

    private final void start(GenericContainerScreenHandler menu) {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (!(\u0636\u0643.getMc().currentScreen instanceof HandledScreen) || \u0636\u0643.getMc().interactionManager == null) {
            return;
        }
        if (player.currentScreenHandler != menu || !menu.getCursorStack().isEmpty()) {
            return;
        }
        this.stopImmediately();
        activeMenu = menu;
        nextClickAt = 0L;
    }

    static {
        INSTANCE = new \u062b\u062b();
        pendingClicks = new ArrayDeque();
        stackComparator = \u062b\u062b::stackComparator$lambda$0;
        String[] stringArray = new String[10];
        stringArray[0] = "totem_of_undying";
        stringArray[1] = "enchanted_golden_apple";
        stringArray[2] = "golden_apple";
        stringArray[3] = "end_crystal";
        stringArray[4] = "ender_pearl";
        stringArray[5] = "wind_charge";
        stringArray[6] = "arrow";
        stringArray[7] = "spectral_arrow";
        stringArray[8] = "tipped_arrow";
        stringArray[9] = "firework_rocket";
        COMBAT_SUPPLIES = SetsKt.setOf(stringArray);
        stringArray = new String[14];
        stringArray[0] = "coal";
        stringArray[1] = "charcoal";
        stringArray[2] = "diamond";
        stringArray[3] = "emerald";
        stringArray[4] = "lapis_lazuli";
        stringArray[5] = "quartz";
        stringArray[6] = "amethyst_shard";
        stringArray[7] = "echo_shard";
        stringArray[8] = "prismarine_shard";
        stringArray[9] = "prismarine_crystals";
        stringArray[10] = "netherite_scrap";
        stringArray[11] = "ancient_debris";
        stringArray[12] = "clay_ball";
        stringArray[13] = "flint";
        RESOURCES = SetsKt.setOf(stringArray);
        stringArray = new String[12];
        stringArray[0] = "coal_block";
        stringArray[1] = "raw_copper_block";
        stringArray[2] = "raw_iron_block";
        stringArray[3] = "raw_gold_block";
        stringArray[4] = "copper_block";
        stringArray[5] = "iron_block";
        stringArray[6] = "gold_block";
        stringArray[7] = "diamond_block";
        stringArray[8] = "emerald_block";
        stringArray[9] = "lapis_block";
        stringArray[10] = "netherite_block";
        stringArray[11] = "amethyst_block";
        RESOURCE_BLOCKS = SetsKt.setOf(stringArray);
        stringArray = new String[13];
        stringArray[0] = "redstone";
        stringArray[1] = "redstone_torch";
        stringArray[2] = "repeater";
        stringArray[3] = "comparator";
        stringArray[4] = "lever";
        stringArray[5] = "target";
        stringArray[6] = "daylight_detector";
        stringArray[7] = "tripwire_hook";
        stringArray[8] = "lightning_rod";
        stringArray[9] = "crafter";
        stringArray[10] = "dispenser";
        stringArray[11] = "dropper";
        stringArray[12] = "note_block";
        REDSTONE_ITEMS = SetsKt.setOf(stringArray);
        stringArray = new String[19];
        stringArray[0] = "crafting_table";
        stringArray[1] = "furnace";
        stringArray[2] = "anvil";
        stringArray[3] = "blast_furnace";
        stringArray[4] = "smoker";
        stringArray[5] = "stonecutter";
        stringArray[6] = "cartography_table";
        stringArray[7] = "fletching_table";
        stringArray[8] = "smithing_table";
        stringArray[9] = "grindstone";
        stringArray[10] = "loom";
        stringArray[11] = "enchanting_table";
        stringArray[12] = "brewing_stand";
        stringArray[13] = "cauldron";
        stringArray[14] = "beacon";
        stringArray[15] = "lodestone";
        stringArray[16] = "respawn_anchor";
        stringArray[17] = "end_portal_frame";
        stringArray[18] = "jukebox";
        FUNCTIONAL_ITEMS = SetsKt.setOf(stringArray);
        stringArray = new String[19];
        stringArray[0] = "grass_block";
        stringArray[1] = "dirt";
        stringArray[2] = "coarse_dirt";
        stringArray[3] = "rooted_dirt";
        stringArray[4] = "podzol";
        stringArray[5] = "mycelium";
        stringArray[6] = "mud";
        stringArray[7] = "clay";
        stringArray[8] = "sand";
        stringArray[9] = "red_sand";
        stringArray[10] = "gravel";
        stringArray[11] = "moss_block";
        stringArray[12] = "moss_carpet";
        stringArray[13] = "vine";
        stringArray[14] = "lily_pad";
        stringArray[15] = "cactus";
        stringArray[16] = "sugar_cane";
        stringArray[17] = "bamboo";
        stringArray[18] = "kelp";
        NATURE_ITEMS = SetsKt.setOf(stringArray);
        stringArray = new String[23];
        stringArray[0] = "rotten_flesh";
        stringArray[1] = "bone";
        stringArray[2] = "spider_eye";
        stringArray[3] = "string";
        stringArray[4] = "gunpowder";
        stringArray[5] = "slime_ball";
        stringArray[6] = "magma_cream";
        stringArray[7] = "blaze_rod";
        stringArray[8] = "blaze_powder";
        stringArray[9] = "ghast_tear";
        stringArray[10] = "ender_eye";
        stringArray[11] = "phantom_membrane";
        stringArray[12] = "rabbit_hide";
        stringArray[13] = "rabbit_foot";
        stringArray[14] = "feather";
        stringArray[15] = "leather";
        stringArray[16] = "ink_sac";
        stringArray[17] = "glow_ink_sac";
        stringArray[18] = "scute";
        stringArray[19] = "armadillo_scute";
        stringArray[20] = "nautilus_shell";
        stringArray[21] = "shulker_shell";
        stringArray[22] = "nether_star";
        MOB_DROPS = SetsKt.setOf(stringArray);
    }

    private final int subcategory(ItemStack stack) {
        String path = this.registryPath(stack);
        return switch (this.category(stack)) {
            case 0 -> {
                if (StringsKt.endsWith$default(path, "_sword", false, 2, null)) {
                    yield 0;
                }
                if (StringsKt.endsWith$default(path, "_axe", false, 2, null) || Intrinsics.areEqual(path, "mace")) {
                    yield 1;
                }
                if (Intrinsics.areEqual(path, "trident")) {
                    yield 2;
                }
                if (Intrinsics.areEqual(path, "bow")) {
                    yield 3;
                }
                if (Intrinsics.areEqual(path, "crossbow")) {
                    yield 4;
                }
                if (Intrinsics.areEqual(path, "shield")) {
                    yield 5;
                }
                yield 6;
            }
            case 1 -> {
                if (StringsKt.endsWith$default(path, "_helmet", false, 2, null) || Intrinsics.areEqual(path, "turtle_helmet")) {
                    yield 0;
                }
                if (StringsKt.endsWith$default(path, "_chestplate", false, 2, null)) {
                    yield 1;
                }
                if (StringsKt.endsWith$default(path, "_leggings", false, 2, null)) {
                    yield 2;
                }
                if (StringsKt.endsWith$default(path, "_boots", false, 2, null)) {
                    yield 3;
                }
                if (Intrinsics.areEqual(path, "elytra")) {
                    yield 4;
                }
                yield 5;
            }
            case 2 -> {
                if (StringsKt.endsWith$default(path, "_pickaxe", false, 2, null)) {
                    yield 0;
                }
                if (StringsKt.endsWith$default(path, "_axe", false, 2, null)) {
                    yield 1;
                }
                if (StringsKt.endsWith$default(path, "_shovel", false, 2, null)) {
                    yield 2;
                }
                if (StringsKt.endsWith$default(path, "_hoe", false, 2, null)) {
                    yield 3;
                }
                if (Intrinsics.areEqual(path, "shears")) {
                    yield 4;
                }
                if (Intrinsics.areEqual(path, "fishing_rod")) {
                    yield 5;
                }
                if (Intrinsics.areEqual(path, "flint_and_steel")) {
                    yield 6;
                }
                if (Intrinsics.areEqual(path, "brush")) {
                    yield 7;
                }
                yield 8;
            }
            case 3 -> {
                switch (path) {
                    case "totem_of_undying": {
                        yield 0;
                    }
                    case "enchanted_golden_apple": {
                        yield 1;
                    }
                    case "golden_apple": {
                        yield 2;
                    }
                    case "end_crystal": {
                        yield 3;
                    }
                    case "ender_pearl": {
                        yield 4;
                    }
                    case "wind_charge": {
                        yield 5;
                    }
                    case "tipped_arrow": 
                    case "arrow": 
                    case "spectral_arrow": {
                        yield 6;
                    }
                    case "firework_rocket": {
                        yield 7;
                    }
                }
                yield 8;
            }
            case 4 -> {
                int tmp = -1;
                switch (path.hashCode()) {
                    case -982431341: {
                        if (path.equals("potion")) {
                            tmp = 1;
                        }
                        break;
                    }
                    case -1714618722: {
                        if (path.equals("tipped_arrow")) {
                            tmp = 2;
                        }
                        break;
                    }
                    case 402451051: {
                        if (path.equals("splash_potion")) {
                            tmp = 3;
                        }
                        break;
                    }
                    case 2038150131: {
                        if (path.equals("lingering_potion")) {
                            tmp = 4;
                        }
                        break;
                    }
                }
                switch (tmp) {
                    case 1: {
                        yield 0;
                    }
                    case 3: {
                        yield 1;
                    }
                    case 4: {
                        yield 2;
                    }
                    case 2: {
                        yield 3;
                    }
                }
                yield 4;
            }
            case 6 -> {
                if (StringsKt.endsWith$default(path, "_ore", false, 2, null) || Intrinsics.areEqual(path, "ancient_debris")) {
                    yield 0;
                }
                if (StringsKt.startsWith$default(path, "raw_", false, 2, null)) {
                    yield 1;
                }
                if (StringsKt.endsWith$default(path, "_ingot", false, 2, null) || Intrinsics.areEqual(path, "netherite_scrap")) {
                    yield 2;
                }
                if (StringsKt.endsWith$default(path, "_nugget", false, 2, null)) {
                    yield 3;
                }
                if (StringsKt.endsWith$default(path, "_block", false, 2, null)) {
                    yield 4;
                }
                yield 5;
            }
            case 7 -> {
                if (Intrinsics.areEqual(path, "redstone")) {
                    yield 0;
                }
                if (Intrinsics.areEqual(path, "redstone_torch")) {
                    yield 1;
                }
                if (Intrinsics.areEqual(path, "repeater") || Intrinsics.areEqual(path, "comparator")) {
                    yield 2;
                }
                if (StringsKt.contains$default((CharSequence)path, "piston", false, 2, null)) {
                    yield 3;
                }
                if (StringsKt.contains$default((CharSequence)path, "observer", false, 2, null) || StringsKt.contains$default((CharSequence)path, "sensor", false, 2, null)) {
                    yield 4;
                }
                if (StringsKt.contains$default((CharSequence)path, "rail", false, 2, null)) {
                    yield 5;
                }
                yield 6;
            }
            case 8 -> {
                if (StringsKt.contains$default((CharSequence)path, "shulker_box", false, 2, null)) {
                    yield 0;
                }
                if (Intrinsics.areEqual(path, "bundle")) {
                    yield 1;
                }
                if (StringsKt.contains$default((CharSequence)path, "chest", false, 2, null) || Intrinsics.areEqual(path, "barrel")) {
                    yield 2;
                }
                if (Intrinsics.areEqual(path, "hopper")) {
                    yield 3;
                }
                yield 4;
            }
            case 10 -> {
                if (StringsKt.contains$default((CharSequence)path, "sapling", false, 2, null) || StringsKt.contains$default((CharSequence)path, "propagule", false, 2, null)) {
                    yield 0;
                }
                if (StringsKt.contains$default((CharSequence)path, "seed", false, 2, null)) {
                    yield 1;
                }
                if (StringsKt.contains$default((CharSequence)path, "flower", false, 2, null) || StringsKt.contains$default((CharSequence)path, "tulip", false, 2, null) || Intrinsics.areEqual(path, "dandelion") || Intrinsics.areEqual(path, "poppy")) {
                    yield 2;
                }
                if (StringsKt.contains$default((CharSequence)path, "leaves", false, 2, null)) {
                    yield 3;
                }
                if (StringsKt.contains$default((CharSequence)path, "mushroom", false, 2, null) || StringsKt.contains$default((CharSequence)path, "fungus", false, 2, null)) {
                    yield 4;
                }
                yield 5;
            }
            case 11 -> {
                if (StringsKt.endsWith$default(path, "_log", false, 2, null) || StringsKt.endsWith$default(path, "_wood", false, 2, null) || StringsKt.endsWith$default(path, "_stem", false, 2, null) || StringsKt.endsWith$default(path, "_hyphae", false, 2, null)) {
                    yield 0;
                }
                if (StringsKt.endsWith$default(path, "_planks", false, 2, null)) {
                    yield 1;
                }
                if (StringsKt.endsWith$default(path, "_slab", false, 2, null)) {
                    yield 2;
                }
                if (StringsKt.endsWith$default(path, "_stairs", false, 2, null)) {
                    yield 3;
                }
                if (StringsKt.endsWith$default(path, "_wall", false, 2, null) || StringsKt.endsWith$default(path, "_fence", false, 2, null)) {
                    yield 4;
                }
                if (StringsKt.contains$default((CharSequence)path, "glass", false, 2, null)) {
                    yield 5;
                }
                if (StringsKt.contains$default((CharSequence)path, "wool", false, 2, null) || StringsKt.contains$default((CharSequence)path, "carpet", false, 2, null) || StringsKt.contains$default((CharSequence)path, "concrete", false, 2, null) || StringsKt.contains$default((CharSequence)path, "terracotta", false, 2, null)) {
                    yield 6;
                }
                yield 7;
            }
            default -> 0;
        };
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isChestScreen(@NotNull Text title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextContent textContent = title.getContent();
        if (!(textContent instanceof TranslatableTextContent)) return false;
        TranslatableTextContent translatableTextContent = (TranslatableTextContent)textContent;
        Object object = translatableTextContent;
        if (translatableTextContent == null) return false;
        if ((object = object.getKey()) == null) {
            return false;
        }
        Object object2 = object;
        if (Intrinsics.areEqual(object2, "container.chest")) return true;
        if (!Intrinsics.areEqual(object2, "container.chestDouble")) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final List<ChestSorterController.Click> swapClicks(GenericContainerScreenHandler menu, PlayerEntity player, int target, int source) {
        void var4_4;
        void var3_3;
        block17: {
            block16: {
                ItemStack sourceStack;
                ItemStack targetStack;
                Slot sourceSlot;
                Slot targetSlot;
                block15: {
                    block14: {
                        block11: {
                            block13: {
                                block12: {
                                    block8: {
                                        block10: {
                                            block9: {
                                                Slot slot = menu.getSlot(target);
                                                Intrinsics.checkNotNullExpressionValue(slot, "getSlot(...)");
                                                targetSlot = slot;
                                                Slot slot2 = menu.getSlot(source);
                                                Intrinsics.checkNotNullExpressionValue(slot2, "getSlot(...)");
                                                sourceSlot = slot2;
                                                ItemStack itemStack = targetSlot.getStack();
                                                Intrinsics.checkNotNullExpressionValue(itemStack, "getItem(...)");
                                                targetStack = itemStack;
                                                ItemStack itemStack2 = sourceSlot.getStack();
                                                Intrinsics.checkNotNullExpressionValue(itemStack2, "getItem(...)");
                                                sourceStack = itemStack2;
                                                if (!targetStack.isEmpty()) break block8;
                                                if (!sourceSlot.canTakeItems(player)) break block9;
                                                if (targetSlot.canInsert(sourceStack)) break block10;
                                            }
                                            return null;
                                        }
                                        ChestSorterController.Click[] clickArray = new ChestSorterController.Click[2];
                                        clickArray[0] = this.pickup(source);
                                        clickArray[1] = this.pickup(target);
                                        return CollectionsKt.listOf(clickArray);
                                    }
                                    if (!sourceStack.isEmpty()) break block11;
                                    if (!targetSlot.canTakeItems(player)) break block12;
                                    if (sourceSlot.canInsert(targetStack)) break block13;
                                }
                                return null;
                            }
                            ChestSorterController.Click[] clickArray = new ChestSorterController.Click[2];
                            clickArray[0] = this.pickup(target);
                            clickArray[1] = this.pickup(source);
                            return CollectionsKt.listOf(clickArray);
                        }
                        if (!sourceSlot.canTakeItems(player)) break block14;
                        if (targetSlot.canTakeItems(player)) break block15;
                    }
                    return null;
                }
                if (!targetSlot.canInsert(sourceStack)) break block16;
                if (sourceSlot.canInsert(targetStack)) break block17;
            }
            return null;
        }
        ChestSorterController.Click[] clickArray = new ChestSorterController.Click[3];
        clickArray[0] = this.pickup(source);
        clickArray[1] = this.pickup((int)var3_3);
        clickArray[2] = this.pickup((int)var4_4);
        return CollectionsKt.listOf(clickArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isFunctional(String path) {
        if (FUNCTIONAL_ITEMS.contains(path)) return true;
        if (StringsKt.endsWith$default(path, "_furnace", false, 2, null)) return true;
        if (!StringsKt.endsWith$default(path, "_anvil", false, 2, null)) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void performClick(GenericContainerScreenHandler menu, PlayerEntity player, ChestSorterController.Click click) {
        clicking = true;
        try {
            ClientPlayerInteractionManager clientPlayerInteractionManager = \u0636\u0643.getMc().interactionManager;
            if (clientPlayerInteractionManager != null) {
                clientPlayerInteractionManager.clickSlot(menu.syncId, click.getSlot(), click.getButton(), click.getType(), player);
            }
            menu.sendContentUpdates();
        }
        finally {
            clicking = false;
        }
    }

    private final String registryName(ItemStack stack) {
        String string = Registries.ITEM.getId((Object)stack.getItem()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isValid(GenericContainerScreenHandler menu, PlayerEntity player) {
        if (player == null) return false;
        if (\u0636\u0643.getMc().interactionManager == null) return false;
        if (!(\u0636\u0643.getMc().currentScreen instanceof HandledScreen)) return false;
        if (player.currentScreenHandler != menu) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isResource(String path) {
        if (RESOURCES.contains(path)) return true;
        if (RESOURCE_BLOCKS.contains(path)) return true;
        if (StringsKt.startsWith$default(path, "raw_", false, 2, null)) return true;
        if (StringsKt.endsWith$default(path, "_ore", false, 2, null)) return true;
        if (StringsKt.endsWith$default(path, "_ingot", false, 2, null)) return true;
        if (!StringsKt.endsWith$default(path, "_nugget", false, 2, null)) return false;
        return true;
    }

    private \u062b\u062b() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isNature(String path) {
        if (NATURE_ITEMS.contains(path)) return true;
        if (StringsKt.contains$default((CharSequence)path, "sapling", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)path, "propagule", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)path, "leaves", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)path, "seed", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)path, "flower", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)path, "tulip", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)path, "mushroom", false, 2, null)) return true;
        if (!StringsKt.contains$default((CharSequence)path, "fungus", false, 2, null)) return false;
        return true;
    }

    private static final void initialize$lambda$2(ClientPlayNetworkHandler clientPlayNetworkHandler, MinecraftClient minecraftClient) {
        Intrinsics.checkNotNullParameter(clientPlayNetworkHandler, "<unused var>");
        Intrinsics.checkNotNullParameter(minecraftClient, "<unused var>");
        INSTANCE.stopImmediately();
    }

    public final void initialize() {
        if (initialized) {
            return;
        }
        initialized = true;
        ClientTickEvents.END_CLIENT_TICK.register(\u062b\u062b::initialize$lambda$0);
        ClientPlayConnectionEvents.JOIN.register(\u062b\u062b::initialize$lambda$1);
        ClientPlayConnectionEvents.DISCONNECT.register(\u062b\u062b::initialize$lambda$2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isCombatSupply(String path) {
        if (COMBAT_SUPPLIES.contains(path)) return true;
        if (!StringsKt.endsWith$default(path, "_arrow", false, 2, null)) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final int materialRank(ItemStack stack) {
        void var2_2;
        String path = this.registryPath(stack);
        return StringsKt.contains$default((CharSequence)path, "netherite", false, 2, null) ? 0 : (StringsKt.contains$default((CharSequence)path, "diamond", false, 2, null) ? 1 : (StringsKt.contains$default((CharSequence)path, "iron", false, 2, null) ? 2 : (StringsKt.contains$default((CharSequence)path, "chainmail", false, 2, null) ? 3 : (StringsKt.contains$default((CharSequence)path, "gold", false, 2, null) ? 4 : (StringsKt.contains$default((CharSequence)path, "stone", false, 2, null) ? 5 : (StringsKt.contains$default((CharSequence)path, "copper", false, 2, null) ? 6 : (StringsKt.contains$default((CharSequence)path, "wooden", false, 2, null) ? 7 : (StringsKt.contains$default((CharSequence)var2_2, "leather", false, 2, null) ? 8 : 9))))))));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isStorage(String path) {
        if (Intrinsics.areEqual(path, "barrel")) return true;
        if (Intrinsics.areEqual(path, "hopper")) return true;
        if (Intrinsics.areEqual(path, "bundle")) return true;
        if (StringsKt.contains$default((CharSequence)path, "chest", false, 2, null)) return true;
        if (!StringsKt.contains$default((CharSequence)path, "shulker_box", false, 2, null)) return false;
        return true;
    }

    public final boolean shouldBlockInventoryClick() {
        return this.isSorting() && !clicking;
    }

    public static final /* synthetic */ int access$materialRank(\u062b\u062b $this, ItemStack stack) {
        return $this.materialRank(stack);
    }

    private static final Comparable stackComparator$lambda$0$2(ItemStack it) {
        String string = it.getName().getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = string;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string3 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string3, "toLowerCase(...)");
        return (Comparable)((Object)string3);
    }

    private final void stopImmediately() {
        activeMenu = null;
        pendingClicks.clear();
        nextClickAt = 0L;
        stopRequested = false;
        clicking = false;
    }
}

