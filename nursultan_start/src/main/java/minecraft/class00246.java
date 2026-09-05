/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00072
 *  minecraft.class00276
 *  minecraft.class00280
 *  minecraft.class04609
 *  minecraft.class04712
 *  minecraft.class04771
 *  minecraft.class04987
 *  minecraft.class05097
 *  minecraft.class05098
 *  minecraft.class05111
 *  minecraft.class05114
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class08688
 *  minecraft.class08715
 *  minecraft.class08730
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import minecraft.class00072;
import minecraft.class00248;
import minecraft.class00276;
import minecraft.class00280;
import minecraft.class04609;
import minecraft.class04712;
import minecraft.class04771;
import minecraft.class04987;
import minecraft.class05097;
import minecraft.class05098;
import minecraft.class05111;
import minecraft.class05114;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class08688;
import minecraft.class08715;
import minecraft.class08730;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00246 {
    private static final Logger y = LogUtils.getLogger();
    public static final int N = 20;
    private final class05111 L = class05111.N();
    private final Path u;
    private final class00072 i;
    private final class04771 R;
    private final long M;
    private final class00276 B;
    private volatile boolean Z;
    private volatile @Nullable CompletableFuture<?> z;

    private class04987 L() throws class05097, InterruptedException {
        for (int i = 0; i < 20; ++i) {
            try {
                class04987 class049872 = this.L.B(this.M);
                if (this.Z) {
                    throw new class08730();
                }
                if (class049872 == null) continue;
                if (!class049872.N()) {
                    throw new class00248();
                }
                return class049872;
            }
            catch (class05098 class050982) {
                Thread.sleep((long)class050982.L * 1000L);
            }
        }
        throw new class00248();
    }

    public class00246(Path path, class00072 class000722, class04771 class047712, long l, class00276 class002762) {
        this.u = path;
        this.i = class000722;
        this.R = class047712;
        this.M = l;
        this.B = class002762;
    }

    public void y() {
        this.Z = true;
        CompletableFuture<?> var1 = this.z;
        if (var1 != null) {
            var1.cancel(true);
        }
    }

    public CompletableFuture<?> N() {
        return CompletableFuture.runAsync(() -> {
            Error error;
            File file = null;
            try {
                class04987 class049872 = this.L();
                file = class00280.N((Path)this.u, () -> this.Z);
                this.B.y();
                error = new class05114(file, this.M, this.i.N, class049872, this.R, class07529.y().comp_4025(), this.i.y.i, this.B.N());
                try {
                    class04712 class047122;
                    CompletableFuture var4;
                    this.z = var4 = error.N();
                    if (this.Z) {
                        var4.cancel(true);
                        return;
                    }
                    try {
                        class047122 = (class04712)var4.join();
                    }
                    catch (CompletionException completionException) {
                        throw completionException.getCause();
                    }
                    String string = class047122.N();
                    if (string != null) {
                        throw new class08715(string);
                    }
                    class04609.y((long)this.M);
                    this.L.N(this.M, this.i.N, this.i.y, this.i.L);
                }
                finally {
                    error.close();
                }
            }
            catch (class05097 class050972) {
                throw new class08715(class050972.N.y());
            }
            catch (InterruptedException | CancellationException exception) {
                throw new class08730();
            }
            catch (class08688 class086882) {
                throw class086882;
            }
            catch (Throwable throwable) {
                if (throwable instanceof Error) {
                    error = (Error)throwable;
                    throw error;
                }
                throw new class08715(throwable.getMessage());
            }
            finally {
                if (file != null) {
                    y.debug("Deleting file {}", (Object)file.getAbsolutePath());
                    file.delete();
                }
            }
        }, (Executor)class07536.B());
    }
}

