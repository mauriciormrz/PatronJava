package com.company.behavioral.state;

public class Silent implements MobileAlertState { //ConcreteState

    @Override
    public void alert(MobileAlertStateContext context) {

        System.out.println("Silencio...Pantalla iluminada");
    }
}
