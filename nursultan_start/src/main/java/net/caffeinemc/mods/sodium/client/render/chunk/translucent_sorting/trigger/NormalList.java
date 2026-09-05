/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.FloatArrays
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ReferenceArraySet
 *  it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.util.MathUtil
 *  net.caffeinemc.mods.sodium.client.util.interval_tree.DoubleInterval
 *  net.caffeinemc.mods.sodium.client.util.interval_tree.Interval
 *  net.caffeinemc.mods.sodium.client.util.interval_tree.Interval$Bounded
 *  net.caffeinemc.mods.sodium.client.util.interval_tree.IntervalTree
 *  org.joml.Vector3dc
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger;

import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import java.util.Collection;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.CameraMovement;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.Group;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.NormalPlanes;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.SortTriggering;
import net.caffeinemc.mods.sodium.client.util.MathUtil;
import net.caffeinemc.mods.sodium.client.util.interval_tree.DoubleInterval;
import net.caffeinemc.mods.sodium.client.util.interval_tree.Interval;
import net.caffeinemc.mods.sodium.client.util.interval_tree.IntervalTree;
import org.joml.Vector3dc;
import org.joml.Vector3fc;

public class NormalList {
    private static final int HASH_SET_THRESHOLD = 20;
    private static final int ARRAY_SET_THRESHOLD = 10;
    private final Vector3fc normal;
    private final int alignedDirection;
    private final IntervalTree<Double> intervalTree = new IntervalTree();
    private final Object2ReferenceOpenHashMap<DoubleInterval, Collection<Group>> groupsByInterval = new Object2ReferenceOpenHashMap();
    private final Long2ReferenceOpenHashMap<Group> groupsBySection = new Long2ReferenceOpenHashMap();

    NormalList(Vector3fc vector3fc, int n) {
        this.normal = vector3fc;
        this.alignedDirection = n;
    }

    boolean isEmpty() {
        return this.groupsBySection.isEmpty();
    }

    void updateSection(NormalPlanes normalPlanes, long l) {
        Group group = (Group)this.groupsBySection.get(l);
        if (group.normalPlanesEquals(normalPlanes)) {
            return;
        }
        this.removeGroupInterval(group);
        group.replaceWith(normalPlanes);
        this.addGroupInterval(group);
    }

    void processMovement(SortTriggering sortTriggering, CameraMovement cameraMovement) {
        double d;
        double d2 = MathUtil.floatDoubleDot((Vector3fc)this.normal, (Vector3dc)cameraMovement.start());
        if (d2 >= (d = MathUtil.floatDoubleDot((Vector3fc)this.normal, (Vector3dc)cameraMovement.end()))) {
            return;
        }
        DoubleInterval doubleInterval = new DoubleInterval(Double.valueOf(d2), Double.valueOf(d), Interval.Bounded.CLOSED);
        for (Interval interval : this.intervalTree.query((Interval)doubleInterval)) {
            for (Group group : (Collection)this.groupsByInterval.get((Object)interval)) {
                group.triggerRange(sortTriggering, d2, d);
            }
        }
    }

    private void addGroupInterval(Group group) {
        Collection collection = (Collection)this.groupsByInterval.get((Object)group.distances);
        if (collection == null) {
            collection = new ReferenceArraySet();
            this.groupsByInterval.put((Object)group.distances, (Object)collection);
            this.intervalTree.add((Interval)group.distances);
        } else if (collection.size() >= 20) {
            collection = new ReferenceLinkedOpenHashSet(collection);
            this.groupsByInterval.put((Object)group.distances, (Object)collection);
        }
        collection.add(group);
    }

    void processCatchup(SortTriggering sortTriggering, CameraMovement cameraMovement, long l) {
        double d;
        double d2 = MathUtil.floatDoubleDot((Vector3fc)this.normal, (Vector3dc)cameraMovement.start());
        if (d2 >= (d = MathUtil.floatDoubleDot((Vector3fc)this.normal, (Vector3dc)cameraMovement.end()))) {
            return;
        }
        Group group = (Group)this.groupsBySection.get(l);
        if (group != null) {
            group.triggerRange(sortTriggering, d2, d);
        }
    }

    public Vector3fc getNormal() {
        return this.normal;
    }

    boolean hasSection(long l) {
        return this.groupsBySection.containsKey(l);
    }

    public static boolean queryRange(float[] fArray, float f, float f2) {
        int n = FloatArrays.binarySearch((float[])fArray, (float)f);
        if (n < 0) {
            int n2 = -n - 1;
            if (n2 >= fArray.length) {
                return false;
            }
            return fArray[n2] <= f2;
        }
        return true;
    }

    public boolean isAligned() {
        return this.alignedDirection != ModelQuadFacing.UNASSIGNED_ORDINAL;
    }

    void addSection(NormalPlanes normalPlanes, long l) {
        Group group = new Group(normalPlanes);
        this.groupsBySection.put(l, (Object)group);
        this.addGroupInterval(group);
    }

    public int getAlignedDirection() {
        return this.alignedDirection;
    }

    private void removeGroupInterval(Group group) {
        Collection collection = (Collection)this.groupsByInterval.get((Object)group.distances);
        if (collection != null) {
            collection.remove(group);
            if (collection.isEmpty()) {
                this.groupsByInterval.remove((Object)group.distances);
                this.intervalTree.remove((Interval)group.distances);
            } else if (collection.size() <= 10) {
                collection = new ReferenceArraySet(collection);
                this.groupsByInterval.put((Object)group.distances, (Object)collection);
            }
        }
    }

    void removeSection(long l) {
        Group group = (Group)this.groupsBySection.remove(l);
        if (group != null) {
            this.removeGroupInterval(group);
        }
    }
}

