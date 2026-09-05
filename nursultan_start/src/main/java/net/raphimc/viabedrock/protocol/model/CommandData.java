/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.viabedrock.protocol.model.CommandData$EnumData
 *  net.raphimc.viabedrock.protocol.model.CommandData$OverloadData
 */
package net.raphimc.viabedrock.protocol.model;

import net.raphimc.viabedrock.protocol.model.CommandData;

public record CommandData(String name, String description, int flags, byte permission, EnumData alias, OverloadData[] overloads) {
}

