/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  minecraft.class01603
 *  minecraft.class01622
 *  minecraft.class01894
 *  minecraft.class03643
 *  minecraft.class03652
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01059;
import minecraft.class01063;
import minecraft.class01071;
import minecraft.class01079;
import minecraft.class01082;
import minecraft.class01088;
import minecraft.class01089;
import minecraft.class01603;
import minecraft.class01622;
import minecraft.class01894;
import minecraft.class03643;
import minecraft.class03652;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01066
implements class01089 {
    static final Logger N = LogUtils.getLogger();
    protected final List<class01088> y = Lists.newArrayList();
    private final class01603 u;
    private final String i;

    @Override
    public Map<class01894, List<class01079>> L(String string, Predicate<class01894> predicate) {
        HashMap hashMap = Maps.newHashMap();
        for (class01088 object : this.y) {
            class01066.N(object, hashMap);
            this.N(object, string, predicate, hashMap);
        }
        TreeMap treeMap = Maps.newTreeMap();
        for (class01059 class010592 : hashMap.values()) {
            if (class010592.L().isEmpty()) continue;
            ArrayList<class01079> arrayList = new ArrayList<class01079>();
            for (class01071 class010712 : class010592.L()) {
                class01622 class016222 = class010712.N();
                class03652<InputStream> class036522 = class010592.u().get(class016222);
                class03652<class03643> class036523 = class036522 != null ? class01066.N(class036522) : class03643.y;
                arrayList.add(class01066.N(class016222, class010592.N(), class010712.y(), class036523));
            }
            treeMap.put(class010592.N(), arrayList);
        }
        return treeMap;
    }

    private static class01894 M(class01894 class018942) {
        String string = class018942.N().substring(0, class018942.N().length() - ".mcmeta".length());
        return class018942.i(string);
    }

    public class01066(class01603 class016032, String string) {
        this.u = class016032;
        this.i = string;
    }

    @Override
    public Map<class01894, class01079> y(String string, Predicate<class01894> predicate) {
        HashMap<class01894, class01063> hashMap = new HashMap<class01894, class01063>();
        HashMap hashMap2 = new HashMap();
        int n = this.y.size();
        for (int i = 0; i < n; ++i) {
            class01088 class010882 = this.y.get(i);
            class010882.N(hashMap.keySet());
            class010882.N(hashMap2.keySet());
            class01622 class016222 = class010882.y();
            if (class016222 == null) continue;
            int n2 = i;
            class016222.method_14408(this.u, this.i, string, (class018942, class036522) -> {
                if (class01066.R(class018942)) {
                    if (predicate.test(class01066.M(class018942))) {
                        hashMap2.put(class018942, new class01063(class016222, (class03652<InputStream>)class036522, n2));
                    }
                } else if (predicate.test((class01894)class018942)) {
                    hashMap.put((class01894)class018942, new class01063(class016222, (class03652<InputStream>)class036522, n2));
                }
            });
        }
        TreeMap treeMap = Maps.newTreeMap();
        hashMap.forEach((class018942, class010632) -> {
            class01894 class018943 = class01066.y(class018942);
            class01063 class010633 = (class01063)((Object)((Object)hashMap2.get(class018943)));
            class03652<class03643> class036522 = class010633 != null && class010633.L() >= class010632.L() ? class01066.N(class010633.y()) : class03643.y;
            treeMap.put(class018942, class01066.N(class010632.N(), class018942, class010632.y(), class036522));
        });
        return treeMap;
    }

    private static class03643 y(class03652<InputStream> class036522) throws IOException {
        try (InputStream inputStream = (InputStream)class036522.get();){
            class03643 class036432 = class03643.N((InputStream)inputStream);
            return class036432;
        }
    }

    static class01894 y(class01894 class018942) {
        return class018942.i(class018942.N() + ".mcmeta");
    }

    @Override
    public Stream<class01622> y() {
        return this.y.stream().map(class010882 -> class010882.y()).filter(Objects::nonNull);
    }

    public void N(class01622 class016222, Predicate<class01894> predicate) {
        this.N(class016222.method_14409(), class016222, predicate);
    }

    public void N(class01622 class016222) {
        this.N(class016222.method_14409(), class016222, null);
    }

    private static class03652<class03643> N(class03652<InputStream> class036522) {
        return () -> class01066.y(class036522);
    }

    private void N(String string, @Nullable class01622 class016222, @Nullable Predicate<class01894> predicate) {
        this.y.add(new class01088(string, class016222, predicate));
    }

    @Override
    public Set<String> N() {
        return ImmutableSet.of((Object)this.i);
    }

    @Override
    public List<class01079> N(class01894 class018942) {
        class01894 class018943 = class01066.y(class018942);
        ArrayList<class01079> arrayList = new ArrayList<class01079>();
        boolean bl = false;
        String string = null;
        for (int i = this.y.size() - 1; i >= 0; --i) {
            class03652 class036522;
            class01088 class010882 = this.y.get(i);
            class01622 class016222 = class010882.y();
            if (class016222 != null && (class036522 = class016222.method_14405(this.u, class018942)) != null) {
                class03652 class036523 = bl ? class03643.y : () -> {
                    class03652 class036522 = class016222.method_14405(this.u, class018943);
                    return class036522 != null ? class01066.y((class03652<InputStream>)class036522) : class03643.N;
                };
                arrayList.add(new class01079(class016222, (class03652<InputStream>)class036522, (class03652<class03643>)class036523));
            }
            if (class010882.N(class018942)) {
                string = class010882.N();
                break;
            }
            if (!class010882.N(class018943)) continue;
            bl = true;
        }
        if (arrayList.isEmpty() && string != null) {
            N.warn("Resource {} not found, but was filtered by pack {}", (Object)class018942, string);
        }
        return Lists.reverse(arrayList);
    }

    private static class03652<InputStream> N(class01894 class018942, class01622 class016222, class03652<InputStream> class036522) {
        if (N.isDebugEnabled()) {
            return () -> new class01082((InputStream)class036522.get(), class018942, class016222.method_14409());
        }
        return class036522;
    }

    private static class01079 N(class01622 class016222, class01894 class018942, class03652<InputStream> class036522, class03652<class03643> class036523) {
        return new class01079(class016222, class01066.N(class018942, class016222, class036522), class036523);
    }

    private void N(class01088 class010882, String string, Predicate<class01894> predicate, Map<class01894, class01059> map) {
        class01622 class016222 = class010882.y();
        if (class016222 == null) {
            return;
        }
        class016222.method_14408(this.u, this.i, string, (class018942, class036522) -> {
            if (class01066.R(class018942)) {
                class01894 class018943 = class01066.M(class018942);
                if (!predicate.test(class018943)) {
                    return;
                }
                map.computeIfAbsent(class018943, class01059::new).u().put(class016222, (class03652<InputStream>)class036522);
            } else {
                if (!predicate.test((class01894)class018942)) {
                    return;
                }
                ((class01059)((Object)((Object)map.computeIfAbsent((class01894)class018942, class01059::new)))).L().add(new class01071(class016222, (class03652<InputStream>)class036522));
            }
        });
    }

    private static void N(class01088 class010882, Map<class01894, class01059> map) {
        for (class01059 class010592 : map.values()) {
            if (class010882.N(class010592.N())) {
                class010592.L().clear();
                continue;
            }
            if (!class010882.N(class010592.y())) continue;
            class010592.u().clear();
        }
    }

    public void N(String string, Predicate<class01894> predicate) {
        this.N(string, null, predicate);
    }

    private class03652<class03643> N(class01894 class018942, int n) {
        return () -> {
            class01894 class018943 = class01066.y(class018942);
            for (int i = this.y.size() - 1; i >= n; --i) {
                class03652 class036522;
                class01088 class010882 = this.y.get(i);
                class01622 class016222 = class010882.y();
                if (class016222 != null && (class036522 = class016222.method_14405(this.u, class018943)) != null) {
                    return class01066.y((class03652<InputStream>)class036522);
                }
                if (class010882.N(class018943)) break;
            }
            return class03643.N;
        };
    }

    public Optional<class01079> method_14486(class01894 class018942) {
        for (int i = this.y.size() - 1; i >= 0; --i) {
            class03652 class036522;
            class01088 class010882 = this.y.get(i);
            class01622 class016222 = class010882.y();
            if (class016222 != null && (class036522 = class016222.method_14405(this.u, class018942)) != null) {
                class03652<class03643> class036523 = this.N(class018942, i);
                return Optional.of(class01066.N(class016222, class018942, (class03652<InputStream>)class036522, class036523));
            }
            if (!class010882.N(class018942)) continue;
            N.warn("Resource {} not found, but was filtered by pack {}", (Object)class018942, (Object)class010882.N());
            return Optional.empty();
        }
        return Optional.empty();
    }

    private static boolean R(class01894 class018942) {
        return class018942.N().endsWith(".mcmeta");
    }
}

