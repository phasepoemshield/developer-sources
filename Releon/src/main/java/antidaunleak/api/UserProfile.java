package antidaunleak.api;

import antidaunleak.api.annotation.Native;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserProfile {
   private static final UserProfile instance = new UserProfile();
   private final Map<String, String> cache = new ConcurrentHashMap<>();
   private boolean nativeFailed = false;

   public static UserProfile getInstance() {
      return instance;
   }

   private UserProfile() {
      this.applyDefaults();
      this.loadNativeProfileAsync();
   }

   private void applyDefaults() {
      this.cache.put("username", "ReleonDLC");
      this.cache.put("hwid", "hwid-1231294809786-2348786");
      this.cache.put("role", "Admin");
      this.cache.put("uid", "228");
      this.cache.put("subTime", "2025-24-05");
   }

   private void loadNativeProfileAsync() {
      Thread var1 = new Thread(() -> {
         try {
            this.cache.put("username", this.getUsername());
            this.cache.put("hwid", this.getHwid());
            this.cache.put("role", this.getRole());
            this.cache.put("uid", this.getUid());
            this.cache.put("subTime", this.getSubsTime());
         } catch (Throwable var2) {
            this.nativeFailed = true;
         }
      }, "releon-userprofile-loader");
      var1.setDaemon(true);
      var1.start();
   }

   @Native(
      type = Native.Type.STANDARD
   )
   private native String getUsername();

   @Native(
      type = Native.Type.STANDARD
   )
   private native String getHwid();

   @Native(
      type = Native.Type.STANDARD
   )
   private native String getRole();

   @Native(
      type = Native.Type.STANDARD
   )
   private native String getUid();

   @Native(
      type = Native.Type.STANDARD
   )
   private native String getSubsTime();

   public String profile(String var1) {
      return this.cache.getOrDefault(var1, "");
   }
}
