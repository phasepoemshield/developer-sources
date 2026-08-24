/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.client.listener.Listener;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062d\u0644;
import oxxxde.\u0630\u062e;
import oxxxde.\u0639\u062b;
import oxxxde.\u0647;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0002\u00a2\u0006\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Loxxxde/\u062f\u0639;", "Loxxxde/\u0647;", "<init>", "()V", "", "load", "", "Loxxxde/\u062a\u0645;", "listener", "add", "([Lkotakbaz/rain/client/listener/Listener;)V", "", "listeners", "Ljava/util/List;", "getListeners", "()Ljava/util/List;", "rain-visuals"})
public final class \u062f\u0639
implements \u0647 {
    @NotNull
    public static final \u062f\u0639 INSTANCE = new \u062f\u0639();
    @NotNull
    private static final List<Listener> listeners = new ArrayList();

    @NotNull
    public final List<Listener> getListeners() {
        return listeners;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void load() {
        Listener[] listenerArray = new Listener[3];
        listenerArray[0] = \u0630\u062e.INSTANCE;
        listenerArray[1] = \u062d\u0644.INSTANCE;
        listenerArray[2] = \u0639\u062b.INSTANCE;
        this.add(listenerArray);
        Iterable $this$forEach$iv = listeners;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            void var5_5;
            Object element$iv = iterator2.next();
            Listener it = (Listener)element$iv;
            boolean bl = false;
            var5_5.init();
        }
    }

    private final void add(Listener ... listener) {
        CollectionsKt.addAll((Collection)listeners, listener);
    }

    private \u062f\u0639() {
    }
}

