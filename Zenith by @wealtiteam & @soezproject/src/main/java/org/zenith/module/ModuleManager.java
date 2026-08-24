package org.zenith.module;

import org.zenith.base.comand.CommandManager;

import org.zenith.core.UiAnimation;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.MenuScreenId;
import org.zenith.core.PacketDispatcher;
import org.zenith.core.BlockFinder;
import org.zenith.core.ClientProvider;
import org.zenith.core.HotbarSwapper;
import org.zenith.core.StyledTextBuilder;
import org.zenith.ZenithClient;

import org.zenith.util.I1Type;
import org.zenith.util.ScoreboardHelper;

import org.zenith.module.AHHelper;
import org.zenith.module.AimAssist;
import org.zenith.module.AirStuck;
import org.zenith.module.AntiBot;
import org.zenith.module.AntiInvisible;
import org.zenith.module.AppleFarm;
import org.zenith.module.Arrows;
import org.zenith.module.Aura;
import org.zenith.module.AutoAccept;
import org.zenith.module.AutoAuth;
import org.zenith.module.AutoBrewing;
import org.zenith.module.AutoCapcha;
import org.zenith.module.AutoCraft;
import org.zenith.module.AutoDuels;
import org.zenith.module.AutoExplosion;
import org.zenith.module.AutoInventory;
import org.zenith.module.AutoLeave;
import org.zenith.module.AutoLoot;
import org.zenith.module.AutoMine;
import org.zenith.module.AutoPay;
import org.zenith.module.AutoRespawn;
import org.zenith.module.AutoSprint;
import org.zenith.module.AutoSwap;
import org.zenith.module.AutoTool;
import org.zenith.module.AutoTotem;
import org.zenith.module.AutoTrap;
import org.zenith.module.AutoUse;
import org.zenith.module.AutoWarden;
import org.zenith.module.AutoWeb;
import org.zenith.module.AutoZamok;
import org.zenith.module.BaseFinder;
import org.zenith.module.BetterMinecraft;
import org.zenith.module.Blink;
import org.zenith.module.BlockESP;
import org.zenith.module.BlockOverLay;
import org.zenith.module.BoatHighJump;
import org.zenith.module.BoatLongJump;
import org.zenith.module.Bot;
import org.zenith.module.BowAimBot;
import org.zenith.module.CameraTweaks;
import org.zenith.module.Cape;
import org.zenith.module.CastleFly;
import org.zenith.module.Chams;
import org.zenith.module.ChestStealer;
import org.zenith.module.ClickAction;
import org.zenith.module.ContainerHelper;
import org.zenith.module.Criticals;
import org.zenith.module.CropFarmer;
import org.zenith.module.Crosshair;
import org.zenith.module.ElytraBooster;
import org.zenith.module.ElytraFly;
import org.zenith.module.ElytraHelper;
import org.zenith.module.ElytraMotion;
import org.zenith.module.ElytraTarget;
import org.zenith.module.Emotes;
import org.zenith.module.EntityESP;
import org.zenith.module.EventTracker;
import org.zenith.module.FakeLag;
import org.zenith.module.FakePlayer;
import org.zenith.module.FastBreak;
import org.zenith.module.FireWorkESP;
import org.zenith.module.FreeCam;
import org.zenith.module.GrimGlide;
import org.zenith.module.GuiWalk;
import org.zenith.module.HandFire;
import org.zenith.module.HitParticles;
import org.zenith.module.Interface;
import org.zenith.module.InventorySetting;
import org.zenith.module.ItemDebug;
import org.zenith.module.ItemScroller;
import org.zenith.module.JumpCircle;
import org.zenith.module.KillEffect;
import org.zenith.module.Menu;
import org.zenith.module.NameProtect;
import org.zenith.module.NoDelay;
import org.zenith.module.NoFriendDamage;
import org.zenith.module.NoInteract;
import org.zenith.module.NoPush;
import org.zenith.module.NoRender;
import org.zenith.module.NoSlow;
import org.zenith.module.NoSweetSlow;
import org.zenith.module.NoWeb;
import org.zenith.module.OffHandManager;
import org.zenith.module.OpenWals;
import org.zenith.module.Particles;
import org.zenith.module.PathTeleport;
import org.zenith.module.Predictions;
import org.zenith.module.PvpSafe;
import org.zenith.module.Reach;
import org.zenith.module.ReachV3;
import org.zenith.module.RotationRecorder;
import org.zenith.module.ServerHelper;
import org.zenith.module.ShaderESP;
import org.zenith.module.ShaderFog;
import org.zenith.module.ShaderHand;
import org.zenith.module.ShulkerJump;
import org.zenith.module.ShulkerPreview;
import org.zenith.module.SlimeFlight;
import org.zenith.module.Speed;
import org.zenith.module.Spider;
import org.zenith.module.Strafe;
import org.zenith.module.StreamerMode;
import org.zenith.module.SwingAnimation;
import org.zenith.module.TapeMouse;
import org.zenith.module.TargetESP;
import org.zenith.module.TargetPearl;
import org.zenith.module.Timer;
import org.zenith.module.TotemParticles;
import org.zenith.module.TotemPop;
import org.zenith.module.Trails;
import org.zenith.module.TrapTp;
import org.zenith.module.TridentAimbot;
import org.zenith.module.TriggerBot;
import org.zenith.module.Velocity;
import org.zenith.module.ViewArmorDurability;
import org.zenith.module.ViewModel;
import org.zenith.module.WallBypass;
import org.zenith.module.WarpFarm;
import org.zenith.module.WorldParticles;
import org.zenith.module.WorldTweaks;
import org.zenith.module.XrayBypass;

