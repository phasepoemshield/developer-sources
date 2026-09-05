/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BetterBlockPos
 *  dev.babbaj.pathfinder.PathSegment
 */
package baritone.process.elytra;

import baritone.api.utils.BetterBlockPos;
import dev.babbaj.pathfinder.PathSegment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class UnpackedSegment {
    private final Stream<BetterBlockPos> path;
    private final boolean finished;

    public UnpackedSegment(Stream<BetterBlockPos> stream, boolean bl) {
        this.path = stream;
        this.finished = bl;
    }

    public UnpackedSegment append(Stream<BetterBlockPos> stream, boolean bl) {
        return new UnpackedSegment(Stream.concat(this.path, stream), bl);
    }

    public List<BetterBlockPos> collect() {
        List<BetterBlockPos> list = this.path.collect(Collectors.toList());
        HashMap<BetterBlockPos, Integer> hashMap = new HashMap<BetterBlockPos, Integer>();
        for (int i = 0; i < list.size(); ++i) {
            BetterBlockPos betterBlockPos = list.get(i);
            if (hashMap.containsKey(betterBlockPos)) {
                int n = (Integer)hashMap.get(betterBlockPos);
                while (i > n) {
                    list.remove(i);
                    --i;
                }
                continue;
            }
            hashMap.put(betterBlockPos, i);
        }
        return list;
    }

    public static UnpackedSegment from(PathSegment pathSegment) {
        return new UnpackedSegment(Arrays.stream(pathSegment.packed).mapToObj(BetterBlockPos::deserializeFromLong), pathSegment.finished);
    }

    public UnpackedSegment prepend(Stream<BetterBlockPos> stream) {
        return new UnpackedSegment(Stream.concat(stream, this.path), this.finished);
    }

    public boolean isFinished() {
        return this.finished;
    }
}

