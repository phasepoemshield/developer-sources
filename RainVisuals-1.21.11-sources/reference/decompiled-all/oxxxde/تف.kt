package oxxxde

import java.util.Locale

// $VF: Compiled from heavy
public data class تف(name: String, event: Boolean, x: Int, y: Int, z: Int) {
   public final val hudIcon: String
   public final val event: Boolean
   public final val y: Int
   public final var cachedDistanceValue: Int
   public final val x: Int
   private final var cachedNameWidth: Float
   public final val z: Int
   private final var cachedIconSizeBits: Int
   private final var cachedDistanceTextForWidth: String?
   private final var cachedNameSizeBits: Int
   public final var cachedDistanceText: String
   private final var cachedIconWidth: Float
   private final var cachedDistanceWidth: Float
   private final var cachedDistanceSizeBits: Int
   public final val name: String

   public fun nameWidth(size: Float): Float {
      val sizeBits: Int = java.lang.Float.floatToRawIntBits(size)
      if (this.cachedNameSizeBits != sizeBits) {
         this.cachedNameSizeBits = sizeBits
         this.cachedNameWidth = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), this.name, size, 0.0F, 4, null)
      }

      return this.cachedNameWidth
   }

   public operator fun component4(): Int {
      return this.y
   }

   public fun copy(name: String = this.name, event: Boolean = this.event, x: Int = this.x, y: Int = this.y, z: Int = this.z): تف {
      return تف(name, event, x, y, z)
   }

   public operator fun component1(): String {
      return this.name
   }

   public fun iconWidth(icon: String, size: Float): Float {
      val sizeBits: Int = java.lang.Float.floatToRawIntBits(size)
      if (this.cachedIconSizeBits != sizeBits) {
         this.cachedIconSizeBits = sizeBits
         this.cachedIconWidth = Math.max(طغ.INSTANCE.scaled(10.0F), جً.getWidth$default(رَ.INSTANCE.getICON(), icon, size, 0.0F, 4, null))
      }

      return this.cachedIconWidth
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is تف
            && this.name == (other as تف).name
            && this.event == (other as تف).event
            && this.x == (other as تف).x
            && this.y == (other as تف).y
            && this.z == (other as تف).z
         }
   }

   public override fun hashCode(): Int {
      return (((this.name.hashCode() * 31 + java.lang.Boolean.hashCode(this.event)) * 31 + Integer.hashCode(this.x)) * 31 + Integer.hashCode(this.y)) * 31
         + Integer.hashCode(this.z)
      }

   public fun distanceWidth(text: String, size: Float): Float {
      val sizeBits: Int = java.lang.Float.floatToRawIntBits(size)
      if (!(this.cachedDistanceTextForWidth == text) || this.cachedDistanceSizeBits != sizeBits) {
         this.cachedDistanceTextForWidth = text
         this.cachedDistanceSizeBits = sizeBits
         this.cachedDistanceWidth = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), text, size, 0.0F, 4, null)
      }

      return this.cachedDistanceWidth
   }

   public operator fun component2(): Boolean {
      return this.event
   }

   public override fun toString(): String {
      return "WayPoint(name=${this.name}, event=${this.event}, x=${this.x}, y=${this.y}, z=${this.z})"
   }

   public operator fun component5(): Int {
      return this.z
   }

   init {
      this.name = name
      this.event = event
      this.x = x
      this.y = y
      this.z = z
      var var10001: java.lang.String
      if (!this.event) {
         var10001 = "I"
      } else {
         val var7: java.lang.String = this.name
         val var8: Locale = Locale.ROOT
         var10001 = var7.toLowerCase(var8)
         var10001 = if (StringsKt.contains$default(var10001, "meteor", false, 2, null))
            "W"
            else
            (
               if (StringsKt.contains$default(var10001, "beacon", false, 2, null))
                  "R"
                  else
                  (
                     if (StringsKt.contains$default(var10001, "mystic", false, 2, null))
                        "Y"
                        else
                        (if (StringsKt.contains$default(var10001, "volcano", false, 2, null)) "T" else "v")
                  )
            )
         }

      this.hudIcon = var10001
      this.cachedDistanceValue = Integer.MIN_VALUE
      this.cachedDistanceText = ""
   }

   public operator fun component3(): Int {
      return this.x
   }
}
