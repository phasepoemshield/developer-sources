/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.libs.mcstructs.converter.model;

import com.viaversion.viaversion.libs.mcstructs.converter.model.CodecException;
import com.viaversion.viaversion.libs.mcstructs.converter.model.MergedCodecException;
import java.util.Collection;
import java.util.function.Function;

public interface Result<T> {
    public T orElseThrow(Function<Throwable, ? extends Throwable> var1);

    public T get();

    public boolean equals(Object var1);

    public String toString();

    public int hashCode();

    public <N> Result<N> map(Function<T, N> var1);

    public T orElse(T var1);

    public static <T> Result<T> error(Throwable cause) {
        return new Error(new CodecException(cause));
    }

    public static <T> Result<T> error(String error) {
        return new Error(new CodecException(error));
    }

    public boolean isError();

    public static <T> Result<T> unexpected(Object actual, Class<?> ... expected) {
        String[] names = new String[expected.length];
        for (int i = 0; i < expected.length; ++i) {
            names[i] = expected[i].getSimpleName();
        }
        return Result.unexpected(actual, names);
    }

    public static <T> Result<T> unexpected(Object actual, String ... expected) {
        return Result.error("Expected " + String.join((CharSequence)"/", expected) + " but got " + (actual == null ? "null" : actual.getClass().getSimpleName()));
    }

    public static <T> Result<T> success(T result) {
        return new Success(result);
    }

    public <N> Result<N> mapResult(Function<T, Result<N>> var1);

    public <N> Result<N> mapError();

    public T getOrThrow(Function<Throwable, ? extends Throwable> var1);

    public static <T> Result<T> mergeErrors(String error, Collection<Result<?>> errors) {
        return new Error(new MergedCodecException(error, errors));
    }

    public boolean isSuccessful();

    public CodecException getError();

    public static class Error<T>
    implements Result<T> {
        private final CodecException error;

        @Override
        public T orElseThrow(Function<Throwable, ? extends Throwable> exceptionSupplier) {
            throw exceptionSupplier.apply(this.error);
        }

        private Error(CodecException error) {
            this.error = error;
        }

        @Override
        public T get() {
            throw this.error;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Error)) {
                return false;
            }
            Error other = (Error)o;
            if (!other.canEqual(this)) {
                return false;
            }
            CodecException this$error = this.getError();
            CodecException other$error = other.getError();
            return !(this$error == null ? other$error != null : !this$error.equals(other$error));
        }

        @Override
        public String toString() {
            return "Error{" + this.error.getMessage() + "}";
        }

        @Override
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            CodecException $error = this.getError();
            result = result * 59 + ($error == null ? 43 : $error.hashCode());
            return result;
        }

        @Override
        public <N> Result<N> map(Function<T, N> mapper) {
            return this.mapError();
        }

        @Override
        public T orElse(T other) {
            return other;
        }

        @Override
        public boolean isError() {
            return true;
        }

        @Override
        public <N> Result<N> mapResult(Function<T, Result<N>> mapper) {
            return this.mapError();
        }

        @Override
        public <N> Result<N> mapError() {
            return this;
        }

        @Override
        public T getOrThrow(Function<Throwable, ? extends Throwable> exceptionSupplier) {
            throw exceptionSupplier.apply(this.error);
        }

        @Override
        public boolean isSuccessful() {
            return false;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Error;
        }

        @Override
        public CodecException getError() {
            return this.error;
        }
    }

    public static class Success<T>
    implements Result<T> {
        private final T result;

        @Override
        public T orElseThrow(Function<Throwable, ? extends Throwable> exceptionSupplier) {
            return this.result;
        }

        private Success(T result) {
            this.result = result;
        }

        @Override
        public T get() {
            return this.result;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Success)) {
                return false;
            }
            Success other = (Success)o;
            if (!other.canEqual(this)) {
                return false;
            }
            T this$result = this.result;
            T other$result = other.result;
            return !(this$result == null ? other$result != null : !this$result.equals(other$result));
        }

        @Override
        public String toString() {
            return "Success{" + this.result + "}";
        }

        @Override
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            T $result = this.result;
            result = result * 59 + ($result == null ? 43 : $result.hashCode());
            return result;
        }

        @Override
        public <N> Result<N> map(Function<T, N> mapper) {
            return Result.success(mapper.apply(this.result));
        }

        @Override
        public T orElse(T other) {
            return this.result;
        }

        @Override
        public boolean isError() {
            return false;
        }

        @Override
        public <N> Result<N> mapResult(Function<T, Result<N>> mapper) {
            return mapper.apply(this.result);
        }

        @Override
        public <N> Result<N> mapError() {
            return Result.error("No error");
        }

        @Override
        public T getOrThrow(Function<Throwable, ? extends Throwable> exceptionSupplier) {
            return this.result;
        }

        @Override
        public boolean isSuccessful() {
            return true;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Success;
        }

        @Override
        public CodecException getError() {
            return null;
        }
    }
}

