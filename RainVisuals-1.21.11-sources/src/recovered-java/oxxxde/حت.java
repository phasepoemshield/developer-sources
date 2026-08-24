/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.ui.menu.misc.AnimatedTextTransition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0628\u0641;
import oxxxde.\u062a\u062d;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0015\u00a8\u0006\u0018"}, d2={"Loxxxde/\u062d\u062a;", "", "", "duration", "travel", "<init>", "(FF)V", "", "target", "", "Loxxxde/\u0630\u0625;", "update", "(Ljava/lang/String;)Ljava/util/List;", "", "reset", "()V", "F", "Loxxxde/\u0631\u064a;", "animation", "Loxxxde/\u0631\u064a;", "current", "Ljava/lang/String;", "previous", "Layer", "rain-visuals"})
public final class \u062d\u062a {
    private final float travel;
    @NotNull
    private String current;
    private final float duration;
    @NotNull
    private String previous;
    @NotNull
    private final AnimationUtil animation;

    public \u062d\u062a(float duration, float travel) {
        this.duration = duration;
        this.travel = travel;
        this.animation = new AnimationUtil(1.0f);
        this.current = "";
        this.previous = "";
    }

    public /* synthetic */ \u062d\u062a(float f, float f2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            f = 190.0f;
        }
        if ((n & 2) != 0) {
            f2 = 2.0f;
        }
        this(f, f2);
    }

    public final void reset() {
        this.current = "";
        this.previous = "";
        AnimationUtil.animate$default(this.animation, 1.0f, 0.0f, null, 4, null);
    }

    @NotNull
    public final List<AnimatedTextTransition.Layer> update(@Nullable String target) {
        String string = target;
        if (string == null) {
            string = "";
        }
        String normalizedTarget = string;
        if (!Intrinsics.areEqual(normalizedTarget, this.current)) {
            this.previous = this.current;
            this.current = normalizedTarget;
            AnimationUtil.animate$default(this.animation, 0.0f, 0.0f, null, 4, null);
        }
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float progress = RangesKt.coerceIn(this.animation.animate(1.0f, this.duration, new \u062a\u062d(\u0628\u06412)), 0.0f, 1.0f);
        ArrayList layers = new ArrayList(2);
        boolean bl = ((CharSequence)this.previous).length() > 0;
        if (bl && progress < 0.999f) {
            ((Collection)layers).add(new AnimatedTextTransition.Layer(this.previous, 1.0f - progress, -this.travel * progress));
        }
        boolean bl2 = ((CharSequence)this.current).length() > 0;
        if (bl2 && progress > 0.001f) {
            ((Collection)layers).add(new AnimatedTextTransition.Layer(this.current, progress, this.travel * (1.0f - progress)));
        }
        if (progress >= 0.999f) {
            this.previous = "";
        }
        return (List)((Object)\u0628\u06412);
    }

    public \u062d\u062a() {
        this(0.0f, 0.0f, 3, null);
    }
}

