package com.tcsrobotics.scout.states;

import com.tcsrobotics.domain.FTCTeam;

public interface AppState {
    void performEditing();

    void performSaving();

    void performModification();

    void performDeleting();

    void initializeDetailScreen();

    void performUndo();

    void showControls(FTCTeam team);


}
