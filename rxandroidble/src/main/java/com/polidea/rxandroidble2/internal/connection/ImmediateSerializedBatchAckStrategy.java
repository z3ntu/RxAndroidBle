package com.polidea.rxandroidble2.internal.connection;

import com.polidea.rxandroidble2.RxBleConnection;

import io.reactivex.rxjava3.core.Observable;

public class ImmediateSerializedBatchAckStrategy implements RxBleConnection.WriteOperationAckStrategy {

    @Override
    public Observable<Boolean> apply(Observable<Boolean> objectObservable) {
        return objectObservable;
    }
}
