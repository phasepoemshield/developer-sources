package zenith;

import java.net.Socket;
import java.util.TimerTask;

class TimerTaskImpl$Helper_2 extends TimerTask {
   private TimerTaskImpl$Helper_2(ReadingThread ii1il11i11lilii1i1l11liliil1l) {
      this.EventImpl_35 = ii1il11i11lilii1i1l11liliil1l;
   }

   // $VF: renamed from: run () void
   @Override
   public void run() {
      try {
         Socket socket = this.EventImpl_35.Castlefly.getSocket();
         if (socket != null) {
            socket.close();
         }
      } catch (Throwable throwable) {
      }
   }
}
