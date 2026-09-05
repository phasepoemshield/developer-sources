/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class05097
 *  minecraft.class05111
 *  minecraft.class05127
 *  minecraft.class06202
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01852;
import minecraft.class01880;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class05127;
import minecraft.class06202;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01888 {
    private static final Logger N = LogUtils.getLogger();
    private static @Nullable CompletableFuture<class01852> y;

    private static CompletableFuture<class01852> y() {
        if (class06202.Nq().Nz()) {
            return CompletableFuture.completedFuture(new class01852(class01880.field_45188));
        }
        if (true) {
            return CompletableFuture.completedFuture(new class01852(class01880.field_45185));
        }
        return CompletableFuture.supplyAsync(() -> {
            class05111 class051112 = class05111.N();
            try {
                if (class051112.Z() != class05127.field_19582) {
                    return new class01852(class01880.field_45186);
                }
                if (!class051112.B()) {
                    return new class01852(class01880.field_45187);
                }
                return new class01852(class01880.field_45185);
            }
            catch (class05097 class050972) {
                N.error("Couldn't connect to realms", (Throwable)class050972);
                if (class050972.N.N() == 401) {
                    return new class01852(class01880.field_45188);
                }
                return new class01852(class050972);
            }
        }, (Executor)class07536.Z());
    }

    public static CompletableFuture<class01852> N() {
        if (y == null || class01888.N(y)) {
            y = class01888.y();
        }
        return y;
    }

    private static boolean N(CompletableFuture<class01852> completableFuture) {
        class01852 class018522 = completableFuture.getNow(null);
        return class018522 != null && class018522.y() != null;
    }
}

