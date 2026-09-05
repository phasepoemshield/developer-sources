/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.utils.MyChunkPos
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  minecraft.class07321
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.utils.MyChunkPos;
import baritone.process.ExploreProcess;
import baritone.process.ExploreProcess$BaritoneChunkCache;
import baritone.process.ExploreProcess$IChunkFilter;
import baritone.process.ExploreProcess$Status;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import minecraft.class07321;

class ExploreProcess$JsonChunkFilter
implements ExploreProcess$IChunkFilter {
    private final boolean invert;
    private final LongOpenHashSet inFilter;
    private final MyChunkPos[] positions;
    final /* synthetic */ ExploreProcess this$0;

    ExploreProcess$JsonChunkFilter(ExploreProcess exploreProcess, Path path, boolean bl) throws Exception {
        this.this$0 = exploreProcess;
        this.invert = bl;
        Gson gson = new GsonBuilder().create();
        this.positions = (MyChunkPos[])gson.fromJson((Reader)new InputStreamReader(Files.newInputStream(path, new OpenOption[0])), MyChunkPos[].class);
        exploreProcess.logDirect("Loaded " + this.positions.length + " positions");
        this.inFilter = new LongOpenHashSet();
        for (MyChunkPos myChunkPos : this.positions) {
            this.inFilter.add(class07321.u((int)myChunkPos.x, (int)myChunkPos.z));
        }
    }

    @Override
    public ExploreProcess$Status isAlreadyExplored(int n, int n2) {
        if (this.inFilter.contains(class07321.u((int)n, (int)n2)) ^ this.invert) {
            return ExploreProcess$Status.EXPLORED;
        }
        return ExploreProcess$Status.UNKNOWN;
    }

    @Override
    public int countRemain() {
        if (!this.invert) {
            return Integer.MAX_VALUE;
        }
        int n = 0;
        ExploreProcess$BaritoneChunkCache exploreProcess$BaritoneChunkCache = new ExploreProcess$BaritoneChunkCache(this.this$0);
        for (MyChunkPos myChunkPos : this.positions) {
            if (exploreProcess$BaritoneChunkCache.isAlreadyExplored(myChunkPos.x, myChunkPos.z) == ExploreProcess$Status.EXPLORED || ++n < (Integer)Baritone.settings().exploreChunkSetMinimumSize.value) continue;
            return n;
        }
        return n;
    }
}

