package kotakbaz.rain.friend

import net.minecraft.util.Identifier
import oxxxde.ذو

// $VF: Compiled from heavy
public data class `FriendManager$FriendEntry`(name: String, addedAt: String, pin: Boolean = false) {
   public final val name: String
   @Volatile
   private Identifier skinTexture;
   public final val addedAt: String
   public final val pin: Boolean

   fun setSkinTexture(`<set-?>`: Identifier?) {
      this.skinTexture = `<set-?>`
   }

   public operator fun component1(): String {
      return this.name
   }

   init {
      super()
      this.name = name
      this.addedAt = addedAt
      this.pin = pin
   }

   public override fun toString(): String {
      return "FriendEntry(name=${this.name}, addedAt=${this.addedAt}, pin=${this.pin})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is FriendManager$FriendEntry
            && this.name == (other as FriendManager$FriendEntry).name
            && this.addedAt == (other as FriendManager$FriendEntry).addedAt
            && this.pin == (other as FriendManager$FriendEntry).pin
         }
   }

   public operator fun component3(): Boolean {
      return this.pin
   }

   public override fun hashCode(): Int {
      return (this.name.hashCode() * 31 + this.addedAt.hashCode()) * 31 + java.lang.Boolean.hashCode(this.pin)
   }

   public operator fun component2(): String {
      return this.addedAt
   }

   fun getSkinTexture(): Identifier? {
      this.skinTexture
   }

   public fun copy(name: String = ..., addedAt: String = ..., pin: Boolean = ...): ذو {
      return FriendManager$FriendEntry(name, addedAt, pin)
   }
}
