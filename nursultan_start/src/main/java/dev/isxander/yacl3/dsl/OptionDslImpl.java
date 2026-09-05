/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.Option$Builder
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionDescription$Builder
 *  dev.isxander.yacl3.api.OptionEventListener
 *  dev.isxander.yacl3.api.OptionFlag
 *  dev.isxander.yacl3.api.StateManager
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  dev.isxander.yacl3.dsl.ExtensionsKt
 *  dev.isxander.yacl3.dsl.OptionDsl
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.api.OptionFlag;
import dev.isxander.yacl3.api.StateManager;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.dsl.ExtensionsKt;
import dev.isxander.yacl3.dsl.OptionDsl;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import minecraft.class00392;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012JV\u0010\u0018\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032 \b\u0001\u0010\u0017\u001a\u001a\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u00000\u0013\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u00ac\u0001\u0010\u001d\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032v\b\u0001\u0010\u001c\u001ap\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00130\u0013 \u0014*6\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00130\u00130\u001b\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u00160\u001a\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001eJ<\u0010 \u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001\u00a2\u0006\u0004\b \u0010!JV\u0010#\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032 \b\u0001\u0010#\u001a\u001a\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u00000\"\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b#\u0010$J\u0099\u0001\u0010#\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032\u0014\b\u0001\u0010%\u001a\u000e\b\u00028\u0000\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u00162$\b\u0001\u0010'\u001a\u001e\u0012\u0010\u0012\u000e\b\u00028\u0000\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u00160&\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u00162$\b\u0001\u0010)\u001a\u001e\u0012\u0010\u0012\u000e\b\u00028\u0000\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u00160(\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b#\u0010*J\u009c\u0001\u0010.\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032f\b\u0001\u0010-\u001a`\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00100\u0010\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010,0,0+\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b.\u0010/J\u009c\u0001\u00102\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032f\b\u0001\u00101\u001a`\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00100\u0010\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u000100000+\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b2\u0010/JH\u00104\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032\u0012\b\u0001\u00104\u001a\f03\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b4\u00105Jd\u00104\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032.\b\u0001\u00106\u001a(\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n \u0014*\u0004\u0018\u000103030+\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b4\u0010/Jv\u00109\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032@\b\u0001\u00109\u001a,\u0012\u000e\u0012\f08\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016 \u0014*\u0016\u0012\u0010\b\u0001\u0012\f08\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016\u0018\u00010707\"\f08\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b9\u0010:Jx\u0010;\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032B\b\u0001\u0010;\u001a<\u0012\u000e\b\u0001\u0012\n \u0014*\u0004\u0018\u00010808 \u0014*\u001c\u0012\u000e\b\u0001\u0012\n \u0014*\u0004\u0018\u000108080\u001b\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u00160\u001a\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b;\u0010\u001eJ<\u0010<\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032\u0006\u0010<\u001a\u00020\u001fH\u0097\u0001\u00a2\u0006\u0004\b<\u0010!J\u0080\u0001\u0010\u0017\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032J\b\u0001\u0010\u0017\u001aD\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00100\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u00000=\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0097\u0001\u00a2\u0006\u0004\b\u0017\u0010>J\u00d7\u0002\u0010\u001c\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032\u00a0\u0002\b\u0001\u0010\u001c\u001a\u0099\u0002\u0012|\u0012z\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00100\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*<\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00100\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010=0= \u0014*\u008a\u0001\u0012|\u0012z\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00100\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*<\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00100\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010=0=0\u001b\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u00160\u001a\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0097\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001eJH\u0010@\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032\u0012\b\u0001\u0010@\u001a\f0?\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b@\u0010AJV\u0010C\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u00032 \b\u0001\u0010C\u001a\u001a\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u00000B\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\bC\u0010DR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010HR\u001a\u0010I\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010GR&\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100K8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR&\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100K8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bQ\u0010O\u0082\u0002\u0004\n\u0002\b9\u00a8\u0006R"}, d2={"Ldev/isxander/yacl3/dsl/OptionDslImpl;", "T", "Ldev/isxander/yacl3/dsl/OptionDsl;", "Ldev/isxander/yacl3/api/Option$Builder;", "", "optionId", "groupKey", "builder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldev/isxander/yacl3/api/Option$Builder;)V", "Ldev/isxander/yacl3/api/OptionDescription$Builder;", "", "lines", "", "addDefaultText", "(Ldev/isxander/yacl3/api/OptionDescription$Builder;Ljava/lang/Integer;)V", "Ldev/isxander/yacl3/api/Option;", "build", "()Ldev/isxander/yacl3/api/Option;", "Ldev/isxander/yacl3/api/OptionEventListener;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "listener", "addListener", "(Ldev/isxander/yacl3/api/OptionEventListener;)Ldev/isxander/yacl3/api/Option$Builder;", "", "", "listeners", "addListeners", "(Ljava/util/Collection;)Ldev/isxander/yacl3/api/Option$Builder;", "", "available", "(Z)Ldev/isxander/yacl3/api/Option$Builder;", "Ldev/isxander/yacl3/api/Binding;", "binding", "(Ldev/isxander/yacl3/api/Binding;)Ldev/isxander/yacl3/api/Option$Builder;", "def", "Ljava/util/function/Supplier;", "getter", "Ljava/util/function/Consumer;", "setter", "(Ljava/lang/Object;Ljava/util/function/Supplier;Ljava/util/function/Consumer;)Ldev/isxander/yacl3/api/Option$Builder;", "Ljava/util/function/Function;", "Ldev/isxander/yacl3/api/controller/ControllerBuilder;", "controllerBuilder", "controller", "(Ljava/util/function/Function;)Ldev/isxander/yacl3/api/Option$Builder;", "Ldev/isxander/yacl3/api/Controller;", "control", "customController", "Ldev/isxander/yacl3/api/OptionDescription;", "description", "(Ldev/isxander/yacl3/api/OptionDescription;)Ldev/isxander/yacl3/api/Option$Builder;", "descriptionFunction", "", "Ldev/isxander/yacl3/api/OptionFlag;", "flag", "([Ldev/isxander/yacl3/api/OptionFlag;)Ldev/isxander/yacl3/api/Option$Builder;", "flags", "instant", "Ljava/util/function/BiConsumer;", "(Ljava/util/function/BiConsumer;)Ldev/isxander/yacl3/api/Option$Builder;", "Lnet/minecraft/class_2561;", "name", "(Lnet/minecraft/class_2561;)Ldev/isxander/yacl3/api/Option$Builder;", "Ldev/isxander/yacl3/api/StateManager;", "stateManager", "(Ldev/isxander/yacl3/api/StateManager;)Ldev/isxander/yacl3/api/Option$Builder;", "Ljava/lang/String;", "getOptionId", "()Ljava/lang/String;", "Ldev/isxander/yacl3/api/Option$Builder;", "optionKey", "getOptionKey", "Ljava/util/concurrent/CompletableFuture;", "thisOption", "Ljava/util/concurrent/CompletableFuture;", "getThisOption", "()Ljava/util/concurrent/CompletableFuture;", "built", "getBuilt", "yet_another_config_lib_v3"})
public final class OptionDslImpl<T>
implements Option.Builder<T>,
OptionDsl<T> {
    private final String optionId;
    private final Option.Builder<T> builder;
    private final String optionKey;
    private final CompletableFuture<Option<T>> thisOption;
    private final CompletableFuture<Option<T>> built;

    @Deprecated(message="Deprecated in Java")
    public Option.Builder<T> listeners(Collection<BiConsumer<Option<T>, T>> collection) {
        Intrinsics.checkNotNullParameter(collection, (String)"");
        return this.builder.listeners(collection);
    }

    @Deprecated(message="Deprecated in Java")
    public Option.Builder<T> listener(BiConsumer<Option<T>, T> biConsumer) {
        Intrinsics.checkNotNullParameter(biConsumer, (String)"");
        return this.builder.listener(biConsumer);
    }

    public Option.Builder<T> addListener(OptionEventListener<T> optionEventListener) {
        Intrinsics.checkNotNullParameter(optionEventListener, (String)"");
        return this.builder.addListener(optionEventListener);
    }

    public Option.Builder<T> description(OptionDescription optionDescription) {
        Intrinsics.checkNotNullParameter((Object)optionDescription, (String)"");
        return this.builder.description(optionDescription);
    }

    public Option.Builder<T> description(Function<T, OptionDescription> function) {
        Intrinsics.checkNotNullParameter(function, (String)"");
        return this.builder.description(function);
    }

    public /* synthetic */ OptionDslImpl(String string, String string2, Option.Builder builder, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 4) != 0) {
            Option.Builder builder2 = Option.createBuilder();
            Intrinsics.checkNotNullExpressionValue((Object)builder2, (String)"");
            builder = builder2;
        }
        this(string, string2, builder);
    }

    public OptionDslImpl(String string, String string2, Option.Builder<T> builder) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"");
        Intrinsics.checkNotNullParameter(builder, (String)"");
        this.optionId = string;
        this.builder = builder;
        this.optionKey = string2 + ".option." + this.getOptionId();
        this.thisOption = new CompletableFuture();
        this.built = this.getThisOption();
        this.builder.name((class00392)class00392.L((String)this.getOptionKey()));
    }

    public Option.Builder<T> name(class00392 class003922) {
        Intrinsics.checkNotNullParameter((Object)class003922, (String)"");
        return this.builder.name(class003922);
    }

    public Option.Builder<T> flags(Collection<? extends OptionFlag> collection) {
        Intrinsics.checkNotNullParameter(collection, (String)"");
        return this.builder.flags(collection);
    }

    public Option.Builder<T> flag(OptionFlag ... optionFlagArray) {
        return this.builder.flag(optionFlagArray);
    }

    public Option.Builder<T> binding(Binding<T> binding) {
        Intrinsics.checkNotNullParameter(binding, (String)"");
        return this.builder.binding(binding);
    }

    public Option.Builder<T> binding(T t, Supplier<T> supplier, Consumer<T> consumer) {
        Intrinsics.checkNotNullParameter(t, (String)"");
        Intrinsics.checkNotNullParameter(supplier, (String)"");
        Intrinsics.checkNotNullParameter(consumer, (String)"");
        return this.builder.binding(t, supplier, consumer);
    }

    public Option.Builder<T> available(boolean bl) {
        return this.builder.available(bl);
    }

    public Option<T> build() {
        Option option;
        Option option2 = option = this.builder.build();
        boolean bl = false;
        this.getThisOption().complete(option2);
        Option option3 = option;
        Intrinsics.checkNotNullExpressionValue((Object)option3, (String)"");
        return option3;
    }

    @Deprecated(message="Deprecated in Java")
    public Option.Builder<T> instant(boolean bl) {
        return this.builder.instant(bl);
    }

    public CompletableFuture<Option<T>> getBuilt() {
        return this.built;
    }

    public Option.Builder<T> controller(Function<Option<T>, ControllerBuilder<T>> function) {
        Intrinsics.checkNotNullParameter(function, (String)"");
        return this.builder.controller(function);
    }

    public Option.Builder<T> addListeners(Collection<OptionEventListener<T>> collection) {
        Intrinsics.checkNotNullParameter(collection, (String)"");
        return this.builder.addListeners(collection);
    }

    public Option.Builder<T> stateManager(StateManager<T> stateManager) {
        Intrinsics.checkNotNullParameter(stateManager, (String)"");
        return this.builder.stateManager(stateManager);
    }

    public Option.Builder<T> customController(Function<Option<T>, Controller<T>> function) {
        Intrinsics.checkNotNullParameter(function, (String)"");
        return this.builder.customController(function);
    }

    public String getOptionKey() {
        return this.optionKey;
    }

    public String getOptionId() {
        return this.optionId;
    }

    public CompletableFuture<Option<T>> getThisOption() {
        return this.thisOption;
    }

    public void addDefaultText(OptionDescription.Builder builder, Integer n) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        ExtensionsKt.addDefaultText((OptionDescription.Builder)builder, (String)(this.getOptionKey() + ".description"), (Integer)n);
    }
}

