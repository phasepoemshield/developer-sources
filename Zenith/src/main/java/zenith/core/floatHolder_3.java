package zenith;

import zenith.hud.*;

import com.google.gson.JsonObject;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.EntityPose;

public class floatHolder_3 implements ZenithInternal076 {
   public static final float llIllllIlI = 0.4F;
   private static final int llI11IllI1111Il = 8;
   private final MultiBooleanSetting lIIll1ll11111I1llII111IllI1ll = new MultiBooleanSetting("cosmetics.pet.render");
   private final NumberSetting Ill1l1IlIll;
   private Path lll1lI1llll1IIllIIIII1lll;
   private MinecraftClientHolder_5 Il1llI11l1;
   private final Map<UUID, MinecraftClientHolder_5> Il1IIllllIIIll1I1IIIIIlI;
   private static final Set<UUID> IIl11llIllllI1lI11I = ConcurrentHashMap.newKeySet();
   private static final Set<Integer> II1lIllIlI1ll1I1I1Illl1I = ConcurrentHashMap.newKeySet();

   public List<Setting> getSettings() {
      return Arrays.stream(this.getClass().getDeclaredFields()).map(field -> {
         try {
            field.setAccessible(true);
            return field.get(this);
         } catch (Exception exception) {
            return null;
         }
      }).filter(object -> object instanceof Setting).map(object -> (Setting)object).collect(Collectors.toList());
   }

   public boolean ZenithInternal151() {
      return !this.lIIll1ll11111I1llII111IllI1ll.EventImpl_3("cosmetics.pet.render.self").Spider()
         && !this.lIIll1ll11111I1llII111IllI1ll.EventImpl_3("cosmetics.pet.render.friends").Spider();
   }

   public boolean ZenithInternal089() {
      return this.lIIll1ll11111I1llII111IllI1ll.EventImpl_3("cosmetics.pet.render.self").Spider();
   }

   public boolean ZenithInternal083() {
      return this.lIIll1ll11111I1llII111IllI1ll.EventImpl_3("cosmetics.pet.render.friends").Spider();
   }

   public floatHolder_3() {
      new MultiBooleanSetting$II1Il11l111II11IIl(this.lIIll1ll11111I1llII111IllI1ll, "cosmetics.pet.render.self", true);
      new MultiBooleanSetting$II1Il11l111II11IIl(this.lIIll1ll11111I1llII111IllI1ll, "cosmetics.pet.render.friends", true);
      this.Ill1l1IlIll = new NumberSetting("cosmetics.pet.scale", 0.4F, 0.1F, 2.0F, 0.05F, (f, f1) -> this.SetColorHandler());
      this.Il1IIllllIIIll1I1IIIIIlI = new ConcurrentHashMap<>();
      EventBus.StringHolder_8(this);
   }

   public void EventBus(Path path) {
      this.lll1lI1llll1IIllIIIII1lll = path;
      if (path != null && l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         this.booleanHolder_5();
         this.Il1llI11l1.EventTarget(path);
      } else if (path == null && this.Il1llI11l1 != null) {
         this.MinecraftClientHolder_2();
      }
   }

   public String ZenithInternal037() {
      return StringHolder_23.ZenithInternal095(this.lll1lI1llll1IIllIIIII1lll);
   }

   public net.minecraft.util.math.Vec3d RandomHolder() {
      return this.Il1llI11l1 != null && this.Il1llI11l1.Vec3dHolder() ? this.Il1llI11l1.doubleHolder() : null;
   }

   public float doubleHolder_3() {
      return this.Il1llI11l1 != null ? this.Il1llI11l1.ZenithInternal116() : 0.0F;
   }

   public boolean ZenithInternal094() {
      return l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.isSneaking();
   }

   public static boolean StringHolder_8(UUID uuid) {
      return uuid != null && IIl11llIllllI1lI11I.contains(uuid);
   }

   public static boolean SecureRandomHolder_2(int i) {
      return II1lIllIlI1ll1I1I1Illl1I.contains(i);
   }

