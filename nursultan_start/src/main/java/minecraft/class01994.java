/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class01089
 *  minecraft.class01640
 *  minecraft.class01894
 *  minecraft.class02968
 *  minecraft.class04203
 *  minecraft.class04235
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06532
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07536
 *  minecraft.class07878
 *  minecraft.class08383
 *  minecraft.class08384
 *  minecraft.class08387
 *  minecraft.class08388
 *  minecraft.class08626
 *  minecraft.class08694
 *  minecraft.class08700
 *  minecraft.class08923
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import minecraft.class01089;
import minecraft.class01640;
import minecraft.class01894;
import minecraft.class01991;
import minecraft.class02008;
import minecraft.class02968;
import minecraft.class04203;
import minecraft.class04235;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06532;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07536;
import minecraft.class07878;
import minecraft.class08383;
import minecraft.class08384;
import minecraft.class08387;
import minecraft.class08388;
import minecraft.class08626;
import minecraft.class08694;
import minecraft.class08700;
import minecraft.class08923;
import org.slf4j.Logger;

public class class01994 {
    private static final Logger N = LogUtils.getLogger();
    private final class01894 y;
    private final int L;

    public class01994(class01894 class018942, int n) {
        this.y = class018942;
        this.L = n;
    }

    private Map<class01894, class08388> N(class08384<class01991> class083842, int n, int n2) {
        HashMap<class01894, class08388> hashMap = new HashMap<class01894, class08388>();
        class083842.N((class019912, n3, n4, n5) -> hashMap.put(class019912.method_45816(), new class08388(this.y, class019912, n, n2, n3, n4, n5)));
        return hashMap;
    }

    public CompletableFuture<class02008> N(class01089 class010892, class01894 class018942, int n, Executor executor, Set<class02968<?>> set) {
        class01640 class016402 = class01640.N(set);
        return ((CompletableFuture)CompletableFuture.supplyAsync(() -> class04203.N((class01089)class010892, (class01894)class018942).N(class010892), executor).thenCompose(list -> class01994.N(class016402, list, executor))).thenApply(list -> this.N((List<class01991>)list, n, executor));
    }

    private static CompletableFuture<List<class01991>> N(class01640 class016402, List<class04235> list2, Executor executor) {
        return class07536.L((List)list2.stream().map(class042352 -> CompletableFuture.supplyAsync(() -> class042352.method_52853(class016402), executor)).toList()).thenApply(list -> list.stream().filter(Objects::nonNull).toList());
    }

    private class02008 N(List<class01991> list, int n, Executor executor) {
        try (class08694 class086942 = class08700.N().L(() -> "stitch " + String.valueOf(this.y));){
            int n2;
            int n3 = this.L;
            int n4 = Integer.MAX_VALUE;
            int n5 = 1 << n;
            for (class01991 class019912 : list) {
                n4 = Math.min(n4, Math.min(class019912.method_45807(), class019912.method_45815()));
                n2 = Math.min(Integer.lowestOneBit(class019912.method_45807()), Integer.lowestOneBit(class019912.method_45815()));
                if (n2 >= n5) continue;
                N.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[]{class019912.method_45816(), class019912.method_45807(), class019912.method_45815(), class04995.M((int)n5), class04995.M((int)n2)});
                n5 = n2;
            }
            int n6 = Math.min(n4, n5);
            int n7 = class04995.M((int)n6);
            if (n7 < n) {
                N.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.y, n, n7, n6});
                n2 = n7;
            } else {
                n2 = n;
            }
            class05630 class056302 = (class05630)class06202.Nq().i_7;
            int n8 = n2 == 0 || class056302.c().method_41753() != class06532.field_64665 ? 0 : (Integer)class056302.e().method_41753();
            class08384 class083842 = new class08384(n3, n3, n2, n8);
            for (class01991 class019913 : list) {
                class083842.N((class08387)class019913);
            }
            try {
                class083842.L();
            }
            catch (class08383 class083832) {
                class01991 class019913;
                class019913 = class07080.N((Throwable)class083832, (String)"Stitching");
                class07074 class070742 = class019913.N("Stitcher");
                class070742.N("Sprites", (Object)class083832.N().stream().map(class083872 -> String.format(Locale.ROOT, "%s[%dx%d]", class083872.method_45816(), class083872.method_45807(), class083872.method_45815())).collect(Collectors.joining(",")));
                class070742.N("Max Texture Size", (Object)n3);
                throw new class07878((class07080)class019913);
            }
            int n9 = class083842.N();
            int n10 = class083842.y();
            Map<class01894, class08388> map = this.N((class08384<class01991>)class083842, n9, n10);
            class08388 class083882 = map.get(class08923.L());
            CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> map.values().forEach(class083882 -> class083882.method_45851().method_45808(n2)), executor);
            class02008 class020082 = new class02008(n9, n10, n2, class083882, map, completableFuture);
            return class020082;
        }
    }

    public static class01994 N(class08626 class086262) {
        return new class01994(class086262.i(), class086262.R());
    }
}

