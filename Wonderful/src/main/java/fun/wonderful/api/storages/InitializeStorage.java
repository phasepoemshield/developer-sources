package fun.wonderful.api.storages;

import fun.wonderful.Wonderful;
import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.utils.rpc.DiscordManager;
import fun.wonderful.api.utils.tps.TPSCalc;
import heavy.profile.UserProfile;

public class InitializeStorage
implements QClient {
    public void onInitialize() {
        EventInvoker.register(this);
        this.initStorages();
    }

    public void initStorages() {
        Wonderful wonderful = Wonderful.INSTANCE;
        wonderful.tpsCalc = new TPSCalc();
        EventInvoker.register(wonderful.tpsCalc);
        try {
            wonderful.userProfile = UserProfile.getInstance().load();
        }
        catch (Throwable ignored) {
            wonderful.userProfile = null;
        }
        try {
            wonderful.discordManager = new DiscordManager().start();
        }
        catch (Throwable ignored) {
            wonderful.discordManager = null;
        }
    }
}