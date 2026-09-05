/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10533
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  java.util.SequencedMap
 *  minecraft.class02277
 *  minecraft.class03152
 *  minecraft.class03164
 *  minecraft.class03175
 *  minecraft.class03190
 *  minecraft.class05896
 *  minecraft.class05900
 *  minecraft.class06244
 *  minecraft.class07001
 *  minecraft.class07321
 *  minecraft.class07368
 *  minecraft.class07536
 *  minecraft.class07709
 *  minecraft.class07720
 *  minecraft.class08240
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10533;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.io.IOException;
import java.nio.file.Path;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.SequencedMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class02277;
import minecraft.class03152;
import minecraft.class03164;
import minecraft.class03175;
import minecraft.class03190;
import minecraft.class05896;
import minecraft.class05900;
import minecraft.class05924;
import minecraft.class06244;
import minecraft.class07001;
import minecraft.class07321;
import minecraft.class07368;
import minecraft.class07536;
import minecraft.class07709;
import minecraft.class07720;
import minecraft.class08240;
import org.slf4j.Logger;

public class class05918
implements class03190,
AutoCloseable {
    public static final Supplier<class07001> N = () -> null;
    private static final Logger y = LogUtils.getLogger();
    private final AtomicBoolean L = new AtomicBoolean();
    private final class08240 u;
    private final class07368 i;
    private final SequencedMap<class07321, class05924> R = new LinkedHashMap();
    private final Long2ObjectLinkedOpenHashMap<CompletableFuture<BitSet>> M = new Long2ObjectLinkedOpenHashMap();
    private static final int B = 1024;

    private void L() {
        this.u.N((Runnable)new class10533(class05900.field_27238.ordinal(), this::y));
    }

    protected class05918(class02277 class022772, Path path, boolean bl) {
        this.i = new class07368(class022772, path, bl);
        this.u = new class08240(class05900.values().length, (Executor)class07536.Z(), "IOWorker-" + class022772.L());
    }

    @Override
    public void close() throws IOException {
        if (!this.L.compareAndSet(false, true)) {
            return;
        }
        this.u();
        this.u.close();
        try {
            this.i.close();
        }
        catch (Exception exception) {
            y.error("Failed to close storage", (Throwable)exception);
        }
    }

    private void u() {
        this.u.N(class05900.field_27239.ordinal(), (T completableFuture) -> completableFuture.complete(class06244.field_17274)).join();
    }

    private CompletableFuture<BitSet> y(int n, int n2) {
        return CompletableFuture.supplyAsync(() -> {
            class07321 class073213 = class07321.N((int)n, (int)n2);
            class07321 class073214 = class07321.y((int)n, (int)n2);
            BitSet bitSet = new BitSet();
            class07321.N((class07321)class073213, (class07321)class073214).forEach(class073212 -> {
                class07001 class070012;
                class03164 class031642 = new class03164(new class03152[]{new class03152(class07720.N, "DataVersion"), new class03152(class07001.y, "blending_data")});
                try {
                    this.N((class07321)class073212, (class03175)class031642).join();
                }
                catch (Exception exception) {
                    y.warn("Failed to scan chunk {}", class073212, (Object)exception);
                    return;
                }
                class07709 class077092 = class031642.u();
                if (class077092 instanceof class07001 && this.N(class070012 = (class07001)class077092)) {
                    int n = class073212.E() * 32 + class073212.U();
                    bitSet.set(n);
                }
            });
            return bitSet;
        }, (Executor)class07536.B());
    }

    private void y() {
        Map.Entry entry = this.R.pollFirstEntry();
        if (entry == null) {
            return;
        }
        this.N((class07321)entry.getKey(), (class05924)entry.getValue());
        this.L();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private CompletableFuture<BitSet> N(int n, int n2) {
        long l = class07321.u((int)n, (int)n2);
        Long2ObjectLinkedOpenHashMap<CompletableFuture<BitSet>> var5 = this.M;
        synchronized (var5) {
            CompletableFuture<BitSet> var6;
            CompletableFuture completableFuture = (CompletableFuture)this.M.getAndMoveToFirst(l);
            if (completableFuture == null) {
                var6 = this.y(n, n2);
                this.M.putAndMoveToFirst(l, var6);
                if (this.M.size() > 1024) {
                    this.M.removeLast();
                }
            }
            return var6;
        }
    }

    public boolean N(class07321 class073212, int n) {
        class07321 class073213 = new class07321(class073212.B - n, class073212.Z - n);
        class07321 class073214 = new class07321(class073212.B + n, class073212.Z + n);
        for (int i = class073213.Z(); i <= class073214.Z(); ++i) {
            for (int j = class073213.z(); j <= class073214.z(); ++j) {
                BitSet bitSet = this.N(i, j).join();
                if (bitSet.isEmpty()) continue;
                class07321 class073215 = class07321.N((int)i, (int)j);
                int n2 = Math.max(class073213.B - class073215.B, 0);
                int n3 = Math.max(class073213.Z - class073215.Z, 0);
                int n4 = Math.min(class073214.B - class073215.B, 31);
                int n5 = Math.min(class073214.Z - class073215.Z, 31);
                for (int k = n2; k <= n4; ++k) {
                    for (int i2 = n3; i2 <= n5; ++i2) {
                        int n6 = i2 * 32 + k;
                        if (!bitSet.get(n6)) continue;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public CompletableFuture<Void> N(class07321 class073212, class03175 class031752) {
        return this.N_54(() -> {
            try {
                class05924 class059242 = (class05924)this.R.get((Object)class073212);
                if (class059242 != null) {
                    if (class059242.N != null) {
                        class059242.N.y(class031752);
                    }
                } else {
                    this.i.N(class073212, class031752);
                }
                return null;
            }
            catch (Exception exception) {
                y.warn("Failed to bulk scan chunk {}", (Object)class073212, (Object)exception);
                throw exception;
            }
        });
    }

    private <T> CompletableFuture<T> N_54(class05896<T> class058962) {
        return this.u.N(class05900.field_27237.ordinal(), (T completableFuture) -> {
            if (!this.L.get()) {
                try {
                    completableFuture.complete(class058962.get());
                }
                catch (Exception exception) {
                    completableFuture.completeExceptionally(exception);
                }
            }
            this.L();
        });
    }

    private <T> CompletableFuture<T> N(Supplier<T> supplier) {
        return this.u.N(class05900.field_27237.ordinal(), (T completableFuture) -> {
            if (!this.L.get()) {
                completableFuture.complete(supplier.get());
            }
            this.L();
        });
    }

    private boolean N(class07001 class070012) {
        if (class070012.y("DataVersion", 0) < 4295) {
            return true;
        }
        return class070012.W("blending_data").isPresent();
    }

    public CompletableFuture<Void> N(boolean bl) {
        CompletionStage completionStage = this.N(() -> CompletableFuture.allOf((CompletableFuture[])this.R.values().stream().map(class059242 -> class059242.y).toArray(CompletableFuture[]::new))).thenCompose(Function.identity());
        if (bl) {
            return ((CompletableFuture)completionStage).thenCompose(void_ -> this.N_54(() -> {
                try {
                    this.i.N();
                    return null;
                }
                catch (Exception exception) {
                    y.warn("Failed to synchronize chunks", (Throwable)exception);
                    throw exception;
                }
            }));
        }
        return ((CompletableFuture)completionStage).thenCompose(void_ -> this.N(() -> null));
    }

    public CompletableFuture<Optional<class07001>> N(class07321 class073212) {
        return this.N_54(() -> {
            class05924 class059242 = (class05924)this.R.get((Object)class073212);
            if (class059242 != null) {
                return Optional.ofNullable(class059242.N());
            }
            try {
                class07001 class070012 = this.i.N(class073212);
                return Optional.ofNullable(class070012);
            }
            catch (Exception exception) {
                y.warn("Failed to read chunk {}", (Object)class073212, (Object)exception);
                throw exception;
            }
        });
    }

    public CompletableFuture<Void> N(class07321 class073212, Supplier<class07001> supplier) {
        return this.N(() -> {
            class07001 class070012 = (class07001)supplier.get();
            class05924 class059242 = (class05924)this.R.computeIfAbsent((Object)class073212, class073212 -> new class05924(class070012));
            class059242.N = class070012;
            return class059242.y;
        }).thenCompose(Function.identity());
    }

    public CompletableFuture<Void> N(class07321 class073212, class07001 class070012) {
        return this.N(class073212, () -> class070012);
    }

    private void N(class07321 class073212, class05924 class059242) {
        try {
            this.i.N(class073212, class059242.N);
            class059242.y.complete(null);
        }
        catch (Exception exception) {
            y.error("Failed to store chunk {}", (Object)class073212, (Object)exception);
            class059242.y.completeExceptionally(exception);
        }
    }

    public class02277 N() {
        return this.i.y();
    }
}

