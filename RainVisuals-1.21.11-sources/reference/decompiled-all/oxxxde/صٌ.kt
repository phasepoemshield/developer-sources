package oxxxde

// $VF: Compiled from heavy
public data class صٌ {
   public final val cloudOrigin: دة?
   public final val name: String
   public final val author: String

   public operator fun component3(): دة? {
      return this.cloudOrigin
   }

   public operator fun component1(): String {
      return this.name
   }

   public fun copy(name: String = this.name, author: String = this.author, cloudOrigin: دة? = this.cloudOrigin): صٌ {
      return صٌ(name, author, cloudOrigin)
   }

   fun getCloudOrigin(): دة? {
      this.cloudOrigin
   }

   public operator fun component2(): String {
      return this.author
   }

   public override fun hashCode(): Int {
      return (this.name.hashCode() * 31 + this.author.hashCode()) * 31 + (if (this.cloudOrigin == null) 0 else this.cloudOrigin.hashCode())
   }

   fun صٌ(cloudOrigin: java.lang.String, name: java.lang.String, author: دة?) {
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
         return other is صٌ && this.name == (other as صٌ).name && this.author == (other as صٌ).author && this.cloudOrigin == (other as صٌ).cloudOrigin
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
