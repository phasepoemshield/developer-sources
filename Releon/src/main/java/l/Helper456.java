package l;

import java.util.Arrays;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

public class Helper456 implements Helper4, Helper160 {
   public Helper456() {
   }

   @Override
   public void method280(Object var1) {
   }

   @Override
   public void method281(Text... var1) {
      if (mc.player != null) {
         MutableText var2 = Text.literal("");
         Arrays.asList(var1).forEach(var2::append);
         mc.inGameHud.getChatHud().addMessage(var2);
      }
   }
}
