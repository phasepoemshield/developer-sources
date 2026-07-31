package zenith;

abstract class ThreadImpl extends Thread {
   protected final GetSocketHandler Castlefly;
   private final ZenithInternal072 GrimGlide;

   ThreadImpl(String s, GetSocketHandler i1ii1il1i1ll11il1i1lli11, ZenithInternal072 l11il1il1iil) {
      super(s);
      this.Castlefly = i1ii1il1i1ll11il1i1lli11;
      this.GrimGlide = l11il1il1iil;
   }

   // $VF: renamed from: run () void
   @Override
   public void run() {
      ListHolder_6 illlll11i11i1illi1l1ii1i111 = this.Castlefly.ZenithInternal127();
      if (illlll11i11i1illi1l1ii1i111 != null) {
         illlll11i11i1illi1l1ii1i111.EventBus(this.GrimGlide, this);
      }

      this.byteHolder();
      if (illlll11i11i1illi1l1ii1i111 != null) {
         illlll11i11i1illi1l1ii1i111.EventTarget(this.GrimGlide, this);
      }
   }

   public void PathHolder() {
      ListHolder_6 illlll11i11i1illi1l1ii1i111 = this.Castlefly.ZenithInternal127();
      if (illlll11i11i1illi1l1ii1i111 != null) {
         illlll11i11i1illi1l1ii1i111.StringHolder_8(this.GrimGlide, this);
      }
   }

   protected abstract void byteHolder();
}
