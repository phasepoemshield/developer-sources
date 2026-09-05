/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFutureListener
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00642
 *  minecraft.class00648
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class03096
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.networking;

import io.netty.channel.ChannelFutureListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00642;
import minecraft.class00648;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class03096;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.impl.networking.AbstractNetworkAddon;
import net.fabricmc.fabric.impl.networking.ChannelInfoHolder;
import net.fabricmc.fabric.impl.networking.CommonPacketHandler;
import net.fabricmc.fabric.impl.networking.CommonRegisterPayload;
import net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry;
import net.fabricmc.fabric.impl.networking.NetworkingImpl;
import net.fabricmc.fabric.impl.networking.RegistrationPayload;
import org.jspecify.annotations.Nullable;

public abstract class AbstractChanneledNetworkAddon<H>
extends AbstractNetworkAddon<H>
implements PacketSender,
CommonPacketHandler {
    private static final int MAX_CHANNELS = Integer.getInteger("fabric.networking.maxChannels", 8192);
    private static final int MAX_CHANNEL_NAME_LENGTH = Math.max(Integer.getInteger("fabric.networking.maxChannelNameLength", 128), 128);
    protected final class00642 connection;
    protected final GlobalReceiverRegistry<H> receiver;
    protected final Set<class01894> sendableChannels;
    protected int commonVersion = -1;

    public AbstractChanneledNetworkAddon(GlobalReceiverRegistry<H> globalReceiverRegistry, class00642 class006422, String string) {
        super(globalReceiverRegistry, string);
        this.connection = class006422;
        this.receiver = globalReceiverRegistry;
        this.sendableChannels = Collections.synchronizedSet(new HashSet());
    }

    void register(List<class01894> list) {
        list.forEach(this::registerChannel);
        this.schedule(() -> this.invokeRegisterEvent(list));
    }

    protected abstract void schedule(Runnable var1);

    public boolean handle(class01659 class016592) {
        RegistrationPayload registrationPayload;
        class01894 class018942 = class016592.method_56479().N();
        this.logger.debug("Handling inbound packet from channel with name \"{}\"", (Object)class018942);
        if (class016592 instanceof RegistrationPayload) {
            registrationPayload = (RegistrationPayload)class016592;
            if (NetworkingImpl.REGISTER_CHANNEL.equals((Object)class018942)) {
                this.receiveRegistration(true, registrationPayload);
                return true;
            }
            if (NetworkingImpl.UNREGISTER_CHANNEL.equals((Object)class018942)) {
                this.receiveRegistration(false, registrationPayload);
                return true;
            }
        }
        if ((registrationPayload = this.getHandler(class018942)) == null) {
            return false;
        }
        if (!this.isOnReceiveThread()) {
            throw class03096.N;
        }
        try {
            this.receive(registrationPayload, class016592);
        }
        catch (Throwable throwable) {
            this.logger.error("Encountered exception while handling in channel with name \"{}\"", (Object)class018942, (Object)throwable);
            throw throwable;
        }
        return true;
    }

    void unregister(List<class01894> list) {
        this.sendableChannels.removeAll(list);
        this.schedule(() -> this.invokeUnregisterEvent(list));
    }

    @Override
    public void onCommonVersionPacket(int n) {
        if (n != 1) {
            throw new UnsupportedOperationException("Unsupported common packet version: " + n);
        }
        this.commonVersion = n;
        this.logger.debug("Negotiated common packet version {}", (Object)this.commonVersion);
    }

    @Override
    public int getNegotiatedVersion() {
        if (this.commonVersion == -1) {
            throw new IllegalStateException("Not yet negotiated common packet version");
        }
        return this.commonVersion;
    }

    @Override
    public void onCommonRegisterPacket(CommonRegisterPayload commonRegisterPayload) {
        if (commonRegisterPayload.version() != this.getNegotiatedVersion()) {
            throw new IllegalStateException("Negotiated common packet version: %d but received packet with version: %d".formatted(new Object[]{this.commonVersion, commonRegisterPayload.version()}));
        }
        String string = this.getPhase();
        if (string == null) {
            this.logger.warn("Received common register packet for phase {} in network state: {}", (Object)commonRegisterPayload.phase(), (Object)this.receiver.getPhase());
            return;
        }
        if (!commonRegisterPayload.phase().equals(string)) {
            throw new IllegalStateException("Register packet received for phase (%s) on handler for phase(%s)".formatted(new Object[]{commonRegisterPayload.phase(), string}));
        }
        this.register(new ArrayList<class01894>(commonRegisterPayload.channels()));
    }

    protected abstract void receive(H var1, class01659 var2);

    public void disconnect(class00392 class003922) {
        Objects.requireNonNull(class003922, "Disconnect reason cannot be null");
        this.connection.method_10747(class003922);
    }

    @Override
    public CommonRegisterPayload createRegisterPayload() {
        return new CommonRegisterPayload(this.getNegotiatedVersion(), this.getPhase(), this.getReceivableChannels());
    }

    private void registerChannel(class01894 class018942) {
        if (this.sendableChannels.size() >= MAX_CHANNELS) {
            throw new IllegalArgumentException("Cannot register more than " + MAX_CHANNELS + " channels");
        }
        if (class018942.toString().length() > MAX_CHANNEL_NAME_LENGTH) {
            throw new IllegalArgumentException("Channel name is too long");
        }
        this.sendableChannels.add(class018942);
    }

    protected void registerPendingChannels(ChannelInfoHolder channelInfoHolder, class00648 class006482) {
        Collection<class01894> collection = channelInfoHolder.fabric_getPendingChannelsNames(class006482);
        if (!collection.isEmpty()) {
            this.register(new ArrayList<class01894>(collection));
            collection.clear();
        }
    }

    protected abstract void invokeRegisterEvent(List<class01894> var1);

    protected abstract void invokeUnregisterEvent(List<class01894> var1);

    protected @Nullable RegistrationPayload createRegistrationPayload(class01666<RegistrationPayload> class016662, Collection<class01894> collection) {
        if (collection.isEmpty()) {
            return null;
        }
        return new RegistrationPayload(class016662, new ArrayList<class01894>(collection));
    }

    public void receiveRegistration(boolean bl, RegistrationPayload registrationPayload) {
        if (bl) {
            this.register(registrationPayload.channels());
        } else {
            this.unregister(registrationPayload.channels());
        }
    }

    protected abstract boolean isOnReceiveThread();

    public Set<class01894> getSendableChannels() {
        return Collections.unmodifiableSet(this.sendableChannels);
    }

    private @Nullable String getPhase() {
        return switch (this.receiver.getPhase()) {
            case class00648.field_20591 -> "play";
            case class00648.field_45671 -> "configuration";
            default -> null;
        };
    }

    public void sendPacket(class00381<?> class003812, ChannelFutureListener channelFutureListener) {
        Objects.requireNonNull(class003812, "Packet cannot be null");
        this.connection.method_10752(class003812, channelFutureListener);
    }

    protected void sendInitialChannelRegistrationPacket() {
        RegistrationPayload registrationPayload = this.createRegistrationPayload(RegistrationPayload.REGISTER, this.getReceivableChannels());
        if (registrationPayload != null) {
            this.sendPacket(registrationPayload);
        }
    }
}

