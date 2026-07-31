package fun.wonderful.api.storages.implement.helpertstorages.enumvar;

import fun.wonderful.api.storages.implement.helpertstorages.enumvar.GlobalObject;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleRewords;
import fun.wonderful.client.modules.Module;
import java.util.List;

public class ModuleClass
extends GlobalObject<Module>
implements ModuleRewords {
    public static ModuleClass INSTANCE = new ModuleClass();

    public void initialize() {
        this.add(antibot, aimBot, airStuck, arrows, aura, autoAccept, autoArmor, autoDuel, autoEat, autoLeave, autoExplosion, autoForest, autoJoin, autoPvp, nameProtect, autoFish, autoSwap, autoTool, autoTotem, autoTrap, blockesp, blockOverlay, catchItems, chestStealer, chams, clientSounds, clickPearl, cosmetics, cubes, deathCoord, ecopen, elytraBoost, elytraJump, elytraMotion, elytraSwap, elytraTarget, elytrajump, elytraresolver, entityESP, fakePlayer, fireworkESP, fastBreak, fastExp, flight, freeCam, fullBright, grimGlide, grimNoFall, highJump, helpMessage, hitMarker, interfaceModule, interpolateF5, inventoryWalk, itemAim, itemDrop, itemRelease, itemScroller, jumpCircle, killEffect, layerCooldwon, lockSlot, lootTracker, noClip, noJumpDelay, nuker, noPush, noSlow, noVelocity, noVignette, noControllerWeb, noWeb, offMioLogs, packetCriticals, particle, pets, playerFakeLags, projectile, potionTracker, scoreboardHP, removals, rPSpoofer, seeInvisibles, shaderHands, serverHelper, shulkerPreview, speed, spider, sprint, step, swingAnimations, targetESP, targetPearl, timer, totemAngel, tpsSync, tpBack, tpLoot, trails, trajectories, triggerBot, viewModel, worldTweaks, xCarry);
    }

    private void add(Module ... mod) {
        this.getObject().addAll(List.of(mod));
    }
}
