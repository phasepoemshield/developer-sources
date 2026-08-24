package oxxxde

import kotakbaz.rain.client.listener.Listener
import kotakbaz.rain.client.liteapi.HolyWorldFeatureControl
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object عث : Listener {
   public override fun init() {
      رظ.INSTANCE.register(this)
      خً.INSTANCE.syncAvailabilityStates()
   }

   @Commando
   public fun onUpdate(event: سح) {
      HolyWorldFeatureControl.INSTANCE.tick()
      خً.INSTANCE.syncAvailabilityStates()
   }
}
