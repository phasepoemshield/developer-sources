package l;

import fat.releon.Releon;
import net.minecraft.client.MinecraftClient;

public class Helper242 extends Helper263 implements Helper160 {
   private final String name;
   private final String visibleName;
   private final Helper269 category;
   private final Helper467 animation = new Animation2().method5003(175).method5004(1.0);
   private int key = -1;
   private int type = 1;
   private boolean favorite;
   public boolean state;

   public Helper242(String var1, Helper269 var2) {
      this.name = var1;
      this.category = var2;
      this.visibleName = var1;
   }

   public Helper242(String var1, String var2, Helper269 var3) {
      this.name = var1;
      this.visibleName = var2;
      this.category = var3;
   }

   public void switchState() {
      this.setState(!this.state);
   }

   public void setState(boolean var1) {
      this.animation.method4997(var1 ? Helper450.FORWARDS : Helper450.BACKWARDS);
      if (var1 != this.state) {
         this.state = var1;
         this.handleStateChange();
      }
   }

   private void handleStateChange() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      float var2 = Hud.method1824().method1825();
      if (var1.player != null && var1.world != null) {
         if (this.state) {
            if (Hud.method1824().notificationSettings.method2588("Module Switch")) {
               Notifications.method1666().method1672(this.visibleName, true, 2000L, null);
               Helper56.method646(Helper56.ENABLE_MODULE, var2, 1.0F);
            }

            this.activate();
         } else {
            if (Hud.method1824().notificationSettings.method2588("Module Switch")) {
               Notifications.method1666().method1672(this.visibleName, false, 2000L, null);
               Helper56.method646(Helper56.DISABLE_MODULE, var2, 1.0F);
            }

            this.deactivate();
         }
      }

      this.toggleSilent(this.state);
   }

   private void toggleSilent(boolean var1) {
      Helper124 var2 = Releon.method71().method15();
      if (var1) {
         var2.method1016(this);
      } else {
         var2.method1018(this);
      }
   }

   public void activate() {
   }

   public void deactivate() {
   }

   public boolean isEnabled() {
      return this.state;
   }

   public String getName() {
      return this.name;
   }

   public String getVisibleName() {
      return this.visibleName;
   }

   public Helper269 getCategory() {
      return this.category;
   }

   public Helper467 getAnimation() {
      return this.animation;
   }

   public int getKey() {
      return this.key;
   }

   public int getType() {
      return this.type;
   }

   public boolean isFavorite() {
      return this.favorite;
   }

   public boolean isState() {
      return this.state;
   }

   public void setKey(int var1) {
      this.key = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setFavorite(boolean var1) {
      this.favorite = var1;
   }
}
