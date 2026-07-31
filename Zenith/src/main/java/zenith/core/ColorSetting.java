package zenith;

import zenith.hud.*;

import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class ColorSetting extends Setting {
   private ByteBufferHolder lIIlIllIl11ll;
   private final ColorSetting$II1Il11l111II11IIl IlI1I111lIIll11;

   public ColorSetting(
      String s, ByteBufferHolder il1iliilli1l1iill, Supplier<Boolean> supplier, ColorSetting$II1Il11l111II11IIl llil11111111l1il1ii$ii1il11l111ii11iil
   ) {
      this(s, "", il1iliilli1l1iill, llil11111111l1il1ii$ii1il11l111ii11iil);
      this.StringHolder_8(supplier);
   }

   public ColorSetting(String s, ByteBufferHolder il1iliilli1l1iill, ColorSetting$II1Il11l111II11IIl llil11111111l1il1ii$ii1il11l111ii11iil) {
      this(s, "", il1iliilli1l1iill, llil11111111l1il1ii$ii1il11l111ii11iil);
   }

   public ColorSetting(
      String s, String s1, ByteBufferHolder il1iliilli1l1iill, ColorSetting$II1Il11l111II11IIl llil11111111l1il1ii$ii1il11l111ii11iil
   ) {
      super(s, s1);
      if (il1iliilli1l1iill == null) {
         throw new RuntimeException(s + " color is null");
      } else {
         this.lIIlIllIl11ll = il1iliilli1l1iill;
         this.setColor(il1iliilli1l1iill);
         this.IlI1I111lIIll11 = llil11111111l1il1ii$ii1il11l111ii11iil;
      }
   }

   public ColorSetting(String s, ByteBufferHolder il1iliilli1l1iill) {
      this(s, "", il1iliilli1l1iill, () -> il1iliilli1l1iill);
   }

   public ColorSetting(String s, String s1, ByteBufferHolder il1iliilli1l1iill) {
      this(s, s1, il1iliilli1l1iill, () -> il1iliilli1l1iill);
   }

   public ColorSetting(String s, ColorSetting$II1Il11l111II11IIl llil11111111l1il1ii$ii1il11l111ii11iil) {
      this(s, "", llil11111111l1il1ii$ii1il11l111ii11iil.getDefaultColor(), llil11111111l1il1ii$ii1il11l111ii11iil);
   }

   public ColorSetting(String s, ByteBufferHolder il1iliilli1l1iill, Supplier<Boolean> supplier) {
      this(s, "", il1iliilli1l1iill, () -> il1iliilli1l1iill);
      this.StringHolder_8(supplier);
   }

   public ColorSetting(String s, String s1, ByteBufferHolder il1iliilli1l1iill, Supplier<Boolean> supplier) {
      this(s, s1, il1iliilli1l1iill, () -> il1iliilli1l1iill);
      this.StringHolder_8(supplier);
   }

   public int II11II1lIlIl1IIIlII1I1() {
      return this.lIIlIllIl11ll.lllIlll1Ill111l111Il11II11lII();
   }

   public void ZenithException_2(int i) {
      this.lIIlIllIl11ll = new ByteBufferHolder(i);
   }

   public void setColor(ByteBufferHolder il1iliilli1l1iill) {
      this.lIIlIllIl11ll = il1iliilli1l1iill;
   }

   public void Coordinates() {
   }

   public void reset() {
      this.lIIlIllIl11ll = this.IlI1I111lIIll11.getDefaultColor();
   }

   public ByteBufferHolder HostnameVerifierImpl(float f) {
      return this.lIIlIllIl11ll.ZenithInternal039(f);
   }

   @Override
   public void safe(JsonObject jsonobject) {
      jsonobject.addProperty(String.valueOf(this.I1llIl1Il1lIII), this.II11II1lIlIl1IIIlII1I1());
   }

   @Override
   public void load(JsonObject jsonobject) {
      this.ZenithException_2(jsonobject.get(String.valueOf(this.I1llIl1Il1lIII)).getAsInt());
   }

   public ByteBufferHolder l1IllIl1l1llIlI11I11Il1l1l1lI1() {
      return this.lIIlIllIl11ll;
   }
}
