/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectFunction
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class00167
 *  minecraft.class01894
 *  minecraft.class08350
 *  minecraft.class08389
 *  minecraft.class08529
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectFunction;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import minecraft.class00167;
import minecraft.class01894;
import minecraft.class08250;
import minecraft.class08256;
import minecraft.class08350;
import minecraft.class08389;
import minecraft.class08529;
import org.slf4j.Logger;

public class class08273 {
    private static final Logger N = LogUtils.getLogger();
    private final Object2ObjectMap<class01894, class08250> y = new Object2ObjectOpenHashMap();
    private final class08250 L;
    private final Object2ObjectFunction<class01894, class08250> u;
    private final class08350 i;
    private final Queue<class08250> R = new ArrayDeque<class08250>();

    public class08273(Map<class01894, class00167> map, class00167 class001672) {
        this.L = new class08250(class08256.N, class001672, true);
        this.y.put((Object)class08256.N, (Object)this.L);
        this.u = object -> {
            class01894 class018942 = (class01894)object;
            class00167 class001672 = (class00167)map.get(class018942);
            if (class001672 == null) {
                N.warn("Missing block model: {}", (Object)class018942);
                return this.L;
            }
            return this.y(class018942, class001672);
        };
        this.i = this::N;
    }

    private static void y(List<class08250> list) {
        boolean bl = true;
        while (bl) {
            bl = false;
            Iterator<class08250> iterator = list.iterator();
            while (iterator.hasNext()) {
                class08250 class082502 = iterator.next();
                if (!Objects.requireNonNull(class082502.y).N) continue;
                class082502.N = true;
                iterator.remove();
                bl = true;
            }
        }
    }

    private class08250 y(class01894 class018942, class00167 class001672) {
        boolean bl = class08273.N(class001672);
        class08250 class082502 = new class08250(class018942, class001672, bl);
        if (!bl) {
            this.R.add(class082502);
        }
        return class082502;
    }

    public Map<class01894, class08529> y() {
        ArrayList<class08250> arrayList = new ArrayList<class08250>();
        this.N(arrayList);
        class08273.y(arrayList);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        this.y.forEach((class018942, class082502) -> {
            if (class082502.N) {
                builder.put(class018942, class082502);
            } else {
                N.warn("Model {} ignored due to cyclic dependency", class018942);
            }
        });
        return builder.build();
    }

    private void N(List<class08250> list) {
        class08250 class082502;
        while ((class082502 = this.R.poll()) != null) {
            class08250 class082503;
            class01894 class018942 = Objects.requireNonNull(class082502.L.comp_3744());
            class082502.y = class082503 = this.N(class018942);
            if (class082503.N) {
                class082502.N = true;
                continue;
            }
            list.add(class082502);
        }
    }

    public class08529 N() {
        return this.L;
    }

    public void N(class08389 class083892) {
        class083892.method_62326(this.i);
    }

    public void N(class01894 class018942, class00167 class001672) {
        if (!class08273.N(class001672)) {
            N.warn("Trying to add non-root special model {}, ignoring", (Object)class018942);
            return;
        }
        if ((class08250)this.y.put((Object)class018942, (Object)this.y(class018942, class001672)) != null) {
            N.warn("Duplicate special model {}", (Object)class018942);
        }
    }

    private static boolean N(class00167 class001672) {
        return class001672.comp_3744() == null;
    }

    private class08250 N(class01894 class018942) {
        return (class08250)this.y.computeIfAbsent((Object)class018942, this.u);
    }
}

