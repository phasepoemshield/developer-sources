package org.zenith.core;

import org.zenith.event.PacketReceiveEvent;
import org.zenith.managers.CloudApi;
import org.zenith.managers.FriendFilter;
import org.zenith.module.Module;
import org.zenith.module.ModuleManager;
import org.zenith.util.ItemExt2;

import org.zenith.managers.EmoteRegistry;
import org.zenith.ZenithClient;

import org.zenith.module.AimAssist;
import org.zenith.module.AntiBot;
import org.zenith.module.Aura;
import org.zenith.module.AutoExplosion;
import org.zenith.module.AutoSwap;

import org.zenith.event.Event18Ext4;
import org.zenith.event.Event26;
import org.zenith.event.Event29;
import org.zenith.event.Event33;
import org.zenith.event.EventGetBasicProjectionMatrixHook;
import org.zenith.event.EventGetFogColorHook;
import org.zenith.event.EventImpl;
import org.zenith.event.EventPosHook;
import org.zenith.event.EventTick;
import org.zenith.event.EventTickEnd;
import org.zenith.event.FovEvent;
import org.zenith.event.ItemUseEvent;
import org.zenith.event.SprintEvent;
import org.zenith.event.SprintStateEvent;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.BooleanSetting2;
import org.zenith.setting.BooleanSetting3;
import org.zenith.setting.ColorSetting;
import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting2;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;
import org.zenith.setting.Setting;
import org.zenith.setting.StringSetting;
import org.zenith.setting.StringSetting2;





import java.util.List;
import java.util.UUID;
import net.minecraft.util.math.Vec3d;

public class CloudUserProfile {
   public final String BooleanSetting;
   public volatile String username;
   public volatile String role;
   public volatile BotFeatureRegistry StringSetting;
   public volatile InventoryUtils ColorSetting;
   public volatile long ModeSetting2;
   public volatile boolean HudInfoBoxPrimary;
   public volatile boolean StringSetting2;
   public volatile Vec3d ModeSetting3;
   public volatile Vec3d ModeSetting;
   public volatile long NumberSetting;
   public volatile long BooleanSetting2;
   public UUID BooleanSetting3;
   public String AimAssist = "";
   public String AntiBot = "";
   public UUID Aura;
   public final BooleanSetting AutoExplosion = new BooleanSetting("Render Cosmetics", true);
   public final BooleanSetting AutoSwap = new BooleanSetting("Render Inventory", true);

   public CloudUserProfile(String var1, String var2, String var3) {
      this.BooleanSetting = var1;
      this.username = var2 == null ? "" : var2;
      this.role = var3 == null ? "" : var3;
   }

   public String id() {
      return this.BooleanSetting;
   }

   public String username() {
      return this.username;
   }

   public String Event29() {
      return this.role;
   }

   public void setUsername(String var1) {
      this.username = var1 == null ? "" : var1;
   }

   public void setRole(String var1) {
      this.role = var1 == null ? "" : var1;
   }

   public BotFeatureRegistry Event26() {
      return this.StringSetting;
   }

   public InventoryUtils Event33() {
      return this.ColorSetting;
   }

   public long EventImpl() {
      return this.ModeSetting2;
   }

   public void UiAnimation(InventoryUtils var1) {
      this.ColorSetting = var1;
      this.ModeSetting2 = System.currentTimeMillis();
   }

   public void UiAnimation(BotFeatureRegistry var1) {
      this.StringSetting2 = false;
      this.ColorAnimator(var1);
      this.Easing(var1);
      if (var1 == null) {
         this.StringSetting = null;
         this.ModeSetting3 = null;
         this.ModeSetting = null;
         this.NumberSetting = 0L;
         this.BooleanSetting2 = 0L;
      } else {
         if (this.StringSetting != null && this.AutoExplosion.isEnabled()) {
            String s = var1.ServerConfigStore();
            String s1 = this.StringSetting.ServerConfigStore();
            if (!s.equals(s1)) {
               ZenithClient.on23().ItemServiceBase().on23(var1.uuid(), s);
            }
         }

         long i = System.currentTimeMillis();
         if (this.StringSetting != null && this.StringSetting.VisualSettingsStore() != null) {
            this.ModeSetting3 = this.StringSetting.VisualSettingsStore();
            this.ModeSetting = this.StringSetting.ItemStackStore();
            this.NumberSetting = this.BooleanSetting2;
         } else {
            this.ModeSetting3 = var1.VisualSettingsStore();
            this.ModeSetting = var1.ItemStackStore();
            this.NumberSetting = i;
         }

         this.BooleanSetting2 = i;
         this.StringSetting = var1;
      }
   }

   public void ItemUseEvent() {
      if (this.BooleanSetting3 != null) {
         UserdataManager.StringCodec(this.BooleanSetting3);
         this.BooleanSetting3 = null;
         this.AimAssist = "";
         this.AntiBot = "";
      }
   }

   public void Easing(BotFeatureRegistry var1) {
      if (var1 != null && var1.uuid() != null) {
         if (this.Aura != null && !this.Aura.equals(var1.uuid())) {
            EmoteRegistry.ItemSpec(this.Aura);
         }

         this.Aura = var1.uuid();
         EmoteRegistry.on23(var1.uuid(), var1.ModuleManager(), var1.CloudApi(), var1.FriendFilter());
      } else {
         this.SprintStateEvent();
      }
   }

