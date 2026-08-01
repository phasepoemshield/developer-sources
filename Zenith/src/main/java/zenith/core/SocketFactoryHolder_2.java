package zenith;

import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

class SocketFactoryHolder_2 {
   private SocketFactory EventImpl;
   private SSLSocketFactory EventImpl_30;
   private SSLContext booleanHolder_4;

   public SocketFactoryHolder_2() {
   }

   public SocketFactoryHolder_2(SocketFactoryHolder_2 l1l1i1i1ii1il1l1li) {
      this.EventImpl = l1l1i1i1ii1il1l1li.EventImpl;
      this.EventImpl_30 = l1l1i1i1ii1il1l1li.EventImpl_30;
      this.booleanHolder_4 = l1l1i1i1ii1il1l1li.booleanHolder_4;
   }

   public SocketFactory ZenithInternal023() {
      return this.EventImpl;
   }

   public void setSocketFactory(SocketFactory socketfactory) {
      this.EventImpl = socketfactory;
   }

   public SSLSocketFactory ZenithInternal148() {
      return this.EventImpl_30;
   }

   public void EventBus(SSLSocketFactory sslsocketfactory) {
      this.EventImpl_30 = sslsocketfactory;
   }

   public SSLContext ZenithException() {
      return this.booleanHolder_4;
   }

   public void EventBus(SSLContext sslcontext) {
      this.booleanHolder_4 = sslcontext;
   }

   public SocketFactory Event(boolean flag) {
      if (flag) {
         if (this.booleanHolder_4 != null) {
            return this.booleanHolder_4.getSocketFactory();
         } else {
            return (SocketFactory)(this.EventImpl_30 != null ? this.EventImpl_30 : SSLSocketFactory.getDefault());
         }
      } else {
         return this.EventImpl != null ? this.EventImpl : SocketFactory.getDefault();
      }
   }
}
