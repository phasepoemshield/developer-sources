package oxxxde

import java.util.HashMap

// $VF: Compiled from EventTypes.kt
public abstract class ذؤ {
   private final val data: HashMap<صن<*>, Any> = HashMap()

   public fun <T : Any> put(key: صن<Any>, value: Any) {
      this.data.put(key, value)
   }

   public fun <T : Any> get(key: صن<Any>): Any? {
      var var10000: Any = this.data.get(key)
      if (var10000 == null) {
         var10000 = null
      }

      return (T)var10000
   }
}
