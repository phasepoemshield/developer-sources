package zenith;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import javax.net.SocketFactory;

public class SocketFactoryHolder {
   private final SocketFactory EventImpl_18;
   private final StringHolder_4 floatHolder_2;
   private final int ZenithInternal136;
   private final String[] EventImpl_28;
   private final ZenithInternal061 EventImpl_12;
   private final int EventImpl_23;

   public SocketFactoryHolder(
      SocketFactory socketfactory, StringHolder_4 i1i1li111lii1, int i, String[] astring, ZenithInternal061 ili1ll11li1ili11l1i1l11l1, int j
   ) {
      this.EventImpl_18 = socketfactory;
      this.floatHolder_2 = i1i1li111lii1;
      this.ZenithInternal136 = i;
      this.EventImpl_28 = astring;
      this.EventImpl_12 = ili1ll11li1ili11l1i1l11l1;
      this.EventImpl_23 = j;
   }

   public Socket StringHolder_8(InetAddress[] ainetaddress) throws Exception {
      Il1lI1l1I1II1I1IIIllI$EventBus il1li1l1i1ii1i1iiilli$l1i1illlili = new Il1lI1l1I1II1I1IIIllI$EventBus(this, null);
      ArrayList arraylist = new ArrayList(ainetaddress.length);
      int i = 0;
      CountDownLatchHolder$Helper il1li1l1i1ii1i1iiilli$ii1il11l111ii11iil = null;

      for (InetAddress inetaddress : ainetaddress) {
         if ((this.EventImpl_12 != ZenithInternal061.StringHolder || inetaddress instanceof Inet4Address)
            && (this.EventImpl_12 != ZenithInternal061.StringHolder_11 || inetaddress instanceof Inet6Address)) {
            i += this.EventImpl_23;
            CountDownLatchHolder$Helper il1li1l1i1ii1i1iiilli$ii1il11l111ii11iil1 = new CountDownLatchHolder$Helper(this, i);
            InetSocketAddress inetsocketaddress = new InetSocketAddress(inetaddress, this.floatHolder_2.getPort());
            Il1lI1l1I1II1I1IIIllI$EventTarget il1li1l1i1ii1i1iiilli$illi1l1l1 = new Il1lI1l1I1II1I1IIIllI$EventTarget(
               this,
               il1li1l1i1ii1i1iiilli$l1i1illlili,
               this.EventImpl_18,
               inetsocketaddress,
               this.EventImpl_28,
               this.ZenithInternal136,
               il1li1l1i1ii1i1iiilli$ii1il11l111ii11iil,
               il1li1l1i1ii1i1iiilli$ii1il11l111ii11iil1
            );
            arraylist.add(il1li1l1i1ii1i1iiilli$illi1l1l1);
            il1li1l1i1ii1i1iiilli$ii1il11l111ii11iil = il1li1l1i1ii1i1iiilli$ii1il11l111ii11iil1;
         }
      }

      return il1li1l1i1ii1i1iiilli$l1i1illlili.ZenithInternal028(arraylist);
   }
}
