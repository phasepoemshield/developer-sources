package sg.mx;

import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.UserApiService.UserProperties;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.network.SocialInteractionsManager;
import net.minecraft.client.session.ProfileKeys;
import net.minecraft.client.session.Session;
import net.minecraft.client.session.report.AbuseReportContext;
import net.minecraft.client.session.telemetry.TelemetryManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MinecraftClient.class)
public interface MinecraftAccessor {
   @Accessor("currentFps")
   static int getDebugFPS() {
      throw new AssertionError();
   }

   @Accessor("framebuffer")
   Framebuffer getMainFramebuffer();

   @Accessor("itemUseCooldown")
   void setItemUseCooldown(int var1);

   @Accessor("session")
   @Mutable
   void setUser(Session var1);

   @Accessor("userApiService")
   @Mutable
   void setService(UserApiService var1);

   @Accessor("sessionService")
   @Mutable
   void setSessionService(MinecraftSessionService var1);

   @Accessor("gameProfileFuture")
   @Mutable
   void setGameProfileFuture(CompletableFuture<ProfileResult> var1);

   @Accessor("userPropertiesFuture")
   @Mutable
   void setUserPropertiesFuture(CompletableFuture<UserProperties> var1);

   @Accessor("socialInteractionsManager")
   @Mutable
   void setFilter(SocialInteractionsManager var1);

   @Accessor("profileKeys")
   @Mutable
   void setProfileKeys(ProfileKeys var1);

   @Accessor("abuseReportContext")
   @Mutable
   void setAbuseReportContext(AbuseReportContext var1);

   @Accessor("telemetryManager")
   @Mutable
   void setTelemetryManager(TelemetryManager var1);

   @Accessor("authenticationService")
   YggdrasilAuthenticationService getAuthenticationService();
}
