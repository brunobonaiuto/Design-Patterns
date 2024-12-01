public class ButtonSender extends AbstractButtonSender {

    private final TextEditorReceiver textEditorReceiver;

    public ButtonSender() {
        this.textEditorReceiver = new TextEditorReceiver();
    }

    public TextEditorReceiver getTextEditorReceiver() {
        return textEditorReceiver;
    }

}
