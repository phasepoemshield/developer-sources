/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.screen.PlayerScreenHandler
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 */
package oxxxde;

import kotakbaz.rain.ui.inventory.InventorySnapshot;
import kotakbaz.rain.ui.inventory.InventorySorter;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062a\u0627;
import oxxxde.\u0636\u0643;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0002@AB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u000b\u0010\bJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010\u00162\u0006\u0010$\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020'2\u0006\u0010$\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u0002018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u00103R\u0016\u00108\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b8\u00109R$\u0010;\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00108\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010=R\u0011\u0010?\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b>\u0010=\u00a8\u0006B"}, d2={"Loxxxde/\u0637\u064d;", "", "<init>", "()V", "Loxxxde/\u0651;", "snapshot", "", "toggle", "(Lkotakbaz/rain/ui/inventory/InventorySnapshot;)V", "start", "stop", "tick", "Lnet/minecraft/class_1703;", "menu", "Lnet/minecraft/class_1657;", "player", "", "step", "(Lkotakbaz/rain/ui/inventory/InventorySnapshot;Lnet/minecraft/class_1703;Lnet/minecraft/class_1657;)Z", "Loxxxde/\u0634\u062f;", "nextMove", "(Lkotakbaz/rain/ui/inventory/InventorySnapshot;Lnet/minecraft/class_1703;Lnet/minecraft/class_1657;)Lkotakbaz/rain/ui/inventory/InventorySorter$Move;", "", "target", "canFill", "(ILkotakbaz/rain/ui/inventory/InventorySnapshot;Lnet/minecraft/class_1703;Lnet/minecraft/class_1657;)Z", "source", "Lnet/minecraft/class_1799;", "expected", "canMove", "(ILnet/minecraft/class_1799;Lkotakbaz/rain/ui/inventory/InventorySnapshot;Lnet/minecraft/class_1703;Lnet/minecraft/class_1657;)Z", "plan", "(Lnet/minecraft/class_1703;II)Lkotakbaz/rain/ui/inventory/InventorySorter$Move;", "pivot", "canPivot", "(Lnet/minecraft/class_1703;ILnet/minecraft/class_1799;I)Z", "slot", "swapButton", "(I)Ljava/lang/Integer;", "Loxxxde/\u062e\u062a;", "pickup", "(I)Lkotakbaz/rain/ui/inventory/InventorySorter$Click;", "button", "swap", "(II)Lkotakbaz/rain/ui/inventory/InventorySorter$Click;", "first", "second", "matches", "(Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z", "", "STEP_DELAY_MS", "J", "Lkotlin/ranges/IntRange;", "swapSlots", "Lkotlin/ranges/IntRange;", "nextStepAt", "clicking", "Z", "value", "running", "getRunning", "()Z", "getBlocksInput", "blocksInput", "Move", "Click", "rain-visuals"})
public final class \u0637\u064d {
    private static final long STEP_DELAY_MS = 120L;
    private static boolean clicking;
    private static boolean running;
    @NotNull
    private static final IntRange swapSlots;
    @NotNull
    public static final \u0637\u064d INSTANCE;
    private static long nextStepAt;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean nextMove$lambda$1$0(int $target, ItemStack $expected, InventorySnapshot $snapshot, ScreenHandler $menu, PlayerEntity $player, int source) {
        if (source == $target) return false;
        if (!INSTANCE.canMove(source, $expected, $snapshot, $menu, $player)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean canPivot(ScreenHandler menu, int source, ItemStack target, int pivot) {
        IntRange intRange = InventorySnapshot.Companion.getARMOR_SLOTS();
        int n = intRange.getFirst();
        if (source > intRange.getLast()) return true;
        if (n > source) return true;
        boolean bl = true;
        if (!bl) return true;
        if (!menu.getSlot(pivot).getStack().isEmpty()) return false;
        if (!menu.getSlot(source).canInsert(target)) return false;
        return true;
    }

    private final Integer swapButton(int slot) {
        int n = slot;
        IntRange intRange = InventorySnapshot.Companion.getHOTBAR_SLOTS();
        int n2 = intRange.getFirst();
        return (n <= intRange.getLast() ? n2 <= n : false) ? Integer.valueOf(slot - InventorySnapshot.Companion.getHOTBAR_SLOTS().getFirst()) : (n == 45 ? Integer.valueOf(40) : null);
    }

    private static final boolean nextMove$lambda$0(InventorySnapshot $snapshot, ScreenHandler $menu, PlayerEntity $player, int target) {
        return INSTANCE.canFill(target, $snapshot, $menu, $player);
    }

    public final void start(@Nullable InventorySnapshot snapshot) {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (snapshot == null || !(\u0636\u0643.getMc().currentScreen instanceof InventoryScreen) || \u0636\u0643.getMc().interactionManager == null) {
            return;
        }
        if (!player.playerScreenHandler.getCursorStack().isEmpty()) {
            return;
        }
        running = true;
        nextStepAt = 0L;
    }

    static {
        INSTANCE = new \u0637\u064d();
        swapSlots = new IntRange(InventorySnapshot.Companion.getHOTBAR_SLOTS().getFirst(), 45);
    }

    private static final InventorySorter.Move nextMove$lambda$1$1(ScreenHandler $menu, int $target, int source) {
        return INSTANCE.plan($menu, source, $target);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean canMove(int source, ItemStack expected, InventorySnapshot snapshot, ScreenHandler menu, PlayerEntity player) {
        Slot slot = menu.getSlot(source);
        Intrinsics.checkNotNullExpressionValue(slot, "getSlot(...)");
        Slot slot2 = slot;
        if (!slot2.canTakeItems(player)) return false;
        ItemStack itemStack = slot2.getStack();
        Intrinsics.checkNotNullExpressionValue(itemStack, "getItem(...)");
        if (!this.matches(itemStack, expected)) return false;
        ItemStack itemStack2 = slot2.getStack();
        Intrinsics.checkNotNullExpressionValue(itemStack2, "getItem(...)");
        if (this.matches(itemStack2, snapshot.expectedAt(source))) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean step(InventorySnapshot snapshot, ScreenHandler menu, PlayerEntity player) {
        InventorySorter.Move move = this.nextMove(snapshot, menu, player);
        if (move == null) {
            return false;
        }
        InventorySorter.Move move2 = move;
        clicking = true;
        try {
            Iterable $this$forEach$iv = move2.getClicks();
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                InventorySorter.Click click = (InventorySorter.Click)element$iv;
                boolean bl = false;
                ClientPlayerInteractionManager clientPlayerInteractionManager = \u0636\u0643.getMc().interactionManager;
                if (clientPlayerInteractionManager == null) continue;
                clientPlayerInteractionManager.clickSlot(menu.syncId, click.getSlot(), click.getButton(), click.getType(), player);
            }
            menu.sendContentUpdates();
        }
        finally {
            clicking = false;
        }
        if (!menu.getCursorStack().isEmpty()) return false;
        ItemStack itemStack = menu.getSlot(move2.getTarget()).getStack();
        Intrinsics.checkNotNullExpressionValue(itemStack, "getItem(...)");
        if (!this.matches(itemStack, snapshot.expectedAt(move2.getTarget()))) return false;
        return true;
    }

    private static final InventorySorter.Move nextMove$lambda$1(InventorySnapshot $snapshot, ScreenHandler $menu, PlayerEntity $player, int target) {
        ItemStack expected = $snapshot.expectedAt(target);
        return SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence(InventorySnapshot.Companion.getMANAGED_SLOTS()), arg_0 -> \u0637\u064d.nextMove$lambda$1$0(target, expected, $snapshot, $menu, $player, arg_0)), arg_0 -> \u0637\u064d.nextMove$lambda$1$1($menu, target, arg_0)));
    }

