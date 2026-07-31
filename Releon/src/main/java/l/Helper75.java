package l;

import java.util.ArrayList;
import java.util.List;

public class Helper75 {
   private final List<Helper119> draggable = new ArrayList<>();

   public Helper75() {
   }

   public void method786() {
      this.method787(
         new Armor(),
         new TargetHud(),
         new Potions(),
         new HotKeys(),
         new Watermark(),
         new Inventory(),
         new CoolDowns(),
         new StaffList(),
         new Binds(),
         new Notifications(),
         new PlayerInfo(),
         new MusicBar()
      );
   }

   public void method787(Helper119... var1) {
      this.draggable.addAll(List.of(var1));
   }

   public List<Helper119> method788() {
      return this.draggable;
   }

   public <T extends Helper119> T method789(String var1) {
      return this.draggable.stream().filter(var1x -> var1x.getName().equalsIgnoreCase(var1)).map(var0 -> (T)var0).findFirst().orElse(null);
   }

   public <T extends Helper119> T method790(Class<T> var1) {
      return this.draggable.stream().filter(var1x -> var1.isAssignableFrom(var1x.getClass())).map(var1::cast).findFirst().orElse(null);
   }
}
