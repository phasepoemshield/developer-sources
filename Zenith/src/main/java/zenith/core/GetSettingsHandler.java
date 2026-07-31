package zenith;

import zenith.hud.*;

import java.util.List;

public class GetSettingsHandler {
   private final String I1l1I1IIIIl111I1Ill1ll1lI111I;
   private String username;
   private String role;
   private StringHolder_22 I1111lII1IIl1Il1I1lIIIlI11llI;
   private StringHolder_15 IIlI1lI1lI1Il1l111lIl111IIlll;
   private long III1I1III11II11llllIlII;
   private long l1I11III1lllIII1l;
   private net.minecraft.util.math.Vec3d I1I111ll;
   private net.minecraft.util.math.Vec3d lIIlIllIIll1;
   private long IIlIIllIIlIIlIIIl;
   private long IlIl11llIl1l11l111IIlllllI;
   private final BooleanSetting IIlI11l1lll1l1II1 = new BooleanSetting("Render Cosmetics", true);
   private final BooleanSetting IIl1Ill1lIII1I11lIl1l1IIIl = new BooleanSetting("Render Inventory", true);

   public GetSettingsHandler(String s, String s1, String s2) {
      this.I1l1I1IIIIl111I1Ill1ll1lI111I = s;
      this.username = s1 == null ? "" : s1;
      this.role = s2 == null ? "" : s2;
   }

   public String Autoexplosion() {
      return this.I1l1I1IIIIl111I1Ill1ll1lI111I;
   }

   public String Autoswap() {
      return this.username;
   }

   public String Autototem() {
      return this.role;
   }

   public void ZenithInternal016(String s) {
      this.username = s == null ? "" : s;
   }

   public void setRole(String s) {
      this.role = s == null ? "" : s;
   }

   public StringHolder_22 Reachv3() {
      return this.I1111lII1IIl1Il1I1lIIIlI11llI;
   }

   public StringHolder_15 Blink() {
      return this.IIlI1lI1lI1Il1l111lIl111IIlll;
   }

   public long Criticals() {
      return this.III1I1III11II11llllIlII;
   }

   public void EventBus(StringHolder_15 illiilillliiiil1liil) {
      this.IIlI1lI1lI1Il1l111lIl111IIlll = illiilillliiiil1liil;
      this.III1I1III11II11llllIlII = System.currentTimeMillis();
   }

   public void EventBus(StringHolder_22 l1liil1ili1iiii1lliii1l1li) {
      if (this.I1111lII1IIl1Il1I1lIIIlI11llI != null) {
         if (this.IIlI11l1lll1l1II1.Spider()
            && !l1liil1ili1iiii1lliii1l1li.Fastbreak().equals(this.I1111lII1IIl1Il1I1lIIIlI11llI.Fastbreak())) {
            StringHolder_23.EventBus(l1liil1ili1iiii1lliii1l1li.Nofrienddamage(), l1liil1ili1iiii1lliii1l1li.Fastbreak());
         }

         if (this.IIlI11l1lll1l1II1.Spider()) {
            String s = l1liil1ili1iiii1lliii1l1li.Freecam();
            String s1 = this.I1111lII1IIl1Il1I1lIIIlI11llI.Freecam();
            if (!s.equals(s1)) {
               ZenithClient.getInstance()
                  .BlockPosHolder()
                  .StringHolder_8(l1liil1ili1iiii1lliii1l1li.Nofrienddamage(), s);
            }
         }
      }

      long i = System.currentTimeMillis();
      if (this.I1111lII1IIl1Il1I1lIIIlI11llI != null && this.I1111lII1IIl1Il1I1lIIIlI11llI.Debug() != null) {
         this.I1I111ll = this.I1111lII1IIl1Il1I1lIIIlI11llI.Debug();
         this.lIIlIllIIll1 = this.I1111lII1IIl1Il1I1lIIIlI11llI.Inventorysetting();
         this.IIlIIllIIlIIlIIIl = this.IlIl11llIl1l11l111IIlllllI;
      } else if (l1liil1ili1iiii1lliii1l1li != null) {
         this.I1I111ll = l1liil1ili1iiii1lliii1l1li.Debug();
         this.lIIlIllIIll1 = l1liil1ili1iiii1lliii1l1li.Inventorysetting();
         this.IIlIIllIIlIIlIIIl = i;
      }

      this.IlIl11llIl1l11l111IIlllllI = i;
      this.I1111lII1IIl1Il1I1lIIIlI11llI = l1liil1ili1iiii1lliii1l1li;
   }

