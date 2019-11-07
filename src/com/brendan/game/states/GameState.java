package com.brendan.game.states;

import com.brendan.game.util.KeyHandler;
import com.brendan.game.util.MouseHandler;

import java.awt.Graphics2D;
import java.security.Key;

public abstract class GameState {

    private GameStateManager gsm;

    public GameState(GameStateManager gsm) {
        this.gsm = gsm;
    }

    public abstract void update();
    public abstract void input(MouseHandler mouse, KeyHandler key);
    public abstract void render(Graphics2D g);
}
