/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class00500
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.mixin.renderer.client.block.model.MultiPartModelSharedBakedStateAccessor
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import minecraft.class00500;
import minecraft.class08388;
import minecraft.class08866;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.renderer.client.block.model.MultiPartModelSharedBakedStateAccessor;

@Environment(value=EnvType.CLIENT)
public final class class08875
implements MultiPartModelSharedBakedStateAccessor {
    private final List<class08866<class08887>> y;
    final class08388 N;
    private final Map<BitSet, List<class08887>> L = new ConcurrentHashMap<BitSet, List<class08887>>();

    public class08875(List<class08866<class08887>> list) {
        this.y = list;
        class08887 class088872 = class08875.N(list);
        this.N = class088872.method_68511();
    }

    public List<class08887> N(class00500 class005002) {
        BitSet bitSet2 = new BitSet();
        for (int i = 0; i < this.y.size(); ++i) {
            if (!this.y.get(i).N().test(class005002)) continue;
            bitSet2.set(i);
        }
        return this.L.computeIfAbsent(bitSet2, bitSet -> {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i = 0; i < this.y.size(); ++i) {
                if (!bitSet.get(i)) continue;
                builder.add((Object)this.y.get(i).y());
            }
            return builder.build();
        });
    }

    private static class08887 N(List<class08866<class08887>> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Model must have at least one selector");
        }
        return (class08887)((class08866)((Object)list.getFirst())).y();
    }

    public /* synthetic */ List getSelectors() {
        return this.y;
    }
}

