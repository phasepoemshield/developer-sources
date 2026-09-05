/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class03530
 *  minecraft.class05543
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07529
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.common.block.entity.sleeping_sculk.GameEventListenerWithCallback
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class03530;
import minecraft.class04083;
import minecraft.class05543;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07529;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.common.block.entity.sleeping_sculk.GameEventListenerWithCallback;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04076
implements GameEventListenerWithCallback {
    public static final int N = 24;
    public static final int y = 1000;
    public static final float L = 0.5f;
    private static final int M = 32;
    public static final int u = 11;
    public static final int i = 1024;
    final boolean R;
    private final class03530<class00891> B;
    private final int Z;
    private final int z;
    private final int U;
    private final int E;
    private List<class04083> W = new ArrayList<class04083>();
    private Runnable m;

    public class03530<class00891> L() {
        return this.B;
    }

    public int M() {
        return this.E;
    }

    public class04076(boolean bl, class03530<class00891> class035302, int n, int n2, int n3, int n4) {
        this.R = bl;
        this.B = class035302;
        this.Z = n;
        this.z = n2;
        this.U = n3;
        this.E = n4;
    }

    public boolean B() {
        return this.R;
    }

    public List<class04083> Z() {
        return this.W;
    }

    public int i() {
        return this.z;
    }

    public void z() {
        this.W.clear();
    }

    public int u() {
        return this.Z;
    }

    public static class04076 y() {
        return new class04076(true, (class03530<class00891>)class01210.LZ, 50, 1, 5, 10);
    }

    private void N(class04083 class040832) {
        if (this.W.size() >= 32) {
            return;
        }
        this.W.add(class040832);
    }

    public void N(class07284 class072842, class07209 class072093, class06069 class060692, boolean bl) {
        class07209 class072094;
        if (this.W.isEmpty()) {
            return;
        }
        ArrayList<class04083> arrayList = new ArrayList<class04083>();
        HashMap<class07209, class04083> hashMap = new HashMap<class07209, class04083>();
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        for (class04083 class040832 : this.W) {
            if (class040832.N(class072093)) continue;
            class040832.N(class072842, class072093, class060692, this, bl);
            if (class040832.y <= 0) {
                class072842.N(3006, class040832.N(), 0);
                continue;
            }
            class072094 = class040832.N();
            object2IntOpenHashMap.computeInt((Object)class072094, (class072092, n) -> (n == null ? 0 : n) + class040832.y);
            class04083 class040833 = (class04083)hashMap.get(class072094);
            if (class040833 == null) {
                hashMap.put(class072094, class040832);
                arrayList.add(class040832);
                continue;
            }
            if (!this.B() && class040832.y + class040833.y <= 1000) {
                class040833.N(class040832);
                continue;
            }
            arrayList.add(class040832);
            if (class040832.y >= class040833.y) continue;
            hashMap.put(class072094, class040832);
        }
        for (class04083 class040832 : object2IntOpenHashMap.object2IntEntrySet()) {
            Set<class07211> var13;
            class072094 = (class07209)class040832.getKey();
            int n2 = class040832.getIntValue();
            class04083 class040834 = (class04083)hashMap.get(class072094);
            Set<class07211> set = var13 = class040834 == null ? null : class040834.u();
            if (n2 <= 0 || var13 == null) continue;
            int n3 = ((int)(Math.log1p(n2) / (double)2.3f) + 1 << 6) + class05543.N(var13);
            class072842.N(3006, class072094, n3);
        }
        this.W = arrayList;
    }

    public void N(class07209 class072092, int n) {
        while (n > 0) {
            int n2 = Math.min(n, 1000);
            this.N(new class04083(class072092, n2));
            n -= n2;
        }
        this.N(class072092, n, null);
    }

    public static class04076 N() {
        return new class04076(false, (class03530<class00891>)class01210.LB, 10, 4, 10, 5);
    }

    public void N(class08299 class082992) {
        this.W.clear();
        class082992.N("cursors", class04083.L.sizeLimitedListOf(32)).orElse(List.of()).forEach(this::N);
    }

    public void N(class08329 class083292) {
        class083292.N("cursors", class04083.L.listOf(), this.W);
        if (class07529.Ny) {
            int n = this.Z().stream().map(class04083::y).reduce(0, Integer::sum);
            int n2 = this.Z().stream().map(class040832 -> 1).reduce(0, Integer::sum);
            int n3 = this.Z().stream().map(class04083::y).reduce(0, Math::max);
            class083292.N("stats.total", n);
            class083292.N("stats.count", n2);
            class083292.N("stats.max", n3);
            class083292.N("stats.avg", n / (n2 + 1));
        }
    }

    public void N(class07209 class072092, int n, CallbackInfo callbackInfo) {
        if (this.m != null) {
            this.m.run();
        }
    }

    public void lithium$setGameEventCallback(Runnable runnable) {
        this.m = runnable;
    }

    public int R() {
        return this.U;
    }
}

