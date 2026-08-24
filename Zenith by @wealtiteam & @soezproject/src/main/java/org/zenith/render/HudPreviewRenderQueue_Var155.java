package org.zenith.render;
record HudPreviewRenderQueue_Var155(Runnable runnable) implements HudPreviewRenderQueue_Var7 {

   @Override
   public void render() {
      this.runnable.run();
   }

   public Runnable list42() {
      return this.runnable;
   }
}
