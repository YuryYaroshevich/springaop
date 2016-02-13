package com.epam.springaop.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "com.epam.springaop.concert.Performance+",
            defaultImpl = DefaultEncoreableImpl.class)
    public Encoreable encoreable;
}
