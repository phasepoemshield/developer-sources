package org.zenith.base.comand.impl;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.SlotRenderRule;













import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.network.ClientPlayerEntity;

final class SortCommand_SortTask {
   public final String name;
   public final ClientPlayerEntity player;
   public final List<SlotRenderRule> desiredItems;
   public final Set<Integer> fixedSlots = new HashSet<>();
   public int itemIndex;
   public int moved;
   public int missing;
   public int sentPackets;

   public SortCommand_SortTask(String var1, ClientPlayerEntity var2, List<SlotRenderRule> var3) {
      this.name = var1;
      this.player = var2;
      this.desiredItems = var3;
   }
}
