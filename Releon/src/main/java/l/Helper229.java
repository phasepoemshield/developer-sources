package l;

import fat.releon.Releon;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.block.Block;

public enum Helper229 implements Helper278<Block> {
   INSTANCE;

   private Helper229() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Stream var2 = this.method2056().stream().map(var0 -> var0.getName().getString().replace(" ", "_"));
      String var3 = var1.method1686().method1723();
      return new Helper120().method990(var2).method1000(var3).method999().method1003();
   }

   public Block method2018(Helper276 var1) {
      String var2 = var1.method1686().method1723();
      return this.method2056().stream().filter(var1x -> var1x.getName().getString().replace(" ", "_").equalsIgnoreCase(var2)).findFirst().orElse(null);
   }

   private List<? extends Block> method2056() {
      return Releon.method71().method21().blocks.keySet().stream().toList();
   }
}
