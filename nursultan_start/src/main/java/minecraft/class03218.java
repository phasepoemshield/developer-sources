/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10162
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class04770
 *  minecraft.class06265
 *  minecraft.class07321
 *  minecraft.class07428
 */
package minecraft;

import Nursultan.class10162;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import minecraft.class04770;
import minecraft.class06265;
import minecraft.class07321;
import minecraft.class07428;

public class class03218 {
    private final Long2ObjectMap<List<class04770>> N = new Long2ObjectOpenHashMap();
    private final Map<class04770, class10162> y = Maps.newHashMap();
    private final class06265 L;

    public class03218(class06265 class062652) {
        this.L = class062652;
    }

    public boolean N(class07428 class074282, class07321 class073212) {
        for (class04770 class047702 : this.N(class073212)) {
            class10162 class101622 = this.y.get(class047702);
            if (class101622 != null && !class101622.y(class074282)) continue;
            return true;
        }
        return false;
    }

    public void N(class07321 class073212, class07428 class074282) {
        for (class04770 class047703 : this.N(class073212)) {
            this.y.computeIfAbsent(class047703, class047702 -> new class10162()).N(class074282);
        }
    }

    private List<class04770> N(class07321 class073212) {
        return (List)this.N.computeIfAbsent(class073212.y(), l -> this.L.L(class073212));
    }
}

