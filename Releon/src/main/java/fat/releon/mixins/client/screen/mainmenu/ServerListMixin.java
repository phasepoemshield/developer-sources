package fat.releon.mixins.client.screen.mainmenu;

import com.llamalad7.mixinextras.sugar.Local;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.SelfDestruct;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.option.ServerList;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ServerList.class})
public class ServerListMixin {
   @Shadow
   @Final
   private List<ServerInfo> servers;

   public ServerListMixin() {
   }

   @Unique
   private static List<ServerInfo> sponsorServers() {
      return List.of();
   }

   @Inject(
      method = {"loadFile"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/option/ServerList;hiddenServers:Ljava/util/List;",
         ordinal = 0
      )}
   )
   private void loadFileHook(CallbackInfo var1) {
      if (!SelfDestruct.unhooked) {
         this.removeDuplicateSponsors();
         this.addMissingSponsors();
      }
   }

   @Redirect(
      method = {"saveFile"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/nbt/NbtList;add(Ljava/lang/Object;)Z",
         ordinal = 0
      )
   )
   private boolean saveFileHook(NbtList var1, Object var2, @Local(ordinal = 0) ServerInfo var3) {
      if (SelfDestruct.unhooked) {
         return var1.add((NbtElement)var2);
      } else {
         return this.isSponsorServer(var3) ? true : var1.add((NbtElement)var2);
      }
   }

   @Unique
   private void removeDuplicateSponsors() {
      HashSet var1 = new HashSet();

      for (ServerInfo var3 : sponsorServers()) {
         var1.add(var3.address.toLowerCase());
      }

      Iterator var6 = this.servers.iterator();
      HashSet var7 = new HashSet();

      while (var6.hasNext()) {
         ServerInfo var4 = (ServerInfo)var6.next();
         String var5 = var4.address.toLowerCase();
         if (var1.contains(var5)) {
            if (var7.contains(var5)) {
               var6.remove();
            } else {
               var7.add(var5);
            }
         }
      }
   }

   @Unique
   private void addMissingSponsors() {
      HashSet var1 = new HashSet();

      for (ServerInfo var3 : this.servers) {
         var1.add(var3.address.toLowerCase());
      }

      for (ServerInfo var5 : sponsorServers()) {
         if (!var1.contains(var5.address.toLowerCase())) {
            this.servers.add(var5);
         }
      }
   }

   @Unique
   private boolean isSponsorServer(ServerInfo var1) {
      for (ServerInfo var3 : sponsorServers()) {
         if (var3.address.equalsIgnoreCase(var1.address)) {
            return true;
         }
      }

      return false;
   }
}
