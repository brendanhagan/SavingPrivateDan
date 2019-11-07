package com.brendan.game.states;

import com.brendan.game.util.KeyHandler;
import com.brendan.game.util.MouseHandler;

import java.awt.*;
import java.security.Key;

public class PlayState extends GameState {

    public PlayState(GameStateManager gsm) {
        super(gsm);
    }

    public void update() {

    }
    public void input(MouseHandler mouse, KeyHandler key) {
        if(key.up.down) {
            System.out.println("is being pressed");
        }
    }
    public void render(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 64, 64);
    }
}
