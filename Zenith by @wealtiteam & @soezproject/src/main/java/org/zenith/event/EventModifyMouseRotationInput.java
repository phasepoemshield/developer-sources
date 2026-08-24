package org.zenith.event;

import org.zenith.core.ItemRegistry;
import org.zenith.core.ItemSpec;
import org.zenith.core.ColorAnimator;
import org.zenith.core.Easing;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.BlockPosEntry;
import org.zenith.core.ItemFilterRules;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClickFxController;
import org.zenith.core.IntPair;
import org.zenith.core.CraftingExecutor;

import com.darkmagician6.eventapi.events.callables.EventCancellable;

public class EventModifyMouseRotationInput extends EventCancellable {
   double call262;
   double call200;
   double call201;
   double call202;

   public double CraftingExecutor() {
      return this.call262;
   }

   public double BlockPosEntry() {
      return this.call200;
   }

   public double ItemFilterRules() {
      return this.call201;
   }

   public double IntPair() {
      return this.call202;
   }

   public void Easing(double var1) {
      this.call262 = var1;
   }

   public void ColorAnimator(double var1) {
      this.call200 = var1;
   }

   public void ItemRegistry(double var1) {
      this.call201 = var1;
   }

   public void ItemSpec(double var1) {
      this.call202 = var1;
   }

   public EventModifyMouseRotationInput(double var1, double var3, double var5, double var7) {
      this.call262 = var1;
      this.call200 = var3;
      this.call201 = var5;
      this.call202 = var7;
   }
}
