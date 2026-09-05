/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  eu.pb4.placeholders.api.arguments.StringArgs
 */
package eu.pb4.placeholders.impl;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import eu.pb4.placeholders.api.arguments.StringArgs;
import java.util.stream.Stream;

public class StringArgOps
implements DynamicOps<Either<String, StringArgs>> {
    public static final StringArgOps INSTANCE = new StringArgOps();

    public Either<String, StringArgs> remove(Either<String, StringArgs> either, String string) {
        either.ifRight(stringArgs -> {
            stringArgs.unsafeKeyed().remove(string);
            stringArgs.unsafeKeyedMap().remove(string);
        });
        return either;
    }

    public Either<String, StringArgs> empty() {
        return Either.right((Object)StringArgs.emptyNew());
    }

    public Either<String, StringArgs> createMap(Stream<Pair<Either<String, StringArgs>, Either<String, StringArgs>>> stream) {
        StringArgs stringArgs = StringArgs.emptyNew();
        stream.forEach(pair -> ((Either)pair.getSecond()).ifLeft(string -> stringArgs.unsafeKeyed().put(((Either)pair.getFirst()).left().orElse(""), string)).ifRight(stringArgs2 -> stringArgs.unsafeKeyedMap().put(((Either)pair.getFirst()).left().orElse(""), stringArgs2)));
        return Either.right((Object)stringArgs);
    }

    public Either<String, StringArgs> createString(String string) {
        return Either.left((Object)string);
    }

    public DataResult<Number> getNumberValue(Either<String, StringArgs> either) {
        try {
            if (either.left().isPresent()) {
                return DataResult.success((Object)Double.valueOf((String)either.orThrow()));
            }
        }
        catch (Throwable throwable) {
            return DataResult.success((Object)(Boolean.parseBoolean((String)either.orThrow()) ? 1 : 0));
        }
        return DataResult.error(() -> String.valueOf(either) + " is not a number!");
    }

    public DataResult<Either<String, StringArgs>> mergeToList(Either<String, StringArgs> either, Either<String, StringArgs> either2) {
        try {
            if (either2.left().isPresent()) {
                ((StringArgs)either.right().get()).unsafeOrdered().add((String)either2.left().orElseThrow());
            } else {
                ((StringArgs)either.right().get()).unsafeKeyedMap().put("" + ((StringArgs)either.right().get()).unsafeKeyedMap().size(), (StringArgs)either2.right().orElseThrow());
            }
            return DataResult.success(either);
        }
        catch (Throwable throwable) {
            return DataResult.error(() -> String.valueOf(either) + " is not a list!");
        }
    }

    public DataResult<Stream<Pair<Either<String, StringArgs>, Either<String, StringArgs>>>> getMapValues(Either<String, StringArgs> either) {
        try {
            return DataResult.success(Stream.concat(((StringArgs)either.right().get()).unsafeKeyed().entrySet().stream().map(entry -> new Pair((Object)Either.left((Object)((String)entry.getKey())), (Object)Either.left((Object)((String)entry.getValue())))), ((StringArgs)either.right().get()).unsafeKeyedMap().entrySet().stream().map(entry -> new Pair((Object)Either.left((Object)((String)entry.getKey())), (Object)Either.right((Object)((StringArgs)entry.getValue()))))));
        }
        catch (Throwable throwable) {
            return DataResult.error(() -> String.valueOf(either) + " is not a map!");
        }
    }

    public DataResult<String> getStringValue(Either<String, StringArgs> either) {
        return either.left().isPresent() ? DataResult.success((Object)((String)either.left().get())) : DataResult.error(() -> String.valueOf(either) + " is not a string!");
    }

    public Either<String, StringArgs> createNumeric(Number number) {
        return Either.left((Object)number.toString());
    }

    public DataResult<Stream<Either<String, StringArgs>>> getStream(Either<String, StringArgs> either) {
        return DataResult.success(either.left().isPresent() ? Stream.of(either) : Stream.concat(Stream.concat(((StringArgs)either.right().get()).unsafeKeyed().values().stream().map(Either::left), ((StringArgs)either.right().get()).unsafeOrdered().stream().map(Either::left)), ((StringArgs)either.right().get()).unsafeKeyedMap().values().stream().map(Either::right)));
    }

    public DataResult<Either<String, StringArgs>> mergeToMap(Either<String, StringArgs> either, Either<String, StringArgs> either2, Either<String, StringArgs> either3) {
        try {
            if (either3.left().isPresent()) {
                ((StringArgs)either.right().get()).unsafeKeyed().put((String)either2.left().orElseThrow(), (String)either3.left().orElseThrow());
            } else {
                ((StringArgs)either.right().get()).unsafeKeyedMap().put((String)either2.left().orElseThrow(), (StringArgs)either3.right().orElseThrow());
            }
            return DataResult.success(either);
        }
        catch (Throwable throwable) {
            return DataResult.error(() -> String.valueOf(either2) + " is not a correct key!");
        }
    }

    public Either<String, StringArgs> createList(Stream<Either<String, StringArgs>> stream) {
        StringArgs stringArgs = StringArgs.emptyNew();
        stream.forEach(either -> either.ifLeft(stringArgs.unsafeOrdered()::add).ifRight(stringArgs2 -> stringArgs.unsafeKeyedMap().put("" + stringArgs.unsafeKeyedMap().size(), stringArgs2)));
        return Either.right((Object)stringArgs);
    }

    public <U> U convertTo(DynamicOps<U> dynamicOps, Either<String, StringArgs> either) {
        return (U)dynamicOps.empty();
    }
}

