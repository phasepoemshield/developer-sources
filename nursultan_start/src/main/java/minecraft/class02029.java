/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09552
 *  Nursultan.class09556
 *  it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap
 *  minecraft.class00500
 *  minecraft.class03063
 *  minecraft.class03082
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class07536
 */
package minecraft;

import Nursultan.class09552;
import Nursultan.class09556;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import minecraft.class00500;
import minecraft.class03063;
import minecraft.class03082;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class07536;

public class class02029 {
    private boolean N;
    private final Long2IntLinkedOpenHashMap y = (Long2IntLinkedOpenHashMap)class07536.N(() -> {
        class09552 class095522 = new class09552(this, 100, 0.25f);
        class095522.defaultReturnValue(Integer.MAX_VALUE);
        return class095522;
    });
    private final Long2FloatLinkedOpenHashMap L = (Long2FloatLinkedOpenHashMap)class07536.N(() -> {
        class09556 class095562 = new class09556(this, 100, 0.25f);
        class095562.defaultReturnValue(Float.NaN);
        return class095562;
    });
    private final class03082 u = (class072952, class072092) -> {
        long l = class072092.method_10063();
        int n = this.y.get(l);
        if (n != Integer.MAX_VALUE) {
            return n;
        }
        int n2 = class03082.N.packedBrightness(class072952, class072092);
        if (this.y.size() == 100) {
            this.y.removeFirstInt();
        }
        this.y.put(l, n2);
        return n2;
    };

    public float y(class00500 class005002, class07295 class072952, class07209 class072092) {
        float f;
        long l = class072092.method_10063();
        if (this.N && !Float.isNaN(f = this.L.get(l))) {
            return f;
        }
        f = class005002.L((class07290)class072952, class072092);
        if (this.N) {
            if (this.L.size() == 100) {
                this.L.removeFirstFloat();
            }
            this.L.put(l, f);
        }
        return f;
    }

    public void y() {
        this.N = false;
        this.y.clear();
        this.L.clear();
    }

    public void N() {
        this.N = true;
    }

    public int N(class00500 class005002, class07295 class072952, class07209 class072092) {
        return class03063.N((class03082)(this.N ? this.u : class03082.N), (class07295)class072952, (class00500)class005002, (class07209)class072092);
    }
}

