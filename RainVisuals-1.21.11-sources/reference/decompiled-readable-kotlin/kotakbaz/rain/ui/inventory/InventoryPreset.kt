package kotakbaz.rain.ui.inventory

import java.util.UUID
import oxxxde.دي
import oxxxde.ّ

// $VF: Compiled from heavy
public data class InventoryPreset(id: UUID, name: String, snapshot: ّ, createdAt: Long) {
   public final val createdAt: Long
   public final val name: String
   public final val id: UUID
   private InventorySnapshot snapshot;

   public fun copy(id: UUID = ..., name: String = ..., snapshot: ّ = ..., createdAt: Long = ...): دي {
      return InventoryPreset(id, name, snapshot, createdAt)
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

   init {
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
         return other is InventoryPreset
            && this.id == (other as InventoryPreset).id
            && this.name == (other as InventoryPreset).name
            && this.snapshot == (other as InventoryPreset).snapshot
            && this.createdAt == (other as InventoryPreset).createdAt
         }
   }

   public final val snapshot: ّ
}
