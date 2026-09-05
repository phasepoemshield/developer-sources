/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02008
 *  minecraft.class05913
 *  minecraft.class08388
 */
package minecraft;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import minecraft.class01894;
import minecraft.class02008;
import minecraft.class05913;
import minecraft.class08104;
import minecraft.class08388;

public class class08124 {
    final List<class08104> N;
    private final Map<class01894, CompletableFuture<class02008>> L;
    final CompletableFuture<?> y;

    class08124(List<class08104> list, Map<class01894, CompletableFuture<class02008>> map, CompletableFuture<?> completableFuture) {
        this.N = list;
        this.L = map;
        this.y = completableFuture;
    }

    public CompletableFuture<class02008> N(class01894 class018942) {
        return Objects.requireNonNull(this.L.get(class018942));
    }

    public Map<class05913, class08388> N() {
        HashMap<class05913, class08388> hashMap = new HashMap<class05913, class08388>();
        this.N.forEach(class081042 -> class081042.N(hashMap));
        return hashMap;
    }
}

