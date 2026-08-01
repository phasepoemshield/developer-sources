package zenith;

import java.util.List;
import java.util.Map;

public class longHolder_4 extends ZenithException {
   private static final long RegistryEntryHolder = 1L;
   private final StringHolder_13 StringHolder_6;
   private final Map<String, List<String>> StringHolder_27;
   private final byte[] ZenithInternal039;

   longHolder_4(ZenithInternal148 llli1iilli1ii1, String s, StringHolder_13 il11i1li1llll1i1111ll, Map<String, List<String>> map) {
      this(llli1iilli1ii1, s, il11i1li1llll1i1111ll, map, null);
   }

   longHolder_4(
      ZenithInternal148 llli1iilli1ii1, String s, StringHolder_13 il11i1li1llll1i1111ll, Map<String, List<String>> map, byte[] abyte
   ) {
      super(llli1iilli1ii1, s);
      this.StringHolder_6 = il11i1li1llll1i1111ll;
      this.StringHolder_27 = map;
      this.ZenithInternal039 = abyte;
   }

   public StringHolder_13 longHolder_4() {
      return this.StringHolder_6;
   }

   public Map<String, List<String>> ZenithInternal045() {
      return this.StringHolder_27;
   }

   public byte[] ZenithInternal044() {
      return this.ZenithInternal039;
   }
}
