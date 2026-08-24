package org.zenith.base.filemanager.impl.way;

import org.zenith.core.ItemServiceBase;
import org.zenith.core.TextScanner;
import org.zenith.event.Event19;
import org.zenith.event.Event49;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.RefreshCacheEvent;
import org.zenith.module.Bot;
import org.zenith.module.InventorySetting;
import org.zenith.module.Module;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.module.EntityESP;
import org.zenith.module.Interface;

import org.zenith.event.EventRender2;
import org.zenith.event.GameMessageEvent;

import org.zenith.util.ArgbColor;
import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.style.GuiStyle;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.module.EntityESP;
import org.zenith.event.EventRender2;
import org.zenith.event.GameMessageEvent;
import org.zenith.module.Interface;
import org.zenith.util.Item;
import org.zenith.util.MathUtils;
import org.zenith.ZenithClient;
import org.zenith.render.ScreenProjection;
import org.zenith.render.ShapeRenderer;
import org.zenith.utility.render.display.base.CustomDrawContext;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.ClientProvider;
import org.zenith.core.StyledTextBuilder;

















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class WayManager extends Item<Way> implements ClientProvider {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final Pattern CHAT_COORDS_PATTERN = Pattern.compile("(-?\\d+)[,\\s]+(-?\\d+)[,\\s]+(-?\\d+)");
   public int pendingEventMessages;

   public WayManager() {
      super("way", "", new WayManager_1().getType(), ArrayList::new);
      EventManager.register(this);
   }

   @Override
   protected Gson createGson() {
      return new GsonBuilder().registerTypeAdapter(Way.class, new WayAdapter()).create();
   }

   public boolean isEmpty() {
      return this.items.isEmpty();
   }

   public void addWay(Way var1) {
      this.items.add(var1);
   }

   public void addWay(String var1, BlockPos var2, String var3) {
      this.items.add(new Way(var1, var2, var3));
   }

   public Way getWay(String var1) {
      return this.items.stream().filter(var1x -> var1x.name().equalsIgnoreCase(var1)).findAny().orElse(null);
   }

   public boolean hasWay(String var1) {
      return this.items.stream().anyMatch(var1x -> var1x.name().equalsIgnoreCase(var1));
   }

   public void deleteWay(String var1) {
      this.items.removeIf(var1x -> var1x.name().equalsIgnoreCase(var1));
   }

   public void clearList() {
      if (!this.isEmpty()) {
         this.items.clear();
      }
   }

   public void startEventCapture() {
      this.pendingEventMessages = 2;
   }

   @EventTarget
   public void onChatReceive(GameMessageEvent var1) {
      if (this.pendingEventMessages > 0) {
         this.pendingEventMessages--;
         this.onCheckMessage(var1.InventorySetting().getString());
      }
   }

   public void onCheckMessage(String var1) {
      Matcher matcher = CHAT_COORDS_PATTERN.matcher(var1);
      if (matcher.find()) {
         int i = Integer.parseInt(matcher.group(1));
         int j = Integer.parseInt(matcher.group(2));
         int k = Integer.parseInt(matcher.group(3));
         this.deleteWay("event");
         this.addWay(new Way("event", new BlockPos(i, j, k), this.getCurrentServer()));
         StyledTextBuilder.RefreshCacheEvent(
            "\u0422\u043e\u0447\u043a\u0430 event \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0430: " + i + " " + j + " " + k
         );
         this.pendingEventMessages = 0;
      }
   }

   public String getCurrentServer() {
      return minecraftClient3.getNetworkHandler() != null && minecraftClient3.getNetworkHandler().getServerInfo() != null
         ? minecraftClient3.getNetworkHandler().getServerInfo().address
         : "VANILLA";
   }

   @EventTarget
   public void onDraw(EventRender2 var1) {
      if (!this.isEmpty() && minecraftClient3.world != null) {
         this.items
            .forEach(
               var2 -> {
                  Vec3d vec3d = var2.pos().toCenterPos();
                  Vec3d vec3d1 = ScreenProjection.Event19(vec3d);
                  if (ScreenProjection.Event49(vec3d)
                     && var2.server()
                        .equalsIgnoreCase(
                           minecraftClient3.getNetworkHandler() != null && minecraftClient3.getNetworkHandler().getServerInfo() != null
                              ? minecraftClient3.getNetworkHandler().getServerInfo().address
                              : "VANILLA"
                        )) {
                     String s = (int)MathUtils.ItemServiceBase(
                           minecraftClient3.getEntityRenderDispatcher().camera.getPos().distanceTo(vec3d), 1.0
                        )
                        + "m";
                     ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
                     Font font = Fonts.NEW_MEDIUM.getFont(8.0F);
                     float f = (float)GuiStyle.PADDING.intValue();
                     float f1 = font.height() + (float)GuiStyle.PADDING.intValue() + 1.0F;
                     float f2 = f + font.width(var2.name()) + f + font.width(s) + f + f / 2.0F;
                     float f3 = (float)(vec3d1.getX() - (double)(f2 / 2.0F));
                     float f4 = (float)(vec3d1.getY() - (double)(f1 / 2.0F));
                     this.pushCenteredScale(var1.Bot(), (float)vec3d1.x, (float)vec3d1.y, 1.0F, 1.0F);
                     org.zenith.utility.render.display.base.CornerRadius ii1il11l111ii11iil = org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(
                        Interface.float212() * 0.6F
                     );
                     ShapeRenderer.on23(
                        var1.Bot().getMatrices(),
                        f3,
                        f4,
                        f2,
                        f1,
                        22.0F,
                        ii1il11l111ii11iil,
                        ArgbColor.var11934,
                        EntityESP.entityESP.float369().isEnabled()
                           && EntityESP.entityESP.float369().isVisible(),
                        EntityESP.entityESP.zClass026().isEnabled()
                           && EntityESP.entityESP.zClass026().isVisible()
                     );
                     var1.Bot().drawRoundedRect(f3, f4, f2, f1, ii1il11l111ii11iil, zenithstyle.getHudBackground().getColor());
                     float f5 = f4 + (f1 - 1.0F - font.height()) / 2.0F;
                     var1.Bot()
                        .drawRoundedRect(f3, f4, f + font.width(var2.name()) + f, f1, ii1il11l111ii11iil, zenithstyle.getHudBackground().getColor());
                     var1.Bot().drawText(font, var2.name(), f3 + f, f5, zenithstyle.getTextEnable().getColor());
                     var1.Bot()
                        .drawText(font, s, f3 + f + font.width(var2.name()) + f + f / 2.0F, f5, zenithstyle.getTextEnable().getColor());
                     this.pop(var1.Bot());
                  }
               }
            );
      }
   }

   public void pushCenteredScale(CustomDrawContext var1, float var2, float var3, float var4, float var5) {
      var1.pushMatrix();
      var1.getMatrices().translate(var2, var3, 0.0F);
      var1.getMatrices().scale(var4 * EntityESP.entityESP.getSize(), var5 * EntityESP.entityESP.getSize(), 1.0F);
      var1.getMatrices().translate(-var2, -var3, 0.0F);
   }

   public void pop(CustomDrawContext var1) {
      var1.popMatrix();
   }
}
