package oxxxde;

import net.minecraft.client.gl.Framebuffer;

// $VF: Compiled from heavy
public final class ائ {
   private static final ThreadLocal<ء> ACTIVE_CONTEXT = new ThreadLocal<>();

   public static void renderInto(Framebuffer target, int guiScale, int physicalHeight, int physicalWidth, Runnable renderer) {
      if (target != null && renderer != null && physicalWidth > 0 && physicalHeight > 0 && guiScale > 0) {
         ء previous = ACTIVE_CONTEXT.get();
         ACTIVE_CONTEXT.set(new ء(target, physicalWidth, physicalHeight, guiScale));

         try {
            renderer.run();
         } finally {
            if (previous == null) {
               ACTIVE_CONTEXT.remove();
            } else {
               ACTIVE_CONTEXT.set(previous);
            }
         }
      }
   }

   public static int guiScaleOr(int original) {
      ء context = ACTIVE_CONTEXT.get();
      return context == null ? original : context.guiScale;
   }

   public static int physicalHeightOr(int original) {
      ء context = ACTIVE_CONTEXT.get();
      return context == null ? original : context.physicalHeight;
   }

   public static int physicalWidthOr(int original) {
      ء context = ACTIVE_CONTEXT.get();
      return context == null ? original : context.physicalWidth;
   }

   private ائ() {
   }

   public static Framebuffer targetOr(Framebuffer original) {
      ء context = ACTIVE_CONTEXT.get();
      return context == null ? original : context.target;
   }
}
