package org.zenith.core;

import org.zenith.event.Event20;
import org.zenith.event.EventTick;
import org.zenith.event.EventTickEnd;

public abstract class EaseBase implements Easing {
   public static final float EventTick = 1.70158F;
   public float EventTickEnd;

   public EaseBase() {
      this(1.70158F);
   }

   public EaseBase(float var1) {
      this.EventTickEnd = var1;
   }

   public void ItemSpec(float var1) {
      this.EventTickEnd = var1;
   }

   public float Event20() {
      return this.EventTickEnd;
   }
}
