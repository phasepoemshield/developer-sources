/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext
 *  net.caffeinemc.mods.sodium.client.util.task.CancellationToken
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.executor;

import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext;
import net.caffeinemc.mods.sodium.client.util.task.CancellationToken;

public interface ChunkJob
extends CancellationToken {
    public boolean isBlocking();

    public boolean isStarted();

    public void execute(ChunkBuildContext var1);

    public long getEstimatedSize();

    public long getEstimatedUploadDuration();

    public long getEstimatedDuration();
}

