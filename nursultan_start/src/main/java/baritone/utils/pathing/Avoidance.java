/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.IPlayerContext
 *  it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap
 *  minecraft.class07079
 *  minecraft.class07141
 *  minecraft.class07182
 *  minecraft.class07209
 *  minecraft.class07525
 */
package baritone.utils.pathing;

import baritone.Baritone;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import minecraft.class07079;
import minecraft.class07141;
import minecraft.class07182;
import minecraft.class07209;
import minecraft.class07525;

public class Avoidance {
    private final int centerX;
    private final int centerY;
    private final int centerZ;
    private final double coefficient;
    private final int radius;
    private final int radiusSq;

    public static List<Avoidance> create(IPlayerContext iPlayerContext) {
        if (!((Boolean)Baritone.settings().avoidance.value).booleanValue()) {
            return Collections.emptyList();
        }
        ArrayList<Avoidance> arrayList = new ArrayList<Avoidance>();
        double d = (Double)Baritone.settings().mobSpawnerAvoidanceCoefficient.value;
        double d2 = (Double)Baritone.settings().mobAvoidanceCoefficient.value;
        if (d != 1.0) {
            iPlayerContext.worldData().getCachedWorld().getLocationsOf("mob_spawner", 1, iPlayerContext.playerFeet().x, iPlayerContext.playerFeet().z, 2).forEach(class072092 -> arrayList.add(new Avoidance((class07209)class072092, d, (Integer)Baritone.settings().mobSpawnerAvoidanceRadius.value)));
        }
        if (d2 != 1.0) {
            iPlayerContext.entitiesStream().filter(class070492 -> class070492 instanceof class07079).filter(class070492 -> !(class070492 instanceof class07141) || (double)iPlayerContext.player().method_5718() < 0.5).filter(class070492 -> !(class070492 instanceof class07182) || ((class07182)class070492).method_6065() != null).filter(class070492 -> !(class070492 instanceof class07525) || ((class07525)class070492).t()).forEach(class070492 -> arrayList.add(new Avoidance(class070492.method_24515(), d2, (Integer)Baritone.settings().mobAvoidanceRadius.value)));
        }
        return arrayList;
    }

    public Avoidance(class07209 class072092, double d, int n) {
        this(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), d, n);
    }

    public Avoidance(int n, int n2, int n3, double d, int n4) {
        this.centerX = n;
        this.centerY = n2;
        this.centerZ = n3;
        this.coefficient = d;
        this.radius = n4;
        this.radiusSq = n4 * n4;
    }

    public void applySpherical(Long2DoubleOpenHashMap long2DoubleOpenHashMap) {
        for (int i = -this.radius; i <= this.radius; ++i) {
            for (int j = -this.radius; j <= this.radius; ++j) {
                for (int k = -this.radius; k <= this.radius; ++k) {
                    if (i * i + j * j + k * k > this.radius * this.radius) continue;
                    long l = BetterBlockPos.longHash((int)(this.centerX + i), (int)(this.centerY + j), (int)(this.centerZ + k));
                    long2DoubleOpenHashMap.put(l, long2DoubleOpenHashMap.get(l) * this.coefficient);
                }
            }
        }
    }

    public double coefficient(int n, int n2, int n3) {
        int n4 = n - this.centerX;
        int n5 = n2 - this.centerY;
        int n6 = n3 - this.centerZ;
        return n4 * n4 + n5 * n5 + n6 * n6 <= this.radiusSq ? this.coefficient : 1.0;
    }
}

