/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  jerozgen.languagereload.access.ILanguage
 *  jerozgen.languagereload.access.ITranslationStorage
 *  jerozgen.languagereload.config.Config
 *  minecraft.class00003
 *  minecraft.class00077
 *  minecraft.class00282
 *  minecraft.class00311
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01756
 *  minecraft.class01929
 *  minecraft.class03530
 *  minecraft.class04227
 *  minecraft.class05287
 *  minecraft.class05946
 *  minecraft.class06497
 *  minecraft.class06524
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class07018
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08429
 *  minecraft.class08658
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import jerozgen.languagereload.access.ILanguage;
import jerozgen.languagereload.access.ITranslationStorage;
import jerozgen.languagereload.config.Config;
import minecraft.class00003;
import minecraft.class00077;
import minecraft.class00282;
import minecraft.class00311;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01756;
import minecraft.class01929;
import minecraft.class03530;
import minecraft.class04227;
import minecraft.class05287;
import minecraft.class05946;
import minecraft.class06497;
import minecraft.class06524;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class07018;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08429;
import minecraft.class08658;
import minecraft.class08683;

public class class08666 {
    private static final class08683 N = new class08683();
    private static final class08683 y = new class08683();
    private static final class08683 L = new class08683();
    private CompletableFuture<class00077<class06584>> u = CompletableFuture.completedFuture(class00077.N());
    private CompletableFuture<class00077<class06584>> i = CompletableFuture.completedFuture(class00077.N());
    private CompletableFuture<class00077<class05287>> R = CompletableFuture.completedFuture(class00077.N());
    private final Map<class08683, Runnable> M = new IdentityHashMap<class08683, Runnable>();

    public class00077<class06584> L() {
        return this.i.join();
    }

    public class00077<class06584> u() {
        return this.u.join();
    }

    public class00077<class05287> y() {
        return this.R.join();
    }

    private static List N(class06584 class065842, class06591 class065912, class08036 class080362, class06497 class064972, Operation operation) {
        List list = (List)operation.call(new Object[]{class065842, class065912, class080362, class064972});
        if (Config.getInstance() == null) {
            return list;
        }
        if (!Config.getInstance().multilingualItemSearch) {
            return list;
        }
        class07018 class070182 = class07018.y();
        if (class070182 == null) {
            return list;
        }
        class08429 class084292 = ((ILanguage)class070182).languagereload_getTranslationStorage();
        if (class084292 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (String string : Config.getInstance().fallbacks) {
            ((ITranslationStorage)class084292).languagereload_setTargetLanguage(string);
            ((List)operation.call(new Object[]{class065842, class065912, class080362, class064972})).stream().map(class00392::getString).map(class00392::y).forEach(arrayList::add);
        }
        ((ITranslationStorage)class084292).languagereload_setTargetLanguage(null);
        return arrayList;
    }

    private static /* synthetic */ class00077 N(class06591 class065912, class06497 class064972, List list) {
        return new class08658(class065842 -> class08666.N(Stream.of(class065842), class065912, class064972), class065842 -> class065842.Z().i().map(class05946::N).stream(), list);
    }

    public void N(class01929 class019292, List<class06584> list) {
        this.N(y, () -> {
            class06591 class065912 = class06591.N((class01929)class019292);
            class06524 class065242 = class06524.N.L();
            CompletableFuture<class00077<class06584>> var5 = this.u;
            this.u = CompletableFuture.supplyAsync(() -> class08666.N(class065912, (class06497)class065242, list), class07536.B());
            var5.cancel(true);
        });
    }

    public void N() {
        Iterator<Runnable> var1 = this.M.values().iterator();
        while (var1.hasNext()) {
            var1.next().run();
        }
    }

    public void N(List<class06584> list) {
        this.N(L, () -> {
            CompletableFuture<class00077<class06584>> var2 = this.i;
            this.i = CompletableFuture.supplyAsync(() -> new class00003(class065842 -> class065842.z().map(class03530::y), list), class07536.B());
            var2.cancel(true);
        });
    }

    public void N(class01756 class017562, class07299 class072992) {
        this.N(N, () -> {
            List var3 = class017562.L();
            class01042 class010422 = class072992.method_30349();
            class00751 class007512 = class010422.L(class04227.F);
            class06591 class065912 = class06591.N((class01929)class010422);
            class00311 class003112 = class00282.N((class07299)class072992);
            class06524 class065242 = class06524.N;
            CompletableFuture<class00077<class05287>> var9 = this.R;
            this.R = CompletableFuture.supplyAsync(() -> class08666.N(class003112, class065912, (class06497)class065242, class007512, var3), class07536.B());
            var9.cancel(true);
        });
    }

    private static /* synthetic */ class00077 N(class00311 class003112, class06591 class065912, class06497 class064972, class00751 class007512, List list) {
        return new class08658(class052872 -> class08666.N(class052872.L().stream().flatMap(class002952 -> class002952.N(class003112).stream()), class065912, class064972), class052872 -> class052872.L().stream().flatMap(class002952 -> class002952.N(class003112).stream()).map(class065842 -> class007512.y((Object)class065842.B())), list);
    }

    private static Stream<String> N(Stream<class06584> stream, class06591 class065912, class06497 class064972) {
        return stream.flatMap(class065842 -> class08666.N(class065842, class065912, null, class064972, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)4, (String)"[net.minecraft.class_1799, net.minecraft.class_1792$class_9635, net.minecraft.class_1657, net.minecraft.class_1836]");
            Object[] objectArray2 = objectArray;
            return ((class06584)objectArray[0]).N((class06591)objectArray2[1], (class08036)objectArray2[2], (class06497)objectArray2[3]);
        }).stream()).map(class003922 -> class06541.N((String)class003922.getString()).trim()).filter(string -> !string.isEmpty());
    }

    private void N(class08683 class086832, Runnable runnable) {
        runnable.run();
        this.M.put(class086832, runnable);
    }
}

