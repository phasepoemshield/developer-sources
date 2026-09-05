/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import org.jspecify.annotations.Nullable;

public class class04609 {
    private static final Long2ObjectMap<String> N = new Long2ObjectOpenHashMap();

    public static void y(long l) {
        N.remove(l);
    }

    public static void N(long l, @Nullable String string) {
        N.put(l, (Object)string);
    }

    public static String N(long l) {
        return (String)N.get(l);
    }
}

