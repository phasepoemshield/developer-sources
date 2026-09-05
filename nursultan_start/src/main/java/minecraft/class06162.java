/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01073
 *  minecraft.class01080
 *  minecraft.class01081
 *  minecraft.class01089
 *  minecraft.class01603
 *  minecraft.class07536
 *  net.fabricmc.fabric.impl.resource.FabricLifecycledResourceManager
 *  net.fabricmc.fabric.impl.resource.ResourceLoaderImpl
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class01073;
import minecraft.class01080;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class01603;
import minecraft.class06144;
import minecraft.class06157;
import minecraft.class06160;
import minecraft.class06164;
import minecraft.class06244;
import minecraft.class07536;
import net.fabricmc.fabric.impl.resource.FabricLifecycledResourceManager;
import net.fabricmc.fabric.impl.resource.ResourceLoaderImpl;
import org.jspecify.annotations.Nullable;

public class class06162<S>
implements class06164 {
    private static final int L = 2;
    private static final int u = 2;
    private static final int i = 1;
    final CompletableFuture<class06244> N = new CompletableFuture();
    private @Nullable CompletableFuture<List<S>> R;
    final Set<class01081> y;
    private final int M;
    private final AtomicInteger B = new AtomicInteger();
    private final AtomicInteger Z = new AtomicInteger();
    private final AtomicInteger z = new AtomicInteger();
    private final AtomicInteger U = new AtomicInteger();

    protected class06162(List<class01081> list) {
        this.M = list.size();
        this.y = new HashSet<class01081>(list);
    }

    private static List y(List list, class01089 class010892) {
        if (class010892 instanceof FabricLifecycledResourceManager) {
            return ResourceLoaderImpl.sort((class01603)((FabricLifecycledResourceManager)class010892).fabric$getResourceType(), (List)list);
        }
        return list;
    }

    @Override
    public float y() {
        int n = this.M - this.y.size();
        float f = class06162.N(this.Z.get(), this.U.get(), n);
        float f2 = class06162.N(this.B.get(), this.z.get(), this.M);
        return f / f2;
    }

    public static class06164 y(class01089 class010892, List<class01081> list, Executor executor, Executor executor2, CompletableFuture<class06244> completableFuture) {
        class06162<Void> class061622 = new class06162<Void>(list);
        class061622.y(executor, executor2, class010892, list, class06160.N, completableFuture);
        return class061622;
    }

    protected void y(Executor executor, Executor executor2, class01089 class010892, List<class01081> list, class06160<S> class061602, CompletableFuture<?> completableFuture) {
        this.R = this.N(executor, executor2, class010892, list, class061602, completableFuture);
    }

    private static List N(List list, class01089 class010892) {
        if (class010892 instanceof FabricLifecycledResourceManager) {
            return ResourceLoaderImpl.sort((class01603)((FabricLifecycledResourceManager)class010892).fabric$getResourceType(), (List)list);
        }
        return list;
    }

    private static boolean N(boolean bl) {
        return bl || ResourceLoaderImpl.DEBUG_PROFILE_RESOURCE_RELOADERS;
    }

    protected CompletableFuture<List<S>> N(Executor executor, Executor executor2, class01089 class010892, List<class01081> list, class06160<S> class061602, CompletableFuture<?> completableFuture) {
        Executor executor3 = runnable -> {
            this.B.incrementAndGet();
            executor.execute(() -> {
                runnable.run();
                this.Z.incrementAndGet();
            });
        };
        Executor executor4 = runnable -> {
            this.z.incrementAndGet();
            executor2.execute(() -> {
                runnable.run();
                this.U.incrementAndGet();
            });
        };
        this.B.incrementAndGet();
        completableFuture.thenRun(this.Z::incrementAndGet);
        class01073 class010732 = new class01073(class010892);
        list.forEach(class010812 -> class010812.prepareSharedState(class010732));
        CompletableFuture<Object> completableFuture2 = completableFuture;
        ArrayList<CompletableFuture<S>> arrayList = new ArrayList<CompletableFuture<S>>();
        for (class01081 class010813 : list) {
            class01080 class010802 = this.N(class010813, completableFuture2, executor2);
            CompletableFuture<S> completableFuture3 = class061602.create(class010732, class010802, class010813, executor3, executor4);
            arrayList.add(completableFuture3);
            completableFuture2 = completableFuture3;
        }
        return class07536.u(arrayList);
    }

    private class01080 N(class01081 class010812, CompletableFuture<?> completableFuture, Executor executor) {
        return new class06157(this, executor, class010812, completableFuture);
    }

    @Override
    public CompletableFuture<?> N() {
        return Objects.requireNonNull(this.R, "not started");
    }

    private static int N(int n, int n2, int n3) {
        return n * 2 + n2 * 2 + n3 * 1;
    }

    public static class06164 N(class01089 class010892, List<class01081> list, Executor executor, Executor executor2, CompletableFuture<class06244> completableFuture, boolean bl) {
        if (bl = class06162.N(bl)) {
            CompletableFuture<class06244> completableFuture2 = completableFuture;
            Executor executor3 = executor2;
            Executor executor4 = executor;
            List<class01081> list2 = list;
            return class06144.N(class010892, class06162.y(list2, class010892), executor4, executor3, completableFuture2);
        }
        CompletableFuture<class06244> completableFuture3 = completableFuture;
        Executor executor5 = executor2;
        Executor executor6 = executor;
        List<class01081> list3 = list;
        return class06162.y(class010892, class06162.N(list3, class010892), executor6, executor5, completableFuture3);
    }
}

