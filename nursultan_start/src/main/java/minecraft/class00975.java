/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class06069
 *  minecraft.class06143
 *  minecraft.class08388
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class08388;

public class class00975
implements class06143 {
    public List<class08388> N;

    public void N(List<class08388> list) {
        this.N = ImmutableList.copyOf(list);
    }

    public class08388 method_18138(int n, int n2) {
        return this.N.get(n * (this.N.size() - 1) / n2);
    }

    public class08388 method_74304() {
        return (class08388)this.N.getFirst();
    }

    public class08388 method_18139(class06069 class060692) {
        return this.N.get(class060692.y(this.N.size()));
    }
}

