package zenith;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;

class ComparatorImpl$1 implements Comparator<InetAddress> {
   ComparatorImpl$1(SocketFactoryHolder_3 li11ii1li11lli1i1liil) {
      this.floatHolder_10 = li11ii1li11lli1i1liil;
   }

   public int StringHolder_8(InetAddress inetaddress, InetAddress inetaddress1) {
      if (inetaddress.getClass() == inetaddress1.getClass()) {
         return 0;
      } else {
         return inetaddress instanceof Inet6Address ? -1 : 1;
      }
   }
}
