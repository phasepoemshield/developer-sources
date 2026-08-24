/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.ContainerComponent
 *  net.minecraft.component.type.LoreComponent
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.Text
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062f\u0625;
import oxxxde.\u0634\u064d;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u062a;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u000289B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u0003J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b$\u0010\u0003J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b%\u0010!J\u000f\u0010&\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b&\u0010\u0003J\u0017\u0010'\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b'\u0010\u001dR\u0014\u0010)\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b2\u00103R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b4\u00101R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107\u00a8\u0006:"}, d2={"Loxxxde/\u062e\u0650;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Lnet/minecraft/class_2775;", "packet", "", "handlePickup", "(Lnet/minecraft/class_2775;)V", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "onEnable", "onDisable", "Lnet/minecraft/class_746;", "player", "", "Loxxxde/\u0634\u064d;", "captureShulkers", "(Lnet/minecraft/class_746;)Ljava/util/List;", "previousSnapshot", "currentSnapshot", "logShulkerContentGrowth", "(Ljava/util/List;Ljava/util/List;)V", "Lnet/minecraft/class_1799;", "stack", "", "isShulker", "(Lnet/minecraft/class_1799;)Z", "", "amount", "rememberPacketPickup", "(Lnet/minecraft/class_1799;I)V", "consumeRecentPacketPickup", "(Lnet/minecraft/class_1799;I)I", "discardExpiredPacketPickups", "sendPickupMessage", "resetTracking", "isDonateItem", "", "PACKET_DEDUPLICATION_WINDOW_MS", "J", "Loxxxde/\u062e\u0630;", "onlyDonateItems", "Loxxxde/\u062e\u0630;", "", "Loxxxde/\u0638\u062a;", "recentPacketPickups", "Ljava/util/List;", "snapshotPlayer", "Lnet/minecraft/class_746;", "shulkerSnapshot", "Lkotlin/text/Regex;", "donateMarkerRegex", "Lkotlin/text/Regex;", "ShulkerGroup", "RecentPickup", "rain-visuals"})
public final class \u062e\u0650
extends Module {
    @NotNull
    private static final BooleanSetting onlyDonateItems;
    private static final long PACKET_DEDUPLICATION_WINDOW_MS = 1000L;
    @Nullable
    private static ClientPlayerEntity snapshotPlayer;
    @NotNull
    public static final \u062e\u0650 INSTANCE;
    @NotNull
    private static List<\u0634\u064d> shulkerSnapshot;
    @NotNull
    private static final List<\u0638\u062a> recentPacketPickups;
    @NotNull
    private static final Regex donateMarkerRegex;

    @Override
    public void onEnable() {
        List<Object> list;
        ClientPlayerEntity player;
        snapshotPlayer = player = \u0636\u0643.getMc().player;
        ClientPlayerEntity clientPlayerEntity = player;
        if (clientPlayerEntity != null) {
            ClientPlayerEntity p0 = clientPlayerEntity;
            boolean bl = false;
            list = this.captureShulkers(p0);
        } else {
            list = null;
        }
        List list2 = list;
        if (list == null) {
            list2 = CollectionsKt.emptyList();
        }
        shulkerSnapshot = list2;
        recentPacketPickups.clear();
    }

    private final void resetTracking() {
        snapshotPlayer = null;
        shulkerSnapshot = CollectionsKt.emptyList();
        recentPacketPickups.clear();
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            \u062e\u0650 $this$onUpdate_u24lambda_u240 = this;
            boolean bl = false;
            $this$onUpdate_u24lambda_u240.resetTracking();
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        List<\u0634\u064d> currentSnapshot = this.captureShulkers(player);
        if (snapshotPlayer != player) {
            snapshotPlayer = player;
            shulkerSnapshot = currentSnapshot;
            recentPacketPickups.clear();
            return;
        }
        this.logShulkerContentGrowth(shulkerSnapshot, currentSnapshot);
        shulkerSnapshot = currentSnapshot;
        this.discardExpiredPacketPickups();
    }

    private final void discardExpiredPacketPickups() {
        long cutoff = System.currentTimeMillis() - 1000L;
        CollectionsKt.removeAll(recentPacketPickups, arg_0 -> \u062e\u0650.discardExpiredPacketPickups$lambda$0(cutoff, arg_0));
    }

    private final boolean isShulker(ItemStack stack) {
        Item item = stack.getItem();
        BlockItem blockItem = item instanceof BlockItem ? (BlockItem)item : null;
        if (blockItem == null) {
            return false;
        }
        BlockItem blockItem2 = blockItem;
        return blockItem2.getBlock() instanceof ShulkerBoxBlock;
    }

    private final void sendPickupMessage(ItemStack stack, int amount) {
        MutableText mutableText = Text.literal((String)"\u0412\u044b \u043f\u043e\u0434\u043e\u0431\u0440\u0430\u043b\u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442 ").append((Text)stack.getName().copy()).append((Text)Text.literal((String)(" x" + amount)));
        Intrinsics.checkNotNullExpressionValue(mutableText, "append(...)");
        MutableText message = mutableText;
        \u062f\u0625.INSTANCE.sendClientMessage((Text)message);
    }

    /*
     * WARNING - void declaration
     */
    private final void logShulkerContentGrowth(List<\u0634\u064d> previousSnapshot, List<\u0634\u064d> currentSnapshot) {
        Iterator<\u0634\u064d> iterator2 = currentSnapshot.iterator();
        while (iterator2.hasNext()) {
            \u0634\u064d previousGroup;
            Object v0;
            \u0634\u064d currentGroup;
            block4: {
                currentGroup = iterator2.next();
                Iterable $this$firstOrNull$iv = previousSnapshot;
                boolean $i$f$firstOrNull = false;
                for (Object element$iv : $this$firstOrNull$iv) {
                    \u0634\u064d it = (\u0634\u064d)element$iv;
                    boolean bl = false;
                    if (!ItemStack.areItemsAndComponentsEqual((ItemStack)it.getShell(), (ItemStack)currentGroup.getShell())) continue;
                    v0 = element$iv;
                    break block4;
                }
                v0 = null;
            }
            if ((\u0634\u064d)v0 == null || previousGroup.getContainerCount() != currentGroup.getContainerCount()) continue;
            for (ItemStack currentStack : currentGroup.getContents()) {
                void var10_12;
                void var7_7;
                int amountToLog;
                Object v1;
                block5: {
                    Iterable $this$firstOrNull$iv = previousGroup.getContents();
                    boolean $i$f$firstOrNull = false;
                    for (Object element$iv : $this$firstOrNull$iv) {
                        void var13_17;
                        void var14_18;
                        ItemStack it = (ItemStack)element$iv;
                        boolean bl = false;
                        if (!ItemStack.areItemsAndComponentsEqual((ItemStack)var14_18, (ItemStack)currentStack)) continue;
                        v1 = var13_17;
                        break block5;
                    }
                    v1 = null;
                }
                ItemStack itemStack = v1;
                int previousAmount = itemStack != null ? itemStack.getCount() : 0;
                int addedAmount = currentStack.getCount() - previousAmount;
                if (addedAmount <= 0 || ((Boolean)onlyDonateItems.getValue()).booleanValue() && !this.isDonateItem(currentStack) || (amountToLog = this.consumeRecentPacketPickup(currentStack, addedAmount)) <= 0) continue;
                this.sendPickupMessage((ItemStack)var7_7, (int)var10_12);
            }
        }
    }

    private final boolean isDonateItem(ItemStack stack) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder $this$isDonateItem_u24lambda_u240 = stringBuilder;
        boolean bl = false;
        $this$isDonateItem_u24lambda_u240.append(stack.getName().getString());
        Object object = (LoreComponent)stack.get(DataComponentTypes.LORE);
        if (object != null && (object = object.lines()) != null) {
            Iterable $this$forEach$iv = (Iterable)object;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                Text line = (Text)element$iv;
                boolean bl2 = false;
                $this$isDonateItem_u24lambda_u240.append(' ');
                $this$isDonateItem_u24lambda_u240.append(line.getString());
            }
        }
        String visibleText = stringBuilder.toString();
        if (donateMarkerRegex.containsMatchIn(visibleText)) {
            return true;
        }
        return visibleText.codePoints().anyMatch(\u062e\u0650::isDonateItem$lambda$1);
    }

    /*
     * WARNING - void declaration
     */
    private final int consumeRecentPacketPickup(ItemStack stack, int amount) {
        void var3_3;
        this.discardExpiredPacketPickups();
        int remaining = amount;
        Iterator<\u0638\u062a> iterator2 = recentPacketPickups.iterator();
        while (iterator2.hasNext()) {
            if (remaining <= 0) break;
            \u0638\u062a pickup = iterator2.next();
            if (!ItemStack.areItemsAndComponentsEqual((ItemStack)pickup.getStack(), (ItemStack)stack)) continue;
            int consumed = Math.min(remaining, pickup.getRemainingAmount());
            remaining -= consumed;
            pickup.setRemainingAmount(pickup.getRemainingAmount() - consumed);
            if (pickup.getRemainingAmount() > 0) continue;
            iterator2.remove();
        }
        return (int)var3_3;
    }

    /*
     * WARNING - void declaration
     */
    private final List<\u0634\u064d> captureShulkers(ClientPlayerEntity player) {
        void var2_2;
        List groups2 = new ArrayList();
        int slot = 0;
        int n = player.getInventory().size();
        while (slot < n) {
            void var3_3;
            ItemStack shulker;
            Intrinsics.checkNotNullExpressionValue(player.getInventory().getStack(slot), "getItem(...)");
            if (this.isShulker(shulker)) {
                Object object;
                Object object2;
                Object v0;
                Iterator iterator2;
                ItemStack shell;
                block6: {
                    Intrinsics.checkNotNullExpressionValue(shulker.copyWithCount(1), "copyWithCount(...)");
                    shell.remove(DataComponentTypes.CONTAINER);
                    Iterable $this$firstOrNull$iv = groups2;
                    boolean $i$f$firstOrNull = false;
                    for (Object element$iv : $this$firstOrNull$iv) {
                        \u0634\u064d it = (\u0634\u064d)element$iv;
                        boolean bl = false;
                        if (!ItemStack.areItemsAndComponentsEqual((ItemStack)it.getShell(), (ItemStack)shell)) continue;
                        v0 = iterator2;
                        break block6;
                    }
                    v0 = null;
                }
                if ((object2 = (\u0634\u064d)v0) == null) {
                    object = new \u0634\u064d(shell, 0, null, 6, null);
                    \u0634\u064d p0 = object;
                    boolean bl = false;
                    groups2.add(p0);
                    object2 = object;
                }
                \u0634\u064d group = object2;
                group.setContainerCount(group.getContainerCount() + shulker.getCount());
                ContainerComponent containerComponent = (ContainerComponent)shulker.get(DataComponentTypes.CONTAINER);
                if (containerComponent != null && (object = containerComponent.iterateNonEmptyCopy()) != null) {
                    Object $this$forEach$iv = object;
                    boolean $i$f$forEach = false;
                    iterator2 = $this$forEach$iv.iterator();
                    while (iterator2.hasNext()) {
                        Object element$iv = iterator2.next();
                        ItemStack itemStack = (ItemStack)element$iv;
                        boolean bl = false;
                        group.addContent(itemStack);
                    }
                }
            }
            ++var3_3;
        }
        return var2_2;
    }

    private \u062e\u0650() {
        super("PickUpLogger", \u0638\u0646.getPLAYER(), "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u043f\u043e\u0434\u043e\u0431\u0440\u0430\u043d\u043d\u044b\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u0432 \u0447\u0430\u0442\u0435");
    }

    @Override
    public void onDisable() {
        this.resetTracking();
    }

    private static final boolean discardExpiredPacketPickups$lambda$0(long $cutoff, \u0638\u062a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCreatedAt() < $cutoff;
    }

    static {
        INSTANCE = new \u062e\u0650();
        onlyDonateItems = Module.boolean$default(INSTANCE, "\u0422\u043e\u043b\u044c\u043a\u043e \u0434\u043e\u043d\u0430\u0442 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b", false, null, 4, null);
        recentPacketPickups = new ArrayList();
        shulkerSnapshot = CollectionsKt.emptyList();
        donateMarkerRegex = new Regex("[\u2605\u2606\u2b50\u2728\u2764\u2665\u2765\u2726\u2727\u272a\u272f\u2730\u2756\u26a1\u2620\u265b\u265a\u2654\u2655\u2735\u2739\u273a\u26cf\u2694\u262f\u273f\u2742\u2743]|\\[\\s*<3\\s*]", RegexOption.IGNORE_CASE);
    }

    private static final boolean isDonateItem$lambda$1(int codePoint) {
        return switch (Character.getType(codePoint)) {
            case 18, 25, 26, 27, 28 -> true;
            default -> false;
        };
    }

    public final void handlePickup(@NotNull ItemPickupAnimationS2CPacket packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        if (!this.isEnabled()) {
            return;
        }
        if (!\u0636\u0643.getMc().isOnThread()) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld world = clientWorld;
        if (packet.getCollectorEntityId() != player.getId()) {
            return;
        }
        Entity entity = world.getEntityById(packet.getEntityId());
        ItemEntity itemEntity = entity instanceof ItemEntity ? (ItemEntity)entity : null;
        if (itemEntity == null) {
            return;
        }
        ItemEntity itemEntity2 = itemEntity;
        ItemStack itemStack = itemEntity2.getStack();
        Intrinsics.checkNotNullExpressionValue(itemStack, "getItem(...)");
        ItemStack stack = itemStack;
        if (stack.isEmpty()) {
            return;
        }
        if (((Boolean)onlyDonateItems.getValue()).booleanValue() && !this.isDonateItem(stack)) {
            return;
        }
        int amount = RangesKt.coerceAtLeast(packet.getStackAmount(), 1);
        this.rememberPacketPickup(stack, amount);
        this.sendPickupMessage(stack, amount);
    }

    private final void rememberPacketPickup(ItemStack stack, int amount) {
        this.discardExpiredPacketPickups();
        Collection collection = recentPacketPickups;
        ItemStack itemStack = stack.copyWithCount(1);
        Intrinsics.checkNotNullExpressionValue(itemStack, "copyWithCount(...)");
        collection.add(new \u0638\u062a(itemStack, amount, System.currentTimeMillis()));
    }
}

