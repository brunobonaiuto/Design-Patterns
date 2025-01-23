package Componets;

import mediator.Mediator;

public interface Component {

    void setMediatorOperation(Mediator mediator);
    void sendOperation(String anyEvent); //also called sendMessage
    void receiveOperation(); //also called receiveMessage

}
