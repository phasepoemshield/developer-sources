/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Sets
 *  com.google.common.reflect.TypeToken
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.RewriteResult
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.TypedOptic
 *  com.mojang.datafixers.View
 *  com.mojang.datafixers.functions.Functions
 *  com.mojang.datafixers.functions.PointFree
 *  com.mojang.datafixers.optics.Optic
 *  com.mojang.datafixers.optics.profunctors.AffineP$Mu
 *  com.mojang.datafixers.optics.profunctors.Cartesian$Mu
 *  com.mojang.datafixers.optics.profunctors.TraversalP$Mu
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.Type$FieldNotFoundException
 *  com.mojang.datafixers.types.Type$TypeMatcher
 *  com.mojang.datafixers.types.families.RecursiveTypeFamily
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType$1
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType$2
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType$3
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType$RewriteFunc
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMaps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  net.fabricmc.fabric.impl.dimension.TaggedChoiceTypeExtension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.mojang.datafixers.types.templates;

import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import com.google.common.reflect.TypeToken;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.RewriteResult;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.TypedOptic;
import com.mojang.datafixers.View;
import com.mojang.datafixers.functions.Functions;
import com.mojang.datafixers.functions.PointFree;
import com.mojang.datafixers.optics.Optic;
import com.mojang.datafixers.optics.profunctors.AffineP;
import com.mojang.datafixers.optics.profunctors.Cartesian;
import com.mojang.datafixers.optics.profunctors.TraversalP;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.families.RecursiveTypeFamily;
import com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import net.fabricmc.fabric.impl.dimension.TaggedChoiceTypeExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class TaggedChoice$TaggedChoiceType<K>
extends Type<Pair<K, ?>>
implements TaggedChoiceTypeExtension {
    private final String name;
    private final Type<K> keyType;
    protected final Object2ObjectMap<K, Type<?>> types;
    private final int hashCode;
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"TaggedChoiceType_DimDataFix");
    private boolean failSoft;

    public Map<K, Type<?>> types() {
        return this.types;
    }

    private void handler$zeb000$fabric-dimensions-v1$onGetCodec(Object object, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.failSoft && !this.types.containsKey(object)) {
            LOGGER.warn("Not recognizing key {}. Using pass-through codec. {}", object, (Object)this);
            callbackInfoReturnable.setReturnValue((Object)DataResult.success((Object)MapCodec.assumeMapUnsafe((Codec)Codec.PASSTHROUGH)));
        }
    }

    public TaggedChoice$TaggedChoiceType(String string, Type<K> type, Object2ObjectMap<K, Type<?>> object2ObjectMap) {
        this.name = string;
        this.keyType = type;
        this.types = object2ObjectMap;
        this.hashCode = Objects.hash(string, type, object2ObjectMap);
    }

    public boolean equals(Object object, boolean bl, boolean bl2) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof TaggedChoice$TaggedChoiceType)) {
            return false;
        }
        TaggedChoice$TaggedChoiceType taggedChoice$TaggedChoiceType = (TaggedChoice$TaggedChoiceType)((Object)object);
        if (!Objects.equals(this.name, taggedChoice$TaggedChoiceType.name)) {
            return false;
        }
        if (!this.keyType.equals(taggedChoice$TaggedChoiceType.keyType, bl, bl2)) {
            return false;
        }
        if (this.types.size() != taggedChoice$TaggedChoiceType.types.size()) {
            return false;
        }
        for (Map.Entry entry : this.types.entrySet()) {
            if (((Type)entry.getValue()).equals(taggedChoice$TaggedChoiceType.types.get(entry.getKey()), bl, bl2)) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return "TaggedChoiceType[" + this.name + ", " + Joiner.on((String)", \n").withKeyValueSeparator(" -> ").join(this.types) + "]\n";
    }

    public int hashCode() {
        return this.hashCode;
    }

    public String getName() {
        return this.name;
    }

    private <S, T, FT, FR> TypedOptic<Pair<K, ?>, Pair<K, ?>, FT, FR> cap(TaggedChoice$TaggedChoiceType<K> taggedChoice$TaggedChoiceType, K k, TypedOptic<S, T, FT, FR> typedOptic) {
        return TypedOptic.tagged(taggedChoice$TaggedChoiceType, k, (Type)typedOptic.sType(), (Type)typedOptic.tType()).compose(typedOptic);
    }

    public RewriteResult<Pair<K, ?>, ?> all(TypeRewriteRule typeRewriteRule, boolean bl, boolean bl2) {
        Object object;
        Object object22;
        Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap(this.types.size());
        for (Object object22 : Object2ObjectMaps.fastIterable(this.types)) {
            Optional optional = typeRewriteRule.rewrite((Type)object22.getValue());
            if (!optional.isPresent() || ((RewriteResult)optional.get()).view().isNop()) continue;
            object2ObjectOpenHashMap.put(object22.getKey(), (Object)((RewriteResult)optional.get()));
        }
        if (object2ObjectOpenHashMap.isEmpty()) {
            return RewriteResult.nop((Type)this);
        }
        if (object2ObjectOpenHashMap.size() == 1) {
            object = (Map.Entry)object2ObjectOpenHashMap.entrySet().iterator().next();
            return TaggedChoice$TaggedChoiceType.elementResult(object.getKey(), this, (RewriteResult)object.getValue());
        }
        object = new Object2ObjectOpenHashMap(this.types);
        object22 = new BitSet();
        for (Map.Entry entry : Object2ObjectMaps.fastIterable((Object2ObjectMap)object2ObjectOpenHashMap)) {
            object.put(entry.getKey(), (Object)((RewriteResult)entry.getValue()).view().newType());
            ((BitSet)object22).or(((RewriteResult)entry.getValue()).recData());
        }
        return RewriteResult.create((View)View.create((PointFree)Functions.fun((String)("TaggedChoiceTypeRewriteResult " + object2ObjectOpenHashMap.size()), (Function)new RewriteFunc((Map)object2ObjectOpenHashMap), (Type)this, (Type)DSL.taggedChoiceType((String)this.name, this.keyType, (Map)object))), (BitSet)object22);
    }

    public Optional<RewriteResult<Pair<K, ?>, ?>> one(TypeRewriteRule typeRewriteRule) {
        for (Map.Entry entry : this.types.entrySet()) {
            Optional optional = typeRewriteRule.rewrite((Type)entry.getValue());
            if (!optional.isPresent()) continue;
            return Optional.of(TaggedChoice$TaggedChoiceType.elementResult(entry.getKey(), this, (RewriteResult)optional.get()));
        }
        return Optional.empty();
    }

    public Optional<Type<?>> findCheckedType(int n) {
        return this.types.values().stream().map(type -> type.findCheckedType(n)).filter(Optional::isPresent).findFirst().flatMap(Function.identity());
    }

    public Optional<TaggedChoice$TaggedChoiceType<?>> findChoiceType(String string, int n) {
        if (Objects.equals(string, this.name)) {
            return Optional.of(this);
        }
        return Optional.empty();
    }

    public <FT, FR> Either<TypedOptic<Pair<K, ?>, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(Type<FT> type, Type<FR> type2, Type.TypeMatcher<FT, FR> typeMatcher, boolean bl) {
        2 var7_9;
        TypeToken typeToken;
        Map map = (Map)this.types.entrySet().stream().map(entry -> Pair.of(entry.getKey(), (Object)((Type)entry.getValue()).findType(type, type2, typeMatcher, bl))).filter(pair -> ((Either)pair.getSecond()).left().isPresent()).map(pair -> pair.mapSecond(either -> (TypedOptic)either.left().get())).collect(Pair.toMap());
        if (map.isEmpty()) {
            return Either.right((Object)new Type.FieldNotFoundException("Not found in any choices"));
        }
        if (map.size() == 1) {
            Map.Entry entry2 = map.entrySet().iterator().next();
            return Either.left(this.cap(this, entry2.getKey(), (TypedOptic)entry2.getValue()));
        }
        HashSet hashSet = Sets.newHashSet();
        map.values().forEach(typedOptic -> hashSet.addAll(typedOptic.bounds()));
        if (TypedOptic.instanceOf((Collection)hashSet, (TypeToken)Cartesian.Mu.TYPE_TOKEN) && map.size() == this.types.size()) {
            typeToken = Cartesian.Mu.TYPE_TOKEN;
            var7_9 = new 1(this, map);
        } else if (TypedOptic.instanceOf((Collection)hashSet, (TypeToken)AffineP.Mu.TYPE_TOKEN)) {
            typeToken = AffineP.Mu.TYPE_TOKEN;
            var7_9 = new 2(this, map);
        } else if (TypedOptic.instanceOf((Collection)hashSet, (TypeToken)TraversalP.Mu.TYPE_TOKEN)) {
            typeToken = TraversalP.Mu.TYPE_TOKEN;
            var7_9 = new 3(this, map);
        } else {
            throw new IllegalStateException("Could not merge TaggedChoiceType optics, unknown bound: " + Arrays.toString(hashSet.toArray()));
        }
        Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap(this.types);
        for (Object2ObjectMap.Entry entry3 : Object2ObjectMaps.fastIterable((Object2ObjectMap)object2ObjectOpenHashMap)) {
            TypedOptic typedOptic2 = (TypedOptic)map.get(entry3.getKey());
            if (typedOptic2 == null) continue;
            entry3.setValue((Object)typedOptic2.tType());
        }
        return Either.left((Object)new TypedOptic(typeToken, (Type)this, DSL.taggedChoiceType((String)this.name, this.keyType, (Map)object2ObjectOpenHashMap), type, type2, (Optic)var7_9));
    }

    public TypeTemplate buildTemplate() {
        Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap(this.types.size());
        for (Object2ObjectMap.Entry entry : Object2ObjectMaps.fastIterable(this.types)) {
            object2ObjectOpenHashMap.put(entry.getKey(), (Object)((Type)entry.getValue()).template());
        }
        return DSL.taggedChoice((String)this.name, this.keyType, (Map)object2ObjectOpenHashMap);
    }

    public Optional<Type<?>> findFieldTypeOpt(String string) {
        return this.types.values().stream().map(type -> type.findFieldTypeOpt(string)).filter(Optional::isPresent).findFirst().flatMap(Function.identity());
    }

    public static <K, FT, FR> RewriteResult<Pair<K, ?>, Pair<K, ?>> elementResult(K k, TaggedChoice$TaggedChoiceType<K> taggedChoice$TaggedChoiceType, RewriteResult<FT, FR> rewriteResult) {
        return TaggedChoice$TaggedChoiceType.opticView(taggedChoice$TaggedChoiceType, rewriteResult, (TypedOptic)TypedOptic.tagged(taggedChoice$TaggedChoiceType, k, (Type)rewriteResult.view().type(), (Type)rewriteResult.view().newType()));
    }

    public void fabric$setFailSoft(boolean bl) {
        this.failSoft = bl;
    }

    private static <K, V> MapCodec<Pair<K, V>> asEntryPair(K k, MapCodec<V> mapCodec) {
        return mapCodec.xmap(object2 -> Pair.of((Object)k, (Object)object2), Pair::getSecond);
    }

    private DataResult<? extends MapCodec<?>> getMapCodec(K k) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$zeb000$fabric-dimensions-v1$onGetCodec(k, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (DataResult)callbackInfoReturnable.getReturnValue();
        }
        return Optional.ofNullable((Type)this.types.get(k)).map(type -> DataResult.success((Object)MapCodec.assumeMapUnsafe((Codec)type.codec()))).orElseGet(() -> DataResult.error(() -> "Unsupported key: " + String.valueOf(k)));
    }

    public Type<?> updateMu(RecursiveTypeFamily recursiveTypeFamily) {
        Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap(this.types.size());
        for (Object2ObjectMap.Entry entry : Object2ObjectMaps.fastIterable(this.types)) {
            object2ObjectOpenHashMap.put(entry.getKey(), (Object)((Type)entry.getValue()).updateMu(recursiveTypeFamily));
        }
        return DSL.taggedChoiceType((String)this.name, this.keyType, (Map)object2ObjectOpenHashMap);
    }

    protected Codec<Pair<K, ?>> buildCodec() {
        return this.keyType.codec().partialDispatch(this.name, pair -> DataResult.success((Object)pair.getFirst()), object -> this.getMapCodec(object).map(mapCodec -> TaggedChoice$TaggedChoiceType.asEntryPair(object, mapCodec)));
    }

    public boolean hasType(K k) {
        return this.types.containsKey(k);
    }

    public Type<K> getKeyType() {
        return this.keyType;
    }

    public Optional<Typed<Pair<K, ?>>> point(DynamicOps<?> dynamicOps, K k, Object object) {
        if (!this.types.containsKey(k)) {
            return Optional.empty();
        }
        return Optional.of(new Typed((Type)this, dynamicOps, (Object)Pair.of(k, (Object)object)));
    }

    public Optional<Pair<K, ?>> point(DynamicOps<?> dynamicOps) {
        return this.types.entrySet().stream().map(entry -> ((Type)entry.getValue()).point(dynamicOps).map(object -> Pair.of(entry.getKey(), (Object)object))).filter(Optional::isPresent).findFirst().flatMap(Function.identity()).map(pair -> pair);
    }
}

