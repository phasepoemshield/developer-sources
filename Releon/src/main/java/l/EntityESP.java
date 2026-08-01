package l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;

public class EntityESP extends Helper95 {
   private final Helper5 repository;

   public EntityESP(Helper5 var1) {
      super("EntityESP");
      this.repository = var1;
   }

   @Override
   public void method584(File var1) {
      Gson var2 = new GsonBuilder().setPrettyPrinting().create();
      File var3 = new File(var1, this.getName() + ".json");

      try {
         try (FileWriter var4 = new FileWriter(var3)) {
            ArrayList var5 = new ArrayList();
            this.repository.entities.forEach((var1x, var2x) -> var5.add(new Helper163(var1x.getTranslationKey(), var2x)));
            var2.toJson(var5, var4);
         }
      } catch (IOException | JsonIOException var9) {
         throw new Helper111(String.format("Failed to save %s to file", this.getName()), var9);
      }
   }

   @Override
   public void method583(File var1) {
      Gson var2 = new Gson();
      File var3 = new File(var1, this.getName() + ".json");

      try {
         try (FileReader var4 = new FileReader(var3)) {
            Helper163[] var5 = (Helper163[])var2.fromJson(var4, Helper163[].class);
            this.repository.entities.clear();
            Arrays.asList(var5)
               .forEach(
                  var1x -> Registries.ENTITY_TYPE
                     .stream()
                     .filter(var1xx -> var1xx.getTranslationKey().equals(var1x.entity))
                     .findFirst()
                     .ifPresent(var2x -> this.repository.entities.put((EntityType<?>)var2x, var1x.color))
               );
         }
      } catch (IOException var9) {
         throw new Helper122(String.format("Failed to load %s from file", this.getName()), var9);
      } catch (JsonSyntaxException var10) {
         throw new Helper122(String.format("JSON syntax error, %s config cannot be loaded", this.getName()), var10);
      } catch (JsonIOException var11) {
         throw new Helper122(String.format("JSON IO error, %s config cannot be loaded", this.getName()), var11);
      }
   }
}
