/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.authlib.minecraft.report.ReportedEntity
 *  com.mojang.datafixers.util.Either
 *  minecraft.class01631
 *  minecraft.class02043
 *  minecraft.class02044
 *  minecraft.class02065
 *  minecraft.class02073
 *  minecraft.class03409
 *  minecraft.class06955
 *  minecraft.class06974
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import minecraft.class01631;
import minecraft.class02043;
import minecraft.class02044;
import minecraft.class02065;
import minecraft.class02073;
import minecraft.class03409;
import minecraft.class03744;
import minecraft.class03752;
import minecraft.class06955;
import minecraft.class06974;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class03750
extends class02073<class03744> {
    public @Nullable class02043 L() {
        if (((class03744)this.N).R == null) {
            return class02043.N;
        }
        if (((class03744)this.N).i.length() > this.y.maxOpinionCommentsLength()) {
            return class02043.u;
        }
        return super.L();
    }

    public class03750(UUID uUID, Supplier<class01631> supplier, AbuseReportLimits abuseReportLimits) {
        super((class02065)new class03744(UUID.randomUUID(), Instant.now(), uUID, supplier), abuseReportLimits);
    }

    public class03750(class03744 class037442, AbuseReportLimits abuseReportLimits) {
        super((class02065)class037442, abuseReportLimits);
    }

    public boolean y() {
        return StringUtils.isNotEmpty((CharSequence)this.M()) || this.Z() != null;
    }

    public Either<class02044, class02043> N(class03409 class034092) {
        String string;
        class06974 class069742;
        class02043 class020432 = this.L();
        if (class020432 != null) {
            return Either.right((Object)class020432);
        }
        String string2 = Objects.requireNonNull(((class03744)this.N).R).N();
        ReportedEntity reportedEntity = new ReportedEntity(((class03744)this.N).u);
        class06955 class069552 = ((class03744)this.N).N.get().N();
        if (class069552 instanceof class06974) {
            class069742 = (class06974)class069552;
            string = class069742.L();
        } else {
            string = null;
        }
        String string3 = string;
        class069742 = AbuseReport.skin((String)((class03744)this.N).i, (String)string2, (String)string3, (ReportedEntity)reportedEntity, (Instant)((class03744)this.N).L);
        return Either.left((Object)new class02044(((class03744)this.N).y, class03752.field_46065, (AbuseReport)class069742));
    }
}

