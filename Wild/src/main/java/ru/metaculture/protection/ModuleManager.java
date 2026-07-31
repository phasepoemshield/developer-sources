package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.stream.Collectors;
import org.wild.module.api.Module;
import ru.metaculture.profile.Profile;
import ru.metaculture.profile.Role;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class ModuleManager {
   public final ArrayList<Module> O00000000 = new ArrayList<>();

   public ModuleManager() {
      this.O00000000();
   }

   @Compile
   public void O00000000() {
      // VF/dev: the original registration was a native @Compile method inside protection.dll (a
      // proprietary anti-tamper native, unavailable in a dev run). Reimplemented in Java: instantiate
      // every @ModuleRegister module — its no-arg constructor reads its own annotation metadata — and
      // add it to the list.
      Class<?>[] var1 = new Class<?>[]{
         ActionRecorder.class, AhHelper.class, AirStuck.class, AncientXray.class, Animations.class, AntiAFK.class,
         AntiBot.class, AntiCrystal.class, AppleFarmer.class, Arrows.class, AspectRatio.class, AtmoDawnFog.class,
         AttackAura.class, AttackEffect.class, AutoAccept.class, AutoAncientBot.class, AutoAuth.class, AutoBuy.class,
         AutoClan.class, AutoCraft.class, AutoCristal.class, AutoDrop.class, AutoDuel.class, AutoExp.class,
         AutoFish.class, AutoGApple.class, AutoInvisible.class, AutoLeave.class, AutoLes.class, AutoMace.class,
         AutoMine.class, AutoPotion.class, AutoPottBot.class, AutoResell.class, AutoSell.class, AutoSwap.class,
         AutoTool.class, AutoTotem.class, AutoVillageTrade.class, AutoWood.class, BaseFinder.class, Blink.class,
         BlockESP.class, BlockOutline.class, BowHelper.class, CameraClip.class, Cape.class, Chams.class,
         ChatHelper.class, ChestStealer.class, ChinaHat.class, ChorusFarm.class, ClanUpgrade.class, ClickPearl.class,
         ClientUtil.class, CocoaFarm.class, ColorPlus.class, CreeperFarm.class, Criticals.class, DeadEffect.class,
         DragonFly.class, ElytraHelper.class, ElytraTarget.class, ESP.class, FakePlayer.class, FastBow.class,
         FastBreak.class, FreeCamera.class, FreeLock.class, FriendManager.class, FullBright.class, GeyserHelper.class,
         GlowESP.class, GrimGlide.class, Hands.class, HitBox.class, HitSounds.class, HudModule.class,
         InvMove.class, ItemPhysic.class, ItemScroller.class, Jesus.class, JumpCircle.class, LockSlots.class,
         MenuModule.class, MoneyFarm.class, MotionBlur.class, NameTags.class, NoDelay.class, NoInteract.class,
         NoPush.class, NoSlow.class, NoWeb.class, OpenWalls.class, Particles.class, PlayerHelper.class,
         PotionCombiner.class, Predictions.class, ProtectInfo.class, PvPSafe.class, Removals.class, RotationLab.class,
         Scaffold.class, SeeInvisibles.class, ServerDHelper.class, ServerHelper.class, ServerJoiner.class, Speed.class,
         Spider.class, Sprint.class, Stardust.class, SwingAnimation.class, TapeMouse.class, TargetESP.class,
         TargetPearl.class, TestModule.class, TotemVoices.class, Trails.class, TriggerBot.class, UnHook.class,
         UseTracker.class, Velocity.class, WardenFarm.class, WaterSpeed.class, WorldTweaks.class
      };
      for (Class<?> var5 : var1) {
         try {
            this.O000000000((Module)var5.getDeclaredConstructor().newInstance());
         } catch (Throwable var4) {
            System.out.println("[Wild] module register failed: " + var5.getSimpleName() + ": " + var4);
         }
      }
   }

   @Compile
   private void O000000000(Module module) {
      if (module != null) {
         this.O00000000.add(module);
      }
   }

   public ArrayList<Module> O000000000() {
      return this.O00000000.stream().filter(this::O00000000).collect(Collectors.toCollection(ArrayList::new));
   }

   public <T extends Module> T O00000000(Class<T> class_) {
      for (Module var3 : this.O00000000) {
         if (var3.getClass() == class_) {
            return (T)var3;
         }
      }

      return null;
   }

   public Module O000000000(Class<?> class_) {
      for (Module var3 : this.O00000000) {
         if (var3.getClass() == class_) {
            return var3;
         }
      }

      return null;
   }

   public ArrayList<Module> O00000000(Category o0000000OO0O0O) {
      return this.O00000000
         .stream()
         .filter(this::O00000000)
         .filter(module -> module.O00000000000O == o0000000OO0O0O)
         .collect(Collectors.toCollection(ArrayList::new));
   }

   public Module[] O00000000(int i) {
      return this.O00000000.stream().filter(this::O00000000).filter(module -> module.O000000000000 == i).toArray(Module[]::new);
   }

   public boolean O00000000(Module module) {
      return module == null ? false : O00000000(module.O00000000000O());
   }

   public boolean O0000000000(Class<? extends Module> class_) {
      return class_ == null ? false : O00000000(class_.getAnnotation(ModuleAccess.class));
   }

   public static boolean O00000000(ModuleAccess o0000000OO0OO0) {
      if (o0000000OO0OO0 == null) {
         return true;
      } else {
         boolean var1 = o0000000OO0OO0.O00000000() != Role.DEFAULT
            || o0000000OO0OO0.O000000000().length > 0
            || o0000000OO0OO0.O0000000000().length > 0
            || o0000000OO0OO0.O00000000000().length > 0;
         if (!var1) {
            return true;
         } else if (Profile.isUid(o0000000OO0OO0.O00000000000())) {
            return true;
         } else if (Profile.isUsername(o0000000OO0OO0.O0000000000())) {
            return true;
         } else {
            return Profile.hasRole(o0000000OO0OO0.O000000000())
               ? true
               : o0000000OO0OO0.O00000000() != Role.DEFAULT && Profile.hasRoleAtLeast(o0000000OO0OO0.O00000000());
         }
      }
   }

   static {
      Loader.initialize();
   }
}
