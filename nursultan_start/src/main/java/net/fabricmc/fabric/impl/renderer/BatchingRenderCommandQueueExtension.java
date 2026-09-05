/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.renderer;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.renderer.ExtendedBlockCommand;
import net.fabricmc.fabric.impl.renderer.ExtendedBlockStateModelCommand;

@Environment(value=EnvType.CLIENT)
public interface BatchingRenderCommandQueueExtension {
    public List<ExtendedBlockCommand> fabric_getExtendedBlockCommands();

    public List<ExtendedBlockStateModelCommand> fabric_getExtendedBlockStateModelCommands();
}

