/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.indigo.renderer.render.MeshItemCommand
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.accessor;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.MeshItemCommand;

@Environment(value=EnvType.CLIENT)
public interface AccessBatchingRenderCommandQueue {
    public List<MeshItemCommand> fabric_getMeshItemCommands();
}

