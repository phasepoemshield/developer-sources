package org.zenith.setting;

import org.zenith.ZenithClient;
import org.zenith.core.EmotePlayback;
import org.zenith.core.Easing;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BotFeatureRegistry;


import java.util.Objects;

public class ModeSetting3_Var159 {
   public final ModeSetting3 modeSetting33;
   public final String string33;
   public final String string34;

   public ModeSetting3_Var159(ModeSetting3 var1, String var2) {
      this.modeSetting33 = var1;
      this.string33 = var2;
      this.string34 = "";
      if (var1.values.isEmpty()) {
         this.int210();
      }

      var1.values.add(this);
   }

   public ModeSetting3_Var159(ModeSetting3 var1, String var2, String var3) {
      this.modeSetting33 = var1;
      this.string33 = var2;
      this.string34 = var3;
      if (var1.values.isEmpty()) {
         this.int210();
      }

      var1.values.add(this);
   }

   public String getName() {
      return ZenithClient.on23().Easing().translate(this.string33);
   }

   public ModeSetting3_Var159 int210() {
      this.modeSetting33.setValue(this);
      return this;
   }

   public boolean isSelected() {
      return this.modeSetting33.getValue() == this;
   }

   @Override
   public String toString() {
      return this.string33;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 != null && var1.getClass() == this.getClass()) {
         ModeSetting3_Var159 ill11ii1ilil1liili1iliil_ii1il11l111ii11iil = (ModeSetting3_Var159)var1;
         return Objects.equals(this.modeSetting33, ill11ii1ilil1liili1iliil_ii1il11l111ii11iil.modeSetting33)
            && Objects.equals(this.string33, ill11ii1ilil1liili1iliil_ii1il11l111ii11iil.string33)
            && Objects.equals(this.string34, ill11ii1ilil1liili1iliil_ii1il11l111ii11iil.string34);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.modeSetting33, this.string33, this.string34);
   }

   public ModeSetting3 int211() {
      return this.modeSetting33;
   }

   public String getKey() {
      return this.string33;
   }

   public String getDescription() {
      return this.string34;
   }
}
