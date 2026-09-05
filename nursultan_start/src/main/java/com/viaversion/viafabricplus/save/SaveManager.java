/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.events.LoadingCycleCallback
 *  com.viaversion.viafabricplus.api.events.LoadingCycleCallback$LoadingCycle
 *  com.viaversion.viafabricplus.base.Events
 */
package com.viaversion.viafabricplus.save;

import com.viaversion.viafabricplus.api.events.LoadingCycleCallback;
import com.viaversion.viafabricplus.base.Events;
import com.viaversion.viafabricplus.save.AbstractSave;
import com.viaversion.viafabricplus.save.impl.AccountsSave;
import com.viaversion.viafabricplus.save.impl.SettingsSave;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class SaveManager {
    public static final SaveManager INSTANCE = new SaveManager();
    private final List<AbstractSave> saves = new ArrayList<AbstractSave>();
    private SettingsSave settingsSave;
    private AccountsSave accountsSave;

    public void init() {
        ((LoadingCycleCallback)Events.LOADING_CYCLE.invoker()).onLoadCycle(LoadingCycleCallback.LoadingCycle.PRE_FILES_LOAD);
        AbstractSave[] abstractSaveArray = new AbstractSave[2];
        this.settingsSave = new SettingsSave();
        abstractSaveArray[0] = this.settingsSave;
        this.accountsSave = new AccountsSave();
        abstractSaveArray[1] = this.accountsSave;
        this.add(abstractSaveArray);
        for (AbstractSave save : this.saves) {
            save.init();
        }
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            for (AbstractSave save : this.saves) {
                save.save();
            }
        }));
    }

    public void postInit() {
        for (AbstractSave save : this.saves) {
            save.postInit();
        }
        ((LoadingCycleCallback)Events.LOADING_CYCLE.invoker()).onLoadCycle(LoadingCycleCallback.LoadingCycle.POST_FILES_LOAD);
    }

    public void add(AbstractSave ... saves) {
        this.saves.addAll(Arrays.asList(saves));
    }

    public SettingsSave getSettingsSave() {
        return this.settingsSave;
    }

    public AccountsSave getAccountsSave() {
        return this.accountsSave;
    }
}

