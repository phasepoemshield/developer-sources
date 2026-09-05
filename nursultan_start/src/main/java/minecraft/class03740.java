/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.authlib.minecraft.report.ReportedEntity
 *  com.mojang.datafixers.util.Either
 *  minecraft.class02043
 *  minecraft.class02044
 *  minecraft.class02065
 *  minecraft.class02073
 *  minecraft.class03409
 *  minecraft.class03752
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import minecraft.class02043;
import minecraft.class02044;
import minecraft.class02065;
import minecraft.class02073;
import minecraft.class03409;
import minecraft.class03732;
import minecraft.class03752;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class03740
extends class02073<class03732> {
    public @Nullable class02043 L() {
        if (((class03732)this.N).i.length() > this.y.maxOpinionCommentsLength()) {
            return class02043.u;
        }
        return super.L();
    }

    public class03740(UUID uUID, String string, AbuseReportLimits abuseReportLimits) {
        super((class02065)new class03732(UUID.randomUUID(), Instant.now(), uUID, string), abuseReportLimits);
    }

    public class03740(class03732 class037322, AbuseReportLimits abuseReportLimits) {
        super((class02065)class037322, abuseReportLimits);
    }

    public boolean y() {
        return StringUtils.isNotEmpty((CharSequence)this.M());
    }

    public Either<class02044, class02043> N(class03409 class034092) {
        class02043 class020432 = this.L();
        if (class020432 != null) {
            return Either.right((Object)class020432);
        }
        ReportedEntity reportedEntity = new ReportedEntity(((class03732)this.N).u);
        AbuseReport abuseReport = AbuseReport.name((String)((class03732)this.N).i, (ReportedEntity)reportedEntity, (Instant)((class03732)this.N).L);
        return Either.left((Object)new class02044(((class03732)this.N).y, class03752.field_46066, abuseReport));
    }
}

