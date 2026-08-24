/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.ui.menu.misc.AnimatedListTracker;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u064c;
import oxxxde.\u0628\u0641;
import oxxxde.\u062e\u0621;
import oxxxde.\u062e\u0648;
import oxxxde.\u0633\u0634;
import oxxxde.\u0633\u064d;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u001b\u001cB\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2={"Loxxxde/\u062b\u0651;", "K", "T", "", "", "presenceDuration", "moveDuration", "<init>", "(FF)V", "", "values", "Lkotlin/Function1;", "keyOf", "Loxxxde/\u062c\u0629;", "update", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "clear", "()V", "", "hasItems", "()Z", "F", "Ljava/util/LinkedHashMap;", "Loxxxde/\u0633\u0634;", "states", "Ljava/util/LinkedHashMap;", "Item", "State", "rain-visuals"})
public final class \u062b\u0651<K, T> {
    @NotNull
    private final LinkedHashMap<K, \u0633\u0634<T>> states;
    private final float moveDuration;
    private final float presenceDuration;

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final List<AnimatedListTracker.Item<T>> update(@NotNull List<? extends T> values2, @NotNull Function1<? super T, ? extends K> keyOf) {
        Intrinsics.checkNotNullParameter(values2, "values");
        Intrinsics.checkNotNullParameter(keyOf, "keyOf");
        Collection<\u0633\u0634<T>> collection = this.states.values();
        Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
        Iterable $this$forEach$iv = collection;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            \u0633\u0634 it = (\u0633\u0634)element$iv;
            boolean bl = false;
            it.setPresent(false);
        }
        Iterable $this$forEachIndexed$iv = values2;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            void var13_21;
            void var14_22;
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object value = item$iv;
            int index = n;
            boolean bl = false;
            K key = keyOf.invoke(value);
            float position = index;
            \u0633\u0634 existing = this.states.get(key);
            if (existing == null) {
                ((Map)this.states).put(key, new \u0633\u0634(value, position, true, new AnimationUtil(0.0f, 1, null), new AnimationUtil(position + 0.16f)));
                continue;
            }
            existing.setValue(value);
            var14_22.setTargetPosition((float)var13_21);
            var14_22.setPresent(true);
        }
        ArrayList rendered = new ArrayList(this.states.size());
        Iterator<Map.Entry<K, \u0633\u0634<T>>> iterator2 = this.states.entrySet().iterator();
        while (iterator2.hasNext()) {
            void var5_8;
            void var6_11;
            void var7_14;
            \u0633\u0634<T> state;
            Intrinsics.checkNotNullExpressionValue(iterator2.next().getValue(), "<get-value>(...)");
            \u0628\u0641 item$iv = \u0628\u0641.INSTANCE;
            float presence = RangesKt.coerceIn(state.getPresenceAnimation().animate(state.getPresent() ? 1.0f : 0.0f, this.presenceDuration, new \u0627\u064c(item$iv)), 0.0f, 1.0f);
            \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
            float position = state.getPositionAnimation().animate(state.getTargetPosition(), this.moveDuration, new \u062e\u0648(\u0628\u06412));
            if (!state.getPresent() && presence <= 0.001f) {
                iterator2.remove();
                continue;
            }
            ((Collection)rendered).add(new AnimatedListTracker.Item<T>(state.getValue(), (float)var7_14, (float)var6_11, var5_8.getPresent()));
        }
        Comparator comparator = new \u062e\u0621();
        return CollectionsKt.sortedWith(rendered, new \u0633\u064d(comparator));
    }

    public final boolean hasItems() {
        return !((Map)this.states).isEmpty();
    }

    public \u062b\u0651() {
        this(0.0f, 0.0f, 3, null);
    }

    public /* synthetic */ \u062b\u0651(float f, float f2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            f = 190.0f;
        }
        if ((n & 2) != 0) {
            f2 = 230.0f;
        }
        this(f, f2);
    }

    public \u062b\u0651(float presenceDuration, float moveDuration) {
        this.presenceDuration = presenceDuration;
        this.moveDuration = moveDuration;
        this.states = new LinkedHashMap();
    }

    public final void clear() {
        this.states.clear();
    }
}

