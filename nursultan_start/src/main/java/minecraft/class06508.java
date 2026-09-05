/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class05952
 *  minecraft.class05957
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class05952;
import minecraft.class05957;

public abstract class class06508
implements class05952 {
    private final ImmutableList.Builder<class05957> N = ImmutableList.builder();

    protected class06508(class05952 ... class05952Array) {
        for (class05952 class059522 : class05952Array) {
            this.N.add((Object)class059522.build());
        }
    }

    public class05957 build() {
        return this.N((List<class05957>)this.N.build());
    }

    public void N(class05952 class059522) {
        this.N.add((Object)class059522.build());
    }

    protected abstract class05957 N(List<class05957> var1);
}

