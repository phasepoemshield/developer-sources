package org.zenith;

import org.zenith.base.filemanager.impl.way.Way;
import org.zenith.module.Bot;
import org.zenith.module.Module;
import org.zenith.rotation.Rotation;

import org.zenith.config.CosmeticManager;
import org.zenith.config.ConfigJsonUtil;
import org.zenith.config.ProtocolMessage;
import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.PotionItemBuilder;
import org.zenith.core.ProfileItemBuilder;
import org.zenith.core.ItemRegistry;
import org.zenith.core.ItemSpec;
import org.zenith.core.NbtItemSpec;
import org.zenith.core.NbtEditor;
import org.zenith.core.ColorAnimator;
import org.zenith.core.EnchantItemSpec;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.UiAnimation;
import org.zenith.core.TextScanner;
import org.zenith.core.Easing;
import org.zenith.core.StringCodec;
import org.zenith.core.ServiceException;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.InventoryUtils;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.BotFeaturesDto;
import org.zenith.core.FriendStore;
import org.zenith.core.MediaTrackInfo;
import org.zenith.core.ModuleStateStore;
import org.zenith.core.ModuleSnapshotDto;
import org.zenith.core.CloudUserProfile;
import org.zenith.core.AnalyticsTracker;
import org.zenith.core.ClientSession;
import org.zenith.core.VisualSettingsStore;
import org.zenith.core.EmotePlayback;
import org.zenith.core.CloudResponse;
import org.zenith.core.GameCoordinator;
import org.zenith.core.TradeGuardService;
import org.zenith.core.CloudRouter;
import org.zenith.core.DiskStorage;
import org.zenith.core.RemoteEventsPoller;
import org.zenith.core.FileLogger;
import org.zenith.core.CloudApiClient;
import org.zenith.core.EmptyBean;
import org.zenith.core.HolyWorldClient;
import org.zenith.core.UsageStatStore;
import org.zenith.core.CloudPoller;
import org.zenith.core.Translator;
import org.zenith.core.TaskQueue;
import org.zenith.core.ProfileCacheStore;
import org.zenith.managers.CloudApi;
import org.zenith.managers.EmoteManager;
import org.zenith.managers.FriendFilter;
import org.zenith.managers.PetManager;
import org.zenith.managers.SoundManager;
import org.zenith.managers.EmoteMetadata;
import org.zenith.module.ModuleManager;
import org.zenith.util.WorldUtils;

import org.zenith.render.BlurRenderer;
import org.zenith.rotation.RotationManager;
import org.zenith.util.ItemExt;
import org.zenith.util.ItemExt2;

import org.zenith.utility.render.display.base.HudDrawContext;

import org.zenith.base.comand.CommandManager;

import org.zenith.addon.internal.ZenithAddonManager;
import org.zenith.base.bot.client.HeadlessBots;
import org.zenith.base.filemanager.impl.way.WayManager;
import org.zenith.client.screens.nlgui.NLMenuScreen;
import org.zenith.client.screens.nlgui.style.StyleManager;
import org.zenith.client.screens.override.main.MainMenuScreen;
import org.zenith.client.screens.override.particle.MenuParticleRenderer;
import org.zenith.utility.discord.DiscordManager;















import java.io.File;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;

public final class ZenithClient {
   public static ZenithClient on23;
   public static final String UiAnimation = "Zenith";
   public static final String Easing = "Zenith".toLowerCase();
   public static final File ColorAnimator = new File(MinecraftClient.getInstance().runDirectory, "Zenith");
   public Translator ItemRegistry;
   public ModuleManager ItemSpec;
   public ZenithAddonManager TextScanner;
   public DiskStorage NbtItemSpec;
   public ProfileCacheStore HudDrawContext;
   public StyleManager StyleManager;
   public SoundManager ItemServiceBase;
   public VisualSettingsStore NbtEditor;
   public CosmeticManager PotionItemBuilder;
   public FriendFilter ProfileItemBuilder;
   public NLMenuScreen StringCodec;
   public DiscordManager FileLogger;
   public MainMenuScreen CloudApiClient;
   public MenuParticleRenderer MediaTrackInfo;
   public TaskQueue CloudUserProfile;
   public WorldUtils ModuleSnapshotDto;
   public FriendStore InventoryUtils;
   public ItemExt BotFeatureRegistry;
   public WayManager ServiceException;
   public ItemExt2 CloudRouter;
   public PetManager ProtocolMessage;
   public GameCoordinator AnalyticsTracker;
   public RotationManager ConfigJsonUtil;
   public RemoteEventsPoller CloudResponse;
   public ItemRegistry TradeGuardService;
   public CloudApi BotFeaturesDto;
   public CommandManager EmptyBean;
   public CloudPoller ModuleStateStore;
   public HolyWorldClient CloudPoller;
   public CloudApiClient EmoteMetadata;
   public UsageStatStore EmoteManager;
   public final ClientSession CosmeticManager;
   public BlurRenderer EmotePlayback;

