package oxxxde

import com.google.gson.JsonObject

// $VF: Compiled from heavy
public data class ضغ(id: String,
   ownerName: String,
   name: String,
   author: String,
   contentHash: String,
   payload: JsonObject,
   revision: Int,
   revoked: Boolean,
   keys: List<شق>
) {
   public final val name: String
   public final val ownerName: String
   public final val id: String
   public final val author: String
   public final val contentHash: String
   public final val keys: List<شق>
   public final val revision: Int
   public final val payload: JsonObject
   public final val revoked: Boolean

   public override operator fun equals(other: Any?): Boolean {
      label70@
      if (this === other) {
         return true
      } else {
         return other is ضغ
            && this.id == (other as ضغ).id
            && this.ownerName == (other as ضغ).ownerName
            && this.name == (other as ضغ).name
            && this.author == (other as ضغ).author
            && this.contentHash == (other as ضغ).contentHash
            && this.payload == (other as ضغ).payload
            && this.revision == (other as ضغ).revision
            && this.revoked == (other as ضغ).revoked
            && this.keys == (other as ضغ).keys
         }
   }

   public operator fun component2(): String {
      return this.ownerName
   }

   public operator fun component7(): Int {
      return this.revision
   }

   public fun copy(
      id: String = this.id,
      ownerName: String = this.ownerName,
      name: String = this.name,
      author: String = this.author,
      contentHash: String = this.contentHash,
      payload: JsonObject = this.payload,
      revision: Int = this.revision,
      revoked: Boolean = this.revoked,
      keys: List<شق> = this.keys
   ): ضغ {
      return ضغ(id, ownerName, name, author, contentHash, payload, revision, revoked, keys)
   }

   public operator fun component3(): String {
      return this.name
   }

   public operator fun component1(): String {
      return this.id
   }

   public operator fun component9(): List<شق> {
      return this.keys
   }

   public operator fun component6(): JsonObject {
      return this.payload
   }

   public operator fun component5(): String {
      return this.contentHash
   }

   init {
      this.id = id
      this.ownerName = ownerName
      this.name = name
      this.author = author
      this.contentHash = contentHash
      this.payload = payload
      this.revision = revision
      this.revoked = revoked
      this.keys = keys
   }

   public operator fun component4(): String {
      return this.author
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (((this.id.hashCode() * 31 + this.ownerName.hashCode()) * 31 + this.name.hashCode()) * 31 + this.author.hashCode())
                                                * 31
                                             + this.contentHash.hashCode()
                                       )
                                       * 31
                                    + this.payload.hashCode()
                              )
                              * 31
                           + Integer.hashCode(this.revision)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.revoked)
            )
            * 31
         + this.keys.hashCode()
      }

   public operator fun component8(): Boolean {
      return this.revoked
   }

   public override fun toString(): String {
      return "CloudConfigRecord(id=${this.id}, ownerName=${this.ownerName}, name=${this.name}, author=${this.author}, contentHash=${this.contentHash}, payload=${this.payload}, revision=${this.revision}, revoked=${this.revoked}, keys=${this.keys})"
   }
}
