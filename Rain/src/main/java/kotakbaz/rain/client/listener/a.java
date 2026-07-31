/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.listener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.client.interfaces.ILoadable;
import kotakbaz.rain.client.listener.Listener;
import kotakbaz.rain.client.listener.listeners.InputListener;
import kotakbaz.rain.client.listener.listeners.RenderListener;
import kotakbaz.rain.client.listener.listeners.RestrictionListener;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0002\u00a2\u0006\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lkotakbaz/rain/client/listener/ListenerManager;", "Lkotakbaz/rain/client/interfaces/ILoadable;", "<init>", "()V", "", "load", "", "Lkotakbaz/rain/client/listener/Listener;", "listener", "add", "([Lkotakbaz/rain/client/listener/Listener;)V", "", "listeners", "Ljava/util/List;", "getListeners", "()Ljava/util/List;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nListenerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenerManager.kt\nkotakbaz/rain/client/listener/ListenerManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1915#2,2:24\n*S KotlinDebug\n*F\n+ 1 ListenerManager.kt\nkotakbaz/rain/client/listener/ListenerManager\n*L\n16#1:24,2\n*E\n"})
public final class a
implements ILoadable {
    @NotNull
    public static final a INSTANCE;
    @NotNull
    private static final List<Listener> a;
    public static int[] b;

    private a() {
    }

    @NotNull
    public final List<Listener> getListeners() {
        return a;
    }

    @Override
    public void load() {
        long l2 = -3605969049748667440L;
        int n2 = b[0];
        n2 += b[1];
        Object object = new Listener[n2 ^= b[2]];
        int n3 = b[3];
        n3 += b[4];
        object[n3 += kotakbaz.rain.client.listener.a.b[5]] = RenderListener.INSTANCE;
        int n4 = b[6];
        n4 += b[7];
        object[n4 -= kotakbaz.rain.client.listener.a.b[8]] = InputListener.INSTANCE;
        int n5 = b[9];
        n5 -= b[10];
        object[n5 ^= kotakbaz.rain.client.listener.a.b[11]] = RestrictionListener.INSTANCE;
        this.add((Listener[])object);
        object = a;
        long l3 = l2;
        int n6 = b[12];
        n6 ^= b[13];
        l2 = l3 ^ (0L ^ l3) & -1L << (n6 -= b[14]);
        Iterator iterator2 = object.iterator();
        while (iterator2.hasNext()) {
            Object t2 = iterator2.next();
            Listener listener = (Listener)t2;
            long l4 = l2;
            int n7 = b[15];
            n7 ^= b[16];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n7 += b[17]);
            listener.init();
        }
    }

    private final void add(Listener ... listener) {
        CollectionsKt.addAll((Collection)a, listener);
    }

    static {
        kotakbaz.rain.client.listener.a.a();
        INSTANCE = new a();
        a = new ArrayList();
    }

    public static void a() {
        b = new int[0x8DB7 ^ 0x8DA5];
        kotakbaz.rain.client.listener.a.b[0xE193 ^ 0xE183] = 0xFFFF1E5B ^ 0xE183;
        kotakbaz.rain.client.listener.a.b[0x10E87 ^ 0x10E88] = 0x10EA7 ^ 0x10E88;
        kotakbaz.rain.client.listener.a.b[0x683F ^ 0x682E] = 0x6807 ^ 0x682E;
        kotakbaz.rain.client.listener.a.b[0xA881 ^ 0xA881] = 0xA8F5 ^ 0xA881;
        kotakbaz.rain.client.listener.a.b[0x728 ^ 0x723] = 0xFFFFF8FF ^ 0x723;
        kotakbaz.rain.client.listener.a.b[0xC419 ^ 0xC415] = 0xFFFF3BD7 ^ 0xC415;
        kotakbaz.rain.client.listener.a.b[0x60FA ^ 0x60F4] = 0xFFFF9F56 ^ 0x60F4;
        kotakbaz.rain.client.listener.a.b[0x2398 ^ 0x239F] = 0x23D9 ^ 0x239F;
        kotakbaz.rain.client.listener.a.b[0x32 ^ 0x3F] = 0x3F ^ 0x3F;
        kotakbaz.rain.client.listener.a.b[0x68FD ^ 0x68F8] = 0x68C5 ^ 0x68F8;
        kotakbaz.rain.client.listener.a.b[0xAAEA ^ 0xAAEB] = 0xFFFF5533 ^ 0xAAEB;
        kotakbaz.rain.client.listener.a.b[0x9E11 ^ 0x9E18] = 0xFFFF61E9 ^ 0x9E18;
        kotakbaz.rain.client.listener.a.b[0x1670 ^ 0x1676] = 0xFFFFE9B2 ^ 0x1676;
        kotakbaz.rain.client.listener.a.b[0x92C0 ^ 0x92C2] = 0x928D ^ 0x92C2;
        kotakbaz.rain.client.listener.a.b[0xB674 ^ 0xB670] = 0xB651 ^ 0xB670;
        kotakbaz.rain.client.listener.a.b[0xEFF0 ^ 0xEFF3] = 0xFFFF1051 ^ 0xEFF3;
        kotakbaz.rain.client.listener.a.b[0xBADF ^ 0xBAD5] = 0xBAC6 ^ 0xBAD5;
        kotakbaz.rain.client.listener.a.b[0xC7F9 ^ 0xC7F1] = 0xC7F8 ^ 0xC7F1;
    }
}

