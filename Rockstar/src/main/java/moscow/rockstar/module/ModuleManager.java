package moscow.rockstar.module;

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.systems.event.impl.render.HudRenderEvent;
import moscow.rockstar.systems.event.impl.window.KeyPressEvent;
import moscow.rockstar.systems.event.impl.window.MouseEvent;
import moscow.rockstar.module.exception.UnknownModuleException;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.module.combat.AimBot;
import moscow.rockstar.module.combat.AimAssist;
import moscow.rockstar.module.combat.AntiBot;
import moscow.rockstar.module.combat.Aura;
import moscow.rockstar.module.combat.AutoArmor;
import moscow.rockstar.module.combat.AutoCrystal;
import moscow.rockstar.module.combat.AutoExplosion;
import moscow.rockstar.module.combat.AutoGapple;
import moscow.rockstar.module.combat.AutoPotion;
import moscow.rockstar.module.combat.AutoSoup;
import moscow.rockstar.module.combat.AutoTotem;
import moscow.rockstar.module.combat.BackTrack;
import moscow.rockstar.module.combat.Criticals;
import moscow.rockstar.module.combat.ElytraTarget;
import moscow.rockstar.module.combat.Hitboxes;
import moscow.rockstar.module.combat.KnockbackTweaks;
import moscow.rockstar.module.combat.SuperBow;
import moscow.rockstar.module.combat.TriggerBot;
import moscow.rockstar.module.combat.Velocity;
import moscow.rockstar.module.movement.AirStuck;
import moscow.rockstar.module.movement.AutoSprint;
import moscow.rockstar.module.movement.ElytraStrafe;
import moscow.rockstar.module.movement.Flight;
import moscow.rockstar.module.movement.HighJump;
import moscow.rockstar.module.movement.NoClip;
import moscow.rockstar.module.movement.NoSlow;
import moscow.rockstar.module.movement.Speed;
import moscow.rockstar.module.movement.Spider;
import moscow.rockstar.module.movement.Strafe;
import moscow.rockstar.module.movement.SuperFirework;
import moscow.rockstar.module.movement.Timer;
import moscow.rockstar.module.movement.WaterSpeed;
import moscow.rockstar.module.misc.Assist;
import moscow.rockstar.module.misc.Auction;
import moscow.rockstar.module.misc.AutoAccept;
import moscow.rockstar.module.misc.AutoAuth;
import moscow.rockstar.module.misc.AutoDuels;
import moscow.rockstar.module.misc.AutoJoin;
import moscow.rockstar.module.misc.AutoResell;
import moscow.rockstar.module.misc.BaseFinder;
import moscow.rockstar.module.misc.DeathCords;
import moscow.rockstar.module.misc.EffectRemover;
import moscow.rockstar.module.misc.FastItemUse;
import moscow.rockstar.module.misc.GlobalsMenu;
import moscow.rockstar.module.misc.InventoryCleaner;
import moscow.rockstar.module.misc.ItemPickup;
import moscow.rockstar.module.misc.KTLeaveModule;
import moscow.rockstar.module.misc.MacroMenu;
import moscow.rockstar.module.misc.NameProtect;
import moscow.rockstar.module.misc.Panic;
import moscow.rockstar.module.misc.PlayerModule;
import moscow.rockstar.module.misc.Recorder;
import moscow.rockstar.module.misc.RussianRoulette;
import moscow.rockstar.module.misc.Sounds;
import moscow.rockstar.module.misc.TestModule;
import moscow.rockstar.module.misc.WebUtils;
import moscow.rockstar.module.player.AutoBot;
import moscow.rockstar.module.player.AutoBrew;
import moscow.rockstar.module.player.AutoEat;
import moscow.rockstar.module.player.AutoFarm;
import moscow.rockstar.module.player.AutoInvisible;
import moscow.rockstar.module.player.AutoLeave;
import moscow.rockstar.module.player.AutoSwap;
import moscow.rockstar.module.player.Blink;
import moscow.rockstar.module.player.BootsSwap;
import moscow.rockstar.module.player.ClanUpgrade;
import moscow.rockstar.module.player.ClickThrough;
import moscow.rockstar.module.player.CreeperFarm;
import moscow.rockstar.module.player.ElytraUtils;
import moscow.rockstar.module.player.FreeCam;
import moscow.rockstar.module.player.GuiMove;
import moscow.rockstar.module.player.InvUtils;
import moscow.rockstar.module.player.MiddleClick;
import moscow.rockstar.module.player.MineHelper;
import moscow.rockstar.module.player.NoDelay;
import moscow.rockstar.module.player.NoFall;
import moscow.rockstar.module.player.NoInteract;
import moscow.rockstar.module.player.NoPush;
import moscow.rockstar.module.player.NoRotate;
import moscow.rockstar.module.player.Nuker;
import moscow.rockstar.module.player.PlayerUtils;
import moscow.rockstar.module.player.Scaffold;
import moscow.rockstar.module.player.Stealer;
import moscow.rockstar.module.player.TargetPearl;
import moscow.rockstar.module.player.Tracker;
import moscow.rockstar.module.visuals.Ambience;
import moscow.rockstar.module.visuals.AntiInvisible;
import moscow.rockstar.module.visuals.Beautifully;
import moscow.rockstar.module.visuals.CustomFog;
import moscow.rockstar.module.visuals.DonateEffects;
import moscow.rockstar.module.visuals.ESP;
import moscow.rockstar.module.visuals.Interface;
import moscow.rockstar.module.visuals.KillEffects;
import moscow.rockstar.module.visuals.MenuModule;
import moscow.rockstar.module.visuals.ObjectInfo;
import moscow.rockstar.module.visuals.Prediction;
import moscow.rockstar.module.visuals.Removals;
import moscow.rockstar.module.visuals.SoundESP;
import moscow.rockstar.module.visuals.StorageESP;
import moscow.rockstar.module.visuals.SwingAnimation;
import moscow.rockstar.module.visuals.TNTTimer;
import moscow.rockstar.module.visuals.TargetESP;
import moscow.rockstar.module.visuals.TrapESP;
import moscow.rockstar.module.visuals.ViewModel;
import moscow.rockstar.module.visuals.WardenHelper;
import moscow.rockstar.module.visuals.Waypoints;
import moscow.rockstar.module.visuals.World;
import moscow.rockstar.module.visuals.XRay;
import net.minecraft.client.MinecraftClient;

