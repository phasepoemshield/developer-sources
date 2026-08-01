package zenith;

import zenith.hud.*;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

class SocketFactoryHolder_3 {
   private final SocketFactory EventImpl;
   private final StringHolder_4 Vec3dHolder_2;
   private final int PlayerInputHolder;
   private final int EventImpl_10;
   private final String[] EventImpl_15;
   private final StringHolder_12 EventImpl_3;
   private final SSLSocketFactory EventImpl_30;
   private final String EventImpl_20;
   private final int EventImpl_8;
   private ZenithInternal061 ZenithInternal078 = ZenithInternal061.permessagedeflate;
   private int booleanHolder_3 = 250;
   private boolean ZenithInternal025;
   private Socket EventImpl_22;

   SocketFactoryHolder_3(SocketFactory socketfactory, StringHolder_4 i1i1li111lii1, int i, String[] astring, int j) {
      this(socketfactory, i1i1li111lii1, i, j, astring, null, null, null, 0);
   }

   SocketFactoryHolder_3(
      SocketFactory socketfactory,
      StringHolder_4 i1i1li111lii1,
      int i,
      int j,
      String[] astring,
      StringHolder_12 iilillliillil1ilil1i11i1ii,
      SSLSocketFactory sslsocketfactory,
      String s,
      int k
   ) {
      this.EventImpl = socketfactory;
      this.Vec3dHolder_2 = i1i1li111lii1;
      this.PlayerInputHolder = i;
      this.EventImpl_10 = j;
      this.EventImpl_15 = astring;
      this.EventImpl_3 = iilillliillil1ilil1i11i1ii;
      this.EventImpl_30 = sslsocketfactory;
      this.EventImpl_20 = s;
      this.EventImpl_8 = k;
   }

   public int GetStartTimeHandler() {
      return this.PlayerInputHolder;
   }

   public Socket getSocket() {
      return this.EventImpl_22;
   }

   public Socket IReturn() throws ZenithException {
      if (this.EventImpl_22 == null) {
         this.floatHolder_12();
      }

      return this.EventImpl_22;
   }

   private void floatHolder_12() throws ZenithException {
      SocketFactoryHolder il1li1l1i1ii1i1iiilli = new SocketFactoryHolder(
         this.EventImpl, this.Vec3dHolder_2, this.PlayerInputHolder, this.EventImpl_15, this.ZenithInternal078, this.booleanHolder_3
      );
      InetAddress[] ainetaddress = this.ArrayListHolder_2();

      try {
         this.EventImpl_22 = il1li1l1i1ii1i1iiilli.StringHolder_8(ainetaddress);
      } catch (Exception exception) {
         boolean flag = this.EventImpl_3 != null;
         String s = String.format("Failed to connect to %s'%s': %s", flag ? "the proxy " : "", this.Vec3dHolder_2, exception.getMessage());
         throw new ZenithException(ZenithInternal148.Fakeplayer, s, exception);
      }
   }

   private InetAddress[] ArrayListHolder_2() throws ZenithException {
      InetAddress[] ainetaddress = null;
      UnknownHostException unknownhostexception = null;

      try {
         ainetaddress = InetAddress.getAllByName(this.Vec3dHolder_2.EventImpl_21());
         Arrays.sort(ainetaddress, new ComparatorImpl$1(this));
      } catch (UnknownHostException unknownhostexception1) {
         unknownhostexception = unknownhostexception1;
      }

      if (ainetaddress != null && ainetaddress.length > 0) {
         return ainetaddress;
      } else {
         if (unknownhostexception == null) {
            unknownhostexception = new UnknownHostException("No IP addresses found");
         }

         String s = String.format("Failed to resolve hostname %s: %s", this.Vec3dHolder_2, unknownhostexception.getMessage());
         throw new ZenithException(ZenithInternal148.Fakeplayer, s, unknownhostexception);
      }
   }

   public Socket StringHolder_30() throws ZenithException {
      try {
         this.ZenithInternal153();

         assert this.EventImpl_22 != null;

         return this.EventImpl_22;
      } catch (ZenithException ilii1lii1liiill) {
         if (this.EventImpl_22 != null) {
            try {
               this.EventImpl_22.close();
            } catch (IOException ioexception) {
            }
         }

         throw ilii1lii1liiill;
      }
   }

   SocketFactoryHolder_3 StringHolder_8(ZenithInternal061 ili1ll11li1ili11l1i1l11l1, int i) {
      this.ZenithInternal078 = ili1ll11li1ili11l1i1l11l1;
      this.booleanHolder_3 = i;
      return this;
   }

   SocketFactoryHolder_3 ZenithInternal095(boolean flag) {
      this.ZenithInternal025 = flag;
      return this;
   }

   private void ZenithInternal153() throws ZenithException {
      boolean flag = this.EventImpl_3 != null;
      this.floatHolder_12();

      assert this.EventImpl_22 != null;

      if (this.EventImpl_10 > 0) {
         this.StringHolder_4(this.EventImpl_10);
      }

      if (this.EventImpl_22 instanceof SSLSocket) {
         this.StringHolder_8((SSLSocket)this.EventImpl_22, this.Vec3dHolder_2.EventImpl_21());
      }

      if (flag) {
         this.ZenithInternal149();
      }
   }

   private void StringHolder_4(int i) throws ZenithException {
      assert this.EventImpl_22 != null;

      try {
         this.EventImpl_22.setSoTimeout(i);
      } catch (SocketException socketexception) {
         String s = String.format("Failed to set SO_TIMEOUT: %s", socketexception.getMessage());
         throw new ZenithException(ZenithInternal148.Fakeplayer, s, socketexception);
      }
   }

   private void StringHolder_8(SSLSocket sslsocket, String s) throws longHolder_3 {
      if (this.ZenithInternal025) {
         HostnameVerifierImpl llll111illll111ll = HostnameVerifierImpl.ZenithInternal150;
         SSLSession sslsession = sslsocket.getSession();
         if (!llll111illll111ll.verify(s, sslsession)) {
            throw new longHolder_3(sslsocket, s);
         }
      }
   }

   private void ZenithInternal149() throws ZenithException {
      assert this.EventImpl_22 != null;

      try {
         this.EventImpl_3.StringHolder_8(this.EventImpl_22);
      } catch (IOException ioexception2) {
         String s = String.format("Handshake with the proxy server (%s) failed: %s", this.Vec3dHolder_2, ioexception2.getMessage());
         throw new ZenithException(ZenithInternal148.Fastbreak, s, ioexception2);
      }

      if (this.EventImpl_30 != null) {
         try {
            this.EventImpl_22 = this.EventImpl_30.createSocket(this.EventImpl_22, this.EventImpl_20, this.EventImpl_8, true);
         } catch (IOException ioexception1) {
            String s1 = "Failed to overlay an existing socket: " + ioexception1.getMessage();
            throw new ZenithException(ZenithInternal148.Freecam, s1, ioexception1);
         }

         try {
            ((SSLSocket)this.EventImpl_22).startHandshake();
            this.StringHolder_8((SSLSocket)this.EventImpl_22, this.EventImpl_3.SocketFactoryHolder());
         } catch (IOException ioexception) {
            String s2 = String.format("SSL handshake with the WebSocket endpoint (%s) failed: %s", this.Vec3dHolder_2, ioexception.getMessage());
            throw new ZenithException(ZenithInternal148.Inventorysetting, s2, ioexception);
         }
      }
   }

   void ZenithInternal150() {
      if (this.EventImpl_22 != null) {
         try {
            this.EventImpl_22.close();
         } catch (Throwable throwable) {
         }
      }
   }
}
