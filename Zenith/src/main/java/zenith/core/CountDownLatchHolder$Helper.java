package zenith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class CountDownLatchHolder$Helper {
   private final CountDownLatch EventImpl_5;
   private final int EventImpl_34;

   CountDownLatchHolder$Helper(SocketFactoryHolder il1li1l1i1ii1i1iiilli, int i) {
      this.ZenithInternal014 = il1li1l1i1ii1i1iiilli;
      this.EventImpl_5 = new CountDownLatch(1);
      this.EventImpl_34 = i;
   }

   boolean ArrayListHolder() {
      return this.EventImpl_5.getCount() == 0L;
   }

   void GetDisplayNameHandler_2() throws InterruptedException {
      this.EventImpl_5.await((long)this.EventImpl_34, TimeUnit.MILLISECONDS);
   }

   void ZenithInternal016() {
      this.EventImpl_5.countDown();
   }
}
