package kotakbaz.rain.event.events

import net.minecraft.entity.Entity

// $VF: Compiled from AttackEvent.kt
public class AttackEvent {
   private Entity entity;

   fun AttackEvent(entity: Entity) {
      this.entity = entity
   }

   fun getEntity(): Entity {
      this.entity
   }
}
