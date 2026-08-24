package oxxxde;

import net.minecraft.client.render.OverlayTexture;

// $VF: Compiled from heavy
public final class با {
   private static final ThreadLocal<Boolean> ARMOR_OVERLAY_ACTIVE = ThreadLocal.withInitial(() -> false);
   private static final ThreadLocal<Integer> ARMOR_OVERLAY = ThreadLocal.withInitial(() -> OverlayTexture.DEFAULT_UV);

   public static boolean isArmorOverlayActive() {
      return ARMOR_OVERLAY_ACTIVE.get();
   }

   public static void setArmorOverlay(int overlay) {
      ARMOR_OVERLAY_ACTIVE.set(true);
      ARMOR_OVERLAY.set(overlay);
   }

   public static void restoreArmorOverlay(boolean overlay, int active) {
      ARMOR_OVERLAY_ACTIVE.set(active);
      ARMOR_OVERLAY.set(overlay);
   }

   public static int getArmorOverlay() {
      return ARMOR_OVERLAY.get();
   }

   public static int resolveArmorOverlay(int fallback) {
      return isArmorOverlayActive() ? getArmorOverlay() : fallback;
   }

   private با() {
   }
}
