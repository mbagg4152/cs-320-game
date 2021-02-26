package graphics.game;

import java.awt.*;

public class Const {
    public static final String USER_DIR = System.getProperty("user.dir");
    
    // icon paths
    public static final String PATH_BIG_ICON = USER_DIR + "/res/icons/enemy-fire.png";
    public static final String PATH_PLAYER_ICON = USER_DIR + "/res/icons/player-blue.png";
    public static final String PATH_BASIC_ICON = USER_DIR + "/res/icons/enemy-purple.png";
    public static final String PATH_MEGA_ICON = USER_DIR + "/res/icons/enemy-slime.png";
    public static final String PATH_TITLE = USER_DIR + "/res/icons/title.png";
    public static final String PATH_START = USER_DIR + "/res/icons/start-btn.png";
    
    // colors
    public static final Color COLOR_BIG = new Color(176, 6, 42);
    public static final Color COLOR_PLAYER = new Color(27, 61, 163);
    public static final Color COLOR_BASIC = new Color(118, 0, 205);
    public static final Color COLOR_MEGA = new Color(7, 154, 22);
    
    // sound paths
    public static final String BONK = USER_DIR + "res/sound/bonk.wav";
    public static final String OOF_ROBLOX = USER_DIR + "/res/sound/oof_roblox.wav";
    public static final String OOF_STEVE = USER_DIR + "res/sound/oof_steve.wav";
    public static final String YOU_DIED = USER_DIR + "res/sound/you_died.wav";
    
    // sizes
    public static final int SIZE_PLAYER = 96;
    public static final int SIZE_BIG = 96;
    public static final int SIZE_BASIC = 64;
    public static final int SIZE_MEGA = 128;
    
}
