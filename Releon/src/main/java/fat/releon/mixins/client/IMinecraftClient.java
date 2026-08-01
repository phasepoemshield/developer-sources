package fat.releon.mixins.client;

import com.mojang.authlib.minecraft.UserApiService;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.SocialInteractionsManager;
import net.minecraft.client.session.ProfileKeys;
import net.minecraft.client.session.Session;
import net.minecraft.client.session.report.AbuseReportContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({MinecraftClient.class})
public interface IMinecraftClient {
   @Accessor("itemUseCooldown")
   int getUseCooldown();

   @Accessor("itemUseCooldown")
   void setUseCooldown(int var1);

   @Invoker("doItemUse")
   void idoItemUse();

   @Invoker("doAttack")
   boolean idoAttack();

   @Invoker("disconnect")
   void invokeDisconnect(Screen var1, boolean var2);

   @Mutable
   @Accessor("profileKeys")
   void setProfileKeys(ProfileKeys var1);

   @Mutable
   @Accessor("session")
   void setSessionT(Session var1);

   @Mutable
   @Accessor
   void setUserApiService(UserApiService var1);

   @Mutable
   @Accessor("socialInteractionsManager")
   void setSocialInteractionsManagerT(SocialInteractionsManager var1);

   @Mutable
   @Accessor("abuseReportContext")
   void setAbuseReportContextT(AbuseReportContext var1);
}
