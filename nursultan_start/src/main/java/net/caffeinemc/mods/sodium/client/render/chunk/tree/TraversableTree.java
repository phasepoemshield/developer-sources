/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.Tree;
import net.caffeinemc.mods.sodium.client.render.viewport.CameraTransform;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;

public class TraversableTree
extends Tree {
    private static final int INSIDE_FRUSTUM = 1;
    private static final int INSIDE_DISTANCE = 2;
    private static final int FULLY_INSIDE = 3;
    protected final long[] treeReduced = new long[64];
    public long treeDoubleReduced = 0L;
    private int cameraOffsetX;
    private int cameraOffsetY;
    private int cameraOffsetZ;
    private CoordinateSectionVisitor visitor;
    protected Viewport viewport;
    private float distanceLimit;

    public TraversableTree(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    private static int nearestToZero(int n, int n2) {
        int n3 = 0;
        if (n > 0) {
            n3 = n;
        }
        if (n2 < 0) {
            n3 = n2;
        }
        return n3;
    }

    @Override
    public int getPresence(int n, int n2, int n3) {
        if (TraversableTree.isOutOfBounds(n -= this.offsetX, n2 -= this.offsetY, n3 -= this.offsetZ)) {
            return -1;
        }
        int n4 = TraversableTree.interleave6x3(n, n2, n3);
        int n5 = n4 >> 12;
        if ((this.treeDoubleReduced & 1L << n5) == 0L) {
            return 0;
        }
        int n6 = n4 >> 6;
        return (this.tree[n6] & 1L << (n4 & 0x3F)) != 0L ? 1 : 0;
    }

    boolean testLeafNode(int n, int n2, int n3, int n4) {
        CameraTransform cameraTransform = this.viewport.getTransform();
        n = (n << 4) - cameraTransform.intX;
        n2 = (n2 << 4) - cameraTransform.intY;
        n3 = (n3 << 4) - cameraTransform.intZ;
        if ((n4 & 1) == 0 && !this.viewport.isBoxVisibleDirect((float)(n + 8) - cameraTransform.fracX, (float)(n2 + 8) - cameraTransform.fracY, (float)(n3 + 8) - cameraTransform.fracZ, 9.125f)) {
            return false;
        }
        if ((n4 & 2) == 0) {
            float f = (float)TraversableTree.nearestToZero(n - 1, n + 17) - cameraTransform.fracX;
            float f2 = (float)TraversableTree.nearestToZero(n2 - 1, n2 + 17) - cameraTransform.fracY;
            float f3 = (float)TraversableTree.nearestToZero(n3 - 1, n3 + 17) - cameraTransform.fracZ;
            return TraversableTree.cylindricalDistanceTest(f, f2, f3, this.distanceLimit);
        }
        return true;
    }

    private static int farthestFromZero(int n, int n2) {
        int n3 = 0;
        if (n > 0) {
            n3 = n2;
        }
        if (n2 < 0) {
            n3 = n;
        }
        if (n3 == 0) {
            n3 = Math.abs(n) > Math.abs(n2) ? n : n2;
        }
        return n3;
    }

    public void prepareForTraversal() {
        long l = 0L;
        for (int i = 0; i < 64; ++i) {
            long l2 = 0L;
            int n = i << 6;
            for (int j = 0; j < 64; ++j) {
                l2 |= this.tree[n + j] == 0L ? 0L : 1L << j;
            }
            this.treeReduced[i] = l2;
            l |= l2 == 0L ? 0L : 1L << i;
        }
        this.treeDoubleReduced = l;
    }

    public void traverse(CoordinateSectionVisitor coordinateSectionVisitor, Viewport viewport, float f, float f2) {
        this.visitor = coordinateSectionVisitor;
        this.viewport = viewport;
        this.distanceLimit = f;
        class01296 class012962 = viewport.getChunkCoord();
        this.cameraOffsetX = class012962.method_10263() - this.offsetX + 1;
        this.cameraOffsetY = class012962.method_10264() - this.offsetY + 1;
        this.cameraOffsetZ = class012962.method_10260() - this.offsetZ + 1;
        int n = this.distanceLimit >= f2 ? 2 : 0;
        this.traverse(this.getChildOrderModulator(0, 0, 0, 32), 0, 5, n);
        this.visitor = null;
        this.viewport = null;
    }

    void traverse(int n, int n2, int n3, int n4) {
        int n5 = 1 << n3 + 3;
        if ((n3 & 1) == 1) {
            n <<= 3;
        }
        if (n3 <= 1) {
            int n6 = n2 & 0x3FFC0;
            long l = this.tree[n2 >> 6];
            if (n3 == 0) {
                int n7 = n2 & 0x3F;
                int n8 = n7 + 8;
                for (int i = n7; i < n8; ++i) {
                    int n9 = i ^ n;
                    if ((l & 1L << n9) == 0L) continue;
                    int n10 = n6 | n9;
                    int n11 = TraversableTree.deinterleave6(n10) + this.offsetX;
                    int n12 = TraversableTree.deinterleave6(n10 >> 1) + this.offsetY;
                    int n13 = TraversableTree.deinterleave6(n10 >> 2) + this.offsetZ;
                    if (n4 != 3 && !this.testLeafNode(n11, n12, n13, n4)) continue;
                    this.visitor.visit(n11, n12, n13);
                }
            } else {
                for (int i = 0; i < 64; i += 8) {
                    int n14 = i ^ n;
                    if ((l & 255L << n14) == 0L) continue;
                    this.testChild(n6 | n14, n5, n3, n4);
                }
            }
        } else if (n3 <= 3) {
            int n15 = n2 & 0x3F000;
            long l = this.treeReduced[n2 >> 12];
            if (n3 == 2) {
                int n16 = n2 >> 6 & 0x3F;
                int n17 = n16 + 8;
                for (int i = n16; i < n17; ++i) {
                    int n18 = i ^ n;
                    if ((l & 1L << n18) == 0L) continue;
                    this.testChild(n15 | n18 << 6, n5, n3, n4);
                }
            } else {
                for (int i = 0; i < 64; i += 8) {
                    int n19 = i ^ n;
                    if ((l & 255L << n19) == 0L) continue;
                    this.testChild(n15 | n19 << 6, n5, n3, n4);
                }
            }
        } else if (n3 == 4) {
            int n20 = n2 >> 12;
            int n21 = n20 + 8;
            for (int i = n20; i < n21; ++i) {
                int n22 = i ^ n;
                if ((this.treeDoubleReduced & 1L << n22) == 0L) continue;
                this.testChild(n22 << 12, n5, n3, n4);
            }
        } else {
            for (int i = 0; i < 64; i += 8) {
                int n23 = i ^ n;
                if ((this.treeDoubleReduced & 255L << n23) == 0L) continue;
                this.testChild(n23 << 12, n5, n3, n4);
            }
        }
    }

    int getChildOrderModulator(int n, int n2, int n3, int n4) {
        return n + n4 - this.cameraOffsetX >>> 31 | n2 + n4 - this.cameraOffsetY >>> 31 << 1 | n3 + n4 - this.cameraOffsetZ >>> 31 << 2;
    }

    static boolean cylindricalDistanceTest(float f, float f2, float f3, float f4) {
        return f * f + f3 * f3 < f4 * f4 && Math.abs(f2) < f4;
    }

    void testChild(int n, int n2, int n3, int n4) {
        float f;
        float f2;
        float f3;
        int n5;
        int n6 = TraversableTree.deinterleave6(n);
        int n7 = TraversableTree.deinterleave6(n >> 1);
        int n8 = TraversableTree.deinterleave6(n >> 2);
        if (n4 == 3) {
            this.traverse(this.getChildOrderModulator(n6, n7, n8, 1 << --n3), n, n3, n4);
            return;
        }
        CameraTransform cameraTransform = this.viewport.getTransform();
        int n9 = (n6 + this.offsetX << 4) - cameraTransform.intX;
        int n10 = (n7 + this.offsetY << 4) - cameraTransform.intY;
        int n11 = (n8 + this.offsetZ << 4) - cameraTransform.intZ;
        boolean bl = true;
        if ((n4 & 1) == 0) {
            n5 = this.viewport.getBoxIntersectionDirect((float)(n9 + n2) - cameraTransform.fracX, (float)(n10 + n2) - cameraTransform.fracY, (float)(n11 + n2) - cameraTransform.fracZ, (float)n2 + 1.125f);
            if (n5 == -2) {
                n4 |= 1;
            } else {
                boolean bl2 = bl = n5 == -1;
            }
        }
        if ((n4 & 2) == 0 && (bl = TraversableTree.cylindricalDistanceTest(f3 = (float)TraversableTree.nearestToZero(n9, n9 + (n5 = n2 << 1)) - cameraTransform.fracX, f2 = (float)TraversableTree.nearestToZero(n10, n10 + n5) - cameraTransform.fracY, f = (float)TraversableTree.nearestToZero(n11, n11 + n5) - cameraTransform.fracZ, this.distanceLimit)) && TraversableTree.cylindricalDistanceTest(f3 = (float)TraversableTree.farthestFromZero(n9, n9 + n5) - cameraTransform.fracX, f2 = (float)TraversableTree.farthestFromZero(n10, n10 + n5) - cameraTransform.fracY, f = (float)TraversableTree.farthestFromZero(n11, n11 + n5) - cameraTransform.fracZ, this.distanceLimit)) {
            n4 |= 2;
        }
        if (bl) {
            this.traverse(this.getChildOrderModulator(n6, n7, n8, 1 << --n3), n, n3, n4);
        }
    }
}

