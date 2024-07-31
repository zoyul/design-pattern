package org.example.facade.theater;

public class HomeTheaterFacade {

    // 사용하고자 하는 서브시스템의 모든 구성 요소가 퍼사드 클래스의 변수로 저장
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade() {
        this.amp = new Amplifier();
        this.tuner = new Tuner();
        this.player = new StreamingPlayer();
        this.projector = new Projector();
        this.lights = new TheaterLights();
        this.screen = new Screen();
        this.popper = new PopcornPopper();

    }

    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             StreamingPlayer streamingPlayer,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = streamingPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("영화 볼 준비");
        popper.on();
        popper.pop();
        lights.off();
        screen.down();
        projector.on();
        amp.on();
        player.on();
        player.play(movie);
    }
}
