package org.zenith.event;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.PricedItem;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.HeldItemWatcher;

import com.darkmagician6.eventapi.events.callables.EventCancellable;
import net.minecraft.screen.slot.SlotActionType;

public class EventClickSlotHook extends EventCancellable {
   public final int a;
   public final int b;
   public final int c;
   public final SlotActionType action;

   public EventClickSlotHook(int var1, int var2, int var3, SlotActionType var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.action = var4;
   }

   public int PricedItem() {
      return this.a;
   }

   public SlotActionType HeldItemWatcher() {
      return this.action;
   }
}
