// Module: Interface
// Category: render
// Original class: Interface
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

import zenith.hud.*;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.util.math.Vector2f;
import org.joml.Vector2f;
import org.lwjgl.glfw.GLFW;
import zenith.zov.client.screens.nlgui.NLMenuScreen;

@ModuleInfo(
   name = "Interface",
   category = Category.RENDER,
   description = "Интерфейс Клиента"
)
public final class Interface extends Module {
   private final List<HudElement> IIl11llII11I1lIIlIIlI1 = new ArrayList<>();
   private final ListHolder_4 l1ll1l1111IIlllllIlIlll11lI = new ListHolder_4();
   private HudElement llIlIII1lIlIIlIIIl11 = null;
   public static final Interface ll11lIl1IlIl1lI1 = new Interface();
   private float dragOffsetX;
   private float dragOffsetY;
   private HudElement ll1llI11I11I = null;
   private float IIlllII1IIl11l1lIl1ll1Il1111I;
   private float ll1l111I11IIlll1lIlI1;
   private float l1llI11l11I1l11IllIII1Il1;
   private long l1l1l1Il11Il1llIIlIl1IIlIIl = 0L;
   private boolean l1lIIlllll1llIIIIll1 = false;
   private final MultiBooleanSetting Il11lll1l1lIII1I1l111llIlI = new MultiBooleanSetting("module.interface.cosmetics");
   private final MultiBooleanSetting$II1Il11l111II11IIl Il1lIll111111ll1l1l1lI1l1I1 = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.Il11lll1l1lIII1I1l111llIlI, "module.interface.blur", true
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl II1l1l1ll1IlIllI1I1III1lll11l = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.Il11lll1l1lIII1I1l111llIlI, "module.interface.glass", false
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl llI1IlllIlII11l1I1111II11l = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.Il11lll1l1lIII1I1l111llIlI, "module.interface.glow", true
   );
   private final ModeSetting Illll1IIIIIl = new ModeSetting(
      "module.interface.glowMode", "module.interface.glowMode.desc", () -> true, "module.interface.glowMode.outline", "module.interface.fill"
   );
   private final NumberSetting l1Il1Il1lIIIII1IIlII = new NumberSetting(
      "module.interface.glowRadius", 8.0F, 5.0F, 15.0F, 1.0F, "module.interface.glowRadius.desc", "px", () -> true, null
   );
   private final ContainerSetting I111111ll1 = new ContainerSetting(
      "module.interface.glowSettings",
      "module.interface.glowSettings.desc",
      this.llI1IlllIlII11l1I1111II11l::Spider,
      this.Illll1IIIIIl,
      this.l1Il1Il1lIIIII1IIlII
   );
   private final NumberSetting I1l1IllI1IIIlII1 = new NumberSetting(
      "module.interface.glareSpeed", 0.2F, 0.05F, 1.0F, 0.05F, "module.interface.glareSpeed.desc", "x", () -> true, null
   );
   private final ContainerSetting Il1II111II = new ContainerSetting(
      "module.interface.glassSettings", "module.interface.glassSettings.desc", this.II1l1l1ll1IlIllI1I1III1lll11l::Spider, this.I1l1IllI1IIIlII1
   );
   public final NumberSetting II1I11IIl1ll1I1lIlllIIlllIl = new NumberSetting(
      "module.interface.volume", 0.5F, 0.1F, 1.0F, 0.1F, "module.interface.volume.desc", "%", this::ll1II1lI1I1Illl11, null
   );
   private final NumberSetting lIIIII111l1IlIl1lIlllll = new NumberSetting(
      "module.interface.round", 6.0F, 0.0F, 6.0F, 0.1F, "module.interface.round.desc", "px"
   );
   private final NumberSetting I1IllllII11I1IIlIl1IlllI1I1lI = new NumberSetting(
      "module.interface.hudElement.scale", 100.0F, 90.0F, 250.0F, 1.0F, "module.interface.hudElement.scale.desc", "%", () -> true, (f1, f) -> {
         for (HudElement ii11l1l11lil1i1 : this.IIl11llII11I1lIIlIIlI1) {
            ii11l1l11lil1i1.IIIlI1I1111l1I1IIll().longHolder_4(f);
         }
      }
   );

   @Override
   public List<Setting> getSettings() {
      return List.of(
         this.Il11lll1l1lIII1I1l111llIlI,
         this.I111111ll1,
         this.Il1II111II,
         this.I1IllllII11I1IIlIl1IlllI1I1lI,
         this.lIIIII111l1IlIl1lIlllll,
         this.II1I11IIl1ll1I1lIlllIIlllIl
      );
   }

   private Interface() {
      this.StringHolder_8(
         new ItemBinds("ItemBinds", 349.0F, 0.0F, 960.0F, 495.5F, -11.5F, 146.0F, HudElement$II1Il11l111II11IIl.l11l111IllI1lIlIIl1)
      );
      this.StringHolder_8(
         new Watermark("Watermark", 0.0F, 0.0F, 960.0F, 495.5F, 10.0F, 10.0F, HudElement$II1Il11l111II11IIl.Il111lI1lllIIIIll11Il1IIlI)
      );
      this.StringHolder_8(
         new Potions("Potions", 0.0F, 0.0F, 960.0F, 495.5F, 119.15234F, 73.0F, HudElement$II1Il11l111II11IIl.Il111lI1lllIIIIll11Il1IIlI)
      );
      this.StringHolder_8(
         new Staffs("Staffs", 0.0F, 0.0F, 960.0F, 495.5F, 10.0F, 73.0F, HudElement$II1Il11l111II11IIl.Il111lI1lllIIIIll11Il1IIlI)
      );
      Notifications ili1111ii1l1li = new Notifications(
         "Notifications", 181.80615F, 135.5F, 960.0F, 495.5F, 157.03516F, -72.5F, HudElement$II1Il11l111II11IIl.llI11IIIl1llII1ll1I1I
      );
      this.StringHolder_8(ili1111ii1l1li);
      ZenithClient.getInstance().ZenithInternal015().StringHolder_8(ili1111ii1l1li);
      this.StringHolder_8(new Inventory("Inventory", 269.0F, 229.0F, 960.0F, 495.5F, -11.5F, -74.0F, HudElement$II1Il11l111II11IIl.l1I1lI1llIlIlI));
      this.StringHolder_8(
         new Cooldowns("Cooldowns", 349.0F, 0.0F, 960.0F, 495.5F, -11.5F, 73.0F, HudElement$II1Il11l111II11IIl.l11l111IllI1lIlIIl1)
      );
      this.StringHolder_8(
         new Information("Information", 0.0F, 0.0F, 960.0F, 495.5F, 10.0F, 41.5F, HudElement$II1Il11l111II11IIl.Il111lI1lllIIIIll11Il1IIlI)
      );
      this.StringHolder_8(
         new Coordinates("Coordinates", 0.0F, 0.0F, 960.0F, 495.5F, 10.0F, 41.5F, HudElement$II1Il11l111II11IIl.Il111lI1lllIIIIll11Il1IIlI)
      );
      this.StringHolder_8(new Keybinds("Keybinds", 349.0F, 0.0F, 960.0F, 495.5F, -122.0F, 73.0F, HudElement$II1Il11l111II11IIl.l11l111IllI1lIlIIl1));
      this.StringHolder_8(
         new TargetHud("TargetHud", 166.5F, 128.5F, 960.0F, 495.5F, 0.0F, 31.75F, HudElement$II1Il11l111II11IIl.llI11IIIl1llII1ll1I1I)
      );
      this.StringHolder_8(
         new MusicInfo("MusicInfo", 342.0F, 257.0F, 960.0F, 495.5F, -11.5F, -16.5F, HudElement$II1Il11l111II11IIl.l1I1lI1llIlIlI)
      );
      this.StringHolder_8(new HootBar("HootBar", 116.5F, 265.0F, 960.0F, 495.5F, 0.0F, -16.5F, HudElement$II1Il11l111II11IIl.lIll11III1IllI));
      this.StringHolder_8(
         new ScoreBoard("ScoreBoard", 0.0F, 0.0F, 960.0F, 495.5F, -10.0F, 10.0F, HudElement$II1Il11l111II11IIl.Il1I1l1llI1l1lIIIlIlII1II11I1)
      );
      this.StringHolder_8(new AnimatedTab("AnimatedTab"));
      this.StringHolder_8(
         new ArmorHud("ArmorHud", 0.0F, 0.0F, 960.0F, 495.5F, -10.0F, 10.0F, HudElement$II1Il11l111II11IIl.Il1I1l1llI1l1lIIIlIlII1II11I1)
      );
      this.StringHolder_8(
         new TargetPotions(
            "TargetPotions", 0.0F, 0.0F, 960.0F, 495.5F, 119.15234F, 90.0F, HudElement$II1Il11l111II11IIl.Il111lI1lllIIIIll11Il1IIlI
         )
      );
      this.StringHolder_8(new Events("Events", 116.5F, 265.0F, 960.0F, 495.5F, 0.0F, -16.5F, HudElement$II1Il11l111II11IIl.lIll11III1IllI));
      this.StringHolder_8(
         new CloudFriendInfo("CloudFriendInfo", 10.0F, 240.0F, 960.0F, 495.5F, 10.0F, -10.0F, HudElement$II1Il11l111II11IIl.ll1ll11lIlll11I1I)
      );
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
   }

   @Override
   public JsonObject save() {
      JsonObject jsonobject = super.save();
      JsonObject jsonobject1 = new JsonObject();

      for (HudElement ii11l1l11lil1i1 : this.IIl11llII11I1lIIlIIlI1) {
         jsonobject1.add(ii11l1l11lil1i1.getName(), ii11l1l11lil1i1.save());
      }

      jsonobject.add("HudElements", jsonobject1);
      return jsonobject;
   }

   @Override
   public void load(JsonObject jsonobject) {
      super.load(jsonobject);
      if (jsonobject.has("HudElements") && jsonobject.get("HudElements").isJsonObject()) {
         JsonObject jsonobject1 = jsonobject.getAsJsonObject("HudElements");

         for (HudElement ii11l1l11lil1i1 : this.IIl11llII11I1lIIlIIlI1) {
            String s = ii11l1l11lil1i1.getName();
            if (jsonobject1.has(s) && jsonobject1.get(s).isJsonObject()) {
               ii11l1l11lil1i1.load(jsonobject1.getAsJsonObject(s));
            }
         }
      }
   }

   private void StringHolder_8(HudElement ii11l1l11lil1i1) {
      this.IIl11llII11I1lIIlIIlI1.add(ii11l1l11lil1i1);
   }

   public List<HudElement> IlIIIIllll1l1() {
      return Collections.unmodifiableList(this.IIl11llII11I1lIIlIIlI1);
   }

   @Override
   public boolean l1ll1I1lll11l1llIlIlIIIlI11I() {
      return false;
   }

   @EventTarget
   public void EventTarget(EventImpl_37 llllii1liii1i1ll1liiil) {
      if (l11I1I1ll1Illll1I1l1111l1II.world != null
         && l11I1I1ll1Illll1I1l1111l1II.interactionManager != null
         && l11I1I1ll1Illll1I1l1111l1II.player != null
         && !l11I1I1ll1Illll1I1l1111l1II.options.hudHidden) {
         if (!(l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen)) {
            if (this.llIlIII1lIlIIlIIIl11 != null) {
               this.llIlIII1lIlIIlIIIl11.llIIl1lllllII();
               this.llIlIII1lIlIIlIIIl11 = null;
            }

            if (this.ll1llI11I11I != null) {
               this.ll1llI11I11I = null;
            }

            this.Il1lI11111I1IIIl1I1lI111I1l();
         }

         floatHolder_4 iiii1ilili1l1l1lilli1liliii = llllii1liii1i1ll1liiil.Predictions();
         float f = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth();
         float f1 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight();
         iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
         ListHolder_4.StringHolder_8(this.l1ll1l1111IIlllllIlIlll11lI);

         try {
            for (HudElement ii11l1l11lil1i1 : this.IIl11llII11I1lIIlIIlI1) {
               if (this.ZenithInternal095(ii11l1l11lil1i1)) {
                  try {
                     ii11l1l11lil1i1.StringHolder_8(iiii1ilili1l1l1lilli1liliii);
                  } catch (Exception exception) {
                     System.out.println(ii11l1l11lil1i1.getName());
                     exception.printStackTrace();
                  }
               }
            }

            this.l1ll1l1111IIlllllIlIlll11lI.flush();
         } finally {
            ListHolder_4.EventBus(this.l1ll1l1111IIlllllIlIlll11lI);
         }

         if (l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen) {
            Vector2f Vector2f = this.II1IIll1IlI1llII1lIlI1I1();
            float f9 = Vector2f.getX();
            float f2 = Vector2f.getY();
            if (this.llIlIII1lIlIIlIIIl11 != null) {
               this.llIlIII1lIlIIlIIIl11.StringHolder_8(iiii1ilili1l1l1lilli1liliii, f9 - this.dragOffsetX, f2 - this.dragOffsetY, this, f, f1);
            }

            if (this.ll1llI11I11I != null) {
               float f3 = this.ll1llI11I11I.getX();
               float f4 = this.ll1llI11I11I.getY();
               float f5 = (float)Math.sqrt(
                  (double)(
                     (this.IIlllII1IIl11l1lIl1ll1Il1111I - f3) * (this.IIlllII1IIl11l1lIl1ll1Il1111I - f3)
                        + (this.ll1l111I11IIlll1lIlI1 - f4) * (this.ll1l111I11IIlll1lIlI1 - f4)
                  )
               );
               float f6 = (float)Math.sqrt((double)((f9 - f3) * (f9 - f3) + (f2 - f4) * (f2 - f4)));
               if (f5 > 1.0F) {
                  float f7 = f6 / f5;
                  float f8 = this.l1llI11l11I1l11IllIII1Il1 * f7;
                  f8 = Math.max(
                     this.ll1llI11I11I.IIIlI1I1111l1I1IIll().Il1llI11l1(), Math.min(this.ll1llI11I11I.IIIlI1I1111l1I1IIll().Il1IIllllIIIll1I1IIIIIlI(), f8)
                  );
                  this.ll1llI11I11I.IIIlI1I1111l1I1IIll().longHolder_4(f8);
               }
            }

            HudElement ii11l1l11lil1i11 = this.Event((double)f9, (double)f2);
            if (this.ll1llI11I11I == null && (ii11l1l11lil1i11 == null || !ii11l1l11lil1i11.EventTarget((double)f9, (double)f2))) {
               this.Il1lI11111I1IIIl1I1lI111I1l();
            } else {
               this.lIlI1111111ll111l1lllIIlIII();
            }
         } else {
            this.Il1lI11111I1IIIl1I1lI111I1l();
         }

         iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
      }
   }

   private float EventBus(HudElement ii11l1l11lil1i1) {
      return ii11l1l11lil1i1.l1l11Il1l11IlllIIllI();
   }

   private float EventTarget(HudElement ii11l1l11lil1i1) {
      return ii11l1l11lil1i1.I1llllIIIIllIl();
   }

   private boolean ZenithInternal095(HudElement ii11l1l11lil1i1) {
      return ii11l1l11lil1i1.Spider();
   }

   public static float lIl111ll1l111lIIlIlI1I1() {
      return ll11lIl1IlIl1lI1.lIIIII111l1IlIl1lIlllll.lll1lI1llll1IIllIIIII1lll();
   }

   @EventTarget
   public void EventBus(EventImpl_38 lllll1l1iliiiiiiililii11) {
      if (!(l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen)) {
         if (this.llIlIII1lIlIIlIIIl11 != null) {
            this.llIlIII1lIlIIlIIIl11.llIIl1lllllII();
            this.llIlIII1lIlIIlIIIl11 = null;
         }

         if (this.ll1llI11I11I != null) {
            this.ll1llI11I11I = null;
            this.Il1lI11111I1IIIl1I1lI111I1l();
         }
      } else {
         Vector2f Vector2f = this.II1IIll1IlI1llII1lIlI1I1();
         double d0 = (double)Vector2f.getX();
         double d1 = (double)Vector2f.getY();
         if (lllll1l1iliiiiiiililii11.Elytrafly() == 0 && lllll1l1iliiiiiiililii11.Elytratarget() == 1) {
            HudElement ii11l1l11lil1i11 = this.Event(d0, d1);
            if (ii11l1l11lil1i11 != null && !(l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof NLMenuScreen)) {
               if (this.llIlIII1lIlIIlIIIl11 != null) {
                  this.llIlIII1lIlIIlIIIl11.llIIl1lllllII();
                  this.llIlIII1lIlIIlIIIl11 = null;
               }

               this.Event(ii11l1l11lil1i11);
            }
         } else {
            if (lllll1l1iliiiiiiililii11.Elytrafly() == 1 && lllll1l1iliiiiiiililii11.Elytratarget() == 0) {
               HudElement ii11l1l11lil1i1 = this.Event(d0, d1);
               if (ii11l1l11lil1i1 != null) {
                  if (ii11l1l11lil1i1.EventTarget(d0, d1)) {
                     this.ll1llI11I11I = ii11l1l11lil1i1;
                     this.IIlllII1IIl11l1lIl1ll1Il1111I = (float)d0;
                     this.ll1l111I11IIlll1lIlI1 = (float)d1;
                     this.l1llI11l11I1l11IllIII1Il1 = ii11l1l11lil1i1.IIIlI1I1111l1I1IIll().lll1lI1llll1IIllIIIII1lll();
                  } else if (!ii11l1l11lil1i1.StringHolder_8(lllll1l1iliiiiiiililii11)) {
                     this.llIlIII1lIlIIlIIIl11 = ii11l1l11lil1i1;
                     this.dragOffsetX = (float)d0 - this.EventBus(ii11l1l11lil1i1);
                     this.dragOffsetY = (float)d1 - this.EventTarget(ii11l1l11lil1i1);
                  }

                  System.out.println(ii11l1l11lil1i1);
               }
            } else if (lllll1l1iliiiiiiililii11.Elytrafly() == 0) {
               if (this.ll1llI11I11I != null) {
                  this.ll1llI11I11I = null;
                  this.Il1lI11111I1IIIl1I1lI111I1l();
               }

               if (this.llIlIII1lIlIIlIIIl11 != null) {
                  this.llIlIII1lIlIIlIIIl11.llIIl1lllllII();
                  this.llIlIII1lIlIIlIIIl11 = null;
               }
            }
         }
      }
   }

   private void lIlI1111111ll111l1lllIIlIII() {
      if (!this.l1lIIlllll1llIIIIll1) {
         if (this.l1l1l1Il11Il1llIIlIl1IIlIIl == 0L) {
            this.l1l1l1Il11Il1llIIlIl1IIlIIl = GLFW.glfwCreateStandardCursor(221189);
         }

         if (this.l1l1l1Il11Il1llIIlIl1IIlIIl != 0L) {
            GLFW.glfwSetCursor(l11I1I1ll1Illll1I1l1111l1II.getWindow().getHandle(), this.l1l1l1Il11Il1llIIlIl1IIlIIl);
            this.l1lIIlllll1llIIIIll1 = true;
         }
      }
   }

   private void Il1lI11111I1IIIl1I1lI111I1l() {
      if (this.l1lIIlllll1llIIIIll1) {
         GLFW.glfwSetCursor(l11I1I1ll1Illll1I1l1111l1II.getWindow().getHandle(), 0L);
         this.l1lIIlllll1llIIIIll1 = false;
      }
   }

   private HudElement Event(double d0, double d1) {
      for (int i = this.IIl11llII11I1lIIlIIlI1.size() - 1; i >= 0; i--) {
         HudElement ii11l1l11lil1i1 = this.IIl11llII11I1lIIlIIlI1.get(i);
         if (this.ZenithInternal095(ii11l1l11lil1i1) && ii11l1l11lil1i1.EventBus(d0, d1)) {
            return ii11l1l11lil1i1;
         }
      }

      return null;
   }

   private void Event(HudElement ii11l1l11lil1i1) {
      NLMenuScreen nlmenuscreen = ZenithClient.getInstance().ZenithInternal141();
      if (nlmenuscreen != null && ii11l1l11lil1i1 != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != nlmenuscreen) {
            if (!Menu.lllIl11II111Illll1IlIll.Spider()) {
               Menu.lllIl11II111Illll1IlIll.lI1Il11I1l1III11IIlI1lI1II11I();
            } else {
               l11I1I1ll1Illll1I1l1111l1II.setScreen(nlmenuscreen);
            }
         }

         nlmenuscreen.openHudElementSettings(ii11l1l11lil1i1);
      }
   }

   public float l1llII111lIIll() {
      return (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaleFactor();
   }

   private Vector2f II1IIll1IlI1llII1lIlI1I1() {
      return ZenithInternal143.ZenithInternal064((double)this.l1llII111lIIll());
   }

   public Vector2f StringHolder_4(float f, float f1) {
      float f2 = Float.MAX_VALUE;
      float f3 = Float.MAX_VALUE;
      float f4 = 2.0F;
      Vector2f vector2f = new Vector2f(-1.0F, -1.0F);
      float f5 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() / 2.0F;
      float f6 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() / 2.0F;
      float f7 = this.longHolder_3(f5, f5, f5, f);
      float f8 = this.longHolder_3(f6, f6, f6, f1);
      float f9 = doubleHolder_3.ZenithInternal101(f7, f);
      float f10 = doubleHolder_3.ZenithInternal101(f8, f1);
      boolean flag = false;
      if (f9 < f2 && f9 < f4) {
         vector2f.x = f7;
         flag = true;
      }

      if (f10 < f3 && f10 < f4) {
         vector2f.y = f8;
         flag = true;
      }

      if (flag) {
         return vector2f;
      } else {
         for (HudElement ii11l1l11lil1i1 : this.IIl11llII11I1lIIlIIlI1) {
            if (!ii11l1l11lil1i1.equals(this.llIlIII1lIlIIlIIIl11) && this.ZenithInternal095(ii11l1l11lil1i1)) {
               f7 = this.EventBus(ii11l1l11lil1i1);
               f8 = this.EventTarget(ii11l1l11lil1i1);
               f9 = f7 + ii11l1l11lil1i1.lI11l1IIl1II11l11lI11();
               f10 = f8 + ii11l1l11lil1i1.lll1lI1I1l1l();
               float f16 = f7 + ii11l1l11lil1i1.lI11l1IIl1II11l11lI11() / 2.0F;
               float f11 = f8 + ii11l1l11lil1i1.lll1lI1I1l1l() / 2.0F;
               float f12 = this.longHolder_3(f7, f9, f16, f);
               float f13 = this.longHolder_3(f8, f10, f11, f1);
               float f14 = doubleHolder_3.ZenithInternal101(f12, f);
               float f15 = doubleHolder_3.ZenithInternal101(f13, f1);
               if (f14 < f2) {
                  f2 = f14;
                  if (f14 < f4) {
                     vector2f.x = f12;
                  }
               }

               if (f15 < f3) {
                  f3 = f15;
                  if (f15 < f4) {
                     vector2f.y = f13;
                  }
               }
            }
         }

         return vector2f;
      }
   }

   public float longHolder_3(float f, float f1, float f2, float f3) {
      float f4 = f;
      if (doubleHolder_3.ZenithInternal101(f1, f3) < doubleHolder_3.ZenithInternal101(f, f3)) {
         f4 = f1;
      }

      if (doubleHolder_3.ZenithInternal101(f2, f3) < doubleHolder_3.ZenithInternal101(f4, f3)) {
         f4 = f2;
      }

      return f4;
   }

   public boolean lll1I11l1111II111IlIlI1Il() {
      return this.ZenithInternal041("ScoreBoard");
   }

   public boolean lIIIIl11l111IIIIl1lI1I11I() {
      return this.ZenithInternal041("HootBar");
   }

   public boolean II11lI11l11IIIllIl11l() {
      return this.ZenithInternal041("AnimatedTab");
   }

   public boolean ll1II1lI1I1Illl11() {
      return this.ZenithInternal041("Notifications");
   }

   private boolean ZenithInternal041(String s) {
      for (HudElement ii11l1l11lil1i1 : this.IIl11llII11I1lIIlIIlI1) {
         if (ii11l1l11lil1i1.getName().equals(s)) {
            return ii11l1l11lil1i1.Spider();
         }
      }

      return false;
   }

   @EventTarget
   public void ZenithInternal028(EventImpl_22 l11llilil1) {
      float f = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth();
      float f1 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight();
      if (HashMapHolder.lI11I11I1Il1IlI1IlI1lI.size() > 400) {
         HashMapHolder.lI11I11I1Il1IlI1IlI1lI.values().removeIf(li1illlill$l1i1illlili -> {
            if (li1illlill$l1i1illlili.lIII1llIlIl1ll11lIl1I1Ill1()) {
               li1illlill$l1i1illlili.I1lIIl1I1l11l1IlIIII11lIlIll1();
               return true;
            } else {
               return false;
            }
         });
      }

      for (HudElement ii11l1l11lil1i1 : this.IIl11llII11I1lIIlIIlI1) {
         if (this.ZenithInternal095(ii11l1l11lil1i1)) {
            try {
               ii11l1l11lil1i1.tick();
            } catch (Throwable throwable) {
               System.out.println(ii11l1l11lil1i1.getName());
               throwable.printStackTrace();
            }
         }

         if (ii11l1l11lil1i1 != this.llIlIII1lIlIIlIIIl11) {
            ii11l1l11lil1i1.EventTarget(f, f1);
         }
      }
   }

   public boolean lI11l1I1l11() {
      return this.Il1lIll111111ll1l1l1lI1l1I1.Spider();
   }

   public boolean lII1ll11II1ll1I1l111Il1lI() {
      return this.II1l1l1ll1IlIllI1I1III1lll11l.Spider();
   }

   public boolean Il11II1l1111lIIlllI1I1llII() {
      return this.llI1IlllIlII11l1I1111II11l.Spider();
   }

   public boolean l1I11llIIl111llI1IIIll11lI11I() {
      return this.llI1IlllIlII11l1I1111II11l.Spider() && this.Illll1IIIIIl.ClearHeadersHandler(0);
   }

   public boolean I1Il1lIIlIll1I111IlII() {
      return false;
   }

   public int l1IIl1llllIII() {
      return (int)this.l1Il1Il1lIIIII1IIlII.lll1lI1llll1IIllIIIII1lll();
   }

   public ByteBufferHolder lI1I1l1l1I11Il1lI1lll11ll11IlI() {
      return ZenithClient.getInstance()
         .floatHolder_3()
         .getCurrentStyle()
         .getGlareColor()
         .l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public float lllI1lIIII11l11l1() {
      return this.I1l1IllI1IIIlII1.lll1lI1llll1IIllIIIII1lll();
   }
}
