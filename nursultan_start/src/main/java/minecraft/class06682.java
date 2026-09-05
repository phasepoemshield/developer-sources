/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class07280
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07280;

public class class06682
implements class00381<class07280> {
    public static final class02362<class04247, class06682> N = class00381.N(class06682::N, class06682::new);
    private static final byte y = -128;
    private final int L;
    private final List<Pair<class07085, class06584>> u;

    public class06682(int n, List<Pair<class07085, class06584>> list) {
        this.L = n;
        this.u = list;
    }

    private class06682(class04247 class042472) {
        byte by;
        this.L = class042472.E();
        this.u = Lists.newArrayList();
        do {
            by = class042472.readByte();
            class07085 class070852 = (class07085)class07085.field_54086.get(by & 0x7F);
            class06584 class065842 = (class06584)class06584.B.decode((Object)class042472);
            this.u.add((Pair<class07085, class06584>)Pair.of((Object)class070852, (Object)class065842));
        } while ((by & 0xFFFFFF80) != 0);
    }

    public List<Pair<class07085, class06584>> y() {
        return this.u;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.L;
    }

    private void N(class04247 class042472) {
        class042472.L(this.L);
        int n = this.u.size();
        for (int i = 0; i < n; ++i) {
            Pair<class07085, class06584> var4 = this.u.get(i);
            class07085 class070852 = (class07085)var4.getFirst();
            boolean bl = i != n - 1;
            int n2 = class070852.ordinal();
            class042472.writeByte(bl ? n2 | 0xFFFFFF80 : n2);
            class06584.B.encode((Object)class042472, (Object)((class06584)var4.getSecond()));
        }
    }

    public class02897<class06682> method_65080() {
        return class04248.Nc;
    }
}