   public net.minecraft.util.math.Vec3d Fakelag() {
      if (this.I1111lII1IIl1Il1I1lIIIlI11llI != null && this.I1111lII1IIl1Il1I1lIIIlI11llI.Debug() != null) {
         net.minecraft.util.math.Vec3d Vec3d = this.I1111lII1IIl1Il1I1lIIIlI11llI.Debug();
         if (this.I1I111ll == null) {
            return Vec3d;
         } else {
            long i = Math.max(1L, this.IlIl11llIl1l11l111IIlllllI - this.IIlIIllIIlIIlIIIl);
            double d0 = (double)(System.currentTimeMillis() - this.IlIl11llIl1l11l111IIlllllI) / (double)i;
            if (d0 <= 0.0) {
               return this.I1I111ll;
            } else {
               return d0 >= 1.0
                  ? Vec3d
                  : new net.minecraft.util.math.Vec3d(
                     this.I1I111ll.x + (Vec3d.x - this.I1I111ll.x) * d0,
                     this.I1I111ll.y + (Vec3d.y - this.I1I111ll.y) * d0,
                     this.I1I111ll.z + (Vec3d.z - this.I1I111ll.z) * d0
                  );
            }
         }
      } else {
         return null;
      }
   }

   public net.minecraft.util.math.Vec3d Offhandmanager() {
      if (this.I1111lII1IIl1Il1I1lIIIlI11llI != null && this.I1111lII1IIl1Il1I1lIIIlI11llI.Inventorysetting() != null) {
         net.minecraft.util.math.Vec3d Vec3d = this.I1111lII1IIl1Il1I1lIIIlI11llI.Inventorysetting();
         if (this.lIIlIllIIll1 == null) {
            return Vec3d;
         } else {
            long i = Math.max(1L, this.IlIl11llIl1l11l111IIlllllI - this.IIlIIllIIlIIlIIIl);
            double d0 = (double)(System.currentTimeMillis() - this.IlIl11llIl1l11l111IIlllllI) / (double)i;
            if (d0 <= 0.0) {
               return this.lIIlIllIIll1;
            } else {
               return d0 >= 1.0
                  ? Vec3d
                  : new net.minecraft.util.math.Vec3d(
                     this.lIIlIllIIll1.x + (Vec3d.x - this.lIIlIllIIll1.x) * d0,
                     this.lIIlIllIIll1.y + (Vec3d.y - this.lIIlIllIIll1.y) * d0,
                     this.lIIlIllIIll1.z + (Vec3d.z - this.lIIlIllIIll1.z) * d0
                  );
            }
         }
      } else {
         return null;
      }
   }

   public boolean Reach() {
      return System.currentTimeMillis() - this.l1I11III1lllIII1l < 60000L;
   }

   public boolean Rotationrecorder() {
      if (this.I1111lII1IIl1Il1I1lIIIlI11llI == null) {
         return false;
      } else {
         String s = ZenithClient.getInstance().SupplierHolder().getServer();
         String s1 = this.I1111lII1IIl1Il1I1lIIIlI11llI.Clickaction();
         if (!ZenithInternal128(s, s1)) {
            return false;
         } else {
            net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
            String s2 = MinecraftClient != null && MinecraftClient.world != null ? MinecraftClient.world.getRegistryKey().getValue().toString() : "";
            return ZenithInternal128(s2, this.I1111lII1IIl1Il1I1lIIIlI11llI.Fakeplayer());
         }
      }
   }

   private static boolean ZenithInternal128(String s, String s1) {
      String s2 = s == null ? "" : s;
      String s3 = s1 == null ? "" : s1;
      return !s2.isBlank() && !s3.isBlank() ? s2.equalsIgnoreCase(s3) : true;
   }

   @Override
   public String toString() {
      String s = this.role != null && !this.role.isEmpty() ? this.role : "USER";
      return this.I1l1I1IIIIl111I1Ill1ll1lI111I + " | " + this.username + " [" + s + "]";
   }

   public void Targetpearl() {
      this.l1I11III1lllIII1l = System.currentTimeMillis();
   }

   public List<Setting> getSettings() {
      return List.of(this.IIlI11l1lll1l1II1, this.IIl1Ill1lIII1I11lIl1l1IIIl);
   }

   public BooleanSetting Triggerbot() {
      return this.IIlI11l1lll1l1II1;
   }

   public BooleanSetting Autoaccept() {
      return this.IIl1Ill1lIII1I11lIl1l1IIIl;
   }
}
