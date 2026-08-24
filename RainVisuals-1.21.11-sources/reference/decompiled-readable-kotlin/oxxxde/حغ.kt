package oxxxde

import java.util.UUID
import kotakbaz.rain.module.Module

// $VF: Compiled from heavy
public object حغ : Module("Socials", PLAYER, "Отмечает пользователей Rain над персонажами") {
   @JvmStatic
   fun {
      INSTANCE.setVisibleInGui({ 
         false
      })
      INSTANCE.setEnabled(true)
   }

   public fun isRainUser(uuid: UUID): Boolean {
      return this.isEnabled() && تَ.INSTANCE.isRainUser(uuid)
   }
}
