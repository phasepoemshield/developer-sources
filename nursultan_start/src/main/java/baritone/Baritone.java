/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.event.listener.IEventBus
 *  baritone.api.event.listener.IGameEventListener
 *  baritone.api.process.IBaritoneProcess
 *  baritone.api.process.IElytraProcess
 *  baritone.api.utils.IPlayerContext
 *  baritone.behavior.InventoryBehavior
 *  baritone.behavior.LookBehavior
 *  baritone.behavior.PathingBehavior
 *  baritone.behavior.WaypointBehavior
 *  baritone.cache.WorldProvider
 *  baritone.command.manager.CommandManager
 *  baritone.event.GameEventHandler
 *  baritone.process.BackfillProcess
 *  baritone.process.BuilderProcess
 *  baritone.process.CustomGoalProcess
 *  baritone.process.ElytraProcess
 *  baritone.process.ExploreProcess
 *  baritone.process.FarmProcess
 *  baritone.process.FollowProcess
 *  baritone.process.GetToBlockProcess
 *  baritone.process.InventoryPauserProcess
 *  baritone.process.MineProcess
 *  baritone.selection.SelectionManager
 *  baritone.utils.BlockStateInterface
 *  baritone.utils.GuiClick
 *  baritone.utils.InputOverrideHandler
 *  baritone.utils.PathingControlManager
 *  baritone.utils.player.BaritonePlayerContext
 *  minecraft.class05096
 *  minecraft.class06202
 */
package baritone;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.Settings;
import baritone.api.behavior.IBehavior;
import baritone.api.event.listener.IEventBus;
import baritone.api.event.listener.IGameEventListener;
import baritone.api.process.IBaritoneProcess;
import baritone.api.process.IElytraProcess;
import baritone.api.utils.IPlayerContext;
import baritone.behavior.InventoryBehavior;
import baritone.behavior.LookBehavior;
import baritone.behavior.PathingBehavior;
import baritone.behavior.WaypointBehavior;
import baritone.cache.WorldProvider;
import baritone.command.manager.CommandManager;
import baritone.event.GameEventHandler;
import baritone.process.BackfillProcess;
import baritone.process.BuilderProcess;
import baritone.process.CustomGoalProcess;
import baritone.process.ElytraProcess;
import baritone.process.ExploreProcess;
import baritone.process.FarmProcess;
import baritone.process.FollowProcess;
import baritone.process.GetToBlockProcess;
import baritone.process.InventoryPauserProcess;
import baritone.process.MineProcess;
import baritone.selection.SelectionManager;
import baritone.utils.BlockStateInterface;
import baritone.utils.GuiClick;
import baritone.utils.InputOverrideHandler;
import baritone.utils.PathingControlManager;
import baritone.utils.player.BaritonePlayerContext;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import minecraft.class05096;
import minecraft.class06202;

