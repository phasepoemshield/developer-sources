/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class04770
 *  minecraft.class07001
 *  minecraft.class07536
 *  minecraft.class07713
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class04770;
import minecraft.class06392;
import minecraft.class06425;
import minecraft.class07001;
import minecraft.class07536;
import minecraft.class07713;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06398 {
    private static final Logger N = LogUtils.getLogger();
    private static final Codec<Map<class01894, class06425>> y = Codec.unboundedMap((Codec)class01894.N, class06425.U);
    private final Map<class01894, class06392> L = Maps.newHashMap();

    public void y(class04770 class047702) {
        Iterator<class06392> var2 = this.L.values().iterator();
        while (var2.hasNext()) {
            var2.next().u(class047702);
        }
    }

    public Collection<class06392> y() {
        return this.L.values();
    }

    public void N(class04770 class047702) {
        Iterator<class06392> var2 = this.L.values().iterator();
        while (var2.hasNext()) {
            var2.next().L(class047702);
        }
    }

    public class07001 N(class01929 class019292) {
        Map map = class07536.N(this.L, class06392::m);
        return (class07001)y.encodeStart((DynamicOps)class019292.N((DynamicOps)class07713.N), (Object)map).getOrThrow();
    }

    public class06392 N(class01894 class018942, class00392 class003922) {
        class06392 class063922 = new class06392(class018942, class003922);
        this.L.put(class018942, class063922);
        return class063922;
    }

    public void N(class06392 class063922) {
        this.L.remove(class063922.Z());
    }

    public Collection<class01894> N() {
        return this.L.keySet();
    }

    public @Nullable class06392 N(class01894 class018942) {
        return this.L.get(class018942);
    }

    public void N(class07001 class070012, class01929 class019292) {
        y.parse((DynamicOps)class019292.N((DynamicOps)class07713.N), (Object)class070012).resultOrPartial(string -> N.error("Failed to parse boss bar events: {}", string)).orElse(Map.of()).forEach((class018942, class064252) -> this.L.put((class01894)class018942, class06392.N(class018942, class064252)));
    }
}

