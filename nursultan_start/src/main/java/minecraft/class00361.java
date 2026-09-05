/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00191
 *  minecraft.class01022
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class03069
 *  minecraft.class03519
 *  minecraft.class03785
 *  minecraft.class07536
 *  minecraft.class08326
 *  minecraft.class08352
 *  minecraft.class08839
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package minecraft;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class00191;
import minecraft.class00370;
import minecraft.class01022;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class03069;
import minecraft.class03519;
import minecraft.class03785;
import minecraft.class07536;
import minecraft.class08326;
import minecraft.class08352;
import minecraft.class08839;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class class00361 {
    private static Logger N = LoggerFactory.getLogger((String)"minecraft.class00361");
    private static final class03069 y = class03069.N((String)"items");

    public static CompletableFuture<class00370> N(class01089 class010892, Executor executor) {
        class01022 class010222 = class03785.N().N();
        return CompletableFuture.supplyAsync(() -> y.N(class010892), executor).thenCompose(map -> {
            ArrayList arrayList = new ArrayList(map.size());
            map.forEach((class018942, class010792) -> arrayList.add(CompletableFuture.supplyAsync(() -> {
                class08352 class083522;
                block8: {
                    class01894 class018943 = y.y(class018942);
                    BufferedReader bufferedReader = class010792.method_43039();
                    try {
                        class00191 class001912 = new class00191((class01929)class010222);
                        class03519 class035192 = class001912.N((DynamicOps)JsonOps.INSTANCE);
                        class08839 class088393 = class08839.N.parse((DynamicOps)class035192, (Object)class08326.N((Reader)bufferedReader)).ifError(error -> N.error("Couldn't parse item model '{}' from pack '{}': {}", new Object[]{class018943, class010792.method_14480(), error.message()})).result().map(class088392 -> {
                            if (class001912.y()) {
                                return class088392.N(class001912.N());
                            }
                            return class088392;
                        }).orElse(null);
                        class083522 = new class08352(class018943, class088393);
                        if (bufferedReader == null) break block8;
                    }
                    catch (Throwable throwable) {
                        try {
                            if (bufferedReader != null) {
                                try {
                                    ((Reader)bufferedReader).close();
                                }
                                catch (Throwable throwable2) {
                                    throwable.addSuppressed(throwable2);
                                }
                            }
                            throw throwable;
                        }
                        catch (Exception exception) {
                            N.error("Failed to open item model {} from pack '{}'", new Object[]{class018942, class010792.method_14480(), exception});
                            return new class08352(class018943, null);
                        }
                    }
                    ((Reader)bufferedReader).close();
                }
                return class083522;
            }, executor)));
            return class07536.L(arrayList).thenApply(list -> {
                HashMap<class01894, class08839> hashMap = new HashMap<class01894, class08839>();
                for (class08352 class083522 : list) {
                    if (class083522.y() == null) continue;
                    hashMap.put(class083522.N(), class083522.y());
                }
                return new class00370(hashMap);
            });
        });
    }
}

