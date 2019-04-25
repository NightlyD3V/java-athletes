package com.lambdaschool.initial;

public class RugbyCreationInjector implements AthleteServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new RugbyAthleteImpl());
    }
}
