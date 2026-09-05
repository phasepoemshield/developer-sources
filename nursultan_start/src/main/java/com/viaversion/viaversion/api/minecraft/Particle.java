/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.IdHolder
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft;

import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.IdHolder;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;

public final class Particle
implements IdHolder,
Copyable {
    private final List<ParticleData<?>> arguments = new ArrayList(4);
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public Particle(int id) {
        this.id = id;
    }

    public String toString() {
        return "Particle{arguments=" + String.valueOf(this.arguments) + ", id=" + this.id + "}";
    }

    public <T> void add(int index, Type<T> type, T value) {
        this.arguments.add(index, new ParticleData<T>(type, value));
    }

    public <T> void add(Type<T> type, T value) {
        this.arguments.add(new ParticleData<T>(type, value));
    }

    public int id() {
        return this.id;
    }

    public <T> void set(int index, Type<T> type, T value) {
        this.arguments.set(index, new ParticleData<T>(type, value));
    }

    public Particle copy() {
        Particle particle = new Particle(this.id);
        for (ParticleData<?> argument : this.arguments) {
            particle.arguments.add((ParticleData<?>)argument.copy());
        }
        return particle;
    }

    public List<ParticleData<?>> getArguments() {
        return this.arguments;
    }

    public <T> ParticleData<T> getArgument(int index) {
        return this.arguments.get(index);
    }

    public <T> ParticleData<T> removeArgument(int index) {
        return this.arguments.remove(index);
    }

    public static final class ParticleData<T>
    implements Copyable {
        private final Type<T> type;
        private T value;

        public ParticleData(Type<T> type, T value) {
            this.type = type;
            this.value = value;
        }

        public String toString() {
            return "ParticleData{type=" + String.valueOf(this.type) + ", value=" + String.valueOf(this.value) + "}";
        }

        public T getValue() {
            return this.value;
        }

        public void write(PacketWrapper wrapper) {
            wrapper.write(this.type, this.value);
        }

        public void write(ByteBuf buf) {
            this.type.write(buf, this.value);
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Type<T> getType() {
            return this.type;
        }

        public ParticleData<T> copy() {
            return new ParticleData<Object>(this.type, Copyable.copy(this.value));
        }
    }
}

