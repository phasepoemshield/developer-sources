/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class01894
 *  minecraft.class05715
 *  minecraft.class06555
 *  minecraft.class07536
 *  minecraft.class08192
 *  minecraft.class08413
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.UnaryOperator;
import minecraft.class01894;
import minecraft.class05715;
import minecraft.class06555;
import minecraft.class07536;
import minecraft.class08192;
import minecraft.class08413;
import org.jspecify.annotations.Nullable;

public class class08170
extends class06555 {
    private static final Codec<class08170> y = Codec.unboundedMap((Codec)class01894.N, (Codec)Codec.LONG).fieldOf("stopwatches").codec().xmap(class08170::N, class08170::L);
    public static final class08413<class08170> N = new class08413("stopwatches", class08170::new, y, class05715.field_63265);
    private final Map<class01894, class08192> L = new Object2ObjectOpenHashMap();

    private Map<class01894, Long> L() {
        long l = class08170.y();
        TreeMap<class01894, Long> treeMap = new TreeMap<class01894, Long>();
        this.L.forEach((class018942, class081922) -> treeMap.put((class01894)class018942, class081922.N(l)));
        return treeMap;
    }

    private class08170() {
    }

    public static long y() {
        return class07536.L();
    }

    public boolean y(class01894 class018942) {
        boolean bl;
        boolean bl2 = bl = this.L.remove(class018942) != null;
        if (bl) {
            this.method_80();
        }
        return bl;
    }

    public List<class01894> N() {
        return List.copyOf(this.L.keySet());
    }

    public @Nullable class08192 N(class01894 class018942) {
        return this.L.get(class018942);
    }

    public boolean N(class01894 class018942, class08192 class081922) {
        if (this.L.putIfAbsent(class018942, class081922) == null) {
            this.method_80();
            return true;
        }
        return false;
    }

    public boolean N(class01894 class018943, UnaryOperator<class08192> unaryOperator) {
        if (this.L.computeIfPresent(class018943, (class018942, class081922) -> (class08192)unaryOperator.apply((class08192)class081922)) != null) {
            this.method_80();
            return true;
        }
        return false;
    }

    private static class08170 N(Map<class01894, Long> map) {
        class08170 class081702 = new class08170();
        long l = class08170.y();
        map.forEach((class018942, l2) -> class081702.L.put((class01894)class018942, new class08192(l, l2.longValue())));
        return class081702;
    }

    public boolean method_79() {
        return super.method_79() || !this.L.isEmpty();
    }
}

