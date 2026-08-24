package org.zenith.module;

import org.zenith.core.UiAnimation;
import org.zenith.event.RefreshCacheEvent;
import org.zenith.ZenithClient;

import org.zenith.core.ColorAnimator;
import org.zenith.core.Easing;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.StyledTextBuilder;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

final class RotationRecorder_Var159 {
   public final RotationRecorder val135;
   public final List<RotationRecorder_Var165> list43;
   public final long long92;

   public RotationRecorder_Var159(RotationRecorder var1) {
      this.val135 = var1;
      this.list43 = new ArrayList<>();
      this.long92 = Math.max(1L, Instant.now().toEpochMilli());
   }

   public void Easing(RotationRecorder_Var165 var1) {
      if (this.ColorAnimator(var1)) {
         this.list43.add(var1);
      } else {
         this.flush();
         this.val135.botClient3();
      }
   }

   public boolean ColorAnimator(RotationRecorder_Var165 var1) {
      return var1 != null && var1.isValid();
   }

   public void flush() {
      int i = this.list43.size();
      if (i <= 0) {
         this.list43.clear();
         this.val135.rotationRecorderVar159 = null;
      } else {
         for (int j = 0; j < i; j++) {
            this.val135.on23(this.long92, this.list43.get(j));
         }

         StyledTextBuilder.RefreshCacheEvent("RotationRecorder: wrote " + i);
         this.list43.clear();
         this.val135.rotationRecorderVar159 = null;
      }
   }

   public void float215() {
      int i = -1;

      for (int j = this.list43.size() - 1; j >= 0; j--) {
         if (this.val135.UiAnimation(this.list43.get(j))) {
            i = j;
            break;
         }
      }

      int l = i >= 0 ? i + 1 : 0;
      if (l < this.list43.size()) {
         int k = this.list43.size() - l;
         this.list43.subList(l, this.list43.size()).clear();
         StyledTextBuilder.RefreshCacheEvent("RotationRecorder: dropped interrupted tail " + k);
      }
   }
}
