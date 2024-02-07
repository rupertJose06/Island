package com.bmhs.gametitle.game.assets.tasks;

import com.badlogic.gdx.ai.btree.LeafTask;
import com.badlogic.gdx.ai.btree.Task;
import com.bmhs.gametitle.game.assets.characters.NonPlayerCharacter;

import javax.sound.midi.SysexMessage;

public class WalkTask extends LeafTask<NonPlayerCharacter> {

    NonPlayerCharacter npc;

    public void start() {
        System.out.println("Staring walk task");
        npc = getObject();
    }

    @Override
    public Status execute() {
        System.out.println("Executing walk task");
        npc.walk();
        return Status.SUCCEEDED;
    }

    @Override
    protected Task<NonPlayerCharacter> copyTo(Task<NonPlayerCharacter> task) {
        return task;
    }
}
