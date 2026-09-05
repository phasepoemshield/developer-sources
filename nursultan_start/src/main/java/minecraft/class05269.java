/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.logging.LogUtils
 *  minecraft.class01042
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.MoreObjects;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import minecraft.class01042;
import minecraft.class05259;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class05269 {
    private static final Logger N = LogUtils.getLogger();
    protected final Properties NW;

    public void L(Path path) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardCharsets.UTF_8, new OpenOption[0]);){
            this.NW.store(bufferedWriter, "Minecraft server properties");
        }
        catch (IOException iOException) {
            N.error("Failed to store properties to file: {}", (Object)path);
        }
    }

    protected @Nullable Boolean L(String string) {
        return (Boolean)this.N(string, Boolean::valueOf);
    }

    public class05269(Properties properties) {
        this.NW = properties;
    }

    protected abstract class05269 y(class01042 var1, Properties var2);

    protected class05259 y(String string, Function function, Object object) {
        return this.y(string, function, Objects::toString, object);
    }

    protected @Nullable String y(String string) {
        return (String)this.N(string, Function.identity());
    }

    public static Properties y(Path path) {
        Properties properties;
        block16: {
            InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);
            try {
                CharsetDecoder charsetDecoder = StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
                Properties properties2 = new Properties();
                properties2.load(new InputStreamReader(inputStream, charsetDecoder));
                properties = properties2;
                if (inputStream == null) break block16;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (CharacterCodingException characterCodingException) {
                    Properties properties3;
                    block17: {
                        N.info("Failed to load properties as UTF-8 from file {}, trying ISO_8859_1", (Object)path);
                        BufferedReader bufferedReader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);
                        try {
                            Properties properties4 = new Properties();
                            properties4.load(bufferedReader);
                            properties3 = properties4;
                            if (bufferedReader == null) break block17;
                        }
                        catch (Throwable throwable3) {
                            try {
                                if (bufferedReader != null) {
                                    try {
                                        ((Reader)bufferedReader).close();
                                    }
                                    catch (Throwable throwable4) {
                                        throwable3.addSuppressed(throwable4);
                                    }
                                }
                                throw throwable3;
                            }
                            catch (IOException iOException) {
                                N.error("Failed to load properties from file: {}", (Object)path, (Object)iOException);
                                return new Properties();
                            }
                        }
                        ((Reader)bufferedReader).close();
                    }
                    return properties3;
                }
            }
            inputStream.close();
        }
        return properties;
    }

    protected class05259 y(String string, int n) {
        return this.y(string, class05269.N(Integer::parseInt), n);
    }

    protected class05259 y(String string, boolean bl) {
        return this.y(string, Boolean::valueOf, bl);
    }

    protected class05259 y(String string, /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Function function, Function function2, Object object) {
        String string2 = this.N(string);
        Object object2 = MoreObjects.firstNonNull(string2 != null ? function.apply(string2) : null, (Object)object);
        this.NW.put(string, function2.apply(object2));
        return new class05259(this, string, object2, function2);
    }

    protected class05259 y(String string, String string2) {
        return this.y(string, String::new, string2);
    }

    protected int N(String string, int n) {
        return (Integer)this.N(string, class05269.N(Integer::parseInt), (Object)n);
    }

    protected boolean N(String string, boolean bl) {
        return (Boolean)this.N(string, Boolean::valueOf, bl);
    }

    protected long N(String string, long l) {
        return (Long)this.N(string, class05269.N(Long::parseLong), l);
    }

    protected Properties N() {
        Properties properties = new Properties();
        properties.putAll((Map<?, ?>)this.NW);
        return properties;
    }

    protected Object N(String string, Function function, Object object) {
        return this.N(string, function, Objects::toString, object);
    }

    protected Object N(String string2, /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Function function, UnaryOperator unaryOperator, Function function2, Object object) {
        return this.N(string2, string -> {
            Object r = function.apply(string);
            return r != null ? unaryOperator.apply(r) : null;
        }, function2, object);
    }

    protected Object N(String string, /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Function function, Function function2, Object object) {
        String string2 = this.N(string);
        Object object2 = MoreObjects.firstNonNull(string2 != null ? function.apply(string2) : null, (Object)object);
        this.NW.put(string, function2.apply(object2));
        return object2;
    }

    protected @Nullable Object N(String string, Function function) {
        String string2 = this.N(string);
        if (string2 == null) {
            return null;
        }
        this.NW.remove(string);
        return function.apply(string2);
    }

    private @Nullable String N(String string) {
        return (String)this.NW.get(string);
    }

    protected int N(String string, UnaryOperator unaryOperator, int n) {
        return (Integer)this.N(string, class05269.N(Integer::parseInt), unaryOperator, Objects::toString, n);
    }

    protected static /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Function N(/*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable IntFunction intFunction, /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Function function) {
        return string -> {
            try {
                return intFunction.apply(Integer.parseInt(string));
            }
            catch (NumberFormatException numberFormatException) {
                return function.apply(string);
            }
        };
    }

    private static /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Function N(Function function) {
        return string -> {
            try {
                return (Number)function.apply(string);
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        };
    }

    protected String N(String string, String string2) {
        return (String)this.N(string, Function.identity(), Function.identity(), string2);
    }
}

