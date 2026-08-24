package kotakbaz.rain.ui.inventory

import java.util.UUID
import kotakbaz.rain.client.util.animations.AnimationUtil
import oxxxde.دي
import oxxxde.ري
import oxxxde.ّ

// $VF: Compiled from heavy
internal class InventoryCard(preset: دي) {
   private InventorySnapshot snapshot;
   private AnimationUtil deleteRevealAnimation;
   private AnimationUtil deleteHoverAnimation;
   public final val name: String
   private AnimationUtil selectionAnimation;
   public final val id: UUID

   public final val deleteRevealAnimation: ري

   public final val deleteHoverAnimation: ري

   public final val selectionAnimation: ري

   init {
      this.id = preset.id
      this.name = preset.name
      this.snapshot = preset.snapshot
      this.selectionAnimation = AnimationUtil(0.0F, 1, null)
      this.deleteRevealAnimation = AnimationUtil(0.0F, 1, null)
      this.deleteHoverAnimation = AnimationUtil(0.0F, 1, null)
   }

   public final val snapshot: ّ
}
