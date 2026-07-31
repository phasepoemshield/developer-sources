package l;

import fat.releon.Releon;
import java.util.Optional;
import java.util.stream.Stream;
import net.minecraft.entity.EntityType;

public enum Helper292 implements Helper278<EntityType<?>> {
   INSTANCE;

   private Helper292() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Stream var2 = this.method2876().map(var0 -> var0.getName().getString().replace(" ", "_"));
      String var3 = var1.method1686().method1723();
      return new Helper120().method990(var2).method1000(var3).method999().method1003();
   }

   public EntityType<?> method2018(Helper276 var1) {
      return this.method2875(var1.method1686().method1723()).orElse(null);
   }

   public Optional<EntityType<?>> method2875(String var1) {
      return this.method2876().filter(var1x -> var1x.getName().getString().replace(" ", "_").equalsIgnoreCase(var1)).findFirst();
   }

   private Stream<EntityType<?>> method2876() {
      return Releon.method71().method21().entities.keySet().stream();
   }
}
