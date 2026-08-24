package kotakbaz.rain.event.events

import oxxxde.سض

// $VF: Compiled from DropEvent.kt
public class DropEvent(selectedSlot: Int, entireStack: Boolean) : سض {
   public final val entireStack: Boolean
   public final val selectedSlot: Int

   init {
      this.selectedSlot = selectedSlot
      this.entireStack = entireStack
   }
}
