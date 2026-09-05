/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Streams
 *  com.mojang.blocklist.BlockListSupplier
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.mojang.blocklist.BlockListSupplier;
import java.util.Objects;
import java.util.ServiceLoader;
import minecraft.class03420;
import minecraft.class03436;
import minecraft.class03437;

public interface class03422 {
    public boolean N(class03437 var1);

    public boolean N(class03420 var1);

    public static class03422 N() {
        ImmutableList immutableList = (ImmutableList)Streams.stream(ServiceLoader.load(BlockListSupplier.class)).map(BlockListSupplier::createBlockList).filter(Objects::nonNull).collect(ImmutableList.toImmutableList());
        return new class03436(immutableList);
    }
}

