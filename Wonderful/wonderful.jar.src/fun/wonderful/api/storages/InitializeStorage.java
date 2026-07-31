package fun.wonderful.api.storages;

import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.annotation.VM;

public class InitializeStorage
implements QClient {
    public void onInitialize() {
        EventInvoker.register(this);
        this.initStorages();
    }

    @VM
    @Compile
    public native void initStorages();
}