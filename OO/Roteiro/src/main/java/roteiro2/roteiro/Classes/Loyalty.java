/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.roteiro.Classes;

import java.util.Objects;

/**
 *
 * @author marco
 */
public class Loyalty 
{
    private Integer points;
    
    public Loyalty()
    {
        this.points = 0;
    }
    
    public void addPoints(int points)
    {
        if(points > 0)
            this.points += points;
    }
    
    public Integer getPointsBalance()
    {
        return points;
    }
    
    public boolean redeemPoints(Integer pointsForRedeem)
    {
        if(pointsForRedeem <= 0 || pointsForRedeem > this.points)
            return false;
        else
        {
            this.points -= pointsForRedeem;
            return true;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.points);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Loyalty other = (Loyalty) obj;
        return Objects.equals(this.points, other.points);
    }

    @Override
    public String toString() {
        return "Loyalty{" + "points=" + points + '}';
    }
}
