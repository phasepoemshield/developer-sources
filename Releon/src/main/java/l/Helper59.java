package l;

import java.util.List;
import net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen;
import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import net.minecraft.client.gui.screen.ingame.SignEditScreen;
import net.minecraft.client.gui.screen.ingame.StructureBlockScreen;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

public final class Helper59 implements Helper160 {
   public static final List<KeyBinding> moveKeys = List.of(
      mc.options.forwardKey, mc.options.backKey, mc.options.leftKey, mc.options.rightKey, mc.options.jumpKey
   );
   public static final Helper159 script = new Helper159();
   public static final Helper159 postScript = new Helper159();
   private static final Helper242 INVENTORY_COMPONENT = method659();
   public static boolean canMove = true;

   public static void method654() {
      script.method1315();
   }

   public static void method655() {
      postScript.method1315();
   }

   public static void method656(Helper379 var0) {
      if (!canMove) {
         var0.method3766();
      }
   }

   public static void method657(Runnable var0) {
      if (script.method1317() && Helper165.method1351()) {
         String var1 = Helper128.server;
         switch (var1) {
            case "FunTime":
               script.method1314().method1307(0, () -> {
                  method660();
                  method658();
               }).method1307(0, () -> {
                  var0.run();
                  method661();
               });
               return;
            case "ReallyWorld":
               if (mc.player.isOnGround()) {
                  script.method1314()
                     .method1307(0, Helper59::method660)
                     .method1307(2, Helper59::method658)
                     .method1307(3, var0::run)
                     .method1307(0, Helper59::method661);
                  return;
               }
               break;
            case "SpookyTime":
            case "CopyTime":
               script.method1314().method1307(0, () -> {
                  method660();
                  method658();
               }).method1307(0, var0::run).method1307(0, Helper59::method661);
               return;
         }
      }

      script.method1307(0, Helper59::method658);
      postScript.method1314().method1307(0, () -> {
         var0.run();
         Helper66.method701(true);
      });
   }

   private static void method658() {
      Helper351.INSTANCE.method3502(Helper349.method3473(), Helper334.DEFAULT, Helper153.HIGH_IMPORTANCE_3, INVENTORY_COMPONENT);
   }

   private static Helper242 method659() {
      Helper242 var0 = new Helper242("InventoryComponent", "Inventory Component", Helper269.PLAYER);
      var0.state = true;
      return var0;
   }

   public static void method660() {
      canMove = false;
      method662();
   }

   public static void method661() {
      Helper66.method701(true);
      canMove = true;
      method663();
   }

   public static void method662() {
      moveKeys.forEach(var0 -> var0.setPressed(false));
   }

   public static void method663() {
      moveKeys.forEach(var0 -> var0.setPressed(InputUtil.isKeyPressed(mc.getWindow().getHandle(), var0.getDefaultKey().getCode())));
   }

   public static boolean method664() {
      return mc.currentScreen != null
         && !Helper38.method548(mc.currentScreen)
         && !(mc.currentScreen instanceof SignEditScreen)
         && !(mc.currentScreen instanceof AnvilScreen)
         && !(mc.currentScreen instanceof AbstractCommandBlockScreen)
         && !(mc.currentScreen instanceof StructureBlockScreen)
         && !(mc.currentScreen instanceof Widget16);
   }

   private Helper59() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
