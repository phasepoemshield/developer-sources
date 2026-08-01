package l;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;

public class Helper263 implements Helper254 {
   private final List<Helper264> settings = Lists.newArrayList();

   public Helper263() {
   }

   @Override
   public final void setup(Helper264... var1) {
      this.settings.addAll(Arrays.asList(var1));
   }

   public Helper264 get(String var1) {
      return this.settings.stream().filter(var1x -> var1x.getName().equalsIgnoreCase(var1)).findFirst().orElse(null);
   }

   public List<Helper264> settings() {
      return this.settings;
   }
}