public class Baritone
implements IBaritone {
    private static final ThreadPoolExecutor threadPool = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
    private final class06202 mc;
    private final Path directory;
    private final GameEventHandler gameEventHandler;
    private final PathingBehavior pathingBehavior;
    private final LookBehavior lookBehavior;
    private final InventoryBehavior inventoryBehavior;
    private final InputOverrideHandler inputOverrideHandler;
    private final FollowProcess followProcess;
    private final MineProcess mineProcess;
    private final GetToBlockProcess getToBlockProcess;
    private final CustomGoalProcess customGoalProcess;
    private final BuilderProcess builderProcess;
    private final ExploreProcess exploreProcess;
    private final FarmProcess farmProcess;
    private final InventoryPauserProcess inventoryPauserProcess;
    private final IElytraProcess elytraProcess;
    private final PathingControlManager pathingControlManager;
    private final SelectionManager selectionManager;
    private final CommandManager commandManager;
    private final IPlayerContext playerContext;
    private final WorldProvider worldProvider;
    public BlockStateInterface bsi;

    Baritone(class06202 class062022) {
        this.mc = class062022;
        this.gameEventHandler = new GameEventHandler(this);
        this.directory = ((File)class062022.l_1).toPath().resolve("baritone");
        if (!Files.exists(this.directory, new LinkOption[0])) {
            try {
                Files.createDirectories(this.directory, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        this.playerContext = new BaritonePlayerContext(this, class062022);
        this.lookBehavior = (LookBehavior)this.registerBehavior(LookBehavior::new);
        this.pathingBehavior = (PathingBehavior)this.registerBehavior(PathingBehavior::new);
        this.inventoryBehavior = (InventoryBehavior)this.registerBehavior(InventoryBehavior::new);
        this.inputOverrideHandler = (InputOverrideHandler)this.registerBehavior(InputOverrideHandler::new);
        this.registerBehavior(WaypointBehavior::new);
        this.pathingControlManager = new PathingControlManager(this);
        this.followProcess = (FollowProcess)this.registerProcess(FollowProcess::new);
        this.mineProcess = (MineProcess)this.registerProcess(MineProcess::new);
        this.customGoalProcess = (CustomGoalProcess)this.registerProcess(CustomGoalProcess::new);
        this.getToBlockProcess = (GetToBlockProcess)this.registerProcess(GetToBlockProcess::new);
        this.builderProcess = (BuilderProcess)this.registerProcess(BuilderProcess::new);
        this.exploreProcess = (ExploreProcess)this.registerProcess(ExploreProcess::new);
        this.farmProcess = (FarmProcess)this.registerProcess(FarmProcess::new);
        this.inventoryPauserProcess = (InventoryPauserProcess)this.registerProcess(InventoryPauserProcess::new);
        this.elytraProcess = (IElytraProcess)this.registerProcess(ElytraProcess::create);
        this.registerProcess(BackfillProcess::new);
        this.worldProvider = new WorldProvider(this);
        this.selectionManager = new SelectionManager(this);
        this.commandManager = new CommandManager(this);
    }

    public static Settings settings() {
        return BaritoneAPI.getSettings();
    }

    public static Executor getExecutor() {
        return threadPool;
    }

    @Override
    public IEventBus getGameEventHandler() {
        return this.gameEventHandler;
    }

    public SelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public CustomGoalProcess getCustomGoalProcess() {
        return this.customGoalProcess;
    }

    public InputOverrideHandler getInputOverrideHandler() {
        return this.inputOverrideHandler;
    }

    public GetToBlockProcess getGetToBlockProcess() {
        return this.getToBlockProcess;
    }

    public PathingControlManager getPathingControlManager() {
        return this.pathingControlManager;
    }

    @Override
    public IElytraProcess getElytraProcess() {
        return this.elytraProcess;
    }

    @Override
    public IPlayerContext getPlayerContext() {
        return this.playerContext;
    }

    public CommandManager getCommandManager() {
        return this.commandManager;
    }

    public FollowProcess getFollowProcess() {
        return this.followProcess;
    }

    public LookBehavior getLookBehavior() {
        return this.lookBehavior;
    }

    public BuilderProcess getBuilderProcess() {
        return this.builderProcess;
    }

    public ExploreProcess getExploreProcess() {
        return this.exploreProcess;
    }

    public PathingBehavior getPathingBehavior() {
        return this.pathingBehavior;
    }

    public WorldProvider getWorldProvider() {
        return this.worldProvider;
    }

    public MineProcess getMineProcess() {
        return this.mineProcess;
    }

    public FarmProcess getFarmProcess() {
        return this.farmProcess;
    }

    @Override
    public void openClick() {
        new Thread(() -> {
            try {
                Thread.sleep(100L);
                this.mc.execute(() -> this.mc.N((class05096)new GuiClick()));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }).start();
    }

    public Path getDirectory() {
        return this.directory;
    }

    public <T extends IBaritoneProcess> T registerProcess(Function<Baritone, T> function) {
        IBaritoneProcess iBaritoneProcess = (IBaritoneProcess)function.apply(this);
        this.pathingControlManager.registerProcess(iBaritoneProcess);
        return (T)iBaritoneProcess;
    }

    public <T extends IBehavior> T registerBehavior(Function<Baritone, T> function) {
        IBehavior iBehavior = (IBehavior)function.apply(this);
        this.registerBehavior(iBehavior);
        return (T)iBehavior;
    }

    public void registerBehavior(IBehavior iBehavior) {
        this.gameEventHandler.registerEventListener((IGameEventListener)iBehavior);
    }

    public InventoryPauserProcess getInventoryPauserProcess() {
        return this.inventoryPauserProcess;
    }

    public InventoryBehavior getInventoryBehavior() {
        return this.inventoryBehavior;
    }
}

