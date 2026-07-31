/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.listener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.client.interfaces.d;
import kotakbaz.rain.client.listener.listeners.A;
import kotakbaz.rain.client.listener.listeners.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from kotakbaz.rain.client.listener.a
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0002\u00a2\u0006\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lkotakbaz/rain/client/listener/ListenerManager;", "Lkotakbaz/rain/client/interfaces/ILoadable;", "<init>", "()V", "", "load", "", "Lkotakbaz/rain/client/listener/Listener;", "listener", "add", "([Lkotakbaz/rain/client/listener/Listener;)V", "", "listeners", "Ljava/util/List;", "getListeners", "()Ljava/util/List;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nListenerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenerManager.kt\nkotakbaz/rain/client/listener/ListenerManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1915#2,2:24\n*S KotlinDebug\n*F\n+ 1 ListenerManager.kt\nkotakbaz/rain/client/listener/ListenerManager\n*L\n16#1:24,2\n*E\n"})
public final class a_0
implements d {
    @NotNull
    public static final a_0 INSTANCE;
    @NotNull
    private static final List<kotakbaz.rain.client.listener.A> a;
    public static int[] b;

    private a_0() {
        super();
    }

    @NotNull
    public final List<kotakbaz.rain.client.listener.A> getListeners() {
        return a;
    }

    @Override
    public void load() {
        long l = -3605969049748667440L;
        int n = b[0];
        n += b[1];
        Object object = new kotakbaz.rain.client.listener.A[n ^= b[2]];
        int n2 = b[3];
        n2 += b[4];
        object[n2 += a_0.b[5]] = kotakbaz.rain.client.listener.listeners.a_0.INSTANCE;
        int n3 = b[6];
        n3 += b[7];
        object[n3 -= a_0.b[8]] = kotakbaz.rain.client.listener.listeners.b.INSTANCE;
        int n4 = b[9];
        n4 -= b[10];
        object[n4 ^= a_0.b[11]] = A.INSTANCE;
        this.add((kotakbaz.rain.client.listener.A[])object);
        object = a;
        long l2 = l;
        int n5 = b[12];
        n5 ^= b[13];
        l = l2 ^ (0L ^ l2) & -1L << (n5 -= b[14]);
        Iterator iterator2 = object.iterator();
        while (iterator2.hasNext()) {
            Object t2 = iterator2.next();
            kotakbaz.rain.client.listener.A a2 = (kotakbaz.rain.client.listener.A)t2;
            long l3 = l;
            int n6 = b[15];
            n6 ^= b[16];
            l = l3 ^ (0L ^ l3) & -1L >>> (n6 += b[17]);
            a2.init();
        }
    }

    private final void add(kotakbaz.rain.client.listener.A ... aArray) {
        CollectionsKt.addAll((Collection)a, aArray);
    }

    static {
        a_0.a();
        INSTANCE = new a_0();
        a = new ArrayList();
    }

    public static void a() {
        b = new int[0x8DB7 ^ 0x8DA5];
        a_0.b[0xE193 ^ 0xE183] = 0xFFFF1E5B ^ 0xE183;
        a_0.b[0x10E87 ^ 0x10E88] = 0x10EA7 ^ 0x10E88;
        a_0.b[0x683F ^ 0x682E] = 0x6807 ^ 0x682E;
        a_0.b[0xA881 ^ 0xA881] = 0xA8F5 ^ 0xA881;
        a_0.b[0x728 ^ 0x723] = 0xFFFFF8FF ^ 0x723;
        a_0.b[0xC419 ^ 0xC415] = 0xFFFF3BD7 ^ 0xC415;
        a_0.b[0x60FA ^ 0x60F4] = 0xFFFF9F56 ^ 0x60F4;
        a_0.b[0x2398 ^ 0x239F] = 0x23D9 ^ 0x239F;
        a_0.b[0x32 ^ 0x3F] = 0x3F ^ 0x3F;
        a_0.b[0x68FD ^ 0x68F8] = 0x68C5 ^ 0x68F8;
        a_0.b[0xAAEA ^ 0xAAEB] = 0xFFFF5533 ^ 0xAAEB;
        a_0.b[0x9E11 ^ 0x9E18] = 0xFFFF61E9 ^ 0x9E18;
        a_0.b[0x1670 ^ 0x1676] = 0xFFFFE9B2 ^ 0x1676;
        a_0.b[0x92C0 ^ 0x92C2] = 0x928D ^ 0x92C2;
        a_0.b[0xB674 ^ 0xB670] = 0xB651 ^ 0xB670;
        a_0.b[0xEFF0 ^ 0xEFF3] = 0xFFFF1051 ^ 0xEFF3;
        a_0.b[0xBADF ^ 0xBAD5] = 0xBAC6 ^ 0xBAD5;
        a_0.b[0xC7F9 ^ 0xC7F1] = 0xC7F8 ^ 0xC7F1;
    }
}

