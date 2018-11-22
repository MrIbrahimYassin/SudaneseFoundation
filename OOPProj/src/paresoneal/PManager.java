package paresoneal;

import java.util.ArrayList;

public class PManager implements IManagePersone<Parsone> {

	@Override
	public Parsone getSingle(int id, ArrayList<Parsone> t) {
		// TODO Auto-generated method stub
		for(int i= 0; i < t.size(); i++) {
			Parsone p = new Parsone(); 
			p = t.get(i); 
			if(p.Id == id) {
				return p;
				}
			}
		return null;
	}

	@Override
	public ArrayList<Parsone> getAll(ArrayList<Parsone> t) {
		// TODO Auto-generated method stub
		return t;
	}

	@Override
	public boolean add(Parsone t, ArrayList<Parsone> t2) {
		// TODO Auto-generated method stub
		return t2.add(t);
	}

	@Override
	public Parsone edit(int id,Parsone t, ArrayList<Parsone> t2) {
		// TODO Auto-generated method stub
		Parsone p = new Parsone(); 
		p = getSingle(id, t2); 
		if(p != null) {
			if(delete(t, t2)) {
				t.Id = id; 
				if(add(t, t2)) {
					return getSingle(id, t2); 
				}
			}	
		}
		
		
		return null;
	}

	@Override
	public boolean delete(Parsone t, ArrayList<Parsone> t2) {
		// TODO Auto-generated method stub
		 
		return t2.remove(t);
	}

}
