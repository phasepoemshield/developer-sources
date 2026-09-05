/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class06068
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import minecraft.class05477;
import minecraft.class06068;

class class05454
implements class05477 {
    class05454() {
    }

    @Override
    public CompletableFuture<class06068> N(String string) {
        return CompletableFuture.completedFuture(class06068.N((String)string));
    }

    @Override
    public CompletableFuture<List<class06068>> N(List<String> list) {
        return CompletableFuture.completedFuture((List)list.stream().map(class06068::N).collect(ImmutableList.toImmutableList()));
    }
}

