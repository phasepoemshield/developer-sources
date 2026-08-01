package zenith;

import zenith.hud.*;

public class GetStartTimeHandler {
   private long duration;
   private float Viewmodel;
   private IReturn WorldParticles;
   private long startTime;
   private float Worldtweaks;
   private float ZenithInternal018;
   private boolean done;
   private boolean ListHolder_9;

   public GetStartTimeHandler(long i, float f, IReturn il11liili111il) {
      this.duration = i;
      this.WorldParticles = il11liili111il;
      this.Viewmodel = f;
      this.Worldtweaks = f;
      this.ZenithInternal018 = f;
      this.done = true;
   }

   public GetStartTimeHandler(long i, IReturn il11liili111il) {
      this(i, 0.0F, il11liili111il);
   }

   public void ZenithInternal101(boolean flag) {
      this.StringHolder_8(flag ? 1.0F : 0.0F);
   }

   public float StringHolder_8(float f) {
      long i = System.currentTimeMillis();
      if (f != this.ZenithInternal018) {
         this.Worldtweaks = this.Viewmodel;
         this.ZenithInternal018 = f;
         this.startTime = i;
         this.done = false;
      }

      long j = i - this.startTime;
      if (j >= this.duration) {
         this.Viewmodel = this.ZenithInternal018;
         this.done = true;
         return this.Viewmodel;
      } else {
         float f1 = (float)j / (float)this.duration;
         float f2 = this.WorldParticles.ease(f1, 0.0F, 1.0F, 1.0F);
         this.Viewmodel = this.Worldtweaks + (this.ZenithInternal018 - this.Worldtweaks) * f2;
         return this.Viewmodel;
      }
   }

   public void EventBus(float f) {
      this.Viewmodel = f;
      this.Worldtweaks = f;
      this.ZenithInternal018 = f;
      this.done = true;
   }

   public void EventTarget(float f) {
      this.Viewmodel = f;
      this.Worldtweaks = f;
      this.ZenithInternal018 = f;
      this.done = true;
   }

   public void reset() {
      this.EventTarget(0.0F);
   }

   public void ZenithInternal095(float f) {
      if (f != this.ZenithInternal018) {
         this.Worldtweaks = this.Viewmodel;
         this.ZenithInternal018 = f;
         this.startTime = System.currentTimeMillis();
         this.done = false;
      }
   }

   public float ArmorHud() {
      return this.StringHolder_8(this.ZenithInternal018);
   }

   public long getDuration() {
      return this.duration;
   }

   public float CloudFriendInfo() {
      return this.Viewmodel;
   }

   public IReturn Cooldowns() {
      return this.WorldParticles;
   }

   public long getStartTime() {
      return this.startTime;
   }

   public float Events() {
      return this.Worldtweaks;
   }

   public float HootBar() {
      return this.ZenithInternal018;
   }

   public boolean ArrayListHolder() {
      return this.done;
   }

   public boolean Information() {
      return this.ListHolder_9;
   }

   public void EventImpl_21(long i) {
      this.duration = i;
   }

   public void StringHolder_8(IReturn il11liili111il) {
      this.WorldParticles = il11liili111il;
   }

   public void EventImpl_13(long i) {
      this.startTime = i;
   }

   public void Event(float f) {
      this.Worldtweaks = f;
   }

   public void EventImpl_24(float f) {
      this.ZenithInternal018 = f;
   }

   public void ZenithInternal084(boolean flag) {
      this.done = flag;
   }

   public void StringHolder_19(boolean flag) {
      this.ListHolder_9 = flag;
   }
}
