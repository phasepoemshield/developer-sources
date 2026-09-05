/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BlockOptionalMetaLookup
 *  baritone.api.utils.IPlayerContext
 *  minecraft.class00891
 *  minecraft.class07209
 *  minecraft.class07321
 */
package baritone.api.cache;

import baritone.api.utils.BlockOptionalMetaLookup;
import baritone.api.utils.IPlayerContext;
import java.util.List;
import minecraft.class00891;
import minecraft.class07209;
import minecraft.class07321;

public interface IWorldScanner {
    public int repack(IPlayerContext var1, int var2);

    public int repack(IPlayerContext var1);

    default public List<class07209> scanChunk(IPlayerContext iPlayerContext, List<class00891> list, class07321 class073212, int n, int n2) {
        return this.scanChunk(iPlayerContext, new BlockOptionalMetaLookup(list), class073212, n, n2);
    }

    public List<class07209> scanChunk(IPlayerContext var1, BlockOptionalMetaLookup var2, class07321 var3, int var4, int var5);

    default public List<class07209> scanChunkRadius(IPlayerContext iPlayerContext, List<class00891> list, int n, int n2, int n3) {
        return this.scanChunkRadius(iPlayerContext, new BlockOptionalMetaLookup(list.toArray(new class00891[0])), n, n2, n3);
    }

    public List<class07209> scanChunkRadius(IPlayerContext var1, BlockOptionalMetaLookup var2, int var3, int var4, int var5);
}

