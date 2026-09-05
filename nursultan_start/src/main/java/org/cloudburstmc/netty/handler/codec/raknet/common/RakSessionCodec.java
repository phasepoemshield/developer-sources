/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.base.bedrock.IRakSessionCodec
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelDuplexHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPromise
 *  io.netty.util.ReferenceCountUtil
 *  io.netty.util.collection.IntObjectHashMap
 *  io.netty.util.collection.IntObjectMap
 *  io.netty.util.collection.IntObjectMap$PrimitiveEntry
 *  io.netty.util.concurrent.ScheduledFuture
 *  io.netty.util.internal.logging.InternalLogger
 *  io.netty.util.internal.logging.InternalLoggerFactory
 *  org.cloudburstmc.netty.channel.raknet.RakChannel
 *  org.cloudburstmc.netty.channel.raknet.RakDisconnectReason
 *  org.cloudburstmc.netty.channel.raknet.RakPriority
 *  org.cloudburstmc.netty.channel.raknet.RakReliability
 *  org.cloudburstmc.netty.channel.raknet.RakSlidingWindow
 *  org.cloudburstmc.netty.channel.raknet.RakState
 *  org.cloudburstmc.netty.channel.raknet.config.RakChannelMetrics
 *  org.cloudburstmc.netty.channel.raknet.config.RakChannelOption
 *  org.cloudburstmc.netty.channel.raknet.packet.EncapsulatedPacket
 *  org.cloudburstmc.netty.channel.raknet.packet.RakDatagramPacket
 *  org.cloudburstmc.netty.channel.raknet.packet.RakMessage
 *  org.cloudburstmc.netty.handler.codec.raknet.common.RakSessionCodec$1
 *  org.cloudburstmc.netty.util.BitQueue
 *  org.cloudburstmc.netty.util.FastBinaryMinHeap
 *  org.cloudburstmc.netty.util.IntRange
 *  org.cloudburstmc.netty.util.RakUtils
 *  org.cloudburstmc.netty.util.RoundRobinArray
 *  org.cloudburstmc.netty.util.SplitPacketHelper
 */
package org.cloudburstmc.netty.handler.codec.raknet.common;

import com.viaversion.viafabricplus.injection.access.base.bedrock.IRakSessionCodec;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.util.ReferenceCountUtil;
import io.netty.util.collection.IntObjectHashMap;
import io.netty.util.collection.IntObjectMap;
import io.netty.util.concurrent.ScheduledFuture;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import org.cloudburstmc.netty.channel.raknet.RakChannel;
import org.cloudburstmc.netty.channel.raknet.RakDisconnectReason;
import org.cloudburstmc.netty.channel.raknet.RakPriority;
import org.cloudburstmc.netty.channel.raknet.RakReliability;
import org.cloudburstmc.netty.channel.raknet.RakSlidingWindow;
import org.cloudburstmc.netty.channel.raknet.RakState;
import org.cloudburstmc.netty.channel.raknet.config.RakChannelMetrics;
import org.cloudburstmc.netty.channel.raknet.config.RakChannelOption;
import org.cloudburstmc.netty.channel.raknet.packet.EncapsulatedPacket;
import org.cloudburstmc.netty.channel.raknet.packet.RakDatagramPacket;
import org.cloudburstmc.netty.channel.raknet.packet.RakMessage;
import org.cloudburstmc.netty.handler.codec.raknet.common.RakSessionCodec;
import org.cloudburstmc.netty.util.BitQueue;
import org.cloudburstmc.netty.util.FastBinaryMinHeap;
import org.cloudburstmc.netty.util.IntRange;
import org.cloudburstmc.netty.util.RakUtils;
import org.cloudburstmc.netty.util.RoundRobinArray;
import org.cloudburstmc.netty.util.SplitPacketHelper;

