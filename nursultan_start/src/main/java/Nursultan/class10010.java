/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09979
 *  Nursultan.class10002
 */
package Nursultan;

import Nursultan.class09979;
import Nursultan.class10002;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public final class class10010 {
    public static final class10010 N = new class10010(null);
    private final Map<class09979, class10002> y;

    public class10010(Map<class09979, class10002> map) {
        EnumMap<class09979, class10002> enumMap = new EnumMap<class09979, class10002>(class09979.class);
        if (map != null) {
            for (Map.Entry<class09979, class10002> entry : map.entrySet()) {
                class09979 class099792 = entry.getKey();
                class10002 class100022 = entry.getValue();
                if (class099792 == null || class100022 == null || class100022.N()) continue;
                enumMap.put(class099792, class100022);
            }
        }
        this.y = Collections.unmodifiableMap(enumMap);
    }

    public Map<class09979, class10002> y() {
        return this.y;
    }

    public class10010 N(class10010 class100102) {
        if (class100102 == null || class100102 == N || class100102.N()) {
            return this;
        }
        EnumMap<class09979, class10002> enumMap = new EnumMap<class09979, class10002>(class09979.class);
        enumMap.putAll(this.y);
        for (Map.Entry<class09979, class10002> entry : class100102.y.entrySet()) {
            class09979 class099792 = entry.getKey();
            class10002 class100022 = entry.getValue();
            class10002 class100023 = this.N(class099792).N(class100022);
            if (class100023.N()) {
                enumMap.remove(class099792);
                continue;
            }
            enumMap.put(class099792, class100023);
        }
        return new class10010(enumMap);
    }

    public boolean N() {
        return this.y.isEmpty();
    }

    public class10002 N(class09979 class099792) {
        if (class099792 == null) {
            return class10002.N;
        }
        return this.y.getOrDefault(class099792, class10002.N);
    }

    public class10010 N(class09979 class099792, class10002 class100022) {
        if (class099792 == null) {
            return this;
        }
        EnumMap<class09979, class10002> enumMap = new EnumMap<class09979, class10002>(class09979.class);
        enumMap.putAll(this.y);
        if (class100022 == null || class100022.N()) {
            enumMap.remove(class099792);
        } else {
            enumMap.put(class099792, class100022);
        }
        return new class10010(enumMap);
    }

    public class10002 N(boolean bl, boolean bl2, boolean bl3) {
        class10002 class100022 = class10002.N;
        if (bl) {
            class100022 = class100022.N(this.N(class09979.HOVER));
        }
        if (bl2) {
            class100022 = class100022.N(this.N(class09979.FOCUS));
        }
        if (bl3) {
            class100022 = class100022.N(this.N(class09979.ACTIVE));
        }
        return class100022;
    }
}

