package com.tcsrobotics.scout.states;

public interface AppState {
    void performEditing();

    void performSaving();

    void performModification();

    void performDeleting();

    void initializeDetailScreen();

    void performUndo();


}
