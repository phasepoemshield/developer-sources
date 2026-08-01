package zenith;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CountDownLatch;

class Il1lI1l1I1II1I1IIIllI$EventBus {
   private CountDownLatch EventImpl_5;
   private List<Il1lI1l1I1II1I1IIIllI$EventTarget> EventImpl_37;
   private Socket EventImpl_22;
   private Exception TextHolder_2;

   private Il1lI1l1I1II1I1IIIllI$EventBus(SocketFactoryHolder il1li1l1i1ii1i1iiilli) {
      this.PacketHolder = il1li1l1i1ii1i1iiilli;
   }

   synchronized boolean RegistryEntryHolder() {
      return this.EventImpl_22 != null;
   }

   synchronized void StringHolder_8(Il1lI1l1I1II1I1IIIllI$EventTarget il1li1l1i1ii1i1iiilli$illi1l1l1, Socket socket) {
      if (this.EventImpl_5 != null && this.EventImpl_37 != null) {
         if (this.EventImpl_22 == null) {
            this.EventImpl_22 = socket;

            for (Il1lI1l1I1II1I1IIIllI$EventTarget il1li1l1i1ii1i1iiilli$illi1l1l11 : this.EventImpl_37) {
               if (il1li1l1i1ii1i1iiilli$illi1l1l11 != il1li1l1i1ii1i1iiilli$illi1l1l1) {
                  il1li1l1i1ii1i1iiilli$illi1l1l11.EventBus(new InterruptedException());
                  il1li1l1i1ii1i1iiilli$illi1l1l11.interrupt();
               }
            }
         } else {
            try {
               socket.close();
            } catch (IOException ioexception) {
            }
         }

         this.EventImpl_5.countDown();
      } else {
         throw new IllegalStateException("Cannot set socket before awaiting!");
      }
   }

   synchronized void StringHolder_8(Exception exception) {
      if (this.EventImpl_5 != null && this.EventImpl_37 != null) {
         if (this.TextHolder_2 == null) {
            this.TextHolder_2 = exception;
         }

         this.EventImpl_5.countDown();
      } else {
         throw new IllegalStateException("Cannot set exception before awaiting!");
      }
   }

   Socket ZenithInternal028(List<Il1lI1l1I1II1I1IIIllI$EventTarget> list) throws Exception {
      this.EventImpl_37 = list;
      this.EventImpl_5 = new CountDownLatch(this.EventImpl_37.size());

      for (Il1lI1l1I1II1I1IIIllI$EventTarget il1li1l1i1ii1i1iiilli$illi1l1l1 : this.EventImpl_37) {
         il1li1l1i1ii1i1iiilli$illi1l1l1.start();
      }

      this.EventImpl_5.await();
      if (this.EventImpl_22 != null) {
         return this.EventImpl_22;
      } else if (this.TextHolder_2 != null) {
         throw this.TextHolder_2;
      } else {
         throw new ZenithException(ZenithInternal148.Fakeplayer, "No viable interface to connect");
      }
   }
}
