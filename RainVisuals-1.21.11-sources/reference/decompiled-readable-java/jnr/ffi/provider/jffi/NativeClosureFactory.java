/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Closure;
import com.kenai.jffi.ClosureMagazine;
import com.kenai.jffi.ClosureManager;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.annotations.Delegate;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.provider.FromNativeType;
import jnr.ffi.provider.SigType;
import jnr.ffi.provider.ToNativeType;
import jnr.ffi.provider.jffi.AsmClassLoader;
import jnr.ffi.provider.jffi.ClosureUtil;
import jnr.ffi.provider.jffi.InvokerUtil;
import jnr.ffi.provider.jffi.NativeClosurePointer;
import jnr.ffi.provider.jffi.NativeClosureProxy;
import jnr.ffi.provider.jffi.NativeFinalizer;
import jnr.ffi.util.ref.FinalizableWeakReference;

public final class NativeClosureFactory<T> {
    private final ConcurrentLinkedQueue<NativeClosurePointer> freeQueue;
    private final Runtime runtime;
    private ClosureMagazine currentMagazine;
    private final NativeClosureProxy.Factory closureProxyFactory;
    private final ConcurrentMap<Integer, ClosureReference> closures = new ConcurrentHashMap<Integer, ClosureReference>();
    private final CallContext callContext;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    NativeClosurePointer allocateClosurePointer() {
        void var2_2;
        NativeClosurePointer closurePointer = this.freeQueue.poll();
        if (closurePointer != null) {
            return closurePointer;
        }
        NativeClosureProxy proxy = this.closureProxyFactory.newClosureProxy();
        Closure.Handle closureHandle = null;
        NativeClosureFactory nativeClosureFactory = this;
        synchronized (nativeClosureFactory) {
            do {
                if (this.currentMagazine != null) {
                    closureHandle = this.currentMagazine.allocate(proxy);
                    if (closureHandle != null) continue;
                }
                this.currentMagazine = ClosureManager.getInstance().newClosureMagazine(this.callContext, this.closureProxyFactory.getInvokeMethod());
            } while (closureHandle == null);
        }
        return new NativeClosurePointer(this.runtime, closureHandle, (NativeClosureProxy)var2_2);
    }

    private void recycle(NativeClosurePointer ptr) {
        this.freeQueue.add(ptr);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    ClosureReference getClosureReference(Object callable) {
        void var2_2;
        void var1_1;
        Integer key = System.identityHashCode(callable);
        ClosureReference ref = (ClosureReference)this.closures.get(key);
        if (ref != null) {
            if (ref.getCallable() == callable) {
                return ref;
            }
            ConcurrentMap<Integer, ClosureReference> concurrentMap = this.closures;
            synchronized (concurrentMap) {
                while ((ref = ref.next) != null) {
                    if (ref.getCallable() != callable) continue;
                    return ref;
                }
            }
        }
        return this.newClosureReference(var1_1, (Integer)var2_2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void expunge(ClosureReference ref, Integer key) {
        if (ref.next == null) {
            if (this.closures.remove(key, ref)) {
                return;
            }
        }
        ConcurrentMap<Integer, ClosureReference> concurrentMap = this.closures;
        synchronized (concurrentMap) {
            ClosureReference clref;
            ClosureReference prev = clref = (ClosureReference)this.closures.get(key);
            while (clref != null) {
                if (clref == ref) {
                    if (prev != clref) {
                        prev.next = clref.next;
                        break;
                    }
                    if (clref.next != null) {
                        this.closures.replace(key, clref, clref.next);
                        break;
                    }
                    this.closures.remove(key, clref);
                    break;
                }
                prev = clref;
                clref = clref.next;
            }
        }
    }

    NativeClosurePointer newClosure(Object callable, Integer key) {
        return this.newClosureReference(callable, key).pointer;
    }

    protected NativeClosureFactory(Runtime runtime, CallContext callContext, NativeClosureProxy.Factory closureProxyFactory) {
        this.freeQueue = new ConcurrentLinkedQueue();
        this.runtime = runtime;
        this.closureProxyFactory = closureProxyFactory;
        this.callContext = callContext;
    }

    static <T> NativeClosureFactory newClosureFactory(Runtime runtime, Class<T> closureClass, SignatureTypeMapper typeMapper, AsmClassLoader classLoader) {
        Method callMethod = null;
        Method[] methodArray = closureClass.getMethods();
        int n = methodArray.length;
        for (int i = 0; i < n; ++i) {
            Method m = methodArray[i];
            if (!m.isAnnotationPresent(Delegate.class) || !Modifier.isPublic(m.getModifiers()) || Modifier.isStatic(m.getModifiers())) continue;
            callMethod = m;
            break;
        }
        if (callMethod == null) {
            throw new NoSuchMethodError("no public non-static delegate method defined in " + closureClass.getName());
        }
        Class<?>[] parameterTypes = callMethod.getParameterTypes();
        SigType[] parameterSigTypes = new FromNativeType[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; ++i) {
            parameterSigTypes[i] = ClosureUtil.getParameterType(runtime, callMethod, i, typeMapper);
        }
        ToNativeType resultType = ClosureUtil.getResultType(runtime, callMethod, typeMapper);
        return new NativeClosureFactory<T>(runtime, InvokerUtil.getCallContext(resultType, parameterSigTypes, InvokerUtil.getNativeCallingConvention(callMethod), false), NativeClosureProxy.newProxyFactory(runtime, callMethod, resultType, (FromNativeType[])parameterSigTypes, classLoader));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    ClosureReference newClosureReference(Object callable, Integer key) {
        void var4_4;
        NativeClosurePointer ptr = this.allocateClosurePointer();
        ClosureReference ref = new ClosureReference(callable, key, this, ptr);
        ptr.proxy.closureReference = ref;
        if (this.closures.putIfAbsent(key, ref) == null) {
            return ref;
        }
        ConcurrentMap<Integer, ClosureReference> concurrentMap = this.closures;
        synchronized (concurrentMap) {
            do {
                ref.next = (ClosureReference)this.closures.get(key);
                if (ref.next != null) continue;
                if (this.closures.putIfAbsent(key, ref) == null) break;
            } while (!this.closures.replace(key, ref.next, ref));
        }
        return var4_4;
    }

    final class ClosureReference
    extends FinalizableWeakReference<Object> {
        volatile ClosureReference next;
        private final Integer key;
        private final NativeClosurePointer pointer;
        private final NativeClosureFactory factory;

        private ClosureReference(Object referent, Integer key, NativeClosureFactory factory, NativeClosurePointer pointer) {
            super(referent, NativeFinalizer.getInstance().getFinalizerQueue());
            this.factory = factory;
            this.key = key;
            this.pointer = pointer;
        }

        @Override
        public void finalizeReferent() {
            this.clear();
            this.factory.expunge(this, this.key);
            this.factory.recycle(this.pointer);
        }

        Object getCallable() {
            return this.get();
        }

        Pointer getPointer() {
            return this.pointer;
        }
    }
}

