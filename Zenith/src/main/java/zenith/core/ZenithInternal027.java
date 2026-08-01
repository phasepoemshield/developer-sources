package zenith;

import java.util.List;

public class ZenithInternal027 {
   protected final ByteBufferHolder IllI11I;
   protected final ByteBufferHolder IllI1IIll11IIIll1lIIl1Ill1IIl;
   protected final ByteBufferHolder II1l1l1l11111ll1ll1l;
   protected final ByteBufferHolder llll11ll1Ill1llIIlI1III1I;

   protected ZenithInternal027(
      ByteBufferHolder il1iliilli1l1iill, ByteBufferHolder il1iliilli1l1iill1, ByteBufferHolder il1iliilli1l1iill2, ByteBufferHolder il1iliilli1l1iill3
   ) {
      this.IllI11I = il1iliilli1l1iill;
      this.IllI1IIll11IIIll1lIIl1Ill1IIl = il1iliilli1l1iill1;
      this.II1l1l1l11111ll1ll1l = il1iliilli1l1iill2;
      this.llll11ll1Ill1llIIlI1III1I = il1iliilli1l1iill3;
   }

   public static ZenithInternal027 StringHolder_8(
      ByteBufferHolder il1iliilli1l1iill, ByteBufferHolder il1iliilli1l1iill1, ByteBufferHolder il1iliilli1l1iill2, ByteBufferHolder il1iliilli1l1iill3
   ) {
      return new ZenithInternal027(il1iliilli1l1iill, il1iliilli1l1iill1, il1iliilli1l1iill2, il1iliilli1l1iill3);
   }

   public static ZenithInternal027 SecureRandomHolder_2(List<ByteBufferHolder> list) {
      return new ZenithInternal027(
         (ByteBufferHolder)list.get(0), (ByteBufferHolder)list.get(1), (ByteBufferHolder)list.get(2), (ByteBufferHolder)list.get(3)
      );
   }

   public ZenithInternal027 lIl1I111II11() {
      return this;
   }

   public ZenithInternal027 RegistryEntryHolder(float f) {
      return new ZenithInternal027(
         this.IllI11I.ZenithInternal039(f),
         this.IllI1IIll11IIIll1lIIl1Ill1IIl.ZenithInternal039(f),
         this.II1l1l1l11111ll1ll1l.ZenithInternal039(f),
         this.llll11ll1Ill1llIIlI1III1I.ZenithInternal039(f)
      );
   }

   public ByteBufferHolder IlIIII1l1IIIll11IIllI11ll() {
      return this.IllI11I;
   }

   public ByteBufferHolder l1l11lIIIllIll1() {
      return this.IllI1IIll11IIIll1lIIl1Ill1IIl;
   }

   public ByteBufferHolder IIIlIllI1l1Il111IIII() {
      return this.II1l1l1l11111ll1ll1l;
   }

   public ByteBufferHolder ll1IIIIIIl11l() {
      return this.llll11ll1Ill1llIIlI1III1I;
   }
}
