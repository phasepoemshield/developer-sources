/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  minecraft.class07340
 *  minecraft.class07348
 *  net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper$LithiumBlockCounter
 */
package Nursultan;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.function.IntConsumer;
import minecraft.class07340;
import minecraft.class07348;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper;

public class class10738
implements IntConsumer {
    int N = 0;
    final /* synthetic */ IntConsumer y;
    final /* synthetic */ RandomTickingSectionDataHelper.LithiumBlockCounter L;
    final /* synthetic */ Int2IntOpenHashMap u;
    final /* synthetic */ class07340 i;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10738(class07348 class073482, IntConsumer intConsumer, RandomTickingSectionDataHelper.LithiumBlockCounter lithiumBlockCounter, Int2IntOpenHashMap int2IntOpenHashMap, class07340 class073402) {
        this.y = intConsumer;
        this.L = lithiumBlockCounter;
        this.u = int2IntOpenHashMap;
        this.i = class073402;
    }

    @Override
    public void accept(int n) {
        this.y.accept(n);
        ++this.N;
        if (this.N % 248 == 0 || this.N == 4096) {
            this.L.finishedCountingMinisection(this.u, this.i);
        }
    }
}

