package zenith.zov.client.screens.override.particle;

class MenuParticleRenderer$MenuParticle {
   // $VF: renamed from: x float
   public float pathNodes;
   // $VF: renamed from: y float
   public float count;
   public float size;
   public float speed;
   public float time;
   public float maxTime;
   public float alpha;

   public MenuParticleRenderer$MenuParticle(MenuParticleRenderer menuparticlerenderer, float f, float f1, boolean flag) {
      this.reset(f, f1, flag);
   }

   public void reset(float f, float f1, boolean flag) {
      this.size = (float)(2 + (int)(Math.random() * 4.0));
      this.speed = 2.0F + (float)(Math.random() * 0.8F);
      this.maxTime = 100.0F + (float)(Math.random() * 200.0);
      this.time = flag ? (float)(Math.random() * (double)this.maxTime) : 0.0F;
      if (flag) {
         this.pathNodes = (float)(Math.random() * (double)f);
         this.count = (float)(Math.random() * (double)f1);
      } else if (Math.random() > 0.5) {
         this.pathNodes = -20.0F;
         this.count = (float)(Math.random() * (double)f1);
      } else {
         this.pathNodes = (float)(Math.random() * (double)f);
         this.count = -20.0F;
      }
   }

   public void update(float f, float f1, float f2) {
      this.pathNodes = this.pathNodes + this.speed * f2;
      this.count = this.count + this.speed * f2;
      this.time += f2;
      float f3 = this.maxTime * 0.2F;
      if (this.time < f3) {
         this.alpha = this.time / f3;
      } else if (this.time > this.maxTime - f3) {
         this.alpha = (this.maxTime - this.time) / f3;
      } else {
         this.alpha = 1.0F;
      }

      this.alpha = Math.max(0.0F, Math.min(1.0F, this.alpha));
      if (this.time >= this.maxTime || this.pathNodes > f + 50.0F || this.count > f1 + 50.0F) {
         this.reset(f, f1, false);
      }
   }
}
