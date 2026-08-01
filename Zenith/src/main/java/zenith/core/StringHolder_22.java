package zenith;

import zenith.hud.*;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.UUID;

public final class StringHolder_22 {
   public static final String II1IIlIIll111 = "CLOUD_TICK|";
   private final String I111lIlIllIl11Il11l;
   private final String I11lI1Il11IllIlIl11I;
   private final net.minecraft.util.math.Vec3d l1l111I11I1I;
   private final float l11I11IIIlIlIlIlll1I1II1I11;
   private final String lIlIIlI1IlllI11;
   private final String ll1IIIII1I11l11;
   private final String II1lI1l1llIl1II11;
   private final net.minecraft.util.math.Vec3d I111llllI1I1lllI;
   private final float IlI11lIIlIl1Il1I1lI;
   private final float llIIII1Il1IIIIlI111ll1lIIlll;
   private final boolean IIIll1lIIllllIl11I1lllI1I1l;
   private final UUID Il1Il1lIIl11I1lIlIlI1llll;

   public StringHolder_22(
      String s,
      String s1,
      UUID uuid,
      net.minecraft.util.math.Vec3d Vec3d,
      float f,
      String s2,
      String s3,
      String s4,
      net.minecraft.util.math.Vec3d Vec3d,
      float f1,
      float f2,
      boolean flag
   ) {
      this.I111lIlIllIl11Il11l = s;
      this.I11lI1Il11IllIlIl11I = s1;
      this.Il1Il1lIIl11I1lIlIlI1llll = uuid;
      this.l1l111I11I1I = Vec3dx;
      this.l11I11IIIlIlIlIlll1I1II1I11 = f;
      this.lIlIIlI1IlllI11 = s2;
      this.ll1IIIII1I11l11 = s3 == null ? "" : s3;
      this.II1lI1l1llIl1II11 = s4 == null ? "" : s4;
      this.I111llllI1I1lllI = Vec3d;
      this.IlI11lIIlIl1Il1I1lI = f1;
      this.llIIII1Il1IIIIlI111ll1lIIlll = f2;
      this.IIIll1lIIllllIl11I1lllI1I1l = flag;
   }

   public String Clickaction() {
      return this.I111lIlIllIl11Il11l;
   }

   public String Containerhelper() {
      return this.I11lI1Il11IllIlIl11I;
   }

   public net.minecraft.util.math.Vec3d Debug() {
      return this.l1l111I11I1I;
   }

   public float Elytrahelper() {
      return this.l11I11IIIlIlIlIlll1I1II1I11;
   }

   public String Fakeplayer() {
      return this.lIlIIlI1IlllI11;
   }

   public String Fastbreak() {
      return this.ll1IIIII1I11l11;
   }

   public String Freecam() {
      return this.II1lI1l1llIl1II11;
   }

   public net.minecraft.util.math.Vec3d Inventorysetting() {
      return this.I111llllI1I1lllI;
   }

   public float Itemscroller() {
      return this.IlI11lIIlIl1Il1I1lI;
   }

   public float Itemusecontroller() {
      return this.llIIII1Il1IIIIlI111ll1lIIlll;
   }

   public boolean Nameprotect() {
      return this.IIIll1lIIllllIl11I1lllI1I1l;
   }

   public UUID Nofrienddamage() {
      return this.Il1Il1lIIl11I1lIlIlI1llll;
   }

   public String Autoweb() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("ipServer", this.I111lIlIllIl11Il11l);
      jsonobject.addProperty("nicknameInMinecraft", this.I11lI1Il11IllIlIl11I);
      jsonobject.addProperty("health", this.l11I11IIIlIlIlIlll1I1II1I11);
      jsonobject.addProperty("worldKey", this.lIlIIlI1IlllI11);
      jsonobject.addProperty("modelId", this.ll1IIIII1I11l11);
      jsonobject.addProperty("petModelId", this.II1lI1l1llIl1II11);
      jsonobject.addProperty("petScale", this.IlI11lIIlIl1Il1I1lI);
      if (this.I111llllI1I1lllI != null) {
         JsonObject jsonobject1 = new JsonObject();
         jsonobject1.addProperty("x", this.I111llllI1I1lllI.x);
         jsonobject1.addProperty("y", this.I111llllI1I1lllI.y);
         jsonobject1.addProperty("z", this.I111llllI1I1lllI.z);
         jsonobject.add("petPos", jsonobject1);
         jsonobject.addProperty("petYaw", this.llIIII1Il1IIIIlI111ll1lIIlll);
         jsonobject.addProperty("petSneak", this.IIIll1lIIllllIl11I1lllI1I1l);
      }

