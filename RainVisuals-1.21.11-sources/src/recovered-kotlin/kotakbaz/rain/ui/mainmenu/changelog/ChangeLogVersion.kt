package kotakbaz.rain.ui.mainmenu.changelog

import oxxxde.دا

// $VF: Compiled from heavy
public class ChangeLogVersion(version: String, vararg entries: دا) {
   public final val items: List<دا>
   public final val version: String

   init {
      this.version = version
      this.items = ArraysKt.asList(entries)
   }
}
