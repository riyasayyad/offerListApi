package com.example.offerlist.entites;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;




@Entity
@Table
@SqlResultSetMapping(name = "Offers", classes = @ConstructorResult(targetClass = Offers.class, 
                    columns = {@ColumnResult(name = "OfferingGuId", type = String.class), 
                    		@ColumnResult(name = "Offering", type = String.class)}))

public class Offers {

@Id
	private String OfferingGuId;
	private String Offering;
	
	public Offers() {
		//TODO Auto-generated constructor stub
	}
	public Offers(String OfferingGUId,String Offering) {
		super();
		this.Offering=Offering;
		this.OfferingGuId=OfferingGUId;
	}

	public String getOfferingGUId() {
		return OfferingGuId;
	}

	public void setOfferingGUId(String offeringGUId) {
		OfferingGuId = offeringGUId;
	}

	public String getOffering() {
		return Offering;
	}

	public void setOffering(String offering) {
		Offering = offering;
	}
	
}
