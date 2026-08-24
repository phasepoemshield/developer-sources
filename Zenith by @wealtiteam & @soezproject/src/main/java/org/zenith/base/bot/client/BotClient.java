package org.zenith.base.bot.client;

import org.zenith.module.Bot;
import org.zenith.module.Module;

import org.zenith.event.Event01;
import org.zenith.event.Event09;
import org.zenith.event.Event13;
import org.zenith.event.Event19;
import org.zenith.event.Event49;

import org.zenith.base.bot.modules.BotModuleManager;
import org.zenith.base.bot.net.BotConnection;
import org.zenith.base.bot.net.BotLoginHandler;
import org.zenith.base.bot.net.BotPlayHandler;
import org.zenith.base.bot.world.BotPlayer;
import org.zenith.base.bot.world.BotWorld;
import org.zenith.event.Event01;
import org.zenith.event.Event09;
import org.zenith.event.Event13;
import org.zenith.event.Event19;
import org.zenith.event.Event49;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;













import com.mojang.logging.LogUtils;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import net.minecraft.network.DisconnectionInfo;
import net.minecraft.network.packet.c2s.login.LoginHelloC2SPacket;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import net.minecraft.util.thread.ReentrantThreadExecutor;
import org.slf4j.Logger;

public final class BotClient extends ReentrantThreadExecutor<Runnable> {
   public static final Logger LOGGER = LogUtils.getLogger();
   public static final long TICK_LENGTH_MS = 50L;
   public static final int MAX_TICKS_PER_LOOP = 10;
   public static final long MAX_IDLE_PARK_NANOS = 2000000L;
   public static final DateTimeFormatter CHAT_TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");
   public static final int CHAT_LOG_LIMIT = 200;
   public final BotClientConfig config;
   public final BotClientEvents events;
   public final Thread thread;
   public final BotEventBus eventBus = new BotEventBus();
   public final BotModuleManager modules;
   public final BotRctService rct = new BotRctService(this);
   public final Deque<ChatMessage> chatLog = new ArrayDeque<>();
   public final List<String> sentMessages = new ArrayList<>();
   public final AtomicBoolean running = new AtomicBoolean(true);
   public final AtomicBoolean disconnectNotified = new AtomicBoolean();
   public final Object phaseLock = new Object();
   public final Object renderStateLock = new Object();
   public volatile long nextTickAtMs = Util.getMeasuringTimeMs();
   public volatile long lastTickEndMs = Util.getMeasuringTimeMs();
   public volatile BotPhase phase = BotPhase.CONNECTING;
   public volatile BotConnection connection;
   public volatile BotPlayHandler playHandler;
   public volatile BotWorld world;
   public volatile BotPlayer player;

   public BotClient(BotClientConfig var1, BotClientEvents var2) {
      super("BotClient/" + var1.name());
      this.config = var1;
      this.events = var2;
      this.modules = new BotModuleManager(this);
      this.thread = new Thread(this::run, "bot-client-" + var1.name());
      this.thread.setDaemon(true);
   }

   public static BotClient start(BotClientConfig var0, BotClientEvents var1) {
      BotClient botclient = new BotClient(var0, var1);
      botclient.thread.start();
      return botclient;
   }

   public void run() {
      try {
         BotConnection botconnection = BotConnection.connect(this.config.host(), this.config.port(), this.config.proxy(), this.config.protocolVersion());
         this.connection = botconnection;
         if (!this.running.get()) {
            botconnection.disconnect(Text.literal("connection cancelled"));
            return;
         }

         BotLoginHandler botloginhandler = new BotLoginHandler(this, botconnection);
         this.setPhase(BotPhase.LOGIN);
         botconnection.startLogin(this.config.host(), this.config.port(), botloginhandler);
         botconnection.send(new LoginHelloC2SPacket(this.config.name(), this.config.uuid()));
      } catch (Exception exception) {
         LOGGER.warn("Bot {} connect failed", this.config.name(), exception);
         this.finishDisconnect(Text.literal(describeFailure(exception)));
         return;
      }

      this.nextTickAtMs = Util.getMeasuringTimeMs();
      this.lastTickEndMs = this.nextTickAtMs;

      while (this.running.get()) {
         long j = Util.getMeasuringTimeMs();

         while (j < this.nextTickAtMs && this.runTask()) {
            j = Util.getMeasuringTimeMs();
         }

         if (j >= this.nextTickAtMs) {
            int i = 0;

            while (j >= this.nextTickAtMs && i++ < 10) {
               this.nextTickAtMs += 50L;
               synchronized (this.renderStateLock) {
                  this.tick();
                  this.lastTickEndMs = Util.getMeasuringTimeMs();
               }
            }

            if (j >= this.nextTickAtMs) {
               this.nextTickAtMs = j + 50L;
            }
         } else {
            LockSupport.parkNanos(this, Math.min((this.nextTickAtMs - j) * 1000000L, 2000000L));
         }
      }

      this.shutdownConnection();
      this.finishDisconnect(Text.literal("bot client stopped"));
   }

   public void tick() {
      BotConnection botconnection = this.connection;
      if (botconnection != null) {
         if (botconnection.isOpen()) {
            botconnection.tick();
         } else {
            botconnection.handleDisconnection();
         }
      }
   }

   public void shutdownConnection() {
      BotConnection botconnection = this.connection;
      if (botconnection != null) {
         if (botconnection.isOpen()) {
            botconnection.disconnect(Text.literal("bot client stopped"));
         }

         botconnection.handleDisconnection();
      }
   }

   public static String describeFailure(Exception var0) {
      String s = var0.getMessage();
      return s != null && !s.isBlank() ? s : var0.getClass().getSimpleName();
   }

