/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class03711
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 *  minecraft.class08019
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03711;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;
import minecraft.class08019;

public class class08077
implements class00381<class07280> {
    public static final class02362<class04247, class08077> N = class00381.N(class08077::N, class08077::new);
    private final boolean y;
    private final List<class03711> L;
    private final Set<class01894> u;
    private final Map<class01894, class08019> i;
    private final boolean R;

    public Map<class01894, class08019> L() {
        return this.i;
    }

    public boolean M() {
        return this.R;
    }

    public class08077(boolean bl, Collection<class03711> collection, Set<class01894> set, Map<class01894, class08019> map, boolean bl2) {
        this.y = bl;
        this.L = List.copyOf(collection);
        this.u = Set.copyOf(set);
        this.i = Map.copyOf(map);
        this.R = bl2;
    }

    private class08077(class04247 class042472) {
        this.y = class042472.readBoolean();
        this.L = (List)class03711.y.decode((Object)class042472);
        this.u = (Set)class042472.N_15(Sets::newLinkedHashSetWithExpectedSize, class00667::T);
        this.i = class042472.N_17(class00667::T, class08019::y);
        this.R = class042472.readBoolean();
    }

    public boolean u() {
        return this.y;
    }

    public Set<class01894> y() {
        return this.u;
    }

    private void N(class04247 class042472) {
        class042472.writeBoolean(this.y);
        class03711.y.encode((Object)class042472, this.L);
        class042472.N_12(this.u, class00667::N);
        class042472.N(this.i, class00667::N, (class006672, class080192) -> class080192.N(class006672));
        class042472.writeBoolean(this.R);
    }

    public List<class03711> N() {
        return this.L;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class08077> method_65080() {
        return class04248.yU;
    }
}

