/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viafabricplus.base.bedrock.NetherNetJsonRpcAddress
 *  dev.kastle.netty.channel.nethernet.config.NetherNetAddress
 *  minecraft.class00392
 *  minecraft.class04654
 *  minecraft.class05362
 *  minecraft.class07536
 *  net.raphimc.minecraftauth.MinecraftAuth
 *  net.raphimc.minecraftauth.bedrock.BedrockAuthManager
 *  net.raphimc.minecraftauth.extra.realms.model.RealmsJoinInformation
 *  net.raphimc.minecraftauth.extra.realms.model.RealmsServer
 *  net.raphimc.minecraftauth.extra.realms.service.impl.BedrockRealmsService
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.apache.logging.log4j.Level
 */
package com.viaversion.viafabricplus.screen.impl.realms;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.base.bedrock.NetherNetJsonRpcAddress;
import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.screen.VFPScreen;
import com.viaversion.viafabricplus.screen.impl.realms.AcceptInvitationCodeScreen;
import com.viaversion.viafabricplus.screen.impl.realms.BedrockRealmsScreen$SlotEntry;
import com.viaversion.viafabricplus.screen.impl.realms.BedrockRealmsScreen$SlotList;
import com.viaversion.viafabricplus.util.ConnectionUtil;
import dev.kastle.netty.channel.nethernet.config.NetherNetAddress;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class04654;
import minecraft.class05362;
import minecraft.class07536;
import net.raphimc.minecraftauth.MinecraftAuth;
import net.raphimc.minecraftauth.bedrock.BedrockAuthManager;
import net.raphimc.minecraftauth.extra.realms.model.RealmsJoinInformation;
import net.raphimc.minecraftauth.extra.realms.model.RealmsServer;
import net.raphimc.minecraftauth.extra.realms.service.impl.BedrockRealmsService;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.apache.logging.log4j.Level;

