/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00536
 *  minecraft.class00667
 *  minecraft.class00772
 *  minecraft.class01296
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05795
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.BitSet;
import java.util.List;
import minecraft.class00536;
import minecraft.class00667;
import minecraft.class00772;
import minecraft.class01296;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05795;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public class class01832 {
    private static final class02362<ByteBuf, byte[]> N = class02389.N((int)2048);
    private final BitSet y;
    private final BitSet L;
    private final BitSet u;
    private final BitSet i;
    private final List<byte[]> R;
    private final List<byte[]> M;

    public List<byte[]> L() {
        return this.R;
    }

    public class01832(class07321 class073212, class05795 class057952, @Nullable BitSet bitSet, @Nullable BitSet bitSet2) {
        this.y = new BitSet();
        this.L = new BitSet();
        this.u = new BitSet();
        this.i = new BitSet();
        this.R = Lists.newArrayList();
        this.M = Lists.newArrayList();
        for (int i = 0; i < class057952.L(); ++i) {
            if (bitSet == null || bitSet.get(i)) {
                this.N(class073212, class057952, class00772.field_9284, i, this.y, this.u, this.R);
            }
            if (bitSet2 != null && !bitSet2.get(i)) continue;
            this.N(class073212, class057952, class00772.field_9282, i, this.L, this.i, this.M);
        }
    }

    public class01832(class00667 class006672, int n, int n2) {
        this.y = class006672.t();
        this.L = class006672.t();
        this.u = class006672.t();
        this.i = class006672.t();
        this.R = class006672.N_16(N);
        this.M = class006672.N_16(N);
    }

    public BitSet i() {
        return this.i;
    }

    public BitSet u() {
        return this.L;
    }

    public BitSet y() {
        return this.u;
    }

    public BitSet N() {
        return this.y;
    }

    private void N(class07321 class073212, class05795 class057952, class00772 class007722, int n, BitSet bitSet, BitSet bitSet2, List<byte[]> list) {
        class00536 class005362 = class057952.N(class007722).N(class01296.N((class07321)class073212, (int)(class057952.u() + n)));
        if (class005362 != null) {
            if (class005362.u()) {
                bitSet2.set(n);
            } else {
                bitSet.set(n);
                list.add(class005362.y().N());
            }
        }
    }

    public void N(class00667 class006672) {
        class006672.N(this.y);
        class006672.N(this.L);
        class006672.N(this.u);
        class006672.N(this.i);
        class006672.N_12(this.R, N);
        class006672.N_12(this.M, N);
    }

    public List<byte[]> R() {
        return this.M;
    }
}