public class ModuleManager {
   private final List<Module> modules = new ArrayList<>();
   private final EventListener<ClientPlayerTickEvent> tickListener;
   private final EventListener<HudRenderEvent> moduleWidgetRenderer;
   private final EventListener<KeyPressEvent> onKeyPress = event -> {
      if (MinecraftClient.getInstance().currentScreen == null) {
         for (Module module : this.getModules()) {
            if (module.getKey() == event.getKey() && module.getKey() != -1 && event.getAction() == 1) {
               module.toggle();
            }
         }
      }
   };
   private final EventListener<MouseEvent> onMouseButtonPress = event -> {
      if (MinecraftClient.getInstance().currentScreen == null) {
         for (Module module : this.getModules()) {
            if (module.getKey() == event.getButton() && module.getKey() != -1 && event.getAction() == 1) {
               module.toggle();
            }
         }
      }
   };

   public ModuleManager(EventListener<ClientPlayerTickEvent> tickListener, EventListener<HudRenderEvent> moduleWidgetRenderer) {
      this.tickListener = tickListener;
      this.moduleWidgetRenderer = moduleWidgetRenderer;
      Rockstar.getInstance().getEventManager().subscribe(this);
   }
   public void registerModules() {
      this.register(new Aura());
      this.register(new AutoTotem());
      this.register(new TriggerBot());
      this.register(new AutoGapple());
      this.register(new AimBot());
      this.register(new AimAssist());
      this.register(new AutoPotion());
      this.register(new AntiBot());
      this.register(new Velocity());
      this.register(new AutoArmor());
      this.register(new AutoExplosion());
      this.register(new BackTrack());
      this.register(new Hitboxes());
      this.register(new ElytraTarget());
      this.register(new Criticals());
      this.register(new AutoCrystal());
      this.register(new KnockbackTweaks());
      this.register(new SuperBow());
      this.register(new AutoSoup());
      this.register(new AutoSprint());
      this.register(new AirStuck());
      this.register(new Flight());
      this.register(new HighJump());
      this.register(new NoClip());
      this.register(new Strafe());
      this.register(new SuperFirework());
      this.register(new WaterSpeed());
      this.register(new Speed());
      this.register(new Timer());
      this.register(new NoSlow());
      this.register(new Spider());
      this.register(new ElytraStrafe());
      this.register(new MenuModule());
      this.register(new ESP());
      this.register(new Removals());
      this.register(new Ambience());
      this.register(new SwingAnimation());
      this.register(new SoundESP());
      this.register(new TNTTimer());
      this.register(new ViewModel());
      this.register(new TrapESP());
      this.register(new Blink());
      this.register(new Interface());
      this.register(new TargetESP());
      this.register(new StorageESP());
      this.register(new XRay());
      this.register(new AntiInvisible());
      this.register(new CustomFog());
      this.register(new World());
      this.register(new KillEffects());
      this.register(new Beautifully());
      this.register(new DonateEffects());
      this.register(new Prediction());
      this.register(new InventoryCleaner());
      this.register(new AutoInvisible());
      this.register(new MineHelper());
      this.register(new TargetPearl());
      this.register(new Stealer());
      this.register(new MiddleClick());
      this.register(new AutoFarm());
      this.register(new InvUtils());
      this.register(new AutoEat());
      this.register(new AutoBrew());
      this.register(new BootsSwap());
      this.register(new FreeCam());
      this.register(new NoDelay());
      this.register(new PlayerUtils());
      this.register(new NoPush());
      this.register(new ItemPickup());
      this.register(new Scaffold());
      this.register(new ObjectInfo());
      this.register(new CreeperFarm());
      this.register(new Nuker());
      this.register(new NoRotate());
      this.register(new NoInteract());
      this.register(new NoFall());
      this.register(new EffectRemover());
      this.register(new NameProtect());
      this.register(new ElytraUtils());
      this.register(new FastItemUse());
      this.register(new AutoResell());
      this.register(new Panic());
      this.register(new Auction());
      this.register(new AutoAccept());
      this.register(new DeathCords());
      this.register(new AutoLeave());
      this.register(new AutoSwap());
      this.register(new RussianRoulette());
      this.register(new AutoDuels());
      this.register(new AutoAuth());
      this.register(new AutoJoin());
      this.register(new GuiMove());
      this.register(new Assist());
      this.register(new Recorder());
      this.register(new KTLeaveModule());
      this.register(new WebUtils());
      this.register(new Sounds());
      this.register(new Waypoints());
      this.register(new Tracker());
      this.register(new BaseFinder());
      this.register(new WardenHelper());
      this.register(new ClickThrough());
      this.register(new AutoBot());
      this.register(new ClanUpgrade());
      this.register(new MacroMenu());
      this.register(new GlobalsMenu());
      this.register(new PlayerModule());
      this.register(new TestModule());
   }
   public void enableModules() {
      for (Module module : this.modules) {
         if (module.getInfo().enabledByDefault()) {
            module.enable();
         }
      }
   }

