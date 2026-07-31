package l;

import java.util.List;
import net.minecraft.util.Formatting;

public interface Helper57 extends Helper94 {
   String getMessage();

   default void method647(Helper230 var1, List<Helper204> var2) {
      this.method905(this.getMessage(), Formatting.RED);
   }
}
