package com.lambdaschool.initial;

public class TrackRunnerImpl implements AthleteService
{
    @Override
    public void create(String athlete)
    {
        System.out.println(athlete + " Runner");
    }
}
