package com.newbie.behavioral.state;

public class PlayerRunner {
    public static void main(String[] args) {
        Player player = new Player();
        PlayerGUI gui = new PlayerGUI(player);
        gui.init();
    }
}
