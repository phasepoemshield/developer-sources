/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 *  net.minecraft.screen.ScreenHandler
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotakbaz.rain.ui.inventory.InventoryAnalysis;
import kotakbaz.rain.ui.inventory.InventoryLoadoutAnalyzer;
import kotakbaz.rain.ui.inventory.InventorySlotState;
import kotakbaz.rain.ui.inventory.InventorySlotVisual;
import kotakbaz.rain.ui.inventory.InventorySnapshot;
import kotakbaz.rain.ui.inventory.MissingInventoryItem;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062a\u0627;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001+B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\u00020 *\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*\u00a8\u0006,"}, d2={"Loxxxde/\u0633\u0632;", "", "<init>", "()V", "Loxxxde/\u0651;", "snapshot", "Lnet/minecraft/class_1703;", "menu", "Loxxxde/\u0633\u062e;", "analyze", "(Lkotakbaz/rain/ui/inventory/InventorySnapshot;Lnet/minecraft/class_1703;)Lkotakbaz/rain/ui/inventory/InventoryAnalysis;", "", "slot", "", "slotName", "(I)Ljava/lang/String;", "Lnet/minecraft/class_1799;", "current", "expected", "Loxxxde/\u0631\u064d;", "stateOf", "(Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Lkotakbaz/rain/ui/inventory/InventorySlotState;", "", "destinations", "(Lkotakbaz/rain/ui/inventory/InventorySnapshot;Lnet/minecraft/class_1703;)Ljava/util/Map;", "", "Loxxxde/\u0637\u0641;", "missingItems", "(Lkotakbaz/rain/ui/inventory/InventorySnapshot;Lnet/minecraft/class_1703;)Ljava/util/List;", "", "Loxxxde/\u0636\u0631;", "stack", "", "add", "(Ljava/util/List;Lnet/minecraft/class_1799;)V", "first", "second", "", "matches", "(Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z", "", "ARMOR_NAMES", "[Ljava/lang/String;", "ItemTotal", "rain-visuals"})
public final class \u0633\u0632 {
    @NotNull
    public static final \u0633\u0632 INSTANCE = new \u0633\u0632();
    @NotNull
    private static final String[] ARMOR_NAMES;

    /*
     * Enabled aggressive block sorting
     */
    private final InventorySlotState stateOf(ItemStack current, ItemStack expected) {
        InventorySlotState inventorySlotState;
        if (this.matches(current, expected)) {
            inventorySlotState = InventorySlotState.CORRECT;
            return inventorySlotState;
        }
        if (current.isEmpty()) {
            if (!expected.isEmpty()) {
                inventorySlotState = InventorySlotState.MISSING;
                return inventorySlotState;
            }
        }
        if (!current.isEmpty()) {
            if (!expected.isEmpty()) {
                inventorySlotState = InventorySlotState.CONFLICT;
                return inventorySlotState;
            }
        }
        if (current.isEmpty()) return null;
        inventorySlotState = InventorySlotState.MISPLACED;
        return inventorySlotState;
    }

    static {
        String[] stringArray = new String[4];
        stringArray[0] = "\u0428\u043b\u0435\u043c";
        stringArray[1] = "\u041d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a";
        stringArray[2] = "\u041f\u043e\u043d\u043e\u0436\u0438";
        stringArray[3] = "\u0411\u043e\u0442\u0438\u043d\u043a\u0438";
        ARMOR_NAMES = stringArray;
    }

    @NotNull
    public final String slotName(int slot) {
        Object object;
        int n = slot;
        IntRange intRange = InventorySnapshot.Companion.getARMOR_SLOTS();
        int n2 = intRange.getFirst();
        boolean bl = n <= intRange.getLast() ? n2 <= n : false;
        if (bl) {
            object = ARMOR_NAMES[slot - InventorySnapshot.Companion.getARMOR_SLOTS().getFirst()];
        } else {
            intRange = InventorySnapshot.Companion.getHOTBAR_SLOTS();
            n2 = intRange.getFirst();
            boolean bl2 = n <= intRange.getLast() ? n2 <= n : false;
            if (bl2) {
                object = "\u0425\u043e\u0442\u0431\u0430\u0440 " + (slot - InventorySnapshot.Companion.getHOTBAR_SLOTS().getFirst() + 1);
            } else {
                intRange = InventorySnapshot.Companion.getINVENTORY_SLOTS();
                n2 = intRange.getFirst();
                boolean bl3 = n <= intRange.getLast() ? n2 <= n : false;
                if (bl3) {
                    int n3 = slot - InventorySnapshot.Companion.getINVENTORY_SLOTS().getFirst();
                    object = "\u0418\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u044c: \u0440\u044f\u0434 " + (n3 / 9 + 1) + ", \u0441\u043b\u043e\u0442 " + (n3 % 9 + 1);
                } else {
                    object = n == 45 ? "\u0412\u0442\u043e\u0440\u0430\u044f \u0440\u0443\u043a\u0430" : "\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u044b\u0439 \u0441\u043b\u043e\u0442";
                }
            }
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    private final Map<Integer, Integer> destinations(InventorySnapshot snapshot, ScreenHandler menu) {
        var4_3 = InventorySnapshot.Companion.getMANAGED_SLOTS();
        var5_4 = new ArrayList<E>();
        $i$f$filterTo = false;
        for (T element$iv : $this$filterTo$iv) {
            slot = ((Number)element$iv).intValue();
            $i$a$-filterTo-InventoryLoadoutAnalyzer$destinations$targets$1 = false;
            expected = snapshot.expectedAt(slot);
            if (expected.isEmpty()) ** GOTO lbl-1000
            v0 = menu.getSlot(slot).getStack();
            Intrinsics.checkNotNullExpressionValue(v0, "getItem(...)");
            if (!\u0633\u0632.INSTANCE.matches(v0, expected)) {
                v1 = true;
            } else lbl-1000:
            // 2 sources

            {
                v1 = false;
            }
            if (!v1) continue;
            destination$iv.add(element$iv);
        }
        targets = (List)destination$iv;
        $this$destinations_u24lambda_u241 = var4_3 = MapsKt.createMapBuilder();
        $i$a$-buildMap-InventoryLoadoutAnalyzer$destinations$1 = false;
        $this$forEach$iv = InventorySnapshot.Companion.getMANAGED_SLOTS();
        $i$f$forEach = false;
        var9_10 = $this$forEach$iv.iterator();
        while (var9_10.hasNext()) {
            block6: {
                source = element$iv = ((IntIterator)var9_10).nextInt();
                $i$a$-forEach-InventoryLoadoutAnalyzer$destinations$1$1 = false;
                Intrinsics.checkNotNullExpressionValue(menu.getSlot(source).getStack(), "getItem(...)");
                if (current.isEmpty() || \u0633\u0632.INSTANCE.matches(current, snapshot.expectedAt(source))) continue;
                $this$indexOfFirst$iv = targets;
                $i$f$indexOfFirst = false;
                index$iv = false;
                for (E item$iv : $this$indexOfFirst$iv) {
                    it = ((Number)item$iv).intValue();
                    $i$a$-indexOfFirst-InventoryLoadoutAnalyzer$destinations$1$1$index$1 = false;
                    if (\u0633\u0632.INSTANCE.matches(current, snapshot.expectedAt((int)var19_22))) {
                        v2 = var16_19;
                        break block6;
                    }
                    ++var16_19;
                }
                v2 = -1;
            }
            if ((index = v2) < 0) continue;
            $this$destinations_u24lambda_u241.put(source, targets.remove((int)var21_24));
        }
        return MapsKt.build(var4_3);
    }

    private final boolean matches(ItemStack first, ItemStack second) {
        return \u062a\u0627.INSTANCE.matches(first, second);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final InventoryAnalysis analyze(@NotNull InventorySnapshot snapshot, @NotNull ScreenHandler menu) {
        void var2_2;
        void var1_1;
        void var4_22;
        void var8_7;
        void $this$mapNotNullTo$iv$iv;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(menu, "menu");
        Map<Integer, Integer> destinations = this.destinations(snapshot, menu);
        Iterable $this$mapNotNull$iv = InventorySnapshot.Companion.getMANAGED_SLOTS();
        boolean $i$f$mapNotNull = false;
        Iterable iterable = $this$mapNotNull$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$mapNotNullTo = false;
        void $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv$iv$iv.iterator();
        while (iterator2.hasNext()) {
            void var21_20;
            Pair<Integer, InventorySlotVisual> it$iv$iv;
            InventorySlotState state;
            ItemStack current;
            int element$iv$iv$iv;
            int element$iv$iv = element$iv$iv$iv = ((IntIterator)iterator2).nextInt();
            boolean bl = false;
            int slot = element$iv$iv;
            boolean bl2 = false;
            Intrinsics.checkNotNullExpressionValue(menu.getSlot(slot).getStack(), "getItem(...)");
            ItemStack expected = snapshot.expectedAt(slot);
            if ((INSTANCE.stateOf(current, expected) == null ? null : TuplesKt.to(slot, new InventorySlotVisual(state, expected, destinations.get(slot), destinations.values().contains(slot)))) == null) continue;
            it$iv$iv = it$iv$iv;
            boolean bl3 = false;
            destination$iv$iv.add(var21_20);
        }
        Map visuals = MapsKt.toMap((List)var8_7);
        return new InventoryAnalysis((Map<Integer, InventorySlotVisual>)var4_22, this.missingItems((InventorySnapshot)var1_1, (ScreenHandler)var2_2));
    }

    private \u0633\u0632() {
    }

    private final void add(List<InventoryLoadoutAnalyzer.ItemTotal> $this$add, ItemStack stack) {
        Object v0;
        block3: {
            Iterable $this$firstOrNull$iv = $this$add;
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                InventoryLoadoutAnalyzer.ItemTotal it = (InventoryLoadoutAnalyzer.ItemTotal)element$iv;
                boolean bl = false;
                if (!INSTANCE.matches(it.getStack(), stack)) continue;
                v0 = element$iv;
                break block3;
            }
            v0 = null;
        }
        InventoryLoadoutAnalyzer.ItemTotal itemTotal = v0;
        if (itemTotal != null) {
            InventoryLoadoutAnalyzer.ItemTotal it = itemTotal;
            boolean bl = false;
            it.setCount(it.getCount() + stack.getCount());
        } else {
            $this$add.add(new InventoryLoadoutAnalyzer.ItemTotal(stack, stack.getCount(), false, 4, null));
        }
    }

    /*
     * WARNING - void declaration
     */
    private final List<MissingInventoryItem> missingItems(InventorySnapshot snapshot, ScreenHandler menu) {
        void var7_8;
        void $this$mapTo$iv$iv;
        int slot;
        int element$iv;
        List totals = new ArrayList();
        Iterable $this$forEach$iv = InventorySnapshot.Companion.getMANAGED_SLOTS();
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            slot = element$iv = ((IntIterator)iterator2).nextInt();
            boolean bl = false;
            ItemStack expected = snapshot.expectedAt(slot);
            if (expected.isEmpty()) continue;
            INSTANCE.add(totals, expected);
        }
        $this$forEach$iv = InventorySnapshot.Companion.getMANAGED_SLOTS();
        $i$f$forEach = false;
        iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            Object v0;
            block5: {
                ItemStack current;
                slot = element$iv = ((IntIterator)iterator2).nextInt();
                boolean bl = false;
                Intrinsics.checkNotNullExpressionValue(menu.getSlot(slot).getStack(), "getItem(...)");
                if (current.isEmpty()) continue;
                Iterable $this$firstOrNull$iv = totals;
                boolean $i$f$firstOrNull = false;
                for (Object element$iv2 : $this$firstOrNull$iv) {
                    void var14_16;
                    InventoryLoadoutAnalyzer.ItemTotal it = (InventoryLoadoutAnalyzer.ItemTotal)element$iv2;
                    boolean bl2 = false;
                    if (!INSTANCE.matches(it.getStack(), current)) continue;
                    v0 = var14_16;
                    break block5;
                }
                v0 = null;
            }
            InventoryLoadoutAnalyzer.ItemTotal itemTotal = v0;
            if (itemTotal == null) continue;
            itemTotal.setPresent(true);
        }
        Iterable $this$filterNot$iv = totals;
        boolean $i$f$filterNot = false;
        Iterable $this$filterNotTo$iv$iv = $this$filterNot$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterNotTo = false;
        for (Object element$iv$iv : $this$filterNotTo$iv$iv) {
            InventoryLoadoutAnalyzer.ItemTotal p0 = (InventoryLoadoutAnalyzer.ItemTotal)element$iv$iv;
            boolean bl = false;
            if (p0.getPresent()) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        Iterable $this$map$iv = (List)destination$iv$iv;
        boolean $i$f$map = false;
        $this$filterNotTo$iv$iv = $this$map$iv;
        destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            void var11_13;
            InventoryLoadoutAnalyzer.ItemTotal it = (InventoryLoadoutAnalyzer.ItemTotal)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            ItemStack itemStack = it.getStack().copyWithCount(1);
            Intrinsics.checkNotNullExpressionValue(itemStack, "copyWithCount(...)");
            collection.add(new MissingInventoryItem(itemStack, var11_13.getCount()));
        }
        return (List)var7_8;
    }
}

