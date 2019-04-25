package com.lambdaschool.initial;

public class TrackCreationInjector implements AthleteServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new TrackRunnerImpl());
    }
}