public class RakSessionCodec
extends ChannelDuplexHandler
implements IRakSessionCodec {
    private static final InternalLogger log = InternalLoggerFactory.getInstance(RakSessionCodec.class);
    public static final String NAME = "rak-session-codec";
    private final RakChannel channel;
    private ScheduledFuture<?> tickFuture;
    private volatile RakState state;
    private volatile long lastTouched = System.currentTimeMillis();
    private volatile long lastFlush;
    private RakSlidingWindow slidingWindow;
    private int splitIndex;
    private int datagramReadIndex;
    int datagramWriteIndex;
    private int reliabilityReadIndex;
    private int reliabilityWriteIndex;
    private int[] orderReadIndex;
    private int[] orderWriteIndex;
    private RoundRobinArray<SplitPacketHelper> splitPackets;
    private BitQueue reliableDatagramQueue;
    private FastBinaryMinHeap<EncapsulatedPacket> outgoingPackets;
    private long[] outgoingPacketNextWeights;
    private FastBinaryMinHeap<EncapsulatedPacket>[] orderingHeaps;
    long currentPingTime = -1L;
    private long lastPingTime = -1L;
    private long lastPongTime = -1L;
    private IntObjectMap<RakDatagramPacket> sentDatagrams;
    private Queue<IntRange> incomingAcks;
    private Queue<IntRange> incomingNaks;
    private Deque<IntRange> outgoingAcks;
    private Queue<IntRange> outgoingNaks;
    private long lastMinWeight;

    public RakSessionCodec(RakChannel rakChannel) {
        this.channel = rakChannel;
        this.setState(RakState.UNCONNECTED);
    }

    public void flush(ChannelHandlerContext channelHandlerContext) throws Exception {
        if (!this.channel.config().isAutoFlush()) {
            this.internalFlush(channelHandlerContext);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) {
        if (!this.channel.parent().eventLoop().inEventLoop()) {
            log.error("Tried to write packet from wrong thread: {}", (Object)Thread.currentThread().getName(), (Object)new Throwable());
            Object object2 = object;
            this.channel.parent().eventLoop().execute(() -> this.write(channelHandlerContext, object2, channelPromise));
            return;
        }
        if (object instanceof ByteBuf) {
            object = new RakMessage((ByteBuf)object);
        } else if (!(object instanceof RakMessage)) {
            throw new IllegalArgumentException("Message must be a ByteBuf or RakMessage");
        }
        try {
            this.send(channelHandlerContext, (RakMessage)object);
            channelPromise.setSuccess(null);
        }
        finally {
            ReferenceCountUtil.release((Object)object);
        }
    }

    private ChannelHandlerContext ctx() {
        return this.channel.rakPipeline().context(NAME);
    }

    private void setState(RakState rakState) {
        if (this.state == rakState) {
            return;
        }
        this.state = rakState;
        RakChannelMetrics rakChannelMetrics = this.getMetrics();
        if (rakChannelMetrics != null) {
            rakChannelMetrics.stateChange(rakState);
        }
    }

    public void close(RakDisconnectReason rakDisconnectReason) {
        if (this.state == RakState.DISCONNECTING) {
            return;
        }
        this.setState(RakState.DISCONNECTING);
        if (log.isDebugEnabled()) {
            log.debug("Closing RakNet Session ({} => {}) due to {}", new Object[]{this.channel.localAddress(), this.getRemoteAddress(), rakDisconnectReason});
        }
        this.channel.pipeline().fireUserEventTriggered((Object)rakDisconnectReason).close();
    }

    public Channel getChannel() {
        return this.channel;
    }

    public InetSocketAddress getRemoteAddress() {
        return (InetSocketAddress)this.channel.remoteAddress();
    }

    private void onTick() {
        long l = System.currentTimeMillis();
        if (this.state == RakState.UNCONNECTED) {
            if (this.isTimedOut(l)) {
                this.close(RakDisconnectReason.TIMED_OUT);
            }
            return;
        }
        if (this.isTimedOut(l)) {
            this.disconnect(RakDisconnectReason.TIMED_OUT);
            return;
        }
        ChannelHandlerContext channelHandlerContext = this.ctx();
        this.writePing(channelHandlerContext, l);
        this.internalFlush(channelHandlerContext);
    }

    private void touch() {
        this.checkForClosed();
        this.lastTouched = System.currentTimeMillis();
    }

    private void send(ChannelHandlerContext channelHandlerContext, RakMessage rakMessage) {
        if (this.state == RakState.UNCONNECTED) {
            throw new IllegalStateException("Can not send RakMessage to inactive channel");
        }
        if (rakMessage.content().getUnsignedByte(rakMessage.content().readerIndex()) == 192) {
            throw new IllegalArgumentException();
        }
        RakChannelMetrics rakChannelMetrics = this.getMetrics();
        if (rakChannelMetrics != null) {
            rakChannelMetrics.encapsulatedOut(1);
        }
        Object[] objectArray = this.createEncapsulated(rakMessage);
        if (rakMessage.priority() == RakPriority.IMMEDIATE) {
            this.sendImmediate(channelHandlerContext, (EncapsulatedPacket[])objectArray);
            return;
        }
        long l = this.getNextWeight(rakMessage.priority());
        if (objectArray.length == 1) {
            this.outgoingPackets.insert(l, objectArray[0]);
        } else {
            this.outgoingPackets.insertSeries(l, objectArray);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        try {
            if (!(object instanceof RakDatagramPacket)) {
                return;
            }
            RakDatagramPacket rakDatagramPacket = (RakDatagramPacket)object;
            if (this.state == RakState.UNCONNECTED) {
                log.debug("{} received message from inactive channel: {}", (Object)this.getRemoteAddress(), (Object)rakDatagramPacket);
            } else {
                this.handleDatagram(channelHandlerContext, rakDatagramPacket);
            }
        }
        finally {
            ReferenceCountUtil.release((Object)object);
        }
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        int n;
        this.setState(RakState.CONNECTED);
        int n2 = this.getMtu();
        this.slidingWindow = new RakSlidingWindow(n2);
        this.outgoingPacketNextWeights = new long[4];
        this.initHeapWeights();
        int n3 = (Integer)this.channel.config().getOption(RakChannelOption.RAK_ORDERING_CHANNELS);
        this.orderReadIndex = new int[n3];
        this.orderWriteIndex = new int[n3];
        this.orderingHeaps = new FastBinaryMinHeap[n3];
        for (n = 0; n < n3; ++n) {
            this.orderingHeaps[n] = new FastBinaryMinHeap(64);
        }
        this.outgoingPackets = new FastBinaryMinHeap(8);
        this.sentDatagrams = new IntObjectHashMap();
        this.incomingAcks = new ArrayDeque<IntRange>();
        this.incomingNaks = new ArrayDeque<IntRange>();
        this.outgoingAcks = new ArrayDeque<IntRange>();
        this.outgoingNaks = new ArrayDeque<IntRange>();
        this.reliableDatagramQueue = new BitQueue(512);
        this.splitPackets = new RoundRobinArray(256);
        n = this.channel.config().isAutoFlush() ? 1 : 0;
        int n4 = n != 0 ? this.channel.config().getFlushInterval() : 10;
        this.tickFuture = channelHandlerContext.channel().eventLoop().scheduleAtFixedRate(this::tryTick, 0L, (long)n4, TimeUnit.MILLISECONDS);
        channelHandlerContext.fireChannelActive();
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
        FastBinaryMinHeap<EncapsulatedPacket> fastBinaryMinHeap2;
        super.channelInactive(channelHandlerContext);
        if (this.state == RakState.DISCONNECTED && this.tickFuture == null) {
            return;
        }
        this.setState(RakState.DISCONNECTED);
        this.tickFuture.cancel(false);
        this.tickFuture = null;
        for (FastBinaryMinHeap<EncapsulatedPacket> fastBinaryMinHeap2 : this.splitPackets) {
            if (fastBinaryMinHeap2 == null) continue;
            fastBinaryMinHeap2.release();
        }
        this.splitPackets = null;
        for (FastBinaryMinHeap<EncapsulatedPacket> fastBinaryMinHeap2 : this.sentDatagrams.values()) {
            fastBinaryMinHeap2.release();
        }
        this.sentDatagrams = null;
        FastBinaryMinHeap<EncapsulatedPacket> fastBinaryMinHeap3 = this.orderingHeaps;
        this.orderingHeaps = null;
        if (fastBinaryMinHeap3 != null) {
            for (FastBinaryMinHeap<EncapsulatedPacket> fastBinaryMinHeap4 : fastBinaryMinHeap3) {
                EncapsulatedPacket encapsulatedPacket;
                while ((encapsulatedPacket = (EncapsulatedPacket)fastBinaryMinHeap4.poll()) != null) {
                    encapsulatedPacket.release();
                }
                fastBinaryMinHeap4.release();
            }
        }
        fastBinaryMinHeap2 = this.outgoingPackets;
        this.outgoingPackets = null;
        if (fastBinaryMinHeap2 != null) {
            EncapsulatedPacket encapsulatedPacket;
            while ((encapsulatedPacket = (EncapsulatedPacket)fastBinaryMinHeap2.poll()) != null) {
                encapsulatedPacket.release();
            }
            fastBinaryMinHeap2.release();
        }
        if (log.isTraceEnabled()) {
            log.trace("RakNet Session ({} => {}) closed!", (Object)this.channel.localAddress(), (Object)this.getRemoteAddress());
        }
    }

    public void disconnect() {
        this.disconnect(RakDisconnectReason.DISCONNECTED);
    }

    public void disconnect(RakDisconnectReason rakDisconnectReason) {
        if (this.channel.parent().eventLoop().inEventLoop()) {
            this.disconnect0(rakDisconnectReason);
        } else {
            this.channel.parent().eventLoop().execute(() -> this.disconnect0(rakDisconnectReason));
        }
    }

    public void disconnect(ChannelHandlerContext channelHandlerContext, ChannelPromise channelPromise) throws Exception {
        this.disconnect0(RakDisconnectReason.DISCONNECTED).addListener(future -> {
            if (future.cause() == null) {
                channelPromise.trySuccess();
            } else {
                channelPromise.tryFailure(future.cause());
            }
        });
    }

    public boolean isClosed() {
        return this.state == RakState.UNCONNECTED;
    }

    public int viaFabricPlus$SentDatagrams() {
        return this.sentDatagrams.size();
    }

    public int viaFabricPlus$getOutgoingPackets() {
        return this.outgoingPackets.size();
    }

    public double getRTT() {
        return this.slidingWindow.getRTT();
    }

    public long getPing() {
        return this.lastPongTime - this.lastPingTime;
    }

    public int getMtu() {
        return this.channel.config().getMtu() - 8 - (this.getRemoteAddress().getAddress() instanceof Inet6Address ? 40 : 20);
    }

    private void tryTick() {
        try {
            this.onTick();
        }
        catch (Throwable throwable) {
            log.error("[{}] Error while ticking RakSessionCodec state={} channelActive={}", new Object[]{this.getRemoteAddress(), this.state, this.channel.isActive(), throwable});
            this.channel.close();
        }
    }

    public boolean isTimedOut() {
        return this.isTimedOut(System.currentTimeMillis());
    }

    public boolean isTimedOut(long l) {
        return l - this.lastTouched >= (Long)this.channel.config().getOption(RakChannelOption.RAK_SESSION_TIMEOUT);
    }

    void writePing(ChannelHandlerContext channelHandlerContext, long l) {
        if (this.currentPingTime + 2000L < l && this.datagramWriteIndex > 1) {
            ByteBuf byteBuf = channelHandlerContext.alloc().ioBuffer(9);
            byteBuf.writeByte(0);
            byteBuf.writeLong(l);
            this.currentPingTime = l;
            this.write(channelHandlerContext, new RakMessage(byteBuf, RakReliability.UNRELIABLE, RakPriority.IMMEDIATE), channelHandlerContext.voidPromise());
        }
    }

    public RakChannelMetrics getMetrics() {
        return this.channel.config().getMetrics();
    }

    public boolean isStale(long l) {
        return l - this.lastTouched >= 5000L;
    }

    public boolean isStale() {
        return this.isStale(System.currentTimeMillis());
    }

    private int sendStaleDatagrams(ChannelHandlerContext channelHandlerContext, long l) {
        if (this.sentDatagrams.isEmpty()) {
            return 0;
        }
        boolean bl = false;
        int n = 0;
        int n2 = this.slidingWindow.getRetransmissionBandwidth();
        IntObjectHashMap intObjectHashMap = new IntObjectHashMap();
        Iterator iterator = this.sentDatagrams.values().iterator();
        while (iterator.hasNext()) {
            RakDatagramPacket rakDatagramPacket = (RakDatagramPacket)iterator.next();
            if (rakDatagramPacket.getNextSend() > l) continue;
            int n3 = rakDatagramPacket.getSize();
            if (n2 < n3) break;
            n2 -= n3;
            if (!bl) {
                bl = true;
            }
            if (log.isTraceEnabled()) {
                log.trace("Stale datagram {} from {}", (Object)rakDatagramPacket.getSequenceIndex(), (Object)this.getRemoteAddress());
            }
            ++n;
            iterator.remove();
            this.sendDatagram(channelHandlerContext, rakDatagramPacket, l, (IntObjectMap<RakDatagramPacket>)intObjectHashMap);
        }
        for (IntObjectMap.PrimitiveEntry primitiveEntry : intObjectHashMap.entries()) {
            this.sentDatagrams.put(primitiveEntry.key(), primitiveEntry.value());
        }
        if (bl) {
            this.slidingWindow.onResend((long)this.datagramWriteIndex);
        }
        return n;
    }

    private void sendDatagrams(ChannelHandlerContext channelHandlerContext, long l, int n) {
        EncapsulatedPacket encapsulatedPacket;
        int n2;
        if (this.outgoingPackets.isEmpty()) {
            return;
        }
        RakDatagramPacket rakDatagramPacket = this.createDatagramPacket();
        rakDatagramPacket.setSendTime(l);
        for (int i = this.slidingWindow.getTransmissionBandwidth(); (encapsulatedPacket = (EncapsulatedPacket)this.outgoingPackets.peek()) != null && i >= (n2 = encapsulatedPacket.getSize()); i -= n2) {
            this.outgoingPackets.remove();
            if (rakDatagramPacket.tryAddPacket(encapsulatedPacket, n)) continue;
            this.sendDatagram(channelHandlerContext, rakDatagramPacket, l, this.sentDatagrams);
            rakDatagramPacket = this.createDatagramPacket();
            rakDatagramPacket.setSendTime(l);
            if (rakDatagramPacket.tryAddPacket(encapsulatedPacket, n)) continue;
            throw new IllegalArgumentException("Packet too large to fit in MTU (size: " + encapsulatedPacket.getSize() + ", MTU: " + n + ")");
        }
        if (!rakDatagramPacket.getPackets().isEmpty()) {
            this.sendDatagram(channelHandlerContext, rakDatagramPacket, l, this.sentDatagrams);
        }
    }

    private EncapsulatedPacket[] createEncapsulated(RakMessage rakMessage) {
        ByteBuf[] byteBufArray;
        int n;
        int n2 = this.getMtu() - 28 - 4;
        int n3 = 0;
        RakReliability rakReliability = rakMessage.reliability();
        ByteBuf byteBuf = rakMessage.content();
        int n4 = rakMessage.channel();
        if (byteBuf.readableBytes() > n2) {
            switch (1.$SwitchMap$org$cloudburstmc$netty$channel$raknet$RakReliability[rakReliability.ordinal()]) {
                case 1: {
                    rakReliability = RakReliability.RELIABLE;
                    break;
                }
                case 2: {
                    rakReliability = RakReliability.RELIABLE_SEQUENCED;
                    break;
                }
                case 3: {
                    rakReliability = RakReliability.RELIABLE_WITH_ACK_RECEIPT;
                }
            }
            n = (byteBuf.readableBytes() - 1) / n2 + 1;
            byteBuf.retain(n);
            byteBufArray = new ByteBuf[n];
            for (int i = 0; i < n; ++i) {
                byteBufArray[i] = byteBuf.readSlice(Math.min(n2, byteBuf.readableBytes()));
            }
            if (byteBuf.isReadable()) {
                throw new IllegalStateException("Buffer still has bytes to read!");
            }
            n3 = this.splitIndex++;
        } else {
            byteBufArray = new ByteBuf[]{byteBuf.readRetainedSlice(byteBuf.readableBytes())};
        }
        n = 0;
        if (rakReliability.isOrdered()) {
            int n5 = n4;
            int n6 = this.orderWriteIndex[n5];
            this.orderWriteIndex[n5] = n6 + 1;
            n = n6;
        }
        EncapsulatedPacket[] encapsulatedPacketArray = new EncapsulatedPacket[byteBufArray.length];
        int n7 = byteBufArray.length;
        for (int i = 0; i < n7; ++i) {
            EncapsulatedPacket encapsulatedPacket = this.createEncapsulatedPacket();
            encapsulatedPacket.setBuffer(byteBufArray[i]);
            encapsulatedPacket.setOrderingChannel((short)n4);
            encapsulatedPacket.setOrderingIndex(n);
            encapsulatedPacket.setReliability(rakReliability);
            if (rakReliability.isReliable()) {
                encapsulatedPacket.setReliabilityIndex(this.reliabilityWriteIndex++);
            }
            if (n7 > 1) {
                encapsulatedPacket.setSplit(true);
                encapsulatedPacket.setPartIndex(i);
                encapsulatedPacket.setPartCount(n7);
                encapsulatedPacket.setPartId(n3);
            }
            encapsulatedPacketArray[i] = encapsulatedPacket;
        }
        return encapsulatedPacketArray;
    }

    private long getNextWeight(RakPriority rakPriority) {
        int n = rakPriority.ordinal();
        long l = this.outgoingPacketNextWeights[n];
        if (!this.outgoingPackets.isEmpty()) {
            if (l >= this.lastMinWeight) {
                l = this.lastMinWeight + (1L << n) * (long)n + (long)n;
                this.outgoingPacketNextWeights[n] = l + (1L << n) * (long)(n + 1) + (long)n;
            }
        } else {
            this.initHeapWeights();
        }
        this.lastMinWeight = l - (1L << n) * (long)n + (long)n;
        return l;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void handleDatagram(ChannelHandlerContext channelHandlerContext, RakDatagramPacket rakDatagramPacket) {
        int n;
        this.touch();
        RakChannelMetrics rakChannelMetrics = this.getMetrics();
        if (rakChannelMetrics != null) {
            rakChannelMetrics.rakDatagramsIn(1);
        }
        this.slidingWindow.onPacketReceived(rakDatagramPacket.getSendTime());
        int n2 = this.datagramReadIndex;
        if (n2 <= rakDatagramPacket.getSequenceIndex()) {
            this.datagramReadIndex = rakDatagramPacket.getSequenceIndex() + 1;
        }
        if ((n = rakDatagramPacket.getSequenceIndex() - n2) > 0) {
            this.outgoingNaks.offer(new IntRange(rakDatagramPacket.getSequenceIndex() - n, rakDatagramPacket.getSequenceIndex() - 1));
        }
        int n3 = rakDatagramPacket.getSequenceIndex();
        IntRange intRange = this.outgoingAcks.peekLast();
        if (intRange != null && intRange.end == n3 - 1) {
            intRange.end = n3;
        } else {
            this.outgoingAcks.offer(new IntRange(n3, n3));
        }
        for (EncapsulatedPacket encapsulatedPacket : rakDatagramPacket.getPackets()) {
            if (encapsulatedPacket.getReliability().isReliable()) {
                int n4 = encapsulatedPacket.getReliabilityIndex() - this.reliabilityReadIndex;
                if (n4 > 0) {
                    if (n4 < this.reliableDatagramQueue.size()) {
                        if (!this.reliableDatagramQueue.get(n4)) continue;
                        this.reliableDatagramQueue.set(n4, false);
                    } else {
                        int n5 = n4 - this.reliableDatagramQueue.size();
                        for (int i = 0; i < n5; ++i) {
                            this.reliableDatagramQueue.add(true);
                        }
                        this.reliableDatagramQueue.add(false);
                    }
                } else {
                    if (n4 != 0) continue;
                    ++this.reliabilityReadIndex;
                    if (!this.reliableDatagramQueue.isEmpty()) {
                        this.reliableDatagramQueue.poll();
                    }
                }
                while (!this.reliableDatagramQueue.isEmpty() && !this.reliableDatagramQueue.peek()) {
                    this.reliableDatagramQueue.poll();
                    ++this.reliabilityReadIndex;
                }
            }
            if (encapsulatedPacket.isSplit()) {
                EncapsulatedPacket encapsulatedPacket2 = this.getReassembledPacket(encapsulatedPacket, channelHandlerContext.alloc());
                if (encapsulatedPacket2 == null) continue;
                if (rakChannelMetrics != null) {
                    rakChannelMetrics.encapsulatedIn(1);
                }
                try {
                    this.checkForOrdered(channelHandlerContext, encapsulatedPacket2);
                    continue;
                }
                finally {
                    encapsulatedPacket2.release();
                    continue;
                }
            }
            if (rakChannelMetrics != null) {
                rakChannelMetrics.encapsulatedIn(1);
            }
            this.checkForOrdered(channelHandlerContext, encapsulatedPacket);
        }
    }

    private void checkForClosed() {
        if (this.state == RakState.UNCONNECTED) {
            throw new IllegalStateException("RakSession is closed!");
        }
    }

    private void initHeapWeights() {
        for (int i = 0; i < 4; ++i) {
            this.outgoingPacketNextWeights[i] = (1 << i) * i + i;
        }
    }

    private void internalFlush(ChannelHandlerContext channelHandlerContext) {
        ByteBuf byteBuf;
        long l = System.currentTimeMillis();
        if (this.lastFlush == l) {
            return;
        }
        this.lastFlush = l;
        this.handleIncomingAcknowledge(channelHandlerContext, l, this.incomingAcks, false);
        this.handleIncomingAcknowledge(channelHandlerContext, l, this.incomingNaks, true);
        int n = this.getMtu();
        int n2 = n - 4;
        int n3 = 0;
        int n4 = 0;
        while (!this.outgoingAcks.isEmpty()) {
            byteBuf = channelHandlerContext.alloc().ioBuffer(n2);
            byteBuf.writeByte(-64);
            n3 += RakUtils.writeAckEntries((ByteBuf)byteBuf, this.outgoingAcks, (int)(n2 - 1));
            channelHandlerContext.write((Object)byteBuf);
            this.slidingWindow.onSendAck();
        }
        while (!this.outgoingNaks.isEmpty()) {
            byteBuf = channelHandlerContext.alloc().ioBuffer(n2);
            byteBuf.writeByte(-96);
            n4 += RakUtils.writeAckEntries((ByteBuf)byteBuf, this.outgoingNaks, (int)(n2 - 1));
            channelHandlerContext.write((Object)byteBuf);
        }
        int n5 = this.sendStaleDatagrams(channelHandlerContext, l);
        this.sendDatagrams(channelHandlerContext, l, n);
        channelHandlerContext.flush();
        RakChannelMetrics rakChannelMetrics = this.getMetrics();
        if (rakChannelMetrics != null) {
            rakChannelMetrics.nackOut(n4);
            rakChannelMetrics.ackOut(n3);
            rakChannelMetrics.rakStaleDatagrams(n5);
        }
    }

    private void onIncomingNack(ChannelHandlerContext channelHandlerContext, RakDatagramPacket rakDatagramPacket, long l) {
        if (log.isTraceEnabled()) {
            log.trace("NAK'ed datagram {} from {}", (Object)rakDatagramPacket.getSequenceIndex(), (Object)this.getRemoteAddress());
        }
        this.slidingWindow.onNak();
        this.sendDatagram(channelHandlerContext, rakDatagramPacket, l, this.sentDatagrams);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void onIncomingAck(RakDatagramPacket rakDatagramPacket, long l) {
        try {
            this.slidingWindow.onAck(l, rakDatagramPacket, (long)this.datagramReadIndex);
        }
        finally {
            rakDatagramPacket.release();
        }
    }

    private ChannelPromise disconnect0(RakDisconnectReason rakDisconnectReason) {
        if (this.state == RakState.UNCONNECTED || this.state == RakState.DISCONNECTING) {
            return this.channel.voidPromise();
        }
        this.setState(RakState.DISCONNECTING);
        if (log.isDebugEnabled()) {
            log.debug("Disconnecting RakNet Session ({} => {}) due to {}", new Object[]{this.channel.localAddress(), this.getRemoteAddress(), rakDisconnectReason});
        }
        ChannelHandlerContext channelHandlerContext = this.ctx();
        ByteBuf byteBuf = channelHandlerContext.alloc().ioBuffer(1);
        byteBuf.writeByte(21);
        RakMessage rakMessage = new RakMessage(byteBuf, RakReliability.RELIABLE, RakPriority.IMMEDIATE);
        ChannelPromise channelPromise = channelHandlerContext.newPromise();
        channelPromise.addListener(channelFuture -> this.channel.pipeline().fireUserEventTriggered((Object)rakDisconnectReason).close());
        this.write(channelHandlerContext, rakMessage, channelPromise);
        return channelPromise;
    }

    private void sendImmediate(ChannelHandlerContext channelHandlerContext, EncapsulatedPacket[] encapsulatedPacketArray) {
        long l = System.currentTimeMillis();
        for (EncapsulatedPacket encapsulatedPacket : encapsulatedPacketArray) {
            RakDatagramPacket rakDatagramPacket = this.createDatagramPacket();
            rakDatagramPacket.setSendTime(l);
            if (!rakDatagramPacket.tryAddPacket(encapsulatedPacket, this.getMtu())) {
                throw new IllegalArgumentException("Packet too large to fit in MTU (size: " + encapsulatedPacket.getSize() + ", MTU: " + this.getMtu() + ")");
            }
            this.sendDatagram(channelHandlerContext, rakDatagramPacket, l, this.sentDatagrams);
        }
        channelHandlerContext.flush();
    }

    private void checkForOrdered(ChannelHandlerContext channelHandlerContext, EncapsulatedPacket encapsulatedPacket) {
        if (encapsulatedPacket.getReliability().isOrdered()) {
            this.onOrderedReceived(channelHandlerContext, encapsulatedPacket);
        } else {
            channelHandlerContext.fireChannelRead((Object)encapsulatedPacket.retain());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void onOrderedReceived(ChannelHandlerContext channelHandlerContext, EncapsulatedPacket encapsulatedPacket) {
        EncapsulatedPacket encapsulatedPacket2;
        FastBinaryMinHeap<EncapsulatedPacket> fastBinaryMinHeap = this.orderingHeaps[encapsulatedPacket.getOrderingChannel()];
        if (this.orderReadIndex[encapsulatedPacket.getOrderingChannel()] < encapsulatedPacket.getOrderingIndex()) {
            fastBinaryMinHeap.insert((long)encapsulatedPacket.getOrderingIndex(), (Object)encapsulatedPacket.retain());
            return;
        }
        if (this.orderReadIndex[encapsulatedPacket.getOrderingChannel()] > encapsulatedPacket.getOrderingIndex()) {
            return;
        }
        short s = encapsulatedPacket.getOrderingChannel();
        this.orderReadIndex[s] = this.orderReadIndex[s] + 1;
        channelHandlerContext.fireChannelRead((Object)encapsulatedPacket.retain());
        while ((encapsulatedPacket2 = (EncapsulatedPacket)fastBinaryMinHeap.peek()) != null && encapsulatedPacket2.getOrderingIndex() == this.orderReadIndex[encapsulatedPacket.getOrderingChannel()]) {
            try {
                fastBinaryMinHeap.remove();
                short s2 = encapsulatedPacket.getOrderingChannel();
                this.orderReadIndex[s2] = this.orderReadIndex[s2] + 1;
                channelHandlerContext.fireChannelRead((Object)encapsulatedPacket2.retain());
            }
            finally {
                encapsulatedPacket2.release();
            }
        }
    }

    EncapsulatedPacket createEncapsulatedPacket() {
        EncapsulatedPacket encapsulatedPacket = EncapsulatedPacket.newInstance();
        encapsulatedPacket.setNeedsBAS(true);
        return encapsulatedPacket;
    }

    public void recalculatePongTime(long l) {
        if (this.currentPingTime == l) {
            this.lastPingTime = this.currentPingTime;
            this.lastPongTime = System.currentTimeMillis();
        }
    }

    private EncapsulatedPacket getReassembledPacket(EncapsulatedPacket encapsulatedPacket, ByteBufAllocator byteBufAllocator) {
        EncapsulatedPacket encapsulatedPacket2;
        this.checkForClosed();
        SplitPacketHelper splitPacketHelper = (SplitPacketHelper)this.splitPackets.get(encapsulatedPacket.getPartId());
        if (splitPacketHelper == null) {
            splitPacketHelper = new SplitPacketHelper((long)encapsulatedPacket.getPartCount());
            this.splitPackets.set(encapsulatedPacket.getPartId(), (Object)splitPacketHelper);
        }
        if ((encapsulatedPacket2 = splitPacketHelper.add(encapsulatedPacket, byteBufAllocator)) != null) {
            this.splitPackets.remove(encapsulatedPacket.getPartId(), (Object)splitPacketHelper);
        }
        return encapsulatedPacket2;
    }

    private void handleIncomingAcknowledge(ChannelHandlerContext channelHandlerContext, long l, Queue<IntRange> queue, boolean bl) {
        IntRange intRange;
        if (queue.isEmpty()) {
            return;
        }
        while ((intRange = queue.poll()) != null) {
            for (int i = intRange.start; i <= intRange.end; ++i) {
                RakDatagramPacket rakDatagramPacket = (RakDatagramPacket)this.sentDatagrams.remove(i);
                if (rakDatagramPacket == null) continue;
                if (bl) {
                    this.onIncomingNack(channelHandlerContext, rakDatagramPacket, l);
                    continue;
                }
                this.onIncomingAck(rakDatagramPacket, l);
            }
        }
    }

    protected Queue<IntRange> getAcknowledgeQueue(boolean bl) {
        return bl ? this.incomingNaks : this.incomingAcks;
    }

    RakDatagramPacket createDatagramPacket() {
        RakDatagramPacket rakDatagramPacket = RakDatagramPacket.newInstance();
        rakDatagramPacket.setFlag((byte)4);
        return rakDatagramPacket;
    }

    private void sendDatagram(ChannelHandlerContext channelHandlerContext, RakDatagramPacket rakDatagramPacket, long l, IntObjectMap<RakDatagramPacket> intObjectMap) {
        if (rakDatagramPacket.getPackets().isEmpty()) {
            throw new IllegalArgumentException("RakNetDatagram with no packets");
        }
        RakChannelMetrics rakChannelMetrics = this.getMetrics();
        if (rakChannelMetrics != null) {
            rakChannelMetrics.rakDatagramsOut(1);
        }
        int n = rakDatagramPacket.getSequenceIndex();
        rakDatagramPacket.setSequenceIndex(this.datagramWriteIndex++);
        for (EncapsulatedPacket encapsulatedPacket : rakDatagramPacket.getPackets()) {
            if (!encapsulatedPacket.getReliability().isReliable()) continue;
            rakDatagramPacket.setNextSend(l + this.slidingWindow.getRtoForRetransmission());
            if (n == -1) {
                this.slidingWindow.onReliableSend(rakDatagramPacket);
            }
            intObjectMap.put(rakDatagramPacket.getSequenceIndex(), (Object)rakDatagramPacket.retain());
            break;
        }
        channelHandlerContext.write((Object)rakDatagramPacket);
    }
}

