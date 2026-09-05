/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.cache.IWaypoint
 *  baritone.api.cache.IWaypoint$Tag
 *  baritone.api.cache.Waypoint
 *  baritone.api.command.IBaritoneChatControl
 *  baritone.api.event.events.BlockInteractEvent
 *  baritone.api.event.events.BlockInteractEvent$Type
 *  baritone.utils.BlockStateInterface
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00500
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06637
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07789
 *  minecraft.class08092
 */
package baritone.behavior;

import baritone.Baritone;
import baritone.api.cache.IWaypoint;
import baritone.api.cache.Waypoint;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.event.events.BlockInteractEvent;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.behavior.Behavior;
import baritone.utils.BlockStateInterface;
import java.util.Set;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00500;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06637;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07789;
import minecraft.class08092;

public class WaypointBehavior
extends Behavior {
    public WaypointBehavior(Baritone baritone) {
        super(baritone);
    }

    public void onPlayerDeath() {
        if (!((Boolean)Baritone.settings().doDeathWaypoints.value).booleanValue()) {
            return;
        }
        Waypoint waypoint = new Waypoint("death", IWaypoint.Tag.DEATH, this.ctx.playerFeet());
        this.baritone.getWorldProvider().getCurrentWorld().getWaypoints().addWaypoint((IWaypoint)waypoint);
        class05216 class052162 = class00392.y((String)"Death position saved.");
        class052162.y(class052162.method_10866().N(class06541.field_1068).N((class00395)new class00401((class00392)class00392.y((String)"Click to goto death"))).N((class00647)new class00625(String.format("%s%s goto %s @ %d", IBaritoneChatControl.FORCE_COMMAND_PREFIX, "wp", waypoint.getTag().getName(), waypoint.getCreationTimestamp()))));
        Helper.HELPER.logDirect(new class00392[]{class052162});
    }

    public void onBlockInteract(BlockInteractEvent blockInteractEvent) {
        BetterBlockPos betterBlockPos;
        class00500 class005002;
        if (!((Boolean)Baritone.settings().doBedWaypoints.value).booleanValue()) {
            return;
        }
        if (blockInteractEvent.getType() == BlockInteractEvent.Type.USE && (class005002 = BlockStateInterface.get((IPlayerContext)this.ctx, (class07209)(betterBlockPos = BetterBlockPos.from(blockInteractEvent.getPos())))).i() instanceof class07789) {
            if (class005002.L((class08092)class07789.y) == class06637.field_12557) {
                betterBlockPos = betterBlockPos.relative((class07211)class005002.L((class08092)class07789.R));
            }
            Set set = this.baritone.getWorldProvider().getCurrentWorld().getWaypoints().getByTag(IWaypoint.Tag.BED);
            boolean bl = set.stream().map(IWaypoint::getLocation).filter(betterBlockPos::equals).findFirst().isPresent();
            if (!bl) {
                this.baritone.getWorldProvider().getCurrentWorld().getWaypoints().addWaypoint((IWaypoint)new Waypoint("bed", IWaypoint.Tag.BED, betterBlockPos));
            }
        }
    }
}

