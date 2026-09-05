/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class01997
 *  minecraft.class02026
 *  minecraft.class03711
 *  minecraft.class04227
 *  minecraft.class04476
 *  minecraft.class07135
 *  minecraft.class07151
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class01997;
import minecraft.class02026;
import minecraft.class03711;
import minecraft.class04227;
import minecraft.class04476;
import minecraft.class07135;
import minecraft.class07151;

public class class07098
implements class07135 {
    private final class01997 N;
    private final List<class02026> i;
    private final CompletableFuture<class01929> R;

    public class07098(class01996 class019962, CompletableFuture<class01929> completableFuture, List<class02026> list) {
        this.N = class019962.method_60917(class04227.yK);
        this.i = list;
        this.R = completableFuture;
    }

    public String method_10321() {
        return "Advancements";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return this.R.thenCompose(class019292 -> {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Consumer<class03711> consumer = class037112 -> {
                if (!hashSet.add(class037112.N())) {
                    throw new IllegalStateException("Duplicate advancement " + String.valueOf(class037112.N()));
                }
                Path path = this.N.N(class037112.N());
                arrayList.add(class07135.N((class04476)class044762, (class01929)class019292, (Codec)class07151.N, (Object)class037112.y(), (Path)path));
            };
            Iterator<class02026> var6 = this.i.iterator();
            while (var6.hasNext()) {
                var6.next().N(class019292, consumer);
            }
            return CompletableFuture.allOf((CompletableFuture[])arrayList.toArray(CompletableFuture[]::new));
        });
    }
}

