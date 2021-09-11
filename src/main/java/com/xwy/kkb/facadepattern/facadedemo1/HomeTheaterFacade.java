package com.xwy.kkb.facadepattern.facadedemo1;

/**
 * @Classname HomeTheaterFacade
 * @Created by ��Ȼ
 * @Description ��ͥӰԺ�������
 */
public class HomeTheaterFacade {

    //�ۺϸ�����ϵͳ
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

    //���幫���Ľ�������
    public void ready(){  //׼���׶�

        popcorn.on();

        player.on();

        projector.on();

        stereo.on();
    }

    //����
    public void play(){

        player.select();

        popcorn.pop();

        projector.focus();

        stereo.setVolume();

    }

    public void end(){

        //�������豸ȫ���ر�
        player.off();

        popcorn.off();

        stereo.off();

        popcorn.off();
    }
}
