package com.lambdaschool.initial;

public class Main
{

    public static void main(String[] args)
    {
        AthleteServiceInjector injector;
        Processor app;

        injector = new TrackCreationInjector();
        app = injector.getProcess();
        app.create("Track");

        injector = new HockeyCreationInjector();
        app = injector.getProcess();
        app.create("Hockey");

        injector = new RugbyCreationInjector();
        app = injector.getProcess();
        app.create("Rugby");

        injector = new BaseballCreationInjector();
        app = injector.getProcess();
        app.create("Baseball");
    }
}
