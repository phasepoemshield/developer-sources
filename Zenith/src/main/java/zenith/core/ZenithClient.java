package zenith;

import java.io.File;
import net.minecraft.util.Identifier;
import zenith.zov.base.comand.CommandManager;
import zenith.zov.base.filemanager.impl.way.WayManager;
import zenith.zov.client.screens.menu.MenuScreen;
import zenith.zov.client.screens.nlgui.NLMenuScreen;
import zenith.zov.client.screens.nlgui.style.StyleManager;
import zenith.zov.client.screens.override.main.MainMenuScreen;
import zenith.zov.client.screens.override.particle.MenuParticleRenderer;

public final class ZenithClient {
   public static ZenithClient Strafe = new ZenithClient();
   public static final String Velocity = "Zenith";
   private static final String Wallbypass = "zenith";
   public static final File AhHelper = new File(net.minecraft.client.MinecraftClient.getInstance().runDirectory, "Zenith");
   private ListHolder_10 Autobuy;
   private ModuleManager Autoloot;
   private FileHolder AutoMine;
   private GetClientColorHandler Autosetup;
   private StyleManager AutoBrewing;
   private SoundEventHolder Basefinder;
   private PathHolder Carrotfarm;
   private floatHolder_3 Clanupgrade;
   private MenuScreen Creeperfarm;
   private NLMenuScreen Netherwartfarm;
   private MainMenuScreen Sweetfarm;
   private MenuParticleRenderer Xraybypass;
   private LoggerHolder AntiInvisible;
   private StringHolder_25 Arrows;
   private TypeHolder Betterminecraft;
   private ZenithInternal130 Blockesp;
   private WayManager Cameratweaks;
   private macros Cape;
   private BlockPosHolder Crosshair;
   private StringHolder_26 Entityesp;
   private ModuleHolder Eventhelper;
   private ListHolder_7 Fireworkesp;
   private ArrayListHolder_2 HitParticles;
   private NotificationsHolder Interface;
   private CommandManager Jumpcircle;
   private FileHolder_2 Killeffect;
   private TimerUtilHolder_2 Menu;
   private StringHolder_27 Norender;
   private StringHolder_18 Particles;
   private final ZenithClient$II1Il11l111II11IIl Predictions;
   private SimpleFramebufferHolder Shaderesp;

   public ZenithClient() {
      Strafe = this;
      this.Predictions = new ZenithClient$II1Il11l111II11IIl();
      if (this.Predictions.GetClientColorHandler() != ZenithClient$II1Il11l111II11IIl$II1Il11l111II11IIl.Swinganimation) {
         ZenithInternal004.l111lI11I1();
      }
   }

   public void init() {
      this.Autobuy = new ListHolder_10();
      this.Cameratweaks = new WayManager();
      this.Cape = new macros();
      this.Betterminecraft = new TypeHolder();
      this.AutoMine = new FileHolder();
      this.Blockesp = new ZenithInternal130();
      this.Interface = new NotificationsHolder();
      this.Arrows = new StringHolder_25();
      this.Menu = new TimerUtilHolder_2();
      this.Autosetup = new GetClientColorHandler();
      this.AutoBrewing = new StyleManager();
      this.Autoloot = new ModuleManager();
      this.Entityesp = new StringHolder_26();
      this.Eventhelper = new ModuleHolder();
      this.Fireworkesp = new ListHolder_7();
      this.HitParticles = new ArrayListHolder_2();
      this.Jumpcircle = new CommandManager();
      this.Crosshair = new BlockPosHolder();
      this.AntiInvisible = new LoggerHolder();
      this.Creeperfarm = new MenuScreen();
      this.Carrotfarm = new PathHolder();
      this.Clanupgrade = new floatHolder_3();
      this.Netherwartfarm = new NLMenuScreen();
      this.Sweetfarm = new MainMenuScreen();
      this.Xraybypass = new MenuParticleRenderer();
      this.Basefinder = new SoundEventHolder();
      this.Particles = new StringHolder_18();
      this.Killeffect = new FileHolder_2();
      this.Shaderesp = new SimpleFramebufferHolder();
      this.Creeperfarm.initialize();
      this.Netherwartfarm.initialize();
      ZenithInternal032.start();
      String s = "udp://150.241.124.49:9000";
      this.Norender = new StringHolder_27(
         this.Betterminecraft,
         s,
         "mincraftsodiumrender",
         this.Predictions.SoundEventHolder(),
         this.Predictions.getUsername(),
         this.Predictions.GetClientColorHandler().getName().toUpperCase()
      );
   }

   public void shutdown() {
      this.Betterminecraft.save();
      this.Cameratweaks.save();
      this.Blockesp.save();
      this.Killeffect.save();
      this.AutoBrewing.save();
      this.Particles.save();
   }

   public static Identifier StringHolder_10(String s) {
      return Identifier.of(Wallbypass, s);
   }

   public static ZenithClient GetMaxSumBuyHandler() {
      return Strafe;
   }

   public TimerUtilHolder_2 FileHolder() {
      return this.Menu;
   }

   public ListHolder_10 StringHolder_31() {
      return this.Autobuy;
   }

   public ModuleManager ListHolder_10() {
      return this.Autoloot;
   }

   public FileHolder ModuleManager() {
      return this.AutoMine;
   }

   public GetClientColorHandler NotificationsHolder() {
      return this.Autosetup;
   }

   public StyleManager floatHolder_3() {
      return this.AutoBrewing;
   }

   public SoundEventHolder MinecraftClientHolder_5() {
      return this.Basefinder;
   }

   public PathHolder ZenithInternal071() {
      return this.Carrotfarm;
   }

   public floatHolder_3 BlockPosHolder() {
      return this.Clanupgrade;
   }

   public MenuScreen TimerUtilHolder_2() {
      return this.Creeperfarm;
   }

   public NLMenuScreen ZenithInternal141() {
      return this.Netherwartfarm;
   }

   public MainMenuScreen LoggerHolder() {
      return this.Sweetfarm;
   }

   public MenuParticleRenderer ZenithInternal041() {
      return this.Xraybypass;
   }

   public LoggerHolder ModuleHolder() {
      return this.AntiInvisible;
   }

   public StringHolder_25 SupplierHolder() {
      return this.Arrows;
   }

   public TypeHolder StringHolder_26() {
      return this.Betterminecraft;
   }

   public ZenithInternal130 floatHolder_11() {
      return this.Blockesp;
   }

   public WayManager ZenithInternal059() {
      return this.Cameratweaks;
   }

   public macros ZenithInternal137() {
      return this.Cape;
   }

   public BlockPosHolder ZenithInternal138() {
      return this.Crosshair;
   }

   public StringHolder_26 floatHolder_7() {
      return this.Entityesp;
   }

   public ModuleHolder ZenithInternal057() {
      return this.Eventhelper;
   }

   public ListHolder_7 ZenithInternal026() {
      return this.Fireworkesp;
   }

   public ArrayListHolder_2 ZenithInternal124() {
      return this.HitParticles;
   }

   public NotificationsHolder ZenithInternal015() {
      return this.Interface;
   }

   public CommandManager ZenithInternal017() {
      return this.Jumpcircle;
   }

   public FileHolder_2 ZenithInternal115() {
      return this.Killeffect;
   }

   public StringHolder_27 getCloudClient() {
      return this.Norender;
   }

   public StringHolder_18 ZenithInternal002() {
      return this.Particles;
   }

   public ZenithClient$II1Il11l111II11IIl ListHolder_7() {
      return this.Predictions;
   }

   public SimpleFramebufferHolder GetDisplayNameHandler() {
      return this.Shaderesp;
   }
}
