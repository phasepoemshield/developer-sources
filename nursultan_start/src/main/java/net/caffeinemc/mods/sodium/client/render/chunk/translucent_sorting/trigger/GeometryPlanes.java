/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger;

import it.unimi.dsi.fastutil.objects.Object2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Collection;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.NormalList;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.NormalPlanes;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class GeometryPlanes {
    private NormalPlanes[] alignedPlanes;
    private Object2ReferenceMap<Vector3fc, NormalPlanes> unalignedPlanes;
    private final Vector3f unalignedNormalScratch = new Vector3f();

    public void addDoubleSidedUnalignedPlane(class01296 class012962, Vector3fc vector3fc, float f) {
        this.addUnalignedPlane(class012962, vector3fc, f);
        this.addUnalignedPlane(class012962, (Vector3fc)vector3fc.negate(new Vector3f()), -f);
    }

    NormalPlanes getPlanesForNormal(NormalList normalList) {
        Vector3fc vector3fc = normalList.getNormal();
        if (normalList.isAligned()) {
            if (this.alignedPlanes == null) {
                return null;
            }
            return this.alignedPlanes[normalList.getAlignedDirection()];
        }
        if (this.unalignedPlanes == null) {
            return null;
        }
        return (NormalPlanes)this.unalignedPlanes.get((Object)vector3fc);
    }

    private Vector3f cleanNormal(Vector3fc vector3fc) {
        Vector3f vector3f = this.unalignedNormalScratch.set(vector3fc);
        if (vector3f.x == 0.0f) {
            vector3f.x = 0.0f;
        }
        if (vector3f.y == 0.0f) {
            vector3f.y = 0.0f;
        }
        if (vector3f.z == 0.0f) {
            vector3f.z = 0.0f;
        }
        return vector3f;
    }

    public NormalPlanes[] getAlignedOrCreate() {
        if (this.alignedPlanes == null) {
            this.alignedPlanes = new NormalPlanes[ModelQuadFacing.DIRECTIONS];
        }
        return this.alignedPlanes;
    }

    public Collection<NormalPlanes> getUnaligned() {
        if (this.unalignedPlanes == null) {
            return null;
        }
        return this.unalignedPlanes.values();
    }

    private void prepareAndInsert(Object2ReferenceMap<Vector3fc, float[]> object2ReferenceMap) {
        if (this.alignedPlanes != null) {
            for (ObjectIterator objectIterator : this.alignedPlanes) {
                if (objectIterator == null) continue;
                objectIterator.prepareAndInsert(object2ReferenceMap);
            }
        }
        if (this.unalignedPlanes != null) {
            for (NormalPlanes normalPlanes : this.unalignedPlanes.values()) {
                normalPlanes.prepareAndInsert(object2ReferenceMap);
            }
        }
    }

    public void addAlignedPlane(class01296 class012962, int n, float f) {
        NormalPlanes[] normalPlanesArray = this.getAlignedOrCreate();
        NormalPlanes normalPlanes = normalPlanesArray[n];
        if (normalPlanes == null) {
            normalPlanesArray[n] = normalPlanes = new NormalPlanes(class012962, n);
        }
        normalPlanes.addPlaneMember(f);
    }

    public static GeometryPlanes fromQuadLists(class01296 class012962, TQuad[] tQuadArray) {
        GeometryPlanes geometryPlanes = new GeometryPlanes();
        for (TQuad tQuad : tQuadArray) {
            geometryPlanes.addQuadPlane(class012962, tQuad);
        }
        return geometryPlanes;
    }

    public void addUnalignedPlane(class01296 class012962, Vector3fc vector3fc, float f) {
        Vector3f vector3f;
        Object2ReferenceMap<Vector3fc, NormalPlanes> object2ReferenceMap = this.getUnalignedOrCreate();
        NormalPlanes normalPlanes = (NormalPlanes)object2ReferenceMap.get((Object)(vector3f = this.cleanNormal(vector3fc)));
        if (normalPlanes == null) {
            normalPlanes = new NormalPlanes(class012962, (Vector3fc)new Vector3f((Vector3fc)vector3f));
            object2ReferenceMap.put((Object)normalPlanes.normal, (Object)normalPlanes);
        }
        normalPlanes.addPlaneMember(f);
    }

    public void prepareIntegration() {
        this.prepareAndInsert(null);
    }

    public void addQuadPlane(class01296 class012962, TQuad tQuad) {
        ModelQuadFacing modelQuadFacing = tQuad.useQuantizedFacing();
        if (modelQuadFacing.isAligned()) {
            this.addAlignedPlane(class012962, modelQuadFacing.ordinal(), tQuad.getQuantizedDotProduct());
        } else {
            this.addUnalignedPlane(class012962, tQuad.getQuantizedNormal(), tQuad.getQuantizedDotProduct());
        }
    }

    public NormalPlanes[] getAligned() {
        return this.alignedPlanes;
    }

    public void addDoubleSidedAlignedPlane(class01296 class012962, int n, float f) {
        this.addAlignedPlane(class012962, n, f);
        this.addAlignedPlane(class012962, n + 3, -f);
    }

    public Object2ReferenceMap<Vector3fc, NormalPlanes> getUnalignedOrCreate() {
        if (this.unalignedPlanes == null) {
            this.unalignedPlanes = new Object2ReferenceOpenHashMap();
        }
        return this.unalignedPlanes;
    }

    public Object2ReferenceMap<Vector3fc, float[]> prepareAndGetDistances() {
        Object2ReferenceOpenHashMap object2ReferenceOpenHashMap = new Object2ReferenceOpenHashMap(10);
        this.prepareAndInsert((Object2ReferenceMap<Vector3fc, float[]>)object2ReferenceOpenHashMap);
        return object2ReferenceOpenHashMap;
    }
}

