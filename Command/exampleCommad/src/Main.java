public class Main {
    public static void main(String[] args) {

        ButtonSender buttonSender = new ButtonSender();
        TextEditorReceiver textEditorReceiver = buttonSender.getTextEditorReceiver();
        textEditorReceiver.copy("Bruno Bonaiuto is my name");

        buttonSender.setCommand(new CopyCommand(textEditorReceiver));
        buttonSender.executeCommand();

        //informative prints
        System.out.println(textEditorReceiver.isTextSelected());
        System.out.println(textEditorReceiver.getClipBoard());

        buttonSender.setCommand(new PasteCommand(textEditorReceiver));
        buttonSender.executeCommand();


    }
}