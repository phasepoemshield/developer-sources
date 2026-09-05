/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class02065
 *  minecraft.class03948
 *  minecraft.class05096
 */
package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.time.Instant;
import java.util.UUID;
import minecraft.class02065;
import minecraft.class03409;
import minecraft.class03948;
import minecraft.class05096;

public class class03406
extends class02065 {
    final IntSet N = new IntOpenHashSet();

    class03406(UUID uUID, Instant instant, UUID uUID2) {
        super(uUID, instant, uUID2);
    }

    public void N(int n, AbuseReportLimits abuseReportLimits) {
        if (this.N.contains(n)) {
            this.N.remove(n);
        } else if (this.N.size() < abuseReportLimits.maxReportedMessageCount()) {
            this.N.add(n);
        }
    }

    public class05096 N(class05096 class050962, class03409 class034092) {
        return new class03948(class050962, class034092, this);
    }

    public class03406 y() {
        class03406 class034062 = new class03406(this.y, this.L, this.u);
        class034062.N.addAll((IntCollection)this.N);
        class034062.i = this.i;
        class034062.R = this.R;
        class034062.M = this.M;
        return class034062;
    }
}

