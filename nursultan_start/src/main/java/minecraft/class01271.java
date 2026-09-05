/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  minecraft.class05973
 */
package minecraft;

import com.google.common.base.MoreObjects;
import java.util.List;
import minecraft.class01262;
import minecraft.class05973;

public class class01271 {
    public static final int N = -1;
    private final List<class01262> y;
    private final int L;

    public class01271(List<class01262> list, int n) {
        this.y = list;
        this.L = n;
    }

    public class01262 N(int n) {
        if (n < 0 || n >= this.y.size()) {
            return class05973.M;
        }
        return (class01262)MoreObjects.firstNonNull((Object)this.y.get(n), (Object)class05973.M);
    }

    public int N() {
        return this.L;
    }
}

