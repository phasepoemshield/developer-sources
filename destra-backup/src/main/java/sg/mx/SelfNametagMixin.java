package sg.mx;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.core.DestraClient;
import ru.destra.font.FontManager;
import ru.destra.font.FontRenderer;
import ru.destra.misc.NamedTimestampEntry;
import ru.destra.misc.TimerEntry;
import ru.destra.module.SocialsModule;
import ru.destra.render.GuiRenderUtil;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(EntityRenderer.class)
public abstract class SelfNametagMixin<T extends Entity, S extends EntityRenderState> {
   private static final long NEGATIVE_ICON_CACHE_TTL_MS = 1500L;
   private static final long POSITIVE_ICON_CACHE_TTL_MS = 5000L;
   private static final long RESOLVED_NAME_CACHE_TTL_MS = 2000L;
   private static final int MAX_CACHE_SIZE = 512;
   private static final Map<String, TimerEntry> ICON_CHECK_CACHE = new HashMap<>();
   private static final Map<String, NamedTimestampEntry> RESOLVED_NAME_CACHE = new HashMap<>();
   private static long cachedUsersVersion = SelfNametagMixin.Ру;
   private static final String Рв;
   private static final String Рю;
   private static final float Рг;
   private static final float Рж;
   private static final long РЮ;
   private static final long Рл;
   private static final long Р4;
   private static final long Ру;

   @Shadow
   public abstract TextRenderer getTextRenderer();

   @Inject(method = "hasLabel", at = @At("HEAD"), cancellable = true)
   private void onHasLabel(Entity var1, double var2, CallbackInfoReturnable<Boolean> var4) {
      MinecraftClient var5 = MinecraftClient.getInstance();
      DestraClient var6 = DestraClient.getInstance();
      if (var5.player != null && var6 != null && var6.getModuleManager() != null && var6.getModuleManager().selfNametag != null) {
         if (var6.getModuleManager().selfNametag.Д() && var1.getId() == var5.player.getId() && !var5.player.isInvisible()) {
            var4.setReturnValue(true);
         }
      }
   }

   @Inject(
      method = "renderLabelIfPresent",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/font/TextRenderer;draw(Lnet/minecraft/text/Text;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/font/TextRenderer$TextLayerType;II)I",
         shift = Shift.BEFORE
      ),
      cancellable = true
   )
   public void drawTag(S var1, Text var2, MatrixStack var3, VertexConsumerProvider var4, int var5, CallbackInfo var6) {
      DestraClient var7 = DestraClient.getInstance();
      if (var7 != null && var7.getModuleManager() != null && var7.getModuleManager().socials.Д() && !var1.invisible) {
         if (this.isPrimaryNameLabel(var1, var2)) {
            MinecraftClient var8 = MinecraftClient.getInstance();
            if (var8.player != null && var8.getNetworkHandler() != null) {
               SocialsModule var9 = var7.getModuleManager().socials;
               if (var9 != null
                  && var9.socialsConnection != null
                  && var9.socialsConnection.isConnectedAndAuthenticated()
                  && var9.socialsConnection.hasOnlineUsers()) {
                  String var10 = var1.displayName != null ? var1.displayName.getString() : var2.getString();
                  String var11 = this.normalizeName(var10);
                  if (!var11.isEmpty()) {
                     long var12 = System.currentTimeMillis();
                     long var14 = var9.socialsConnection.getUserListRevision();
                     if (var14 != cachedUsersVersion) {
                        cachedUsersVersion = var14;
                        ICON_CHECK_CACHE.clear();
                        RESOLVED_NAME_CACHE.clear();
                     }

                     String var16 = var11.toLowerCase(Locale.ROOT);
                     TimerEntry var17 = ICON_CHECK_CACHE.get(var16);
                     if (var17 == null || var17.expiresAt <= var12) {
                        boolean var18 = var9.socialsConnection.isUserOnline(var11);
                        if (!var18) {
                           String var19 = this.resolveRealNickname(var8, var11, var12);
                           var18 = var19 != null && !var19.isEmpty() && var9.socialsConnection.isUserOnline(var19);
                        }

                        this.cacheIconCheck(var16, var18, var12);
                        if (var18) {
                           this.drawSocialIcon(var2, var3);
                        }
                     } else if (var17.active) {
                        this.drawSocialIcon(var2, var3);
                     }
                  }
               }
            }
         }
      }
   }

   private void drawSocialIcon(Text var1, MatrixStack var2) {
      TextRenderer var3 = this.getTextRenderer();
      float var4 = -var3.getWidth(var1) / 2.0F;
      int var5 = Рв.equals(var1.getString()) ? -10 : 0;
      RenderSystem.enableDepthTest();
      GuiRenderUtil.х(var2, (FontRenderer)FontManager.destraFont.get(), Рю, var4 - Рг, var5, -1, Рж);
   }

   private boolean isPrimaryNameLabel(S var1, Text var2) {
      if (var1.displayName != null && var2 != null) {
         String var3 = this.normalizeName(var2.getString());
         String var4 = this.normalizeName(var1.displayName.getString());
         return var3.equalsIgnoreCase(var4);
      } else {
         return false;
      }
   }

   private String resolveRealNickname(MinecraftClient var1, String var2, long var3) {
      if (var2 != null && !var2.isEmpty() && var1.getNetworkHandler() != null) {
         String var5 = var2.toLowerCase(Locale.ROOT);
         NamedTimestampEntry var6 = RESOLVED_NAME_CACHE.get(var5);
         if (var6 != null && var6.timestamp > var3) {
            return var6.name;
         }

         String var7 = var2;

         for (PlayerListEntry var9 : var1.getNetworkHandler().getPlayerList()) {
            if (var9 != null && var9.getProfile() != null) {
               String var10 = var9.getProfile().getName();
               if (var10 != null && var10.equalsIgnoreCase(var2)) {
                  var7 = var10;
                  break;
               }

               Text var11 = var9.getDisplayName();
               if (var11 != null && this.normalizeName(var11.getString()).equalsIgnoreCase(var2)) {
                  var7 = var10;
                  break;
               }
            }
         }

         if (RESOLVED_NAME_CACHE.size() > 512) {
            RESOLVED_NAME_CACHE.clear();
         }

         RESOLVED_NAME_CACHE.put(var5, new NamedTimestampEntry(var7, var3 + РЮ));
         return var7;
      } else {
         return null;
      }
   }

   private void cacheIconCheck(String var1, boolean var2, long var3) {
      if (ICON_CHECK_CACHE.size() > 512) {
         ICON_CHECK_CACHE.clear();
      }

      long var5 = var2 ? Рл : Р4;
      ICON_CHECK_CACHE.put(var1, new TimerEntry(var2, var3 + var5));
   }

   private String normalizeName(String var1) {
      if (var1 == null) {
         return "";
      }

      String var2 = Formatting.strip(var1);
      return var2 == null ? var1.trim() : var2.trim();
   }

   static {
      VMBridge.identifyClass(SelfNametagMixin.class, "ejOK9EXa");
   }
}
