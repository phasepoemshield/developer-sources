/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson$Builder
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson$ParserFrame
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nonnull;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonNull;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonObject;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.DeserializationException;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.Marshaller;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.SyntaxError;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.AnnotatedElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ElementParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.MarshallerImpl;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ObjectParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ParserContext;

/*
 * Exception performing whole class analysis ignored.
 */
public class Jankson {
    private Deque<ParserFrame<?>> contextStack = new ArrayDeque();
    private JsonObject root;
    private int line = 0;
    private int column = 0;
    private int withheldCodePoint = -1;
    private Marshaller marshaller = MarshallerImpl.getFallback();
    private int retries = 0;
    private SyntaxError delayedError = null;
    private static final int BAD_CHARACTER = 65533;
    private AnnotatedElement rootElement;

    static /* synthetic */ Marshaller access$402(Jankson jankson, Marshaller marshaller) {
        jankson.marshaller = marshaller;
        return jankson.marshaller;
    }

    private Jankson(Builder builder) {
    }

    @Nonnull
    public JsonObject load(String string) throws SyntaxError {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes(Charset.forName("UTF-8")));
        try {
            return this.load(byteArrayInputStream);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    @Nonnull
    public JsonObject load(InputStream inputStream) throws IOException, SyntaxError {
        this.withheldCodePoint = -1;
        this.root = null;
        this.push(new ObjectParserContext(), jsonObject -> {
            this.root = jsonObject;
        });
        while (this.root == null) {
            if (this.delayedError != null) {
                throw this.delayedError;
            }
            if (this.withheldCodePoint != -1) {
                ++this.retries;
                if (this.retries > 25) {
                    throw new IOException("Parser got stuck near line " + this.line + " column " + this.column);
                }
                this.processCodePoint(this.withheldCodePoint);
                continue;
            }
            int n = this.getCodePoint(inputStream);
            if (n == -1) {
                while (!this.contextStack.isEmpty()) {
                    ParserFrame<?> parserFrame = this.contextStack.pop();
                    try {
                        ParserFrame.access$000(parserFrame).eof();
                    }
                    catch (SyntaxError syntaxError) {
                        syntaxError.setStartParsing(ParserFrame.access$100(parserFrame), ParserFrame.access$200(parserFrame));
                        syntaxError.setEndParsing(this.line, this.column);
                        throw syntaxError;
                    }
                }
                if (this.root == null) {
                    this.root = new JsonObject();
                    this.root.marshaller = this.marshaller;
                }
                return this.root;
            }
            this.processCodePoint(n);
        }
        return this.root;
    }

    @Nonnull
    public JsonObject load(File file) throws IOException, SyntaxError {
        try (FileInputStream fileInputStream = new FileInputStream(file);){
            JsonObject jsonObject = this.load(fileInputStream);
            return jsonObject;
        }
    }

    private static boolean isLowSurrogate(int n) {
        return (n & 0xC0) == 128;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getCodePoint(InputStream inputStream) throws IOException {
        int n = inputStream.read();
        if (n == -1) {
            return -1;
        }
        if ((n & 0x80) == 0) {
            return n;
        }
        if ((n & 0xF8) == 240) {
            int n2 = n & 7;
            n = inputStream.read();
            if (n == -1) {
                return -1;
            }
            if (!Jankson.isLowSurrogate(n)) {
                return 65533;
            }
            n2 <<= 6;
            n2 |= n & 0x3F;
            n = inputStream.read();
            if (n == -1) {
                return -1;
            }
            if (!Jankson.isLowSurrogate(n)) {
                return 65533;
            }
            n2 <<= 6;
            n2 |= n & 0x3F;
            n = inputStream.read();
            if (n == -1) {
                return -1;
            }
            if (!Jankson.isLowSurrogate(n)) {
                return 65533;
            }
            n2 <<= 6;
            return n2 |= n & 0x3F;
        }
        if ((n & 0xF0) == 224) {
            int n3 = n & 0xF;
            n = inputStream.read();
            if (n == -1) {
                return -1;
            }
            if (!Jankson.isLowSurrogate(n)) {
                return 65533;
            }
            n3 <<= 6;
            n3 |= n & 0x3F;
            n = inputStream.read();
            if (n == -1) {
                return -1;
            }
            if (!Jankson.isLowSurrogate(n)) {
                return 65533;
            }
            n3 <<= 6;
            return n3 |= n & 0x3F;
        }
        if ((n & 0xE0) == 192) {
            int n4 = n & 0xF;
            n = inputStream.read();
            if (n == -1) {
                return -1;
            }
            if (!Jankson.isLowSurrogate(n)) {
                return 65533;
            }
            n4 <<= 6;
            return n4 |= n & 0x3F;
        }
        return 65533;
    }

    public <T> void push(ParserContext<T> parserContext, Consumer<T> consumer) {
        ParserFrame parserFrame = new ParserFrame(parserContext, consumer);
        ParserFrame.access$102((ParserFrame)parserFrame, (int)this.line);
        ParserFrame.access$202((ParserFrame)parserFrame, (int)this.column);
        this.contextStack.push(parserFrame);
    }

    public <T> JsonElement toJson(T t) {
        return this.marshaller.serialize(t);
    }

    public <T> JsonElement toJson(T t, Marshaller marshaller) {
        return marshaller.serialize(t);
    }

    public <T> T fromJson(JsonObject jsonObject, Class<T> clazz) {
        return this.marshaller.marshall(clazz, (JsonElement)jsonObject);
    }

    public <T> T fromJson(String string, Class<T> clazz) throws SyntaxError {
        JsonObject jsonObject = this.load(string);
        return this.fromJson(jsonObject, clazz);
    }

    public <T> T fromJsonCarefully(JsonObject jsonObject, Class<T> clazz) throws DeserializationException {
        return this.marshaller.marshallCarefully(clazz, jsonObject);
    }

    public <T> T fromJsonCarefully(String string, Class<T> clazz) throws SyntaxError, DeserializationException {
        JsonObject jsonObject = this.load(string);
        return this.fromJsonCarefully(jsonObject, clazz);
    }

    public Marshaller getMarshaller() {
        return this.marshaller;
    }

    @Nonnull
    public JsonElement loadElement(String string) throws SyntaxError {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes(Charset.forName("UTF-8")));
        try {
            return this.loadElement(byteArrayInputStream);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    @Nonnull
    public JsonElement loadElement(File file) throws IOException, SyntaxError {
        try (FileInputStream fileInputStream = new FileInputStream(file);){
            JsonElement jsonElement = this.loadElement(fileInputStream);
            return jsonElement;
        }
    }

    @Nonnull
    public JsonElement loadElement(InputStream inputStream) throws IOException, SyntaxError {
        this.withheldCodePoint = -1;
        this.push(new ElementParserContext(), annotatedElement -> {
            this.rootElement = annotatedElement;
        });
        while (this.rootElement == null) {
            if (this.delayedError != null) {
                throw this.delayedError;
            }
            if (this.withheldCodePoint != -1) {
                ++this.retries;
                if (this.retries > 25) {
                    throw new IOException("Parser got stuck near line " + this.line + " column " + this.column);
                }
                this.processCodePoint(this.withheldCodePoint);
                continue;
            }
            int n = this.getCodePoint(inputStream);
            if (n == -1) {
                while (!this.contextStack.isEmpty()) {
                    ParserFrame<?> parserFrame = this.contextStack.pop();
                    try {
                        ParserFrame.access$000(parserFrame).eof();
                    }
                    catch (SyntaxError syntaxError) {
                        syntaxError.setStartParsing(ParserFrame.access$100(parserFrame), ParserFrame.access$200(parserFrame));
                        syntaxError.setEndParsing(this.line, this.column);
                        throw syntaxError;
                    }
                }
                if (this.rootElement == null) {
                    return JsonNull.INSTANCE;
                }
            }
            this.processCodePoint(n);
        }
        return this.rootElement.getElement();
    }

    private void processCodePoint(int n) throws SyntaxError {
        ParserFrame<?> parserFrame = this.contextStack.peek();
        if (parserFrame == null) {
            throw new IllegalStateException("Parser problem! The ParserContext stack underflowed! (line " + this.line + ", col " + this.column + ")");
        }
        try {
            if (parserFrame.context().isComplete()) {
                this.contextStack.pop();
                parserFrame.supply();
                parserFrame = this.contextStack.peek();
            }
        }
        catch (SyntaxError syntaxError) {
            syntaxError.setStartParsing(ParserFrame.access$100(parserFrame), ParserFrame.access$200(parserFrame));
            syntaxError.setEndParsing(this.line, this.column);
            throw syntaxError;
        }
        try {
            boolean bl = ParserFrame.access$000(parserFrame).consume(n, this);
            if (ParserFrame.access$000(parserFrame).isComplete()) {
                this.contextStack.pop();
                parserFrame.supply();
            }
            if (bl) {
                this.withheldCodePoint = -1;
                this.retries = 0;
            } else {
                this.withheldCodePoint = n;
            }
        }
        catch (SyntaxError syntaxError) {
            syntaxError.setStartParsing(ParserFrame.access$100(parserFrame), ParserFrame.access$200(parserFrame));
            syntaxError.setEndParsing(this.line, this.column);
            throw syntaxError;
        }
        ++this.column;
        if (n == 10) {
            ++this.line;
            this.column = 0;
        }
    }

    public void throwDelayed(SyntaxError syntaxError) {
        syntaxError.setEndParsing(this.line, this.column);
        this.delayedError = syntaxError;
    }
}

