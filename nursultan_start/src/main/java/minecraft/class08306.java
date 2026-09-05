/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09109
 *  com.mojang.serialization.Codec
 *  minecraft.class00058
 *  minecraft.class01894
 *  minecraft.class01996
 *  minecraft.class01997
 *  minecraft.class02024
 *  minecraft.class04476
 *  minecraft.class05946
 *  minecraft.class07135
 *  minecraft.class08301
 */
package minecraft;

import Nursultan.class09109;
import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import minecraft.class00058;
import minecraft.class01894;
import minecraft.class01996;
import minecraft.class01997;
import minecraft.class02024;
import minecraft.class04476;
import minecraft.class05946;
import minecraft.class07135;
import minecraft.class08301;

public class class08306
implements class07135 {
    private final class01997 N;

    public class08306(class01996 class019962) {
        this.N = class019962.method_45973(class02024.field_39368, "waypoint_style");
    }

    private static void N(BiConsumer<class05946<class09109>, class08301> biConsumer) {
        biConsumer.accept((class05946<class09109>)class00058.y, new class08301(128, 332, List.of(class01894.y((String)"default_0"), class01894.y((String)"default_1"), class01894.y((String)"default_2"), class01894.y((String)"default_3"))));
        biConsumer.accept((class05946<class09109>)class00058.L, new class08301(64, 332, List.of(class01894.y((String)"bowtie"), class01894.y((String)"default_0"), class01894.y((String)"default_1"), class01894.y((String)"default_2"), class01894.y((String)"default_3"))));
    }

    public String method_10321() {
        return "Waypoint Style Definitions";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        HashMap hashMap = new HashMap();
        class08306.N((class059462, class083012) -> {
            if (hashMap.putIfAbsent(class059462, class083012) != null) {
                throw new IllegalStateException("Tried to register waypoint style twice for id: " + String.valueOf(class059462));
            }
        });
        return class07135.N((class04476)class044762, (Codec)class08301.u, arg_0 -> ((class01997)this.N).N(arg_0), hashMap);
    }
}

