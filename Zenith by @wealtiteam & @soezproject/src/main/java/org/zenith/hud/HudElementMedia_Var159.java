package org.zenith.hud;

import org.zenith.ZenithClient;
import org.zenith.core.Easing;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.AnalyticsTracker;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;

import net.minecraft.text.Text;

public class HudElementMedia_Var159 {
   public Text text4;
   public String name;
   public boolean boolean110;
   public HudElementMedia_Var165 var140Var165;

   public Text int440() {
      return this.text4;
   }

   public String getName() {
      return this.name;
   }

   public boolean int441() {
      return this.boolean110;
   }

   public HudElementMedia_Var165 int442() {
      return this.var140Var165;
   }

   public void Easing(Text var1) {
      this.text4 = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public void AnalyticsTracker(boolean var1) {
      this.boolean110 = var1;
   }

   public void on23(HudElementMedia_Var165 var1) {
      this.var140Var165 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HudElementMedia_Var159 l11i1l1l11l111iil1_ii1il11l111ii11iil)) {
         return false;
      } else if (!l11i1l1l11l111iil1_ii1il11l111ii11iil.canEqual(this)) {
         return false;
      } else if (this.int441() != l11i1l1l11l111iil1_ii1il11l111ii11iil.int441()) {
         return false;
      } else {
         Text text = this.int440();
         Text text1 = l11i1l1l11l111iil1_ii1il11l111ii11iil.int440();
         if (text == null ? text1 == null : text.equals(text1)) {
            String s = this.getName();
            String s1 = l11i1l1l11l111iil1_ii1il11l111ii11iil.getName();
            if (s == null ? s1 == null : s.equals(s1)) {
               HudElementMedia_Var165 l11i1l1l11l111iil1_illi1l1l1x = this.int442();
               l11i1l1l11l111iil1_illi1l1l1x = l11i1l1l11l111iil1_ii1il11l111ii11iil.int442();
               return l11i1l1l11l111iil1_illi1l1l1x == null
                  ? l11i1l1l11l111iil1_illi1l1l1x == null
                  : l11i1l1l11l111iil1_illi1l1l1x.equals(l11i1l1l11l111iil1_illi1l1l1x);
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof HudElementMedia_Var159;
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      int i = 1;
      i = i * 59 + (this.int441() ? 79 : 97);
      Text text = this.int440();
      i = i * 59 + (text == null ? 43 : text.hashCode());
      String s = this.getName();
      i = i * 59 + (s == null ? 43 : s.hashCode());
      HudElementMedia_Var165 l11i1l1l11l111iil1_illi1l1l1 = this.int442();
      return i * 59 + (l11i1l1l11l111iil1_illi1l1l1 == null ? 43 : l11i1l1l11l111iil1_illi1l1l1.hashCode());
   }

   @Override
   public String toString() {
      return "StaffComponent.Staff(prefix="
         + this.int440()
         + ", name="
         + this.getName()
         + ", isSpec="
         + this.int441()
         + ", status="
         + this.int442()
         + ")";
   }

   public HudElementMedia_Var159(Text var1, String var2, boolean var3, HudElementMedia_Var165 var4) {
      this.text4 = var1;
      this.name = var2;
      this.boolean110 = var3;
      this.var140Var165 = var4;
   }
}