      jsonobject.addProperty("uuid", this.Il1Il1lIIl11I1lIlIlI1llll.toString());
      JsonObject jsonobject2 = new JsonObject();
      jsonobject2.addProperty("x", this.l1l111I11I1I.x);
      jsonobject2.addProperty("y", this.l1l111I11I1I.y);
      jsonobject2.addProperty("z", this.l1l111I11I1I.z);
      jsonobject.add("pos", jsonobject2);
      return "CLOUD_TICK|" + jsonobject.toString();
   }

   public static StringHolder_22 StringHolder_27(String s) {
      if (s != null && s.startsWith("CLOUD_TICK|")) {
         try {
            String s1 = s.substring("CLOUD_TICK|".length());
            JsonObject jsonobject = JsonParser.parseString(s1).getAsJsonObject();
            String s2 = jsonobject.get("ipServer").getAsString();
            String s3 = jsonobject.get("nicknameInMinecraft").getAsString();
            UUID uuid = jsonobject.has("uuid") ? UUID.fromString(jsonobject.get("uuid").getAsString()) : new UUID(0L, 0L);
            float f = jsonobject.has("health") ? jsonobject.get("health").getAsFloat() : -1.0F;
            String s4 = jsonobject.has("worldKey") ? jsonobject.get("worldKey").getAsString() : "";
            String s5 = jsonobject.has("modelId") ? jsonobject.get("modelId").getAsString() : "";
            String s6 = jsonobject.has("petModelId") ? jsonobject.get("petModelId").getAsString() : "";
            float f1 = jsonobject.has("petScale") ? jsonobject.get("petScale").getAsFloat() : 0.4F;
            net.minecraft.util.math.Vec3d Vec3dx = null;
            float f2 = 0.0F;
            boolean flag = false;
            if (jsonobject.has("petPos")) {
               JsonObject jsonobject1 = jsonobject.getAsJsonObject("petPos");
               Vec3dx = new net.minecraft.util.math.Vec3d(
                  jsonobject1.get("x").getAsDouble(), jsonobject1.get("y").getAsDouble(), jsonobject1.get("z").getAsDouble()
               );
               f2 = jsonobject.has("petYaw") ? jsonobject.get("petYaw").getAsFloat() : 0.0F;
               flag = jsonobject.has("petSneak") && jsonobject.get("petSneak").getAsBoolean();
            }

            JsonObject jsonobject2 = jsonobject.getAsJsonObject("pos");
            net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(
               jsonobject2.get("x").getAsDouble(), jsonobject2.get("y").getAsDouble(), jsonobject2.get("z").getAsDouble()
            );
            return new StringHolder_22(s2, s3, uuid, Vec3dx, f, s4, s5, s6, Vec3dx, f1, f2, flag);
         } catch (Exception exception) {
            return null;
         }
      } else {
         return null;
      }
   }

   public static StringHolder_22 Nointeract() {
      net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
      if (MinecraftClient != null && MinecraftClient.player != null) {
         String s = ZenithClient.getInstance().SupplierHolder().getServer();
         String s1 = MinecraftClient.player.getGameProfile().getName();
         net.minecraft.util.math.Vec3d Vec3dx = MinecraftClient.player.getPos();
         float f = MinecraftClient.player.getHealth() + MinecraftClient.player.getAbsorptionAmount();
         String s2 = MinecraftClient.player.getWorld() != null ? MinecraftClient.player.getWorld().getRegistryKey().getValue().toString() : "";
         String s3 = ZenithClient.getInstance().ZenithInternal071().Worldtweaks();
         String s4 = ZenithClient.getInstance().BlockPosHolder().ZenithInternal037();
         net.minecraft.util.math.Vec3d Vec3dx = ZenithClient.getInstance().BlockPosHolder().RandomHolder();
         float f1 = ZenithClient.getInstance().BlockPosHolder().SetColorHandler_2();
         float f2 = ZenithClient.getInstance().BlockPosHolder().doubleHolder_3();
         boolean flag = ZenithClient.getInstance().BlockPosHolder().ZenithInternal094();
         return new StringHolder_22(s, s1, MinecraftClient.player.getUuid(), Vec3dx, f, s2, s3, s4, Vec3dx, f1, f2, flag);
      } else {
         return null;
      }
   }
}
