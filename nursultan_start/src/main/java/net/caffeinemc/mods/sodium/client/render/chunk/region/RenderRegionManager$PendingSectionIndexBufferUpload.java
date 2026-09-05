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

final class RenderRegionManager$PendingSectionIndexBufferUpload
extends Record {
    final RenderSection section;
    final PendingUpload indexBufferUpload;

    RenderRegionManager$PendingSectionIndexBufferUpload(RenderSection renderSection, PendingUpload pendingUpload) {
        this.section = renderSection;
        this.indexBufferUpload = pendingUpload;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderRegionManager$PendingSectionIndexBufferUpload.class, "section;indexBufferUpload", "section", "indexBufferUpload"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderRegionManager$PendingSectionIndexBufferUpload.class, "section;indexBufferUpload", "section", "indexBufferUpload"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderRegionManager$PendingSectionIndexBufferUpload.class, "section;indexBufferUpload", "section", "indexBufferUpload"}, this);
    }

    public RenderSection section() {
        return this.section;
    }

    public PendingUpload indexBufferUpload() {
        return this.indexBufferUpload;
    }
}

