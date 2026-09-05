/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01283
 *  minecraft.class01622
 *  minecraft.class02298
 *  minecraft.class03643
 *  minecraft.class03652
 *  net.fabricmc.fabric.api.resource.v1.FabricResource
 *  net.fabricmc.fabric.impl.resource.PackSourceTracker
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import minecraft.class01283;
import minecraft.class01622;
import minecraft.class02298;
import minecraft.class03643;
import minecraft.class03652;
import net.fabricmc.fabric.api.resource.v1.FabricResource;
import net.fabricmc.fabric.impl.resource.PackSourceTracker;
import org.jspecify.annotations.Nullable;

public class class01079
implements FabricResource {
    private final class01622 field_40054;
    private final class03652<InputStream> field_38685;
    private final class03652<class03643> field_38686;
    private @Nullable class03643 field_38687;

    public class01079(class01622 class016222, class03652<InputStream> class036522, class03652<class03643> class036523) {
        this.field_40054 = class016222;
        this.field_38685 = class036522;
        this.field_38686 = class036523;
    }

    public class01079(class01622 class016222, class03652<InputStream> class036522) {
        this.field_40054 = class016222;
        this.field_38685 = class036522;
        this.field_38686 = class03643.y;
        this.field_38687 = class03643.N;
    }

    public InputStream method_14482() throws IOException {
        return (InputStream)this.field_38685.get();
    }

    public BufferedReader method_43039() throws IOException {
        return new BufferedReader(new InputStreamReader(this.method_14482(), StandardCharsets.UTF_8));
    }

    public String method_14480() {
        return this.field_40054.method_14409();
    }

    public Optional<class02298> method_56936() {
        return this.field_40054.N();
    }

    public class01622 method_45304() {
        return this.field_40054;
    }

    public class01283 getFabricPackSource() {
        return PackSourceTracker.getSource((class01622)this.method_45304());
    }

    public class03643 method_14481() throws IOException {
        if (this.field_38687 == null) {
            this.field_38687 = (class03643)this.field_38686.get();
        }
        return this.field_38687;
    }
}

