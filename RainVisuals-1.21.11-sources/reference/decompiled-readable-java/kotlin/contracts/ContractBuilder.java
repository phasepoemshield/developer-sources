/*
 * Decompiled with CFR 0.152.
 */
package kotlin.contracts;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.contracts.CallsInPlace;
import kotlin.contracts.ExperimentalContracts;
import kotlin.contracts.InvocationKind;
import kotlin.contracts.Returns;
import kotlin.contracts.ReturnsNotNull;
import kotlin.internal.ContractsDsl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H'\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH'\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H'\u00a2\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH'\u00a2\u0006\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"Lkotlin/contracts/ContractBuilder;", "", "R", "Lkotlin/Function;", "lambda", "Lkotlin/contracts/InvocationKind;", "kind", "Lkotlin/contracts/CallsInPlace;", "callsInPlace", "(Lkotlin/Function;Lkotlin/contracts/InvocationKind;)Lkotlin/contracts/CallsInPlace;", "Lkotlin/contracts/Returns;", "returns", "()Lkotlin/contracts/Returns;", "value", "(Ljava/lang/Object;)Lkotlin/contracts/Returns;", "Lkotlin/contracts/ReturnsNotNull;", "returnsNotNull", "()Lkotlin/contracts/ReturnsNotNull;", "kotlin-stdlib"})
@ExperimentalContracts
@SinceKotlin(version="1.3")
@ContractsDsl
public interface ContractBuilder {
    @ContractsDsl
    @NotNull
    public <R> CallsInPlace callsInPlace(@NotNull Function<? extends R> var1, @NotNull InvocationKind var2);

    @NotNull
    @ContractsDsl
    public Returns returns();

    @ContractsDsl
    @NotNull
    public ReturnsNotNull returnsNotNull();

    @ContractsDsl
    @NotNull
    public Returns returns(@Nullable Object var1);

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        public static /* synthetic */ CallsInPlace callsInPlace$default(ContractBuilder contractBuilder, Function function, InvocationKind invocationKind, int n, Object object) {
            if (object != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if ((n & 2) != 0) {
                invocationKind = InvocationKind.UNKNOWN;
            }
            return contractBuilder.callsInPlace(function, invocationKind);
        }
    }
}

