package fun.nexisdlc.client.events.impl.entity;

import fun.nexisdlc.client.events.api.Event;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.minecraft.entity.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
public class EventAttack extends Event {
    public Entity target;

    EventAttack(Entity target) {
        this.target = target;
    }

    public static class Swing extends EventAttack {
        public Swing(Entity target) {
            super(target);
        }
    }

    public static class Hurt extends EventAttack {
        public Hurt(Entity target) {
            super(target);
        }
    }
}
