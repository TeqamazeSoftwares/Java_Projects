package com.teqamaze.laundry.dto;

public class RateCardDTO
{
    private RateCard rateCard;
    
    
    public RateCardDTO() {
        super();
    }
    

    public RateCard getRateCard ()
    {
        return rateCard;
    }

    public void setRateCard (RateCard rateCard)
    {
        this.rateCard = rateCard;
    }


    @Override
    public String toString()
    {
        return "ClassPojo [rateCard = "+rateCard+"]";
    }
}
	
