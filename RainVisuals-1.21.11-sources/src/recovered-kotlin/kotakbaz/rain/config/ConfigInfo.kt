package kotakbaz.rain.config

import oxxxde.دة
import oxxxde.صٌ

// $VF: Compiled from heavy
public data class ConfigInfo(name: String, author: String, cloudOrigin: دة? = ...) {
   private CloudConfigOrigin cloudOrigin;
   public final val name: String
   public final val author: String

   public operator fun component3(): دة? {
      return this.cloudOrigin
   }

   public operator fun component1(): String {
      return this.name
   }

   public fun copy(name: String = ..., author: String = ..., cloudOrigin: دة? = ...): صٌ {
      return ConfigInfo(name, author, cloudOrigin)
   }

   public final val cloudOrigin: دة?

   public operator fun component2(): String {
      return this.author
   }

   public override fun hashCode(): Int {
      return (this.name.hashCode() * 31 + this.author.hashCode()) * 31 + (if (this.cloudOrigin == null) 0 else this.cloudOrigin.hashCode())
   }

   init {
      super()
      this.name = name
      this.author = author
      this.cloudOrigin = cloudOrigin
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is ConfigInfo
            && this.name == (other as ConfigInfo).name
            && this.author == (other as ConfigInfo).author
            && this.cloudOrigin == (other as ConfigInfo).cloudOrigin
         }
   }

   public final val displayName: String
      public final get() {
         if (this.cloudOrigin != null) {
            val var2: java.lang.String = this.cloudOrigin.cloudName
            if (var2 != null) {
               val var3: java.lang.String = if (!StringsKt.isBlank(var2)) var2 else null
               if (var3 != null) {
                  return var3
               }
            }
         }

         return this.name
      }


   public override fun toString(): String {
      return "ConfigInfo(name=${this.name}, author=${this.author}, cloudOrigin=${this.cloudOrigin})"
   }
}
