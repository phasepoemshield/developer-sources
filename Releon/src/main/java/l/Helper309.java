package l;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

public final class Helper309 {
   public static final List<Helper190> friends = new ArrayList<>();

   public static void method3071(PlayerEntity var0) {
      method3072(var0.getName().getString());
   }

   public static void method3072(String var0) {
      friends.add(new Helper190(var0));
   }

   public static void method3073(PlayerEntity var0) {
      method3074(var0.getName().getString());
   }

   public static void method3074(String var0) {
      friends.removeIf(var1 -> var1.getName().equalsIgnoreCase(var0));
   }

   public static boolean method3075(Entity var0) {
      return var0 instanceof PlayerEntity var1 ? method3076(var1.getName().getString()) : false;
   }

   public static boolean method3076(String var0) {
      return friends.stream().anyMatch(var1 -> var1.getName().equals(var0));
   }

   public static void method3077() {
      friends.clear();
   }

   private Helper309() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static List<Helper190> method3078() {
      return friends;
   }
}
