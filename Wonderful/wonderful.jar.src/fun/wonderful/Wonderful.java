package fun.wonderful;

import fun.wonderful.api.QClient;
import fun.wonderful.api.storages.InitializeStorage;
import fun.wonderful.api.storages.implement.CommandStorage;
import fun.wonderful.api.storages.implement.ConfigStorage;
import fun.wonderful.api.storages.implement.DragStorage;
import fun.wonderful.api.storages.implement.FreeLookStorage;
import fun.wonderful.api.storages.implement.FriendStorage;
import fun.wonderful.api.storages.implement.LocalizationStorage;
import fun.wonderful.api.storages.implement.MacroStorage;
import fun.wonderful.api.storages.implement.ModuleStorage;
import fun.wonderful.api.storages.implement.RotationStorage;
import fun.wonderful.api.storages.implement.ServerStorage;
import fun.wonderful.api.storages.implement.StaffStorage;
import fun.wonderful.api.storages.implement.ThemeStorage;
import fun.wonderful.api.storages.implement.WaypointStorage;
import fun.wonderful.api.utils.client.UserInfo;
import fun.wonderful.api.utils.draggable.Draggable;
import fun.wonderful.api.utils.rpc.DiscordManager;
import fun.wonderful.api.utils.tps.TPSCalc;
import fun.wonderful.client.modules.Module;
import heavy.profile.UserProfile;
import java.io.File;
import lombok.Generated;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import org.lwjgl.glfw.GLFW;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.annotation.VMProtect;

public enum Wonderful implements ModInitializer,
QClient
{
    INSTANCE;

    public boolean isServer;
    private static double prevTime;
    public static double deltaTime;
    public InitializeStorage initializer;
    public ModuleStorage moduleStorage;
    public ThemeStorage themeStorage;
    public TPSCalc tpsCalc;
    public ServerStorage serverStorage;
    public RotationStorage rotationStorage;
    public FreeLookStorage freeLookStorage;
    public CommandStorage commandStorage;
    public LocalizationStorage localizationStorage;
    public ConfigStorage configStorage;
    public FriendStorage friendStorage;
    public MacroStorage macroStorage;
    public StaffStorage staffStorage;
    public WaypointStorage waypointStorage;
    public DiscordManager discordManager;
    public UserProfile userProfile;
    public UserInfo userInfo = UserInfo.empty();
    public File globalsDir;
    public File configsDir;
    public File abItemsDir;

    public void onInitialize() {
    }

    @VMProtect(value=VMProtect.Type.VIRTUALIZATION)
    @Compile(ops=20)
    private native void initStorage();

    private void createDirs(File ... file) {
        for (File f2 : file) {
            f2.mkdirs();
        }
    }

    public void closeMinecraft() {
        try {
            this.configStorage.saveGlobals();
            this.configStorage.saveConfig(this.configStorage.currentConfig);
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
        if (this.discordManager != null) {
            this.discordManager.stopRPC();
        }
    }

    public static Draggable draggable(Module module, String name, float x2, float y2) {
        DragStorage.draggables.put(name, new Draggable(module, name, x2, y2));
        return DragStorage.draggables.get(name);
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo == null ? UserInfo.empty() : userInfo;
    }

    @Generated
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

        double currentTime = GLFW.glfwGetTime();
        deltaTime = currentTime - prevTime;
        prevTime = currentTime;
        deltaTime = mc.isPaused() ? 0.0 : Math.min(0.05, deltaTime);
    }

    static {
        prevTime = 0.0;
        deltaTime = 0.0;
    }
}