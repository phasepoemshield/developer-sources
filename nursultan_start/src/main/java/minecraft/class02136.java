/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class04523
 *  minecraft.class04540
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class04523;
import minecraft.class04540;

public class class02136<E> {
    private final ImmutableList.Builder<class04523<E>> N = ImmutableList.builder();

    public class04540<E> N() {
        return new class04540((List)this.N.build());
    }

    public class02136<E> N(E e, int n) {
        this.N.add((Object)new class04523(e, n));
        return this;
    }

    public class02136<E> N(E e) {
        return this.N(e, 1);
    }
}

