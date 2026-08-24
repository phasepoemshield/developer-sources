package kotakbaz.rain.client.social

import oxxxde.شق

// $VF: Compiled from heavy
public data class CloudConfigKey(id: String, key: String, maxActivations: Int?, usedActivations: Int, remainingActivations: Int?, revoked: Boolean) {
   public final val maxActivations: Int?
   public final val usedActivations: Int
   public final val key: String
   public final val id: String
   public final val revoked: Boolean
   public final val remainingActivations: Int?

   public override fun toString(): String {
      return "CloudConfigKey(id=${this.id}, key=${this.key}, maxActivations=${this.maxActivations}, usedActivations=${this.usedActivations}, remainingActivations=${this.remainingActivations}, revoked=${this.revoked})"
   }

   public fun copy(
      id: String = ...,
      key: String = ...,
      maxActivations: Int? = ...,
      usedActivations: Int = ...,
      remainingActivations: Int? = ...,
      revoked: Boolean = ...
   ): شق {
      return CloudConfigKey(id, key, maxActivations, usedActivations, remainingActivations, revoked)
   }

   init {
      this.id = id
      this.key = key
      this.maxActivations = maxActivations
      this.usedActivations = usedActivations
      this.remainingActivations = remainingActivations
      this.revoked = revoked
   }

   public operator fun component4(): Int {
      return this.usedActivations
   }

   public operator fun component2(): String {
      return this.key
   }

   public operator fun component6(): Boolean {
      return this.revoked
   }

   public override operator fun equals(other: Any?): Boolean {
      label52@
      if (this === other) {
         return true
      } else {
         return other is CloudConfigKey
            && this.id == (other as CloudConfigKey).id
            && this.key == (other as CloudConfigKey).key
            && this.maxActivations == (other as CloudConfigKey).maxActivations
            && this.usedActivations == (other as CloudConfigKey).usedActivations
            && this.remainingActivations == (other as CloudConfigKey).remainingActivations
            && this.revoked == (other as CloudConfigKey).revoked
         }
   }

   public override fun hashCode(): Int {
      return (
               (
                        ((this.id.hashCode() * 31 + this.key.hashCode()) * 31 + (if (this.maxActivations == null) 0 else this.maxActivations.hashCode())) * 31
                           + Integer.hashCode(this.usedActivations)
                     )
                     * 31
                  + (if (this.remainingActivations == null) 0 else this.remainingActivations.hashCode())
            )
            * 31
         + java.lang.Boolean.hashCode(this.revoked)
      }

   public operator fun component5(): Int? {
      return this.remainingActivations
   }

   public operator fun component1(): String {
      return this.id
   }

   public operator fun component3(): Int? {
      return this.maxActivations
   }
}
