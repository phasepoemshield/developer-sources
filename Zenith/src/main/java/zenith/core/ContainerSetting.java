package zenith;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ContainerSetting extends Setting {
   private final List<Setting> IIIll1l1Illl11111Il1lI1lIII;
   private boolean Il1lIIl11111IlI1IlII1;

   public ContainerSetting(String s, Setting... al1i111illi1i1) {
      this(s, "", () -> true, al1i111illi1i1);
   }

   public ContainerSetting(String s, String s1, Setting... al1i111illi1i1) {
      this(s, s1, () -> true, al1i111illi1i1);
   }

   public ContainerSetting(String s, Supplier<Boolean> supplier, Setting... al1i111illi1i1) {
      this(s, "", supplier, al1i111illi1i1);
   }

   public ContainerSetting(String s, String s1, Supplier<Boolean> supplier, Setting... al1i111illi1i1) {
      super(s, s1);
      this.StringHolder_8(supplier);
      this.IIIll1l1Illl11111Il1lI1lIII = Lists.newArrayList(Arrays.asList(al1i111illi1i1));
      this.Il1lIIl11111IlI1IlII1 = false;
   }

   public <T extends Setting> T SocketFactoryHolder(int i) {
      return (T)this.IIIll1l1Illl11111Il1lI1lIII.get(i);
   }

   public void lI1Il11I1l1III11IIlI1lI1II11I() {
      this.Il1lIIl11111IlI1IlII1 = !this.Il1lIIl11111IlI1IlII1;
   }

   private void StringHolder_8(Consumer<Setting> consumer) {
      this.IIIll1l1Illl11111Il1lI1lIII.forEach(consumer);
   }

   @Override
   public void safe(JsonObject jsonobject) {
      this.StringHolder_8(l1i111illi1i1 -> l1i111illi1i1.safe(jsonobject));
   }

   @Override
   public void load(JsonObject jsonobject) {
      this.StringHolder_8(l1i111illi1i1 -> {
         if (jsonobject.has(l1i111illi1i1.getName())) {
            l1i111illi1i1.load(jsonobject);
         }
      });
   }

   public List<Setting> getSettings() {
      return this.IIIll1l1Illl11111Il1lI1lIII;
   }

   public boolean l1l11lIIlIlll1llI() {
      return this.Il1lIIl11111IlI1IlII1;
   }
}
