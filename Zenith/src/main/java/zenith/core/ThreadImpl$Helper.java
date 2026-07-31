package zenith;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import javax.net.SocketFactory;

class Il1lI1l1I1II1I1IIIllI$EventTarget extends Thread {
   private final Il1lI1l1I1II1I1IIIllI$EventBus PacketHolder_2;
   private final SocketFactory PacketHolder_3;
   private final SocketAddress PathHolder;
   private String[] EventImpl_32;
   private final int CreateGsonHandler;
   private final CountDownLatchHolder$Helper TypeHolder;
   private final CountDownLatchHolder$Helper macros;

   Il1lI1l1I1II1I1IIIllI$EventTarget(
      SocketFactoryHolder il1li1l1i1ii1i1iiilli,
      Il1lI1l1I1II1I1IIIllI$EventBus il1li1l1i1ii1i1iiilli$l1i1illlili,
      SocketFactory socketfactory,
      SocketAddress socketaddress,
      String[] astring,
      int i,
      CountDownLatchHolder$Helper il1li1l1i1ii1i1iiilli$ii1il11l111ii11iil,
      CountDownLatchHolder$Helper il1li1l1i1ii1i1iiilli$ii1il11l111ii11iil1
   ) {
      this.StringHolder_18 = il1li1l1i1ii1i1iiilli;
      this.PacketHolder_2 = il1li1l1i1ii1i1iiilli$l1i1illlili;
      this.PacketHolder_3 = socketfactory;
      this.PathHolder = socketaddress;
      this.EventImpl_32 = astring;
      this.CreateGsonHandler = i;
      this.TypeHolder = il1li1l1i1ii1i1iiilli$ii1il11l111ii11iil;
      this.macros = il1li1l1i1ii1i1iiilli$ii1il11l111ii11iil1;
   }

   // $VF: renamed from: run () void
   @Override
   public void run() {
      Socket socket = null;

      try {
         if (this.TypeHolder != null) {
            this.TypeHolder.GetDisplayNameHandler_2();
         }

         if (this.PacketHolder_2.RegistryEntryHolder()) {
            return;
         }

         socket = this.PacketHolder_3.createSocket();
         ConstructorHolder.StringHolder_8(socket, this.EventImpl_32);
         socket.connect(this.PathHolder, this.CreateGsonHandler);
         this.ZenithInternal095(socket);
      } catch (Exception exception) {
         this.EventBus(exception);
         if (socket != null) {
            try {
               socket.close();
            } catch (IOException ioexception) {
            }
         }
      }
   }

   private void ZenithInternal095(Socket socket) {
      synchronized (this.PacketHolder_2) {
         if (!this.macros.ArrayListHolder()) {
            this.PacketHolder_2.StringHolder_8(this, socket);
            this.macros.ZenithInternal016();
         }
      }
   }

   void EventBus(Exception exception) {
      synchronized (this.PacketHolder_2) {
         if (!this.macros.ArrayListHolder()) {
            this.PacketHolder_2.StringHolder_8(exception);
            this.macros.ZenithInternal016();
         }
      }
   }
}
