package l;

import fat.releon.Releon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Helper9 {
   public Helper9() {
   }

   public static List<Helper230> method348() {
      Releon var0 = Releon.method71();
      ArrayList var1 = new ArrayList<>(
         Arrays.asList(
            new Config(var0),
            new Macro(var0),
            new Help(var0),
            new Bind(var0),
            new Way2(var0),
            new Rct(var0),
            new Friend(),
            new Irc(),
            new Prefix2(),
            new Target(),
            new Staff(),
            new Neuro(Releon.method71()),
            new BlockEsp2(),
            new TabParser2()
         )
      );
      return Collections.unmodifiableList(var1);
   }
}
