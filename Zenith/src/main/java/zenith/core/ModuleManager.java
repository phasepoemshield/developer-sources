package zenith;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ModuleManager implements ZenithInternal076 {
   private final List<Module> modules = new ArrayList<>();

   public ModuleManager() {
      this.init();
      EventBus.StringHolder_8(this);
   }

   private void init() {
      this.floatHolder_9();
      this.ZenithInternal131();
      this.PatternHolder_2();
      this.StringHolder_25();
      this.ZenithInternal135();
   }

   private void floatHolder_9() {
      this.StringHolder_8(Aimassist.lI1l1I1l1l1Il);
      this.StringHolder_8(Aura.ll1II1l1lII11IlII1);
      this.StringHolder_8(Reach.I1I1IIlIll);
      this.StringHolder_8(Autoswap.ll1IllI1lI1l);
      this.StringHolder_8(Triggerbot.l1lIIII11lI1Il1111IllII1II1lI);
      this.StringHolder_8(Offhandmanager.Ill1lI1III1);
      this.StringHolder_8(Elytratarget.Il1I1IIIl11I1IIlI);
      this.StringHolder_8(Criticals.ll1llII11IIlIl1I1l1I1l1l);
      this.StringHolder_8(Targetpearl.ll1l1IIlIl1Il1);
      this.StringHolder_8(Autototem.IlII1I1llIllIl1IIl);
      this.StringHolder_8(Antibot.IlI1ll1l11IlllI111lIlIll111llI);
      this.StringHolder_8(Inventorysetting.ll11II1111ll11I1llI);
      this.StringHolder_8(Blink.IIIlII1Il1l111lI1);
      this.StringHolder_8(Fakelag.I1lIIlI1I11I1ll1l11II1llI1lIl1);
      this.StringHolder_8(Reachv3.Il11lIlllI111I1l1111);
   }

   private void ZenithInternal131() {
      this.StringHolder_8(Autosprint.lIlIIlllIl11l111l1I1I11l);
      this.StringHolder_8(Elytrabooster.l1lllIl1IIllI1l1l11IlI);
      this.StringHolder_8(Castlefly.ll1I111l1l1lIllllIlI1l1);
      this.StringHolder_8(GrimGlide.lI1IlIlIl111);
      this.StringHolder_8(Elytrafly.l1IlIlIII11);
      this.StringHolder_8(Noweb.l1I1l1lIIlI1I1lIl11lI1I);
      this.StringHolder_8(GuiWalk.l11IIIl1ll1II1I1I);
      this.StringHolder_8(Noslow.l1l1lII1Il1ll);
      this.StringHolder_8(Spider.II11IIIl11ll1lIIl1IIIIII);
      this.StringHolder_8(Speed.l11llI1II1Il1l1III1);
      this.StringHolder_8(Elytramotion.I1111l1Illl1I111);
      this.StringHolder_8(Boathighjump.Il1I11Il11lII11II111IllI);
      this.StringHolder_8(Boatlongjump.I1lIIl1111lIIIl1II);
      this.StringHolder_8(Shulkerjump.III11ll1llIlIlI1lllIIl111I1);
      this.StringHolder_8(Strafe.IlII1I1Ill1IIlll111I1Il11lI1I);
      this.StringHolder_8(Airstuck.lIl1lIIIll11I1l111IIl1I1I);
      this.StringHolder_8(Wallbypass.l1Il11ll111I1IIl1Il1lll1l);
   }

   private void PatternHolder_2() {
      this.StringHolder_8(Interface.ll11lIl1IlIl1lI1);
      this.StringHolder_8(Betterminecraft.Il1I11IllIlIll);
      this.StringHolder_8(AntiInvisible.l1ll1lIl1llllll1);
      this.StringHolder_8(Arrows.lIlll11IlII11II);
      this.StringHolder_8(Menu.lllIl11II111Illll1IlIll);
      this.StringHolder_8(Norender.I11I1Il11lIlIl);
      this.StringHolder_8(Predictions.l1l1IIIIl1IIllIIIlI);
      this.StringHolder_8(Blockesp.lI1I111IlIll1Ill);
      this.StringHolder_8(Swinganimation.I111l11lIl1llIIl1IlI1I1lII1);
      this.StringHolder_8(Crosshair.lII1Il111I1);
      this.StringHolder_8(Viewmodel.lIll1lll1lI1I);
      this.StringHolder_8(Worldtweaks.l1I1II1l111l1llI11l1I1llII);
      this.StringHolder_8(Shaderfog.II11l1IIIll1lIIllI111l1II);
      this.StringHolder_8(Entityesp.lIIlIlIII1ll11);
      this.StringHolder_8(Targetesp.l1l111l111llllll1ll1l1111ll1);
      this.StringHolder_8(Shaderhand.l1Il1l1lllllll1I1III1Il1I1);
      this.StringHolder_8(Autoexplosion.lIll1l1II1I1Il11111lII);
      this.StringHolder_8(Cape.l1l1IlllllI111l1II1IIIl1);
      this.StringHolder_8(Jumpcircle.lIl1l1lll1Il111l11lIIllll111);
      this.StringHolder_8(TotemParticles.I1llII1II11I111lIllIlII11I1III);
      this.StringHolder_8(Trails.II111llIl1Il1IIIlIIl11);
      this.StringHolder_8(Killeffect.IIl1l1l1ll1IIllII11I);
      this.StringHolder_8(Particles.IIlIIl11llll1);
      this.StringHolder_8(Eventhelper.l1Il1ll1ll1I);
      this.StringHolder_8(ViewArmorDurability.III11I1l11llIl1I);
      this.StringHolder_8(Fireworkesp.l1lIIlI1lII111lll1IIlll1lIIll);
   }

   private void StringHolder_25() {
      this.StringHolder_8(Autotool.llllIll11l1I111III);
      this.StringHolder_8(Nodelay.ll1llIllIl1llll1IlIIl1ll);
      this.StringHolder_8(Nosweetslow.llII1II1lllIIlII1llll);
      this.StringHolder_8(Nopush.lI1II1IlI1lI1llllllIll1l1);
      this.StringHolder_8(Basefinder.Illlll11I1I);
      this.StringHolder_8(Carrotfarm.lIlI1l1IlIl1IIII);
      this.StringHolder_8(Fastbreak.l1I1lllIll11);
      this.StringHolder_8(Autoloot.I1IllII1IIl);
      this.StringHolder_8(Netherwartfarm.I1lIlIllIl1I11I1);
      this.StringHolder_8(Sweetfarm.lIl11Il1lIlll1ll1);
      this.StringHolder_8(AutoMine.Il1Il11IIIIlI11l1I);
      this.StringHolder_8(AutoBrewing.IIIl1llII11llIll1);
   }

   private void ZenithInternal135() {
      this.StringHolder_8(Bowaimbot.Il1I11lIll1I1lI11lIlII1ll);
      this.StringHolder_8(Tridentaimbot.I1IlIIl1lll1IlIlI);
      if (ZenithClient.getInstance().ListHolder_7().getUsername().equals("developer")) {
         this.StringHolder_8(Fakeplayer.lllIl1l1I);
         this.StringHolder_8(Pathteleport.II1I1l1I1l11II1lI);
      }

      this.StringHolder_8(Shaderesp.IIlIII1I1Il1I111IlIl1lII);
      this.StringHolder_8(ShulkerLook.l1lllI1II1lll1);
      this.StringHolder_8(Serverhelper.l1l1l111I1lI11Il);
      this.StringHolder_8(Elytrahelper.lIIIlIlllII1I1Il1I1IlI);
      this.StringHolder_8(Itemscroller.IIIIlI1Il1llIl1I1ll1llI1l);
      this.StringHolder_8(Autotrap.III1lIIllIl1lI1lIll11I1l);
      this.StringHolder_8(Clickaction.I1l11l1IIIl1llIlI11II);
      this.StringHolder_8(Freecam.IlIl11lIIl);
      this.StringHolder_8(Pvpsafe.II1111lI1ll1lIll1lIlI1lII1);
      this.StringHolder_8(Cameratweaks.IIIIIlIIlIll1IlIl11);
      this.StringHolder_8(Autoauth.I1lIIl1111l);
      this.StringHolder_8(Autoduels.IlII1l11I11lIll11l1I1lII);
      this.StringHolder_8(Autoleave.II1lIl111II1l1I1ll1IlI1II1ll1);
      this.StringHolder_8(AhHelper.Ill1lII1l1ll1I1lIl1lIl);
      this.StringHolder_8(Autoinventory.lIIl1Illl1IllIIl11Il1l111I1I);
      this.StringHolder_8(Autocraft.II111lIIll1Ill1IlI1);
      this.StringHolder_8(Autosetup.IllIl11l1IlIlIlIIIlIl1);
      this.StringHolder_8(Containerhelper.IIl1lI1111I1lIIll);
      this.StringHolder_8(Nointeract.lIII11IIl1lIII1l11IIl);
      this.StringHolder_8(Nofrienddamage.I1IlIl111lII1l);
      this.StringHolder_8(Cheststealer.lll1Illllll1ll);
      this.StringHolder_8(Autoaccept.l1l1ll11lIl11I11I11I1);
      this.StringHolder_8(Autorespawn.IIIIl1I1I);
      this.StringHolder_8(Nameprotect.l1I1I1l1lI11l111I1lI111llll1l);
      this.StringHolder_8(Autoweb.l1lI1I11II11l1111111lIII);
      this.StringHolder_8(Xraybypass.ll1IlllI1l);
   }

   private void StringHolder_8(Module ll111il1lliill11) {
      this.modules.add(ll111il1lliill11);
   }

   public Module GetSlotIdHandler_2(String s) {
      return this.modules.stream().filter(ll111il1lliill11 -> ll111il1lliill11.getName().equalsIgnoreCase(s)).findFirst().orElse(null);
   }

   public Set<Module> ZenithInternal140() {
      HashSet hashset = new HashSet();

      for (Module ll111il1lliill11 : this.modules) {
         if (ll111il1lliill11.Spider()) {
            hashset.add(ll111il1lliill11);
         }
      }

      return hashset;
   }

   @EventTarget
   public void StringHolder_8(KeyEvent i111liliill1iii1iiii1) {
      if (i111liliill1iii1iiii1.Elytrafly() == 1) {
         if (Menu.lllIl11II111Illll1IlIll.Elytramotion() == i111liliill1iii1iiii1.Elytramotion()
            && Menu.lllIl11II111Illll1IlIll.Elytramotion() != -1) {
            Menu.lllIl11II111Illll1IlIll.lI1Il11I1l1III11IIlI1lI1II11I();
         } else if (l11I1I1ll1Illll1I1l1111l1II.currentScreen == null) {
            for (Module ll111il1lliill11 : this.modules) {
               if (ll111il1lliill11.Elytramotion() == i111liliill1iii1iiii1.Elytramotion() && ll111il1lliill11.Elytramotion() != -1) {
                  ll111il1lliill11.lI1Il11I1l1III11IIlI1lI1II11I();
               }
            }
         }
      }
   }

   public List<Module> getModules() {
      return this.modules;
   }
}
