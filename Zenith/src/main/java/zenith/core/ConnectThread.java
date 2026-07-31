package zenith;

class ConnectThread extends ThreadImpl {
   public ConnectThread(GetSocketHandler i1ii1il1i1ll11il1i1lli11) {
      super("ConnectThread", i1ii1il1i1ll11il1i1lli11, ZenithInternal072.TimerUtilHolder_2);
   }

   @Override
   public void byteHolder() {
      try {
         this.Castlefly.EventImpl_16();
      } catch (ZenithException ilii1lii1liiill) {
         this.StringHolder_8(ilii1lii1liiill);
      }
   }

   private void StringHolder_8(ZenithException ilii1lii1liiill) {
      ListHolder_6 illlll11i11i1illi1l1ii1i111 = this.Castlefly.ZenithInternal127();
      illlll11i11i1illi1l1ii1i111.EventTarget(ilii1lii1liiill);
      illlll11i11i1illi1l1ii1i111.EventBus(ilii1lii1liiill);
   }
}
