/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0628\u0641;
import oxxxde.\u062a;
import oxxxde.\u062d\u0630;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0004\b\u000f\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00018\u00002\b\u0010\u0010\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0004\u0018\u00018\u00002\b\u0010\u0010\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u001a\u00a8\u0006\u001b"}, d2={"Loxxxde/\u062a\u0633;", "T", "", "initial", "<init>", "(Ljava/lang/Object;)V", "target", "", "select", "(Ljava/lang/Object;)Z", "", "updateAndGetAlpha", "()F", "alpha", "item", "isSelected", "value", "current", "Ljava/lang/Object;", "getCurrent", "()Ljava/lang/Object;", "next", "getNext", "Loxxxde/\u0631\u064a;", "animation", "Loxxxde/\u0631\u064a;", "F", "rain-visuals"})
public final class \u062a\u0633<T> {
    private float alpha;
    @Nullable
    private T current;
    @Nullable
    private T next;
    @NotNull
    private final AnimationUtil animation;

    public final boolean isSelected(T item) {
        return Intrinsics.areEqual(this.current, item) || Intrinsics.areEqual(this.next, item);
    }

    public \u062a\u0633(@Nullable T initial) {
        this.current = initial;
        this.animation = new AnimationUtil(initial != null ? 1.0f : 0.0f);
        this.alpha = initial != null ? 1.0f : 0.0f;
    }

    @Nullable
    public final T getNext() {
        return this.next;
    }

    public final float alpha() {
        return this.alpha;
    }

    public final boolean select(T target) {
        block3: {
            block2: {
                if (Intrinsics.areEqual(this.current, target)) break block2;
                if (this.next == null) break block3;
            }
            return false;
        }
        this.next = target;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public final float updateAndGetAlpha() {
        float f;
        if (this.next != null) {
            void var1_2;
            \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
            float value = this.animation.animate(0.0f, 70.0f, new \u062a(\u0628\u06412));
            if (value <= 0.05f) {
                this.current = this.next;
                this.next = null;
            }
            f = var1_2;
        } else {
            \u0628\u0641 \u0628\u06413 = \u0628\u0641.INSTANCE;
            f = this.animation.animate(1.0f, 90.0f, new \u062d\u0630(\u0628\u06413));
        }
        this.alpha = f;
        return this.alpha;
    }

    @Nullable
    public final T getCurrent() {
        return this.current;
    }
}

