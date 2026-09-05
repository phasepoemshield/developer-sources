/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00549
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import minecraft.class00549;
import minecraft.class02225;
import minecraft.class02237;
import minecraft.class02238;

public class class02230 {
    private final List<class02237> N = new ArrayList<class02237>();

    public class02238 N() {
        return new class02238((ImmutableList<class02237>)ImmutableList.copyOf(this.N));
    }

    public class02230 N(class00549 class005492, UnaryOperator<class02225> unaryOperator) {
        class02225 class022252 = this.N.isEmpty() ? new class02225(class005492) : new class02225(class005492, (class02237)((Object)this.N.getLast()));
        this.N.add(((class02225)unaryOperator.apply(class022252)).N());
        return this;
    }
}

