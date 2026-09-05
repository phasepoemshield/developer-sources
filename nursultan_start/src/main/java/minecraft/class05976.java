/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 *  minecraft.class01829
 *  minecraft.class07529
 */
package minecraft;

import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import minecraft.class01829;
import minecraft.class07529;

public class class05976 {
    private final int N;
    private final long y;
    private final String L;
    private final class01829 u;
    private final boolean i;

    public String L() {
        return this.L;
    }

    private class05976(int n, long l, String string, int n2, String string2, boolean bl) {
        this.N = n;
        this.y = l;
        this.L = string;
        this.u = new class01829(n2, string2);
        this.i = bl;
    }

    public boolean i() {
        return this.i;
    }

    public class01829 u() {
        return this.u;
    }

    public long y() {
        return this.y;
    }

    public static class05976 N(Dynamic<?> dynamic) {
        int n = dynamic.get("version").asInt(0);
        long l = dynamic.get("LastPlayed").asLong(0L);
        OptionalDynamic optionalDynamic = dynamic.get("Version");
        if (optionalDynamic.result().isPresent()) {
            return new class05976(n, l, optionalDynamic.get("Name").asString(class07529.y().comp_4025()), optionalDynamic.get("Id").asInt(class07529.y().comp_4026().y()), optionalDynamic.get("Series").asString("main"), optionalDynamic.get("Snapshot").asBoolean(!class07529.y().comp_4031()));
        }
        return new class05976(n, l, "", 0, "main", false);
    }

    public int N() {
        return this.N;
    }
}

