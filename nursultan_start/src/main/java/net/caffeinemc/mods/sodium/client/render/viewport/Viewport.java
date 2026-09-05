/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class07209
 *  org.joml.Vector3d
 */
package net.caffeinemc.mods.sodium.client.render.viewport;

import minecraft.class01296;
import minecraft.class07209;
import net.caffeinemc.mods.sodium.client.render.viewport.CameraTransform;
import net.caffeinemc.mods.sodium.client.render.viewport.frustum.Frustum;
import org.joml.Vector3d;

public final class Viewport {
    public static final float CHUNK_SECTION_RADIUS = 8.0f;
    public static final float CHUNK_SECTION_MARGIN = 1.125f;
    public static final float CHUNK_SECTION_NEARBY_MARGIN = 2.125f;
    public static final float CHUNK_SECTION_PADDED_RADIUS = 9.125f;
    private static final float LOOSER_MARGIN_EXTRA = 1.0f;
    private final Frustum frustum;
    private final CameraTransform transform;
    private final class01296 sectionCoords;
    private final class07209 blockCoords;

    public Viewport(Frustum frustum, Vector3d vector3d) {
        this.frustum = frustum;
        this.transform = new CameraTransform(vector3d.x, vector3d.y, vector3d.z);
        this.sectionCoords = class01296.N((int)class01296.N((double)vector3d.x), (int)class01296.N((double)vector3d.y), (int)class01296.N((double)vector3d.z));
        this.blockCoords = class07209.method_49637((double)vector3d.x, (double)vector3d.y, (double)vector3d.z);
    }

    public CameraTransform getTransform() {
        return this.transform;
    }

    public boolean isBoxVisible(int n, int n2, int n3) {
        float f = (float)(n - this.transform.intX) - this.transform.fracX;
        float f2 = (float)(n2 - this.transform.intY) - this.transform.fracY;
        float f3 = (float)(n3 - this.transform.intZ) - this.transform.fracZ;
        return this.frustum.testSection(f, f2, f3);
    }

    public class01296 getChunkCoord() {
        return this.sectionCoords;
    }

    public boolean isBoxVisibleLooser(int n, int n2, int n3) {
        float f = (float)(n - this.transform.intX) - this.transform.fracX;
        float f2 = (float)(n2 - this.transform.intY) - this.transform.fracY;
        float f3 = (float)(n3 - this.transform.intZ) - this.transform.fracZ;
        return this.frustum.testSectionExpanded(f, f2, f3, 1.0f);
    }

    public boolean isBoxVisibleDirect(float f, float f2, float f3, float f4) {
        return this.frustum.testAab(f - f4, f2 - f4, f3 - f4, f + f4, f2 + f4, f3 + f4);
    }

    public class07209 getBlockCoord() {
        return this.blockCoords;
    }

    public int getBoxIntersectionDirect(float f, float f2, float f3, float f4) {
        return this.frustum.intersectAab(f - f4, f2 - f4, f3 - f4, f + f4, f2 + f4, f3 + f4);
    }
}

