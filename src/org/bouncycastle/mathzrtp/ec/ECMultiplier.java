package org.bouncycastle.mathzrtp.ec;

import gnu.java.bigintcrypto.BigIntegerCrypto;

/**
 * Interface for classes encapsulating a point multiplication algorithm
 * for <code>ECPoint</code>s.
 */
interface ECMultiplier
{
    /**
     * Multiplies the <code>ECPoint p</code> by <code>k</code>, i.e.
     * <code>p</code> is added <code>k</code> times to itself.
     * @param p The <code>ECPoint</code> to be multiplied.
     * @param k The factor by which <code>p</code> i multiplied.
     * @return <code>p</code> multiplied by <code>k</code>.
     */
    ECPoint multiply(ECPoint p, BigIntegerCrypto k, PreCompInfo preCompInfo);
}
