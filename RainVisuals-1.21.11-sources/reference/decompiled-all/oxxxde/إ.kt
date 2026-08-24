package oxxxde

// $VF: Compiled from heavy
private data class إ {
   public final val value: Any
   public final val setting: رف<*>

   public override fun toString(): String {
      return "SettingUpdate(setting=${this.setting}, value=${this.value})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is إ && this.setting == (other as إ).setting && this.value == (other as إ).value
      }
   }

   public operator fun component1(): رف<*> {
      return this.setting
   }

   fun getSetting(): رف<*> {
      this.setting
   }

   public override fun hashCode(): Int {
      return this.setting.hashCode() * 31 + this.value.hashCode()
   }

   fun إ(setting: رف<*>, value: Any) {
      this.setting = setting
      this.value = value
   }

   public operator fun component2(): Any {
      return this.value
   }

   public fun copy(setting: رف<*> = this.setting, value: Any = this.value): إ {
      return إ(setting, value)
   }
}
