package components;

public class TextEditorReceiver {
    private String currentText = null;
    private String clipBoardText = null;

    /**
     * Simulates a copy from a piece of text
     */
    public void copy(String text) {
        currentText = text;
    }

    /**
     * method used by a given command
     */
    public String getCurrentText() {
        return currentText;
    }

    public void setClipBoard(String textSelected) {
        clipBoardText = textSelected;
    }

    //method for informative print
    public String getClipBoard() {
        return "The Editor contains this text on ClipBoard: "+clipBoardText;
    }
    //method for informative print
    public boolean isTextSelected() {
        return currentText != null;
    }
}