   public void SprintStateEvent() {
      if (this.Aura != null) {
         EmoteRegistry.ItemSpec(this.Aura);
         this.Aura = null;
      }
   }

   public void ColorAnimator(BotFeatureRegistry var1) {
      if (var1 != null && this.AutoExplosion.isEnabled()) {
         UUID uuid = var1.uuid();
         String s = var1.ItemExt2() == null ? "" : var1.ItemExt2();
         String s1 = var1.UsageStatStore() == null ? "" : var1.UsageStatStore();
         if (uuid != null && (!s.isBlank() || !s1.isBlank())) {
            if (!uuid.equals(this.BooleanSetting3)) {
               this.ItemUseEvent();
            }

            this.BooleanSetting3 = uuid;
            if (!s.equals(this.AimAssist)) {
               if (s.isBlank()) {
                  UserdataManager.FileLogger(uuid);
                  this.AimAssist = "";
               } else {
                  UserdataManager.ColorAnimator(uuid, s);
                  if (UserdataManager.PotionItemBuilder(uuid)) {
                     this.AimAssist = s;
                  }
               }
            }

            if (!s1.equals(this.AntiBot)) {
               if (s1.isBlank()) {
                  UserdataManager.CloudApiClient(uuid);
                  this.AntiBot = "";
               } else {
                  UserdataManager.ItemRegistry(uuid, s1);
                  if (UserdataManager.ProfileItemBuilder(uuid)) {
                     this.AntiBot = s1;
                  }
               }
            }
         } else {
            this.ItemUseEvent();
         }
      } else {
         this.ItemUseEvent();
      }
   }

   public Vec3d Event18Ext4() {
      if (this.StringSetting != null && this.StringSetting.VisualSettingsStore() != null) {
         Vec3d vec3d = this.StringSetting.VisualSettingsStore();
         if (this.ModeSetting3 == null) {
            return vec3d;
         } else {
            long i = Math.max(1L, this.BooleanSetting2 - this.NumberSetting);
            double d0 = (double)(System.currentTimeMillis() - this.BooleanSetting2) / (double)i;
            if (d0 <= 0.0) {
               return this.ModeSetting3;
            } else {
               return d0 >= 1.0
                  ? vec3d
                  : new Vec3d(
                     this.ModeSetting3.x + (vec3d.x - this.ModeSetting3.x) * d0,
                     this.ModeSetting3.y + (vec3d.y - this.ModeSetting3.y) * d0,
                     this.ModeSetting3.z + (vec3d.z - this.ModeSetting3.z) * d0
                  );
            }
         }
      } else {
         return null;
      }
   }

   public Vec3d EventTick() {
      if (this.StringSetting != null && this.StringSetting.ItemStackStore() != null) {
         Vec3d vec3d = this.StringSetting.ItemStackStore();
         if (this.ModeSetting == null) {
            return vec3d;
         } else {
            long i = Math.max(1L, this.BooleanSetting2 - this.NumberSetting);
            double d0 = (double)(System.currentTimeMillis() - this.BooleanSetting2) / (double)i;
            if (d0 <= 0.0) {
               return this.ModeSetting;
            } else {
               return d0 >= 1.0
                  ? vec3d
                  : new Vec3d(
                     this.ModeSetting.x + (vec3d.x - this.ModeSetting.x) * d0,
                     this.ModeSetting.y + (vec3d.y - this.ModeSetting.y) * d0,
                     this.ModeSetting.z + (vec3d.z - this.ModeSetting.z) * d0
                  );
            }
         }
      } else {
         return null;
      }
   }

   public boolean EventTickEnd() {
      return this.HudInfoBoxPrimary;
   }

   public boolean EventGetBasicProjectionMatrixHook() {
      return this.StringSetting2;
   }

   public void ItemRegistry(BotFeatureRegistry var1) {
      BotFeatureRegistry ili1ll11li1ili11l1i1l11l1 = this.StringSetting;
      this.StringSetting2 = this.HudInfoBoxPrimary
         && var1 != null
         && ili1ll11li1ili11l1i1l11l1 != null
         && ColorAnimator(var1.PacketReceiveEvent(), ili1ll11li1ili11l1i1l11l1.PacketReceiveEvent())
         && ColorAnimator(var1.FriendStore(), ili1ll11li1ili11l1i1l11l1.FriendStore());
   }

   public static boolean ColorAnimator(String var0, String var1) {
      return var0 != null && var1 != null && !var0.isBlank() && !var1.isBlank() && var0.equalsIgnoreCase(var1);
   }

   @Override
   public String toString() {
      String s = this.role != null && !this.role.isEmpty() ? this.role : "USER";
      return this.BooleanSetting + " | " + this.username + " [" + s + "]";
   }

   public void SprintEvent() {
      this.HudInfoBoxPrimary = true;
   }

   public void EventPosHook() {
      this.HudInfoBoxPrimary = false;
      this.StringSetting2 = false;
      this.UiAnimation((BotFeatureRegistry)null);
      this.ColorSetting = null;
      this.ModeSetting2 = 0L;
   }

   public List<Setting> getSettings() {
      return List.of(this.AutoExplosion, this.AutoSwap);
   }

   public BooleanSetting EventGetFogColorHook() {
      return this.AutoExplosion;
   }

   public BooleanSetting FovEvent() {
      return this.AutoSwap;
   }
}
