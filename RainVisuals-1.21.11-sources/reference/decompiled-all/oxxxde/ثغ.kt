package oxxxde

import java.util.UUID

// $VF: Compiled from heavy
internal class ثغ {
   public final val snapshot: ّ
   public final val deleteRevealAnimation: ري
   public final val deleteHoverAnimation: ري
   public final val name: String
   public final val selectionAnimation: ري
   public final val id: UUID

   fun getDeleteRevealAnimation(): ري {
      this.deleteRevealAnimation
   }

   fun getDeleteHoverAnimation(): ري {
      this.deleteHoverAnimation
   }

   fun getSelectionAnimation(): ري {
      this.selectionAnimation
   }

   fun ثغ(preset: دي) {
      this.id = preset.id
      this.name = preset.name
      this.snapshot = preset.getSnapshot()
      this.selectionAnimation = ري(0.0F, 1, null)
      this.deleteRevealAnimation = ري(0.0F, 1, null)
      this.deleteHoverAnimation = ري(0.0F, 1, null)
   }

   fun getSnapshot(): ّ {
      this.snapshot
   }
}