    public final void tick(@Nullable InventorySnapshot snapshot) {
        long now;
        block7: {
            block6: {
                if (!running) {
                    return;
                }
                ClientPlayerEntity player = \u0636\u0643.getMc().player;
                if (player == null || snapshot == null || !(\u0636\u0643.getMc().currentScreen instanceof InventoryScreen) || \u0636\u0643.getMc().interactionManager == null) {
                    this.stop();
                    return;
                }
                PlayerScreenHandler playerScreenHandler = player.playerScreenHandler;
                Intrinsics.checkNotNullExpressionValue(playerScreenHandler, "inventoryMenu");
                PlayerScreenHandler menu = playerScreenHandler;
                now = System.currentTimeMillis();
                if (!menu.getCursorStack().isEmpty()) break block6;
                if (now < nextStepAt) break block7;
                if (this.step(snapshot, (ScreenHandler)menu, (PlayerEntity)player)) break block7;
            }
            this.stop();
            return;
        }
        if (now >= nextStepAt) {
            nextStepAt = now + 120L;
        }
    }

    private final InventorySorter.Click pickup(int slot) {
        return new InventorySorter.Click(slot, 0, SlotActionType.PICKUP);
    }

    public final boolean getBlocksInput() {
        return running && !clicking;
    }

    public final void toggle(@Nullable InventorySnapshot snapshot) {
        if (running) {
            this.stop();
        } else {
            this.start(snapshot);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final InventorySorter.Move plan(ScreenHandler menu, int source, int target) {
        block13: {
            block12: {
                v0 = menu.getSlot(source);
                Intrinsics.checkNotNullExpressionValue(v0, "getSlot(...)");
                sourceSlot = v0;
                v1 = menu.getSlot(target);
                Intrinsics.checkNotNullExpressionValue(v1, "getSlot(...)");
                targetSlot = v1;
                if (targetSlot.getStack().isEmpty()) {
                    var6_6 = new InventorySorter.Click[2];
                    var6_6[0] = this.pickup(source);
                    var6_6[1] = this.pickup(target);
                    return new InventorySorter.Move(target, CollectionsKt.listOf(var6_6));
                }
                var6_7 /* !! */  = this.swapButton(source);
                if (var6_7 /* !! */  != null) {
                    it = ((Number)var6_7 /* !! */ ).intValue();
                    $i$a$-let-InventorySorter$plan$1 = false;
                    return new InventorySorter.Move(target, CollectionsKt.listOf(\u0637\u064d.INSTANCE.swap(target, it)));
                }
                var6_7 /* !! */  = this.swapButton(target);
                if (var6_7 /* !! */  != null) {
                    it = var6_7 /* !! */ ;
                    it = ((Number)it).intValue();
                    $i$a$-takeIf-InventorySorter$plan$2 = false;
                    var7_22 = sourceSlot.canInsert(targetSlot.getStack()) ? it : null;
                    if (var7_22 != null) {
                        it = ((Number)var7_22).intValue();
                        $i$a$-let-InventorySorter$plan$3 = false;
                        return new InventorySorter.Move(target, CollectionsKt.listOf(\u0637\u064d.INSTANCE.swap(source, it)));
                    }
                }
                $this$firstOrNull$iv = \u0637\u064d.swapSlots;
                $i$f$firstOrNull = false;
                for (T element$iv : $this$firstOrNull$iv) {
                    pivot = ((Number)element$iv).intValue();
                    $i$a$-firstOrNull-InventorySorter$plan$4 = false;
                    if (pivot == source) ** GOTO lbl-1000
                    if (pivot == target) ** GOTO lbl-1000
                    v2 = targetSlot.getStack();
                    Intrinsics.checkNotNullExpressionValue(v2, "getItem(...)");
                    if (\u0637\u064d.INSTANCE.canPivot(menu, source, v2, pivot)) {
                        v3 = true;
                    } else lbl-1000:
                    // 3 sources

                    {
                        v3 = false;
                    }
                    if (!v3) continue;
                    v4 = element$iv;
                    break block12;
                }
                v4 = null;
            }
            var6_7 /* !! */  = v4;
            if (var6_7 /* !! */  != null) {
                pivot = ((Number)var6_7 /* !! */ ).intValue();
                $i$a$-let-InventorySorter$plan$5 = false;
                v5 = \u0637\u064d.INSTANCE.swapButton(pivot);
                Intrinsics.checkNotNull(v5);
                button = v5;
                pivot = new InventorySorter.Click[3];
                pivot[0] = \u0637\u064d.INSTANCE.swap(source, button);
                pivot[1] = \u0637\u064d.INSTANCE.swap(target, (int)var10_20);
                pivot[2] = \u0637\u064d.INSTANCE.swap(source, (int)var10_20);
                return new InventorySorter.Move(target, CollectionsKt.listOf(pivot));
            }
            $this$firstOrNull$iv = InventorySnapshot.Companion.getSTORAGE_SLOTS();
            $i$f$firstOrNull = false;
            for (T element$iv : $this$firstOrNull$iv) {
                slot = ((Number)element$iv).intValue();
                $i$a$-firstOrNull-InventorySorter$plan$buffer$1 = false;
                if (slot == source) ** GOTO lbl-1000
                if (slot == target) ** GOTO lbl-1000
                var14_28 = menu.getSlot(slot);
                var15_29 = false;
                v6 = var14_28.getStack().isEmpty() && var14_28.canInsert(targetSlot.getStack());
                if (v6) {
                    v7 = true;
                } else lbl-1000:
                // 3 sources

                {
                    v7 = false;
                }
                if (!v7) continue;
                v8 = var11_25;
                break block13;
            }
            v8 = null;
        }
        v9 = v8;
        if (v9 == null) {
            return null;
        }
        buffer = v9;
        var7_22 = new InventorySorter.Click[4];
        var7_22[0] = this.pickup((int)var3_3);
        var7_22[1] = this.pickup((int)var6_8);
        var7_22[2] = this.pickup((int)var2_2);
        var7_22[3] = this.pickup((int)var3_3);
        return new InventorySorter.Move(target, CollectionsKt.listOf(var7_22));
    }

    private \u0637\u064d() {
    }

    private final boolean matches(ItemStack first, ItemStack second) {
        return \u062a\u0627.INSTANCE.matches(first, second);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean canFill(int target, InventorySnapshot snapshot, ScreenHandler menu, PlayerEntity player) {
        ItemStack expected = snapshot.expectedAt(target);
        Slot slot = menu.getSlot(target);
        Intrinsics.checkNotNullExpressionValue(slot, "getSlot(...)");
        Slot slot2 = slot;
        if (expected.isEmpty()) return false;
        ItemStack itemStack = slot2.getStack();
        Intrinsics.checkNotNullExpressionValue(itemStack, "getItem(...)");
        if (this.matches(itemStack, expected)) return false;
        if (!slot2.canInsert(expected)) return false;
        if (slot2.getStack().isEmpty()) return true;
        if (!slot2.canTakeItems(player)) return false;
        return true;
    }

    private final InventorySorter.Click swap(int slot, int button) {
        return new InventorySorter.Click(slot, button, SlotActionType.SWAP);
    }

    public final boolean getRunning() {
        return running;
    }

    public final void stop() {
        running = false;
        nextStepAt = 0L;
        clicking = false;
    }

    private final InventorySorter.Move nextMove(InventorySnapshot snapshot, ScreenHandler menu, PlayerEntity player) {
        return SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence(InventorySnapshot.Companion.getMANAGED_SLOTS()), arg_0 -> \u0637\u064d.nextMove$lambda$0(snapshot, menu, player, arg_0)), arg_0 -> \u0637\u064d.nextMove$lambda$1(snapshot, menu, player, arg_0)));
    }
}

