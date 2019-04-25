package com.lambdaschool.initial;

public class MyApplication implements Processor
{
    //construct injection
    private AthleteService athlete;

    public MyApplication(AthleteService athlete)
    {
        this.athlete = athlete;
    }

    public void create(String sport)
    {
        System.out.println("************");
        athlete.create(sport);
        System.out.println("************\n");
    }
}
