/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00780
 *  minecraft.class00891
 *  minecraft.class01042
 *  minecraft.class01929
 *  minecraft.class03032
 *  minecraft.class03222
 *  minecraft.class03322
 *  minecraft.class03480
 *  minecraft.class03556
 *  minecraft.class04295
 *  minecraft.class04327
 *  minecraft.class04330
 *  minecraft.class04651
 *  minecraft.class04688
 *  minecraft.class04748
 *  minecraft.class04770
 *  minecraft.class04932
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07361
 *  minecraft.class07371
 *  minecraft.class07536
 *  minecraft.class07830
 *  minecraft.class07841
 *  minecraft.class08094
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentChange
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00780;
import minecraft.class00891;
import minecraft.class01042;
import minecraft.class01929;
import minecraft.class03032;
import minecraft.class03222;
import minecraft.class03322;
import minecraft.class03480;
import minecraft.class03556;
import minecraft.class04295;
import minecraft.class04327;
import minecraft.class04330;
import minecraft.class04651;
import minecraft.class04688;
import minecraft.class04748;
import minecraft.class04770;
import minecraft.class04932;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07361;
import minecraft.class07371;
import minecraft.class07536;
import minecraft.class07830;
import minecraft.class07841;
import minecraft.class08094;
import minecraft.class08299;
import minecraft.class08329;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import org.jspecify.annotations.Nullable;

