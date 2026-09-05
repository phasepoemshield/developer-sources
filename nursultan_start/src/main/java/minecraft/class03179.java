/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2BooleanMap
 *  it.unimi.dsi.fastutil.longs.Long2BooleanOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00751
 *  minecraft.class00765
 *  minecraft.class01042
 *  minecraft.class01224
 *  minecraft.class01894
 *  minecraft.class03532
 *  minecraft.class03543
 *  minecraft.class04084
 *  minecraft.class04227
 *  minecraft.class04748
 *  minecraft.class04764
 *  minecraft.class04932
 *  minecraft.class05474
 *  minecraft.class05715
 *  minecraft.class05946
 *  minecraft.class06172
 *  minecraft.class06265
 *  minecraft.class07001
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07720
 *  minecraft.class08088
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2BooleanMap;
import it.unimi.dsi.fastutil.longs.Long2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class00765;
import minecraft.class01042;
import minecraft.class01224;
import minecraft.class01894;
import minecraft.class03152;
import minecraft.class03164;
import minecraft.class03167;
import minecraft.class03190;
import minecraft.class03532;
import minecraft.class03543;
import minecraft.class04084;
import minecraft.class04227;
import minecraft.class04748;
import minecraft.class04764;
import minecraft.class04932;
import minecraft.class05474;
import minecraft.class05715;
import minecraft.class05946;
import minecraft.class06172;
import minecraft.class06265;
import minecraft.class07001;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07720;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03179 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = -1;
    private final class03190 L;
    private final class01042 u;
    private final class01224 i;
    private final class05946<class07299> R;
    private final class08088 M;
    private final class04084 B;
    private final class05474 Z;
    private final class00765 z;
    private final long U;
    private final DataFixer E;
    private final Long2ObjectMap<Object2IntMap<class04748>> W = new Long2ObjectOpenHashMap();
    private final Map<class04748, Long2BooleanMap> m = new HashMap<class04748, Long2BooleanMap>();

    public class03179(class03190 class031902, class01042 class010422, class01224 class012242, class05946<class07299> class059462, class08088 class080882, class04084 class040842, class05474 class054742, class00765 class007652, long l, DataFixer dataFixer) {
        this.L = class031902;
        this.u = class010422;
        this.i = class012242;
        this.R = class059462;
        this.M = class080882;
        this.B = class040842;
        this.Z = class054742;
        this.z = class007652;
        this.U = l;
        this.E = dataFixer;
    }

    private boolean y(class07321 class073212, class04748 class047482) {
        return class047482.y(new class04764(this.u, this.M, this.z, this.B, this.i, this.U, class073212, this.Z, arg_0 -> ((class03543)class047482.y()).N(arg_0))).isPresent();
    }

    private static /* synthetic */ void N(class00751 class007512, Object2IntMap object2IntMap, String string, class07709 class077092) {
        class01894 class018942 = class01894.L((String)string);
        if (class018942 == null) {
            return;
        }
        class04748 class047482 = (class04748)class007512.N(class018942);
        if (class047482 == null) {
            return;
        }
        class077092.ak_().ifPresent(class070012 -> {
            String string = class070012.y("id", "");
            if (!"INVALID".equals(string)) {
                int n = class070012.y("references", 0);
                object2IntMap.put((Object)class047482, n);
            }
        });
    }

    private static /* synthetic */ void N(Object2IntMap object2IntMap, class04748 class047482, class04932 class049322) {
        if (class049322.y()) {
            object2IntMap.put((Object)class047482, class049322.R());
        }
    }

    private class03167 N(Object2IntMap<class04748> object2IntMap, class04748 class047482, boolean bl) {
        int n = object2IntMap.getOrDefault((Object)class047482, -1);
        return n != -1 && (!bl || n == 0) ? class03167.field_36239 : class03167.field_36240;
    }

    private static Object2IntMap<class04748> N(Object2IntMap<class04748> object2IntMap) {
        return object2IntMap.isEmpty() ? Object2IntMaps.emptyMap() : object2IntMap;
    }

    private @Nullable Object2IntMap<class04748> N(class07001 class070013) {
        Optional optional = class070013.W("structures").flatMap(class070012 -> class070012.W("starts"));
        if (optional.isEmpty()) {
            return null;
        }
        class07001 class070014 = (class07001)optional.get();
        if (class070014.z()) {
            return Object2IntMaps.emptyMap();
        }
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        class00751 class007512 = this.u.L(class04227.yj);
        class070014.N((arg_0, arg_1) -> class03179.N(class007512, (Object2IntMap)object2IntOpenHashMap, arg_0, arg_1));
        return object2IntOpenHashMap;
    }

    private @Nullable class03167 N(class07321 class073212, class04748 class047482, boolean bl, long l) {
        class07001 class070012;
        class03164 class031642 = new class03164(new class03152(class07720.N, "DataVersion"), new class03152("Level", "Structures", class07001.y, "Starts"), new class03152("structures", class07001.y, "starts"));
        try {
            this.L.N(class073212, class031642).join();
        }
        catch (Exception exception) {
            N.warn("Failed to read chunk {}", (Object)class073212, (Object)exception);
            return class03167.field_36241;
        }
        class07709 class077092 = class031642.u();
        if (!(class077092 instanceof class07001)) {
            return null;
        }
        class07001 class070013 = (class07001)class077092;
        int n = class07717.R((class07001)class070013);
        if (n <= 1493) {
            return class03167.field_36241;
        }
        class06172.N((class07001)class070013, (class07001)class06265.N(this.R, (Optional)this.M.L()));
        try {
            class070012 = class05715.field_19214.N(this.E, class070013, n);
        }
        catch (Exception exception) {
            N.warn("Failed to partially datafix chunk {}", (Object)class073212, (Object)exception);
            return class03167.field_36241;
        }
        Object2IntMap<class04748> var11 = this.N(class070012);
        if (var11 == null) {
            return null;
        }
        this.N(l, var11);
        return this.N(var11, class047482, bl);
    }

    public class03167 N(class07321 class073212, class04748 class047483, class03532 class035322, boolean bl) {
        long l2 = class073212.y();
        Object2IntMap var7 = (Object2IntMap)this.W.get(l2);
        if (var7 != null) {
            return this.N((Object2IntMap<class04748>)var7, class047483, bl);
        }
        class03167 class031672 = this.N(class073212, class047483, bl, l2);
        if (class031672 != null) {
            return class031672;
        }
        if (!class035322.N(class073212.B, class073212.Z, this.U)) {
            return class03167.field_36240;
        }
        if (!this.m.computeIfAbsent(class047483, class047482 -> new Long2BooleanOpenHashMap()).computeIfAbsent(l2, l -> this.y(class073212, class047483))) {
            return class03167.field_36240;
        }
        return class03167.field_36241;
    }

    public void N(class07321 class073212, class04748 class047482) {
        this.W.compute(class073212.y(), (l, object2IntMap) -> {
            if (object2IntMap == null || object2IntMap.isEmpty()) {
                object2IntMap = new Object2IntOpenHashMap();
            }
            object2IntMap.computeInt((Object)class047482, (class047482, n) -> n == null ? 1 : n + 1);
            return object2IntMap;
        });
    }

    private void N(long l, Object2IntMap<class04748> object2IntMap) {
        this.W.put(l, class03179.N(object2IntMap));
        this.m.values().forEach(long2BooleanMap -> long2BooleanMap.remove(l));
    }

    public void N(class07321 class073212, Map<class04748, class04932> map) {
        long l = class073212.y();
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        map.forEach((arg_0, arg_1) -> class03179.N((Object2IntMap)object2IntOpenHashMap, arg_0, arg_1));
        this.N(l, (Object2IntMap<class04748>)object2IntOpenHashMap);
    }
}

