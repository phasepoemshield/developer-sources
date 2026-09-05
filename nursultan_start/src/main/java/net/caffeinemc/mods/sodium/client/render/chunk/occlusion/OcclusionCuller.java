/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceMap
 *  minecraft.class01296
 *  minecraft.class04995
 *  minecraft.class07299
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 *  net.caffeinemc.mods.sodium.client.render.viewport.CameraTransform
 *  net.caffeinemc.mods.sodium.client.render.viewport.Viewport
 *  net.caffeinemc.mods.sodium.client.util.collections.DoubleBufferedQueue
 *  net.caffeinemc.mods.sodium.client.util.collections.ReadQueue
 *  net.caffeinemc.mods.sodium.client.util.collections.WriteQueue
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.render.chunk.occlusion;

import it.unimi.dsi.fastutil.longs.Long2ReferenceMap;
import minecraft.class01296;
import minecraft.class04995;
import minecraft.class07299;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.RenderSectionVisitor;
import net.caffeinemc.mods.sodium.client.render.chunk.occlusion.GraphDirectionSet;
import net.caffeinemc.mods.sodium.client.render.chunk.occlusion.VisibilityEncoding;
import net.caffeinemc.mods.sodium.client.render.viewport.CameraTransform;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;
import net.caffeinemc.mods.sodium.client.util.collections.DoubleBufferedQueue;
import net.caffeinemc.mods.sodium.client.util.collections.ReadQueue;
import net.caffeinemc.mods.sodium.client.util.collections.WriteQueue;
import org.jspecify.annotations.NonNull;

public class OcclusionCuller {
    private final Long2ReferenceMap<RenderSection> sections;
    private final class07299 level;
    private final DoubleBufferedQueue<RenderSection> queue = new DoubleBufferedQueue();
    private int outOfWorldRadius;
    private int outOfWorldHeight;
    private int outOfWorldDirection;
    private static final long UP_DOWN_OCCLUDED = 1L << VisibilityEncoding.bit(0, 1) | 1L << VisibilityEncoding.bit(1, 0);
    private static final long NORTH_SOUTH_OCCLUDED = 1L << VisibilityEncoding.bit(2, 3) | 1L << VisibilityEncoding.bit(3, 2);
    private static final long WEST_EAST_OCCLUDED = 1L << VisibilityEncoding.bit(4, 5) | 1L << VisibilityEncoding.bit(5, 4);

    public OcclusionCuller(Long2ReferenceMap<RenderSection> long2ReferenceMap, class07299 class072992) {
        this.sections = long2ReferenceMap;
        this.level = class072992;
    }

    private void init(RenderSectionVisitor renderSectionVisitor, WriteQueue<RenderSection> writeQueue, Viewport viewport, boolean bl, int n) {
        class01296 class012962 = viewport.getChunkCoord();
        if (class012962.method_10264() < this.level.method_32891()) {
            this.outOfWorldRadius = 0;
            this.outOfWorldHeight = this.level.method_32891();
            this.outOfWorldDirection = 0;
        } else if (class012962.method_10264() > this.level.method_31597()) {
            this.outOfWorldRadius = 0;
            this.outOfWorldHeight = this.level.method_31597();
            this.outOfWorldDirection = 1;
        } else {
            this.outOfWorldRadius = -1;
            this.initWithinWorld(renderSectionVisitor, writeQueue, viewport, bl, n);
        }
    }

    public static boolean isWithinNearbySectionFrustum(Viewport viewport, RenderSection renderSection) {
        return viewport.isBoxVisibleLooser(renderSection.getCenterX(), renderSection.getCenterY(), renderSection.getCenterZ());
    }

    private static boolean isSectionVisible(RenderSection renderSection, Viewport viewport, float f) {
        return OcclusionCuller.isWithinRenderDistance(viewport.getTransform(), renderSection, f) && OcclusionCuller.isWithinFrustum(viewport, renderSection);
    }

    private RenderSection getRenderSection(int n, int n2, int n3) {
        return (RenderSection)this.sections.get(class01296.y((int)n, (int)n2, (int)n3));
    }

    public void findVisible(RenderSectionVisitor renderSectionVisitor, Viewport viewport, float f, boolean bl, int n) {
        DoubleBufferedQueue<RenderSection> doubleBufferedQueue = this.queue;
        doubleBufferedQueue.reset();
        WriteQueue writeQueue = this.queue.write();
        this.init(renderSectionVisitor, (WriteQueue<RenderSection>)writeQueue, viewport, bl, n);
        if (this.outOfWorldRadius == 0) {
            while (writeQueue.isEmpty() && this.initOutsideWorldHeight((WriteQueue<RenderSection>)writeQueue, viewport, f, n)) {
                ++this.outOfWorldRadius;
            }
        }
        while (doubleBufferedQueue.flip()) {
            if (this.outOfWorldRadius > 0) {
                this.initOutsideWorldHeight((WriteQueue<RenderSection>)doubleBufferedQueue.write(), viewport, f, n);
                ++this.outOfWorldRadius;
            }
            OcclusionCuller.processQueue(renderSectionVisitor, viewport, f, bl, n, (ReadQueue<RenderSection>)doubleBufferedQueue.read(), (WriteQueue<RenderSection>)doubleBufferedQueue.write());
        }
        this.addNearbySections(renderSectionVisitor, viewport, n);
    }

