package operator.repairer;

import org.uma.jmetal.solution.doublesolution.DoubleSolution;

public interface WeightRepairer {
    void repairSolution(DoubleSolution solution);
}
