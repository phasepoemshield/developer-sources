/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers$1
 *  com.viaversion.viaversion.exception.InformativeException
 */
package com.viaversion.viaversion.api.protocol.remapper;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.TypeRemapper;
import com.viaversion.viaversion.api.protocol.remapper.ValueReader;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.protocol.remapper.ValueWriter;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.exception.InformativeException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Level;

public abstract class PacketHandlers
implements PacketHandler {
    private final List<PacketHandler> packetHandlers = new ArrayList<PacketHandler>();

    public <T> void create(Type<T> type, T value) {
        this.handler(wrapper -> wrapper.write(type, value));
    }

    public int handlersSize() {
        return this.packetHandlers.size();
    }

    static PacketHandler fromRemapper(List<PacketHandler> valueRemappers) {
        1 handlers = new /* Unavailable Anonymous Inner Class!! */;
        handlers.packetHandlers.addAll(valueRemappers);
        return handlers;
    }

    public void handlerSoftFail(PacketHandler handler) {
        this.packetHandlers.add(h -> {
            try {
                handler.handle(h);
            }
            catch (Exception e) {
                if (Via.getConfig().logOtherConversionWarnings()) {
                    Via.getPlatform().getLogger().log(Level.WARNING, "Failed to handle packet", e);
                }
                h.cancel();
            }
        });
    }

    protected PacketHandlers() {
        this.register();
    }

    public <T1, T2> void map(Type<T1> oldType, Type<T2> newType, final Function<T1, T2> transformer) {
        this.map(oldType, new ValueTransformer<T1, T2>(newType){

            @Override
            public T2 transform(PacketWrapper wrapper, T1 inputValue) {
                return transformer.apply(inputValue);
            }
        });
    }

    public void map(Type<?> oldType, Type<?> newType) {
        this.handler(wrapper -> wrapper.passthroughAndMap(oldType, newType));
    }

    public <T> void map(Type<T> type) {
        this.handler(wrapper -> wrapper.passthrough(type));
    }

    public <T> void map(ValueReader<T> inputReader, ValueWriter<T> outputWriter) {
        this.handler(wrapper -> outputWriter.write(wrapper, inputReader.read(wrapper)));
    }

    public <T1, T2> void map(Type<T1> oldType, ValueTransformer<T1, T2> transformer) {
        this.map(new TypeRemapper<T1>(oldType), transformer);
    }

    public <T1, T2> void map(ValueTransformer<T1, T2> transformer) {
        if (transformer.getInputType() == null) {
            throw new IllegalArgumentException("Use map(Type<T1>, ValueTransformer<T1, T2>) for value transformers without specified input type!");
        }
        this.map(transformer.getInputType(), transformer);
    }

    protected abstract void register();

    public void read(Type<?> type) {
        this.handler(wrapper -> wrapper.read(type));
    }

    public void handler(PacketHandler handler) {
        this.packetHandlers.add(handler);
    }

    @Override
    public final void handle(PacketWrapper wrapper) throws InformativeException {
        for (PacketHandler handler : this.packetHandlers) {
            handler.handle(wrapper);
        }
    }
}

