package org.zenith.base.bot.view;

import org.zenith.module.Bot;




import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.BufferAllocator;

record BotSectionMesher_LayerMesh(RenderLayer layer, BuiltBuffer buffer, BufferAllocator allocator) {
}
