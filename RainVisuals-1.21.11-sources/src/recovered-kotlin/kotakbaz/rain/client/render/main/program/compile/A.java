package kotakbaz.rain.client.render.main.program.compile;

import oxxxde.صج;

// $VF: Compiled from heavy
public record A(صج status, String message) {
   public boolean isFailure() {
      return this.status.equals(صج.FAILURE);
   }
}
