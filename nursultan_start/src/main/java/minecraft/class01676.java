/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class02959
 *  minecraft.class03345
 *  minecraft.class08230
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import minecraft.class01641;
import minecraft.class02959;
import minecraft.class03345;
import minecraft.class08230;

class class01676 {
    public final class01641 N;
    public final class08230 y;
    public final Long2ObjectMap<List<class03345>> L;

    public class01676(class02959 class029592) {
        this.N = new class01641(class029592.R.length);
        this.y = new class08230(class029592.u(), class029592.y(), class029592.L, class029592.y.method_31607());
        this.L = new Long2ObjectOpenHashMap();
    }
}

