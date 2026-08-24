package oxxxde;

// $VF: Compiled from heavy
public record رم(float x, float y, float width, float height) {
   public رم intersection(رم other) {
      float x1 = Math.max(this.x, other.x);
      float y1 = Math.max(this.y, other.y);
      float x2 = Math.min(this.x + this.width, other.x + other.width);
      float y2 = Math.min(this.y + this.height, other.y + other.height);
      return !(x2 < x1) && !(y2 < y1) ? new رم(x1, y1, x2 - x1, y2 - y1) : new رم(0.0F, 0.0F, 0.0F, 0.0F);
   }
}
