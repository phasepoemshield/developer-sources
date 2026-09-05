/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10465
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  java.lang.MatchException
 *  minecraft.class00031
 *  minecraft.class00272
 *  minecraft.class00281
 *  minecraft.class00381
 *  minecraft.class00389
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00408
 *  minecraft.class00429
 *  minecraft.class00494
 *  minecraft.class00495
 *  minecraft.class00500
 *  minecraft.class00503
 *  minecraft.class00509
 *  minecraft.class00516
 *  minecraft.class00520
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00558
 *  minecraft.class00570
 *  minecraft.class00608
 *  minecraft.class00611
 *  minecraft.class00616
 *  minecraft.class00672
 *  minecraft.class00682
 *  minecraft.class00690
 *  minecraft.class00695
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00770
 *  minecraft.class00780
 *  minecraft.class00801
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class00931
 *  minecraft.class01042
 *  minecraft.class01099
 *  minecraft.class01104
 *  minecraft.class01109
 *  minecraft.class01116
 *  minecraft.class01124
 *  minecraft.class01128
 *  minecraft.class01135
 *  minecraft.class01136
 *  minecraft.class01139
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01224
 *  minecraft.class01255
 *  minecraft.class01284
 *  minecraft.class01296
 *  minecraft.class01329
 *  minecraft.class01894
 *  minecraft.class01938
 *  minecraft.class02135
 *  minecraft.class02142
 *  minecraft.class02265
 *  minecraft.class02277
 *  minecraft.class02587
 *  minecraft.class02703
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class02755
 *  minecraft.class02756
 *  minecraft.class02796
 *  minecraft.class03106
 *  minecraft.class03179
 *  minecraft.class03470
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class03788
 *  minecraft.class03927
 *  minecraft.class04057
 *  minecraft.class04206
 *  minecraft.class04218
 *  minecraft.class04227
 *  minecraft.class04298
 *  minecraft.class04312
 *  minecraft.class04540
 *  minecraft.class04594
 *  minecraft.class04643
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04868
 *  minecraft.class04877
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05030
 *  minecraft.class05042
 *  minecraft.class05163
 *  minecraft.class05207
 *  minecraft.class05212
 *  minecraft.class05216
 *  minecraft.class05324
 *  minecraft.class05354
 *  minecraft.class05368
 *  minecraft.class05372
 *  minecraft.class05377
 *  minecraft.class05474
 *  minecraft.class05487
 *  minecraft.class05715
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class05975
 *  minecraft.class06060
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06149
 *  minecraft.class06172
 *  minecraft.class06265
 *  minecraft.class06394
 *  minecraft.class06482
 *  minecraft.class06511
 *  minecraft.class06555
 *  minecraft.class06683
 *  minecraft.class06839
 *  minecraft.class06889
 *  minecraft.class06987
 *  minecraft.class06999
 *  minecraft.class07003
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07062
 *  minecraft.class07072
 *  minecraft.class07074
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07080
 *  minecraft.class07086
 *  minecraft.class07117
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07265
 *  minecraft.class07275
 *  minecraft.class07280
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07302
 *  minecraft.class07303
 *  minecraft.class07305
 *  minecraft.class07321
 *  minecraft.class07328
 *  minecraft.class07376
 *  minecraft.class07428
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class07623
 *  minecraft.class07769
 *  minecraft.class07830
 *  minecraft.class07856
 *  minecraft.class08036
 *  minecraft.class08050
 *  minecraft.class08057
 *  minecraft.class08062
 *  minecraft.class08073
 *  minecraft.class08088
 *  minecraft.class08092
 *  minecraft.class08165
 *  minecraft.class08413
 *  minecraft.class08700
 *  net.caffeinemc.mods.lithium.common.block.BlockCountingSection
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlags
 *  net.caffeinemc.mods.lithium.common.entity.NavigatingEntity
 *  net.caffeinemc.mods.lithium.common.world.ChunkRandomSource
 *  net.caffeinemc.mods.lithium.common.world.LithiumData
 *  net.caffeinemc.mods.lithium.common.world.ServerWorldExtended
 *  net.caffeinemc.mods.lithium.common.world.section.LithiumSectionData
 *  net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper
 *  net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.ServerLevelAccessor
 *  net.caffeinemc.mods.lithium.mixin.util.accessors.ServerLevelAccessor
 *  net.caffeinemc.mods.lithium.mixin.util.entity_movement_tracking.ServerLevelAccessor
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents$EndWorldTick
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents$StartWorldTick
 *  net.fabricmc.fabric.api.networking.v1.PlayerLookup
 *  net.fabricmc.fabric.impl.attachment.AttachmentPersistentState
 *  net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl
 *  net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentChange
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentSync
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$WorldTarget
 *  net.fabricmc.fabric.impl.lookup.block.BlockApiCacheImpl
 *  net.fabricmc.fabric.impl.lookup.block.ServerWorldCache
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10465;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00031;
import minecraft.class00272;
import minecraft.class00281;
import minecraft.class00381;
import minecraft.class00389;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00408;
import minecraft.class00429;
import minecraft.class00494;
import minecraft.class00495;
import minecraft.class00500;
import minecraft.class00503;
import minecraft.class00509;
import minecraft.class00516;
import minecraft.class00520;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00558;
import minecraft.class00570;
import minecraft.class00608;
import minecraft.class00611;
import minecraft.class00616;
import minecraft.class00672;
import minecraft.class00682;
import minecraft.class00690;
import minecraft.class00695;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00770;
import minecraft.class00780;
import minecraft.class00801;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class00931;
import minecraft.class01042;
import minecraft.class01099;
import minecraft.class01104;
import minecraft.class01109;
import minecraft.class01116;
import minecraft.class01124;
import minecraft.class01128;
import minecraft.class01135;
import minecraft.class01136;
import minecraft.class01139;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01224;
import minecraft.class01255;
import minecraft.class01284;
import minecraft.class01296;
import minecraft.class01329;
import minecraft.class01894;
import minecraft.class01938;
import minecraft.class02135;
import minecraft.class02142;
import minecraft.class02265;
import minecraft.class02277;
import minecraft.class02587;
import minecraft.class02703;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class02755;
import minecraft.class02756;
import minecraft.class02796;
import minecraft.class03106;
import minecraft.class03179;
import minecraft.class03470;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class03788;
import minecraft.class03927;
import minecraft.class04057;
import minecraft.class04206;
import minecraft.class04218;
import minecraft.class04227;
import minecraft.class04298;
import minecraft.class04312;
import minecraft.class04540;
import minecraft.class04594;
import minecraft.class04643;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04748;
import minecraft.class04751;
import minecraft.class04770;
import minecraft.class04785;
import minecraft.class04868;
import minecraft.class04877;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05030;
import minecraft.class05042;
import minecraft.class05163;
import minecraft.class05207;
import minecraft.class05212;
import minecraft.class05216;
import minecraft.class05324;
import minecraft.class05354;
import minecraft.class05368;
import minecraft.class05372;
import minecraft.class05377;
import minecraft.class05474;
import minecraft.class05487;
import minecraft.class05715;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class05975;
import minecraft.class06060;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06149;
import minecraft.class06172;
import minecraft.class06265;
import minecraft.class06394;
import minecraft.class06482;
import minecraft.class06511;
import minecraft.class06555;
import minecraft.class06683;
import minecraft.class06839;
import minecraft.class06889;
import minecraft.class06987;
import minecraft.class06999;
import minecraft.class07003;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07062;
import minecraft.class07072;
import minecraft.class07074;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07080;
import minecraft.class07086;
import minecraft.class07117;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07265;
import minecraft.class07275;
import minecraft.class07280;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07302;
import minecraft.class07303;
import minecraft.class07305;
import minecraft.class07321;
import minecraft.class07328;
import minecraft.class07376;
import minecraft.class07428;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class07623;
import minecraft.class07769;
import minecraft.class07830;
import minecraft.class07856;
import minecraft.class08036;
import minecraft.class08050;
import minecraft.class08057;
import minecraft.class08062;
import minecraft.class08073;
import minecraft.class08088;
import minecraft.class08092;
import minecraft.class08165;
import minecraft.class08413;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.block.BlockCountingSection;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;
import net.caffeinemc.mods.lithium.common.entity.NavigatingEntity;
import net.caffeinemc.mods.lithium.common.world.ChunkRandomSource;
import net.caffeinemc.mods.lithium.common.world.LithiumData;
import net.caffeinemc.mods.lithium.common.world.ServerWorldExtended;
import net.caffeinemc.mods.lithium.common.world.section.LithiumSectionData;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper;
import net.caffeinemc.mods.lithium.mixin.util.entity_movement_tracking.ServerLevelAccessor;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.impl.attachment.AttachmentPersistentState;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentSync;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import net.fabricmc.fabric.impl.lookup.block.BlockApiCacheImpl;
import net.fabricmc.fabric.impl.lookup.block.ServerWorldCache;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04782
extends class07299
implements class00281,
class05974,
ServerWorldExtended,
net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.ServerLevelAccessor,
net.caffeinemc.mods.lithium.mixin.util.accessors.ServerLevelAccessor,
ServerLevelAccessor,
AttachmentTargetImpl,
ServerWorldCache {
    public static final class07209 field_25144 = new class07209(100, 50, 0);
    public static final class02142 field_41749 = class02135.y((int)12000, (int)180000);
    public static final class02142 field_41750 = class02135.y((int)12000, (int)24000);
    private static final class02142 field_41748 = class02135.y((int)12000, (int)180000);
    public static final class02142 field_41751 = class02135.y((int)3600, (int)15600);
    private static final Logger field_13952 = LogUtils.getLogger();
    private static final int field_29768 = 300;
    private static final int field_35441 = 65536;
    public final List<class04770> field_18261;
    private final class04751 field_24624;
    private final class02796 field_13959;
    private final class05212 field_24456;
    public final class01139 field_26934;
    private final class00031 field_59630;
    private final class00616 field_64261;
    private final class01104<class07049> field_26935;
    private final class03788 field_39984;
    public boolean field_13957;
    private final class06060 field_28859;
    private int field_13948;
    private final class00770 field_13956;
    private final class04312<class00891> field_13949;
    private final class04312<class04651> field_13951;
    private final class02703 field_49172;
    public Set<class07079> field_26932;
    public volatile boolean field_36317;
    protected final class04868 field_18811;
    private final ObjectLinkedOpenHashSet<class07303> field_13950;
    private final List<class07303> field_35565;
    private boolean field_13953;
    private final List<class05975> field_25141;
    private @Nullable class07856 field_25142;
    public final Int2ObjectMap<class00695> field_26933;
    private final class05324 field_23787;
    private final class03179 field_36208;
    private final boolean field_25143;
    private final class03470 field_44857;
    public final class06987 field_62841;
    private final Map apiLookupCaches = new Object2ReferenceOpenHashMap();
    private int apiLookupAccessesWithoutCleanup = 0;
    private final class07218 randomPosInChunkCachedPos = new class07218();
    private static final int MAX_COUNT_FOR_BLOCK_SEARCH_AFTER_RANDOM_CHANCE = 384;

    public class04751 method_14178() {
        return this.field_24624;
    }

    public class00031 method_70636() {
        return this.field_59630;
    }

    public void method_32888(class03556<class01194> class035562, class06889 class068892, class01164 class011642) {
        this.field_39984.N(class035562, class068892, class011642);
    }

    public class06987 method_74535() {
        return this.field_62841;
    }

    public class02796 method_8503() {
        return this.field_13959;
    }

    public class08057 method_8621() {
        class08057 class080572 = (class08057)this.method_17983().N(class08057.u);
        class080572.N(this.field_9232.y());
        return class080572;
    }

    public class05042 method_74854() {
        return this.method_8503().yR();
    }

    public class00616 method_75728() {
        return this.field_64261;
    }

    public boolean method_8649(class07049 class070492) {
        return this.method_14175(class070492);
    }

    public <T extends class07126> int method_65096(T t, double d, double d2, double d3, int n, double d4, double d5, double d6, double d7) {
        return this.method_14199(t, false, false, d, d2, d3, n, d4, d5, d6, d7);
    }

    public boolean method_75002(class07299 class072992) {
        if (class072992.method_27983() == class07299.field_25180) {
            return (Boolean)this.method_64395().N(class07305.L);
        }
        return true;
    }

    public /* synthetic */ class06683 method_8428() {
        return this.method_14170();
    }

    public void method_18769(class07049 class070492) {
        if (class070492 instanceof class04770) {
            class04770 class047702 = (class04770)class070492;
            this.method_18771(class047702);
        } else {
            this.method_14175(class070492);
        }
    }

    public void method_14197() {
        this.field_13948 = 0;
    }

    public List<class04770> method_18456() {
        return this.field_18261;
    }

    public class04782(class02796 class027962, Executor executor, class04785 class047852, class05212 class052122, class05946<class07299> class059462, class01255 class012552, boolean bl, long l, List<class05975> list, boolean bl2, @Nullable class03470 class034702) {
        super((class05207)class052122, class059462, (class01042)class027962.yt(), class012552.N(), false, bl, l, class027962.Nu());
        this.field_18261 = Lists.newArrayList();
        this.field_26934 = new class01139();
        this.field_13949 = new class04312(this::method_37117);
        this.field_13951 = new class04312(this::method_37117);
        this.field_49172 = new class02703();
        this.field_26932 = new ObjectOpenHashSet();
        this.field_13950 = new ObjectLinkedOpenHashSet();
        this.field_35565 = new ArrayList<class07303>(64);
        this.field_26933 = new Int2ObjectOpenHashMap();
        this.field_62841 = new class06987(this);
        this.field_25143 = bl2;
        this.field_13959 = class027962;
        this.field_25141 = list;
        this.field_24456 = class052122;
        class08088 class080882 = class012552.y();
        boolean bl3 = class027962.j();
        DataFixer dataFixer = class027962.ND();
        class01116 class011162 = new class01116(new class06172(new class02277(class047852.R(), class059462, "entities"), class047852.N(class059462).resolve("entities"), dataFixer, bl3, class05715.field_26990), this, (Executor)class027962);
        this.field_26935 = new class01104(class07049.class, (class01109)new class10465(this), (class01136)class011162);
        this.field_24624 = new class04751(this, class047852, dataFixer, class027962.yv(), executor, class080882, class027962.Nm().T(), class027962.Nm().b(), bl3, (arg_0, arg_1) -> this.field_26935.N(arg_0, arg_1), () -> class027962.NY().method_17983());
        this.field_24624.E().y();
        this.field_13956 = new class00770(this);
        if (this.method_63020()) {
            this.method_8543();
        }
        this.field_18811 = (class04868)this.method_17983().N(class04868.N((class03556)this.method_40134()));
        if (!class027962.No()) {
            class052122.N(class027962.NT());
        }
        long l2 = class027962.yn().l().L();
        this.field_36208 = new class03179(this.field_24624.T(), this.method_30349(), class027962.yv(), class059462, class080882, this.field_24624.W(), (class05474)this, class080882.u(), l2, dataFixer);
        this.field_23787 = new class05324((class07284)this, class027962.yn().l(), this.field_36208);
        this.field_25142 = this.method_27983() == class07299.field_25181 && this.method_40134().N(class04057.L) ? new class07856(this, l2, class027962.yn().Y()) : null;
        this.field_28859 = new class06060();
        this.field_39984 = new class03788(this);
        this.field_44857 = Objects.requireNonNullElseGet(class034702, () -> (class03470)this.method_17983().N(class03470.y));
        this.field_59630 = new class00031();
        this.field_64261 = class00616.N().N((class07299)this).N();
        this.method_8533();
        this.m_handler$zcp000$fabric_data_attachment_api_v1$createAttachmentsPersistentState_44(null);
        this.handler$bpd000$lithium$init(class027962, executor, class047852, class052122, class059462, class012552, bl, l, list, bl2, class034702, null);
    }

    public String toString() {
        return "ServerLevel[" + this.field_24456.u() + "]";
    }

    public void close() throws IOException {
        super.close();
        this.field_26935.close();
    }

    private void m_handler$zhg000$fabric_lifecycle_events_v1$endWorldTick_35(BooleanSupplier booleanSupplier, CallbackInfo callbackInfo) {
        ((ServerTickEvents.EndWorldTick)ServerTickEvents.END_WORLD_TICK.invoker()).onEndTick(this);
    }

    private class07209 redirect$blf000$lithium$redirectTickGetRandomPosInChunk(class04782 class047822, int n, int n2, int n3, int n4) {
        ((ChunkRandomSource)class047822).lithium$getRandomPosInChunk(n, n2, n3, n4, this.randomPosInChunkCachedPos);
        return this.randomPosInChunkCachedPos;
    }

    private void m_handler$zhg000$fabric_lifecycle_events_v1$startWorldTick_36(BooleanSupplier booleanSupplier, CallbackInfo callbackInfo) {
        ((ServerTickEvents.StartWorldTick)ServerTickEvents.START_WORLD_TICK.invoker()).onStartTick(this);
    }

    private Iterator redirect$bpd000$lithium$getActiveListeners(Set set) {
        return Collections.emptyIterator();
    }

    private class07209 modify$blf000$lithium$immutablePos2(class07209 class072092) {
        return class072092.method_10062();
    }

    private class07209 redirect$cca000$lithium$getPosOrOrigin(class01099 class010992) {
        class07209 class072092 = class010992.method_31705();
        if (class072092 == null) {
            return class07209.field_10980;
        }
        return class072092;
    }

    private void handler$cdd000$lithium$skipIfAllBiomesDoNotCreateIceOrSnowAtPos(class07209 class072092, CallbackInfo callbackInfo, class07209 class072093) {
        class00500 class005002 = this.method_8320(class072093);
        if (class005002.Y().N() == class04684.L && class005002.i() instanceof class07117) {
            return;
        }
        if (this.method_8419()) {
            return;
        }
        callbackInfo.cancel();
    }

    public AttachmentTargetInfo fabric_getSyncTargetInfo() {
        return AttachmentTargetInfo.WorldTarget.INSTANCE;
    }

    public void fabric_registerCache(class07209 class072093, BlockApiCacheImpl blockApiCacheImpl) {
        List list = this.apiLookupCaches.computeIfAbsent(class072093.method_10062(), class072092 -> new ArrayList());
        list.removeIf(weakReference -> weakReference.get() == null);
        list.add(new WeakReference<BlockApiCacheImpl>(blockApiCacheImpl));
        ++this.apiLookupAccessesWithoutCleanup;
    }

    public void fabric_invalidateCache(class07209 class072092) {
        List list = (List)this.apiLookupCaches.get(class072092);
        if (list != null) {
            list.removeIf(weakReference -> weakReference.get() == null);
            if (list.size() == 0) {
                this.apiLookupCaches.remove(class072092);
            } else {
                list.forEach(weakReference -> {
                    BlockApiCacheImpl blockApiCacheImpl = (BlockApiCacheImpl)weakReference.get();
                    if (blockApiCacheImpl != null) {
                        blockApiCacheImpl.invalidate();
                    }
                });
            }
        }
        ++this.apiLookupAccessesWithoutCleanup;
        if (this.apiLookupAccessesWithoutCleanup > 2 * this.apiLookupCaches.size()) {
            this.apiLookupCaches.entrySet().removeIf(entry -> {
                ((List)entry.getValue()).removeIf(weakReference -> weakReference.get() == null);
                return ((List)entry.getValue()).isEmpty();
            });
            this.apiLookupAccessesWithoutCleanup = 0;
        }
    }

    public void fabric_syncChange(AttachmentType attachmentType, AttachmentChange attachmentChange) {
        class04782 class047822 = this;
        if (class047822 instanceof class04782) {
            PlayerLookup.world((class04782)class047822).forEach(class047702 -> {
                if (((AttachmentTypeImpl)attachmentType).syncPredicate().test((Object)this, (Object)class047702)) {
                    AttachmentSync.trySync((AttachmentChange)attachmentChange, (class04770)((Object)class047702));
                }
            });
        }
    }

    @Deprecated
    public void method_51837(@Nullable class07856 class078562) {
        this.field_25142 = class078562;
    }

    public class00408 method_17983() {
        return this.method_14178().P();
    }

    public boolean method_37117(long l) {
        return this.method_37116(l) && this.field_24624.N(l);
    }

    public class03106 method_54719() {
        return this.field_13959.yW();
    }

    public class05324 method_27056() {
        return this.field_23787;
    }

    public void method_29199(long l) {
        this.field_24456.y(l);
    }

    protected void method_29203() {
        if (!this.field_25143) {
            return;
        }
        long l = this.field_9232.y() + 1L;
        this.field_24456.N(l);
        class08700.N().N("scheduledFunctions");
        this.field_24456.b().N((Object)this.field_13959, l);
        class08700.N().L();
        if (((Boolean)this.method_64395().N(class07305.N)).booleanValue()) {
            this.method_29199(this.field_9232.L() + 1L);
        }
    }

    public long method_75003() {
        return this.method_8532() / 24000L;
    }

    private void method_23660() {
        this.field_28859.N();
        this.field_18261.stream().filter(class07438::method_6113).collect(Collectors.toList()).forEach(class047702 -> class047702.method_7358(false, false));
    }

    public boolean method_39425(long l) {
        return this.field_24624.L.Z().u(l);
    }

    private void method_14192() {
        this.field_35565.clear();
        while (!this.field_13950.isEmpty()) {
            class07303 class073032 = (class07303)this.field_13950.removeFirst();
            if (this.method_41411(class073032.N())) {
                if (!this.method_14174(class073032)) continue;
                this.field_13959.Nm().N(null, (double)class073032.N().method_10263(), (double)class073032.N().method_10264(), (double)class073032.N().method_10260(), 64.0, this.method_27983(), (class00381)new class07275(class073032.N(), class073032.y(), class073032.L(), class073032.u()));
                continue;
            }
            this.field_35565.add(class073032);
        }
        this.field_13950.addAll(this.field_35565);
    }

    private void method_14171(class07209 class072092, class04651 class046512) {
        class00500 class005002 = this.method_8320(class072092);
        class04688 class046882 = class005002.Y();
        if (class046882.y(class046512)) {
            class046882.N(this, class072092, class005002);
        }
    }

    private void method_39501() {
        boolean bl = this.method_8419();
        if (this.method_63020()) {
            if (((Boolean)this.method_64395().N(class07305.y)).booleanValue()) {
                int n = this.field_24456.i();
                int n2 = this.field_24456.M();
                int n3 = this.field_24456.Z();
                boolean bl2 = this.field_9232.R();
                boolean bl3 = this.field_9232.B();
                if (n > 0) {
                    --n;
                    n2 = bl2 ? 0 : 1;
                    n3 = bl3 ? 0 : 1;
                    bl2 = false;
                    bl3 = false;
                } else {
                    if (n2 > 0) {
                        if (--n2 == 0) {
                            bl2 = !bl2;
                        }
                    } else {
                        n2 = bl2 ? field_41751.N(this.field_9229) : field_41748.N(this.field_9229);
                    }
                    if (n3 > 0) {
                        if (--n3 == 0) {
                            bl3 = !bl3;
                        }
                    } else {
                        n3 = bl3 ? field_41750.N(this.field_9229) : field_41749.N(this.field_9229);
                    }
                }
                this.field_24456.y(n2);
                this.field_24456.L(n3);
                this.field_24456.N(n);
                this.field_24456.N(bl2);
                this.field_24456.y(bl3);
            }
            this.field_9251 = this.field_9234;
            this.field_9234 = this.field_9232.R() ? (this.field_9234 += 0.01f) : (this.field_9234 -= 0.01f);
            this.field_9234 = class04995.N((float)this.field_9234, (float)0.0f, (float)1.0f);
            this.field_9253 = this.field_9235;
            this.field_9235 = this.field_9232.B() ? (this.field_9235 += 0.01f) : (this.field_9235 -= 0.01f);
            this.field_9235 = class04995.N((float)this.field_9235, (float)0.0f, (float)1.0f);
        }
        if (this.field_9253 != this.field_9235) {
            this.field_13959.Nm().N((class00381)new class00503(class00503.Z, this.field_9235), this.method_27983());
        }
        if (this.field_9251 != this.field_9234) {
            this.field_13959.Nm().N((class00381)new class00503(class00503.z, this.field_9234), this.method_27983());
        }
        if (bl != this.method_8419()) {
            if (bl) {
                this.field_13959.Nm().N((class00381)new class00503(class00503.u, 0.0f));
            } else {
                this.field_13959.Nm().N((class00381)new class00503(class00503.L, 0.0f));
            }
            this.field_13959.Nm().N((class00381)new class00503(class00503.Z, this.field_9235));
            this.field_13959.Nm().N((class00381)new class00503(class00503.z, this.field_9234));
        }
    }

    public void method_29202(boolean bl) {
        Iterator<class05975> var2 = this.field_25141.iterator();
        while (var2.hasNext()) {
            var2.next().N(this, bl);
        }
    }

    public void method_27910(int n, int n2, boolean bl, boolean bl2) {
        this.field_24456.N(n);
        this.field_24456.L(n2);
        this.field_24456.y(n2);
        this.field_24456.y(bl);
        this.field_24456.N(bl2);
    }

    public void method_52370(class07209 class072092) {
        class07209 class072093 = this.N(class07830.field_13197, class072092);
        class07209 class072094 = class072093.method_10074();
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.handler$cdd000$lithium$skipIfAllBiomesDoNotCreateIceOrSnowAtPos(class072092, callbackInfo, class072094);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class00780 class007802 = (class00780)this.i(class072093).N();
        if (class007802.N((class05487)this, class072094)) {
            this.method_8501(class072094, class00869.iT.W());
        }
        if (this.method_8419()) {
            class00801 class008012;
            int n = (Integer)this.method_64395().N(class07305.Q);
            if (n > 0 && class007802.y((class05487)this, class072093)) {
                class008012 = this.method_8320(class072093);
                if (class008012.N(class00869.is)) {
                    int n2 = (Integer)class008012.L((class08092)class06999.L);
                    if (n2 < Math.min(n, 8)) {
                        class00500 class005002 = (class00500)class008012.y((class08092)class06999.L, (Comparable)Integer.valueOf(n2 + 1));
                        class00891.N_19((class00500)class008012, (class00500)class005002, (class07284)this, (class07209)class072093);
                        this.method_8501(class072093, class005002);
                    }
                } else {
                    this.method_8501(class072093, class00869.is.W());
                }
            }
            if ((class008012 = class007802.N(class072094, this.method_8615())) != class00801.field_9384) {
                class00500 class005003 = this.method_8320(class072094);
                class005003.i().N_4(class005003, (class07299)this, class072094, class008012);
            }
        }
    }

    public class03556<class00780> method_22387(int n, int n2, int n3) {
        return this.method_14178().U().u().method_38109(n, n2, n3, this.method_14178().W().y());
    }

    public void method_18203(class00570 class005702, int n) {
        class04782 class047822;
        int n2;
        int n3;
        int n4;
        class07321 class073212 = class005702.R();
        int n5 = class073212.i();
        int n6 = class073212.R();
        class04643 class046432 = class08700.N();
        class046432.N("iceandsnow");
        for (int i = 0; i < n; ++i) {
            if (this.field_9229.y(48) != 0) continue;
            n4 = 15;
            n3 = n6;
            n2 = 0;
            int n7 = n5;
            class047822 = this;
            this.method_52370(this.redirect$blf000$lithium$redirectTickGetRandomPosInChunk(class047822, n7, n2, n3, n4));
        }
        class046432.y("tickBlocks");
        if (n > 0) {
            class00554[] class00554Array = class005702.u();
            for (int i = 0; i < class00554Array.length; ++i) {
                class00554 class005542 = class00554Array[i];
                if (!class005542.u()) continue;
                int n8 = class01296.L((int)class005702.method_31604(i));
                for (int j = this.modifyExpressionValue$cdg000$lithium$lithiumRandomTick(0, class005542, n, n5, n8, n6); j < n; ++j) {
                    class04688 class046882;
                    n4 = 15;
                    n3 = n6;
                    n2 = n8;
                    int n9 = n5;
                    class047822 = this;
                    class07209 class072092 = this.redirect$blf000$lithium$redirectTickGetRandomPosInChunk(class047822, n9, n2, n3, n4);
                    class046432.N("randomTick");
                    class00500 class005002 = class005542.N(class072092.method_10263() - n5, class072092.method_10264() - n8, class072092.method_10260() - n6);
                    if (class005002.Q()) {
                        class06069 class060692 = this.field_9229;
                        class047822 = class072092;
                        class005002.y(this, this.modify$blf000$lithium$immutablePos((class07209)class047822), class060692);
                    }
                    if ((class046882 = class005002.Y()).M()) {
                        class06069 class060693 = this.field_9229;
                        class047822 = class072092;
                        class046882.N(this, this.modify$blf000$lithium$immutablePos2((class07209)class047822), class060693);
                    }
                    class046432.L();
                }
            }
        }
        class046432.L();
    }

    private void method_14189(class07209 class072092, class00891 class008912) {
        class00500 class005002 = this.method_8320(class072092);
        if (class005002.N(class008912)) {
            class005002.N(this, class072092, this.field_9229);
        }
    }

    public void method_14195() {
        this.field_24456.L(0);
        this.field_24456.y(false);
        this.field_24456.y(0);
        this.field_24456.N(false);
    }

    public void method_18765(BooleanSupplier booleanSupplier) {
        long l;
        int n;
        class04643 class046432 = class08700.N();
        this.field_13953 = true;
        this.m_handler$zhg000$fabric_lifecycle_events_v1$startWorldTick_36(booleanSupplier, null);
        class03106 class031062 = this.method_54719();
        boolean bl = class031062.Z();
        if (bl) {
            class046432.N("world border");
            this.method_8621().j();
            class046432.y("weather");
            this.method_39501();
            class046432.L();
        }
        if (this.field_28859.N(n = ((Integer)this.method_64395().N(class07305.V)).intValue()) && this.field_28859.N(n, this.field_18261)) {
            if (((Boolean)this.method_64395().N(class07305.N)).booleanValue()) {
                l = this.field_9232.L() + 24000L;
                this.method_29199(l - l % 24000L);
            }
            this.method_23660();
            if (((Boolean)this.method_64395().N(class07305.y)).booleanValue() && this.method_8419()) {
                this.method_14195();
            }
        }
        this.method_8533();
        if (bl) {
            this.method_29203();
        }
        class046432.N("tickPending");
        if (!this.method_27982() && bl) {
            l = this.N();
            class046432.N("blockTicks");
            this.field_13949.N(l, 65536, this::method_14189);
            class046432.y("fluidTicks");
            this.field_13951.N(l, 65536, this::method_14171);
            class046432.L();
        }
        class046432.y("raid");
        if (bl) {
            this.field_18811.N(this);
        }
        class046432.y("chunkSource");
        this.method_14178().N(booleanSupplier, true);
        class046432.y("blockEvents");
        if (bl) {
            this.method_14192();
        }
        this.field_13953 = false;
        class046432.L();
        boolean bl2 = this.field_24624.m();
        if (bl2) {
            this.method_14197();
        }
        if (bl) {
            ++this.field_13948;
        }
        if (this.field_13948 < 300) {
            class046432.N("entities");
            if (this.field_25142 != null && bl) {
                class046432.N("dragonFight");
                this.field_25142.L();
                class046432.L();
            }
            this.field_26934.N(class070492 -> {
                if (class070492.method_31481()) {
                    return;
                }
                if (class031062.N(class070492)) {
                    return;
                }
                class046432.N("checkDespawn");
                class070492.method_5982();
                class046432.L();
                if (!(class070492 instanceof class04770) && !this.field_24624.L.Z().L(class070492.method_31476().y())) {
                    return;
                }
                class07049 class070493 = class070492.method_5854();
                if (class070493 != null) {
                    if (class070493.method_31481() || !class070493.method_5626(class070492)) {
                        class070492.method_5848();
                    } else {
                        return;
                    }
                }
                class046432.N("tick");
                this.method_18472(this::method_18762, (class07049)class070492);
                class046432.L();
            });
            class046432.y("blockEntities");
            this.method_18471();
            class046432.L();
        }
        class046432.N("entityManagement");
        this.field_26935.y();
        class046432.L();
        class046432.N("debugSynchronizers");
        if (this.field_62841.y(class00429.P)) {
            this.field_38226.N(class072092 -> this.field_62841.y(class072092, class00429.P, class072092));
        } else {
            this.field_38226.N(null);
        }
        this.field_62841.N(this.field_13959.yV());
        class046432.L();
        this.method_75728().y();
        this.m_handler$zhg000$fabric_lifecycle_events_v1$endWorldTick_35(booleanSupplier, null);
    }

    public class07305 method_64395() {
        return this.field_24456.m();
    }

    public float method_76332(class07209 class072092) {
        class08165 class081652 = (class08165)this.field_64261.N(class00608.s, class072092);
        return class07376.U[class081652.N()];
    }

    public void method_18762(class07049 class070492) {
        class070492.method_22862();
        class04643 class046432 = class08700.N();
        ++class070492.field_6012;
        class046432.N(() -> class04206.M.y((Object)class070492.method_5864()).toString());
        class046432.R("tickNonPassenger");
        class070492.method_5773();
        class046432.L();
        for (class07049 class070493 : class070492.method_5685()) {
            this.method_18763(class070492, class070493);
        }
    }

    public class07052 method_8404(class07209 class072092) {
        long l = 0L;
        float f = 0.0f;
        class08050 class080502 = this.method_8402(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()), class00549.m, false);
        if (class080502 != null) {
            l = class080502.n();
            f = this.method_76332(class072092);
        }
        return new class07052(this.y(), this.method_8532(), l, f);
    }

    private void method_18763(class07049 class070492, class07049 class070493) {
        if (class070493.method_31481() || class070493.method_5854() != class070492) {
            class070493.method_5848();
            return;
        }
        if (!(class070493 instanceof class08036) && !this.field_26934.L(class070493)) {
            return;
        }
        class070493.method_22862();
        ++class070493.field_6012;
        class04643 class046432 = class08700.N();
        class046432.N(() -> class04206.M.y((Object)class070493.method_5864()).toString());
        class046432.R("tickPassenger");
        class070493.method_5842();
        class046432.L();
        for (class07049 class070494 : class070493.method_5685()) {
            this.method_18763(class070493, class070494);
        }
    }

    protected class07209 method_18210(class07209 class072092) {
        class07209 class072093 = this.N(class07830.field_13197, class072092);
        Optional<class07209> var3 = this.method_31418(class072093);
        if (var3.isPresent()) {
            return var3.get();
        }
        class00734 class007342 = class00734.N((class07209)class072093, (class07209)class072093.method_33096(this.method_31600() + 1)).M(3.0);
        List var5 = this.N(class07438.class, class007342, class074382 -> class074382.method_5805() && this.N_17(class074382.method_24515()));
        if (!var5.isEmpty()) {
            return ((class07438)var5.get(this.field_9229.y(var5.size()))).method_24515();
        }
        if (class072093.method_10264() == this.method_31607() - 1) {
            class072093 = class072093.method_10086(2);
        }
        return class072093;
    }

    private void method_33143() {
        if (!this.method_33144()) {
            return;
        }
        if (this.method_8503().No() && !this.method_8503().P()) {
            return;
        }
        int n = (Integer)this.method_64395().N(class07305.V);
        class05216 class052162 = this.field_28859.N(n) ? class00392.L((String)"sleep.skipping_night") : class00392.N((String)"sleep.players_sleeping", (Object[])new Object[]{this.field_28859.y(), this.field_28859.y(n)});
        Iterator<class04770> var3 = this.field_18261.iterator();
        while (var3.hasNext()) {
            var3.next().method_7353((class00392)class052162, true);
        }
    }

    public boolean method_14177() {
        return this.field_13953;
    }

    public void method_8408(class07209 class072092, class00891 class008912) {
        this.method_8452(class072092, class008912, class02752.N((class07299)this, null, null));
    }

    public void method_67503(class00570 class005702) {
        class07209 class072092;
        class07321 class073212 = class005702.R();
        boolean bl = this.method_8419();
        int n = class073212.i();
        int n2 = class073212.R();
        class04643 class046432 = class08700.N();
        class046432.N("thunder");
        if (bl && this.method_8546() && this.field_9229.y(100000) == 0 && this.method_8520(class072092 = this.method_18210(this.method_8536(n, 0, n2, 15)))) {
            class00682 class006822;
            boolean bl2;
            class07052 class070522 = this.method_8404(class072092);
            boolean bl3 = bl2 = (Boolean)this.method_64395().N(class07305.S) != false && this.field_9229.U() < (double)class070522.y() * 0.01 && !this.method_8320(class072092.method_10074()).N(class01210.Nz);
            if (bl2 && (class006822 = (class00682)class07078.yP.N((class07299)this, class06113.field_16467)) != null) {
                class006822.N(true);
                class006822.u(0);
                class006822.method_5814((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260());
                this.method_8649((class07049)class006822);
            }
            if ((class006822 = (class00672)class07078.NY.N((class07299)this, class06113.field_16467)) != null) {
                class006822.method_29495(class06889.L((class00753)class072092));
                class006822.N(bl2);
                this.method_8649((class07049)class006822);
            }
        }
        class046432.L();
    }

    private Optional<class07209> method_31418(class07209 class072093) {
        return this.method_19494().i(class035562 -> class035562.N(class03927.v), class072092 -> class072092.method_10264() == this.method_8624(class07830.field_13202, class072092.method_10263(), class072092.method_10260()) - 1, class072093, 128, class05372.field_18489).map(class072092 -> class072092.method_10086(1));
    }

    public class06394 method_14170() {
        return this.field_13959.yB();
    }

    public class05368 method_19494() {
        return this.method_14178().s();
    }

    public int method_8615() {
        return this.field_24624.U().R();
    }

    public void method_70635(class07209 class072092, class00500 class005002) {
        class00500 class005003 = this.method_8320(class072092);
        class00891 class008912 = class005003.i();
        if (!class005002.N(class008912)) {
            class005002.N(this, class072092, false);
        }
        this.method_8408(class072092, class005003.i());
        if (class005003.v()) {
            this.method_8455(class072092, class008912);
        }
    }

    public boolean method_33144() {
        return (Integer)this.method_64395().N(class07305.V) <= 100;
    }

    public void method_8448() {
        if (!this.field_18261.isEmpty() && this.field_28859.N(this.field_18261)) {
            this.method_33143();
        }
    }

    public void method_8465(@Nullable class07049 class070492, double d, double d2, double d3, class03556<class04891> class035562, class04911 class049112, float f, float f2, long l) {
        this.field_13959.Nm().N(class070492 instanceof class08036 ? (class08036)class070492 : null, d, d2, d3, (double)((class04891)class035562.N()).N(f), this.method_27983(), (class00381)new class08073(class035562, class049112, d, d2, d3, f, f2, l));
    }

    public void method_18770(class04770 class047702, class07062 class070622) {
        class047702.method_5650(class070622);
    }

    private void method_14188(boolean bl) {
        if (this.field_25142 != null) {
            this.field_13959.yn().N(this.field_25142.y());
        }
        class00408 class004082 = this.method_14178().P();
        if (bl) {
            class004082.y();
        } else {
            class004082.N();
        }
    }

    public void method_8517(int n, class07209 class072092, int n2) {
        for (class04770 class047702 : this.field_13959.Nm().v()) {
            double d;
            double d2;
            double d3;
            if (class047702.method_51469() != this || class047702.method_5628() == n || !((d3 = (double)class072092.method_10263() - class047702.method_23317()) * d3 + (d2 = (double)class072092.method_10264() - class047702.method_23318()) * d2 + (d = (double)class072092.method_10260() - class047702.method_23321()) * d < 1024.0)) continue;
            class047702.field_13987.method_14364((class00381)new class07265(n, class072092, n2));
        }
    }

    public @Nullable class04770 method_18779() {
        List<class04770> var1 = this.method_18766(class07438::method_5805);
        if (var1.isEmpty()) {
            return null;
        }
        return var1.get(this.field_9229.y(var1.size()));
    }

    public void method_8508(class07209 class072092, class00891 class008912, class07211 class072112, @Nullable class02733 class027332) {
        this.field_38226.N(class072092, class008912, class072112, class027332);
    }

    public boolean method_8505(class07049 class070492, class07209 class072092) {
        class08036 class080362;
        return !(class070492 instanceof class08036) || !this.field_13959.N(this, class072092, class080362 = (class08036)class070492) && this.method_8621().N(class072092);
    }

    public void method_14176(@Nullable class05030 class050302, boolean bl, boolean bl2) {
        class04751 class047512 = this.method_14178();
        if (bl2) {
            return;
        }
        if (class050302 != null) {
            class050302.N((class00392)class00392.L((String)"menu.savingLevel"));
        }
        this.method_14188(bl);
        if (class050302 != null) {
            class050302.L((class00392)class00392.L((String)"menu.savingChunks"));
        }
        class047512.y(bl);
        if (bl) {
            this.field_26935.u();
        } else {
            this.field_26935.L();
        }
    }

    public void method_8492(class07209 class072092, class00891 class008912, @Nullable class02733 class027332) {
        this.field_38226.N(class072092, class008912, class027332);
    }

    public List<? extends class00690> method_18776() {
        return this.method_18198((class01128)class07078.f, (Predicate)class07438::method_5805);
    }

    public boolean method_18768(class07049 class070492) {
        return this.method_14175(class070492);
    }

    public int method_32819() {
        return this.method_8597().z();
    }

    public void method_41410(class00500 class005002, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        this.field_38226.N(class005002, class072092, class008912, class027332, bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void method_8413(class07209 class072092, class00500 class005002, class00500 class005003, int n) {
        String string;
        if (this.field_36317) {
            string = "recursive call to sendBlockUpdated";
            class07536.N((String)"recursive call to sendBlockUpdated", (Throwable)new IllegalStateException("recursive call to sendBlockUpdated"));
        }
        this.method_14178().N(class072092);
        this.field_49172.N(class072092);
        string = class005002.M((class07290)this, class072092);
        class00494 class004942 = class005003.M((class07290)this, class072092);
        if (!class00389.L((class00494)string, (class00494)class004942, (class07003)class07003.M)) {
            return;
        }
        ObjectArrayList objectArrayList = new ObjectArrayList();
        this.handler$bpd000$lithium$updateActiveListeners(class072092, class005002, class005003, n, null, (class00494)string, class004942, (List)objectArrayList);
        Set<class07079> var12 = this.field_26932;
        Iterator iterator = this.redirect$bpd000$lithium$getActiveListeners(var12);
        while (iterator.hasNext()) {
            class07079 class070792 = (class07079)iterator.next();
            class07623 class076232 = class070792.f();
            if (!class076232.y(class072092)) continue;
            objectArrayList.add(class076232);
        }
        try {
            this.field_36317 = true;
            for (class07079 class070792 : objectArrayList) {
                class070792.B();
            }
        }
        finally {
            this.field_36317 = false;
        }
    }

    public List<class04770> method_18766(Predicate<? super class04770> predicate) {
        return this.method_47540(predicate, Integer.MAX_VALUE);
    }

    private boolean method_14175(class07049 class070492) {
        if (class070492.method_31481()) {
            field_13952.warn("Tried to add entity {} but it was marked as removed already", (Object)class07078.N((class07078)class070492.method_5864()));
            return false;
        }
        return this.field_26935.N((class01135)class070492);
    }

    public List<class04770> method_47540(Predicate<? super class04770> predicate, int n) {
        ArrayList arrayList = Lists.newArrayList();
        for (class04770 class047702 : this.field_18261) {
            if (!predicate.test(class047702)) continue;
            arrayList.add(class047702);
            if (arrayList.size() < n) continue;
            return arrayList;
        }
        return arrayList;
    }

    protected class01124<class07049> method_31592() {
        return this.field_26935.i();
    }

    public void method_8449(@Nullable class07049 class070492, class07049 class070493, class03556<class04891> class035562, class04911 class049112, float f, float f2, long l) {
        this.field_13959.Nm().N(class070492 instanceof class08036 ? (class08036)class070492 : null, class070493.method_23317(), class070493.method_23318(), class070493.method_23321(), (double)((class04891)class035562.N()).N(f), this.method_27983(), (class00381)new class08062(class035562, class049112, class070493, f, f2, l));
    }

    public void method_8444(@Nullable class07049 class070492, int n, class07209 class072092, int n2) {
        this.field_13959.Nm().N(class070492 instanceof class08036 ? (class08036)class070492 : null, (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), 64.0, this.method_27983(), (class00381)new class00516(n, class072092, n2, false));
    }

    public void method_8452(class07209 class072092, class00891 class008912, @Nullable class02733 class027332) {
        this.field_38226.N(class072092, class008912, null, class027332);
    }

    public void method_8454(@Nullable class07049 class070492, @Nullable class07072 class070722, @Nullable class01284 class012842, double d, double d2, double d3, float f, boolean bl, class07328 class073282, class07126 class071262, class07126 class071263, class04540<class00931> class045402, class03556<class04891> class035562) {
        class07302 class073022 = switch (class073282) {
            default -> throw new MatchException(null, null);
            case class07328.field_40888 -> class07302.field_40878;
            case class07328.field_40889 -> this.method_61270((class06839<Boolean>)class07305.i);
            case class07328.field_40890 -> {
                if (((Boolean)this.method_64395().N(class07305.I)).booleanValue()) {
                    yield this.method_61270((class06839<Boolean>)class07305.g);
                }
                yield class07302.field_40878;
            }
            case class07328.field_40891 -> this.method_61270((class06839<Boolean>)class07305.Ni);
            case class07328.field_51779 -> class07302.field_47331;
        };
        class06889 class068892 = new class06889(d, d2, d3);
        class02756 class027562 = new class02756(this, class070492, class070722, class012842, class068892, f, bl, class073022);
        int n = class027562.Z();
        class07126 class071264 = class027562.E() ? class071262 : class071263;
        for (class04770 class047702 : this.field_18261) {
            if (!(class047702.method_5707(class068892) < 4096.0)) continue;
            Optional<class06889> optional = Optional.ofNullable((class06889)class027562.z().get((Object)class047702));
            class047702.field_13987.method_14364((class00381)new class00520(class068892, f, n, optional, class071264, class035562, class045402));
        }
    }

    private void method_18771(class04770 class047702) {
        class07049 class070492 = this.method_66347(class047702.method_5667());
        if (class070492 != null) {
            field_13952.warn("Force-added player with duplicate UUID {}", (Object)class047702.method_5667());
            class070492.method_18375();
            this.method_18770((class04770)class070492, class07062.field_26999);
        }
        this.field_26935.N((class01135)class047702);
    }

    public boolean method_30736(class07049 class070492) {
        if (class070492.method_24204().map(class07049::method_5667).anyMatch(arg_0 -> this.field_26935.N(arg_0))) {
            return false;
        }
        this.y(class070492);
        return true;
    }

    public void method_18215(class04770 class047702) {
        this.method_18771(class047702);
    }

    public <T extends class07049> void method_47538(class01128<class07049, T> class011282, Predicate<? super T> predicate, List<? super T> list) {
        this.method_47539(class011282, predicate, list, Integer.MAX_VALUE);
    }

    public void method_18764(class00570 class005702) {
        class005702.q();
        class005702.L(this);
        this.field_62841.N(class005702.R());
    }

    public <T extends class07049> List<? extends T> method_18198(class01128<class07049, T> class011282, Predicate<? super T> predicate) {
        ArrayList arrayList = Lists.newArrayList();
        this.method_47538(class011282, predicate, arrayList);
        return arrayList;
    }

    public <T extends class07049> void method_47539(class01128<class07049, T> class011282, Predicate<? super T> predicate, List<? super T> list, int n) {
        this.method_31592().N(class011282, class070492 -> {
            if (predicate.test(class070492)) {
                list.add((Object)class070492);
                if (list.size() >= n) {
                    return class04218.field_41284;
                }
            }
            return class04218.field_41283;
        });
    }

    public void method_8474(int n, class07209 class072092, int n2) {
        if (((Boolean)this.method_64395().N(class07305.T)).booleanValue()) {
            this.field_13959.Nm().v().forEach(class047702 -> {
                class06889 class068892;
                if (class047702.method_51469() == this) {
                    class06889 class068893 = class06889.y((class00753)class072092);
                    if (class047702.method_5707(class068893) < (double)class04995.Z((int)32)) {
                        class068892 = class068893;
                    } else {
                        class06889 class068894 = class068893.u(class047702.method_73189()).u();
                        class068892 = class047702.method_73189().i(class068894.L(32.0));
                    }
                } else {
                    class068892 = class047702.method_73189();
                }
                class047702.field_13987.method_14364((class00381)new class00516(n, class07209.method_49638((class00737)class068892), n2, true));
            });
        } else {
            this.method_8444(null, n, class072092, n2);
        }
    }

    public void method_18213(class04770 class047702) {
        this.method_18771(class047702);
    }

    public void method_8421(class07049 class070492, byte by) {
        this.method_14178().N(class070492, (class00381<? super class07280>)new class00509(class070492, by));
    }

    public void method_48760(class07049 class070492, class07072 class070722) {
        this.method_14178().N(class070492, (class00381<? super class07280>)new class01938(class070492, class070722));
    }

    public Collection<class00695> method_65097() {
        return this.field_26933.values();
    }

    public void method_66016(class07209 class072092, class00500 class005002, class00500 class005003) {
        Optional var5;
        Optional var4 = class03927.N((class00500)class005002);
        if (Objects.equals(var4, var5 = class03927.N((class00500)class005003))) {
            return;
        }
        class07209 class072093 = class072092.method_10062();
        var4.ifPresent(class035562 -> this.method_8503().execute(() -> {
            this.method_19494().N(class072093);
            this.field_62841.L(class072093);
        }));
        var5.ifPresent(class035562 -> this.method_8503().execute(() -> {
            class05377 class053772 = this.method_19494().N(class072093, class035562);
            if (class053772 != null) {
                this.field_62841.N(class053772);
            }
        }));
    }

    @Deprecated
    public @Nullable class07049 method_31424(int n) {
        class07049 class070492 = (class07049)this.method_31592().N(n);
        if (class070492 != null) {
            return class070492;
        }
        return (class07049)this.field_26933.get(n);
    }

    public class04312<class04651> method_14179() {
        return this.field_13951;
    }

    public boolean method_8458() {
        return this.field_13957;
    }

    public class04312<class00891> method_14196() {
        return this.field_13949;
    }

    public @Nullable class07769 method_17891(class02265 class022652) {
        return (class07769)this.method_8503().NY().method_17983().y(class07769.N((class02265)class022652));
    }

    public void method_17890(class02265 class022652, class07769 class077692) {
        this.method_8503().NY().method_17983().N(class07769.N((class02265)class022652), (class06555)class077692);
    }

    public class02265 method_17889() {
        return ((class06149)this.method_8503().NY().method_17983().N(class06149.y)).N();
    }

    public LongSet method_17984() {
        return this.field_24624.u();
    }

    public class06482 method_64577() {
        return this.field_13959.yM();
    }

    public <T extends class07126> int method_14199(T t, boolean bl, boolean bl2, double d, double d2, double d3, int n, double d4, double d5, double d6, double d7) {
        class00495 class004952 = new class00495(t, bl, bl2, d, d2, d3, (float)d4, (float)d5, (float)d6, (float)d7, n);
        int n2 = 0;
        for (int i = 0; i < this.field_18261.size(); ++i) {
            class04770 class047702 = this.field_18261.get(i);
            if (!this.method_14191(class047702, bl, d, d2, d3, (class00381<?>)class004952)) continue;
            ++n2;
        }
        return n2;
    }

    public void method_8427(class07209 class072092, class00891 class008912, int n, int n2) {
        this.field_13950.add((Object)new class07303(class072092, class008912, n, n2));
    }

    public @Nullable class08036 method_73285(UUID uUID) {
        return this.method_8503().Nm().y(uUID);
    }

    public @Nullable Pair<class07209, class03556<class00780>> method_42108(Predicate<class03556<class00780>> predicate, class07209 class072092, int n, int n2, int n3) {
        return this.method_14178().U().u().N(class072092, n, n2, n3, predicate, this.method_14178().W().y(), (class05487)this);
    }

    public boolean method_17988(int n, int n2, boolean bl) {
        boolean bl2 = this.field_24624.N(new class07321(n, n2), bl);
        if (bl && bl2) {
            this.method_8497(n, n2);
        }
        return bl2;
    }

    public boolean method_19500(class07209 class072092) {
        return this.method_19497(class072092, 1);
    }

    public @Nullable class07049 method_8469(int n) {
        return (class07049)this.method_31592().N(n);
    }

    public @Nullable class07049 method_73284(UUID uUID) {
        class07049 class070492 = this.method_66347(uUID);
        if (class070492 != null) {
            return class070492;
        }
        for (class04782 class047822 : this.method_8503().NO()) {
            class07049 class070493;
            if (class047822 == this || (class070493 = class047822.method_66347(uUID)) == null) continue;
            return class070493;
        }
        return null;
    }

    private boolean method_14174(class07303 class073032) {
        class00500 class005002 = this.method_8320(class073032.N());
        if (class005002.N(class073032.y())) {
            return class005002.N((class07299)this, class073032.N(), class073032.L(), class073032.u());
        }
        return false;
    }

    public boolean method_20588(class01296 class012962) {
        return this.method_19500(class012962.U());
    }

    public int method_19498(class01296 class012962) {
        return this.method_19494().N(class012962);
    }

    public boolean method_19497(class07209 class072092, int n) {
        if (n > 6) {
            return false;
        }
        return this.method_19498(class01296.N((class07209)class072092)) <= n;
    }

    public class00770 method_14173() {
        return this.field_13956;
    }

    public <T extends class07126> boolean method_14166(class04770 class047702, T t, boolean bl, boolean bl2, double d, double d2, double d3, int n, double d4, double d5, double d6, double d7) {
        class00495 class004952 = new class00495(t, bl, bl2, d, d2, d3, (float)d4, (float)d5, (float)d6, (float)d7, n);
        return this.method_14191(class047702, bl, d, d2, d3, (class00381<?>)class004952);
    }

    public void method_27873(class05042 class050422) {
        this.method_8503().N(class050422);
    }

    public class01224 method_14183() {
        return this.field_13959.yv();
    }

    public @Nullable class07209 method_8487(class03530<class04748> class035302, class07209 class072092, int n, boolean bl) {
        if (!this.field_13959.yn().l().u()) {
            return null;
        }
        Optional optional = this.method_30349().L(class04227.yj).N(class035302);
        if (optional.isEmpty()) {
            return null;
        }
        Pair var6 = this.method_14178().U().N(this, (class03543)optional.get(), class072092, n, bl);
        return var6 != null ? (class07209)var6.getFirst() : null;
    }

    private class07302 method_61270(class06839<Boolean> class068392) {
        return (Boolean)this.method_64395().N(class068392) != false ? class07302.field_40879 : class07302.field_18687;
    }

    public final boolean method_14191(class04770 class047702, boolean bl, double d, double d2, double d3, class00381<?> class003812) {
        if (class047702.method_51469() != this) {
            return false;
        }
        if (class047702.method_24515().method_19769((class00737)new class06889(d, d2, d3), bl ? 512.0 : 32.0)) {
            class047702.field_13987.method_14364(class003812);
            return true;
        }
        return false;
    }

    public class04868 method_19495() {
        return this.field_18811;
    }

    public class07074 method_8538(class07080 class070802) {
        class07074 class070742 = super.method_8538(class070802);
        class070742.N("Loaded entity count", () -> String.valueOf(this.field_26935.M()));
        return class070742;
    }

    public @Nullable class04877 method_19502(class07209 class072092) {
        return this.field_18811.N(class072092, 9216);
    }

    public void method_19496(class05354 class053542, class07049 class070492, class01329 class013292) {
        class013292.N(class053542, class070492);
    }

    public boolean method_19503(class07209 class072092) {
        return this.method_19502(class072092) != null;
    }

    private void method_21626(Writer writer) throws IOException {
        class04594 class045942 = class04594.N().N("x").N("y").N("z").N("type").N(writer);
        Iterator var3 = this.field_27082.iterator();
        while (var3.hasNext()) {
            class01099 class010992;
            class01099 class010993 = class010992 = (class01099)var3.next();
            class07209 class072092 = this.redirect$cca000$lithium$getPosOrOrigin(class010993);
            class045942.N(new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class010992.method_31706()});
        }
    }

    public float method_24852(class07211 class072112, boolean bl) {
        return 1.0f;
    }

    public boolean method_28125() {
        return this.field_13959.yn().d();
    }

    public void method_39778(class08050 class080502) {
        this.field_13959.execute(() -> this.field_36208.N(class080502.R(), class080502.M()));
    }

    public void method_39223(class00570 class005702) {
        class005702.u(this.N());
    }

    public void method_23658(class05163 class051632) {
        this.field_13950.removeIf(class073032 -> class051632.y((class00753)class073032.N()));
    }

    public class04782 method_8410() {
        return this;
    }

    public String method_31268() {
        return String.format(Locale.ROOT, "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s", this.field_18261.size(), this.field_26935.R(), class04782.method_31270(this.field_26935.i().N(), class070492 -> class04206.M.y((Object)class070492.method_5864()).toString()), this.field_27082.size(), class04782.method_31270(this.field_27082, class01099::method_31706), this.method_14196().N(), this.method_14179().N(), this.method_31419());
    }

    private static <T> String method_31270(Iterable<T> iterable, Function<T, String> function) {
        try {
            Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
            for (T t : iterable) {
                String string = function.apply(t);
                object2IntOpenHashMap.addTo((Object)string, 1);
            }
            return object2IntOpenHashMap.object2IntEntrySet().stream().sorted(Comparator.comparing(Object2IntMap.Entry::getIntValue).reversed()).limit(5L).map(entry -> (String)entry.getKey() + ":" + entry.getIntValue()).collect(Collectors.joining(","));
        }
        catch (Exception exception) {
            return "";
        }
    }

    public String method_31419() {
        return "Chunks[S] W: " + this.field_24624.N() + " E: " + this.field_26935.R();
    }

    public void method_21625(Path path) throws IOException {
        Object object3;
        Object object2;
        class06265 class062652 = this.method_14178().L;
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path.resolve("stats.txt"), new OpenOption[0]);){
            bufferedWriter.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", class062652.Z().N()));
            object2 = this.method_14178().b();
            if (object2 != null) {
                for (Object object3 : object2.y().object2IntEntrySet()) {
                    bufferedWriter.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((class07428)object3.getKey()).N(), object3.getIntValue()));
                }
            }
            bufferedWriter.write(String.format(Locale.ROOT, "entities: %s\n", this.field_26935.R()));
            bufferedWriter.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.field_27082.size()));
            bufferedWriter.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.method_14196().N()));
            bufferedWriter.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.method_14179().N()));
            bufferedWriter.write("distance_manager: " + class062652.Z().L() + "\n");
            bufferedWriter.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.method_14178().z()));
        }
        bufferedWriter = new class07080("Level dump", (Throwable)new Exception("dummy"));
        this.method_8538((class07080)bufferedWriter);
        object2 = Files.newBufferedWriter(path.resolve("example_crash.txt"), new OpenOption[0]);
        try {
            ((Writer)object2).write(bufferedWriter.N(class02587.L));
        }
        finally {
            if (object2 != null) {
                ((Writer)object2).close();
            }
        }
        object2 = path.resolve("chunks.csv");
        try (Object object4 = Files.newBufferedWriter((Path)object2, new OpenOption[0]);){
            class062652.N((Writer)object4);
        }
        object4 = path.resolve("entity_chunks.csv");
        object3 = Files.newBufferedWriter((Path)object4, new OpenOption[0]);
        try {
            this.field_26935.N((Writer)object3);
        }
        finally {
            if (object3 != null) {
                ((Writer)object3).close();
            }
        }
        object3 = path.resolve("entities.csv");
        try (Object object5 = Files.newBufferedWriter((Path)object3, new OpenOption[0]);){
            class04782.method_21624((Writer)object5, this.method_31592().N());
        }
        object5 = path.resolve("block_entities.csv");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter((Path)object5, new OpenOption[0]);){
            this.method_21626(bufferedWriter);
        }
    }

    public void method_31423(Stream<class07049> stream) {
        this.field_26935.N(stream);
    }

    public void method_31426(Stream<class07049> stream) {
        this.field_26935.y(stream);
    }

    public long method_8412() {
        return this.field_13959.yn().l().L();
    }

    public @Nullable class07856 method_29198() {
        return this.field_25142;
    }

    private static void method_21624(Writer writer, Iterable<class07049> iterable) throws IOException {
        class04594 class045942 = class04594.N().N("x").N("y").N("z").N("uuid").N("type").N("alive").N("display_name").N("custom_name").N(writer);
        for (class07049 class070492 : iterable) {
            class00392 class003922 = class070492.method_5797();
            class00392 class003923 = class070492.method_5476();
            class045942.N(new Object[]{class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), class070492.method_5667(), class04206.M.y((Object)class070492.method_5864()), class070492.method_5805(), class003923.getString(), class003922 != null ? class003922.getString() : null});
        }
    }

    public void method_72270(class07321 class073212, int n) {
        List var3 = class07321.N((class07321)class073212, (int)n).toList();
        this.field_13959.y(() -> {
            this.field_26935.N();
            for (class07321 class073212 : var3) {
                if (this.method_37116(class073212.y())) continue;
                return false;
            }
            return true;
        });
    }

    public Iterable<class07049> method_27909() {
        return this.method_31592().N();
    }

    public class02703 method_57133() {
        return this.field_49172;
    }

    public boolean method_74999() {
        return (Boolean)this.method_64395().N(class07305.H);
    }

    public /* synthetic */ class04298 method_8397() {
        return this.method_14196();
    }

    public boolean method_37116(long l) {
        return this.field_26935.N(l);
    }

    public boolean method_37118(class07209 class072092) {
        return this.field_26935.N(class072092) && this.field_24624.L.Z().L(class07321.N((class07209)class072092));
    }

    public class06511 method_59547() {
        return this.field_13959.yo();
    }

    public boolean method_67504(class07321 class073212) {
        return this.field_24624.L.y(class073212);
    }

    public boolean method_74962() {
        return this.method_8401().s() != class07086.field_5801 && (Boolean)this.method_64395().N(class07305.S) != false && (Boolean)this.method_64395().N(class07305.x) != false;
    }

    public /* synthetic */ class00272 method_8433() {
        return this.method_64577();
    }

    public boolean method_66588(class07321 class073212) {
        return this.field_26935.N(class073212) && this.field_26935.N(class073212.y());
    }

    public /* synthetic */ class00611 method_75598() {
        return this.method_75728();
    }

    public class03767 method_45162() {
        return this.field_13959.yn().K();
    }

    public class06069 method_51836(class01894 class018942) {
        return this.field_44857.N(class018942, this.method_8412());
    }

    public boolean method_75001() {
        return (Boolean)this.method_64395().N(class07305.C);
    }

    public void method_71970(class00394 class003942) {
        super.method_71970(class003942);
        this.field_62841.N(class003942);
    }

    public class02755 method_61269() {
        return this.field_13959.yq();
    }

    public boolean method_67505(class07321 class073212) {
        return this.field_26935.y(class073212) && this.method_8621().N(class073212);
    }

    public boolean method_76058(class07209 class072092) {
        int n = (Integer)this.method_64395().N(class07305.m);
        return n == -1 || this.field_24624.L.N(class072092, n);
    }

    public /* synthetic */ class08050 method_8392(int n, int n2) {
        return super.method_8497(n, n2);
    }

    public class03470 method_52168() {
        return this.field_44857;
    }

    public /* synthetic */ class04298 method_8405() {
        return this.method_14179();
    }

    public /* synthetic */ class00558 method_8398() {
        return this.method_14178();
    }

    public boolean method_67506(class07209 class072092) {
        return this.method_67504(new class07321(class072092));
    }

    public boolean method_75000() {
        return (Boolean)this.method_64395().N(class07305.R);
    }

    public /* synthetic */ class01104 getEntityManager() {
        return this.field_26935;
    }

    private void handler$bpd000$lithium$updateActiveListeners(class07209 class072092, class00500 class005002, class00500 class005003, int n, CallbackInfo callbackInfo, class00494 class004942, class00494 class004943, List list) {
        for (class07623 class076232 : ((LithiumData)this).lithium$getData().activeNavigations()) {
            if (!class076232.y(class072092)) continue;
            list.add(class076232);
        }
    }

    private void m_handler$zcp000$fabric_data_attachment_api_v1$createAttachmentsPersistentState_44(CallbackInfo callbackInfo) {
        class04782 class047822 = this;
        class08413 class084132 = new class08413("fabric_attachments", () -> new AttachmentPersistentState(class047822), AttachmentPersistentState.codec((class04782)class047822), null);
        class047822.method_17983().N(class084132);
    }

    private int modifyExpressionValue$cdg000$lithium$lithiumRandomTick(int n, class00554 class005542, int n2, int n3, int n4, int n5) {
        short s = ((BlockCountingSection)class005542).lithium$getCount(BlockStateFlags.RANDOM_TICKING);
        if (s <= 384) {
            for (int i = 0; i < n2; ++i) {
                int n6 = this.getRandomBlockIndexForRandomTick();
                if (n6 >= s) continue;
                RandomTickingSectionDataHelper.randomTickNthBlock((class00554)class005542, (int)n6, (byte[])((LithiumSectionData)class005542).lithium$getSectionData().getRandomTickableBlocksByY(), (class04782)this, (int)n3, (int)n4, (int)n5, (class06069)this.field_9229);
                s = ((BlockCountingSection)class005542).lithium$getCount(BlockStateFlags.RANDOM_TICKING);
            }
            return n2;
        }
        return n;
    }

    public class01042 fabric_getDynamicRegistryManager() {
        return this.method_30349();
    }

    private void handler$bpd000$lithium$init(class02796 class027962, Executor executor, class04785 class047852, class05212 class052122, class05946 class059462, class01255 class012552, boolean bl, long l, List list, boolean bl2, class03470 class034702, CallbackInfo callbackInfo) {
        this.field_26932 = new ReferenceOpenHashSet(this.field_26932);
    }

    private class07209 modify$blf000$lithium$immutablePos(class07209 class072092) {
        return class072092.method_10062();
    }

    public void lithium$setNavigationInactive(class07079 class070792) {
        ((LithiumData)this).lithium$getData().activeNavigations().remove((Object)((NavigatingEntity)class070792).lithium$getRegisteredNavigation());
    }

    public boolean areEntityNavigationsConsistent() {
        ReferenceOpenHashSet var1 = ((LithiumData)this).lithium$getData().activeNavigations();
        int n = 0;
        for (class07079 class070792 : this.field_26932) {
            class07623 class076232 = class070792.f();
            if ((class076232.Z() != null && ((NavigatingEntity)class070792).lithium$isRegisteredToWorld()) != var1.contains((Object)class076232)) {
                return false;
            }
            if (class076232.Z() == null) continue;
            ++n;
        }
        return var1.size() == n;
    }

    private int getRandomBlockIndexForRandomTick() {
        this.field_9256 = this.field_9256 * 3 + 1013904223;
        int n = this.field_9256 >> 2;
        return n & 0xF | n >> 8 & 0xF00 | n >> 4 & 0xF0;
    }

    public void lithium$setNavigationActive(class07079 class070792) {
        ((LithiumData)this).lithium$getData().activeNavigations().add((Object)((NavigatingEntity)class070792).lithium$getRegisteredNavigation());
    }
}

