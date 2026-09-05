/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.authlib.minecraft.report.ReportChatMessage
 *  com.mojang.authlib.minecraft.report.ReportEvidence
 *  com.mojang.authlib.minecraft.report.ReportedEntity
 *  com.mojang.datafixers.util.Either
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class01962
 *  minecraft.class02043
 *  minecraft.class02044
 *  minecraft.class02065
 *  minecraft.class02073
 *  minecraft.class02083
 *  minecraft.class03079
 *  minecraft.class03752
 *  minecraft.class03791
 *  minecraft.class04469
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportChatMessage;
import com.mojang.authlib.minecraft.report.ReportEvidence;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import minecraft.class01962;
import minecraft.class02043;
import minecraft.class02044;
import minecraft.class02065;
import minecraft.class02073;
import minecraft.class02083;
import minecraft.class03079;
import minecraft.class03406;
import minecraft.class03409;
import minecraft.class03412;
import minecraft.class03752;
import minecraft.class03791;
import minecraft.class04469;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class03399
extends class02073<class03406> {
    public @Nullable class02043 L() {
        if (((class03406)this.N).N.isEmpty()) {
            return class02043.y;
        }
        if (((class03406)this.N).N.size() > this.y.maxReportedMessageCount()) {
            return class02043.L;
        }
        if (((class03406)this.N).R == null) {
            return class02043.N;
        }
        if (((class03406)this.N).i.length() > this.y.maxOpinionCommentsLength()) {
            return class02043.u;
        }
        return super.L();
    }

    public class03399(class03406 class034062, AbuseReportLimits abuseReportLimits) {
        super((class02065)class034062, abuseReportLimits);
    }

    public class03399(UUID uUID, AbuseReportLimits abuseReportLimits) {
        super((class02065)new class03406(UUID.randomUUID(), Instant.now(), uUID), abuseReportLimits);
    }

    public class03399 u() {
        return new class03399((class03406)((class03406)this.N).y(), this.y);
    }

    private ReportEvidence y(class03409 class034092) {
        ArrayList arrayList = new ArrayList();
        new class03791(this.y.leadingContextMessageCount()).N(class034092.y(), (IntCollection)((class03406)this.N).N, (n, class034122) -> arrayList.add(this.N(class034122, this.y(n))));
        return new ReportEvidence(Lists.reverse(arrayList));
    }

    public boolean y(int n) {
        return ((class03406)this.N).N.contains(n);
    }

    public boolean y() {
        return StringUtils.isNotEmpty((CharSequence)this.M()) || !this.N().isEmpty() || this.Z() != null;
    }

    private ReportChatMessage N(class03412 class034122, boolean bl) {
        class02083 class020832 = class034122.M().U();
        class03079 class030792 = class034122.M().W();
        List list = class030792.u().y().stream().map(class04469::L).toList();
        ByteBuffer byteBuffer = (ByteBuffer)class01962.N((Object)class034122.M().E(), class04469::L);
        return new ReportChatMessage(class020832.y(), class020832.L(), class020832.u(), class030792.y(), class030792.L(), list, class030792.N(), byteBuffer, bl);
    }

    public Either<class02044, class02043> N(class03409 class034092) {
        class02043 class020432 = this.L();
        if (class020432 != null) {
            return Either.right((Object)class020432);
        }
        String string = Objects.requireNonNull(((class03406)this.N).R).N();
        ReportEvidence reportEvidence = this.y(class034092);
        ReportedEntity reportedEntity = new ReportedEntity(((class03406)this.N).u);
        AbuseReport abuseReport = AbuseReport.chat((String)((class03406)this.N).i, (String)string, (ReportEvidence)reportEvidence, (ReportedEntity)reportedEntity, (Instant)((class03406)this.N).L);
        return Either.left((Object)new class02044(((class03406)this.N).y, class03752.field_46064, abuseReport));
    }

    public void N(int n) {
        ((class03406)this.N).N(n, this.y);
    }

    public IntSet N() {
        return ((class03406)this.N).N;
    }
}

