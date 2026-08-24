package kotakbaz.rain.client.util.color

import java.awt.Color

// $VF: Compiled from heavy
public class QuadColor(color1: Color, color2: Color, color3: Color, color4: Color) {
   public final var color1: Color
   public final var color2: Color
   public final var color4: Color
   public final var color3: Color

   init {
      this.color1 = color1
      this.color2 = color2
      this.color3 = color3
      this.color4 = color4
   }

   public constructor(color: Color) : this(color, color, color, color)
   public fun set(color: Color) {
      this.color1 = color
      this.color2 = color
      this.color3 = color
      this.color4 = color
   }

   public fun set(c1: Color, c2: Color, c3: Color, c4: Color) {
      this.color1 = c1
      this.color2 = c2
      this.color3 = c3
      this.color4 = c4
   }
}
