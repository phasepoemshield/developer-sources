/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00392
 *  minecraft.class00667
 *  minecraft.class03753
 *  minecraft.class06338
 *  minecraft.class06562
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class00667;
import minecraft.class03753;
import minecraft.class06338;
import minecraft.class06562;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class08019
implements Comparable<class08019> {
    private static final DateTimeFormatter y = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
    private static final Codec<Instant> L = class06338.N((DateTimeFormatter)y).xmap(Instant::from, instant -> instant.atZone(ZoneId.systemDefault()));
    private static final Codec<Map<String, class06562>> u = Codec.unboundedMap((Codec)Codec.STRING, L).xmap(map -> class07536.N((Map)map, class06562::new), map -> map.entrySet().stream().filter(entry -> ((class06562)entry.getValue()).N()).collect(Collectors.toMap(Map.Entry::getKey, entry -> Objects.requireNonNull(((class06562)entry.getValue()).u()))));
    public static final Codec<class08019> N = RecordCodecBuilder.create(instance -> instance.group((App)u.optionalFieldOf("criteria", Map.of()).forGetter(class080192 -> class080192.i), (App)Codec.BOOL.fieldOf("done").orElse((Object)true).forGetter(class08019::N)).apply(instance, (map, bl) -> new class08019(new HashMap<String, class06562>((Map<String, class06562>)map))));
    private final Map<String, class06562> i;
    private class03753 R = class03753.y;

    public @Nullable class06562 L(String string) {
        return this.i.get(string);
    }

    public float L() {
        if (this.i.isEmpty()) {
            return 0.0f;
        }
        float f = this.R.N();
        return (float)this.B() / f;
    }

    public @Nullable Instant M() {
        return this.i.values().stream().map(class06562::u).filter(Objects::nonNull).min(Comparator.naturalOrder()).orElse(null);
    }

    private class08019(Map<String, class06562> map) {
        this.i = map;
    }

    public class08019() {
        this.i = Maps.newHashMap();
    }

    public String toString() {
        return "AdvancementProgress{criteria=" + String.valueOf(this.i) + ", requirements=" + String.valueOf(this.R) + "}";
    }

    private int B() {
        return this.R.y(this::u);
    }

    public Iterable<String> i() {
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry<String, class06562> entry : this.i.entrySet()) {
            if (entry.getValue().N()) continue;
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }

    private boolean u(String string) {
        class06562 class065622 = this.L(string);
        return class065622 != null && class065622.N();
    }

    public @Nullable class00392 u() {
        if (this.i.isEmpty()) {
            return null;
        }
        int n = this.R.N();
        if (n <= 1) {
            return null;
        }
        int n2 = this.B();
        return class00392.N((String)"advancements.progress", (Object[])new Object[]{n2, n});
    }

    public boolean y(String string) {
        class06562 class065622 = this.i.get(string);
        if (class065622 != null && class065622.N()) {
            class065622.L();
            return true;
        }
        return false;
    }

    public static class08019 y(class00667 class006672) {
        Map map = class006672.N_17(class00667::s, class06562::y);
        return new class08019(map);
    }

    public boolean y() {
        Iterator<class06562> var1 = this.i.values().iterator();
        while (var1.hasNext()) {
            if (!var1.next().N()) continue;
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(class08019 class080192) {
        Instant instant = this.M();
        Instant instant2 = class080192.M();
        if (instant == null && instant2 != null) {
            return 1;
        }
        if (instant != null && instant2 == null) {
            return -1;
        }
        if (instant == null && instant2 == null) {
            return 0;
        }
        return instant.compareTo(instant2);
    }

    public boolean N(String string) {
        class06562 class065622 = this.i.get(string);
        if (class065622 != null && !class065622.N()) {
            class065622.y();
            return true;
        }
        return false;
    }

    public void N(class00667 class006673) {
        class006673.N(this.i, class00667::N, (class006672, class065622) -> class065622.N(class006672));
    }

    public void N(class03753 class037532) {
        Set var2 = class037532.L();
        this.i.entrySet().removeIf(entry -> !var2.contains(entry.getKey()));
        for (String string : var2) {
            this.i.putIfAbsent(string, new class06562());
        }
        this.R = class037532;
    }

    public boolean N() {
        return this.R.N(this::u);
    }

    public Iterable<String> R() {
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry<String, class06562> entry : this.i.entrySet()) {
            if (!entry.getValue().N()) continue;
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }
}

