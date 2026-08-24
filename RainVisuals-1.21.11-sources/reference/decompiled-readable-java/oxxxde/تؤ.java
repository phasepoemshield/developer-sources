/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.registry.RegistryWrapper$WrapperLookup
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotakbaz.rain.friend.FriendManager;
import kotakbaz.rain.ui.inventory.InventoryCard;
import kotakbaz.rain.ui.inventory.InventoryPreset;
import kotakbaz.rain.ui.inventory.InventorySnapshot;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0638\u0638;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198\u0006\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u00a8\u0006#"}, d2={"Loxxxde/\u062a\u0624;", "", "<init>", "()V", "", "clearSelection", "Lnet/minecraft/class_7225$class_7874;", "registries", "reload", "(Lnet/minecraft/class_7225$class_7874;)V", "", "name", "Loxxxde/\u0651;", "snapshot", "", "add", "(Ljava/lang/String;Lkotakbaz/rain/ui/inventory/InventorySnapshot;Lnet/minecraft/class_7225$class_7874;)Z", "Loxxxde/\u062b\u063a;", "card", "toggle", "(Lkotakbaz/rain/ui/inventory/InventoryCard;)V", "", "index", "delete", "(I)Z", "", "cards", "Ljava/util/List;", "getCards", "()Ljava/util/List;", "value", "selectedName", "Ljava/lang/String;", "getSelectedName", "()Ljava/lang/String;", "rain-visuals"})
public final class \u062a\u0624 {
    @NotNull
    private static final List<InventoryCard> cards;
    @Nullable
    private static String selectedName;
    @NotNull
    public static final \u062a\u0624 INSTANCE;

    public final void clearSelection() {
        selectedName = null;
    }

    static {
        INSTANCE = new \u062a\u0624();
        cards = new ArrayList();
    }

    public final boolean add(@NotNull String name, @NotNull InventorySnapshot snapshot, @NotNull RegistryWrapper.WrapperLookup registries) {
        boolean bl;
        block5: {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            Intrinsics.checkNotNullParameter(registries, "registries");
            Iterable $this$any$iv = cards;
            boolean $i$f$any = false;
            if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                bl = false;
            } else {
                for (Object element$iv : $this$any$iv) {
                    InventoryCard it = (InventoryCard)element$iv;
                    boolean bl2 = false;
                    if (!StringsKt.equals(it.getName(), name, true)) continue;
                    bl = true;
                    break block5;
                }
                bl = false;
            }
        }
        if (bl) {
            return false;
        }
        InventoryPreset inventoryPreset = FriendManager.INSTANCE.save(name, snapshot, registries);
        if (inventoryPreset == null) {
            return false;
        }
        InventoryPreset preset = inventoryPreset;
        ((Collection)cards).add(new InventoryCard(preset));
        return true;
    }

    @NotNull
    public final List<InventoryCard> getCards() {
        return cards;
    }

    /*
     * WARNING - void declaration
     */
    public final void reload(@NotNull RegistryWrapper.WrapperLookup registries) {
        Object v0;
        Collection collection;
        block4: {
            void $this$mapTo$iv$iv;
            Intrinsics.checkNotNullParameter(registries, "registries");
            cards.clear();
            collection = cards;
            Iterable $this$map$iv = FriendManager.INSTANCE.loadAll(registries);
            boolean $i$f$map = false;
            Iterable iterable = $this$map$iv;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            boolean $i$f$mapTo = false;
            for (Object item$iv$iv : $this$mapTo$iv$iv) {
                void var10_12;
                InventoryPreset p0 = (InventoryPreset)item$iv$iv;
                Collection collection2 = destination$iv$iv;
                boolean bl = false;
                collection2.add(new InventoryCard((InventoryPreset)var10_12));
            }
            $this$map$iv = (List)destination$iv$iv;
            CollectionsKt.addAll(collection, $this$map$iv);
            Iterable $this$firstOrNull$iv = cards;
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                void var6_6;
                InventoryCard it = (InventoryCard)element$iv;
                boolean bl = false;
                if (!Intrinsics.areEqual(it.getName(), selectedName)) continue;
                v0 = var6_6;
                break block4;
            }
            v0 = null;
        }
        InventoryCard selected = v0;
        if (selected == null) {
            \u0638\u0638.INSTANCE.unload();
        } else {
            \u0638\u0638.INSTANCE.load(((InventoryCard)((Object)collection)).getSnapshot());
        }
    }

    public final boolean delete(int index) {
        InventoryCard card = cards.get(index);
        if (!FriendManager.INSTANCE.delete(card.getId())) {
            return false;
        }
        if (Intrinsics.areEqual(selectedName, card.getName())) {
            \u0638\u0638.INSTANCE.unload();
        }
        cards.remove(index);
        return true;
    }

    private \u062a\u0624() {
    }

    public final void toggle(@NotNull InventoryCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        if (Intrinsics.areEqual(selectedName, card.getName())) {
            \u0638\u0638.INSTANCE.unload();
        } else {
            selectedName = card.getName();
            \u0638\u0638.INSTANCE.load(card.getSnapshot());
        }
    }

    @Nullable
    public final String getSelectedName() {
        return selectedName;
    }
}

