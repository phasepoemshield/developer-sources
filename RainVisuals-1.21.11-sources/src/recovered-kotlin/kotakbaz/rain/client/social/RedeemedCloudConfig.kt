package kotakbaz.rain.client.social

import com.google.gson.JsonObject
import oxxxde.ضٌ

// $VF: Compiled from heavy
public data class RedeemedCloudConfig(configId: String,
   name: String,
   author: String,
   ownerName: String,
   contentHash: String,
   payload: JsonObject,
   alreadyActivated: Boolean
) {
   public final val author: String
   public final val configId: String
   public final val alreadyActivated: Boolean
   public final val ownerName: String
   public final val contentHash: String
   public final val name: String
   public final val payload: JsonObject

   public override fun toString(): String {
      return "RedeemedCloudConfig(configId=${this.configId}, name=${this.name}, author=${this.author}, ownerName=${this.ownerName}, contentHash=${this.contentHash}, payload=${this.payload}, alreadyActivated=${this.alreadyActivated})"
   }

   public operator fun component5(): String {
      return this.contentHash
   }

   public operator fun component1(): String {
      return this.configId
   }

   public operator fun component2(): String {
      return this.name
   }

   init {
      this.configId = configId
      this.name = name
      this.author = author
      this.ownerName = ownerName
      this.contentHash = contentHash
      this.payload = payload
      this.alreadyActivated = alreadyActivated
   }

   public operator fun component3(): String {
      return this.author
   }

   public override fun hashCode(): Int {
      return (
               (
                        (((this.configId.hashCode() * 31 + this.name.hashCode()) * 31 + this.author.hashCode()) * 31 + this.ownerName.hashCode()) * 31
                           + this.contentHash.hashCode()
                     )
                     * 31
                  + this.payload.hashCode()
            )
            * 31
         + java.lang.Boolean.hashCode(this.alreadyActivated)
      }

   public operator fun component4(): String {
      return this.ownerName
   }

   public operator fun component7(): Boolean {
      return this.alreadyActivated
   }

   public operator fun component6(): JsonObject {
      return this.payload
   }

   public override operator fun equals(other: Any?): Boolean {
      label58@
      if (this === other) {
         return true
      } else {
         return other is RedeemedCloudConfig
            && this.configId == (other as RedeemedCloudConfig).configId
            && this.name == (other as RedeemedCloudConfig).name
            && this.author == (other as RedeemedCloudConfig).author
            && this.ownerName == (other as RedeemedCloudConfig).ownerName
            && this.contentHash == (other as RedeemedCloudConfig).contentHash
            && this.payload == (other as RedeemedCloudConfig).payload
            && this.alreadyActivated == (other as RedeemedCloudConfig).alreadyActivated
         }
   }

   public fun copy(
      configId: String = ...,
      name: String = ...,
      author: String = ...,
      ownerName: String = ...,
      contentHash: String = ...,
      payload: JsonObject = ...,
      alreadyActivated: Boolean = ...
   ): ضٌ {
      return RedeemedCloudConfig(configId, name, author, ownerName, contentHash, payload, alreadyActivated)
   }
}
