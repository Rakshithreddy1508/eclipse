
public class Books {
int noofcopies ;

public int getNoofcopies() {
	return this.noofcopies;
}
public void increaseNoofcopies(int howmuch) {
	this.noofcopies = this.noofcopies + howmuch ;
}

public void Noofcopies(int howmuch) {
	this.noofcopies = this.noofcopies  + howmuch ;
}
public void setNoofcopies(int noofcopies) {
	if(noofcopies>0) {
		this.noofcopies = noofcopies;
	}

	//System.out.println(noofcopies);
	System.out.println(this.noofcopies);
}
}
