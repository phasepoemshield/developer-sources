package org.zenith.core;

import org.zenith.event.CloseScreenEvent;
import org.zenith.event.Event18;
import org.zenith.event.SprintStateEvent;
import org.zenith.utility.render.display.base.GradientRadius;

import org.zenith.ZenithClient;
import org.zenith.util.ArgbColor;

import org.zenith.event.EventGetFogColorHook;
import org.zenith.event.EventPosHook;
import org.zenith.event.VelocityChangeEvent;


public class ColorAnimator {
   public final UiAnimation EventPosHook;
   public float EventGetFogColorHook;

   public ColorAnimator(long var1) {
      this.EventPosHook = new UiAnimation(var1, Easing.CloseScreenEvent);
   }

   public void update() {
      this.EventPosHook.on23(1.0F);
      this.EventGetFogColorHook = this.EventPosHook.Event18() * 360.0F;
      if (this.EventGetFogColorHook >= 360.0F) {
         this.EventGetFogColorHook = 0.0F;
         this.EventPosHook.reset();
      }
   }

   public org.zenith.utility.render.display.base.GradientRadius VelocityChangeEvent() {
      ArgbColor i11ii1llliilllii1i1 = ZenithClient.on23().TextScanner().getCurrentStyle().getPrimaryColor().getColor();
      return this.on23(i11ii1llliilllii1i1);
   }

   public org.zenith.utility.render.display.base.GradientRadius on23(ArgbColor var1) {
      return this.on23(var1, var1.SprintStateEvent(0.4F));
   }

   public org.zenith.utility.render.display.base.GradientRadius on23(ArgbColor var1, ArgbColor var2) {
      float f = (float)((Math.sin(Math.toRadians((double)this.EventGetFogColorHook)) + 1.0) / 2.0);
      float f1 = (float)((Math.sin(Math.toRadians((double)(this.EventGetFogColorHook + 90.0F))) + 1.0) / 2.0);
      float f2 = (float)((Math.sin(Math.toRadians((double)(this.EventGetFogColorHook + 180.0F))) + 1.0) / 2.0);
      float f3 = (float)((Math.sin(Math.toRadians((double)(this.EventGetFogColorHook + 270.0F))) + 1.0) / 2.0);
      ArgbColor i11ii1llliilllii1i1 = var1.Easing(var2, f);
      ArgbColor i11ii1llliilllii1i11 = var1.Easing(var2, f1);
      ArgbColor i11ii1llliilllii1i12 = var1.Easing(var2, f2);
      ArgbColor i11ii1llliilllii1i13 = var1.Easing(var2, f3);
      return org.zenith.utility.render.display.base.GradientRadius.on23(
         i11ii1llliilllii1i1, i11ii1llliilllii1i13, i11ii1llliilllii1i11, i11ii1llliilllii1i12
      );
   }
}
