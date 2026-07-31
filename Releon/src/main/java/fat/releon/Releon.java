package fat.releon;

import antidaunleak.api.annotation.Native;
import com.google.common.eventbus.EventBus;
import com.mojang.authlib.minecraft.UserApiService;
import fat.releon.common.discord.DiscordManager;
import fat.releon.mixins.client.IMinecraftClient;
import java.io.File;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l.Accounts;
import l.Helper73;
import l.Helper75;
import l.Helper90;
import l.Helper91;
import l.Helper5;
import l.NetClient1;
import l.Helper112;
import l.Exception3;
import l.Helper124;
import l.Helper138;
import l.Helper140;
import l.Helper7;
import l.Helper2;
import l.NetClient3;
import l.Helper211;
import l.Helper228;
import l.Helper238;
import l.Helper241;
import l.Helper274;
import l.Helper275;
import l.Widget16;
import l.Helper308;
import l.Helper327;
import l.Helper363;
import l.Helper377;
import l.Helper390;
import l.Helper394;
import l.Helper397;
import l.Helper413;
import l.Helper436;
import l.AutoBuyAutoBuyConfig;
import l.Helper46;
import l.Helper466;
import l.Helper56;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.SocialInteractionsManager;
import net.minecraft.client.session.ProfileKeys;
import net.minecraft.client.session.Session;
import net.minecraft.client.session.Session.AccountType;
import net.minecraft.client.session.report.AbuseReportContext;
import net.minecraft.client.session.report.ReporterEnvironment;

public class Releon implements ModInitializer {
   static Releon instance;
   private Helper124 eventManager = new Helper124();
   private EventBus eventBus = new EventBus();
   private Helper241 moduleRepository;
   private Helper275 moduleSwitcher;
   private Helper308 commandRepository;
   private Helper363 commandDispatcher;
   private Helper5 boxESPRepository = new Helper5(this.eventManager);
   private Helper7 macroRepository = new Helper7(this.eventManager);
   private Helper466 wayRepository = new Helper466(this.eventManager);
   private Helper2 RCTRepository = new Helper2(this.eventManager);
   private Helper274 moduleProvider;
   private Helper75 draggableRepository;
   private DiscordManager discordManager;
   private Helper90 fileRepository;
   private Helper91 fileController;
   private Helper140 scissorManager = new Helper140();
   private Helper390 clientInfoProvider;
   private Helper436 listenerRepository;
   private Helper327 attackPerpetrator = new Helper327();
   private NetClient3 cloudConfigClient;
   private NetClient1 ftCheckClient;
   private Helper112 ircManager = new Helper112();
   private Helper377 accountRepository;
   private Helper46 tpsCalculate;
   private boolean initialized;
   private boolean showIrcMessages = false;
   private ScheduledExecutorService reconnectScheduler;
   private boolean reconnecting = false;

   public Releon() {
   }

   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public void onInitialize() {
      instance = this;
      Helper394.method4007();
      this.method11();
      this.method8();
      this.method7();
      this.method12();
      this.method9();
      this.method13();
      Helper138.method1184();
      this.method2();
      this.initialized = true;
      Thread var1 = new Thread(() -> {
         this.method0("discord rpc", this::method10);
         this.method0("cloud websocket", this::method5);
         this.method0("ft check websocket", this::method6);
         this.method0("irc", this.ircManager::method950);
         this.method0("irc reconnect scheduler", this::method14);
         this.method0("update checker", Helper228::method2036);
         this.method0("sound manager", Helper56::init);
         this.method1();
      }, "releon-background-init");
      var1.setDaemon(true);
      var1.start();
   }

   private void method0(String var1, Runnable var2) {
      try {
         var2.run();
      } catch (Throwable var4) {
         Helper211.method1811("Failed to initialize " + var1, var4);
      }
   }