public class class00548
extends class07361 {
    private final class00570 W;
    private final boolean m;

    private class07830 L(class07830 class078302) {
        if (class078302 == class07830.field_13194) {
            return class07830.field_13202;
        }
        if (class078302 == class07830.field_13195) {
            return class07830.field_13200;
        }
        return class078302;
    }

    public Map<class04748, class04932> M() {
        return this.W.M();
    }

    public class04327<class00891> P() {
        if (this.m) {
            return this.W.P();
        }
        return class04295.N();
    }

    public boolean T() {
        return false;
    }

    public class00500 method_8320(class07209 class072092) {
        return this.W.method_8320(class072092);
    }

    public class04688 method_8316(class07209 class072092) {
        return this.W.method_8316(class072092);
    }

    public class00548(class00570 class005702, boolean bl) {
        super(class005702.R(), class07371.N, class005702.U, class005702.J().method_74142(), class005702.v());
        this.W = class005702;
        this.m = bl;
    }

    public Map<class04748, LongSet> B() {
        return this.W.B();
    }

    public class00570 I() {
        return this.W;
    }

    public void Z() {
        this.W.Z();
    }

    public @Nullable class07001 i(class07209 class072092) {
        return this.W.i(class072092);
    }

    public class04327<class04651> s() {
        if (this.m) {
            return this.W.s();
        }
        return class04295.N();
    }

    public void k() {
        this.W.k();
    }

    public boolean t() {
        return this.W.t();
    }

    public class03322 g() {
        if (this.m) {
            return super.g();
        }
        throw (UnsupportedOperationException)class07536.y((Throwable)new UnsupportedOperationException("Meaningless in this context"));
    }

    public @Nullable class03032 v() {
        return this.W.v();
    }

    public boolean U() {
        return false;
    }

    public boolean z() {
        return false;
    }

    public void u(class07209 class072092) {
    }

    public class00554[] u() {
        return this.W.u();
    }

    public void y(Map<class04748, LongSet> map) {
    }

    public LongSet y(class04748 class047482) {
        return this.W.y(class047482);
    }

    public class00554 y(int n) {
        if (this.m) {
            return this.W.y(n);
        }
        return super.y(n);
    }

    public class00549 E() {
        return this.W.E();
    }

    public void N(class00549 class005492) {
        if (this.m) {
            super.N(class005492);
        }
    }

    public class08094 N(long l) {
        return this.W.N(l);
    }

    public @Nullable class07001 N(class07209 class072092, class01929 class019292) {
        return this.W.N(class072092, class019292);
    }

    public void N(Predicate<class00500> predicate, BiConsumer<class07209, class00500> biConsumer) {
        this.W.N(predicate, biConsumer);
    }

    public void N_86(Map<class04748, class04932> map) {
    }

    public @Nullable class00500 N(class07209 class072092, class00500 class005002, int n) {
        if (this.m) {
            return this.W.N(class072092, class005002, n);
        }
        return null;
    }

    public void N(class00394 class003942) {
        if (this.m) {
            this.W.N(class003942);
        }
    }

    public void N(boolean bl) {
        this.W.N(bl);
    }

    public void N(class07049 class070492) {
        if (this.m) {
            this.W.N(class070492);
        }
    }

    public int N(class07830 class078302, int n, int n2) {
        return this.W.N(this.L(class078302), n, n2);
    }

    public void N(class04330 class043302, class03222 class032222) {
        if (this.m) {
            this.W.N(class043302, class032222);
        }
    }

    public @Nullable class04932 N(class04748 class047482) {
        return this.W.N(class047482);
    }

    public void N(class04748 class047482, class04932 class049322) {
    }

    public void N(class04748 class047482, long l) {
    }

    public void N(class07830 class078302, long[] lArray) {
    }

    public void N(class07001 class070012) {
    }

    public class07841 N(class07830 class078302) {
        return this.W.N(class078302);
    }

    public void N(class07209 class072092) {
    }

    public class07321 R() {
        return this.W.R();
    }

    public class03322 O() {
        if (this.m) {
            return super.O();
        }
        throw (UnsupportedOperationException)class07536.y((Throwable)new UnsupportedOperationException("Meaningless in this context"));
    }

    public class03480 Y() {
        return this.W.Y();
    }

    public AttachmentTargetInfo fabric_getSyncTargetInfo() {
        return ((AttachmentTargetImpl)this.W).fabric_getSyncTargetInfo();
    }

    public Map fabric_getAttachments() {
        return ((AttachmentTargetImpl)this.W).fabric_getAttachments();
    }

    public boolean fabric_shouldTryToSync() {
        return ((AttachmentTargetImpl)this.W).fabric_shouldTryToSync();
    }

    public void fabric_markChanged(AttachmentType attachmentType) {
        ((AttachmentTargetImpl)this.W).fabric_markChanged(attachmentType);
    }

    public boolean hasAttached(AttachmentType attachmentType) {
        return this.W.hasAttached(attachmentType);
    }

    public @Nullable Object setAttached(AttachmentType attachmentType, @Nullable Object object) {
        return this.W.setAttached(attachmentType, object);
    }

    public void fabric_syncChange(AttachmentType attachmentType, AttachmentChange attachmentChange) {
        ((AttachmentTargetImpl)this.W).fabric_syncChange(attachmentType, attachmentChange);
    }

    public @Nullable Object getAttached(AttachmentType attachmentType) {
        return this.W.getAttached(attachmentType);
    }

    public @Nullable class00394 method_8321(class07209 class072092) {
        return this.W.method_8321(class072092);
    }

    public class03556<class00780> method_16359(int n, int n2, int n3) {
        return this.W.method_16359(n, n2, n3);
    }

    public boolean fabric_hasPersistentAttachments() {
        return ((AttachmentTargetImpl)this.W).fabric_hasPersistentAttachments();
    }

    public class01042 fabric_getDynamicRegistryManager() {
        return ((AttachmentTargetImpl)this.W).fabric_getDynamicRegistryManager();
    }

    public void fabric_writeAttachmentsToNbt(class08329 class083292) {
        ((AttachmentTargetImpl)this.W).fabric_writeAttachmentsToNbt(class083292);
    }

    public void fabric_readAttachmentsFromNbt(class08299 class082992) {
        ((AttachmentTargetImpl)this.W).fabric_readAttachmentsFromNbt(class082992);
    }

    public void fabric_computeInitialSyncChanges(class04770 class047702, Consumer consumer) {
        ((AttachmentTargetImpl)this.W).fabric_computeInitialSyncChanges(class047702, consumer);
    }
}

