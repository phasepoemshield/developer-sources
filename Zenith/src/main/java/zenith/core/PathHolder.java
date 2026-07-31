package zenith;

import java.nio.file.Path;
import java.util.List;

public class PathHolder implements ZenithInternal076 {
   private Path l1l11l1llIIllIIII1lIl = null;
   private final MultiBooleanSetting ll1l1l1I1I = new MultiBooleanSetting("cosmetics.figura.render");

   public List<Setting> getSettings() {
      return List.of(this.ll1l1l1I1I);
   }

   public boolean TotemParticles() {
      return !this.ll1l1l1I1I.EventImpl_3("cosmetics.figura.render.self").Spider()
         && !this.ll1l1l1I1I.EventImpl_3("cosmetics.figura.render.friends").Spider();
   }

   public boolean Trails() {
      return this.ll1l1l1I1I.EventImpl_3("cosmetics.figura.render.self").Spider();
   }

   public boolean ViewArmorDurability() {
      return this.ll1l1l1I1I.EventImpl_3("cosmetics.figura.render.friends").Spider();
   }

   public PathHolder() {
      new MultiBooleanSetting$II1Il11l111II11IIl(this.ll1l1l1I1I, "cosmetics.figura.render.self", true);
      new MultiBooleanSetting$II1Il11l111II11IIl(this.ll1l1l1I1I, "cosmetics.figura.render.friends", true);
      EventBus.StringHolder_8(this);
   }

   @EventTarget
   public void EventBus(EventImpl_22 l11llilil1) {
      this.WorldParticles();
      this.Viewmodel();
   }

   private void Viewmodel() {
      boolean flag = StringHolder_23.I11Il1lIIllII1l1I1I11.containsKey(l11I1I1ll1Illll1I1l1111l1II.player.getUuid());
      if (this.Trails() && this.l1l11l1llIIllIIII1lIl != null) {
         if (!flag) {
            StringHolder_23.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.player.getUuid(), this.l1l11l1llIIllIIII1lIl);
         }
      } else {
         if (flag) {
            StringHolder_23.I11Il1lIIllII1l1I1I11.remove(l11I1I1ll1Illll1I1l1111l1II.player.getUuid());
         }
      }
   }

   private void WorldParticles() {
      net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
      if (MinecraftClient != null && MinecraftClient.world != null && MinecraftClient.player != null) {
         if (this.ViewArmorDurability()) {
            for (GetSettingsHandler i11ll1111lil11i : ZenithClient.getInstance()
               .StringHolder_26()
               .ZenithInternal001()) {
               StringHolder_22 l1liil1ili1iiii1lliii1l1li = i11ll1111lil11i.Reachv3();
               if (l1liil1ili1iiii1lliii1l1li != null) {
                  boolean flag = StringHolder_23.I11Il1lIIllII1l1I1I11.containsKey(l1liil1ili1iiii1lliii1l1li.Nofrienddamage());
                  if (flag) {
                     if (!i11ll1111lil11i.Triggerbot().Spider()) {
                        StringHolder_23.I11Il1lIIllII1l1I1I11.remove(l1liil1ili1iiii1lliii1l1li.Nofrienddamage());
                     }
                  } else {
                     StringHolder_23.EventBus(l1liil1ili1iiii1lliii1l1li.Nofrienddamage(), l1liil1ili1iiii1lliii1l1li.Fastbreak());
                  }
               }
            }
         }
      }
   }

   public String Worldtweaks() {
      return StringHolder_23.ZenithInternal095(this.l1l11l1llIIllIIII1lIl);
   }

   public Path ZenithInternal018() {
      return this.l1l11l1llIIllIIII1lIl;
   }

   public MultiBooleanSetting ListHolder_9() {
      return this.ll1l1l1I1I;
   }

   public void StringHolder_8(Path path) {
      this.l1l11l1llIIllIIII1lIl = path;
      net.minecraft.client.MinecraftClient client = net.minecraft.client.MinecraftClient.getInstance();
      if (client != null && client.player != null) {
         java.util.UUID uuid = client.player.getUuid();
         StringHolder_23.I11Il1lIIllII1l1I1I11.remove(uuid);
         if (path != null) {
            StringHolder_23.StringHolder_8(uuid, path);
         }
      }
   }
}
