package org.broadinstitute.hellbender.tools.copynumber.formats.records;

import org.broadinstitute.hellbender.tools.copynumber.GermlineCNVCaller;

/**
 * Represents a value of the copy ratio output in linear space by {@link GermlineCNVCaller}
 *
 * @author Andrey Smirnov &lt;asmirnov@broadinstitute.org&gt;
 */
public class NonLocatableLinearCopyRatio {
    private final double linearCopyRatio;

    public NonLocatableLinearCopyRatio(final double linearCopyRatio) {
        this.linearCopyRatio = linearCopyRatio;
    }

    public double getLinearCopyRatio() {
        return linearCopyRatio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final NonLocatableLinearCopyRatio that = (NonLocatableLinearCopyRatio) o;

        return Double.compare(that.linearCopyRatio, linearCopyRatio) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(linearCopyRatio);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "NonLocatableLinearCopyRatio{" +
                "linearCopyRatio=" + linearCopyRatio +
                '}';
    }
}
