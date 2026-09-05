/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00647
 *  minecraft.class00654
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00647;
import minecraft.class00654;
import minecraft.class07536;
import minecraft.class08737;
import minecraft.class08752;

public final class class08751
extends Record
implements class08752 {
    private final class00647 value;
    public static final Map<class00654, MapCodec<class08751>> N = (Map)class07536.N(() -> {
        EnumMap<class00654, MapCodec> enumMap = new EnumMap<class00654, MapCodec>(class00654.class);
        for (class00654 class006542 : (class00654[])class00654.class.getEnumConstants()) {
            if (!class006542.N()) continue;
            MapCodec mapCodec = class006542.y();
            enumMap.put(class006542, mapCodec.xmap(class08751::new, class08751::y));
        }
        return Collections.unmodifiableMap(enumMap);
    });

    public class08751(class00647 class006472) {
        this.value = class006472;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08751.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08751.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08751.class, "value", "value"}, this);
    }

    public class00647 y() {
        return this.value;
    }

    public MapCodec<class08751> N() {
        return N.get(this.value.N());
    }

    @Override
    public Optional<class00647> N(Map<String, class08737> map) {
        return Optional.of(this.value);
    }
}

