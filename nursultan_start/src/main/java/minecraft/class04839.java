/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  minecraft.class01686
 *  minecraft.class04800
 *  minecraft.class04822
 */
package minecraft;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import minecraft.class01686;
import minecraft.class04800;
import minecraft.class04822;
import minecraft.class04838;

public class class04839 {
    private final List<class04800> N;
    private final class04838 y;
    private final Map<String, class04839> L = Maps.newHashMap();

    class04839(List<class04800> list, class04838 class048382) {
        this.N = list;
        this.y = class048382;
    }

    public class04839 y(String string) {
        return this.L.get(string);
    }

    public Set<Map.Entry<String, class04839>> y() {
        return this.L.entrySet();
    }

    public void y(Set<String> set) {
        for (Map.Entry<String, class04839> entry : this.L.entrySet()) {
            class04839 class048392 = entry.getValue();
            if (set.contains(entry.getKey())) {
                class048392.N();
                continue;
            }
            this.N(entry.getKey(), class04822.L(), class048392.y).y(set);
        }
    }

    public class04839 N(UnaryOperator<class04838> unaryOperator) {
        class04839 class048392 = new class04839(this.N, (class04838)((Object)unaryOperator.apply(this.y)));
        class048392.L.putAll(this.L);
        return class048392;
    }

    public class04839 N(String string, class04822 class048222, class04838 class048382) {
        class04839 class048392 = new class04839(class048222.y(), class048382);
        return this.N(string, class048392);
    }

    public class04839 N(String string, class04839 class048392) {
        class04839 class048393 = this.L.put(string, class048392);
        if (class048393 != null) {
            class048392.L.putAll(class048393.L);
        }
        return class048392;
    }

    public class04839 N() {
        for (String string : this.L.keySet()) {
            this.N(string).N();
        }
        return this;
    }

    public class04839 N(String string) {
        class04839 class048392 = this.L.get(string);
        if (class048392 == null) {
            throw new IllegalArgumentException("No child with name: " + string);
        }
        return this.N(string, class04822.L(), class048392.y);
    }

    public void N(Set<String> set) {
        for (Map.Entry<String, class04839> entry : this.L.entrySet()) {
            class04839 class048392 = entry.getValue();
            if (set.contains(entry.getKey())) continue;
            this.N(entry.getKey(), class04822.L(), class048392.y).N(set);
        }
    }

    public class01686 N(int n, int n2) {
        Object2ObjectArrayMap object2ObjectArrayMap = this.L.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> ((class04839)entry.getValue()).N(n, n2), (class016862, class016863) -> class016862, Object2ObjectArrayMap::new));
        List list = this.N.stream().map(class048002 -> class048002.N(n, n2)).toList();
        class01686 class016864 = new class01686(list, (Map)object2ObjectArrayMap);
        class016864.N(this.y);
        class016864.y(this.y);
        return class016864;
    }
}

