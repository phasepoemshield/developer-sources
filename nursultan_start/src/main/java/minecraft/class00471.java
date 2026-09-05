/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class05952
 *  minecraft.class05957
 *  minecraft.class07297
 *  minecraft.class08137
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class05952;
import minecraft.class05957;
import minecraft.class07297;
import minecraft.class08137;

public abstract class class00471<T extends class00471<T>>
implements class07297<T>,
class08137 {
    private final ImmutableList.Builder<class05957> N = ImmutableList.builder();

    protected abstract T L();

    public final T M() {
        return this.L();
    }

    public T y(class05952 class059522) {
        this.N.add((Object)class059522.build());
        return this.L();
    }

    protected List<class05957> R() {
        return this.N.build();
    }
}

