/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.Flora;
import sweetie.evaware.flora.FloraAutomation;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0004\b\t\u0010\u0007\u00a8\u0006\n"}, d2={"Loxxxde/\u0631\u0638;", "", "<init>", "()V", "any", "", "post", "(Ljava/lang/Object;)V", "register", "unregister", "rain-visuals"})
public final class \u0631\u0638 {
    @NotNull
    public static final \u0631\u0638 INSTANCE = new \u0631\u0638();

    public final void post(@NotNull Object any) {
        Intrinsics.checkNotNullParameter(any, "any");
        Flora.post(any);
    }

    private \u0631\u0638() {
    }

    public final void register(@NotNull Object any) {
        Intrinsics.checkNotNullParameter(any, "any");
        FloraAutomation.register(any);
    }

    public final void unregister(@NotNull Object any) {
        Intrinsics.checkNotNullParameter(any, "any");
        FloraAutomation.unregister(any);
    }
}