   public static void StringHolder_8(MinecraftClientHolder_5 lii1l1l11illii1lilliililiil111) {
      if (lii1l1l11illii1lilliililiil111 != null && lii1l1l11illii1lilliililiil111.StringHolder_3() != null) {
         IIl11llIllllI1lI11I.add(lii1l1l11illii1lilliililiil111.floatHolder_13());
         II1lIllIlI1ll1I1I1Illl1I.add(lii1l1l11illii1lilliililiil111.StringHolder_3().getId());
      }
   }

   public static void EventBus(MinecraftClientHolder_5 lii1l1l11illii1lilliililiil111) {
      if (lii1l1l11illii1lilliililiil111 != null) {
         IIl11llIllllI1lI11I.remove(lii1l1l11illii1lilliililiil111.floatHolder_13());
         if (lii1l1l11illii1lilliililiil111.StringHolder_3() != null) {
            II1lIllIlI1ll1I1I1Illl1I.remove(lii1l1l11illii1lilliililiil111.StringHolder_3().getId());
         }
      }
   }

   @EventTarget
   public void EventBus(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         this.ZenithInternal091();
         this.TimerUtil();
      } else {
         this.MinecraftClientHolder();
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl i11l1llliliili11i) {
      if (this.Il1llI11l1 != null && this.Il1llI11l1.Vec3dHolder()) {
         this.Il1llI11l1.ZenithInternal004();
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_34 ll1li1l111llllli1) {
      if (this.Il1llI11l1 != null && this.Il1llI11l1.Vec3dHolder()) {
         net.minecraft.util.math.Vec3d Vec3dx = this.Il1llI11l1.hasTimeElapsed(ll1li1l111llllli1.Particles());
         if (Vec3dx != null && this.Il1llI11l1.StringHolder_3() != null) {
            this.Il1llI11l1.StringHolder_3().updateTrackedPosition(Vec3dx.x, Vec3dx.y, Vec3dx.z);
         }
      }

      for (MinecraftClientHolder_5 lii1l1l11illii1lilliililiil111 : this.Il1IIllllIIIll1I1IIIIIlI.values()) {
         if (lii1l1l11illii1lilliililiil111.Vec3dHolder()) {
            net.minecraft.util.math.Vec3d Vec3d = lii1l1l11illii1lilliililiil111.hasTimeElapsed(ll1li1l111llllli1.Particles());
            if (Vec3d != null && lii1l1l11illii1lilliililiil111.StringHolder_3() != null) {
               lii1l1l11illii1lilliililiil111.StringHolder_3().updateTrackedPosition(Vec3d.x, Vec3d.y, Vec3d.z);
            }
         }
      }
   }

   private void ZenithInternal091() {
      if (this.lll1lI1llll1IIllIIIII1lll != null && this.ZenithInternal089()) {
         this.booleanHolder_5();
         if (!this.Il1llI11l1.Vec3dHolder()) {
            net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getPos().add(2.0, 0.0, 0.0);
            this.Il1llI11l1.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.world, Vec3d);
            this.Il1llI11l1.EventTarget(this.lll1lI1llll1IIllIIIII1lll);
            StringHolder_8(this.Il1llI11l1);
         }

         this.Il1llI11l1.ListHolder_6(this.longHolder());
         LivingEntity LivingEntity = null;

         try {
            Aura liil1li11l111lil1liiii1ill = Aura.ll1II1l1lII11IlII1;
            LivingEntity = liil1li11l111lil1liiii1ill.lI1IIllII11I() == null
               ? Aimassist.lI1l1I1l1l1Il.lI1IIllII11I()
               : liil1li11l111lil1liiii1ill.lI1IIllII11I();
         } catch (Exception exception) {
         }

         this.Il1llI11l1
            .StringHolder_8(
               l11I1I1ll1Illll1I1l1111l1II.player.getPos(),
               l11I1I1ll1Illll1I1l1111l1II.player.bodyYaw,
               l11I1I1ll1Illll1I1l1111l1II.player.isSneaking(),
               LivingEntity
            );
         this.Il1llI11l1.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.player);
         if (this.Il1llI11l1.StringHolder_3() != null) {
            this.Il1llI11l1.StringHolder_3().handSwingProgress = l11I1I1ll1Illll1I1l1111l1II.player.handSwingProgress;
            this.Il1llI11l1.StringHolder_3().handSwinging = l11I1I1ll1Illll1I1l1111l1II.player.handSwinging;
            this.Il1llI11l1.StringHolder_3().handSwingTicks = l11I1I1ll1Illll1I1l1111l1II.player.handSwingTicks;
            this.Il1llI11l1.StringHolder_3().preferredHand = l11I1I1ll1Illll1I1l1111l1II.player.preferredHand;
            this.Il1llI11l1.StringHolder_3().setSneaking(l11I1I1ll1Illll1I1l1111l1II.player.isSneaking());
            this.Il1llI11l1
               .StringHolder_3()
               .setPose(l11I1I1ll1Illll1I1l1111l1II.player.isSneaking() ? EntityPose.CROUCHING : EntityPose.STANDING);
         }
      } else {
         if (this.Il1llI11l1 != null) {
            this.MinecraftClientHolder_2();
         }
      }
   }

   private void TimerUtil() {
      if (l11I1I1ll1Illll1I1l1111l1II.world != null && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         if (!this.ZenithInternal083()) {
            for (MinecraftClientHolder_5 lii1l1l11illii1lilliililiil111 : this.Il1IIllllIIIll1I1IIIIIlI.values()) {
               EventBus(lii1l1l11illii1lilliililiil111);
               lii1l1l11illii1lilliililiil111.StringHolder_7();
            }

            this.Il1IIllllIIIll1I1IIIIIlI.clear();
         } else {
            String s = ZenithClient.getInstance().SupplierHolder().getServer();
            String s1 = l11I1I1ll1Illll1I1l1111l1II.player.getWorld() != null
               ? l11I1I1ll1Illll1I1l1111l1II.player.getWorld().getRegistryKey().getValue().toString()
               : "";
            HashSet hashset = new HashSet();
            int i = 0;

            for (GetSettingsHandler i11ll1111lil11i : ZenithClient.getInstance()
               .StringHolder_26()
               .ZenithInternal001()) {
               if (i >= 8) {
                  break;
               }

               StringHolder_22 l1liil1ili1iiii1lliii1l1li = i11ll1111lil11i.Reachv3();
               if (l1liil1ili1iiii1lliii1l1li != null && i11ll1111lil11i.Reach() && i11ll1111lil11i.Triggerbot().Spider()) {
                  String s2 = l1liil1ili1iiii1lliii1l1li.Freecam();
                  if (s2 != null
                     && !s2.isBlank()
                     && s.equals(l1liil1ili1iiii1lliii1l1li.Clickaction())
                     && s1.equals(l1liil1ili1iiii1lliii1l1li.Fakeplayer())) {
                     UUID uuid = l1liil1ili1iiii1lliii1l1li.Nofrienddamage();
                     hashset.add(uuid);
                     MinecraftClientHolder_5 lii1l1l11illii1lilliililiil111x = this.Il1IIllllIIIll1I1IIIIIlI
                        .computeIfAbsent(uuid, uuid1 -> new MinecraftClientHolder_5(uuid1));
                     if (!lii1l1l11illii1lilliililiil111x.Vec3dHolder()) {
                        lii1l1l11illii1lilliililiil111x.StringHolder_8(
                           l11I1I1ll1Illll1I1l1111l1II.world, l1liil1ili1iiii1lliii1l1li.Debug().add(2.0, 0.0, 0.0)
                        );
                        StringHolder_8(lii1l1l11illii1lilliililiil111x);
                     }

                     lii1l1l11illii1lilliililiil111x.ScreenHolder(s2);
                     lii1l1l11illii1lilliililiil111x.CallableImpl(l1liil1ili1iiii1lliii1l1li.Itemscroller());
                     net.minecraft.util.math.Vec3d Vec3d = i11ll1111lil11i.Offhandmanager();
                     if (Vec3d == null) {
                        Vec3d = l1liil1ili1iiii1lliii1l1li.Inventorysetting();
                     }

                     if (Vec3d != null) {
                        lii1l1l11illii1lilliililiil111x.StringHolder_8(
                           Vec3d, l1liil1ili1iiii1lliii1l1li.Itemusecontroller(), l1liil1ili1iiii1lliii1l1li.Nameprotect()
                        );
                     }

                     PlayerEntity PlayerEntity = l11I1I1ll1Illll1I1l1111l1II.world.getPlayerByUuid(uuid);
                     if (PlayerEntity != null) {
                        lii1l1l11illii1lilliililiil111x.StringHolder_8(PlayerEntity);
                     }

                     i++;
                  }
               }
            }

            Iterator iterator = this.Il1IIllllIIIll1I1IIIIIlI.entrySet().iterator();

            while (iterator.hasNext()) {
               Entry entry = (Entry)iterator.next();
               if (!hashset.contains(entry.getKey())) {
                  EventBus((MinecraftClientHolder_5)entry.getValue());
                  ((MinecraftClientHolder_5)entry.getValue()).StringHolder_7();
                  iterator.remove();
               }
            }
         }
      }
   }

   private boolean longHolder() {
      return l11I1I1ll1Illll1I1l1111l1II.player == null
         ? false
         : l11I1I1ll1Illll1I1l1111l1II.player.getAbilities().flying || l11I1I1ll1Illll1I1l1111l1II.player.isGliding();
   }

   private void booleanHolder_5() {
      if (this.Il1llI11l1 == null) {
         this.Il1llI11l1 = new MinecraftClientHolder_5(l11I1I1ll1Illll1I1l1111l1II.player.getUuid());
      }
   }

   private void MinecraftClientHolder_2() {
      if (this.Il1llI11l1 != null) {
         EventBus(this.Il1llI11l1);
         this.Il1llI11l1.StringHolder_7();
         this.Il1llI11l1 = null;
      }
   }

   public void StringHolder_8(UUID uuid, String s) {
   }

   public float SetColorHandler_2() {
      return this.Ill1l1IlIll.lll1lI1llll1IIllIIIII1lll();
   }

   private void SetColorHandler() {
      if (this.Il1llI11l1 != null) {
         this.Il1llI11l1.CallableImpl(this.SetColorHandler_2());
      }
   }

   public JsonObject save() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("name", StringHolder_23.ZenithInternal095(this.lll1lI1llll1IIllIIIII1lll));
      JsonObject jsonobject1 = new JsonObject();

      for (Setting l1i111illi1i1 : this.getSettings()) {
         l1i111illi1i1.safe(jsonobject1);
      }

      jsonobject.add("settings", jsonobject1);
      return jsonobject;
   }

   public void load(JsonObject jsonobject) {
      if (jsonobject != null) {
         if (jsonobject.has("settings") && jsonobject.get("settings").isJsonObject()) {
            JsonObject jsonobject1 = jsonobject.getAsJsonObject("settings");

            for (Setting l1i111illi1i1 : this.getSettings()) {
               if (jsonobject1.has(l1i111illi1i1.getName())) {
                  l1i111illi1i1.load(jsonobject1);
               }
            }
         }

         if (jsonobject.has("name")) {
            String s = jsonobject.get("name").isJsonNull() ? "" : jsonobject.get("name").getAsString();
            this.EventBus(s != null && !s.isBlank() ? StringHolder_23.EventImpl_29(s) : null);
         }
      }
   }

   public void MinecraftClientHolder() {
      this.MinecraftClientHolder_2();

      for (MinecraftClientHolder_5 lii1l1l11illii1lilliililiil111 : this.Il1IIllllIIIll1I1IIIIIlI.values()) {
         EventBus(lii1l1l11illii1lilliililiil111);
         lii1l1l11illii1lilliililiil111.StringHolder_7();
      }

      this.Il1IIllllIIIll1I1IIIIIlI.clear();
   }

   public MultiBooleanSetting IGetSize() {
      return this.lIIll1ll11111I1llII111IllI1ll;
   }

   public NumberSetting MinecraftClientHolder_4() {
      return this.Ill1l1IlIll;
   }

   public Path ZenithInternal063() {
      return this.lll1lI1llll1IIllIIIII1lll;
   }
}
