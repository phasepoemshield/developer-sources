/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.caffeinemc.mods.sodium.client.gl.arena.PendingUpload
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 */
package net.caffeinemc.mods.sodium.client.render.chunk.region;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.caffeinemc.mods.sodium.client.gl.arena.PendingUpload;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionMeshParts;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;

final class RenderRegionManager$PendingSectionMeshUpload
extends Record {
    final RenderSection section;
    final int relativeBuiltTime;
    final BuiltSectionMeshParts meshData;
    final TerrainRenderPass pass;
    final PendingUpload vertexUpload;

    RenderRegionManager$PendingSectionMeshUpload(RenderSection renderSection, int n, BuiltSectionMeshParts builtSectionMeshParts, TerrainRenderPass terrainRenderPass, PendingUpload pendingUpload) {
        this.section = renderSection;
        this.relativeBuiltTime = n;
        this.meshData = builtSectionMeshParts;
        this.pass = terrainRenderPass;
        this.vertexUpload = pendingUpload;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderRegionManager$PendingSectionMeshUpload.class, "section;relativeBuiltTime;meshData;pass;vertexUpload", "section", "relativeBuiltTime", "meshData", "pass", "vertexUpload"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderRegionManager$PendingSectionMeshUpload.class, "section;relativeBuiltTime;meshData;pass;vertexUpload", "section", "relativeBuiltTime", "meshData", "pass", "vertexUpload"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderRegionManager$PendingSectionMeshUpload.class, "section;relativeBuiltTime;meshData;pass;vertexUpload", "section", "relativeBuiltTime", "meshData", "pass", "vertexUpload"}, this);
    }

    public TerrainRenderPass pass() {
        return this.pass;
    }

    public RenderSection section() {
        return this.section;
    }

    public int relativeBuiltTime() {
        return this.relativeBuiltTime;
    }

    public PendingUpload vertexUpload() {
        return this.vertexUpload;
    }

    public BuiltSectionMeshParts meshData() {
        return this.meshData;
    }
}