    private void tryVisitNode(WriteQueue<RenderSection> writeQueue, int n, int n2, int n3, int n4, int n5, Viewport viewport) {
        RenderSection renderSection = this.getRenderSection(n, n2, n3);
        if (renderSection == null || !OcclusionCuller.isWithinFrustum(viewport, renderSection)) {
            return;
        }
        OcclusionCuller.visitNode(writeQueue, renderSection, GraphDirectionSet.of(n4), n5);
    }

    private static void visitNeighbors(WriteQueue<RenderSection> writeQueue, RenderSection renderSection, int n, int n2) {
        if ((n &= renderSection.getAdjacentMask()) == 0) {
            return;
        }
        writeQueue.ensureCapacity(6);
        if (GraphDirectionSet.contains(n, 0)) {
            OcclusionCuller.visitNode(writeQueue, renderSection.adjacentDown, GraphDirectionSet.of(1), n2);
        }
        if (GraphDirectionSet.contains(n, 1)) {
            OcclusionCuller.visitNode(writeQueue, renderSection.adjacentUp, GraphDirectionSet.of(0), n2);
        }
        if (GraphDirectionSet.contains(n, 2)) {
            OcclusionCuller.visitNode(writeQueue, renderSection.adjacentNorth, GraphDirectionSet.of(3), n2);
        }
        if (GraphDirectionSet.contains(n, 3)) {
            OcclusionCuller.visitNode(writeQueue, renderSection.adjacentSouth, GraphDirectionSet.of(2), n2);
        }
        if (GraphDirectionSet.contains(n, 4)) {
            OcclusionCuller.visitNode(writeQueue, renderSection.adjacentWest, GraphDirectionSet.of(5), n2);
        }
        if (GraphDirectionSet.contains(n, 5)) {
            OcclusionCuller.visitNode(writeQueue, renderSection.adjacentEast, GraphDirectionSet.of(4), n2);
        }
    }

