/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext
 *  net.caffeinemc.mods.sodium.client.util.task.CancellationToken
 *  org.joml.Vector3dc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks;

import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.JobDurationEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshTaskSizeEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UploadDurationEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos;
import net.caffeinemc.mods.sodium.client.util.task.CancellationToken;
import org.joml.Vector3dc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public abstract class ChunkBuilderTask<OUTPUT extends BuilderTaskOutput>
implements CombinedCameraPos {
    protected final RenderSection render;
    protected final int submitTime;
    protected final Vector3dc absoluteCameraPos;
    protected final Vector3fc cameraPos;
    private long estimatedSize;
    private long estimatedDuration;
    private long estimatedUploadDuration;

    public ChunkBuilderTask(RenderSection renderSection, int n, Vector3dc vector3dc) {
        this.render = renderSection;
        this.submitTime = n;
        this.absoluteCameraPos = vector3dc;
        this.cameraPos = new Vector3f((float)(vector3dc.x() - (double)renderSection.getOriginX()), (float)(vector3dc.y() - (double)renderSection.getOriginY()), (float)(vector3dc.z() - (double)renderSection.getOriginZ()));
    }

    public abstract OUTPUT execute(ChunkBuildContext var1, CancellationToken var2);

    public long getEstimatedSize() {
        return this.estimatedSize;
    }

    public long getEstimatedUploadDuration() {
        return this.estimatedUploadDuration;
    }

    public void calculateEstimations(JobDurationEstimator jobDurationEstimator, MeshTaskSizeEstimator meshTaskSizeEstimator, UploadDurationEstimator uploadDurationEstimator) {
        this.estimatedSize = this.estimateTaskSizeWith(meshTaskSizeEstimator);
        this.estimatedDuration = jobDurationEstimator.estimateJobDuration(this.getClass(), this.estimatedSize);
        this.estimatedUploadDuration = uploadDurationEstimator.estimateUploadDuration(this.estimatedSize);
    }

    public long getEstimatedDuration() {
        return this.estimatedDuration;
    }

    @Override
    public Vector3dc getAbsoluteCameraPos() {
        return this.absoluteCameraPos;
    }

    @Override
    public Vector3fc getRelativeCameraPos() {
        return this.cameraPos;
    }

    public abstract long estimateTaskSizeWith(MeshTaskSizeEstimator var1);
}

