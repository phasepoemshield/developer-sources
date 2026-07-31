package zenith;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;

public class booleanHolder$Helper {
   private final int l1Illl1IIl11;
   final Map<Integer, StringHolder$EventBus> ll1l1IlIII11l11IIIIIlII111ll = new HashMap<>();
   private final Map<Integer, Identifier> Il1l11ll1llll11I11IIl1lI1Il = new HashMap<>();
   private final Map<Integer, List<float[]>> IllII1IllI1I11I = new HashMap<>();
   private final Map<Integer, float[]> l1IIIlI11lIllIII = new HashMap<>();
   private final Map<Integer, Integer> IIllIlIIIIIl11IllIl1111I1 = new HashMap<>();
   private boolean lII1I1Il1IIIlIll11Il111I1l;

   booleanHolder$Helper(int i) {
      this.l1Illl1IIl11 = i;
   }

   void StringHolder_8(
      int i,
      float[] afloat,
      float[] afloat1,
      float[] afloat2,
      float[] afloat3,
      float[] afloat4,
      float[] afloat5,
      float[] afloat6,
      float[] afloat7,
      float[] afloat8
   ) {
      this.IllII1IllI1I11I.computeIfAbsent(i, integer -> new ArrayList<>());
      List list = this.IllII1IllI1I11I.get(i);
      list.add(this.EventBus(afloat, afloat1, afloat2));
      list.add(this.EventBus(afloat3, afloat4, afloat5));
      list.add(this.EventBus(afloat6, afloat7, afloat8));
   }

   private float[] EventBus(float[] afloat, float[] afloat1, float[] afloat2) {
      return new float[]{afloat[0] / 16.0F, afloat[1] / 16.0F, afloat[2] / 16.0F, afloat1[0], afloat1[1], afloat2[0], afloat2[1], afloat2[2]};
   }

   void lI1llIlIlllIllIlIIllIll1lI11() {
      for (Entry entry : this.IllII1IllI1I11I.entrySet()) {
         List list = (List)entry.getValue();
         float[] afloat = new float[list.size() * 8];

         for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i), 0, afloat, i * 8, 8);
         }

         this.l1IIIlI11lIllIII.put((Integer)entry.getKey(), afloat);
         this.IIllIlIIIIIl11IllIl1111I1.put((Integer)entry.getKey(), list.size() / 3);
      }

      this.IllII1IllI1I11I.clear();
   }

   public void StringHolder_8(net.minecraft.client.MinecraftClient MinecraftClient) {
      if (!this.lII1I1Il1IIIlIll11Il111I1l) {
         this.lII1I1Il1IIIlIll11Il111I1l = true;

         for (Entry entry : this.ll1l1IlIII11l11IIIIIlII111ll.entrySet()) {
            StringHolder$EventBus i1lii1l11iiili$l1i1illlili = (StringHolder$EventBus)entry.getValue();
            if (i1lii1l11iiili$l1i1illlili.l1I1llIlIlll1Il1IIlI != null) {
               try {
                  String s = i1lii1l11iiili$l1i1illlili.l1I1llIlIlll1Il1IIlI;
                  int i = s.indexOf(",");
                  if (i != -1) {
                     s = s.substring(i + 1);
                  }

                  byte[] abyte = Base64.getDecoder().decode(s);
                  NativeImage NativeImage = NativeImage.read(new ByteArrayInputStream(abyte));
                  Identifier Identifier = Identifier.of(
                     "zenith", "bbmodel/m" + this.l1Illl1IIl11 + "_t" + i1lii1l11iiili$l1i1illlili.I1lIIlII1111lI1IlI1ll1l1II1
                  );
                  MinecraftClient.getTextureManager().registerTexture(Identifier, new NativeImageBackedTexture(NativeImage));
                  this.Il1l11ll1llll11I11IIl1lI1Il.put(i1lii1l11iiili$l1i1illlili.I1lIIlII1111lI1IlI1ll1l1II1, Identifier);
               } catch (Exception exception) {
               }
            }
         }
      }
   }

   public Set<Integer> l1Il1I1II1IllIl1lIll1111l1lll() {
      return this.l1IIIlI11lIllIII.keySet();
   }

   public Identifier EventImpl_14(int i) {
      return this.Il1l11ll1llll11I11IIl1lI1Il.get(i);
   }

   public float[] EventImpl_2(int i) {
      return this.l1IIIlI11lIllIII.get(i);
   }

   public int EventImpl_17(int i) {
      return this.IIllIlIIIIIl11IllIl1111I1.getOrDefault(i, 0);
   }

   public int getId() {
      return this.l1Illl1IIl11;
   }
}
