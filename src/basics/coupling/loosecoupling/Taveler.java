package basics.coupling.loosecoupling;

class Traveler
{
    Vehicle v;
    public void setV(Vehicle v)
    {
      this.v = v;
    }      
 
    void startJourney()
    {
       v.move();
    }
}

