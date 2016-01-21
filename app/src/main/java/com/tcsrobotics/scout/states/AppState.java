package com.tcsrobotics.scout.states;

public interface AppState {

    void editing();
    void saving();
    void creating();
    void deleting();
    void undoing();

}
