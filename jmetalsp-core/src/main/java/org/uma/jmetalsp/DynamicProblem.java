package org.uma.jmetalsp;

import org.uma.jmetal.problem.Problem;
import org.uma.jmetal.solution.Solution;
import org.uma.jmetalsp.perception.Observer;

/**
 * Created by ajnebro on 18/4/16.
 */
public interface DynamicProblem<S extends Solution<?>, D extends UpdateData>
        extends Problem<S>, Observer {
  boolean hasTheProblemBeenModified() ;
	void reset() ;
}