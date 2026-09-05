/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class06584
 */
package baritone.api.utils;

import baritone.api.utils.BlockOptionalMeta;
import baritone.api.utils.accessor.IItemStack;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class06584;

public class BlockOptionalMetaLookup {
    private final ImmutableSet<class00891> blockSet;
    private final ImmutableSet<class00500> blockStateSet;
    private final ImmutableSet<Integer> stackHashes;
    private final BlockOptionalMeta[] boms;

    public boolean has(class00891 class008912) {
        return this.blockSet.contains((Object)class008912);
    }

    public boolean has(class00500 class005002) {
        return this.blockStateSet.contains((Object)class005002);
    }

    public boolean has(class06584 class065842) {
        int n = ((IItemStack)class065842).getBaritoneHash();
        return this.stackHashes.contains((Object)(n -= class065842.P()));
    }

    public BlockOptionalMetaLookup(BlockOptionalMeta ... blockOptionalMetaArray) {
        this.boms = blockOptionalMetaArray;
        HashSet<class00891> hashSet = new HashSet<class00891>();
        HashSet<class00500> hashSet2 = new HashSet<class00500>();
        HashSet<Integer> hashSet3 = new HashSet<Integer>();
        for (BlockOptionalMeta blockOptionalMeta : blockOptionalMetaArray) {
            hashSet.add(blockOptionalMeta.getBlock());
            hashSet2.addAll(blockOptionalMeta.getAllBlockStates());
            hashSet3.addAll(blockOptionalMeta.stackHashes());
        }
        this.blockSet = ImmutableSet.copyOf(hashSet);
        this.blockStateSet = ImmutableSet.copyOf(hashSet2);
        this.stackHashes = ImmutableSet.copyOf(hashSet3);
    }

    public BlockOptionalMetaLookup(class00891 ... class00891Array) {
        this((BlockOptionalMeta[])Stream.of(class00891Array).map(BlockOptionalMeta::new).toArray(BlockOptionalMeta[]::new));
    }

    public BlockOptionalMetaLookup(List<class00891> list) {
        this((BlockOptionalMeta[])list.stream().map(BlockOptionalMeta::new).toArray(BlockOptionalMeta[]::new));
    }

    public BlockOptionalMetaLookup(String ... stringArray) {
        this((BlockOptionalMeta[])Stream.of(stringArray).map(BlockOptionalMeta::new).toArray(BlockOptionalMeta[]::new));
    }

    public String toString() {
        return String.format("BlockOptionalMetaLookup{%s}", Arrays.toString(this.boms));
    }

    public List<BlockOptionalMeta> blocks() {
        return Arrays.asList(this.boms);
    }
}

