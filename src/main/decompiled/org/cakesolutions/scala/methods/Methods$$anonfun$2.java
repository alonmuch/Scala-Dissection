package org.cakesolutions.scala.methods;

import scala.*;
import scala.runtime.*;

public final class Methods$$anonfun$2 extends AbstractFunction1$mcII$sp implements Serializable {
    public static final long serialVersionUID = 0L;
    
    public final int apply(final int c) {
        return this.apply$mcII$sp(c);
    }
    
    public int apply$mcII$sp(final int c) {
        return Methods$.MODULE$.curriedSum3(4, 6, c);
    }
}