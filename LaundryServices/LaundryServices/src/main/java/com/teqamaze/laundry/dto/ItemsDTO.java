package com.teqamaze.laundry.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "items")
@TypeAlias("Items")
public class ItemsDTO {

    @Id
    private String id;
    
    @Field("Other items")
    private List<OtherItems> otherItems;
    
    @Field("Kids")
    private List<Kids> kids;
    
    @Field("Gents")
    private List<Gents> gents;
    
    @Field("Household")
    private List<Household> household;
    
    @Field("Ladies")
    private List<Ladies> ladies;

    /*public ItemsDTO() {
     super();
    }*/
    

    public ItemsDTO(String id, List<OtherItems> otherItems, List<Kids> kids, List<Gents> gents,
            List<Household> household, List<Ladies> ladies) {
        this.id = id;
        this.otherItems = otherItems;
        this.kids = kids;
        this.gents = gents;
        this.household = household;
        this.ladies = ladies;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<OtherItems> getOtherItems() {
        return otherItems;
    }

    public void setOtherItems(List<OtherItems> otherItems) {
        this.otherItems = otherItems;
    }

    public List<Kids> getKids() {
        return kids;
    }

    public void setKids(List<Kids> kids) {
        this.kids = kids;
    }

    public List<Gents> getGents() {
        return gents;
    }

    public void setGents(List<Gents> gents) {
        this.gents = gents;
    }

    public List<Household> getHousehold() {
        return household;
    }

    public void setHousehold(List<Household> household) {
        this.household = household;
    }

    public List<Ladies> getLadies() {
        return ladies;
    }

    public void setLadies(List<Ladies> ladies) {
        this.ladies = ladies;
    }

    @Override
    public String toString() {
        return "ItemsDTO [id=" + id + ", otherItems=" + otherItems + ", kids=" + kids + ", gents=" + gents
                + ", household=" + household + ", ladies=" + ladies + "]";
    }

  

}
