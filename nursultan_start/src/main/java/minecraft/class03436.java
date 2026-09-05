/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import minecraft.class03420;
import minecraft.class03422;
import minecraft.class03437;

class class03436
implements class03422 {
    final /* synthetic */ ImmutableList N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class03436(ImmutableList immutableList) {
        this.N = immutableList;
    }

    @Override
    public boolean N(class03420 class034202) {
        String string = class034202.N();
        return this.N.stream().noneMatch(predicate -> predicate.test(string));
    }

    @Override
    public boolean N(class03437 class034372) {
        String string = class034372.N();
        String string2 = class034372.y();
        return this.N.stream().noneMatch(predicate -> predicate.test(string) || predicate.test(string2));
    }
}

