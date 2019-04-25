package com.lambdaschool.initial;

public class HockeyCreationInjector implements AthleteServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new HockeyGoalieImpl());
    }
}
