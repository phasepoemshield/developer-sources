package org.zenith.core;

import org.zenith.event.Event09;
import org.zenith.event.Event13;
import org.zenith.event.EventGetBasicProjectionMatrixHook;
import org.zenith.event.SprintEvent;


public abstract class EaseSineBase implements Easing {
   public float EventGetBasicProjectionMatrixHook;
   public float SprintEvent;

   public EaseSineBase(float var1, float var2) {
      this.EventGetBasicProjectionMatrixHook = var1;
      this.SprintEvent = var2;
   }

   public EaseSineBase() {
      this(-1.0F, 0.0F);
   }

   public void TextScanner(float var1) {
      this.EventGetBasicProjectionMatrixHook = var1;
   }

   public void NbtItemSpec(float var1) {
      this.SprintEvent = var1;
   }

   public float Event09() {
      return this.EventGetBasicProjectionMatrixHook;
   }

   public float Event13() {
      return this.SprintEvent;
   }
}
