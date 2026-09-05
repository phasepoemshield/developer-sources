/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class01089
 *  minecraft.class01214
 *  minecraft.class01248
 *  minecraft.class02003
 *  minecraft.class02969
 *  minecraft.class03078
 *  minecraft.class03554
 *  minecraft.class03767
 *  minecraft.class03776
 *  minecraft.class03981
 *  minecraft.class07671
 *  minecraft.class08152
 *  net.fabricmc.fabric.api.event.registry.DynamicRegistries
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class01089;
import minecraft.class01214;
import minecraft.class01248;
import minecraft.class01908;
import minecraft.class01922;
import minecraft.class01929;
import minecraft.class01930;
import minecraft.class01933;
import minecraft.class02003;
import minecraft.class02969;
import minecraft.class03078;
import minecraft.class03554;
import minecraft.class03767;
import minecraft.class03776;
import minecraft.class03981;
import minecraft.class07671;
import minecraft.class08152;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries;
import org.slf4j.Logger;

public class class01897 {
    private static final Logger N = LogUtils.getLogger();

    private static List N(List list) {
        return DynamicRegistries.getDynamicRegistries();
    }

    public static <D, R> CompletableFuture<R> N(class01908 class019082, class01933<D> class019332, class01922<D, R> class019222, Executor executor, Executor executor2) {
        try {
            Pair<class03776, class03554> var5 = class019082.N().N();
            class03554 class035542 = (class03554)var5.getSecond();
            class02003 var7 = class02969.N();
            List var8 = class01214.N((class01089)class035542, (class01042)var7.N((Object)class02969.field_39971));
            List var10 = class01214.N((class01022)var7.y((Object)class02969.field_39972), (List)var8);
            class01022 class010222 = class03078.N((class01089)class035542, (List)var10, (List)class01897.N(class03078.N));
            List list = Stream.concat(var10.stream(), class010222.L()).toList();
            class01022 class010223 = class03078.N((class01089)class035542, (List)list, (List)class03078.y);
            class03776 class037762 = (class03776)var5.getFirst();
            class01929 class019292 = class01929.N(list.stream());
            class03981 class039812 = class019332.get(new class01930((class01089)class035542, class037762, class019292, class010223));
            class02003 var17 = var7.N((Object)class02969.field_39972, new class01022[]{class010222, class039812.y()});
            return ((CompletableFuture)class01248.N((class01089)class035542, (class02003)var17, (List)var8, (class03767)class037762.y(), (class07671)class019082.y(), (class08152)class019082.L(), (Executor)executor, (Executor)executor2).whenComplete((class012482, throwable) -> {
                if (throwable != null) {
                    class035542.close();
                }
            })).thenApplyAsync(class012482 -> {
                class012482.M();
                return class019222.create(class035542, (class01248)class012482, (class02003<class02969>)var17, (Object)class039812.N());
            }, executor2);
        }
        catch (Exception exception) {
            return CompletableFuture.failedFuture(exception);
        }
    }
}

