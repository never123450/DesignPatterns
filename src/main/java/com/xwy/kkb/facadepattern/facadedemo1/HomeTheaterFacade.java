package com.xwy.kkb.facadepattern.facadedemo1;

/**
 * @param
 * @author xwy
 * @Description 家庭影院外观类
 * @date 14/9/2021 上午10:19
 * @return
 */
public class HomeTheaterFacade {

    private Player player;

    private Projector projector;

    private Popcorn popcorn;

    private Stereo stereo;

    public HomeTheaterFacade() {
    }

    public HomeTheaterFacade(Player player, Projector projector, Popcorn popcorn, Stereo stereo) {
        this.player = player;
        this.projector = projector;
        this.popcorn = popcorn;
        this.stereo = stereo;
    }

    public void ready() {

        popcorn.on();

        player.on();

        projector.on();

        stereo.on();
    }

    public void play() {

        player.select();

        popcorn.pop();

        projector.focus();

        stereo.setVolume();

    }

    public void end() {

        player.off();

        popcorn.off();

        stereo.off();

        popcorn.off();
    }
}
