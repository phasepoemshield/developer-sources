/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.model.EducationUriResource
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.model.EducationUriResource;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class EducationUriResourceType
extends Type<EducationUriResource> {
    public EducationUriResourceType() {
        super(EducationUriResource.class);
    }

    public void write(ByteBuf buffer, EducationUriResource value) {
        BedrockTypes.STRING.write(buffer, (Object)value.buttonName());
        BedrockTypes.STRING.write(buffer, (Object)value.linkUri());
    }

    public EducationUriResource read(ByteBuf buffer) {
        return new EducationUriResource((String)BedrockTypes.STRING.read(buffer), (String)BedrockTypes.STRING.read(buffer));
    }
}

