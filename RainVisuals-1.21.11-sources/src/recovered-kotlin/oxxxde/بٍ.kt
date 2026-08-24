package oxxxde

// $VF: Compiled from heavy
private class بٍ(x: Float = 0.0F, y: Float = 0.0F, width: Float = 0.0F, height: Float = 0.0F) {
   public final var y: Float
   public final var height: Float
   public final var x: Float
   public final var width: Float

   fun بٍ() {
      this(0.0F, 0.0F, 0.0F, 0.0F, 15, null)
   }

   public fun contains(mouseX: Float, mouseY: Float): Boolean {
      return mouseX >= this.x && mouseY >= this.y && mouseX <= this.x + this.width && mouseY <= this.y + this.height
   }

   public fun set(x: Float, y: Float, width: Float, height: Float) {
      this.x = x
      this.y = y
      this.width = width
      this.height = height
   }

   init {
      this.x = x
      this.y = y
      this.width = width
      this.height = height
   }
}
