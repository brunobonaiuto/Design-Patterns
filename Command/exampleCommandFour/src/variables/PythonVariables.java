package variables;

import java.util.ArrayList;
import java.util.List;

public class PythonVariables implements Variables {

    private List<String> inputVariables;
    private List<String> outputVariables;

    @Override
    public List<String> getInputVariables() {
        return new ArrayList<>(inputVariables);
    }

    @Override
    public List<String> getOutputVariables() {
        return new ArrayList<>(outputVariables);
    }

    public void setInputVariables(List<String> inputVariables) {
        this.inputVariables = inputVariables;
    }

    public void setOutputVariables(List<String> outputVariables) {
        this.outputVariables = outputVariables;
    }
}