    private void initWithinWorld(RenderSectionVisitor renderSectionVisitor, WriteQueue<RenderSection> writeQueue, Viewport viewport, boolean bl, int n) {
        class01296 class012962 = viewport.getChunkCoord();
        RenderSection renderSection = this.getRenderSection(class012962.method_10263(), class012962.method_10264(), class012962.method_10260());
        if (renderSection == null) {
            return;
        }
        renderSection.setLastVisibleFrame(n);
        renderSection.setIncomingDirections(0);
        renderSectionVisitor.visit(renderSection);
        int n2 = bl ? VisibilityEncoding.getConnections(renderSection.getVisibilityData()) : 63;
        OcclusionCuller.visitNeighbors(writeQueue, renderSection, n2, n);
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

    private void addNearbySections(RenderSectionVisitor renderSectionVisitor, Viewport viewport, int n) {
        class01296 class012962 = viewport.getChunkCoord();
        int n2 = class012962.method_10263();
        int n3 = class012962.method_10264();
        int n4 = class012962.method_10260();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    RenderSection renderSection;
                    if (i == 0 && j == 0 && k == 0 || (renderSection = this.getRenderSection(n2 + i, n3 + j, n4 + k)) == null || renderSection.getLastVisibleFrame() == n || !OcclusionCuller.isWithinNearbySectionFrustum(viewport, renderSection)) continue;
                    renderSection.setLastVisibleFrame(n);
                    renderSectionVisitor.visit(renderSection);
                }
            }
        }
    }

    public static boolean isWithinFrustum(Viewport viewport, RenderSection renderSection) {
        return viewport.isBoxVisible(renderSection.getCenterX(), renderSection.getCenterY(), renderSection.getCenterZ());
    }

    private static void visitNode(WriteQueue<RenderSection> writeQueue, @NonNull RenderSection renderSection, int n, int n2) {
        if (renderSection.getLastVisibleFrame() != n2) {
            renderSection.setLastVisibleFrame(n2);
            renderSection.setIncomingDirections(0);
            writeQueue.enqueue((Object)renderSection);
        }
        renderSection.addIncomingDirections(n);
    }

    private static void processQueue(RenderSectionVisitor renderSectionVisitor, Viewport viewport, float f, boolean bl, int n, ReadQueue<RenderSection> readQueue, WriteQueue<RenderSection> writeQueue) {
        RenderSection renderSection;
        while ((renderSection = (RenderSection)readQueue.dequeue()) != null) {
            if (!OcclusionCuller.isSectionVisible(renderSection, viewport, f)) continue;
            renderSectionVisitor.visit(renderSection);
            if (bl) {
                long l = renderSection.getVisibilityData();
                var8_8 = VisibilityEncoding.getConnections(l &= OcclusionCuller.getAngleVisibilityMask(viewport, renderSection), renderSection.getIncomingDirections());
            } else {
                var8_8 = 63;
            }
            OcclusionCuller.visitNeighbors(writeQueue, renderSection, var8_8 &= OcclusionCuller.getOutwardDirections(viewport.getChunkCoord(), renderSection), n);
        }
    }

    private static boolean isWithinRenderDistance(CameraTransform cameraTransform, RenderSection renderSection, float f) {
        int n = renderSection.getOriginX() - cameraTransform.intX;
        int n2 = renderSection.getOriginY() - cameraTransform.intY;
        int n3 = renderSection.getOriginZ() - cameraTransform.intZ;
        float f2 = (float)OcclusionCuller.nearestToZero(n - 1, n + 17) - cameraTransform.fracX;
        float f3 = (float)OcclusionCuller.nearestToZero(n2 - 1, n2 + 17) - cameraTransform.fracY;
        float f4 = (float)OcclusionCuller.nearestToZero(n3 - 1, n3 + 17) - cameraTransform.fracZ;
        return f2 * f2 + f4 * f4 < f * f && Math.abs(f3) < f;
    }

    private static int getOutwardDirections(class01296 class012962, RenderSection renderSection) {
        int n = 0;
        n |= renderSection.getChunkX() <= class012962.method_10263() ? 16 : 0;
        n |= renderSection.getChunkX() >= class012962.method_10263() ? 32 : 0;
        n |= renderSection.getChunkY() <= class012962.method_10264() ? 1 : 0;
        n |= renderSection.getChunkY() >= class012962.method_10264() ? 2 : 0;
        n |= renderSection.getChunkZ() <= class012962.method_10260() ? 4 : 0;
        return n |= renderSection.getChunkZ() >= class012962.method_10260() ? 8 : 0;
    }

    private boolean initOutsideWorldHeight(WriteQueue<RenderSection> writeQueue, Viewport viewport, float f, int n) {
        class01296 class012962 = viewport.getChunkCoord();
        int n2 = class04995.y((float)(f / 16.0f));
        int n3 = this.outOfWorldHeight;
        int n4 = this.outOfWorldDirection;
        int n5 = this.outOfWorldRadius;
        if (n5 == 0) {
            this.tryVisitNode(writeQueue, class012962.method_10263(), n3, class012962.method_10260(), n4, n, viewport);
        } else if (n5 <= n2) {
            int n6;
            int n7;
            for (n7 = -n5; n7 < n5; ++n7) {
                n6 = Math.abs(n7) - n5;
                this.tryVisitNode(writeQueue, class012962.method_10263() + n6, n3, class012962.method_10260() + n7, n4, n, viewport);
            }
            for (n7 = n5; n7 > -n5; --n7) {
                n6 = n5 - Math.abs(n7);
                this.tryVisitNode(writeQueue, class012962.method_10263() + n6, n3, class012962.method_10260() + n7, n4, n, viewport);
            }
        } else if (n5 <= 2 * n2) {
            int n8;
            int n9;
            int n10 = n5 - n2;
            for (n9 = -n2; n9 <= -n10; ++n9) {
                n8 = -n9 - n5;
                this.tryVisitNode(writeQueue, class012962.method_10263() + n8, n3, class012962.method_10260() + n9, n4, n, viewport);
            }
            for (n9 = n10; n9 <= n2; ++n9) {
                n8 = n9 - n5;
                this.tryVisitNode(writeQueue, class012962.method_10263() + n8, n3, class012962.method_10260() + n9, n4, n, viewport);
            }
            for (n9 = n2; n9 >= n10; --n9) {
                n8 = n5 - n9;
                this.tryVisitNode(writeQueue, class012962.method_10263() + n8, n3, class012962.method_10260() + n9, n4, n, viewport);
            }
            for (n9 = -n10; n9 >= -n2; --n9) {
                n8 = n5 + n9;
                this.tryVisitNode(writeQueue, class012962.method_10263() + n8, n3, class012962.method_10260() + n9, n4, n, viewport);
            }
        } else {
            return false;
        }
        return true;
    }

    private static long getAngleVisibilityMask(Viewport viewport, RenderSection renderSection) {
        CameraTransform cameraTransform = viewport.getTransform();
        double d = Math.abs(cameraTransform.x - (double)renderSection.getCenterX());
        double d2 = Math.abs(cameraTransform.y - (double)renderSection.getCenterY());
        double d3 = Math.abs(cameraTransform.z - (double)renderSection.getCenterZ());
        long l = 0L;
        if (d > d2 || d3 > d2) {
            l |= UP_DOWN_OCCLUDED;
        }
        if (d > d3 || d2 > d3) {
            l |= NORTH_SOUTH_OCCLUDED;
        }
        if (d2 > d || d3 > d) {
            l |= WEST_EAST_OCCLUDED;
        }
        return l ^ 0xFFFFFFFFFFFFFFFFL;
    }
}

