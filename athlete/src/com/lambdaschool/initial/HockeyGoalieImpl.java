package com.lambdaschool.initial;

public class HockeyGoalieImpl implements AthleteService
{
    @Override
    public void create(String athlete)
    {
        System.out.println(athlete + " Goalie");
    }
}
