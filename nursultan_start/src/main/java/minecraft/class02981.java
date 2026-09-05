/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class01894
 *  minecraft.class03766
 *  minecraft.class03767
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class01894;
import minecraft.class02957;
import minecraft.class03766;
import minecraft.class03767;
import org.slf4j.Logger;

public class class02981 {
    private static final Logger N = LogUtils.getLogger();
    private final class03766 y;
    private final Map<class01894, class02957> L;
    private final class03767 u;

    class02981(class03766 class037662, class03767 class037672, Map<class01894, class02957> map) {
        this.y = class037662;
        this.L = map;
        this.u = class037672;
    }

    public Set<class01894> y(class03767 class037672) {
        HashSet<class01894> hashSet = new HashSet<class01894>();
        this.L.forEach((class018942, class029572) -> {
            if (class037672.y(class029572)) {
                hashSet.add((class01894)class018942);
            }
        });
        return hashSet;
    }

    public Codec<class03767> y() {
        return class01894.N.listOf().comapFlatMap(list -> {
            HashSet hashSet = new HashSet();
            class03767 class037672 = this.N((Iterable<class01894>)list, hashSet::add);
            if (!hashSet.isEmpty()) {
                return DataResult.error(() -> "Unknown feature ids: " + String.valueOf(hashSet), (Object)class037672);
            }
            return DataResult.success((Object)class037672);
        }, class037672 -> List.copyOf(this.y((class03767)class037672)));
    }

    public class03767 N(Iterable<class01894> iterable) {
        return this.N(iterable, (class01894 class018942) -> N.warn("Unknown feature flag: {}", class018942));
    }

    public class03767 N(class02957 ... class02957Array) {
        return class03767.N((class03766)this.y, Arrays.asList(class02957Array));
    }

    public class03767 N(Iterable<class01894> iterable, Consumer<class01894> consumer) {
        Set set = Sets.newIdentityHashSet();
        for (class01894 class018942 : iterable) {
            class02957 class029572 = this.L.get(class018942);
            if (class029572 == null) {
                consumer.accept(class018942);
                continue;
            }
            set.add(class029572);
        }
        return class03767.N((class03766)this.y, (Collection)set);
    }

    public class03767 N() {
        return this.u;
    }

    public boolean N(class03767 class037672) {
        return class037672.N(this.u);
    }
}