   public void register(BaseModule module) {
      this.modules.add(module);
   }

   public <T extends Module> T getModule(String name) {
      return (T)this.modules
         .stream()
         .filter(module -> module.getName().replace(" ", "").equalsIgnoreCase(name) || module.getName().equalsIgnoreCase(name))
         .findFirst()
         .orElseThrow(() -> new UnknownModuleException(name));
   }

   public <T extends Module> T getModule(Class<T> clazz) {
      T module = this.findModule(clazz);
      if (module == null) {
         throw new UnknownModuleException(clazz.getSimpleName());
      }
      return module;
   }

   public <T extends Module> T findModule(Class<T> clazz) {
      return (T)this.modules
         .stream()
         .filter(module -> module.getClass().equals(clazz) || module.getClass().getName().equals(clazz.getName()))
         .findFirst()
         .orElse(null);
   }

   @Generated
   public List<Module> getModules() {
      return this.modules;
   }

   @Generated
   public EventListener<ClientPlayerTickEvent> getTickListener() {
      return this.tickListener;
   }

   @Generated
   public EventListener<HudRenderEvent> getModuleWidgetRenderer() {
      return this.moduleWidgetRenderer;
   }

   @Generated
   public EventListener<KeyPressEvent> getOnKeyPress() {
      return this.onKeyPress;
   }

   @Generated
   public EventListener<MouseEvent> getOnMouseButtonPress() {
      return this.onMouseButtonPress;
   }
}
