package l;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.util.Identifier;

public class Helper109 {
   private String name = "?";
   private Identifier dataIdentifer;
   private Identifier atlasIdentifier;

   Helper109() {
   }

   public Helper109 method935(String var1) {
      this.name = var1;
      return this;
   }

   public Helper109 method936(String var1) {
      this.dataIdentifer = Identifier.of("mre", "fonts/" + var1 + ".json");
      return this;
   }

   public Helper109 method937(String var1) {
      this.atlasIdentifier = Identifier.of("mre", "fonts/" + var1 + ".png");
      return this;
   }

   public Helper110 method938() {
      Helper52 var1 = Helper134.method1172(this.dataIdentifer, Helper52.class);
      AbstractTexture var2 = MinecraftClient.getInstance().getTextureManager().getTexture(this.atlasIdentifier);
      if (var1 == null) {
         throw new RuntimeException(
            "Failed to read font data file: " + this.dataIdentifer.toString() + "; Are you sure this is json file? Try to check the correctness of its syntax."
         );
      } else {
         RenderSystem.recordRenderCall(() -> var2.setFilter(true, false));
         Helper51 var3 = var1.method624();
         Helper48 var4 = var1.method625();
         if (var3 != null && var4 != null && var1.method626() != null && var1.method627() != null) {
            float var5 = Math.max(1.0F, var3.method622());
            float var6 = Math.max(1.0F, var3.method623());
            Map var7 = var1.method626().stream().collect(Collectors.toMap(var0 -> var0.method606(), var2x -> new Helper61(var2x, var5, var6)));
            HashMap<Integer, java.util.Map<Integer, Float>> var8 = new HashMap<>();
            var1.method627().forEach(var1x -> {
               java.util.Map<Integer, Float> var2x = var8.get(var1x.method618());
               if (var2x == null) {
                  var2x = new HashMap<>();
                  var8.put(var1x.method618(), var2x);
               }

               var2x.put(var1x.method619(), var1x.method620());
            });
            return new Helper110(this.name, var2, var3, var4, var7, var8);
         } else {
            System.err.println("[MSDF] Invalid font data detected for " + this.dataIdentifer + "; using empty fallback font.");
            return new Helper110(this.name, var2, new Helper51(), new Helper48(), new HashMap<>(), new HashMap<>());
         }
      }
   }
}
