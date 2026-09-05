/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class01997
 *  minecraft.class03719
 *  minecraft.class04227
 *  minecraft.class04476
 *  minecraft.class07135
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CompletableFuture;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class01997;
import minecraft.class03719;
import minecraft.class04227;
import minecraft.class04476;
import minecraft.class06872;
import minecraft.class06903;
import minecraft.class07135;

public abstract class class06880
implements class07135 {
    private final class01996 field_53723;
    private final CompletableFuture<class01929> field_53724;

    public class06880(class01996 class019962, CompletableFuture<class01929> completableFuture) {
        this.field_53723 = class019962;
        this.field_53724 = completableFuture;
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return this.field_53724.thenCompose(class019292 -> {
            class01997 class019972 = this.field_53723.method_60917(class04227.yV);
            class01997 class019973 = this.field_53723.method_60917(class04227.yK);
            HashSet hashSet = Sets.newHashSet();
            ArrayList arrayList = new ArrayList();
            class06872 class068722 = new class06872(this, hashSet, arrayList, class044762, (class01929)class019292, class019972, class019973);
            this.method_62766((class01929)class019292, class068722).N();
            return CompletableFuture.allOf((CompletableFuture[])arrayList.toArray(CompletableFuture[]::new));
        });
    }

    protected abstract class06903 method_62766(class01929 var1, class03719 var2);
}

