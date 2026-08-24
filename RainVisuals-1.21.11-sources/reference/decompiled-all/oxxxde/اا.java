package oxxxde;

// $VF: Compiled from heavy
public record اا(صج status, String message) {
   public boolean isFailure() {
      return this.status.equals(صج.FAILURE);
   }
}
