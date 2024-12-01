import java.security.cert.TrustAnchor;

/**
 * Concrete Commands implement various kinds of requests.
 * A concrete command isn’t supposed to perform the work on its own, but rather to pass the call to one of the business logic objects.
 */
public final class PasteCommand implements Command {

    /**
     * Parameters required to execute a method on a receiving object can be declared as fields in the concrete command.
     */
    private final TextEditorReceiver editorReceiver;

    /**
     * You can make command objects immutable by only allowing the initialization of these fields via the constructor.
     */
    public PasteCommand(TextEditorReceiver editorReceiver) {
        this.editorReceiver = editorReceiver;
    }


    @Override
    public boolean execute() {
        if (editorReceiver.getClipBoard() == null || editorReceiver.getClipBoard().isEmpty()) {
            System.out.println("There is not text to paste");
            return false;
        }
        System.out.println("You have pasted the following text: "+ editorReceiver.getClipBoard());
        editorReceiver.setClipBoard(editorReceiver.getCurrentText());
        return true;
    }

}