package icu.study.studyIcu.infrastucture.framework.redisCore.constant;

import java.util.concurrent.TimeUnit;

public enum RedisKey {

    imageVrCode(5L, TimeUnit.MINUTES),
    smsSignUp(15L, TimeUnit.MINUTES),
    smsSignIn(15L, TimeUnit.MINUTES),
    emailSignUp(15L, TimeUnit.MINUTES),
    emailSignIn(15L, TimeUnit.MINUTES),
    smsVrcodeInterval(1L, TimeUnit.MINUTES),
    emailVrcodeInterval(1L, TimeUnit.MINUTES),
    smsSendCount(1L, TimeUnit.DAYS),

    ;

    Long expireTime;

    TimeUnit timeUnit;

    RedisKey(Long expireTime, TimeUnit timeUnit) {
        this.expireTime = expireTime;
        this.timeUnit = timeUnit;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

}
