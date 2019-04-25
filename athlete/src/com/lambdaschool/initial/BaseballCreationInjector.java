package com.lambdaschool.initial;

public class BaseballCreationInjector implements AthleteServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new BaseballAthleteImpl());
    }
}
