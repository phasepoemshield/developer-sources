package zenith;

import java.util.HashSet;

public class ZenithInternal130 extends CreateGsonHandler<String> {
   public ZenithInternal130() {
      super("staffName.json", "", new TypeTokenImpl$1().getType(), HashSet::new);
   }

   public boolean EventImpl_33(String s) {
      return this.getItems().contains(s);
   }
}
