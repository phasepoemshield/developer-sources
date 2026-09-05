/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.ValueList
 *  org.quiltmc.config.api.values.ValueMap
 *  org.quiltmc.config.api.values.ValueTreeNode
 *  org.quiltmc.config.api.values.ValueTreeNode$Section
 *  org.quiltmc.config.impl.util.SerializerUtils
 *  wrench_wrapper.relocated.org.quiltmc.parsers.json.JsonReader
 *  wrench_wrapper.relocated.org.quiltmc.parsers.json.JsonToken$EnumUnboxingLocalUtility
 *  wrench_wrapper.relocated.org.quiltmc.parsers.json.JsonWriter
 *  wrench_wrapper.relocated.org.quiltmc.parsers.json.MalformedSyntaxException
 */
package org.quiltmc.config.api.serializers;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.Constraint;
import org.quiltmc.config.api.MarshallingUtils$MapEntryConsumer;
import org.quiltmc.config.api.Serializer;
import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.exceptions.ConfigParseException;
import org.quiltmc.config.api.metadata.Comments;
import org.quiltmc.config.api.values.ConfigSerializableObject;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueList;
import org.quiltmc.config.api.values.ValueMap;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.util.SerializerUtils;
import wrench_wrapper.relocated.org.quiltmc.parsers.json.JsonReader;
import wrench_wrapper.relocated.org.quiltmc.parsers.json.JsonToken;
import wrench_wrapper.relocated.org.quiltmc.parsers.json.JsonWriter;
import wrench_wrapper.relocated.org.quiltmc.parsers.json.MalformedSyntaxException;

