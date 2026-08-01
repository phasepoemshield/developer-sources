package l;

import fat.releon.teremok.impl.combat.Aura;
import fat.releon.teremok.impl.combat.TriggerBot;
import fat.releon.teremok.impl.player.AutoWarden;
import fat.releon.teremok.impl.player.BaseFinder;
import fat.releon.teremok.impl.player.FarmCarrot;
import java.util.ArrayList;
import java.util.List;

public class Helper241 {
   private final List<Helper242> modules = new ArrayList<>();

   public Helper241() {
   }

   public void method2309() {
      this.method2310(
         new AntiAFK(),
         new JumpCircle(),
         new BetterMinecraft(),
         new AimBot(),
         new TargetStrafe(),
         new Strafe(),
         new AutoPilot(),
         new AirStuck(),
         new NoEntityTrace(),
         new NoFall(),
         new ElytraMotion(),
         new HighJump(),
         new ShiftTap(),
         new AspectRatio(),
         new FreeLook(),
         new ClickPearl(),
         new ClickFriend(),
         new TabParser(),
         new TargetEsp(),
         new NoWeb(),
         new ServerHelper(),
         new WaterSpeed(),
         new ItemScroller(),
         new Hud(),
         new WardenHelper(),
         new AuctionHelper(),
         new Predictions(),
         new Particles(),
         new IrcClient(),
         new ElytraTarget(),
         new TriggerBot(),
         new Aura(),
         new AutoSwap(),
         new Chams(),
         new MaceSwap(),
         new AutoSearchEvent(),
         new AHHelper(),
         new BaseFinder(),
         new ChinaHat(),
         new FarmCarrot(),
         new AncientXray(),
         new AirPlace(),
         new ItemFixSwap(),
         new ClientIndication(),
         new AutoFortuna(),
         new AimAssist(),
         new AimPotion(),
         new Trails(),
         new ClickGui(),
         new Velocity(),
         new FullBright(),
         new NoFriendDamage(),
         new HitBox(),
         new Nuker(),
         new AntiBot(),
         new AutoAuth(),
         new AutoCrystal(),
         new AutoSprint(),
         new NoPush(),
         new ElytraHelper(),
         new JoinerHelper(),
         new NoDelay(),
         new AutoRespawn(),
         new SpookyJoiner(),
         new NoSlow(),
         new AutoBootsSwap(),
         new GuiMove(),
         new Blink(),
         new AutoTool(),
         new Fly(),
         new FastBreak(),
         new CameraSettings(),
         new Cosmetic(),
         new Speed(),
         new Timer(),
         new SwingAnimation(),
         new ViewModel(),
         new BlockOverlay(),
         new Jesus(),
         new Esp(),
         new BlockEspHelper(),
         new AutoTotem(),
         new FreeCam(),
         new ClanUpgrade(),
         new ChestStealer(),
         new PvPSafe(),
         new AutoEvent(),
         new AutoSell(),
         new AutoTpAccept(),
         new Arrows(),
         new AutoLeave(),
         new WorldTweaks(),
         new NoClip(),
         new NoRender(),
         new AutoBuy(),
         new NameProtect(),
         new SelfDestruct(),
         new SeeInvisible(),
         new TargetPearl(),
         new AutoArmor(),
         new AutoUse(),
         new NoInteract(),
         new OpenWalls(),
         new CrossHair(),
         new SuperFireWork(),
         new Spider(),
         new ServerRPSpoof(),
         new AppleFarm(),
         new UseTracker(),
         new KillEffect(),
         new AutoWarden()
      );
   }

   public void method2310(Helper242... var1) {
      this.modules.addAll(List.of(var1));
   }

   private void method2311(String var1) {
      if (!this.method2312("baritone.api.BaritoneAPI")) {
         Helper211.method1810("Skipping optional module " + this.method2313(var1) + ": Baritone is not installed");
      } else {
         try {
            Class var2 = Class.forName(var1);
            if (var2.getDeclaredConstructor().newInstance() instanceof Helper242 var4) {
               this.method2310(var4);
               return;
            }

            Helper211.method1810("Skipping optional module " + this.method2313(var1) + ": incompatible module type");
         } catch (Throwable var5) {
            Helper211.method1811("Skipping optional module " + this.method2313(var1) + ": failed to initialize", var5);
         }
      }
   }

   private boolean method2312(String var1) {
      try {
         Class.forName(var1);
         return true;
      } catch (Throwable var3) {
         return false;
      }
   }

   private String method2313(String var1) {
      int var2 = var1.lastIndexOf(46);
      return var2 >= 0 ? var1.substring(var2 + 1) : var1;
   }

   public List<Helper242> method2314() {
      return this.modules;
   }
}
