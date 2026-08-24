package org.zenith.base.bot.world;

import org.zenith.module.Bot;
import org.zenith.module.Module;

import org.zenith.module.Interface;

import org.zenith.module.Interface;
import org.zenith.core.BotFeatureRegistry;














import net.minecraft.network.listener.ServerPlayPacketListener;
import net.minecraft.network.packet.Packet;

@FunctionalInterface
public interface BotInteractionManager_SequencedPacketCreator {
   Packet<ServerPlayPacketListener> predict(int var1);
}
