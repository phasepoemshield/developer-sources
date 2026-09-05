/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00891
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class03069
 *  minecraft.class04127
 *  minecraft.class07536
 *  minecraft.class08326
 *  minecraft.class08541
 *  minecraft.class08889
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00891;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class02572;
import minecraft.class02608;
import minecraft.class03069;
import minecraft.class04127;
import minecraft.class07536;
import minecraft.class08326;
import minecraft.class08541;
import minecraft.class08889;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class class02603 {
    private static Logger N = LoggerFactory.getLogger((String)"minecraft.class02603");
    private static final class03069 y = class03069.N((String)"blockstates");

    public static CompletableFuture<class02572> N(class01089 class010892, Executor executor) {
        Function function = class08541.N();
        return CompletableFuture.supplyAsync(() -> y.y(class010892), executor).thenCompose(map -> {
            ArrayList<CompletableFuture<Object>> arrayList = new ArrayList<CompletableFuture<Object>>(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(CompletableFuture.supplyAsync(() -> {
                    class01894 class018942 = y.y((class01894)entry.getKey());
                    class00507 class005072 = (class00507)function.apply(class018942);
                    if (class005072 == null) {
                        N.debug("Discovered unknown block state definition {}, ignoring", (Object)class018942);
                        return null;
                    }
                    List list = (List)entry.getValue();
                    ArrayList<class02608> arrayList = new ArrayList<class02608>(list.size());
                    for (class01079 class010792 : list) {
                        try {
                            BufferedReader bufferedReader = class010792.method_43039();
                            try {
                                JsonElement jsonElement = class08326.N((Reader)bufferedReader);
                                class04127 class041272 = (class04127)class04127.y.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).getOrThrow(JsonParseException::new);
                                arrayList.add(new class02608(class010792.method_14480(), class041272));
                            }
                            finally {
                                if (bufferedReader == null) continue;
                                ((Reader)bufferedReader).close();
                            }
                        }
                        catch (Exception exception) {
                            N.error("Failed to load blockstate definition {} from pack {}", new Object[]{class018942, class010792.method_14480(), exception});
                        }
                    }
                    try {
                        return class02603.N(class018942, (class00507<class00891, class00500>)class005072, arrayList);
                    }
                    catch (Exception exception) {
                        N.error("Failed to load blockstate definition {}", (Object)class018942, (Object)exception);
                        return null;
                    }
                }, executor));
            }
            return class07536.L(arrayList).thenApply(list -> {
                IdentityHashMap<class00500, class08889> identityHashMap = new IdentityHashMap<class00500, class08889>();
                for (class02572 class025722 : list) {
                    if (class025722 == null) continue;
                    identityHashMap.putAll(class025722.N());
                }
                return new class02572(identityHashMap);
            });
        });
    }

    private static class02572 N(class01894 class018942, class00507<class00891, class00500> class005072, List<class02608> list) {
        IdentityHashMap<class00500, class08889> identityHashMap = new IdentityHashMap<class00500, class08889>();
        for (class02608 class026082 : list) {
            identityHashMap.putAll(class026082.y().N(class005072, () -> String.valueOf(class018942) + "/" + class026082.N()));
        }
        return new class02572(identityHashMap);
    }
}