public final class BedrockRealmsScreen
extends VFPScreen {
    public static final BedrockRealmsScreen INSTANCE = new BedrockRealmsScreen();
    private BedrockRealmsService service;
    List<RealmsServer> realmsServers;
    private BedrockRealmsScreen$SlotList slotList;
    private class05362 joinButton;
    private class05362 leaveButton;

    public BedrockRealmsScreen() {
        super((class00392)class00392.L((String)"screen.viafabricplus.bedrock_realms"), true);
    }

    private Void error(String string, Throwable throwable) {
        this.setupSubtitle((class00392)class00392.L((String)"bedrock_realms.viafabricplus.error"));
        ViaFabricPlusImpl.INSTANCE.getLogger().log(Level.ERROR, string, throwable);
        return null;
    }

    private void createView() {
        if (!this.realmsServers.isEmpty()) {
            this.setupDefaultSubtitle();
        } else {
            this.setupSubtitle((class00392)class00392.L((String)"bedrock_realms.viafabricplus.no_worlds"));
        }
        Objects.requireNonNull(this.field_22793);
        Objects.requireNonNull(this.field_22793);
        this.slotList = new BedrockRealmsScreen$SlotList(this, this.field_22787, this.field_22789, this.field_22790, 6 + (9 + 2) * 3, 30, (9 + 2) * 4);
        this.method_37063((class04654)this.slotList);
        this.addRefreshButton(() -> {
            this.realmsServers = null;
        });
        int n = 356;
        int n2 = this.field_22789 / 2 - 178;
        this.joinButton = class05362.method_46430((class00392)class00392.L((String)"bedrock_realms.viafabricplus.join"), class053622 -> {
            BedrockRealmsScreen$SlotEntry bedrockRealmsScreen$SlotEntry = (BedrockRealmsScreen$SlotEntry)this.slotList.method_25336();
            if (bedrockRealmsScreen$SlotEntry.realmsServer.isExpired()) {
                this.setupSubtitle((class00392)class00392.L((String)"bedrock_realms.viafabricplus.expired"));
                return;
            }
            if (!bedrockRealmsScreen$SlotEntry.realmsServer.isCompatible()) {
                this.setupSubtitle((class00392)class00392.L((String)"bedrock_realms.viafabricplus.incompatible"));
                return;
            }
            try {
                RealmsJoinInformation realmsJoinInformation = this.service.joinWorld(bedrockRealmsScreen$SlotEntry.realmsServer);
                if (realmsJoinInformation.getNetworkProtocol().equalsIgnoreCase("DEFAULT")) {
                    ConnectionUtil.connect(realmsJoinInformation.getAddress(), BedrockProtocolVersion.bedrockLatest);
                } else if (realmsJoinInformation.getNetworkProtocol().equalsIgnoreCase("NETHERNET")) {
                    ConnectionUtil.connectNetherNet(new NetherNetAddress(realmsJoinInformation.getAddress()));
                } else if (realmsJoinInformation.getNetworkProtocol().equalsIgnoreCase("NETHERNET_JSONRPC")) {
                    ConnectionUtil.connectNetherNet((NetherNetAddress)new NetherNetJsonRpcAddress(realmsJoinInformation.getAddress()));
                } else {
                    this.setupSubtitle((class00392)class00392.N((String)"bedrock_realms.viafabricplus.unsupported_protocol", (Object[])new Object[]{realmsJoinInformation.getNetworkProtocol()}));
                }
            }
            catch (Throwable throwable) {
                this.error("Failed to join realm", throwable);
            }
        }).N(n2, this.field_22790 - 20 - 5).y(115, 20).N();
        this.method_37063((class04654)this.joinButton);
        this.joinButton.field_22763 = false;
        this.leaveButton = class05362.method_46430((class00392)class00392.L((String)"bedrock_realms.viafabricplus.leave"), class053622 -> {
            BedrockRealmsScreen$SlotEntry bedrockRealmsScreen$SlotEntry = (BedrockRealmsScreen$SlotEntry)this.slotList.method_25336();
            ((CompletableFuture)this.service.leaveInvitedRealmAsync(bedrockRealmsScreen$SlotEntry.realmsServer).thenAccept(void_ -> {
                this.realmsServers.remove(bedrockRealmsScreen$SlotEntry.realmsServer);
                INSTANCE.open(this.prevScreen);
            })).exceptionally(throwable -> this.error("Failed to leave realm", (Throwable)throwable));
        }).N(n2 += 120, this.field_22790 - 20 - 5).y(115, 20).N();
        this.method_37063((class04654)this.leaveButton);
        this.leaveButton.field_22763 = false;
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"bedrock_realms.viafabricplus.invite"), class053622 -> {
            AcceptInvitationCodeScreen acceptInvitationCodeScreen = new AcceptInvitationCodeScreen(string -> ((CompletableFuture)this.service.acceptInviteAsync(string).thenAccept(realmsServer -> {
                this.realmsServers.add((RealmsServer)realmsServer);
                INSTANCE.open(this);
            })).exceptionally(throwable -> this.error("Failed to accept invite", (Throwable)throwable)));
            acceptInvitationCodeScreen.open(this);
        }).N(n2 += 120, this.field_22790 - 20 - 5).y(115, 20).N());
    }

    private void loadRealms() {
        BedrockAuthManager bedrockAuthManager = SaveManager.INSTANCE.getAccountsSave().getBedrockAccount();
        if (bedrockAuthManager == null) {
            this.setupSubtitle((class00392)class00392.L((String)"bedrock_realms.viafabricplus.warning"));
            return;
        }
        this.service = new BedrockRealmsService(MinecraftAuth.createHttpClient(), "1.26.10", bedrockAuthManager.getRealmsXstsToken());
        ((CompletableFuture)this.service.isCompatibleAsync().thenAccept(bl -> {
            if (bl.booleanValue()) {
                ((CompletableFuture)this.service.getWorldsAsync().thenAccept(list -> {
                    this.realmsServers = list;
                    this.createView();
                })).exceptionally(throwable -> this.error("Failed to load realm worlds", (Throwable)throwable));
            } else {
                this.setupSubtitle((class00392)class00392.L((String)"bedrock_realms.viafabricplus.unavailable"));
            }
        })).exceptionally(throwable -> this.error("Failed to check realms availability", (Throwable)throwable));
    }

    @Override
    public void method_25426() {
        super.method_25426();
        if (this.realmsServers != null) {
            this.createView();
            return;
        }
        this.setupSubtitle((class00392)class00392.L((String)"bedrock_realms.viafabricplus.availability_check"));
        class07536.z().execute(this::loadRealms);
    }

    public void method_25393() {
        super.method_25393();
        if (this.slotList != null && this.joinButton != null && this.leaveButton != null) {
            this.joinButton.field_22763 = this.slotList.method_25336() instanceof BedrockRealmsScreen$SlotEntry;
            this.leaveButton.field_22763 = this.slotList.method_25336() instanceof BedrockRealmsScreen$SlotEntry;
        }
    }

    @Override
    public boolean subtitleCentered() {
        return this.realmsServers == null;
    }
}

