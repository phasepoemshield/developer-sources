/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongListIterator
 *  minecraft.class00554
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class01296
 *  minecraft.class05474
 *  minecraft.class05487
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07430
 *  minecraft.class07473
 *  minecraft.class07475
 *  net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.CheckAndCacheBlockChecker
 *  net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.LithiumMoveToBlockGoal
 *  net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.NonPOISearchDistances$MoveToBlockGoalDistances
 *  net.caffeinemc.mods.lithium.common.util.Pos$BlockCoord
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongListIterator;
import java.lang.invoke.LambdaMetafactory;
import java.util.EnumSet;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00554;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class01296;
import minecraft.class05474;
import minecraft.class05487;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.CheckAndCacheBlockChecker;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.LithiumMoveToBlockGoal;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.NonPOISearchDistances;
import net.caffeinemc.mods.lithium.common.util.Pos;

public abstract class class07969
extends class07473
implements LithiumMoveToBlockGoal {
    private static final int M = 1200;
    private static final int B = 1200;
    private static final int Z = 200;
    protected final class07475 N;
    public final double y;
    protected int L;
    protected int u;
    private int z;
    protected class07209 i = class07209.field_10980;
    private boolean U;
    private final int E;
    private final int W;
    protected int R;

    public void L() {
        this.M();
        this.u = 0;
        this.z = this.N.method_59922().y(this.N.method_59922().y(1200) + 1200) + 1200;
    }

    protected void M() {
        this.N.f().N((double)this.i.method_10263() + 0.5, (double)(this.i.method_10264() + 1), (double)this.i.method_10260() + 0.5, this.y);
    }

    public class07969(class07475 class074752, double d, int n) {
        this(class074752, d, n, 1);
    }

    public class07969(class07475 class074752, double d, int n, int n2) {
        this.N = class074752;
        this.y = d;
        this.E = n;
        this.R = 0;
        this.W = n2;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18407));
    }

    public boolean B() {
        return true;
    }

    public double Z() {
        return 1.0;
    }

    public void i() {
        class07209 class072092 = this.U();
        if (!class072092.method_19769((class00737)this.N.method_73189(), this.Z())) {
            this.U = false;
            ++this.u;
            if (this.E()) {
                this.N.f().N((double)class072092.method_10263() + 0.5, (double)class072092.method_10264(), (double)class072092.method_10260() + 0.5, this.y);
            }
        } else {
            this.U = true;
            --this.u;
        }
    }

    protected boolean m() {
        int n = this.E;
        int n2 = this.W;
        class07209 class072092 = this.N.method_24515();
        class07218 class072182 = new class07218();
        int n3 = this.R;
        while (n3 <= n2) {
            for (int i = 0; i < n; ++i) {
                int n4 = 0;
                while (n4 <= i) {
                    int n5;
                    int n6 = n5 = n4 < i && n4 > -i ? i : 0;
                    while (n5 <= i) {
                        class072182.N((class00753)class072092, n4, n3 - 1, n5);
                        if (this.N.L((class07209)class072182) && this.N((class05487)this.N.method_73183(), (class07209)class072182)) {
                            this.i = class072182;
                            return true;
                        }
                        n5 = n5 > 0 ? -n5 : 1 - n5;
                    }
                    n4 = n4 > 0 ? -n4 : 1 - n4;
                }
            }
            n3 = n3 > 0 ? -n3 : 1 - n3;
        }
        return false;
    }

    protected class07209 U() {
        return this.i.method_10084();
    }

    public boolean y() {
        return this.u >= -this.z && this.u <= 1200 && this.N((class05487)this.N.method_73183(), this.i);
    }

    public boolean E() {
        return this.u % 40 == 0;
    }

    private boolean N(class07209 class072092, BiPredicate biPredicate, CheckAndCacheBlockChecker checkAndCacheBlockChecker, int n, int n2) {
        class07218 class072182 = new class07218();
        int n3 = class072092.method_10264();
        int n4 = this.R;
        while (n4 <= this.W) {
            int n5 = n3 + n4;
            if (n5 >= n && n5 <= n2) {
                for (int i = 0; i < this.E; ++i) {
                    int n6 = 0;
                    while (n6 <= i) {
                        int n7;
                        int n8 = n7 = n6 < i && n6 > -i ? i : 0;
                        while (n7 <= i) {
                            class08050 class080502;
                            class072182.N((class00753)class072092, n6, n4, n7);
                            if (this.N.L((class07209)class072182) && checkAndCacheBlockChecker.checkPosition((class07209)class072182) && biPredicate.test(class080502 = checkAndCacheBlockChecker.getCachedChunkAccess((class07209)class072182), class072182)) {
                                this.i = class072182;
                                return true;
                            }
                            n7 = n7 > 0 ? -n7 : 1 - n7;
                        }
                        n6 = n6 > 0 ? -n6 : 1 - n6;
                    }
                }
            }
            n4 = n4 > 0 ? -n4 : 1 - n4;
        }
        return false;
    }

    protected abstract boolean N(class05487 var1, class07209 var2);

    private boolean N(class07209 class072092, BiPredicate biPredicate, CheckAndCacheBlockChecker checkAndCacheBlockChecker, LongArrayList longArrayList, int n, int n2) {
        longArrayList.sort((l, l2) -> NonPOISearchDistances.MoveToBlockGoalDistances.getMinimumSortOrderOfChunk((class07209)class072092, (long)l) - NonPOISearchDistances.MoveToBlockGoalDistances.getMinimumSortOrderOfChunk((class07209)class072092, (long)l2));
        Predicate var7 = checkAndCacheBlockChecker.blockStatePredicate;
        int n3 = checkAndCacheBlockChecker.minSectionY;
        class07218 class072182 = new class07218();
        class07218 class072183 = new class07218();
        int n4 = this.R;
        while (n4 <= this.W) {
            int n5 = class072092.method_10264() + n4;
            if (n5 >= n && n5 <= n2) {
                int n6;
                long l3;
                int n7;
                int n8 = class01296.N((int)n5);
                int n9 = n8 - n3;
                int n10 = Integer.MAX_VALUE;
                int n11 = this.E - 1;
                LongListIterator longListIterator = longArrayList.iterator();
                while (longListIterator.hasNext() && n10 >= NonPOISearchDistances.MoveToBlockGoalDistances.getMinimumSortOrderOfChunk((class07209)class072092, (int)(n7 = class07321.N((long)(l3 = ((Long)longListIterator.next()).longValue()))), (int)(n6 = class07321.y((long)l3)))) {
                    if (!checkAndCacheBlockChecker.checkCachedSection(n7, n8, n6)) continue;
                    class08050 class080502 = checkAndCacheBlockChecker.getCachedChunkAccess(l3);
                    int n12 = class01296.L((int)n7);
                    int n13 = Math.max(class072092.method_10263() - n11, n12);
                    int n14 = Math.min(class072092.method_10263() + n11, n12 + 15);
                    int n15 = class01296.L((int)n6);
                    int n16 = Math.max(class072092.method_10260() - n11, n15);
                    int n17 = Math.min(class072092.method_10260() + n11, n15 + 15);
                    class00554 class005542 = class080502.u()[n9];
                    for (int i = n16; i <= n17; ++i) {
                        for (int j = n13; j <= n14; ++j) {
                            int n18;
                            int n19 = j - class072092.method_10263();
                            int n20 = NonPOISearchDistances.MoveToBlockGoalDistances.getRing((int)n19, (int)(n18 = i - class072092.method_10260()));
                            int n21 = NonPOISearchDistances.MoveToBlockGoalDistances.getVanillaSortOrderInt((int)n20, (int)n19, (int)n18);
                            if (n21 >= n10 || !this.N.L((class07209)class072183.N(j, n5, i)) || !var7.test(class005542.N(j & 0xF, n5 & 0xF, i & 0xF)) || !biPredicate.test(class080502, class072183)) continue;
                            n11 = n20;
                            n13 = Math.max(class072092.method_10263() - n11, n12);
                            n14 = Math.min(class072092.method_10263() + n11, n12 + 15);
                            n17 = Math.min(class072092.method_10260() + n11, n15 + 15);
                            class072182.N(j, n5, i);
                            n10 = n21;
                        }
                    }
                }
                if (n10 < Integer.MAX_VALUE) {
                    this.i = class072182;
                    return true;
                }
            }
            n4 = n4 > 0 ? -n4 : 1 - n4;
        }
        return false;
    }

    protected int N(class07475 class074752) {
        return class07969.y((int)(200 + class074752.method_59922().y(200)));
    }

    public boolean N() {
        if (this.L > 0) {
            --this.L;
            return false;
        }
        this.L = this.N(this.N);
        return this.m();
    }

    public boolean lithium$findNearestBlock(Predicate predicate, BiPredicate biPredicate, boolean bl) {
        class07209 class072092 = this.N.method_24515().method_10069(0, -1, 0);
        class07299 class072992 = this.N.method_73183();
        CheckAndCacheBlockChecker checkAndCacheBlockChecker = new CheckAndCacheBlockChecker(class072092, this.E - 1, this.W, (class05487)class072992, predicate, bl);
        LongArrayList longArrayList = new LongArrayList(checkAndCacheBlockChecker.getChunkSize());
        checkAndCacheBlockChecker.initializeChunks((Consumer<Long>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, addLast(java.lang.Object ), (Ljava/lang/Long;)V)((LongArrayList)longArrayList));
        if (checkAndCacheBlockChecker.shouldStop()) {
            return false;
        }
        int n = Pos.BlockCoord.getMinY((class05474)class072992);
        int n2 = Pos.BlockCoord.getMaxYInclusive((class05474)class072992);
        if (!checkAndCacheBlockChecker.hasUnloadedPossibleChunks()) {
            return this.N(class072092, biPredicate, checkAndCacheBlockChecker, longArrayList, n, n2);
        }
        return this.N(class072092, biPredicate, checkAndCacheBlockChecker, n, n2);
    }

    protected boolean W() {
        return this.U;
    }
}

