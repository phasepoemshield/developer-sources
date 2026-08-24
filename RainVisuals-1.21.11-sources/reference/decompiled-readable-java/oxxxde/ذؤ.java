/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.HashMap;
import java.util.Map;
import kotakbaz.rain.event.types.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\b\u000b\u0010\fR8\u0010\u000f\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\rj\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u0001`\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2={"Loxxxde/\u0630\u0624;", "", "<init>", "()V", "T", "Loxxxde/\u0635\u0646;", "key", "value", "", "put", "(Lkotakbaz/rain/event/types/Event$Key;Ljava/lang/Object;)V", "get", "(Lkotakbaz/rain/event/types/Event$Key;)Ljava/lang/Object;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "data", "Ljava/util/HashMap;", "Key", "rain-visuals"})
public abstract class \u0630\u0624 {
    @NotNull
    private final HashMap<Event.Key<?>, Object> data = new HashMap();

    public final <T> void put(@NotNull Event.Key<T> key, @NotNull T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ((Map)this.data).put(key, value);
    }

    @Nullable
    public final <T> T get(@NotNull Event.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object object = this.data.get(key);
        if (object == null) {
            object = null;
        }
        return (T)object;
    }
}

