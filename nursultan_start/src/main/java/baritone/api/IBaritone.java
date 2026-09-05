/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.event.listener.IEventBus
 *  baritone.api.pathing.calc.IPathingControlManager
 *  baritone.api.process.IBuilderProcess
 *  baritone.api.process.ICustomGoalProcess
 *  baritone.api.process.IElytraProcess
 *  baritone.api.process.IExploreProcess
 *  baritone.api.process.IFarmProcess
 *  baritone.api.process.IFollowProcess
 *  baritone.api.process.IGetToBlockProcess
 *  baritone.api.process.IMineProcess
 *  baritone.api.selection.ISelectionManager
 *  baritone.api.utils.IInputOverrideHandler
 *  baritone.api.utils.IPlayerContext
 */
package baritone.api;

import baritone.api.behavior.ILookBehavior;
import baritone.api.behavior.IPathingBehavior;
import baritone.api.cache.IWorldProvider;
import baritone.api.command.manager.ICommandManager;
import baritone.api.event.listener.IEventBus;
import baritone.api.pathing.calc.IPathingControlManager;
import baritone.api.process.IBuilderProcess;
import baritone.api.process.ICustomGoalProcess;
import baritone.api.process.IElytraProcess;
import baritone.api.process.IExploreProcess;
import baritone.api.process.IFarmProcess;
import baritone.api.process.IFollowProcess;
import baritone.api.process.IGetToBlockProcess;
import baritone.api.process.IMineProcess;
import baritone.api.selection.ISelectionManager;
import baritone.api.utils.IInputOverrideHandler;
import baritone.api.utils.IPlayerContext;

public interface IBaritone {
    public IEventBus getGameEventHandler();

    public ISelectionManager getSelectionManager();

    public ICustomGoalProcess getCustomGoalProcess();

    public IInputOverrideHandler getInputOverrideHandler();

    public IGetToBlockProcess getGetToBlockProcess();

    public IPathingControlManager getPathingControlManager();

    public IElytraProcess getElytraProcess();

    public IPlayerContext getPlayerContext();

    public ICommandManager getCommandManager();

    public IFollowProcess getFollowProcess();

    public ILookBehavior getLookBehavior();

    public IBuilderProcess getBuilderProcess();

    public IExploreProcess getExploreProcess();

    public IPathingBehavior getPathingBehavior();

    public IWorldProvider getWorldProvider();

    public IMineProcess getMineProcess();

    public IFarmProcess getFarmProcess();

    public void openClick();
}

