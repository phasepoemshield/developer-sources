/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.Direction
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.TypeConverter
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.exception.CancelException
 *  com.viaversion.viaversion.exception.InformativeException
 *  com.viaversion.viaversion.util.ArrayUtil
 *  com.viaversion.viaversion.util.PipelineUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelFuture
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocol.packet;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.TypeConverter;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.exception.CancelException;
import com.viaversion.viaversion.exception.InformativeException;
import com.viaversion.viaversion.util.ArrayUtil;
import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.Nullable;

public class PacketWrapperImpl
implements PacketWrapper {
    private final Deque<PacketValue<?>> readableObjects = new ArrayDeque();
    private final List<PacketValue<?>> packetValues = new ArrayList();
    private final ByteBuf inputBuffer;
    private final UserConnection userConnection;
    private boolean send = true;
    private PacketType packetType;
    private int id;

    public PacketWrapperImpl(int packetId, @Nullable ByteBuf inputBuffer, UserConnection userConnection) {
        this.id = packetId;
        this.inputBuffer = inputBuffer;
        this.userConnection = userConnection;
    }

    public PacketWrapperImpl(@Nullable PacketType packetType, @Nullable ByteBuf inputBuffer, UserConnection userConnection) {
        this.packetType = packetType;
        this.id = packetType != null ? packetType.getId() : -1;
        this.inputBuffer = inputBuffer;
        this.userConnection = userConnection;
    }

    public <T> T get(Type<T> type, int index) throws InformativeException {
        int currentIndex = 0;
        for (PacketValue<?> packetValue : this.packetValues) {
            if (packetValue.type() != type) continue;
            if (currentIndex == index) {
                return (T)packetValue.value();
            }
            ++currentIndex;
        }
        throw this.createInformativeException(new ArrayIndexOutOfBoundsException("Could not find type " + type.getTypeName() + " at " + index), type, index);
    }

    public boolean is(Type type, int index) {
        int currentIndex = 0;
        for (PacketValue<?> packetValue : this.packetValues) {
            if (packetValue.type() != type) continue;
            if (currentIndex == index) {
                return true;
            }
            ++currentIndex;
        }
        return false;
    }

    public boolean isReadable(Type type, int index) {
        int currentIndex = 0;
        for (PacketValue<?> packetValue : this.readableObjects) {
            if (packetValue.type().getBaseClass() != type.getBaseClass()) continue;
            if (currentIndex == index) {
                return true;
            }
            ++currentIndex;
        }
        return false;
    }

    public <T> void set(Type<T> type, int index, @Nullable T value) throws InformativeException {
        int currentIndex = 0;
        for (PacketValue<?> packetValue : this.packetValues) {
            if (packetValue.type() != type) continue;
            if (currentIndex == index) {
                packetValue.setValue(value);
                return;
            }
            ++currentIndex;
        }
        throw this.createInformativeException(new ArrayIndexOutOfBoundsException("Could not find type " + type.getTypeName() + " at " + index), type, index);
    }

    public <T> T read(Type<T> type) {
        return this.readableObjects.isEmpty() ? this.readFromBuffer(type) : this.pollReadableObject(type).value;
    }

    private <T> T readFromBuffer(Type<T> type) {
        Preconditions.checkNotNull((Object)this.inputBuffer, (Object)"This packet does not have an input buffer.");
        try {
            return (T)type.read(this.inputBuffer);
        }
        catch (Exception e) {
            throw this.createInformativeException(e, type, this.packetValues.size() + 1);
        }
    }

    private <T> PacketValue<T> pollReadableObject(Type<T> type) {
        PacketValue<?> readValue = this.readableObjects.poll();
        Type<?> readType = readValue.type();
        if (readType == type || type.getBaseClass() == readType.getBaseClass() && type.getOutputClass() == readType.getOutputClass()) {
            return readValue;
        }
        throw this.createInformativeException(new IOException("Unable to read type " + type.getTypeName() + ", found " + readValue.type().getTypeName()), type, this.readableObjects.size());
    }

    public <T> void write(Type<T> type, T value) {
        this.packetValues.add(new PacketValue<T>(type, value));
    }

    private <T> @Nullable T attemptTransform(Type<T> expectedType, @Nullable Object value) {
        if (value != null && !expectedType.getOutputClass().isAssignableFrom(value.getClass())) {
            if (expectedType instanceof TypeConverter) {
                return (T)((TypeConverter)expectedType).from(value);
            }
            Via.getPlatform().getLogger().warning("Possible type mismatch: " + value.getClass().getName() + " -> " + expectedType.getOutputClass());
        }
        return (T)value;
    }

    public <T> T passthrough(Type<T> type) throws InformativeException {
        if (this.readableObjects.isEmpty()) {
            T value = this.readFromBuffer(type);
            this.packetValues.add(new PacketValue<T>(type, value));
            return value;
        }
        PacketValue<T> value = this.pollReadableObject(type);
        this.packetValues.add(value);
        return value.value;
    }

    public <T> T passthroughAndMap(Type<?> type, Type<T> mappedType) throws InformativeException {
        if (type == mappedType) {
            return this.passthrough(mappedType);
        }
        Object value = this.read(type);
        T mappedValue = this.attemptTransform(mappedType, value);
        this.write(mappedType, mappedValue);
        return mappedValue;
    }

    public void passthroughAll() throws InformativeException {
        this.packetValues.addAll(this.readableObjects);
        this.readableObjects.clear();
        if (this.inputBuffer.isReadable()) {
            this.passthrough(Types.REMAINING_BYTES);
        }
    }

    public void writeToBuffer(ByteBuf buffer) throws InformativeException {
        if (this.id != -1) {
            Types.VAR_INT.writePrimitive(buffer, this.id);
        }
        if (!this.readableObjects.isEmpty()) {
            this.packetValues.addAll(this.readableObjects);
            this.readableObjects.clear();
        }
        for (int i = 0; i < this.packetValues.size(); ++i) {
            PacketValue<?> packetValue = this.packetValues.get(i);
            try {
                packetValue.write(buffer);
                continue;
            }
            catch (Exception e) {
                throw this.createInformativeException(e, packetValue.type(), i);
            }
        }
        this.writeRemaining(buffer);
    }

    private InformativeException createInformativeException(Exception cause, Type<?> type, int index) {
        return new InformativeException((Throwable)cause).set("Index", (Object)index).set("Type", (Object)type.getTypeName()).set("Packet ID", (Object)this.id).set("Packet Type", (Object)this.packetType).set("Data", this.packetValues);
    }

    public void clearInputBuffer() {
        if (this.inputBuffer != null) {
            this.inputBuffer.clear();
        }
        this.readableObjects.clear();
    }

    public void clearPacket() {
        this.clearInputBuffer();
        this.packetValues.clear();
    }

    private void writeRemaining(ByteBuf output) {
        if (this.inputBuffer != null) {
            output.writeBytes(this.inputBuffer);
        }
    }

    public void send(Class<? extends Protocol> protocol, boolean skipCurrentPipeline) throws InformativeException {
        this.send0(protocol, skipCurrentPipeline, true);
    }

    public void scheduleSend(Class<? extends Protocol> protocol, boolean skipCurrentPipeline) throws InformativeException {
        this.send0(protocol, skipCurrentPipeline, false);
    }

    private void send0(Class<? extends Protocol> protocol, boolean skipCurrentPipeline, boolean currentThread) throws InformativeException {
        if (this.isCancelled()) {
            return;
        }
        UserConnection connection = this.user();
        if (currentThread) {
            this.sendNow(protocol, skipCurrentPipeline);
        } else {
            connection.getChannel().eventLoop().submit(() -> this.sendNow(protocol, skipCurrentPipeline));
        }
    }

    private void sendNow(Class<? extends Protocol> protocol, boolean skipCurrentPipeline) throws InformativeException {
        block4: {
            try {
                ByteBuf output = this.constructPacket(protocol, skipCurrentPipeline, Direction.CLIENTBOUND);
                this.user().sendRawPacket(output);
            }
            catch (InformativeException e) {
                throw e;
            }
            catch (CancelException e) {
            }
            catch (Exception e) {
                if (PipelineUtil.containsCause((Throwable)e, CancelException.class)) break block4;
                throw new InformativeException((Throwable)e);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private ByteBuf constructPacket(@Nullable Class<? extends Protocol> protocolClass, boolean skipCurrentPipeline, Direction direction) throws InformativeException, CancelException {
        this.resetReader();
        ProtocolInfo protocolInfo = this.user().getProtocolInfo();
        List protocols = protocolInfo.getPipeline().pipes(protocolClass, skipCurrentPipeline, direction);
        this.apply(direction, protocolInfo.getState(direction), protocols);
        ByteBuf output = this.inputBuffer == null ? this.user().getChannel().alloc().buffer() : this.inputBuffer.alloc().buffer();
        try {
            this.writeToBuffer(output);
            ByteBuf byteBuf = output.retain();
            return byteBuf;
        }
        finally {
            output.release();
        }
    }

    public ChannelFuture sendFuture(Class<? extends Protocol> protocolClass) throws InformativeException {
        if (!this.isCancelled()) {
            ByteBuf output;
            try {
                output = this.constructPacket(protocolClass, true, Direction.CLIENTBOUND);
            }
            catch (CancelException e) {
                return this.user().getChannel().newFailedFuture((Throwable)new RuntimeException("Cancelled packet"));
            }
            return this.user().sendRawPacketFuture(output);
        }
        return this.cancelledFuture();
    }

    public void sendRaw() throws InformativeException {
        this.sendRaw(true);
    }

    public ChannelFuture sendFutureRaw() throws InformativeException {
        if (this.isCancelled()) {
            return this.cancelledFuture();
        }
        ByteBuf output = this.inputBuffer == null ? this.user().getChannel().alloc().buffer() : this.inputBuffer.alloc().buffer();
        try {
            this.writeToBuffer(output);
            ChannelFuture channelFuture = this.user().sendRawPacketFuture(output.retain());
            return channelFuture;
        }
        finally {
            output.release();
        }
    }

    public void scheduleSendRaw() throws InformativeException {
        this.sendRaw(false);
    }

    private void sendRaw(boolean currentThread) throws InformativeException {
        if (this.isCancelled()) {
            return;
        }
        ByteBuf output = this.inputBuffer == null ? this.user().getChannel().alloc().buffer() : this.inputBuffer.alloc().buffer();
        try {
            this.writeToBuffer(output);
            if (currentThread) {
                this.user().sendRawPacket(output.retain());
            } else {
                this.user().scheduleSendRawPacket(output.retain());
            }
        }
        finally {
            output.release();
        }
    }

    private ChannelFuture cancelledFuture() {
        return this.user().getChannel().newFailedFuture((Throwable)new RuntimeException("Tried to send cancelled packet"));
    }

    public PacketWrapperImpl create(int packetId) {
        return new PacketWrapperImpl(packetId, null, this.user());
    }

    public PacketWrapperImpl create(int packetId, PacketHandler handler) throws InformativeException {
        PacketWrapperImpl wrapper = this.create(packetId);
        handler.handle((PacketWrapper)wrapper);
        return wrapper;
    }

    public void apply(Direction direction, State state, List<Protocol> pipeline) throws InformativeException, CancelException {
        int size = pipeline.size();
        for (int i = 0; i < size; ++i) {
            Protocol protocol = pipeline.get(i);
            protocol.transform(direction, state, (PacketWrapper)this);
            this.resetReader();
            if (this.packetType == null) continue;
            state = this.packetType.state();
        }
    }

    public boolean isCancelled() {
        return !this.send;
    }

    public void setCancelled(boolean cancel) {
        this.send = !cancel;
    }

    public UserConnection user() {
        return this.userConnection;
    }

    public void resetReader() {
        for (int i = this.packetValues.size() - 1; i >= 0; --i) {
            this.readableObjects.addFirst(this.packetValues.get(i));
        }
        this.packetValues.clear();
    }

    public void sendToServerRaw() throws InformativeException {
        this.sendToServerRaw(true);
    }

    public void scheduleSendToServerRaw() throws InformativeException {
        this.sendToServerRaw(false);
    }

    private void sendToServerRaw(boolean currentThread) throws InformativeException {
        if (this.isCancelled()) {
            return;
        }
        ByteBuf output = this.inputBuffer == null ? this.user().getChannel().alloc().buffer() : this.inputBuffer.alloc().buffer();
        try {
            this.writeToBuffer(output);
            if (currentThread) {
                this.user().sendRawPacketToServer(output.retain());
            } else {
                this.user().scheduleSendRawPacketToServer(output.retain());
            }
        }
        finally {
            output.release();
        }
    }

    public void sendToServer(Class<? extends Protocol> protocol, boolean skipCurrentPipeline) throws InformativeException {
        this.sendToServer0(protocol, skipCurrentPipeline, true);
    }

    public void scheduleSendToServer(Class<? extends Protocol> protocol, boolean skipCurrentPipeline) throws InformativeException {
        this.sendToServer0(protocol, skipCurrentPipeline, false);
    }

    private void sendToServer0(Class<? extends Protocol> protocol, boolean skipCurrentPipeline, boolean currentThread) throws InformativeException {
        if (this.isCancelled()) {
            return;
        }
        UserConnection connection = this.user();
        if (currentThread) {
            block6: {
                try {
                    ByteBuf output = this.constructPacket(protocol, skipCurrentPipeline, Direction.SERVERBOUND);
                    connection.sendRawPacketToServer(output);
                }
                catch (InformativeException e) {
                    throw e;
                }
                catch (CancelException e) {
                }
                catch (Exception e) {
                    if (PipelineUtil.containsCause((Throwable)e, CancelException.class)) break block6;
                    throw new InformativeException((Throwable)e);
                }
            }
            return;
        }
        connection.getChannel().eventLoop().submit(() -> {
            block4: {
                try {
                    ByteBuf output = this.constructPacket(protocol, skipCurrentPipeline, Direction.SERVERBOUND);
                    connection.sendRawPacketToServer(output);
                }
                catch (InformativeException e) {
                    throw e;
                }
                catch (CancelException e) {
                }
                catch (Exception e) {
                    if (PipelineUtil.containsCause((Throwable)e, CancelException.class)) break block4;
                    throw new InformativeException((Throwable)e);
                }
            }
        });
    }

    public @Nullable PacketType getPacketType() {
        return this.packetType;
    }

    public void setPacketType(PacketType packetType) {
        this.packetType = packetType;
        this.id = packetType != null ? packetType.getId() : -1;
    }

    public int getId() {
        return this.id;
    }

    @Deprecated
    public void setId(int id) {
        this.packetType = null;
        this.id = id;
    }

    public @Nullable ByteBuf getInputBuffer() {
        return this.inputBuffer;
    }

    public String toString() {
        return "PacketWrapper{type=" + this.packetType + ", id=" + this.id + ", values=" + this.packetValues + ", readable=" + this.readableObjects + "}";
    }

    public boolean areStoredPacketValuesEmpty() {
        return this.packetValues.isEmpty() && this.readableObjects.isEmpty();
    }

    public void writeProcessedValues(ByteBuf buffer) throws InformativeException {
        if (this.id != -1) {
            Types.VAR_INT.writePrimitive(buffer, this.id);
        }
        if (!this.readableObjects.isEmpty()) {
            this.packetValues.addAll(this.readableObjects);
            this.readableObjects.clear();
        }
        for (int i = 0; i < this.packetValues.size(); ++i) {
            PacketValue<?> packetValue = this.packetValues.get(i);
            try {
                packetValue.write(buffer);
                continue;
            }
            catch (Exception e) {
                throw this.createInformativeException(e, packetValue.type(), i);
            }
        }
    }

    public static final class PacketValue<T> {
        private final Type<T> type;
        private T value;

        private PacketValue(Type<T> type, @Nullable T value) {
            this.type = type;
            this.value = value;
        }

        public Type<T> type() {
            return this.type;
        }

        public @Nullable Object value() {
            return this.value;
        }

        public void write(ByteBuf buffer) throws Exception {
            this.type.write(buffer, this.value);
        }

        public void setValue(@Nullable T value) {
            this.value = value;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            PacketValue that = (PacketValue)o;
            if (!this.type.equals(that.type)) {
                return false;
            }
            return Objects.equals(this.value, that.value);
        }

        public int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }

        public String toString() {
            return "{" + String.valueOf(this.type) + ": " + ArrayUtil.toString(this.value) + "}";
        }
    }
}

