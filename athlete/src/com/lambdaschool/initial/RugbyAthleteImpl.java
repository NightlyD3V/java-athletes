package com.lambdaschool.initial;

public class RugbyAthleteImpl implements AthleteService
{
    @Override
    public void create(String athlete)
    {
        System.out.println(athlete + " Athlete");
    }
}
