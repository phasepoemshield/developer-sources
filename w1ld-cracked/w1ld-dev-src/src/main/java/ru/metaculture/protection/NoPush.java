package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "NoPush",
   C00OOC00oO = "Убирает отталкивания от игроков, мобов и блоков",
   uUnuvNvvNU = oOOOo0.Player
)
public class NoPush extends Module {
   public vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Players", true);
   public vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Mobs", true);
   public vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Blocks", true);

   public NoPush() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU});
   }
}
