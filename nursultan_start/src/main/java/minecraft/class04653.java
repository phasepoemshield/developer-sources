/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.shorts.Short2BooleanMap
 *  it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap
 *  minecraft.class00500
 *  minecraft.class05787
 *  minecraft.class07209
 *  minecraft.class07290
 */
package minecraft;

import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import minecraft.class00500;
import minecraft.class05787;
import minecraft.class07209;
import minecraft.class07290;

public class class04653 {
    private final class07290 y;
    private final class07209 L;
    private final Short2ObjectMap<class00500> u = new Short2ObjectOpenHashMap();
    private final Short2BooleanMap i = new Short2BooleanOpenHashMap();
    final /* synthetic */ class05787 N;

    private short L(class07209 class072092) {
        int n = class072092.method_10263() - this.L.method_10263();
        int n2 = class072092.method_10260() - this.L.method_10260();
        return (short)((n + 128 & 0xFF) << 8 | n2 + 128 & 0xFF);
    }

    class04653(class05787 class057872, class07290 class072902, class07209 class072092) {
        this.N = class057872;
        this.y = class072902;
        this.L = class072092;
    }

    public boolean y(class07209 class072092) {
        return this.i.computeIfAbsent(this.L(class072092), s -> {
            class00500 class005002 = this.N(class072092, s);
            class07209 class072093 = class072092.method_10074();
            class00500 class005003 = this.y.method_8320(class072093);
            return this.N.N(this.y, class072092, class005002, class072093, class005003);
        });
    }

    public class00500 N(class07209 class072092) {
        return this.N(class072092, this.L(class072092));
    }

    private class00500 N(class07209 class072092, short s2) {
        return (class00500)this.u.computeIfAbsent(s2, s -> this.y.method_8320(class072092));
    }
}

