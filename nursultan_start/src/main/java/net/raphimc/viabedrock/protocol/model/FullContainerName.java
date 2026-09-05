/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerEnumName
 */
package net.raphimc.viabedrock.protocol.model;

import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerEnumName;

public record FullContainerName(ContainerEnumName name, Integer dynamicId) {
    public static final FullContainerName EMPTY = new FullContainerName(ContainerEnumName.AnvilInputContainer, null);
}

