package Nursultan;

import java.util.HashMap;
import java.util.Map;

public enum class11962 {
   REQUEST_LIST(1),
   REQUEST_CREATE(2),
   REQUEST_UPDATE(3),
   REQUEST_GET(4),
   REQUEST_DELETE(5),
   REQUEST_RENAME(6);

   public Integer fields_0d10ceb8f958139b3b4549c17b2a44419_0;
   public boolean fields_0d10ceb8f958139b3b4549c17b2a44419_init;
   public static Map staticFields_0d10ceb8f958139b3b4549c17b2a44419_6 = new HashMap();

   private class11962(int var3) {
      this.y();
      this.fields_0d10ceb8f958139b3b4549c17b2a44419_0 = var3;
   }

   static {
      class11962[] var0 = values();
      staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(var0[0].fields_0d10ceb8f958139b3b4549c17b2a44419_0, (class11962)var0[0]);
      staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(var0[1].fields_0d10ceb8f958139b3b4549c17b2a44419_0, (class11962)var0[1]);
      staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(var0[2].fields_0d10ceb8f958139b3b4549c17b2a44419_0, (class11962)var0[2]);
      staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(var0[3].fields_0d10ceb8f958139b3b4549c17b2a44419_0, (class11962)var0[3]);
      staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(var0[4].fields_0d10ceb8f958139b3b4549c17b2a44419_0, (class11962)var0[4]);
      staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(var0[5].fields_0d10ceb8f958139b3b4549c17b2a44419_0, (class11962)var0[5]);
   }

   private static void u() {
      REQUEST_LIST = null;
      REQUEST_CREATE = null;
      REQUEST_UPDATE = null;
      REQUEST_GET = null;
      REQUEST_DELETE = null;
      REQUEST_RENAME = null;
      staticFields_0d10ceb8f958139b3b4549c17b2a44419_6 = null;
   }

   private void y() {
      if (!this.fields_0d10ceb8f958139b3b4549c17b2a44419_init) {
         this.fields_0d10ceb8f958139b3b4549c17b2a44419_init = true;
         this.fields_0d10ceb8f958139b3b4549c17b2a44419_0 = 0;
      }
   }

   public static class11962 N(int var0) {
      return (class11962)staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.get(var0);
   }

   public int N() {
      return this.fields_0d10ceb8f958139b3b4549c17b2a44419_0;
   }
}
