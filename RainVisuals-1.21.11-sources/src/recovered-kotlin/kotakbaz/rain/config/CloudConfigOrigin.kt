package kotakbaz.rain.config

import oxxxde.دة

// $VF: Compiled from heavy
public data class CloudConfigOrigin(configId: String,
   ownerName: String,
   contentHash: String,
   importedAt: Long,
   owned: Boolean = false,
   revision: Int = 0,
   cloudName: String? = null,
   shared: Boolean = false,
   accountSynced: Boolean = false
) {
   public final val revision: Int
   public final val importedAt: Long
   public final val contentHash: String
   public final val owned: Boolean
   public final val ownerName: String
   public final val cloudName: String?
   public final val shared: Boolean
   public final val accountSynced: Boolean
   public final val configId: String

   public operator fun component5(): Boolean {
      return this.owned
   }

   public operator fun component9(): Boolean {
      return this.accountSynced
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (
                                                   ((this.configId.hashCode() * 31 + this.ownerName.hashCode()) * 31 + this.contentHash.hashCode()) * 31
                                                      + java.lang.Long.hashCode(this.importedAt)
                                                )
                                                * 31
                                             + java.lang.Boolean.hashCode(this.owned)
                                       )
                                       * 31
                                    + Integer.hashCode(this.revision)
                              )
                              * 31
                           + (if (this.cloudName == null) 0 else this.cloudName.hashCode())
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.shared)
            )
            * 31
         + java.lang.Boolean.hashCode(this.accountSynced)
      }

   public override operator fun equals(other: Any?): Boolean {
      label70@
      if (this === other) {
         return true
      } else {
         return other is CloudConfigOrigin
            && this.configId == (other as CloudConfigOrigin).configId
            && this.ownerName == (other as CloudConfigOrigin).ownerName
            && this.contentHash == (other as CloudConfigOrigin).contentHash
            && this.importedAt == (other as CloudConfigOrigin).importedAt
            && this.owned == (other as CloudConfigOrigin).owned
            && this.revision == (other as CloudConfigOrigin).revision
            && this.cloudName == (other as CloudConfigOrigin).cloudName
            && this.shared == (other as CloudConfigOrigin).shared
            && this.accountSynced == (other as CloudConfigOrigin).accountSynced
         }
   }

   public operator fun component7(): String? {
      return this.cloudName
   }

   public operator fun component3(): String {
      return this.contentHash
   }

   public override fun toString(): String {
      return "CloudConfigOrigin(configId=${this.configId}, ownerName=${this.ownerName}, contentHash=${this.contentHash}, importedAt=${this.importedAt}, owned=${this.owned}, revision=${this.revision}, cloudName=${this.cloudName}, shared=${this.shared}, accountSynced=${this.accountSynced})"
   }

   public operator fun component4(): Long {
      return this.importedAt
   }

   init {
      this.configId = configId
      this.ownerName = ownerName
      this.contentHash = contentHash
      this.importedAt = importedAt
      this.owned = owned
      this.revision = revision
      this.cloudName = cloudName
      this.shared = shared
      this.accountSynced = accountSynced
   }

   public operator fun component1(): String {
      return this.configId
   }

   public fun copy(
      configId: String = ...,
      ownerName: String = ...,
      contentHash: String = ...,
      importedAt: Long = ...,
      owned: Boolean = ...,
      revision: Int = ...,
      cloudName: String? = ...,
      shared: Boolean = ...,
      accountSynced: Boolean = ...
   ): دة {
      return CloudConfigOrigin(configId, ownerName, contentHash, importedAt, owned, revision, cloudName, shared, accountSynced)
   }

   public operator fun component2(): String {
      return this.ownerName
   }

   public operator fun component6(): Int {
      return this.revision
   }

   public operator fun component8(): Boolean {
      return this.shared
   }
}
