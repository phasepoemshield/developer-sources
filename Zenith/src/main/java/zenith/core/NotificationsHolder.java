package zenith;

import zenith.hud.*;

import net.minecraft.text.Text;

public class NotificationsHolder {
   private static NotificationsHolder lII1I1l1IlIIl1I;
   private Notifications I1lII1lllll11IIlIIl1l11lII;

   public NotificationsHolder() {
      EventBus.StringHolder_8(this);
   }

   public static NotificationsHolder ZenithInternal076() {
      if (lII1I1l1IlIIl1I == null) {
         lII1I1l1IlIIl1I = new NotificationsHolder();
      }

      return lII1I1l1IlIIl1I;
   }

   public void StringHolder_8(Notifications ili1111ii1l1li) {
      this.I1lII1lllll11IIlIIl1l11lII = ili1111ii1l1li;
   }

   @EventTarget
   public void StringHolder_8(EventImpl_25 l1ili1lll) {
      if (this.I1lII1lllll11IIlIIl1l11lII != null
         && this.I1lII1lllll11IIlIIl1l11lII.II11lI1lIlIlI1IlllIlII()
         && l1ili1lll.getModule() != Menu.lllIl11II111Illll1IlIll
         && !ZenithInternal066.lII1IlIll11()
         && Interface.ll11lIl1IlIl1lI1.Spider()
         && Interface.ll11lIl1IlIl1lI1.ll1II1lI1I1Illl11()) {
         this.I1lII1lllll11IIlIIl1l11lII.StringHolder_8(l1ili1lll.getModule(), l1ili1lll.Spider());

         try {
            ZenithClient.getInstance()
               .MinecraftClientHolder_5()
               .StringHolder_8(
                  l1ili1lll.Spider()
                     ? ZenithClient.getInstance().MinecraftClientHolder_5().Illl1ll11lI1I
                     : ZenithClient.getInstance().MinecraftClientHolder_5().ll1III
               );
         } catch (Exception exception) {
            exception.printStackTrace();
         }
      }
   }

   public void StringHolder_8(Module ll111il1lliill11, boolean flag) {
      if (this.I1lII1lllll11IIlIIl1l11lII != null
         && this.I1lII1lllll11IIlIIl1l11lII.II11lI1lIlIlI1IlllIlII()
         && !ZenithInternal066.lII1IlIll11()
         && Interface.ll11lIl1IlIl1lI1.Spider()
         && Interface.ll11lIl1IlIl1lI1.ll1II1lI1I1Illl11()) {
         ZenithClient.getInstance()
            .MinecraftClientHolder_5()
            .StringHolder_8(
               flag
                  ? ZenithClient.getInstance().MinecraftClientHolder_5().Illl1ll11lI1I
                  : ZenithClient.getInstance().MinecraftClientHolder_5().ll1III
            );
         this.I1lII1lllll11IIlIIl1l11lII.StringHolder_8(ll111il1lliill11, flag);
      }
   }

   public void StringHolder_8(String s, Text Text) {
      if (this.I1lII1lllll11IIlIIl1l11lII != null
         && !ZenithInternal066.lII1IlIll11()
         && Interface.ll11lIl1IlIl1lI1.Spider()
         && Interface.ll11lIl1IlIl1lI1.ll1II1lI1I1Illl11()) {
         this.I1lII1lllll11IIlIIl1l11lII.EventBus(s, Text);
      }
   }

   public void StringHolder_8(String s, Text Text, long i) {
      if (this.I1lII1lllll11IIlIIl1l11lII != null
         && !ZenithInternal066.lII1IlIll11()
         && Interface.ll11lIl1IlIl1lI1.Spider()
         && Interface.ll11lIl1IlIl1lI1.ll1II1lI1I1Illl11()) {
         this.I1lII1lllll11IIlIIl1l11lII.EventBus(s, Text, i);
      }
   }
}
