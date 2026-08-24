package oxxxde

import java.util.ArrayList
import kotakbaz.rain.client.listener.Listener

// $VF: Compiled from heavy
public object دع : ه {
   public final val listeners: MutableList<تم> = ArrayList() as java.util.List

   public override fun load() {
      this.add(ذخ.INSTANCE, حل.INSTANCE, عث.INSTANCE)

      for (`element$iv` in listeners) {
         (`element$iv` as Listener).init()
      }
   }

   private fun add(vararg listener: تم) {
      CollectionsKt.addAll(listeners, listener)
   }
}