   @Override
   public String getName() {
      return this.config.name();
   }

   public BotClientConfig getConfig() {
      return this.config;
   }

   public BotPhase getPhase() {
      return this.phase;
   }

   public boolean isJoined() {
      return this.phase == BotPhase.PLAY;
   }

   public float getTickDelta() {
      float f = (float)(Util.getMeasuringTimeMs() - this.lastTickEndMs) / 50.0F;
      return f < 0.0F ? 0.0F : Math.min(f, 1.0F);
   }

   public Object getRenderStateLock() {
      return this.renderStateLock;
   }

   public BotWorld getWorld() {
      return this.world;
   }

   public BotPlayer getPlayer() {
      return this.player;
   }

   public BotPlayHandler getPlayHandler() {
      return this.playHandler;
   }

   public BotConnection getConnection() {
      return this.connection;
   }

   public BotEventBus getEventBus() {
      return this.eventBus;
   }

   public BotModuleManager getModules() {
      return this.modules;
   }

   public BotRctService getRct() {
      return this.rct;
   }

   public String getAddress() {
      return this.config.host() + ":" + this.config.port();
   }

   public List<ChatMessage> getChatLog() {
      synchronized (this.chatLog) {
         return new ArrayList<>(this.chatLog);
      }
   }

   public List<String> getSentMessages() {
      synchronized (this.sentMessages) {
         return new ArrayList<>(this.sentMessages);
      }
   }

   public void addSentMessage(String var1) {
      synchronized (this.sentMessages) {
         if (this.sentMessages.isEmpty() || !this.sentMessages.get(this.sentMessages.size() - 1).equals(var1)) {
            this.sentMessages.add(var1);
         }
      }
   }

   public void systemMessage(String var1) {
      this.onChat(Text.literal("\u00a77[\u00a7f" + this.config.name() + "\u00a77] \u00a7e" + var1));
   }

   public boolean sendChat(String var1) {
      BotPlayHandler botplayhandler = this.playHandler;
      if (this.isJoined() && botplayhandler != null) {
         if (var1.startsWith("/")) {
            botplayhandler.sendCommand(var1.substring(1));
         } else {
            botplayhandler.sendChatMessage(var1);
         }

         return true;
      } else {
         return false;
      }
   }

   public void disconnect(String var1) {
      BotConnection botconnection = this.connection;
      if (botconnection != null && botconnection.isOpen()) {
         botconnection.disconnect(Text.literal(var1));
      }

      if (this.running.compareAndSet(true, false)) {
         LockSupport.unpark(this.thread);
      }
   }

   public void setPhase(BotPhase var1) {
      BotPhase botphase;
      synchronized (this.phaseLock) {
         botphase = this.phase;
         if (botphase == var1 || botphase == BotPhase.DISCONNECTED) {
            return;
         }

         this.phase = var1;
      }

      this.notifyEvents(() -> this.events.onPhaseChanged(this, botphase, var1), "onPhaseChanged");
   }

   public void setPlayHandler(BotPlayHandler var1) {
      this.playHandler = var1;
   }

   public void onGameJoin(BotWorld var1, BotPlayer var2) {
      this.world = var1;
      this.player = var2;
      this.setPhase(BotPhase.PLAY);
      this.eventBus.call(new Event49(this, var1, var2));
      this.notifyEvents(() -> this.events.onJoined(this), "onJoined");
   }

   public void onRespawn(BotWorld var1, BotPlayer var2) {
      boolean flag = this.world != var1;
      this.world = var1;
      this.player = var2;
      if (flag) {
         this.eventBus.call(new Event49(this, var1, var2));
      } else {
         this.eventBus.call(new Event09(this, var1, var2));
      }
   }

   public void onBotUpdate(BotWorld var1, BotPlayer var2) {
      this.rct.tick(var1, var2);
      this.eventBus.call(new Event13(this, var1, var2));
   }

   public void onWorldUnload() {
      this.world = null;
      this.player = null;
   }

   public void onChat(Text var1) {
      synchronized (this.chatLog) {
         this.chatLog.addLast(new ChatMessage(LocalTime.now().format(CHAT_TIME_FORMAT), var1));

         while (this.chatLog.size() > 200) {
            this.chatLog.removeFirst();
         }
      }

      this.rct.onGameMessage(var1);
      this.eventBus.call(new Event01(this, var1));
      this.notifyEvents(() -> this.events.onChat(this, var1), "onChat");
   }

   public void onConnectionTerminated(DisconnectionInfo var1) {
      this.finishDisconnect(var1.reason());
      if (this.running.compareAndSet(true, false)) {
         LockSupport.unpark(this.thread);
      }
   }

   public void finishDisconnect(Text var1) {
      if (this.disconnectNotified.compareAndSet(false, true)) {
         this.setPhase(BotPhase.DISCONNECTED);
         this.eventBus.call(new Event19(this, var1));

         try {
            this.modules.disableAll();
         } catch (RuntimeException runtimeexception) {
            LOGGER.error("Bot {} module shutdown failed", this.config.name(), runtimeexception);
         }

         this.world = null;
         this.player = null;
         this.notifyEvents(() -> this.events.onDisconnected(this, var1), "onDisconnected");
      }
   }

   public void notifyEvents(Runnable var1, String var2) {
      try {
         var1.run();
      } catch (RuntimeException runtimeexception) {
         LOGGER.error("Bot {} events callback {} failed", this.config.name(), var2, runtimeexception);
      }
   }

   @Override
   public Runnable createTask(Runnable runnable) {
      return runnable;
   }

   @Override
   protected boolean canExecute(Runnable task) {
      return true;
   }

   @Override
   protected Thread getThread() {
      return this.thread;
   }
}
