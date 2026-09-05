/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10415
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Lifecycle
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class00731
 *  minecraft.class01014
 *  minecraft.class01022
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class01997
 *  minecraft.class02063
 *  minecraft.class02819
 *  minecraft.class03512
 *  minecraft.class04227
 *  minecraft.class04476
 *  minecraft.class04480
 *  minecraft.class04482
 *  minecraft.class04489
 *  minecraft.class04490
 *  minecraft.class05074
 *  minecraft.class05561
 *  minecraft.class05946
 *  minecraft.class07099
 *  minecraft.class07135
 *  minecraft.class07536
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10415;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import minecraft.class00731;
import minecraft.class01014;
import minecraft.class01022;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class01997;
import minecraft.class02063;
import minecraft.class02819;
import minecraft.class03512;
import minecraft.class04227;
import minecraft.class04476;
import minecraft.class04480;
import minecraft.class04482;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class05074;
import minecraft.class05561;
import minecraft.class05946;
import minecraft.class06875;
import minecraft.class06899;
import minecraft.class06925;
import minecraft.class07099;
import minecraft.class07135;
import minecraft.class07536;
import org.slf4j.Logger;

public class class06871
implements class07135 {
    private static final Logger N = LogUtils.getLogger();
    private final class01997 i;
    private final Set<class05946<class05074>> R;
    private final List<class06875> M;
    private final CompletableFuture<class01929> B;

    public class06871(class01996 class019962, Set<class05946<class05074>> set, List<class06875> list, CompletableFuture<class01929> completableFuture) {
        this.i = class019962.method_60917(class04227.yJ);
        this.M = list;
        this.R = set;
        this.B = completableFuture;
    }

    private static /* synthetic */ void N(class01929 class019292, Map map, class07099 class070992, class06875 class068752) {
        class068752.N().apply(class019292).method_10399((class059462, class050622) -> {
            class01894 class018942 = class06871.N((class05946<class05074>)class059462);
            class01894 class018943 = map.put(class03512.N((class01894)class018942), class018942);
            if (class018943 != null) {
                class07536.y((String)("Loot table random sequence seed collision on " + String.valueOf(class018943) + " and " + String.valueOf(class059462.N())));
            }
            class050622.N(class018942);
            class05074 class050742 = class050622.N(class068752.y()).L();
            class070992.N(class059462, (Object)class050742, class02819.N);
        });
    }

    private CompletableFuture<?> y(class04476 class044762, class01929 class019292) {
        class00731 class007312 = new class00731(class04227.yJ, Lifecycle.experimental());
        Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap();
        this.M.forEach(arg_0 -> class06871.N(class019292, (Map)object2ObjectOpenHashMap, (class07099)class007312, arg_0));
        class007312.W();
        class04482 class044822 = new class04482();
        class01022 class010222 = new class01014(List.of(class007312)).method_40316();
        class05561 class055612 = new class05561((class04490)class044822, class06925.b, (class02063)class010222);
        for (class05946 var10 : Sets.difference(this.R, (Set)class007312.B())) {
            class044822.N_47((class04480)new class06899((class05946<class05074>)var10));
        }
        class007312.z().forEach(class035292 -> ((class05074)class035292.N()).N(class055612.N(((class05074)class035292.N()).N()).N((class04489)new class10415(class035292.B()), class035292.B())));
        if (!class044822.N()) {
            class044822.N((T string, U class044802) -> N.warn("Found validation problem in {}: {}", string, (Object)class044802.N()));
            throw new IllegalStateException("Failed to validate loot tables, see logs");
        }
        return CompletableFuture.allOf((CompletableFuture[])class007312.Z().stream().map(entry -> {
            class05946 class059462 = (class05946)entry.getKey();
            class05074 class050742 = (class05074)entry.getValue();
            Path path = this.i.N(class059462.N());
            return class07135.N((class04476)class044762, (class01929)class019292, (Codec)class05074.u, (Object)class050742, (Path)path);
        }).toArray(CompletableFuture[]::new));
    }

    private static class01894 N(class05946<class05074> class059462) {
        return class059462.N();
    }

    public String method_10321() {
        return "Loot Tables";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return this.B.thenCompose(class019292 -> this.y(class044762, (class01929)class019292));
    }
}

