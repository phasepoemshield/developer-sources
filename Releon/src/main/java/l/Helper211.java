package l;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Helper211 {
   private static final Logger log = LogManager.getLogger(Helper211.class);

   public Helper211() {
   }

   public static void method1807(Object var0) {
      log.info("\u001b[0;30m\u001b[42m" + var0 + "\u001b[0m");
   }

   public static void method1808(Object var0, Throwable var1) {
      log.info("\u001b[0;30m\u001b[42m" + var0 + "\u001b[0m", var1);
   }

   public static void method1809(Object var0, Object var1) {
      log.info("\u001b[0;30m\u001b[42m" + var0 + "\u001b[0m", var1);
   }

   public static void method1810(Object var0) {
      log.warn("\u001b[0;30m\u001b[43m" + var0 + "\u001b[0m");
   }

   public static void method1811(Object var0, Throwable var1) {
      log.warn("\u001b[0;30m\u001b[43m" + var0 + "\u001b[0m", var1);
   }

   public static void method1812(Object var0, Object var1) {
      log.warn("\u001b[0;30m\u001b[43m" + var0 + "\u001b[0m", var1);
   }

   public static void method1813(Object var0) {
      log.error("\u001b[0;30m\u001b[41m" + var0 + "\u001b[0m");
   }

   public static void method1814(Object var0, Throwable var1) {
      log.error("\u001b[0;30m\u001b[41m" + var0 + "\u001b[0m", var1);
   }

   public void method1815(Object var1, Object var2) {
      log.error("\u001b[0;30m\u001b[41m" + var1 + "\u001b[0m", var2);
   }
}
