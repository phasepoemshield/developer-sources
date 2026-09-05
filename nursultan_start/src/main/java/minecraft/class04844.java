/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class05246
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Map;
import minecraft.class05246;

public class class04844 {
    private final int N;
    private final int y;
    private final int L;
    private final int u;
    private final class05246 i;

    public int L() {
        return this.L;
    }

    public class04844(int n, int n2, int n3, int n4, class05246 class052462) {
        this.N = n;
        this.y = n2;
        this.L = n3;
        this.u = n4;
        this.i = class052462;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class04844 class048442 = (class04844)object;
        if (this.N != class048442.N) {
            return false;
        }
        if (this.L != class048442.L) {
            return false;
        }
        if (this.u != class048442.u) {
            return false;
        }
        return this.i == class048442.i;
    }

    public String toString() {
        return "JigsawJunction{sourceX=" + this.N + ", sourceGroundY=" + this.y + ", sourceZ=" + this.L + ", deltaY=" + this.u + ", destProjection=" + String.valueOf(this.i) + "}";
    }

    public int hashCode() {
        int n = this.N;
        n = 31 * n + this.y;
        n = 31 * n + this.L;
        n = 31 * n + this.u;
        n = 31 * n + this.i.hashCode();
        return n;
    }

    public class05246 i() {
        return this.i;
    }

    public int u() {
        return this.u;
    }

    public int y() {
        return this.y;
    }

    public static <T> class04844 N(Dynamic<T> dynamic) {
        return new class04844(dynamic.get("source_x").asInt(0), dynamic.get("source_ground_y").asInt(0), dynamic.get("source_z").asInt(0), dynamic.get("delta_y").asInt(0), class05246.N((String)dynamic.get("dest_proj").asString("")));
    }

    public <T> Dynamic<T> N(DynamicOps<T> dynamicOps) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("source_x"), dynamicOps.createInt(this.N)).put(dynamicOps.createString("source_ground_y"), dynamicOps.createInt(this.y)).put(dynamicOps.createString("source_z"), dynamicOps.createInt(this.L)).put(dynamicOps.createString("delta_y"), dynamicOps.createInt(this.u)).put(dynamicOps.createString("dest_proj"), dynamicOps.createString(this.i.N()));
        return new Dynamic(dynamicOps, dynamicOps.createMap((Map)builder.build()));
    }

    public int N() {
        return this.N;
    }
}

