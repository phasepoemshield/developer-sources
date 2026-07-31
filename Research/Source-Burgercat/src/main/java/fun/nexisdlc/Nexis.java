package fun.nexisdlc;

import fun.nexisdlc.client.utils.eventbus.EventBus;
import fun.nexisdlc.client.utils.config.GPSStorage;
import fun.nexisdlc.client.utils.config.ConfigStorage;
import fun.nexisdlc.client.utils.config.FriendStorage;
import fun.nexisdlc.client.utils.config.StaffStorage;
import fun.nexisdlc.client.utils.config.AutoSellConfig;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.discord.DiscordManager;
import fun.nexisdlc.commands.commands.CommandDispatcher;
import fun.nexisdlc.commands.commands.manager.CommandRepository;
import fun.nexisdlc.modules.api.FunctionManager;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.ui.screen.MainMenuScreen;
import lombok.Getter;
import net.minecraft.client.gui.DrawContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Nexis {
    @Getter
    private static volatile Nexis instance;
    private static FunctionManager functionManager;
    public static final Logger LOGGER = LoggerFactory.getLogger(Nexis.class);

    public static boolean noNeedSounds = false;
    @Getter
    private final FriendStorage friendStorage = new FriendStorage();
    @Getter
    private final StaffStorage staffStorage = new StaffStorage();
    @Getter
    private final GPSStorage gpsStorage = new GPSStorage();
    @Getter
    private final AutoSellConfig autoSellConfig = new AutoSellConfig();
    @Getter
    private DiscordManager discordManager;
    @Getter
    private CommandRepository commandRepository;
    @Getter
    private CommandDispatcher commandDispatcher;
    @Getter
    private MainMenuScreen mainMenuScreen;
    public final TestRenderBridge testRender = new TestRenderBridge();


    public Nexis() {
        instance = this;
    }

    public void initDiscordRPC() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("linux")) {
            return;
        }
        discordManager = new DiscordManager();
        discordManager.init();

        System.out.println("discord inited from nexis");
    }

    public void initCommands() {
        if (commandRepository != null && commandDispatcher != null) {
            return;
        }
        commandRepository = new CommandRepository();
        commandDispatcher = new CommandDispatcher(NexisClient.getEventBus());
    }

    public ConfigStorage getConfigStorage() {
        return NexisClient.getConfigStorage();
    }

    public static EventBus getEventBus() {
        return NexisClient.getEventBus();
    }

    public static FunctionManager getFunctionManager() {
        return NexisClient.getFunctionManager();
    }

    public Dragging createDrag(Function module, String name, float x, float y) {
        return DraggingManager.registerDragging(new Dragging(module, name, x, y));
    }

    public MainMenuScreen getOrCreateMainMenuScreen() {
        if (mainMenuScreen == null) {
            mainMenuScreen = new MainMenuScreen();
            EventBus bus = NexisClient.getEventBus();
            if (bus != null) {
                bus.subscribe(mainMenuScreen);
            }
        }
        return mainMenuScreen;
    }

    public static class TestRenderBridge {
        private DrawContext drawContext;

        public DrawContext getDrawContext() {
            return drawContext != null ? drawContext : NexisClient.getCurrentDrawContext();
        }

        public void setDrawContext(DrawContext drawContext) {
            this.drawContext = drawContext;
        }

        public void runTasks() {
        }
    }

}
