package org.zenith.core;

import org.zenith.event.Event18;
import org.zenith.ZenithClient;

import org.zenith.event.ChatMessageEvent;
import org.zenith.event.Event01;
import org.zenith.event.Event08;
import org.zenith.event.Event19;
import org.zenith.event.Event49;
import org.zenith.event.EventGetBasicProjectionMatrixHook2;
import org.zenith.event.EventInjectPlaced;
import org.zenith.event.DataChangedEvent;


public class UiAnimation {
   public long duration;
   public float value;
   public Easing EventGetBasicProjectionMatrixHook2;
   public long startTime;
   public float DataChangedEvent;
   public float EventInjectPlaced;
   public boolean done;
   public boolean ChatMessageEvent;

   public UiAnimation(long var1, float var3, Easing var4) {
      this.duration = var1;
      this.EventGetBasicProjectionMatrixHook2 = var4;
      this.value = var3;
      this.DataChangedEvent = var3;
      this.EventInjectPlaced = var3;
      this.done = true;
   }

   public UiAnimation(long var1, Easing var3) {
      this(var1, 0.0F, var3);
   }

   public void on23(boolean var1) {
      this.on23(var1 ? 1.0F : 0.0F);
   }

   public float on23(float var1) {
      long i = System.currentTimeMillis();
      if (var1 != this.EventInjectPlaced) {
         this.DataChangedEvent = this.value;
         this.EventInjectPlaced = var1;
         this.startTime = i;
         this.done = false;
      }

      long j = i - this.startTime;
      if (j >= this.duration) {
         this.value = this.EventInjectPlaced;
         this.done = true;
         return this.value;
      } else {
         float f = (float)j / (float)this.duration;
         float f1 = this.EventGetBasicProjectionMatrixHook2.ease(f, 0.0F, 1.0F, 1.0F);
         this.value = this.DataChangedEvent + (this.EventInjectPlaced - this.DataChangedEvent) * f1;
         return this.value;
      }
   }

   public void setValue(float var1) {
      this.value = var1;
      this.DataChangedEvent = var1;
      this.EventInjectPlaced = var1;
      this.done = true;
   }

   public void UiAnimation(float var1) {
      this.value = var1;
      this.DataChangedEvent = var1;
      this.EventInjectPlaced = var1;
      this.done = true;
   }

   public void reset() {
      this.UiAnimation(0.0F);
   }

   public void Easing(float var1) {
      if (var1 != this.EventInjectPlaced) {
         this.DataChangedEvent = this.value;
         this.EventInjectPlaced = var1;
         this.startTime = System.currentTimeMillis();
         this.done = false;
      }
   }

   public float EmotePlayback() {
      return this.on23(this.EventInjectPlaced);
   }

   public long getDuration() {
      return this.duration;
   }

   public float Event18() {
      return this.value;
   }

   public Easing Event08() {
      return this.EventGetBasicProjectionMatrixHook2;
   }

   public long getStartTime() {
      return this.startTime;
   }

   public float Event01() {
      return this.DataChangedEvent;
   }

   public float Event19() {
      return this.EventInjectPlaced;
   }

   public boolean isDone() {
      return this.done;
   }

   public boolean Event49() {
      return this.ChatMessageEvent;
   }

   public void on23(long var1) {
      this.duration = var1;
   }

   public void on23(Easing var1) {
      this.EventGetBasicProjectionMatrixHook2 = var1;
   }

   public void setStartTime(long var1) {
      this.startTime = var1;
   }

   public void ColorAnimator(float var1) {
      this.DataChangedEvent = var1;
   }

   public void ItemRegistry(float var1) {
      this.EventInjectPlaced = var1;
   }

   public void UiAnimation(boolean var1) {
      this.done = var1;
   }

   public void Easing(boolean var1) {
      this.ChatMessageEvent = var1;
   }
}