   private void method1() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1 != null) {
         var1.execute(() -> {
            try {
               Widget16.INSTANCE.method2887();
            } catch (Throwable var1x) {
               Helper211.method1811("Failed to warm up menu screen", var1x);
            }
         });
      }
   }

   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   private void method2() {
      if (this.accountRepository != null && this.accountRepository.currentAccount != null && !this.accountRepository.currentAccount.isBlank()) {
         Helper397 var1 = this.accountRepository
            .accountList
            .stream()
            .filter(Objects::nonNull)
            .filter(var1x -> var1x.name != null && var1x.name.equals(this.accountRepository.currentAccount))
            .findFirst()
            .orElse(null);
         if (var1 == null) {
            this.accountRepository.currentAccount = "";
         } else {
            if (!this.method3(var1)) {
               this.accountRepository.currentAccount = "";
            }
         }
      }
   }

   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public boolean method3(Helper397 var1) {
      if (var1 != null && var1.name != null && !var1.name.isBlank()) {
         MinecraftClient var2 = MinecraftClient.getInstance();
         if (var2 == null) {
            return false;
         } else {
            UUID var3 = this.method4(var1);
            Session var4 = new Session(var1.name, var3, "0", Optional.empty(), Optional.empty(), AccountType.MOJANG);
            IMinecraftClient var5 = (IMinecraftClient)var2;
            var5.setSessionT(var4);
            if (var2.getGameProfile() != null) {
               var2.getGameProfile().getProperties().clear();
            }

            UserApiService var6 = UserApiService.OFFLINE;
            var5.setUserApiService(var6);
            var5.setSocialInteractionsManagerT(new SocialInteractionsManager(var2, var6));
            var5.setProfileKeys(ProfileKeys.create(var6, var4, var2.runDirectory.toPath()));
            var5.setAbuseReportContextT(AbuseReportContext.create(ReporterEnvironment.ofIntegratedServer(), var6));
            var1.uuid = var3.toString();
            if (this.accountRepository != null) {
               this.accountRepository.currentAccount = var1.name;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private UUID method4(Helper397 var1) {
      if (var1.uuid != null && !var1.uuid.isBlank()) {
         try {
            return UUID.fromString(var1.uuid);
         } catch (IllegalArgumentException var3) {
            Helper211.method1810("Invalid account UUID for " + var1.name + ", generated offline UUID will be used");
         }
      }

      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var1.name).getBytes(StandardCharsets.UTF_8));
   }

   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   private void method5() {
      this.cloudConfigClient = new NetClient3(URI.create("ws://45.155.205.202:8080"));
      this.cloudConfigClient.connect();
   }

   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   private void method6() {
      this.ftCheckClient = new NetClient1(URI.create("ws://45.155.205.202:6312"));
      this.ftCheckClient.connect();
   }

   private void method7() {
      this.draggableRepository = new Helper75();
      this.draggableRepository.method786();
   }

   private void method8() {
      this.moduleRepository = new Helper241();
      this.moduleRepository.method2309();
      this.moduleProvider = new Helper274(this.moduleRepository.method2314());
      this.moduleSwitcher = new Helper275(this.moduleRepository.method2314(), this.eventManager);
   }

   private void method9() {
      this.commandRepository = new Helper308();
      this.commandDispatcher = new Helper363(this.eventManager);
   }

   private void method10() {
      String var1 = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
      if (!var1.contains("linux") && !var1.contains("mac")) {
         this.discordManager = new DiscordManager();
         this.discordManager.init();
      }
   }

   private void method11() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      File var2 = var1 != null ? var1.runDirectory : new File(".");
      File var3 = new File(var2, "Releon");
      File var4 = new File(var3, "Files");
      this.clientInfoProvider = new Helper413("Releon Build 0.3", "Baflllik && HZeed", "Developer", var3, var4);
   }

   private void method12() {
      Helper73 var1 = new Helper73();
      var1.method780(this.clientInfoProvider.method3925(), this.clientInfoProvider.method3926());
      File var2 = new File(this.clientInfoProvider.method3925(), "AutoBuy");
      if (!var2.exists()) {
         var2.mkdirs();
      }

      File var3 = new File(this.clientInfoProvider.method3925(), "Custom");
      if (!var3.exists()) {
         var3.mkdirs();
      }

      this.fileRepository = new Helper90();
      this.fileRepository.method891(this);
      this.accountRepository = new Helper377();
      this.fileRepository.method893().add(new Accounts(this.accountRepository));
      this.fileRepository.method893().add(new AutoBuyAutoBuyConfig());
      this.fileController = new Helper91(this.fileRepository.method893(), this.clientInfoProvider.method3926());

      try {
         this.fileController.method897();
      } catch (Exception var5) {
         Helper211.method1813("Failed to load files: " + var5.getMessage());
      }
   }

   private void method13() {
      this.listenerRepository = new Helper436();
      this.listenerRepository.method4539();
      this.tpsCalculate = new Helper46();
   }

   private synchronized void method14() {
      if (this.reconnectScheduler == null || this.reconnectScheduler.isShutdown() || this.reconnectScheduler.isTerminated()) {
         this.reconnectScheduler = Executors.newSingleThreadScheduledExecutor(var0 -> {
            Thread var1 = new Thread(var0, "releon-irc-reconnect");
            var1.setDaemon(true);
            return var1;
         });
         this.reconnectScheduler.scheduleAtFixedRate(() -> {
            if ((this.ircManager.method949() == null || !this.ircManager.method949().isOpen()) && !this.reconnecting) {
               this.reconnecting = true;

               try {
                  this.ircManager.method950();
               } catch (Exception var5) {
                  if (this.showIrcMessages) {
                     Helper238.method2192("РџРµСЂРµРїРѕРґРєР»СЋС‡РµРЅРёРµ Рє СЃРµСЂРІРµСЂСѓ IrcClient РЅРµ СѓРґР°Р»РѕСЃСЊ");
                  }
               } finally {
                  this.reconnecting = false;
               }
            }
         }, 10L, 10L, TimeUnit.SECONDS);
      }
   }

   public Helper124 method15() {
      return this.eventManager;
   }

   public EventBus method16() {
      return this.eventBus;
   }

   public Helper241 method17() {
      return this.moduleRepository;
   }

   public Helper275 method18() {
      return this.moduleSwitcher;
   }

   public Helper308 method19() {
      return this.commandRepository;
   }

   public Helper363 method20() {
      return this.commandDispatcher;
   }

   public Helper5 method21() {
      return this.boxESPRepository;
   }

   public Helper7 method22() {
      return this.macroRepository;
   }

   public Helper466 method23() {
      return this.wayRepository;
   }

   public Helper2 method24() {
      return this.RCTRepository;
   }

   public Helper274 method25() {
      return this.moduleProvider;
   }

   public Helper75 method26() {
      return this.draggableRepository;
   }

   public DiscordManager method27() {
      return this.discordManager;
   }

   public Helper90 method28() {
      return this.fileRepository;
   }

   public Helper91 method29() {
      return this.fileController;
   }

   public Helper140 method30() {
      return this.scissorManager;
   }

   public Helper390 method31() {
      return this.clientInfoProvider;
   }

   public Helper436 method32() {
      return this.listenerRepository;
   }

   public Helper327 method33() {
      return this.attackPerpetrator;
   }

   public NetClient3 method34() {
      return this.cloudConfigClient;
   }

   public NetClient1 method35() {
      return this.ftCheckClient;
   }

   public Helper112 method36() {
      return this.ircManager;
   }

   public Helper377 method37() {
      return this.accountRepository;
   }

   public Helper46 method38() {
      return this.tpsCalculate;
   }

   public boolean method39() {
      return this.initialized;
   }

   public boolean method40() {
      return this.showIrcMessages;
   }

   public ScheduledExecutorService method41() {
      return this.reconnectScheduler;
   }

   public boolean method42() {
      return this.reconnecting;
   }

   public void method43(Helper124 var1) {
      this.eventManager = var1;
   }

   public void method44(EventBus var1) {
      this.eventBus = var1;
   }

   public void method45(Helper241 var1) {
      this.moduleRepository = var1;
   }

   public void method46(Helper275 var1) {
      this.moduleSwitcher = var1;
   }

   public void method47(Helper308 var1) {
      this.commandRepository = var1;
   }

   public void method48(Helper363 var1) {
      this.commandDispatcher = var1;
   }

   public void method49(Helper5 var1) {
      this.boxESPRepository = var1;
   }

   public void method50(Helper7 var1) {
      this.macroRepository = var1;
   }

   public void method51(Helper466 var1) {
      this.wayRepository = var1;
   }

   public void method52(Helper2 var1) {
      this.RCTRepository = var1;
   }

   public void method53(Helper274 var1) {
      this.moduleProvider = var1;
   }

   public void method54(Helper75 var1) {
      this.draggableRepository = var1;
   }

   public void method55(DiscordManager var1) {
      this.discordManager = var1;
   }

   public void method56(Helper90 var1) {
      this.fileRepository = var1;
   }

   public void method57(Helper91 var1) {
      this.fileController = var1;
   }

   public void method58(Helper140 var1) {
      this.scissorManager = var1;
   }

   public void method59(Helper390 var1) {
      this.clientInfoProvider = var1;
   }

   public void method60(Helper436 var1) {
      this.listenerRepository = var1;
   }

   public void method61(Helper327 var1) {
      this.attackPerpetrator = var1;
   }

   public void method62(NetClient3 var1) {
      this.cloudConfigClient = var1;
   }

   public void method63(NetClient1 var1) {
      this.ftCheckClient = var1;
   }

   public void method64(Helper112 var1) {
      this.ircManager = var1;
   }

   public void method65(Helper377 var1) {
      this.accountRepository = var1;
   }

   public void method66(Helper46 var1) {
      this.tpsCalculate = var1;
   }

   public void method67(boolean var1) {
      this.initialized = var1;
   }

   public void method68(boolean var1) {
      this.showIrcMessages = var1;
   }

   public void method69(ScheduledExecutorService var1) {
      this.reconnectScheduler = var1;
   }

   public void method70(boolean var1) {
      this.reconnecting = var1;
   }

   public static Releon method71() {
      return instance;
   }
}
