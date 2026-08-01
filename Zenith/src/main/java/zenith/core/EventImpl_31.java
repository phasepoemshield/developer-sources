package zenith;

import net.minecraft.entity.Entity;

public class EventImpl_31 implements Event {
   private Entity IlI1I11I1II111;
   private float size;

   public Entity Autobuy() {
      return this.IlI1I11I1II111;
   }

   public float getSize() {
      return this.size;
   }

   public void StringHolder_8(Entity Entity) {
      this.IlI1I11I1II111 = Entity;
   }

   public void StringHolder_4(float f) {
      this.size = f;
   }

   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof EventImpl_31 ll1ill11111i)) {
         return false;
      } else if (!ll1ill11111i.EventTarget(this)) {
         return false;
      } else if (Float.compare(this.getSize(), ll1ill11111i.getSize()) != 0) {
         return false;
      } else {
         Entity Entityx = this.Autobuy();
         Entity Entityx = ll1ill11111i.Autobuy();
         return Entityx == null ? Entityx == null : Entityx.equals(Entityx);
      }
   }

   protected boolean EventTarget(Object object) {
      return object instanceof EventImpl_31;
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      int i = 1;
      i = i * 59 + Float.floatToIntBits(this.getSize());
      Entity Entity = this.Autobuy();
      return i * 59 + (Entity == null ? 43 : Entity.hashCode());
   }

   @Override
   public String toString() {
      return "EventEntityHitBox(entity=" + this.Autobuy() + ", size=" + this.getSize() + ")";
   }

   public EventImpl_31(Entity Entity, float f) {
      this.IlI1I11I1II111 = Entity;
      this.size = f;
   }
}