   public void init() {
      this.ItemRegistry = new Translator();
      this.ServiceException = new WayManager();
      this.CloudRouter = new ItemExt2();
      this.InventoryUtils = new FriendStore();
      this.NbtItemSpec = new DiskStorage();
      this.HudDrawContext = new ProfileCacheStore();
      this.BotFeatureRegistry = new ItemExt();
      this.BotFeaturesDto = new CloudApi();
      this.ModuleSnapshotDto = new WorldUtils();
      this.CloudPoller = new HolyWorldClient();
      this.StyleManager = new StyleManager();
      this.ItemSpec = new ModuleManager();
      this.AnalyticsTracker = new GameCoordinator();
      this.ConfigJsonUtil = new RotationManager();
      this.TextScanner = new ZenithAddonManager();
      this.TextScanner.load();
      this.CloudResponse = new RemoteEventsPoller();
      this.TradeGuardService = new ItemRegistry();
      this.EmptyBean = new CommandManager();
      this.ProtocolMessage = new PetManager();
      this.CloudUserProfile = new TaskQueue();
      this.PotionItemBuilder = new CosmeticManager();
      this.NbtEditor = new VisualSettingsStore();
      this.ProfileItemBuilder = new FriendFilter();
      this.StringCodec = new NLMenuScreen();
      this.CloudApiClient = new MainMenuScreen();
      this.MediaTrackInfo = new MenuParticleRenderer();
      this.ItemServiceBase = new SoundManager();
      this.EmoteManager = new UsageStatStore();
      this.ModuleStateStore = new CloudPoller();
      HeadlessBots.loadPersistentState();
      this.EmotePlayback = new BlurRenderer();
      this.StringCodec.initialize();
      String s = "wss://cloud.zenithdlc.org/ws/v1";
      this.EmoteMetadata = new CloudApiClient(
         this.InventoryUtils,
         s,
         "5W9nLU1l3V6SqJMVI4mSViItwLsLOPZMwhMJbdZE2ZhIjNKVf1g3OUtL8mOKBgA6",
         this.CosmeticManager.CloudPoller(),
         this.CosmeticManager.getUsername(),
         this.CosmeticManager.EmoteManager().getName().toUpperCase()
      );
      this.FileLogger = new DiscordManager();
      this.FileLogger.init();
   }

   public ZenithClient() {
      on23 = this;
      this.CosmeticManager = new ClientSession();
   }

   public void shutdown() {
      if (this.EmoteMetadata != null) {
         this.EmoteMetadata.shutdown();
      }

      if (this.PotionItemBuilder != null) {
         this.PotionItemBuilder.close();
      }

      this.InventoryUtils.save();
      this.ServiceException.save();
      this.BotFeatureRegistry.save();
      this.StyleManager.save();
      this.EmoteManager.save();
      this.CloudRouter.save();
      this.ModuleStateStore.save();
      HeadlessBots.savePersistentState();
      HeadlessBots.disconnectAll();
      if (this.TextScanner != null) {
         this.TextScanner.close();
      }
   }

   public static Identifier on23(String var0) {
      return Identifier.of(Easing, var0);
   }

   public static ZenithClient on23() {
      return on23;
   }

   public HolyWorldClient UiAnimation() {
      return this.CloudPoller;
   }

   public Translator Easing() {
      return this.ItemRegistry;
   }

   public ModuleManager ColorAnimator() {
      return this.ItemSpec;
   }

   public ZenithAddonManager ItemRegistry() {
      return this.TextScanner;
   }

   public DiskStorage ItemSpec() {
      return this.NbtItemSpec;
   }

   public ProfileCacheStore getSortManager() {
      return this.HudDrawContext;
   }

   public StyleManager TextScanner() {
      return this.StyleManager;
   }

   public SoundManager NbtItemSpec() {
      return this.ItemServiceBase;
   }

   public VisualSettingsStore EnchantItemSpec() {
      return this.NbtEditor;
   }

   public CosmeticManager SimpleItemBuilder() {
      return this.PotionItemBuilder;
   }

   public FriendFilter ItemServiceBase() {
      return this.ProfileItemBuilder;
   }

   public NLMenuScreen NbtEditor() {
      return this.StringCodec;
   }

   public DiscordManager PotionItemBuilder() {
      return this.FileLogger;
   }

   public MainMenuScreen ProfileItemBuilder() {
      return this.CloudApiClient;
   }

   public MenuParticleRenderer StringCodec() {
      return this.MediaTrackInfo;
   }

   public TaskQueue FileLogger() {
      return this.CloudUserProfile;
   }

   public WorldUtils CloudApiClient() {
      return this.ModuleSnapshotDto;
   }

   public FriendStore MediaTrackInfo() {
      return this.InventoryUtils;
   }

   public ItemExt CloudUserProfile() {
      return this.BotFeatureRegistry;
   }

   public WayManager ModuleSnapshotDto() {
      return this.ServiceException;
   }

   public ItemExt2 InventoryUtils() {
      return this.CloudRouter;
   }

   public PetManager BotFeatureRegistry() {
      return this.ProtocolMessage;
   }

   public GameCoordinator ServiceException() {
      return this.AnalyticsTracker;
   }

   public RotationManager CloudRouter() {
      return this.ConfigJsonUtil;
   }

   public RemoteEventsPoller ProtocolMessage() {
      return this.CloudResponse;
   }

   public ItemRegistry AnalyticsTracker() {
      return this.TradeGuardService;
   }

   public CloudApi ConfigJsonUtil() {
      return this.BotFeaturesDto;
   }

   public CommandManager CloudResponse() {
      return this.EmptyBean;
   }

   public CloudPoller TradeGuardService() {
      return this.ModuleStateStore;
   }

   public CloudApiClient getCloudClient() {
      return this.EmoteMetadata;
   }

   public UsageStatStore BotFeaturesDto() {
      return this.EmoteManager;
   }

   public ClientSession CommandManager() {
      return this.CosmeticManager;
   }

   public BlurRenderer ModuleStateStore() {
      return this.EmotePlayback;
   }
}
