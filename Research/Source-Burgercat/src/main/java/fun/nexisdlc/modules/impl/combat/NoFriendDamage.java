package fun.nexisdlc.modules.impl.combat;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.entity.EventAttack;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;

@FunctionAdd(name = "NoFriendDamage", alias = "No Friend Damage", category = Category.Combat, description = "Отключает урон по друзьям")
public class NoFriendDamage extends Function {
    @EventHandler
    public void onAttack(EventAttack.Swing event) {
        if (event.getTarget() != null && Nexis.getInstance().getFriendStorage().isFriend(event.getTarget().getName().getString())) {
            event.cancel();
        }
    }

    @EventHandler
    public void onAttack(EventAttack.Hurt event) {
        if (event.getTarget() != null && Nexis.getInstance().getFriendStorage().isFriend(event.getTarget().getName().getString())) {
            event.cancel();
        }
    }
}
