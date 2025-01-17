package variables;

import java.util.List;

/**
 * The type Variables is in charge of the retrieval of I/O variables
 */
public interface Variables {

    List<String> getInputVariables();

    List<String> getOutputVariables();
}
