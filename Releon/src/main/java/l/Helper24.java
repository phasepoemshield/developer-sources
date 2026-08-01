package l;

import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Helper24 implements Helper4 {
   private final Logger logger = LogManager.getLogger("avalora");

   public Helper24() {
   }

   @Override
   public void method280(Object var1) {
      this.logger.info("[AV{}AL{}ORA] {}", Formatting.BLUE, Formatting.RED, var1);
   }

   @Override
   public void method281(Text... var1) {
   }
}
