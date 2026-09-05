/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.FloatIterator
 *  it.unimi.dsi.fastutil.floats.FloatOpenHashSet
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceMap
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.util.MathUtil
 *  net.caffeinemc.mods.sodium.client.util.interval_tree.DoubleInterval
 *  net.caffeinemc.mods.sodium.client.util.interval_tree.Interval$Bounded
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger;

import it.unimi.dsi.fastutil.floats.FloatIterator;
import it.unimi.dsi.fastutil.floats.FloatOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2ReferenceMap;
import java.util.Arrays;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.util.MathUtil;
import net.caffeinemc.mods.sodium.client.util.interval_tree.DoubleInterval;
import net.caffeinemc.mods.sodium.client.util.interval_tree.Interval;
import org.joml.Vector3fc;

public class NormalPlanes {
    final FloatOpenHashSet relativeDistancesSet = new FloatOpenHashSet(16);
    final Vector3fc normal;
    final int alignedDirection;
    final class01296 sectionPos;
    float[] relativeDistances;
    DoubleInterval distanceRange;
    long relDistanceHash;
    double baseDistance;

    public NormalPlanes(class01296 class012962, int n) {
        this(class012962, ModelQuadFacing.ALIGNED_NORMALS[n], n);
    }

    public NormalPlanes(class01296 class012962, Vector3fc vector3fc) {
        this(class012962, vector3fc, ModelQuadFacing.UNASSIGNED_ORDINAL);
    }

    private NormalPlanes(class01296 class012962, Vector3fc vector3fc, int n) {
        this.sectionPos = class012962;
        this.normal = vector3fc;
        this.alignedDirection = n;
    }

    public void prepareAndInsert(Object2ReferenceMap<Vector3fc, float[]> object2ReferenceMap) {
        this.prepareIntegration();
        if (object2ReferenceMap != null) {
            object2ReferenceMap.put((Object)this.normal, (Object)this.relativeDistances);
        }
    }

    public void addPlaneMember(float f) {
        this.relativeDistancesSet.add(f);
    }

    public void prepareIntegration() {
        if (this.relativeDistances != null) {
            throw new IllegalStateException("Already prepared");
        }
        int n = this.relativeDistancesSet.size();
        this.relativeDistances = new float[this.relativeDistancesSet.size()];
        int n2 = 0;
        FloatIterator floatIterator = this.relativeDistancesSet.iterator();
        while (floatIterator.hasNext()) {
            float f = floatIterator.nextFloat();
            this.relativeDistances[n2++] = f;
            long l = Double.doubleToLongBits(f);
            this.relDistanceHash ^= this.relDistanceHash * 31L + l;
        }
        Arrays.sort(this.relativeDistances);
        this.baseDistance = MathUtil.floatDoubleDot((Vector3fc)this.normal, (double)this.sectionPos.u(), (double)this.sectionPos.i(), (double)this.sectionPos.R());
        this.distanceRange = new DoubleInterval(Double.valueOf((double)this.relativeDistances[0] + this.baseDistance), Double.valueOf((double)this.relativeDistances[n - 1] + this.baseDistance), Interval.Bounded.CLOSED);
    }
}