public final class Json5Serializer
implements Serializer {
    public static final Json5Serializer INSTANCE = new Json5Serializer();

    public static List parseArray(JsonReader jsonReader) {
        int n = jsonReader.peeked;
        if (n == 0) {
            n = jsonReader.doPeek();
        }
        if (n == 3) {
            int n2;
            ArrayList<Object> arrayList;
            JsonReader jsonReader2 = jsonReader;
            jsonReader2.push(1);
            jsonReader2.pathIndices[jsonReader.stackSize - 1] = 0;
            jsonReader2.peeked = 0;
            ArrayList<Object> arrayList2 = arrayList;
            arrayList = new ArrayList<Object>();
            while (true) {
                if ((n2 = jsonReader.peeked) == 0) {
                    n2 = jsonReader.doPeek();
                }
                if (!(n2 != 2 && n2 != 4) || jsonReader.peek() == 2) break;
                arrayList2.add(Json5Serializer.parseElement(jsonReader));
            }
            n2 = jsonReader.peeked;
            if (n2 == 0) {
                n2 = jsonReader.doPeek();
            }
            if (n2 == 4) {
                JsonReader jsonReader3 = jsonReader;
                int n3 = jsonReader3.stackSize;
                jsonReader3.stackSize = n3 - 1;
                jsonReader3.pathIndices[n3 -= 2] = jsonReader3.pathIndices[n3] + 1;
                jsonReader3.peeked = 0;
                return arrayList2;
            }
            throw new IllegalStateException("Expected END_ARRAY but was " + JsonToken.EnumUnboxingLocalUtility.stringValueOf((int)jsonReader.peek()) + jsonReader.locationString());
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + JsonToken.EnumUnboxingLocalUtility.stringValueOf((int)jsonReader.peek()) + jsonReader.locationString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object parseElement(JsonReader var0) {
        var1_5 = var0.peek();
        if (var1_5 == 0) throw null;
        switch (var1_5 - 1) {
            default: {
                throw new ConfigParseException("Encountered unknown JSON token");
            }
            case 9: {
                throw new ConfigParseException("Unexpected end of file");
            }
            case 8: {
                var1_5 = var0.peeked;
                if (var1_5 == 0) {
                    var1_5 = var0.doPeek();
                }
                if (var1_5 != 7) throw new IllegalStateException("Expected null but was " + JsonToken.EnumUnboxingLocalUtility.stringValueOf((int)var0.peek()) + var0.locationString());
                var0.peeked = 0;
                var0_1 = var0.stackSize - 1;
                var0.pathIndices[var0_1] = var0.pathIndices[var0_1] + 1;
                return null;
            }
            case 7: {
                var1_5 = var0.peeked;
                if (var1_5 == 0) {
                    var1_5 = var0.doPeek();
                }
                if (var1_5 == 5) {
                    var0.peeked = 0;
                    var0_2 = var0.stackSize - 1;
                    var0.pathIndices[var0_2] = var0.pathIndices[var0_2] + 1;
                    v0 = true;
                    return v0;
                }
                if (var1_5 != 6) throw new IllegalStateException("Expected a boolean but was " + JsonToken.EnumUnboxingLocalUtility.stringValueOf((int)var0.peek()) + var0.locationString());
                var0.peeked = 0;
                var0_3 = var0.stackSize - 1;
                var0.pathIndices[var0_3] = var0.pathIndices[var0_3] + 1;
                v0 = false;
                return v0;
            }
            case 6: {
                var1_5 = var0.peeked;
                if (var1_5 == 0) {
                    var1_5 = var0.doPeek();
                }
                var2_10 = false;
                if (var1_5 != 15) ** GOTO lbl51
                var3_11 = var0.buffer;
                var4_13 = var0.pos;
                if (var0.buffer[var4_13] == '+') {
                    var5_15 = v1;
                    v1 = new String(var3_11, var4_13 + 1, var0.peekedNumberLength - 1);
                    var0.peekedString = var5_15;
                } else {
                    var5_16 = v2;
                    var6_21 = var0.peekedNumberLength;
                    v2 = new String(var3_11, var4_13, var6_21);
                    var0.peekedString = var5_16;
                }
                ** GOTO lbl73
lbl51:
                // 1 sources

                if (var1_5 != 16) ** GOTO lbl70
                var3_12 = var0.buffer;
                var4_14 = var0.pos;
                var5_17 = var0.buffer[var4_14];
                if (var5_17 != '+') ** GOTO lbl60
                var5_18 = v3;
                v3 = new String(var3_12, var4_14 + 3, var0.peekedNumberLength - 3);
                var0.peekedString = var5_18;
                ** GOTO lbl73
lbl60:
                // 1 sources

                if (var5_17 == '-') {
                    var2_10 = true;
                    var5_19 = v4;
                    v4 = new String(var3_12, var4_14 + 3, var0.peekedNumberLength - 3);
                    var0.peekedString = var5_19;
                } else {
                    var5_20 = v5;
                    v5 = new String(var3_12, var4_14 + 2, var0.peekedNumberLength - 2);
                    var0.peekedString = var5_20;
                }
                ** GOTO lbl73
lbl70:
                // 1 sources

                if (var1_5 == 8 || var1_5 == 9 || var1_5 == 10) ** GOTO lbl108
                if (var1_5 != 17 && var1_5 != 18) {
                    if (var1_5 != 19) throw new IllegalStateException("Expected a number but was " + JsonToken.EnumUnboxingLocalUtility.stringValueOf((int)var0.peek()) + var0.locationString());
                }
lbl73:
                // 8 sources

                var0.peeked = 11;
                if (var1_5 != 16) ** GOTO lbl80
                var1_6 = v6;
                v6 = new BigInteger(var0.peekedString.toLowerCase(), 16);
                if (var2_10) {
                    var1_6 = var1_6.negate();
                }
                ** GOTO lbl101
lbl80:
                // 1 sources

                if (var1_5 != 17) ** GOTO lbl83
                var1_6 = NaN;
                ** GOTO lbl101
lbl83:
                // 1 sources

                if (var1_5 != 18) ** GOTO lbl86
                var1_6 = Infinity;
                ** GOTO lbl101
lbl86:
                // 1 sources

                if (var1_5 != 19) ** GOTO lbl89
                var1_6 = -Infinity;
                ** GOTO lbl101
lbl89:
                // 1 sources

                var1_5 = 0;
                try {
                    v7 = Integer.parseInt(var0.peekedString.substring(101));
                }
                catch (IndexOutOfBoundsException v8) {
                    try {
                        v7 = Integer.parseInt(var0.peekedString.substring(69));
                    }
                    catch (IndexOutOfBoundsException v9) {}
                    ** GOTO lbl100
                }
                var1_5 = v7;
lbl100:
                // 2 sources

                var1_6 = new BigDecimal(var0.peekedString).scaleByPowerOfTen(var1_5);
lbl101:
                // 5 sources

                var0.peekedString = null;
                var0.peeked = 0;
                var1_7 = var0.stackSize - 1;
                var0.pathIndices[var1_7] = var0.pathIndices[var1_7] + 1;
                var0.pos += var0.peekedNumberLength;
                var0.peekedNumberLength = 0;
                return var1_6;
lbl108:
                // 1 sources

                var1_8 = "This file may be valid in lenient GSON, but it is not valid in any format we support.";
                throw new MalformedSyntaxException(var0, var1_8);
            }
            case 5: {
                var1_5 = var0.peeked;
                if (var1_5 == 0) {
                    var1_5 = var0.doPeek();
                }
                if (var1_5 == 10) {
                    var1_9 = var0.nextUnquotedValue();
                } else if (var1_5 == 8) {
                    var1_9 = var0.nextQuotedValue('\'');
                } else if (var1_5 == 9) {
                    var1_9 = var0.nextQuotedValue('\"');
                } else if (var1_5 == 11) {
                    var1_9 = var0.peekedString;
                    var0.peekedString = null;
                } else {
                    if (var1_5 != 15 && var1_5 != 16 && var1_5 != 17 && var1_5 != 18) {
                        if (var1_5 != 19) throw new IllegalStateException("Expected a string but was " + JsonToken.EnumUnboxingLocalUtility.stringValueOf((int)var0.peek()) + var0.locationString());
                    }
                    var1_9 = v10;
                    v10 = new String(var0.buffer, var0.pos, var0.peekedNumberLength);
                    var0.pos += var0.peekedNumberLength;
                }
                var0.peeked = 0;
                var0_4 = var0.stackSize - 1;
                var0.pathIndices[var0_4] = var0.pathIndices[var0_4] + 1;
                return var1_9;
            }
            case 4: {
                throw new ConfigParseException("Unexpected name");
            }
            case 3: {
                throw new ConfigParseException("Unexpected end of object");
            }
            case 2: {
                return Json5Serializer.parseObject(var0);
            }
            case 1: {
                throw new ConfigParseException("Unexpected end of array");
            }
            case 0: 
        }
        return Json5Serializer.parseArray(var0);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void deserialize(Config var1_2, InputStream var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [13 : 161->170)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Map parseObject(JsonReader jsonReader) {
        int n = jsonReader.peeked;
        if (n == 0) {
            n = jsonReader.doPeek();
        }
        if (n == 1) {
            int n2;
            LinkedHashMap<String, Object> linkedHashMap;
            block11: {
                LinkedHashMap<String, Object> linkedHashMap2;
                jsonReader.push(3);
                jsonReader.peeked = 0;
                linkedHashMap = linkedHashMap2;
                linkedHashMap2 = new LinkedHashMap<String, Object>();
                while (true) {
                    String string;
                    if ((n2 = jsonReader.peeked) == 0) {
                        n2 = jsonReader.doPeek();
                    }
                    if (!(n2 != 2 && n2 != 4) || jsonReader.peek() != 5) break block11;
                    n2 = jsonReader.peeked;
                    if (n2 == 0) {
                        n2 = jsonReader.doPeek();
                    }
                    if (n2 == 14) {
                        string = jsonReader.nextUnquotedValue();
                    } else if (n2 == 12) {
                        string = jsonReader.nextQuotedValue('\'');
                    } else {
                        if (n2 != 13) break;
                        string = jsonReader.nextQuotedValue('\"');
                    }
                    jsonReader.peeked = 0;
                    jsonReader.pathNames[jsonReader.stackSize - 1] = string;
                    linkedHashMap.put(string, Json5Serializer.parseElement(jsonReader));
                }
                throw new IllegalStateException("Expected a name but was " + JsonToken.EnumUnboxingLocalUtility.stringValueOf((int)jsonReader.peek()) + jsonReader.locationString());
            }
            n2 = jsonReader.peeked;
            if (n2 == 0) {
                n2 = jsonReader.doPeek();
            }
            if (n2 == 2) {
                int n3 = jsonReader.stackSize;
                jsonReader.stackSize = n2 = n3 - 1;
                jsonReader.pathNames[n2] = null;
                jsonReader.pathIndices[n3 -= 2] = jsonReader.pathIndices[n3] + 1;
                jsonReader.peeked = 0;
                return linkedHashMap;
            }
            throw new IllegalStateException("Expected END_OBJECT but was " + JsonToken.EnumUnboxingLocalUtility.stringValueOf((int)jsonReader.peek()) + jsonReader.locationString());
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + JsonToken.EnumUnboxingLocalUtility.stringValueOf((int)jsonReader.peek()) + jsonReader.locationString());
    }

    @Override
    public String getFileExtension() {
        return "json5";
    }

    private Json5Serializer() {
    }

    @Override
    public void serialize(Config config, OutputStream outputStream) {
        JsonWriter jsonWriter;
        OutputStreamWriter outputStreamWriter;
        Object object = outputStreamWriter;
        outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStream = jsonWriter;
        jsonWriter = new JsonWriter((OutputStreamWriter)object);
        object = ((Comments)config.metadata(Comment.TYPE)).iterator();
        while (object.hasNext()) {
            outputStream.comment((String)object.next());
        }
        OutputStream outputStream2 = outputStream;
        outputStream2.writeDeferredName();
        int n = 3;
        int n2 = 123;
        outputStream2.beforeValue();
        outputStream2.push(n);
        ((JsonWriter)outputStream2).out.write(n2);
        Iterator iterator = config.nodes().iterator();
        while (iterator.hasNext()) {
            this.serialize((JsonWriter)outputStream, (ValueTreeNode)iterator.next());
        }
        OutputStream outputStream3 = outputStream;
        outputStream3.close(3, 5, '}');
        outputStream3.close();
    }

    private void serialize(JsonWriter jsonWriter, ValueTreeNode valueTreeNode) {
        Object object = ((Comments)valueTreeNode.metadata(Comment.TYPE)).iterator();
        while (object.hasNext()) {
            jsonWriter.comment((String)object.next());
        }
        if (valueTreeNode instanceof ValueTreeNode.Section) {
            JsonWriter jsonWriter2 = jsonWriter;
            jsonWriter2.name(SerializerUtils.getSerializedName((ValueTreeNode)valueTreeNode));
            jsonWriter2.writeDeferredName();
            int n = 3;
            int n2 = 123;
            jsonWriter2.beforeValue();
            jsonWriter2.push(n);
            jsonWriter2.out.write(n2);
            Iterator iterator = ((ValueTreeNode.Section)valueTreeNode).iterator();
            while (iterator.hasNext()) {
                this.serialize(jsonWriter, (ValueTreeNode)iterator.next());
            }
            jsonWriter.close(3, 5, '}');
        } else {
            object = (valueTreeNode = (TrackedValue)valueTreeNode).getDefaultValue();
            Object object2 = SerializerUtils.createEnumOptionsComment((Object)object);
            if (((Optional)object2).isPresent()) {
                jsonWriter.comment((String)((Optional)object2).get());
            }
            object2 = valueTreeNode.constraints().iterator();
            while (object2.hasNext()) {
                jsonWriter.comment(((Constraint)object2.next()).getRepresentation());
            }
            if (((Optional)(object = SerializerUtils.getDefaultValueString((Object)object))).isPresent()) {
                jsonWriter.comment("default: " + (String)((Optional)object).get());
            }
            jsonWriter.name(SerializerUtils.getSerializedName((ValueTreeNode)valueTreeNode));
            this.serialize(jsonWriter, valueTreeNode.getRealValue());
        }
    }

    private void serialize(JsonWriter object, Object iterator) {
        block22: {
            block12: {
                Object object2;
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block15: {
                                            block14: {
                                                block13: {
                                                    block11: {
                                                        if (!(iterator instanceof Integer)) break block11;
                                                        object.value((Number)((Integer)((Object)iterator)));
                                                        break block12;
                                                    }
                                                    if (!(iterator instanceof Long)) break block13;
                                                    object.value((Number)((Long)((Object)iterator)));
                                                    break block12;
                                                }
                                                if (!(iterator instanceof Float)) break block14;
                                                object.value((Number)((Float)((Object)iterator)));
                                                break block12;
                                            }
                                            if (!(iterator instanceof Double)) break block15;
                                            object.value((Number)((Double)((Object)iterator)));
                                            break block12;
                                        }
                                        if (!(iterator instanceof Boolean)) break block16;
                                        object2 = (Boolean)((Object)iterator);
                                        if (object2 == null) {
                                            object.nullValue();
                                        } else {
                                            Object object3 = object2;
                                            object.writeDeferredName();
                                            object.beforeValue();
                                            object2 = object.out;
                                            object = ((Boolean)object3).booleanValue() ? "true" : "false";
                                            ((Writer)object2).write((String)object);
                                        }
                                        break block12;
                                    }
                                    if (!(iterator instanceof String)) break block17;
                                    object2 = (String)((Object)iterator);
                                    if (object2 == null) {
                                        object.nullValue();
                                    } else {
                                        object.writeDeferredName();
                                        object.beforeValue();
                                        object.string((String)object2, true, true);
                                    }
                                    break block12;
                                }
                                if (!(iterator instanceof ValueList)) break block18;
                                object.writeDeferredName();
                                int n = 1;
                                object.beforeValue();
                                object.push(n);
                                object.out.write(91);
                                iterator = ((ValueList)iterator).iterator();
                                while (iterator.hasNext()) {
                                    super.serialize((JsonWriter)object, iterator.next());
                                }
                                object.close(1, 2, ']');
                                break block12;
                            }
                            if (!(iterator instanceof ValueMap)) break block19;
                            object.writeDeferredName();
                            int n = 3;
                            object.beforeValue();
                            object.push(n);
                            object.out.write(123);
                            for (Map.Entry entry : (ValueMap)iterator) {
                                object.name((String)entry.getKey());
                                super.serialize((JsonWriter)object, entry.getValue());
                            }
                            object.close(3, 5, '}');
                            break block12;
                        }
                        if (!(iterator instanceof ConfigSerializableObject)) break block20;
                        super.serialize((JsonWriter)object, ((ConfigSerializableObject)((Object)iterator)).getRepresentation());
                        break block12;
                    }
                    if (iterator != null) break block21;
                    object.nullValue();
                    break block12;
                }
                if (!iterator.getClass().isEnum()) break block22;
                object2 = ((Enum)((Object)iterator)).name();
                if (object2 == null) {
                    object.nullValue();
                } else {
                    object.writeDeferredName();
                    object.beforeValue();
                    object.string((String)object2, true, true);
                }
            }
            return;
        }
        throw new ConfigParseException();
    }

    private static /* synthetic */ void lambda$deserialize$0(Map map, MarshallingUtils$MapEntryConsumer marshallingUtils$MapEntryConsumer) {
        map.forEach(marshallingUtils$MapEntryConsumer::put);
    }
}

