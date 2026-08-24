package oxxxde

// $VF: Compiled from heavy
public data class ظص(name: String, icon: String, desc: String, searchPlaceholder: String = "Поиск..", searchFieldIcon: String = "g") {
   public final val searchFieldIcon: String
   public final val desc: String
   public final val icon: String
   public final val searchPlaceholder: String
   public final val name: String

   public override fun toString(): String {
      return "Category(name=${this.name}, icon=${this.icon}, desc=${this.desc}, searchPlaceholder=${this.searchPlaceholder}, searchFieldIcon=${this.searchFieldIcon})"
   }

   init {
      super()
      this.name = name
      this.icon = icon
      this.desc = desc
      this.searchPlaceholder = searchPlaceholder
      this.searchFieldIcon = searchFieldIcon
   }

   public operator fun component2(): String {
      return this.icon
   }

   public fun copy(
      name: String = this.name,
      icon: String = this.icon,
      desc: String = this.desc,
      searchPlaceholder: String = this.searchPlaceholder,
      searchFieldIcon: String = this.searchFieldIcon
   ): ظص {
      return ظص(name, icon, desc, searchPlaceholder, searchFieldIcon)
   }

   public operator fun component4(): String {
      return this.searchPlaceholder
   }

   public operator fun component3(): String {
      return this.desc
   }

   public operator fun component1(): String {
      return this.name
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is ظص
            && this.name == (other as ظص).name
            && this.icon == (other as ظص).icon
            && this.desc == (other as ظص).desc
            && this.searchPlaceholder == (other as ظص).searchPlaceholder
            && this.searchFieldIcon == (other as ظص).searchFieldIcon
         }
   }

   public override fun hashCode(): Int {
      return (((this.name.hashCode() * 31 + this.icon.hashCode()) * 31 + this.desc.hashCode()) * 31 + this.searchPlaceholder.hashCode()) * 31
         + this.searchFieldIcon.hashCode()
      }

   public operator fun component5(): String {
      return this.searchFieldIcon
   }
}
