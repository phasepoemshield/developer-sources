package oxxxde

import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object عث : تم {
   public override fun init() {
      رظ.INSTANCE.register(this)
      خً.INSTANCE.syncAvailabilityStates()
   }

   @Commando
   public fun onUpdate(event: سح) {
      حْ.INSTANCE.tick()
      خً.INSTANCE.syncAvailabilityStates()
   }
}
