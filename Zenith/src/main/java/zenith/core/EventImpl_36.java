package zenith;

import net.minecraft.client.gui.screen.Screen;

public class EventImpl_36 implements Event {
   private Screen IIll1ll1I111lI;

   public EventImpl_36(Screen Screen) {
      this.IIll1ll1I111lI = Screen;
   }

   public Screen Nopush() {
      return this.IIll1ll1I111lI;
   }

   public void StringHolder_8(Screen Screen) {
      this.IIll1ll1I111lI = Screen;
   }

   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof EventImpl_36 lllil11lil1l1l1l1)) {
         return false;
      } else if (!lllil11lil1l1l1l1.EventTarget(this)) {
         return false;
      } else {
         Screen Screenx = this.Nopush();
         Screen Screenx = lllil11lil1l1l1l1.Nopush();
         return Screenx == null ? Screenx == null : Screenx.equals(Screenx);
      }
   }

   protected boolean EventTarget(Object object) {
      return object instanceof EventImpl_36;
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      byte b1 = 1;
      Screen Screen = this.Nopush();
      return b1 * 59 + (Screen == null ? 43 : Screen.hashCode());
   }

   @Override
   public String toString() {
      return "EventSetScreen(screen=" + this.Nopush() + ")";
   }
}
