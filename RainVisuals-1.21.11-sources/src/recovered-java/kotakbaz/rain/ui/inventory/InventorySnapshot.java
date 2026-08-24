/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 */
package kotakbaz.rain.ui.inventory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062a\u0621;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0011J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0011JJ\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\nH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u00020\u001eH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u0011\u00a8\u0006("}, d2={"Loxxxde/\u0651;", "", "", "Lnet/minecraft/class_1799;", "armor", "offhand", "inventory", "hotbar", "<init>", "(Ljava/util/List;Lnet/minecraft/class_1799;Ljava/util/List;Ljava/util/List;)V", "", "menuSlot", "expectedAt", "(I)Lnet/minecraft/class_1799;", "deepCopy", "()Lkotakbaz/rain/ui/inventory/InventorySnapshot;", "component1", "()Ljava/util/List;", "component2", "()Lnet/minecraft/class_1799;", "component3", "component4", "copy", "(Ljava/util/List;Lnet/minecraft/class_1799;Ljava/util/List;Ljava/util/List;)Lkotakbaz/rain/ui/inventory/InventorySnapshot;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getArmor", "Lnet/minecraft/class_1799;", "getOffhand", "getInventory", "getHotbar", "Companion", "rain-visuals"})
public final class InventorySnapshot {
    @NotNull
    private static final IntRange STORAGE_SLOTS;
    @NotNull
    private final List<ItemStack> armor;
    public static final int OFFHAND_SLOT = 45;
    @NotNull
    private final List<ItemStack> hotbar;
    @NotNull
    private static final IntRange INVENTORY_SLOTS;
    @NotNull
    private static final IntRange ARMOR_SLOTS;
    @NotNull
    private final List<ItemStack> inventory;
    @NotNull
    public static final \u062a\u0621 Companion;
    @NotNull
    private static final IntRange HOTBAR_SLOTS;
    @NotNull
    private final ItemStack offhand;
    @NotNull
    private static final IntRange MANAGED_SLOTS;

    @NotNull
    public final List<ItemStack> getHotbar() {
        return this.hotbar;
    }

    @NotNull
    public String toString() {
        return "InventorySnapshot(armor=" + this.armor + ", offhand=" + this.offhand + ", inventory=" + this.inventory + ", hotbar=" + this.hotbar + ")";
    }

    @NotNull
    public final List<ItemStack> component4() {
        return this.hotbar;
    }

    @NotNull
    public final ItemStack getOffhand() {
        return this.offhand;
    }

    public int hashCode() {
        int result = ((Object)this.armor).hashCode();
        result = result * 31 + this.offhand.hashCode();
        result = result * 31 + ((Object)this.inventory).hashCode();
        result = result * 31 + ((Object)this.hotbar).hashCode();
        return result;
    }

    @NotNull
    public final ItemStack component2() {
        return this.offhand;
    }

    public static final /* synthetic */ IntRange access$getMANAGED_SLOTS$cp() {
        return MANAGED_SLOTS;
    }

    @NotNull
    public final ItemStack expectedAt(int menuSlot) {
        ItemStack itemStack;
        int n = menuSlot;
        IntRange intRange = ARMOR_SLOTS;
        int n2 = intRange.getFirst();
        boolean bl = n <= intRange.getLast() ? n2 <= n : false;
        if (bl) {
            itemStack = this.armor.get(menuSlot - ARMOR_SLOTS.getFirst());
        } else {
            intRange = INVENTORY_SLOTS;
            n2 = intRange.getFirst();
            boolean bl2 = n <= intRange.getLast() ? n2 <= n : false;
            if (bl2) {
                itemStack = this.inventory.get(menuSlot - INVENTORY_SLOTS.getFirst());
            } else {
                intRange = HOTBAR_SLOTS;
                n2 = intRange.getFirst();
                boolean bl3 = n <= intRange.getLast() ? n2 <= n : false;
                if (bl3) {
                    itemStack = this.hotbar.get(menuSlot - HOTBAR_SLOTS.getFirst());
                } else if (n == 45) {
                    itemStack = this.offhand;
                } else {
                    ItemStack itemStack2 = ItemStack.EMPTY;
                    itemStack = itemStack2;
                    Intrinsics.checkNotNullExpressionValue(itemStack2, "EMPTY");
                }
            }
        }
        return itemStack;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final InventorySnapshot deepCopy() {
        void var4_4;
        Collection<ItemStack> collection;
        Collection<ItemStack> collection2;
        Collection collection3;
        ItemStack it;
        Iterable $this$mapTo$iv$iv;
        Iterable $this$map$iv = this.armor;
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            it = (ItemStack)item$iv$iv;
            collection3 = destination$iv$iv;
            boolean bl = false;
            ItemStack itemStack = it.copy();
            Intrinsics.checkNotNullExpressionValue(itemStack, "copy(...)");
            collection3.add(itemStack);
        }
        List list = (List)destination$iv$iv;
        ItemStack itemStack = this.offhand.copy();
        Intrinsics.checkNotNullExpressionValue(itemStack, "copy(...)");
        $this$map$iv = this.inventory;
        ItemStack itemStack2 = itemStack;
        collection3 = list;
        $i$f$map = false;
        $this$mapTo$iv$iv = $this$map$iv;
        destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            it = (ItemStack)item$iv$iv;
            collection2 = destination$iv$iv;
            boolean bl = false;
            ItemStack itemStack3 = it.copy();
            Intrinsics.checkNotNullExpressionValue(itemStack3, "copy(...)");
            collection2.add(itemStack3);
        }
        collection2 = (List)destination$iv$iv;
        $this$map$iv = this.hotbar;
        $i$f$map = false;
        $this$mapTo$iv$iv = $this$map$iv;
        destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            void var8_8;
            it = (ItemStack)item$iv$iv;
            collection = destination$iv$iv;
            boolean bl = false;
            ItemStack itemStack4 = var8_8.copy();
            Intrinsics.checkNotNullExpressionValue(itemStack4, "copy(...)");
            collection.add(itemStack4);
        }
        Collection<ItemStack> collection4 = collection = (List)var4_4;
        Collection<ItemStack> collection5 = collection2;
        ItemStack itemStack5 = itemStack2;
        Collection collection6 = collection3;
        return new InventorySnapshot((List<ItemStack>)collection6, itemStack5, (List<ItemStack>)collection5, (List<ItemStack>)collection4);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InventorySnapshot)) {
            return false;
        }
        InventorySnapshot inventorySnapshot = (InventorySnapshot)other;
        if (!Intrinsics.areEqual(this.armor, inventorySnapshot.armor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offhand, inventorySnapshot.offhand)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.inventory, inventorySnapshot.inventory)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.hotbar, inventorySnapshot.hotbar)) {
            return false;
        }
        return true;
    }

    static {
        Companion = new \u062a\u0621(null);
        ARMOR_SLOTS = new IntRange(5, 8);
        INVENTORY_SLOTS = new IntRange(9, 35);
        HOTBAR_SLOTS = new IntRange(36, 44);
        MANAGED_SLOTS = new IntRange(ARMOR_SLOTS.getFirst(), 45);
        STORAGE_SLOTS = new IntRange(INVENTORY_SLOTS.getFirst(), HOTBAR_SLOTS.getLast());
    }

    @NotNull
    public final List<ItemStack> component3() {
        return this.inventory;
    }

    @NotNull
    public final List<ItemStack> component1() {
        return this.armor;
    }

    public static /* synthetic */ InventorySnapshot copy$default(InventorySnapshot inventorySnapshot, List list, ItemStack itemStack, List list2, List list3, int n, Object object) {
        if ((n & 1) != 0) {
            list = inventorySnapshot.armor;
        }
        if ((n & 2) != 0) {
            itemStack = inventorySnapshot.offhand;
        }
        if ((n & 4) != 0) {
            list2 = inventorySnapshot.inventory;
        }
        if ((n & 8) != 0) {
            list3 = inventorySnapshot.hotbar;
        }
        return inventorySnapshot.copy(list, itemStack, list2, list3);
    }

    @NotNull
    public final List<ItemStack> getArmor() {
        return this.armor;
    }

    @NotNull
    public final List<ItemStack> getInventory() {
        return this.inventory;
    }

    public static final /* synthetic */ IntRange access$getHOTBAR_SLOTS$cp() {
        return HOTBAR_SLOTS;
    }

    public static final /* synthetic */ IntRange access$getINVENTORY_SLOTS$cp() {
        return INVENTORY_SLOTS;
    }

    @NotNull
    public final InventorySnapshot copy(@NotNull List<ItemStack> armor, @NotNull ItemStack offhand, @NotNull List<ItemStack> inventory, @NotNull List<ItemStack> hotbar) {
        Intrinsics.checkNotNullParameter(armor, "armor");
        Intrinsics.checkNotNullParameter(offhand, "offhand");
        Intrinsics.checkNotNullParameter(inventory, "inventory");
        Intrinsics.checkNotNullParameter(hotbar, "hotbar");
        return new InventorySnapshot(armor, offhand, inventory, hotbar);
    }

    public InventorySnapshot(@NotNull List<ItemStack> armor, @NotNull ItemStack offhand, @NotNull List<ItemStack> inventory, @NotNull List<ItemStack> hotbar) {
        Intrinsics.checkNotNullParameter(armor, "armor");
        Intrinsics.checkNotNullParameter(offhand, "offhand");
        Intrinsics.checkNotNullParameter(inventory, "inventory");
        Intrinsics.checkNotNullParameter(hotbar, "hotbar");
        this.armor = armor;
        this.offhand = offhand;
        this.inventory = inventory;
        this.hotbar = hotbar;
    }

    public static final /* synthetic */ IntRange access$getARMOR_SLOTS$cp() {
        return ARMOR_SLOTS;
    }

    public static final /* synthetic */ IntRange access$getSTORAGE_SLOTS$cp() {
        return STORAGE_SLOTS;
    }
}

