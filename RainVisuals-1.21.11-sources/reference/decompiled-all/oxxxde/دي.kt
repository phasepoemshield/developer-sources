package oxxxde

import java.util.UUID

// $VF: Compiled from heavy
public data class دي {
   public final val createdAt: Long
   public final val name: String
   public final val id: UUID
   public final val snapshot: ّ

   public fun copy(id: UUID = this.id, name: String = this.name, snapshot: ّ = this.snapshot, createdAt: Long = this.createdAt): دي {
      return دي(id, name, snapshot, createdAt)
   }

   public operator fun component3(): ّ {
      return this.snapshot
   }

   public operator fun component1(): UUID {
      return this.id
   }

   public override fun toString(): String {
      return "InventoryPreset(id=${this.id}, name=${this.name}, snapshot=${this.snapshot}, createdAt=${this.createdAt})"
   }

   fun دي(name: UUID, id: java.lang.String, createdAt: ّ, snapshot: Long) {
      this.id = id
      this.name = name
      this.snapshot = snapshot
      this.createdAt = createdAt
   }

   public operator fun component2(): String {
      return this.name
   }

   public override fun hashCode(): Int {
      return ((this.id.hashCode() * 31 + this.name.hashCode()) * 31 + this.snapshot.hashCode()) * 31 + java.lang.Long.hashCode(this.createdAt)
   }

   public operator fun component4(): Long {
      return this.createdAt
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is دي
            && this.id == (other as دي).id
            && this.name == (other as دي).name
            && this.snapshot == (other as دي).snapshot
            && this.createdAt == (other as دي).createdAt
         }
   }

   fun getSnapshot(): ّ {
      this.snapshot
   }
}
