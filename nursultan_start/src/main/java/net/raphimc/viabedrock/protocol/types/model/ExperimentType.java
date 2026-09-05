/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.model.Experiment
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.model.Experiment;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class ExperimentType
extends Type<Experiment> {
    public ExperimentType() {
        super(Experiment.class);
    }

    public void write(ByteBuf buffer, Experiment value) {
        BedrockTypes.STRING.write(buffer, (Object)value.name());
        buffer.writeBoolean(value.enabled());
    }

    public Experiment read(ByteBuf buffer) {
        return new Experiment((String)BedrockTypes.STRING.read(buffer), buffer.readBoolean());
    }
}

