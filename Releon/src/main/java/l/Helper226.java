package l;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;

public enum Helper226 implements Helper278<Block> {
   INSTANCE;

   private Helper226() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Stream var2 = this.method2016().map(var0 -> var0.getName().getString().replace(" ", "_"));
      String var3 = var1.method1686().method1723();
      return new Helper120().method990(var2).method1000(var3).method999().method1003();
   }

   public Block method2018(Helper276 var1) {
      return this.method2015(var1.method1686().method1723()).orElse(null);
   }

   public Optional<Block> method2015(String var1) {
      return this.method2016().filter(var1x -> var1x.getName().getString().replace(" ", "_").equalsIgnoreCase(var1)).findFirst();
   }

   public Stream<Block> method2016() {
      return Registries.BLOCK.stream().filter(this::method2017);
   }

   public boolean method2017(Block var1) {
      return !List.of(Blocks.AIR, Blocks.CAVE_AIR, Blocks.VOID_AIR, Blocks.WATER).contains(var1);
   }
}
