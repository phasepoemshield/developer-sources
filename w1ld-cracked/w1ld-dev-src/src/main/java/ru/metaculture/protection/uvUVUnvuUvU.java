package ru.metaculture.protection;

import java.util.UUID;
import net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2600;
import net.minecraft.class_2720;
import net.minecraft.class_2856;
import net.minecraft.class_310;
import net.minecraft.class_5912;
import net.minecraft.class_6860;
import net.minecraft.class_8674;
import net.minecraft.class_8675;
import net.minecraft.class_8733;
import net.minecraft.class_8736;
import net.minecraft.class_9053;
import net.minecraft.class_9095;
import net.minecraft.class_9129;
import net.minecraft.class_9151;
import net.minecraft.class_9247;
import net.minecraft.class_9812;
import net.minecraft.class_2856.class_2857;
import net.minecraft.class_5455.class_6890;
import net.minecraft.class_9095.class_10919;
import org.wild.mixin.acceser.ClientConfigurationNetworkHandlerAccessor;

public final class uvUVUnvuUvU extends class_8674 {
   private final vUNVNUnuv UuUVuuUu;

   public uvUVUnvuUvU(class_310 var1, class_2535 var2, class_8675 var3, vUNVNUnuv var4) {
      super(var1, var2, var3);
      this.UuUVuuUu = var4;
   }

   public void method_52794(class_8733 var1) {
      class_2600.method_11074(var1, this, this.field_45588);
      if (!nnVNNuuVUVn.uNNnnnuuuN(this.UuUVuuUu)) {
         nnVNNuuVUVn.uUnuvNvvNU(this.UuUVuuUu);
      } else {
         ClientConfigurationNetworkHandlerAccessor var2 = (ClientConfigurationNetworkHandlerAccessor)this;
         class_6890 var3 = this.UuUVuuUu(var2);
         class_8675 var4 = new class_8675(
            var2.wild$profile(),
            this.field_45592,
            var3,
            var2.wild$enabledFeatures(),
            this.field_45591,
            this.field_45590,
            this.field_45593,
            this.field_48399,
            var2.wild$chatState(),
            this.field_52154,
            this.method_72016()
         );
         this.UuUVuuUu.UuUVuuUu(var2.wild$profile());
         ClientConfigurationNetworkAddon var5 = ClientNetworkingImpl.getAddon(this);
         if (var5 != null) {
            var5.handleComplete();
         }

         nNnnNNnNVvUv var6 = new nNnnNNnNVvUv(this.field_45588, this.field_45589, var4, this.UuUVuuUu);
         this.UuUVuuUu.UuUVuuUu(var6);
         this.field_45589.method_56330(class_9095.field_48173.method_68874(class_9129.method_56350(var3)), var6);
         this.field_45589.method_10743(class_8736.field_48700);
         this.field_45589.method_56329(class_9095.field_48172.method_68875(class_9129.method_56350(var3), new class_10919() {
            public boolean method_68733() {
               return false;
            }
         }));
      }
   }

   public void method_52784(class_2720 var1) {
      UUID var2 = var1.comp_2158();
      this.field_45589.method_10743(new class_2856(var2, class_2857.field_13016));
      this.field_45589.method_10743(new class_2856(var2, class_2857.field_47704));
      this.field_45589.method_10743(new class_2856(var2, class_2857.field_13017));
      OCO0OoO.UuUVuuUu(this.UuUVuuUu, "resource pack auto-accepted (config)");
   }

   public void method_55512(class_9053 var1) {
   }

   public void method_56150(class_9151 var1) {
      this.field_45589.method_10747(class_2561.method_43471("disconnect.transfer"));
   }

   private class_6890 UuUVuuUu(ClientConfigurationNetworkHandlerAccessor var1) {
      class_9247 var2 = var1.wild$dataPackManager();
      if (var2 == null) {
         return var1.wild$clientRegistries().method_56585(class_5912.field_49043, var1.wild$registryManager(), this.field_45589.method_10756());
      } else {
         class_6860 var3 = var2.method_57046();

         class_6890 var4;
         try {
            var4 = var1.wild$clientRegistries().method_56585(var3, var1.wild$registryManager(), this.field_45589.method_10756());
         } catch (Throwable var7) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if (var3 != null) {
            var3.close();
         }

         return var4;
      }
   }

   public void method_10839(class_9812 var1) {
      String var2 = "config disconnected: " + var1.comp_2853().getString();
      nnVNNuuVUVn.UuUVuuUu(this.UuUVuuUu, var2);
      OCO0OoO.UuUVuuUu(this.UuUVuuUu, "§c" + var2);
      nnVNNuuVUVn.uUnuvNvvNU(this.UuUVuuUu);
   }
}
