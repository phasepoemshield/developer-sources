/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01603
 *  minecraft.class01829
 *  minecraft.class04551
 *  minecraft.class08735
 */
package com.viaversion.viafabricplus.features.networking.resource_pack_header;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Date;
import minecraft.class01603;
import minecraft.class01829;
import minecraft.class04551;
import minecraft.class08735;

class ResourcePackHeaderDiff$1
implements class04551 {
    final /* synthetic */ String val$id;
    final /* synthetic */ String val$name;
    final /* synthetic */ ProtocolVersion val$version;
    final /* synthetic */ int val$majorVersion;
    final /* synthetic */ int val$minorVersion;

    ResourcePackHeaderDiff$1() {
        this.val$id = var1_1;
        this.val$name = var2_2;
        this.val$version = var3_3;
        this.val$majorVersion = n;
        this.val$minorVersion = n2;
    }

    public boolean comp_4031() {
        return true;
    }

    public Date comp_4030() {
        return null;
    }

    public int comp_4027() {
        return this.val$version.getOriginalVersion();
    }

    public String comp_4024() {
        return this.val$id;
    }

    public class01829 comp_4026() {
        return null;
    }

    public String comp_4025() {
        return this.val$name;
    }

    public class08735 method_70592(class01603 class016032) {
        if (class016032 == class01603.field_14188) {
            return class08735.N((int)this.val$majorVersion, (int)this.val$minorVersion);
        }
        throw new UnsupportedOperationException();
    }
}

