package org.zenith.base.bot.net;

import org.zenith.module.Bot;
import org.zenith.module.Debug;

import org.zenith.event.Event20;

import org.zenith.base.bot.client.BotClient;
import org.zenith.event.Event20;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;














import com.mojang.logging.LogUtils;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import net.minecraft.network.DisconnectionInfo;
import net.minecraft.network.NetworkThreadUtils;
import net.minecraft.network.listener.ClientCommonPacketListener;
import net.minecraft.network.packet.BrandCustomPayload;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.UnknownCustomPayload;
import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;
import net.minecraft.network.packet.c2s.common.CookieResponseC2SPacket;
import net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket.Status;
import net.minecraft.network.packet.s2c.common.CommonPingS2CPacket;
import net.minecraft.network.packet.s2c.common.CookieRequestS2CPacket;
import net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket;
import net.minecraft.network.packet.s2c.common.CustomReportDetailsS2CPacket;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket;
import net.minecraft.network.packet.s2c.common.ResourcePackRemoveS2CPacket;
import net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket;
import net.minecraft.network.packet.s2c.common.ServerLinksS2CPacket;
import net.minecraft.network.packet.s2c.common.ServerTransferS2CPacket;
import net.minecraft.network.packet.s2c.common.StoreCookieS2CPacket;
import net.minecraft.server.ServerLinks;
import net.minecraft.server.ServerLinks.Entry;
import net.minecraft.server.ServerLinks.StringifiedEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import org.slf4j.Logger;

public abstract class BotCommonHandler implements ClientCommonPacketListener {
   public static final Logger LOGGER = LogUtils.getLogger();
   protected final BotClient client;
   protected final BotConnection connection;
   protected final Map<Identifier, byte[]> serverCookies;
   protected String brand;
   protected Map<String, String> customReportDetails;
   protected ServerLinks serverLinks;

   protected BotCommonHandler(BotClient var1, BotConnection var2, BotConnectionState var3) {
      this.client = var1;
      this.connection = var2;
      this.brand = var3.brand();
      this.serverCookies = var3.serverCookies();
      this.customReportDetails = var3.customReportDetails();
      this.serverLinks = var3.serverLinks();
   }

   @Override
   public boolean isConnectionOpen() {
      return this.connection.isOpen();
   }

   final void firePacketEvent(Packet<?> var1) {
      this.client.getEventBus().call(new Event20(this.client, var1));
   }

   @Override
   public void onPacketException(Packet packet, Exception exception) {
      LOGGER.error(
         "Bot {} failed to handle packet {}, disconnecting", this.client.getName(), packet == null ? "null" : packet.getClass().getSimpleName(), exception
      );
      this.connection.disconnect(Text.translatable("disconnect.packetError"));
   }

   @Override
   public void onKeepAlive(KeepAliveS2CPacket packet) {
      this.sendPacket(new KeepAliveC2SPacket(packet.getId()));
   }

   @Override
   public void onPing(CommonPingS2CPacket packet) {
      NetworkThreadUtils.forceMainThread(packet, this, this.client);
      this.sendPacket(new CommonPongC2SPacket(packet.getParameter()));
   }

   @Override
   public void onCustomPayload(CustomPayloadS2CPacket packet) {
      CustomPayload custompayload = packet.payload();
      if (!(custompayload instanceof UnknownCustomPayload)) {
         NetworkThreadUtils.forceMainThread(packet, this, this.client);
         if (custompayload instanceof BrandCustomPayload brandcustompayload) {
            this.brand = brandcustompayload.brand();
         } else {
            this.onCustomPayload(custompayload);
         }
      }
   }

   protected void onCustomPayload(CustomPayload var1) {
      LOGGER.debug("Bot {} ignored custom payload {}", this.client.getName(), var1.getId().id());
   }

   @Override
   public void onDisconnect(DisconnectS2CPacket packet) {
      this.connection.disconnect(packet.reason());
   }

   @Override
   public void onResourcePackSend(ResourcePackSendS2CPacket packet) {
      this.connection.send(new ResourcePackStatusC2SPacket(packet.id(), Status.ACCEPTED));
      this.connection.send(new ResourcePackStatusC2SPacket(packet.id(), Status.DOWNLOADED));
      this.connection.send(new ResourcePackStatusC2SPacket(packet.id(), Status.SUCCESSFULLY_LOADED));
   }

   @Override
   public void onResourcePackRemove(ResourcePackRemoveS2CPacket packet) {
   }

   @Override
   public void onCookieRequest(CookieRequestS2CPacket packet) {
      NetworkThreadUtils.forceMainThread(packet, this, this.client);
      this.connection.send(new CookieResponseC2SPacket(packet.key(), this.serverCookies.get(packet.key())));
   }

   @Override
   public void onStoreCookie(StoreCookieS2CPacket packet) {
      NetworkThreadUtils.forceMainThread(packet, this, this.client);
      this.serverCookies.put(packet.key(), packet.payload());
   }

   @Override
   public void onCustomReportDetails(CustomReportDetailsS2CPacket packet) {
      NetworkThreadUtils.forceMainThread(packet, this, this.client);
      this.customReportDetails = packet.details();
   }

   @Override
   public void onServerLinks(ServerLinksS2CPacket packet) {
      NetworkThreadUtils.forceMainThread(packet, this, this.client);
      var arraylist = new ArrayList(packet.links().size());

      for (StringifiedEntry stringifiedentry : packet.links()) {
         try {
            URI uri = Util.validateUri(stringifiedentry.link());
            arraylist.add(new Entry(stringifiedentry.type(), uri));
         } catch (Exception exception) {
            LOGGER.warn("Bot {} received invalid server link {}: {}", this.client.getName(), stringifiedentry.type(), stringifiedentry.link());
         }
      }

      this.serverLinks = new ServerLinks(arraylist);
   }

   @Override
   public void onServerTransfer(ServerTransferS2CPacket packet) {
      this.connection.disconnect(Text.literal("Bot transfer not supported"));
   }

   @Override
   public void onDisconnected(DisconnectionInfo info) {
      this.client.onConnectionTerminated(info);
   }

   public void sendPacket(Packet<?> var1) {
      if (this.connection.getPacketListener() == this) {
         this.connection.send(var1);
      }
   }

   public String getBrand() {
      return this.brand == null ? "" : this.brand;
   }

   public BotConnection getConnection() {
      return this.connection;
   }
}