import org.zenith.event.Event18Ext2;
import org.zenith.event.EventTriggerKeyEvent;



import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class ModuleManager implements ClientProvider {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public final List<Module> list103 = new ArrayList<>();

   public void ScoreboardHelper() {
      this.on23(Interface.interfaceField);
      this.on23(BetterMinecraft.betterMinecraft);
      this.on23(AntiInvisible.antiInvisible);
      this.on23(Arrows.arrows);
      this.on23(Menu.menu);
      this.on23(NoRender.noRender);
      this.on23(Predictions.predictions);
      this.on23(BlockESP.blockESP);
      this.on23(BlockOverLay.blockOverLay);
      this.on23(SwingAnimation.swingAnimation);
      this.on23(Crosshair.crosshair);
      this.on23(ViewModel.viewModel);
      this.on23(WorldTweaks.worldTweaks);
      this.on23(ShaderFog.shaderFog);
      this.on23(Chams.chams);
      this.on23(EntityESP.entityESP);
      this.on23(TargetESP.targetESP);
      this.on23(ShaderHand.shaderHand);
      this.on23(HandFire.handFire);
      this.on23(AutoExplosion.autoExplosion);
      this.on23(Cape.cape);
      this.on23(JumpCircle.jumpCircle);
      this.on23(WorldParticles.worldParticles);
      this.on23(HitParticles.hitParticles);
      this.on23(TotemParticles.totemParticles);
      this.on23(Trails.trails);
      this.on23(KillEffect.killEffect);
      this.on23(Particles.particles);
      this.on23(ViewArmorDurability.viewArmorDurability);
      this.on23(FireWorkESP.fireWorkESP);
      this.on23(TotemPop.totemPop);
   }

   public void StyledTextBuilder() {
      this.on23(Emotes.emotes);
      this.on23(BowAimBot.bowAimBot);
      this.on23(TridentAimbot.tridentAimbot);
      this.on23(ItemDebug.itemDebug);
      if (ZenithClient.on23().CommandManager().getUsername().equals("Bogdan")) {
         this.on23(FakePlayer.fakePlayer);
         this.on23(PathTeleport.pathTeleport);
      }

      this.on23(ShaderESP.shaderESP);
      this.on23(ShulkerPreview.shulkerPreview);
      this.on23(ServerHelper.serverHelper);
      this.on23(ElytraHelper.elytraHelper);
      this.on23(ItemScroller.itemScroller);
      this.on23(AutoTrap.autoTrap);
      this.on23(ClickAction.clickAction);
      this.on23(FreeCam.freeCam);
      this.on23(PvpSafe.pvpSafe);
      this.on23(CameraTweaks.cameraTweaks);
      this.on23(AutoAuth.autoAuth);
      this.on23(AutoCapcha.autoCapcha);
      this.on23(AutoPay.autoPay);
      this.on23(AutoDuels.autoDuels);
      this.on23(AutoLeave.autoLeave);
      this.on23(AHHelper.aHHelper);
      this.on23(AutoInventory.autoInventory);
      this.on23(AutoCraft.autoCraft);
      this.on23(ContainerHelper.containerHelper);
      this.on23(NoInteract.noInteract);
      this.on23(NoFriendDamage.noFriendDamage);
      this.on23(ChestStealer.chestStealer);
      this.on23(AutoAccept.autoAccept);
      this.on23(EventTracker.eventTracker);
      this.on23(AutoUse.autoUse);
      this.on23(TapeMouse.tapeMouse);
      this.on23(AutoRespawn.autoRespawn);
      this.on23(NameProtect.nameProtect);
      this.on23(AutoWeb.autoWeb);
      this.on23(XrayBypass.xrayBypass);
      this.on23(StreamerMode.streamerMode);
   }

   public ModuleManager() {
      this.init();
      EventManager.register(this);
   }

   public void init() {
      this.BlockFinder();
      this.I1Type();
      this.ScoreboardHelper();
      this.HotbarSwapper();
      this.StyledTextBuilder();
   }

   public void BlockFinder() {
      if (ZenithClient.on23().CommandManager().getUsername().equals("Bogdan")) {
         this.on23(RotationRecorder.rotationRecorder);
      }

      this.on23(AimAssist.aimAssist);
      this.on23(Aura.aura);
      this.on23(Reach.reach2);
      this.on23(AutoSwap.autoSwap);
      this.on23(TriggerBot.triggerBot);
      this.on23(OffHandManager.offHandManager);
      this.on23(ElytraTarget.elytraTarget);
      this.on23(Criticals.criticals);
      this.on23(TargetPearl.targetPearl);
      this.on23(AutoTotem.autoTotem);
      this.on23(AntiBot.antiBot);
      this.on23(InventorySetting.inventorySetting);
      this.on23(Blink.blink);
      this.on23(TrapTp.trapTp);
      this.on23(FakeLag.fakeLag);
      this.on23(ReachV3.reachV3);
   }

   public void I1Type() {
      this.on23(AutoSprint.autoSprint);
      this.on23(ElytraBooster.elytraBooster);
      this.on23(CastleFly.castleFly);
      this.on23(GrimGlide.grimGlide);
      this.on23(SlimeFlight.slimeFlight);
      this.on23(ElytraFly.elytraFly);
      this.on23(Velocity.velocity);
      this.on23(NoWeb.noWeb);
      this.on23(GuiWalk.guiWalk);
      this.on23(NoSlow.noSlow);
      this.on23(Spider.spider);
      this.on23(Speed.speed11);
      this.on23(Timer.timer);
      this.on23(ElytraMotion.elytraMotion);
      this.on23(BoatHighJump.boatHighJump);
      this.on23(BoatLongJump.boatLongJump);
      this.on23(ShulkerJump.shulkerJump);
      this.on23(Strafe.strafe);
      this.on23(AirStuck.airStuck);
      this.on23(WallBypass.wallBypass);
   }

   public void HotbarSwapper() {
      this.on23(AutoTool.autoTool);
      this.on23(NoDelay.noDelay);
      this.on23(NoSweetSlow.noSweetSlow);
      this.on23(NoPush.noPush);
      this.on23(OpenWals.openWals);
      this.on23(BaseFinder.baseFinder);
      this.on23(AppleFarm.appleFarm);
      this.on23(FastBreak.fastBreak);
      this.on23(AutoLoot.autoLoot);
      this.on23(AutoMine.autoMine);
      this.on23(CropFarmer.cropFarmer);
      this.on23(AutoZamok.autoZamok);
      this.on23(AutoBrewing.autoBrewing);
      this.on23(Bot.bot);
      this.on23(AutoWarden.autoWarden);
      this.on23(WarpFarm.warpFarm);
   }

   public void on23(Module var1) {
      this.UiAnimation(var1);
   }

   public void UiAnimation(Module var1) {
      Objects.requireNonNull(var1, "module");
      if (this.list103.stream().anyMatch(var1x -> var1x.getId().equals(var1.getId()))) {
         throw new IllegalArgumentException("Duplicate module id: " + var1.getId());
      } else {
         this.list103.add(var1);
      }
   }

   public Module Event18Ext2(String var1) {
      return this.list103.stream().filter(var1x -> var1x.getName().equalsIgnoreCase(var1)).findFirst().orElse(null);
   }

   public Set<Module> MenuScreenId() {
      Set<Module> linkedhashset = new LinkedHashSet<>();

      for (Module lii1lll1l1li1ii1iiillii : this.list103) {
         if (lii1lll1l1li1ii1iiillii.isEnabled()) {
            linkedhashset.add(lii1lll1l1li1ii1iiillii);
         }
      }

      return linkedhashset;
   }

   @EventTarget
   public void on23(EventTriggerKeyEvent var1) {
      if (var1.TridentAimbot() == 1) {
         if (Menu.menu.getKeyCode() == var1.getKeyCode() && Menu.menu.getKeyCode() != -1) {
            Menu.menu.toggle();
         } else if (minecraftClient3.currentScreen == null) {
            for (Module lii1lll1l1li1ii1iiillii : this.list103) {
               if (lii1lll1l1li1ii1iiillii.getKeyCode() == var1.getKeyCode() && lii1lll1l1li1ii1iiillii.getKeyCode() != -1) {
                  lii1lll1l1li1ii1iiillii.toggle();
               }
            }
         }
      }
   }

   public List<Module> PacketDispatcher() {
      return this.list103;
   }
}
