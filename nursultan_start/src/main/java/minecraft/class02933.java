/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class02625
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07304
 *  minecraft.class08336
 */
package minecraft;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class02625;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class07304;
import minecraft.class08336;

public abstract class class02933
extends class08336<class07304> {
    public class02933(class01996 class019962, CompletableFuture<class01929> completableFuture) {
        super(class019962, class04227.yR, completableFuture);
    }

    protected void N(class01929 class019292, class05946<class07304> ... class05946Array) {
        this.N(class02625.N).N((Object[])class05946Array);
        Set<class05946<class07304>> set = Set.of(class05946Array);
        List list = class019292.y(class04227.yR).z().filter(class035292 -> !set.contains(class035292.i().get())).map(class03556::M).collect(Collectors.toList());
        if (!list.isEmpty()) {
            throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join((CharSequence)", ", list));
        }
    }
}

