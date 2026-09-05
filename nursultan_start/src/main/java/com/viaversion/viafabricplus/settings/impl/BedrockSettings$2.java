/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.minecraftauth.bedrock.BedrockAuthManager
 *  net.raphimc.minecraftauth.util.holder.listener.ChangeListener
 */
package com.viaversion.viafabricplus.settings.impl;

import com.viaversion.viafabricplus.settings.impl.BedrockSettings;
import net.raphimc.minecraftauth.bedrock.BedrockAuthManager;
import net.raphimc.minecraftauth.util.holder.listener.ChangeListener;

class BedrockSettings$2
implements ChangeListener {
    final /* synthetic */ BedrockAuthManager val$bedrockAccount;

    public <T> void onChange(T t, T t2) {
        if (t2 == this.val$bedrockAccount.getMsaToken().getCached()) {
            BedrockSettings.updateLoginStatusMessage("msatoken");
        } else if (t2 == this.val$bedrockAccount.getXblDeviceToken().getCached()) {
            BedrockSettings.updateLoginStatusMessage("xbldevicetoken");
        } else if (t2 == this.val$bedrockAccount.getXblUserToken().getCached()) {
            BedrockSettings.updateLoginStatusMessage("xblusertoken");
        } else if (t2 == this.val$bedrockAccount.getXblTitleToken().getCached()) {
            BedrockSettings.updateLoginStatusMessage("xbltitletoken");
        } else if (t2 == this.val$bedrockAccount.getBedrockXstsToken().getCached()) {
            BedrockSettings.updateLoginStatusMessage("bedrockxststoken");
        } else if (t2 == this.val$bedrockAccount.getPlayFabXstsToken().getCached()) {
            BedrockSettings.updateLoginStatusMessage("playfabxststoken");
        } else if (t2 == this.val$bedrockAccount.getRealmsXstsToken().getCached()) {
            BedrockSettings.updateLoginStatusMessage("realmsxststoken");
        } else if (t2 == this.val$bedrockAccount.getPlayFabToken().getCached()) {
            BedrockSettings.updateLoginStatusMessage("playfabtoken");
        } else if (t2 == this.val$bedrockAccount.getMinecraftSession().getCached()) {
            BedrockSettings.updateLoginStatusMessage("minecraftsession");
        } else if (t2 == this.val$bedrockAccount.getMinecraftMultiplayerToken().getCached()) {
            BedrockSettings.updateLoginStatusMessage("minecraftmultiplayertoken");
        } else if (t2 == this.val$bedrockAccount.getMinecraftCertificateChain().getCached()) {
            BedrockSettings.updateLoginStatusMessage("minecraftcertificatechain");
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    BedrockSettings$2() {
        void var2_-1;
        this.val$bedrockAccount = var2_-1;
    }
}

