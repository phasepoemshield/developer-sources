package oxxxde

import java.util.UUID

// $VF: Compiled from heavy
public object حغ : دِ("Socials", ظن.getPLAYER(), "Отмечает пользователей Rain над персонажами") {
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
