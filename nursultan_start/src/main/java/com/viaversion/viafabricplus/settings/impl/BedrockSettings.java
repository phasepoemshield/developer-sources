/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.settings.SettingGroup
 *  com.viaversion.viafabricplus.api.settings.type.BooleanSetting
 *  com.viaversion.viafabricplus.api.settings.type.ButtonSetting
 *  com.viaversion.viafabricplus.injection.access.base.bedrock.IConfirmScreen
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class05733
 *  minecraft.class06197
 *  minecraft.class06202
 *  minecraft.class07536
 *  net.lenni0451.commons.httpclient.HttpClient
 *  net.raphimc.minecraftauth.MinecraftAuth
 *  net.raphimc.minecraftauth.bedrock.BedrockAuthManager
 *  net.raphimc.minecraftauth.msa.service.impl.DeviceCodeMsaAuthService
 *  net.raphimc.minecraftauth.util.holder.listener.ChangeListener
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 */
package com.viaversion.viafabricplus.settings.impl;

import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.api.settings.type.BooleanSetting;
import com.viaversion.viafabricplus.api.settings.type.ButtonSetting;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IConfirmScreen;
import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.save.impl.AccountsSave;
import com.viaversion.viafabricplus.screen.VFPScreen;
import com.viaversion.viafabricplus.screen.impl.SettingsScreen;
import com.viaversion.viafabricplus.settings.impl.BedrockSettings$1;
import com.viaversion.viafabricplus.settings.impl.BedrockSettings$2;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class05733;
import minecraft.class06197;
import minecraft.class06202;
import minecraft.class07536;
import net.lenni0451.commons.httpclient.HttpClient;
import net.raphimc.minecraftauth.MinecraftAuth;
import net.raphimc.minecraftauth.bedrock.BedrockAuthManager;
import net.raphimc.minecraftauth.msa.service.impl.DeviceCodeMsaAuthService;
import net.raphimc.minecraftauth.util.holder.listener.ChangeListener;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;

public final class BedrockSettings
extends SettingGroup {
    private static final class00392 TITLE = class00392.N((String)"Microsoft Bedrock login");
    public static final BedrockSettings INSTANCE = new BedrockSettings();
    private Thread thread;
    private final ButtonSetting clickToSetBedrockAccount = new BedrockSettings$1(this, this, class00392.L((String)"bedrock_settings.viafabricplus.click_to_set_bedrock_account"), () -> {
        this.thread = new Thread(this::openBedrockAccountLogin);
        this.thread.start();
    });
    public final BooleanSetting replaceDefaultPort = new BooleanSetting((SettingGroup)this, class00392.L((String)"bedrock_settings.viafabricplus.replace_default_port"), Boolean.valueOf(true));
    public final BooleanSetting experimentalFeatures = new BooleanSetting((SettingGroup)this, class00392.L((String)"bedrock_settings.viafabricplus.experimental_features"), Boolean.valueOf(true));

    public BedrockSettings() {
        super((class00392)class00392.L((String)"setting_group_name.viafabricplus.bedrock"));
    }

    public static String replaceDefaultPort(String string, ProtocolVersion protocolVersion) {
        if (((Boolean)BedrockSettings.INSTANCE.replaceDefaultPort.getValue()).booleanValue() && Objects.equals(protocolVersion, BedrockProtocolVersion.bedrockLatest) && !string.contains(":")) {
            return string + ":19132";
        }
        return string;
    }

    private void openBedrockAccountLogin() {
        block3: {
            AccountsSave accountsSave = SaveManager.INSTANCE.getAccountsSave();
            class06202 class062022 = class06202.Nq();
            class05096 class050962 = (class05096)class062022.v_3;
            try {
                BedrockAuthManager bedrockAuthManager = BedrockAuthManager.create((HttpClient)MinecraftAuth.createHttpClient(), (String)"1.26.10").login(DeviceCodeMsaAuthService::new, msaDeviceCode -> {
                    VFPScreen.setScreen((class05096)new class05733(bl -> {
                        if (bl) {
                            ((class06197)class062022.L_3).N(msaDeviceCode.getDirectVerificationUri());
                        } else {
                            class062022.N(class050962);
                            this.thread.interrupt();
                        }
                    }, TITLE, (class00392)class00392.L((String)"click_to_set_bedrock_account.viafabricplus.notice"), (class00392)class00392.L((String)"base.viafabricplus.copy_link"), (class00392)class00392.L((String)"base.viafabricplus.cancel")));
                    class07536.m().N(msaDeviceCode.getDirectVerificationUri());
                });
                bedrockAuthManager.getChangeListeners().add((ChangeListener)new BedrockSettings$2(this, bedrockAuthManager));
                bedrockAuthManager.getMinecraftMultiplayerToken().refreshIfExpired();
                bedrockAuthManager.getMinecraftCertificateChain().refreshIfExpired();
                accountsSave.setBedrockAccount(bedrockAuthManager);
                VFPScreen.setScreen(class050962);
            }
            catch (Exception exception) {
                if (exception instanceof InterruptedException) {
                    return;
                }
                this.thread.interrupt();
                if (!((class05096)class062022.v_3 instanceof SettingsScreen)) break block3;
                VFPScreen.showErrorScreen(TITLE, exception, class050962);
            }
        }
    }

    static void updateLoginStatusMessage(String string) {
        class06202.Nq().execute(() -> {
            class05096 class050962 = (class05096)class06202.Nq().v_3;
            if (class050962 instanceof class05733) {
                class05733 class057332 = (class05733)class050962;
                ((IConfirmScreen)class057332).viaFabricPlus$updateMessage((class00392)class00392.L((String)("minecraftauth_library.viafabricplus." + string)));
            }
        });
    }
}

