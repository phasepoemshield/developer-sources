package oxxxde

// $VF: Compiled from heavy
private data class خٌ {
   public final val author: String
   public final val clickGuiSettings: List<إ>
   public final val cloudOrigin: دة?
   public final val formatVersion: Int
   public final val modules: List<دء>

   public fun copy(
      formatVersion: Int = this.formatVersion,
      author: String = this.author,
      cloudOrigin: دة? = this.cloudOrigin,
      clickGuiSettings: List<إ> = this.clickGuiSettings,
      modules: List<دء> = this.modules
   ): خٌ {
      return خٌ(formatVersion, author, cloudOrigin, clickGuiSettings, modules)
   }

   public operator fun component5(): List<دء> {
      return this.modules
   }

   public operator fun component2(): String {
      return this.author
   }

   public override fun hashCode(): Int {
      return (
               ((Integer.hashCode(this.formatVersion) * 31 + this.author.hashCode()) * 31 + (if (this.cloudOrigin == null) 0 else this.cloudOrigin.hashCode()))
                     * 31
                  + this.clickGuiSettings.hashCode()
            )
            * 31
         + this.modules.hashCode()
      }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is خٌ
            && this.formatVersion == (other as خٌ).formatVersion
            && this.author == (other as خٌ).author
            && this.cloudOrigin == (other as خٌ).cloudOrigin
            && this.clickGuiSettings == (other as خٌ).clickGuiSettings
            && this.modules == (other as خٌ).modules
         }
   }

   fun خٌ(modules: Int, formatVersion: java.lang.String, author: دة?, cloudOrigin: MutableList<إ>, clickGuiSettings: MutableList<دء>) {
      this.formatVersion = formatVersion
      this.author = author
      this.cloudOrigin = cloudOrigin
      this.clickGuiSettings = clickGuiSettings
      this.modules = modules
   }

   public operator fun component4(): List<إ> {
      return this.clickGuiSettings
   }

   public override fun toString(): String {
      return "ParsedConfig(formatVersion=${this.formatVersion}, author=${this.author}, cloudOrigin=${this.cloudOrigin}, clickGuiSettings=${this.clickGuiSettings}, modules=${this.modules})"
   }

   fun getCloudOrigin(): دة? {
      this.cloudOrigin
   }

   public operator fun component3(): دة? {
      return this.cloudOrigin
   }

   public operator fun component1(): Int {
      return this.formatVersion
   }
}
